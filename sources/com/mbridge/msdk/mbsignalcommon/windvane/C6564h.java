package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.h */
/* compiled from: WindVanePlugin */
public abstract class C6564h {
    /* access modifiers changed from: protected */

    /* renamed from: a */
    public Context f16369a;

    /* renamed from: b */
    protected Object f16370b;

    /* renamed from: c */
    protected WindVaneWebView f16371c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f16369a = context;
        this.f16371c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f16370b = obj;
        this.f16371c = windVaneWebView;
    }
}
