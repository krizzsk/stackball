package com.google.android.gms.internal.ads;

import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public enum zztp implements zzecf {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    
    private static final zzeci<zztp> zzeh = null;
    private final int value;

    public final int zzw() {
        return this.value;
    }

    public static zztp zzca(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static zzech zzx() {
        return zztq.zzej;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    private zztp(int i) {
        this.value = i;
    }

    static {
        zzeh = new zzto();
    }
}
