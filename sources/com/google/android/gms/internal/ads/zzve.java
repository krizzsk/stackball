package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzve extends zzvg<zzadd> {
    private final /* synthetic */ zzuu zzcfq;
    private final /* synthetic */ View zzcfs;
    private final /* synthetic */ HashMap zzcft;
    private final /* synthetic */ HashMap zzcfu;

    zzve(zzuu zzuu, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzcfq = zzuu;
        this.zzcfs = view;
        this.zzcft = hashMap;
        this.zzcfu = hashMap2;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zzpm() {
        zzuu.zza(this.zzcfs.getContext(), "native_ad_view_holder_delegate");
        return new zzyt();
    }

    public final /* synthetic */ Object zzpn() throws RemoteException {
        return this.zzcfq.zzcfm.zzb(this.zzcfs, this.zzcft, this.zzcfu);
    }

    public final /* synthetic */ Object zza(zzwi zzwi) throws RemoteException {
        return zzwi.zza(ObjectWrapper.wrap(this.zzcfs), ObjectWrapper.wrap(this.zzcft), ObjectWrapper.wrap(this.zzcfu));
    }
}
