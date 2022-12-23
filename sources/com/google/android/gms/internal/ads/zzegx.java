package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzegx<T> implements zzegz<T> {
    private zzehm<T> zzijd;

    public final T get() {
        zzehm<T> zzehm = this.zzijd;
        if (zzehm != null) {
            return zzehm.get();
        }
        throw new IllegalStateException();
    }

    public static <T> void zzbe(zzehm<T> zzehm, zzehm<T> zzehm2) {
        zzehf.checkNotNull(zzehm2);
        zzegx zzegx = (zzegx) zzehm;
        if (zzegx.zzijd == null) {
            zzegx.zzijd = zzehm2;
            return;
        }
        throw new IllegalStateException();
    }
}
