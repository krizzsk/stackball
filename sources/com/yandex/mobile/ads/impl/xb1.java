package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

final class xb1 implements yb1 {

    /* renamed from: b */
    private final C14683ti[] f42488b;

    /* renamed from: c */
    private final long[] f42489c;

    public xb1(C14683ti[] tiVarArr, long[] jArr) {
        this.f42488b = tiVarArr;
        this.f42489c = jArr;
    }

    /* renamed from: a */
    public int mo66067a(long j) {
        int a = ih1.m37368a(this.f42489c, j, false, false);
        if (a < this.f42489c.length) {
            return a;
        }
        return -1;
    }

    /* renamed from: b */
    public List<C14683ti> mo66069b(long j) {
        int b = ih1.m37388b(this.f42489c, j, true, false);
        if (b != -1) {
            C14683ti[] tiVarArr = this.f42488b;
            if (tiVarArr[b] != C14683ti.f40336f) {
                return Collections.singletonList(tiVarArr[b]);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public int mo66066a() {
        return this.f42489c.length;
    }

    /* renamed from: a */
    public long mo66068a(int i) {
        boolean z = true;
        C13479j9.m37705a(i >= 0);
        if (i >= this.f42489c.length) {
            z = false;
        }
        C13479j9.m37705a(z);
        return this.f42489c[i];
    }
}
