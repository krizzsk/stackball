package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzsy {
    zzgn zzbvf;
    boolean zzbvg;

    public final zztc zzf(byte[] bArr) {
        return new zztc(this, bArr);
    }

    public zzsy(Context context, String str, String str2) {
        zzzz.initialize(context);
        try {
            this.zzbvf = (zzgn) zzazv.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zztb.zzbvh);
            ObjectWrapper.wrap(context);
            this.zzbvf.zza(ObjectWrapper.wrap(context), str, (String) null);
            this.zzbvg = true;
        } catch (RemoteException | zzazx | NullPointerException unused) {
            zzazw.zzed("Cannot dynamite load clearcut");
        }
    }

    public zzsy(Context context) {
        zzzz.initialize(context);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqq)).booleanValue()) {
            try {
                this.zzbvf = (zzgn) zzazv.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzta.zzbvh);
                ObjectWrapper.wrap(context);
                this.zzbvf.zza(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzbvg = true;
            } catch (RemoteException | zzazx | NullPointerException unused) {
                zzazw.zzed("Cannot dynamite load clearcut");
            }
        }
    }

    public zzsy() {
    }
}
