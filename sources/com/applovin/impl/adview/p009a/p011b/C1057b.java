package com.applovin.impl.adview.p009a.p011b;

import android.os.SystemClock;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.p009a.p010a.C1042b;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1345a;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.adview.a.b.b */
public class C1057b extends C1044a {

    /* renamed from: q */
    private final C1042b f1874q = new C1042b(this.f1831a, this.f1834d, this.f1832b);

    public C1057b(C1355g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, C1469j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(gVar, appLovinFullscreenActivity, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
    }

    /* renamed from: a */
    public void mo11858a() {
    }

    /* renamed from: b */
    public void mo11859b() {
    }

    /* renamed from: c */
    public void mo11827c() {
        this.f1874q.mo11812a(this.f1837g, this.f1836f);
        mo11823a(false);
        this.f1836f.renderAd(this.f1831a);
        mo11822a("javascript:al_onPoststitialShow();", (long) this.f1831a.mo12766Z());
        if (this.f1837g != null) {
            if (this.f1831a.mo12821r() >= 0) {
                mo11819a(this.f1837g, this.f1831a.mo12821r(), new Runnable() {
                    public void run() {
                        C1057b.this.f1839i = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f1837g.setVisibility(0);
            }
        }
        mo11842q();
        super.mo11826b(mo11843r());
    }

    /* renamed from: f */
    public void mo11831f() {
        mo11837l();
        super.mo11831f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo11837l() {
        super.mo11816a(100, false, true, -2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo11841p() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo11842q() {
        long j;
        long millis;
        long j2 = 0;
        if (this.f1831a.mo12799am() >= 0 || this.f1831a.mo12800an() >= 0) {
            int i = (this.f1831a.mo12799am() > 0 ? 1 : (this.f1831a.mo12799am() == 0 ? 0 : -1));
            C1355g gVar = this.f1831a;
            if (i >= 0) {
                j = gVar.mo12799am();
            } else {
                if (gVar.mo12801ao()) {
                    int j3 = (int) ((C1345a) this.f1831a).mo12700j();
                    if (j3 > 0) {
                        millis = TimeUnit.SECONDS.toMillis((long) j3);
                    } else {
                        int r = (int) this.f1831a.mo12821r();
                        if (r > 0) {
                            millis = TimeUnit.SECONDS.toMillis((long) r);
                        }
                    }
                    j2 = 0 + millis;
                }
                j = (long) (((double) j2) * (((double) this.f1831a.mo12800an()) / 100.0d));
            }
            mo11817a(j);
        }
    }
}
