package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.MutableFlags;
import com.google.common.base.Supplier;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nonnull;

public final class ListenerSet<T, E extends MutableFlags> {
    private static final int MSG_ITERATION_FINISHED = 0;
    private static final int MSG_LAZY_RELEASE = 1;
    private final Clock clock;
    private final Supplier<E> eventFlagsSupplier;
    private final ArrayDeque<Runnable> flushingEvents;
    private final HandlerWrapper handler;
    private final IterationFinishedEvent<T, E> iterationFinishedEvent;
    private final CopyOnWriteArraySet<ListenerHolder<T, E>> listeners;
    private final ArrayDeque<Runnable> queuedEvents;
    private boolean released;

    public interface Event<T> {
        void invoke(T t);
    }

    public interface IterationFinishedEvent<T, E extends MutableFlags> {
        void invoke(T t, E e);
    }

    public ListenerSet(Looper looper, Clock clock2, Supplier<E> supplier, IterationFinishedEvent<T, E> iterationFinishedEvent2) {
        this(new CopyOnWriteArraySet(), looper, clock2, supplier, iterationFinishedEvent2);
    }

    private ListenerSet(CopyOnWriteArraySet<ListenerHolder<T, E>> copyOnWriteArraySet, Looper looper, Clock clock2, Supplier<E> supplier, IterationFinishedEvent<T, E> iterationFinishedEvent2) {
        this.clock = clock2;
        this.listeners = copyOnWriteArraySet;
        this.eventFlagsSupplier = supplier;
        this.iterationFinishedEvent = iterationFinishedEvent2;
        this.flushingEvents = new ArrayDeque<>();
        this.queuedEvents = new ArrayDeque<>();
        this.handler = clock2.createHandler(looper, new Handler.Callback() {
            public final boolean handleMessage(Message message) {
                return ListenerSet.this.handleMessage(message);
            }
        });
    }

    public ListenerSet<T, E> copy(Looper looper, IterationFinishedEvent<T, E> iterationFinishedEvent2) {
        return new ListenerSet(this.listeners, looper, this.clock, this.eventFlagsSupplier, iterationFinishedEvent2);
    }

    public void add(T t) {
        if (!this.released) {
            Assertions.checkNotNull(t);
            this.listeners.add(new ListenerHolder(t, this.eventFlagsSupplier));
        }
    }

    public void remove(T t) {
        Iterator<ListenerHolder<T, E>> it = this.listeners.iterator();
        while (it.hasNext()) {
            ListenerHolder next = it.next();
            if (next.listener.equals(t)) {
                next.release(this.iterationFinishedEvent);
                this.listeners.remove(next);
            }
        }
    }

    public void queueEvent(int i, Event<T> event) {
        this.queuedEvents.add(new Runnable(new CopyOnWriteArraySet(this.listeners), i, event) {
            public final /* synthetic */ CopyOnWriteArraySet f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ ListenerSet.Event f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ListenerSet.lambda$queueEvent$0(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    static /* synthetic */ void lambda$queueEvent$0(CopyOnWriteArraySet copyOnWriteArraySet, int i, Event event) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((ListenerHolder) it.next()).invoke(i, event);
        }
    }

    public void flushEvents() {
        if (!this.queuedEvents.isEmpty()) {
            if (!this.handler.hasMessages(0)) {
                this.handler.obtainMessage(0).sendToTarget();
            }
            boolean z = !this.flushingEvents.isEmpty();
            this.flushingEvents.addAll(this.queuedEvents);
            this.queuedEvents.clear();
            if (!z) {
                while (!this.flushingEvents.isEmpty()) {
                    this.flushingEvents.peekFirst().run();
                    this.flushingEvents.removeFirst();
                }
            }
        }
    }

    public void sendEvent(int i, Event<T> event) {
        queueEvent(i, event);
        flushEvents();
    }

    public void release() {
        Iterator<ListenerHolder<T, E>> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().release(this.iterationFinishedEvent);
        }
        this.listeners.clear();
        this.released = true;
    }

    public void lazyRelease(int i, Event<T> event) {
        this.handler.obtainMessage(1, i, 0, event).sendToTarget();
    }

    /* access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            Iterator<ListenerHolder<T, E>> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().iterationFinished(this.eventFlagsSupplier, this.iterationFinishedEvent);
                if (this.handler.hasMessages(0)) {
                    break;
                }
            }
        } else if (message.what == 1) {
            sendEvent(message.arg1, (Event) message.obj);
            release();
        }
        return true;
    }

    private static final class ListenerHolder<T, E extends MutableFlags> {
        private E eventsFlags;
        @Nonnull
        public final T listener;
        private boolean needsIterationFinishedEvent;
        private boolean released;

        public ListenerHolder(@Nonnull T t, Supplier<E> supplier) {
            this.listener = t;
            this.eventsFlags = (MutableFlags) supplier.get();
        }

        public void release(IterationFinishedEvent<T, E> iterationFinishedEvent) {
            this.released = true;
            if (this.needsIterationFinishedEvent) {
                iterationFinishedEvent.invoke(this.listener, this.eventsFlags);
            }
        }

        public void invoke(int i, Event<T> event) {
            if (!this.released) {
                if (i != -1) {
                    this.eventsFlags.add(i);
                }
                this.needsIterationFinishedEvent = true;
                event.invoke(this.listener);
            }
        }

        public void iterationFinished(Supplier<E> supplier, IterationFinishedEvent<T, E> iterationFinishedEvent) {
            if (!this.released && this.needsIterationFinishedEvent) {
                E e = this.eventsFlags;
                this.eventsFlags = (MutableFlags) supplier.get();
                this.needsIterationFinishedEvent = false;
                iterationFinishedEvent.invoke(this.listener, e);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.listener.equals(((ListenerHolder) obj).listener);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }
    }
}
