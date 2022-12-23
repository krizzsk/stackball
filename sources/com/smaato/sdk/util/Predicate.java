package com.smaato.sdk.util;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
