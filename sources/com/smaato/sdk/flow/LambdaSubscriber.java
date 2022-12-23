package com.smaato.sdk.flow;

final class LambdaSubscriber<T> implements Subscriber<T> {
    private final Action0 onComplete;
    private final Action1<? super Throwable> onError;
    private final Action1<? super T> onNext;

    LambdaSubscriber(Action1<? super T> action1, Action1<? super Throwable> action12, Action0 action0) {
        this.onNext = action1;
        this.onError = action12;
        this.onComplete = action0;
    }

    public final void onSubscribe(Subscription subscription) {
        if (subscription != null) {
            subscription.request(Long.MAX_VALUE);
            return;
        }
        throw new NullPointerException("'s' specified as non-null is null");
    }

    public final void onNext(T t) {
        if (t != null) {
            try {
                this.onNext.invoke(t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                onError(th);
            }
        } else {
            throw new NullPointerException("'value' specified as non-null is null");
        }
    }

    public final void onError(Throwable th) {
        if (th != null) {
            try {
                this.onError.invoke(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th);
                FlowPlugins.onError(th2);
            }
        } else {
            throw new NullPointerException("'e' specified as non-null is null");
        }
    }

    public final void onComplete() {
        try {
            this.onComplete.invoke();
        } catch (Throwable th) {
            onError(th);
        }
    }
}
