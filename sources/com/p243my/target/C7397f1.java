package com.p243my.target;

import android.content.Context;
import android.view.View;
import com.p243my.target.C7555n0;
import com.p243my.target.C7599p3;
import com.p243my.target.common.models.VideoData;
import com.p243my.target.nativeads.NativeAd;
import com.p243my.target.nativeads.banners.NativePromoBanner;
import com.p243my.target.nativeads.views.MediaAdView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.f1 */
public final class C7397f1 implements C7616q0 {

    /* renamed from: a */
    public final NativeAd f18559a;

    /* renamed from: b */
    public final ArrayList<C7453i2> f18560b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C7453i2> f18561c = new ArrayList<>();

    /* renamed from: d */
    public final C7435h2 f18562d;

    /* renamed from: e */
    public final C7424g8 f18563e = C7424g8.m19196a();

    /* renamed from: f */
    public final C7555n0 f18564f;

    /* renamed from: g */
    public final NativePromoBanner f18565g;

    /* renamed from: h */
    public final C7599p3 f18566h;

    /* renamed from: i */
    public NativeAd.NativeAdMediaListener f18567i;

    /* renamed from: j */
    public boolean f18568j;

    /* renamed from: com.my.target.f1$a */
    public static class C7398a implements C7555n0.C7558c {

        /* renamed from: a */
        public final C7397f1 f18569a;

        /* renamed from: b */
        public final NativeAd f18570b;

        public C7398a(C7397f1 f1Var, NativeAd nativeAd) {
            this.f18569a = f1Var;
            this.f18570b = nativeAd;
        }

        /* renamed from: a */
        public void mo50109a(int i, Context context) {
            this.f18569a.mo50096a(i, context);
        }

        /* renamed from: a */
        public void mo50110a(View view) {
            this.f18569a.mo50104b(view);
        }

        /* renamed from: a */
        public void mo50111a(View view, int i) {
            this.f18569a.mo50098a(view, i);
        }

        /* renamed from: a */
        public void mo50112a(C7479j2 j2Var, String str, Context context) {
            this.f18569a.mo50099a(j2Var, str, context);
        }

        /* renamed from: a */
        public void mo50113a(int[] iArr, Context context) {
            this.f18569a.mo50102a(iArr, context);
        }

        /* renamed from: b */
        public void mo50114b() {
            NativeAd.NativeAdMediaListener a = this.f18569a.f18567i;
            if (a != null) {
                a.onIconLoad(this.f18570b);
            }
        }

        /* renamed from: c */
        public void mo50115c() {
            this.f18569a.mo50103b();
        }

        /* renamed from: d */
        public void mo50116d() {
            this.f18569a.mo50107e();
        }

        /* renamed from: e */
        public void mo50117e() {
            this.f18569a.mo50095a();
        }

        /* renamed from: f */
        public void mo50118f() {
            this.f18569a.mo50108f();
        }

        /* renamed from: g */
        public void mo50119g() {
            NativeAd.NativeAdMediaListener a = this.f18569a.f18567i;
            if (a != null) {
                a.onImageLoad(this.f18570b);
            }
        }

        public void onClick(View view) {
            this.f18569a.mo50097a(view);
        }
    }

    public C7397f1(NativeAd nativeAd, C7435h2 h2Var, Context context) {
        this.f18559a = nativeAd;
        this.f18562d = h2Var;
        this.f18565g = NativePromoBanner.newBanner(h2Var);
        C7413g2<VideoData> videoBanner = h2Var.getVideoBanner();
        C7599p3 a = C7599p3.m20069a(h2Var, videoBanner != null ? 3 : 2, videoBanner, context);
        this.f18566h = a;
        C7452i1 a2 = C7452i1.m19324a(a, context);
        a2.mo50358a(nativeAd.isUseExoPlayer());
        this.f18564f = C7555n0.m19862a(h2Var, (C7555n0.C7558c) new C7398a(this, nativeAd), a2);
    }

    /* renamed from: a */
    public static C7397f1 m19091a(NativeAd nativeAd, C7435h2 h2Var, Context context) {
        return new C7397f1(nativeAd, h2Var, context);
    }

    /* renamed from: a */
    public void mo50095a() {
        NativeAd.NativeAdListener listener = this.f18559a.getListener();
        if (listener != null) {
            listener.onVideoComplete(this.f18559a);
        }
    }

    /* renamed from: a */
    public void mo50096a(int i, Context context) {
        List<C7453i2> nativeAdCards = this.f18562d.getNativeAdCards();
        C7453i2 i2Var = (i < 0 || i >= nativeAdCards.size()) ? null : nativeAdCards.get(i);
        if (i2Var != null && !this.f18561c.contains(i2Var)) {
            C7741x8.m20827c((List<C7328b3>) i2Var.getStatHolder().mo49800a("render"), context);
            this.f18561c.add(i2Var);
        }
    }

    /* renamed from: a */
    public void mo50097a(View view) {
        C7374e0.m18989a("Click received by native ad");
        if (view != null) {
            mo50100a((C7768z1) this.f18562d, view.getContext());
        }
    }

    /* renamed from: a */
    public void mo50098a(View view, int i) {
        C7374e0.m18989a("Click on native card received");
        List<C7453i2> nativeAdCards = this.f18562d.getNativeAdCards();
        if (i >= 0 && i < nativeAdCards.size()) {
            mo50100a((C7768z1) nativeAdCards.get(i), view.getContext());
        }
        C7343c3 statHolder = this.f18562d.getStatHolder();
        Context context = view.getContext();
        if (context != null) {
            C7741x8.m20827c((List<C7328b3>) statHolder.mo49800a("click"), context);
        }
    }

    /* renamed from: a */
    public void mo49698a(View view, List<View> list, int i, MediaAdView mediaAdView) {
        unregisterView();
        C7599p3 p3Var = this.f18566h;
        if (p3Var != null) {
            p3Var.mo51324a(view, new C7599p3.C7602c[0]);
        }
        this.f18564f.mo50936a(view, list, i, mediaAdView);
    }

    /* renamed from: a */
    public void mo50099a(C7479j2 j2Var, String str, Context context) {
        C7374e0.m18989a("Click on native content received");
        mo50101a((C7768z1) j2Var, str, context);
        C7741x8.m20827c((List<C7328b3>) this.f18562d.getStatHolder().mo49800a("click"), context);
    }

    /* renamed from: a */
    public void mo49701a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        this.f18567i = nativeAdMediaListener;
    }

    /* renamed from: a */
    public final void mo50100a(C7768z1 z1Var, Context context) {
        mo50101a(z1Var, (String) null, context);
    }

    /* renamed from: a */
    public final void mo50101a(C7768z1 z1Var, String str, Context context) {
        if (z1Var != null) {
            if (str != null) {
                this.f18563e.mo50244a(z1Var, str, context);
            } else {
                this.f18563e.mo50243a(z1Var, context);
            }
        }
        NativeAd.NativeAdListener listener = this.f18559a.getListener();
        if (listener != null) {
            listener.onClick(this.f18559a);
        }
    }

    /* renamed from: a */
    public void mo50102a(int[] iArr, Context context) {
        if (this.f18568j) {
            List<C7453i2> nativeAdCards = this.f18562d.getNativeAdCards();
            for (int i : iArr) {
                C7453i2 i2Var = null;
                if (i >= 0 && i < nativeAdCards.size()) {
                    i2Var = nativeAdCards.get(i);
                }
                if (i2Var != null && !this.f18560b.contains(i2Var)) {
                    C7741x8.m20827c((List<C7328b3>) i2Var.getStatHolder().mo49800a("playbackStarted"), context);
                    C7741x8.m20827c((List<C7328b3>) i2Var.getStatHolder().mo49800a("show"), context);
                    this.f18560b.add(i2Var);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo50103b() {
        C7374e0.m18989a("Video error");
        this.f18564f.mo50933a();
    }

    /* renamed from: b */
    public void mo50104b(View view) {
        C7599p3 p3Var = this.f18566h;
        if (p3Var != null) {
            p3Var.mo51329c();
        }
        if (!this.f18568j) {
            this.f18568j = true;
            C7741x8.m20827c((List<C7328b3>) this.f18562d.getStatHolder().mo49800a("playbackStarted"), view.getContext());
            int[] b = this.f18564f.mo50947b();
            if (b != null) {
                mo50102a(b, view.getContext());
            }
            NativeAd.NativeAdListener listener = this.f18559a.getListener();
            C7374e0.m18989a("Ad shown, banner Id = " + this.f18562d.getId());
            if (listener != null) {
                listener.onShow(this.f18559a);
            }
        }
    }

    /* renamed from: c */
    public String mo50105c() {
        return "myTarget";
    }

    /* renamed from: d */
    public float mo50106d() {
        return 0.0f;
    }

    /* renamed from: e */
    public void mo50107e() {
        NativeAd.NativeAdListener listener = this.f18559a.getListener();
        if (listener != null) {
            listener.onVideoPause(this.f18559a);
        }
    }

    /* renamed from: f */
    public void mo50108f() {
        NativeAd.NativeAdListener listener = this.f18559a.getListener();
        if (listener != null) {
            listener.onVideoPlay(this.f18559a);
        }
    }

    /* renamed from: g */
    public NativePromoBanner mo49704g() {
        return this.f18565g;
    }

    public void unregisterView() {
        this.f18564f.mo50957f();
        C7599p3 p3Var = this.f18566h;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
    }
}
