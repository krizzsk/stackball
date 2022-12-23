package com.smaato.sdk.flow;

final class FlowStartWith<T> extends Flow<T> {
    private final T initialValue;
    private final Publisher<T> source;

    FlowStartWith(Publisher<T> publisher, T t) {
        this.source = publisher;
        this.initialValue = t;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            this.source.subscribe(new FlowStartWithSubscriber(subscriber, this.initialValue));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class FlowStartWithSubscriber<T, U> implements Subscriber<T> {
        private final Subscriber<? super T> downstream;
        private final T initialValue;
        private volatile boolean initialValueEmitted;

        FlowStartWithSubscriber(Subscriber<? super T> subscriber, T t) {
            this.downstream = subscriber;
            this.initialValue = t;
        }

        public final void onSubscribe(Subscription subscription) {
            if (subscription != null) {
                this.downstream.onSubscribe(subscription);
                return;
            }
            throw new NullPointerException("'s' specified as non-null is null");
        }

        public final void onNext(T t) {
            if (t != null) {
                if (!this.initialValueEmitted) {
                    this.downstream.onNext(this.initialValue);
                    this.initialValueEmitted = true;
                }
                this.downstream.onNext(t);
                return;
            }
            throw new NullPointerException("'value' specified as non-null is null");
        }

        public final void onError(Throwable th) {
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            throw new NullPointerException("'e' specified as non-null is null");
        }

        public final void onComplete() {
            this.downstream.onComplete();
        }
    }
}
