package com.ogury.p244cm.internal;

import com.ogury.core.OguryError;

/* renamed from: com.ogury.cm.internal.acbcc */
public final class acbcc {

    /* renamed from: a */
    private final boolean f20552a;

    /* renamed from: b */
    private final OguryError f20553b;

    public acbcc(boolean z, OguryError oguryError) {
        bbabc.m22051b(oguryError, "error");
        this.f20552a = z;
        this.f20553b = oguryError;
    }

    public /* synthetic */ acbcc(boolean z, OguryError oguryError, int i, bbabb bbabb) {
        this(true, new OguryError(0, ""));
    }

    /* renamed from: a */
    public final boolean mo52749a() {
        return this.f20552a;
    }

    /* renamed from: b */
    public final OguryError mo52750b() {
        return this.f20553b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof acbcc) {
                acbcc acbcc = (acbcc) obj;
                if (!(this.f20552a == acbcc.f20552a) || !bbabc.m22050a((Object) this.f20553b, (Object) acbcc.f20553b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f20552a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        OguryError oguryError = this.f20553b;
        return i + (oguryError != null ? oguryError.hashCode() : 0);
    }

    public final String toString() {
        return "ResponseStatus(status=" + this.f20552a + ", error=" + this.f20553b + ")";
    }
}
