package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.adcolony.sdk.h */
class C0688h extends ContentObserver {

    /* renamed from: a */
    private AudioManager f981a;

    /* renamed from: b */
    private AdColonyInterstitial f982b;

    C0688h(Handler handler, AdColonyInterstitial adColonyInterstitial) {
        super(handler);
        Context b = C0578a.m141b();
        if (b != null) {
            this.f981a = (AudioManager) b.getSystemService("audio");
            this.f982b = adColonyInterstitial;
            b.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9563a() {
        Context b = C0578a.m141b();
        if (b != null) {
            b.getApplicationContext().getContentResolver().unregisterContentObserver(this);
        }
        this.f982b = null;
        this.f981a = null;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        AdColonyInterstitial adColonyInterstitial;
        if (this.f981a != null && (adColonyInterstitial = this.f982b) != null && adColonyInterstitial.mo9330d() != null) {
            double streamVolume = (double) ((((float) this.f981a.getStreamVolume(3)) / 15.0f) * 100.0f);
            C0897z0 b = C0894y.m1151b();
            C0894y.m1145a(b, "audio_percentage", streamVolume);
            C0894y.m1148a(b, "ad_session_id", this.f982b.mo9330d().mo9441a());
            C0894y.m1156b(b, "id", this.f982b.mo9330d().mo9450c());
            new C0645d0("AdContainer.on_audio_change", this.f982b.mo9330d().mo9469k(), b).mo9536d();
        }
    }
}
