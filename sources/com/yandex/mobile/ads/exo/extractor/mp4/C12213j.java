package com.yandex.mobile.ads.exo.extractor.mp4;

import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.ie1;
import com.yandex.mobile.ads.impl.ih1;

/* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.j */
final class C12213j {

    /* renamed from: a */
    public final ie1 f29723a;

    /* renamed from: b */
    public final int f29724b;

    /* renamed from: c */
    public final long[] f29725c;

    /* renamed from: d */
    public final int[] f29726d;

    /* renamed from: e */
    public final int f29727e;

    /* renamed from: f */
    public final long[] f29728f;

    /* renamed from: g */
    public final int[] f29729g;

    /* renamed from: h */
    public final long f29730h;

    public C12213j(ie1 ie1, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        C13479j9.m37705a(iArr.length == jArr2.length);
        C13479j9.m37705a(jArr.length == jArr2.length);
        C13479j9.m37705a(iArr2.length == jArr2.length ? true : z);
        this.f29723a = ie1;
        this.f29725c = jArr;
        this.f29726d = iArr;
        this.f29727e = i;
        this.f29728f = jArr2;
        this.f29729g = iArr2;
        this.f29730h = j;
        this.f29724b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int mo64901a(long j) {
        for (int b = ih1.m37388b(this.f29728f, j, true, false); b >= 0; b--) {
            if ((this.f29729g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo64902b(long j) {
        for (int a = ih1.m37368a(this.f29728f, j, true, false); a < this.f29728f.length; a++) {
            if ((this.f29729g[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
