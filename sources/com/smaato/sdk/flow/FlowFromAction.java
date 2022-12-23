package com.smaato.sdk.flow;

final class FlowFromAction<T> extends Flow<T> {
    private final Action0 action;

    FlowFromAction(Action0 action0) {
        this.action = action0;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            subscriber.onSubscribe(new FromActionSubscription(subscriber, this.action));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class FromActionSubscription<T> implements Subscription {
        private final Action0 action;
        private final Subscriber<? super T> downstream;

        public final void cancel() {
        }

        FromActionSubscription(Subscriber<? super T> subscriber, Action0 action0) {
            this.downstream = subscriber;
            this.action = action0;
        }

        public final void request(long j) {
            if (Subscriptions.validate(this.downstream, j)) {
                try {
                    this.action.invoke();
                    this.downstream.onComplete();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                }
            }
        }
    }
}
