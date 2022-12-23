package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class vb1 {

    /* renamed from: b */
    private static volatile vb1 f41241b;

    /* renamed from: c */
    private static final Object f41242c = new Object();

    /* renamed from: a */
    private final Map<ji0, Set<Object>> f41243a = new HashMap();

    private vb1() {
    }

    /* renamed from: a */
    public static vb1 m43082a() {
        if (f41241b == null) {
            synchronized (f41242c) {
                if (f41241b == null) {
                    f41241b = new vb1();
                }
            }
        }
        return f41241b;
    }

    /* renamed from: b */
    public void mo70469b(ji0 ji0, Object obj) {
        synchronized (f41242c) {
            Set set = this.f41243a.get(ji0);
            if (set == null) {
                set = new HashSet();
                this.f41243a.put(ji0, set);
            }
            set.add(obj);
        }
    }

    /* renamed from: a */
    public void mo70468a(ji0 ji0, Object obj) {
        synchronized (f41242c) {
            Set set = this.f41243a.get(ji0);
            if (set != null) {
                set.remove(obj);
            }
        }
    }
}
