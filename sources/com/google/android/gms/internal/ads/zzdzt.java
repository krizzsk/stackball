package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdzt {
    private static final ThreadLocal<SecureRandom> zzhsg = new zzdzw();

    /* access modifiers changed from: private */
    public static SecureRandom zzbca() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] zzfi(int i) {
        byte[] bArr = new byte[i];
        zzhsg.get().nextBytes(bArr);
        return bArr;
    }
}
