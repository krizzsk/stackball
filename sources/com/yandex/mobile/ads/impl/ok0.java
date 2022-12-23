package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;

public class ok0 implements InstreamAdBreakEventListener {

    /* renamed from: a */
    private final Handler f38256a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private InstreamAdBreakEventListener f38257b;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40439b() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f38257b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakPrepared();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m40440c() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f38257b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakStarted();
        }
    }

    /* renamed from: a */
    public void mo69193a(InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f38257b = instreamAdBreakEventListener;
    }

    public void onInstreamAdBreakCompleted() {
        this.f38256a.post(new Runnable() {
            public final void run() {
                ok0.this.m40437a();
            }
        });
    }

    public void onInstreamAdBreakError(String str) {
        this.f38256a.post(new Runnable(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ok0.this.m40438a(this.f$1);
            }
        });
    }

    public void onInstreamAdBreakPrepared() {
        this.f38256a.post(new Runnable() {
            public final void run() {
                ok0.this.m40439b();
            }
        });
    }

    public void onInstreamAdBreakStarted() {
        this.f38256a.post(new Runnable() {
            public final void run() {
                ok0.this.m40440c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40437a() {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f38257b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakCompleted();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40438a(String str) {
        InstreamAdBreakEventListener instreamAdBreakEventListener = this.f38257b;
        if (instreamAdBreakEventListener != null) {
            instreamAdBreakEventListener.onInstreamAdBreakError(str);
        }
    }
}
