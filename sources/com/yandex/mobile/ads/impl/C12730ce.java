package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

/* renamed from: com.yandex.mobile.ads.impl.ce */
public class C12730ce {

    /* renamed from: a */
    private final Handler f31906a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final C15236y7<TextView> f31907b;

    public C12730ce(Context context) {
        this.f31907b = new C12970ee().mo66821a(context);
    }

    /* renamed from: a */
    public void mo66269a(TextView textView) {
        this.f31906a.postDelayed(new gb1(textView, this.f31907b), 2000);
    }

    /* renamed from: a */
    public void mo66268a() {
        this.f31906a.removeCallbacksAndMessages((Object) null);
        this.f31907b.mo66392a();
    }
}
