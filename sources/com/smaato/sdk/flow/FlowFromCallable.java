package com.smaato.sdk.flow;

import java.util.concurrent.Callable;

final class FlowFromCallable<T> extends Flow<T> {
    private final Callable<T> producer;

    FlowFromCallable(Callable<T> callable) {
        this.producer = callable;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            subscriber.onSubscribe(new FromCallableSubscription(subscriber, this.producer));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class FromCallableSubscription<T> implements Subscription {
        private final Subscriber<? super T> downstream;
        private final Callable<T> producer;

        public final void cancel() {
        }

        FromCallableSubscription(Subscriber<? super T> subscriber, Callable<T> callable) {
            this.downstream = subscriber;
            this.producer = callable;
        }

        public final void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                try {
                    T call = this.producer.call();
                    if (call == null) {
                        this.downstream.onError(new NullPointerException("The value from producer is null"));
                        return;
                    }
                    this.downstream.onNext(call);
                    this.downstream.onComplete();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                }
            }
        }
    }
}
