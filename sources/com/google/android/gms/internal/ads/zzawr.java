package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzawr extends zzazw {
    public static void zzeg(String str) {
        if (zzwo()) {
            Log.v(AdRequest.LOGTAG, str);
        }
    }

    public static void zza(String str, Throwable th) {
        if (zzwo()) {
            Log.v(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean zzwo() {
        return isLoggable(2) && zzabn.zzcxb.get().booleanValue();
    }
}
