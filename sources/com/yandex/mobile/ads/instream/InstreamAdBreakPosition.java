package com.yandex.mobile.ads.instream;

public class InstreamAdBreakPosition {

    /* renamed from: a */
    private final Type f43527a;

    /* renamed from: b */
    private final long f43528b;

    public enum Type {
        PERCENTS,
        MILLISECONDS,
        POSITION
    }

    public InstreamAdBreakPosition(Type type, long j) {
        this.f43528b = j;
        this.f43527a = type;
    }

    public Type getPositionType() {
        return this.f43527a;
    }

    public long getValue() {
        return this.f43528b;
    }
}
