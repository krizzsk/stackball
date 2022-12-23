package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.bl */
public class C12594bl<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: c */
    private static final long f31359c = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: a */
    private final tq0 f31360a = new tq0();

    /* renamed from: b */
    private final Handler f31361b = new Handler(Looper.getMainLooper());

    /* renamed from: com.yandex.mobile.ads.impl.bl$a */
    private static class C12595a implements Runnable {

        /* renamed from: b */
        private final TextView f31362b;

        public C12595a(TextView textView) {
            this.f31362b = textView;
        }

        public void run() {
            this.f31362b.setSelected(true);
        }
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        TextView b = this.f31360a.mo65902b(v);
        if (b != null) {
            this.f31361b.postDelayed(new C12595a(b), f31359c);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
        this.f31361b.removeCallbacksAndMessages((Object) null);
    }
}
