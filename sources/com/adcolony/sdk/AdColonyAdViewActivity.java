package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;

public class AdColonyAdViewActivity extends C0585b {

    /* renamed from: m */
    AdColonyAdView f114m;

    public AdColonyAdViewActivity() {
        AdColonyAdView adColonyAdView;
        if (!C0578a.m145e()) {
            adColonyAdView = null;
        } else {
            adColonyAdView = C0578a.m143c().mo9608l();
        }
        this.f114m = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9247b() {
        ViewParent parent = this.f202a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f202a);
        }
        this.f114m.mo9219a();
        C0578a.m143c().mo9585a((AdColonyAdView) null);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9248c() {
        this.f114m.mo9220b();
    }

    public void onBackPressed() {
        mo9247b();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        AdColonyAdView adColonyAdView;
        if (!C0578a.m145e() || (adColonyAdView = this.f114m) == null) {
            C0578a.m143c().mo9585a((AdColonyAdView) null);
            finish();
            return;
        }
        this.f204c = adColonyAdView.getOrientation();
        super.onCreate(bundle);
        this.f114m.mo9220b();
        AdColonyAdViewListener listener = this.f114m.getListener();
        if (listener != null) {
            listener.onOpened(this.f114m);
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
