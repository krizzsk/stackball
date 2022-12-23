package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzavx implements zzavz {
    public final zzdri<String> zza(String str, PackageInfo packageInfo) {
        return zzdqw.zzag(str);
    }

    public final zzdri<AdvertisingIdClient.Info> zzak(Context context) {
        zzbaj zzbaj = new zzbaj();
        zzvj.zzpr();
        if (zzazm.zzbm(context)) {
            zzbab.zzdzr.execute(new zzawa(this, context, zzbaj));
        }
        return zzbaj;
    }

    public final zzdri<String> zza(Context context, int i) {
        return zzdqw.zzag(null);
    }
}
