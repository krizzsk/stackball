package com.smaato.sdk.flow;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

final class FlowCreate<T> extends Flow<T> {
    private final Action1<Emitter<? super T>> source;

    FlowCreate(Action1<Emitter<? super T>> action1) {
        this.source = action1;
    }

    /* access modifiers changed from: protected */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            BufferedEmitter bufferedEmitter = new BufferedEmitter(subscriber);
            subscriber.onSubscribe(bufferedEmitter);
            try {
                this.source.invoke(bufferedEmitter);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                subscriber.onError(th);
            }
        } else {
            throw new NullPointerException("'s' specified as non-null is null");
        }
    }

    static class BufferedEmitter<T> implements Emitter<T>, Subscription {
        private final Queue<T> buffer = new ConcurrentLinkedQueue();
        private volatile boolean cancelled;
        private final AtomicLong demand = new AtomicLong();
        private volatile boolean done;
        private final Subscriber<T> downstream;
        private volatile Throwable error;
        private final AtomicInteger wip = new AtomicInteger();

        BufferedEmitter(Subscriber<T> subscriber) {
            this.downstream = subscriber;
        }

        public final void onNext(T t) {
            if (t == null) {
                throw new NullPointerException("'value' specified as non-null is null");
            } else if (!this.cancelled && !this.done) {
                this.buffer.offer(t);
                drainNext();
            }
        }

        public final void onError(Throwable th) {
            if (th == null) {
                throw new NullPointerException("'e' specified as non-null is null");
            } else if (this.cancelled || this.done) {
                FlowPlugins.onError(th);
            } else {
                this.error = th;
                this.done = true;
                drainNext();
            }
        }

        public final void onComplete() {
            if (!this.cancelled && !this.done) {
                this.done = true;
                drainNext();
            }
        }

        public final void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                Subscriptions.requested(this.demand, j);
                drainNext();
            }
        }

        public final void cancel() {
            this.cancelled = true;
        }

        private void drainNext() {
            if (this.wip.getAndIncrement() == 0) {
                int i = 1;
                do {
                    long j = this.demand.get();
                    long j2 = 0;
                    while (j2 != j && !this.cancelled && !this.buffer.isEmpty()) {
                        this.downstream.onNext(this.buffer.poll());
                        j2++;
                    }
                    Subscriptions.produced(this.demand, j2);
                    if (!this.cancelled) {
                        if (!this.buffer.isEmpty() || !this.done) {
                            i = this.wip.addAndGet(-i);
                        } else if (this.error != null) {
                            this.downstream.onError(this.error);
                            return;
                        } else {
                            this.downstream.onComplete();
                            return;
                        }
                    } else {
                        return;
                    }
                } while (((long) i) != 0);
            }
        }
    }
}
