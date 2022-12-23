package com.yandex.mobile.ads.exo.video;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.exo.video.C12344d;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C13991ml;
import com.yandex.mobile.ads.impl.C14283pj;
import com.yandex.mobile.ads.impl.C14387qj;
import com.yandex.mobile.ads.impl.em1;
import com.yandex.mobile.ads.impl.fm1;
import com.yandex.mobile.ads.impl.he1;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.ol0;
import com.yandex.mobile.ads.impl.oo0;
import com.yandex.mobile.ads.impl.pl0;
import com.yandex.mobile.ads.impl.q70;
import com.yandex.mobile.ads.impl.ql0;
import com.yandex.mobile.ads.impl.rl0;
import com.yandex.mobile.ads.impl.s70;
import com.yandex.mobile.ads.impl.x11;
import com.yandex.mobile.ads.impl.xl0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.exo.video.c */
public class C12341c extends pl0 {

    /* renamed from: j1 */
    private static final int[] f30332j1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: k1 */
    private static boolean f30333k1;

    /* renamed from: l1 */
    private static boolean f30334l1;

    /* renamed from: A0 */
    private final boolean f30335A0 = m32501U();

    /* renamed from: B0 */
    private final long[] f30336B0 = new long[10];

    /* renamed from: C0 */
    private final long[] f30337C0 = new long[10];

    /* renamed from: D0 */
    private C12342a f30338D0;

    /* renamed from: E0 */
    private boolean f30339E0;

    /* renamed from: F0 */
    private boolean f30340F0;

    /* renamed from: G0 */
    private Surface f30341G0;

    /* renamed from: H0 */
    private Surface f30342H0;

    /* renamed from: I0 */
    private int f30343I0 = 1;

    /* renamed from: J0 */
    private boolean f30344J0;

    /* renamed from: K0 */
    private long f30345K0;

    /* renamed from: L0 */
    private long f30346L0 = -9223372036854775807L;

    /* renamed from: M0 */
    private long f30347M0;

    /* renamed from: N0 */
    private int f30348N0;

    /* renamed from: O0 */
    private int f30349O0;

    /* renamed from: P0 */
    private int f30350P0;

    /* renamed from: Q0 */
    private long f30351Q0;

    /* renamed from: R0 */
    private int f30352R0;

    /* renamed from: S0 */
    private float f30353S0 = -1.0f;

    /* renamed from: T0 */
    private MediaFormat f30354T0;

    /* renamed from: U0 */
    private int f30355U0 = -1;

    /* renamed from: V0 */
    private int f30356V0 = -1;

    /* renamed from: W0 */
    private int f30357W0;

    /* renamed from: X0 */
    private float f30358X0 = -1.0f;

    /* renamed from: Y0 */
    private int f30359Y0;

    /* renamed from: Z0 */
    private int f30360Z0;

    /* renamed from: a1 */
    private int f30361a1;

    /* renamed from: b1 */
    private float f30362b1;

    /* renamed from: c1 */
    private boolean f30363c1;

    /* renamed from: d1 */
    private int f30364d1;

    /* renamed from: e1 */
    C12343b f30365e1;

    /* renamed from: f1 */
    private long f30366f1 = -9223372036854775807L;

    /* renamed from: g1 */
    private long f30367g1 = -9223372036854775807L;

    /* renamed from: h1 */
    private int f30368h1;

    /* renamed from: i1 */
    private em1 f30369i1;

    /* renamed from: v0 */
    private final Context f30370v0;

    /* renamed from: w0 */
    private final fm1 f30371w0;

    /* renamed from: x0 */
    private final C12344d.C12345a f30372x0;

    /* renamed from: y0 */
    private final long f30373y0;

    /* renamed from: z0 */
    private final int f30374z0;

    /* renamed from: com.yandex.mobile.ads.exo.video.c$a */
    protected static final class C12342a {

        /* renamed from: a */
        public final int f30375a;

        /* renamed from: b */
        public final int f30376b;

        /* renamed from: c */
        public final int f30377c;

        public C12342a(int i, int i2, int i3) {
            this.f30375a = i;
            this.f30376b = i2;
            this.f30377c = i3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.video.c$b */
    private final class C12343b implements MediaCodec.OnFrameRenderedListener, Handler.Callback {

        /* renamed from: b */
        private final Handler f30378b;

        public C12343b(MediaCodec mediaCodec) {
            Handler handler = new Handler(this);
            this.f30378b = handler;
            mediaCodec.setOnFrameRenderedListener(this, handler);
        }

        /* renamed from: a */
        private void m32546a(long j) {
            C12341c cVar = C12341c.this;
            if (this == cVar.f30365e1) {
                if (j == Long.MAX_VALUE) {
                    C12341c.m32511a(cVar);
                } else {
                    cVar.mo65447f(j);
                }
            }
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m32546a((ih1.m37398e(message.arg1) << 32) | ih1.m37398e(message.arg2));
            return true;
        }

        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (ih1.f34858a < 30) {
                this.f30378b.sendMessageAtFrontOfQueue(Message.obtain(this.f30378b, 0, (int) (j >> 32), (int) j));
                return;
            }
            m32546a(j);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public C12341c(Context context, ql0 ql0, long j, C12188d<s70> dVar, boolean z, boolean z2, Handler handler, C12344d dVar2, int i) {
        super(2, ql0, dVar, z, z2, 30.0f);
        this.f30373y0 = j;
        this.f30374z0 = i;
        Context applicationContext = context.getApplicationContext();
        this.f30370v0 = applicationContext;
        this.f30371w0 = new fm1(applicationContext);
        this.f30372x0 = new C12344d.C12345a(handler, dVar2);
        m32500T();
    }

    /* renamed from: S */
    private void m32499S() {
        MediaCodec G;
        this.f30344J0 = false;
        if (ih1.f34858a >= 23 && this.f30363c1 && (G = mo69379G()) != null) {
            this.f30365e1 = new C12343b(G);
        }
    }

    /* renamed from: T */
    private void m32500T() {
        this.f30359Y0 = -1;
        this.f30360Z0 = -1;
        this.f30362b1 = -1.0f;
        this.f30361a1 = -1;
    }

    /* renamed from: U */
    private static boolean m32501U() {
        return "NVIDIA".equals(ih1.f34860c);
    }

    /* renamed from: V */
    private void m32502V() {
        if (this.f30348N0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f30372x0.mo65450a(this.f30348N0, elapsedRealtime - this.f30347M0);
            this.f30348N0 = 0;
            this.f30347M0 = elapsedRealtime;
        }
    }

    /* renamed from: X */
    private void m32503X() {
        int i = this.f30355U0;
        if (i != -1 || this.f30356V0 != -1) {
            if (this.f30359Y0 != i || this.f30360Z0 != this.f30356V0 || this.f30361a1 != this.f30357W0 || this.f30362b1 != this.f30358X0) {
                this.f30372x0.mo65454b(i, this.f30356V0, this.f30357W0, this.f30358X0);
                this.f30359Y0 = this.f30355U0;
                this.f30360Z0 = this.f30356V0;
                this.f30361a1 = this.f30357W0;
                this.f30362b1 = this.f30358X0;
            }
        }
    }

    /* renamed from: Y */
    private void m32504Y() {
        int i = this.f30359Y0;
        if (i != -1 || this.f30360Z0 != -1) {
            this.f30372x0.mo65454b(i, this.f30360Z0, this.f30361a1, this.f30362b1);
        }
    }

    /* renamed from: Z */
    private void m32505Z() {
        this.f30346L0 = this.f30373y0 > 0 ? SystemClock.elapsedRealtime() + this.f30373y0 : -9223372036854775807L;
    }

    /* renamed from: e */
    private static boolean m32513e(long j) {
        return j < -30000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public boolean mo65425F() {
        try {
            return super.mo65425F();
        } finally {
            this.f30350P0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public boolean mo65426I() {
        return this.f30363c1 && ih1.f34858a < 23;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo65427L() {
        try {
            super.mo65427L();
        } finally {
            this.f30350P0 = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo65428W() {
        if (!this.f30344J0) {
            this.f30344J0 = true;
            this.f30372x0.mo65455b(this.f30341G0);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo65431a(com.yandex.mobile.ads.impl.ql0 r8, com.yandex.mobile.ads.exo.drm.C12188d<com.yandex.mobile.ads.impl.s70> r9, com.yandex.mobile.ads.exo.Format r10) throws com.yandex.mobile.ads.impl.rl0.C14471c {
        /*
            r7 = this;
            java.lang.String r0 = r10.f29530j
            boolean r0 = com.yandex.mobile.ads.impl.wn0.m43730g(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r8 = com.yandex.mobile.ads.exo.C12178d.m31711b((int) r1)
            return r8
        L_0x000e:
            com.yandex.mobile.ads.exo.drm.DrmInitData r0 = r10.f29533m
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            java.util.List r4 = m32508a((com.yandex.mobile.ads.impl.ql0) r8, (com.yandex.mobile.ads.exo.Format) r10, (boolean) r3, (boolean) r1)
            if (r3 == 0) goto L_0x0026
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0026
            java.util.List r4 = m32508a((com.yandex.mobile.ads.impl.ql0) r8, (com.yandex.mobile.ads.exo.Format) r10, (boolean) r1, (boolean) r1)
        L_0x0026:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0031
            int r8 = com.yandex.mobile.ads.exo.C12178d.m31711b((int) r2)
            return r8
        L_0x0031:
            if (r0 == 0) goto L_0x004a
            java.lang.Class<? extends com.yandex.mobile.ads.impl.j40> r5 = r10.f29520D
            java.lang.Class<com.yandex.mobile.ads.impl.s70> r6 = com.yandex.mobile.ads.impl.s70.class
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x004a
            java.lang.Class<? extends com.yandex.mobile.ads.impl.j40> r5 = r10.f29520D
            if (r5 != 0) goto L_0x0048
            boolean r9 = com.yandex.mobile.ads.exo.C12178d.m31710a((com.yandex.mobile.ads.exo.drm.C12188d<?>) r9, (com.yandex.mobile.ads.exo.drm.DrmInitData) r0)
            if (r9 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r9 = 0
            goto L_0x004b
        L_0x004a:
            r9 = 1
        L_0x004b:
            if (r9 != 0) goto L_0x0053
            r8 = 2
            int r8 = com.yandex.mobile.ads.exo.C12178d.m31711b((int) r8)
            return r8
        L_0x0053:
            java.lang.Object r9 = r4.get(r1)
            com.yandex.mobile.ads.impl.ol0 r9 = (com.yandex.mobile.ads.impl.ol0) r9
            boolean r0 = r9.mo69200a((com.yandex.mobile.ads.exo.Format) r10)
            boolean r9 = r9.mo69203b((com.yandex.mobile.ads.exo.Format) r10)
            if (r9 == 0) goto L_0x0066
            r9 = 16
            goto L_0x0068
        L_0x0066:
            r9 = 8
        L_0x0068:
            if (r0 == 0) goto L_0x0088
            java.util.List r8 = m32508a((com.yandex.mobile.ads.impl.ql0) r8, (com.yandex.mobile.ads.exo.Format) r10, (boolean) r3, (boolean) r2)
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x0088
            java.lang.Object r8 = r8.get(r1)
            com.yandex.mobile.ads.impl.ol0 r8 = (com.yandex.mobile.ads.impl.ol0) r8
            boolean r2 = r8.mo69200a((com.yandex.mobile.ads.exo.Format) r10)
            if (r2 == 0) goto L_0x0088
            boolean r8 = r8.mo69203b((com.yandex.mobile.ads.exo.Format) r10)
            if (r8 == 0) goto L_0x0088
            r1 = 32
        L_0x0088:
            if (r0 == 0) goto L_0x008c
            r8 = 4
            goto L_0x008d
        L_0x008c:
            r8 = 3
        L_0x008d:
            r8 = r8 | r9
            r8 = r8 | r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.video.C12341c.mo65431a(com.yandex.mobile.ads.impl.ql0, com.yandex.mobile.ads.exo.drm.d, com.yandex.mobile.ads.exo.Format):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65444b(C14387qj qjVar) {
        if (!this.f30363c1) {
            this.f30350P0++;
        }
        this.f30366f1 = Math.max(qjVar.f39149f, this.f30366f1);
        if (ih1.f34858a < 23 && this.f30363c1) {
            mo65447f(qjVar.f39149f);
        }
    }

    /* renamed from: c */
    public boolean mo65006c() {
        Surface surface;
        if (super.mo65006c() && (this.f30344J0 || (((surface = this.f30342H0) != null && this.f30341G0 == surface) || mo69379G() == null || this.f30363c1))) {
            this.f30346L0 = -9223372036854775807L;
            return true;
        } else if (this.f30346L0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f30346L0) {
                return true;
            }
            this.f30346L0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo65447f(long j) {
        Format d = mo69383d(j);
        if (d != null) {
            m32510a(mo69379G(), d.f29535o, d.f29536p);
        }
        m32503X();
        this.f38695t0.f38625e++;
        mo65428W();
        mo65446c(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo64827w() {
        this.f30366f1 = -9223372036854775807L;
        this.f30367g1 = -9223372036854775807L;
        this.f30368h1 = 0;
        this.f30354T0 = null;
        m32500T();
        m32499S();
        this.f30371w0.mo67036a();
        this.f30365e1 = null;
        try {
            super.mo64827w();
        } finally {
            this.f30372x0.mo65452a(this.f38695t0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo64828x() {
        try {
            super.mo64828x();
        } finally {
            Surface surface = this.f30342H0;
            if (surface != null) {
                if (this.f30341G0 == surface) {
                    this.f30341G0 = null;
                }
                surface.release();
                this.f30342H0 = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo64829y() {
        this.f30348N0 = 0;
        this.f30347M0 = SystemClock.elapsedRealtime();
        this.f30351Q0 = SystemClock.elapsedRealtime() * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo64830z() {
        this.f30346L0 = -9223372036854775807L;
        m32502V();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65443b(MediaCodec mediaCodec, int i) {
        he1.m36941a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        he1.m36940a();
        this.f38695t0.f38626f++;
    }

    /* renamed from: b */
    private boolean m32512b(ol0 ol0) {
        return ih1.f34858a >= 23 && !this.f30363c1 && !mo65442a(ol0.f38260a) && (!ol0.f38265f || DummySurface.m32493a(this.f30370v0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo65446c(long j) {
        if (!this.f30363c1) {
            this.f30350P0--;
        }
        while (true) {
            int i = this.f30368h1;
            if (i != 0 && j >= this.f30337C0[0]) {
                long[] jArr = this.f30336B0;
                this.f30367g1 = jArr[0];
                int i2 = i - 1;
                this.f30368h1 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f30337C0;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f30368h1);
                m32499S();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo65445c(int i) {
        C14283pj pjVar = this.f38695t0;
        pjVar.f38627g += i;
        this.f30348N0 += i;
        int i2 = this.f30349O0 + i;
        this.f30349O0 = i2;
        pjVar.f38628h = Math.max(i2, pjVar.f38628h);
        int i3 = this.f30374z0;
        if (i3 > 0 && this.f30348N0 >= i3) {
            m32502V();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<ol0> mo65432a(ql0 ql0, Format format, boolean z) throws rl0.C14471c {
        return m32508a(ql0, format, z, this.f30363c1);
    }

    /* renamed from: a */
    private static List<ol0> m32508a(ql0 ql0, Format format, boolean z, boolean z2) throws rl0.C14471c {
        Pair<Integer, Integer> a;
        String str = format.f29530j;
        if (str == null) {
            return Collections.emptyList();
        }
        List<ol0> a2 = rl0.m41611a(ql0.mo69620a(str, z, z2), format);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str) && (a = rl0.m41607a(format)) != null) {
            int intValue = ((Integer) a.first).intValue();
            if (intValue == 16 || intValue == 256) {
                ((ArrayList) a2).addAll(ql0.mo69620a("video/hevc", z, z2));
            } else if (intValue == 512) {
                ((ArrayList) a2).addAll(ql0.mo69620a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(a2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64806a(boolean z) throws k40 {
        super.mo64806a(z);
        int i = this.f30364d1;
        int i2 = mo64823s().f40562a;
        this.f30364d1 = i2;
        this.f30363c1 = i2 != 0;
        if (i2 != i) {
            mo65427L();
        }
        this.f30372x0.mo65456b(this.f38695t0);
        this.f30371w0.mo67037b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64807a(Format[] formatArr, long j) throws k40 {
        if (this.f30367g1 == -9223372036854775807L) {
            this.f30367g1 = j;
            return;
        }
        int i = this.f30368h1;
        if (i == this.f30336B0.length) {
            Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.f30336B0[this.f30368h1 - 1]);
        } else {
            this.f30368h1 = i + 1;
        }
        long[] jArr = this.f30336B0;
        int i2 = this.f30368h1 - 1;
        jArr[i2] = j;
        this.f30337C0[i2] = this.f30366f1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64804a(long j, boolean z) throws k40 {
        super.mo64804a(j, z);
        m32499S();
        this.f30345K0 = -9223372036854775807L;
        this.f30349O0 = 0;
        this.f30366f1 = -9223372036854775807L;
        int i = this.f30368h1;
        if (i != 0) {
            this.f30367g1 = this.f30336B0[i - 1];
            this.f30368h1 = 0;
        }
        if (z) {
            m32505Z();
        } else {
            this.f30346L0 = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public void mo64802a(int i, Object obj) throws k40 {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.f30342H0;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    ol0 H = mo69380H();
                    if (H != null && m32512b(H)) {
                        surface = DummySurface.m32492a(this.f30370v0, H.f38265f);
                        this.f30342H0 = surface;
                    }
                }
            }
            if (this.f30341G0 != surface) {
                this.f30341G0 = surface;
                int b = mo64809b();
                MediaCodec G = mo69379G();
                if (G != null) {
                    if (ih1.f34858a < 23 || surface == null || this.f30339E0) {
                        mo65427L();
                        mo69381J();
                    } else {
                        G.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.f30342H0) {
                    m32500T();
                    m32499S();
                    return;
                }
                m32504Y();
                m32499S();
                if (b == 2) {
                    m32505Z();
                }
            } else if (surface != null && surface != this.f30342H0) {
                m32504Y();
                if (this.f30344J0) {
                    this.f30372x0.mo65455b(this.f30341G0);
                }
            }
        } else if (i == 4) {
            this.f30343I0 = ((Integer) obj).intValue();
            MediaCodec G2 = mo69379G();
            if (G2 != null) {
                G2.setVideoScalingMode(this.f30343I0);
            }
        } else if (i == 6) {
            this.f30369i1 = (em1) obj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo65441a(ol0 ol0) {
        return this.f30341G0 != null || m32512b(ol0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65436a(ol0 ol0, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f) {
        C12342a aVar;
        boolean z;
        Pair<Integer, Integer> a;
        Point point;
        Point point2;
        int i;
        Point point3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Format[] formatArr;
        int a2;
        ol0 ol02 = ol0;
        MediaCodec mediaCodec2 = mediaCodec;
        Format format2 = format;
        float f2 = f;
        String str = ol02.f38262c;
        Format[] u = mo64825u();
        int i2 = format2.f29535o;
        int i3 = format2.f29536p;
        int a3 = m32506a(ol02, format2);
        boolean z2 = false;
        if (u.length == 1) {
            if (!(a3 == -1 || (a2 = m32507a(ol02, format2.f29530j, format2.f29535o, format2.f29536p)) == -1)) {
                a3 = Math.min((int) (((float) a3) * 1.5f), a2);
            }
            aVar = new C12342a(i2, i3, a3);
        } else {
            int length = u.length;
            int i4 = 0;
            boolean z3 = false;
            while (i4 < length) {
                Format format3 = u[i4];
                if (ol02.mo69201a(format2, format3, z2)) {
                    int i5 = format3.f29535o;
                    formatArr = u;
                    z3 |= i5 == -1 || format3.f29536p == -1;
                    int max = Math.max(i2, i5);
                    int max2 = Math.max(i3, format3.f29536p);
                    a3 = Math.max(a3, m32506a(ol02, format3));
                    i3 = max2;
                    i2 = max;
                } else {
                    formatArr = u;
                }
                i4++;
                u = formatArr;
                z2 = false;
            }
            if (z3) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i2 + "x" + i3);
                int i6 = format2.f29536p;
                int i7 = format2.f29535o;
                boolean z4 = i6 > i7;
                int i8 = z4 ? i6 : i7;
                if (z4) {
                    i6 = i7;
                }
                float f3 = ((float) i6) / ((float) i8);
                int[] iArr = f30332j1;
                int length2 = iArr.length;
                int i9 = 0;
                while (true) {
                    point = null;
                    if (i9 >= length2) {
                        break;
                    }
                    int i10 = length2;
                    int i11 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i12 = (int) (((float) i11) * f3);
                    if (i11 <= i8 || i12 <= i6) {
                        break;
                    }
                    int i13 = i6;
                    float f4 = f3;
                    if (ih1.f34858a >= 21) {
                        int i14 = z4 ? i12 : i11;
                        if (!z4) {
                            i11 = i12;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = ol02.f38263d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            i = i8;
                            point3 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            i = i8;
                            point3 = new Point(ih1.m37366a(i14, widthAlignment) * widthAlignment, ih1.m37366a(i11, heightAlignment) * heightAlignment);
                        }
                        point = point3;
                        if (ol02.mo69199a(point3.x, point3.y, (double) format2.f29537q)) {
                            break;
                        }
                    } else {
                        i = i8;
                        try {
                            int a4 = ih1.m37366a(i11, 16) * 16;
                            int a5 = ih1.m37366a(i12, 16) * 16;
                            if (a4 * a5 <= rl0.m41603a()) {
                                int i15 = z4 ? a5 : a4;
                                if (!z4) {
                                    a4 = a5;
                                }
                                point2 = new Point(i15, a4);
                            }
                        } catch (rl0.C14471c unused) {
                        }
                    }
                    i9++;
                    length2 = i10;
                    iArr = iArr2;
                    i6 = i13;
                    f3 = f4;
                    i8 = i;
                }
                point2 = point;
                if (point2 != null) {
                    i2 = Math.max(i2, point2.x);
                    i3 = Math.max(i3, point2.y);
                    a3 = Math.max(a3, m32507a(ol02, format2.f29530j, i2, i3));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i2 + "x" + i3);
                }
            }
            aVar = new C12342a(i2, i3, a3);
        }
        this.f30338D0 = aVar;
        boolean z5 = this.f30335A0;
        int i16 = this.f30364d1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format2.f29535o);
        mediaFormat.setInteger("height", format2.f29536p);
        xl0.m44072a(mediaFormat, format2.f29532l);
        float f5 = format2.f29537q;
        if (f5 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f5);
        }
        xl0.m44071a(mediaFormat, "rotation-degrees", format2.f29538r);
        ColorInfo colorInfo = format2.f29542v;
        if (colorInfo != null) {
            xl0.m44071a(mediaFormat, "color-transfer", colorInfo.f30313d);
            xl0.m44071a(mediaFormat, "color-standard", colorInfo.f30311b);
            xl0.m44071a(mediaFormat, "color-range", colorInfo.f30312c);
            byte[] bArr = colorInfo.f30314e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format2.f29530j) && (a = rl0.m41607a(format)) != null) {
            xl0.m44071a(mediaFormat, Scopes.PROFILE, ((Integer) a.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f30375a);
        mediaFormat.setInteger("max-height", aVar.f30376b);
        xl0.m44071a(mediaFormat, "max-input-size", aVar.f30377c);
        int i17 = ih1.f34858a;
        if (i17 >= 23) {
            mediaFormat.setInteger("priority", 0);
            float f6 = f;
            if (f6 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f6);
            }
        }
        if (z5) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.f30341G0 == null) {
            C13479j9.m37708b(m32512b(ol0));
            if (this.f30342H0 == null) {
                this.f30342H0 = DummySurface.m32492a(this.f30370v0, ol02.f38265f);
            }
            this.f30341G0 = this.f30342H0;
        }
        MediaCodec mediaCodec3 = mediaCodec;
        mediaCodec3.configure(mediaFormat, this.f30341G0, mediaCrypto, 0);
        if (i17 >= 23 && this.f30363c1) {
            this.f30365e1 = new C12343b(mediaCodec3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo65430a(MediaCodec mediaCodec, ol0 ol0, Format format, Format format2) {
        if (!ol0.mo69201a(format, format2, true)) {
            return 0;
        }
        int i = format2.f29535o;
        C12342a aVar = this.f30338D0;
        if (i > aVar.f30375a || format2.f29536p > aVar.f30376b || m32506a(ol0, format2) > this.f30338D0.f30377c) {
            return 0;
        }
        return format.mo64772a(format2) ? 3 : 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo65429a(float f, Format format, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format2 : formatArr) {
            float f3 = format2.f29537q;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65439a(String str, long j, long j2) {
        this.f30372x0.mo65453a(str, j, j2);
        this.f30339E0 = mo65442a(str);
        ol0 H = mo69380H();
        H.getClass();
        boolean z = false;
        if (ih1.f34858a >= 29 && "video/x-vnd.on2.vp9".equals(H.f38261b)) {
            MediaCodecInfo.CodecProfileLevel[] a = H.mo69202a();
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (a[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f30340F0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65437a(q70 q70) throws k40 {
        super.mo65437a(q70);
        Format format = q70.f39018c;
        this.f30372x0.mo65451a(format);
        this.f30353S0 = format.f29539s;
        this.f30352R0 = format.f29538r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65435a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        this.f30354T0 = mediaFormat;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        m32510a(mediaCodec, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65438a(C14387qj qjVar) throws k40 {
        if (this.f30340F0) {
            ByteBuffer byteBuffer = qjVar.f39150g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    MediaCodec G = mo69379G();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    G.setParameters(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        if ((m32513e(r22) && r10 > 100000) != false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo65440a(long r26, long r28, android.media.MediaCodec r30, java.nio.ByteBuffer r31, int r32, int r33, long r34, boolean r36, boolean r37, com.yandex.mobile.ads.exo.Format r38) throws com.yandex.mobile.ads.impl.k40 {
        /*
            r25 = this;
            r7 = r25
            r0 = r26
            r8 = r30
            r9 = r32
            r2 = r34
            long r4 = r7.f30345K0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0017
            r7.f30345K0 = r0
        L_0x0017:
            long r4 = r7.f30367g1
            long r4 = r2 - r4
            r12 = 1
            if (r36 == 0) goto L_0x0024
            if (r37 != 0) goto L_0x0024
            r7.mo65443b(r8, r9)
            return r12
        L_0x0024:
            long r13 = r2 - r0
            android.view.Surface r6 = r7.f30341G0
            android.view.Surface r15 = r7.f30342H0
            r10 = 0
            if (r6 != r15) goto L_0x0038
            boolean r0 = m32513e(r13)
            if (r0 == 0) goto L_0x0037
            r7.mo65443b(r8, r9)
            return r12
        L_0x0037:
            return r10
        L_0x0038:
            long r18 = android.os.SystemClock.elapsedRealtime()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 * r20
            long r10 = r7.f30351Q0
            long r10 = r18 - r10
            int r6 = r25.mo64809b()
            r15 = 2
            r22 = r13
            if (r6 != r15) goto L_0x004f
            r6 = 1
            goto L_0x0050
        L_0x004f:
            r6 = 0
        L_0x0050:
            long r12 = r7.f30346L0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r24 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r24 != 0) goto L_0x007b
            long r12 = r7.f30367g1
            int r14 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x007b
            boolean r12 = r7.f30344J0
            if (r12 == 0) goto L_0x0079
            if (r6 == 0) goto L_0x007b
            boolean r12 = m32513e(r22)
            if (r12 == 0) goto L_0x0076
            r12 = 100000(0x186a0, double:4.94066E-319)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0076
            r10 = 1
            goto L_0x0077
        L_0x0076:
            r10 = 0
        L_0x0077:
            if (r10 == 0) goto L_0x007b
        L_0x0079:
            r10 = 1
            goto L_0x007c
        L_0x007b:
            r10 = 0
        L_0x007c:
            r11 = 21
            if (r10 == 0) goto L_0x009c
            long r12 = java.lang.System.nanoTime()
            android.media.MediaFormat r6 = r7.f30354T0
            r0 = r25
            r1 = r4
            r3 = r12
            r5 = r38
            r0.m32509a((long) r1, (long) r3, (com.yandex.mobile.ads.exo.Format) r5, (android.media.MediaFormat) r6)
            int r0 = com.yandex.mobile.ads.impl.ih1.f34858a
            if (r0 < r11) goto L_0x0097
            r7.mo65434a((android.media.MediaCodec) r8, (int) r9, (long) r12)
            goto L_0x009a
        L_0x0097:
            r7.mo65433a((android.media.MediaCodec) r8, (int) r9)
        L_0x009a:
            r0 = 1
            return r0
        L_0x009c:
            if (r6 == 0) goto L_0x0173
            long r12 = r7.f30345K0
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x00a6
            goto L_0x0173
        L_0x00a6:
            long r18 = r18 - r28
            long r13 = r22 - r18
            long r18 = java.lang.System.nanoTime()
            long r13 = r13 * r20
            long r13 = r18 + r13
            com.yandex.mobile.ads.impl.fm1 r6 = r7.f30371w0
            long r12 = r6.mo67035a(r2, r13)
            long r2 = r12 - r18
            long r2 = r2 / r20
            long r14 = r7.f30346L0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x00c9
            r6 = 1
            goto L_0x00ca
        L_0x00c9:
            r6 = 0
        L_0x00ca:
            r14 = -500000(0xfffffffffff85ee0, double:NaN)
            int r10 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d3
            r10 = 1
            goto L_0x00d4
        L_0x00d3:
            r10 = 0
        L_0x00d4:
            if (r10 == 0) goto L_0x00da
            if (r37 != 0) goto L_0x00da
            r10 = 1
            goto L_0x00db
        L_0x00da:
            r10 = 0
        L_0x00db:
            if (r10 == 0) goto L_0x0103
            int r0 = r25.mo64810b((long) r26)
            if (r0 != 0) goto L_0x00e5
            r0 = 0
            goto L_0x00ff
        L_0x00e5:
            com.yandex.mobile.ads.impl.pj r1 = r7.f38695t0
            int r10 = r1.f38629i
            r14 = 1
            int r10 = r10 + r14
            r1.f38629i = r10
            int r10 = r7.f30350P0
            int r10 = r10 + r0
            if (r6 == 0) goto L_0x00f8
            int r0 = r1.f38626f
            int r0 = r0 + r10
            r1.f38626f = r0
            goto L_0x00fb
        L_0x00f8:
            r7.mo65445c((int) r10)
        L_0x00fb:
            r25.mo69378E()
            r0 = 1
        L_0x00ff:
            if (r0 == 0) goto L_0x0103
            r0 = 0
            return r0
        L_0x0103:
            boolean r0 = m32513e(r2)
            if (r0 == 0) goto L_0x010d
            if (r37 != 0) goto L_0x010d
            r0 = 1
            goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            if (r0 == 0) goto L_0x0128
            if (r6 == 0) goto L_0x0117
            r7.mo65443b(r8, r9)
            r0 = 1
            goto L_0x0127
        L_0x0117:
            java.lang.String r0 = "dropVideoBuffer"
            com.yandex.mobile.ads.impl.he1.m36941a(r0)
            r0 = 0
            r8.releaseOutputBuffer(r9, r0)
            com.yandex.mobile.ads.impl.he1.m36940a()
            r0 = 1
            r7.mo65445c((int) r0)
        L_0x0127:
            return r0
        L_0x0128:
            int r0 = com.yandex.mobile.ads.impl.ih1.f34858a
            if (r0 < r11) goto L_0x0143
            r0 = 50000(0xc350, double:2.47033E-319)
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0171
            android.media.MediaFormat r6 = r7.f30354T0
            r0 = r25
            r1 = r4
            r3 = r12
            r5 = r38
            r0.m32509a((long) r1, (long) r3, (com.yandex.mobile.ads.exo.Format) r5, (android.media.MediaFormat) r6)
            r7.mo65434a((android.media.MediaCodec) r8, (int) r9, (long) r12)
            r0 = 1
            return r0
        L_0x0143:
            r0 = 30000(0x7530, double:1.4822E-319)
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0171
            r0 = 11000(0x2af8, double:5.4347E-320)
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0161
            r0 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 - r0
            long r2 = r2 / r20
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x0158 }
            goto L_0x0161
        L_0x0158:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r0 = 0
            return r0
        L_0x0161:
            android.media.MediaFormat r6 = r7.f30354T0
            r0 = r25
            r1 = r4
            r3 = r12
            r5 = r38
            r0.m32509a((long) r1, (long) r3, (com.yandex.mobile.ads.exo.Format) r5, (android.media.MediaFormat) r6)
            r7.mo65433a((android.media.MediaCodec) r8, (int) r9)
            r0 = 1
            return r0
        L_0x0171:
            r0 = 0
            return r0
        L_0x0173:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.video.C12341c.mo65440a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, boolean, com.yandex.mobile.ads.exo.Format):boolean");
    }

    /* renamed from: a */
    private void m32510a(MediaCodec mediaCodec, int i, int i2) {
        this.f30355U0 = i;
        this.f30356V0 = i2;
        float f = this.f30353S0;
        this.f30358X0 = f;
        if (ih1.f34858a >= 21) {
            int i3 = this.f30352R0;
            if (i3 == 90 || i3 == 270) {
                this.f30355U0 = i2;
                this.f30356V0 = i;
                this.f30358X0 = 1.0f / f;
            }
        } else {
            this.f30357W0 = this.f30352R0;
        }
        mediaCodec.setVideoScalingMode(this.f30343I0);
    }

    /* renamed from: a */
    private void m32509a(long j, long j2, Format format, MediaFormat mediaFormat) {
        em1 em1 = this.f30369i1;
        if (em1 != null) {
            em1.mo66846a(j, j2, format, mediaFormat);
        }
    }

    /* renamed from: a */
    static void m32511a(C12341c cVar) {
        cVar.mo69382P();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65433a(MediaCodec mediaCodec, int i) {
        m32503X();
        he1.m36941a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        he1.m36940a();
        this.f30351Q0 = SystemClock.elapsedRealtime() * 1000;
        this.f38695t0.f38625e++;
        this.f30349O0 = 0;
        mo65428W();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65434a(MediaCodec mediaCodec, int i, long j) {
        m32503X();
        he1.m36941a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        he1.m36940a();
        this.f30351Q0 = SystemClock.elapsedRealtime() * 1000;
        this.f38695t0.f38625e++;
        this.f30349O0 = 0;
        mo65428W();
    }

    /* renamed from: a */
    private static int m32506a(ol0 ol0, Format format) {
        if (format.f29531k == -1) {
            return m32507a(ol0, format.f29530j, format.f29535o, format.f29536p);
        }
        int size = format.f29532l.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += format.f29532l.get(i2).length;
        }
        return format.f29531k + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r8.f38265f != false) goto L_0x00dc;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m32507a(com.yandex.mobile.ads.impl.ol0 r8, java.lang.String r9, int r10, int r11) {
        /*
            r0 = -1
            if (r10 == r0) goto L_0x00e9
            if (r11 != r0) goto L_0x0007
            goto L_0x00e9
        L_0x0007:
            r9.getClass()
            int r1 = r9.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 0
            r7 = 2
            switch(r1) {
                case -1664118616: goto L_0x004f;
                case -1662541442: goto L_0x0044;
                case 1187890754: goto L_0x0039;
                case 1331836730: goto L_0x002e;
                case 1599127256: goto L_0x0023;
                case 1599127257: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x005a
        L_0x0018:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0021
            goto L_0x005a
        L_0x0021:
            r9 = 5
            goto L_0x005b
        L_0x0023:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x002c
            goto L_0x005a
        L_0x002c:
            r9 = 4
            goto L_0x005b
        L_0x002e:
            java.lang.String r1 = "video/avc"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0037
            goto L_0x005a
        L_0x0037:
            r9 = 3
            goto L_0x005b
        L_0x0039:
            java.lang.String r1 = "video/mp4v-es"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0042
            goto L_0x005a
        L_0x0042:
            r9 = 2
            goto L_0x005b
        L_0x0044:
            java.lang.String r1 = "video/hevc"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            r9 = 1
            goto L_0x005b
        L_0x004f:
            java.lang.String r1 = "video/3gpp"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r9 = 0
            goto L_0x005b
        L_0x005a:
            r9 = -1
        L_0x005b:
            if (r9 == 0) goto L_0x00e0
            if (r9 == r3) goto L_0x00dd
            if (r9 == r7) goto L_0x00e0
            if (r9 == r5) goto L_0x0068
            if (r9 == r4) goto L_0x00e0
            if (r9 == r2) goto L_0x00dd
            return r0
        L_0x0068:
            com.yandex.mobile.ads.impl.x11 r9 = com.yandex.mobile.ads.impl.x11.f42358a
            java.lang.String r1 = "QlJBVklBIDRLIDIwMTU="
            byte[] r1 = android.util.Base64.decode(r1, r6)
            java.lang.String r2 = "decode(\"QlJBVklBIDRLIDIwMTU=\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r1, r3)
            java.lang.String r1 = com.yandex.mobile.ads.impl.ih1.f34861d
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00dc
            com.yandex.mobile.ads.impl.rk0 r9 = r9.mo70789b()
            com.yandex.mobile.ads.impl.sk0 r9 = (com.yandex.mobile.ads.impl.sk0) r9
            java.lang.String r9 = r9.mo70005a()
            java.lang.String r2 = com.yandex.mobile.ads.impl.ih1.f34860c
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x00cb
            java.lang.String r9 = "S0ZTT1dJ"
            byte[] r9 = android.util.Base64.decode(r9, r6)
            java.lang.String r2 = "decode(\"S0ZTT1dJ\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r9, r3)
            boolean r9 = r2.equals(r1)
            if (r9 != 0) goto L_0x00dc
            java.lang.String r9 = "QUZUUw=="
            byte[] r9 = android.util.Base64.decode(r9, r6)
            java.lang.String r2 = "decode(\"QUZUUw==\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
            r2.<init>(r9, r3)
            boolean r9 = r2.equals(r1)
            if (r9 == 0) goto L_0x00cb
            boolean r8 = r8.f38265f
            if (r8 == 0) goto L_0x00cb
            goto L_0x00dc
        L_0x00cb:
            r8 = 16
            int r9 = com.yandex.mobile.ads.impl.ih1.m37366a((int) r10, (int) r8)
            int r10 = com.yandex.mobile.ads.impl.ih1.m37366a((int) r11, (int) r8)
            int r9 = r9 * r10
            int r9 = r9 * 16
            int r9 = r9 * 16
            goto L_0x00e2
        L_0x00dc:
            return r0
        L_0x00dd:
            int r9 = r10 * r11
            goto L_0x00e3
        L_0x00e0:
            int r9 = r10 * r11
        L_0x00e2:
            r4 = 2
        L_0x00e3:
            int r9 = r9 * 3
            int r4 = r4 * 2
            int r9 = r9 / r4
            return r9
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.video.C12341c.m32507a(com.yandex.mobile.ads.impl.ol0, java.lang.String, int, int):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo65442a(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C12341c.class) {
            if (!f30333k1) {
                x11 x11 = x11.f42358a;
                String P0 = ((C13991ml) x11.mo70788a()).mo68742P0();
                String str2 = ih1.f34859b;
                if (P0.equals(str2)) {
                    f30334l1 = true;
                } else {
                    int i = ih1.f34858a;
                    if (i <= 27 && ((C13991ml) x11.mo70788a()).mo68751U().equals(str2)) {
                        f30334l1 = true;
                    } else if (i < 27) {
                        if (((C13991ml) x11.mo70788a()).mo68763a().equals(str2) || ((C13991ml) x11.mo70788a()).mo68766b().equals(str2) || ((C13991ml) x11.mo70788a()).mo68769c().equals(str2) || ((C13991ml) x11.mo70788a()).mo68772d().equals(str2) || ((C13991ml) x11.mo70788a()).mo68775e().equals(str2) || ((C13991ml) x11.mo70788a()).mo68778f().equals(str2) || ((C13991ml) x11.mo70788a()).mo68781g().equals(str2) || ((C13991ml) x11.mo70788a()).mo68784h().equals(str2) || ((C13991ml) x11.mo70788a()).mo68787i().equals(str2) || ((C13991ml) x11.mo70788a()).mo68790j().equals(str2) || ((C13991ml) x11.mo70788a()).mo68793k().equals(str2) || ((C13991ml) x11.mo70788a()).mo68799m().equals(str2) || ((C13991ml) x11.mo70788a()).mo68796l().equals(str2) || ((C13991ml) x11.mo70788a()).mo68802n().equals(str2) || ((C13991ml) x11.mo70788a()).mo68805o().equals(str2) || ((C13991ml) x11.mo70788a()).mo68808p().equals(str2) || ((C13991ml) x11.mo70788a()).mo68811q().equals(str2) || ((C13991ml) x11.mo70788a()).mo68814r().equals(str2) || ((C13991ml) x11.mo70788a()).mo68826v().equals(str2) || ((C13991ml) x11.mo70788a()).mo68817s().equals(str2) || ((C13991ml) x11.mo70788a()).mo68820t().equals(str2) || ((C13991ml) x11.mo70788a()).mo68823u().equals(str2) || ((C13991ml) x11.mo70788a()).mo68738N0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68740O0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68744Q0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68829w().equals(str2) || ((C13991ml) x11.mo70788a()).mo68832x().equals(str2) || ((C13991ml) x11.mo70788a()).mo68835y().equals(str2) || ((C13991ml) x11.mo70788a()).mo68837z().equals(str2) || ((C13991ml) x11.mo70788a()).mo68711A().equals(str2) || ((C13991ml) x11.mo70788a()).mo68713B().equals(str2) || ((C13991ml) x11.mo70788a()).mo68715C().equals(str2) || ((C13991ml) x11.mo70788a()).mo68717D().equals(str2) || ((C13991ml) x11.mo70788a()).mo68719E().equals(str2) || ((C13991ml) x11.mo70788a()).mo68721F().equals(str2) || ((C13991ml) x11.mo70788a()).mo68723G().equals(str2) || ((C13991ml) x11.mo70788a()).mo68725H().equals(str2) || ((C13991ml) x11.mo70788a()).mo68727I().equals(str2) || ((C13991ml) x11.mo70788a()).mo68746R0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68748S0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68743Q().equals(str2) || ((C13991ml) x11.mo70788a()).mo68745R().equals(str2) || ((C13991ml) x11.mo70788a()).mo68745R().equals(str2) || ((C13991ml) x11.mo70788a()).mo68729J().equals(str2) || ((C13991ml) x11.mo70788a()).mo68731K().equals(str2) || ((C13991ml) x11.mo70788a()).mo68733L().equals(str2) || ((C13991ml) x11.mo70788a()).mo68735M().equals(str2) || ((C13991ml) x11.mo70788a()).mo68737N().equals(str2) || ((C13991ml) x11.mo70788a()).mo68739O().equals(str2) || ((C13991ml) x11.mo70788a()).mo68741P().equals(str2) || ((C13991ml) x11.mo70788a()).mo68750T0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68752U0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68754V0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68747S().equals(str2) || ((C13991ml) x11.mo70788a()).mo68749T().equals(str2) || ((C13991ml) x11.mo70788a()).mo68753V().equals(str2) || ((C13991ml) x11.mo70788a()).mo68755W().equals(str2) || ((C13991ml) x11.mo70788a()).mo68756W0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68758X0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68757X().equals(str2) || ((C13991ml) x11.mo70788a()).mo68760Y0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68762Z0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68765a1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68759Y().equals(str2) || ((C13991ml) x11.mo70788a()).mo68761Z().equals(str2) || ((C13991ml) x11.mo70788a()).mo68768b1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68771c1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68774d1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68764a0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68767b0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68777e1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68780f1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68770c0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68783g1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68786h1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68773d0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68789i1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68792j1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68776e0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68779f0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68782g0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68795k1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68785h0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68788i0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68798l1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68801m1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68804n1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68807o1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68791j0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68794k0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68797l0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68800m0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68809p0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68812q0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68815r0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68803n0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68806o0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68818s0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68821t0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68824u0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68827v0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68830w0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68833x0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68836y0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68813q1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68712A0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68838z0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68810p1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68816r1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68714B0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68716C0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68718D0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68720E0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68819s1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68722F0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68724G0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68726H0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68822t1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68825u1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68828v1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68831w1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68834x1().equals(str2) || ((C13991ml) x11.mo70788a()).mo68728I0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68730J0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68732K0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68734L0().equals(str2) || ((C13991ml) x11.mo70788a()).mo68736M0().equals(str2)) {
                            f30334l1 = true;
                        }
                        String a = ((oo0) x11.mo70790c()).mo69239a();
                        String str3 = ih1.f34861d;
                        if (a.equals(str3) || ((oo0) x11.mo70790c()).mo69240b().equals(str3) || ((oo0) x11.mo70790c()).mo69241c().equals(str3)) {
                            f30334l1 = true;
                        }
                    }
                }
                f30333k1 = true;
            }
        }
        return f30334l1;
    }
}
