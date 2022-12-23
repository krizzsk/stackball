package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* renamed from: com.yandex.mobile.ads.impl.i3 */
public class C13374i3 {

    /* renamed from: a */
    private final C15146x4 f34729a;

    /* renamed from: b */
    private final C12952e3 f34730b;

    /* renamed from: c */
    private final a01 f34731c;

    /* renamed from: d */
    private final c01 f34732d;

    /* renamed from: com.yandex.mobile.ads.impl.i3$a */
    public interface C13375a {
        /* renamed from: a */
        void mo65543a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.i3$b */
    public enum C13376b {
        SINGLE_AD,
        AD_GROUP
    }

    public C13374i3(C15029w4 w4Var, zz0 zz0) {
        this.f34729a = w4Var.mo70633b();
        this.f34730b = w4Var.mo70634c();
        this.f34731c = zz0.mo71287d();
        this.f34732d = zz0.mo71288e();
    }

    /* renamed from: a */
    public void mo67711a(C14436r2 r2Var, C13376b bVar, C13375a aVar) {
        int a = r2Var.mo69678a();
        int b = r2Var.mo69679b();
        AdPlaybackState a2 = this.f34730b.mo66746a();
        if (!a2.isAdInErrorState(a, b)) {
            if (C13376b.AD_GROUP.equals(bVar)) {
                int i = a2.adGroups[a].count;
                while (b < i) {
                    a2 = a2.withSkippedAd(a, b).withAdResumePositionUs(0);
                    b++;
                }
            } else {
                a2 = a2.withSkippedAd(a, b).withAdResumePositionUs(0);
            }
            this.f34730b.mo66747a(a2);
            this.f34732d.mo66179b();
            aVar.mo65543a();
            if (!this.f34731c.mo65634c()) {
                this.f34729a.mo70824a((e01) null);
            }
        }
    }
}
