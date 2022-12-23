package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

class qh1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f39114a;

    /* renamed from: b */
    private final Handler f39115b = new Handler(Looper.getMainLooper());

    /* renamed from: com.yandex.mobile.ads.impl.qh1$a */
    class C14385a implements Runnable {
        C14385a() {
        }

        public void run() {
            Toast.makeText(qh1.this.f39114a, "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs", 1).show();
        }
    }

    qh1(Context context) {
        this.f39114a = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo69592a() {
        this.f39115b.post(new C14385a());
    }
}
