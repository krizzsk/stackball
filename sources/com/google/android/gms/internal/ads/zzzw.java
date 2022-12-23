package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzzw implements zzaby {
    private final /* synthetic */ zzzv zzcis;

    zzzw(zzzv zzzv) {
        this.zzcis = zzzv;
    }

    public final Boolean zze(String str, boolean z) {
        return Boolean.valueOf(this.zzcis.zzcip.getBoolean(str, z));
    }

    public final Long getLong(String str, long j) {
        try {
            return Long.valueOf(this.zzcis.zzcip.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.zzcis.zzcip.getInt(str, (int) j));
        }
    }

    public final Double zza(String str, double d) {
        return Double.valueOf((double) this.zzcis.zzcip.getFloat(str, (float) d));
    }

    public final String get(String str, String str2) {
        return this.zzcis.zzcip.getString(str, str2);
    }
}
