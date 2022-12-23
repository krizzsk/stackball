package com.ironsource.sdk.p145c;

import android.webkit.JavascriptInterface;

/* renamed from: com.ironsource.sdk.c.b */
public final class C5839b {

    /* renamed from: a */
    private C5840c f14220a;

    C5839b(C5840c cVar) {
        this.f14220a = cVar;
    }

    @JavascriptInterface
    public final void receiveMessageFromExternal(String str) {
        this.f14220a.handleMessageFromAd(str);
    }
}
