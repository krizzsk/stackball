package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.u41;

public class s41 {

    /* renamed from: a */
    private static volatile s41 f39843a;

    /* renamed from: b */
    private static final Object f39844b = new Object();

    /* renamed from: com.yandex.mobile.ads.impl.s41$a */
    class C14562a implements u41.C14740b {

        /* renamed from: a */
        final /* synthetic */ Object f39845a;

        C14562a(s41 s41, Object obj) {
            this.f39845a = obj;
        }

        /* renamed from: a */
        public boolean mo69871a(l41<?> l41) {
            return this.f39845a.equals(l41.mo68346i());
        }
    }

    /* renamed from: a */
    public static s41 m41806a() {
        if (f39843a == null) {
            synchronized (f39844b) {
                if (f39843a == null) {
                    f39843a = new s41();
                }
            }
        }
        return f39843a;
    }

    /* renamed from: a */
    public void mo69870a(Context context, Object obj) {
        lv0.m39021a(context).mo70287a((u41.C14740b) new C14562a(this, obj));
    }
}
