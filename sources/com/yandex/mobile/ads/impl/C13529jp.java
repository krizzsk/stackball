package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C13429ip;

/* renamed from: com.yandex.mobile.ads.impl.jp */
public final class C13529jp {

    /* renamed from: b */
    private static final Object f35423b = new Object();

    /* renamed from: c */
    private static volatile C13529jp f35424c;

    /* renamed from: a */
    private C13429ip f35425a;

    private C13529jp() {
    }

    /* renamed from: a */
    public static C13529jp m37935a() {
        if (f35424c == null) {
            synchronized (f35423b) {
                if (f35424c == null) {
                    f35424c = new C13529jp();
                }
            }
        }
        return f35424c;
    }

    /* renamed from: a */
    public C13429ip mo68073a(Context context) {
        synchronized (f35423b) {
            if (this.f35425a == null) {
                C14310pt ptVar = new C14310pt(context);
                this.f35425a = new C13429ip.C13431b(ptVar).mo67868a((C15202xq) new C14700tq(new C14776uq(), new C14906vq())).mo67867a((C14307pr) C15117wu.m43870a()).mo67869a();
            }
        }
        return this.f35425a;
    }
}
