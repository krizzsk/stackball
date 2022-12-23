package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.p243my.tracker.ads.AdFormat;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcyr implements zzdah<Bundle> {
    private final String zzgnk;

    /* access modifiers changed from: private */
    public static boolean zze(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains(AdFormat.BANNER);
    }

    public zzcyr(String str) {
        this.zzgnk = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        zzdhj.zza((Bundle) obj, "omid_v", this.zzgnk);
    }
}
