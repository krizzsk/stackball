package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbv;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzfi extends zzfz {
    public zzfi(zzeo zzeo, String str, String str2, zzbv.zza.C15642zza zza, int i, int i2) {
        super(zzeo, str, str2, zza, i, 24);
    }

    public final Void zzcz() throws Exception {
        if (this.zzvp.isInitialized()) {
            return super.call();
        }
        if (!this.zzvp.zzcl()) {
            return null;
        }
        zzda();
        return null;
    }

    /* access modifiers changed from: protected */
    public final void zzcx() throws IllegalAccessException, InvocationTargetException {
        if (this.zzvp.zzcl()) {
            zzda();
            return;
        }
        synchronized (this.zzaam) {
            this.zzaam.zzaa((String) this.zzaaw.invoke((Object) null, new Object[]{this.zzvp.getContext()}));
        }
    }

    private final void zzda() {
        AdvertisingIdClient zzct = this.zzvp.zzct();
        if (zzct != null) {
            try {
                AdvertisingIdClient.Info info = zzct.getInfo();
                String zzap = zzet.zzap(info.getId());
                if (zzap != null) {
                    synchronized (this.zzaam) {
                        this.zzaam.zzaa(zzap);
                        this.zzaam.zza(info.isLimitAdTrackingEnabled());
                        this.zzaam.zza(zzbv.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
