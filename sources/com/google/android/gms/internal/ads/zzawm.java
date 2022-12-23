package com.google.android.gms.internal.ads;

import com.facebook.appevents.AppEventsConstants;
import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzawm {
    private String zzdma = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    private BigInteger zzduz = BigInteger.ONE;

    public final synchronized String zzwl() {
        String bigInteger;
        bigInteger = this.zzduz.toString();
        this.zzduz = this.zzduz.add(BigInteger.ONE);
        this.zzdma = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzwm() {
        return this.zzdma;
    }
}
