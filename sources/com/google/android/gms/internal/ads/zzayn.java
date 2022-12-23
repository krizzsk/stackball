package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzayn extends zzax {
    private final /* synthetic */ byte[] zzdxu;
    private final /* synthetic */ Map zzdxv;
    private final /* synthetic */ zzazq zzdxw;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzayn(zzaym zzaym, int i, String str, zzab zzab, zzy zzy, byte[] bArr, Map map, zzazq zzazq) {
        super(i, str, zzab, zzy);
        this.zzdxu = bArr;
        this.zzdxv = map;
        this.zzdxw = zzazq;
    }

    public final byte[] zzg() throws zzb {
        byte[] bArr = this.zzdxu;
        return bArr == null ? super.zzg() : bArr;
    }

    public final Map<String, String> getHeaders() throws zzb {
        Map<String, String> map = this.zzdxv;
        return map == null ? super.getHeaders() : map;
    }

    /* access modifiers changed from: protected */
    public final void zzh(String str) {
        this.zzdxw.zzex(str);
        super.zza(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void zza(Object obj) {
        zza((String) obj);
    }
}
