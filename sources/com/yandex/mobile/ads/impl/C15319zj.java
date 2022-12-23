package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.yandex.mobile.ads.impl.C13397ia;
import com.yandex.mobile.ads.impl.C13839la;
import com.yandex.mobile.ads.impl.nl0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.yandex.mobile.ads.impl.zj */
public final class C15319zj implements C13397ia {

    /* renamed from: A */
    private int f43152A;

    /* renamed from: B */
    private long f43153B;

    /* renamed from: C */
    private float f43154C;

    /* renamed from: D */
    private C13184ga[] f43155D;

    /* renamed from: E */
    private ByteBuffer[] f43156E;

    /* renamed from: F */
    private ByteBuffer f43157F;

    /* renamed from: G */
    private ByteBuffer f43158G;

    /* renamed from: H */
    private byte[] f43159H;

    /* renamed from: I */
    private int f43160I;

    /* renamed from: J */
    private int f43161J;

    /* renamed from: K */
    private boolean f43162K;

    /* renamed from: L */
    private boolean f43163L;

    /* renamed from: M */
    private boolean f43164M;

    /* renamed from: N */
    private int f43165N;

    /* renamed from: O */
    private C14877va f43166O;

    /* renamed from: P */
    private boolean f43167P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public long f43168Q;

    /* renamed from: a */
    private final C12963ea f43169a;

    /* renamed from: b */
    private final C15321b f43170b;

    /* renamed from: c */
    private final boolean f43171c;

    /* renamed from: d */
    private final C14883ve f43172d;

    /* renamed from: e */
    private final kf1 f43173e;

    /* renamed from: f */
    private final C13184ga[] f43174f;

    /* renamed from: g */
    private final C13184ga[] f43175g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ConditionVariable f43176h;

    /* renamed from: i */
    private final C13839la f43177i;

    /* renamed from: j */
    private final ArrayDeque<C15325f> f43178j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C13397ia.C13400c f43179k;

    /* renamed from: l */
    private C15322c f43180l;

    /* renamed from: m */
    private C15322c f43181m;

    /* renamed from: n */
    private AudioTrack f43182n;

    /* renamed from: o */
    private C12864da f43183o;

    /* renamed from: p */
    private sz0 f43184p;

    /* renamed from: q */
    private sz0 f43185q;

    /* renamed from: r */
    private long f43186r;

    /* renamed from: s */
    private long f43187s;

    /* renamed from: t */
    private ByteBuffer f43188t;

    /* renamed from: u */
    private int f43189u;

    /* renamed from: v */
    private long f43190v;

    /* renamed from: w */
    private long f43191w;

    /* renamed from: x */
    private long f43192x;

    /* renamed from: y */
    private long f43193y;

    /* renamed from: z */
    private int f43194z;

    /* renamed from: com.yandex.mobile.ads.impl.zj$a */
    class C15320a extends Thread {

        /* renamed from: b */
        final /* synthetic */ AudioTrack f43195b;

        C15320a(AudioTrack audioTrack) {
            this.f43195b = audioTrack;
        }

        public void run() {
            try {
                this.f43195b.flush();
                this.f43195b.release();
            } finally {
                C15319zj.this.f43176h.open();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zj$b */
    public interface C15321b {
        /* renamed from: a */
        long mo71243a();

        /* renamed from: a */
        long mo71244a(long j);

        /* renamed from: a */
        sz0 mo71245a(sz0 sz0);
    }

    /* renamed from: com.yandex.mobile.ads.impl.zj$c */
    private static final class C15322c {

        /* renamed from: a */
        public final boolean f43197a;

        /* renamed from: b */
        public final int f43198b;

        /* renamed from: c */
        public final int f43199c;

        /* renamed from: d */
        public final int f43200d;

        /* renamed from: e */
        public final int f43201e;

        /* renamed from: f */
        public final int f43202f;

        /* renamed from: g */
        public final int f43203g;

        /* renamed from: h */
        public final int f43204h;

        /* renamed from: i */
        public final boolean f43205i;

        /* renamed from: j */
        public final boolean f43206j;

        /* renamed from: k */
        public final C13184ga[] f43207k;

        public C15322c(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, boolean z3, C13184ga[] gaVarArr) {
            this.f43197a = z;
            this.f43198b = i;
            this.f43199c = i2;
            this.f43200d = i3;
            this.f43201e = i4;
            this.f43202f = i5;
            this.f43203g = i6;
            this.f43204h = i7 == 0 ? m44693a() : i7;
            this.f43205i = z2;
            this.f43206j = z3;
            this.f43207k = gaVarArr;
        }

        /* renamed from: a */
        public long mo71246a(long j) {
            return (j * 1000000) / ((long) this.f43201e);
        }

        /* renamed from: a */
        private int m44693a() {
            int i;
            if (this.f43197a) {
                int minBufferSize = AudioTrack.getMinBufferSize(this.f43201e, this.f43202f, this.f43203g);
                C13479j9.m37708b(minBufferSize != -2);
                int i2 = minBufferSize * 4;
                long j = (long) this.f43201e;
                int i3 = this.f43200d;
                int i4 = ((int) ((250000 * j) / 1000000)) * i3;
                int max = (int) Math.max((long) minBufferSize, ((j * 750000) / 1000000) * ((long) i3));
                int i5 = ih1.f34858a;
                return Math.max(i4, Math.min(i2, max));
            }
            int i6 = this.f43203g;
            if (i6 == 14) {
                i = Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
            } else if (i6 != 17) {
                if (i6 != 18) {
                    if (i6 == 5) {
                        i = Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
                    } else if (i6 != 6) {
                        if (i6 == 7) {
                            i = DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
                        } else if (i6 == 8) {
                            i = DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i = Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
            } else {
                i = Ac4Util.MAX_RATE_BYTES_PER_SECOND;
            }
            if (i6 == 5) {
                i *= 2;
            }
            return (int) ((((long) i) * 250000) / 1000000);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zj$d */
    public static class C15323d implements C15321b {

        /* renamed from: a */
        private final C13184ga[] f43208a;

        /* renamed from: b */
        private final m81 f43209b;

        /* renamed from: c */
        private final va1 f43210c;

        public C15323d(C13184ga... gaVarArr) {
            this(gaVarArr, new m81(), new va1());
        }

        /* renamed from: a */
        public sz0 mo71245a(sz0 sz0) {
            this.f43209b.mo68617a(sz0.f40192c);
            return new sz0(this.f43210c.mo70465b(sz0.f40190a), this.f43210c.mo70463a(sz0.f40191b), sz0.f40192c);
        }

        /* renamed from: b */
        public C13184ga[] mo71247b() {
            return this.f43208a;
        }

        public C15323d(C13184ga[] gaVarArr, m81 m81, va1 va1) {
            C13184ga[] gaVarArr2 = new C13184ga[(gaVarArr.length + 2)];
            this.f43208a = gaVarArr2;
            System.arraycopy(gaVarArr, 0, gaVarArr2, 0, gaVarArr.length);
            this.f43209b = m81;
            this.f43210c = va1;
            gaVarArr2[gaVarArr.length] = m81;
            gaVarArr2[gaVarArr.length + 1] = va1;
        }

        /* renamed from: a */
        public long mo71244a(long j) {
            return this.f43210c.mo70464a(j);
        }

        /* renamed from: a */
        public long mo71243a() {
            return this.f43209b.mo68618j();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zj$e */
    public static final class C15324e extends RuntimeException {
    }

    /* renamed from: com.yandex.mobile.ads.impl.zj$f */
    private static final class C15325f {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final sz0 f43211a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f43212b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f43213c;

        /* synthetic */ C15325f(sz0 sz0, long j, long j2, C15320a aVar) {
            this(sz0, j, j2);
        }

        private C15325f(sz0 sz0, long j, long j2) {
            this.f43211a = sz0;
            this.f43212b = j;
            this.f43213c = j2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zj$g */
    private final class C15326g implements C13839la.C13840a {
        private C15326g() {
        }

        /* renamed from: a */
        public void mo68391a(long j, long j2, long j3, long j4) {
            Log.w("AudioTrack", "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C15319zj.m44662c(C15319zj.this) + ", " + C15319zj.this.m44666f());
        }

        /* renamed from: b */
        public void mo68392b(long j, long j2, long j3, long j4) {
            Log.w("AudioTrack", "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + C15319zj.m44662c(C15319zj.this) + ", " + C15319zj.this.m44666f());
        }

        /* synthetic */ C15326g(C15319zj zjVar, C15320a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo68390a(long j) {
            Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + j);
        }

        /* renamed from: a */
        public void mo68389a(int i, long j) {
            if (C15319zj.this.f43179k != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - C15319zj.this.f43168Q;
                nl0.C14106b bVar = (nl0.C14106b) C15319zj.this.f43179k;
                nl0.this.f37841w0.mo67499a(i, j, elapsedRealtime);
                nl0.this.getClass();
            }
        }
    }

    public C15319zj(C12963ea eaVar, C13184ga[] gaVarArr, boolean z) {
        this(eaVar, (C15321b) new C15323d(gaVarArr), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public long m44666f() {
        C15322c cVar = this.f43181m;
        if (cVar.f43197a) {
            return this.f43192x / ((long) cVar.f43200d);
        }
        return this.f43193y;
    }

    /* renamed from: j */
    private boolean m44667j() {
        return this.f43182n != null;
    }

    /* renamed from: m */
    private void m44668m() {
        if (!this.f43163L) {
            this.f43163L = true;
            this.f43177i.mo68382c(m44666f());
            this.f43182n.stop();
            this.f43189u = 0;
        }
    }

    /* renamed from: p */
    private void m44669p() {
        if (m44667j()) {
            if (ih1.f34858a >= 21) {
                this.f43182n.setVolume(this.f43154C);
                return;
            }
            AudioTrack audioTrack = this.f43182n;
            float f = this.f43154C;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: c */
    public void mo71233c() {
        if (m44667j()) {
            this.f43190v = 0;
            this.f43191w = 0;
            this.f43192x = 0;
            this.f43193y = 0;
            this.f43194z = 0;
            sz0 sz0 = this.f43184p;
            if (sz0 != null) {
                this.f43185q = sz0;
                this.f43184p = null;
            } else if (!this.f43178j.isEmpty()) {
                this.f43185q = this.f43178j.getLast().f43211a;
            }
            this.f43178j.clear();
            this.f43186r = 0;
            this.f43187s = 0;
            this.f43173e.mo68209k();
            m44664d();
            this.f43157F = null;
            this.f43158G = null;
            this.f43163L = false;
            this.f43162K = false;
            this.f43161J = -1;
            this.f43188t = null;
            this.f43189u = 0;
            this.f43152A = 0;
            if (this.f43177i.mo68381b()) {
                this.f43182n.pause();
            }
            AudioTrack audioTrack = this.f43182n;
            this.f43182n = null;
            C15322c cVar = this.f43180l;
            if (cVar != null) {
                this.f43181m = cVar;
                this.f43180l = null;
            }
            this.f43177i.mo68384d();
            this.f43176h.close();
            new C15320a(audioTrack).start();
        }
    }

    /* renamed from: g */
    public void mo71235g() {
        if (this.f43152A == 1) {
            this.f43152A = 2;
        }
    }

    /* renamed from: h */
    public boolean mo71236h() {
        return m44667j() && this.f43177i.mo68385d(m44666f());
    }

    /* renamed from: i */
    public boolean mo71237i() {
        return !m44667j() || (this.f43162K && !mo71236h());
    }

    /* renamed from: k */
    public void mo71238k() {
        this.f43164M = false;
        if (m44667j() && this.f43177i.mo68383c()) {
            this.f43182n.pause();
        }
    }

    /* renamed from: l */
    public void mo71239l() {
        this.f43164M = true;
        if (m44667j()) {
            this.f43177i.mo68387f();
            this.f43182n.play();
        }
    }

    /* renamed from: n */
    public void mo71240n() throws C13397ia.C13401d {
        if (!this.f43162K && m44667j() && m44661b()) {
            m44668m();
            this.f43162K = true;
        }
    }

    /* renamed from: o */
    public void mo71241o() {
        mo71233c();
        for (C13184ga g : this.f43174f) {
            g.mo67219g();
        }
        for (C13184ga g2 : this.f43175g) {
            g2.mo67219g();
        }
        this.f43165N = 0;
        this.f43164M = false;
    }

    public C15319zj(C12963ea eaVar, C15321b bVar, boolean z) {
        this.f43169a = eaVar;
        this.f43170b = (C15321b) C13479j9.m37703a(bVar);
        this.f43171c = z;
        this.f43176h = new ConditionVariable(true);
        this.f43177i = new C13839la(new C15326g(this, (C15320a) null));
        C14883ve veVar = new C14883ve();
        this.f43172d = veVar;
        kf1 kf1 = new kf1();
        this.f43173e = kf1;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C13695kb[]{new y41(), veVar, kf1});
        Collections.addAll(arrayList, ((C15323d) bVar).mo71247b());
        this.f43174f = (C13184ga[]) arrayList.toArray(new C13184ga[0]);
        this.f43175g = new C13184ga[]{new l70()};
        this.f43154C = 1.0f;
        this.f43152A = 0;
        this.f43183o = C12864da.f32499f;
        this.f43165N = 0;
        this.f43166O = new C14877va(0, 0.0f);
        this.f43185q = sz0.f40189e;
        this.f43161J = -1;
        this.f43155D = new C13184ga[0];
        this.f43156E = new ByteBuffer[0];
        this.f43178j = new ArrayDeque<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d8, code lost:
        if (r15 < r14) goto L_0x00f1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44660b(java.nio.ByteBuffer r13, long r14) throws com.yandex.mobile.ads.impl.C13397ia.C13401d {
        /*
            r12 = this;
            boolean r0 = r13.hasRemaining()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.nio.ByteBuffer r0 = r12.f43158G
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r13) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.yandex.mobile.ads.impl.C13479j9.m37705a((boolean) r0)
            goto L_0x003b
        L_0x0018:
            r12.f43158G = r13
            int r0 = com.yandex.mobile.ads.impl.ih1.f34858a
            if (r0 >= r1) goto L_0x003b
            int r0 = r13.remaining()
            byte[] r4 = r12.f43159H
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r12.f43159H = r4
        L_0x002d:
            int r4 = r13.position()
            byte[] r5 = r12.f43159H
            r13.get(r5, r3, r0)
            r13.position(r4)
            r12.f43160I = r3
        L_0x003b:
            int r0 = r13.remaining()
            int r4 = com.yandex.mobile.ads.impl.ih1.f34858a
            if (r4 >= r1) goto L_0x006c
            com.yandex.mobile.ads.impl.la r14 = r12.f43177i
            long r1 = r12.f43192x
            int r14 = r14.mo68380b(r1)
            if (r14 <= 0) goto L_0x00f1
            int r14 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r15 = r12.f43182n
            byte[] r1 = r12.f43159H
            int r2 = r12.f43160I
            int r3 = r15.write(r1, r2, r14)
            if (r3 <= 0) goto L_0x00f1
            int r14 = r12.f43160I
            int r14 = r14 + r3
            r12.f43160I = r14
            int r14 = r13.position()
            int r14 = r14 + r3
            r13.position(r14)
            goto L_0x00f1
        L_0x006c:
            boolean r1 = r12.f43167P
            if (r1 == 0) goto L_0x00eb
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x007b
            r1 = 1
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            com.yandex.mobile.ads.impl.C13479j9.m37708b((boolean) r1)
            android.media.AudioTrack r6 = r12.f43182n
            r1 = 26
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r4 < r1) goto L_0x0091
            long r10 = r14 * r7
            r9 = 1
            r7 = r13
            r8 = r0
            int r3 = r6.write(r7, r8, r9, r10)
            goto L_0x00f1
        L_0x0091:
            java.nio.ByteBuffer r1 = r12.f43188t
            if (r1 != 0) goto L_0x00aa
            r1 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r12.f43188t = r1
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r4)
            java.nio.ByteBuffer r1 = r12.f43188t
            r4 = 1431633921(0x55550001, float:1.46372496E13)
            r1.putInt(r4)
        L_0x00aa:
            int r1 = r12.f43189u
            if (r1 != 0) goto L_0x00c4
            java.nio.ByteBuffer r1 = r12.f43188t
            r4 = 4
            r1.putInt(r4, r0)
            java.nio.ByteBuffer r1 = r12.f43188t
            long r14 = r14 * r7
            r4 = 8
            r1.putLong(r4, r14)
            java.nio.ByteBuffer r14 = r12.f43188t
            r14.position(r3)
            r12.f43189u = r0
        L_0x00c4:
            java.nio.ByteBuffer r14 = r12.f43188t
            int r14 = r14.remaining()
            if (r14 <= 0) goto L_0x00db
            java.nio.ByteBuffer r15 = r12.f43188t
            int r15 = r6.write(r15, r14, r2)
            if (r15 >= 0) goto L_0x00d8
            r12.f43189u = r3
            r3 = r15
            goto L_0x00f1
        L_0x00d8:
            if (r15 >= r14) goto L_0x00db
            goto L_0x00f1
        L_0x00db:
            int r13 = r6.write(r13, r0, r2)
            if (r13 >= 0) goto L_0x00e4
            r12.f43189u = r3
            goto L_0x00e9
        L_0x00e4:
            int r14 = r12.f43189u
            int r14 = r14 - r13
            r12.f43189u = r14
        L_0x00e9:
            r3 = r13
            goto L_0x00f1
        L_0x00eb:
            android.media.AudioTrack r14 = r12.f43182n
            int r3 = r14.write(r13, r0, r2)
        L_0x00f1:
            long r13 = android.os.SystemClock.elapsedRealtime()
            r12.f43168Q = r13
            if (r3 < 0) goto L_0x0115
            com.yandex.mobile.ads.impl.zj$c r13 = r12.f43181m
            boolean r13 = r13.f43197a
            if (r13 == 0) goto L_0x0105
            long r14 = r12.f43192x
            long r1 = (long) r3
            long r14 = r14 + r1
            r12.f43192x = r14
        L_0x0105:
            if (r3 != r0) goto L_0x0114
            if (r13 != 0) goto L_0x0111
            long r13 = r12.f43193y
            int r15 = r12.f43194z
            long r0 = (long) r15
            long r13 = r13 + r0
            r12.f43193y = r13
        L_0x0111:
            r13 = 0
            r12.f43158G = r13
        L_0x0114:
            return
        L_0x0115:
            com.yandex.mobile.ads.impl.ia$d r13 = new com.yandex.mobile.ads.impl.ia$d
            r13.<init>(r3)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15319zj.m44660b(java.nio.ByteBuffer, long):void");
    }

    /* renamed from: d */
    private void m44664d() {
        int i = 0;
        while (true) {
            C13184ga[] gaVarArr = this.f43155D;
            if (i < gaVarArr.length) {
                C13184ga gaVar = gaVarArr[i];
                gaVar.flush();
                this.f43156E[i] = gaVar.mo67213a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo71228a(C13397ia.C13400c cVar) {
        this.f43179k = cVar;
    }

    /* renamed from: e */
    public sz0 mo71234e() {
        sz0 sz0 = this.f43184p;
        if (sz0 != null) {
            return sz0;
        }
        if (!this.f43178j.isEmpty()) {
            return this.f43178j.getLast().f43211a;
        }
        return this.f43185q;
    }

    /* renamed from: a */
    public boolean mo71231a(int i, int i2) {
        if (!ih1.m37396d(i2)) {
            C12963ea eaVar = this.f43169a;
            if (eaVar == null || !eaVar.mo66788a(i2) || (i != -1 && i > this.f43169a.mo66787a())) {
                return false;
            }
            return true;
        } else if (i2 != 4 || ih1.f34858a >= 21) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public long mo71222a(boolean z) {
        long j;
        if (!m44667j() || this.f43152A == 0) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f43177i.mo68378a(z), this.f43181m.mo71246a(m44666f()));
        long j2 = this.f43153B;
        C15325f fVar = null;
        while (!this.f43178j.isEmpty() && min >= this.f43178j.getFirst().f43213c) {
            fVar = this.f43178j.remove();
        }
        if (fVar != null) {
            this.f43185q = fVar.f43211a;
            this.f43187s = fVar.f43213c;
            this.f43186r = fVar.f43212b - this.f43153B;
        }
        if (this.f43185q.f40190a == 1.0f) {
            j = (min + this.f43186r) - this.f43187s;
        } else if (this.f43178j.isEmpty()) {
            j = this.f43170b.mo71244a(min - this.f43187s) + this.f43186r;
        } else {
            long j3 = this.f43186r;
            long j4 = min - this.f43187s;
            float f = this.f43185q.f40190a;
            int i = ih1.f34858a;
            if (f != 1.0f) {
                j4 = Math.round(((double) j4) * ((double) f));
            }
            j = j4 + j3;
        }
        return j2 + j + this.f43181m.mo71246a(this.f43170b.mo71243a());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e1 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x011a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71226a(int r20, int r21, int r22, int r23, int[] r24, int r25, int r26) throws com.yandex.mobile.ads.impl.C13397ia.C13398a {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            int r2 = com.yandex.mobile.ads.impl.ih1.f34858a
            r3 = 6
            r4 = 8
            r5 = 21
            r6 = 0
            if (r2 >= r5) goto L_0x001c
            if (r0 != r4) goto L_0x001c
            if (r24 != 0) goto L_0x001c
            int[] r2 = new int[r3]
            r7 = 0
        L_0x0015:
            if (r7 >= r3) goto L_0x001e
            r2[r7] = r7
            int r7 = r7 + 1
            goto L_0x0015
        L_0x001c:
            r2 = r24
        L_0x001e:
            boolean r16 = com.yandex.mobile.ads.impl.ih1.m37396d((int) r20)
            boolean r7 = r1.f43171c
            r8 = 4
            r9 = 1
            if (r7 == 0) goto L_0x0036
            boolean r7 = r1.mo71231a((int) r0, (int) r8)
            if (r7 == 0) goto L_0x0036
            boolean r7 = com.yandex.mobile.ads.impl.ih1.m37394c((int) r20)
            if (r7 == 0) goto L_0x0036
            r7 = 1
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            if (r7 == 0) goto L_0x003c
            com.yandex.mobile.ads.impl.ga[] r10 = r1.f43175g
            goto L_0x003e
        L_0x003c:
            com.yandex.mobile.ads.impl.ga[] r10 = r1.f43174f
        L_0x003e:
            r15 = r10
            if (r16 == 0) goto L_0x007c
            com.yandex.mobile.ads.impl.kf1 r10 = r1.f43173e
            r11 = r25
            r12 = r26
            r10.mo68207a(r11, r12)
            com.yandex.mobile.ads.impl.ve r10 = r1.f43172d
            r10.mo70477a((int[]) r2)
            com.yandex.mobile.ads.impl.ga$a r2 = new com.yandex.mobile.ads.impl.ga$a
            r10 = r20
            r11 = r22
            r2.<init>(r11, r0, r10)
            int r12 = r15.length
            r13 = 0
        L_0x005a:
            if (r13 >= r12) goto L_0x0074
            r14 = r15[r13]
            com.yandex.mobile.ads.impl.ga$a r17 = r14.mo67212a((com.yandex.mobile.ads.impl.C13184ga.C13185a) r2)     // Catch:{ b -> 0x006d }
            boolean r14 = r14.mo67216c()     // Catch:{ b -> 0x006d }
            if (r14 == 0) goto L_0x006a
            r2 = r17
        L_0x006a:
            int r13 = r13 + 1
            goto L_0x005a
        L_0x006d:
            r0 = move-exception
            com.yandex.mobile.ads.impl.ia$a r2 = new com.yandex.mobile.ads.impl.ia$a
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        L_0x0074:
            int r12 = r2.f33914a
            int r13 = r2.f33915b
            int r2 = r2.f33916c
            r14 = r2
            goto L_0x0083
        L_0x007c:
            r10 = r20
            r11 = r22
            r13 = r0
            r14 = r10
            r12 = r11
        L_0x0083:
            int r2 = com.yandex.mobile.ads.impl.ih1.f34858a
            r3 = 28
            if (r2 > r3) goto L_0x009b
            if (r16 != 0) goto L_0x009b
            r3 = 7
            if (r13 != r3) goto L_0x0091
            r3 = 8
            goto L_0x009c
        L_0x0091:
            r3 = 3
            if (r13 == r3) goto L_0x0099
            if (r13 == r8) goto L_0x0099
            r3 = 5
            if (r13 != r3) goto L_0x009b
        L_0x0099:
            r3 = 6
            goto L_0x009c
        L_0x009b:
            r3 = r13
        L_0x009c:
            r4 = 26
            if (r2 > r4) goto L_0x00bf
            java.lang.String r4 = "ZnVndQ=="
            byte[] r4 = android.util.Base64.decode(r4, r6)
            java.lang.String r6 = "decode(\"ZnVndQ==\", Base64.DEFAULT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r8 = kotlin.text.Charsets.UTF_8
            r6.<init>(r4, r8)
            java.lang.String r4 = com.yandex.mobile.ads.impl.ih1.f34859b
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00bf
            if (r16 != 0) goto L_0x00bf
            if (r3 != r9) goto L_0x00bf
            r3 = 2
        L_0x00bf:
            switch(r3) {
                case 1: goto L_0x00df;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00d6;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00d0;
                case 7: goto L_0x00cd;
                case 8: goto L_0x00c3;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            goto L_0x00e1
        L_0x00c3:
            r3 = 23
            if (r2 < r3) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            if (r2 < r5) goto L_0x00e1
        L_0x00ca:
            r2 = 6396(0x18fc, float:8.963E-42)
            goto L_0x00e2
        L_0x00cd:
            r2 = 1276(0x4fc, float:1.788E-42)
            goto L_0x00e2
        L_0x00d0:
            r2 = 252(0xfc, float:3.53E-43)
            goto L_0x00e2
        L_0x00d3:
            r2 = 220(0xdc, float:3.08E-43)
            goto L_0x00e2
        L_0x00d6:
            r2 = 204(0xcc, float:2.86E-43)
            goto L_0x00e2
        L_0x00d9:
            r2 = 28
            goto L_0x00e2
        L_0x00dc:
            r2 = 12
            goto L_0x00e2
        L_0x00df:
            r2 = 4
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            if (r2 == 0) goto L_0x011a
            r3 = -1
            if (r16 == 0) goto L_0x00ec
            int r0 = com.yandex.mobile.ads.impl.ih1.m37386b(r20, r21)
            goto L_0x00ed
        L_0x00ec:
            r0 = -1
        L_0x00ed:
            if (r16 == 0) goto L_0x00f3
            int r3 = com.yandex.mobile.ads.impl.ih1.m37386b(r14, r13)
        L_0x00f3:
            if (r16 == 0) goto L_0x00fa
            if (r7 != 0) goto L_0x00fa
            r17 = 1
            goto L_0x00fc
        L_0x00fa:
            r17 = 0
        L_0x00fc:
            com.yandex.mobile.ads.impl.zj$c r4 = new com.yandex.mobile.ads.impl.zj$c
            r7 = r4
            r8 = r16
            r9 = r0
            r10 = r22
            r11 = r3
            r13 = r2
            r0 = r15
            r15 = r23
            r18 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r19.m44667j()
            if (r0 == 0) goto L_0x0117
            r1.f43180l = r4
            goto L_0x0119
        L_0x0117:
            r1.f43181m = r4
        L_0x0119:
            return
        L_0x011a:
            com.yandex.mobile.ads.impl.ia$a r0 = new com.yandex.mobile.ads.impl.ia$a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported channel count: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15319zj.mo71226a(int, int, int, int, int[], int, int):void");
    }

    /* renamed from: c */
    static long m44662c(C15319zj zjVar) {
        C15322c cVar = zjVar.f43181m;
        if (cVar.f43197a) {
            return zjVar.f43190v / ((long) cVar.f43198b);
        }
        return zjVar.f43191w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m44661b() throws com.yandex.mobile.ads.impl.C13397ia.C13401d {
        /*
            r9 = this;
            int r0 = r9.f43161J
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0016
            com.yandex.mobile.ads.impl.zj$c r0 = r9.f43181m
            boolean r0 = r0.f43205i
            if (r0 == 0) goto L_0x000f
            r0 = 0
            goto L_0x0012
        L_0x000f:
            com.yandex.mobile.ads.impl.ga[] r0 = r9.f43155D
            int r0 = r0.length
        L_0x0012:
            r9.f43161J = r0
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r4 = r9.f43161J
            com.yandex.mobile.ads.impl.ga[] r5 = r9.f43155D
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x003a
            r4 = r5[r4]
            if (r0 == 0) goto L_0x002a
            r4.mo67215b()
        L_0x002a:
            r9.m44657a((long) r7)
            boolean r0 = r4.mo67217e()
            if (r0 != 0) goto L_0x0034
            return r3
        L_0x0034:
            int r0 = r9.f43161J
            int r0 = r0 + r2
            r9.f43161J = r0
            goto L_0x0014
        L_0x003a:
            java.nio.ByteBuffer r0 = r9.f43158G
            if (r0 == 0) goto L_0x0046
            r9.m44660b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f43158G
            if (r0 == 0) goto L_0x0046
            return r3
        L_0x0046:
            r9.f43161J = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C15319zj.m44661b():boolean");
    }

    /* renamed from: a */
    public boolean mo71232a(ByteBuffer byteBuffer, long j) throws C13397ia.C13399b, C13397ia.C13401d {
        long j2;
        int i;
        int i2;
        int i3;
        byte b;
        byte b2;
        int i4;
        byte b3;
        AudioTrack audioTrack;
        AudioAttributes audioAttributes;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j;
        ByteBuffer byteBuffer3 = this.f43157F;
        C13479j9.m37705a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.f43180l != null) {
            if (!m44661b()) {
                return false;
            }
            C15322c cVar = this.f43180l;
            C15322c cVar2 = this.f43181m;
            cVar.getClass();
            if (!(cVar2.f43203g == cVar.f43203g && cVar2.f43201e == cVar.f43201e && cVar2.f43202f == cVar.f43202f)) {
                m44668m();
                if (mo71236h()) {
                    return false;
                }
                mo71233c();
            } else {
                this.f43181m = this.f43180l;
                this.f43180l = null;
            }
            m44658a(this.f43185q, j3);
        }
        if (!m44667j()) {
            this.f43176h.block();
            C15322c cVar3 = this.f43181m;
            cVar3.getClass();
            boolean z = this.f43167P;
            C12864da daVar = this.f43183o;
            int i5 = this.f43165N;
            if (ih1.f34858a >= 21) {
                if (z) {
                    audioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
                } else {
                    audioAttributes = daVar.mo66536a();
                }
                audioTrack = new AudioTrack(audioAttributes, new AudioFormat.Builder().setChannelMask(cVar3.f43202f).setEncoding(cVar3.f43203g).setSampleRate(cVar3.f43201e).build(), cVar3.f43204h, 1, i5 != 0 ? i5 : 0);
            } else {
                int b4 = ih1.m37385b(daVar.f32502c);
                if (i5 == 0) {
                    audioTrack = new AudioTrack(b4, cVar3.f43201e, cVar3.f43202f, cVar3.f43203g, cVar3.f43204h, 1);
                } else {
                    audioTrack = new AudioTrack(b4, cVar3.f43201e, cVar3.f43202f, cVar3.f43203g, cVar3.f43204h, 1, i5);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                this.f43182n = audioTrack;
                int audioSessionId = audioTrack.getAudioSessionId();
                if (this.f43165N != audioSessionId) {
                    this.f43165N = audioSessionId;
                    C13397ia.C13400c cVar4 = this.f43179k;
                    if (cVar4 != null) {
                        nl0.C14106b bVar = (nl0.C14106b) cVar4;
                        nl0.this.f37841w0.mo67498a(audioSessionId);
                        nl0.this.getClass();
                    }
                }
                m44658a(this.f43185q, j3);
                C13839la laVar = this.f43177i;
                AudioTrack audioTrack2 = this.f43182n;
                C15322c cVar5 = this.f43181m;
                laVar.mo68379a(audioTrack2, cVar5.f43203g, cVar5.f43200d, cVar5.f43204h);
                m44669p();
                int i6 = this.f43166O.f41220a;
                if (i6 != 0) {
                    this.f43182n.attachAuxEffect(i6);
                    this.f43182n.setAuxEffectSendLevel(this.f43166O.f41221b);
                }
                if (this.f43164M) {
                    this.f43164M = true;
                    if (m44667j()) {
                        this.f43177i.mo68387f();
                        this.f43182n.play();
                    }
                }
            } else {
                try {
                    audioTrack.release();
                } catch (Exception unused) {
                }
                throw new C13397ia.C13399b(state, cVar3.f43201e, cVar3.f43202f, cVar3.f43204h);
            }
        }
        if (!this.f43177i.mo68388f(m44666f())) {
            return false;
        }
        if (this.f43157F == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            C15322c cVar6 = this.f43181m;
            if (!cVar6.f43197a && this.f43194z == 0) {
                int i7 = cVar6.f43203g;
                if (i7 == 14) {
                    int position = byteBuffer.position();
                    int limit = byteBuffer.limit() - 10;
                    int i8 = position;
                    while (true) {
                        if (i8 > limit) {
                            i2 = -1;
                            break;
                        } else if ((byteBuffer2.getInt(i8 + 4) & -16777217) == -1167101192) {
                            i2 = i8 - position;
                            break;
                        } else {
                            i8++;
                        }
                    }
                    if (i2 == -1) {
                        i = 0;
                    } else {
                        i = (40 << ((byteBuffer2.get((byteBuffer.position() + i2) + ((byteBuffer2.get((byteBuffer.position() + i2) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                    }
                } else if (i7 != 17) {
                    if (i7 != 18) {
                        switch (i7) {
                            case 5:
                            case 6:
                                break;
                            case 7:
                            case 8:
                                int position2 = byteBuffer.position();
                                byte b5 = byteBuffer2.get(position2);
                                if (b5 != -2) {
                                    if (b5 == -1) {
                                        i3 = (byteBuffer2.get(position2 + 4) & 7) << 4;
                                        b3 = byteBuffer2.get(position2 + 7);
                                    } else if (b5 != 31) {
                                        i4 = (byteBuffer2.get(position2 + 4) & 1) << 6;
                                        b2 = byteBuffer2.get(position2 + 5);
                                    } else {
                                        i3 = (byteBuffer2.get(position2 + 5) & 7) << 4;
                                        b3 = byteBuffer2.get(position2 + 6);
                                    }
                                    b = b3 & 60;
                                    i = (((b >> 2) | i3) + 1) * 32;
                                    break;
                                } else {
                                    i4 = (byteBuffer2.get(position2 + 5) & 1) << 6;
                                    b2 = byteBuffer2.get(position2 + 4);
                                }
                                b = b2 & 252;
                                i = (((b >> 2) | i3) + 1) * 32;
                            case 9:
                                i = so0.m42101a(byteBuffer2.get(byteBuffer.position()));
                                break;
                            default:
                                throw new IllegalStateException("Unexpected audio encoding: " + i7);
                        }
                    }
                    i = C12944e.m35516a(byteBuffer);
                } else {
                    byte[] bArr = new byte[16];
                    int position3 = byteBuffer.position();
                    byteBuffer2.get(bArr);
                    byteBuffer2.position(position3);
                    i = C13266h.m36737a(new ey0(bArr, 16)).f34188c;
                }
                this.f43194z = i;
                if (i == 0) {
                    return true;
                }
            }
            if (this.f43184p != null) {
                if (!m44661b()) {
                    return false;
                }
                sz0 sz0 = this.f43184p;
                this.f43184p = null;
                m44658a(sz0, j3);
            }
            if (this.f43152A == 0) {
                this.f43153B = Math.max(0, j3);
                this.f43152A = 1;
            } else {
                long j4 = this.f43153B;
                C15322c cVar7 = this.f43181m;
                if (cVar7.f43197a) {
                    j2 = this.f43190v / ((long) cVar7.f43198b);
                } else {
                    j2 = this.f43191w;
                }
                long j5 = j4 + (((j2 - this.f43173e.mo68208j()) * 1000000) / ((long) cVar7.f43199c));
                if (this.f43152A == 1 && Math.abs(j5 - j3) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + j5 + ", got " + j3 + "]");
                    this.f43152A = 2;
                }
                if (this.f43152A == 2) {
                    long j6 = j3 - j5;
                    this.f43153B += j6;
                    this.f43152A = 1;
                    C13397ia.C13400c cVar8 = this.f43179k;
                    if (!(cVar8 == null || j6 == 0)) {
                        nl0.C14106b bVar2 = (nl0.C14106b) cVar8;
                        nl0.this.getClass();
                        boolean unused2 = nl0.this.f37837H0 = true;
                    }
                }
            }
            if (this.f43181m.f43197a) {
                this.f43190v += (long) byteBuffer.remaining();
            } else {
                this.f43191w += (long) this.f43194z;
            }
            this.f43157F = byteBuffer2;
        }
        if (this.f43181m.f43205i) {
            m44657a(j3);
        } else {
            m44660b(this.f43157F, j3);
        }
        if (!this.f43157F.hasRemaining()) {
            this.f43157F = null;
            return true;
        } else if (!this.f43177i.mo68386e(m44666f())) {
            return false;
        } else {
            Log.w("AudioTrack", "Resetting stalled audio track");
            mo71233c();
            return true;
        }
    }

    /* renamed from: a */
    private void m44657a(long j) throws C13397ia.C13401d {
        ByteBuffer byteBuffer;
        int length = this.f43155D.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f43156E[i - 1];
            } else {
                byteBuffer = this.f43157F;
                if (byteBuffer == null) {
                    byteBuffer = C13184ga.f33912a;
                }
            }
            if (i == length) {
                m44660b(byteBuffer, j);
            } else {
                C13184ga gaVar = this.f43155D[i];
                gaVar.mo67214a(byteBuffer);
                ByteBuffer a = gaVar.mo67213a();
                this.f43156E[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo71229a(sz0 sz0) {
        C15322c cVar = this.f43181m;
        if (cVar != null && !cVar.f43206j) {
            this.f43185q = sz0.f40189e;
        } else if (sz0.equals(mo71234e())) {
        } else {
            if (m44667j()) {
                this.f43184p = sz0;
            } else {
                this.f43185q = sz0;
            }
        }
    }

    /* renamed from: a */
    public void mo71227a(C12864da daVar) {
        if (!this.f43183o.equals(daVar)) {
            this.f43183o = daVar;
            if (!this.f43167P) {
                mo71233c();
                this.f43165N = 0;
            }
        }
    }

    /* renamed from: a */
    public void mo71230a(C14877va vaVar) {
        if (!this.f43166O.equals(vaVar)) {
            int i = vaVar.f41220a;
            float f = vaVar.f41221b;
            AudioTrack audioTrack = this.f43182n;
            if (audioTrack != null) {
                if (this.f43166O.f41220a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f43182n.setAuxEffectSendLevel(f);
                }
            }
            this.f43166O = vaVar;
        }
    }

    /* renamed from: a */
    public void mo71225a(int i) {
        C13479j9.m37708b(ih1.f34858a >= 21);
        if (!this.f43167P || this.f43165N != i) {
            this.f43167P = true;
            this.f43165N = i;
            mo71233c();
        }
    }

    /* renamed from: a */
    public void mo71223a() {
        if (this.f43167P) {
            this.f43167P = false;
            this.f43165N = 0;
            mo71233c();
        }
    }

    /* renamed from: a */
    public void mo71224a(float f) {
        if (this.f43154C != f) {
            this.f43154C = f;
            m44669p();
        }
    }

    /* renamed from: a */
    private void m44658a(sz0 sz0, long j) {
        sz0 sz02;
        if (this.f43181m.f43206j) {
            sz02 = this.f43170b.mo71245a(sz0);
        } else {
            sz02 = sz0.f40189e;
        }
        this.f43178j.add(new C15325f(sz02, Math.max(0, j), this.f43181m.mo71246a(m44666f()), (C15320a) null));
        C13184ga[] gaVarArr = this.f43181m.f43207k;
        ArrayList arrayList = new ArrayList();
        for (C13184ga gaVar : gaVarArr) {
            if (gaVar.mo67216c()) {
                arrayList.add(gaVar);
            } else {
                gaVar.flush();
            }
        }
        int size = arrayList.size();
        this.f43155D = (C13184ga[]) arrayList.toArray(new C13184ga[size]);
        this.f43156E = new ByteBuffer[size];
        m44664d();
    }
}
