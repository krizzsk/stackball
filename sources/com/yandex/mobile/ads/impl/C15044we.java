package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s71;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.we */
public final class C15044we implements s71 {

    /* renamed from: a */
    public final int f41967a;

    /* renamed from: b */
    public final int[] f41968b;

    /* renamed from: c */
    public final long[] f41969c;

    /* renamed from: d */
    public final long[] f41970d;

    /* renamed from: e */
    public final long[] f41971e;

    /* renamed from: f */
    private final long f41972f;

    public C15044we(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f41968b = iArr;
        this.f41969c = jArr;
        this.f41970d = jArr2;
        this.f41971e = jArr3;
        int length = iArr.length;
        this.f41967a = length;
        if (length > 0) {
            int i = length - 1;
            this.f41972f = jArr2[i] + jArr3[i];
            return;
        }
        this.f41972f = 0;
    }

    /* renamed from: a */
    public boolean mo64897a() {
        return true;
    }

    /* renamed from: b */
    public s71.C14566a mo64898b(long j) {
        int b = ih1.m37388b(this.f41971e, j, true, true);
        long[] jArr = this.f41971e;
        long j2 = jArr[b];
        long[] jArr2 = this.f41969c;
        u71 u71 = new u71(j2, jArr2[b]);
        if (j2 >= j || b == this.f41967a - 1) {
            return new s71.C14566a(u71, u71);
        }
        int i = b + 1;
        return new s71.C14566a(u71, new u71(jArr[i], jArr2[i]));
    }

    /* renamed from: c */
    public long mo64899c() {
        return this.f41972f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f41967a + ", sizes=" + Arrays.toString(this.f41968b) + ", offsets=" + Arrays.toString(this.f41969c) + ", timeUs=" + Arrays.toString(this.f41971e) + ", durationsUs=" + Arrays.toString(this.f41970d) + ")";
    }
}
