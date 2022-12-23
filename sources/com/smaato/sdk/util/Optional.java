package com.smaato.sdk.util;

public abstract class Optional<T> {
    private static final Optional<?> EMPTY = m24104of((Object) null);

    /* access modifiers changed from: package-private */
    public abstract T value();

    /* renamed from: of */
    public static <T> Optional<T> m24104of(T t) {
        return new AutoValue_Optional(t);
    }

    public static <T> Optional<T> empty() {
        return EMPTY;
    }

    public T get() {
        T value = value();
        if (value != null) {
            return value;
        }
        throw new NullPointerException("No value present");
    }

    public boolean isPresent() {
        return value() != null;
    }

    public Optional<T> ifPresent(Consumer<T> consumer) {
        if (consumer != null) {
            Object value = value();
            if (value != null) {
                consumer.accept(value);
            }
            return this;
        }
        throw new NullPointerException("'consumer' specified as non-null is null");
    }

    public Optional<T> ifEmpty(Runnable runnable) {
        if (runnable != null) {
            if (value() == null) {
                runnable.run();
            }
            return this;
        }
        throw new NullPointerException("'action' specified as non-null is null");
    }

    public <U> Optional<U> map(Function<T, U> function) {
        if (function != null) {
            Object value = value();
            return value == null ? empty() : m24104of(function.apply(value));
        }
        throw new NullPointerException("'mapper' specified as non-null is null");
    }
}
