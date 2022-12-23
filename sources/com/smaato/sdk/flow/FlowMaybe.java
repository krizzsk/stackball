package com.smaato.sdk.flow;

import java.util.concurrent.Callable;

final class FlowMaybe<T> extends Flow<T> {
    private final Callable<? extends T> producer;

    FlowMaybe(Callable<? extends T> callable) {
        this.producer = callable;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            subscriber.onSubscribe(new MaybeSubscription(subscriber, this.producer));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class MaybeSubscription<T> implements Subscription {
        private final Subscriber<? super T> downstream;
        private final Callable<? extends T> producer;

        public final void cancel() {
        }

        MaybeSubscription(Subscriber<? super T> subscriber, Callable<? extends T> callable) {
            this.downstream = subscriber;
            this.producer = callable;
        }

        public final void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                try {
                    Object call = this.producer.call();
                    if (call != null) {
                        this.downstream.onNext(call);
                    }
                    this.downstream.onComplete();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                }
            }
        }
    }
}
