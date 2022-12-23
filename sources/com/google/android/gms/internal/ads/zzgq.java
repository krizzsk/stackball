package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzgq extends Exception {
    private final int type;
    private final int zzadk;

    public static zzgq zza(Exception exc, int i) {
        return new zzgq(1, (String) null, exc, i);
    }

    public static zzgq zza(IOException iOException) {
        return new zzgq(0, (String) null, iOException, -1);
    }

    static zzgq zza(RuntimeException runtimeException) {
        return new zzgq(2, (String) null, runtimeException, -1);
    }

    private zzgq(int i, String str, Throwable th, int i2) {
        super((String) null, th);
        this.type = i;
        this.zzadk = i2;
    }
}
