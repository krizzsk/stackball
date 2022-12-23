package com.yandex.mobile.ads.impl;

public final class vp1 {

    /* renamed from: com.yandex.mobile.ads.impl.vp1$a */
    public static final class C14903a {

        /* renamed from: a */
        public final String[] f41363a;

        public C14903a(String str, String[] strArr, int i) {
            this.f41363a = strArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vp1$b */
    public static final class C14904b {

        /* renamed from: a */
        public final boolean f41364a;

        public C14904b(boolean z, int i, int i2, int i3) {
            this.f41364a = z;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vp1$c */
    public static final class C14905c {

        /* renamed from: a */
        public final int f41365a;

        /* renamed from: b */
        public final long f41366b;

        /* renamed from: c */
        public final int f41367c;

        /* renamed from: d */
        public final int f41368d;

        /* renamed from: e */
        public final int f41369e;

        /* renamed from: f */
        public final byte[] f41370f;

        public C14905c(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f41365a = i;
            this.f41366b = j2;
            this.f41367c = i3;
            this.f41368d = i5;
            this.f41369e = i6;
            this.f41370f = bArr;
        }
    }

    /* renamed from: a */
    public static int m43182a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static C14903a m43183a(fy0 fy0, boolean z, boolean z2) throws jy0 {
        if (z) {
            m43184a(3, fy0, false);
        }
        String b = fy0.mo67106b((int) fy0.mo67119k());
        long k = fy0.mo67119k();
        String[] strArr = new String[((int) k)];
        int length = b.length() + 11 + 4;
        for (int i = 0; ((long) i) < k; i++) {
            strArr[i] = fy0.mo67106b((int) fy0.mo67119k());
            length = length + 4 + strArr[i].length();
        }
        if (!z2 || (fy0.mo67126r() & 1) != 0) {
            return new C14903a(b, strArr, length + 1);
        }
        throw new jy0("framing bit expected to be set");
    }

    /* renamed from: a */
    public static boolean m43184a(int i, fy0 fy0, boolean z) throws jy0 {
        if (fy0.mo67098a() < 7) {
            if (z) {
                return false;
            }
            throw new jy0("too short header: " + fy0.mo67098a());
        } else if (fy0.mo67126r() != i) {
            if (z) {
                return false;
            }
            throw new jy0("expected header type " + Integer.toHexString(i));
        } else if (fy0.mo67126r() == 118 && fy0.mo67126r() == 111 && fy0.mo67126r() == 114 && fy0.mo67126r() == 98 && fy0.mo67126r() == 105 && fy0.mo67126r() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new jy0("expected characters 'vorbis'");
        }
    }
}
