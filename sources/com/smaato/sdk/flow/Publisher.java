package com.smaato.sdk.flow;

public interface Publisher<T> {
    void subscribe(Subscriber<? super T> subscriber);
}
