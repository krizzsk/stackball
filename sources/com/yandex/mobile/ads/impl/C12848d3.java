package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.d3 */
public final class C12848d3 {

    /* renamed from: e */
    public static final C12848d3 f32352e = new C12848d3(new long[0]);

    /* renamed from: a */
    public final int f32353a;

    /* renamed from: b */
    public final long[] f32354b;

    /* renamed from: c */
    public final C12849a[] f32355c;

    /* renamed from: d */
    public final long f32356d;

    /* renamed from: com.yandex.mobile.ads.impl.d3$a */
    public static final class C12849a {

        /* renamed from: a */
        public final int f32357a;

        /* renamed from: b */
        public final Uri[] f32358b;

        /* renamed from: c */
        public final int[] f32359c;

        /* renamed from: d */
        public final long[] f32360d;

        public C12849a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        /* renamed from: a */
        public int mo66397a(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f32359c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12849a.class != obj.getClass()) {
                return false;
            }
            C12849a aVar = (C12849a) obj;
            if (this.f32357a != aVar.f32357a || !Arrays.equals(this.f32358b, aVar.f32358b) || !Arrays.equals(this.f32359c, aVar.f32359c) || !Arrays.equals(this.f32360d, aVar.f32360d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((this.f32357a * 31) + Arrays.hashCode(this.f32358b)) * 31) + Arrays.hashCode(this.f32359c)) * 31) + Arrays.hashCode(this.f32360d);
        }

        private C12849a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C13479j9.m37705a(iArr.length == uriArr.length);
            this.f32357a = i;
            this.f32359c = iArr;
            this.f32358b = uriArr;
            this.f32360d = jArr;
        }

        /* renamed from: a */
        public boolean mo66398a() {
            return this.f32357a == -1 || mo66397a(-1) < this.f32357a;
        }
    }

    public C12848d3(long... jArr) {
        int length = jArr.length;
        this.f32353a = length;
        this.f32354b = Arrays.copyOf(jArr, length);
        this.f32355c = new C12849a[length];
        for (int i = 0; i < length; i++) {
            this.f32355c[i] = new C12849a();
        }
        this.f32356d = -9223372036854775807L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12848d3.class != obj.getClass()) {
            return false;
        }
        C12848d3 d3Var = (C12848d3) obj;
        if (this.f32353a != d3Var.f32353a || this.f32356d != d3Var.f32356d || !Arrays.equals(this.f32354b, d3Var.f32354b) || !Arrays.equals(this.f32355c, d3Var.f32355c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.f32353a * 31) + ((int) 0)) * 31) + ((int) this.f32356d)) * 31) + Arrays.hashCode(this.f32354b)) * 31) + Arrays.hashCode(this.f32355c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adResumePositionUs=");
        sb.append(0);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f32355c.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f32354b[i]);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.f32355c[i].f32359c.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.f32355c[i].f32359c[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f32355c[i].f32360d[i2]);
                sb.append(')');
                if (i2 < this.f32355c[i].f32359c.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f32355c.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
