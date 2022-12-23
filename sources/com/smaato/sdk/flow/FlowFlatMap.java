package com.smaato.sdk.flow;

import com.smaato.sdk.util.Disposable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class FlowFlatMap<T, U> extends Flow<U> {
    private final Function1<? super T, ? extends Publisher<? extends U>> mapper;
    private final Publisher<T> source;

    FlowFlatMap(Publisher<T> publisher, Function1<? super T, ? extends Publisher<? extends U>> function1) {
        this.source = publisher;
        this.mapper = function1;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super U> subscriber) {
        if (subscriber != null) {
            this.source.subscribe(new FlowMapSubscriber(subscriber, this.mapper));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class FlowMapSubscriber<T, U> implements Subscriber<T>, Subscription {
        private volatile boolean cancelled;
        private final AtomicLong demand = new AtomicLong();
        private volatile boolean done;
        private final Subscriber<? super U> downstream;
        private volatile Throwable error;
        private final Function1<? super T, ? extends Publisher<? extends U>> mapper;
        private final Queue<InnerSubscriber<U>> subscribers = new ConcurrentLinkedQueue();
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();

        FlowMapSubscriber(Subscriber<? super U> subscriber, Function1<? super T, ? extends Publisher<? extends U>> function1) {
            this.downstream = subscriber;
            this.mapper = function1;
        }

        public final void onSubscribe(Subscription subscription) {
            if (subscription == null) {
                throw new NullPointerException("'s' specified as non-null is null");
            } else if (Subscriptions.setOnce(this.upstream, subscription)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (t == null) {
                throw new NullPointerException("'value' specified as non-null is null");
            } else if (!this.cancelled && !this.done) {
                try {
                    Publisher publisher = (Publisher) this.mapper.apply(t);
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this);
                    if (this.subscribers.offer(innerSubscriber)) {
                        publisher.subscribe(innerSubscriber);
                    } else {
                        innerSubscriber.dispose();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    Subscriptions.cancel(this.upstream);
                    this.downstream.onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (th == null) {
                throw new NullPointerException("'e' specified as non-null is null");
            } else if (this.cancelled) {
                FlowPlugins.onError(th);
            } else {
                this.error = th;
                this.done = true;
                drain();
            }
        }

        public final void onComplete() {
            if (!this.cancelled && !this.done) {
                this.done = true;
                drain();
            }
        }

        public final void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                Subscriptions.requested(this.demand, j);
                this.upstream.get().request(j);
            }
        }

        public final void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        /* access modifiers changed from: package-private */
        public final void cancelAll() {
            Subscriptions.cancel(this.upstream);
            while (!this.subscribers.isEmpty()) {
                this.subscribers.poll().dispose();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            long j = this.demand.get();
            Iterator it = this.subscribers.iterator();
            long j2 = 0;
            while (j2 != j && !this.cancelled && it.hasNext()) {
                InnerSubscriber innerSubscriber = (InnerSubscriber) it.next();
                Queue access$000 = innerSubscriber.buffer;
                while (j2 != j && !this.cancelled && !access$000.isEmpty()) {
                    this.downstream.onNext(access$000.poll());
                    j2++;
                }
                if (innerSubscriber.done) {
                    it.remove();
                }
            }
            Subscriptions.produced(this.demand, j2);
            if (this.cancelled || !this.done) {
                return;
            }
            if (this.error != null) {
                this.downstream.onError(this.error);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    static class InnerSubscriber<U> implements Subscriber<U>, Disposable {
        /* access modifiers changed from: private */
        public final Queue<U> buffer = new ConcurrentLinkedQueue();
        /* access modifiers changed from: private */
        public volatile boolean done;
        private final FlowMapSubscriber<?, U> parent;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();

        public /* synthetic */ void addTo(Collection<Disposable> collection) {
            Disposable.CC.$default$addTo(this, collection);
        }

        InnerSubscriber(FlowMapSubscriber<?, U> flowMapSubscriber) {
            this.parent = flowMapSubscriber;
        }

        public final void onSubscribe(Subscription subscription) {
            if (subscription == null) {
                throw new NullPointerException("'s' specified as non-null is null");
            } else if (Subscriptions.setOnce(this.upstream, subscription)) {
                subscription.request(Long.MAX_VALUE);
            }
        }

        public final void onNext(U u) {
            if (u == null) {
                throw new NullPointerException("'value' specified as non-null is null");
            } else if (this.buffer.offer(u)) {
                this.parent.drain();
            }
        }

        public final void onError(Throwable th) {
            if (th != null) {
                this.parent.cancelAll();
                this.done = true;
                this.parent.onError(th);
                return;
            }
            throw new NullPointerException("'e' specified as non-null is null");
        }

        public final void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public final void dispose() {
            Subscriptions.cancel(this.upstream);
        }
    }
}
