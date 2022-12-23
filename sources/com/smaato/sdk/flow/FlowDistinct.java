package com.smaato.sdk.flow;

import java.util.HashSet;
import java.util.Set;

final class FlowDistinct<T, K> extends Flow<T> {
    private final Function1<? super T, K> keySelector;
    private final Publisher<T> source;

    FlowDistinct(Publisher<T> publisher, Function1<? super T, K> function1) {
        this.source = publisher;
        this.keySelector = function1;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            this.source.subscribe(new FlowDistinctSubscriber(subscriber, this.keySelector));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class FlowDistinctSubscriber<T, K> implements Subscriber<T> {
        private final Set<K> distinct = new HashSet();
        private final Subscriber<? super T> downstream;
        private final Function1<? super T, K> keySelector;

        FlowDistinctSubscriber(Subscriber<? super T> subscriber, Function1<? super T, K> function1) {
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
                    if (this.distinct.add(this.keySelector.apply(t))) {
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
