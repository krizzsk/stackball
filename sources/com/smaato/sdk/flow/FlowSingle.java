package com.smaato.sdk.flow;

import java.util.concurrent.atomic.AtomicReference;

final class FlowSingle<T> extends Flow<T> {
    private final Publisher<T> source;

    FlowSingle(Publisher<T> publisher) {
        this.source = publisher;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            this.source.subscribe(new FlowSingleSubscriber(subscriber));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class FlowSingleSubscriber<T> implements Subscriber<T>, Subscription {
        private volatile boolean done;
        private final Subscriber<? super T> downstream;
        private final AtomicReference<Subscription> upstream = new AtomicReference<>();

        FlowSingleSubscriber(Subscriber<? super T> subscriber) {
            this.downstream = subscriber;
        }

        public final void onSubscribe(Subscription subscription) {
            if (subscription == null) {
                throw new NullPointerException("'s' specified as non-null is null");
            } else if (Subscriptions.setOnce(this.upstream, subscription)) {
                this.downstream.onSubscribe(subscription);
            }
        }

        public final void onNext(T t) {
            if (t == null) {
                throw new NullPointerException("'value' specified as non-null is null");
            } else if (!this.done) {
                this.downstream.onNext(t);
                this.downstream.onComplete();
                cancel();
                this.done = true;
            }
        }

        public final void onError(Throwable th) {
            if (th == null) {
                throw new NullPointerException("'e' specified as non-null is null");
            } else if (!this.done) {
                this.downstream.onError(th);
                this.done = true;
            }
        }

        public final void onComplete() {
            if (!this.done) {
                this.downstream.onComplete();
                this.done = true;
            }
        }

        public final void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                this.upstream.get().request(j);
            }
        }

        public final void cancel() {
            Subscriptions.cancel(this.upstream);
        }
    }
}
