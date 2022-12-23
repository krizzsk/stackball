package com.yandex.mobile.ads.common;

import java.util.Locale;

public final class AdRequestError {

    /* renamed from: a */
    private final String f29437a;

    /* renamed from: b */
    private final int f29438b;

    public static final class Code {
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;
    }

    public AdRequestError(int i, String str) {
        this.f29438b = i;
        this.f29437a = str == null ? "Unknown reason" : str;
    }

    public int getCode() {
        return this.f29438b;
    }

    public String getDescription() {
        return this.f29437a;
    }

    public String toString() {
        return String.format(Locale.US, "AdRequestError (code: %d, description: %s)", new Object[]{Integer.valueOf(this.f29438b), this.f29437a});
    }
}
