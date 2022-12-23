package com.smaato.sdk.flow;

import com.smaato.sdk.flow.FlowObserveOn;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class FlowObserveOn<T> extends Flow<T> {
    private final Executor executor;
    private final Publisher<T> source;

    FlowObserveOn(Publisher<T> publisher, Executor executor2) {
        this.source = publisher;
        this.executor = executor2;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            this.source.subscribe(new ObserveOnSubscriber(subscriber, this.executor));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class ObserveOnSubscriber<T> implements Subscriber<T>, Subscription {
        private final Queue<T> buffer = new ConcurrentLinkedQueue();
        private final AtomicInteger completions = new AtomicInteger();
        private final AtomicLong demand = new AtomicLong();
        private final Subscriber<? super T> downstream;
        private volatile Throwable error;
        private final Executor executor;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();
        private final AtomicInteger wip = new AtomicInteger();

        ObserveOnSubscriber(Subscriber<? super T> subscriber, Executor executor2) {
            this.downstream = subscriber;
            this.executor = executor2;
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
            } else if (this.buffer.offer(t)) {
                drain();
            }
        }

        public final void onError(Throwable th) {
            if (th == null) {
                throw new NullPointerException("'e' specified as non-null is null");
            } else if (this.completions.getAndIncrement() == 0) {
                this.error = th;
                drain();
            }
        }

        public final void onComplete() {
            if (this.completions.getAndIncrement() == 0) {
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
            Subscriptions.cancel(this.upstream);
        }

        private void drain() {
            this.executor.execute(new Runnable() {
                public final void run() {
                    FlowObserveOn.ObserveOnSubscriber.this.lambda$drain$0$FlowObserveOn$ObserveOnSubscriber();
                }
            });
        }

        public /* synthetic */ void lambda$drain$0$FlowObserveOn$ObserveOnSubscriber() {
            if (this.wip.getAndIncrement() == 0) {
                int i = 1;
                do {
                    long j = this.demand.get();
                    for (long j2 = 0; j2 != j && !this.buffer.isEmpty(); j2++) {
                        this.downstream.onNext(this.buffer.poll());
                    }
                    if (this.completions.get() == 1 && this.buffer.isEmpty() && this.completions.decrementAndGet() == 0) {
                        if (this.error != null) {
                            this.downstream.onError(this.error);
                        } else {
                            this.downstream.onComplete();
                        }
                    }
                    i = this.wip.addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}
