package com.ogury.core.internal.aaid;

import com.ogury.core.internal.C7921ai;

/* compiled from: OguryAaid.kt */
public final class OguryAaid {

    /* renamed from: id */
    private final String f20678id;
    private final boolean isAdTrackingEnabled;
    private final boolean isFake;

    public OguryAaid(String str, boolean z, boolean z2) {
        C7921ai.m22144b(str, "id");
        this.f20678id = str;
        this.isAdTrackingEnabled = z;
        this.isFake = z2;
    }

    public final String getId() {
        return this.f20678id;
    }

    public final boolean isAdTrackingEnabled() {
        return this.isAdTrackingEnabled;
    }

    public final boolean isFake() {
        return this.isFake;
    }
}
