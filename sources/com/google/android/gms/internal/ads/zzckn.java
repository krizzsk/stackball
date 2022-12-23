package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzckn {
    private final Executor executor;
    private final zzdhe zzfll;
    private final zzazz zzgbn;
    private final Context zzvf;

    public zzckn(Context context, zzazz zzazz, zzdhe zzdhe, Executor executor2) {
        this.zzvf = context;
        this.zzgbn = zzazz;
        this.zzfll = zzdhe;
        this.executor = executor2;
    }

    public final zzdri<zzdha> zzaos() {
        zzakh<I, O> zza = zzq.zzlj().zzb(this.zzvf, this.zzgbn).zza("google.afma.response.normalize", zzakk.zzddu, zzakk.zzddu);
        return zzdqw.zzb(zzdqw.zzb(zzdqw.zzb(zzdqw.zzag(""), new zzckm(this, this.zzfll.zzguw.zzceu), this.executor), new zzckp(zza), this.executor), new zzcko(this), this.executor);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzo(JSONObject jSONObject) throws Exception {
        return zzdqw.zzag(new zzdha(new zzdgv(this.zzfll), zzdgy.zza(new StringReader(jSONObject.toString()))));
    }
}
