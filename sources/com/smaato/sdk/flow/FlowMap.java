package com.smaato.sdk.flow;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class FlowMap<T, U> extends Flow<U> {
    private final Function1<? super T, ? extends U> mapper;
    private final Publisher<T> source;

    FlowMap(Publisher<T> publisher, Function1<? super T, ? extends U> function1) {
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
        private final Function1<? super T, ? extends U> mapper;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();

        FlowMapSubscriber(Subscriber<? super U> subscriber, Function1<? super T, ? extends U> function1) {
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
                    this.downstream.onNext(this.mapper.apply(t));
                    Subscriptions.produced(this.demand, 1);
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
            } else if (this.cancelled || this.done) {
                FlowPlugins.onError(th);
            } else {
                this.downstream.onError(th);
                this.done = true;
            }
        }

        public final void onComplete() {
            if (!this.cancelled && !this.done) {
                this.downstream.onComplete();
                this.done = true;
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
            this.cancelled = true;
        }
    }
}
