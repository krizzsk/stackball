package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.p */
public final class C7861p {

    /* renamed from: a */
    boolean f20129a = false;

    /* renamed from: b */
    boolean f20130b = true;

    /* renamed from: c */
    String f20131c;

    C7861p() {
    }

    /* renamed from: a */
    public void mo52473a(Context context) {
        if (!this.f20129a) {
            mo52475b(context);
            this.f20129a = true;
        }
    }

    /* renamed from: a */
    public void mo52474a(C7831m0 m0Var, Context context) {
        if (!TextUtils.isEmpty(this.f20131c)) {
            m0Var.mo52392a(this.f20131c, this.f20130b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52475b(Context context) {
        C7877u0.m21547a("get google AId");
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.f20131c = advertisingIdInfo.getId();
            C7877u0.m21547a("AId: " + this.f20131c);
            this.f20130b = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            C7877u0.m21547a("AId ad tracking enabled: " + this.f20130b);
        } catch (Throwable th) {
            C7877u0.m21552b("failed to get google AId", th);
        }
    }

    /* renamed from: c */
    public void mo52476c(Context context) {
    }
}
