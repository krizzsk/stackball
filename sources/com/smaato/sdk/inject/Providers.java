package com.smaato.sdk.inject;

public abstract class Providers {
    static /* synthetic */ String lambda$nullSafe$0() {
        return null;
    }

    private Providers() {
    }

    public static <T> Provider<T> wrap(T t) {
        if (t == null) {
            throw new NullPointerException("'instance' specified as non-null is null");
        } else if (t != null) {
            return new InstanceProvider(t, (byte) 0);
        } else {
            throw new NullPointerException("'instance' is null");
        }
    }

    public static <T> Provider<T> nullSafe(Provider<T> provider) {
        if (provider != null) {
            return nullSafe(provider, $$Lambda$Providers$pqX1OFLvFI8QXnByea1hyUpBQ.INSTANCE);
        }
        throw new NullPointerException("'provider' specified as non-null is null");
    }

    public static <T> Provider<T> nullSafe(Provider<T> provider, Provider<String> provider2) {
        if (provider == null) {
            throw new NullPointerException("'provider' specified as non-null is null");
        } else if (provider2 == null) {
            throw new NullPointerException("'nullMessage' specified as non-null is null");
        } else if (provider != null) {
            return new NullSafeProvider(provider, provider2, (byte) 0);
        } else {
            throw new NullPointerException("'provider' is null");
        }
    }

    public static <T> Provider<T> doubleCheck(Provider<T> provider) {
        if (provider == null) {
            throw new NullPointerException("'provider' specified as non-null is null");
        } else if (provider != null) {
            return new DoubleCheck(provider);
        } else {
            throw new NullPointerException("'provider' is null");
        }
    }

    static final class InstanceProvider<T> implements Provider<T> {
        private final T instance;

        /* synthetic */ InstanceProvider(Object obj, byte b) {
            this(obj);
        }

        private InstanceProvider(T t) {
            this.instance = t;
        }

        public final T get() {
            return this.instance;
        }
    }

    static final class NullSafeProvider<T> implements Provider<T> {
        private final Provider<T> delegate;
        private final Provider<String> nullMessage;

        /* synthetic */ NullSafeProvider(Provider provider, Provider provider2, byte b) {
            this(provider, provider2);
        }

        private NullSafeProvider(Provider<T> provider, Provider<String> provider2) {
            this.delegate = provider;
            this.nullMessage = provider2;
        }

        public final T get() {
            T t = this.delegate.get();
            if (t != null) {
                return t;
            }
            String str = this.nullMessage.get();
            if (str != null) {
                throw new NullPointerException(str);
            }
            throw new NullPointerException("provider returned null value");
        }
    }
}
