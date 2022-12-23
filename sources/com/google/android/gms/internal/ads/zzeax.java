package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzeax extends zzeba {
    private final int zzhtj;
    private final int zzhtk;

    zzeax(byte[] bArr, int i, int i2) {
        super(bArr);
        zzi(i, i + i2, bArr.length);
        this.zzhtj = i;
        this.zzhtk = i2;
    }

    public final byte zzfo(int i) {
        zzaa(i, size());
        return this.zzhtm[this.zzhtj + i];
    }

    /* access modifiers changed from: package-private */
    public final byte zzfp(int i) {
        return this.zzhtm[this.zzhtj + i];
    }

    public final int size() {
        return this.zzhtk;
    }

    /* access modifiers changed from: protected */
    public final int zzbcv() {
        return this.zzhtj;
    }

    /* access modifiers changed from: protected */
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzhtm, zzbcv() + i, bArr, i2, i3);
    }
}
