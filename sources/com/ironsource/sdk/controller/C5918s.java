package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.controller.s */
final class C5918s {

    /* renamed from: a */
    private C5919t f14461a;

    /* renamed from: b */
    private boolean f14462b = false;

    C5918s(C5919t tVar) {
        this.f14461a = tVar;
    }

    @JavascriptInterface
    public final String getTokenForMessaging() {
        if (this.f14462b) {
            return "";
        }
        this.f14462b = true;
        return this.f14461a.f14463a;
    }
}
