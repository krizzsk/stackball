package com.smaato.sdk.flow;

public interface Subscriber<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(Subscription subscription);
}
