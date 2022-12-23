package com.fyber.inneractive.sdk.player.p059c.p063d.p065b;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3541f;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3544i;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.time.DurationKt;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.b.d */
public final class C3250d implements C3268f {

    /* renamed from: G */
    private static final byte[] f8200G = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: H */
    private static final byte[] f8201H = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: I */
    public static final UUID f8202I = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: a */
    public static final C3271i f8203a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3250d()};
        }
    };

    /* renamed from: A */
    int[] f8204A;

    /* renamed from: B */
    int f8205B;

    /* renamed from: C */
    int f8206C;

    /* renamed from: D */
    int f8207D;

    /* renamed from: E */
    boolean f8208E;

    /* renamed from: F */
    C3270h f8209F;

    /* renamed from: J */
    private final C3248b f8210J;

    /* renamed from: K */
    private final C3548k f8211K;

    /* renamed from: L */
    private final C3548k f8212L;

    /* renamed from: M */
    private final C3548k f8213M;

    /* renamed from: N */
    private final C3548k f8214N;

    /* renamed from: O */
    private final C3548k f8215O;

    /* renamed from: P */
    private final C3548k f8216P;

    /* renamed from: Q */
    private final C3548k f8217Q;

    /* renamed from: R */
    private ByteBuffer f8218R;

    /* renamed from: S */
    private long f8219S;

    /* renamed from: T */
    private int f8220T;

    /* renamed from: U */
    private boolean f8221U;

    /* renamed from: V */
    private boolean f8222V;

    /* renamed from: W */
    private boolean f8223W;

    /* renamed from: X */
    private boolean f8224X;

    /* renamed from: Y */
    private byte f8225Y;

    /* renamed from: Z */
    private int f8226Z;

    /* renamed from: aa */
    private int f8227aa;

    /* renamed from: ab */
    private int f8228ab;

    /* renamed from: ac */
    private boolean f8229ac;

    /* renamed from: b */
    final C3255f f8230b;

    /* renamed from: c */
    final SparseArray<C3253b> f8231c;

    /* renamed from: d */
    final boolean f8232d;

    /* renamed from: e */
    final C3548k f8233e;

    /* renamed from: f */
    final C3548k f8234f;

    /* renamed from: g */
    long f8235g;

    /* renamed from: h */
    long f8236h;

    /* renamed from: i */
    long f8237i;

    /* renamed from: j */
    long f8238j;

    /* renamed from: k */
    long f8239k;

    /* renamed from: l */
    C3253b f8240l;

    /* renamed from: m */
    boolean f8241m;

    /* renamed from: n */
    int f8242n;

    /* renamed from: o */
    long f8243o;

    /* renamed from: p */
    boolean f8244p;

    /* renamed from: q */
    long f8245q;

    /* renamed from: r */
    long f8246r;

    /* renamed from: s */
    C3541f f8247s;

    /* renamed from: t */
    C3541f f8248t;

    /* renamed from: u */
    boolean f8249u;

    /* renamed from: v */
    int f8250v;

    /* renamed from: w */
    long f8251w;

    /* renamed from: x */
    long f8252x;

    /* renamed from: y */
    int f8253y;

    /* renamed from: z */
    int f8254z;

    /* renamed from: a */
    static int m7930a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /*17026*/:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    static boolean m7935b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public C3250d() {
        this(0);
    }

    public C3250d(int i) {
        this(new C3246a(), i);
    }

    private C3250d(C3248b bVar, int i) {
        this.f8236h = -1;
        this.f8237i = -9223372036854775807L;
        this.f8238j = -9223372036854775807L;
        this.f8239k = -9223372036854775807L;
        this.f8245q = -1;
        this.f8219S = -1;
        this.f8246r = -9223372036854775807L;
        this.f8210J = bVar;
        boolean z = false;
        bVar.mo19017a((C3249c) new C3252a(this, (byte) 0));
        this.f8232d = (i & 1) == 0 ? true : z;
        this.f8230b = new C3255f();
        this.f8231c = new SparseArray<>();
        this.f8233e = new C3548k(4);
        this.f8213M = new C3548k(ByteBuffer.allocate(4).putInt(-1).array());
        this.f8234f = new C3548k(4);
        this.f8211K = new C3548k(C3544i.f9604a);
        this.f8212L = new C3548k(4);
        this.f8214N = new C3548k();
        this.f8215O = new C3548k();
        this.f8216P = new C3548k(8);
        this.f8217Q = new C3548k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        r2 = r1.mo19031a(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19001a(com.fyber.inneractive.sdk.player.p059c.p063d.C3269g r17) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r16 = this;
            r0 = r17
            com.fyber.inneractive.sdk.player.c.d.b.e r1 = new com.fyber.inneractive.sdk.player.c.d.b.e
            r1.<init>()
            long r2 = r17.mo19015d()
            r4 = 1024(0x400, double:5.06E-321)
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0019
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r4 = r2
        L_0x0019:
            int r5 = (int) r4
            com.fyber.inneractive.sdk.player.c.k.k r4 = r1.f8298a
            byte[] r4 = r4.f9625a
            r6 = 0
            r7 = 4
            r0.mo19014c(r4, r6, r7)
            com.fyber.inneractive.sdk.player.c.k.k r4 = r1.f8298a
            long r9 = r4.mo19394h()
            r1.f8299b = r7
        L_0x002b:
            r11 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r4 = 1
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0052
            int r7 = r1.f8299b
            int r7 = r7 + r4
            r1.f8299b = r7
            if (r7 == r5) goto L_0x00a2
            com.fyber.inneractive.sdk.player.c.k.k r7 = r1.f8298a
            byte[] r7 = r7.f9625a
            r0.mo19014c(r7, r6, r4)
            r4 = 8
            long r9 = r9 << r4
            r11 = -256(0xffffffffffffff00, double:NaN)
            long r9 = r9 & r11
            com.fyber.inneractive.sdk.player.c.k.k r4 = r1.f8298a
            byte[] r4 = r4.f9625a
            byte r4 = r4[r6]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r11 = (long) r4
            long r9 = r9 | r11
            goto L_0x002b
        L_0x0052:
            long r9 = r1.mo19031a(r0)
            int r5 = r1.f8299b
            long r11 = (long) r5
            r13 = -9223372036854775808
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x00a2
            if (r8 == 0) goto L_0x0068
            long r7 = r11 + r9
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0068
            goto L_0x00a2
        L_0x0068:
            int r2 = r1.f8299b
            long r2 = (long) r2
            long r7 = r11 + r9
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x009a
            long r2 = r1.mo19031a(r0)
            int r5 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x00a2
            long r2 = r1.mo19031a(r0)
            r7 = 0
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0099
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r15 <= 0) goto L_0x008b
            goto L_0x0099
        L_0x008b:
            if (r5 == 0) goto L_0x0068
            int r5 = (int) r2
            r0.mo19013c(r5)
            int r5 = r1.f8299b
            long r7 = (long) r5
            long r7 = r7 + r2
            int r2 = (int) r7
            r1.f8299b = r2
            goto L_0x0068
        L_0x0099:
            return r6
        L_0x009a:
            int r0 = r1.f8299b
            long r0 = (long) r0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00a2
            return r4
        L_0x00a2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d.mo19001a(com.fyber.inneractive.sdk.player.c.d.g):boolean");
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        this.f8209F = hVar;
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        this.f8246r = -9223372036854775807L;
        this.f8250v = 0;
        this.f8210J.mo19016a();
        this.f8230b.mo19033a();
        m7934b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18998a(com.fyber.inneractive.sdk.player.p059c.p063d.C3269g r9, com.fyber.inneractive.sdk.player.p059c.p063d.C3275l r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f8229ac = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003a
            boolean r3 = r8.f8229ac
            if (r3 != 0) goto L_0x003a
            com.fyber.inneractive.sdk.player.c.d.b.b r2 = r8.f8210J
            boolean r2 = r2.mo19018a((com.fyber.inneractive.sdk.player.p059c.p063d.C3269g) r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.mo19012c()
            boolean r5 = r8.f8244p
            if (r5 == 0) goto L_0x0025
            r8.f8219S = r3
            long r3 = r8.f8245q
            r10.f8396a = r3
            r8.f8244p = r0
        L_0x0023:
            r3 = 1
            goto L_0x0037
        L_0x0025:
            boolean r3 = r8.f8241m
            if (r3 == 0) goto L_0x0036
            long r3 = r8.f8219S
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            r10.f8396a = r3
            r8.f8219S = r5
            goto L_0x0023
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            return r0
        L_0x003d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d.mo18998a(com.fyber.inneractive.sdk.player.c.d.g, com.fyber.inneractive.sdk.player.c.d.l):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19028a(C3253b bVar, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(bVar.f8272a)) {
            byte[] bArr2 = this.f8215O.f9625a;
            long j2 = this.f8252x;
            if (j2 == -9223372036854775807L) {
                bArr = f8201H;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = C3560t.m8891c(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (DurationKt.NANOS_IN_MILLIS * i3))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            C3278n nVar = bVar.f8270O;
            C3548k kVar = this.f8215O;
            nVar.mo19041a(kVar, kVar.f9627c);
            this.f8228ab += this.f8215O.f9627c;
        }
        bVar.f8270O.mo19038a(j, this.f8207D, this.f8228ab, 0, bVar.f8278g);
        this.f8229ac = true;
        m7934b();
    }

    /* renamed from: b */
    private void m7934b() {
        this.f8220T = 0;
        this.f8228ab = 0;
        this.f8227aa = 0;
        this.f8221U = false;
        this.f8222V = false;
        this.f8224X = false;
        this.f8226Z = 0;
        this.f8225Y = 0;
        this.f8223W = false;
        this.f8214N.mo19378a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19029a(C3269g gVar, int i) throws IOException, InterruptedException {
        if (this.f8233e.f9627c < i) {
            if (this.f8233e.mo19385c() < i) {
                C3548k kVar = this.f8233e;
                kVar.mo19381a(Arrays.copyOf(kVar.f9625a, Math.max(this.f8233e.f9625a.length * 2, i)), this.f8233e.f9627c);
            }
            gVar.mo19010b(this.f8233e.f9625a, this.f8233e.f9627c, i - this.f8233e.f9627c);
            this.f8233e.mo19384b(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19030a(C3269g gVar, C3253b bVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(bVar.f8272a)) {
            int length = f8200G.length + i;
            if (this.f8215O.mo19385c() < length) {
                this.f8215O.f9625a = Arrays.copyOf(f8200G, length + i);
            }
            gVar.mo19010b(this.f8215O.f9625a, f8200G.length, i);
            this.f8215O.mo19386c(0);
            this.f8215O.mo19384b(length);
            return;
        }
        C3278n nVar = bVar.f8270O;
        if (!this.f8221U) {
            if (bVar.f8276e) {
                this.f8207D &= -1073741825;
                int i3 = 128;
                if (!this.f8222V) {
                    gVar.mo19010b(this.f8233e.f9625a, 0, 1);
                    this.f8220T++;
                    if ((this.f8233e.f9625a[0] & 128) != 128) {
                        this.f8225Y = this.f8233e.f9625a[0];
                        this.f8222V = true;
                    } else {
                        throw new C3295l("Extension bit is set in signal byte");
                    }
                }
                if ((this.f8225Y & 1) == 1) {
                    boolean z = (this.f8225Y & 2) == 2;
                    this.f8207D |= 1073741824;
                    if (!this.f8223W) {
                        gVar.mo19010b(this.f8216P.f9625a, 0, 8);
                        this.f8220T += 8;
                        this.f8223W = true;
                        byte[] bArr = this.f8233e.f9625a;
                        if (!z) {
                            i3 = 0;
                        }
                        bArr[0] = (byte) (i3 | 8);
                        this.f8233e.mo19386c(0);
                        nVar.mo19041a(this.f8233e, 1);
                        this.f8228ab++;
                        this.f8216P.mo19386c(0);
                        nVar.mo19041a(this.f8216P, 8);
                        this.f8228ab += 8;
                    }
                    if (z) {
                        if (!this.f8224X) {
                            gVar.mo19010b(this.f8233e.f9625a, 0, 1);
                            this.f8220T++;
                            this.f8233e.mo19386c(0);
                            this.f8226Z = this.f8233e.mo19387d();
                            this.f8224X = true;
                        }
                        int i4 = this.f8226Z * 4;
                        this.f8233e.mo19379a(i4);
                        gVar.mo19010b(this.f8233e.f9625a, 0, i4);
                        this.f8220T += i4;
                        short s = (short) ((this.f8226Z / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f8218R;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f8218R = ByteBuffer.allocate(i5);
                        }
                        this.f8218R.position(0);
                        this.f8218R.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.f8226Z;
                            if (i6 >= i2) {
                                break;
                            }
                            int n = this.f8233e.mo19400n();
                            if (i6 % 2 == 0) {
                                this.f8218R.putShort((short) (n - i7));
                            } else {
                                this.f8218R.putInt(n - i7);
                            }
                            i6++;
                            i7 = n;
                        }
                        int i8 = (i - this.f8220T) - i7;
                        if (i2 % 2 == 1) {
                            this.f8218R.putInt(i8);
                        } else {
                            this.f8218R.putShort((short) i8);
                            this.f8218R.putInt(0);
                        }
                        this.f8217Q.mo19381a(this.f8218R.array(), i5);
                        nVar.mo19041a(this.f8217Q, i5);
                        this.f8228ab += i5;
                    }
                }
            } else if (bVar.f8277f != null) {
                this.f8214N.mo19381a(bVar.f8277f, bVar.f8277f.length);
            }
            this.f8221U = true;
        }
        int i9 = i + this.f8214N.f9627c;
        if (!"V_MPEG4/ISO/AVC".equals(bVar.f8272a) && !"V_MPEGH/ISO/HEVC".equals(bVar.f8272a)) {
            while (true) {
                int i10 = this.f8220T;
                if (i10 >= i9) {
                    break;
                }
                m7931a(gVar, nVar, i9 - i10);
            }
        } else {
            byte[] bArr2 = this.f8212L.f9625a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i11 = bVar.f8271P;
            int i12 = 4 - bVar.f8271P;
            while (this.f8220T < i9) {
                int i13 = this.f8227aa;
                if (i13 == 0) {
                    int min = Math.min(i11, this.f8214N.mo19383b());
                    gVar.mo19010b(bArr2, i12 + min, i11 - min);
                    if (min > 0) {
                        this.f8214N.mo19382a(bArr2, i12, min);
                    }
                    this.f8220T += i11;
                    this.f8212L.mo19386c(0);
                    this.f8227aa = this.f8212L.mo19400n();
                    this.f8211K.mo19386c(0);
                    nVar.mo19041a(this.f8211K, 4);
                    this.f8228ab += 4;
                } else {
                    this.f8227aa = i13 - m7931a(gVar, nVar, i13);
                }
            }
        }
        if ("A_VORBIS".equals(bVar.f8272a)) {
            this.f8213M.mo19386c(0);
            nVar.mo19041a(this.f8213M, 4);
            this.f8228ab += 4;
        }
    }

    /* renamed from: a */
    private int m7931a(C3269g gVar, C3278n nVar, int i) throws IOException, InterruptedException {
        int i2;
        int b = this.f8214N.mo19383b();
        if (b > 0) {
            i2 = Math.min(i, b);
            nVar.mo19041a(this.f8214N, i2);
        } else {
            i2 = nVar.mo19035a(gVar, i, false);
        }
        this.f8220T += i2;
        this.f8228ab += i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo19027a(long j) throws C3295l {
        long j2 = this.f8237i;
        if (j2 != -9223372036854775807L) {
            return C3560t.m8877a(j, j2, 1000);
        }
        throw new C3295l("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    static int[] m7933a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.b.d$a */
    private final class C3252a implements C3249c {
        private C3252a() {
        }

        /* synthetic */ C3252a(C3250d dVar, byte b) {
            this();
        }

        /* renamed from: a */
        public final int mo19019a(int i) {
            return C3250d.m7930a(i);
        }

        /* renamed from: b */
        public final boolean mo19025b(int i) {
            return C3250d.m7935b(i);
        }

        /* renamed from: a */
        public final void mo19023a(int i, long j, long j2) throws C3295l {
            C3250d dVar = C3250d.this;
            if (i == 160) {
                dVar.f8208E = false;
            } else if (i == 174) {
                dVar.f8240l = new C3253b((byte) 0);
            } else if (i == 187) {
                dVar.f8249u = false;
            } else if (i == 19899) {
                dVar.f8242n = -1;
                dVar.f8243o = -1;
            } else if (i == 20533) {
                dVar.f8240l.f8276e = true;
            } else if (i == 21968) {
                dVar.f8240l.f8288q = true;
            } else if (i != 408125543) {
                if (i == 475249515) {
                    dVar.f8247s = new C3541f();
                    dVar.f8248t = new C3541f();
                } else if (i != 524531317 || dVar.f8241m) {
                } else {
                    if (!dVar.f8232d || dVar.f8245q == -1) {
                        dVar.f8209F.mo19057a((C3276m) new C3276m.C3277a(dVar.f8239k));
                        dVar.f8241m = true;
                        return;
                    }
                    dVar.f8244p = true;
                }
            } else if (dVar.f8236h == -1 || dVar.f8236h == j) {
                dVar.f8236h = j;
                dVar.f8235g = j2;
            } else {
                throw new C3295l("Multiple Segment elements not supported");
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x03f8, code lost:
            r25 = r3;
            r3 = -1;
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:250:0x0477, code lost:
            r4 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:260:0x050a, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:269:0x0524, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:270:0x0525, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:271:0x0526, code lost:
            r25 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:272:0x0528, code lost:
            r5 = r1.f8268M | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:273:0x052d, code lost:
            if (r1.f8267L == false) goto L_0x0532;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:274:0x052f, code lost:
            r18 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:275:0x0532, code lost:
            r18 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:276:0x0534, code lost:
            r5 = r5 | r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:277:0x053a, code lost:
            if (com.fyber.inneractive.sdk.player.p059c.p080k.C3543h.m8800a(r8) == false) goto L_0x0560;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:278:0x053c, code lost:
            r3 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8114a(java.lang.Integer.toString(r7), r8, -1, r3, r1.f8262G, r1.f8264I, r25, r4, r1.f8280i, r5 ? 1 : 0, r1.f8269N);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:280:0x0564, code lost:
            if (com.fyber.inneractive.sdk.player.p059c.p080k.C3543h.m8801b(r8) == false) goto L_0x0696;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:282:0x0568, code lost:
            if (r1.f8285n != 0) goto L_0x0582;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:283:0x056a, code lost:
            r10 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:284:0x056d, code lost:
            if (r1.f8283l != -1) goto L_0x0572;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:285:0x056f, code lost:
            r5 = r1.f8281j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:286:0x0572, code lost:
            r5 = r1.f8283l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:287:0x0574, code lost:
            r1.f8283l = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:288:0x0578, code lost:
            if (r1.f8284m != -1) goto L_0x057d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:289:0x057a, code lost:
            r5 = r1.f8282k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:290:0x057d, code lost:
            r5 = r1.f8284m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:291:0x057f, code lost:
            r1.f8284m = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:292:0x0582, code lost:
            r10 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:294:0x0587, code lost:
            if (r1.f8283l == r10) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:296:0x058b, code lost:
            if (r1.f8284m == r10) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:297:0x058d, code lost:
            r26 = ((float) (r1.f8282k * r1.f8283l)) / ((float) (r1.f8281j * r1.f8284m));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:298:0x059f, code lost:
            r26 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:300:0x05a3, code lost:
            if (r1.f8288q == false) goto L_0x066f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:302:0x05a9, code lost:
            if (r1.f8294w == -1.0f) goto L_0x0660;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:304:0x05af, code lost:
            if (r1.f8295x == -1.0f) goto L_0x0660;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:306:0x05b5, code lost:
            if (r1.f8296y == -1.0f) goto L_0x0660;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:308:0x05bb, code lost:
            if (r1.f8297z == -1.0f) goto L_0x0660;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:310:0x05c1, code lost:
            if (r1.f8256A == -1.0f) goto L_0x0660;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:312:0x05c7, code lost:
            if (r1.f8257B == -1.0f) goto L_0x0660;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:314:0x05cd, code lost:
            if (r1.f8258C == -1.0f) goto L_0x0660;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:316:0x05d3, code lost:
            if (r1.f8259D == -1.0f) goto L_0x0660;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:318:0x05d9, code lost:
            if (r1.f8260E == -1.0f) goto L_0x0660;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:320:0x05df, code lost:
            if (r1.f8261F != -1.0f) goto L_0x05e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:321:0x05e3, code lost:
            r5 = new byte[25];
            r10 = java.nio.ByteBuffer.wrap(r5);
            r10.put((byte) 0);
            r10.putShort((short) ((int) ((r1.f8294w * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.f8295x * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.f8296y * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.f8297z * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.f8256A * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.f8257B * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.f8258C * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r1.f8259D * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) (r1.f8260E + 0.5f)));
            r10.putShort((short) ((int) (r1.f8261F + 0.5f)));
            r10.putShort((short) r1.f8292u);
            r10.putShort((short) r1.f8293v);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:322:0x0660, code lost:
            r5 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:323:0x0661, code lost:
            r29 = new com.fyber.inneractive.sdk.player.p059c.p081l.C3563b(r1.f8289r, r1.f8291t, r1.f8290s, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:324:0x066f, code lost:
            r29 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:325:0x0671, code lost:
            r3 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8116a(java.lang.Integer.toString(r7), r8, r3, r1.f8281j, r1.f8282k, r4, -1, r26, r1.f8286o, r1.f8287p, r29, r1.f8280i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:327:0x069c, code lost:
            if ("application/x-subrip".equals(r8) == false) goto L_0x06ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:328:0x069e, code lost:
            r3 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8120a(java.lang.Integer.toString(r7), r8, r5 ? 1 : 0, r1.f8269N, r1.f8280i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:330:0x06b1, code lost:
            if ("application/vobsub".equals(r8) != false) goto L_0x06cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:332:0x06b9, code lost:
            if ("application/pgs".equals(r8) != false) goto L_0x06cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:334:0x06c1, code lost:
            if ("application/dvbsubs".equals(r8) == false) goto L_0x06c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:336:0x06cb, code lost:
            throw new com.fyber.inneractive.sdk.player.p059c.C3295l("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:337:0x06cc, code lost:
            r3 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8122a(java.lang.Integer.toString(r7), r8, r4, r1.f8269N, r1.f8280i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:338:0x06d8, code lost:
            r1.f8270O = r9.mo19056a(r1.f8273b);
            r1.f8270O.mo19040a(r3);
            r2.f8231c.put(r2.f8240l.f8273b, r2.f8240l);
            r1 = null;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo19026c(int r32) throws com.fyber.inneractive.sdk.player.p059c.C3295l {
            /*
                r31 = this;
                r0 = r31
                r1 = r32
                com.fyber.inneractive.sdk.player.c.d.b.d r2 = com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d.this
                r3 = 160(0xa0, float:2.24E-43)
                r5 = 1
                r6 = 0
                if (r1 == r3) goto L_0x06f6
                r3 = 174(0xae, float:2.44E-43)
                r7 = 0
                r8 = -1
                if (r1 == r3) goto L_0x015b
                r3 = 19899(0x4dbb, float:2.7884E-41)
                r9 = -1
                r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
                if (r1 == r3) goto L_0x0140
                r3 = 25152(0x6240, float:3.5245E-41)
                if (r1 == r3) goto L_0x0111
                r3 = 28032(0x6d80, float:3.9281E-41)
                if (r1 == r3) goto L_0x00fb
                r3 = 357149030(0x1549a966, float:4.072526E-26)
                r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r1 == r3) goto L_0x00e1
                r3 = 374648427(0x1654ae6b, float:1.718026E-25)
                if (r1 == r3) goto L_0x00ca
                if (r1 == r4) goto L_0x0036
                goto L_0x0715
            L_0x0036:
                boolean r1 = r2.f8241m
                if (r1 != 0) goto L_0x0715
                com.fyber.inneractive.sdk.player.c.d.h r1 = r2.f8209F
                long r3 = r2.f8236h
                int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r8 == 0) goto L_0x00b9
                long r3 = r2.f8239k
                int r8 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r8 == 0) goto L_0x00b9
                com.fyber.inneractive.sdk.player.c.k.f r3 = r2.f8247s
                if (r3 == 0) goto L_0x00b9
                com.fyber.inneractive.sdk.player.c.k.f r3 = r2.f8247s
                int r3 = r3.f9602a
                if (r3 == 0) goto L_0x00b9
                com.fyber.inneractive.sdk.player.c.k.f r3 = r2.f8248t
                if (r3 == 0) goto L_0x00b9
                com.fyber.inneractive.sdk.player.c.k.f r3 = r2.f8248t
                int r3 = r3.f9602a
                com.fyber.inneractive.sdk.player.c.k.f r4 = r2.f8247s
                int r4 = r4.f9602a
                if (r3 == r4) goto L_0x0061
                goto L_0x00b9
            L_0x0061:
                com.fyber.inneractive.sdk.player.c.k.f r3 = r2.f8247s
                int r3 = r3.f9602a
                int[] r4 = new int[r3]
                long[] r8 = new long[r3]
                long[] r9 = new long[r3]
                long[] r10 = new long[r3]
                r11 = 0
            L_0x006e:
                if (r11 >= r3) goto L_0x0086
                com.fyber.inneractive.sdk.player.c.k.f r12 = r2.f8247s
                long r12 = r12.mo19372a((int) r11)
                r10[r11] = r12
                long r12 = r2.f8236h
                com.fyber.inneractive.sdk.player.c.k.f r14 = r2.f8248t
                long r14 = r14.mo19372a((int) r11)
                long r12 = r12 + r14
                r8[r11] = r12
                int r11 = r11 + 1
                goto L_0x006e
            L_0x0086:
                int r11 = r3 + -1
                if (r6 >= r11) goto L_0x009d
                int r11 = r6 + 1
                r12 = r8[r11]
                r14 = r8[r6]
                long r12 = r12 - r14
                int r13 = (int) r12
                r4[r6] = r13
                r12 = r10[r11]
                r14 = r10[r6]
                long r12 = r12 - r14
                r9[r6] = r12
                r6 = r11
                goto L_0x0086
            L_0x009d:
                long r12 = r2.f8236h
                long r14 = r2.f8235g
                long r12 = r12 + r14
                r14 = r8[r11]
                long r12 = r12 - r14
                int r3 = (int) r12
                r4[r11] = r3
                long r12 = r2.f8239k
                r14 = r10[r11]
                long r12 = r12 - r14
                r9[r11] = r12
                r2.f8247s = r7
                r2.f8248t = r7
                com.fyber.inneractive.sdk.player.c.d.a r3 = new com.fyber.inneractive.sdk.player.c.d.a
                r3.<init>(r4, r8, r9, r10)
                goto L_0x00c4
            L_0x00b9:
                r2.f8247s = r7
                r2.f8248t = r7
                com.fyber.inneractive.sdk.player.c.d.m$a r3 = new com.fyber.inneractive.sdk.player.c.d.m$a
                long r6 = r2.f8239k
                r3.<init>(r6)
            L_0x00c4:
                r1.mo19057a((com.fyber.inneractive.sdk.player.p059c.p063d.C3276m) r3)
                r2.f8241m = r5
                return
            L_0x00ca:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.b.d$b> r1 = r2.f8231c
                int r1 = r1.size()
                if (r1 == 0) goto L_0x00d9
                com.fyber.inneractive.sdk.player.c.d.h r1 = r2.f8209F
                r1.mo19058b()
                goto L_0x0715
            L_0x00d9:
                com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
                java.lang.String r2 = "No valid tracks were found"
                r1.<init>(r2)
                throw r1
            L_0x00e1:
                long r3 = r2.f8237i
                int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r1 != 0) goto L_0x00ec
                r3 = 1000000(0xf4240, double:4.940656E-318)
                r2.f8237i = r3
            L_0x00ec:
                long r3 = r2.f8238j
                int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r1 == 0) goto L_0x0715
                long r3 = r2.f8238j
                long r3 = r2.mo19027a((long) r3)
                r2.f8239k = r3
                return
            L_0x00fb:
                com.fyber.inneractive.sdk.player.c.d.b.d$b r1 = r2.f8240l
                boolean r1 = r1.f8276e
                if (r1 == 0) goto L_0x0715
                com.fyber.inneractive.sdk.player.c.d.b.d$b r1 = r2.f8240l
                byte[] r1 = r1.f8277f
                if (r1 != 0) goto L_0x0109
                goto L_0x0715
            L_0x0109:
                com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
                java.lang.String r2 = "Combining encryption and compression is not supported"
                r1.<init>(r2)
                throw r1
            L_0x0111:
                com.fyber.inneractive.sdk.player.c.d.b.d$b r1 = r2.f8240l
                boolean r1 = r1.f8276e
                if (r1 == 0) goto L_0x0715
                com.fyber.inneractive.sdk.player.c.d.b.d$b r1 = r2.f8240l
                byte[] r1 = r1.f8278g
                if (r1 == 0) goto L_0x0138
                com.fyber.inneractive.sdk.player.c.d.b.d$b r1 = r2.f8240l
                com.fyber.inneractive.sdk.player.c.c.a r3 = new com.fyber.inneractive.sdk.player.c.c.a
                com.fyber.inneractive.sdk.player.c.c.a$a[] r4 = new com.fyber.inneractive.sdk.player.p059c.p062c.C3227a.C3229a[r5]
                com.fyber.inneractive.sdk.player.c.c.a$a r5 = new com.fyber.inneractive.sdk.player.c.c.a$a
                java.util.UUID r7 = com.fyber.inneractive.sdk.player.p059c.C3220b.f8105b
                com.fyber.inneractive.sdk.player.c.d.b.d$b r2 = r2.f8240l
                byte[] r2 = r2.f8278g
                java.lang.String r8 = "video/webm"
                r5.<init>(r7, r8, r2)
                r4[r6] = r5
                r3.<init>((com.fyber.inneractive.sdk.player.p059c.p062c.C3227a.C3229a[]) r4)
                r1.f8280i = r3
                return
            L_0x0138:
                com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
                java.lang.String r2 = "Encrypted Track found but ContentEncKeyID was not found"
                r1.<init>(r2)
                throw r1
            L_0x0140:
                int r1 = r2.f8242n
                if (r1 == r8) goto L_0x0153
                long r5 = r2.f8243o
                int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r1 == 0) goto L_0x0153
                int r1 = r2.f8242n
                if (r1 != r4) goto L_0x0715
                long r3 = r2.f8243o
                r2.f8245q = r3
                return
            L_0x0153:
                com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
                java.lang.String r2 = "Mandatory element SeekID or SeekPosition not found"
                r1.<init>(r2)
                throw r1
            L_0x015b:
                com.fyber.inneractive.sdk.player.c.d.b.d$b r1 = r2.f8240l
                java.lang.String r1 = r1.f8272a
                java.lang.String r3 = "V_VP8"
                boolean r9 = r3.equals(r1)
                java.lang.String r10 = "A_TRUEHD"
                java.lang.String r11 = "A_MS/ACM"
                java.lang.String r12 = "V_MPEG4/ISO/AP"
                java.lang.String r13 = "V_MPEG4/ISO/SP"
                java.lang.String r14 = "V_MPEG2"
                java.lang.String r15 = "V_VP9"
                if (r9 != 0) goto L_0x0242
                boolean r9 = r15.equals(r1)
                if (r9 != 0) goto L_0x0242
                boolean r9 = r14.equals(r1)
                if (r9 != 0) goto L_0x0242
                boolean r9 = r13.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "V_MPEG4/ISO/ASP"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                boolean r9 = r12.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "V_MPEG4/ISO/AVC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "V_MPEGH/ISO/HEVC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "V_MS/VFW/FOURCC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "V_THEORA"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_OPUS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_VORBIS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_AAC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_MPEG/L2"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_MPEG/L3"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_AC3"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_EAC3"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                boolean r9 = r10.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_DTS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_DTS/EXPRESS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_DTS/LOSSLESS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_FLAC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                boolean r9 = r11.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "A_PCM/INT/LIT"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "S_TEXT/UTF8"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "S_VOBSUB"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "S_HDMV/PGS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0242
                java.lang.String r9 = "S_DVBSUB"
                boolean r1 = r9.equals(r1)
                if (r1 == 0) goto L_0x0240
                goto L_0x0242
            L_0x0240:
                r1 = 0
                goto L_0x0243
            L_0x0242:
                r1 = 1
            L_0x0243:
                if (r1 == 0) goto L_0x06f2
                com.fyber.inneractive.sdk.player.c.d.b.d$b r1 = r2.f8240l
                com.fyber.inneractive.sdk.player.c.d.h r9 = r2.f8209F
                com.fyber.inneractive.sdk.player.c.d.b.d$b r7 = r2.f8240l
                int r7 = r7.f8273b
                java.lang.String r8 = r1.f8272a
                int r16 = r8.hashCode()
                r17 = 8
                r4 = 3
                switch(r16) {
                    case -2095576542: goto L_0x0383;
                    case -2095575984: goto L_0x037b;
                    case -1985379776: goto L_0x0372;
                    case -1784763192: goto L_0x0369;
                    case -1730367663: goto L_0x035e;
                    case -1482641358: goto L_0x0353;
                    case -1482641357: goto L_0x0348;
                    case -1373388978: goto L_0x033d;
                    case -933872740: goto L_0x0332;
                    case -538363189: goto L_0x0328;
                    case -538363109: goto L_0x031d;
                    case -425012669: goto L_0x0311;
                    case -356037306: goto L_0x0305;
                    case 62923557: goto L_0x02f9;
                    case 62923603: goto L_0x02ed;
                    case 62927045: goto L_0x02e1;
                    case 82338133: goto L_0x02d8;
                    case 82338134: goto L_0x02cf;
                    case 99146302: goto L_0x02c3;
                    case 444813526: goto L_0x02b7;
                    case 542569478: goto L_0x02ab;
                    case 725957860: goto L_0x029f;
                    case 855502857: goto L_0x0294;
                    case 1422270023: goto L_0x0288;
                    case 1809237540: goto L_0x027f;
                    case 1950749482: goto L_0x0273;
                    case 1950789798: goto L_0x0267;
                    case 1951062397: goto L_0x025b;
                    default: goto L_0x0259;
                }
            L_0x0259:
                goto L_0x038b
            L_0x025b:
                java.lang.String r3 = "A_OPUS"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 11
                goto L_0x038c
            L_0x0267:
                java.lang.String r3 = "A_FLAC"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 21
                goto L_0x038c
            L_0x0273:
                java.lang.String r3 = "A_EAC3"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 16
                goto L_0x038c
            L_0x027f:
                boolean r3 = r8.equals(r14)
                if (r3 == 0) goto L_0x038b
                r3 = 2
                goto L_0x038c
            L_0x0288:
                java.lang.String r3 = "S_TEXT/UTF8"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 24
                goto L_0x038c
            L_0x0294:
                java.lang.String r3 = "V_MPEGH/ISO/HEVC"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 7
                goto L_0x038c
            L_0x029f:
                java.lang.String r3 = "A_PCM/INT/LIT"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 23
                goto L_0x038c
            L_0x02ab:
                java.lang.String r3 = "A_DTS/EXPRESS"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 19
                goto L_0x038c
            L_0x02b7:
                java.lang.String r3 = "V_THEORA"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 9
                goto L_0x038c
            L_0x02c3:
                java.lang.String r3 = "S_HDMV/PGS"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 26
                goto L_0x038c
            L_0x02cf:
                boolean r3 = r8.equals(r15)
                if (r3 == 0) goto L_0x038b
                r3 = 1
                goto L_0x038c
            L_0x02d8:
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 0
                goto L_0x038c
            L_0x02e1:
                java.lang.String r3 = "A_DTS"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 18
                goto L_0x038c
            L_0x02ed:
                java.lang.String r3 = "A_AC3"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 15
                goto L_0x038c
            L_0x02f9:
                java.lang.String r3 = "A_AAC"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 12
                goto L_0x038c
            L_0x0305:
                java.lang.String r3 = "A_DTS/LOSSLESS"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 20
                goto L_0x038c
            L_0x0311:
                java.lang.String r3 = "S_VOBSUB"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 25
                goto L_0x038c
            L_0x031d:
                java.lang.String r3 = "V_MPEG4/ISO/AVC"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 6
                goto L_0x038c
            L_0x0328:
                java.lang.String r3 = "V_MPEG4/ISO/ASP"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 4
                goto L_0x038c
            L_0x0332:
                java.lang.String r3 = "S_DVBSUB"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 27
                goto L_0x038c
            L_0x033d:
                java.lang.String r3 = "V_MS/VFW/FOURCC"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 8
                goto L_0x038c
            L_0x0348:
                java.lang.String r3 = "A_MPEG/L3"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 14
                goto L_0x038c
            L_0x0353:
                java.lang.String r3 = "A_MPEG/L2"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 13
                goto L_0x038c
            L_0x035e:
                java.lang.String r3 = "A_VORBIS"
                boolean r3 = r8.equals(r3)
                if (r3 == 0) goto L_0x038b
                r3 = 10
                goto L_0x038c
            L_0x0369:
                boolean r3 = r8.equals(r10)
                if (r3 == 0) goto L_0x038b
                r3 = 17
                goto L_0x038c
            L_0x0372:
                boolean r3 = r8.equals(r11)
                if (r3 == 0) goto L_0x038b
                r3 = 22
                goto L_0x038c
            L_0x037b:
                boolean r3 = r8.equals(r13)
                if (r3 == 0) goto L_0x038b
                r3 = 3
                goto L_0x038c
            L_0x0383:
                boolean r3 = r8.equals(r12)
                if (r3 == 0) goto L_0x038b
                r3 = 5
                goto L_0x038c
            L_0x038b:
                r3 = -1
            L_0x038c:
                java.lang.String r8 = "audio/x-unknown"
                java.lang.String r10 = "MatroskaExtractor"
                switch(r3) {
                    case 0: goto L_0x0522;
                    case 1: goto L_0x051f;
                    case 2: goto L_0x051c;
                    case 3: goto L_0x050c;
                    case 4: goto L_0x050c;
                    case 5: goto L_0x050c;
                    case 6: goto L_0x04f7;
                    case 7: goto L_0x04e3;
                    case 8: goto L_0x04cb;
                    case 9: goto L_0x04c8;
                    case 10: goto L_0x04bd;
                    case 11: goto L_0x047a;
                    case 12: goto L_0x046f;
                    case 13: goto L_0x0469;
                    case 14: goto L_0x0463;
                    case 15: goto L_0x045f;
                    case 16: goto L_0x045b;
                    case 17: goto L_0x0457;
                    case 18: goto L_0x0453;
                    case 19: goto L_0x0453;
                    case 20: goto L_0x044f;
                    case 21: goto L_0x0446;
                    case 22: goto L_0x03fe;
                    case 23: goto L_0x03d1;
                    case 24: goto L_0x03cd;
                    case 25: goto L_0x03c3;
                    case 26: goto L_0x03bf;
                    case 27: goto L_0x039b;
                    default: goto L_0x0393;
                }
            L_0x0393:
                com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>(r2)
                throw r1
            L_0x039b:
                r3 = 4
                byte[] r3 = new byte[r3]
                byte[] r8 = r1.f8279h
                byte r8 = r8[r6]
                r3[r6] = r8
                byte[] r8 = r1.f8279h
                byte r8 = r8[r5]
                r3[r5] = r8
                byte[] r5 = r1.f8279h
                r8 = 2
                byte r5 = r5[r8]
                r3[r8] = r5
                byte[] r5 = r1.f8279h
                byte r5 = r5[r4]
                r3[r4] = r5
                java.util.List r3 = java.util.Collections.singletonList(r3)
                java.lang.String r8 = "application/dvbsubs"
                goto L_0x0477
            L_0x03bf:
                java.lang.String r8 = "application/pgs"
                goto L_0x0524
            L_0x03c3:
                byte[] r3 = r1.f8279h
                java.util.List r3 = java.util.Collections.singletonList(r3)
                java.lang.String r8 = "application/vobsub"
                goto L_0x0477
            L_0x03cd:
                java.lang.String r8 = "application/x-subrip"
                goto L_0x0524
            L_0x03d1:
                int r3 = r1.f8263H
                int r3 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8870a((int) r3)
                if (r3 != 0) goto L_0x03f6
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Unsupported PCM bit depth: "
                r3.<init>(r4)
                int r4 = r1.f8263H
                r3.append(r4)
                java.lang.String r4 = ". Setting mimeType to "
                r3.append(r4)
                r3.append(r8)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r10, r3)
                goto L_0x0524
            L_0x03f6:
                java.lang.String r8 = "audio/raw"
            L_0x03f8:
                r25 = r3
                r3 = -1
                r4 = 0
                goto L_0x0528
            L_0x03fe:
                com.fyber.inneractive.sdk.player.c.k.k r3 = new com.fyber.inneractive.sdk.player.c.k.k
                byte[] r4 = r1.f8279h
                r3.<init>((byte[]) r4)
                boolean r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d.C3253b.m7955b(r3)
                if (r3 == 0) goto L_0x0433
                int r3 = r1.f8263H
                int r3 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.m8870a((int) r3)
                if (r3 != 0) goto L_0x0430
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Unsupported PCM bit depth: "
                r3.<init>(r4)
                int r4 = r1.f8263H
                r3.append(r4)
                java.lang.String r4 = ". Setting mimeType to "
                r3.append(r4)
                r3.append(r8)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r10, r3)
                goto L_0x0524
            L_0x0430:
                java.lang.String r8 = "audio/raw"
                goto L_0x03f8
            L_0x0433:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r3.<init>(r4)
                r3.append(r8)
                java.lang.String r3 = r3.toString()
                android.util.Log.w(r10, r3)
                goto L_0x0524
            L_0x0446:
                byte[] r3 = r1.f8279h
                java.util.List r3 = java.util.Collections.singletonList(r3)
                java.lang.String r8 = "audio/flac"
                goto L_0x0477
            L_0x044f:
                java.lang.String r8 = "audio/vnd.dts.hd"
                goto L_0x0524
            L_0x0453:
                java.lang.String r8 = "audio/vnd.dts"
                goto L_0x0524
            L_0x0457:
                java.lang.String r8 = "audio/true-hd"
                goto L_0x0524
            L_0x045b:
                java.lang.String r8 = "audio/eac3"
                goto L_0x0524
            L_0x045f:
                java.lang.String r8 = "audio/ac3"
                goto L_0x0524
            L_0x0463:
                r3 = 4096(0x1000, float:5.74E-42)
                java.lang.String r8 = "audio/mpeg"
                goto L_0x0525
            L_0x0469:
                r3 = 4096(0x1000, float:5.74E-42)
                java.lang.String r8 = "audio/mpeg-L2"
                goto L_0x0525
            L_0x046f:
                byte[] r3 = r1.f8279h
                java.util.List r3 = java.util.Collections.singletonList(r3)
                java.lang.String r8 = "audio/mp4a-latm"
            L_0x0477:
                r4 = r3
                goto L_0x050a
            L_0x047a:
                r3 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r4)
                byte[] r4 = r1.f8279h
                r5.add(r4)
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r17)
                java.nio.ByteOrder r8 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r4 = r4.order(r8)
                long r10 = r1.f8265J
                java.nio.ByteBuffer r4 = r4.putLong(r10)
                byte[] r4 = r4.array()
                r5.add(r4)
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r17)
                java.nio.ByteOrder r8 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r4 = r4.order(r8)
                long r10 = r1.f8266K
                java.nio.ByteBuffer r4 = r4.putLong(r10)
                byte[] r4 = r4.array()
                r5.add(r4)
                java.lang.String r8 = "audio/opus"
                r4 = r5
                goto L_0x0526
            L_0x04bd:
                r3 = 8192(0x2000, float:1.14794E-41)
                byte[] r4 = r1.f8279h
                java.util.List r4 = com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d.C3253b.m7954a((byte[]) r4)
                java.lang.String r8 = "audio/vorbis"
                goto L_0x0526
            L_0x04c8:
                java.lang.String r8 = "video/x-unknown"
                goto L_0x0524
            L_0x04cb:
                com.fyber.inneractive.sdk.player.c.k.k r3 = new com.fyber.inneractive.sdk.player.c.k.k
                byte[] r4 = r1.f8279h
                r3.<init>((byte[]) r4)
                java.util.List r3 = com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d.C3253b.m7953a((com.fyber.inneractive.sdk.player.p059c.p080k.C3548k) r3)
                if (r3 == 0) goto L_0x04db
                java.lang.String r8 = "video/wvc1"
                goto L_0x0477
            L_0x04db:
                java.lang.String r4 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
                android.util.Log.w(r10, r4)
                java.lang.String r8 = "video/x-unknown"
                goto L_0x0477
            L_0x04e3:
                com.fyber.inneractive.sdk.player.c.k.k r3 = new com.fyber.inneractive.sdk.player.c.k.k
                byte[] r4 = r1.f8279h
                r3.<init>((byte[]) r4)
                com.fyber.inneractive.sdk.player.c.l.c r3 = com.fyber.inneractive.sdk.player.p059c.p081l.C3565c.m8899a(r3)
                java.util.List<byte[]> r4 = r3.f9675a
                int r3 = r3.f9676b
                r1.f8271P = r3
                java.lang.String r8 = "video/hevc"
                goto L_0x050a
            L_0x04f7:
                com.fyber.inneractive.sdk.player.c.k.k r3 = new com.fyber.inneractive.sdk.player.c.k.k
                byte[] r4 = r1.f8279h
                r3.<init>((byte[]) r4)
                com.fyber.inneractive.sdk.player.c.l.a r3 = com.fyber.inneractive.sdk.player.p059c.p081l.C3562a.m8897a(r3)
                java.util.List<byte[]> r4 = r3.f9665a
                int r3 = r3.f9666b
                r1.f8271P = r3
                java.lang.String r8 = "video/avc"
            L_0x050a:
                r3 = -1
                goto L_0x0526
            L_0x050c:
                byte[] r3 = r1.f8279h
                if (r3 != 0) goto L_0x0512
                r3 = 0
                goto L_0x0518
            L_0x0512:
                byte[] r3 = r1.f8279h
                java.util.List r3 = java.util.Collections.singletonList(r3)
            L_0x0518:
                java.lang.String r8 = "video/mp4v-es"
                goto L_0x0477
            L_0x051c:
                java.lang.String r8 = "video/mpeg2"
                goto L_0x0524
            L_0x051f:
                java.lang.String r8 = "video/x-vnd.on2.vp9"
                goto L_0x0524
            L_0x0522:
                java.lang.String r8 = "video/x-vnd.on2.vp8"
            L_0x0524:
                r3 = -1
            L_0x0525:
                r4 = 0
            L_0x0526:
                r25 = -1
            L_0x0528:
                boolean r5 = r1.f8268M
                r5 = r5 | r6
                boolean r10 = r1.f8267L
                if (r10 == 0) goto L_0x0532
                r18 = 2
                goto L_0x0534
            L_0x0532:
                r18 = 0
            L_0x0534:
                r5 = r5 | r18
                boolean r10 = com.fyber.inneractive.sdk.player.p059c.p080k.C3543h.m8800a(r8)
                if (r10 == 0) goto L_0x0560
                java.lang.String r19 = java.lang.Integer.toString(r7)
                r21 = -1
                int r6 = r1.f8262G
                int r7 = r1.f8264I
                com.fyber.inneractive.sdk.player.c.c.a r10 = r1.f8280i
                java.lang.String r11 = r1.f8269N
                r20 = r8
                r22 = r3
                r23 = r6
                r24 = r7
                r26 = r4
                r27 = r10
                r28 = r5
                r29 = r11
                com.fyber.inneractive.sdk.player.c.h r3 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8114a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                goto L_0x06d8
            L_0x0560:
                boolean r10 = com.fyber.inneractive.sdk.player.p059c.p080k.C3543h.m8801b(r8)
                if (r10 == 0) goto L_0x0696
                int r5 = r1.f8285n
                if (r5 != 0) goto L_0x0582
                int r5 = r1.f8283l
                r10 = -1
                if (r5 != r10) goto L_0x0572
                int r5 = r1.f8281j
                goto L_0x0574
            L_0x0572:
                int r5 = r1.f8283l
            L_0x0574:
                r1.f8283l = r5
                int r5 = r1.f8284m
                if (r5 != r10) goto L_0x057d
                int r5 = r1.f8282k
                goto L_0x057f
            L_0x057d:
                int r5 = r1.f8284m
            L_0x057f:
                r1.f8284m = r5
                goto L_0x0583
            L_0x0582:
                r10 = -1
            L_0x0583:
                int r5 = r1.f8283l
                r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r5 == r10) goto L_0x059f
                int r5 = r1.f8284m
                if (r5 == r10) goto L_0x059f
                int r5 = r1.f8282k
                int r10 = r1.f8283l
                int r5 = r5 * r10
                float r5 = (float) r5
                int r10 = r1.f8281j
                int r12 = r1.f8284m
                int r10 = r10 * r12
                float r10 = (float) r10
                float r5 = r5 / r10
                r26 = r5
                goto L_0x05a1
            L_0x059f:
                r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x05a1:
                boolean r5 = r1.f8288q
                if (r5 == 0) goto L_0x066f
                float r5 = r1.f8294w
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0660
                float r5 = r1.f8295x
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0660
                float r5 = r1.f8296y
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0660
                float r5 = r1.f8297z
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0660
                float r5 = r1.f8256A
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0660
                float r5 = r1.f8257B
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0660
                float r5 = r1.f8258C
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0660
                float r5 = r1.f8259D
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0660
                float r5 = r1.f8260E
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 == 0) goto L_0x0660
                float r5 = r1.f8261F
                int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r5 != 0) goto L_0x05e3
                goto L_0x0660
            L_0x05e3:
                r5 = 25
                byte[] r5 = new byte[r5]
                java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r5)
                r10.put(r6)
                float r6 = r1.f8294w
                r11 = 1195593728(0x47435000, float:50000.0)
                float r6 = r6 * r11
                r12 = 1056964608(0x3f000000, float:0.5)
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                float r6 = r1.f8295x
                float r6 = r6 * r11
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                float r6 = r1.f8296y
                float r6 = r6 * r11
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                float r6 = r1.f8297z
                float r6 = r6 * r11
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                float r6 = r1.f8256A
                float r6 = r6 * r11
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                float r6 = r1.f8257B
                float r6 = r6 * r11
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                float r6 = r1.f8258C
                float r6 = r6 * r11
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                float r6 = r1.f8259D
                float r6 = r6 * r11
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                float r6 = r1.f8260E
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                float r6 = r1.f8261F
                float r6 = r6 + r12
                int r6 = (int) r6
                short r6 = (short) r6
                r10.putShort(r6)
                int r6 = r1.f8292u
                short r6 = (short) r6
                r10.putShort(r6)
                int r6 = r1.f8293v
                short r6 = (short) r6
                r10.putShort(r6)
                goto L_0x0661
            L_0x0660:
                r5 = 0
            L_0x0661:
                com.fyber.inneractive.sdk.player.c.l.b r6 = new com.fyber.inneractive.sdk.player.c.l.b
                int r10 = r1.f8289r
                int r11 = r1.f8291t
                int r12 = r1.f8290s
                r6.<init>(r10, r11, r12, r5)
                r29 = r6
                goto L_0x0671
            L_0x066f:
                r29 = 0
            L_0x0671:
                java.lang.String r19 = java.lang.Integer.toString(r7)
                int r5 = r1.f8281j
                int r6 = r1.f8282k
                r25 = -1
                byte[] r7 = r1.f8286o
                int r10 = r1.f8287p
                com.fyber.inneractive.sdk.player.c.c.a r11 = r1.f8280i
                r20 = r8
                r21 = r3
                r22 = r5
                r23 = r6
                r24 = r4
                r27 = r7
                r28 = r10
                r30 = r11
                com.fyber.inneractive.sdk.player.c.h r3 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8116a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                goto L_0x06d8
            L_0x0696:
                java.lang.String r3 = "application/x-subrip"
                boolean r3 = r3.equals(r8)
                if (r3 == 0) goto L_0x06ab
                java.lang.String r3 = java.lang.Integer.toString(r7)
                java.lang.String r4 = r1.f8269N
                com.fyber.inneractive.sdk.player.c.c.a r6 = r1.f8280i
                com.fyber.inneractive.sdk.player.c.h r3 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8120a((java.lang.String) r3, (java.lang.String) r8, (int) r5, (java.lang.String) r4, (com.fyber.inneractive.sdk.player.p059c.p062c.C3227a) r6)
                goto L_0x06d8
            L_0x06ab:
                java.lang.String r3 = "application/vobsub"
                boolean r3 = r3.equals(r8)
                if (r3 != 0) goto L_0x06cc
                java.lang.String r3 = "application/pgs"
                boolean r3 = r3.equals(r8)
                if (r3 != 0) goto L_0x06cc
                java.lang.String r3 = "application/dvbsubs"
                boolean r3 = r3.equals(r8)
                if (r3 == 0) goto L_0x06c4
                goto L_0x06cc
            L_0x06c4:
                com.fyber.inneractive.sdk.player.c.l r1 = new com.fyber.inneractive.sdk.player.c.l
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>(r2)
                throw r1
            L_0x06cc:
                java.lang.String r3 = java.lang.Integer.toString(r7)
                java.lang.String r5 = r1.f8269N
                com.fyber.inneractive.sdk.player.c.c.a r6 = r1.f8280i
                com.fyber.inneractive.sdk.player.c.h r3 = com.fyber.inneractive.sdk.player.p059c.C3290h.m8122a((java.lang.String) r3, (java.lang.String) r8, (java.util.List<byte[]>) r4, (java.lang.String) r5, (com.fyber.inneractive.sdk.player.p059c.p062c.C3227a) r6)
            L_0x06d8:
                int r4 = r1.f8273b
                com.fyber.inneractive.sdk.player.c.d.n r4 = r9.mo19056a((int) r4)
                r1.f8270O = r4
                com.fyber.inneractive.sdk.player.c.d.n r1 = r1.f8270O
                r1.mo19040a(r3)
                android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.b.d$b> r1 = r2.f8231c
                com.fyber.inneractive.sdk.player.c.d.b.d$b r3 = r2.f8240l
                int r3 = r3.f8273b
                com.fyber.inneractive.sdk.player.c.d.b.d$b r4 = r2.f8240l
                r1.put(r3, r4)
                r1 = 0
                goto L_0x06f3
            L_0x06f2:
                r1 = r7
            L_0x06f3:
                r2.f8240l = r1
                return
            L_0x06f6:
                int r1 = r2.f8250v
                r3 = 2
                if (r1 != r3) goto L_0x0715
                boolean r1 = r2.f8208E
                if (r1 != 0) goto L_0x0704
                int r1 = r2.f8207D
                r1 = r1 | r5
                r2.f8207D = r1
            L_0x0704:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.b.d$b> r1 = r2.f8231c
                int r3 = r2.f8205B
                java.lang.Object r1 = r1.get(r3)
                com.fyber.inneractive.sdk.player.c.d.b.d$b r1 = (com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d.C3253b) r1
                long r3 = r2.f8251w
                r2.mo19028a((com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d.C3253b) r1, (long) r3)
                r2.f8250v = r6
            L_0x0715:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p065b.C3250d.C3252a.mo19026c(int):void");
        }

        /* renamed from: a */
        public final void mo19022a(int i, long j) throws C3295l {
            C3250d dVar = C3250d.this;
            if (i != 20529) {
                if (i != 20530) {
                    boolean z = false;
                    switch (i) {
                        case 131:
                            dVar.f8240l.f8274c = (int) j;
                            return;
                        case 136:
                            C3253b bVar = dVar.f8240l;
                            if (j == 1) {
                                z = true;
                            }
                            bVar.f8267L = z;
                            return;
                        case 155:
                            dVar.f8252x = dVar.mo19027a(j);
                            return;
                        case 159:
                            dVar.f8240l.f8262G = (int) j;
                            return;
                        case 176:
                            dVar.f8240l.f8281j = (int) j;
                            return;
                        case 179:
                            dVar.f8247s.mo19373a(dVar.mo19027a(j));
                            return;
                        case 186:
                            dVar.f8240l.f8282k = (int) j;
                            return;
                        case 215:
                            dVar.f8240l.f8273b = (int) j;
                            return;
                        case 231:
                            dVar.f8246r = dVar.mo19027a(j);
                            return;
                        case 241:
                            if (!dVar.f8249u) {
                                dVar.f8248t.mo19373a(j);
                                dVar.f8249u = true;
                                return;
                            }
                            return;
                        case 251:
                            dVar.f8208E = true;
                            return;
                        case 16980:
                            if (j != 3) {
                                throw new C3295l("ContentCompAlgo " + j + " not supported");
                            }
                            return;
                        case 17029:
                            if (j < 1 || j > 2) {
                                throw new C3295l("DocTypeReadVersion " + j + " not supported");
                            }
                            return;
                        case 17143:
                            if (j != 1) {
                                throw new C3295l("EBMLReadVersion " + j + " not supported");
                            }
                            return;
                        case 18401:
                            if (j != 5) {
                                throw new C3295l("ContentEncAlgo " + j + " not supported");
                            }
                            return;
                        case 18408:
                            if (j != 1) {
                                throw new C3295l("AESSettingsCipherMode " + j + " not supported");
                            }
                            return;
                        case 21420:
                            dVar.f8243o = j + dVar.f8236h;
                            return;
                        case 21432:
                            int i2 = (int) j;
                            if (i2 == 0) {
                                dVar.f8240l.f8287p = 0;
                                return;
                            } else if (i2 == 1) {
                                dVar.f8240l.f8287p = 2;
                                return;
                            } else if (i2 == 3) {
                                dVar.f8240l.f8287p = 1;
                                return;
                            } else if (i2 == 15) {
                                dVar.f8240l.f8287p = 3;
                                return;
                            } else {
                                return;
                            }
                        case 21680:
                            dVar.f8240l.f8283l = (int) j;
                            return;
                        case 21682:
                            dVar.f8240l.f8285n = (int) j;
                            return;
                        case 21690:
                            dVar.f8240l.f8284m = (int) j;
                            return;
                        case 21930:
                            C3253b bVar2 = dVar.f8240l;
                            if (j == 1) {
                                z = true;
                            }
                            bVar2.f8268M = z;
                            return;
                        case 22186:
                            dVar.f8240l.f8265J = j;
                            return;
                        case 22203:
                            dVar.f8240l.f8266K = j;
                            return;
                        case 25188:
                            dVar.f8240l.f8263H = (int) j;
                            return;
                        case 2352003:
                            dVar.f8240l.f8275d = (int) j;
                            return;
                        case 2807729:
                            dVar.f8237i = j;
                            return;
                        default:
                            switch (i) {
                                case 21945:
                                    int i3 = (int) j;
                                    if (i3 == 1) {
                                        dVar.f8240l.f8291t = 2;
                                        return;
                                    } else if (i3 == 2) {
                                        dVar.f8240l.f8291t = 1;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21946:
                                    int i4 = (int) j;
                                    if (i4 != 1) {
                                        if (i4 == 16) {
                                            dVar.f8240l.f8290s = 6;
                                            return;
                                        } else if (i4 == 18) {
                                            dVar.f8240l.f8290s = 7;
                                            return;
                                        } else if (!(i4 == 6 || i4 == 7)) {
                                            return;
                                        }
                                    }
                                    dVar.f8240l.f8290s = 3;
                                    return;
                                case 21947:
                                    dVar.f8240l.f8288q = true;
                                    int i5 = (int) j;
                                    if (i5 == 1) {
                                        dVar.f8240l.f8289r = 1;
                                        return;
                                    } else if (i5 == 9) {
                                        dVar.f8240l.f8289r = 6;
                                        return;
                                    } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                        dVar.f8240l.f8289r = 2;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21948:
                                    dVar.f8240l.f8292u = (int) j;
                                    return;
                                case 21949:
                                    dVar.f8240l.f8293v = (int) j;
                                    return;
                                default:
                                    return;
                            }
                    }
                } else if (j != 1) {
                    throw new C3295l("ContentEncodingScope " + j + " not supported");
                }
            } else if (j != 0) {
                throw new C3295l("ContentEncodingOrder " + j + " not supported");
            }
        }

        /* renamed from: a */
        public final void mo19020a(int i, double d) throws C3295l {
            C3250d dVar = C3250d.this;
            if (i == 181) {
                dVar.f8240l.f8264I = (int) d;
            } else if (i != 17545) {
                switch (i) {
                    case 21969:
                        dVar.f8240l.f8294w = (float) d;
                        return;
                    case 21970:
                        dVar.f8240l.f8295x = (float) d;
                        return;
                    case 21971:
                        dVar.f8240l.f8296y = (float) d;
                        return;
                    case 21972:
                        dVar.f8240l.f8297z = (float) d;
                        return;
                    case 21973:
                        dVar.f8240l.f8256A = (float) d;
                        return;
                    case 21974:
                        dVar.f8240l.f8257B = (float) d;
                        return;
                    case 21975:
                        dVar.f8240l.f8258C = (float) d;
                        return;
                    case 21976:
                        dVar.f8240l.f8259D = (float) d;
                        return;
                    case 21977:
                        dVar.f8240l.f8260E = (float) d;
                        return;
                    case 21978:
                        dVar.f8240l.f8261F = (float) d;
                        return;
                    default:
                        return;
                }
            } else {
                dVar.f8238j = (long) d;
            }
        }

        /* renamed from: a */
        public final void mo19024a(int i, String str) throws C3295l {
            C3250d dVar = C3250d.this;
            if (i == 134) {
                dVar.f8240l.f8272a = str;
            } else if (i != 17026) {
                if (i == 2274716) {
                    dVar.f8240l.f8269N = str;
                }
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw new C3295l("DocType " + str + " not supported");
            }
        }

        /* renamed from: a */
        public final void mo19021a(int i, int i2, C3269g gVar) throws IOException, InterruptedException {
            int i3;
            byte b;
            int i4 = i;
            int i5 = i2;
            C3269g gVar2 = gVar;
            C3250d dVar = C3250d.this;
            int i6 = 0;
            if (i4 == 161 || i4 == 163) {
                int i7 = 1;
                if (dVar.f8250v == 0) {
                    dVar.f8205B = (int) dVar.f8230b.mo19032a(gVar2, false, true, 8);
                    dVar.f8206C = dVar.f8230b.f8301a;
                    dVar.f8252x = -9223372036854775807L;
                    dVar.f8250v = 1;
                    dVar.f8233e.mo19378a();
                }
                C3253b bVar = dVar.f8231c.get(dVar.f8205B);
                if (bVar == null) {
                    gVar2.mo19009b(i5 - dVar.f8206C);
                    dVar.f8250v = 0;
                    return;
                }
                if (dVar.f8250v == 1) {
                    dVar.mo19029a(gVar2, 3);
                    int i8 = (dVar.f8233e.f9625a[2] & 6) >> 1;
                    byte b2 = 255;
                    if (i8 == 0) {
                        dVar.f8254z = 1;
                        dVar.f8204A = C3250d.m7933a(dVar.f8204A, 1);
                        dVar.f8204A[0] = (i5 - dVar.f8206C) - 3;
                    } else if (i4 == 163) {
                        int i9 = 4;
                        dVar.mo19029a(gVar2, 4);
                        dVar.f8254z = (dVar.f8233e.f9625a[3] & 255) + 1;
                        dVar.f8204A = C3250d.m7933a(dVar.f8204A, dVar.f8254z);
                        if (i8 == 2) {
                            Arrays.fill(dVar.f8204A, 0, dVar.f8254z, ((i5 - dVar.f8206C) - 4) / dVar.f8254z);
                        } else if (i8 == 1) {
                            int i10 = 0;
                            for (int i11 = 0; i11 < dVar.f8254z - 1; i11++) {
                                dVar.f8204A[i11] = 0;
                                do {
                                    i9++;
                                    dVar.mo19029a(gVar2, i9);
                                    b = dVar.f8233e.f9625a[i9 - 1] & 255;
                                    int[] iArr = dVar.f8204A;
                                    iArr[i11] = iArr[i11] + b;
                                } while (b == 255);
                                i10 += dVar.f8204A[i11];
                            }
                            dVar.f8204A[dVar.f8254z - 1] = ((i5 - dVar.f8206C) - i9) - i10;
                        } else if (i8 == 3) {
                            int i12 = 0;
                            int i13 = 0;
                            while (i12 < dVar.f8254z - i7) {
                                dVar.f8204A[i12] = i6;
                                i9++;
                                dVar.mo19029a(gVar2, i9);
                                int i14 = i9 - 1;
                                if (dVar.f8233e.f9625a[i14] != 0) {
                                    long j = 0;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= 8) {
                                            i3 = i13;
                                            break;
                                        }
                                        int i16 = i7 << (7 - i15);
                                        if ((dVar.f8233e.f9625a[i14] & i16) != 0) {
                                            i9 += i15;
                                            dVar.mo19029a(gVar2, i9);
                                            i3 = i13;
                                            long j2 = (long) (dVar.f8233e.f9625a[i14] & b2 & (~i16));
                                            int i17 = i14 + 1;
                                            while (true) {
                                                j = j2;
                                                if (i17 >= i9) {
                                                    break;
                                                }
                                                j2 = (j << 8) | ((long) (dVar.f8233e.f9625a[i17] & b2));
                                                i17++;
                                                b2 = 255;
                                            }
                                            if (i12 > 0) {
                                                j -= (1 << ((i15 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            int i18 = i13;
                                            i15++;
                                            i7 = 1;
                                            b2 = 255;
                                        }
                                    }
                                    long j3 = j;
                                    if (j3 < -2147483648L || j3 > 2147483647L) {
                                        throw new C3295l("EBML lacing sample size out of range.");
                                    }
                                    int i19 = (int) j3;
                                    int[] iArr2 = dVar.f8204A;
                                    if (i12 != 0) {
                                        i19 += dVar.f8204A[i12 - 1];
                                    }
                                    iArr2[i12] = i19;
                                    i13 = i3 + dVar.f8204A[i12];
                                    i12++;
                                    i6 = 0;
                                    i7 = 1;
                                    b2 = 255;
                                } else {
                                    throw new C3295l("No valid varint length mask found");
                                }
                            }
                            dVar.f8204A[dVar.f8254z - 1] = ((i5 - dVar.f8206C) - i9) - i13;
                        } else {
                            throw new C3295l("Unexpected lacing value: " + i8);
                        }
                    } else {
                        throw new C3295l("Lacing only supported in SimpleBlocks.");
                    }
                    dVar.f8251w = dVar.f8246r + dVar.mo19027a((long) ((dVar.f8233e.f9625a[0] << 8) | (dVar.f8233e.f9625a[1] & 255)));
                    dVar.f8207D = ((dVar.f8233e.f9625a[2] & 8) == 8 ? Integer.MIN_VALUE : 0) | ((bVar.f8274c == 2 || (i4 == 163 && (dVar.f8233e.f9625a[2] & 128) == 128)) ? 1 : 0);
                    dVar.f8250v = 2;
                    dVar.f8253y = 0;
                }
                if (i4 == 163) {
                    while (dVar.f8253y < dVar.f8254z) {
                        dVar.mo19030a(gVar2, bVar, dVar.f8204A[dVar.f8253y]);
                        dVar.mo19028a(bVar, dVar.f8251w + ((long) ((dVar.f8253y * bVar.f8275d) / 1000)));
                        dVar.f8253y++;
                    }
                    dVar.f8250v = 0;
                    return;
                }
                dVar.mo19030a(gVar2, bVar, dVar.f8204A[0]);
            } else if (i4 == 16981) {
                dVar.f8240l.f8277f = new byte[i5];
                gVar2.mo19010b(dVar.f8240l.f8277f, 0, i5);
            } else if (i4 == 18402) {
                dVar.f8240l.f8278g = new byte[i5];
                gVar2.mo19010b(dVar.f8240l.f8278g, 0, i5);
            } else if (i4 == 21419) {
                Arrays.fill(dVar.f8234f.f9625a, (byte) 0);
                gVar2.mo19010b(dVar.f8234f.f9625a, 4 - i5, i5);
                dVar.f8234f.mo19386c(0);
                dVar.f8242n = (int) dVar.f8234f.mo19394h();
            } else if (i4 == 25506) {
                dVar.f8240l.f8279h = new byte[i5];
                gVar2.mo19010b(dVar.f8240l.f8279h, 0, i5);
            } else if (i4 == 30322) {
                dVar.f8240l.f8286o = new byte[i5];
                gVar2.mo19010b(dVar.f8240l.f8286o, 0, i5);
            } else {
                throw new C3295l("Unexpected id: " + i4);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.b.d$b */
    private static final class C3253b {

        /* renamed from: A */
        public float f8256A;

        /* renamed from: B */
        public float f8257B;

        /* renamed from: C */
        public float f8258C;

        /* renamed from: D */
        public float f8259D;

        /* renamed from: E */
        public float f8260E;

        /* renamed from: F */
        public float f8261F;

        /* renamed from: G */
        public int f8262G;

        /* renamed from: H */
        public int f8263H;

        /* renamed from: I */
        public int f8264I;

        /* renamed from: J */
        public long f8265J;

        /* renamed from: K */
        public long f8266K;

        /* renamed from: L */
        public boolean f8267L;

        /* renamed from: M */
        public boolean f8268M;

        /* renamed from: N */
        String f8269N;

        /* renamed from: O */
        public C3278n f8270O;

        /* renamed from: P */
        public int f8271P;

        /* renamed from: a */
        public String f8272a;

        /* renamed from: b */
        public int f8273b;

        /* renamed from: c */
        public int f8274c;

        /* renamed from: d */
        public int f8275d;

        /* renamed from: e */
        public boolean f8276e;

        /* renamed from: f */
        public byte[] f8277f;

        /* renamed from: g */
        public byte[] f8278g;

        /* renamed from: h */
        public byte[] f8279h;

        /* renamed from: i */
        public C3227a f8280i;

        /* renamed from: j */
        public int f8281j;

        /* renamed from: k */
        public int f8282k;

        /* renamed from: l */
        public int f8283l;

        /* renamed from: m */
        public int f8284m;

        /* renamed from: n */
        public int f8285n;

        /* renamed from: o */
        public byte[] f8286o;

        /* renamed from: p */
        public int f8287p;

        /* renamed from: q */
        public boolean f8288q;

        /* renamed from: r */
        public int f8289r;

        /* renamed from: s */
        public int f8290s;

        /* renamed from: t */
        public int f8291t;

        /* renamed from: u */
        public int f8292u;

        /* renamed from: v */
        public int f8293v;

        /* renamed from: w */
        public float f8294w;

        /* renamed from: x */
        public float f8295x;

        /* renamed from: y */
        public float f8296y;

        /* renamed from: z */
        public float f8297z;

        private C3253b() {
            this.f8281j = -1;
            this.f8282k = -1;
            this.f8283l = -1;
            this.f8284m = -1;
            this.f8285n = 0;
            this.f8286o = null;
            this.f8287p = -1;
            this.f8288q = false;
            this.f8289r = -1;
            this.f8290s = -1;
            this.f8291t = -1;
            this.f8292u = 1000;
            this.f8293v = 200;
            this.f8294w = -1.0f;
            this.f8295x = -1.0f;
            this.f8296y = -1.0f;
            this.f8297z = -1.0f;
            this.f8256A = -1.0f;
            this.f8257B = -1.0f;
            this.f8258C = -1.0f;
            this.f8259D = -1.0f;
            this.f8260E = -1.0f;
            this.f8261F = -1.0f;
            this.f8262G = 1;
            this.f8263H = -1;
            this.f8264I = 8000;
            this.f8265J = 0;
            this.f8266K = 0;
            this.f8268M = true;
            this.f8269N = "eng";
        }

        /* synthetic */ C3253b(byte b) {
            this();
        }

        /* renamed from: a */
        static List<byte[]> m7953a(C3548k kVar) throws C3295l {
            try {
                kVar.mo19388d(16);
                if (kVar.mo19395i() != 826496599) {
                    return null;
                }
                byte[] bArr = kVar.f9625a;
                for (int i = kVar.f9626b + 20; i < bArr.length - 4; i++) {
                    if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, i, bArr.length));
                    }
                }
                throw new C3295l("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C3295l("Error parsing FourCC VC1 codec private");
            }
        }

        /* renamed from: a */
        static List<byte[]> m7954a(byte[] bArr) throws C3295l {
            try {
                if (bArr[0] == 2) {
                    int i = 1;
                    int i2 = 0;
                    while (bArr[i] == -1) {
                        i2 += 255;
                        i++;
                    }
                    int i3 = i + 1;
                    int i4 = i2 + bArr[i];
                    int i5 = 0;
                    while (bArr[i3] == -1) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + bArr[i3];
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new C3295l("Error parsing vorbis codec private");
                        }
                        throw new C3295l("Error parsing vorbis codec private");
                    }
                    throw new C3295l("Error parsing vorbis codec private");
                }
                throw new C3295l("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C3295l("Error parsing vorbis codec private");
            }
        }

        /* renamed from: b */
        static boolean m7955b(C3548k kVar) throws C3295l {
            try {
                int f = kVar.mo19391f();
                if (f == 1) {
                    return true;
                }
                if (f == 65534) {
                    kVar.mo19386c(24);
                    return kVar.mo19398l() == C3250d.f8202I.getMostSignificantBits() && kVar.mo19398l() == C3250d.f8202I.getLeastSignificantBits();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C3295l("Error parsing MS/ACM codec private");
            }
        }
    }
}
