package com.smaato.sdk.flow;

import java.util.concurrent.Callable;

final class FlowError<T> extends Flow<T> {
    private final Callable<? extends Throwable> producer;

    FlowError(Callable<? extends Throwable> callable) {
        this.producer = callable;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            subscriber.onSubscribe(new Subscription() {
                public final void cancel() {
                }

                public final void request(long j) {
                }
            });
            try {
                subscriber.onError((Throwable) this.producer.call());
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                subscriber.onError(th);
            }
        } else {
            throw new NullPointerException("'s' specified as non-null is null");
        }
    }
}
