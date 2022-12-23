package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzaoe implements SignalCallbacks {
    private final /* synthetic */ zzanw zzdhu;

    zzaoe(zzaoa zzaoa, zzanw zzanw) {
        this.zzdhu = zzanw;
    }

    public final void onSuccess(String str) {
        try {
            this.zzdhu.zzdq(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zzdhu.onFailure(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
