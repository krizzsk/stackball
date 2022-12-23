package com.smaato.sdk.core.util;

import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import com.smaato.sdk.core.util.p251fi.Predicate;
import com.smaato.sdk.core.util.p251fi.Supplier;
import java.util.NoSuchElementException;

public final class Optional<T> {
    private static final Optional<?> EMPTY = new Optional<>();
    private final T value;

    private Optional() {
        this.value = null;
    }

    private Optional(T t) {
        this.value = Objects.requireNonNull(t);
    }

    public static <T> Optional<T> empty() {
        return EMPTY;
    }

    /* renamed from: of */
    public static <T> Optional<T> m24069of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : m24069of(t);
    }

    public final T get() {
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean isPresent() {
        return this.value != null;
    }

    public final boolean isEmpty() {
        return this.value == null;
    }

    public final void ifPresent(Consumer<? super T> consumer) {
        T t = this.value;
        if (t != null) {
            consumer.accept(t);
        }
    }

    public final Optional<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return (!isEmpty() && !predicate.test(this.value)) ? empty() : this;
    }

    public final <U> Optional<U> map(Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return ofNullable(function.apply(this.value));
    }

    public final <U> Optional<U> flatMap(Function<? super T, Optional<U>> function) {
        Objects.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return (Optional) Objects.requireNonNull(function.apply(this.value));
    }

    public final T orElse(T t) {
        T t2 = this.value;
        return t2 != null ? t2 : t;
    }

    public final T orElseGet(Supplier<? extends T> supplier) {
        T t = this.value;
        return t != null ? t : supplier.get();
    }

    public final <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws Throwable {
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw ((Throwable) supplier.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        return Objects.equals(this.value, ((Optional) obj).value);
    }

    public final int hashCode() {
        return Objects.hash(this.value);
    }

    public final String toString() {
        T t = this.value;
        if (t == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{t});
    }
}
