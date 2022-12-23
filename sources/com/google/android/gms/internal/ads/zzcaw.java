package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcaw implements View.OnClickListener {
    private final Clock zzbnt;
    private final zzcdt zzftu;
    private zzaer zzftv;
    private zzaga<Object> zzftw;
    String zzftx;
    Long zzfty;
    WeakReference<View> zzftz;

    public zzcaw(zzcdt zzcdt, Clock clock) {
        this.zzftu = zzcdt;
        this.zzbnt = clock;
    }

    public final void zza(zzaer zzaer) {
        this.zzftv = zzaer;
        zzaga<Object> zzaga = this.zzftw;
        if (zzaga != null) {
            this.zzftu.zzb("/unconfirmedClick", zzaga);
        }
        zzcaz zzcaz = new zzcaz(this, zzaer);
        this.zzftw = zzcaz;
        this.zzftu.zza("/unconfirmedClick", (zzaga<Object>) zzcaz);
    }

    public final zzaer zzamf() {
        return this.zzftv;
    }

    public final void cancelUnconfirmedClick() {
        if (this.zzftv != null && this.zzfty != null) {
            zzamg();
            try {
                this.zzftv.onUnconfirmedClickCancelled();
            } catch (RemoteException e) {
                zzazw.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.zzftz;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zzftx == null || this.zzfty == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zzftx);
                hashMap.put(SDKConstants.PARAM_A2U_TIME_INTERVAL, String.valueOf(this.zzbnt.currentTimeMillis() - this.zzfty.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzftu.zza("sendMessageToNativeJs", (Map<String, ?>) hashMap);
            }
            zzamg();
        }
    }

    private final void zzamg() {
        View view;
        this.zzftx = null;
        this.zzfty = null;
        WeakReference<View> weakReference = this.zzftz;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzftz = null;
        }
    }
}
