package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.instream.InstreamAdListener;

public class gg0 implements xg0 {

    /* renamed from: a */
    private final Handler f33997a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private InstreamAdListener f33998b;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m36610b() {
        InstreamAdListener instreamAdListener = this.f33998b;
        if (instreamAdListener != null) {
            instreamAdListener.onInstreamAdCompleted();
        }
    }

    /* renamed from: a */
    public void mo67303a(InstreamAdListener instreamAdListener) {
        this.f33998b = instreamAdListener;
    }

    /* renamed from: c */
    public void mo67305c() {
        this.f33997a.post(new Runnable() {
            public final void run() {
                gg0.this.m36608a();
            }
        });
    }

    /* renamed from: d */
    public void mo67306d() {
        this.f33997a.post(new Runnable() {
            public final void run() {
                gg0.this.m36610b();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36608a() {
        InstreamAdListener instreamAdListener = this.f33998b;
        if (instreamAdListener != null) {
            instreamAdListener.onInstreamAdPrepared();
        }
    }

    /* renamed from: b */
    public void mo67304b(String str) {
        this.f33997a.post(new Runnable(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                gg0.this.m36609a(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m36609a(String str) {
        InstreamAdListener instreamAdListener = this.f33998b;
        if (instreamAdListener != null) {
            instreamAdListener.onError(str);
        }
    }
}
