package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3504f;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3506g;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3508h;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3509i;
import com.fyber.inneractive.sdk.player.p059c.p078j.C3533t;
import com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3480a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.d */
public final class C3486d implements C3506g {

    /* renamed from: a */
    private final C3480a f9427a;

    /* renamed from: b */
    private final C3506g f9428b;

    /* renamed from: c */
    private final C3506g f9429c;

    /* renamed from: d */
    private final C3506g f9430d;

    /* renamed from: e */
    private final C3487a f9431e;

    /* renamed from: f */
    private final boolean f9432f;

    /* renamed from: g */
    private final boolean f9433g;

    /* renamed from: h */
    private final boolean f9434h;

    /* renamed from: i */
    private C3506g f9435i;

    /* renamed from: j */
    private boolean f9436j;

    /* renamed from: k */
    private Uri f9437k;

    /* renamed from: l */
    private int f9438l;

    /* renamed from: m */
    private String f9439m;

    /* renamed from: n */
    private long f9440n;

    /* renamed from: o */
    private long f9441o;

    /* renamed from: p */
    private C3490g f9442p;

    /* renamed from: q */
    private boolean f9443q;

    /* renamed from: r */
    private boolean f9444r;

    /* renamed from: s */
    private long f9445s;

    /* renamed from: com.fyber.inneractive.sdk.player.c.j.a.d$a */
    public interface C3487a {
    }

    public C3486d(C3480a aVar, C3506g gVar, C3506g gVar2, C3504f fVar, int i, C3487a aVar2) {
        this.f9427a = aVar;
        this.f9428b = gVar2;
        boolean z = false;
        this.f9432f = (i & 1) != 0;
        this.f9433g = (i & 2) != 0;
        this.f9434h = (i & 4) != 0 ? true : z;
        this.f9430d = gVar;
        if (fVar != null) {
            this.f9429c = new C3533t(gVar, fVar);
        } else {
            this.f9429c = null;
        }
        this.f9431e = aVar2;
    }

    /* renamed from: a */
    public final long mo18703a(C3509i iVar) throws IOException {
        try {
            this.f9437k = iVar.f9498a;
            this.f9438l = iVar.f9504g;
            this.f9439m = iVar.f9503f != null ? iVar.f9503f : iVar.f9498a.toString();
            this.f9440n = iVar.f9501d;
            this.f9444r = (this.f9433g && this.f9443q) || (iVar.f9502e == -1 && this.f9434h);
            if (iVar.f9502e == -1) {
                if (!this.f9444r) {
                    long a = this.f9427a.mo19310a(this.f9439m);
                    this.f9441o = a;
                    if (a != -1) {
                        long j = a - iVar.f9501d;
                        this.f9441o = j;
                        if (j <= 0) {
                            throw new C3508h();
                        }
                    }
                    m8661a(true);
                    return this.f9441o;
                }
            }
            this.f9441o = iVar.f9502e;
            m8661a(true);
            return this.f9441o;
        } catch (IOException e) {
            m8660a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final int mo18702a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9441o == 0) {
            return -1;
        }
        try {
            int a = this.f9435i.mo18702a(bArr, i, i2);
            if (a >= 0) {
                if (this.f9435i == this.f9428b) {
                    this.f9445s += (long) a;
                }
                long j = (long) a;
                this.f9440n += j;
                if (this.f9441o != -1) {
                    this.f9441o -= j;
                }
            } else {
                if (this.f9436j) {
                    m8659a(this.f9440n);
                    this.f9441o = 0;
                }
                m8662c();
                if ((this.f9441o > 0 || this.f9441o == -1) && m8661a(false)) {
                    return mo18702a(bArr, i, i2);
                }
            }
            return a;
        } catch (IOException e) {
            m8660a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public final Uri mo18704a() {
        C3506g gVar = this.f9435i;
        return gVar == this.f9430d ? gVar.mo18704a() : this.f9437k;
    }

    /* renamed from: b */
    public final void mo18705b() throws IOException {
        this.f9437k = null;
        if (this.f9431e != null && this.f9445s > 0) {
            this.f9427a.mo19309a();
            this.f9445s = 0;
        }
        try {
            m8662c();
        } catch (IOException e) {
            m8660a(e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8661a(boolean r19) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            boolean r0 = r1.f9444r
            r2 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r2
            goto L_0x0028
        L_0x0009:
            boolean r0 = r1.f9432f
            if (r0 == 0) goto L_0x001e
            com.fyber.inneractive.sdk.player.c.j.a.a r0 = r1.f9427a     // Catch:{ InterruptedException -> 0x0018 }
            java.lang.String r3 = r1.f9439m     // Catch:{ InterruptedException -> 0x0018 }
            long r4 = r1.f9440n     // Catch:{ InterruptedException -> 0x0018 }
            com.fyber.inneractive.sdk.player.c.j.a.g r0 = r0.mo19311a(r3, r4)     // Catch:{ InterruptedException -> 0x0018 }
            goto L_0x0028
        L_0x0018:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x001e:
            com.fyber.inneractive.sdk.player.c.j.a.a r0 = r1.f9427a
            java.lang.String r3 = r1.f9439m
            long r4 = r1.f9440n
            com.fyber.inneractive.sdk.player.c.j.a.g r0 = r0.mo19315b(r3, r4)
        L_0x0028:
            r3 = 1
            r4 = 0
            r5 = -1
            if (r0 != 0) goto L_0x0044
            com.fyber.inneractive.sdk.player.c.j.g r0 = r1.f9430d
            r1.f9435i = r0
            com.fyber.inneractive.sdk.player.c.j.i r0 = new com.fyber.inneractive.sdk.player.c.j.i
            android.net.Uri r8 = r1.f9437k
            long r9 = r1.f9440n
            long r11 = r1.f9441o
            java.lang.String r13 = r1.f9439m
            int r14 = r1.f9438l
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r14)
            goto L_0x00b5
        L_0x0044:
            boolean r7 = r0.f9455d
            if (r7 == 0) goto L_0x0078
            java.io.File r7 = r0.f9456e
            android.net.Uri r9 = android.net.Uri.fromFile(r7)
            long r7 = r1.f9440n
            long r10 = r0.f9453b
            long r12 = r7 - r10
            long r7 = r0.f9454c
            long r7 = r7 - r12
            long r10 = r1.f9441o
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            long r7 = java.lang.Math.min(r7, r10)
        L_0x0061:
            r14 = r7
            com.fyber.inneractive.sdk.player.c.j.i r0 = new com.fyber.inneractive.sdk.player.c.j.i
            long r10 = r1.f9440n
            java.lang.String r7 = r1.f9439m
            int r8 = r1.f9438l
            r17 = r8
            r8 = r0
            r16 = r7
            r8.<init>(r9, r10, r12, r14, r16, r17)
            com.fyber.inneractive.sdk.player.c.j.g r7 = r1.f9428b
            r1.f9435i = r7
            r7 = r0
            goto L_0x00b5
        L_0x0078:
            long r7 = r0.f9454c
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0080
            r7 = 1
            goto L_0x0081
        L_0x0080:
            r7 = 0
        L_0x0081:
            if (r7 == 0) goto L_0x0086
            long r7 = r1.f9441o
            goto L_0x0092
        L_0x0086:
            long r7 = r0.f9454c
            long r9 = r1.f9441o
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x0092
            long r7 = java.lang.Math.min(r7, r9)
        L_0x0092:
            r13 = r7
            com.fyber.inneractive.sdk.player.c.j.i r7 = new com.fyber.inneractive.sdk.player.c.j.i
            android.net.Uri r10 = r1.f9437k
            long r11 = r1.f9440n
            java.lang.String r15 = r1.f9439m
            int r8 = r1.f9438l
            r9 = r7
            r16 = r8
            r9.<init>(r10, r11, r13, r15, r16)
            com.fyber.inneractive.sdk.player.c.j.g r8 = r1.f9429c
            if (r8 == 0) goto L_0x00ac
            r1.f9435i = r8
            r1.f9442p = r0
            goto L_0x00b5
        L_0x00ac:
            com.fyber.inneractive.sdk.player.c.j.g r8 = r1.f9430d
            r1.f9435i = r8
            com.fyber.inneractive.sdk.player.c.j.a.a r8 = r1.f9427a
            r8.mo19313a((com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3490g) r0)
        L_0x00b5:
            long r8 = r7.f9502e
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00bd
            r0 = 1
            goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            r1.f9436j = r0
            r8 = 0
            com.fyber.inneractive.sdk.player.c.j.g r0 = r1.f9435i     // Catch:{ IOException -> 0x00c9 }
            long r8 = r0.mo18703a(r7)     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00e8
        L_0x00c9:
            r0 = move-exception
            if (r19 != 0) goto L_0x00e4
            boolean r3 = r1.f9436j
            if (r3 == 0) goto L_0x00e4
            r3 = r0
        L_0x00d1:
            if (r3 == 0) goto L_0x00e4
            boolean r10 = r3 instanceof com.fyber.inneractive.sdk.player.p059c.p078j.C3508h
            if (r10 == 0) goto L_0x00df
            r10 = r3
            com.fyber.inneractive.sdk.player.c.j.h r10 = (com.fyber.inneractive.sdk.player.p059c.p078j.C3508h) r10
            int r10 = r10.f9497a
            if (r10 != 0) goto L_0x00df
            goto L_0x00e5
        L_0x00df:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x00d1
        L_0x00e4:
            r2 = r0
        L_0x00e5:
            if (r2 != 0) goto L_0x00fb
            r3 = 0
        L_0x00e8:
            boolean r0 = r1.f9436j
            if (r0 == 0) goto L_0x00fa
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00fa
            r1.f9441o = r8
            long r4 = r7.f9501d
            long r6 = r1.f9441o
            long r4 = r4 + r6
            r1.m8659a((long) r4)
        L_0x00fa:
            return r3
        L_0x00fb:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p078j.p079a.C3486d.m8661a(boolean):boolean");
    }

    /* renamed from: a */
    private void m8659a(long j) throws IOException {
        if (this.f9435i == this.f9429c) {
            this.f9427a.mo19317c(this.f9439m, j);
        }
    }

    /* renamed from: c */
    private void m8662c() throws IOException {
        C3506g gVar = this.f9435i;
        if (gVar != null) {
            try {
                gVar.mo18705b();
                this.f9435i = null;
                this.f9436j = false;
            } finally {
                C3490g gVar2 = this.f9442p;
                if (gVar2 != null) {
                    this.f9427a.mo19313a(gVar2);
                    this.f9442p = null;
                }
            }
        }
    }

    /* renamed from: a */
    private void m8660a(IOException iOException) {
        if (this.f9435i == this.f9428b || (iOException instanceof C3480a.C3481a)) {
            this.f9443q = true;
        }
    }
}
