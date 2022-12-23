package com.yandex.mobile.ads.exo.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.exo.trackselection.e */
public final class C12333e {

    /* renamed from: a */
    public final int f30307a;

    /* renamed from: b */
    private final C12330d[] f30308b;

    /* renamed from: c */
    private int f30309c;

    public C12333e(C12330d... dVarArr) {
        this.f30308b = dVarArr;
        this.f30307a = dVarArr.length;
    }

    /* renamed from: a */
    public C12330d mo65401a(int i) {
        return this.f30308b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12333e.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f30308b, ((C12333e) obj).f30308b);
    }

    public int hashCode() {
        if (this.f30309c == 0) {
            this.f30309c = Arrays.hashCode(this.f30308b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f30309c;
    }

    /* renamed from: a */
    public C12330d[] mo65402a() {
        return (C12330d[]) this.f30308b.clone();
    }
}
