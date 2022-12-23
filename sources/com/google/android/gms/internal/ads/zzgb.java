package com.google.android.gms.internal.ads;

import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
public enum zzgb implements zzecf {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6);
    
    private static final zzeci<zzgb> zzeh = null;
    private final int value;

    public final int zzw() {
        return this.value;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
    }

    private zzgb(int i) {
        this.value = i;
    }

    static {
        zzeh = new zzge();
    }
}
