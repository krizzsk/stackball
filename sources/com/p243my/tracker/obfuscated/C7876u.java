package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* renamed from: com.my.tracker.obfuscated.u */
public final class C7876u {

    /* renamed from: a */
    boolean f20169a = false;

    /* renamed from: b */
    String f20170b;

    /* renamed from: c */
    boolean f20171c = true;

    /* renamed from: a */
    public void mo52506a(Context context) {
        if (!this.f20169a) {
            this.f20169a = true;
            mo52508b(context);
        }
    }

    /* renamed from: a */
    public void mo52507a(C7831m0 m0Var, Context context) {
        if (!TextUtils.isEmpty(this.f20170b)) {
            m0Var.mo52403b(this.f20170b, this.f20171c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52508b(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            this.f20170b = advertisingIdInfo.getId();
            C7877u0.m21547a("HuaweiAIdDataProvider: oaid: " + this.f20170b);
            this.f20171c = advertisingIdInfo.isLimitAdTrackingEnabled() ^ true;
            C7877u0.m21547a("HuaweiAIdDataProvider: oaid tracking enabled: " + this.f20171c);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo52509c(Context context) {
    }
}
