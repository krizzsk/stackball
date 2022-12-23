package com.smaato.sdk.util;

final class AutoValue_Optional<T> extends Optional<T> {
    private final T value;

    AutoValue_Optional(T t) {
        this.value = t;
    }

    /* access modifiers changed from: package-private */
    public final T value() {
        return this.value;
    }

    public final String toString() {
        return "Optional{value=" + this.value + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        T t = this.value;
        Object value2 = ((Optional) obj).value();
        if (t == null) {
            return value2 == null;
        }
        return t.equals(value2);
    }

    public final int hashCode() {
        T t = this.value;
        return (t == null ? 0 : t.hashCode()) ^ 1000003;
    }
}
