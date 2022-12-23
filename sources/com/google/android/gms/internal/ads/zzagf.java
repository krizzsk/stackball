package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.util.CollectionUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzagf implements zzaga<zzbek> {
    private static final Map<String, Integer> zzdav = CollectionUtils.mapOfKeyValueArrays(new String[]{MraidJsMethods.RESIZE, MraidJsMethods.PLAY_VIDEO, "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", MraidJsMethods.UNLOAD}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final zzc zzdas;
    private final zzaor zzdat;
    private final zzapa zzdau;

    public zzagf(zzc zzc, zzaor zzaor, zzapa zzapa) {
        this.zzdas = zzc;
        this.zzdat = zzaor;
        this.zzdau = zzapa;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzc zzc;
        zzbek zzbek = (zzbek) obj;
        int intValue = zzdav.get((String) map.get(CampaignUnit.JSON_KEY_SESSION_ID)).intValue();
        if (intValue != 5 && intValue != 7 && (zzc = this.zzdas) != null && !zzc.zzjx()) {
            this.zzdas.zzbm((String) null);
        } else if (intValue == 1) {
            this.zzdat.zzg(map);
        } else if (intValue == 3) {
            new zzaos(zzbek, map).execute();
        } else if (intValue == 4) {
            new zzaom(zzbek, map).execute();
        } else if (intValue == 5) {
            new zzaot(zzbek, map).execute();
        } else if (intValue == 6) {
            this.zzdat.zzac(true);
        } else if (intValue != 7) {
            zzawr.zzfb("Unknown MRAID command called.");
        } else {
            this.zzdau.zzue();
        }
    }
}
