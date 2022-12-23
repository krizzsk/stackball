package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

public class nr0 implements C15126x {

    /* renamed from: a */
    private final Handler f37900a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private NativeAdEventListener f37901b;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m40157c() {
        NativeAdEventListener nativeAdEventListener = this.f37901b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked();
            nativeAdEventListener.onLeftApplication();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m40158d() {
        NativeAdEventListener nativeAdEventListener = this.f37901b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onReturnedToApplication();
        }
    }

    /* renamed from: a */
    public void mo69076a(NativeAdEventListener nativeAdEventListener) {
        this.f37901b = nativeAdEventListener;
    }

    /* renamed from: b */
    public void mo69077b(AdImpressionData adImpressionData) {
        this.f37900a.post(new Runnable(adImpressionData) {
            public final /* synthetic */ AdImpressionData f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                nr0.this.m40155a(this.f$1);
            }
        });
    }

    public void onLeftApplication() {
        this.f37900a.post(new Runnable() {
            public final void run() {
                nr0.this.m40157c();
            }
        });
    }

    public void onReturnedToApplication() {
        this.f37900a.post(new Runnable() {
            public final void run() {
                nr0.this.m40158d();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m40155a(AdImpressionData adImpressionData) {
        NativeAdEventListener nativeAdEventListener = this.f37901b;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onImpression(adImpressionData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m40156b() {
        NativeAdEventListener nativeAdEventListener = this.f37901b;
        if (nativeAdEventListener instanceof ClosableNativeAdEventListener) {
            ((ClosableNativeAdEventListener) nativeAdEventListener).closeNativeAd();
        }
    }

    /* renamed from: a */
    public void mo69075a() {
        this.f37900a.post(new Runnable() {
            public final void run() {
                nr0.this.m40156b();
            }
        });
    }
}
