package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public abstract class zzzk<T> {
    private final String zzcc;
    private final int zzcie;
    private final T zzcif;

    private zzzk(int i, String str, T t) {
        this.zzcie = i;
        this.zzcc = str;
        this.zzcif = t;
        zzvj.zzpu().zza(this);
    }

    /* access modifiers changed from: protected */
    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zza(Bundle bundle);

    public abstract void zza(SharedPreferences.Editor editor, T t);

    /* access modifiers changed from: protected */
    public abstract T zzb(JSONObject jSONObject);

    public final String getKey() {
        return this.zzcc;
    }

    public final T zzqz() {
        return this.zzcif;
    }

    public static zzzk<Boolean> zza(int i, String str, Boolean bool) {
        return new zzzn(1, str, bool);
    }

    public static zzzk<Integer> zza(int i, String str, int i2) {
        return new zzzm(1, str, Integer.valueOf(i2));
    }

    public static zzzk<Long> zzb(int i, String str, long j) {
        return new zzzp(1, str, Long.valueOf(j));
    }

    public static zzzk<Float> zza(int i, String str, float f) {
        return new zzzo(1, str, Float.valueOf(0.0f));
    }

    public static zzzk<String> zza(int i, String str, String str2) {
        return new zzzr(1, str, str2);
    }

    public static zzzk<String> zzb(int i, String str) {
        zzzk<String> zza = zza(1, str, (String) null);
        zzvj.zzpu().zzc(zza);
        return zza;
    }

    public final int getSource() {
        return this.zzcie;
    }

    /* synthetic */ zzzk(int i, String str, Object obj, zzzn zzzn) {
        this(i, str, obj);
    }
}
