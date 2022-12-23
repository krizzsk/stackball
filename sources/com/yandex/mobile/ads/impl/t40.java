package com.yandex.mobile.ads.impl;

import android.content.Context;

public final class t40 {

    /* renamed from: c */
    private static final Object f40230c = new Object();

    /* renamed from: d */
    private static volatile t40 f40231d;

    /* renamed from: a */
    private final s40 f40232a = new s40();

    /* renamed from: b */
    private C12966ed f40233b;

    private t40() {
    }

    /* renamed from: a */
    public static t40 m42252a() {
        if (f40231d == null) {
            synchronized (f40230c) {
                if (f40231d == null) {
                    f40231d = new t40();
                }
            }
        }
        return f40231d;
    }

    /* renamed from: a */
    public C12966ed mo70127a(Context context) {
        C12966ed edVar;
        synchronized (f40230c) {
            if (this.f40233b == null) {
                this.f40233b = this.f40232a.mo69869a(context);
            }
            edVar = this.f40233b;
        }
        return edVar;
    }
}
