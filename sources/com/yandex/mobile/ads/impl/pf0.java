package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.nf0;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;

class pf0 implements nf0.C14097a {

    /* renamed from: a */
    private final Handler f38599a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final C15230y2 f38600b;

    /* renamed from: c */
    private final of0 f38601c;

    /* renamed from: d */
    private final C12352a3 f38602d;

    /* renamed from: e */
    private InstreamAdLoadListener f38603e;

    pf0(Context context, C15230y2 y2Var, of0 of0) {
        this.f38600b = y2Var;
        this.f38601c = of0;
        this.f38602d = new C12352a3(context, y2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40767b(InstreamAd instreamAd) {
        InstreamAdLoadListener instreamAdLoadListener = this.f38603e;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onInstreamAdLoaded(instreamAd);
        }
        this.f38601c.mo66570a();
    }

    /* renamed from: a */
    public void mo69365a(jp1 jp1) {
        this.f38602d.mo65660b(new ch0(jp1));
    }

    /* renamed from: a */
    public void mo69027a(InstreamAd instreamAd) {
        this.f38600b.mo70965a(C15139x2.AD_LOADING);
        this.f38602d.mo65657a();
        this.f38599a.post(new Runnable(instreamAd) {
            public final /* synthetic */ InstreamAd f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                pf0.this.m40767b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40768b(String str) {
        InstreamAdLoadListener instreamAdLoadListener = this.f38603e;
        if (instreamAdLoadListener != null) {
            instreamAdLoadListener.onInstreamAdFailedToLoad(str);
        }
        this.f38601c.mo66570a();
    }

    /* renamed from: a */
    public void mo69028a(String str) {
        this.f38600b.mo70965a(C15139x2.AD_LOADING);
        this.f38602d.mo65659a(str);
        this.f38599a.post(new Runnable(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                pf0.this.m40768b(this.f$1);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo69366a(InstreamAdLoadListener instreamAdLoadListener) {
        this.f38603e = instreamAdLoadListener;
    }
}
