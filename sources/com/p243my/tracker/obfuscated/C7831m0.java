package com.p243my.tracker.obfuscated;

import android.location.Location;
import com.p243my.tracker.MyTracker;
import com.p243my.tracker.obfuscated.C7803c;
import com.p243my.tracker.obfuscated.C7872t;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.m0 */
public final class C7831m0 implements C7872t.C7873a {

    /* renamed from: a */
    final C7832a f19947a;

    /* renamed from: b */
    final C7851r f19948b;

    /* renamed from: c */
    final C7843k f19949c;

    /* renamed from: d */
    final C7846m f19950d;

    /* renamed from: e */
    final C7847n f19951e;

    /* renamed from: f */
    final C7850q f19952f;

    /* renamed from: g */
    final C7845l f19953g;

    /* renamed from: h */
    final List<C7849p> f19954h;

    /* renamed from: i */
    final ByteArrayOutputStream f19955i;

    /* renamed from: j */
    final ByteArrayOutputStream f19956j;

    /* renamed from: k */
    String f19957k;

    /* renamed from: l */
    byte[] f19958l;

    /* renamed from: m */
    long f19959m = -1;

    /* renamed from: n */
    long f19960n = -1;

    /* renamed from: o */
    int f19961o = -1;

    /* renamed from: com.my.tracker.obfuscated.m0$a */
    static final class C7832a extends C7849p {

        /* renamed from: b */
        final C7833a f19962b = new C7833a();

        /* renamed from: c */
        String f19963c;

        /* renamed from: d */
        String f19964d;

        /* renamed from: e */
        String f19965e;

        /* renamed from: f */
        String f19966f;

        /* renamed from: com.my.tracker.obfuscated.m0$a$a */
        static final class C7833a {

            /* renamed from: a */
            String f19967a;

            /* renamed from: b */
            long f19968b = -1;

            C7833a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo52461a(ByteArrayOutputStream byteArrayOutputStream) {
                C7860o0.m21472a(1, this.f19967a, (OutputStream) byteArrayOutputStream);
                long j = this.f19968b;
                if (j != -1) {
                    C7860o0.m21469a(2, j, (OutputStream) byteArrayOutputStream);
                }
            }
        }

        C7832a() {
            super(21);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            this.f19962b.mo52461a(byteArrayOutputStream2);
            if (byteArrayOutputStream2.size() > 0) {
                C7860o0.m21470a(31, byteArrayOutputStream2, (OutputStream) byteArrayOutputStream);
            }
            C7860o0.m21472a(1, this.f19963c, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(2, this.f19964d, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(3, this.f19965e, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(4, this.f19966f, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$b */
    static final class C7834b extends C7841i {

        /* renamed from: b */
        final int f19969b;

        /* renamed from: c */
        final int f19970c;

        /* renamed from: d */
        final int f19971d;

        /* renamed from: e */
        final int f19972e;

        /* renamed from: f */
        final int f19973f;

        /* renamed from: g */
        final int f19974g;

        /* renamed from: h */
        final int f19975h;

        /* renamed from: i */
        final int f19976i;

        /* renamed from: j */
        final int f19977j;

        /* renamed from: k */
        final int f19978k;

        /* renamed from: l */
        final int f19979l;

        /* renamed from: m */
        final int f19980m;

        C7834b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            super(32);
            this.f19969b = i;
            this.f19970c = i2;
            this.f19971d = i3;
            this.f19972e = i4;
            this.f19973f = i5;
            this.f19974g = i6;
            this.f19975h = i7;
            this.f19976i = i8;
            this.f19977j = i9;
            this.f19978k = i10;
            this.f19979l = i11;
            this.f19980m = i12;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C7841i.m21437a(1, this.f19969b, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(2, this.f19970c, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(3, this.f19971d, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(4, this.f19972e, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(5, this.f19973f, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(6, this.f19974g, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(7, this.f19975h, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(8, this.f19976i, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(9, this.f19977j, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(10, this.f19978k, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(11, this.f19979l, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(12, this.f19980m, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$c */
    static final class C7835c extends C7837e {

        /* renamed from: g */
        final int f19981g;

        /* renamed from: h */
        final int f19982h;

        /* renamed from: i */
        final int f19983i;

        /* renamed from: j */
        final int f19984j;

        /* renamed from: k */
        final int f19985k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7835c(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(33, str, str2, i5, i6, i7);
            this.f19981g = i;
            this.f19982h = i2;
            this.f19983i = i3;
            this.f19984j = i4;
            this.f19985k = i8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo52460a(byteArrayOutputStream, byteArrayOutputStream2);
            C7841i.m21437a(3, this.f19981g, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(4, this.f19982h, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(5, this.f19983i, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(6, this.f19984j, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(10, this.f19985k, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$d */
    static final class C7836d extends C7837e {

        /* renamed from: g */
        final int f19986g;

        /* renamed from: h */
        final int f19987h;

        /* renamed from: i */
        final int f19988i;

        /* renamed from: j */
        final int f19989j;

        /* renamed from: k */
        final int f19990k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7836d(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(34, str, str2, i5, i6, i7);
            this.f19986g = i;
            this.f19987h = i2;
            this.f19988i = i3;
            this.f19989j = i4;
            this.f19990k = i8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo52460a(byteArrayOutputStream, byteArrayOutputStream2);
            C7841i.m21437a(3, this.f19986g, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(4, this.f19987h, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(5, this.f19988i, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(6, this.f19989j, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(10, this.f19990k, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$e */
    static abstract class C7837e extends C7841i {

        /* renamed from: b */
        final String f19991b;

        /* renamed from: c */
        final String f19992c;

        /* renamed from: d */
        final int f19993d;

        /* renamed from: e */
        final int f19994e;

        /* renamed from: f */
        final int f19995f;

        protected C7837e(int i, String str, String str2, int i2, int i3, int i4) {
            super(i);
            this.f19991b = str;
            this.f19992c = str2;
            this.f19993d = i2;
            this.f19994e = i3;
            this.f19995f = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C7860o0.m21472a(1, this.f19991b, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(2, this.f19992c, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(7, this.f19993d, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(8, this.f19994e, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(9, this.f19995f, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$f */
    static final class C7838f extends C7837e {

        /* renamed from: g */
        final long f19996g;

        /* renamed from: h */
        final int f19997h;

        /* renamed from: i */
        final int f19998i;

        /* renamed from: j */
        final int f19999j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7838f(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6) {
            super(37, str, str2, i4, i5, i6);
            this.f19996g = j;
            this.f19997h = i;
            this.f19998i = i2;
            this.f19999j = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo52460a(byteArrayOutputStream, byteArrayOutputStream2);
            C7841i.m21438a(3, this.f19996g, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(4, this.f19997h, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(5, this.f19998i, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(6, this.f19999j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$g */
    static final class C7839g extends C7837e {

        /* renamed from: g */
        final int f20000g;

        /* renamed from: h */
        final int f20001h;

        /* renamed from: i */
        final int f20002i;

        /* renamed from: j */
        final int f20003j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7839g(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(36, str, str2, i5, i6, i7);
            this.f20000g = i;
            this.f20001h = i2;
            this.f20002i = i3;
            this.f20003j = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo52460a(byteArrayOutputStream, byteArrayOutputStream2);
            C7841i.m21437a(3, this.f20000g, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(4, this.f20001h, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(5, this.f20002i, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(6, this.f20003j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$h */
    static final class C7840h extends C7837e {

        /* renamed from: g */
        final int f20004g;

        /* renamed from: h */
        final int f20005h;

        /* renamed from: i */
        final int f20006i;

        /* renamed from: j */
        final int f20007j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7840h(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(35, str, str2, i5, i6, i7);
            this.f20004g = i;
            this.f20005h = i2;
            this.f20006i = i3;
            this.f20007j = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo52460a(byteArrayOutputStream, byteArrayOutputStream2);
            C7841i.m21437a(3, this.f20004g, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(4, this.f20005h, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(5, this.f20006i, (OutputStream) byteArrayOutputStream);
            C7841i.m21437a(6, this.f20007j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$i */
    static abstract class C7841i extends C7849p {
        protected C7841i(int i) {
            super(i);
        }

        /* renamed from: a */
        protected static void m21437a(int i, int i2, OutputStream outputStream) {
            if (C7824l.m21260a(i2)) {
                C7860o0.m21479b(i, i2, outputStream);
            }
        }

        /* renamed from: a */
        protected static void m21438a(int i, long j, OutputStream outputStream) {
            if (C7824l.m21261a(j)) {
                C7860o0.m21469a(i, j, outputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$j */
    static final class C7842j extends C7849p {

        /* renamed from: b */
        final String f20008b;

        /* renamed from: c */
        final String f20009c;

        /* renamed from: d */
        final int f20010d;

        /* renamed from: e */
        final int f20011e;

        /* renamed from: f */
        final int f20012f;

        C7842j(String str, String str2, int i, int i2, int i3) {
            super(28);
            this.f20008b = str;
            this.f20009c = str2;
            this.f20010d = i;
            this.f20011e = i2;
            this.f20012f = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C7860o0.m21472a(1, this.f20009c, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(2, this.f20008b, (OutputStream) byteArrayOutputStream);
            C7860o0.m21479b(3, this.f20010d, byteArrayOutputStream);
            C7860o0.m21479b(5, this.f20011e, byteArrayOutputStream);
            C7860o0.m21479b(6, this.f20012f, byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$k */
    static final class C7843k extends C7849p {

        /* renamed from: A */
        String f20013A;

        /* renamed from: b */
        final C7844a f20014b = new C7844a();

        /* renamed from: c */
        int f20015c = -1;

        /* renamed from: d */
        String f20016d;

        /* renamed from: e */
        String f20017e;

        /* renamed from: f */
        String f20018f;

        /* renamed from: g */
        String f20019g;

        /* renamed from: h */
        String f20020h;

        /* renamed from: i */
        String f20021i;

        /* renamed from: j */
        String f20022j;

        /* renamed from: k */
        int f20023k = -1;

        /* renamed from: l */
        int f20024l = -1;

        /* renamed from: m */
        int f20025m = -1;

        /* renamed from: n */
        int f20026n = -1;

        /* renamed from: o */
        float f20027o = Float.NaN;

        /* renamed from: p */
        float f20028p = Float.NaN;

        /* renamed from: q */
        float f20029q = Float.NaN;

        /* renamed from: r */
        String f20030r;

        /* renamed from: s */
        int f20031s = -1;

        /* renamed from: t */
        int f20032t = -1;

        /* renamed from: u */
        long f20033u = -1;

        /* renamed from: v */
        long f20034v = -1;

        /* renamed from: w */
        long f20035w = -1;

        /* renamed from: x */
        long f20036x = -1;

        /* renamed from: y */
        int f20037y = -1;

        /* renamed from: z */
        int f20038z = -1;

        /* renamed from: com.my.tracker.obfuscated.m0$k$a */
        static final class C7844a {

            /* renamed from: a */
            String f20039a;

            /* renamed from: b */
            String f20040b;

            /* renamed from: c */
            int f20041c = -1;

            /* renamed from: d */
            String f20042d;

            /* renamed from: e */
            int f20043e = -1;

            C7844a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo52462a(ByteArrayOutputStream byteArrayOutputStream) {
                C7860o0.m21472a(1, this.f20039a, (OutputStream) byteArrayOutputStream);
                C7860o0.m21472a(2, this.f20040b, (OutputStream) byteArrayOutputStream);
                int i = this.f20041c;
                if (i != -1) {
                    C7860o0.m21479b(3, i, byteArrayOutputStream);
                }
                C7860o0.m21472a(4, this.f20042d, (OutputStream) byteArrayOutputStream);
                int i2 = this.f20043e;
                if (i2 != -1) {
                    C7860o0.m21479b(5, i2, byteArrayOutputStream);
                }
            }
        }

        C7843k() {
            super(23);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            this.f20014b.mo52462a(byteArrayOutputStream2);
            if (byteArrayOutputStream2.size() > 0) {
                C7860o0.m21470a(31, byteArrayOutputStream2, (OutputStream) byteArrayOutputStream);
            }
            int i = this.f20015c;
            if (i != -1) {
                C7860o0.m21479b(1, i, byteArrayOutputStream);
            }
            C7860o0.m21472a(2, this.f20016d, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(3, this.f20017e, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(4, this.f20018f, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(5, this.f20019g, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(6, this.f20020h, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(7, this.f20021i, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(8, this.f20022j, (OutputStream) byteArrayOutputStream);
            int i2 = this.f20023k;
            if (i2 != -1) {
                C7860o0.m21479b(9, i2, byteArrayOutputStream);
            }
            int i3 = this.f20024l;
            if (i3 > -1) {
                C7860o0.m21479b(10, i3, byteArrayOutputStream);
            }
            int i4 = this.f20025m;
            if (i4 > -1) {
                C7860o0.m21479b(11, i4, byteArrayOutputStream);
            }
            int i5 = this.f20026n;
            if (i5 > -1) {
                C7860o0.m21479b(12, i5, byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f20027o)) {
                C7860o0.m21467a(13, this.f20027o, (OutputStream) byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f20028p)) {
                C7860o0.m21467a(14, this.f20028p, (OutputStream) byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f20029q)) {
                C7860o0.m21467a(15, this.f20029q, (OutputStream) byteArrayOutputStream);
            }
            C7860o0.m21472a(16, this.f20030r, (OutputStream) byteArrayOutputStream);
            int i6 = this.f20031s;
            if (i6 > -1) {
                C7860o0.m21479b(17, i6, byteArrayOutputStream);
            }
            int i7 = this.f20032t;
            if (i7 > -1) {
                C7860o0.m21479b(18, i7, byteArrayOutputStream);
            }
            long j = this.f20033u;
            if (j > -1) {
                C7860o0.m21469a(19, j, (OutputStream) byteArrayOutputStream);
            }
            long j2 = this.f20034v;
            if (j2 > -1) {
                C7860o0.m21469a(20, j2, (OutputStream) byteArrayOutputStream);
            }
            long j3 = this.f20035w;
            if (j3 > -1) {
                C7860o0.m21469a(21, j3, (OutputStream) byteArrayOutputStream);
            }
            long j4 = this.f20036x;
            if (j4 > -1) {
                C7860o0.m21469a(22, j4, (OutputStream) byteArrayOutputStream);
            }
            int i8 = this.f20037y;
            if (i8 != -1) {
                C7860o0.m21479b(23, i8, byteArrayOutputStream);
            }
            int i9 = this.f20038z;
            if (i9 > -1) {
                C7860o0.m21479b(24, i9, byteArrayOutputStream);
            }
            C7860o0.m21472a(25, this.f20013A, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$l */
    static final class C7845l extends C7849p {

        /* renamed from: b */
        int f20044b = -1;

        /* renamed from: c */
        double f20045c = Double.NaN;

        /* renamed from: d */
        double f20046d = Double.NaN;

        /* renamed from: e */
        double f20047e = Double.NaN;

        /* renamed from: f */
        double f20048f = Double.NaN;

        /* renamed from: g */
        long f20049g = -1;

        C7845l() {
            super(26);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            if (!Double.isNaN(this.f20045c)) {
                C7860o0.m21466a(1, this.f20045c, (OutputStream) byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f20046d)) {
                C7860o0.m21466a(2, this.f20046d, (OutputStream) byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f20047e)) {
                C7860o0.m21466a(3, this.f20047e, (OutputStream) byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f20048f)) {
                C7860o0.m21466a(4, this.f20048f, (OutputStream) byteArrayOutputStream);
            }
            long j = this.f20049g;
            if (j > -1) {
                C7860o0.m21469a(5, j, (OutputStream) byteArrayOutputStream);
            }
            int i = this.f20044b;
            if (i != -1) {
                C7860o0.m21479b(6, i, byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$m */
    static final class C7846m extends C7849p {

        /* renamed from: b */
        String f20050b;

        /* renamed from: c */
        String f20051c;

        /* renamed from: d */
        String f20052d;

        C7846m() {
            super(24);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C7860o0.m21472a(1, this.f20050b, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(2, this.f20051c, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(3, this.f20052d, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$n */
    static final class C7847n extends C7849p {

        /* renamed from: b */
        int f20053b = -1;

        /* renamed from: c */
        int f20054c = -1;

        /* renamed from: d */
        String f20055d;

        /* renamed from: e */
        String f20056e;

        /* renamed from: f */
        String f20057f;

        /* renamed from: g */
        String f20058g;

        /* renamed from: h */
        String f20059h;

        /* renamed from: i */
        byte[] f20060i;

        C7847n() {
            super(25);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i = this.f20053b;
            if (i != -1) {
                C7860o0.m21479b(1, i, byteArrayOutputStream);
            }
            int i2 = this.f20054c;
            if (i2 != -1) {
                C7860o0.m21479b(7, i2, byteArrayOutputStream);
            }
            C7860o0.m21472a(2, this.f20055d, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(3, this.f20056e, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(4, this.f20057f, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(5, this.f20058g, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(6, this.f20059h, (OutputStream) byteArrayOutputStream);
            C7860o0.m21473a(8, this.f20060i, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$o */
    static final class C7848o extends C7849p {

        /* renamed from: b */
        final C7803c.C7804a f20061b;

        protected C7848o(C7803c.C7804a aVar) {
            super(31);
            this.f20061b = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C7860o0.m21472a(1, this.f20061b.f19849a, (OutputStream) byteArrayOutputStream);
            C7860o0.m21469a(2, this.f20061b.f19850b, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$p */
    static abstract class C7849p {

        /* renamed from: a */
        final int f20062a;

        protected C7849p(int i) {
            this.f20062a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo52463a(OutputStream outputStream, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            mo52460a(byteArrayOutputStream, byteArrayOutputStream2);
            if (byteArrayOutputStream.size() > 0) {
                C7860o0.m21470a(this.f20062a, byteArrayOutputStream, outputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$q */
    static final class C7850q extends C7849p {

        /* renamed from: b */
        int f20063b = -1;

        /* renamed from: c */
        int f20064c = -1;

        /* renamed from: d */
        int f20065d = -1;

        /* renamed from: e */
        int f20066e = -1;

        /* renamed from: f */
        int f20067f = -1;

        /* renamed from: g */
        int f20068g = -1;

        /* renamed from: h */
        int f20069h = -1;

        /* renamed from: i */
        int f20070i = -1;

        /* renamed from: j */
        int f20071j = -1;

        /* renamed from: k */
        int f20072k = -1;

        /* renamed from: l */
        int f20073l = -1;

        /* renamed from: m */
        int f20074m = -1;

        /* renamed from: n */
        int f20075n = -1;

        /* renamed from: o */
        int f20076o = -1;

        C7850q() {
            super(27);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i = this.f20063b;
            if (i > -1) {
                C7860o0.m21479b(1, i, byteArrayOutputStream);
            }
            int i2 = this.f20064c;
            if (i2 != -1) {
                C7860o0.m21479b(2, i2, byteArrayOutputStream);
            }
            int i3 = this.f20065d;
            if (i3 != -1) {
                C7860o0.m21479b(3, i3, byteArrayOutputStream);
            }
            int i4 = this.f20066e;
            if (i4 != -1) {
                C7860o0.m21479b(4, i4, byteArrayOutputStream);
            }
            int i5 = this.f20067f;
            if (i5 > -1) {
                C7860o0.m21479b(5, i5, byteArrayOutputStream);
            }
            int i6 = this.f20068g;
            if (i6 > -1) {
                C7860o0.m21479b(6, i6, byteArrayOutputStream);
            }
            int i7 = this.f20069h;
            if (i7 != -1) {
                C7860o0.m21479b(7, i7, byteArrayOutputStream);
            }
            int i8 = this.f20070i;
            if (i8 != -1) {
                C7860o0.m21479b(8, i8, byteArrayOutputStream);
            }
            int i9 = this.f20071j;
            if (i9 != -1) {
                C7860o0.m21479b(9, i9, byteArrayOutputStream);
            }
            int i10 = this.f20072k;
            if (i10 != -1) {
                C7860o0.m21479b(11, i10, byteArrayOutputStream);
            }
            int i11 = this.f20073l;
            if (i11 != -1) {
                C7860o0.m21479b(12, i11, byteArrayOutputStream);
            }
            int i12 = this.f20074m;
            if (i12 != -1) {
                C7860o0.m21479b(13, i12, byteArrayOutputStream);
            }
            int i13 = this.f20075n;
            if (i13 != -1) {
                C7860o0.m21479b(14, i13, byteArrayOutputStream);
            }
            int i14 = this.f20076o;
            if (i14 != -1) {
                C7860o0.m21479b(15, i14, byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$r */
    static final class C7851r extends C7849p {

        /* renamed from: b */
        int f20077b = -1;

        /* renamed from: c */
        int f20078c = -1;

        /* renamed from: d */
        String[] f20079d;

        /* renamed from: e */
        String[] f20080e;

        /* renamed from: f */
        String[] f20081f;

        /* renamed from: g */
        String[] f20082g;

        /* renamed from: h */
        String[] f20083h;

        /* renamed from: i */
        String[] f20084i;

        /* renamed from: j */
        String[] f20085j;

        C7851r() {
            super(22);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i = this.f20077b;
            if (i != -1) {
                C7860o0.m21479b(1, i, byteArrayOutputStream);
            }
            int i2 = this.f20078c;
            if (i2 > -1) {
                C7860o0.m21479b(2, i2, byteArrayOutputStream);
            }
            C7860o0.m21474a(3, this.f20079d, (OutputStream) byteArrayOutputStream);
            C7860o0.m21474a(4, this.f20080e, (OutputStream) byteArrayOutputStream);
            C7860o0.m21474a(5, this.f20081f, (OutputStream) byteArrayOutputStream);
            C7860o0.m21474a(6, this.f20082g, (OutputStream) byteArrayOutputStream);
            C7860o0.m21474a(7, this.f20083h, (OutputStream) byteArrayOutputStream);
            C7860o0.m21474a(8, this.f20084i, (OutputStream) byteArrayOutputStream);
            C7860o0.m21474a(9, this.f20085j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.m0$s */
    static final class C7852s extends C7849p {

        /* renamed from: b */
        final String f20086b;

        /* renamed from: c */
        final String f20087c;

        /* renamed from: d */
        final int f20088d;

        C7852s(String str, String str2, int i) {
            super(29);
            this.f20086b = str;
            this.f20087c = str2;
            this.f20088d = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo52460a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C7860o0.m21472a(1, this.f20087c, (OutputStream) byteArrayOutputStream);
            C7860o0.m21472a(2, this.f20086b, (OutputStream) byteArrayOutputStream);
            C7860o0.m21479b(3, this.f20088d, byteArrayOutputStream);
        }
    }

    private C7831m0(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        C7832a aVar = new C7832a();
        this.f19947a = aVar;
        C7851r rVar = new C7851r();
        this.f19948b = rVar;
        C7843k kVar = new C7843k();
        this.f19949c = kVar;
        C7846m mVar = new C7846m();
        this.f19950d = mVar;
        C7847n nVar = new C7847n();
        this.f19951e = nVar;
        C7850q qVar = new C7850q();
        this.f19952f = qVar;
        C7845l lVar = new C7845l();
        this.f19953g = lVar;
        this.f19954h = C7812g.m21182a((T[]) new C7849p[]{aVar, rVar, kVar, mVar, nVar, qVar, lVar});
        this.f19955i = byteArrayOutputStream;
        this.f19956j = byteArrayOutputStream2;
    }

    /* renamed from: a */
    public static C7831m0 m21344a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        return new C7831m0(byteArrayOutputStream, byteArrayOutputStream2);
    }

    /* renamed from: a */
    public String mo52377a() {
        return "application/octet-stream";
    }

    /* renamed from: a */
    public void mo52378a(float f) {
        this.f19949c.f20029q = f;
    }

    /* renamed from: a */
    public void mo52379a(int i) {
        this.f19952f.f20067f = i;
    }

    /* renamed from: a */
    public void mo52380a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f19954h.add(new C7834b(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12));
    }

    /* renamed from: a */
    public void mo52381a(int i, String str) {
        C7847n nVar = this.f19951e;
        nVar.f20053b = i;
        nVar.f20055d = str;
    }

    /* renamed from: a */
    public void mo52382a(long j) {
        this.f19949c.f20036x = j;
    }

    /* renamed from: a */
    public void mo52383a(Location location, int i) {
        this.f19953g.f20046d = location.getLongitude();
        this.f19953g.f20045c = location.getLatitude();
        this.f19953g.f20048f = (double) location.getAccuracy();
        this.f19953g.f20047e = (double) location.getSpeed();
        this.f19953g.f20049g = C7875t0.m21542b(location.getTime());
        this.f19953g.f20044b = i;
    }

    /* renamed from: a */
    public void mo52384a(OutputStream outputStream) {
        C7860o0.m21472a(1, MyTracker.VERSION, outputStream);
        C7860o0.m21472a(2, this.f19957k, outputStream);
        long j = this.f19959m;
        if (j > -1) {
            C7860o0.m21469a(3, j, outputStream);
        }
        long j2 = this.f19960n;
        if (j2 > -1) {
            C7860o0.m21469a(4, j2, outputStream);
        }
        int i = this.f19961o;
        if (i > -1) {
            C7860o0.m21479b(5, i, outputStream);
        }
        byte[] bArr = this.f19958l;
        if (bArr != null) {
            outputStream.write(bArr);
        }
        for (C7849p a : this.f19954h) {
            this.f19955i.reset();
            this.f19956j.reset();
            a.mo52463a(outputStream, this.f19955i, this.f19956j);
        }
    }

    /* renamed from: a */
    public void mo52385a(String str) {
        this.f19949c.f20014b.f20039a = str;
    }

    /* renamed from: a */
    public void mo52386a(String str, int i) {
        C7832a.C7833a aVar = this.f19947a.f19962b;
        aVar.f19967a = str;
        aVar.f19968b = (long) i;
    }

    /* renamed from: a */
    public void mo52387a(String str, String str2, int i) {
        this.f19954h.add(new C7852s(str, str2, i));
    }

    /* renamed from: a */
    public void mo52388a(String str, String str2, int i, int i2, int i3) {
        this.f19954h.add(new C7842j(str, str2, i, i2, i3));
    }

    /* renamed from: a */
    public void mo52389a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f19954h.add(new C7839g(str, str2, i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: a */
    public void mo52390a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f19954h.add(new C7835c(str, str2, i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* renamed from: a */
    public void mo52391a(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f19954h.add(new C7838f(str, str2, j, i, i2, i3, i4, i5, i6));
    }

    /* renamed from: a */
    public void mo52392a(String str, boolean z) {
        C7843k.C7844a aVar = this.f19949c.f20014b;
        aVar.f20040b = str;
        aVar.f20041c = z ? 1 : 0;
    }

    /* renamed from: a */
    public void mo52393a(List<C7803c.C7804a> list) {
        for (C7803c.C7804a oVar : list) {
            this.f19954h.add(new C7848o(oVar));
        }
    }

    /* renamed from: a */
    public void mo52394a(byte[] bArr) {
        this.f19958l = bArr;
    }

    /* renamed from: a */
    public void mo52395a(String[] strArr) {
        this.f19948b.f20083h = strArr;
    }

    /* renamed from: b */
    public void mo52396b() {
        this.f19952f.f20069h = 0;
    }

    /* renamed from: b */
    public void mo52397b(float f) {
        this.f19949c.f20027o = f;
    }

    /* renamed from: b */
    public void mo52398b(int i) {
        this.f19952f.f20068g = i;
    }

    /* renamed from: b */
    public void mo52399b(long j) {
        this.f19949c.f20035w = j;
    }

    /* renamed from: b */
    public void mo52400b(String str) {
        this.f19947a.f19964d = str;
    }

    /* renamed from: b */
    public void mo52401b(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f19954h.add(new C7840h(str, str2, i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: b */
    public void mo52402b(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f19954h.add(new C7836d(str, str2, i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* renamed from: b */
    public void mo52403b(String str, boolean z) {
        C7843k.C7844a aVar = this.f19949c.f20014b;
        aVar.f20042d = str;
        aVar.f20043e = z ? 1 : 0;
    }

    /* renamed from: b */
    public void mo52404b(byte[] bArr) {
        this.f19951e.f20060i = bArr;
    }

    /* renamed from: b */
    public void mo52405b(String[] strArr) {
        this.f19948b.f20081f = strArr;
    }

    /* renamed from: c */
    public void mo52406c() {
        this.f19952f.f20074m = 0;
    }

    /* renamed from: c */
    public void mo52407c(float f) {
        this.f19949c.f20028p = f;
    }

    /* renamed from: c */
    public void mo52408c(int i) {
        this.f19952f.f20063b = i;
    }

    /* renamed from: c */
    public void mo52409c(long j) {
        this.f19949c.f20034v = j;
    }

    /* renamed from: c */
    public void mo52410c(String str) {
        this.f19957k = str;
    }

    /* renamed from: c */
    public void mo52411c(String[] strArr) {
        this.f19948b.f20082g = strArr;
    }

    /* renamed from: d */
    public void mo52412d() {
        this.f19952f.f20072k = 0;
    }

    /* renamed from: d */
    public void mo52413d(int i) {
        this.f19948b.f20078c = i;
    }

    /* renamed from: d */
    public void mo52414d(long j) {
        this.f19949c.f20033u = j;
    }

    /* renamed from: d */
    public void mo52415d(String str) {
        this.f19947a.f19965e = str;
    }

    /* renamed from: d */
    public void mo52416d(String[] strArr) {
        this.f19948b.f20079d = strArr;
    }

    /* renamed from: e */
    public void mo52417e() {
        this.f19952f.f20073l = 0;
    }

    /* renamed from: e */
    public void mo52418e(int i) {
        this.f19949c.f20032t = i;
    }

    /* renamed from: e */
    public void mo52419e(long j) {
        this.f19959m = j;
    }

    /* renamed from: e */
    public void mo52420e(String str) {
        this.f19947a.f19966f = str;
    }

    /* renamed from: e */
    public void mo52421e(String[] strArr) {
        this.f19948b.f20084i = strArr;
    }

    /* renamed from: f */
    public void mo52422f() {
        this.f19952f.f20070i = 0;
    }

    /* renamed from: f */
    public void mo52423f(int i) {
        this.f19949c.f20031s = i;
    }

    /* renamed from: f */
    public void mo52424f(long j) {
        this.f19960n = j;
    }

    /* renamed from: f */
    public void mo52425f(String str) {
        this.f19947a.f19963c = str;
    }

    /* renamed from: f */
    public void mo52426f(String[] strArr) {
        this.f19948b.f20085j = strArr;
    }

    /* renamed from: g */
    public void mo52427g() {
        this.f19952f.f20071j = 0;
    }

    /* renamed from: g */
    public void mo52428g(int i) {
        this.f19951e.f20054c = i;
    }

    /* renamed from: g */
    public void mo52429g(String str) {
        this.f19949c.f20020h = str;
    }

    /* renamed from: g */
    public void mo52430g(String[] strArr) {
        this.f19948b.f20080e = strArr;
    }

    /* renamed from: h */
    public void mo52431h() {
        this.f19952f.f20075n = 0;
    }

    /* renamed from: h */
    public void mo52432h(int i) {
        this.f19961o = i;
    }

    /* renamed from: h */
    public void mo52433h(String str) {
        this.f19949c.f20021i = str;
    }

    /* renamed from: i */
    public void mo52434i() {
        this.f19952f.f20076o = 0;
    }

    /* renamed from: i */
    public void mo52435i(int i) {
        this.f19949c.f20026n = i;
    }

    /* renamed from: i */
    public void mo52436i(String str) {
        this.f19949c.f20013A = str;
    }

    /* renamed from: j */
    public void mo52437j() {
        this.f19952f.f20065d = 0;
    }

    /* renamed from: j */
    public void mo52438j(int i) {
        this.f19948b.f20077b = i;
    }

    /* renamed from: j */
    public void mo52439j(String str) {
        this.f19949c.f20019g = str;
    }

    /* renamed from: k */
    public void mo52440k() {
        this.f19952f.f20066e = 0;
    }

    /* renamed from: k */
    public void mo52441k(int i) {
        this.f19949c.f20025m = i;
    }

    /* renamed from: k */
    public void mo52442k(String str) {
        this.f19949c.f20030r = str;
    }

    /* renamed from: l */
    public void mo52443l() {
        this.f19952f.f20064c = 0;
    }

    /* renamed from: l */
    public void mo52444l(int i) {
        this.f19949c.f20015c = i;
    }

    /* renamed from: l */
    public void mo52445l(String str) {
        this.f19949c.f20022j = str;
    }

    /* renamed from: m */
    public void mo52446m(int i) {
        if (i == 1) {
            this.f19949c.f20023k = i;
        }
    }

    /* renamed from: m */
    public void mo52447m(String str) {
        this.f19950d.f20050b = str;
    }

    /* renamed from: n */
    public void mo52448n(int i) {
        this.f19949c.f20037y = i;
    }

    /* renamed from: n */
    public void mo52449n(String str) {
        this.f19950d.f20051c = str;
    }

    /* renamed from: o */
    public void mo52450o(int i) {
        this.f19949c.f20038z = i;
    }

    /* renamed from: o */
    public void mo52451o(String str) {
        this.f19950d.f20052d = str;
    }

    /* renamed from: p */
    public void mo52452p(int i) {
        this.f19949c.f20024l = i;
    }

    /* renamed from: p */
    public void mo52453p(String str) {
        this.f19949c.f20017e = str;
    }

    /* renamed from: q */
    public void mo52454q(String str) {
        this.f19949c.f20016d = str;
    }

    /* renamed from: r */
    public void mo52455r(String str) {
        this.f19951e.f20057f = str;
    }

    /* renamed from: s */
    public void mo52456s(String str) {
        this.f19951e.f20058g = str;
    }

    /* renamed from: t */
    public void mo52457t(String str) {
        this.f19951e.f20056e = str;
    }

    /* renamed from: u */
    public void mo52458u(String str) {
        this.f19951e.f20059h = str;
    }

    /* renamed from: v */
    public void mo52459v(String str) {
        this.f19949c.f20018f = str;
    }
}
