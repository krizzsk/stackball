package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rl0;
import java.util.List;

public interface ql0 {

    /* renamed from: a */
    public static final ql0 f39179a = new C14394a();

    /* renamed from: com.yandex.mobile.ads.impl.ql0$a */
    class C14394a implements ql0 {
        C14394a() {
        }

        /* renamed from: a */
        public List<ol0> mo69620a(String str, boolean z, boolean z2) throws rl0.C14471c {
            return rl0.m41610a(str, z, z2);
        }

        /* renamed from: a */
        public ol0 mo69619a() throws rl0.C14471c {
            List<ol0> a = rl0.m41610a("audio/raw", false, false);
            ol0 ol0 = a.isEmpty() ? null : a.get(0);
            if (ol0 == null) {
                return null;
            }
            return ol0.m40448b(ol0.f38260a);
        }
    }

    /* renamed from: a */
    ol0 mo69619a() throws rl0.C14471c;

    /* renamed from: a */
    List<ol0> mo69620a(String str, boolean z, boolean z2) throws rl0.C14471c;
}
