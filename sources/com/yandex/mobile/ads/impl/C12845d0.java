package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.d0 */
public final class C12845d0 {

    /* renamed from: b */
    private static final Object f32333b = new Object();

    /* renamed from: c */
    private static volatile C12845d0 f32334c;

    /* renamed from: a */
    private final Map<Long, C12686c0> f32335a = new HashMap();

    private C12845d0() {
    }

    /* renamed from: a */
    public static C12845d0 m34958a() {
        if (f32334c == null) {
            synchronized (f32333b) {
                if (f32334c == null) {
                    f32334c = new C12845d0();
                }
            }
        }
        return f32334c;
    }

    /* renamed from: a */
    public void mo66381a(long j, C12686c0 c0Var) {
        synchronized (f32333b) {
            this.f32335a.put(Long.valueOf(j), c0Var);
        }
    }

    /* renamed from: a */
    public C12686c0 mo66380a(long j) {
        C12686c0 remove;
        synchronized (f32333b) {
            remove = this.f32335a.remove(Long.valueOf(j));
        }
        return remove;
    }
}
