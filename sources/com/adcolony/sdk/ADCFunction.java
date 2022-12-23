package com.adcolony.sdk;

interface ADCFunction {

    public interface Consumer<T> {
        void accept(T t);
    }
}
