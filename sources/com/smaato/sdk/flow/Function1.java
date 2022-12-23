package com.smaato.sdk.flow;

@FunctionalInterface
public interface Function1<T, R> {
    R apply(T t) throws Throwable;
}
