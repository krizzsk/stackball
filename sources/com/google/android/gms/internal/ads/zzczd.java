package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzczd implements zzdah<Bundle> {
    private String zzdmh;

    public zzczd(String str) {
        this.zzdmh = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        ((Bundle) obj).putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.zzdmh);
    }
}
