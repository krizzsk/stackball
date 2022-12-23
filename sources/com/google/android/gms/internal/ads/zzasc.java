package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzasc implements zzarn {
    private zzakh<JSONObject, JSONObject> zzdqu;
    private zzakh<JSONObject, JSONObject> zzdqz;

    public zzasc(Context context) {
        this.zzdqz = zzq.zzlj().zza(context, zzazz.zzyi()).zza("google.afma.request.getAdDictionary", zzakk.zzddu, zzakk.zzddu);
        this.zzdqu = zzq.zzlj().zza(context, zzazz.zzyi()).zza("google.afma.sdkConstants.getSdkConstants", zzakk.zzddu, zzakk.zzddu);
    }

    public final zzakh<JSONObject, JSONObject> zzuu() {
        return this.zzdqu;
    }
}
