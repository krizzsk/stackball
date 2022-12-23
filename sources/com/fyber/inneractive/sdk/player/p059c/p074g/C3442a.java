package com.fyber.inneractive.sdk.player.p059c.p074g;

import android.net.Uri;
import android.os.Handler;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.p059c.C3292i;
import com.fyber.inneractive.sdk.player.p059c.p061b.C3222b;
import com.fyber.inneractive.sdk.player.p059c.p061b.C3225d;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3245b;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3263d;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3275l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3450b;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3452c;
import com.fyber.inneractive.sdk.player.p059c.p074g.C3454d;
import com.fyber.inneractive.sdk.player.p059c.p077i.C3473e;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3479a;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3497b;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3506g;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3509i;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3520r;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3528s;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3539d;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import com.tapjoy.TapjoyConstants;
import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.c.g.a */
final class C3442a implements C3263d.C3266c, C3270h, C3452c, C3528s.C3529a<C3447a> {

    /* renamed from: A */
    private final C3497b f9287A;

    /* renamed from: B */
    private final Runnable f9288B;

    /* renamed from: C */
    private boolean f9289C;

    /* renamed from: D */
    private int f9290D;

    /* renamed from: E */
    private long f9291E;

    /* renamed from: F */
    private long f9292F;

    /* renamed from: G */
    private int f9293G;

    /* renamed from: a */
    final C3450b.C3451a f9294a;

    /* renamed from: b */
    final C3454d.C3455a f9295b;

    /* renamed from: c */
    final String f9296c;

    /* renamed from: d */
    final C3528s f9297d = new C3528s("Loader:ExtractorMediaPeriod");

    /* renamed from: e */
    final C3448b f9298e;

    /* renamed from: f */
    final C3539d f9299f;

    /* renamed from: g */
    final Runnable f9300g;

    /* renamed from: h */
    final Handler f9301h;

    /* renamed from: i */
    final SparseArray<C3263d> f9302i;

    /* renamed from: j */
    C3452c.C3453a f9303j;

    /* renamed from: k */
    C3276m f9304k;

    /* renamed from: l */
    boolean f9305l;

    /* renamed from: m */
    boolean f9306m;

    /* renamed from: n */
    boolean f9307n;

    /* renamed from: o */
    C3461i f9308o;

    /* renamed from: p */
    long f9309p;

    /* renamed from: q */
    boolean[] f9310q;

    /* renamed from: r */
    boolean[] f9311r;

    /* renamed from: s */
    boolean f9312s;

    /* renamed from: t */
    long f9313t;

    /* renamed from: u */
    boolean f9314u;

    /* renamed from: v */
    boolean f9315v;

    /* renamed from: w */
    private final Uri f9316w;

    /* renamed from: x */
    private final C3506g f9317x;

    /* renamed from: y */
    private final int f9318y;

    /* renamed from: z */
    private final Handler f9319z;

    /* renamed from: a */
    public final /* synthetic */ int mo19252a(C3528s.C3531c cVar, final IOException iOException) {
        C3276m mVar;
        C3447a aVar = (C3447a) cVar;
        m8543a(aVar);
        Handler handler = this.f9319z;
        if (!(handler == null || this.f9294a == null)) {
            handler.post(new Runnable() {
                public final void run() {
                    C3442a.this.f9294a.mo18805a(iOException);
                }
            });
        }
        if ((iOException instanceof C3462j) || (iOException instanceof C3520r.C3526e) || ((iOException instanceof C3520r.C3524c) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException)))) {
            return 3;
        }
        boolean z = m8545l() > this.f9293G;
        if (this.f9291E == -1 && ((mVar = this.f9304k) == null || mVar.mo18994b() == -9223372036854775807L)) {
            this.f9313t = 0;
            this.f9307n = this.f9306m;
            int size = this.f9302i.size();
            for (int i = 0; i < size; i++) {
                this.f9302i.valueAt(i).mo19042a(!this.f9306m || this.f9310q[i]);
            }
            aVar.mo19271a(0, 0);
        }
        this.f9293G = m8545l();
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo19256a(C3528s.C3531c cVar) {
        m8543a((C3447a) cVar);
        this.f9314u = true;
        if (this.f9309p == -9223372036854775807L) {
            long m = m8546m();
            this.f9309p = m == Long.MIN_VALUE ? 0 : m + TapjoyConstants.TIMER_INCREMENT;
            this.f9295b.mo19077a(new C3459g(this.f9309p, this.f9304k.mo18995b_()));
        }
        this.f9303j.mo19076a(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo19257a(C3528s.C3531c cVar, boolean z) {
        m8543a((C3447a) cVar);
        if (!z && this.f9290D > 0) {
            int size = this.f9302i.size();
            for (int i = 0; i < size; i++) {
                this.f9302i.valueAt(i).mo19042a(this.f9310q[i]);
            }
            this.f9303j.mo19076a(this);
        }
    }

    public C3442a(Uri uri, C3506g gVar, C3268f[] fVarArr, int i, Handler handler, C3450b.C3451a aVar, C3454d.C3455a aVar2, C3497b bVar, String str) {
        this.f9316w = uri;
        this.f9317x = gVar;
        this.f9318y = i;
        this.f9319z = handler;
        this.f9294a = aVar;
        this.f9295b = aVar2;
        this.f9287A = bVar;
        this.f9296c = str;
        this.f9298e = new C3448b(fVarArr, this);
        this.f9299f = new C3539d();
        this.f9288B = new Runnable() {
            /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
                jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r5v0 ?, r5v3 ?, r5v5 ?]
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
                */
            public final void run() {
                /*
                    r9 = this;
                    com.fyber.inneractive.sdk.player.c.g.a r0 = com.fyber.inneractive.sdk.player.p059c.p074g.C3442a.this
                    boolean r1 = r0.f9315v
                    if (r1 != 0) goto L_0x00a1
                    boolean r1 = r0.f9306m
                    if (r1 != 0) goto L_0x00a1
                    com.fyber.inneractive.sdk.player.c.d.m r1 = r0.f9304k
                    if (r1 == 0) goto L_0x00a1
                    boolean r1 = r0.f9305l
                    if (r1 != 0) goto L_0x0014
                    goto L_0x00a1
                L_0x0014:
                    android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d> r1 = r0.f9302i
                    int r1 = r1.size()
                    r2 = 0
                    r3 = 0
                L_0x001c:
                    if (r3 >= r1) goto L_0x0031
                    android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d> r4 = r0.f9302i
                    java.lang.Object r4 = r4.valueAt(r3)
                    com.fyber.inneractive.sdk.player.c.d.d r4 = (com.fyber.inneractive.sdk.player.p059c.p063d.C3263d) r4
                    com.fyber.inneractive.sdk.player.c.d.d$b r4 = r4.f8340b
                    com.fyber.inneractive.sdk.player.c.h r4 = r4.mo19052c()
                    if (r4 == 0) goto L_0x00a1
                    int r3 = r3 + 1
                    goto L_0x001c
                L_0x0031:
                    com.fyber.inneractive.sdk.player.c.k.d r3 = r0.f9299f
                    r3.mo19370b()
                    com.fyber.inneractive.sdk.player.c.g.h[] r3 = new com.fyber.inneractive.sdk.player.p059c.p074g.C3460h[r1]
                    boolean[] r4 = new boolean[r1]
                    r0.f9311r = r4
                    boolean[] r4 = new boolean[r1]
                    r0.f9310q = r4
                    com.fyber.inneractive.sdk.player.c.d.m r4 = r0.f9304k
                    long r4 = r4.mo18994b()
                    r0.f9309p = r4
                    r4 = 0
                L_0x0049:
                    r5 = 1
                    if (r4 >= r1) goto L_0x0081
                    android.util.SparseArray<com.fyber.inneractive.sdk.player.c.d.d> r6 = r0.f9302i
                    java.lang.Object r6 = r6.valueAt(r4)
                    com.fyber.inneractive.sdk.player.c.d.d r6 = (com.fyber.inneractive.sdk.player.p059c.p063d.C3263d) r6
                    com.fyber.inneractive.sdk.player.c.d.d$b r6 = r6.f8340b
                    com.fyber.inneractive.sdk.player.c.h r6 = r6.mo19052c()
                    com.fyber.inneractive.sdk.player.c.g.h r7 = new com.fyber.inneractive.sdk.player.c.g.h
                    com.fyber.inneractive.sdk.player.c.h[] r8 = new com.fyber.inneractive.sdk.player.p059c.C3290h[r5]
                    r8[r2] = r6
                    r7.<init>(r8)
                    r3[r4] = r7
                    java.lang.String r6 = r6.f8493f
                    boolean r7 = com.fyber.inneractive.sdk.player.p059c.p080k.C3543h.m8801b(r6)
                    if (r7 != 0) goto L_0x0075
                    boolean r6 = com.fyber.inneractive.sdk.player.p059c.p080k.C3543h.m8800a(r6)
                    if (r6 == 0) goto L_0x0074
                    goto L_0x0075
                L_0x0074:
                    r5 = 0
                L_0x0075:
                    boolean[] r6 = r0.f9311r
                    r6[r4] = r5
                    boolean r6 = r0.f9312s
                    r5 = r5 | r6
                    r0.f9312s = r5
                    int r4 = r4 + 1
                    goto L_0x0049
                L_0x0081:
                    com.fyber.inneractive.sdk.player.c.g.i r1 = new com.fyber.inneractive.sdk.player.c.g.i
                    r1.<init>(r3)
                    r0.f9308o = r1
                    r0.f9306m = r5
                    com.fyber.inneractive.sdk.player.c.g.d$a r1 = r0.f9295b
                    com.fyber.inneractive.sdk.player.c.g.g r2 = new com.fyber.inneractive.sdk.player.c.g.g
                    long r3 = r0.f9309p
                    com.fyber.inneractive.sdk.player.c.d.m r5 = r0.f9304k
                    boolean r5 = r5.mo18995b_()
                    r2.<init>(r3, r5)
                    r1.mo19077a(r2)
                    com.fyber.inneractive.sdk.player.c.g.c$a r1 = r0.f9303j
                    r1.mo19075a(r0)
                L_0x00a1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p074g.C3442a.C34431.run():void");
            }
        };
        this.f9300g = new Runnable() {
            public final void run() {
                if (!C3442a.this.f9315v) {
                    C3442a.this.f9303j.mo19076a(C3442a.this);
                }
            }
        };
        this.f9301h = new Handler();
        this.f9292F = -9223372036854775807L;
        this.f9302i = new SparseArray<>();
        this.f9291E = -1;
    }

    /* renamed from: a */
    public final void mo19255a(C3452c.C3453a aVar) {
        this.f9303j = aVar;
        this.f9299f.mo19369a();
        m8544k();
    }

    /* renamed from: c */
    public final void mo19258c() throws IOException {
        mo19264i();
    }

    /* renamed from: d */
    public final C3461i mo19259d() {
        return this.f9308o;
    }

    /* renamed from: a */
    public final long mo19254a(C3473e[] eVarArr, boolean[] zArr, C3456e[] eVarArr2, boolean[] zArr2, long j) {
        C3535a.m8784b(this.f9306m);
        for (int i = 0; i < eVarArr.length; i++) {
            if (eVarArr2[i] != null && (eVarArr[i] == null || !zArr[i])) {
                int i2 = eVarArr2[i].f9339a;
                C3535a.m8784b(this.f9310q[i2]);
                this.f9290D--;
                this.f9310q[i2] = false;
                this.f9302i.valueAt(i2).mo19036a();
                eVarArr2[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (eVarArr2[i3] == null && eVarArr[i3] != null) {
                C3473e eVar = eVarArr[i3];
                C3535a.m8784b(eVar.mo19291b() == 1);
                C3535a.m8784b(eVar.mo19292b(0) == 0);
                int a = this.f9308o.mo19286a(eVar.mo19289a());
                C3535a.m8784b(!this.f9310q[a]);
                this.f9290D++;
                this.f9310q[a] = true;
                eVarArr2[i3] = new C3449c(a);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.f9289C) {
            int size = this.f9302i.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f9310q[i4]) {
                    this.f9302i.valueAt(i4).mo19036a();
                }
            }
        }
        if (this.f9290D == 0) {
            this.f9307n = false;
            if (this.f9297d.mo19357a()) {
                this.f9297d.mo19358b();
            }
        } else if (!this.f9289C ? j != 0 : z) {
            j = mo19253a(j);
            for (int i5 = 0; i5 < eVarArr2.length; i5++) {
                if (eVarArr2[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f9289C = true;
        return j;
    }

    /* renamed from: e */
    public final boolean mo19260e() {
        if (this.f9314u) {
            return false;
        }
        if (this.f9306m && this.f9290D == 0) {
            return false;
        }
        boolean a = this.f9299f.mo19369a();
        if (this.f9297d.mo19357a()) {
            return a;
        }
        m8544k();
        return true;
    }

    /* renamed from: f */
    public final long mo19261f() {
        if (this.f9290D == 0) {
            return Long.MIN_VALUE;
        }
        return mo19263h();
    }

    /* renamed from: g */
    public final long mo19262g() {
        if (!this.f9307n) {
            return -9223372036854775807L;
        }
        this.f9307n = false;
        return this.f9313t;
    }

    /* renamed from: h */
    public final long mo19263h() {
        long j;
        if (this.f9314u) {
            return Long.MIN_VALUE;
        }
        if (mo19265j()) {
            return this.f9292F;
        }
        if (this.f9312s) {
            j = Long.MAX_VALUE;
            int size = this.f9302i.size();
            for (int i = 0; i < size; i++) {
                if (this.f9311r[i]) {
                    j = Math.min(j, this.f9302i.valueAt(i).f8340b.mo19053d());
                }
            }
        } else {
            j = m8546m();
        }
        return j == Long.MIN_VALUE ? this.f9313t : j;
    }

    /* renamed from: a */
    public final long mo19253a(long j) {
        if (!this.f9304k.mo18995b_()) {
            j = 0;
        }
        this.f9313t = j;
        int size = this.f9302i.size();
        boolean z = !mo19265j();
        int i = 0;
        while (z && i < size) {
            if (this.f9310q[i]) {
                z = this.f9302i.valueAt(i).mo19043a(j, false);
            }
            i++;
        }
        if (!z) {
            this.f9292F = j;
            this.f9314u = false;
            if (this.f9297d.mo19357a()) {
                this.f9297d.mo19358b();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.f9302i.valueAt(i2).mo19042a(this.f9310q[i2]);
                }
            }
        }
        this.f9307n = false;
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo19264i() throws IOException {
        C3528s sVar = this.f9297d;
        if (sVar.f9574c != null) {
            throw sVar.f9574c;
        } else if (sVar.f9573b != null) {
            C3528s.C3530b<? extends C3528s.C3531c> bVar = sVar.f9573b;
            int i = sVar.f9573b.f9575a;
            if (bVar.f9576b != null && bVar.f9577c > i) {
                throw bVar.f9576b;
            }
        }
    }

    /* renamed from: a */
    public final C3278n mo19056a(int i) {
        C3263d dVar = this.f9302i.get(i);
        if (dVar != null) {
            return dVar;
        }
        C3263d dVar2 = new C3263d(this.f9287A);
        dVar2.f8346h = this;
        this.f9302i.put(i, dVar2);
        return dVar2;
    }

    /* renamed from: b */
    public final void mo19058b() {
        this.f9305l = true;
        this.f9301h.post(this.f9288B);
    }

    /* renamed from: a */
    public final void mo19057a(C3276m mVar) {
        this.f9304k = mVar;
        this.f9301h.post(this.f9288B);
    }

    /* renamed from: a */
    public final void mo19055a() {
        this.f9301h.post(this.f9288B);
    }

    /* renamed from: a */
    private void m8543a(C3447a aVar) {
        if (this.f9291E == -1) {
            this.f9291E = aVar.f9326a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r0 = r10.f9304k;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8544k() {
        /*
            r10 = this;
            com.fyber.inneractive.sdk.player.c.g.a$a r6 = new com.fyber.inneractive.sdk.player.c.g.a$a
            android.net.Uri r2 = r10.f9316w
            com.fyber.inneractive.sdk.player.c.j.g r3 = r10.f9317x
            com.fyber.inneractive.sdk.player.c.g.a$b r4 = r10.f9298e
            com.fyber.inneractive.sdk.player.c.k.d r5 = r10.f9299f
            r0 = r6
            r1 = r10
            r0.<init>(r2, r3, r4, r5)
            boolean r0 = r10.f9306m
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0040
            boolean r0 = r10.mo19265j()
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r0)
            long r4 = r10.f9309p
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            long r7 = r10.f9292F
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r10.f9314u = r1
            r10.f9292F = r2
            return
        L_0x0031:
            com.fyber.inneractive.sdk.player.c.d.m r0 = r10.f9304k
            long r4 = r10.f9292F
            long r4 = r0.mo18993a(r4)
            long r7 = r10.f9292F
            r6.mo19271a(r4, r7)
            r10.f9292F = r2
        L_0x0040:
            int r0 = r10.m8545l()
            r10.f9293G = r0
            int r0 = r10.f9318y
            r4 = -1
            if (r0 != r4) goto L_0x0067
            boolean r0 = r10.f9306m
            if (r0 == 0) goto L_0x0066
            long r4 = r10.f9291E
            r7 = -1
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            com.fyber.inneractive.sdk.player.c.d.m r0 = r10.f9304k
            if (r0 == 0) goto L_0x0064
            long r4 = r0.mo18994b()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r0 = 6
            goto L_0x0067
        L_0x0066:
            r0 = 3
        L_0x0067:
            r5 = r0
            com.fyber.inneractive.sdk.player.c.j.s r2 = r10.f9297d
            android.os.Looper r3 = android.os.Looper.myLooper()
            if (r3 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            com.fyber.inneractive.sdk.player.p059c.p080k.C3535a.m8784b(r1)
            long r7 = android.os.SystemClock.elapsedRealtime()
            com.fyber.inneractive.sdk.player.c.j.s$b r9 = new com.fyber.inneractive.sdk.player.c.j.s$b
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r6
            r4 = r10
            r6 = r7
            r0.<init>(r2, r3, r4, r5, r6)
            r0 = 0
            r9.mo19359a((long) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p074g.C3442a.m8544k():void");
    }

    /* renamed from: l */
    private int m8545l() {
        int size = this.f9302i.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f9302i.valueAt(i2).f8340b.mo19044a();
        }
        return i;
    }

    /* renamed from: m */
    private long m8546m() {
        int size = this.f9302i.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.f9302i.valueAt(i).f8340b.mo19053d());
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo19265j() {
        return this.f9292F != -9223372036854775807L;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.g.a$c */
    private final class C3449c implements C3456e {

        /* renamed from: a */
        final int f9339a;

        public C3449c(int i) {
            this.f9339a = i;
        }

        /* renamed from: a */
        public final boolean mo19277a() {
            C3442a aVar = C3442a.this;
            int i = this.f9339a;
            if (!aVar.f9314u) {
                return !aVar.mo19265j() && !aVar.f9302i.valueAt(i).f8340b.mo19050b();
            }
            return true;
        }

        /* renamed from: b */
        public final void mo19278b() throws IOException {
            C3442a.this.mo19264i();
        }

        /* renamed from: a */
        public final int mo19275a(C3292i iVar, C3225d dVar, boolean z) {
            int i;
            C3225d dVar2 = dVar;
            C3442a aVar = C3442a.this;
            int i2 = this.f9339a;
            if (aVar.f9307n || aVar.mo19265j()) {
                return -3;
            }
            C3263d valueAt = aVar.f9302i.valueAt(i2);
            boolean z2 = aVar.f9314u;
            long j = aVar.f9313t;
            int a = valueAt.f8340b.mo19045a(iVar, dVar, z, z2, valueAt.f8345g, valueAt.f8342d);
            if (a == -5) {
                valueAt.f8345g = iVar.f8514a;
                return -5;
            } else if (a == -4) {
                if (!dVar.mo18963c()) {
                    if (dVar2.f8131d < j) {
                        dVar2.f8109a |= Integer.MIN_VALUE;
                    }
                    if (dVar.mo18967e()) {
                        C3263d.C3264a aVar2 = valueAt.f8342d;
                        long j2 = aVar2.f8357b;
                        valueAt.f8343e.mo19379a(1);
                        valueAt.mo19039a(j2, valueAt.f8343e.f9625a, 1);
                        long j3 = j2 + 1;
                        byte b = valueAt.f8343e.f9625a[0];
                        boolean z3 = (b & 128) != 0;
                        byte b2 = b & Byte.MAX_VALUE;
                        if (dVar2.f8129b.f8110a == null) {
                            dVar2.f8129b.f8110a = new byte[16];
                        }
                        valueAt.mo19039a(j3, dVar2.f8129b.f8110a, (int) b2);
                        long j4 = j3 + ((long) b2);
                        if (z3) {
                            valueAt.f8343e.mo19379a(2);
                            valueAt.mo19039a(j4, valueAt.f8343e.f9625a, 2);
                            j4 += 2;
                            i = valueAt.f8343e.mo19389e();
                        } else {
                            i = 1;
                        }
                        int[] iArr = dVar2.f8129b.f8113d;
                        if (iArr == null || iArr.length < i) {
                            iArr = new int[i];
                        }
                        int[] iArr2 = dVar2.f8129b.f8114e;
                        if (iArr2 == null || iArr2.length < i) {
                            iArr2 = new int[i];
                        }
                        if (z3) {
                            int i3 = i * 6;
                            valueAt.f8343e.mo19379a(i3);
                            valueAt.mo19039a(j4, valueAt.f8343e.f9625a, i3);
                            j4 += (long) i3;
                            valueAt.f8343e.mo19386c(0);
                            for (int i4 = 0; i4 < i; i4++) {
                                iArr[i4] = valueAt.f8343e.mo19389e();
                                iArr2[i4] = valueAt.f8343e.mo19400n();
                            }
                        } else {
                            iArr[0] = 0;
                            iArr2[0] = aVar2.f8356a - ((int) (j4 - aVar2.f8357b));
                        }
                        C3222b bVar = dVar2.f8129b;
                        byte[] bArr = aVar2.f8359d;
                        byte[] bArr2 = dVar2.f8129b.f8110a;
                        bVar.f8115f = i;
                        bVar.f8113d = iArr;
                        bVar.f8114e = iArr2;
                        bVar.f8111b = bArr;
                        bVar.f8110a = bArr2;
                        bVar.f8112c = 1;
                        bVar.f8116g = 0;
                        bVar.f8117h = 0;
                        if (C3560t.f9655a >= 16) {
                            bVar.f8118i.numSubSamples = bVar.f8115f;
                            bVar.f8118i.numBytesOfClearData = bVar.f8113d;
                            bVar.f8118i.numBytesOfEncryptedData = bVar.f8114e;
                            bVar.f8118i.key = bVar.f8111b;
                            bVar.f8118i.iv = bVar.f8110a;
                            bVar.f8118i.mode = bVar.f8112c;
                            if (C3560t.f9655a >= 24) {
                                C3222b.C3223a aVar3 = bVar.f8119j;
                                aVar3.f8121b.set(bVar.f8116g, bVar.f8117h);
                                aVar3.f8120a.setPattern(aVar3.f8121b);
                            }
                        }
                        int i5 = (int) (j4 - aVar2.f8357b);
                        aVar2.f8357b += (long) i5;
                        aVar2.f8356a -= i5;
                    }
                    int i6 = valueAt.f8342d.f8356a;
                    if (dVar2.f8130c == null) {
                        dVar2.f8130c = dVar2.mo18966b(i6);
                    } else {
                        int capacity = dVar2.f8130c.capacity();
                        int position = dVar2.f8130c.position();
                        int i7 = i6 + position;
                        if (capacity < i7) {
                            ByteBuffer b3 = dVar2.mo18966b(i7);
                            if (position > 0) {
                                dVar2.f8130c.position(0);
                                dVar2.f8130c.limit(position);
                                b3.put(dVar2.f8130c);
                            }
                            dVar2.f8130c = b3;
                        }
                    }
                    long j5 = valueAt.f8342d.f8357b;
                    ByteBuffer byteBuffer = dVar2.f8130c;
                    int i8 = valueAt.f8342d.f8356a;
                    while (i8 > 0) {
                        valueAt.mo19037a(j5);
                        int i9 = (int) (j5 - valueAt.f8344f);
                        int min = Math.min(i8, valueAt.f8339a - i9);
                        C3479a peek = valueAt.f8341c.peek();
                        byteBuffer.put(peek.f9412a, peek.f9413b + i9, min);
                        j5 += (long) min;
                        i8 -= min;
                    }
                    valueAt.mo19037a(valueAt.f8342d.f8358c);
                }
                return -4;
            } else if (a == -3) {
                return -3;
            } else {
                throw new IllegalStateException();
            }
        }

        /* renamed from: a */
        public final void mo19276a(long j) {
            C3442a aVar = C3442a.this;
            C3263d valueAt = aVar.f9302i.valueAt(this.f9339a);
            if (!aVar.f9314u || j <= valueAt.f8340b.mo19053d()) {
                valueAt.mo19043a(j, true);
                return;
            }
            long e = valueAt.f8340b.mo19054e();
            if (e != -1) {
                valueAt.mo19037a(e);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.g.a$a */
    final class C3447a implements C3528s.C3531c {

        /* renamed from: a */
        long f9326a = -1;

        /* renamed from: c */
        private final Uri f9328c;

        /* renamed from: d */
        private final C3506g f9329d;

        /* renamed from: e */
        private final C3448b f9330e;

        /* renamed from: f */
        private final C3539d f9331f;

        /* renamed from: g */
        private final C3275l f9332g = new C3275l();

        /* renamed from: h */
        private volatile boolean f9333h;

        /* renamed from: i */
        private boolean f9334i = true;

        /* renamed from: j */
        private long f9335j;

        public C3447a(Uri uri, C3506g gVar, C3448b bVar, C3539d dVar) {
            this.f9328c = (Uri) C3535a.m8781a(uri);
            this.f9329d = (C3506g) C3535a.m8781a(gVar);
            this.f9330e = (C3448b) C3535a.m8781a(bVar);
            this.f9331f = dVar;
        }

        /* renamed from: a */
        public final void mo19271a(long j, long j2) {
            this.f9332g.f8396a = j;
            this.f9335j = j2;
            this.f9334i = true;
        }

        /* renamed from: a */
        public final void mo19270a() {
            this.f9333h = true;
        }

        /* renamed from: b */
        public final boolean mo19272b() {
            return this.f9333h;
        }

        /* renamed from: c */
        public final void mo19273c() throws IOException, InterruptedException {
            int i = 0;
            while (i == 0 && !this.f9333h) {
                C3245b bVar = null;
                try {
                    long j = this.f9332g.f8396a;
                    long a = this.f9329d.mo18703a(new C3509i(this.f9328c, j, C3442a.this.f9296c));
                    this.f9326a = a;
                    if (a != -1) {
                        this.f9326a = a + j;
                    }
                    C3245b bVar2 = new C3245b(this.f9329d, j, this.f9326a);
                    try {
                        C3268f a2 = this.f9330e.mo19274a(bVar2, this.f9329d.mo18704a());
                        if (this.f9334i) {
                            a2.mo18999a(j, this.f9335j);
                            this.f9334i = false;
                        }
                        while (i == 0 && !this.f9333h) {
                            this.f9331f.mo19371c();
                            i = a2.mo18998a((C3269g) bVar2, this.f9332g);
                            if (bVar2.mo19012c() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j) {
                                j = bVar2.mo19012c();
                                this.f9331f.mo19370b();
                                C3442a.this.f9301h.post(C3442a.this.f9300g);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f9332g.f8396a = bVar2.mo19012c();
                        }
                        C3560t.m8880a(this.f9329d);
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        if (!(i == 1 || bVar == null)) {
                            this.f9332g.f8396a = bVar.mo19012c();
                        }
                        C3560t.m8880a(this.f9329d);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f9332g.f8396a = bVar.mo19012c();
                    C3560t.m8880a(this.f9329d);
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.g.a$b */
    private static final class C3448b {

        /* renamed from: a */
        C3268f f9336a;

        /* renamed from: b */
        private final C3268f[] f9337b;

        /* renamed from: c */
        private final C3270h f9338c;

        public C3448b(C3268f[] fVarArr, C3270h hVar) {
            this.f9337b = fVarArr;
            this.f9338c = hVar;
        }

        /* renamed from: a */
        public final C3268f mo19274a(C3269g gVar, Uri uri) throws IOException, InterruptedException {
            C3268f fVar = this.f9336a;
            if (fVar != null) {
                return fVar;
            }
            C3268f[] fVarArr = this.f9337b;
            int length = fVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C3268f fVar2 = fVarArr[i];
                try {
                    if (fVar2.mo19001a(gVar)) {
                        this.f9336a = fVar2;
                        gVar.mo19006a();
                        break;
                    }
                    gVar.mo19006a();
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    gVar.mo19006a();
                    throw th;
                }
            }
            C3268f fVar3 = this.f9336a;
            if (fVar3 != null) {
                fVar3.mo19000a(this.f9338c);
                return this.f9336a;
            }
            throw new C3462j("None of the available extractors (" + C3560t.m8878a((Object[]) this.f9337b) + ") could read the stream.", uri);
        }
    }
}
