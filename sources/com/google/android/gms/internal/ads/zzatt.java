package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzatt implements RewardItem {
    private final zzate zzdri;

    public zzatt(zzate zzate) {
        this.zzdri = zzate;
    }

    public final String getType() {
        zzate zzate = this.zzdri;
        if (zzate == null) {
            return null;
        }
        try {
            return zzate.getType();
        } catch (RemoteException e) {
            zzazw.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    public final int getAmount() {
        zzate zzate = this.zzdri;
        if (zzate == null) {
            return 0;
        }
        try {
            return zzate.getAmount();
        } catch (RemoteException e) {
            zzazw.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
