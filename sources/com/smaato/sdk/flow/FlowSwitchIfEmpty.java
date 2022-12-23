package com.smaato.sdk.flow;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class FlowSwitchIfEmpty<T> extends Flow<T> {
    private final Callable<? extends Publisher<? extends T>> producer;
    private final Publisher<T> source;

    FlowSwitchIfEmpty(Publisher<T> publisher, Callable<? extends Publisher<? extends T>> callable) {
        this.source = publisher;
        this.producer = callable;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            this.source.subscribe(new SwitchIfEmptySubscriber(subscriber, this.producer));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class SwitchIfEmptySubscriber<T> implements Subscriber<T>, Subscription {
        private volatile boolean cancelled;
        private volatile boolean completed;
        private final AtomicLong demand = new AtomicLong();
        private volatile boolean done;
        private final Subscriber<? super T> downstream;
        private volatile boolean hasValues;
        private final Callable<? extends Publisher<? extends T>> producer;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>(Subscriptions.EMPTY_SUB);

        SwitchIfEmptySubscriber(Subscriber<? super T> subscriber, Callable<? extends Publisher<? extends T>> callable) {
            this.downstream = subscriber;
            this.producer = callable;
        }

        public final void onSubscribe(Subscription subscription) {
            if (subscription != null) {
                Subscription subscription2 = this.upstream.get();
                if (Subscriptions.EMPTY_SUB != subscription2) {
                    subscription2.cancel();
                }
                if (!this.upstream.compareAndSet(subscription2, subscription)) {
                    return;
                }
                if (Subscriptions.EMPTY_SUB == subscription2) {
                    this.downstream.onSubscribe(this);
                } else if (this.demand.get() > 0) {
                    subscription.request(this.demand.get());
                }
            } else {
                throw new NullPointerException("'s' specified as non-null is null");
            }
        }

        public final void onNext(T t) {
            if (t == null) {
                throw new NullPointerException("'value' specified as non-null is null");
            } else if (!this.cancelled && !this.done) {
                Subscriptions.produced(this.demand, 1);
                this.downstream.onNext(t);
                this.hasValues = true;
            }
        }

        public final void onError(Throwable th) {
            if (th == null) {
                throw new NullPointerException("'e' specified as non-null is null");
            } else if (this.cancelled || this.done) {
                FlowPlugins.onError(th);
            } else {
                this.downstream.onError(th);
                this.done = true;
            }
        }

        public final void onComplete() {
            if (!this.cancelled && !this.done) {
                if (this.completed || this.hasValues) {
                    this.downstream.onComplete();
                    this.done = true;
                    return;
                }
                this.completed = true;
                try {
                    ((Publisher) this.producer.call()).subscribe(this);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    Subscriptions.cancel(this.upstream);
                    this.downstream.onError(th);
                }
            }
        }

        public final void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                Subscriptions.requested(this.demand, j);
                this.upstream.get().request(j);
            }
        }

        public final void cancel() {
            if (!this.cancelled && !this.done) {
                Subscriptions.cancel(this.upstream);
                this.cancelled = true;
            }
        }
    }
}
