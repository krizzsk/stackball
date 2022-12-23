package com.smaato.sdk.flow;

final class FlowDistinctUntilChanged<T, K> extends Flow<T> {
    private final Function1<? super T, K> keySelector;
    private final Publisher<T> source;

    FlowDistinctUntilChanged(Publisher<T> publisher, Function1<? super T, K> function1) {
        this.source = publisher;
        this.keySelector = function1;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            this.source.subscribe(new FlowDistinctUntilChangedSubscriber(subscriber, this.keySelector));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class FlowDistinctUntilChangedSubscriber<T, K> implements Subscriber<T> {
        private final Subscriber<? super T> downstream;
        private final Function1<? super T, K> keySelector;
        private volatile K lastKey;

        FlowDistinctUntilChangedSubscriber(Subscriber<? super T> subscriber, Function1<? super T, K> function1) {
            this.downstream = subscriber;
            this.keySelector = function1;
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
                    K apply = this.keySelector.apply(t);
                    if (this.lastKey != apply) {
                        this.downstream.onNext(t);
                    }
                    this.lastKey = apply;
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
