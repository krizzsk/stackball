package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class AdColonyInterstitialActivity extends C0585b {

    /* renamed from: m */
    AdColonyInterstitial f155m;

    /* renamed from: n */
    private C0688h f156n;

    public AdColonyInterstitialActivity() {
        AdColonyInterstitial adColonyInterstitial;
        if (!C0578a.m145e()) {
            adColonyInterstitial = null;
        } else {
            adColonyInterstitial = C0578a.m143c().mo9607k();
        }
        this.f155m = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9361a(C0645d0 d0Var) {
        String p;
        super.mo9361a(d0Var);
        C0612d d = C0578a.m143c().mo9597d();
        C0897z0 f = C0894y.m1167f(d0Var.mo9532b(), "v4iap");
        C0895y0 a = C0894y.m1136a(f, "product_ids");
        AdColonyInterstitial adColonyInterstitial = this.f155m;
        if (!(adColonyInterstitial == null || adColonyInterstitial.getListener() == null || (p = a.mo10048p(0)) == null)) {
            this.f155m.getListener().onIAPEvent(this.f155m, p, C0894y.m1163d(f, "engagement_type"));
        }
        d.mo9496a(this.f202a);
        if (this.f155m != null) {
            d.mo9509f().remove(this.f155m.mo9324b());
            if (this.f155m.getListener() != null) {
                this.f155m.getListener().onClosed(this.f155m);
                this.f155m.mo9319a((C0589c) null);
                this.f155m.setListener((AdColonyInterstitialListener) null);
            }
            this.f155m.mo9348q();
            this.f155m = null;
        }
        C0688h hVar = this.f156n;
        if (hVar != null) {
            hVar.mo9563a();
            this.f156n = null;
        }
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        int i;
        AdColonyInterstitial adColonyInterstitial;
        AdColonyInterstitial adColonyInterstitial2 = this.f155m;
        if (adColonyInterstitial2 == null) {
            i = -1;
        } else {
            i = adColonyInterstitial2.mo9335g();
        }
        this.f204c = i;
        super.onCreate(bundle);
        if (C0578a.m145e() && (adColonyInterstitial = this.f155m) != null) {
            C0742k0 f = adColonyInterstitial.mo9334f();
            if (f != null) {
                f.mo9690a(this.f202a);
            }
            this.f156n = new C0688h(new Handler(Looper.getMainLooper()), this.f155m);
            if (this.f155m.getListener() != null) {
                this.f155m.getListener().onOpened(this.f155m);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
