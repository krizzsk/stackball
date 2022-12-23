package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public class zziu {
    private int flags;

    public void clear() {
        this.flags = 0;
    }

    public final boolean zzgg() {
        return zzz(Integer.MIN_VALUE);
    }

    public final boolean zzgh() {
        return zzz(4);
    }

    public final boolean zzgi() {
        return zzz(1);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final void zzy(int i) {
        this.flags |= Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public final boolean zzz(int i) {
        return (this.flags & i) == i;
    }
}
