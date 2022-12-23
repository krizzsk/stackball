package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzabd;
import com.google.android.gms.internal.ads.zzawr;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzdab;
import com.google.android.gms.internal.ads.zzuj;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzo {
    private final String zzbmw;
    private final Map<String, String> zzbmx = new TreeMap();
    private String zzbmy;
    private String zzbmz;
    private final Context zzvf;

    public zzo(Context context, String str) {
        this.zzvf = context.getApplicationContext();
        this.zzbmw = str;
    }

    public final String zzkn() {
        return this.zzbmz;
    }

    public final String getQuery() {
        return this.zzbmy;
    }

    public final String zzko() {
        return this.zzbmw;
    }

    public final Map<String, String> zzkp() {
        return this.zzbmx;
    }

    public final void zza(zzuj zzuj, zzazz zzazz) {
        this.zzbmy = zzuj.zzcel.zzbmy;
        Bundle bundle = zzuj.zzcen != null ? zzuj.zzcen.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = zzabd.zzcvq.get();
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.zzbmz = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.zzbmx.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.zzbmx.put("SDKVersion", zzazz.zzbnd);
            if (zzabd.zzcvo.get().booleanValue()) {
                try {
                    Bundle zza = zzdab.zza(this.zzvf, new JSONArray(zzabd.zzcvp.get()));
                    for (String str3 : zza.keySet()) {
                        this.zzbmx.put(str3, zza.get(str3).toString());
                    }
                } catch (JSONException e) {
                    zzawr.zzc("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
                }
            }
        }
    }
}
