package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.k */
final class C3359k {
    /* renamed from: a */
    public static int m8324a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static boolean m8326a(int i, C3548k kVar, boolean z) throws C3295l {
        if (kVar.mo19383b() < 7) {
            if (z) {
                return false;
            }
            throw new C3295l("too short header: " + kVar.mo19383b());
        } else if (kVar.mo19387d() != i) {
            if (z) {
                return false;
            }
            throw new C3295l("expected header type " + Integer.toHexString(i));
        } else if (kVar.mo19387d() == 118 && kVar.mo19387d() == 111 && kVar.mo19387d() == 114 && kVar.mo19387d() == 98 && kVar.mo19387d() == 105 && kVar.mo19387d() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C3295l("expected characters 'vorbis'");
        }
    }

    /* renamed from: a */
    static C3362c[] m8327a(C3356i iVar) {
        int a = iVar.mo19153a(6) + 1;
        C3362c[] cVarArr = new C3362c[a];
        for (int i = 0; i < a; i++) {
            cVarArr[i] = new C3362c(iVar.mo19154a(), iVar.mo19153a(16), iVar.mo19153a(16), iVar.mo19153a(8));
        }
        return cVarArr;
    }

    /* renamed from: a */
    static void m8325a(int i, C3356i iVar) throws C3295l {
        int a = iVar.mo19153a(6) + 1;
        for (int i2 = 0; i2 < a; i2++) {
            int a2 = iVar.mo19153a(16);
            if (a2 != 0) {
                Log.e("VorbisUtil", "mapping type other than 0 not supported: " + a2);
            } else {
                int a3 = iVar.mo19154a() ? iVar.mo19153a(4) + 1 : 1;
                if (iVar.mo19154a()) {
                    int a4 = iVar.mo19153a(8) + 1;
                    for (int i3 = 0; i3 < a4; i3++) {
                        int i4 = i - 1;
                        iVar.mo19155b(m8324a(i4));
                        iVar.mo19155b(m8324a(i4));
                    }
                }
                if (iVar.mo19153a(2) == 0) {
                    if (a3 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            iVar.mo19155b(4);
                        }
                    }
                    for (int i6 = 0; i6 < a3; i6++) {
                        iVar.mo19155b(8);
                        iVar.mo19155b(8);
                        iVar.mo19155b(8);
                    }
                } else {
                    throw new C3295l("to reserved bits must be zero after mapping coupling steps");
                }
            }
        }
    }

    /* renamed from: b */
    static void m8328b(C3356i iVar) throws C3295l {
        int a = iVar.mo19153a(6) + 1;
        int i = 0;
        while (i < a) {
            if (iVar.mo19153a(16) <= 2) {
                iVar.mo19155b(24);
                iVar.mo19155b(24);
                iVar.mo19155b(24);
                int a2 = iVar.mo19153a(6) + 1;
                iVar.mo19155b(8);
                int[] iArr = new int[a2];
                for (int i2 = 0; i2 < a2; i2++) {
                    iArr[i2] = ((iVar.mo19154a() ? iVar.mo19153a(5) : 0) * 8) + iVar.mo19153a(3);
                }
                for (int i3 = 0; i3 < a2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            iVar.mo19155b(8);
                        }
                    }
                }
                i++;
            } else {
                throw new C3295l("residueType greater than 2 is not decodable");
            }
        }
    }

    /* renamed from: c */
    static void m8329c(C3356i iVar) throws C3295l {
        int a = iVar.mo19153a(6) + 1;
        for (int i = 0; i < a; i++) {
            int a2 = iVar.mo19153a(16);
            if (a2 == 0) {
                iVar.mo19155b(8);
                iVar.mo19155b(16);
                iVar.mo19155b(16);
                iVar.mo19155b(6);
                iVar.mo19155b(8);
                int a3 = iVar.mo19153a(4) + 1;
                for (int i2 = 0; i2 < a3; i2++) {
                    iVar.mo19155b(8);
                }
            } else if (a2 == 1) {
                int a4 = iVar.mo19153a(5);
                int i3 = -1;
                int[] iArr = new int[a4];
                for (int i4 = 0; i4 < a4; i4++) {
                    iArr[i4] = iVar.mo19153a(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = iVar.mo19153a(3) + 1;
                    int a5 = iVar.mo19153a(2);
                    if (a5 > 0) {
                        iVar.mo19155b(8);
                    }
                    for (int i7 = 0; i7 < (1 << a5); i7++) {
                        iVar.mo19155b(8);
                    }
                }
                iVar.mo19155b(2);
                int a6 = iVar.mo19153a(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < a4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        iVar.mo19155b(a6);
                        i9++;
                    }
                }
            } else {
                throw new C3295l("floor type greater than 1 not decodable: " + a2);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.k$a */
    public static final class C3360a {

        /* renamed from: a */
        public final int f8903a;

        /* renamed from: b */
        public final int f8904b;

        /* renamed from: c */
        public final long[] f8905c;

        /* renamed from: d */
        public final int f8906d;

        /* renamed from: e */
        public final boolean f8907e;

        public C3360a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f8903a = i;
            this.f8904b = i2;
            this.f8905c = jArr;
            this.f8906d = i3;
            this.f8907e = z;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.k$b */
    public static final class C3361b {

        /* renamed from: a */
        public final String f8908a;

        /* renamed from: b */
        public final String[] f8909b;

        /* renamed from: c */
        public final int f8910c;

        public C3361b(String str, String[] strArr, int i) {
            this.f8908a = str;
            this.f8909b = strArr;
            this.f8910c = i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.k$d */
    public static final class C3363d {

        /* renamed from: a */
        public final long f8915a;

        /* renamed from: b */
        public final int f8916b;

        /* renamed from: c */
        public final long f8917c;

        /* renamed from: d */
        public final int f8918d;

        /* renamed from: e */
        public final int f8919e;

        /* renamed from: f */
        public final int f8920f;

        /* renamed from: g */
        public final int f8921g;

        /* renamed from: h */
        public final int f8922h;

        /* renamed from: i */
        public final boolean f8923i;

        /* renamed from: j */
        public final byte[] f8924j;

        public C3363d(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f8915a = j;
            this.f8916b = i;
            this.f8917c = j2;
            this.f8918d = i2;
            this.f8919e = i3;
            this.f8920f = i4;
            this.f8921g = i5;
            this.f8922h = i6;
            this.f8923i = z;
            this.f8924j = bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.e.k$c */
    public static final class C3362c {

        /* renamed from: a */
        public final boolean f8911a;

        /* renamed from: b */
        public final int f8912b;

        /* renamed from: c */
        public final int f8913c;

        /* renamed from: d */
        public final int f8914d;

        public C3362c(boolean z, int i, int i2, int i3) {
            this.f8911a = z;
            this.f8912b = i;
            this.f8913c = i2;
            this.f8914d = i3;
        }
    }
}
