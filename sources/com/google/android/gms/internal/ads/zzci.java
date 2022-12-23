package com.google.android.gms.internal.ads;

import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
public enum zzci implements zzecf {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    
    private static final zzeci<zzci> zzeh = null;
    private final int value;

    public final int zzw() {
        return this.value;
    }

    public static zzci zzl(int i) {
        if (i == 0) {
            return UNKNOWN_PROTO;
        }
        if (i == 1) {
            return AFMA_SIGNALS;
        }
        if (i == 2) {
            return UNITY_SIGNALS;
        }
        if (i != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    public static zzech zzx() {
        return zzcj.zzej;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    private zzci(int i) {
        this.value = i;
    }

    static {
        zzeh = new zzch();
    }
}
