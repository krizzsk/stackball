package com.smaato.sdk.util;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
