package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzcvb implements zzdqj {
    private final zzarj zzfnq;

    zzcvb(zzarj zzarj) {
        this.zzfnq = zzarj;
    }

    public final zzdri zzf(Object obj) {
        return zzdqw.zzag(new zzcvd(new JsonReader(new InputStreamReader((InputStream) obj))).zzo(this.zzfnq.zzdpe));
    }
}
