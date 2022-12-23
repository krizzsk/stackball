package com.google.android.gms.internal.ads;

import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
public enum zzcc implements zzecf {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4);
    
    private static final zzeci<zzcc> zzeh = null;
    private final int value;

    public final int zzw() {
        return this.value;
    }

    public static zzcc zzj(int i) {
        if (i == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i == 1) {
            return BITSLICER;
        }
        if (i == 2) {
            return TINK_HYBRID;
        }
        if (i == 3) {
            return UNENCRYPTED;
        }
        if (i != 4) {
            return null;
        }
        return DG;
    }

    public static zzech zzx() {
        return zzce.zzej;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    private zzcc(int i) {
        this.value = i;
    }

    static {
        zzeh = new zzcb();
    }
}
