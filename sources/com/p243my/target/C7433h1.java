package com.p243my.target;

import android.content.Context;
import android.view.View;
import com.p243my.target.C7576o0;
import com.p243my.target.C7599p3;
import com.p243my.target.common.models.VideoData;
import com.p243my.target.nativeads.NativeBannerAd;
import com.p243my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.h1 */
public final class C7433h1 implements C7630r0 {

    /* renamed from: a */
    public final NativeBannerAd f18674a;

    /* renamed from: b */
    public final C7435h2 f18675b;

    /* renamed from: c */
    public final C7424g8 f18676c = C7424g8.m19196a();

    /* renamed from: d */
    public final C7576o0 f18677d;

    /* renamed from: e */
    public final NativeBanner f18678e;

    /* renamed from: f */
    public final C7599p3 f18679f;

    /* renamed from: g */
    public NativeBannerAd.NativeBannerAdMediaListener f18680g;

    /* renamed from: com.my.target.h1$a */
    public static class C7434a implements C7576o0.C7579c {

        /* renamed from: a */
        public final C7433h1 f18681a;

        /* renamed from: b */
        public final NativeBannerAd f18682b;

        public C7434a(C7433h1 h1Var, NativeBannerAd nativeBannerAd) {
            this.f18681a = h1Var;
            this.f18682b = nativeBannerAd;
        }

        /* renamed from: a */
        public void mo50273a(View view) {
            this.f18681a.mo50270b(view);
        }

        /* renamed from: b */
        public void mo50274b() {
            NativeBannerAd.NativeBannerAdMediaListener a = this.f18681a.f18680g;
            if (a != null) {
                a.onIconLoad(this.f18682b);
            }
        }

        public void onClick(View view) {
            this.f18681a.mo50268a(view);
        }
    }

    public C7433h1(NativeBannerAd nativeBannerAd, C7435h2 h2Var, Context context) {
        this.f18674a = nativeBannerAd;
        this.f18675b = h2Var;
        this.f18678e = NativeBanner.newBanner(h2Var);
        this.f18677d = C7576o0.m19970a(h2Var, (C7576o0.C7579c) new C7434a(this, nativeBannerAd));
        this.f18679f = C7599p3.m20069a(h2Var, 2, (C7413g2<VideoData>) null, context);
    }

    /* renamed from: a */
    public static C7433h1 m19232a(NativeBannerAd nativeBannerAd, C7435h2 h2Var, Context context) {
        return new C7433h1(nativeBannerAd, h2Var, context);
    }

    /* renamed from: a */
    public void mo50268a(View view) {
        C7374e0.m18989a("Click received by native banner ad");
        if (view != null) {
            mo50269a(this.f18675b, view);
        }
    }

    /* renamed from: a */
    public void mo49783a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.f18680g = nativeBannerAdMediaListener;
    }

    /* renamed from: a */
    public final void mo50269a(C7768z1 z1Var, View view) {
        Context context;
        if (!(z1Var == null || (context = view.getContext()) == null)) {
            this.f18676c.mo50243a(z1Var, context);
        }
        NativeBannerAd.NativeBannerAdListener listener = this.f18674a.getListener();
        if (listener != null) {
            listener.onClick(this.f18674a);
        }
    }

    /* renamed from: b */
    public void mo50270b(View view) {
        C7599p3 p3Var = this.f18679f;
        if (p3Var != null) {
            p3Var.mo51329c();
        }
        C7741x8.m20827c((List<C7328b3>) this.f18675b.getStatHolder().mo49800a("playbackStarted"), view.getContext());
        NativeBannerAd.NativeBannerAdListener listener = this.f18674a.getListener();
        C7374e0.m18989a("Ad shown, banner Id = " + this.f18675b.getId());
        if (listener != null) {
            listener.onShow(this.f18674a);
        }
    }

    /* renamed from: c */
    public String mo50271c() {
        return "myTarget";
    }

    /* renamed from: d */
    public float mo50272d() {
        return 0.0f;
    }

    /* renamed from: h */
    public NativeBanner mo49786h() {
        return this.f18678e;
    }

    public void registerView(View view, List<View> list, int i) {
        unregisterView();
        C7599p3 p3Var = this.f18679f;
        if (p3Var != null) {
            p3Var.mo51324a(view, new C7599p3.C7602c[0]);
        }
        this.f18677d.mo51264a(view, list, i);
    }

    public void unregisterView() {
        this.f18677d.mo51270c();
        C7599p3 p3Var = this.f18679f;
        if (p3Var != null) {
            p3Var.mo51319a();
        }
    }
}
