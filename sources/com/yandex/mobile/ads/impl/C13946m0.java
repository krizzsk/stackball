package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.m0 */
public class C13946m0 implements wc1 {

    /* renamed from: a */
    private final WeakReference<Context> f37138a;

    /* renamed from: b */
    private final ResultReceiver f37139b;

    /* renamed from: c */
    private final boolean f37140c;

    public C13946m0(Context context, boolean z, ResultReceiver resultReceiver) {
        this.f37138a = new WeakReference<>(context);
        this.f37140c = z;
        this.f37139b = resultReceiver;
    }

    /* renamed from: a */
    public void mo68549a(k41 k41, String str) {
        C13823l0.m38539a((Context) this.f37138a.get(), k41, str, this.f37139b, this.f37140c);
    }
}
