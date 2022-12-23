package com.yandex.mobile.ads.impl;

import android.util.Log;
import android.util.SparseArray;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.s71;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public class uk0 implements w50 {

    /* renamed from: b0 */
    private static final byte[] f40668b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public static final byte[] f40669c0 = ih1.m37390b("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d0 */
    private static final byte[] f40670d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public static final UUID f40671e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private long f40672A;

    /* renamed from: B */
    private long f40673B;

    /* renamed from: C */
    private ck0 f40674C;

    /* renamed from: D */
    private ck0 f40675D;

    /* renamed from: E */
    private boolean f40676E;

    /* renamed from: F */
    private boolean f40677F;

    /* renamed from: G */
    private int f40678G;

    /* renamed from: H */
    private long f40679H;

    /* renamed from: I */
    private long f40680I;

    /* renamed from: J */
    private int f40681J;

    /* renamed from: K */
    private int f40682K;

    /* renamed from: L */
    private int[] f40683L;

    /* renamed from: M */
    private int f40684M;

    /* renamed from: N */
    private int f40685N;

    /* renamed from: O */
    private int f40686O;

    /* renamed from: P */
    private int f40687P;

    /* renamed from: Q */
    private boolean f40688Q;

    /* renamed from: R */
    private int f40689R;

    /* renamed from: S */
    private int f40690S;

    /* renamed from: T */
    private int f40691T;

    /* renamed from: U */
    private boolean f40692U;

    /* renamed from: V */
    private boolean f40693V;

    /* renamed from: W */
    private boolean f40694W;

    /* renamed from: X */
    private int f40695X;

    /* renamed from: Y */
    private byte f40696Y;

    /* renamed from: Z */
    private boolean f40697Z;

    /* renamed from: a */
    private final z20 f40698a;

    /* renamed from: a0 */
    private x50 f40699a0;

    /* renamed from: b */
    private final wh1 f40700b;

    /* renamed from: c */
    private final SparseArray<C14765c> f40701c;

    /* renamed from: d */
    private final boolean f40702d;

    /* renamed from: e */
    private final fy0 f40703e;

    /* renamed from: f */
    private final fy0 f40704f;

    /* renamed from: g */
    private final fy0 f40705g;

    /* renamed from: h */
    private final fy0 f40706h;

    /* renamed from: i */
    private final fy0 f40707i;

    /* renamed from: j */
    private final fy0 f40708j;

    /* renamed from: k */
    private final fy0 f40709k;

    /* renamed from: l */
    private final fy0 f40710l;

    /* renamed from: m */
    private final fy0 f40711m;

    /* renamed from: n */
    private final fy0 f40712n;

    /* renamed from: o */
    private ByteBuffer f40713o;

    /* renamed from: p */
    private long f40714p;

    /* renamed from: q */
    private long f40715q;

    /* renamed from: r */
    private long f40716r;

    /* renamed from: s */
    private long f40717s;

    /* renamed from: t */
    private long f40718t;

    /* renamed from: u */
    private C14765c f40719u;

    /* renamed from: v */
    private boolean f40720v;

    /* renamed from: w */
    private int f40721w;

    /* renamed from: x */
    private long f40722x;

    /* renamed from: y */
    private boolean f40723y;

    /* renamed from: z */
    private long f40724z;

    /* renamed from: com.yandex.mobile.ads.impl.uk0$b */
    private final class C14764b implements y20 {
        private C14764b() {
        }

        /* renamed from: a */
        public boolean mo70359a(int i) {
            uk0.this.getClass();
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.uk0$c */
    private static final class C14765c {

        /* renamed from: A */
        public int f40726A;

        /* renamed from: B */
        public int f40727B;

        /* renamed from: C */
        public float f40728C;

        /* renamed from: D */
        public float f40729D;

        /* renamed from: E */
        public float f40730E;

        /* renamed from: F */
        public float f40731F;

        /* renamed from: G */
        public float f40732G;

        /* renamed from: H */
        public float f40733H;

        /* renamed from: I */
        public float f40734I;

        /* renamed from: J */
        public float f40735J;

        /* renamed from: K */
        public float f40736K;

        /* renamed from: L */
        public float f40737L;

        /* renamed from: M */
        public int f40738M;

        /* renamed from: N */
        public int f40739N;

        /* renamed from: O */
        public int f40740O;

        /* renamed from: P */
        public long f40741P;

        /* renamed from: Q */
        public long f40742Q;

        /* renamed from: R */
        public C14766d f40743R;

        /* renamed from: S */
        public boolean f40744S;

        /* renamed from: T */
        public boolean f40745T;
        /* access modifiers changed from: private */

        /* renamed from: U */
        public String f40746U;

        /* renamed from: V */
        public ke1 f40747V;

        /* renamed from: W */
        public int f40748W;

        /* renamed from: a */
        public String f40749a;

        /* renamed from: b */
        public String f40750b;

        /* renamed from: c */
        public int f40751c;

        /* renamed from: d */
        public int f40752d;

        /* renamed from: e */
        public int f40753e;

        /* renamed from: f */
        public int f40754f;

        /* renamed from: g */
        public boolean f40755g;

        /* renamed from: h */
        public byte[] f40756h;

        /* renamed from: i */
        public ke1.C13702a f40757i;

        /* renamed from: j */
        public byte[] f40758j;

        /* renamed from: k */
        public DrmInitData f40759k;

        /* renamed from: l */
        public int f40760l;

        /* renamed from: m */
        public int f40761m;

        /* renamed from: n */
        public int f40762n;

        /* renamed from: o */
        public int f40763o;

        /* renamed from: p */
        public int f40764p;

        /* renamed from: q */
        public int f40765q;

        /* renamed from: r */
        public float f40766r;

        /* renamed from: s */
        public float f40767s;

        /* renamed from: t */
        public float f40768t;

        /* renamed from: u */
        public byte[] f40769u;

        /* renamed from: v */
        public int f40770v;

        /* renamed from: w */
        public boolean f40771w;

        /* renamed from: x */
        public int f40772x;

        /* renamed from: y */
        public int f40773y;

        /* renamed from: z */
        public int f40774z;

        private C14765c() {
            this.f40760l = -1;
            this.f40761m = -1;
            this.f40762n = -1;
            this.f40763o = -1;
            this.f40764p = 0;
            this.f40765q = -1;
            this.f40766r = 0.0f;
            this.f40767s = 0.0f;
            this.f40768t = 0.0f;
            this.f40769u = null;
            this.f40770v = -1;
            this.f40771w = false;
            this.f40772x = -1;
            this.f40773y = -1;
            this.f40774z = -1;
            this.f40726A = 1000;
            this.f40727B = 200;
            this.f40728C = -1.0f;
            this.f40729D = -1.0f;
            this.f40730E = -1.0f;
            this.f40731F = -1.0f;
            this.f40732G = -1.0f;
            this.f40733H = -1.0f;
            this.f40734I = -1.0f;
            this.f40735J = -1.0f;
            this.f40736K = -1.0f;
            this.f40737L = -1.0f;
            this.f40738M = 1;
            this.f40739N = -1;
            this.f40740O = 8000;
            this.f40741P = 0;
            this.f40742Q = 0;
            this.f40745T = true;
            this.f40746U = "eng";
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0253, code lost:
            r3 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x029b, code lost:
            r3 = r1;
            r8 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x02b9, code lost:
            r3 = r2;
            r8 = -1;
            r2 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0356, code lost:
            r28 = null;
            r22 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x035a, code lost:
            r25 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x03e1, code lost:
            r1 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x041a, code lost:
            if (r1.mo67122n() == com.yandex.mobile.ads.impl.uk0.m42714b().getLeastSignificantBits()) goto L_0x041c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x045f, code lost:
            r8 = r1;
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x0478, code lost:
            r28 = r2;
            r25 = r8;
            r22 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x047e, code lost:
            r1 = r0.f40745T | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0483, code lost:
            if (r0.f40744S == false) goto L_0x0487;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x0485, code lost:
            r2 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x0487, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x0488, code lost:
            r1 = r1 | r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x048d, code lost:
            if (com.yandex.mobile.ads.impl.wn0.m43728e(r3) == false) goto L_0x04b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x048f, code lost:
            r1 = com.yandex.mobile.ads.exo.Format.m31683a(java.lang.Integer.toString(r36), r3, (java.lang.String) null, -1, r22, r0.f40738M, r0.f40740O, r25, (java.util.List<byte[]>) r28, r0.f40759k, r1 ? 1 : 0, r0.f40746U);
            r12 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x04b8, code lost:
            if (com.yandex.mobile.ads.impl.wn0.m43730g(r3) == false) goto L_0x0676;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x04bc, code lost:
            if (r0.f40764p != 0) goto L_0x04d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x04be, code lost:
            r1 = r0.f40762n;
            r2 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x04c1, code lost:
            if (r1 != -1) goto L_0x04c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x04c3, code lost:
            r1 = r0.f40760l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x04c5, code lost:
            r0.f40762n = r1;
            r1 = r0.f40763o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x04c9, code lost:
            if (r1 != -1) goto L_0x04cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x04cb, code lost:
            r1 = r0.f40761m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x04cd, code lost:
            r0.f40763o = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x04d0, code lost:
            r2 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x04d1, code lost:
            r1 = r0.f40762n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x04d5, code lost:
            if (r1 == r2) goto L_0x04e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x04d7, code lost:
            r5 = r0.f40763o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x04d9, code lost:
            if (r5 == r2) goto L_0x04e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x04db, code lost:
            r1 = ((float) (r0.f40761m * r1)) / ((float) (r0.f40760l * r5));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:243:0x04e7, code lost:
            r1 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:0x04eb, code lost:
            if (r0.f40771w == false) goto L_0x05bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x04f1, code lost:
            if (r0.f40728C == -1.0f) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:249:0x04f7, code lost:
            if (r0.f40729D == -1.0f) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:251:0x04fd, code lost:
            if (r0.f40730E == -1.0f) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x0503, code lost:
            if (r0.f40731F == -1.0f) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:255:0x0509, code lost:
            if (r0.f40732G == -1.0f) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:257:0x050f, code lost:
            if (r0.f40733H == -1.0f) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:259:0x0515, code lost:
            if (r0.f40734I == -1.0f) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:261:0x051b, code lost:
            if (r0.f40735J == -1.0f) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:263:0x0521, code lost:
            if (r0.f40736K == -1.0f) goto L_0x05ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:265:0x0527, code lost:
            if (r0.f40737L != -1.0f) goto L_0x052b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:266:0x052b, code lost:
            r14 = new byte[25];
            r4 = java.nio.ByteBuffer.wrap(r14).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            r4.put((byte) 0);
            r4.putShort((short) ((int) ((r0.f40728C * 50000.0f) + 0.5f)));
            r4.putShort((short) ((int) ((r0.f40729D * 50000.0f) + 0.5f)));
            r4.putShort((short) ((int) ((r0.f40730E * 50000.0f) + 0.5f)));
            r4.putShort((short) ((int) ((r0.f40731F * 50000.0f) + 0.5f)));
            r4.putShort((short) ((int) ((r0.f40732G * 50000.0f) + 0.5f)));
            r4.putShort((short) ((int) ((r0.f40733H * 50000.0f) + 0.5f)));
            r4.putShort((short) ((int) ((r0.f40734I * 50000.0f) + 0.5f)));
            r4.putShort((short) ((int) ((r0.f40735J * 50000.0f) + 0.5f)));
            r4.putShort((short) ((int) (r0.f40736K + 0.5f)));
            r4.putShort((short) ((int) (r0.f40737L + 0.5f)));
            r4.putShort((short) r0.f40726A);
            r4.putShort((short) r0.f40727B);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:267:0x05ad, code lost:
            r31 = new com.yandex.mobile.ads.exo.video.ColorInfo(r0.f40772x, r0.f40774z, r0.f40773y, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:268:0x05bb, code lost:
            r31 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:270:0x05c5, code lost:
            if ("htc_video_rotA-000".equals(r0.f40749a) == false) goto L_0x05c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:271:0x05c7, code lost:
            r14 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:273:0x05d1, code lost:
            if ("htc_video_rotA-090".equals(r0.f40749a) == false) goto L_0x05d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:274:0x05d3, code lost:
            r14 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:276:0x05de, code lost:
            if ("htc_video_rotA-180".equals(r0.f40749a) == false) goto L_0x05e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:277:0x05e0, code lost:
            r14 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:279:0x05eb, code lost:
            if ("htc_video_rotA-270".equals(r0.f40749a) == false) goto L_0x05f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:280:0x05ed, code lost:
            r14 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:281:0x05f0, code lost:
            r14 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:283:0x05f3, code lost:
            if (r0.f40765q != 0) goto L_0x0649;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:285:0x05fc, code lost:
            if (java.lang.Float.compare(r0.f40766r, 0.0f) != 0) goto L_0x0649;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:287:0x0604, code lost:
            if (java.lang.Float.compare(r0.f40767s, 0.0f) != 0) goto L_0x0649;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:289:0x060c, code lost:
            if (java.lang.Float.compare(r0.f40768t, 0.0f) != 0) goto L_0x0611;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:290:0x060e, code lost:
            r27 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:292:0x0619, code lost:
            if (java.lang.Float.compare(r0.f40767s, 90.0f) != 0) goto L_0x0620;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:293:0x061b, code lost:
            r27 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:295:0x0628, code lost:
            if (java.lang.Float.compare(r0.f40767s, -180.0f) == 0) goto L_0x0644;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:297:0x0632, code lost:
            if (java.lang.Float.compare(r0.f40767s, 180.0f) != 0) goto L_0x0635;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:299:0x063d, code lost:
            if (java.lang.Float.compare(r0.f40767s, -90.0f) != 0) goto L_0x0649;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:300:0x063f, code lost:
            r27 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:301:0x0644, code lost:
            r27 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:302:0x0649, code lost:
            r27 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:303:0x064b, code lost:
            r1 = com.yandex.mobile.ads.exo.Format.m31681a(java.lang.Integer.toString(r36), r3, (java.lang.String) null, -1, r22, r0.f40760l, r0.f40761m, -1.0f, (java.util.List<byte[]>) r28, r27, r1, r0.f40769u, r0.f40770v, r31, r0.f40759k);
            r12 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:305:0x067c, code lost:
            if ("application/x-subrip".equals(r3) == false) goto L_0x06a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:306:0x067e, code lost:
            r1 = com.yandex.mobile.ads.exo.Format.m31684a(java.lang.Integer.toString(r36), r3, (java.lang.String) null, -1, r1 ? 1 : 0, r0.f40746U, -1, r0.f40759k, Long.MAX_VALUE, java.util.Collections.emptyList());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:308:0x06a9, code lost:
            if ("text/x-ssa".equals(r3) == false) goto L_0x06de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:309:0x06ab, code lost:
            r2 = new java.util.ArrayList(2);
            r2.add(com.yandex.mobile.ads.impl.uk0.m42711a());
            r2.add(r0.f40758j);
            r1 = com.yandex.mobile.ads.exo.Format.m31684a(java.lang.Integer.toString(r36), r3, (java.lang.String) null, -1, r1 ? 1 : 0, r0.f40746U, -1, r0.f40759k, Long.MAX_VALUE, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:311:0x06e4, code lost:
            if ("application/vobsub".equals(r3) != false) goto L_0x06ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:313:0x06ec, code lost:
            if ("application/pgs".equals(r3) != false) goto L_0x06ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:315:0x06f4, code lost:
            if ("application/dvbsubs".equals(r3) == false) goto L_0x06f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:317:0x06fe, code lost:
            throw new com.yandex.mobile.ads.impl.jy0("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:318:0x06ff, code lost:
            r1 = com.yandex.mobile.ads.exo.Format.m31685a(java.lang.Integer.toString(r36), r3, (java.lang.String) null, -1, r1 ? 1 : 0, r28, r0.f40746U, r0.f40759k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:319:0x0717, code lost:
            r2 = r35.mo65304a(r0.f40751c, r12);
            r0.f40747V = r2;
            r2.mo65339a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:320:0x0724, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x0421  */
        /* JADX WARNING: Removed duplicated region for block: B:208:0x0449  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo70360a(com.yandex.mobile.ads.impl.x50 r35, int r36) throws com.yandex.mobile.ads.impl.jy0 {
            /*
                r34 = this;
                r0 = r34
                java.lang.String r1 = "Error parsing vorbis codec private"
                java.lang.String r2 = r0.f40750b
                r2.getClass()
                int r3 = r2.hashCode()
                r6 = 20
                r7 = 16
                r8 = 15
                r10 = 8
                r11 = 4
                r12 = 3
                r13 = 2
                r15 = 0
                r4 = 1
                switch(r3) {
                    case -2095576542: goto L_0x01a0;
                    case -2095575984: goto L_0x0195;
                    case -1985379776: goto L_0x018a;
                    case -1784763192: goto L_0x017f;
                    case -1730367663: goto L_0x0174;
                    case -1482641358: goto L_0x0169;
                    case -1482641357: goto L_0x015e;
                    case -1373388978: goto L_0x0153;
                    case -933872740: goto L_0x0145;
                    case -538363189: goto L_0x0137;
                    case -538363109: goto L_0x0129;
                    case -425012669: goto L_0x011b;
                    case -356037306: goto L_0x010d;
                    case 62923557: goto L_0x00ff;
                    case 62923603: goto L_0x00f1;
                    case 62927045: goto L_0x00e3;
                    case 82318131: goto L_0x00d5;
                    case 82338133: goto L_0x00c7;
                    case 82338134: goto L_0x00b9;
                    case 99146302: goto L_0x00ab;
                    case 444813526: goto L_0x009d;
                    case 542569478: goto L_0x008f;
                    case 725957860: goto L_0x0081;
                    case 738597099: goto L_0x0073;
                    case 855502857: goto L_0x0065;
                    case 1422270023: goto L_0x0057;
                    case 1809237540: goto L_0x0049;
                    case 1950749482: goto L_0x003b;
                    case 1950789798: goto L_0x002d;
                    case 1951062397: goto L_0x001f;
                    default: goto L_0x001d;
                }
            L_0x001d:
                goto L_0x01ab
            L_0x001f:
                java.lang.String r3 = "A_OPUS"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0029
                goto L_0x01ab
            L_0x0029:
                r2 = 29
                goto L_0x01ac
            L_0x002d:
                java.lang.String r3 = "A_FLAC"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0037
                goto L_0x01ab
            L_0x0037:
                r2 = 28
                goto L_0x01ac
            L_0x003b:
                java.lang.String r3 = "A_EAC3"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0045
                goto L_0x01ab
            L_0x0045:
                r2 = 27
                goto L_0x01ac
            L_0x0049:
                java.lang.String r3 = "V_MPEG2"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0053
                goto L_0x01ab
            L_0x0053:
                r2 = 26
                goto L_0x01ac
            L_0x0057:
                java.lang.String r3 = "S_TEXT/UTF8"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0061
                goto L_0x01ab
            L_0x0061:
                r2 = 25
                goto L_0x01ac
            L_0x0065:
                java.lang.String r3 = "V_MPEGH/ISO/HEVC"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x006f
                goto L_0x01ab
            L_0x006f:
                r2 = 24
                goto L_0x01ac
            L_0x0073:
                java.lang.String r3 = "S_TEXT/ASS"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x007d
                goto L_0x01ab
            L_0x007d:
                r2 = 23
                goto L_0x01ac
            L_0x0081:
                java.lang.String r3 = "A_PCM/INT/LIT"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x008b
                goto L_0x01ab
            L_0x008b:
                r2 = 22
                goto L_0x01ac
            L_0x008f:
                java.lang.String r3 = "A_DTS/EXPRESS"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0099
                goto L_0x01ab
            L_0x0099:
                r2 = 21
                goto L_0x01ac
            L_0x009d:
                java.lang.String r3 = "V_THEORA"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00a7
                goto L_0x01ab
            L_0x00a7:
                r2 = 20
                goto L_0x01ac
            L_0x00ab:
                java.lang.String r3 = "S_HDMV/PGS"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00b5
                goto L_0x01ab
            L_0x00b5:
                r2 = 19
                goto L_0x01ac
            L_0x00b9:
                java.lang.String r3 = "V_VP9"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00c3
                goto L_0x01ab
            L_0x00c3:
                r2 = 18
                goto L_0x01ac
            L_0x00c7:
                java.lang.String r3 = "V_VP8"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00d1
                goto L_0x01ab
            L_0x00d1:
                r2 = 17
                goto L_0x01ac
            L_0x00d5:
                java.lang.String r3 = "V_AV1"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00df
                goto L_0x01ab
            L_0x00df:
                r2 = 16
                goto L_0x01ac
            L_0x00e3:
                java.lang.String r3 = "A_DTS"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00ed
                goto L_0x01ab
            L_0x00ed:
                r2 = 15
                goto L_0x01ac
            L_0x00f1:
                java.lang.String r3 = "A_AC3"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x00fb
                goto L_0x01ab
            L_0x00fb:
                r2 = 14
                goto L_0x01ac
            L_0x00ff:
                java.lang.String r3 = "A_AAC"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0109
                goto L_0x01ab
            L_0x0109:
                r2 = 13
                goto L_0x01ac
            L_0x010d:
                java.lang.String r3 = "A_DTS/LOSSLESS"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0117
                goto L_0x01ab
            L_0x0117:
                r2 = 12
                goto L_0x01ac
            L_0x011b:
                java.lang.String r3 = "S_VOBSUB"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0125
                goto L_0x01ab
            L_0x0125:
                r2 = 11
                goto L_0x01ac
            L_0x0129:
                java.lang.String r3 = "V_MPEG4/ISO/AVC"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0133
                goto L_0x01ab
            L_0x0133:
                r2 = 10
                goto L_0x01ac
            L_0x0137:
                java.lang.String r3 = "V_MPEG4/ISO/ASP"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0141
                goto L_0x01ab
            L_0x0141:
                r2 = 9
                goto L_0x01ac
            L_0x0145:
                java.lang.String r3 = "S_DVBSUB"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x014f
                goto L_0x01ab
            L_0x014f:
                r2 = 8
                goto L_0x01ac
            L_0x0153:
                java.lang.String r3 = "V_MS/VFW/FOURCC"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x015c
                goto L_0x01ab
            L_0x015c:
                r2 = 7
                goto L_0x01ac
            L_0x015e:
                java.lang.String r3 = "A_MPEG/L3"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0167
                goto L_0x01ab
            L_0x0167:
                r2 = 6
                goto L_0x01ac
            L_0x0169:
                java.lang.String r3 = "A_MPEG/L2"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0172
                goto L_0x01ab
            L_0x0172:
                r2 = 5
                goto L_0x01ac
            L_0x0174:
                java.lang.String r3 = "A_VORBIS"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x017d
                goto L_0x01ab
            L_0x017d:
                r2 = 4
                goto L_0x01ac
            L_0x017f:
                java.lang.String r3 = "A_TRUEHD"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0188
                goto L_0x01ab
            L_0x0188:
                r2 = 3
                goto L_0x01ac
            L_0x018a:
                java.lang.String r3 = "A_MS/ACM"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0193
                goto L_0x01ab
            L_0x0193:
                r2 = 2
                goto L_0x01ac
            L_0x0195:
                java.lang.String r3 = "V_MPEG4/ISO/SP"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x019e
                goto L_0x01ab
            L_0x019e:
                r2 = 1
                goto L_0x01ac
            L_0x01a0:
                java.lang.String r3 = "V_MPEG4/ISO/AP"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x01a9
                goto L_0x01ab
            L_0x01a9:
                r2 = 0
                goto L_0x01ac
            L_0x01ab:
                r2 = -1
            L_0x01ac:
                java.lang.String r3 = "audio/raw"
                java.lang.String r5 = "audio/x-unknown"
                java.lang.String r9 = "MatroskaExtractor"
                r14 = 0
                switch(r2) {
                    case 0: goto L_0x046a;
                    case 1: goto L_0x046a;
                    case 2: goto L_0x03e4;
                    case 3: goto L_0x03d8;
                    case 4: goto L_0x035e;
                    case 5: goto L_0x0352;
                    case 6: goto L_0x034d;
                    case 7: goto L_0x02be;
                    case 8: goto L_0x029f;
                    case 9: goto L_0x046a;
                    case 10: goto L_0x0288;
                    case 11: goto L_0x027f;
                    case 12: goto L_0x027b;
                    case 13: goto L_0x0272;
                    case 14: goto L_0x026e;
                    case 15: goto L_0x026a;
                    case 16: goto L_0x0266;
                    case 17: goto L_0x0262;
                    case 18: goto L_0x025e;
                    case 19: goto L_0x025a;
                    case 20: goto L_0x0256;
                    case 21: goto L_0x026a;
                    case 22: goto L_0x022d;
                    case 23: goto L_0x0229;
                    case 24: goto L_0x0214;
                    case 25: goto L_0x0210;
                    case 26: goto L_0x020c;
                    case 27: goto L_0x0208;
                    case 28: goto L_0x01fe;
                    case 29: goto L_0x01be;
                    default: goto L_0x01b6;
                }
            L_0x01b6:
                com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>(r2)
                throw r1
            L_0x01be:
                r1 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r12)
                byte[] r3 = r0.f40758j
                r2.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r10)
                java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r5)
                long r6 = r0.f40741P
                java.nio.ByteBuffer r3 = r3.putLong(r6)
                byte[] r3 = r3.array()
                r2.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r10)
                java.nio.ByteBuffer r3 = r3.order(r5)
                long r5 = r0.f40742Q
                java.nio.ByteBuffer r3 = r3.putLong(r5)
                byte[] r3 = r3.array()
                r2.add(r3)
                java.lang.String r3 = "audio/opus"
                r28 = r2
                r22 = 5760(0x1680, float:8.071E-42)
                goto L_0x035a
            L_0x01fe:
                byte[] r1 = r0.f40758j
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r2 = "audio/flac"
                goto L_0x02b9
            L_0x0208:
                java.lang.String r3 = "audio/eac3"
                goto L_0x03e1
            L_0x020c:
                java.lang.String r3 = "video/mpeg2"
                goto L_0x03e1
            L_0x0210:
                java.lang.String r3 = "application/x-subrip"
                goto L_0x03e1
            L_0x0214:
                com.yandex.mobile.ads.impl.fy0 r1 = new com.yandex.mobile.ads.impl.fy0
                byte[] r2 = r0.f40758j
                r1.<init>((byte[]) r2)
                com.yandex.mobile.ads.exo.video.b r1 = com.yandex.mobile.ads.exo.video.C12340b.m32498a(r1)
                java.util.List<byte[]> r2 = r1.f30330a
                int r1 = r1.f30331b
                r0.f40748W = r1
                java.lang.String r1 = "video/hevc"
                goto L_0x029b
            L_0x0229:
                java.lang.String r3 = "text/x-ssa"
                goto L_0x03e1
            L_0x022d:
                int r1 = r0.f40739N
                int r1 = com.yandex.mobile.ads.impl.ih1.m37365a((int) r1)
                if (r1 != 0) goto L_0x045f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f40739N
                r1.append(r2)
                java.lang.String r2 = ". Setting mimeType to "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r9, r1)
            L_0x0253:
                r3 = r5
                goto L_0x03e1
            L_0x0256:
                java.lang.String r3 = "video/x-unknown"
                goto L_0x03e1
            L_0x025a:
                java.lang.String r3 = "application/pgs"
                goto L_0x03e1
            L_0x025e:
                java.lang.String r3 = "video/x-vnd.on2.vp9"
                goto L_0x03e1
            L_0x0262:
                java.lang.String r3 = "video/x-vnd.on2.vp8"
                goto L_0x03e1
            L_0x0266:
                java.lang.String r3 = "video/av01"
                goto L_0x03e1
            L_0x026a:
                java.lang.String r3 = "audio/vnd.dts"
                goto L_0x03e1
            L_0x026e:
                java.lang.String r3 = "audio/ac3"
                goto L_0x03e1
            L_0x0272:
                byte[] r1 = r0.f40758j
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r2 = "audio/mp4a-latm"
                goto L_0x02b9
            L_0x027b:
                java.lang.String r3 = "audio/vnd.dts.hd"
                goto L_0x03e1
            L_0x027f:
                byte[] r1 = r0.f40758j
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r2 = "application/vobsub"
                goto L_0x02b9
            L_0x0288:
                com.yandex.mobile.ads.impl.fy0 r1 = new com.yandex.mobile.ads.impl.fy0
                byte[] r2 = r0.f40758j
                r1.<init>((byte[]) r2)
                com.yandex.mobile.ads.exo.video.a r1 = com.yandex.mobile.ads.exo.video.C12339a.m32497a(r1)
                java.util.List<byte[]> r2 = r1.f30325a
                int r1 = r1.f30326b
                r0.f40748W = r1
                java.lang.String r1 = "video/avc"
            L_0x029b:
                r3 = r1
                r8 = -1
                goto L_0x0478
            L_0x029f:
                byte[] r1 = new byte[r11]
                byte[] r2 = r0.f40758j
                byte r3 = r2[r15]
                r1[r15] = r3
                byte r3 = r2[r4]
                r1[r4] = r3
                byte r3 = r2[r13]
                r1[r13] = r3
                byte r2 = r2[r12]
                r1[r12] = r2
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r2 = "application/dvbsubs"
            L_0x02b9:
                r3 = r2
                r8 = -1
                r2 = r1
                goto L_0x0478
            L_0x02be:
                com.yandex.mobile.ads.impl.fy0 r1 = new com.yandex.mobile.ads.impl.fy0
                byte[] r2 = r0.f40758j
                r1.<init>((byte[]) r2)
                r1.mo67114f(r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                long r2 = r1.mo67119k()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                r16 = 1482049860(0x58564944, double:7.322299212E-315)
                int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r5 != 0) goto L_0x02db
                android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                java.lang.String r2 = "video/divx"
                r1.<init>(r2, r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                goto L_0x033b
            L_0x02db:
                r16 = 859189832(0x33363248, double:4.244961792E-315)
                int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r5 != 0) goto L_0x02ea
                android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                java.lang.String r2 = "video/3gpp"
                r1.<init>(r2, r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                goto L_0x033b
            L_0x02ea:
                r16 = 826496599(0x31435657, double:4.08343576E-315)
                int r5 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
                if (r5 != 0) goto L_0x032f
                int r2 = r1.mo67105b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                int r2 = r2 + r6
                byte[] r1 = r1.f33778a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
            L_0x02f8:
                int r3 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                int r3 = r3 - r11
                if (r2 >= r3) goto L_0x0327
                byte r3 = r1[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                if (r3 != 0) goto L_0x0324
                int r3 = r2 + 1
                byte r3 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                if (r3 != 0) goto L_0x0324
                int r3 = r2 + 2
                byte r3 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                if (r3 != r4) goto L_0x0324
                int r3 = r2 + 3
                byte r3 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                if (r3 != r8) goto L_0x0324
                int r3 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                android.util.Pair r2 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                java.lang.String r3 = "video/wvc1"
                java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                r2.<init>(r3, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                r1 = r2
                goto L_0x033b
            L_0x0324:
                int r2 = r2 + 1
                goto L_0x02f8
            L_0x0327:
                com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                java.lang.String r2 = "Failed to find FourCC VC1 initialization data"
                r1.<init>(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
                throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0345 }
            L_0x032f:
                java.lang.String r1 = "Unknown FourCC. Setting mimeType to video/x-unknown"
                android.util.Log.w(r9, r1)
                android.util.Pair r1 = new android.util.Pair
                java.lang.String r2 = "video/x-unknown"
                r1.<init>(r2, r14)
            L_0x033b:
                java.lang.Object r2 = r1.first
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L_0x02b9
            L_0x0345:
                com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
                java.lang.String r2 = "Error parsing FourCC private data"
                r1.<init>(r2)
                throw r1
            L_0x034d:
                r1 = 4096(0x1000, float:5.74E-42)
                java.lang.String r3 = "audio/mpeg"
                goto L_0x0356
            L_0x0352:
                r1 = 4096(0x1000, float:5.74E-42)
                java.lang.String r3 = "audio/mpeg-L2"
            L_0x0356:
                r28 = r14
                r22 = 4096(0x1000, float:5.74E-42)
            L_0x035a:
                r25 = -1
                goto L_0x047e
            L_0x035e:
                r2 = 8192(0x2000, float:1.14794E-41)
                byte[] r3 = r0.f40758j
                byte r5 = r3[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                if (r5 != r13) goto L_0x03cc
                r5 = 1
                r6 = 0
            L_0x0368:
                byte r7 = r3[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r8 = -1
                if (r7 != r8) goto L_0x0372
                int r6 = r6 + 255
                int r5 = r5 + 1
                goto L_0x0368
            L_0x0372:
                int r7 = r5 + 1
                byte r5 = r3[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                int r6 = r6 + r5
                r5 = 0
            L_0x0378:
                byte r8 = r3[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r9 = -1
                if (r8 != r9) goto L_0x0382
                int r5 = r5 + 255
                int r7 = r7 + 1
                goto L_0x0378
            L_0x0382:
                int r8 = r7 + 1
                byte r7 = r3[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                int r5 = r5 + r7
                byte r7 = r3[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                if (r7 != r4) goto L_0x03c6
                byte[] r7 = new byte[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                java.lang.System.arraycopy(r3, r8, r7, r15, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                int r8 = r8 + r6
                byte r6 = r3[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                if (r6 != r12) goto L_0x03c0
                int r8 = r8 + r5
                byte r5 = r3[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r6 = 5
                if (r5 != r6) goto L_0x03ba
                int r5 = r3.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                int r5 = r5 - r8
                byte[] r5 = new byte[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                int r6 = r3.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                int r6 = r6 - r8
                java.lang.System.arraycopy(r3, r8, r5, r15, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r3.<init>(r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r3.add(r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r3.add(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                java.lang.String r1 = "audio/vorbis"
                r28 = r3
                r22 = 8192(0x2000, float:1.14794E-41)
                r25 = -1
                r3 = r1
                goto L_0x047e
            L_0x03ba:
                com.yandex.mobile.ads.impl.jy0 r2 = new com.yandex.mobile.ads.impl.jy0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r2.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                throw r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
            L_0x03c0:
                com.yandex.mobile.ads.impl.jy0 r2 = new com.yandex.mobile.ads.impl.jy0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r2.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                throw r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
            L_0x03c6:
                com.yandex.mobile.ads.impl.jy0 r2 = new com.yandex.mobile.ads.impl.jy0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r2.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                throw r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
            L_0x03cc:
                com.yandex.mobile.ads.impl.jy0 r2 = new com.yandex.mobile.ads.impl.jy0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                r2.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
                throw r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x03d2 }
            L_0x03d2:
                com.yandex.mobile.ads.impl.jy0 r2 = new com.yandex.mobile.ads.impl.jy0
                r2.<init>(r1)
                throw r2
            L_0x03d8:
                com.yandex.mobile.ads.impl.uk0$d r1 = new com.yandex.mobile.ads.impl.uk0$d
                r1.<init>()
                r0.f40743R = r1
                java.lang.String r3 = "audio/true-hd"
            L_0x03e1:
                r1 = -1
                goto L_0x045f
            L_0x03e4:
                com.yandex.mobile.ads.impl.fy0 r1 = new com.yandex.mobile.ads.impl.fy0
                byte[] r2 = r0.f40758j
                r1.<init>((byte[]) r2)
                int r2 = r1.mo67121m()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0462 }
                if (r2 != r4) goto L_0x03f2
                goto L_0x041c
            L_0x03f2:
                r6 = 65534(0xfffe, float:9.1833E-41)
                if (r2 != r6) goto L_0x041e
                r2 = 24
                r1.mo67112e(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0462 }
                long r6 = r1.mo67122n()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0462 }
                java.util.UUID r2 = com.yandex.mobile.ads.impl.uk0.f40671e0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0462 }
                long r10 = r2.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0462 }
                int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r2 != 0) goto L_0x041e
                long r1 = r1.mo67122n()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0462 }
                java.util.UUID r6 = com.yandex.mobile.ads.impl.uk0.f40671e0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0462 }
                long r6 = r6.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0462 }
                int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r8 != 0) goto L_0x041e
            L_0x041c:
                r1 = 1
                goto L_0x041f
            L_0x041e:
                r1 = 0
            L_0x041f:
                if (r1 == 0) goto L_0x0449
                int r1 = r0.f40739N
                int r1 = com.yandex.mobile.ads.impl.ih1.m37365a((int) r1)
                if (r1 != 0) goto L_0x045f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f40739N
                r1.append(r2)
                java.lang.String r2 = ". Setting mimeType to "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r9, r1)
                goto L_0x0253
            L_0x0449:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r9, r1)
                goto L_0x0253
            L_0x045f:
                r8 = r1
                r2 = r14
                goto L_0x0478
            L_0x0462:
                com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
                java.lang.String r2 = "Error parsing MS/ACM codec private"
                r1.<init>(r2)
                throw r1
            L_0x046a:
                byte[] r1 = r0.f40758j
                if (r1 != 0) goto L_0x0470
                r1 = r14
                goto L_0x0474
            L_0x0470:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0474:
                java.lang.String r2 = "video/mp4v-es"
                goto L_0x02b9
            L_0x0478:
                r28 = r2
                r25 = r8
                r22 = -1
            L_0x047e:
                boolean r1 = r0.f40745T
                r1 = r1 | r15
                boolean r2 = r0.f40744S
                if (r2 == 0) goto L_0x0487
                r2 = 2
                goto L_0x0488
            L_0x0487:
                r2 = 0
            L_0x0488:
                r1 = r1 | r2
                boolean r2 = com.yandex.mobile.ads.impl.wn0.m43728e(r3)
                if (r2 == 0) goto L_0x04b4
                java.lang.String r18 = java.lang.Integer.toString(r36)
                int r2 = r0.f40738M
                int r5 = r0.f40740O
                com.yandex.mobile.ads.exo.drm.DrmInitData r6 = r0.f40759k
                java.lang.String r7 = r0.f40746U
                r20 = 0
                r21 = -1
                r19 = r3
                r23 = r2
                r24 = r5
                r26 = r28
                r27 = r6
                r28 = r1
                r29 = r7
                com.yandex.mobile.ads.exo.Format r1 = com.yandex.mobile.ads.exo.Format.m31683a((java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (int) r22, (int) r23, (int) r24, (int) r25, (java.util.List<byte[]>) r26, (com.yandex.mobile.ads.exo.drm.DrmInitData) r27, (int) r28, (java.lang.String) r29)
                r12 = 1
                goto L_0x0717
            L_0x04b4:
                boolean r2 = com.yandex.mobile.ads.impl.wn0.m43730g(r3)
                if (r2 == 0) goto L_0x0676
                int r1 = r0.f40764p
                if (r1 != 0) goto L_0x04d0
                int r1 = r0.f40762n
                r2 = -1
                if (r1 != r2) goto L_0x04c5
                int r1 = r0.f40760l
            L_0x04c5:
                r0.f40762n = r1
                int r1 = r0.f40763o
                if (r1 != r2) goto L_0x04cd
                int r1 = r0.f40761m
            L_0x04cd:
                r0.f40763o = r1
                goto L_0x04d1
            L_0x04d0:
                r2 = -1
            L_0x04d1:
                int r1 = r0.f40762n
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r1 == r2) goto L_0x04e7
                int r5 = r0.f40763o
                if (r5 == r2) goto L_0x04e7
                int r6 = r0.f40761m
                int r6 = r6 * r1
                float r1 = (float) r6
                int r6 = r0.f40760l
                int r6 = r6 * r5
                float r5 = (float) r6
                float r1 = r1 / r5
                goto L_0x04e9
            L_0x04e7:
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x04e9:
                boolean r5 = r0.f40771w
                if (r5 == 0) goto L_0x05bb
                float r5 = r0.f40728C
                int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x05ad
                float r5 = r0.f40729D
                int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x05ad
                float r5 = r0.f40730E
                int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x05ad
                float r5 = r0.f40731F
                int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x05ad
                float r5 = r0.f40732G
                int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x05ad
                float r5 = r0.f40733H
                int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x05ad
                float r5 = r0.f40734I
                int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x05ad
                float r5 = r0.f40735J
                int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x05ad
                float r5 = r0.f40736K
                int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x05ad
                float r5 = r0.f40737L
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 != 0) goto L_0x052b
                goto L_0x05ad
            L_0x052b:
                r4 = 25
                byte[] r14 = new byte[r4]
                java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r14)
                java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r4 = r4.order(r5)
                r4.put(r15)
                float r5 = r0.f40728C
                r6 = 1195593728(0x47435000, float:50000.0)
                float r5 = r5 * r6
                r7 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                float r5 = r0.f40729D
                float r5 = r5 * r6
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                float r5 = r0.f40730E
                float r5 = r5 * r6
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                float r5 = r0.f40731F
                float r5 = r5 * r6
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                float r5 = r0.f40732G
                float r5 = r5 * r6
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                float r5 = r0.f40733H
                float r5 = r5 * r6
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                float r5 = r0.f40734I
                float r5 = r5 * r6
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                float r5 = r0.f40735J
                float r5 = r5 * r6
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                float r5 = r0.f40736K
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                float r5 = r0.f40737L
                float r5 = r5 + r7
                int r5 = (int) r5
                short r5 = (short) r5
                r4.putShort(r5)
                int r5 = r0.f40726A
                short r5 = (short) r5
                r4.putShort(r5)
                int r5 = r0.f40727B
                short r5 = (short) r5
                r4.putShort(r5)
            L_0x05ad:
                com.yandex.mobile.ads.exo.video.ColorInfo r4 = new com.yandex.mobile.ads.exo.video.ColorInfo
                int r5 = r0.f40772x
                int r6 = r0.f40774z
                int r7 = r0.f40773y
                r4.<init>(r5, r6, r7, r14)
                r31 = r4
                goto L_0x05bd
            L_0x05bb:
                r31 = r14
            L_0x05bd:
                java.lang.String r4 = r0.f40749a
                java.lang.String r5 = "htc_video_rotA-000"
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L_0x05c9
                r14 = 0
                goto L_0x05f1
            L_0x05c9:
                java.lang.String r4 = r0.f40749a
                java.lang.String r5 = "htc_video_rotA-090"
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L_0x05d6
                r14 = 90
                goto L_0x05f1
            L_0x05d6:
                java.lang.String r4 = r0.f40749a
                java.lang.String r5 = "htc_video_rotA-180"
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L_0x05e3
                r14 = 180(0xb4, float:2.52E-43)
                goto L_0x05f1
            L_0x05e3:
                java.lang.String r4 = r0.f40749a
                java.lang.String r5 = "htc_video_rotA-270"
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L_0x05f0
                r14 = 270(0x10e, float:3.78E-43)
                goto L_0x05f1
            L_0x05f0:
                r14 = -1
            L_0x05f1:
                int r2 = r0.f40765q
                if (r2 != 0) goto L_0x0649
                float r2 = r0.f40766r
                r4 = 0
                int r2 = java.lang.Float.compare(r2, r4)
                if (r2 != 0) goto L_0x0649
                float r2 = r0.f40767s
                int r2 = java.lang.Float.compare(r2, r4)
                if (r2 != 0) goto L_0x0649
                float r2 = r0.f40768t
                int r2 = java.lang.Float.compare(r2, r4)
                if (r2 != 0) goto L_0x0611
                r27 = 0
                goto L_0x064b
            L_0x0611:
                float r2 = r0.f40767s
                r4 = 1119092736(0x42b40000, float:90.0)
                int r2 = java.lang.Float.compare(r2, r4)
                if (r2 != 0) goto L_0x0620
                r15 = 90
                r27 = 90
                goto L_0x064b
            L_0x0620:
                float r2 = r0.f40767s
                r4 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r2 = java.lang.Float.compare(r2, r4)
                if (r2 == 0) goto L_0x0644
                float r2 = r0.f40767s
                r4 = 1127481344(0x43340000, float:180.0)
                int r2 = java.lang.Float.compare(r2, r4)
                if (r2 != 0) goto L_0x0635
                goto L_0x0644
            L_0x0635:
                float r2 = r0.f40767s
                r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r2 = java.lang.Float.compare(r2, r4)
                if (r2 != 0) goto L_0x0649
                r15 = 270(0x10e, float:3.78E-43)
                r27 = 270(0x10e, float:3.78E-43)
                goto L_0x064b
            L_0x0644:
                r15 = 180(0xb4, float:2.52E-43)
                r27 = 180(0xb4, float:2.52E-43)
                goto L_0x064b
            L_0x0649:
                r27 = r14
            L_0x064b:
                java.lang.String r18 = java.lang.Integer.toString(r36)
                int r2 = r0.f40760l
                int r4 = r0.f40761m
                byte[] r5 = r0.f40769u
                int r6 = r0.f40770v
                com.yandex.mobile.ads.exo.drm.DrmInitData r7 = r0.f40759k
                r20 = 0
                r21 = -1
                r25 = -1082130432(0xffffffffbf800000, float:-1.0)
                r19 = r3
                r23 = r2
                r24 = r4
                r26 = r28
                r28 = r1
                r29 = r5
                r30 = r6
                r32 = r7
                com.yandex.mobile.ads.exo.Format r1 = com.yandex.mobile.ads.exo.Format.m31681a((java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21, (int) r22, (int) r23, (int) r24, (float) r25, (java.util.List<byte[]>) r26, (int) r27, (float) r28, (byte[]) r29, (int) r30, (com.yandex.mobile.ads.exo.video.ColorInfo) r31, (com.yandex.mobile.ads.exo.drm.DrmInitData) r32)
                r12 = 2
                goto L_0x0717
            L_0x0676:
                java.lang.String r2 = "application/x-subrip"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x06a3
                java.lang.String r23 = java.lang.Integer.toString(r36)
                java.lang.String r2 = r0.f40746U
                com.yandex.mobile.ads.exo.drm.DrmInitData r4 = r0.f40759k
                java.util.List r33 = java.util.Collections.emptyList()
                r25 = 0
                r26 = -1
                r29 = -1
                r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r24 = r3
                r27 = r1
                r28 = r2
                r30 = r4
                com.yandex.mobile.ads.exo.Format r1 = com.yandex.mobile.ads.exo.Format.m31684a(r23, r24, r25, r26, r27, r28, r29, r30, r31, r33)
                goto L_0x0717
            L_0x06a3:
                java.lang.String r2 = "text/x-ssa"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x06de
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r13)
                byte[] r4 = com.yandex.mobile.ads.impl.uk0.f40669c0
                r2.add(r4)
                byte[] r4 = r0.f40758j
                r2.add(r4)
                java.lang.String r23 = java.lang.Integer.toString(r36)
                java.lang.String r4 = r0.f40746U
                com.yandex.mobile.ads.exo.drm.DrmInitData r5 = r0.f40759k
                r25 = 0
                r26 = -1
                r29 = -1
                r31 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r24 = r3
                r27 = r1
                r28 = r4
                r30 = r5
                r33 = r2
                com.yandex.mobile.ads.exo.Format r1 = com.yandex.mobile.ads.exo.Format.m31684a(r23, r24, r25, r26, r27, r28, r29, r30, r31, r33)
                goto L_0x0717
            L_0x06de:
                java.lang.String r2 = "application/vobsub"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x06ff
                java.lang.String r2 = "application/pgs"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x06ff
                java.lang.String r2 = "application/dvbsubs"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x06f7
                goto L_0x06ff
            L_0x06f7:
                com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>(r2)
                throw r1
            L_0x06ff:
                java.lang.String r23 = java.lang.Integer.toString(r36)
                java.lang.String r2 = r0.f40746U
                com.yandex.mobile.ads.exo.drm.DrmInitData r4 = r0.f40759k
                r25 = 0
                r26 = -1
                r24 = r3
                r27 = r1
                r29 = r2
                r30 = r4
                com.yandex.mobile.ads.exo.Format r1 = com.yandex.mobile.ads.exo.Format.m31685a(r23, r24, r25, r26, r27, r28, r29, r30)
            L_0x0717:
                int r2 = r0.f40751c
                r3 = r35
                com.yandex.mobile.ads.impl.ke1 r2 = r3.mo65304a(r2, r12)
                r0.f40747V = r2
                r2.mo65339a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uk0.C14765c.mo70360a(com.yandex.mobile.ads.impl.x50, int):void");
        }
    }

    static {
        $$Lambda$uk0$5k37b4rIVQowHIH8xYWVNXFzqo r0 = $$Lambda$uk0$5k37b4rIVQowHIH8xYWVNXFzqo.INSTANCE;
    }

    public uk0(int i) {
        this(new C13327hk(), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static w50[] m42715c() {
        return new w50[]{new uk0(0)};
    }

    /* renamed from: d */
    private void m42716d() {
        this.f40689R = 0;
        this.f40690S = 0;
        this.f40691T = 0;
        this.f40692U = false;
        this.f40693V = false;
        this.f40694W = false;
        this.f40695X = 0;
        this.f40696Y = 0;
        this.f40697Z = false;
        this.f40708j.mo67134z();
    }

    public final void release() {
    }

    /* renamed from: com.yandex.mobile.ads.impl.uk0$d */
    private static final class C14766d {

        /* renamed from: a */
        private final byte[] f40775a = new byte[10];

        /* renamed from: b */
        private boolean f40776b;

        /* renamed from: c */
        private int f40777c;

        /* renamed from: d */
        private long f40778d;

        /* renamed from: e */
        private int f40779e;

        /* renamed from: f */
        private int f40780f;

        /* renamed from: g */
        private int f40781g;

        /* renamed from: a */
        public void mo70361a() {
            this.f40776b = false;
            this.f40777c = 0;
        }

        /* renamed from: a */
        public void mo70362a(C13416ik ikVar) throws IOException, InterruptedException {
            if (!this.f40776b) {
                int i = 0;
                ikVar.mo67806a(this.f40775a, 0, 10, false);
                ikVar.mo67812d();
                byte[] bArr = this.f40775a;
                if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                    if ((bArr[7] & 255) == 187) {
                        i = 1;
                    }
                    i = 40 << ((bArr[i != 0 ? (char) 9 : 8] >> 4) & 7);
                }
                if (i != 0) {
                    this.f40776b = true;
                }
            }
        }

        /* renamed from: a */
        public void mo70364a(C14765c cVar, long j, int i, int i2, int i3) {
            if (this.f40776b) {
                int i4 = this.f40777c;
                int i5 = i4 + 1;
                this.f40777c = i5;
                if (i4 == 0) {
                    this.f40778d = j;
                    this.f40779e = i;
                    this.f40780f = 0;
                }
                this.f40780f += i2;
                this.f40781g = i3;
                if (i5 >= 16) {
                    mo70363a(cVar);
                }
            }
        }

        /* renamed from: a */
        public void mo70363a(C14765c cVar) {
            if (this.f40777c > 0) {
                cVar.f40747V.mo65337a(this.f40778d, this.f40779e, this.f40780f, this.f40781g, cVar.f40757i);
                this.f40777c = 0;
            }
        }
    }

    uk0(z20 z20, int i) {
        this.f40715q = -1;
        this.f40716r = -9223372036854775807L;
        this.f40717s = -9223372036854775807L;
        this.f40718t = -9223372036854775807L;
        this.f40724z = -1;
        this.f40672A = -1;
        this.f40673B = -9223372036854775807L;
        this.f40698a = z20;
        ((C13327hk) z20).mo67560a((y20) new C14764b());
        this.f40702d = (i & 1) != 0 ? false : true;
        this.f40700b = new wh1();
        this.f40701c = new SparseArray<>();
        this.f40705g = new fy0(4);
        this.f40706h = new fy0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f40707i = new fy0(4);
        this.f40703e = new fy0(nq0.f37879a);
        this.f40704f = new fy0(4);
        this.f40708j = new fy0();
        this.f40709k = new fy0();
        this.f40710l = new fy0(8);
        this.f40711m = new fy0();
        this.f40712n = new fy0();
    }

    /* renamed from: a */
    public final boolean mo64891a(C13416ik ikVar) throws IOException, InterruptedException {
        return new da1().mo66540b(ikVar);
    }

    /* renamed from: a */
    public final void mo64890a(x50 x50) {
        this.f40699a0 = x50;
    }

    /* renamed from: a */
    public void mo64889a(long j, long j2) {
        this.f40673B = -9223372036854775807L;
        this.f40678G = 0;
        ((C13327hk) this.f40698a).mo67559a();
        this.f40700b.mo70706b();
        m42716d();
        for (int i = 0; i < this.f40701c.size(); i++) {
            C14766d dVar = this.f40701c.valueAt(i).f40743R;
            if (dVar != null) {
                dVar.mo70361a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x003b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo64888a(com.yandex.mobile.ads.impl.C13416ik r9, com.yandex.mobile.ads.impl.r01 r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f40677F = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003c
            boolean r3 = r8.f40677F
            if (r3 != 0) goto L_0x003c
            com.yandex.mobile.ads.impl.z20 r2 = r8.f40698a
            com.yandex.mobile.ads.impl.hk r2 = (com.yandex.mobile.ads.impl.C13327hk) r2
            boolean r2 = r2.mo67561a((com.yandex.mobile.ads.impl.C13416ik) r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.mo67811c()
            boolean r5 = r8.f40723y
            if (r5 == 0) goto L_0x0027
            r8.f40672A = r3
            long r3 = r8.f40724z
            r10.f39340a = r3
            r8.f40723y = r0
        L_0x0025:
            r3 = 1
            goto L_0x0039
        L_0x0027:
            boolean r3 = r8.f40720v
            if (r3 == 0) goto L_0x0038
            long r3 = r8.f40672A
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0038
            r10.f39340a = r3
            r8.f40672A = r5
            goto L_0x0025
        L_0x0038:
            r3 = 0
        L_0x0039:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003c:
            if (r2 != 0) goto L_0x005a
        L_0x003e:
            android.util.SparseArray<com.yandex.mobile.ads.impl.uk0$c> r9 = r8.f40701c
            int r9 = r9.size()
            if (r0 >= r9) goto L_0x0058
            android.util.SparseArray<com.yandex.mobile.ads.impl.uk0$c> r9 = r8.f40701c
            java.lang.Object r9 = r9.valueAt(r0)
            com.yandex.mobile.ads.impl.uk0$c r9 = (com.yandex.mobile.ads.impl.uk0.C14765c) r9
            com.yandex.mobile.ads.impl.uk0$d r10 = r9.f40743R
            if (r10 == 0) goto L_0x0055
            r10.mo70363a((com.yandex.mobile.ads.impl.uk0.C14765c) r9)
        L_0x0055:
            int r0 = r0 + 1
            goto L_0x003e
        L_0x0058:
            r9 = -1
            return r9
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uk0.mo64888a(com.yandex.mobile.ads.impl.ik, com.yandex.mobile.ads.impl.r01):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70357a(int i, long j, long j2) throws jy0 {
        if (i == 160) {
            this.f40688Q = false;
        } else if (i == 174) {
            this.f40719u = new C14765c();
        } else if (i == 187) {
            this.f40676E = false;
        } else if (i == 19899) {
            this.f40721w = -1;
            this.f40722x = -1;
        } else if (i == 20533) {
            this.f40719u.f40755g = true;
        } else if (i == 21968) {
            this.f40719u.f40771w = true;
        } else if (i == 408125543) {
            long j3 = this.f40715q;
            if (j3 == -1 || j3 == j) {
                this.f40715q = j;
                this.f40714p = j2;
                return;
            }
            throw new jy0("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f40674C = new ck0(32);
            this.f40675D = new ck0(32);
        } else if (i != 524531317 || this.f40720v) {
        } else {
            if (!this.f40702d || this.f40724z == -1) {
                this.f40699a0.mo65309a(new s71.C14567b(this.f40718t, 0));
                this.f40720v = true;
                return;
            }
            this.f40723y = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70353a(int i) throws jy0 {
        s71 s71;
        ck0 ck0;
        ck0 ck02;
        int i2;
        int i3 = i;
        int i4 = 0;
        if (i3 != 160) {
            if (i3 == 174) {
                String str = this.f40719u.f40750b;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_AV1".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i4 = 1;
                }
                if (i4 != 0) {
                    C14765c cVar = this.f40719u;
                    cVar.mo70360a(this.f40699a0, cVar.f40751c);
                    SparseArray<C14765c> sparseArray = this.f40701c;
                    C14765c cVar2 = this.f40719u;
                    sparseArray.put(cVar2.f40751c, cVar2);
                }
                this.f40719u = null;
            } else if (i3 == 19899) {
                int i5 = this.f40721w;
                if (i5 != -1) {
                    long j = this.f40722x;
                    if (j != -1) {
                        if (i5 == 475249515) {
                            this.f40724z = j;
                            return;
                        }
                        return;
                    }
                }
                throw new jy0("Mandatory element SeekID or SeekPosition not found");
            } else if (i3 == 25152) {
                C14765c cVar3 = this.f40719u;
                if (cVar3.f40755g) {
                    ke1.C13702a aVar = cVar3.f40757i;
                    if (aVar != null) {
                        cVar3.f40759k = new DrmInitData((String) null, new DrmInitData.SchemeData(C12874dd.f32535a, (String) null, "video/webm", aVar.f36113b));
                        return;
                    }
                    throw new jy0("Encrypted Track found but ContentEncKeyID was not found");
                }
            } else if (i3 == 28032) {
                C14765c cVar4 = this.f40719u;
                if (cVar4.f40755g && cVar4.f40756h != null) {
                    throw new jy0("Combining encryption and compression is not supported");
                }
            } else if (i3 == 357149030) {
                if (this.f40716r == -9223372036854775807L) {
                    this.f40716r = 1000000;
                }
                long j2 = this.f40717s;
                if (j2 != -9223372036854775807L) {
                    this.f40718t = m42707a(j2);
                }
            } else if (i3 != 374648427) {
                if (i3 == 475249515 && !this.f40720v) {
                    x50 x50 = this.f40699a0;
                    if (this.f40715q == -1 || this.f40718t == -9223372036854775807L || (ck0 = this.f40674C) == null || ck0.mo66317a() == 0 || (ck02 = this.f40675D) == null || ck02.mo66317a() != this.f40674C.mo66317a()) {
                        this.f40674C = null;
                        this.f40675D = null;
                        s71 = new s71.C14567b(this.f40718t, 0);
                    } else {
                        int a = this.f40674C.mo66317a();
                        int[] iArr = new int[a];
                        long[] jArr = new long[a];
                        long[] jArr2 = new long[a];
                        long[] jArr3 = new long[a];
                        for (int i6 = 0; i6 < a; i6++) {
                            jArr3[i6] = this.f40674C.mo66318a(i6);
                            jArr[i6] = this.f40715q + this.f40675D.mo66318a(i6);
                        }
                        while (true) {
                            i2 = a - 1;
                            if (i4 >= i2) {
                                break;
                            }
                            int i7 = i4 + 1;
                            iArr[i4] = (int) (jArr[i7] - jArr[i4]);
                            jArr2[i4] = jArr3[i7] - jArr3[i4];
                            i4 = i7;
                        }
                        iArr[i2] = (int) ((this.f40715q + this.f40714p) - jArr[i2]);
                        jArr2[i2] = this.f40718t - jArr3[i2];
                        long j3 = jArr2[i2];
                        if (j3 <= 0) {
                            Log.w("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j3);
                            iArr = Arrays.copyOf(iArr, i2);
                            jArr = Arrays.copyOf(jArr, i2);
                            jArr2 = Arrays.copyOf(jArr2, i2);
                            jArr3 = Arrays.copyOf(jArr3, i2);
                        }
                        this.f40674C = null;
                        this.f40675D = null;
                        s71 = new C15044we(iArr, jArr, jArr2, jArr3);
                    }
                    x50.mo65309a(s71);
                    this.f40720v = true;
                }
            } else if (this.f40701c.size() != 0) {
                this.f40699a0.mo65311c();
            } else {
                throw new jy0("No valid tracks were found");
            }
        } else if (this.f40678G == 2) {
            int i8 = 0;
            for (int i9 = 0; i9 < this.f40682K; i9++) {
                i8 += this.f40683L[i9];
            }
            C14765c cVar5 = this.f40701c.get(this.f40684M);
            int i10 = 0;
            while (i10 < this.f40682K) {
                long j4 = this.f40679H + ((long) ((cVar5.f40753e * i10) / 1000));
                int i11 = this.f40686O;
                if (i10 == 0 && !this.f40688Q) {
                    i11 |= 1;
                }
                int i12 = this.f40683L[i10];
                int i13 = i8 - i12;
                m42710a(cVar5, j4, i11, i12, i13);
                i10++;
                i8 = i13;
            }
            this.f40678G = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70356a(int i, long j) throws jy0 {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f40719u.f40752d = (int) j;
                        return;
                    case 136:
                        C14765c cVar = this.f40719u;
                        if (j == 1) {
                            z = true;
                        }
                        cVar.f40745T = z;
                        return;
                    case 155:
                        this.f40680I = m42707a(j);
                        return;
                    case 159:
                        this.f40719u.f40738M = (int) j;
                        return;
                    case 176:
                        this.f40719u.f40760l = (int) j;
                        return;
                    case 179:
                        this.f40674C.mo66319a(m42707a(j));
                        return;
                    case 186:
                        this.f40719u.f40761m = (int) j;
                        return;
                    case 215:
                        this.f40719u.f40751c = (int) j;
                        return;
                    case 231:
                        this.f40673B = m42707a(j);
                        return;
                    case 238:
                        this.f40687P = (int) j;
                        return;
                    case 241:
                        if (!this.f40676E) {
                            this.f40675D.mo66319a(j);
                            this.f40676E = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f40688Q = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw new jy0("ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new jy0("DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw new jy0("EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw new jy0("ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw new jy0("AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        this.f40722x = j + this.f40715q;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f40719u.f40770v = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f40719u.f40770v = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f40719u.f40770v = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f40719u.f40770v = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f40719u.f40762n = (int) j;
                        return;
                    case 21682:
                        this.f40719u.f40764p = (int) j;
                        return;
                    case 21690:
                        this.f40719u.f40763o = (int) j;
                        return;
                    case 21930:
                        C14765c cVar2 = this.f40719u;
                        if (j == 1) {
                            z = true;
                        }
                        cVar2.f40744S = z;
                        return;
                    case 21998:
                        this.f40719u.f40754f = (int) j;
                        return;
                    case 22186:
                        this.f40719u.f40741P = j;
                        return;
                    case 22203:
                        this.f40719u.f40742Q = j;
                        return;
                    case 25188:
                        this.f40719u.f40739N = (int) j;
                        return;
                    case 30321:
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f40719u.f40765q = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f40719u.f40765q = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f40719u.f40765q = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f40719u.f40765q = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        this.f40719u.f40753e = (int) j;
                        return;
                    case 2807729:
                        this.f40716r = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f40719u.f40774z = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f40719u.f40774z = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.f40719u.f40773y = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.f40719u.f40773y = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.f40719u.f40773y = 3;
                                return;
                            case 21947:
                                C14765c cVar3 = this.f40719u;
                                cVar3.f40771w = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    cVar3.f40772x = 1;
                                    return;
                                } else if (i6 == 9) {
                                    cVar3.f40772x = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    cVar3.f40772x = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f40719u.f40726A = (int) j;
                                return;
                            case 21949:
                                this.f40719u.f40727B = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw new jy0("ContentEncodingScope " + j + " not supported");
            }
        } else if (j != 0) {
            throw new jy0("ContentEncodingOrder " + j + " not supported");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70354a(int i, double d) throws jy0 {
        if (i == 181) {
            this.f40719u.f40740O = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f40719u.f40728C = (float) d;
                    return;
                case 21970:
                    this.f40719u.f40729D = (float) d;
                    return;
                case 21971:
                    this.f40719u.f40730E = (float) d;
                    return;
                case 21972:
                    this.f40719u.f40731F = (float) d;
                    return;
                case 21973:
                    this.f40719u.f40732G = (float) d;
                    return;
                case 21974:
                    this.f40719u.f40733H = (float) d;
                    return;
                case 21975:
                    this.f40719u.f40734I = (float) d;
                    return;
                case 21976:
                    this.f40719u.f40735J = (float) d;
                    return;
                case 21977:
                    this.f40719u.f40736K = (float) d;
                    return;
                case 21978:
                    this.f40719u.f40737L = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            this.f40719u.f40766r = (float) d;
                            return;
                        case 30324:
                            this.f40719u.f40767s = (float) d;
                            return;
                        case 30325:
                            this.f40719u.f40768t = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f40717s = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo70358a(int i, String str) throws jy0 {
        if (i == 134) {
            this.f40719u.f40750b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                this.f40719u.f40749a = str;
            } else if (i == 2274716) {
                String unused = this.f40719u.f40746U = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new jy0("DocType " + str + " not supported");
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0230, code lost:
        throw new com.yandex.mobile.ads.impl.jy0("EBML lacing sample size out of range.");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70355a(int r20, int r21, com.yandex.mobile.ads.impl.C13416ik r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r19 = this;
            r7 = r19
            r0 = r20
            r1 = r21
            r8 = r22
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 4
            r5 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x00cb
            if (r0 == r3) goto L_0x00cb
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x0094
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x0089
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x0079
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0059
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x004e
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0037
            com.yandex.mobile.ads.impl.uk0$c r0 = r7.f40719u
            byte[] r2 = new byte[r1]
            r0.f40769u = r2
            r8.mo67809b(r2, r10, r1, r10)
            goto L_0x02ed
        L_0x0037:
            com.yandex.mobile.ads.impl.jy0 r1 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected id: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x004e:
            com.yandex.mobile.ads.impl.uk0$c r0 = r7.f40719u
            byte[] r2 = new byte[r1]
            r0.f40758j = r2
            r8.mo67809b(r2, r10, r1, r10)
            goto L_0x02ed
        L_0x0059:
            com.yandex.mobile.ads.impl.fy0 r0 = r7.f40707i
            byte[] r0 = r0.f33778a
            java.util.Arrays.fill(r0, r10)
            com.yandex.mobile.ads.impl.fy0 r0 = r7.f40707i
            byte[] r0 = r0.f33778a
            int r2 = 4 - r1
            r8.mo67809b(r0, r2, r1, r10)
            com.yandex.mobile.ads.impl.fy0 r0 = r7.f40707i
            r0.mo67112e(r10)
            com.yandex.mobile.ads.impl.fy0 r0 = r7.f40707i
            long r0 = r0.mo67128t()
            int r1 = (int) r0
            r7.f40721w = r1
            goto L_0x02ed
        L_0x0079:
            byte[] r0 = new byte[r1]
            r8.mo67809b(r0, r10, r1, r10)
            com.yandex.mobile.ads.impl.uk0$c r1 = r7.f40719u
            com.yandex.mobile.ads.impl.ke1$a r2 = new com.yandex.mobile.ads.impl.ke1$a
            r2.<init>(r9, r0, r10, r10)
            r1.f40757i = r2
            goto L_0x02ed
        L_0x0089:
            com.yandex.mobile.ads.impl.uk0$c r0 = r7.f40719u
            byte[] r2 = new byte[r1]
            r0.f40756h = r2
            r8.mo67809b(r2, r10, r1, r10)
            goto L_0x02ed
        L_0x0094:
            int r0 = r7.f40678G
            if (r0 == r5) goto L_0x0099
            return
        L_0x0099:
            android.util.SparseArray<com.yandex.mobile.ads.impl.uk0$c> r0 = r7.f40701c
            int r2 = r7.f40684M
            java.lang.Object r0 = r0.get(r2)
            com.yandex.mobile.ads.impl.uk0$c r0 = (com.yandex.mobile.ads.impl.uk0.C14765c) r0
            int r2 = r7.f40687P
            if (r2 != r4) goto L_0x00c6
            java.lang.String r0 = r0.f40750b
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00c6
            com.yandex.mobile.ads.impl.fy0 r0 = r7.f40712n
            byte[] r2 = r0.f33778a
            int r3 = r2.length
            if (r3 >= r1) goto L_0x00ba
            byte[] r2 = new byte[r1]
        L_0x00ba:
            r0.mo67103a((byte[]) r2, (int) r1)
            com.yandex.mobile.ads.impl.fy0 r0 = r7.f40712n
            byte[] r0 = r0.f33778a
            r8.mo67809b(r0, r10, r1, r10)
            goto L_0x02ed
        L_0x00c6:
            r8.mo67813d(r1)
            goto L_0x02ed
        L_0x00cb:
            int r2 = r7.f40678G
            r6 = 8
            if (r2 != 0) goto L_0x00f0
            com.yandex.mobile.ads.impl.wh1 r2 = r7.f40700b
            long r11 = r2.mo70705a(r8, r10, r9, r6)
            int r2 = (int) r11
            r7.f40684M = r2
            com.yandex.mobile.ads.impl.wh1 r2 = r7.f40700b
            int r2 = r2.mo70704a()
            r7.f40685N = r2
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f40680I = r11
            r7.f40678G = r9
            com.yandex.mobile.ads.impl.fy0 r2 = r7.f40705g
            r2.mo67134z()
        L_0x00f0:
            android.util.SparseArray<com.yandex.mobile.ads.impl.uk0$c> r2 = r7.f40701c
            int r11 = r7.f40684M
            java.lang.Object r2 = r2.get(r11)
            r11 = r2
            com.yandex.mobile.ads.impl.uk0$c r11 = (com.yandex.mobile.ads.impl.uk0.C14765c) r11
            if (r11 != 0) goto L_0x0107
            int r0 = r7.f40685N
            int r0 = r1 - r0
            r8.mo67813d(r0)
            r7.f40678G = r10
            return
        L_0x0107:
            int r2 = r7.f40678G
            if (r2 != r9) goto L_0x02a4
            r2 = 3
            r7.m42708a((com.yandex.mobile.ads.impl.C13416ik) r8, (int) r2)
            com.yandex.mobile.ads.impl.fy0 r12 = r7.f40705g
            byte[] r12 = r12.f33778a
            byte r12 = r12[r5]
            r12 = r12 & 6
            int r12 = r12 >> r9
            r13 = 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x012e
            r7.f40682K = r9
            int[] r4 = r7.f40683L
            int[] r4 = m42713a((int[]) r4, (int) r9)
            r7.f40683L = r4
            int r12 = r7.f40685N
            int r1 = r1 - r12
            int r1 = r1 - r2
            r4[r10] = r1
            goto L_0x0242
        L_0x012e:
            r7.m42708a((com.yandex.mobile.ads.impl.C13416ik) r8, (int) r4)
            com.yandex.mobile.ads.impl.fy0 r14 = r7.f40705g
            byte[] r14 = r14.f33778a
            byte r14 = r14[r2]
            r14 = r14 & r13
            int r14 = r14 + r9
            r7.f40682K = r14
            int[] r15 = r7.f40683L
            int[] r14 = m42713a((int[]) r15, (int) r14)
            r7.f40683L = r14
            if (r12 != r5) goto L_0x0151
            int r2 = r7.f40685N
            int r1 = r1 - r2
            int r1 = r1 - r4
            int r2 = r7.f40682K
            int r1 = r1 / r2
            java.util.Arrays.fill(r14, r10, r2, r1)
            goto L_0x0242
        L_0x0151:
            if (r12 != r9) goto L_0x0186
            r2 = 0
            r12 = 0
        L_0x0155:
            int r14 = r7.f40682K
            int r14 = r14 - r9
            if (r2 >= r14) goto L_0x017b
            int[] r14 = r7.f40683L
            r14[r2] = r10
        L_0x015e:
            int r4 = r4 + r9
            r7.m42708a((com.yandex.mobile.ads.impl.C13416ik) r8, (int) r4)
            com.yandex.mobile.ads.impl.fy0 r14 = r7.f40705g
            byte[] r14 = r14.f33778a
            int r15 = r4 + -1
            byte r14 = r14[r15]
            r14 = r14 & r13
            int[] r15 = r7.f40683L
            r16 = r15[r2]
            int r16 = r16 + r14
            r15[r2] = r16
            if (r14 == r13) goto L_0x015e
            r14 = r15[r2]
            int r12 = r12 + r14
            int r2 = r2 + 1
            goto L_0x0155
        L_0x017b:
            int[] r2 = r7.f40683L
            int r15 = r7.f40685N
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r12
            r2[r14] = r1
            goto L_0x0242
        L_0x0186:
            if (r12 != r2) goto L_0x028d
            r2 = 0
            r12 = 0
        L_0x018a:
            int r14 = r7.f40682K
            int r14 = r14 - r9
            if (r2 >= r14) goto L_0x0239
            int[] r14 = r7.f40683L
            r14[r2] = r10
            int r4 = r4 + 1
            r7.m42708a((com.yandex.mobile.ads.impl.C13416ik) r8, (int) r4)
            com.yandex.mobile.ads.impl.fy0 r14 = r7.f40705g
            byte[] r14 = r14.f33778a
            int r15 = r4 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x0231
            r16 = 0
            r14 = 0
        L_0x01a5:
            if (r14 >= r6) goto L_0x01fa
            int r18 = 7 - r14
            int r3 = r9 << r18
            com.yandex.mobile.ads.impl.fy0 r5 = r7.f40705g
            byte[] r5 = r5.f33778a
            byte r5 = r5[r15]
            r5 = r5 & r3
            if (r5 == 0) goto L_0x01ee
            int r4 = r4 + r14
            r7.m42708a((com.yandex.mobile.ads.impl.C13416ik) r8, (int) r4)
            com.yandex.mobile.ads.impl.fy0 r5 = r7.f40705g
            byte[] r5 = r5.f33778a
            int r16 = r15 + 1
            byte r5 = r5[r15]
            r5 = r5 & r13
            int r3 = ~r3
            r3 = r3 & r5
            long r9 = (long) r3
            r3 = r16
            r16 = r9
        L_0x01c8:
            if (r3 >= r4) goto L_0x01e0
            long r9 = r16 << r6
            com.yandex.mobile.ads.impl.fy0 r5 = r7.f40705g
            byte[] r5 = r5.f33778a
            int r16 = r3 + 1
            byte r3 = r5[r3]
            r3 = r3 & r13
            long r6 = (long) r3
            long r6 = r6 | r9
            r3 = r16
            r16 = r6
            r6 = 8
            r7 = r19
            goto L_0x01c8
        L_0x01e0:
            if (r2 <= 0) goto L_0x01fa
            int r14 = r14 * 7
            int r14 = r14 + 6
            r6 = 1
            long r9 = r6 << r14
            long r9 = r9 - r6
            long r16 = r16 - r9
            goto L_0x01fa
        L_0x01ee:
            int r14 = r14 + 1
            r3 = 163(0xa3, float:2.28E-43)
            r5 = 2
            r6 = 8
            r9 = 1
            r10 = 0
            r7 = r19
            goto L_0x01a5
        L_0x01fa:
            r6 = r16
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x0227
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x0227
            int r3 = (int) r6
            r7 = r19
            int[] r6 = r7.f40683L
            if (r2 != 0) goto L_0x0212
            goto L_0x0217
        L_0x0212:
            int r9 = r2 + -1
            r9 = r6[r9]
            int r3 = r3 + r9
        L_0x0217:
            r6[r2] = r3
            r3 = r6[r2]
            int r12 = r12 + r3
            int r2 = r2 + 1
            r3 = 163(0xa3, float:2.28E-43)
            r5 = 2
            r6 = 8
            r9 = 1
            r10 = 0
            goto L_0x018a
        L_0x0227:
            r7 = r19
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r1 = "EBML lacing sample size out of range."
            r0.<init>(r1)
            throw r0
        L_0x0231:
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.String r1 = "No valid varint length mask found"
            r0.<init>(r1)
            throw r0
        L_0x0239:
            int[] r2 = r7.f40683L
            int r3 = r7.f40685N
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r12
            r2[r14] = r1
        L_0x0242:
            com.yandex.mobile.ads.impl.fy0 r1 = r7.f40705g
            byte[] r1 = r1.f33778a
            r2 = 0
            byte r3 = r1[r2]
            r2 = 8
            int r3 = r3 << r2
            r2 = 1
            byte r1 = r1[r2]
            r1 = r1 & r13
            r1 = r1 | r3
            long r2 = r7.f40673B
            long r9 = (long) r1
            long r9 = r7.m42707a((long) r9)
            long r2 = r2 + r9
            r7.f40679H = r2
            com.yandex.mobile.ads.impl.fy0 r1 = r7.f40705g
            byte[] r1 = r1.f33778a
            r2 = 2
            byte r3 = r1[r2]
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto L_0x0269
            r3 = 1
            goto L_0x026a
        L_0x0269:
            r3 = 0
        L_0x026a:
            int r4 = r11.f40752d
            if (r4 == r2) goto L_0x027c
            r4 = 163(0xa3, float:2.28E-43)
            if (r0 != r4) goto L_0x027a
            byte r1 = r1[r2]
            r2 = 128(0x80, float:1.794E-43)
            r1 = r1 & r2
            if (r1 != r2) goto L_0x027a
            goto L_0x027c
        L_0x027a:
            r1 = 0
            goto L_0x027d
        L_0x027c:
            r1 = 1
        L_0x027d:
            if (r3 == 0) goto L_0x0282
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0283
        L_0x0282:
            r2 = 0
        L_0x0283:
            r1 = r1 | r2
            r7.f40686O = r1
            r1 = 2
            r7.f40678G = r1
            r1 = 0
            r7.f40681J = r1
            goto L_0x02a4
        L_0x028d:
            com.yandex.mobile.ads.impl.jy0 r0 = new com.yandex.mobile.ads.impl.jy0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected lacing value: "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02a4:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02d6
        L_0x02a8:
            int r0 = r7.f40681J
            int r1 = r7.f40682K
            if (r0 >= r1) goto L_0x02d2
            int[] r1 = r7.f40683L
            r0 = r1[r0]
            int r5 = r7.m42706a((com.yandex.mobile.ads.impl.C13416ik) r8, (com.yandex.mobile.ads.impl.uk0.C14765c) r11, (int) r0)
            long r0 = r7.f40679H
            int r2 = r7.f40681J
            int r3 = r11.f40753e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f40686O
            r6 = 0
            r0 = r19
            r1 = r11
            r0.m42710a(r1, r2, r4, r5, r6)
            int r0 = r7.f40681J
            r1 = 1
            int r0 = r0 + r1
            r7.f40681J = r0
            goto L_0x02a8
        L_0x02d2:
            r0 = 0
            r7.f40678G = r0
            goto L_0x02ed
        L_0x02d6:
            int r0 = r7.f40681J
            int r1 = r7.f40682K
            if (r0 >= r1) goto L_0x02ed
            int[] r1 = r7.f40683L
            r2 = r1[r0]
            int r2 = r7.m42706a((com.yandex.mobile.ads.impl.C13416ik) r8, (com.yandex.mobile.ads.impl.uk0.C14765c) r11, (int) r2)
            r1[r0] = r2
            int r0 = r7.f40681J
            r1 = 1
            int r0 = r0 + r1
            r7.f40681J = r0
            goto L_0x02d6
        L_0x02ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uk0.mo70355a(int, int, com.yandex.mobile.ads.impl.ik):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m42710a(com.yandex.mobile.ads.impl.uk0.C14765c r17, long r18, int r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            com.yandex.mobile.ads.impl.uk0$d r1 = r2.f40743R
            r8 = 1
            if (r1 == 0) goto L_0x0018
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r1.mo70364a(r2, r3, r5, r6, r7)
            goto L_0x00c1
        L_0x0018:
            java.lang.String r1 = r2.f40750b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r1 = r3.equals(r1)
            java.lang.String r4 = "S_TEXT/ASS"
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r2.f40750b
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0048
        L_0x002c:
            int r1 = r0.f40682K
            java.lang.String r5 = "MatroskaExtractor"
            if (r1 <= r8) goto L_0x0038
            java.lang.String r1 = "Skipping subtitle sample in laced block."
            android.util.Log.w(r5, r1)
            goto L_0x0048
        L_0x0038:
            long r6 = r0.f40680I
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = "Skipping subtitle sample with no duration."
            android.util.Log.w(r5, r1)
        L_0x0048:
            r1 = r21
            goto L_0x0093
        L_0x004b:
            java.lang.String r1 = r2.f40750b
            com.yandex.mobile.ads.impl.fy0 r5 = r0.f40709k
            byte[] r5 = r5.f33778a
            r1.getClass()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0071
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006b
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r1 = "%02d:%02d:%02d,%03d"
            byte[] r1 = m42712a((long) r6, (java.lang.String) r1, (long) r3)
            r3 = 19
            goto L_0x007b
        L_0x006b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x0071:
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r1 = "%01d:%02d:%02d:%02d"
            byte[] r1 = m42712a((long) r6, (java.lang.String) r1, (long) r3)
            r3 = 21
        L_0x007b:
            int r4 = r1.length
            r6 = 0
            java.lang.System.arraycopy(r1, r6, r5, r3, r4)
            com.yandex.mobile.ads.impl.ke1 r1 = r2.f40747V
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f40709k
            int r4 = r3.mo67107c()
            r1.mo65341a(r3, r4)
            com.yandex.mobile.ads.impl.fy0 r1 = r0.f40709k
            int r1 = r1.mo67107c()
            int r1 = r21 + r1
        L_0x0093:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r20 & r3
            if (r3 == 0) goto L_0x00b3
            int r3 = r0.f40682K
            if (r3 <= r8) goto L_0x00a5
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r3 = r20 & r3
            r13 = r1
            r12 = r3
            goto L_0x00b6
        L_0x00a5:
            com.yandex.mobile.ads.impl.fy0 r3 = r0.f40712n
            int r3 = r3.mo67107c()
            com.yandex.mobile.ads.impl.ke1 r4 = r2.f40747V
            com.yandex.mobile.ads.impl.fy0 r5 = r0.f40712n
            r4.mo65341a(r5, r3)
            int r1 = r1 + r3
        L_0x00b3:
            r12 = r20
            r13 = r1
        L_0x00b6:
            com.yandex.mobile.ads.impl.ke1 r9 = r2.f40747V
            com.yandex.mobile.ads.impl.ke1$a r15 = r2.f40757i
            r10 = r18
            r14 = r22
            r9.mo65337a(r10, r12, r13, r14, r15)
        L_0x00c1:
            r0.f40677F = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uk0.m42710a(com.yandex.mobile.ads.impl.uk0$c, long, int, int, int):void");
    }

    /* renamed from: a */
    private void m42708a(C13416ik ikVar, int i) throws IOException, InterruptedException {
        if (this.f40705g.mo67107c() < i) {
            fy0 fy0 = this.f40705g;
            byte[] bArr = fy0.f33778a;
            if (bArr.length < i) {
                fy0.mo67103a(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.f40705g.mo67107c());
            }
            fy0 fy02 = this.f40705g;
            ikVar.mo67809b(fy02.f33778a, fy02.mo67107c(), i - this.f40705g.mo67107c(), false);
            this.f40705g.mo67110d(i);
        }
    }

    /* renamed from: a */
    private int m42706a(C13416ik ikVar, C14765c cVar, int i) throws IOException, InterruptedException {
        int i2;
        int i3;
        int i4;
        if ("S_TEXT/UTF8".equals(cVar.f40750b)) {
            m42709a(ikVar, f40668b0, i);
            int i5 = this.f40690S;
            m42716d();
            return i5;
        } else if ("S_TEXT/ASS".equals(cVar.f40750b)) {
            m42709a(ikVar, f40670d0, i);
            int i6 = this.f40690S;
            m42716d();
            return i6;
        } else {
            ke1 ke1 = cVar.f40747V;
            boolean z = true;
            if (!this.f40692U) {
                if (cVar.f40755g) {
                    this.f40686O &= -1073741825;
                    int i7 = 128;
                    if (!this.f40693V) {
                        ikVar.mo67809b(this.f40705g.f33778a, 0, 1, false);
                        this.f40689R++;
                        byte[] bArr = this.f40705g.f33778a;
                        if ((bArr[0] & 128) != 128) {
                            this.f40696Y = bArr[0];
                            this.f40693V = true;
                        } else {
                            throw new jy0("Extension bit is set in signal byte");
                        }
                    }
                    byte b = this.f40696Y;
                    if ((b & 1) == 1) {
                        boolean z2 = (b & 2) == 2;
                        this.f40686O |= 1073741824;
                        if (!this.f40697Z) {
                            ikVar.mo67809b(this.f40710l.f33778a, 0, 8, false);
                            this.f40689R += 8;
                            this.f40697Z = true;
                            fy0 fy0 = this.f40705g;
                            byte[] bArr2 = fy0.f33778a;
                            if (!z2) {
                                i7 = 0;
                            }
                            bArr2[0] = (byte) (i7 | 8);
                            fy0.mo67112e(0);
                            ke1.mo65341a(this.f40705g, 1);
                            this.f40690S++;
                            this.f40710l.mo67112e(0);
                            ke1.mo65341a(this.f40710l, 8);
                            this.f40690S += 8;
                        }
                        if (z2) {
                            if (!this.f40694W) {
                                ikVar.mo67809b(this.f40705g.f33778a, 0, 1, false);
                                this.f40689R++;
                                this.f40705g.mo67112e(0);
                                this.f40695X = this.f40705g.mo67126r();
                                this.f40694W = true;
                            }
                            int i8 = this.f40695X * 4;
                            this.f40705g.mo67108c(i8);
                            ikVar.mo67809b(this.f40705g.f33778a, 0, i8, false);
                            this.f40689R += i8;
                            short s = (short) ((this.f40695X / 2) + 1);
                            int i9 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f40713o;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.f40713o = ByteBuffer.allocate(i9);
                            }
                            this.f40713o.position(0);
                            this.f40713o.putShort(s);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i4 = this.f40695X;
                                if (i10 >= i4) {
                                    break;
                                }
                                int v = this.f40705g.mo67130v();
                                if (i10 % 2 == 0) {
                                    this.f40713o.putShort((short) (v - i11));
                                } else {
                                    this.f40713o.putInt(v - i11);
                                }
                                i10++;
                                i11 = v;
                            }
                            int i12 = (i - this.f40689R) - i11;
                            if (i4 % 2 == 1) {
                                this.f40713o.putInt(i12);
                            } else {
                                this.f40713o.putShort((short) i12);
                                this.f40713o.putInt(0);
                            }
                            this.f40711m.mo67103a(this.f40713o.array(), i9);
                            ke1.mo65341a(this.f40711m, i9);
                            this.f40690S += i9;
                        }
                    }
                } else {
                    byte[] bArr3 = cVar.f40756h;
                    if (bArr3 != null) {
                        this.f40708j.mo67103a(bArr3, bArr3.length);
                    }
                }
                if (cVar.f40754f > 0) {
                    this.f40686O |= 268435456;
                    this.f40712n.mo67134z();
                    this.f40705g.mo67108c(4);
                    fy0 fy02 = this.f40705g;
                    byte[] bArr4 = fy02.f33778a;
                    bArr4[0] = (byte) ((i >> 24) & 255);
                    bArr4[1] = (byte) ((i >> 16) & 255);
                    bArr4[2] = (byte) ((i >> 8) & 255);
                    bArr4[3] = (byte) (i & 255);
                    ke1.mo65341a(fy02, 4);
                    this.f40690S += 4;
                }
                this.f40692U = true;
            }
            int c = i + this.f40708j.mo67107c();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f40750b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f40750b)) {
                if (cVar.f40743R != null) {
                    if (this.f40708j.mo67107c() != 0) {
                        z = false;
                    }
                    C13479j9.m37708b(z);
                    cVar.f40743R.mo70362a(ikVar);
                }
                while (true) {
                    int i13 = this.f40689R;
                    if (i13 >= c) {
                        break;
                    }
                    int i14 = c - i13;
                    int a = this.f40708j.mo67098a();
                    if (a > 0) {
                        i3 = Math.min(i14, a);
                        ke1.mo65341a(this.f40708j, i3);
                    } else {
                        i3 = ke1.mo65335a(ikVar, i14, false);
                    }
                    this.f40689R += i3;
                    this.f40690S += i3;
                }
            } else {
                byte[] bArr5 = this.f40704f.f33778a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i15 = cVar.f40748W;
                int i16 = 4 - i15;
                while (this.f40689R < c) {
                    int i17 = this.f40691T;
                    if (i17 == 0) {
                        int min = Math.min(i15, this.f40708j.mo67098a());
                        ikVar.mo67809b(bArr5, i16 + min, i15 - min, false);
                        if (min > 0) {
                            this.f40708j.mo67104a(bArr5, i16, min);
                        }
                        this.f40689R += i15;
                        this.f40704f.mo67112e(0);
                        this.f40691T = this.f40704f.mo67130v();
                        this.f40703e.mo67112e(0);
                        ke1.mo65341a(this.f40703e, 4);
                        this.f40690S += 4;
                    } else {
                        int a2 = this.f40708j.mo67098a();
                        if (a2 > 0) {
                            i2 = Math.min(i17, a2);
                            ke1.mo65341a(this.f40708j, i2);
                        } else {
                            i2 = ke1.mo65335a(ikVar, i17, false);
                        }
                        this.f40689R += i2;
                        this.f40690S += i2;
                        this.f40691T -= i2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f40750b)) {
                this.f40706h.mo67112e(0);
                ke1.mo65341a(this.f40706h, 4);
                this.f40690S += 4;
            }
            int i18 = this.f40690S;
            m42716d();
            return i18;
        }
    }

    /* renamed from: a */
    private void m42709a(C13416ik ikVar, byte[] bArr, int i) throws IOException, InterruptedException {
        int length = bArr.length + i;
        fy0 fy0 = this.f40709k;
        byte[] bArr2 = fy0.f33778a;
        if (bArr2.length < length) {
            fy0.f33778a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ikVar.mo67809b(this.f40709k.f33778a, bArr.length, i, false);
        this.f40709k.mo67108c(length);
    }

    /* renamed from: a */
    private static byte[] m42712a(long j, String str, long j2) {
        C13479j9.m37705a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return ih1.m37390b(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: a */
    private long m42707a(long j) throws jy0 {
        long j2 = this.f40716r;
        if (j2 != -9223372036854775807L) {
            return ih1.m37369a(j, j2, 1000);
        }
        throw new jy0("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    private static int[] m42713a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }
}
