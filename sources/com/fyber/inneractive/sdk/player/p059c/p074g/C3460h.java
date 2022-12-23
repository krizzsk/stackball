package com.fyber.inneractive.sdk.player.p059c.p074g;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.g.h */
public final class C3460h {

    /* renamed from: a */
    public final int f9359a = 1;

    /* renamed from: b */
    public final C3290h[] f9360b;

    /* renamed from: c */
    private int f9361c;

    public C3460h(C3290h... hVarArr) {
        C3535a.m8784b(true);
        this.f9360b = hVarArr;
    }

    /* renamed from: a */
    public final int mo19283a(C3290h hVar) {
        int i = 0;
        while (true) {
            C3290h[] hVarArr = this.f9360b;
            if (i >= hVarArr.length) {
                return -1;
            }
            if (hVar == hVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.f9361c == 0) {
            this.f9361c = Arrays.hashCode(this.f9360b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f9361c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3460h hVar = (C3460h) obj;
            return this.f9359a == hVar.f9359a && Arrays.equals(this.f9360b, hVar.f9360b);
        }
    }
}
