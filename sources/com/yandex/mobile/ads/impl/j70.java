package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k70;
import com.yandex.mobile.ads.impl.s71;

public final class j70 implements s71 {

    /* renamed from: a */
    private final k70 f35138a;

    /* renamed from: b */
    private final long f35139b;

    public j70(k70 k70, long j) {
        this.f35138a = k70;
        this.f35139b = j;
    }

    /* renamed from: a */
    private u71 m37688a(long j, long j2) {
        return new u71((j * 1000000) / ((long) this.f35138a.f36003e), this.f35139b + j2);
    }

    /* renamed from: a */
    public boolean mo64897a() {
        return true;
    }

    /* renamed from: b */
    public s71.C14566a mo64898b(long j) {
        long j2;
        this.f35138a.f36009k.getClass();
        k70 k70 = this.f35138a;
        k70.C13688a aVar = k70.f36009k;
        long[] jArr = aVar.f36011a;
        long[] jArr2 = aVar.f36012b;
        int b = ih1.m37388b(jArr, k70.mo68148a(j), true, false);
        long j3 = 0;
        if (b == -1) {
            j2 = 0;
        } else {
            j2 = jArr[b];
        }
        if (b != -1) {
            j3 = jArr2[b];
        }
        u71 a = m37688a(j2, j3);
        if (a.f40582a == j || b == jArr.length - 1) {
            return new s71.C14566a(a, a);
        }
        int i = b + 1;
        return new s71.C14566a(a, m37688a(jArr[i], jArr2[i]));
    }

    /* renamed from: c */
    public long mo64899c() {
        return this.f35138a.mo68153b();
    }
}
