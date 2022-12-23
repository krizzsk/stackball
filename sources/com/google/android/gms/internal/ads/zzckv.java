package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzckv extends zzckt {
    public zzckv(Context context) {
        this.zzgbu = new zzaqr(context, zzq.zzlk().zzxx(), this, this);
    }

    public final zzdri<InputStream> zzh(zzarj zzarj) {
        synchronized (this.mLock) {
            if (this.zzgbr) {
                zzbaj zzbaj = this.zzdej;
                return zzbaj;
            }
            this.zzgbr = true;
            this.zzgbt = zzarj;
            this.zzgbu.checkAvailabilityAndConnect();
            this.zzdej.addListener(new zzcku(this), zzbab.zzdzw);
            zzbaj zzbaj2 = this.zzdej;
            return zzbaj2;
        }
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.mLock) {
            if (!this.zzgbs) {
                this.zzgbs = true;
                try {
                    this.zzgbu.zzus().zzb(this.zzgbt, new zzcks(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zzdej.setException(new zzclc(0));
                } catch (Throwable th) {
                    zzq.zzla().zza(th, "RemoteSignalsClientTask.onConnected");
                    this.zzdej.setException(new zzclc(0));
                }
            }
        }
    }
}
