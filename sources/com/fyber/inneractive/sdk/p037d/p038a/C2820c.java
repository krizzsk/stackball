package com.fyber.inneractive.sdk.p037d.p038a;

/* renamed from: com.fyber.inneractive.sdk.d.a.c */
public final class C2820c {

    /* renamed from: a */
    C2821a f6686a;

    /* renamed from: b */
    Object f6687b;

    /* renamed from: com.fyber.inneractive.sdk.d.a.c$a */
    public enum C2821a {
        BITRATE_NOT_IN_RANGE(1),
        UNSUPPORTED_MIME_TYPE(2),
        UNSUPPORTED_DELIVERY(3),
        UNSECURED_VIDEO_URL(4),
        VERTICAL_VIDEO_EXPECTED(5),
        FILTERED_BY_APP_OR_UNIT(6),
        NO_CONTENT(7);
        

        /* renamed from: h */
        int f6696h;

        private C2821a(int i) {
            this.f6696h = i;
        }
    }

    public C2820c(C2821a aVar) {
        this(aVar, (Object) null);
    }

    public C2820c(C2821a aVar, Object obj) {
        this.f6686a = aVar;
        this.f6687b = obj;
    }

    public final String toString() {
        return "Media File inc error::  type = " + this.f6686a + " expected value = " + this.f6687b;
    }
}
