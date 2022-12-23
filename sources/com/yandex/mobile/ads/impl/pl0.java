package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.common.base.Ascii;
import com.yandex.mobile.ads.exo.C12178d;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.C12186c;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.impl.rl0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class pl0 extends C12178d {

    /* renamed from: u0 */
    private static final byte[] f38641u0 = {0, 0, 1, 103, 66, -64, Ascii.f10113VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.f10109SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.f10100CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.f10103FS, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private C12186c<s70> f38642A;

    /* renamed from: B */
    private MediaCrypto f38643B;

    /* renamed from: C */
    private boolean f38644C;

    /* renamed from: D */
    private long f38645D = -9223372036854775807L;

    /* renamed from: E */
    private float f38646E = 1.0f;

    /* renamed from: F */
    private MediaCodec f38647F;

    /* renamed from: G */
    private Format f38648G;

    /* renamed from: H */
    private float f38649H = -1.0f;

    /* renamed from: I */
    private ArrayDeque<ol0> f38650I;

    /* renamed from: J */
    private C14286a f38651J;

    /* renamed from: K */
    private ol0 f38652K;

    /* renamed from: L */
    private int f38653L;

    /* renamed from: M */
    private boolean f38654M;

    /* renamed from: N */
    private boolean f38655N;

    /* renamed from: O */
    private boolean f38656O;

    /* renamed from: P */
    private boolean f38657P;

    /* renamed from: Q */
    private boolean f38658Q;

    /* renamed from: R */
    private boolean f38659R;

    /* renamed from: S */
    private boolean f38660S;

    /* renamed from: T */
    private boolean f38661T;

    /* renamed from: U */
    private boolean f38662U;

    /* renamed from: V */
    private boolean f38663V;

    /* renamed from: W */
    private ByteBuffer[] f38664W;

    /* renamed from: X */
    private ByteBuffer[] f38665X;

    /* renamed from: Y */
    private long f38666Y;

    /* renamed from: Z */
    private int f38667Z;

    /* renamed from: a0 */
    private int f38668a0;

    /* renamed from: b0 */
    private ByteBuffer f38669b0;

    /* renamed from: c0 */
    private boolean f38670c0;

    /* renamed from: d0 */
    private boolean f38671d0;

    /* renamed from: e0 */
    private boolean f38672e0;

    /* renamed from: f0 */
    private int f38673f0 = 0;

    /* renamed from: g0 */
    private int f38674g0 = 0;

    /* renamed from: h0 */
    private int f38675h0 = 0;

    /* renamed from: i0 */
    private boolean f38676i0;

    /* renamed from: j0 */
    private boolean f38677j0;

    /* renamed from: k0 */
    private boolean f38678k0;

    /* renamed from: l0 */
    private long f38679l0;

    /* renamed from: m */
    private final ql0 f38680m;

    /* renamed from: m0 */
    private long f38681m0;

    /* renamed from: n */
    private final C12188d<s70> f38682n;

    /* renamed from: n0 */
    private boolean f38683n0;

    /* renamed from: o */
    private final boolean f38684o;

    /* renamed from: o0 */
    private boolean f38685o0;

    /* renamed from: p */
    private final boolean f38686p;

    /* renamed from: p0 */
    private boolean f38687p0;

    /* renamed from: q */
    private final float f38688q;

    /* renamed from: q0 */
    private boolean f38689q0;

    /* renamed from: r */
    private final C14387qj f38690r = new C14387qj(0);

    /* renamed from: r0 */
    private boolean f38691r0;

    /* renamed from: s */
    private final C14387qj f38692s = C14387qj.m41248j();

    /* renamed from: s0 */
    private boolean f38693s0;

    /* renamed from: t */
    private final wd1<Format> f38694t = new wd1<>();

    /* renamed from: t0 */
    protected C14283pj f38695t0;

    /* renamed from: u */
    private final ArrayList<Long> f38696u = new ArrayList<>();

    /* renamed from: v */
    private final MediaCodec.BufferInfo f38697v = new MediaCodec.BufferInfo();

    /* renamed from: w */
    private boolean f38698w;

    /* renamed from: x */
    private Format f38699x;

    /* renamed from: y */
    private Format f38700y;

    /* renamed from: z */
    private C12186c<s70> f38701z;

    public pl0(int i, ql0 ql0, C12188d<s70> dVar, boolean z, boolean z2, float f) {
        super(i);
        this.f38680m = (ql0) C13479j9.m37703a(ql0);
        this.f38682n = dVar;
        this.f38684o = z;
        this.f38686p = z2;
        this.f38688q = f;
    }

    /* renamed from: B */
    private void m40798B() throws k40 {
        if (this.f38676i0) {
            this.f38674g0 = 1;
            this.f38675h0 = 3;
            return;
        }
        mo65427L();
        mo69381J();
    }

    /* renamed from: C */
    private void m40799C() throws k40 {
        if (ih1.f34858a < 23) {
            m40798B();
        } else if (this.f38676i0) {
            this.f38674g0 = 1;
            this.f38675h0 = 2;
        } else {
            m40805R();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x0165 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0166  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m40800D() throws com.yandex.mobile.ads.impl.k40 {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.f38647F
            r1 = 0
            if (r0 == 0) goto L_0x0248
            int r2 = r14.f38674g0
            r3 = 2
            if (r2 == r3) goto L_0x0248
            boolean r2 = r14.f38683n0
            if (r2 == 0) goto L_0x0010
            goto L_0x0248
        L_0x0010:
            int r2 = r14.f38667Z
            if (r2 >= 0) goto L_0x0039
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r14.f38667Z = r0
            if (r0 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            com.yandex.mobile.ads.impl.qj r2 = r14.f38690r
            int r4 = com.yandex.mobile.ads.impl.ih1.f34858a
            r5 = 21
            if (r4 < r5) goto L_0x002e
            android.media.MediaCodec r4 = r14.f38647F
            java.nio.ByteBuffer r0 = r4.getInputBuffer(r0)
            goto L_0x0032
        L_0x002e:
            java.nio.ByteBuffer[] r4 = r14.f38664W
            r0 = r4[r0]
        L_0x0032:
            r2.f39147d = r0
            com.yandex.mobile.ads.impl.qj r0 = r14.f38690r
            r0.mo66557b()
        L_0x0039:
            int r0 = r14.f38674g0
            r2 = 1
            if (r0 != r2) goto L_0x0057
            boolean r0 = r14.f38663V
            if (r0 == 0) goto L_0x0043
            goto L_0x0054
        L_0x0043:
            r14.f38677j0 = r2
            android.media.MediaCodec r4 = r14.f38647F
            int r5 = r14.f38667Z
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 4
            r4.queueInputBuffer(r5, r6, r7, r8, r10)
            r14.m40802N()
        L_0x0054:
            r14.f38674g0 = r3
            return r1
        L_0x0057:
            boolean r0 = r14.f38661T
            if (r0 == 0) goto L_0x0078
            r14.f38661T = r1
            com.yandex.mobile.ads.impl.qj r0 = r14.f38690r
            java.nio.ByteBuffer r0 = r0.f39147d
            byte[] r1 = f38641u0
            r0.put(r1)
            android.media.MediaCodec r3 = r14.f38647F
            int r4 = r14.f38667Z
            int r6 = r1.length
            r5 = 0
            r7 = 0
            r9 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)
            r14.m40802N()
            r14.f38676i0 = r2
            return r2
        L_0x0078:
            com.yandex.mobile.ads.impl.q70 r0 = r14.mo64824t()
            boolean r4 = r14.f38687p0
            if (r4 == 0) goto L_0x0083
            r4 = -4
            r5 = 0
            goto L_0x00b9
        L_0x0083:
            int r4 = r14.f38673f0
            if (r4 != r2) goto L_0x00a8
            r4 = 0
        L_0x0088:
            com.yandex.mobile.ads.exo.Format r5 = r14.f38648G
            java.util.List<byte[]> r5 = r5.f29532l
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x00a6
            com.yandex.mobile.ads.exo.Format r5 = r14.f38648G
            java.util.List<byte[]> r5 = r5.f29532l
            java.lang.Object r5 = r5.get(r4)
            byte[] r5 = (byte[]) r5
            com.yandex.mobile.ads.impl.qj r6 = r14.f38690r
            java.nio.ByteBuffer r6 = r6.f39147d
            r6.put(r5)
            int r4 = r4 + 1
            goto L_0x0088
        L_0x00a6:
            r14.f38673f0 = r3
        L_0x00a8:
            com.yandex.mobile.ads.impl.qj r4 = r14.f38690r
            java.nio.ByteBuffer r4 = r4.f39147d
            int r4 = r4.position()
            com.yandex.mobile.ads.impl.qj r5 = r14.f38690r
            int r5 = r14.mo64796a((com.yandex.mobile.ads.impl.q70) r0, (com.yandex.mobile.ads.impl.C14387qj) r5, (boolean) r1)
            r13 = r5
            r5 = r4
            r4 = r13
        L_0x00b9:
            boolean r6 = r14.mo64817k()
            if (r6 == 0) goto L_0x00c3
            long r6 = r14.f38679l0
            r14.f38681m0 = r6
        L_0x00c3:
            r6 = -3
            if (r4 != r6) goto L_0x00c7
            return r1
        L_0x00c7:
            r6 = -5
            if (r4 != r6) goto L_0x00d9
            int r1 = r14.f38673f0
            if (r1 != r3) goto L_0x00d5
            com.yandex.mobile.ads.impl.qj r1 = r14.f38690r
            r1.mo66557b()
            r14.f38673f0 = r2
        L_0x00d5:
            r14.mo65437a((com.yandex.mobile.ads.impl.q70) r0)
            return r2
        L_0x00d9:
            com.yandex.mobile.ads.impl.qj r0 = r14.f38690r
            boolean r0 = r0.mo71021e()
            if (r0 == 0) goto L_0x0115
            int r0 = r14.f38673f0
            if (r0 != r3) goto L_0x00ec
            com.yandex.mobile.ads.impl.qj r0 = r14.f38690r
            r0.mo66557b()
            r14.f38673f0 = r2
        L_0x00ec:
            r14.f38683n0 = r2
            boolean r0 = r14.f38676i0
            if (r0 != 0) goto L_0x00f6
            r14.m40801K()
            return r1
        L_0x00f6:
            boolean r0 = r14.f38663V     // Catch:{ CryptoException -> 0x010d }
            if (r0 == 0) goto L_0x00fb
            goto L_0x010c
        L_0x00fb:
            r14.f38677j0 = r2     // Catch:{ CryptoException -> 0x010d }
            android.media.MediaCodec r3 = r14.f38647F     // Catch:{ CryptoException -> 0x010d }
            int r4 = r14.f38667Z     // Catch:{ CryptoException -> 0x010d }
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 4
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch:{ CryptoException -> 0x010d }
            r14.m40802N()     // Catch:{ CryptoException -> 0x010d }
        L_0x010c:
            return r1
        L_0x010d:
            r0 = move-exception
            com.yandex.mobile.ads.exo.Format r1 = r14.f38699x
            com.yandex.mobile.ads.impl.k40 r0 = r14.mo64798a((java.lang.Exception) r0, (com.yandex.mobile.ads.exo.Format) r1)
            throw r0
        L_0x0115:
            boolean r0 = r14.f38689q0
            if (r0 == 0) goto L_0x012d
            com.yandex.mobile.ads.impl.qj r0 = r14.f38690r
            boolean r0 = r0.mo71022f()
            if (r0 != 0) goto L_0x012d
            com.yandex.mobile.ads.impl.qj r0 = r14.f38690r
            r0.mo66557b()
            int r0 = r14.f38673f0
            if (r0 != r3) goto L_0x012c
            r14.f38673f0 = r2
        L_0x012c:
            return r2
        L_0x012d:
            r14.f38689q0 = r1
            com.yandex.mobile.ads.impl.qj r0 = r14.f38690r
            boolean r0 = r0.mo69602h()
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r3 = r14.f38701z
            if (r3 == 0) goto L_0x0160
            if (r0 != 0) goto L_0x0146
            boolean r4 = r14.f38684o
            if (r4 != 0) goto L_0x0160
            boolean r3 = r3.mo64848a()
            if (r3 == 0) goto L_0x0146
            goto L_0x0160
        L_0x0146:
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r3 = r14.f38701z
            int r3 = r3.mo64858b()
            if (r3 == r2) goto L_0x0153
            r4 = 4
            if (r3 == r4) goto L_0x0160
            r3 = 1
            goto L_0x0161
        L_0x0153:
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r0 = r14.f38701z
            com.yandex.mobile.ads.exo.drm.c$a r0 = r0.mo64860d()
            com.yandex.mobile.ads.exo.Format r1 = r14.f38699x
            com.yandex.mobile.ads.impl.k40 r0 = r14.mo64798a((java.lang.Exception) r0, (com.yandex.mobile.ads.exo.Format) r1)
            throw r0
        L_0x0160:
            r3 = 0
        L_0x0161:
            r14.f38687p0 = r3
            if (r3 == 0) goto L_0x0166
            return r1
        L_0x0166:
            boolean r3 = r14.f38655N
            if (r3 == 0) goto L_0x01bb
            if (r0 != 0) goto L_0x01bb
            com.yandex.mobile.ads.impl.qj r3 = r14.f38690r
            java.nio.ByteBuffer r3 = r3.f39147d
            byte[] r4 = com.yandex.mobile.ads.impl.nq0.f37879a
            int r4 = r3.position()
            r6 = 0
            r7 = 0
        L_0x0178:
            int r8 = r6 + 1
            if (r8 >= r4) goto L_0x01ab
            byte r9 = r3.get(r6)
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 3
            if (r7 != r10) goto L_0x01a2
            if (r9 != r2) goto L_0x01a6
            byte r11 = r3.get(r8)
            r11 = r11 & 31
            r12 = 7
            if (r11 != r12) goto L_0x01a6
            java.nio.ByteBuffer r7 = r3.duplicate()
            int r6 = r6 - r10
            r7.position(r6)
            r7.limit(r4)
            r3.position(r1)
            r3.put(r7)
            goto L_0x01ae
        L_0x01a2:
            if (r9 != 0) goto L_0x01a6
            int r7 = r7 + 1
        L_0x01a6:
            if (r9 == 0) goto L_0x01a9
            r7 = 0
        L_0x01a9:
            r6 = r8
            goto L_0x0178
        L_0x01ab:
            r3.clear()
        L_0x01ae:
            com.yandex.mobile.ads.impl.qj r3 = r14.f38690r
            java.nio.ByteBuffer r3 = r3.f39147d
            int r3 = r3.position()
            if (r3 != 0) goto L_0x01b9
            return r2
        L_0x01b9:
            r14.f38655N = r1
        L_0x01bb:
            com.yandex.mobile.ads.impl.qj r3 = r14.f38690r     // Catch:{ CryptoException -> 0x0240 }
            long r10 = r3.f39149f     // Catch:{ CryptoException -> 0x0240 }
            boolean r3 = r3.mo71018d()     // Catch:{ CryptoException -> 0x0240 }
            if (r3 == 0) goto L_0x01ce
            java.util.ArrayList<java.lang.Long> r3 = r14.f38696u     // Catch:{ CryptoException -> 0x0240 }
            java.lang.Long r4 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x0240 }
            r3.add(r4)     // Catch:{ CryptoException -> 0x0240 }
        L_0x01ce:
            boolean r3 = r14.f38691r0     // Catch:{ CryptoException -> 0x0240 }
            if (r3 == 0) goto L_0x01db
            com.yandex.mobile.ads.impl.wd1<com.yandex.mobile.ads.exo.Format> r3 = r14.f38694t     // Catch:{ CryptoException -> 0x0240 }
            com.yandex.mobile.ads.exo.Format r4 = r14.f38699x     // Catch:{ CryptoException -> 0x0240 }
            r3.mo70683a(r10, r4)     // Catch:{ CryptoException -> 0x0240 }
            r14.f38691r0 = r1     // Catch:{ CryptoException -> 0x0240 }
        L_0x01db:
            long r3 = r14.f38679l0     // Catch:{ CryptoException -> 0x0240 }
            long r3 = java.lang.Math.max(r3, r10)     // Catch:{ CryptoException -> 0x0240 }
            r14.f38679l0 = r3     // Catch:{ CryptoException -> 0x0240 }
            com.yandex.mobile.ads.impl.qj r3 = r14.f38690r     // Catch:{ CryptoException -> 0x0240 }
            r3.mo69600g()     // Catch:{ CryptoException -> 0x0240 }
            com.yandex.mobile.ads.impl.qj r3 = r14.f38690r     // Catch:{ CryptoException -> 0x0240 }
            boolean r3 = r3.mo71017c()     // Catch:{ CryptoException -> 0x0240 }
            if (r3 == 0) goto L_0x01f5
            com.yandex.mobile.ads.impl.qj r3 = r14.f38690r     // Catch:{ CryptoException -> 0x0240 }
            r14.mo65438a((com.yandex.mobile.ads.impl.C14387qj) r3)     // Catch:{ CryptoException -> 0x0240 }
        L_0x01f5:
            com.yandex.mobile.ads.impl.qj r3 = r14.f38690r     // Catch:{ CryptoException -> 0x0240 }
            r14.mo65444b((com.yandex.mobile.ads.impl.C14387qj) r3)     // Catch:{ CryptoException -> 0x0240 }
            if (r0 == 0) goto L_0x0220
            com.yandex.mobile.ads.impl.qj r0 = r14.f38690r     // Catch:{ CryptoException -> 0x0240 }
            com.yandex.mobile.ads.impl.ri r0 = r0.f39146c     // Catch:{ CryptoException -> 0x0240 }
            android.media.MediaCodec$CryptoInfo r9 = r0.mo69766a()     // Catch:{ CryptoException -> 0x0240 }
            if (r5 != 0) goto L_0x0207
            goto L_0x0216
        L_0x0207:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x0240 }
            if (r0 != 0) goto L_0x020f
            int[] r0 = new int[r2]     // Catch:{ CryptoException -> 0x0240 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x0240 }
        L_0x020f:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x0240 }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x0240 }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x0240 }
        L_0x0216:
            android.media.MediaCodec r6 = r14.f38647F     // Catch:{ CryptoException -> 0x0240 }
            int r7 = r14.f38667Z     // Catch:{ CryptoException -> 0x0240 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x0240 }
            goto L_0x0231
        L_0x0220:
            android.media.MediaCodec r6 = r14.f38647F     // Catch:{ CryptoException -> 0x0240 }
            int r7 = r14.f38667Z     // Catch:{ CryptoException -> 0x0240 }
            r8 = 0
            com.yandex.mobile.ads.impl.qj r0 = r14.f38690r     // Catch:{ CryptoException -> 0x0240 }
            java.nio.ByteBuffer r0 = r0.f39147d     // Catch:{ CryptoException -> 0x0240 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x0240 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x0240 }
        L_0x0231:
            r14.m40802N()     // Catch:{ CryptoException -> 0x0240 }
            r14.f38676i0 = r2     // Catch:{ CryptoException -> 0x0240 }
            r14.f38673f0 = r1     // Catch:{ CryptoException -> 0x0240 }
            com.yandex.mobile.ads.impl.pj r0 = r14.f38695t0     // Catch:{ CryptoException -> 0x0240 }
            int r1 = r0.f38623c     // Catch:{ CryptoException -> 0x0240 }
            int r1 = r1 + r2
            r0.f38623c = r1     // Catch:{ CryptoException -> 0x0240 }
            return r2
        L_0x0240:
            r0 = move-exception
            com.yandex.mobile.ads.exo.Format r1 = r14.f38699x
            com.yandex.mobile.ads.impl.k40 r0 = r14.mo64798a((java.lang.Exception) r0, (com.yandex.mobile.ads.exo.Format) r1)
            throw r0
        L_0x0248:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pl0.m40800D():boolean");
    }

    /* renamed from: K */
    private void m40801K() throws k40 {
        int i = this.f38675h0;
        if (i == 1) {
            mo69378E();
        } else if (i == 2) {
            m40805R();
        } else if (i != 3) {
            this.f38685o0 = true;
            mo69044M();
        } else {
            mo65427L();
            mo69381J();
        }
    }

    /* renamed from: N */
    private void m40802N() {
        this.f38667Z = -1;
        this.f38690r.f39147d = null;
    }

    /* renamed from: O */
    private void m40803O() {
        this.f38668a0 = -1;
        this.f38669b0 = null;
    }

    /* renamed from: Q */
    private void m40804Q() throws k40 {
        if (ih1.f34858a >= 23) {
            float a = mo65429a(this.f38646E, this.f38648G, mo64825u());
            float f = this.f38649H;
            if (f != a) {
                if (a == -1.0f) {
                    m40798B();
                } else if (f != -1.0f || a > this.f38688q) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", a);
                    this.f38647F.setParameters(bundle);
                    this.f38649H = a;
                }
            }
        }
    }

    /* renamed from: R */
    private void m40805R() throws k40 {
        if (this.f38642A.mo64859c() == null) {
            mo65427L();
            mo69381J();
        } else if (C12874dd.f32539e.equals((Object) null)) {
            mo65427L();
            mo69381J();
        } else if (!mo69378E()) {
            try {
                this.f38643B.setMediaDrmSession((byte[]) null);
                m40807a(this.f38642A);
                this.f38674g0 = 0;
                this.f38675h0 = 0;
            } catch (MediaCryptoException e) {
                throw mo64798a((Exception) e, this.f38699x);
            }
        }
    }

    /* renamed from: b */
    private List<ol0> m40810b(boolean z) throws rl0.C14471c {
        List<ol0> a = mo65432a(this.f38680m, this.f38699x, z);
        if (a.isEmpty() && z) {
            a = mo65432a(this.f38680m, this.f38699x, false);
            if (!a.isEmpty()) {
                Log.w("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f38699x.f29530j + ", but no secure decoder available. Trying to proceed with " + a + ".");
            }
        }
        return a;
    }

    /* renamed from: c */
    private boolean m40813c(boolean z) throws k40 {
        q70 t = mo64824t();
        this.f38692s.mo66557b();
        int a = mo64796a(t, this.f38692s, z);
        if (a == -5) {
            mo65437a(t);
            return true;
        } else if (a != -4 || !this.f38692s.mo71021e()) {
            return false;
        } else {
            this.f38683n0 = true;
            m40801K();
            return false;
        }
    }

    /* renamed from: A */
    public final int mo64794A() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo69378E() throws k40 {
        boolean F = mo65425F();
        if (F) {
            mo69381J();
        }
        return F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo65425F() {
        MediaCodec mediaCodec = this.f38647F;
        if (mediaCodec == null) {
            return false;
        }
        if (this.f38675h0 == 3 || this.f38656O || ((this.f38657P && !this.f38678k0) || (this.f38658Q && this.f38677j0))) {
            mo65427L();
            return true;
        }
        mediaCodec.flush();
        m40802N();
        m40803O();
        this.f38666Y = -9223372036854775807L;
        this.f38677j0 = false;
        this.f38676i0 = false;
        this.f38689q0 = true;
        this.f38661T = false;
        this.f38662U = false;
        this.f38670c0 = false;
        this.f38671d0 = false;
        this.f38687p0 = false;
        this.f38696u.clear();
        this.f38679l0 = -9223372036854775807L;
        this.f38681m0 = -9223372036854775807L;
        this.f38674g0 = 0;
        this.f38675h0 = 0;
        this.f38673f0 = this.f38672e0 ? 1 : 0;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final MediaCodec mo69379G() {
        return this.f38647F;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final ol0 mo69380H() {
        return this.f38652K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo65426I() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo69381J() throws k40 {
        if (this.f38647F == null && this.f38699x != null) {
            m40807a(this.f38642A);
            String str = this.f38699x.f29530j;
            C12186c<s70> cVar = this.f38701z;
            if (cVar != null) {
                if (this.f38643B == null) {
                    if (cVar.mo64859c() != null) {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto((UUID) null, (byte[]) null);
                            this.f38643B = mediaCrypto;
                            this.f38644C = mediaCrypto.requiresSecureDecoderComponent(str);
                        } catch (MediaCryptoException e) {
                            throw mo64798a((Exception) e, this.f38699x);
                        }
                    } else if (this.f38701z.mo64860d() == null) {
                        return;
                    }
                }
                if (s70.f39864a) {
                    int b = this.f38701z.mo64858b();
                    if (b == 1) {
                        throw mo64798a((Exception) this.f38701z.mo64860d(), this.f38699x);
                    } else if (b != 4) {
                        return;
                    }
                }
            }
            try {
                m40806a(this.f38643B, this.f38644C);
            } catch (C14286a e2) {
                throw mo64798a((Exception) e2, this.f38699x);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo65427L() {
        this.f38650I = null;
        this.f38652K = null;
        this.f38648G = null;
        this.f38678k0 = false;
        m40802N();
        m40803O();
        if (ih1.f34858a < 21) {
            this.f38664W = null;
            this.f38665X = null;
        }
        this.f38687p0 = false;
        this.f38666Y = -9223372036854775807L;
        this.f38696u.clear();
        this.f38679l0 = -9223372036854775807L;
        this.f38681m0 = -9223372036854775807L;
        try {
            MediaCodec mediaCodec = this.f38647F;
            if (mediaCodec != null) {
                this.f38695t0.f38622b++;
                mediaCodec.stop();
                this.f38647F.release();
            }
            this.f38647F = null;
            try {
                MediaCrypto mediaCrypto = this.f38643B;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f38643B = null;
                this.f38644C = false;
                m40807a((C12186c<s70>) null);
            }
        } catch (Throwable th) {
            this.f38647F = null;
            try {
                MediaCrypto mediaCrypto2 = this.f38643B;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f38643B = null;
                this.f38644C = false;
                m40807a((C12186c<s70>) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo69044M() throws k40 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final void mo69382P() {
        this.f38693s0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo65429a(float f, Format format, Format[] formatArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo65430a(MediaCodec mediaCodec, ol0 ol0, Format format, Format format2);

    /* renamed from: a */
    public final int mo64795a(Format format) throws k40 {
        try {
            return mo65431a(this.f38680m, this.f38682n, format);
        } catch (rl0.C14471c e) {
            throw mo64798a((Exception) e, format);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo65431a(ql0 ql0, C12188d<s70> dVar, Format format) throws rl0.C14471c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<ol0> mo65432a(ql0 ql0, Format format, boolean z) throws rl0.C14471c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo65435a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws k40;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo65436a(ol0 ol0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65438a(C14387qj qjVar) throws k40 {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo65439a(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo65440a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, Format format) throws k40;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo65441a(ol0 ol0) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo65444b(C14387qj qjVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo65446c(long j);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Format mo69383d(long j) {
        Format a = this.f38694t.mo70681a(j);
        if (a != null) {
            this.f38700y = a;
        }
        return a;
    }

    /* renamed from: e */
    public boolean mo65007e() {
        return this.f38685o0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo64827w() {
        this.f38699x = null;
        if (this.f38642A == null && this.f38701z == null) {
            mo65425F();
        } else {
            mo64828x();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo64828x() {
        try {
            mo65427L();
            m40811b((C12186c<s70>) null);
            C12188d<s70> dVar = this.f38682n;
            if (dVar != null && this.f38698w) {
                this.f38698w = false;
                dVar.release();
            }
        } catch (Throwable th) {
            m40811b((C12186c<s70>) null);
            throw th;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pl0$a */
    public static class C14286a extends Exception {

        /* renamed from: b */
        public final String f38702b;

        /* renamed from: c */
        public final boolean f38703c;

        /* renamed from: d */
        public final ol0 f38704d;

        /* renamed from: e */
        public final String f38705e;

        public C14286a(Format format, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, th, format.f29530j, z, (ol0) null, m40848a(i), (C14286a) null);
        }

        /* renamed from: a */
        static C14286a m40847a(C14286a aVar, C14286a aVar2) {
            return new C14286a(aVar.getMessage(), aVar.getCause(), aVar.f38702b, aVar.f38703c, aVar.f38704d, aVar.f38705e, aVar2);
        }

        /* renamed from: a */
        private static String m40849a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* renamed from: a */
        private static String m40848a(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.yandex.mobile.ads.exo.mediacodec.MediaCodecRenderer_" + str + Math.abs(i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C14286a(Format format, Throwable th, boolean z, ol0 ol0) {
            this("Decoder init failed: " + ol0.f38260a + ", " + format, th, format.f29530j, z, ol0, ih1.f34858a >= 21 ? m40849a(th) : null, (C14286a) null);
        }

        private C14286a(String str, Throwable th, String str2, boolean z, ol0 ol0, String str3, C14286a aVar) {
            super(str, th);
            this.f38702b = str2;
            this.f38703c = z;
            this.f38704d = ol0;
            this.f38705e = str3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64806a(boolean z) throws k40 {
        C12188d<s70> dVar = this.f38682n;
        if (dVar != null && !this.f38698w) {
            this.f38698w = true;
            dVar.mo64855b();
        }
        this.f38695t0 = new C14283pj();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64804a(long j, boolean z) throws k40 {
        this.f38683n0 = false;
        this.f38685o0 = false;
        this.f38693s0 = false;
        mo69378E();
        this.f38694t.mo70682a();
    }

    /* renamed from: c */
    public boolean mo65006c() {
        if (this.f38699x != null && !this.f38687p0) {
            if (mo64826v()) {
                return true;
            }
            if (this.f38668a0 >= 0) {
                return true;
            }
            if (this.f38666Y == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f38666Y) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x014b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m40812b(long r19, long r21) throws com.yandex.mobile.ads.impl.k40 {
        /*
            r18 = this;
            r14 = r18
            int r0 = r14.f38668a0
            r15 = 1
            r13 = 0
            if (r0 < 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 != 0) goto L_0x0115
            boolean r0 = r14.f38659R
            r1 = 0
            if (r0 == 0) goto L_0x002c
            boolean r0 = r14.f38677j0
            if (r0 == 0) goto L_0x002c
            android.media.MediaCodec r0 = r14.f38647F     // Catch:{ IllegalStateException -> 0x0020 }
            android.media.MediaCodec$BufferInfo r3 = r14.f38697v     // Catch:{ IllegalStateException -> 0x0020 }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x0020 }
            goto L_0x0034
        L_0x0020:
            r18.m40801K()
            boolean r0 = r14.f38685o0
            if (r0 == 0) goto L_0x002b
            r18.mo65427L()
        L_0x002b:
            return r13
        L_0x002c:
            android.media.MediaCodec r0 = r14.f38647F
            android.media.MediaCodec$BufferInfo r3 = r14.f38697v
            int r0 = r0.dequeueOutputBuffer(r3, r1)
        L_0x0034:
            r1 = 21
            if (r0 >= 0) goto L_0x008c
            r2 = -2
            if (r0 != r2) goto L_0x006b
            r14.f38678k0 = r15
            android.media.MediaCodec r0 = r14.f38647F
            android.media.MediaFormat r0 = r0.getOutputFormat()
            int r1 = r14.f38653L
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x005c
            r14.f38662U = r15
            goto L_0x006a
        L_0x005c:
            boolean r1 = r14.f38660S
            if (r1 == 0) goto L_0x0065
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r15)
        L_0x0065:
            android.media.MediaCodec r1 = r14.f38647F
            r14.mo65435a((android.media.MediaCodec) r1, (android.media.MediaFormat) r0)
        L_0x006a:
            return r15
        L_0x006b:
            r2 = -3
            if (r0 != r2) goto L_0x007b
            int r0 = com.yandex.mobile.ads.impl.ih1.f34858a
            if (r0 >= r1) goto L_0x007a
            android.media.MediaCodec r0 = r14.f38647F
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()
            r14.f38665X = r0
        L_0x007a:
            return r15
        L_0x007b:
            boolean r0 = r14.f38663V
            if (r0 == 0) goto L_0x008b
            boolean r0 = r14.f38683n0
            if (r0 != 0) goto L_0x0088
            int r0 = r14.f38674g0
            r1 = 2
            if (r0 != r1) goto L_0x008b
        L_0x0088:
            r18.m40801K()
        L_0x008b:
            return r13
        L_0x008c:
            boolean r2 = r14.f38662U
            if (r2 == 0) goto L_0x0098
            r14.f38662U = r13
            android.media.MediaCodec r1 = r14.f38647F
            r1.releaseOutputBuffer(r0, r13)
            return r15
        L_0x0098:
            android.media.MediaCodec$BufferInfo r2 = r14.f38697v
            int r3 = r2.size
            if (r3 != 0) goto L_0x00a8
            int r2 = r2.flags
            r2 = r2 & 4
            if (r2 == 0) goto L_0x00a8
            r18.m40801K()
            return r13
        L_0x00a8:
            r14.f38668a0 = r0
            int r2 = com.yandex.mobile.ads.impl.ih1.f34858a
            if (r2 < r1) goto L_0x00b5
            android.media.MediaCodec r1 = r14.f38647F
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r0)
            goto L_0x00b9
        L_0x00b5:
            java.nio.ByteBuffer[] r1 = r14.f38665X
            r0 = r1[r0]
        L_0x00b9:
            r14.f38669b0 = r0
            if (r0 == 0) goto L_0x00d0
            android.media.MediaCodec$BufferInfo r1 = r14.f38697v
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r14.f38669b0
            android.media.MediaCodec$BufferInfo r1 = r14.f38697v
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x00d0:
            android.media.MediaCodec$BufferInfo r0 = r14.f38697v
            long r0 = r0.presentationTimeUs
            java.util.ArrayList<java.lang.Long> r2 = r14.f38696u
            int r2 = r2.size()
            r3 = 0
        L_0x00db:
            if (r3 >= r2) goto L_0x00f7
            java.util.ArrayList<java.lang.Long> r4 = r14.f38696u
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00f4
            java.util.ArrayList<java.lang.Long> r0 = r14.f38696u
            r0.remove(r3)
            r0 = 1
            goto L_0x00f8
        L_0x00f4:
            int r3 = r3 + 1
            goto L_0x00db
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            r14.f38670c0 = r0
            long r0 = r14.f38681m0
            android.media.MediaCodec$BufferInfo r2 = r14.f38697v
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0106
            r0 = 1
            goto L_0x0107
        L_0x0106:
            r0 = 0
        L_0x0107:
            r14.f38671d0 = r0
            com.yandex.mobile.ads.impl.wd1<com.yandex.mobile.ads.exo.Format> r0 = r14.f38694t
            java.lang.Object r0 = r0.mo70681a((long) r2)
            com.yandex.mobile.ads.exo.Format r0 = (com.yandex.mobile.ads.exo.Format) r0
            if (r0 == 0) goto L_0x0115
            r14.f38700y = r0
        L_0x0115:
            boolean r0 = r14.f38659R
            if (r0 == 0) goto L_0x014f
            boolean r0 = r14.f38677j0
            if (r0 == 0) goto L_0x014f
            android.media.MediaCodec r5 = r14.f38647F     // Catch:{ IllegalStateException -> 0x0142 }
            java.nio.ByteBuffer r6 = r14.f38669b0     // Catch:{ IllegalStateException -> 0x0142 }
            int r7 = r14.f38668a0     // Catch:{ IllegalStateException -> 0x0142 }
            android.media.MediaCodec$BufferInfo r0 = r14.f38697v     // Catch:{ IllegalStateException -> 0x0142 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0142 }
            long r9 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0142 }
            boolean r11 = r14.f38670c0     // Catch:{ IllegalStateException -> 0x0142 }
            boolean r12 = r14.f38671d0     // Catch:{ IllegalStateException -> 0x0142 }
            com.yandex.mobile.ads.exo.Format r3 = r14.f38700y     // Catch:{ IllegalStateException -> 0x0142 }
            r0 = r18
            r1 = r19
            r16 = r3
            r3 = r21
            r17 = 0
            r13 = r16
            boolean r0 = r0.mo65440a(r1, r3, r5, r6, r7, r8, r9, r11, r12, r13)     // Catch:{ IllegalStateException -> 0x0140 }
            goto L_0x016d
        L_0x0140:
            goto L_0x0144
        L_0x0142:
            r17 = 0
        L_0x0144:
            r18.m40801K()
            boolean r0 = r14.f38685o0
            if (r0 == 0) goto L_0x014e
            r18.mo65427L()
        L_0x014e:
            return r17
        L_0x014f:
            r17 = 0
            android.media.MediaCodec r5 = r14.f38647F
            java.nio.ByteBuffer r6 = r14.f38669b0
            int r7 = r14.f38668a0
            android.media.MediaCodec$BufferInfo r0 = r14.f38697v
            int r8 = r0.flags
            long r9 = r0.presentationTimeUs
            boolean r11 = r14.f38670c0
            boolean r12 = r14.f38671d0
            com.yandex.mobile.ads.exo.Format r13 = r14.f38700y
            r0 = r18
            r1 = r19
            r3 = r21
            boolean r0 = r0.mo65440a(r1, r3, r5, r6, r7, r8, r9, r11, r12, r13)
        L_0x016d:
            if (r0 == 0) goto L_0x018a
            android.media.MediaCodec$BufferInfo r0 = r14.f38697v
            long r0 = r0.presentationTimeUs
            r14.mo65446c((long) r0)
            android.media.MediaCodec$BufferInfo r0 = r14.f38697v
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0180
            r13 = 1
            goto L_0x0181
        L_0x0180:
            r13 = 0
        L_0x0181:
            r18.m40803O()
            if (r13 != 0) goto L_0x0187
            return r15
        L_0x0187:
            r18.m40801K()
        L_0x018a:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pl0.m40812b(long, long):boolean");
    }

    /* renamed from: a */
    public final void mo64800a(float f) throws k40 {
        this.f38646E = f;
        if (this.f38647F != null && this.f38675h0 != 3 && mo64809b() != 0) {
            m40804Q();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        if (r7[0].getClassName().equals("android.media.MediaCodec") != false) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[Catch:{ IllegalStateException -> 0x006f }, LOOP:1: B:20:0x0035->B:30:0x0057, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0058 A[EDGE_INSN: B:52:0x0058->B:31:0x0058 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65005a(long r6, long r8) throws com.yandex.mobile.ads.impl.k40 {
        /*
            r5 = this;
            boolean r0 = r5.f38693s0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r5.f38693s0 = r1
            r5.m40801K()
        L_0x000a:
            r0 = 1
            boolean r2 = r5.f38685o0     // Catch:{ IllegalStateException -> 0x006f }
            if (r2 == 0) goto L_0x0013
            r5.mo69044M()     // Catch:{ IllegalStateException -> 0x006f }
            return
        L_0x0013:
            com.yandex.mobile.ads.exo.Format r2 = r5.f38699x     // Catch:{ IllegalStateException -> 0x006f }
            if (r2 != 0) goto L_0x001e
            boolean r2 = r5.m40813c((boolean) r0)     // Catch:{ IllegalStateException -> 0x006f }
            if (r2 != 0) goto L_0x001e
            return
        L_0x001e:
            r5.mo69381J()     // Catch:{ IllegalStateException -> 0x006f }
            android.media.MediaCodec r2 = r5.f38647F     // Catch:{ IllegalStateException -> 0x006f }
            if (r2 == 0) goto L_0x005c
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x006f }
            java.lang.String r4 = "drainAndFeed"
            com.yandex.mobile.ads.impl.he1.m36941a(r4)     // Catch:{ IllegalStateException -> 0x006f }
        L_0x002e:
            boolean r4 = r5.m40812b(r6, r8)     // Catch:{ IllegalStateException -> 0x006f }
            if (r4 == 0) goto L_0x0035
            goto L_0x002e
        L_0x0035:
            boolean r6 = r5.m40800D()     // Catch:{ IllegalStateException -> 0x006f }
            if (r6 == 0) goto L_0x0058
            long r6 = r5.f38645D     // Catch:{ IllegalStateException -> 0x006f }
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0054
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x006f }
            long r6 = r6 - r2
            long r8 = r5.f38645D     // Catch:{ IllegalStateException -> 0x006f }
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r6 = 0
            goto L_0x0055
        L_0x0054:
            r6 = 1
        L_0x0055:
            if (r6 == 0) goto L_0x0058
            goto L_0x0035
        L_0x0058:
            com.yandex.mobile.ads.impl.he1.m36940a()     // Catch:{ IllegalStateException -> 0x006f }
            goto L_0x006a
        L_0x005c:
            com.yandex.mobile.ads.impl.pj r8 = r5.f38695t0     // Catch:{ IllegalStateException -> 0x006f }
            int r9 = r8.f38624d     // Catch:{ IllegalStateException -> 0x006f }
            int r6 = r5.mo64810b((long) r6)     // Catch:{ IllegalStateException -> 0x006f }
            int r9 = r9 + r6
            r8.f38624d = r9     // Catch:{ IllegalStateException -> 0x006f }
            r5.m40813c((boolean) r1)     // Catch:{ IllegalStateException -> 0x006f }
        L_0x006a:
            com.yandex.mobile.ads.impl.pj r6 = r5.f38695t0     // Catch:{ IllegalStateException -> 0x006f }
            monitor-enter(r6)     // Catch:{ IllegalStateException -> 0x006f }
            monitor-exit(r6)     // Catch:{ IllegalStateException -> 0x006f }
            return
        L_0x006f:
            r6 = move-exception
            int r7 = com.yandex.mobile.ads.impl.ih1.f34858a
            r8 = 21
            if (r7 < r8) goto L_0x007b
            boolean r7 = r6 instanceof android.media.MediaCodec.CodecException
            if (r7 == 0) goto L_0x007b
            goto L_0x0090
        L_0x007b:
            java.lang.StackTraceElement[] r7 = r6.getStackTrace()
            int r8 = r7.length
            if (r8 <= 0) goto L_0x0091
            r7 = r7[r1]
            java.lang.String r7 = r7.getClassName()
            java.lang.String r8 = "android.media.MediaCodec"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0091
        L_0x0090:
            r1 = 1
        L_0x0091:
            if (r1 == 0) goto L_0x009a
            com.yandex.mobile.ads.exo.Format r7 = r5.f38699x
            com.yandex.mobile.ads.impl.k40 r6 = r5.mo64798a((java.lang.Exception) r6, (com.yandex.mobile.ads.exo.Format) r7)
            throw r6
        L_0x009a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pl0.mo65005a(long, long):void");
    }

    /* renamed from: a */
    private void m40806a(MediaCrypto mediaCrypto, boolean z) throws C14286a {
        if (this.f38650I == null) {
            try {
                List<ol0> b = m40810b(z);
                ArrayDeque<ol0> arrayDeque = new ArrayDeque<>();
                this.f38650I = arrayDeque;
                if (this.f38686p) {
                    arrayDeque.addAll(b);
                } else if (!b.isEmpty()) {
                    this.f38650I.add(b.get(0));
                }
                this.f38651J = null;
            } catch (rl0.C14471c e) {
                throw new C14286a(this.f38699x, (Throwable) e, z, -49998);
            }
        }
        if (!this.f38650I.isEmpty()) {
            while (this.f38647F == null) {
                ol0 peekFirst = this.f38650I.peekFirst();
                if (mo65441a(peekFirst)) {
                    try {
                        m40808a(peekFirst, mediaCrypto);
                    } catch (Exception e2) {
                        bk0.m34271b("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e2);
                        this.f38650I.removeFirst();
                        C14286a aVar = new C14286a(this.f38699x, (Throwable) e2, z, peekFirst);
                        C14286a aVar2 = this.f38651J;
                        if (aVar2 == null) {
                            this.f38651J = aVar;
                        } else {
                            this.f38651J = C14286a.m40847a(aVar2, aVar);
                        }
                        if (this.f38650I.isEmpty()) {
                            throw this.f38651J;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f38650I = null;
            return;
        }
        throw new C14286a(this.f38699x, (Throwable) null, z, -49999);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d7, code lost:
        if (r0.f38265f != false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fc, code lost:
        if (r12.startsWith(new java.lang.String(r1, kotlin.text.Charsets.UTF_8)) != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0175, code lost:
        if (new java.lang.String(r5, kotlin.text.Charsets.UTF_8).equals(r1) != false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fa, code lost:
        if ("OMX.Exynos.avc.dec.secure".equals(r8) != false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024f, code lost:
        if (new java.lang.String(r5, kotlin.text.Charsets.UTF_8).equals(r2) != false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025f, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r8) == false) goto L_0x0263;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x021f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m40808a(com.yandex.mobile.ads.impl.ol0 r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            r16 = this;
            r7 = r16
            r0 = r17
            java.lang.String r8 = r0.f38260a
            int r9 = com.yandex.mobile.ads.impl.ih1.f34858a
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = 23
            if (r9 >= r10) goto L_0x0011
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001d
        L_0x0011:
            float r2 = r7.f38646E
            com.yandex.mobile.ads.exo.Format r3 = r7.f38699x
            com.yandex.mobile.ads.exo.Format[] r4 = r16.mo64825u()
            float r2 = r7.mo65429a((float) r2, (com.yandex.mobile.ads.exo.Format) r3, (com.yandex.mobile.ads.exo.Format[]) r4)
        L_0x001d:
            float r3 = r7.f38688q
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0026
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0027
        L_0x0026:
            r11 = r2
        L_0x0027:
            r12 = 0
            r13 = 21
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x033a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x033a }
            r1.<init>()     // Catch:{ Exception -> 0x033a }
            java.lang.String r2 = "createCodec:"
            r1.append(r2)     // Catch:{ Exception -> 0x033a }
            r1.append(r8)     // Catch:{ Exception -> 0x033a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x033a }
            com.yandex.mobile.ads.impl.he1.m36941a(r1)     // Catch:{ Exception -> 0x033a }
            android.media.MediaCodec r6 = android.media.MediaCodec.createByCodecName(r8)     // Catch:{ Exception -> 0x033a }
            com.yandex.mobile.ads.impl.he1.m36940a()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r1 = "configureCodec"
            com.yandex.mobile.ads.impl.he1.m36941a(r1)     // Catch:{ Exception -> 0x0337 }
            com.yandex.mobile.ads.exo.Format r4 = r7.f38699x     // Catch:{ Exception -> 0x0337 }
            r1 = r16
            r2 = r17
            r3 = r6
            r5 = r18
            r18 = r6
            r6 = r11
            r1.mo65436a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0332 }
            com.yandex.mobile.ads.impl.he1.m36940a()     // Catch:{ Exception -> 0x0332 }
            java.lang.String r1 = "startCodec"
            com.yandex.mobile.ads.impl.he1.m36941a(r1)     // Catch:{ Exception -> 0x0332 }
            r18.start()     // Catch:{ Exception -> 0x0332 }
            com.yandex.mobile.ads.impl.he1.m36940a()     // Catch:{ Exception -> 0x0332 }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0332 }
            if (r9 >= r13) goto L_0x0083
            java.nio.ByteBuffer[] r1 = r18.getInputBuffers()     // Catch:{ Exception -> 0x007e }
            r7.f38664W = r1     // Catch:{ Exception -> 0x007e }
            java.nio.ByteBuffer[] r1 = r18.getOutputBuffers()     // Catch:{ Exception -> 0x007e }
            r7.f38665X = r1     // Catch:{ Exception -> 0x007e }
            goto L_0x0083
        L_0x007e:
            r0 = move-exception
            r6 = r18
            goto L_0x033c
        L_0x0083:
            r1 = r18
            r7.f38647F = r1
            r7.f38652K = r0
            r7.f38649H = r11
            com.yandex.mobile.ads.exo.Format r1 = r7.f38699x
            r7.f38648G = r1
            java.lang.String r2 = "OMX.Exynos.avc.dec.secure"
            r5 = 25
            r11 = 0
            if (r9 > r5) goto L_0x0101
            boolean r12 = r2.equals(r8)
            if (r12 == 0) goto L_0x0101
            java.lang.String r12 = com.yandex.mobile.ads.impl.ih1.f34861d
            java.lang.String r1 = "U00tVDU4NQ=="
            byte[] r1 = android.util.Base64.decode(r1, r11)
            java.lang.String r5 = "decode(\"U00tVDU4NQ==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r1, r6)
            boolean r1 = r12.startsWith(r5)
            if (r1 != 0) goto L_0x00fe
            java.lang.String r1 = "U00tQTUxMA=="
            byte[] r1 = android.util.Base64.decode(r1, r11)
            java.lang.String r5 = "decode(\"U00tQTUxMA==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r1, r6)
            boolean r1 = r12.startsWith(r5)
            if (r1 != 0) goto L_0x00fe
            java.lang.String r1 = "U00tQTUyMA=="
            byte[] r1 = android.util.Base64.decode(r1, r11)
            java.lang.String r5 = "decode(\"U00tQTUyMA==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r1, r6)
            boolean r1 = r12.startsWith(r5)
            if (r1 != 0) goto L_0x00fe
            java.lang.String r1 = "U00tSjcwMA=="
            byte[] r1 = android.util.Base64.decode(r1, r11)
            java.lang.String r5 = "decode(\"U00tSjcwMA==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r1, r6)
            boolean r1 = r12.startsWith(r5)
            if (r1 == 0) goto L_0x0101
        L_0x00fe:
            r1 = 2
            goto L_0x017a
        L_0x0101:
            r1 = 24
            if (r9 >= r1) goto L_0x0179
            java.lang.String r1 = "OMX.Nvidia.h264.decode"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0115
            java.lang.String r1 = "OMX.Nvidia.h264.decode.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0179
        L_0x0115:
            java.lang.String r1 = "ZmxvdW5kZXI="
            byte[] r1 = android.util.Base64.decode(r1, r11)
            java.lang.String r5 = "decode(\"ZmxvdW5kZXI=\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r1, r6)
            java.lang.String r1 = com.yandex.mobile.ads.impl.ih1.f34859b
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0177
            java.lang.String r5 = "ZmxvdW5kZXJfbHRl"
            byte[] r5 = android.util.Base64.decode(r5, r11)
            java.lang.String r6 = "decode(\"ZmxvdW5kZXJfbHRl\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r12 = kotlin.text.Charsets.UTF_8
            r6.<init>(r5, r12)
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x0177
            java.lang.String r5 = "Z3JvdXBlcg=="
            byte[] r5 = android.util.Base64.decode(r5, r11)
            java.lang.String r6 = "decode(\"Z3JvdXBlcg==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r12 = kotlin.text.Charsets.UTF_8
            r6.<init>(r5, r12)
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x0177
            java.lang.String r5 = "dGlsYXBpYQ=="
            byte[] r5 = android.util.Base64.decode(r5, r11)
            java.lang.String r6 = "decode(\"dGlsYXBpYQ==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r12 = kotlin.text.Charsets.UTF_8
            r6.<init>(r5, r12)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0179
        L_0x0177:
            r1 = 1
            goto L_0x017a
        L_0x0179:
            r1 = 0
        L_0x017a:
            r7.f38653L = r1
            java.lang.String r1 = com.yandex.mobile.ads.impl.ih1.f34861d
            java.lang.String r5 = "U00tVDIzMA=="
            byte[] r5 = android.util.Base64.decode(r5, r11)
            java.lang.String r6 = "decode(\"U00tVDIzMA==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r12 = kotlin.text.Charsets.UTF_8
            r6.<init>(r5, r12)
            boolean r5 = r1.startsWith(r6)
            if (r5 == 0) goto L_0x01a0
            java.lang.String r5 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x01a0
            r5 = 1
            goto L_0x01a1
        L_0x01a0:
            r5 = 0
        L_0x01a1:
            r7.f38654M = r5
            com.yandex.mobile.ads.exo.Format r5 = r7.f38648G
            if (r9 >= r13) goto L_0x01b9
            java.util.List<byte[]> r5 = r5.f29532l
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x01b9
            java.lang.String r5 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x01b9
            r5 = 1
            goto L_0x01ba
        L_0x01b9:
            r5 = 0
        L_0x01ba:
            r7.f38655N = r5
            r5 = 19
            r6 = 18
            if (r9 < r6) goto L_0x01ff
            if (r9 != r6) goto L_0x01d4
            java.lang.String r12 = "OMX.SEC.avc.dec"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x01ff
            java.lang.String r12 = "OMX.SEC.avc.dec.secure"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L_0x01ff
        L_0x01d4:
            if (r9 != r5) goto L_0x01fd
            java.lang.String r12 = "U00tRzgwMA=="
            byte[] r12 = android.util.Base64.decode(r12, r11)
            java.lang.String r6 = "decode(\"U00tRzgwMA==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r6)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r13 = kotlin.text.Charsets.UTF_8
            r6.<init>(r12, r13)
            boolean r6 = r1.startsWith(r6)
            if (r6 == 0) goto L_0x01fd
            java.lang.String r6 = "OMX.Exynos.avc.dec"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x01ff
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x01fd
            goto L_0x01ff
        L_0x01fd:
            r2 = 0
            goto L_0x0200
        L_0x01ff:
            r2 = 1
        L_0x0200:
            r7.f38656O = r2
            r2 = 29
            if (r9 != r2) goto L_0x0210
            java.lang.String r2 = "c2.android.aac.decoder"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0210
            r2 = 1
            goto L_0x0211
        L_0x0210:
            r2 = 0
        L_0x0211:
            r7.f38657P = r2
            if (r9 > r10) goto L_0x021d
            java.lang.String r2 = "OMX.google.vorbis.decoder"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0261
        L_0x021d:
            if (r9 > r5) goto L_0x0263
            java.lang.String r2 = "aGIyMDAw"
            byte[] r2 = android.util.Base64.decode(r2, r11)
            java.lang.String r5 = "decode(\"aGIyMDAw\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            java.lang.String r2 = com.yandex.mobile.ads.impl.ih1.f34859b
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x0251
            java.lang.String r5 = "c3R2bTg="
            byte[] r5 = android.util.Base64.decode(r5, r11)
            java.lang.String r6 = "decode(\"c3R2bTg=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r10 = kotlin.text.Charsets.UTF_8
            r6.<init>(r5, r10)
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0263
        L_0x0251:
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0261
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0263
        L_0x0261:
            r2 = 1
            goto L_0x0264
        L_0x0263:
            r2 = 0
        L_0x0264:
            r7.f38658Q = r2
            r2 = 21
            if (r9 != r2) goto L_0x0274
            java.lang.String r2 = "OMX.google.aac.decoder"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0274
            r2 = 1
            goto L_0x0275
        L_0x0274:
            r2 = 0
        L_0x0275:
            r7.f38659R = r2
            com.yandex.mobile.ads.exo.Format r2 = r7.f38648G
            r5 = 18
            if (r9 > r5) goto L_0x028c
            int r2 = r2.f29543w
            r5 = 1
            if (r2 != r5) goto L_0x028c
            java.lang.String r2 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x028c
            r5 = 1
            goto L_0x028d
        L_0x028c:
            r5 = 0
        L_0x028d:
            r7.f38660S = r5
            java.lang.String r2 = r0.f38260a
            r5 = 25
            if (r9 > r5) goto L_0x029d
            java.lang.String r5 = "OMX.rk.video_decoder.avc"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x02d9
        L_0x029d:
            r5 = 17
            if (r9 > r5) goto L_0x02a9
            java.lang.String r5 = "OMX.allwinner.video.decoder.avc"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x02d9
        L_0x02a9:
            com.yandex.mobile.ads.impl.x11 r2 = com.yandex.mobile.ads.impl.x11.f42358a
            com.yandex.mobile.ads.impl.rk0 r2 = r2.mo70789b()
            com.yandex.mobile.ads.impl.sk0 r2 = (com.yandex.mobile.ads.impl.sk0) r2
            java.lang.String r2 = r2.mo70005a()
            java.lang.String r5 = com.yandex.mobile.ads.impl.ih1.f34860c
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x02db
            java.lang.String r2 = "QUZUUw=="
            byte[] r2 = android.util.Base64.decode(r2, r11)
            java.lang.String r5 = "decode(\"QUZUUw==\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x02db
            boolean r0 = r0.f38265f
            if (r0 == 0) goto L_0x02db
        L_0x02d9:
            r5 = 1
            goto L_0x02dc
        L_0x02db:
            r5 = 0
        L_0x02dc:
            if (r5 != 0) goto L_0x02e7
            boolean r0 = r16.mo65426I()
            if (r0 == 0) goto L_0x02e5
            goto L_0x02e7
        L_0x02e5:
            r5 = 0
            goto L_0x02e8
        L_0x02e7:
            r5 = 1
        L_0x02e8:
            r7.f38663V = r5
            r16.m40802N()
            r16.m40803O()
            int r0 = r16.mo64809b()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 2
            if (r0 != r5) goto L_0x0304
            long r5 = android.os.SystemClock.elapsedRealtime()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 + r9
            goto L_0x0305
        L_0x0304:
            r5 = r1
        L_0x0305:
            r7.f38666Y = r5
            r7.f38672e0 = r11
            r7.f38673f0 = r11
            r7.f38677j0 = r11
            r7.f38676i0 = r11
            r7.f38679l0 = r1
            r7.f38681m0 = r1
            r7.f38674g0 = r11
            r7.f38675h0 = r11
            r7.f38661T = r11
            r7.f38662U = r11
            r7.f38670c0 = r11
            r7.f38671d0 = r11
            r0 = 1
            r7.f38689q0 = r0
            com.yandex.mobile.ads.impl.pj r1 = r7.f38695t0
            int r2 = r1.f38621a
            int r2 = r2 + r0
            r1.f38621a = r2
            long r5 = r3 - r14
            r1 = r16
            r2 = r8
            r1.mo65439a((java.lang.String) r2, (long) r3, (long) r5)
            return
        L_0x0332:
            r0 = move-exception
            r1 = r18
            r6 = r1
            goto L_0x033c
        L_0x0337:
            r0 = move-exception
            r1 = r6
            goto L_0x033c
        L_0x033a:
            r0 = move-exception
            r6 = r12
        L_0x033c:
            if (r6 == 0) goto L_0x034b
            int r1 = com.yandex.mobile.ads.impl.ih1.f34858a
            r2 = 21
            if (r1 >= r2) goto L_0x0348
            r7.f38664W = r12
            r7.f38665X = r12
        L_0x0348:
            r6.release()
        L_0x034b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pl0.m40808a(com.yandex.mobile.ads.impl.ol0, android.media.MediaCrypto):void");
    }

    /* renamed from: b */
    private void m40811b(C12186c<s70> cVar) {
        C12186c<s70> cVar2 = this.f38642A;
        if (cVar2 != cVar) {
            if (cVar != null) {
                cVar.mo64849e();
            }
            if (cVar2 != null) {
                cVar2.release();
            }
        }
        this.f38642A = cVar;
    }

    /* renamed from: a */
    private void m40807a(C12186c<s70> cVar) {
        C12186c<s70> cVar2 = this.f38701z;
        if (cVar2 != cVar) {
            if (cVar != null) {
                cVar.mo64849e();
            }
            if (cVar2 != null) {
                cVar2.release();
            }
        }
        this.f38701z = cVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        if (r1.f29536p == r2.f29536p) goto L_0x00a1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65437a(com.yandex.mobile.ads.impl.q70 r5) throws com.yandex.mobile.ads.impl.k40 {
        /*
            r4 = this;
            r0 = 1
            r4.f38691r0 = r0
            com.yandex.mobile.ads.exo.Format r1 = r5.f39018c
            r1.getClass()
            boolean r2 = r5.f39016a
            if (r2 == 0) goto L_0x0012
            com.yandex.mobile.ads.exo.drm.c<?> r5 = r5.f39017b
            r4.m40811b((com.yandex.mobile.ads.exo.drm.C12186c<com.yandex.mobile.ads.impl.s70>) r5)
            goto L_0x001e
        L_0x0012:
            com.yandex.mobile.ads.exo.Format r5 = r4.f38699x
            com.yandex.mobile.ads.exo.drm.d<com.yandex.mobile.ads.impl.s70> r2 = r4.f38682n
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r3 = r4.f38642A
            com.yandex.mobile.ads.exo.drm.c r5 = r4.mo64797a(r5, r1, r2, r3)
            r4.f38642A = r5
        L_0x001e:
            r4.f38699x = r1
            android.media.MediaCodec r5 = r4.f38647F
            if (r5 != 0) goto L_0x0028
            r4.mo69381J()
            return
        L_0x0028:
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r5 = r4.f38642A
            if (r5 != 0) goto L_0x0030
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r2 = r4.f38701z
            if (r2 != 0) goto L_0x0052
        L_0x0030:
            if (r5 == 0) goto L_0x0036
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r2 = r4.f38701z
            if (r2 == 0) goto L_0x0052
        L_0x0036:
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r2 = r4.f38701z
            if (r5 == r2) goto L_0x0046
            com.yandex.mobile.ads.impl.ol0 r2 = r4.f38652K
            boolean r2 = r2.f38265f
            if (r2 != 0) goto L_0x0046
            boolean r5 = m40809a((com.yandex.mobile.ads.exo.drm.C12186c<com.yandex.mobile.ads.impl.s70>) r5, (com.yandex.mobile.ads.exo.Format) r1)
            if (r5 != 0) goto L_0x0052
        L_0x0046:
            int r5 = com.yandex.mobile.ads.impl.ih1.f34858a
            r2 = 23
            if (r5 >= r2) goto L_0x0056
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r5 = r4.f38642A
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r2 = r4.f38701z
            if (r5 == r2) goto L_0x0056
        L_0x0052:
            r4.m40798B()
            return
        L_0x0056:
            android.media.MediaCodec r5 = r4.f38647F
            com.yandex.mobile.ads.impl.ol0 r2 = r4.f38652K
            com.yandex.mobile.ads.exo.Format r3 = r4.f38648G
            int r5 = r4.mo65430a(r5, r2, r3, r1)
            if (r5 == 0) goto L_0x00ca
            if (r5 == r0) goto L_0x00b2
            r2 = 2
            if (r5 == r2) goto L_0x007f
            r0 = 3
            if (r5 != r0) goto L_0x0079
            r4.f38648G = r1
            r4.m40804Q()
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r5 = r4.f38642A
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r0 = r4.f38701z
            if (r5 == r0) goto L_0x00cd
            r4.m40799C()
            goto L_0x00cd
        L_0x0079:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x007f:
            boolean r5 = r4.f38654M
            if (r5 == 0) goto L_0x0087
            r4.m40798B()
            goto L_0x00cd
        L_0x0087:
            r4.f38672e0 = r0
            r4.f38673f0 = r0
            int r5 = r4.f38653L
            if (r5 == r2) goto L_0x00a1
            if (r5 != r0) goto L_0x00a0
            int r5 = r1.f29535o
            com.yandex.mobile.ads.exo.Format r2 = r4.f38648G
            int r3 = r2.f29535o
            if (r5 != r3) goto L_0x00a0
            int r5 = r1.f29536p
            int r2 = r2.f29536p
            if (r5 != r2) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r4.f38661T = r0
            r4.f38648G = r1
            r4.m40804Q()
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r5 = r4.f38642A
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r0 = r4.f38701z
            if (r5 == r0) goto L_0x00cd
            r4.m40799C()
            goto L_0x00cd
        L_0x00b2:
            r4.f38648G = r1
            r4.m40804Q()
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r5 = r4.f38642A
            com.yandex.mobile.ads.exo.drm.c<com.yandex.mobile.ads.impl.s70> r1 = r4.f38701z
            if (r5 == r1) goto L_0x00c1
            r4.m40799C()
            goto L_0x00cd
        L_0x00c1:
            boolean r5 = r4.f38676i0
            if (r5 == 0) goto L_0x00cd
            r4.f38674g0 = r0
            r4.f38675h0 = r0
            goto L_0x00cd
        L_0x00ca:
            r4.m40798B()
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pl0.mo65437a(com.yandex.mobile.ads.impl.q70):void");
    }

    /* renamed from: a */
    private static boolean m40809a(C12186c<s70> cVar, Format format) {
        if (cVar.mo64859c() == null) {
            return true;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto((UUID) null, (byte[]) null);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(format.f29530j);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }
}
