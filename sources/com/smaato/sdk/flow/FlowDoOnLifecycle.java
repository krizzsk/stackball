package com.smaato.sdk.flow;

final class FlowDoOnLifecycle<T> extends Flow<T> {
    /* access modifiers changed from: private */
    public final Action1<? super Subscription> onSubscribe;
    /* access modifiers changed from: private */
    public final Action0 onTerminate;
    private final Publisher<T> source;

    FlowDoOnLifecycle(Publisher<T> publisher, Action1<? super Subscription> action1, Action0 action0) {
        this.source = publisher;
        this.onSubscribe = action1;
        this.onTerminate = action0;
    }

    /* access modifiers changed from: package-private */
    public final void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            this.source.subscribe(new DoOnLifecycleSubscriber(subscriber, this));
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    static class DoOnLifecycleSubscriber<T> implements Subscriber<T> {
        private final Subscriber<? super T> downstream;
        private final FlowDoOnLifecycle<T> parent;

        DoOnLifecycleSubscriber(Subscriber<? super T> subscriber, FlowDoOnLifecycle<T> flowDoOnLifecycle) {
            this.downstream = subscriber;
            this.parent = flowDoOnLifecycle;
        }

        public final void onSubscribe(Subscription subscription) {
            if (subscription != null) {
                try {
                    this.parent.onSubscribe.invoke(subscription);
                    this.downstream.onSubscribe(subscription);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    Subscriptions.error(this.downstream, th);
                }
            } else {
                throw new NullPointerException("'s' specified as non-null is null");
            }
        }

        public final void onNext(T t) {
            if (t != null) {
                this.downstream.onNext(t);
                return;
            }
            throw new NullPointerException("'value' specified as non-null is null");
        }

        public final void onError(Throwable th) {
            if (th != null) {
                try {
                    this.parent.onTerminate.invoke();
                    this.downstream.onError(th);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.downstream.onError(th2);
                }
            } else {
                throw new NullPointerException("'e' specified as non-null is null");
            }
        }

        public final void onComplete() {
            try {
                this.parent.onTerminate.invoke();
                this.downstream.onComplete();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }
    }
}
