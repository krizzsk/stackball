package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.Assertions;
import com.yandex.mobile.ads.impl.C13374i3;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.k3 */
public class C13678k3 {

    /* renamed from: a */
    private final C15146x4 f35941a;

    /* renamed from: b */
    private final C14735u2 f35942b;

    /* renamed from: c */
    private final C13472j3 f35943c;

    /* renamed from: d */
    private final a01 f35944d;

    /* renamed from: e */
    private final vz0 f35945e;

    /* renamed from: f */
    private final C13374i3 f35946f;

    /* renamed from: g */
    private final hg0 f35947g = hg0.m36966a();

    public C13678k3(C15029w4 w4Var, zz0 zz0, C13472j3 j3Var) {
        this.f35941a = w4Var.mo70633b();
        this.f35942b = w4Var.mo70632a();
        this.f35944d = zz0.mo71287d();
        this.f35945e = zz0.mo71285b();
        this.f35943c = j3Var;
        this.f35946f = new C13374i3(w4Var, zz0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38151a(VideoAd videoAd) {
        this.f35943c.onAdSkipped(videoAd);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m38153b(VideoAd videoAd) {
        this.f35943c.onAdStopped(videoAd);
    }

    /* renamed from: c */
    public void mo68117c(VideoAd videoAd) {
        if (qf0.PLAYING.equals(this.f35941a.mo70822a(videoAd))) {
            this.f35941a.mo70825a(videoAd, qf0.PAUSED);
            e01 b = this.f35941a.mo70826b();
            Assertions.checkState(videoAd.equals(b != null ? b.mo66726b() : null));
            this.f35944d.mo65632a(false);
            this.f35945e.mo70602a();
            this.f35943c.onAdPaused(videoAd);
        }
    }

    /* renamed from: d */
    public void mo68118d(VideoAd videoAd) {
        qf0 a = this.f35941a.mo70822a(videoAd);
        if (qf0.NONE.equals(a) || qf0.PREPARED.equals(a)) {
            this.f35941a.mo70825a(videoAd, qf0.PLAYING);
            this.f35941a.mo70824a(new e01((C14436r2) Assertions.checkNotNull(this.f35942b.mo70276a(videoAd)), videoAd));
            this.f35943c.onAdStarted(videoAd);
        } else if (qf0.PAUSED.equals(a)) {
            e01 b = this.f35941a.mo70826b();
            Assertions.checkState(videoAd.equals(b != null ? b.mo66726b() : null));
            this.f35941a.mo70825a(videoAd, qf0.PLAYING);
            this.f35943c.onAdResumed(videoAd);
        }
    }

    /* renamed from: e */
    public void mo68119e(VideoAd videoAd) {
        if (qf0.PAUSED.equals(this.f35941a.mo70822a(videoAd))) {
            this.f35941a.mo70825a(videoAd, qf0.PLAYING);
            e01 b = this.f35941a.mo70826b();
            Assertions.checkState(videoAd.equals(b != null ? b.mo66726b() : null));
            this.f35944d.mo65632a(true);
            this.f35945e.mo70603b();
            this.f35943c.onAdResumed(videoAd);
        }
    }

    /* renamed from: f */
    public void mo68120f(VideoAd videoAd) {
        m38152a(videoAd, this.f35947g.mo67553d() ? C13374i3.C13376b.AD_GROUP : C13374i3.C13376b.SINGLE_AD, new C13374i3.C13375a(videoAd) {
            public final /* synthetic */ VideoAd f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo65543a() {
                C13678k3.this.m38151a(this.f$1);
            }
        });
    }

    /* renamed from: g */
    public void mo68121g(VideoAd videoAd) {
        m38152a(videoAd, C13374i3.C13376b.SINGLE_AD, new C13374i3.C13375a(videoAd) {
            public final /* synthetic */ VideoAd f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo65543a() {
                C13678k3.this.m38153b(this.f$1);
            }
        });
    }

    /* renamed from: a */
    private void m38152a(VideoAd videoAd, C13374i3.C13376b bVar, C13374i3.C13375a aVar) {
        qf0 a = this.f35941a.mo70822a(videoAd);
        qf0 qf0 = qf0.NONE;
        if (qf0.equals(a)) {
            C14436r2 a2 = this.f35942b.mo70276a(videoAd);
            if (a2 != null) {
                this.f35946f.mo67711a(a2, bVar, aVar);
                return;
            }
            return;
        }
        this.f35941a.mo70825a(videoAd, qf0);
        e01 b = this.f35941a.mo70826b();
        if (b != null) {
            this.f35946f.mo67711a(b.mo66725a(), bVar, aVar);
        }
    }
}
