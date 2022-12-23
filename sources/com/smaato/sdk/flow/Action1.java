package com.smaato.sdk.flow;

@FunctionalInterface
public interface Action1<T> {
    void invoke(T t) throws Throwable;
}
