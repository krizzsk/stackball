package com.smaato.sdk.flow;

final class FlowFilter<T> extends Flow<T> {
    private final Predicate1<? super T> predicate;
    private final Publisher<T> source;

    FlowFilter(Publisher<T> publisher, Predicate1<? super T> predicate1) {
        this.source = publisher;
        this.predicate = predicate1;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            this.source.subscribe(new FlowFilterSubscriber(subscriber, this.predicate));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class FlowFilterSubscriber<T, K> implements Subscriber<T> {
        private final Subscriber<? super T> downstream;
        private final Predicate1<? super T> predicate;

        FlowFilterSubscriber(Subscriber<? super T> subscriber, Predicate1<? super T> predicate1) {
            this.downstream = subscriber;
            this.predicate = predicate1;
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
                try {
                    if (this.predicate.test(t)) {
                        this.downstream.onNext(t);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                }
            } else {
                throw new NullPointerException("'value' specified as non-null is null");
            }
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
