package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p267ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

public class wz0 {

    /* renamed from: a */
    private final C15146x4 f42341a;

    /* renamed from: b */
    private final C13472j3 f42342b;

    /* renamed from: c */
    private final C14742u5 f42343c = new C14742u5();

    public wz0(C15146x4 x4Var, C13472j3 j3Var) {
        this.f42341a = x4Var;
        this.f42342b = j3Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70776a(Exception exc) {
        InstreamAdPlayerError instreamAdPlayerError;
        e01 b = this.f42341a.mo70826b();
        if (b != null) {
            VideoAd b2 = b.mo66726b();
            if (!qf0.NONE.equals(this.f42341a.mo70822a(b2))) {
                if (exc != null) {
                    instreamAdPlayerError = this.f42343c.mo70291c(exc);
                } else {
                    instreamAdPlayerError = new InstreamAdPlayerError(InstreamAdPlayerError.Reason.UNKNOWN, new C15054wk());
                }
                this.f42342b.onError(b2, instreamAdPlayerError);
            }
        }
    }
}
