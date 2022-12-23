package com.smaato.sdk.net;

import java.util.List;
import java.util.Map;

final class AutoValue_Headers extends Headers {
    private final Map<String, List<String>> headers;

    AutoValue_Headers(Map<String, List<String>> map) {
        if (map != null) {
            this.headers = map;
            return;
        }
        throw new NullPointerException("Null headers");
    }

    /* access modifiers changed from: package-private */
    public final Map<String, List<String>> headers() {
        return this.headers;
    }

    public final String toString() {
        return "Headers{headers=" + this.headers + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Headers) {
            return this.headers.equals(((Headers) obj).headers());
        }
        return false;
    }

    public final int hashCode() {
        return this.headers.hashCode() ^ 1000003;
    }
}
