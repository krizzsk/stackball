package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.VideoEventListener;

public class dm1 implements hm1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f32709a = new Object();

    /* renamed from: b */
    private final Handler f32710b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public VideoEventListener f32711c;

    /* renamed from: com.yandex.mobile.ads.impl.dm1$a */
    class C12905a implements Runnable {
        C12905a() {
        }

        public void run() {
            synchronized (dm1.this.f32709a) {
                if (dm1.this.f32711c != null) {
                    dm1.this.f32711c.onVideoComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo66643a(VideoEventListener videoEventListener) {
        synchronized (this.f32709a) {
            this.f32711c = videoEventListener;
        }
    }

    /* renamed from: a */
    public void mo66642a() {
        this.f32710b.post(new C12905a());
    }
}
