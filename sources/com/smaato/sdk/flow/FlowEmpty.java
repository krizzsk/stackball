package com.smaato.sdk.flow;

final class FlowEmpty<T> extends Flow<T> {
    FlowEmpty() {
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
            subscriber.onComplete();
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }
}
