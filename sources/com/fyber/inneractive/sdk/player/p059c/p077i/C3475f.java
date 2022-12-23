package com.fyber.inneractive.sdk.player.p059c.p077i;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.i.f */
public final class C3475f {

    /* renamed from: a */
    public final int f9404a;

    /* renamed from: b */
    public final C3473e[] f9405b;

    /* renamed from: c */
    private int f9406c;

    public C3475f(C3473e... eVarArr) {
        this.f9405b = eVarArr;
        this.f9404a = eVarArr.length;
    }

    /* renamed from: a */
    public final C3473e[] mo19305a() {
        return (C3473e[]) this.f9405b.clone();
    }

    public final int hashCode() {
        if (this.f9406c == 0) {
            this.f9406c = Arrays.hashCode(this.f9405b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f9406c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9405b, ((C3475f) obj).f9405b);
    }
}
