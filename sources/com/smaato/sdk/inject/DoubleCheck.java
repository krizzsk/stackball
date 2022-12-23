package com.smaato.sdk.inject;

final class DoubleCheck<T> implements Provider<T> {
    private volatile Object instance;
    private volatile Provider<T> provider;

    DoubleCheck(Provider<T> provider2) {
        this.provider = provider2;
    }

    public final T get() {
        T t = this.instance;
        if (t == null) {
            synchronized (this) {
                t = this.instance;
                if (t == null) {
                    t = this.provider.get();
                    this.instance = t;
                    this.provider = null;
                }
            }
        }
        return t;
    }
}
