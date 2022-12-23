package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

public final class mw0 {

    /* renamed from: c */
    private static final Object f37534c = new Object();

    /* renamed from: d */
    private static volatile mw0 f37535d;

    /* renamed from: a */
    private final xw0 f37536a = new xw0();

    /* renamed from: b */
    private boolean f37537b;

    private mw0() {
    }

    /* renamed from: a */
    public static mw0 m39747a() {
        if (f37535d == null) {
            synchronized (f37534c) {
                if (f37535d == null) {
                    f37535d = new mw0();
                }
            }
        }
        return (mw0) Objects.requireNonNull(f37535d);
    }

    /* renamed from: a */
    public void mo68864a(Context context) {
        synchronized (f37534c) {
            if (this.f37536a.mo70945b(context) && !this.f37537b) {
                zw0.m44844a(context);
                this.f37537b = true;
            }
        }
    }
}
