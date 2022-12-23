package com.flurry.sdk;

import android.text.TextUtils;

/* renamed from: com.flurry.sdk.cu */
public abstract class C2509cu {

    /* renamed from: c */
    protected String f5878c = "com.flurry.android.sdk.ReplaceMeWithAProperEventName";

    public C2509cu(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f5878c = str;
            return;
        }
        throw new IllegalArgumentException("Event must have a name!");
    }

    /* renamed from: a */
    public final String mo17719a() {
        return this.f5878c;
    }

    /* renamed from: b */
    public final void mo17720b() {
        C2511cw.m5419a().mo17721a(this);
    }
}
