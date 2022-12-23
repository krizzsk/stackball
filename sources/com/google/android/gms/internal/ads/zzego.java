package com.google.android.gms.internal.ads;

import android.util.Log;
import com.facebook.internal.security.CertificateUtil;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzego extends zzegr {
    private String name;

    public zzego(String str) {
        this.name = str;
    }

    public final void zzig(String str) {
        String str2 = this.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
