package com.tapjoy.internal;

import java.util.Arrays;

/* renamed from: com.tapjoy.internal.ja */
final class C9443ja extends C9434iu {

    /* renamed from: f */
    final transient byte[][] f23473f;

    /* renamed from: g */
    final transient int[] f23474g;

    C9443ja(C9431ir irVar, int i) {
        super((byte[]) null);
        C9448je.m25404a(irVar.f23447b, 0, (long) i);
        C9440iy iyVar = irVar.f23446a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (iyVar.f23466c != iyVar.f23465b) {
                i3 += iyVar.f23466c - iyVar.f23465b;
                i4++;
                iyVar = iyVar.f23469f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f23473f = new byte[i4][];
        this.f23474g = new int[(i4 * 2)];
        C9440iy iyVar2 = irVar.f23446a;
        int i5 = 0;
        while (i2 < i) {
            this.f23473f[i5] = iyVar2.f23464a;
            i2 += iyVar2.f23466c - iyVar2.f23465b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f23474g;
            iArr[i5] = i2;
            iArr[this.f23473f.length + i5] = iyVar2.f23465b;
            iyVar2.f23467d = true;
            i5++;
            iyVar2 = iyVar2.f23469f;
        }
    }

    /* renamed from: a */
    public final String mo58409a() {
        return m25389e().mo58409a();
    }

    /* renamed from: b */
    public final String mo58412b() {
        return m25389e().mo58412b();
    }

    /* renamed from: a */
    public final C9434iu mo58408a(int i, int i2) {
        return m25389e().mo58408a(i, i2);
    }

    /* renamed from: a */
    public final byte mo58407a(int i) {
        int i2;
        C9448je.m25404a((long) this.f23474g[this.f23473f.length - 1], (long) i, 1);
        int b = m25388b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f23474g[b - 1];
        }
        int[] iArr = this.f23474g;
        byte[][] bArr = this.f23473f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: b */
    private int m25388b(int i) {
        int binarySearch = Arrays.binarySearch(this.f23474g, 0, this.f23473f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: c */
    public final int mo58413c() {
        return this.f23474g[this.f23473f.length - 1];
    }

    /* renamed from: d */
    public final byte[] mo58415d() {
        int[] iArr = this.f23474g;
        byte[][] bArr = this.f23473f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f23474g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f23473f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58410a(C9431ir irVar) {
        int length = this.f23473f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f23474g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C9440iy iyVar = new C9440iy(this.f23473f[i], i3, (i3 + i4) - i2);
            if (irVar.f23446a == null) {
                iyVar.f23470g = iyVar;
                iyVar.f23469f = iyVar;
                irVar.f23446a = iyVar;
            } else {
                irVar.f23446a.f23470g.mo58424a(iyVar);
            }
            i++;
            i2 = i4;
        }
        irVar.f23447b += (long) i2;
    }

    /* renamed from: a */
    public final boolean mo58411a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo58413c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m25388b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f23474g[b - 1];
            }
            int min = Math.min(i3, ((this.f23474g[b] - i4) + i4) - i);
            int[] iArr = this.f23474g;
            byte[][] bArr2 = this.f23473f;
            if (!C9448je.m25406a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: e */
    private C9434iu m25389e() {
        return new C9434iu(mo58415d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            if (r12 != r11) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r12 instanceof com.tapjoy.internal.C9434iu
            r2 = 0
            if (r1 == 0) goto L_0x005d
            com.tapjoy.internal.iu r12 = (com.tapjoy.internal.C9434iu) r12
            int r1 = r12.mo58413c()
            int r3 = r11.mo58413c()
            if (r1 != r3) goto L_0x005d
            int r1 = r11.mo58413c()
            int r3 = r11.mo58413c()
            int r3 = r3 - r1
            if (r3 >= 0) goto L_0x0022
        L_0x0020:
            r12 = 0
            goto L_0x005a
        L_0x0022:
            int r3 = r11.m25388b(r2)
            r4 = 0
            r5 = 0
        L_0x0028:
            if (r1 <= 0) goto L_0x0059
            if (r3 != 0) goto L_0x002e
            r6 = 0
            goto L_0x0034
        L_0x002e:
            int[] r6 = r11.f23474g
            int r7 = r3 + -1
            r6 = r6[r7]
        L_0x0034:
            int[] r7 = r11.f23474g
            r7 = r7[r3]
            int r7 = r7 - r6
            int r7 = r7 + r6
            int r7 = r7 - r4
            int r7 = java.lang.Math.min(r1, r7)
            int[] r8 = r11.f23474g
            byte[][] r9 = r11.f23473f
            int r10 = r9.length
            int r10 = r10 + r3
            r8 = r8[r10]
            int r6 = r4 - r6
            int r6 = r6 + r8
            r8 = r9[r3]
            boolean r6 = r12.mo58411a(r5, r8, r6, r7)
            if (r6 != 0) goto L_0x0053
            goto L_0x0020
        L_0x0053:
            int r4 = r4 + r7
            int r5 = r5 + r7
            int r1 = r1 - r7
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0059:
            r12 = 1
        L_0x005a:
            if (r12 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9443ja.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = this.f23451d;
        if (i != 0) {
            return i;
        }
        int length = this.f23473f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f23473f[i2];
            int[] iArr = this.f23474g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f23451d = i4;
        return i4;
    }

    public final String toString() {
        return m25389e().toString();
    }
}
