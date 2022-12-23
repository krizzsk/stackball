package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.vj */
public class C14894vj implements wc1 {

    /* renamed from: a */
    private final WeakReference<Context> f41301a;

    /* renamed from: b */
    private final C14645t1 f41302b;

    /* renamed from: c */
    private final ResultReceiver f41303c;

    public C14894vj(Context context, C14645t1 t1Var, ResultReceiver resultReceiver) {
        this.f41301a = new WeakReference<>(context);
        this.f41302b = t1Var;
        this.f41303c = resultReceiver;
    }

    /* renamed from: a */
    public void mo68549a(k41 k41, String str) {
        C13823l0.m38539a((Context) this.f41301a.get(), k41, str, this.f41303c, this.f41302b.mo70113s());
    }
}
