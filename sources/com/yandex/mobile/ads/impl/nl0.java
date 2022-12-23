package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.impl.C13296ha;
import com.yandex.mobile.ads.impl.C13397ia;
import com.yandex.mobile.ads.impl.rl0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class nl0 extends pl0 implements ml0 {

    /* renamed from: A0 */
    private boolean f37830A0;

    /* renamed from: B0 */
    private boolean f37831B0;

    /* renamed from: C0 */
    private boolean f37832C0;

    /* renamed from: D0 */
    private MediaFormat f37833D0;

    /* renamed from: E0 */
    private Format f37834E0;

    /* renamed from: F0 */
    private long f37835F0;

    /* renamed from: G0 */
    private boolean f37836G0;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public boolean f37837H0;

    /* renamed from: I0 */
    private long f37838I0 = -9223372036854775807L;

    /* renamed from: J0 */
    private int f37839J0;

    /* renamed from: v0 */
    private final Context f37840v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public final C13296ha.C13297a f37841w0;

    /* renamed from: x0 */
    private final C13397ia f37842x0;

    /* renamed from: y0 */
    private final long[] f37843y0 = new long[10];

    /* renamed from: z0 */
    private int f37844z0;

    /* renamed from: com.yandex.mobile.ads.impl.nl0$b */
    private final class C14106b implements C13397ia.C13400c {
        private C14106b() {
        }
    }

    @Deprecated
    public nl0(Context context, ql0 ql0, C12188d<s70> dVar, boolean z, boolean z2, Handler handler, C13296ha haVar, C13397ia iaVar) {
        super(1, ql0, dVar, z, z2, 44100.0f);
        this.f37840v0 = context.getApplicationContext();
        this.f37842x0 = iaVar;
        this.f37841w0 = new C13296ha.C13297a(handler, haVar);
        ((C15319zj) iaVar).mo71228a((C13397ia.C13400c) new C14106b());
    }

    /* renamed from: S */
    private void m40058S() {
        long a = ((C15319zj) this.f37842x0).mo71222a(mo65007e());
        if (a != Long.MIN_VALUE) {
            if (!this.f37837H0) {
                a = Math.max(this.f37835F0, a);
            }
            this.f37835F0 = a;
            this.f37837H0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo69044M() throws k40 {
        try {
            ((C15319zj) this.f37842x0).mo71240n();
        } catch (C13397ia.C13401d e) {
            throw mo64798a((Exception) e, this.f37834E0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65444b(C14387qj qjVar) {
        if (this.f37836G0 && !qjVar.mo71018d()) {
            if (Math.abs(qjVar.f39149f - this.f37835F0) > 500000) {
                this.f37835F0 = qjVar.f39149f;
            }
            this.f37836G0 = false;
        }
        this.f37838I0 = Math.max(qjVar.f39149f, this.f37838I0);
    }

    /* renamed from: c */
    public boolean mo65006c() {
        return ((C15319zj) this.f37842x0).mo71236h() || super.mo65006c();
    }

    /* renamed from: e */
    public boolean mo65007e() {
        return super.mo65007e() && ((C15319zj) this.f37842x0).mo71237i();
    }

    /* renamed from: m */
    public sz0 mo64869m() {
        return ((C15319zj) this.f37842x0).mo71234e();
    }

    /* renamed from: n */
    public ml0 mo64819n() {
        return this;
    }

    /* renamed from: r */
    public long mo64870r() {
        if (mo64809b() == 2) {
            m40058S();
        }
        return this.f37835F0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo64827w() {
        try {
            this.f37838I0 = -9223372036854775807L;
            this.f37839J0 = 0;
            ((C15319zj) this.f37842x0).mo71233c();
            try {
                super.mo64827w();
            } finally {
                this.f37841w0.mo67501a(this.f38695t0);
            }
        } catch (Throwable th) {
            super.mo64827w();
            throw th;
        } finally {
            this.f37841w0.mo67501a(this.f38695t0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo64828x() {
        try {
            super.mo64828x();
        } finally {
            ((C15319zj) this.f37842x0).mo71241o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo64829y() {
        ((C15319zj) this.f37842x0).mo71239l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo64830z() {
        m40058S();
        ((C15319zj) this.f37842x0).mo71238k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo65446c(long j) {
        while (this.f37839J0 != 0 && j >= this.f37843y0[0]) {
            ((C15319zj) this.f37842x0).mo71235g();
            int i = this.f37839J0 - 1;
            this.f37839J0 = i;
            long[] jArr = this.f37843y0;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        if (((com.yandex.mobile.ads.impl.C15319zj) r6.f37842x0).mo71231a(r9.f29543w, r9.f29545y) != false) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo65431a(com.yandex.mobile.ads.impl.ql0 r7, com.yandex.mobile.ads.exo.drm.C12188d<com.yandex.mobile.ads.impl.s70> r8, com.yandex.mobile.ads.exo.Format r9) throws com.yandex.mobile.ads.impl.rl0.C14471c {
        /*
            r6 = this;
            java.lang.String r0 = r9.f29530j
            boolean r1 = com.yandex.mobile.ads.impl.wn0.m43728e(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000e
            int r7 = com.yandex.mobile.ads.exo.C12178d.m31711b((int) r2)
            return r7
        L_0x000e:
            int r1 = com.yandex.mobile.ads.impl.ih1.f34858a
            r3 = 21
            if (r1 < r3) goto L_0x0017
            r1 = 32
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            com.yandex.mobile.ads.exo.drm.DrmInitData r3 = r9.f29533m
            r4 = 1
            if (r3 == 0) goto L_0x0036
            java.lang.Class<? extends com.yandex.mobile.ads.impl.j40> r3 = r9.f29520D
            java.lang.Class<com.yandex.mobile.ads.impl.s70> r5 = com.yandex.mobile.ads.impl.s70.class
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0036
            java.lang.Class<? extends com.yandex.mobile.ads.impl.j40> r3 = r9.f29520D
            if (r3 != 0) goto L_0x0034
            com.yandex.mobile.ads.exo.drm.DrmInitData r3 = r9.f29533m
            boolean r8 = com.yandex.mobile.ads.exo.C12178d.m31710a((com.yandex.mobile.ads.exo.drm.C12188d<?>) r8, (com.yandex.mobile.ads.exo.drm.DrmInitData) r3)
            if (r8 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r8 = 0
            goto L_0x0037
        L_0x0036:
            r8 = 1
        L_0x0037:
            if (r8 == 0) goto L_0x004f
            int r3 = r9.f29543w
            int r3 = r6.mo69045a((int) r3, (java.lang.String) r0)
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r3 == 0) goto L_0x004f
            com.yandex.mobile.ads.impl.ol0 r3 = r7.mo69619a()
            if (r3 == 0) goto L_0x004f
            r7 = r1 | 12
            return r7
        L_0x004f:
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0065
            com.yandex.mobile.ads.impl.ia r0 = r6.f37842x0
            int r3 = r9.f29543w
            int r5 = r9.f29545y
            com.yandex.mobile.ads.impl.zj r0 = (com.yandex.mobile.ads.impl.C15319zj) r0
            boolean r0 = r0.mo71231a((int) r3, (int) r5)
            if (r0 == 0) goto L_0x0072
        L_0x0065:
            com.yandex.mobile.ads.impl.ia r0 = r6.f37842x0
            int r3 = r9.f29543w
            com.yandex.mobile.ads.impl.zj r0 = (com.yandex.mobile.ads.impl.C15319zj) r0
            r5 = 2
            boolean r0 = r0.mo71231a((int) r3, (int) r5)
            if (r0 != 0) goto L_0x0077
        L_0x0072:
            int r7 = com.yandex.mobile.ads.exo.C12178d.m31711b((int) r4)
            return r7
        L_0x0077:
            java.util.List r7 = r6.mo65432a((com.yandex.mobile.ads.impl.ql0) r7, (com.yandex.mobile.ads.exo.Format) r9, (boolean) r2)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0086
            int r7 = com.yandex.mobile.ads.exo.C12178d.m31711b((int) r4)
            return r7
        L_0x0086:
            if (r8 != 0) goto L_0x008d
            int r7 = com.yandex.mobile.ads.exo.C12178d.m31711b((int) r5)
            return r7
        L_0x008d:
            java.lang.Object r7 = r7.get(r2)
            com.yandex.mobile.ads.impl.ol0 r7 = (com.yandex.mobile.ads.impl.ol0) r7
            boolean r8 = r7.mo69200a((com.yandex.mobile.ads.exo.Format) r9)
            if (r8 == 0) goto L_0x00a2
            boolean r7 = r7.mo69203b((com.yandex.mobile.ads.exo.Format) r9)
            if (r7 == 0) goto L_0x00a2
            r7 = 16
            goto L_0x00a4
        L_0x00a2:
            r7 = 8
        L_0x00a4:
            if (r8 == 0) goto L_0x00a8
            r8 = 4
            goto L_0x00a9
        L_0x00a8:
            r8 = 3
        L_0x00a9:
            r7 = r7 | r8
            r7 = r7 | r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nl0.mo65431a(com.yandex.mobile.ads.impl.ql0, com.yandex.mobile.ads.exo.drm.d, com.yandex.mobile.ads.exo.Format):int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<ol0> mo65432a(ql0 ql0, Format format, boolean z) throws rl0.C14471c {
        ol0 a;
        String str = format.f29530j;
        if (str == null) {
            return Collections.emptyList();
        }
        if ((mo69045a(format.f29543w, str) != 0) && (a = ql0.mo69619a()) != null) {
            return Collections.singletonList(a);
        }
        List<ol0> a2 = rl0.m41611a(ql0.mo69620a(str, z, false), format);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(a2);
            arrayList.addAll(ql0.mo69620a("audio/eac3", z, false));
            a2 = arrayList;
        }
        return Collections.unmodifiableList(a2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
        if (r0.startsWith(new java.lang.String(r2, kotlin.text.Charsets.UTF_8)) != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014c, code lost:
        if (r0.startsWith(new java.lang.String(r2, kotlin.text.Charsets.UTF_8)) != false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c3, code lost:
        if (new java.lang.String(r0, kotlin.text.Charsets.UTF_8).equals(r9) != false) goto L_0x01c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65436a(com.yandex.mobile.ads.impl.ol0 r9, android.media.MediaCodec r10, com.yandex.mobile.ads.exo.Format r11, android.media.MediaCrypto r12, float r13) {
        /*
            r8 = this;
            com.yandex.mobile.ads.exo.Format[] r0 = r8.mo64825u()
            int r1 = r8.m40059a((com.yandex.mobile.ads.impl.ol0) r9, (com.yandex.mobile.ads.exo.Format) r11)
            int r2 = r0.length
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x000e
            goto L_0x0025
        L_0x000e:
            int r2 = r0.length
            r5 = 0
        L_0x0010:
            if (r5 >= r2) goto L_0x0025
            r6 = r0[r5]
            boolean r7 = r9.mo69201a((com.yandex.mobile.ads.exo.Format) r11, (com.yandex.mobile.ads.exo.Format) r6, (boolean) r4)
            if (r7 == 0) goto L_0x0022
            int r6 = r8.m40059a((com.yandex.mobile.ads.impl.ol0) r9, (com.yandex.mobile.ads.exo.Format) r6)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0022:
            int r5 = r5 + 1
            goto L_0x0010
        L_0x0025:
            r8.f37844z0 = r1
            java.lang.String r0 = r9.f38260a
            int r1 = com.yandex.mobile.ads.impl.ih1.f34858a
            r2 = 24
            if (r1 >= r2) goto L_0x0097
            java.lang.String r2 = "OMX.SEC.aac.dec"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0097
            com.yandex.mobile.ads.impl.x11 r0 = com.yandex.mobile.ads.impl.x11.f42358a
            com.yandex.mobile.ads.impl.rk0 r0 = r0.mo70789b()
            com.yandex.mobile.ads.impl.sk0 r0 = (com.yandex.mobile.ads.impl.sk0) r0
            java.lang.String r0 = r0.mo70006b()
            java.lang.String r2 = com.yandex.mobile.ads.impl.ih1.f34860c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = com.yandex.mobile.ads.impl.ih1.f34859b
            java.lang.String r2 = "emVyb2ZsdGU="
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r5 = "decode(\"emVyb2ZsdGU=\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r2 = r0.startsWith(r5)
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = "aGVyb2x0ZQ=="
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r5 = "decode(\"aGVyb2x0ZQ==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r2 = r0.startsWith(r5)
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = "aGVyb3FsdGU="
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r5 = "decode(\"aGVyb3FsdGU=\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x0097
        L_0x0095:
            r0 = 1
            goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            r8.f37831B0 = r0
            java.lang.String r0 = r9.f38260a
            r2 = 21
            if (r1 >= r2) goto L_0x0150
            java.lang.String r2 = "OMX.SEC.mp3.dec"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0150
            com.yandex.mobile.ads.impl.x11 r0 = com.yandex.mobile.ads.impl.x11.f42358a
            com.yandex.mobile.ads.impl.rk0 r0 = r0.mo70789b()
            com.yandex.mobile.ads.impl.sk0 r0 = (com.yandex.mobile.ads.impl.sk0) r0
            java.lang.String r0 = r0.mo70006b()
            java.lang.String r2 = com.yandex.mobile.ads.impl.ih1.f34860c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0150
            java.lang.String r0 = com.yandex.mobile.ads.impl.ih1.f34859b
            java.lang.String r2 = "YmFmZmlu"
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r5 = "decode(\"YmFmZmlu\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r2 = r0.startsWith(r5)
            if (r2 != 0) goto L_0x014e
            java.lang.String r2 = "Z3JhbmQ="
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r5 = "decode(\"Z3JhbmQ=\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r2 = r0.startsWith(r5)
            if (r2 != 0) goto L_0x014e
            java.lang.String r2 = "Zm9ydHVuYQ=="
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r5 = "decode(\"Zm9ydHVuYQ==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r2 = r0.startsWith(r5)
            if (r2 != 0) goto L_0x014e
            java.lang.String r2 = "Z3ByaW1lbHRl"
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r5 = "decode(\"Z3ByaW1lbHRl\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r2 = r0.startsWith(r5)
            if (r2 != 0) goto L_0x014e
            java.lang.String r2 = "ajJ5MThsdGU="
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r5 = "decode(\"ajJ5MThsdGU=\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r2 = r0.startsWith(r5)
            if (r2 != 0) goto L_0x014e
            java.lang.String r2 = "bXMwMQ=="
            byte[] r2 = android.util.Base64.decode(r2, r4)
            java.lang.String r5 = "decode(\"bXMwMQ==\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r5.<init>(r2, r6)
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x0150
        L_0x014e:
            r0 = 1
            goto L_0x0151
        L_0x0150:
            r0 = 0
        L_0x0151:
            r8.f37832C0 = r0
            boolean r0 = r9.f38266g
            r8.f37830A0 = r0
            if (r0 == 0) goto L_0x015c
            java.lang.String r9 = "audio/raw"
            goto L_0x015e
        L_0x015c:
            java.lang.String r9 = r9.f38262c
        L_0x015e:
            int r0 = r8.f37844z0
            android.media.MediaFormat r2 = new android.media.MediaFormat
            r2.<init>()
            java.lang.String r5 = "mime"
            r2.setString(r5, r9)
            int r9 = r11.f29543w
            java.lang.String r6 = "channel-count"
            r2.setInteger(r6, r9)
            int r9 = r11.f29544x
            java.lang.String r6 = "sample-rate"
            r2.setInteger(r6, r9)
            java.util.List<byte[]> r9 = r11.f29532l
            com.yandex.mobile.ads.impl.xl0.m44072a(r2, r9)
            java.lang.String r9 = "max-input-size"
            com.yandex.mobile.ads.impl.xl0.m44071a(r2, r9, r0)
            r9 = 23
            if (r1 < r9) goto L_0x01cf
            java.lang.String r0 = "priority"
            r2.setInteger(r0, r4)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01cf
            if (r1 != r9) goto L_0x01c7
            java.lang.String r9 = "WlRFIEIyMDE3Rw=="
            byte[] r9 = android.util.Base64.decode(r9, r4)
            java.lang.String r0 = "decode(\"WlRFIEIyMDE3Rw==\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r6 = kotlin.text.Charsets.UTF_8
            r0.<init>(r9, r6)
            java.lang.String r9 = com.yandex.mobile.ads.impl.ih1.f34861d
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01c5
            java.lang.String r0 = "QVhPTiA3IG1pbmk="
            byte[] r0 = android.util.Base64.decode(r0, r4)
            java.lang.String r6 = "decode(\"QVhPTiA3IG1pbmk=\",\n      Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8
            r6.<init>(r0, r7)
            boolean r9 = r6.equals(r9)
            if (r9 == 0) goto L_0x01c7
        L_0x01c5:
            r9 = 1
            goto L_0x01c8
        L_0x01c7:
            r9 = 0
        L_0x01c8:
            if (r9 != 0) goto L_0x01cf
            java.lang.String r9 = "operating-rate"
            r2.setFloat(r9, r13)
        L_0x01cf:
            r9 = 28
            if (r1 > r9) goto L_0x01e2
            java.lang.String r9 = r11.f29530j
            java.lang.String r13 = "audio/ac4"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01e2
            java.lang.String r9 = "ac4-is-sync"
            r2.setInteger(r9, r3)
        L_0x01e2:
            r9 = 0
            r10.configure(r2, r9, r12, r4)
            boolean r10 = r8.f37830A0
            if (r10 == 0) goto L_0x01f2
            r8.f37833D0 = r2
            java.lang.String r9 = r11.f29530j
            r2.setString(r5, r9)
            goto L_0x01f4
        L_0x01f2:
            r8.f37833D0 = r9
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nl0.mo65436a(com.yandex.mobile.ads.impl.ol0, android.media.MediaCodec, com.yandex.mobile.ads.exo.Format, android.media.MediaCrypto, float):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo65430a(MediaCodec mediaCodec, ol0 ol0, Format format, Format format2) {
        if (m40059a(ol0, format2) <= this.f37844z0 && format.f29546z == 0 && format.f29517A == 0 && format2.f29546z == 0 && format2.f29517A == 0) {
            if (ol0.mo69201a(format, format2, true)) {
                return 3;
            }
            if (ih1.m37382a((Object) format.f29530j, (Object) format2.f29530j) && format.f29543w == format2.f29543w && format.f29544x == format2.f29544x && format.f29545y == format2.f29545y && format.mo64772a(format2) && !"audio/opus".equals(format.f29530j)) {
                return 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo65429a(float f, Format format, Format[] formatArr) {
        int i = -1;
        for (Format format2 : formatArr) {
            int i2 = format2.f29544x;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65439a(String str, long j, long j2) {
        this.f37841w0.mo67502a(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65437a(q70 q70) throws k40 {
        super.mo65437a(q70);
        Format format = q70.f39018c;
        this.f37834E0 = format;
        this.f37841w0.mo67500a(format);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65435a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws k40 {
        int i;
        int[] iArr;
        int i2;
        int i3;
        MediaFormat mediaFormat2 = this.f37833D0;
        if (mediaFormat2 != null) {
            i = mo69045a(mediaFormat2.getInteger("channel-count"), mediaFormat2.getString("mime"));
            mediaFormat = mediaFormat2;
        } else {
            if (mediaFormat.containsKey("v-bits-per-sample")) {
                i3 = ih1.m37365a(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                Format format = this.f37834E0;
                if ("audio/raw".equals(format.f29530j)) {
                    i3 = format.f29545y;
                } else {
                    i = 2;
                }
            }
            i = i3;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f37831B0 || integer != 6 || (i2 = this.f37834E0.f29543w) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i2];
            for (int i4 = 0; i4 < this.f37834E0.f29543w; i4++) {
                iArr[i4] = i4;
            }
        }
        int[] iArr2 = iArr;
        try {
            C13397ia iaVar = this.f37842x0;
            Format format2 = this.f37834E0;
            ((C15319zj) iaVar).mo71226a(i, integer, integer2, 0, iArr2, format2.f29546z, format2.f29517A);
        } catch (C13397ia.C13398a e) {
            throw mo64798a((Exception) e, this.f37834E0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo69045a(int i, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (((C15319zj) this.f37842x0).mo71231a(-1, 18)) {
                return wn0.m43723a("audio/eac3-joc");
            }
            str = "audio/eac3";
        }
        int a = wn0.m43723a(str);
        if (((C15319zj) this.f37842x0).mo71231a(i, a)) {
            return a;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64806a(boolean z) throws k40 {
        super.mo64806a(z);
        this.f37841w0.mo67503b(this.f38695t0);
        int i = mo64823s().f40562a;
        if (i != 0) {
            ((C15319zj) this.f37842x0).mo71225a(i);
        } else {
            ((C15319zj) this.f37842x0).mo71223a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64807a(Format[] formatArr, long j) throws k40 {
        if (this.f37838I0 != -9223372036854775807L) {
            int i = this.f37839J0;
            if (i == this.f37843y0.length) {
                Log.w("MediaCodecAudioRenderer", "Too many stream changes, so dropping change at " + this.f37843y0[this.f37839J0 - 1]);
            } else {
                this.f37839J0 = i + 1;
            }
            this.f37843y0[this.f37839J0 - 1] = this.f37838I0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64804a(long j, boolean z) throws k40 {
        super.mo64804a(j, z);
        ((C15319zj) this.f37842x0).mo71233c();
        this.f37835F0 = j;
        this.f37836G0 = true;
        this.f37837H0 = true;
        this.f37838I0 = -9223372036854775807L;
        this.f37839J0 = 0;
    }

    /* renamed from: a */
    public void mo64866a(sz0 sz0) {
        ((C15319zj) this.f37842x0).mo71229a(sz0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo65440a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, Format format) throws k40 {
        if (this.f37832C0 && j3 == 0 && (i2 & 4) != 0) {
            long j4 = this.f37838I0;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
        }
        if (this.f37830A0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f38695t0.f38626f++;
            ((C15319zj) this.f37842x0).mo71235g();
            return true;
        } else {
            try {
                if (!((C15319zj) this.f37842x0).mo71232a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.f38695t0.f38625e++;
                return true;
            } catch (C13397ia.C13399b | C13397ia.C13401d e) {
                throw mo64798a(e, this.f37834E0);
            }
        }
    }

    /* renamed from: a */
    public void mo64802a(int i, Object obj) throws k40 {
        if (i == 2) {
            ((C15319zj) this.f37842x0).mo71224a(((Float) obj).floatValue());
        } else if (i == 3) {
            ((C15319zj) this.f37842x0).mo71227a((C12864da) obj);
        } else if (i == 5) {
            ((C15319zj) this.f37842x0).mo71230a((C14877va) obj);
        }
    }

    /* renamed from: a */
    private int m40059a(ol0 ol0, Format format) {
        int i;
        if (!"OMX.google.raw.decoder".equals(ol0.f38260a) || (i = ih1.f34858a) >= 24 || (i == 23 && ih1.m37397d(this.f37840v0))) {
            return format.f29531k;
        }
        return -1;
    }
}
