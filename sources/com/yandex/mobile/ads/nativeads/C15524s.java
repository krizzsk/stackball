package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.C12350a2;
import com.yandex.mobile.ads.impl.C12352a3;
import com.yandex.mobile.ads.impl.C14645t1;
import com.yandex.mobile.ads.impl.C14736u3;
import com.yandex.mobile.ads.impl.C15230y2;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.ur0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.nativeads.s */
public final class C15524s {

    /* renamed from: a */
    private final ur0 f43944a;

    /* renamed from: b */
    private final Handler f43945b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final C12352a3 f43946c;

    /* renamed from: d */
    private NativeAdLoadListener f43947d;

    /* renamed from: e */
    private NativeBulkAdLoadListener f43948e;

    /* renamed from: f */
    private SliderAdLoadListener f43949f;

    public C15524s(Context context, C15230y2 y2Var, ur0 ur0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(y2Var, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(ur0, "nativeAdLoadingFinishedListener");
        this.f43944a = ur0;
        this.f43946c = new C12352a3(context, y2Var);
    }

    /* renamed from: a */
    public final void mo71745a(C14645t1 t1Var) {
        Intrinsics.checkNotNullParameter(t1Var, "adConfiguration");
        this.f43946c.mo65660b(new C14736u3(C12115n.NATIVE, t1Var));
    }

    /* renamed from: b */
    public void mo71752b(C12350a2 a2Var) {
        Intrinsics.checkNotNullParameter(a2Var, "error");
        m45249a(a2Var);
    }

    /* renamed from: a */
    public final void mo71744a(h41.C13275a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "reportParameterManager");
        this.f43946c.mo65658a(aVar);
    }

    /* renamed from: a */
    public final void mo71747a(NativeAdLoadListener nativeAdLoadListener) {
        this.f43947d = nativeAdLoadListener;
    }

    /* renamed from: a */
    public final void mo71748a(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f43948e = nativeBulkAdLoadListener;
    }

    /* renamed from: a */
    public final void mo71750a(SliderAdLoadListener sliderAdLoadListener) {
        this.f43949f = sliderAdLoadListener;
    }

    /* renamed from: a */
    public final void mo71743a() {
        this.f43945b.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    public void mo71746a(NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f43946c.mo65657a();
        this.f43945b.post(new Runnable(nativeAd) {
            public final /* synthetic */ NativeAd f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C15524s.m45251a(C15524s.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m45251a(C15524s sVar, NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(sVar, "this$0");
        Intrinsics.checkNotNullParameter(nativeAd, "$nativeAd");
        NativeAdLoadListener nativeAdLoadListener = sVar.f43947d;
        if (nativeAdLoadListener != null) {
            nativeAdLoadListener.onAdLoaded(nativeAd);
        }
        ((C15517p) sVar.f43944a).mo71731b();
    }

    /* renamed from: a */
    public void mo71751a(List<? extends NativeAd> list) {
        Intrinsics.checkNotNullParameter(list, "nativeGenericAds");
        this.f43946c.mo65657a();
        this.f43945b.post(new Runnable(list) {
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C15524s.m45253a(C15524s.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m45253a(C15524s sVar, List list) {
        Intrinsics.checkNotNullParameter(sVar, "this$0");
        Intrinsics.checkNotNullParameter(list, "$nativeGenericAds");
        NativeBulkAdLoadListener nativeBulkAdLoadListener = sVar.f43948e;
        if (nativeBulkAdLoadListener != null) {
            nativeBulkAdLoadListener.onAdsLoaded(list);
        }
        ((C15517p) sVar.f43944a).mo71731b();
    }

    /* renamed from: a */
    public void mo71749a(SliderAd sliderAd) {
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        this.f43946c.mo65657a();
        this.f43945b.post(new Runnable(sliderAd) {
            public final /* synthetic */ SliderAd f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C15524s.m45252a(C15524s.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m45252a(C15524s sVar, SliderAd sliderAd) {
        Intrinsics.checkNotNullParameter(sVar, "this$0");
        Intrinsics.checkNotNullParameter(sliderAd, "$sliderAd");
        SliderAdLoadListener sliderAdLoadListener = sVar.f43949f;
        if (sliderAdLoadListener != null) {
            sliderAdLoadListener.onSliderAdLoaded(sliderAd);
        }
        ((C15517p) sVar.f43944a).mo71731b();
    }

    /* renamed from: a */
    private final void m45249a(C12350a2 a2Var) {
        this.f43946c.mo65659a(a2Var.mo65652b());
        this.f43945b.post(new Runnable(this) {
            public final /* synthetic */ C15524s f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C15524s.m45250a(C12350a2.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m45250a(C12350a2 a2Var, C15524s sVar) {
        Intrinsics.checkNotNullParameter(a2Var, "$error");
        Intrinsics.checkNotNullParameter(sVar, "this$0");
        AdRequestError adRequestError = new AdRequestError(a2Var.mo65651a(), a2Var.mo65652b());
        NativeAdLoadListener nativeAdLoadListener = sVar.f43947d;
        if (nativeAdLoadListener != null) {
            nativeAdLoadListener.onAdFailedToLoad(adRequestError);
        }
        NativeBulkAdLoadListener nativeBulkAdLoadListener = sVar.f43948e;
        if (nativeBulkAdLoadListener != null) {
            nativeBulkAdLoadListener.onAdsFailedToLoad(adRequestError);
        }
        SliderAdLoadListener sliderAdLoadListener = sVar.f43949f;
        if (sliderAdLoadListener != null) {
            sliderAdLoadListener.onSliderAdFailedToLoad(adRequestError);
        }
        ((C15517p) sVar.f43944a).mo71731b();
    }
}
