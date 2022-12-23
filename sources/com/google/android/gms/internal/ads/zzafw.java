package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzafw implements zzaga<zzbek> {
    zzafw() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbek zzbek = (zzbek) obj;
        String str = (String) map.get("action");
        if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equals(str)) {
            zzbek.zzkc();
        } else if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equals(str)) {
            zzbek.zzkd();
        }
    }
}
