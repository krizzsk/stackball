package com.fyber.inneractive.sdk.player.p059c.p071e;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.p059c.C3188a;
import com.fyber.inneractive.sdk.player.p059c.C3236d;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.C3292i;
import com.fyber.inneractive.sdk.player.p059c.p061b.C3224c;
import com.fyber.inneractive.sdk.player.p059c.p061b.C3225d;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3231b;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3233c;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3235e;
import com.fyber.inneractive.sdk.player.p059c.p071e.C3411d;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3559s;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.e.b */
public abstract class C3407b extends C3188a {

    /* renamed from: j */
    private static final byte[] f9196j = C3560t.m8894f("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private boolean f9197A;

    /* renamed from: B */
    private boolean f9198B;

    /* renamed from: C */
    private boolean f9199C;

    /* renamed from: D */
    private boolean f9200D;

    /* renamed from: E */
    private boolean f9201E;

    /* renamed from: F */
    private ByteBuffer[] f9202F;

    /* renamed from: G */
    private ByteBuffer[] f9203G;

    /* renamed from: H */
    private long f9204H;

    /* renamed from: I */
    private int f9205I;

    /* renamed from: J */
    private int f9206J;

    /* renamed from: K */
    private boolean f9207K;

    /* renamed from: L */
    private boolean f9208L;

    /* renamed from: M */
    private int f9209M;

    /* renamed from: N */
    private int f9210N;

    /* renamed from: O */
    private boolean f9211O;

    /* renamed from: P */
    private boolean f9212P;

    /* renamed from: Q */
    private boolean f9213Q;

    /* renamed from: R */
    private boolean f9214R;

    /* renamed from: S */
    private boolean f9215S;

    /* renamed from: T */
    private boolean f9216T;

    /* renamed from: h */
    protected MediaCodec f9217h;

    /* renamed from: i */
    protected C3224c f9218i;

    /* renamed from: k */
    private final C3409c f9219k;

    /* renamed from: l */
    private final C3233c<C3235e> f9220l;

    /* renamed from: m */
    private final boolean f9221m;

    /* renamed from: n */
    private final C3225d f9222n;

    /* renamed from: o */
    private final C3225d f9223o;

    /* renamed from: p */
    private final C3292i f9224p;

    /* renamed from: q */
    private final List<Long> f9225q;

    /* renamed from: r */
    private final MediaCodec.BufferInfo f9226r;

    /* renamed from: s */
    private C3290h f9227s;

    /* renamed from: t */
    private C3231b<C3235e> f9228t;

    /* renamed from: u */
    private C3231b<C3235e> f9229u;

    /* renamed from: v */
    private boolean f9230v;

    /* renamed from: w */
    private boolean f9231w;

    /* renamed from: x */
    private boolean f9232x;

    /* renamed from: y */
    private boolean f9233y;

    /* renamed from: z */
    private boolean f9234z;

    /* renamed from: B */
    public void mo19188B() {
    }

    /* renamed from: a */
    public abstract int mo18945a(C3409c cVar, C3290h hVar) throws C3411d.C3413b;

    /* renamed from: a */
    public void mo18948a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C3236d {
    }

    /* renamed from: a */
    public abstract void mo18949a(C3406a aVar, MediaCodec mediaCodec, C3290h hVar, MediaCrypto mediaCrypto) throws C3411d.C3413b;

    /* renamed from: a */
    public void mo18950a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public abstract boolean mo18951a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C3236d;

    /* renamed from: a */
    public boolean mo19189a(boolean z, C3290h hVar, C3290h hVar2) {
        return false;
    }

    /* renamed from: m */
    public final int mo18893m() throws C3236d {
        return 4;
    }

    /* renamed from: n */
    public void mo18894n() {
    }

    /* renamed from: o */
    public void mo18895o() {
    }

    /* renamed from: x */
    public void mo18957x() throws C3236d {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.e.b$a */
    public static class C3408a extends Exception {

        /* renamed from: a */
        public final String f9235a;

        /* renamed from: b */
        public final boolean f9236b;

        /* renamed from: c */
        public final String f9237c;

        /* renamed from: d */
        public final String f9238d;

        public C3408a(C3290h hVar, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + hVar, th);
            this.f9235a = hVar.f8493f;
            this.f9236b = z;
            this.f9237c = null;
            String str = i < 0 ? "neg_" : "";
            this.f9238d = "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        public C3408a(C3290h hVar, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + hVar, th);
            this.f9235a = hVar.f8493f;
            this.f9236b = z;
            this.f9237c = str;
            String str2 = null;
            if (C3560t.f9655a >= 21 && (th instanceof MediaCodec.CodecException)) {
                str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            this.f9238d = str2;
        }
    }

    public C3407b(int i, C3409c cVar, boolean z) {
        super(i);
        C3535a.m8784b(C3560t.f9655a >= 16);
        this.f9219k = (C3409c) C3535a.m8781a(cVar);
        this.f9220l = null;
        this.f9221m = z;
        this.f9222n = new C3225d();
        this.f9223o = new C3225d();
        this.f9224p = new C3292i();
        this.f9225q = new ArrayList();
        this.f9226r = new MediaCodec.BufferInfo();
        this.f9209M = 0;
        this.f9210N = 0;
    }

    /* renamed from: a */
    public final int mo19100a(C3290h hVar) throws C3236d {
        try {
            return mo18945a(this.f9219k, hVar);
        } catch (C3411d.C3413b e) {
            throw C3236d.m7869a(e, this.f7921b);
        }
    }

    /* renamed from: a */
    public C3406a mo18946a(C3409c cVar, C3290h hVar, boolean z) throws C3411d.C3413b {
        return cVar.mo19193a(hVar.f8493f, z);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x019d  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19190y() throws com.fyber.inneractive.sdk.player.p059c.C3236d {
        /*
            r15 = this;
            boolean r0 = r15.mo19191z()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.fyber.inneractive.sdk.player.c.c.b<com.fyber.inneractive.sdk.player.c.c.e> r0 = r15.f9229u
            r15.f9228t = r0
            com.fyber.inneractive.sdk.player.c.h r0 = r15.f9227s
            java.lang.String r0 = r0.f8493f
            com.fyber.inneractive.sdk.player.c.c.b<com.fyber.inneractive.sdk.player.c.c.e> r1 = r15.f9228t
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0041
            int r1 = r1.mo18988a()
            if (r1 == 0) goto L_0x0034
            r4 = 3
            if (r1 == r4) goto L_0x0023
            r4 = 4
            if (r1 != r4) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            return
        L_0x0023:
            com.fyber.inneractive.sdk.player.c.c.b<com.fyber.inneractive.sdk.player.c.c.e> r1 = r15.f9228t
            com.fyber.inneractive.sdk.player.c.c.d r1 = r1.mo18989b()
            com.fyber.inneractive.sdk.player.c.c.e r1 = (com.fyber.inneractive.sdk.player.p059c.p062c.C3235e) r1
            android.media.MediaCrypto r1 = r1.f8149a
            com.fyber.inneractive.sdk.player.c.c.b<com.fyber.inneractive.sdk.player.c.c.e> r4 = r15.f9228t
            boolean r4 = r4.mo18990c()
            goto L_0x0043
        L_0x0034:
            com.fyber.inneractive.sdk.player.c.c.b<com.fyber.inneractive.sdk.player.c.c.e> r0 = r15.f9228t
            com.fyber.inneractive.sdk.player.c.c.b$a r0 = r0.mo18991d()
            int r1 = r15.f7921b
            com.fyber.inneractive.sdk.player.c.d r0 = com.fyber.inneractive.sdk.player.p059c.C3236d.m7869a(r0, r1)
            throw r0
        L_0x0041:
            r1 = r2
            r4 = 0
        L_0x0043:
            com.fyber.inneractive.sdk.player.c.e.c r5 = r15.f9219k     // Catch:{ b -> 0x007e }
            com.fyber.inneractive.sdk.player.c.h r6 = r15.f9227s     // Catch:{ b -> 0x007e }
            com.fyber.inneractive.sdk.player.c.e.a r5 = r15.mo18946a((com.fyber.inneractive.sdk.player.p059c.p071e.C3409c) r5, (com.fyber.inneractive.sdk.player.p059c.C3290h) r6, (boolean) r4)     // Catch:{ b -> 0x007e }
            if (r5 != 0) goto L_0x008d
            if (r4 == 0) goto L_0x008d
            com.fyber.inneractive.sdk.player.c.e.c r6 = r15.f9219k     // Catch:{ b -> 0x007c }
            com.fyber.inneractive.sdk.player.c.h r7 = r15.f9227s     // Catch:{ b -> 0x007c }
            com.fyber.inneractive.sdk.player.c.e.a r5 = r15.mo18946a((com.fyber.inneractive.sdk.player.p059c.p071e.C3409c) r6, (com.fyber.inneractive.sdk.player.p059c.C3290h) r7, (boolean) r3)     // Catch:{ b -> 0x007c }
            if (r5 == 0) goto L_0x008d
            java.lang.String r6 = "MediaCodecRenderer"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ b -> 0x007c }
            java.lang.String r8 = "Drm session requires secure decoder for "
            r7.<init>(r8)     // Catch:{ b -> 0x007c }
            r7.append(r0)     // Catch:{ b -> 0x007c }
            java.lang.String r0 = ", but no secure decoder available. Trying to proceed with "
            r7.append(r0)     // Catch:{ b -> 0x007c }
            java.lang.String r0 = r5.f9191a     // Catch:{ b -> 0x007c }
            r7.append(r0)     // Catch:{ b -> 0x007c }
            java.lang.String r0 = "."
            r7.append(r0)     // Catch:{ b -> 0x007c }
            java.lang.String r0 = r7.toString()     // Catch:{ b -> 0x007c }
            android.util.Log.w(r6, r0)     // Catch:{ b -> 0x007c }
            goto L_0x008d
        L_0x007c:
            r0 = move-exception
            goto L_0x0080
        L_0x007e:
            r0 = move-exception
            r5 = r2
        L_0x0080:
            com.fyber.inneractive.sdk.player.c.e.b$a r6 = new com.fyber.inneractive.sdk.player.c.e.b$a
            com.fyber.inneractive.sdk.player.c.h r7 = r15.f9227s
            r8 = -49998(0xffffffffffff3cb2, float:NaN)
            r6.<init>((com.fyber.inneractive.sdk.player.p059c.C3290h) r7, (java.lang.Throwable) r0, (boolean) r4, (int) r8)
            r15.m8479a((com.fyber.inneractive.sdk.player.p059c.p071e.C3407b.C3408a) r6)
        L_0x008d:
            if (r5 != 0) goto L_0x009c
            com.fyber.inneractive.sdk.player.c.e.b$a r0 = new com.fyber.inneractive.sdk.player.c.e.b$a
            com.fyber.inneractive.sdk.player.c.h r6 = r15.f9227s
            r7 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>((com.fyber.inneractive.sdk.player.p059c.C3290h) r6, (java.lang.Throwable) r2, (boolean) r4, (int) r7)
            r15.m8479a((com.fyber.inneractive.sdk.player.p059c.p071e.C3407b.C3408a) r0)
        L_0x009c:
            java.lang.String r0 = r5.f9191a
            boolean r2 = r5.f9192b
            r15.f9230v = r2
            com.fyber.inneractive.sdk.player.c.h r2 = r15.f9227s
            int r6 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r7 = 21
            r14 = 1
            if (r6 >= r7) goto L_0x00bd
            java.util.List<byte[]> r2 = r2.f8495h
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00bd
            java.lang.String r2 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00bd
            r2 = 1
            goto L_0x00be
        L_0x00bd:
            r2 = 0
        L_0x00be:
            r15.f9231w = r2
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r6 = 19
            r8 = 18
            if (r2 < r8) goto L_0x00fd
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            if (r2 != r8) goto L_0x00dc
            java.lang.String r2 = "OMX.SEC.avc.dec"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00fd
            java.lang.String r2 = "OMX.SEC.avc.dec.secure"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00fd
        L_0x00dc:
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            if (r2 != r6) goto L_0x00fb
            java.lang.String r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9658d
            java.lang.String r9 = "SM-G800"
            boolean r2 = r2.startsWith(r9)
            if (r2 == 0) goto L_0x00fb
            java.lang.String r2 = "OMX.Exynos.avc.dec"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00fd
            java.lang.String r2 = "OMX.Exynos.avc.dec.secure"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r2 = 0
            goto L_0x00fe
        L_0x00fd:
            r2 = 1
        L_0x00fe:
            r15.f9232x = r2
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r9 = 24
            if (r2 >= r9) goto L_0x0140
            java.lang.String r2 = "OMX.Nvidia.h264.decode"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0116
            java.lang.String r2 = "OMX.Nvidia.h264.decode.secure"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0140
        L_0x0116:
            java.lang.String r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b
            java.lang.String r9 = "flounder"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x013e
            java.lang.String r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b
            java.lang.String r9 = "flounder_lte"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x013e
            java.lang.String r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b
            java.lang.String r9 = "grouper"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x013e
            java.lang.String r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b
            java.lang.String r9 = "tilapia"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x0140
        L_0x013e:
            r2 = 1
            goto L_0x0141
        L_0x0140:
            r2 = 0
        L_0x0141:
            r15.f9233y = r2
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r9 = 17
            if (r2 > r9) goto L_0x015b
            java.lang.String r2 = "OMX.rk.video_decoder.avc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0159
            java.lang.String r2 = "OMX.allwinner.video.decoder.avc"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x015b
        L_0x0159:
            r2 = 1
            goto L_0x015c
        L_0x015b:
            r2 = 0
        L_0x015c:
            r15.f9234z = r2
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            r9 = 23
            if (r2 > r9) goto L_0x016c
            java.lang.String r2 = "OMX.google.vorbis.decoder"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x018a
        L_0x016c:
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            if (r2 > r6) goto L_0x018c
            java.lang.String r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9656b
            java.lang.String r6 = "hb2000"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x018c
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x018a
            java.lang.String r2 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x018c
        L_0x018a:
            r2 = 1
            goto L_0x018d
        L_0x018c:
            r2 = 0
        L_0x018d:
            r15.f9197A = r2
            int r2 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            if (r2 != r7) goto L_0x019d
            java.lang.String r2 = "OMX.google.aac.decoder"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x019d
            r2 = 1
            goto L_0x019e
        L_0x019d:
            r2 = 0
        L_0x019e:
            r15.f9198B = r2
            com.fyber.inneractive.sdk.player.c.h r2 = r15.f9227s
            int r6 = com.fyber.inneractive.sdk.player.p059c.p080k.C3560t.f9655a
            if (r6 > r8) goto L_0x01b3
            int r2 = r2.f8505r
            if (r2 != r14) goto L_0x01b3
            java.lang.String r2 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x01b3
            r3 = 1
        L_0x01b3:
            r15.f9199C = r3
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x020b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020b }
            java.lang.String r7 = "createCodec:"
            r6.<init>(r7)     // Catch:{ Exception -> 0x020b }
            r6.append(r0)     // Catch:{ Exception -> 0x020b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x020b }
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8868a(r6)     // Catch:{ Exception -> 0x020b }
            android.media.MediaCodec r6 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x020b }
            r15.f9217h = r6     // Catch:{ Exception -> 0x020b }
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8867a()     // Catch:{ Exception -> 0x020b }
            java.lang.String r6 = "configureCodec"
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8868a(r6)     // Catch:{ Exception -> 0x020b }
            android.media.MediaCodec r6 = r15.f9217h     // Catch:{ Exception -> 0x020b }
            com.fyber.inneractive.sdk.player.c.h r7 = r15.f9227s     // Catch:{ Exception -> 0x020b }
            r15.mo18949a(r5, r6, r7, r1)     // Catch:{ Exception -> 0x020b }
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8867a()     // Catch:{ Exception -> 0x020b }
            java.lang.String r1 = "startCodec"
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8868a(r1)     // Catch:{ Exception -> 0x020b }
            android.media.MediaCodec r1 = r15.f9217h     // Catch:{ Exception -> 0x020b }
            r1.start()     // Catch:{ Exception -> 0x020b }
            com.fyber.inneractive.sdk.player.p059c.p080k.C3559s.m8867a()     // Catch:{ Exception -> 0x020b }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x020b }
            long r12 = r10 - r2
            r8 = r15
            r9 = r0
            r8.mo18950a((java.lang.String) r9, (long) r10, (long) r12)     // Catch:{ Exception -> 0x020b }
            android.media.MediaCodec r1 = r15.f9217h     // Catch:{ Exception -> 0x020b }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x020b }
            r15.f9202F = r1     // Catch:{ Exception -> 0x020b }
            android.media.MediaCodec r1 = r15.f9217h     // Catch:{ Exception -> 0x020b }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x020b }
            r15.f9203G = r1     // Catch:{ Exception -> 0x020b }
            goto L_0x0216
        L_0x020b:
            r1 = move-exception
            com.fyber.inneractive.sdk.player.c.e.b$a r2 = new com.fyber.inneractive.sdk.player.c.e.b$a
            com.fyber.inneractive.sdk.player.c.h r3 = r15.f9227s
            r2.<init>((com.fyber.inneractive.sdk.player.p059c.C3290h) r3, (java.lang.Throwable) r1, (boolean) r4, (java.lang.String) r0)
            r15.m8479a((com.fyber.inneractive.sdk.player.p059c.p071e.C3407b.C3408a) r2)
        L_0x0216:
            int r0 = r15.f7922c
            r1 = 2
            if (r0 != r1) goto L_0x0223
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x0228
        L_0x0223:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0228:
            r15.f9204H = r0
            r0 = -1
            r15.f9205I = r0
            r15.f9206J = r0
            r15.f9216T = r14
            com.fyber.inneractive.sdk.player.c.b.c r0 = r15.f9218i
            int r1 = r0.f8122a
            int r1 = r1 + r14
            r0.f8122a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p071e.C3407b.mo19190y():void");
    }

    /* renamed from: z */
    public boolean mo19191z() {
        return this.f9217h == null && this.f9227s != null;
    }

    /* renamed from: a */
    public void mo18879a(boolean z) throws C3236d {
        this.f9218i = new C3224c();
    }

    /* renamed from: a */
    public void mo18877a(long j, boolean z) throws C3236d {
        this.f9213Q = false;
        this.f9214R = false;
        if (this.f9217h != null) {
            this.f9204H = -9223372036854775807L;
            this.f9205I = -1;
            this.f9206J = -1;
            this.f9216T = true;
            this.f9215S = false;
            this.f9207K = false;
            this.f9225q.clear();
            this.f9200D = false;
            this.f9201E = false;
            if (this.f9232x || (this.f9197A && this.f9212P)) {
                mo19187A();
                mo19190y();
            } else if (this.f9210N != 0) {
                mo19187A();
                mo19190y();
            } else {
                this.f9217h.flush();
                this.f9211O = false;
            }
            if (this.f9208L && this.f9227s != null) {
                this.f9209M = 1;
            }
        }
    }

    /* renamed from: p */
    public void mo18896p() {
        this.f9227s = null;
        try {
            mo19187A();
        } finally {
            this.f9228t = null;
            this.f9229u = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo19187A() {
        if (this.f9217h != null) {
            this.f9204H = -9223372036854775807L;
            this.f9205I = -1;
            this.f9206J = -1;
            this.f9215S = false;
            this.f9207K = false;
            this.f9225q.clear();
            this.f9202F = null;
            this.f9203G = null;
            this.f9208L = false;
            this.f9211O = false;
            this.f9230v = false;
            this.f9231w = false;
            this.f9232x = false;
            this.f9233y = false;
            this.f9234z = false;
            this.f9197A = false;
            this.f9199C = false;
            this.f9200D = false;
            this.f9201E = false;
            this.f9212P = false;
            this.f9209M = 0;
            this.f9210N = 0;
            this.f9218i.f8123b++;
            this.f9222n.f8130c = null;
            try {
                this.f9217h.stop();
                try {
                    this.f9217h.release();
                } finally {
                    this.f9217h = null;
                    C3231b<C3235e> bVar = this.f9228t;
                    if (!(bVar == null || this.f9229u == bVar)) {
                        this.f9228t = null;
                    }
                }
            } catch (Throwable th) {
                this.f9217h = null;
                C3231b<C3235e> bVar2 = this.f9228t;
                if (!(bVar2 == null || this.f9229u == bVar2)) {
                    this.f9228t = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo19099a(long j, long j2) throws C3236d {
        if (this.f9214R) {
            mo18957x();
            return;
        }
        if (this.f9227s == null) {
            this.f9223o.mo18960a();
            int a = mo18873a(this.f9224p, this.f9223o, true);
            if (a == -5) {
                mo18952b(this.f9224p.f8514a);
            } else if (a == -4) {
                C3535a.m8784b(this.f9223o.mo18963c());
                this.f9213Q = true;
                m8482t();
                return;
            } else {
                return;
            }
        }
        mo19190y();
        if (this.f9217h != null) {
            C3559s.m8868a("drainAndFeed");
            do {
            } while (m8480b(j, j2));
            do {
            } while (mo19432s());
            C3559s.m8867a();
        } else {
            this.f7923d.mo19276a(j - this.f7924e);
            this.f9223o.mo18960a();
            int a2 = mo18873a(this.f9224p, this.f9223o, false);
            if (a2 == -5) {
                mo18952b(this.f9224p.f8514a);
            } else if (a2 == -4) {
                C3535a.m8784b(this.f9223o.mo18963c());
                this.f9213Q = true;
                m8482t();
            }
        }
        this.f9218i.mo18965a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0145 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0146  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean mo19432s() throws com.fyber.inneractive.sdk.player.p059c.C3236d {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.f9217h
            r1 = 0
            if (r0 == 0) goto L_0x01ca
            int r2 = r14.f9210N
            r3 = 2
            if (r2 == r3) goto L_0x01ca
            boolean r2 = r14.f9213Q
            if (r2 == 0) goto L_0x0010
            goto L_0x01ca
        L_0x0010:
            int r2 = r14.f9205I
            if (r2 >= 0) goto L_0x002c
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r14.f9205I = r0
            if (r0 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            com.fyber.inneractive.sdk.player.c.b.d r2 = r14.f9222n
            java.nio.ByteBuffer[] r4 = r14.f9202F
            r0 = r4[r0]
            r2.f8130c = r0
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n
            r0.mo18960a()
        L_0x002c:
            int r0 = r14.f9210N
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0049
            boolean r0 = r14.f9234z
            if (r0 != 0) goto L_0x0046
            r14.f9212P = r4
            android.media.MediaCodec r5 = r14.f9217h
            int r6 = r14.f9205I
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.f9205I = r2
        L_0x0046:
            r14.f9210N = r3
            return r1
        L_0x0049:
            boolean r0 = r14.f9200D
            if (r0 == 0) goto L_0x006b
            r14.f9200D = r1
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n
            java.nio.ByteBuffer r0 = r0.f8130c
            byte[] r1 = f9196j
            r0.put(r1)
            android.media.MediaCodec r5 = r14.f9217h
            int r6 = r14.f9205I
            r7 = 0
            byte[] r0 = f9196j
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.f9205I = r2
            r14.f9211O = r4
            return r4
        L_0x006b:
            boolean r0 = r14.f9215S
            if (r0 == 0) goto L_0x0072
            r0 = -4
            r5 = 0
            goto L_0x00aa
        L_0x0072:
            int r0 = r14.f9209M
            if (r0 != r4) goto L_0x0097
            r0 = 0
        L_0x0077:
            com.fyber.inneractive.sdk.player.c.h r5 = r14.f9227s
            java.util.List<byte[]> r5 = r5.f8495h
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0095
            com.fyber.inneractive.sdk.player.c.h r5 = r14.f9227s
            java.util.List<byte[]> r5 = r5.f8495h
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.fyber.inneractive.sdk.player.c.b.d r6 = r14.f9222n
            java.nio.ByteBuffer r6 = r6.f8130c
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0095:
            r14.f9209M = r3
        L_0x0097:
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n
            java.nio.ByteBuffer r0 = r0.f8130c
            int r0 = r0.position()
            com.fyber.inneractive.sdk.player.c.i r5 = r14.f9224p
            com.fyber.inneractive.sdk.player.c.b.d r6 = r14.f9222n
            int r5 = r14.mo18873a((com.fyber.inneractive.sdk.player.p059c.C3292i) r5, (com.fyber.inneractive.sdk.player.p059c.p061b.C3225d) r6, (boolean) r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00aa:
            r6 = -3
            if (r0 != r6) goto L_0x00ae
            return r1
        L_0x00ae:
            r6 = -5
            if (r0 != r6) goto L_0x00c4
            int r0 = r14.f9209M
            if (r0 != r3) goto L_0x00bc
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n
            r0.mo18960a()
            r14.f9209M = r4
        L_0x00bc:
            com.fyber.inneractive.sdk.player.c.i r0 = r14.f9224p
            com.fyber.inneractive.sdk.player.c.h r0 = r0.f8514a
            r14.mo18952b(r0)
            return r4
        L_0x00c4:
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n
            boolean r0 = r0.mo18963c()
            if (r0 == 0) goto L_0x00fe
            int r0 = r14.f9209M
            if (r0 != r3) goto L_0x00d7
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n
            r0.mo18960a()
            r14.f9209M = r4
        L_0x00d7:
            r14.f9213Q = r4
            boolean r0 = r14.f9211O
            if (r0 != 0) goto L_0x00e1
            r14.m8482t()
            return r1
        L_0x00e1:
            boolean r0 = r14.f9234z     // Catch:{ CryptoException -> 0x00f6 }
            if (r0 != 0) goto L_0x00f5
            r14.f9212P = r4     // Catch:{ CryptoException -> 0x00f6 }
            android.media.MediaCodec r5 = r14.f9217h     // Catch:{ CryptoException -> 0x00f6 }
            int r6 = r14.f9205I     // Catch:{ CryptoException -> 0x00f6 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f6 }
            r14.f9205I = r2     // Catch:{ CryptoException -> 0x00f6 }
        L_0x00f5:
            return r1
        L_0x00f6:
            r0 = move-exception
            int r1 = r14.f7921b
            com.fyber.inneractive.sdk.player.c.d r0 = com.fyber.inneractive.sdk.player.p059c.C3236d.m7869a(r0, r1)
            throw r0
        L_0x00fe:
            boolean r0 = r14.f9216T
            if (r0 == 0) goto L_0x0116
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n
            boolean r0 = r0.mo18964d()
            if (r0 != 0) goto L_0x0116
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n
            r0.mo18960a()
            int r0 = r14.f9209M
            if (r0 != r3) goto L_0x0115
            r14.f9209M = r4
        L_0x0115:
            return r4
        L_0x0116:
            r14.f9216T = r1
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n
            boolean r0 = r0.mo18967e()
            com.fyber.inneractive.sdk.player.c.c.b<com.fyber.inneractive.sdk.player.c.c.e> r3 = r14.f9228t
            if (r3 == 0) goto L_0x0140
            int r3 = r3.mo18988a()
            if (r3 == 0) goto L_0x0133
            r6 = 4
            if (r3 == r6) goto L_0x0140
            if (r0 != 0) goto L_0x0131
            boolean r3 = r14.f9221m
            if (r3 != 0) goto L_0x0140
        L_0x0131:
            r3 = 1
            goto L_0x0141
        L_0x0133:
            com.fyber.inneractive.sdk.player.c.c.b<com.fyber.inneractive.sdk.player.c.c.e> r0 = r14.f9228t
            com.fyber.inneractive.sdk.player.c.c.b$a r0 = r0.mo18991d()
            int r1 = r14.f7921b
            com.fyber.inneractive.sdk.player.c.d r0 = com.fyber.inneractive.sdk.player.p059c.C3236d.m7869a(r0, r1)
            throw r0
        L_0x0140:
            r3 = 0
        L_0x0141:
            r14.f9215S = r3
            if (r3 == 0) goto L_0x0146
            return r1
        L_0x0146:
            boolean r3 = r14.f9231w
            if (r3 == 0) goto L_0x0160
            if (r0 != 0) goto L_0x0160
            com.fyber.inneractive.sdk.player.c.b.d r3 = r14.f9222n
            java.nio.ByteBuffer r3 = r3.f8130c
            com.fyber.inneractive.sdk.player.p059c.p080k.C3544i.m8806a((java.nio.ByteBuffer) r3)
            com.fyber.inneractive.sdk.player.c.b.d r3 = r14.f9222n
            java.nio.ByteBuffer r3 = r3.f8130c
            int r3 = r3.position()
            if (r3 != 0) goto L_0x015e
            return r4
        L_0x015e:
            r14.f9231w = r1
        L_0x0160:
            com.fyber.inneractive.sdk.player.c.b.d r3 = r14.f9222n     // Catch:{ CryptoException -> 0x01c2 }
            long r10 = r3.f8131d     // Catch:{ CryptoException -> 0x01c2 }
            com.fyber.inneractive.sdk.player.c.b.d r3 = r14.f9222n     // Catch:{ CryptoException -> 0x01c2 }
            boolean r3 = r3.mo18962b()     // Catch:{ CryptoException -> 0x01c2 }
            if (r3 == 0) goto L_0x0175
            java.util.List<java.lang.Long> r3 = r14.f9225q     // Catch:{ CryptoException -> 0x01c2 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01c2 }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01c2 }
        L_0x0175:
            com.fyber.inneractive.sdk.player.c.b.d r3 = r14.f9222n     // Catch:{ CryptoException -> 0x01c2 }
            java.nio.ByteBuffer r3 = r3.f8130c     // Catch:{ CryptoException -> 0x01c2 }
            r3.flip()     // Catch:{ CryptoException -> 0x01c2 }
            r14.mo19188B()     // Catch:{ CryptoException -> 0x01c2 }
            if (r0 == 0) goto L_0x01a3
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n     // Catch:{ CryptoException -> 0x01c2 }
            com.fyber.inneractive.sdk.player.c.b.b r0 = r0.f8129b     // Catch:{ CryptoException -> 0x01c2 }
            android.media.MediaCodec$CryptoInfo r9 = r0.f8118i     // Catch:{ CryptoException -> 0x01c2 }
            if (r5 != 0) goto L_0x018a
            goto L_0x0199
        L_0x018a:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01c2 }
            if (r0 != 0) goto L_0x0192
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01c2 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01c2 }
        L_0x0192:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01c2 }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01c2 }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01c2 }
        L_0x0199:
            android.media.MediaCodec r6 = r14.f9217h     // Catch:{ CryptoException -> 0x01c2 }
            int r7 = r14.f9205I     // Catch:{ CryptoException -> 0x01c2 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01c2 }
            goto L_0x01b4
        L_0x01a3:
            android.media.MediaCodec r6 = r14.f9217h     // Catch:{ CryptoException -> 0x01c2 }
            int r7 = r14.f9205I     // Catch:{ CryptoException -> 0x01c2 }
            r8 = 0
            com.fyber.inneractive.sdk.player.c.b.d r0 = r14.f9222n     // Catch:{ CryptoException -> 0x01c2 }
            java.nio.ByteBuffer r0 = r0.f8130c     // Catch:{ CryptoException -> 0x01c2 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01c2 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01c2 }
        L_0x01b4:
            r14.f9205I = r2     // Catch:{ CryptoException -> 0x01c2 }
            r14.f9211O = r4     // Catch:{ CryptoException -> 0x01c2 }
            r14.f9209M = r1     // Catch:{ CryptoException -> 0x01c2 }
            com.fyber.inneractive.sdk.player.c.b.c r0 = r14.f9218i     // Catch:{ CryptoException -> 0x01c2 }
            int r1 = r0.f8124c     // Catch:{ CryptoException -> 0x01c2 }
            int r1 = r1 + r4
            r0.f8124c = r1     // Catch:{ CryptoException -> 0x01c2 }
            return r4
        L_0x01c2:
            r0 = move-exception
            int r1 = r14.f7921b
            com.fyber.inneractive.sdk.player.c.d r0 = com.fyber.inneractive.sdk.player.p059c.C3236d.m7869a(r0, r1)
            throw r0
        L_0x01ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p071e.C3407b.mo19432s():boolean");
    }

    /* renamed from: b */
    public void mo18952b(C3290h hVar) throws C3236d {
        C3290h hVar2 = this.f9227s;
        this.f9227s = hVar;
        boolean z = true;
        if (!C3560t.m8885a((Object) hVar.f8496i, (Object) hVar2 == null ? null : hVar2.f8496i)) {
            if (this.f9227s.f8496i != null) {
                C3233c<C3235e> cVar = this.f9220l;
                if (cVar != null) {
                    Looper.myLooper();
                    C3227a aVar = this.f9227s.f8496i;
                    this.f9229u = cVar.mo18992a();
                    C3231b<C3235e> bVar = this.f9228t;
                } else {
                    throw C3236d.m7869a(new IllegalStateException("Media requires a DrmSessionManager"), this.f7921b);
                }
            } else {
                this.f9229u = null;
            }
        }
        if (this.f9229u == this.f9228t && this.f9217h != null && mo19189a(this.f9230v, hVar2, this.f9227s)) {
            this.f9208L = true;
            this.f9209M = 1;
            if (!(this.f9233y && this.f9227s.f8497j == hVar2.f8497j && this.f9227s.f8498k == hVar2.f8498k)) {
                z = false;
            }
            this.f9200D = z;
        } else if (this.f9211O) {
            this.f9210N = 1;
        } else {
            mo19187A();
            mo19190y();
        }
    }

    /* renamed from: r */
    public boolean mo18954r() {
        return this.f9214R;
    }

    /* renamed from: q */
    public boolean mo18953q() {
        if (this.f9227s == null || this.f9215S) {
            return false;
        }
        if ((this.f7925f ? this.f7926g : this.f7923d.mo19277a()) || this.f9206J >= 0) {
            return true;
        }
        return this.f9204H != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f9204H;
    }

    /* renamed from: b */
    private boolean m8480b(long j, long j2) throws C3236d {
        boolean z;
        boolean z2;
        if (this.f9206J < 0) {
            if (!this.f9198B || !this.f9212P) {
                this.f9206J = this.f9217h.dequeueOutputBuffer(this.f9226r, 0);
            } else {
                try {
                    this.f9206J = this.f9217h.dequeueOutputBuffer(this.f9226r, 0);
                } catch (IllegalStateException unused) {
                    m8482t();
                    if (this.f9214R) {
                        mo19187A();
                    }
                    return false;
                }
            }
            int i = this.f9206J;
            if (i >= 0) {
                if (this.f9201E) {
                    this.f9201E = false;
                    this.f9217h.releaseOutputBuffer(i, false);
                    this.f9206J = -1;
                    return true;
                } else if ((this.f9226r.flags & 4) != 0) {
                    m8482t();
                    this.f9206J = -1;
                    return false;
                } else {
                    ByteBuffer byteBuffer = this.f9203G[this.f9206J];
                    if (byteBuffer != null) {
                        byteBuffer.position(this.f9226r.offset);
                        byteBuffer.limit(this.f9226r.offset + this.f9226r.size);
                    }
                    long j3 = this.f9226r.presentationTimeUs;
                    int size = this.f9225q.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            z2 = false;
                            break;
                        } else if (this.f9225q.get(i2).longValue() == j3) {
                            this.f9225q.remove(i2);
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    this.f9207K = z2;
                }
            } else if (i == -2) {
                MediaFormat outputFormat = this.f9217h.getOutputFormat();
                if (this.f9233y && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f9201E = true;
                } else {
                    if (this.f9199C) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    mo18948a(this.f9217h, outputFormat);
                }
                return true;
            } else if (i == -3) {
                this.f9203G = this.f9217h.getOutputBuffers();
                return true;
            } else {
                if (this.f9234z && (this.f9213Q || this.f9210N == 2)) {
                    m8482t();
                }
                return false;
            }
        }
        if (!this.f9198B || !this.f9212P) {
            MediaCodec mediaCodec = this.f9217h;
            ByteBuffer[] byteBufferArr = this.f9203G;
            int i3 = this.f9206J;
            z = mo18951a(j, j2, mediaCodec, byteBufferArr[i3], i3, this.f9226r.flags, this.f9226r.presentationTimeUs, this.f9207K);
        } else {
            try {
                z = mo18951a(j, j2, this.f9217h, this.f9203G[this.f9206J], this.f9206J, this.f9226r.flags, this.f9226r.presentationTimeUs, this.f9207K);
            } catch (IllegalStateException unused2) {
                m8482t();
                if (this.f9214R) {
                    mo19187A();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        long j4 = this.f9226r.presentationTimeUs;
        this.f9206J = -1;
        return true;
    }

    /* renamed from: t */
    private void m8482t() throws C3236d {
        if (this.f9210N == 2) {
            mo19187A();
            mo19190y();
            return;
        }
        this.f9214R = true;
        mo18957x();
    }

    /* renamed from: a */
    private void m8479a(C3408a aVar) throws C3236d {
        throw C3236d.m7869a(aVar, this.f7921b);
    }
}
