package com.smaato.sdk.core.p249di;

import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.core.di.SingletonFactory */
final class SingletonFactory<T> implements ClassFactory<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile ClassFactory<T> factory;
    private volatile Object instance = UNINITIALIZED;

    private SingletonFactory(ClassFactory<T> classFactory) {
        this.factory = (ClassFactory) Objects.requireNonNull(classFactory);
    }

    public final T get(DiConstructor diConstructor) {
        T t = this.instance;
        if (t == UNINITIALIZED) {
            synchronized (this) {
                t = this.instance;
                if (t == UNINITIALIZED) {
                    T t2 = this.factory.get(diConstructor);
                    T t3 = this.instance;
                    if (t3 != UNINITIALIZED) {
                        if (t3 != t2) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + t3 + " & " + t2 + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.instance = t2;
                    this.factory = null;
                    t = t2;
                }
            }
        }
        return t;
    }

    public static <T> ClassFactory<T> wrap(ClassFactory<T> classFactory) {
        Objects.requireNonNull(classFactory);
        if (classFactory instanceof SingletonFactory) {
            return classFactory;
        }
        return new SingletonFactory(classFactory);
    }
}
