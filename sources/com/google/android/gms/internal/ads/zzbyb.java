package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zztf;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbyb implements zzo, zzbsm {
    private final zzazz zzbmo;
    private final zzbek zzdce;
    private final zzdgo zzfkd;
    private IObjectWrapper zzfke;
    private final zztf.zza.C15657zza zzfpf;
    private final Context zzvf;

    public zzbyb(Context context, zzbek zzbek, zzdgo zzdgo, zzazz zzazz, zztf.zza.C15657zza zza) {
        this.zzvf = context;
        this.zzdce = zzbek;
        this.zzfkd = zzdgo;
        this.zzbmo = zzazz;
        this.zzfpf = zza;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void onAdLoaded() {
        if ((this.zzfpf == zztf.zza.C15657zza.REWARD_BASED_VIDEO_AD || this.zzfpf == zztf.zza.C15657zza.INTERSTITIAL) && this.zzfkd.zzdos && this.zzdce != null && zzq.zzll().zzo(this.zzvf)) {
            int i = this.zzbmo.zzdzn;
            int i2 = this.zzbmo.zzdzo;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            IObjectWrapper zza = zzq.zzll().zza(sb.toString(), this.zzdce.getWebView(), "", "javascript", this.zzfkd.zzgua.optInt(MessengerShareContentUtility.MEDIA_TYPE, -1) == 0 ? null : "javascript");
            this.zzfke = zza;
            if (zza != null && this.zzdce.getView() != null) {
                zzq.zzll().zza(this.zzfke, this.zzdce.getView());
                this.zzdce.zzap(this.zzfke);
                zzq.zzll().zzab(this.zzfke);
            }
        }
    }

    public final void zztz() {
        this.zzfke = null;
    }

    public final void zzua() {
        zzbek zzbek;
        if (this.zzfke != null && (zzbek = this.zzdce) != null) {
            zzbek.zza("onSdkImpression", new HashMap());
        }
    }
}
