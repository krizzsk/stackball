package com.yandex.mobile.ads.exo.extractor.mp4;

import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.extractor.mp4.C12194a;
import com.yandex.mobile.ads.exo.metadata.emsg.C12232a;
import com.yandex.mobile.ads.impl.C13416ik;
import com.yandex.mobile.ads.impl.de1;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.ie1;
import com.yandex.mobile.ads.impl.je1;
import com.yandex.mobile.ads.impl.jy0;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.nq0;
import com.yandex.mobile.ads.impl.w50;
import com.yandex.mobile.ads.impl.x50;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.d */
public class C12204d implements w50 {

    /* renamed from: G */
    private static final byte[] f29631G = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: H */
    private static final Format f29632H = Format.m31679a((String) null, "application/x-emsg", Long.MAX_VALUE);

    /* renamed from: A */
    private int f29633A;

    /* renamed from: B */
    private boolean f29634B;

    /* renamed from: C */
    private x50 f29635C;

    /* renamed from: D */
    private ke1[] f29636D;

    /* renamed from: E */
    private ke1[] f29637E;

    /* renamed from: F */
    private boolean f29638F;

    /* renamed from: a */
    private final int f29639a;

    /* renamed from: b */
    private final List<Format> f29640b;

    /* renamed from: c */
    private final SparseArray<C12206b> f29641c;

    /* renamed from: d */
    private final fy0 f29642d;

    /* renamed from: e */
    private final fy0 f29643e;

    /* renamed from: f */
    private final fy0 f29644f;

    /* renamed from: g */
    private final byte[] f29645g;

    /* renamed from: h */
    private final fy0 f29646h;

    /* renamed from: i */
    private final C12232a f29647i;

    /* renamed from: j */
    private final fy0 f29648j;

    /* renamed from: k */
    private final ArrayDeque<C12194a.C12195a> f29649k;

    /* renamed from: l */
    private final ArrayDeque<C12205a> f29650l;

    /* renamed from: m */
    private final ke1 f29651m;

    /* renamed from: n */
    private int f29652n;

    /* renamed from: o */
    private int f29653o;

    /* renamed from: p */
    private long f29654p;

    /* renamed from: q */
    private int f29655q;

    /* renamed from: r */
    private fy0 f29656r;

    /* renamed from: s */
    private long f29657s;

    /* renamed from: t */
    private int f29658t;

    /* renamed from: u */
    private long f29659u;

    /* renamed from: v */
    private long f29660v;

    /* renamed from: w */
    private long f29661w;

    /* renamed from: x */
    private C12206b f29662x;

    /* renamed from: y */
    private int f29663y;

    /* renamed from: z */
    private int f29664z;

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.d$a */
    private static final class C12205a {

        /* renamed from: a */
        public final long f29665a;

        /* renamed from: b */
        public final int f29666b;

        public C12205a(long j, int i) {
            this.f29665a = j;
            this.f29666b = i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.extractor.mp4.d$b */
    private static final class C12206b {

        /* renamed from: a */
        public final ke1 f29667a;

        /* renamed from: b */
        public final C12212i f29668b = new C12212i();

        /* renamed from: c */
        public final fy0 f29669c = new fy0();

        /* renamed from: d */
        public ie1 f29670d;

        /* renamed from: e */
        public C12203c f29671e;

        /* renamed from: f */
        public int f29672f;

        /* renamed from: g */
        public int f29673g;

        /* renamed from: h */
        public int f29674h;

        /* renamed from: i */
        public int f29675i;

        /* renamed from: j */
        private final fy0 f29676j = new fy0(1);

        /* renamed from: k */
        private final fy0 f29677k = new fy0();

        public C12206b(ke1 ke1) {
            this.f29667a = ke1;
        }

        /* renamed from: a */
        public void mo64894a(ie1 ie1, C12203c cVar) {
            ie1.getClass();
            this.f29670d = ie1;
            cVar.getClass();
            this.f29671e = cVar;
            this.f29667a.mo65339a(ie1.f34838f);
            mo64896c();
        }

        /* renamed from: c */
        public void mo64896c() {
            C12212i iVar = this.f29668b;
            iVar.f29708d = 0;
            iVar.f29722r = 0;
            iVar.f29716l = false;
            iVar.f29721q = false;
            iVar.f29718n = null;
            this.f29672f = 0;
            this.f29674h = 0;
            this.f29673g = 0;
            this.f29675i = 0;
        }

        /* renamed from: b */
        public boolean mo64895b() {
            this.f29672f++;
            int i = this.f29673g + 1;
            this.f29673g = i;
            int[] iArr = this.f29668b.f29711g;
            int i2 = this.f29674h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f29674h = i2 + 1;
            this.f29673g = 0;
            return false;
        }

        /* renamed from: a */
        public int mo64893a(int i, int i2) {
            fy0 fy0;
            je1 a = m31831a();
            if (a == null) {
                return 0;
            }
            int i3 = a.f35271d;
            if (i3 != 0) {
                fy0 = this.f29668b.f29720p;
            } else {
                byte[] bArr = a.f35272e;
                this.f29677k.mo67103a(bArr, bArr.length);
                fy0 fy02 = this.f29677k;
                i3 = bArr.length;
                fy0 = fy02;
            }
            C12212i iVar = this.f29668b;
            boolean z = iVar.f29716l && iVar.f29717m[this.f29672f];
            boolean z2 = z || i2 != 0;
            fy0 fy03 = this.f29676j;
            fy03.f33778a[0] = (byte) ((z2 ? 128 : 0) | i3);
            fy03.mo67112e(0);
            this.f29667a.mo65341a(this.f29676j, 1);
            this.f29667a.mo65341a(fy0, i3);
            if (!z2) {
                return i3 + 1;
            }
            if (!z) {
                this.f29669c.mo67108c(8);
                fy0 fy04 = this.f29669c;
                byte[] bArr2 = fy04.f33778a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i2 >> 8) & 255);
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                this.f29667a.mo65341a(fy04, 8);
                return i3 + 1 + 8;
            }
            fy0 fy05 = this.f29668b.f29720p;
            int x = fy05.mo67132x();
            fy05.mo67114f(-2);
            int i4 = (x * 6) + 2;
            if (i2 != 0) {
                this.f29669c.mo67108c(i4);
                this.f29669c.mo67104a(fy05.f33778a, 0, i4);
                fy05.mo67114f(i4);
                fy05 = this.f29669c;
                byte[] bArr3 = fy05.f33778a;
                int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
                bArr3[2] = (byte) ((i5 >> 8) & 255);
                bArr3[3] = (byte) (i5 & 255);
            }
            this.f29667a.mo65341a(fy05, i4);
            return i3 + 1 + i4;
        }

        /* renamed from: a */
        static void m31832a(C12206b bVar) {
            je1 a = bVar.m31831a();
            if (a != null) {
                fy0 fy0 = bVar.f29668b.f29720p;
                int i = a.f35271d;
                if (i != 0) {
                    fy0.mo67114f(i);
                }
                C12212i iVar = bVar.f29668b;
                if (iVar.f29716l && iVar.f29717m[bVar.f29672f]) {
                    fy0.mo67114f(fy0.mo67132x() * 6);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public je1 m31831a() {
            C12212i iVar = this.f29668b;
            int i = iVar.f29705a.f29627a;
            je1 je1 = iVar.f29718n;
            if (je1 == null) {
                je1 = this.f29670d.mo67778a(i);
            }
            if (je1 == null || !je1.f35268a) {
                return null;
            }
            return je1;
        }
    }

    static {
        $$Lambda$d$DCUFRA2giLXKzgn1NR2Ia4R7nE r0 = $$Lambda$d$DCUFRA2giLXKzgn1NR2Ia4R7nE.INSTANCE;
    }

    public C12204d(int i) {
        this(i, (de1) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static w50[] m31825b() {
        return new w50[]{new C12204d(0)};
    }

    /* renamed from: c */
    private void m31826c() {
        int i;
        if (this.f29636D == null) {
            ke1[] ke1Arr = new ke1[2];
            this.f29636D = ke1Arr;
            ke1 ke1 = this.f29651m;
            if (ke1 != null) {
                ke1Arr[0] = ke1;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.f29639a & 4) != 0) {
                ke1Arr[i] = this.f29635C.mo65304a(this.f29641c.size(), 4);
                i++;
            }
            ke1[] ke1Arr2 = (ke1[]) Arrays.copyOf(this.f29636D, i);
            this.f29636D = ke1Arr2;
            for (ke1 a : ke1Arr2) {
                a.mo65339a(f29632H);
            }
        }
        if (this.f29637E == null) {
            this.f29637E = new ke1[this.f29640b.size()];
            for (int i2 = 0; i2 < this.f29637E.length; i2++) {
                ke1 a2 = this.f29635C.mo65304a(this.f29641c.size() + 1 + i2, 3);
                a2.mo65339a(this.f29640b.get(i2));
                this.f29637E[i2] = a2;
            }
        }
    }

    /* renamed from: a */
    public boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        return C12211h.m31857a(ikVar);
    }

    public void release() {
    }

    public C12204d(int i, de1 de1) {
        this(i, (de1) null, (ie1) null, Collections.emptyList());
    }

    /* renamed from: a */
    public void mo64890a(x50 x50) {
        this.f29635C = x50;
    }

    public C12204d(int i, de1 de1, ie1 ie1, List<Format> list) {
        this(i, de1, (ie1) null, list, (ke1) null);
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        int size = this.f29641c.size();
        for (int i = 0; i < size; i++) {
            this.f29641c.valueAt(i).mo64896c();
        }
        this.f29650l.clear();
        this.f29658t = 0;
        this.f29659u = j2;
        this.f29649k.clear();
        m31822a();
    }

    public C12204d(int i, de1 de1, ie1 ie1, List<Format> list, ke1 ke1) {
        this.f29639a = i | (ie1 != null ? 8 : 0);
        this.f29640b = Collections.unmodifiableList(list);
        this.f29651m = null;
        this.f29647i = new C12232a();
        this.f29648j = new fy0(16);
        this.f29642d = new fy0(nq0.f37879a);
        this.f29643e = new fy0(5);
        this.f29644f = new fy0();
        byte[] bArr = new byte[16];
        this.f29645g = bArr;
        this.f29646h = new fy0(bArr);
        this.f29649k = new ArrayDeque<>();
        this.f29650l = new ArrayDeque<>();
        this.f29641c = new SparseArray<>();
        this.f29660v = -9223372036854775807L;
        this.f29659u = -9223372036854775807L;
        this.f29661w = -9223372036854775807L;
        m31822a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:275:0x0279 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x06c5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo64888a(com.yandex.mobile.ads.impl.C13416ik r27, com.yandex.mobile.ads.impl.r01 r28) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
        L_0x0004:
            int r2 = r0.f29652n
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r6 = 0
            r8 = 1
            if (r2 == 0) goto L_0x04e9
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x02d5
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x027b
            if (r2 != r12) goto L_0x0103
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            if (r2 != 0) goto L_0x0085
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r2 = r0.f29641c
            int r13 = r2.size()
            r15 = r6
            r14 = 0
        L_0x002b:
            if (r14 >= r13) goto L_0x004d
            java.lang.Object r16 = r2.valueAt(r14)
            r5 = r16
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r5 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b) r5
            int r11 = r5.f29674h
            com.yandex.mobile.ads.exo.extractor.mp4.i r9 = r5.f29668b
            int r7 = r9.f29708d
            if (r11 != r7) goto L_0x003e
            goto L_0x0049
        L_0x003e:
            long[] r7 = r9.f29710f
            r19 = r7[r11]
            int r7 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0049
            r15 = r5
            r3 = r19
        L_0x0049:
            int r14 = r14 + 1
            r5 = 2
            goto L_0x002b
        L_0x004d:
            if (r15 != 0) goto L_0x006a
            long r2 = r0.f29657s
            long r4 = r27.mo67811c()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0062
            r1.mo67813d(r3)
            r26.m31822a()
            r8 = 0
            goto L_0x0277
        L_0x0062:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>(r2)
            throw r1
        L_0x006a:
            com.yandex.mobile.ads.exo.extractor.mp4.i r2 = r15.f29668b
            long[] r2 = r2.f29710f
            int r3 = r15.f29674h
            r3 = r2[r3]
            long r13 = r27.mo67811c()
            long r3 = r3 - r13
            int r2 = (int) r3
            if (r2 >= 0) goto L_0x0080
            java.lang.String r2 = "Ignoring negative offset to sample data."
            android.util.Log.w(r10, r2)
            r2 = 0
        L_0x0080:
            r1.mo67813d(r2)
            r0.f29662x = r15
        L_0x0085:
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            com.yandex.mobile.ads.exo.extractor.mp4.i r3 = r2.f29668b
            int[] r3 = r3.f29712h
            int r4 = r2.f29672f
            r3 = r3[r4]
            r0.f29663y = r3
            int r5 = r2.f29675i
            if (r4 >= r5) goto L_0x00ab
            r1.mo67813d(r3)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b.m31832a(r2)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            boolean r2 = r2.mo64895b()
            if (r2 != 0) goto L_0x00a7
            r0.f29662x = r6
        L_0x00a7:
            r0.f29652n = r12
            goto L_0x0277
        L_0x00ab:
            com.yandex.mobile.ads.impl.ie1 r2 = r2.f29670d
            int r2 = r2.f34839g
            if (r2 != r8) goto L_0x00ba
            int r3 = r3 + -8
            r0.f29663y = r3
            r2 = 8
            r1.mo67813d(r2)
        L_0x00ba:
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            com.yandex.mobile.ads.impl.ie1 r2 = r2.f29670d
            com.yandex.mobile.ads.exo.Format r2 = r2.f34838f
            java.lang.String r2 = r2.f29530j
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00ec
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            int r3 = r0.f29663y
            r4 = 7
            int r2 = r2.mo64893a((int) r3, (int) r4)
            r0.f29664z = r2
            int r2 = r0.f29663y
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29646h
            com.yandex.mobile.ads.impl.C13266h.m36738a(r2, r3)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            com.yandex.mobile.ads.impl.ke1 r2 = r2.f29667a
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29646h
            r2.mo65341a(r3, r4)
            int r2 = r0.f29664z
            int r2 = r2 + r4
            r0.f29664z = r2
            r4 = 0
            goto L_0x00f7
        L_0x00ec:
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            int r3 = r0.f29663y
            r4 = 0
            int r2 = r2.mo64893a((int) r3, (int) r4)
            r0.f29664z = r2
        L_0x00f7:
            int r2 = r0.f29663y
            int r3 = r0.f29664z
            int r2 = r2 + r3
            r0.f29663y = r2
            r2 = 4
            r0.f29652n = r2
            r0.f29633A = r4
        L_0x0103:
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            com.yandex.mobile.ads.exo.extractor.mp4.i r3 = r2.f29668b
            com.yandex.mobile.ads.impl.ie1 r4 = r2.f29670d
            com.yandex.mobile.ads.impl.ke1 r5 = r2.f29667a
            int r2 = r2.f29672f
            long[] r7 = r3.f29714j
            r9 = r7[r2]
            int[] r7 = r3.f29713i
            r7 = r7[r2]
            long r13 = (long) r7
            long r9 = r9 + r13
            int r7 = r4.f34842j
            if (r7 == 0) goto L_0x01f9
            com.yandex.mobile.ads.impl.fy0 r11 = r0.f29643e
            byte[] r11 = r11.f33778a
            r13 = 0
            r11[r13] = r13
            r11[r8] = r13
            r14 = 2
            r11[r14] = r13
            int r13 = r7 + 1
            int r7 = 4 - r7
        L_0x012b:
            int r14 = r0.f29664z
            int r15 = r0.f29663y
            if (r14 >= r15) goto L_0x020b
            int r14 = r0.f29633A
            java.lang.String r15 = "video/hevc"
            if (r14 != 0) goto L_0x01a2
            r12 = 0
            r1.mo67809b(r11, r7, r13, r12)
            com.yandex.mobile.ads.impl.fy0 r14 = r0.f29643e
            r14.mo67112e(r12)
            com.yandex.mobile.ads.impl.fy0 r14 = r0.f29643e
            int r14 = r14.mo67113f()
            if (r14 < r8) goto L_0x019a
            int r14 = r14 + -1
            r0.f29633A = r14
            com.yandex.mobile.ads.impl.fy0 r14 = r0.f29642d
            r14.mo67112e(r12)
            com.yandex.mobile.ads.impl.fy0 r12 = r0.f29642d
            r14 = 4
            r5.mo65341a(r12, r14)
            com.yandex.mobile.ads.impl.fy0 r12 = r0.f29643e
            r5.mo65341a(r12, r8)
            com.yandex.mobile.ads.impl.ke1[] r12 = r0.f29637E
            int r12 = r12.length
            if (r12 <= 0) goto L_0x018a
            com.yandex.mobile.ads.exo.Format r12 = r4.f34838f
            java.lang.String r12 = r12.f29530j
            byte r18 = r11[r14]
            byte[] r14 = com.yandex.mobile.ads.impl.nq0.f37879a
            java.lang.String r14 = "video/avc"
            boolean r14 = r14.equals(r12)
            if (r14 == 0) goto L_0x0176
            r14 = r18 & 31
            r6 = 6
            if (r14 == r6) goto L_0x0183
        L_0x0176:
            boolean r6 = r15.equals(r12)
            if (r6 == 0) goto L_0x0185
            r6 = r18 & 126(0x7e, float:1.77E-43)
            int r6 = r6 >> r8
            r12 = 39
            if (r6 != r12) goto L_0x0185
        L_0x0183:
            r6 = 1
            goto L_0x0186
        L_0x0185:
            r6 = 0
        L_0x0186:
            if (r6 == 0) goto L_0x018a
            r6 = 1
            goto L_0x018b
        L_0x018a:
            r6 = 0
        L_0x018b:
            r0.f29634B = r6
            int r6 = r0.f29664z
            int r6 = r6 + 5
            r0.f29664z = r6
            int r6 = r0.f29663y
            int r6 = r6 + r7
            r0.f29663y = r6
            r6 = 0
            goto L_0x01f6
        L_0x019a:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Invalid NAL length"
            r1.<init>(r2)
            throw r1
        L_0x01a2:
            boolean r6 = r0.f29634B
            if (r6 == 0) goto L_0x01e4
            com.yandex.mobile.ads.impl.fy0 r6 = r0.f29644f
            r6.mo67108c(r14)
            com.yandex.mobile.ads.impl.fy0 r6 = r0.f29644f
            byte[] r6 = r6.f33778a
            int r12 = r0.f29633A
            r14 = 0
            r1.mo67809b(r6, r14, r12, r14)
            com.yandex.mobile.ads.impl.fy0 r6 = r0.f29644f
            int r12 = r0.f29633A
            r5.mo65341a(r6, r12)
            int r6 = r0.f29633A
            com.yandex.mobile.ads.impl.fy0 r12 = r0.f29644f
            byte[] r14 = r12.f33778a
            int r12 = r12.mo67107c()
            int r12 = com.yandex.mobile.ads.impl.nq0.m40145a(r14, r12)
            com.yandex.mobile.ads.impl.fy0 r14 = r0.f29644f
            com.yandex.mobile.ads.exo.Format r8 = r4.f34838f
            java.lang.String r8 = r8.f29530j
            boolean r8 = r15.equals(r8)
            r14.mo67112e(r8)
            com.yandex.mobile.ads.impl.fy0 r8 = r0.f29644f
            r8.mo67110d(r12)
            com.yandex.mobile.ads.impl.fy0 r8 = r0.f29644f
            com.yandex.mobile.ads.impl.ke1[] r12 = r0.f29637E
            com.yandex.mobile.ads.impl.C14457re.m41571a(r9, r8, r12)
            goto L_0x01ea
        L_0x01e4:
            r6 = 0
            int r8 = r5.mo65335a(r1, r14, r6)
            r6 = r8
        L_0x01ea:
            int r8 = r0.f29664z
            int r8 = r8 + r6
            r0.f29664z = r8
            int r8 = r0.f29633A
            int r8 = r8 - r6
            r0.f29633A = r8
            r6 = 0
            r8 = 1
        L_0x01f6:
            r12 = 3
            goto L_0x012b
        L_0x01f9:
            int r4 = r0.f29664z
            int r6 = r0.f29663y
            if (r4 >= r6) goto L_0x020b
            int r6 = r6 - r4
            r4 = 0
            int r6 = r5.mo65335a(r1, r6, r4)
            int r4 = r0.f29664z
            int r4 = r4 + r6
            r0.f29664z = r4
            goto L_0x01f9
        L_0x020b:
            boolean[] r3 = r3.f29715k
            boolean r2 = r3[r2]
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r3 = r0.f29662x
            com.yandex.mobile.ads.impl.je1 r3 = r3.m31831a()
            if (r3 == 0) goto L_0x0221
            r4 = 1073741824(0x40000000, float:2.0)
            r2 = r2 | r4
            com.yandex.mobile.ads.impl.ke1$a r3 = r3.f35270c
            r21 = r2
            r24 = r3
            goto L_0x0225
        L_0x0221:
            r21 = r2
            r24 = 0
        L_0x0225:
            int r2 = r0.f29663y
            r23 = 0
            r18 = r5
            r19 = r9
            r22 = r2
            r18.mo65337a(r19, r21, r22, r23, r24)
        L_0x0232:
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.d$a> r2 = r0.f29650l
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0268
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.d$a> r2 = r0.f29650l
            java.lang.Object r2 = r2.removeFirst()
            com.yandex.mobile.ads.exo.extractor.mp4.d$a r2 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12205a) r2
            int r3 = r0.f29658t
            int r4 = r2.f29666b
            int r3 = r3 - r4
            r0.f29658t = r3
            long r3 = r2.f29665a
            long r3 = r3 + r9
            com.yandex.mobile.ads.impl.ke1[] r5 = r0.f29636D
            int r6 = r5.length
            r7 = 0
        L_0x0250:
            if (r7 >= r6) goto L_0x0232
            r18 = r5[r7]
            int r8 = r2.f29666b
            int r11 = r0.f29658t
            r21 = 1
            r24 = 0
            r19 = r3
            r22 = r8
            r23 = r11
            r18.mo65337a(r19, r21, r22, r23, r24)
            int r7 = r7 + 1
            goto L_0x0250
        L_0x0268:
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r2 = r0.f29662x
            boolean r2 = r2.mo64895b()
            if (r2 != 0) goto L_0x0273
            r2 = 0
            r0.f29662x = r2
        L_0x0273:
            r2 = 3
            r0.f29652n = r2
            r8 = 1
        L_0x0277:
            if (r8 == 0) goto L_0x0004
            r2 = 0
            return r2
        L_0x027b:
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r2 = r0.f29641c
            int r2 = r2.size()
            r5 = 0
            r6 = 0
        L_0x0283:
            if (r5 >= r2) goto L_0x02a6
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r7 = r0.f29641c
            java.lang.Object r7 = r7.valueAt(r5)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r7 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b) r7
            com.yandex.mobile.ads.exo.extractor.mp4.i r7 = r7.f29668b
            boolean r8 = r7.f29721q
            if (r8 == 0) goto L_0x02a3
            long r7 = r7.f29707c
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x02a3
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r3 = r0.f29641c
            java.lang.Object r3 = r3.valueAt(r5)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r3 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b) r3
            r6 = r3
            r3 = r7
        L_0x02a3:
            int r5 = r5 + 1
            goto L_0x0283
        L_0x02a6:
            if (r6 != 0) goto L_0x02ad
            r2 = 3
            r0.f29652n = r2
            goto L_0x0004
        L_0x02ad:
            long r7 = r27.mo67811c()
            long r3 = r3 - r7
            int r2 = (int) r3
            if (r2 < 0) goto L_0x02cd
            r1.mo67813d(r2)
            com.yandex.mobile.ads.exo.extractor.mp4.i r2 = r6.f29668b
            com.yandex.mobile.ads.impl.fy0 r3 = r2.f29720p
            byte[] r3 = r3.f33778a
            int r4 = r2.f29719o
            r5 = 0
            r1.mo67809b(r3, r5, r4, r5)
            com.yandex.mobile.ads.impl.fy0 r3 = r2.f29720p
            r3.mo67112e(r5)
            r2.f29721q = r5
            goto L_0x0004
        L_0x02cd:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>(r2)
            throw r1
        L_0x02d5:
            long r5 = r0.f29654p
            int r2 = (int) r5
            int r5 = r0.f29655q
            int r2 = r2 - r5
            com.yandex.mobile.ads.impl.fy0 r5 = r0.f29656r
            if (r5 == 0) goto L_0x04dd
            byte[] r5 = r5.f33778a
            r6 = 8
            r7 = 0
            r1.mo67809b(r5, r6, r2, r7)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r2 = new com.yandex.mobile.ads.exo.extractor.mp4.a$b
            int r5 = r0.f29653o
            com.yandex.mobile.ads.impl.fy0 r6 = r0.f29656r
            r2.<init>(r5, r6)
            long r7 = r27.mo67811c()
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r9 = r0.f29649k
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x030b
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r3 = r0.f29649k
            java.lang.Object r3 = r3.peek()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r3 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r3
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$b> r3 = r3.f29602c
            r3.add(r2)
            goto L_0x04e0
        L_0x030b:
            if (r5 != r4) goto L_0x03cb
            r2 = 8
            r6.mo67112e(r2)
            int r2 = r6.mo67113f()
            int r2 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r2)
            r3 = 4
            r6.mo67114f(r3)
            long r3 = r6.mo67128t()
            if (r2 != 0) goto L_0x032d
            long r9 = r6.mo67128t()
            long r11 = r6.mo67128t()
            goto L_0x0335
        L_0x032d:
            long r9 = r6.mo67131w()
            long r11 = r6.mo67131w()
        L_0x0335:
            long r7 = r7 + r11
            r18 = r9
            r11 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r18
            r13 = r3
            long r20 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r9, (long) r11, (long) r13)
            r2 = 2
            r6.mo67114f(r2)
            int r2 = r6.mo67132x()
            int[] r5 = new int[r2]
            long[] r15 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r9 = r20
            r11 = 0
        L_0x0355:
            if (r11 >= r2) goto L_0x03a4
            int r12 = r6.mo67113f()
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = r12 & r17
            if (r17 != 0) goto L_0x039c
            long r22 = r6.mo67128t()
            r17 = 2147483647(0x7fffffff, float:NaN)
            r12 = r12 & r17
            r5[r11] = r12
            r15[r11] = r7
            r14[r11] = r9
            long r18 = r18 + r22
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r18
            r17 = r11
            r11 = r22
            r28 = r2
            r2 = r13
            r1 = r14
            r13 = r3
            long r9 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r9, (long) r11, (long) r13)
            r11 = r1[r17]
            long r11 = r9 - r11
            r2[r17] = r11
            r11 = 4
            r6.mo67114f(r11)
            r12 = r5[r17]
            long r12 = (long) r12
            long r7 = r7 + r12
            int r12 = r17 + 1
            r14 = r1
            r13 = r2
            r11 = r12
            r1 = r27
            r2 = r28
            goto L_0x0355
        L_0x039c:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>(r2)
            throw r1
        L_0x03a4:
            r2 = r13
            r1 = r14
            java.lang.Long r3 = java.lang.Long.valueOf(r20)
            com.yandex.mobile.ads.impl.we r4 = new com.yandex.mobile.ads.impl.we
            r4.<init>(r5, r15, r2, r1)
            android.util.Pair r1 = android.util.Pair.create(r3, r4)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f29661w = r2
            com.yandex.mobile.ads.impl.x50 r2 = r0.f29635C
            java.lang.Object r1 = r1.second
            com.yandex.mobile.ads.impl.s71 r1 = (com.yandex.mobile.ads.impl.s71) r1
            r2.mo65309a(r1)
            r1 = 1
            r0.f29638F = r1
            goto L_0x04da
        L_0x03cb:
            if (r5 != r3) goto L_0x04da
            com.yandex.mobile.ads.impl.ke1[] r1 = r0.f29636D
            if (r1 == 0) goto L_0x04da
            int r1 = r1.length
            if (r1 != 0) goto L_0x03d6
            goto L_0x04da
        L_0x03d6:
            r1 = 8
            r6.mo67112e(r1)
            int r1 = r6.mo67113f()
            int r1 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x043a
            r4 = 1
            if (r1 == r4) goto L_0x0403
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r10, r1)
            goto L_0x04da
        L_0x0403:
            long r4 = r6.mo67128t()
            long r11 = r6.mo67131w()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r4
            long r7 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r11, (long) r13, (long) r15)
            long r11 = r6.mo67128t()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r4 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r11, (long) r13, (long) r15)
            long r9 = r6.mo67128t()
            java.lang.String r1 = r6.mo67123o()
            r1.getClass()
            java.lang.String r11 = r6.mo67123o()
            r11.getClass()
            r19 = r1
            r21 = r4
            r4 = r7
            r23 = r9
            r20 = r11
            r7 = r2
            goto L_0x047b
        L_0x043a:
            java.lang.String r1 = r6.mo67123o()
            r1.getClass()
            java.lang.String r11 = r6.mo67123o()
            r11.getClass()
            long r4 = r6.mo67128t()
            long r18 = r6.mo67128t()
            r20 = 1000000(0xf4240, double:4.940656E-318)
            r22 = r4
            long r7 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r18, (long) r20, (long) r22)
            long r9 = r0.f29661w
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x0461
            long r9 = r9 + r7
            goto L_0x0462
        L_0x0461:
            r9 = r2
        L_0x0462:
            long r18 = r6.mo67128t()
            r20 = 1000(0x3e8, double:4.94E-321)
            r22 = r4
            long r4 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r18, (long) r20, (long) r22)
            long r12 = r6.mo67128t()
            r19 = r1
            r21 = r4
            r4 = r9
            r20 = r11
            r23 = r12
        L_0x047b:
            int r1 = r6.mo67098a()
            byte[] r1 = new byte[r1]
            int r9 = r6.mo67098a()
            r10 = 0
            r6.mo67104a(r1, r10, r9)
            com.yandex.mobile.ads.exo.metadata.emsg.EventMessage r6 = new com.yandex.mobile.ads.exo.metadata.emsg.EventMessage
            r18 = r6
            r25 = r1
            r18.<init>(r19, r20, r21, r23, r25)
            com.yandex.mobile.ads.impl.fy0 r1 = new com.yandex.mobile.ads.impl.fy0
            com.yandex.mobile.ads.exo.metadata.emsg.a r9 = r0.f29647i
            byte[] r6 = r9.mo65016a(r6)
            r1.<init>((byte[]) r6)
            int r6 = r1.mo67098a()
            com.yandex.mobile.ads.impl.ke1[] r9 = r0.f29636D
            int r10 = r9.length
            r11 = 0
        L_0x04a5:
            if (r11 >= r10) goto L_0x04b3
            r12 = r9[r11]
            r13 = 0
            r1.mo67112e(r13)
            r12.mo65341a(r1, r6)
            int r11 = r11 + 1
            goto L_0x04a5
        L_0x04b3:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x04c7
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.d$a> r1 = r0.f29650l
            com.yandex.mobile.ads.exo.extractor.mp4.d$a r2 = new com.yandex.mobile.ads.exo.extractor.mp4.d$a
            r2.<init>(r7, r6)
            r1.addLast(r2)
            int r1 = r0.f29658t
            int r1 = r1 + r6
            r0.f29658t = r1
            goto L_0x04da
        L_0x04c7:
            com.yandex.mobile.ads.impl.ke1[] r1 = r0.f29636D
            int r2 = r1.length
            r3 = 0
        L_0x04cb:
            if (r3 >= r2) goto L_0x04da
            r7 = r1[r3]
            r10 = 1
            r12 = 0
            r13 = 0
            r8 = r4
            r11 = r6
            r7.mo65337a(r8, r10, r11, r12, r13)
            int r3 = r3 + 1
            goto L_0x04cb
        L_0x04da:
            r1 = r27
            goto L_0x04e0
        L_0x04dd:
            r1.mo67813d(r2)
        L_0x04e0:
            long r2 = r27.mo67811c()
            r0.m31823a((long) r2)
            goto L_0x0004
        L_0x04e9:
            int r2 = r0.f29655q
            if (r2 != 0) goto L_0x0515
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f29648j
            byte[] r2 = r2.f33778a
            r5 = 8
            r6 = 1
            r7 = 0
            boolean r2 = r1.mo67809b(r2, r7, r5, r6)
            if (r2 != 0) goto L_0x04fe
            r8 = 0
            goto L_0x06c3
        L_0x04fe:
            r0.f29655q = r5
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f29648j
            r2.mo67112e(r7)
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f29648j
            long r5 = r2.mo67128t()
            r0.f29654p = r5
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f29648j
            int r2 = r2.mo67113f()
            r0.f29653o = r2
        L_0x0515:
            long r5 = r0.f29654p
            r7 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0535
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f29648j
            byte[] r2 = r2.f33778a
            r5 = 8
            r6 = 0
            r1.mo67809b(r2, r5, r5, r6)
            int r2 = r0.f29655q
            int r2 = r2 + r5
            r0.f29655q = r2
            com.yandex.mobile.ads.impl.fy0 r2 = r0.f29648j
            long r5 = r2.mo67131w()
            r0.f29654p = r5
            goto L_0x0566
        L_0x0535:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0566
            long r5 = r27.mo67804a()
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0557
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r2 = r0.f29649k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0557
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r2 = r0.f29649k
            java.lang.Object r2 = r2.peek()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r2 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r2
            long r5 = r2.f29601b
        L_0x0557:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0566
            long r7 = r27.mo67811c()
            long r5 = r5 - r7
            int r2 = r0.f29655q
            long r7 = (long) r2
            long r5 = r5 + r7
            r0.f29654p = r5
        L_0x0566:
            long r5 = r0.f29654p
            int r2 = r0.f29655q
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x06cf
            long r5 = r27.mo67811c()
            int r2 = r0.f29655q
            long r7 = (long) r2
            long r5 = r5 - r7
            int r2 = r0.f29653o
            r7 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 != r7) goto L_0x059b
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r2 = r0.f29641c
            int r2 = r2.size()
            r8 = 0
        L_0x0585:
            if (r8 >= r2) goto L_0x059b
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r9 = r0.f29641c
            java.lang.Object r9 = r9.valueAt(r8)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r9 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b) r9
            com.yandex.mobile.ads.exo.extractor.mp4.i r9 = r9.f29668b
            r9.getClass()
            r9.f29707c = r5
            r9.f29706b = r5
            int r8 = r8 + 1
            goto L_0x0585
        L_0x059b:
            int r2 = r0.f29653o
            r8 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r2 != r8) goto L_0x05c3
            r8 = 0
            r0.f29662x = r8
            long r2 = r0.f29654p
            long r2 = r2 + r5
            r0.f29657s = r2
            boolean r2 = r0.f29638F
            if (r2 != 0) goto L_0x05bd
            com.yandex.mobile.ads.impl.x50 r2 = r0.f29635C
            com.yandex.mobile.ads.impl.s71$b r3 = new com.yandex.mobile.ads.impl.s71$b
            long r7 = r0.f29660v
            r3.<init>(r7, r5)
            r2.mo65309a(r3)
            r2 = 1
            r0.f29638F = r2
        L_0x05bd:
            r2 = 2
            r0.f29652n = r2
        L_0x05c0:
            r8 = 1
            goto L_0x06c3
        L_0x05c3:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x05f0
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x05f0
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x05f0
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x05f0
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x05f0
            if (r2 == r7) goto L_0x05f0
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x05f0
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x05f0
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x05ee
            goto L_0x05f0
        L_0x05ee:
            r5 = 0
            goto L_0x05f1
        L_0x05f0:
            r5 = 1
        L_0x05f1:
            if (r5 == 0) goto L_0x061b
            long r2 = r27.mo67811c()
            long r4 = r0.f29654p
            long r2 = r2 + r4
            r4 = 8
            long r2 = r2 - r4
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r4 = r0.f29649k
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r5 = new com.yandex.mobile.ads.exo.extractor.mp4.a$a
            int r6 = r0.f29653o
            r5.<init>(r6, r2)
            r4.push(r5)
            long r4 = r0.f29654p
            int r6 = r0.f29655q
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0616
            r0.m31823a((long) r2)
            goto L_0x0619
        L_0x0616:
            r26.m31822a()
        L_0x0619:
            r2 = 1
            goto L_0x05c0
        L_0x061b:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            if (r2 == r5) goto L_0x067c
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x067c
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x067c
            if (r2 == r4) goto L_0x067c
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x067c
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x067c
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x067c
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x067c
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x067c
            if (r2 != r3) goto L_0x067a
            goto L_0x067c
        L_0x067a:
            r4 = 0
            goto L_0x067d
        L_0x067c:
            r4 = 1
        L_0x067d:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r4 == 0) goto L_0x06b5
            int r4 = r0.f29655q
            r5 = 8
            if (r4 != r5) goto L_0x06ad
            long r6 = r0.f29654p
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x06a5
            com.yandex.mobile.ads.impl.fy0 r2 = new com.yandex.mobile.ads.impl.fy0
            int r3 = (int) r6
            r2.<init>((int) r3)
            r0.f29656r = r2
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f29648j
            byte[] r3 = r3.f33778a
            byte[] r2 = r2.f33778a
            r4 = 0
            java.lang.System.arraycopy(r3, r4, r2, r4, r5)
            r2 = 1
            r0.f29652n = r2
            goto L_0x05c0
        L_0x06a5:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x06ad:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x06b5:
            long r4 = r0.f29654p
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x06c7
            r2 = 0
            r0.f29656r = r2
            r2 = 1
            r0.f29652n = r2
            goto L_0x05c0
        L_0x06c3:
            if (r8 != 0) goto L_0x0004
            r1 = -1
            return r1
        L_0x06c7:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>(r2)
            throw r1
        L_0x06cf:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.extractor.mp4.C12204d.mo64888a(com.yandex.mobile.ads.impl.ik, com.yandex.mobile.ads.impl.r01):int");
    }

    /* renamed from: a */
    private void m31822a() {
        this.f29652n = 0;
        this.f29655q = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0638  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31823a(long r53) throws com.yandex.mobile.ads.impl.jy0 {
        /*
            r52 = this;
            r0 = r52
        L_0x0002:
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r1 = r0.f29649k
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0740
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r1 = r0.f29649k
            java.lang.Object r1 = r1.peek()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r1 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r1
            long r1 = r1.f29601b
            int r3 = (r1 > r53 ? 1 : (r1 == r53 ? 0 : -1))
            if (r3 != 0) goto L_0x0740
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r1 = r0.f29649k
            java.lang.Object r1 = r1.pop()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r1 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r1
            int r2 = r1.f29600a
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r4 = 12
            r8 = 8
            r10 = 1
            if (r2 != r3) goto L_0x0179
            java.lang.String r2 = "Unexpected moov box."
            com.yandex.mobile.ads.impl.C13479j9.m37709b(r10, r2)
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$b> r2 = r1.f29602c
            com.yandex.mobile.ads.exo.drm.DrmInitData r2 = m31820a((java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12196b>) r2)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r3 = r1.mo64882c(r3)
            android.util.SparseArray r15 = new android.util.SparseArray
            r15.<init>()
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$b> r11 = r3.f29602c
            int r11 = r11.size()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
        L_0x004f:
            if (r12 >= r11) goto L_0x00bb
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$b> r13 = r3.f29602c
            java.lang.Object r13 = r13.get(r12)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r13 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12196b) r13
            int r14 = r13.f29600a
            r9 = 1953654136(0x74726578, float:7.6818474E31)
            if (r14 != r9) goto L_0x0097
            com.yandex.mobile.ads.impl.fy0 r9 = r13.f29604b
            r9.mo67112e(r4)
            int r13 = r9.mo67113f()
            int r14 = r9.mo67113f()
            int r14 = r14 - r10
            int r4 = r9.mo67113f()
            int r10 = r9.mo67113f()
            int r9 = r9.mo67113f()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            com.yandex.mobile.ads.exo.extractor.mp4.c r7 = new com.yandex.mobile.ads.exo.extractor.mp4.c
            r7.<init>(r14, r4, r10, r9)
            android.util.Pair r4 = android.util.Pair.create(r13, r7)
            java.lang.Object r7 = r4.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r4 = r4.second
            com.yandex.mobile.ads.exo.extractor.mp4.c r4 = (com.yandex.mobile.ads.exo.extractor.mp4.C12203c) r4
            r15.put(r7, r4)
            goto L_0x00b5
        L_0x0097:
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r14 != r4) goto L_0x00b5
            com.yandex.mobile.ads.impl.fy0 r4 = r13.f29604b
            r4.mo67112e(r8)
            int r5 = r4.mo67113f()
            int r5 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r5)
            if (r5 != 0) goto L_0x00b0
            long r4 = r4.mo67128t()
            goto L_0x00b4
        L_0x00b0:
            long r4 = r4.mo67131w()
        L_0x00b4:
            r5 = r4
        L_0x00b5:
            int r12 = r12 + 1
            r4 = 12
            r10 = 1
            goto L_0x004f
        L_0x00bb:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r4 = r1.f29603d
            int r4 = r4.size()
            r7 = 0
        L_0x00c7:
            if (r7 >= r4) goto L_0x0102
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r8 = r1.f29603d
            java.lang.Object r8 = r8.get(r7)
            r11 = r8
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r11 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r11
            int r8 = r11.f29600a
            r9 = 1953653099(0x7472616b, float:7.681346E31)
            if (r8 != r9) goto L_0x00fd
            r8 = 1836476516(0x6d766864, float:4.7662196E27)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r12 = r1.mo64883d(r8)
            int r8 = r0.f29639a
            r9 = 16
            r8 = r8 & r9
            if (r8 == 0) goto L_0x00ea
            r16 = 1
            goto L_0x00ec
        L_0x00ea:
            r16 = 0
        L_0x00ec:
            r17 = 0
            r13 = r5
            r8 = r15
            r15 = r2
            com.yandex.mobile.ads.impl.ie1 r9 = com.yandex.mobile.ads.exo.extractor.mp4.C12197b.m31805a(r11, r12, r13, r15, r16, r17)
            if (r9 == 0) goto L_0x00fe
            int r10 = r9.f34833a
            r3.put(r10, r9)
            goto L_0x00fe
        L_0x00fd:
            r8 = r15
        L_0x00fe:
            int r7 = r7 + 1
            r15 = r8
            goto L_0x00c7
        L_0x0102:
            r8 = r15
            int r1 = r3.size()
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r2 = r0.f29641c
            int r2 = r2.size()
            if (r2 != 0) goto L_0x014c
            r9 = 0
        L_0x0110:
            if (r9 >= r1) goto L_0x0142
            java.lang.Object r2 = r3.valueAt(r9)
            com.yandex.mobile.ads.impl.ie1 r2 = (com.yandex.mobile.ads.impl.ie1) r2
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r4 = new com.yandex.mobile.ads.exo.extractor.mp4.d$b
            com.yandex.mobile.ads.impl.x50 r5 = r0.f29635C
            int r6 = r2.f34834b
            com.yandex.mobile.ads.impl.ke1 r5 = r5.mo65304a(r9, r6)
            r4.<init>(r5)
            int r5 = r2.f34833a
            com.yandex.mobile.ads.exo.extractor.mp4.c r5 = r0.m31821a((android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.C12203c>) r8, (int) r5)
            r4.mo64894a((com.yandex.mobile.ads.impl.ie1) r2, (com.yandex.mobile.ads.exo.extractor.mp4.C12203c) r5)
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r5 = r0.f29641c
            int r6 = r2.f34833a
            r5.put(r6, r4)
            long r4 = r0.f29660v
            long r6 = r2.f34837e
            long r4 = java.lang.Math.max(r4, r6)
            r0.f29660v = r4
            int r9 = r9 + 1
            goto L_0x0110
        L_0x0142:
            r52.m31826c()
            com.yandex.mobile.ads.impl.x50 r1 = r0.f29635C
            r1.mo65311c()
            goto L_0x0002
        L_0x014c:
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r2 = r0.f29641c
            int r2 = r2.size()
            if (r2 != r1) goto L_0x0156
            r10 = 1
            goto L_0x0157
        L_0x0156:
            r10 = 0
        L_0x0157:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r10)
            r9 = 0
        L_0x015b:
            if (r9 >= r1) goto L_0x0002
            java.lang.Object r2 = r3.valueAt(r9)
            com.yandex.mobile.ads.impl.ie1 r2 = (com.yandex.mobile.ads.impl.ie1) r2
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r4 = r0.f29641c
            int r5 = r2.f34833a
            java.lang.Object r4 = r4.get(r5)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r4 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b) r4
            int r5 = r2.f34833a
            com.yandex.mobile.ads.exo.extractor.mp4.c r5 = r0.m31821a((android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.C12203c>) r8, (int) r5)
            r4.mo64894a((com.yandex.mobile.ads.impl.ie1) r2, (com.yandex.mobile.ads.exo.extractor.mp4.C12203c) r5)
            int r9 = r9 + 1
            goto L_0x015b
        L_0x0179:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 != r3) goto L_0x0727
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r2 = r0.f29641c
            int r3 = r0.f29639a
            byte[] r4 = r0.f29645g
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r7 = r1.f29603d
            int r7 = r7.size()
            r9 = 0
        L_0x018b:
            if (r9 >= r7) goto L_0x0699
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r11 = r1.f29603d
            java.lang.Object r11 = r11.get(r9)
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r11 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r11
            int r12 = r11.f29600a
            r13 = 1953653094(0x74726166, float:7.6813435E31)
            if (r12 != r13) goto L_0x0677
            r12 = 1952868452(0x74666864, float:7.301914E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r12 = r11.mo64883d(r12)
            com.yandex.mobile.ads.impl.fy0 r12 = r12.f29604b
            r12.mo67112e(r8)
            int r13 = r12.mo67113f()
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r14
            int r15 = r12.mo67113f()
            int r10 = r2.size()
            r5 = 1
            if (r10 != r5) goto L_0x01c3
            r5 = 0
            java.lang.Object r6 = r2.valueAt(r5)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r6 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b) r6
            goto L_0x01ca
        L_0x01c3:
            java.lang.Object r5 = r2.get(r15)
            r6 = r5
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r6 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b) r6
        L_0x01ca:
            if (r6 != 0) goto L_0x01ce
            r6 = 0
            goto L_0x0217
        L_0x01ce:
            r5 = r13 & 1
            if (r5 == 0) goto L_0x01dc
            long r14 = r12.mo67131w()
            com.yandex.mobile.ads.exo.extractor.mp4.i r10 = r6.f29668b
            r10.f29706b = r14
            r10.f29707c = r14
        L_0x01dc:
            com.yandex.mobile.ads.exo.extractor.mp4.c r10 = r6.f29671e
            r14 = r13 & 2
            if (r14 == 0) goto L_0x01e9
            int r14 = r12.mo67113f()
            r15 = 1
            int r14 = r14 - r15
            goto L_0x01eb
        L_0x01e9:
            int r14 = r10.f29627a
        L_0x01eb:
            r15 = r13 & 8
            if (r15 == 0) goto L_0x01f4
            int r15 = r12.mo67113f()
            goto L_0x01f6
        L_0x01f4:
            int r15 = r10.f29628b
        L_0x01f6:
            r18 = r13 & 16
            if (r18 == 0) goto L_0x0201
            int r18 = r12.mo67113f()
            r5 = r18
            goto L_0x0203
        L_0x0201:
            int r5 = r10.f29629c
        L_0x0203:
            r13 = r13 & 32
            if (r13 == 0) goto L_0x020c
            int r10 = r12.mo67113f()
            goto L_0x020e
        L_0x020c:
            int r10 = r10.f29630d
        L_0x020e:
            com.yandex.mobile.ads.exo.extractor.mp4.i r12 = r6.f29668b
            com.yandex.mobile.ads.exo.extractor.mp4.c r13 = new com.yandex.mobile.ads.exo.extractor.mp4.c
            r13.<init>(r14, r15, r5, r10)
            r12.f29705a = r13
        L_0x0217:
            if (r6 != 0) goto L_0x021b
            goto L_0x0677
        L_0x021b:
            com.yandex.mobile.ads.exo.extractor.mp4.i r10 = r6.f29668b
            long r12 = r10.f29722r
            r6.mo64896c()
            r5 = 1952867444(0x74666474, float:7.3014264E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r14 = r11.mo64883d(r5)
            if (r14 == 0) goto L_0x024c
            r14 = r3 & 2
            if (r14 != 0) goto L_0x024c
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r5 = r11.mo64883d(r5)
            com.yandex.mobile.ads.impl.fy0 r5 = r5.f29604b
            r5.mo67112e(r8)
            int r12 = r5.mo67113f()
            int r12 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r12)
            r13 = 1
            if (r12 != r13) goto L_0x0248
            long r12 = r5.mo67131w()
            goto L_0x024c
        L_0x0248:
            long r12 = r5.mo67128t()
        L_0x024c:
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$b> r14 = r11.f29602c
            int r15 = r14.size()
            r19 = r2
            r20 = r7
            r2 = 0
            r5 = 0
            r8 = 0
        L_0x0259:
            r7 = 1953658222(0x7472756e, float:7.683823E31)
            if (r5 >= r15) goto L_0x0284
            java.lang.Object r21 = r14.get(r5)
            r22 = r12
            r12 = r21
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r12 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12196b) r12
            int r13 = r12.f29600a
            if (r13 != r7) goto L_0x027d
            com.yandex.mobile.ads.impl.fy0 r7 = r12.f29604b
            r12 = 12
            r7.mo67112e(r12)
            int r7 = r7.mo67130v()
            if (r7 <= 0) goto L_0x027f
            int r2 = r2 + r7
            int r8 = r8 + 1
            goto L_0x027f
        L_0x027d:
            r12 = 12
        L_0x027f:
            int r5 = r5 + 1
            r12 = r22
            goto L_0x0259
        L_0x0284:
            r22 = r12
            r5 = 0
            r12 = 12
            r6.f29674h = r5
            r6.f29673g = r5
            r6.f29672f = r5
            com.yandex.mobile.ads.exo.extractor.mp4.i r5 = r6.f29668b
            r5.f29708d = r8
            r5.f29709e = r2
            int[] r13 = r5.f29711g
            if (r13 == 0) goto L_0x029c
            int r13 = r13.length
            if (r13 >= r8) goto L_0x02a4
        L_0x029c:
            long[] r13 = new long[r8]
            r5.f29710f = r13
            int[] r8 = new int[r8]
            r5.f29711g = r8
        L_0x02a4:
            int[] r8 = r5.f29712h
            if (r8 == 0) goto L_0x02ab
            int r8 = r8.length
            if (r8 >= r2) goto L_0x02c3
        L_0x02ab:
            int r2 = r2 * 125
            int r2 = r2 / 100
            int[] r8 = new int[r2]
            r5.f29712h = r8
            int[] r8 = new int[r2]
            r5.f29713i = r8
            long[] r8 = new long[r2]
            r5.f29714j = r8
            boolean[] r8 = new boolean[r2]
            r5.f29715k = r8
            boolean[] r2 = new boolean[r2]
            r5.f29717m = r2
        L_0x02c3:
            r2 = 0
            r8 = 0
            r13 = 0
        L_0x02c6:
            r24 = 0
            if (r2 >= r15) goto L_0x0468
            java.lang.Object r16 = r14.get(r2)
            r5 = r16
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r5 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12196b) r5
            int r12 = r5.f29600a
            if (r12 != r7) goto L_0x0437
            int r12 = r8 + 1
            com.yandex.mobile.ads.impl.fy0 r5 = r5.f29604b
            r7 = 8
            r5.mo67112e(r7)
            int r7 = r5.mo67113f()
            r18 = 16777215(0xffffff, float:2.3509886E-38)
            r7 = r7 & r18
            r18 = r5
            com.yandex.mobile.ads.impl.ie1 r5 = r6.f29670d
            r27 = r12
            com.yandex.mobile.ads.exo.extractor.mp4.i r12 = r6.f29668b
            r28 = r14
            com.yandex.mobile.ads.exo.extractor.mp4.c r14 = r12.f29705a
            r29 = r15
            int[] r15 = r12.f29711g
            int r30 = r18.mo67130v()
            r15[r8] = r30
            long[] r15 = r12.f29710f
            r30 = r1
            long r0 = r12.f29706b
            r15[r8] = r0
            r0 = r7 & 1
            if (r0 == 0) goto L_0x0319
            r0 = r15[r8]
            r31 = r9
            int r9 = r18.mo67113f()
            r32 = r10
            long r9 = (long) r9
            long r0 = r0 + r9
            r15[r8] = r0
            goto L_0x031d
        L_0x0319:
            r31 = r9
            r32 = r10
        L_0x031d:
            r0 = r7 & 4
            if (r0 == 0) goto L_0x0323
            r0 = 1
            goto L_0x0324
        L_0x0323:
            r0 = 0
        L_0x0324:
            int r1 = r14.f29630d
            if (r0 == 0) goto L_0x032c
            int r1 = r18.mo67113f()
        L_0x032c:
            r9 = r7 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0332
            r9 = 1
            goto L_0x0333
        L_0x0332:
            r9 = 0
        L_0x0333:
            r10 = r7 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0339
            r10 = 1
            goto L_0x033a
        L_0x0339:
            r10 = 0
        L_0x033a:
            r15 = r7 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0340
            r15 = 1
            goto L_0x0341
        L_0x0340:
            r15 = 0
        L_0x0341:
            r7 = r7 & 2048(0x800, float:2.87E-42)
            r33 = r1
            if (r7 == 0) goto L_0x0349
            r7 = 1
            goto L_0x034a
        L_0x0349:
            r7 = 0
        L_0x034a:
            long[] r1 = r5.f34840h
            r34 = r4
            if (r1 == 0) goto L_0x036e
            int r4 = r1.length
            r35 = r11
            r11 = 1
            if (r4 != r11) goto L_0x0370
            r4 = 0
            r36 = r1[r4]
            int r1 = (r36 > r24 ? 1 : (r36 == r24 ? 0 : -1))
            if (r1 != 0) goto L_0x0370
            long[] r1 = r5.f34841i
            r36 = r1[r4]
            r4 = r2
            long r1 = r5.f34835c
            r38 = 1000000(0xf4240, double:4.940656E-318)
            r40 = r1
            long r24 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r36, (long) r38, (long) r40)
            goto L_0x0371
        L_0x036e:
            r35 = r11
        L_0x0370:
            r4 = r2
        L_0x0371:
            int[] r1 = r12.f29712h
            int[] r2 = r12.f29713i
            long[] r11 = r12.f29714j
            r36 = r6
            boolean[] r6 = r12.f29715k
            r37 = r4
            int r4 = r5.f34834b
            r38 = r6
            r6 = 2
            if (r4 != r6) goto L_0x038a
            r4 = r3 & 1
            if (r4 == 0) goto L_0x038a
            r4 = 1
            goto L_0x038b
        L_0x038a:
            r4 = 0
        L_0x038b:
            int[] r6 = r12.f29711g
            r6 = r6[r8]
            int r6 = r6 + r13
            r45 = r3
            r26 = r4
            long r3 = r5.f34835c
            if (r8 <= 0) goto L_0x039e
            r5 = r1
            r46 = r2
            long r1 = r12.f29722r
            goto L_0x03a3
        L_0x039e:
            r5 = r1
            r46 = r2
            r1 = r22
        L_0x03a3:
            if (r13 >= r6) goto L_0x042e
            if (r9 == 0) goto L_0x03ac
            int r8 = r18.mo67113f()
            goto L_0x03ae
        L_0x03ac:
            int r8 = r14.f29628b
        L_0x03ae:
            int r8 = m31819a((int) r8)
            if (r10 == 0) goto L_0x03bb
            int r39 = r18.mo67113f()
            r47 = r6
            goto L_0x03c1
        L_0x03bb:
            r47 = r6
            int r6 = r14.f29629c
            r39 = r6
        L_0x03c1:
            int r6 = m31819a((int) r39)
            if (r13 != 0) goto L_0x03ce
            if (r0 == 0) goto L_0x03ce
            r48 = r0
            r0 = r33
            goto L_0x03dd
        L_0x03ce:
            if (r15 == 0) goto L_0x03d9
            int r39 = r18.mo67113f()
            r48 = r0
            r0 = r39
            goto L_0x03dd
        L_0x03d9:
            r48 = r0
            int r0 = r14.f29630d
        L_0x03dd:
            if (r7 == 0) goto L_0x03f4
            r49 = r7
            int r7 = r18.mo67113f()
            r50 = r9
            r51 = r10
            long r9 = (long) r7
            r39 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r39
            long r9 = r9 / r3
            int r7 = (int) r9
            r46[r13] = r7
            goto L_0x03fd
        L_0x03f4:
            r49 = r7
            r50 = r9
            r51 = r10
            r7 = 0
            r46[r13] = r7
        L_0x03fd:
            r41 = 1000000(0xf4240, double:4.940656E-318)
            r39 = r1
            r43 = r3
            long r9 = com.yandex.mobile.ads.impl.ih1.m37369a((long) r39, (long) r41, (long) r43)
            long r9 = r9 - r24
            r11[r13] = r9
            r5[r13] = r6
            r6 = 16
            int r0 = r0 >> r6
            r6 = 1
            r0 = r0 & r6
            if (r0 != 0) goto L_0x041b
            if (r26 == 0) goto L_0x0419
            if (r13 != 0) goto L_0x041b
        L_0x0419:
            r0 = 1
            goto L_0x041c
        L_0x041b:
            r0 = 0
        L_0x041c:
            r38[r13] = r0
            long r6 = (long) r8
            long r1 = r1 + r6
            int r13 = r13 + 1
            r6 = r47
            r0 = r48
            r7 = r49
            r9 = r50
            r10 = r51
            goto L_0x03a3
        L_0x042e:
            r47 = r6
            r12.f29722r = r1
            r8 = r27
            r13 = r47
            goto L_0x044b
        L_0x0437:
            r30 = r1
            r37 = r2
            r45 = r3
            r34 = r4
            r36 = r6
            r31 = r9
            r32 = r10
            r35 = r11
            r28 = r14
            r29 = r15
        L_0x044b:
            int r2 = r37 + 1
            r0 = r52
            r14 = r28
            r15 = r29
            r1 = r30
            r9 = r31
            r10 = r32
            r4 = r34
            r11 = r35
            r6 = r36
            r3 = r45
            r7 = 1953658222(0x7472756e, float:7.683823E31)
            r12 = 12
            goto L_0x02c6
        L_0x0468:
            r30 = r1
            r45 = r3
            r34 = r4
            r31 = r9
            r32 = r10
            r35 = r11
            com.yandex.mobile.ads.impl.ie1 r0 = r6.f29670d
            r1 = r32
            com.yandex.mobile.ads.exo.extractor.mp4.c r2 = r1.f29705a
            int r2 = r2.f29627a
            com.yandex.mobile.ads.impl.je1 r0 = r0.mo67778a(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r2 = r11.mo64883d(r2)
            if (r2 == 0) goto L_0x04f8
            com.yandex.mobile.ads.impl.fy0 r2 = r2.f29604b
            int r3 = r0.f35271d
            r4 = 8
            r2.mo67112e(r4)
            int r5 = r2.mo67113f()
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r6
            r7 = 1
            r5 = r5 & r7
            if (r5 != r7) goto L_0x04a1
            r2.mo67114f(r4)
        L_0x04a1:
            int r4 = r2.mo67126r()
            int r5 = r2.mo67130v()
            int r7 = r1.f29709e
            if (r5 != r7) goto L_0x04d7
            if (r4 != 0) goto L_0x04c4
            boolean[] r4 = r1.f29717m
            r7 = 0
            r8 = 0
        L_0x04b3:
            if (r7 >= r5) goto L_0x04d3
            int r9 = r2.mo67126r()
            int r8 = r8 + r9
            if (r9 <= r3) goto L_0x04be
            r9 = 1
            goto L_0x04bf
        L_0x04be:
            r9 = 0
        L_0x04bf:
            r4[r7] = r9
            int r7 = r7 + 1
            goto L_0x04b3
        L_0x04c4:
            if (r4 <= r3) goto L_0x04c8
            r2 = 1
            goto L_0x04c9
        L_0x04c8:
            r2 = 0
        L_0x04c9:
            int r4 = r4 * r5
            r3 = 0
            int r8 = r4 + 0
            boolean[] r4 = r1.f29717m
            java.util.Arrays.fill(r4, r3, r5, r2)
        L_0x04d3:
            r1.mo64900a(r8)
            goto L_0x04f8
        L_0x04d7:
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Length mismatch: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ", "
            r2.append(r3)
            int r1 = r1.f29709e
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x04f8:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r2 = r11.mo64883d(r2)
            if (r2 == 0) goto L_0x0549
            com.yandex.mobile.ads.impl.fy0 r2 = r2.f29604b
            r3 = 8
            r2.mo67112e(r3)
            int r4 = r2.mo67113f()
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0517
            r2.mo67114f(r3)
        L_0x0517:
            int r3 = r2.mo67130v()
            if (r3 != r6) goto L_0x0532
            int r3 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r4)
            long r4 = r1.f29707c
            if (r3 != 0) goto L_0x052a
            long r2 = r2.mo67128t()
            goto L_0x052e
        L_0x052a:
            long r2 = r2.mo67131w()
        L_0x052e:
            long r4 = r4 + r2
            r1.f29707c = r4
            goto L_0x0549
        L_0x0532:
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected saio entry count: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0549:
            r2 = 1936027235(0x73656e63, float:1.8177412E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r2 = r11.mo64883d(r2)
            if (r2 == 0) goto L_0x0558
            com.yandex.mobile.ads.impl.fy0 r2 = r2.f29604b
            r3 = 0
            m31824a(r2, r3, r1)
        L_0x0558:
            r2 = 1935828848(0x73626770, float:1.7937577E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r2 = r11.mo64883d(r2)
            r3 = 1936158820(0x73677064, float:1.8336489E31)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r3 = r11.mo64883d(r3)
            if (r2 == 0) goto L_0x062e
            if (r3 == 0) goto L_0x062e
            com.yandex.mobile.ads.impl.fy0 r2 = r2.f29604b
            com.yandex.mobile.ads.impl.fy0 r3 = r3.f29604b
            if (r0 == 0) goto L_0x0577
            java.lang.String r0 = r0.f35269b
            r37 = r0
            r0 = 8
            goto L_0x057b
        L_0x0577:
            r0 = 8
            r37 = 0
        L_0x057b:
            r2.mo67112e(r0)
            int r0 = r2.mo67113f()
            int r4 = r2.mo67113f()
            r5 = 1936025959(0x73656967, float:1.817587E31)
            if (r4 == r5) goto L_0x058d
            goto L_0x062e
        L_0x058d:
            int r0 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r0)
            r4 = 4
            r6 = 1
            if (r0 != r6) goto L_0x0598
            r2.mo67114f(r4)
        L_0x0598:
            int r0 = r2.mo67113f()
            if (r0 != r6) goto L_0x0626
            r0 = 8
            r3.mo67112e(r0)
            int r0 = r3.mo67113f()
            int r2 = r3.mo67113f()
            if (r2 == r5) goto L_0x05af
            goto L_0x062e
        L_0x05af:
            int r0 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r0)
            if (r0 != r6) goto L_0x05c6
            long r5 = r3.mo67128t()
            int r0 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x05be
            goto L_0x05cc
        L_0x05be:
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r1 = "Variable length description in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x05c6:
            r2 = 2
            if (r0 < r2) goto L_0x05cc
            r3.mo67114f(r4)
        L_0x05cc:
            long r5 = r3.mo67128t()
            r7 = 1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x061e
            r0 = 1
            r3.mo67114f(r0)
            int r2 = r3.mo67126r()
            r5 = r2 & 240(0xf0, float:3.36E-43)
            int r40 = r5 >> 4
            r41 = r2 & 15
            int r2 = r3.mo67126r()
            if (r2 != r0) goto L_0x05ed
            r36 = 1
            goto L_0x05ef
        L_0x05ed:
            r36 = 0
        L_0x05ef:
            if (r36 != 0) goto L_0x05f2
            goto L_0x062e
        L_0x05f2:
            int r38 = r3.mo67126r()
            r0 = 16
            byte[] r2 = new byte[r0]
            r4 = 0
            r3.mo67104a(r2, r4, r0)
            if (r38 != 0) goto L_0x060d
            int r0 = r3.mo67126r()
            byte[] r10 = new byte[r0]
            r3.mo67104a(r10, r4, r0)
            r42 = r10
            r0 = 1
            goto L_0x0610
        L_0x060d:
            r0 = 1
            r42 = 0
        L_0x0610:
            r1.f29716l = r0
            com.yandex.mobile.ads.impl.je1 r3 = new com.yandex.mobile.ads.impl.je1
            r35 = r3
            r39 = r2
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)
            r1.f29718n = r3
            goto L_0x062f
        L_0x061e:
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0626:
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x062e:
            r0 = 1
        L_0x062f:
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$b> r2 = r11.f29602c
            int r2 = r2.size()
            r5 = 0
        L_0x0636:
            if (r5 >= r2) goto L_0x066f
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$b> r3 = r11.f29602c
            java.lang.Object r3 = r3.get(r5)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r3 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12196b) r3
            int r4 = r3.f29600a
            r6 = 1970628964(0x75756964, float:3.1109627E32)
            if (r4 != r6) goto L_0x0663
            com.yandex.mobile.ads.impl.fy0 r3 = r3.f29604b
            r4 = 8
            r3.mo67112e(r4)
            r7 = r34
            r6 = 0
            r8 = 16
            r3.mo67104a(r7, r6, r8)
            byte[] r9 = f29631G
            boolean r9 = java.util.Arrays.equals(r7, r9)
            if (r9 != 0) goto L_0x065f
            goto L_0x066a
        L_0x065f:
            m31824a(r3, r8, r1)
            goto L_0x066a
        L_0x0663:
            r7 = r34
            r4 = 8
            r6 = 0
            r8 = 16
        L_0x066a:
            int r5 = r5 + 1
            r34 = r7
            goto L_0x0636
        L_0x066f:
            r7 = r34
            r4 = 8
            r6 = 0
            r8 = 16
            goto L_0x0688
        L_0x0677:
            r30 = r1
            r19 = r2
            r45 = r3
            r20 = r7
            r31 = r9
            r0 = 1
            r6 = 0
            r8 = 16
            r7 = r4
            r4 = 8
        L_0x0688:
            int r9 = r31 + 1
            r0 = r52
            r4 = r7
            r2 = r19
            r7 = r20
            r1 = r30
            r3 = r45
            r8 = 8
            goto L_0x018b
        L_0x0699:
            r6 = 0
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$b> r0 = r1.f29602c
            com.yandex.mobile.ads.exo.drm.DrmInitData r0 = m31820a((java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12196b>) r0)
            r2 = r52
            if (r0 == 0) goto L_0x06dd
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r1 = r2.f29641c
            int r1 = r1.size()
            r5 = 0
        L_0x06ab:
            if (r5 >= r1) goto L_0x06dd
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r3 = r2.f29641c
            java.lang.Object r3 = r3.valueAt(r5)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r3 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b) r3
            com.yandex.mobile.ads.impl.ie1 r4 = r3.f29670d
            com.yandex.mobile.ads.exo.extractor.mp4.i r7 = r3.f29668b
            com.yandex.mobile.ads.exo.extractor.mp4.c r7 = r7.f29705a
            int r7 = r7.f29627a
            com.yandex.mobile.ads.impl.je1 r4 = r4.mo67778a(r7)
            if (r4 == 0) goto L_0x06c6
            java.lang.String r4 = r4.f35269b
            goto L_0x06c7
        L_0x06c6:
            r4 = 0
        L_0x06c7:
            com.yandex.mobile.ads.impl.ke1 r7 = r3.f29667a
            com.yandex.mobile.ads.impl.ie1 r3 = r3.f29670d
            com.yandex.mobile.ads.exo.Format r3 = r3.f34838f
            com.yandex.mobile.ads.exo.drm.DrmInitData r4 = r0.mo64833a((java.lang.String) r4)
            com.yandex.mobile.ads.exo.metadata.Metadata r8 = r3.f29528h
            com.yandex.mobile.ads.exo.Format r3 = r3.mo64770a((com.yandex.mobile.ads.exo.drm.DrmInitData) r4, (com.yandex.mobile.ads.exo.metadata.Metadata) r8)
            r7.mo65339a(r3)
            int r5 = r5 + 1
            goto L_0x06ab
        L_0x06dd:
            long r0 = r2.f29659u
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x073d
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r0 = r2.f29641c
            int r0 = r0.size()
            r9 = 0
        L_0x06ef:
            if (r9 >= r0) goto L_0x071f
            android.util.SparseArray<com.yandex.mobile.ads.exo.extractor.mp4.d$b> r1 = r2.f29641c
            java.lang.Object r1 = r1.valueAt(r9)
            com.yandex.mobile.ads.exo.extractor.mp4.d$b r1 = (com.yandex.mobile.ads.exo.extractor.mp4.C12204d.C12206b) r1
            long r3 = r2.f29659u
            int r5 = r1.f29672f
        L_0x06fd:
            com.yandex.mobile.ads.exo.extractor.mp4.i r6 = r1.f29668b
            int r7 = r6.f29709e
            if (r5 >= r7) goto L_0x071c
            long[] r7 = r6.f29714j
            r10 = r7[r5]
            int[] r7 = r6.f29713i
            r7 = r7[r5]
            long r7 = (long) r7
            long r10 = r10 + r7
            int r7 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x071c
            boolean[] r6 = r6.f29715k
            boolean r6 = r6[r5]
            if (r6 == 0) goto L_0x0719
            r1.f29675i = r5
        L_0x0719:
            int r5 = r5 + 1
            goto L_0x06fd
        L_0x071c:
            int r9 = r9 + 1
            goto L_0x06ef
        L_0x071f:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f29659u = r3
            goto L_0x073d
        L_0x0727:
            r2 = r0
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r0 = r2.f29649k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x073d
            java.util.ArrayDeque<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r0 = r2.f29649k
            java.lang.Object r0 = r0.peek()
            com.yandex.mobile.ads.exo.extractor.mp4.a$a r0 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12195a) r0
            java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.a$a> r0 = r0.f29603d
            r0.add(r1)
        L_0x073d:
            r0 = r2
            goto L_0x0002
        L_0x0740:
            r2 = r0
            r52.m31822a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.extractor.mp4.C12204d.m31823a(long):void");
    }

    /* renamed from: a */
    private C12203c m31821a(SparseArray<C12203c> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        C12203c cVar = sparseArray.get(i);
        cVar.getClass();
        return cVar;
    }

    /* renamed from: a */
    private static int m31819a(int i) throws jy0 {
        if (i >= 0) {
            return i;
        }
        throw new jy0("Unexpected negtive value: " + i);
    }

    /* renamed from: a */
    private static void m31824a(fy0 fy0, int i, C12212i iVar) throws jy0 {
        fy0.mo67112e(i + 8);
        int f = fy0.mo67113f() & ViewCompat.MEASURED_SIZE_MASK;
        if ((f & 1) == 0) {
            boolean z = (f & 2) != 0;
            int v = fy0.mo67130v();
            if (v == iVar.f29709e) {
                Arrays.fill(iVar.f29717m, 0, v, z);
                iVar.mo64900a(fy0.mo67098a());
                fy0.mo67104a(iVar.f29720p.f33778a, 0, iVar.f29719o);
                iVar.f29720p.mo67112e(0);
                iVar.f29721q = false;
                return;
            }
            throw new jy0("Length mismatch: " + v + ", " + iVar.f29709e);
        }
        throw new jy0("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.yandex.mobile.ads.exo.drm.DrmInitData m31820a(java.util.List<com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12196b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00b7
            java.lang.Object r5 = r14.get(r3)
            com.yandex.mobile.ads.exo.extractor.mp4.a$b r5 = (com.yandex.mobile.ads.exo.extractor.mp4.C12194a.C12196b) r5
            int r6 = r5.f29600a
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto L_0x00b3
            if (r4 != 0) goto L_0x001e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001e:
            com.yandex.mobile.ads.impl.fy0 r5 = r5.f29604b
            byte[] r5 = r5.f33778a
            com.yandex.mobile.ads.impl.fy0 r6 = new com.yandex.mobile.ads.impl.fy0
            r6.<init>((byte[]) r5)
            int r8 = r6.mo67107c()
            r9 = 32
            if (r8 >= r9) goto L_0x0030
            goto L_0x008b
        L_0x0030:
            r6.mo67112e(r1)
            int r8 = r6.mo67113f()
            int r9 = r6.mo67098a()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x0040
            goto L_0x008b
        L_0x0040:
            int r8 = r6.mo67113f()
            if (r8 == r7) goto L_0x0047
            goto L_0x008b
        L_0x0047:
            int r7 = r6.mo67113f()
            int r7 = com.yandex.mobile.ads.exo.extractor.mp4.C12194a.m31799b(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x0069
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x008b
        L_0x0069:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo67122n()
            long r12 = r6.mo67122n()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0081
            int r8 = r6.mo67130v()
            int r8 = r8 * 16
            r6.mo67114f(r8)
        L_0x0081:
            int r8 = r6.mo67130v()
            int r10 = r6.mo67098a()
            if (r8 == r10) goto L_0x008d
        L_0x008b:
            r6 = r2
            goto L_0x0097
        L_0x008d:
            byte[] r10 = new byte[r8]
            r6.mo67104a(r10, r1, r8)
            com.yandex.mobile.ads.exo.extractor.mp4.g r6 = new com.yandex.mobile.ads.exo.extractor.mp4.g
            r6.<init>(r9, r7, r10)
        L_0x0097:
            if (r6 != 0) goto L_0x009b
            r6 = r2
            goto L_0x009f
        L_0x009b:
            java.util.UUID r6 = r6.f29703a
        L_0x009f:
            if (r6 != 0) goto L_0x00a9
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00b3
        L_0x00a9:
            com.yandex.mobile.ads.exo.drm.DrmInitData$SchemeData r7 = new com.yandex.mobile.ads.exo.drm.DrmInitData$SchemeData
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        L_0x00b3:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b7:
            if (r4 != 0) goto L_0x00ba
            goto L_0x00bf
        L_0x00ba:
            com.yandex.mobile.ads.exo.drm.DrmInitData r2 = new com.yandex.mobile.ads.exo.drm.DrmInitData
            r2.<init>((java.util.List<com.yandex.mobile.ads.exo.drm.DrmInitData.SchemeData>) r4)
        L_0x00bf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.extractor.mp4.C12204d.m31820a(java.util.List):com.yandex.mobile.ads.exo.drm.DrmInitData");
    }
}
