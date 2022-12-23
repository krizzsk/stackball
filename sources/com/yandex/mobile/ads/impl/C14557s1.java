package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.impl.s1 */
public class C14557s1 {

    /* renamed from: a */
    private final C15146x4 f39792a;

    /* renamed from: b */
    private final C12952e3 f39793b;

    /* renamed from: c */
    private final C13472j3 f39794c;

    /* renamed from: d */
    private final C13189gc f39795d;

    /* renamed from: e */
    private final r40 f39796e;

    /* renamed from: f */
    private final c01 f39797f;

    /* renamed from: g */
    private final a01 f39798g;

    /* renamed from: h */
    private final C13167g3 f39799h = new C13167g3();

    public C14557s1(C13189gc gcVar, C15029w4 w4Var, zz0 zz0, C13472j3 j3Var) {
        this.f39795d = gcVar;
        this.f39792a = w4Var.mo70633b();
        this.f39793b = w4Var.mo70634c();
        this.f39796e = zz0.mo71286c();
        this.f39798g = zz0.mo71287d();
        this.f39797f = zz0.mo71288e();
        this.f39794c = j3Var;
    }

    /* renamed from: a */
    public void mo69849a(VideoAd videoAd, C14436r2 r2Var) {
        if (this.f39795d.mo67228b()) {
            if (qf0.NONE.equals(this.f39792a.mo70822a(videoAd))) {
                AdPlaybackState a = this.f39793b.mo66746a();
                if (!a.isAdInErrorState(r2Var.mo69678a(), r2Var.mo69679b())) {
                    this.f39792a.mo70825a(videoAd, qf0.SKIPPED);
                    this.f39793b.mo66747a(a.withSkippedAd(r2Var.mo69678a(), r2Var.mo69679b()));
                }
            } else if (this.f39796e.mo69690b()) {
                int a2 = r2Var.mo69678a();
                int b = r2Var.mo69679b();
                AdPlaybackState a3 = this.f39793b.mo66746a();
                boolean isAdInErrorState = a3.isAdInErrorState(a2, b);
                boolean a4 = this.f39799h.mo67177a(a3, a2, b);
                if (!isAdInErrorState && !a4) {
                    this.f39792a.mo70825a(videoAd, qf0.COMPLETED);
                    this.f39793b.mo66747a(a3.withPlayedAd(a2, b).withAdResumePositionUs(0));
                    if (!this.f39798g.mo65634c()) {
                        this.f39792a.mo70824a((e01) null);
                    }
                }
                this.f39797f.mo66179b();
                this.f39794c.onAdCompleted(videoAd);
            }
        }
    }
}
