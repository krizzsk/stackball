package com.google.android.gms.internal.ads;

import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
public enum zzbr implements zzecf {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    
    private static final zzeci<zzbr> zzeh = null;
    private final int value;

    public final int zzw() {
        return this.value;
    }

    public static zzbr zzg(int i) {
        if (i == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    public static zzech zzx() {
        return zzbs.zzej;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    private zzbr(int i) {
        this.value = i;
    }

    static {
        zzeh = new zzbt();
    }
}
