package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Map;
import java.util.WeakHashMap;

public final class g71 {

    /* renamed from: b */
    private static final Object f33898b = new Object();

    /* renamed from: c */
    private static volatile g71 f33899c;

    /* renamed from: a */
    private final Map<C13180a, Object> f33900a = new WeakHashMap();

    /* renamed from: com.yandex.mobile.ads.impl.g71$a */
    public interface C13180a {
        /* renamed from: a */
        void mo67205a(Context context, d71 d71);
    }

    private g71() {
    }

    /* renamed from: a */
    public static g71 m36498a() {
        if (f33899c == null) {
            synchronized (f33898b) {
                if (f33899c == null) {
                    f33899c = new g71();
                }
            }
        }
        return f33899c;
    }

    /* renamed from: a */
    public void mo67204a(C13180a aVar) {
        synchronized (f33898b) {
            if (!this.f33900a.containsKey(aVar)) {
                this.f33900a.put(aVar, (Object) null);
            }
        }
    }

    /* renamed from: a */
    public void mo67203a(Context context, d71 d71) {
        synchronized (f33898b) {
            l71.m38631c().mo68364a(context, d71);
            for (C13180a a : this.f33900a.keySet()) {
                a.mo67205a(context, d71);
            }
        }
    }
}
