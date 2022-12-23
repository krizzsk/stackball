package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.b */
/* compiled from: OguryEventBusEntry.kt */
public final class C7941b {

    /* renamed from: a */
    private final String f20700a;

    /* renamed from: b */
    private final OguryEventCallback f20701b;

    public C7941b(String str, OguryEventCallback oguryEventCallback) {
        C7921ai.m22144b(str, "event");
        C7921ai.m22144b(oguryEventCallback, "callback");
        this.f20700a = str;
        this.f20701b = oguryEventCallback;
    }

    /* renamed from: a */
    public final String mo52907a() {
        return this.f20700a;
    }

    /* renamed from: b */
    public final OguryEventCallback mo52908b() {
        return this.f20701b;
    }
}
