package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3275l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.a */
public final class C3364a implements C3268f {

    /* renamed from: a */
    public static final C3271i f8925a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3364a()};
        }
    };

    /* renamed from: b */
    private static final int f8926b = C3560t.m8893e("ID3");

    /* renamed from: c */
    private final long f8927c;

    /* renamed from: d */
    private final C3548k f8928d;

    /* renamed from: e */
    private C3366b f8929e;

    /* renamed from: f */
    private boolean f8930f;

    public C3364a() {
        this((byte) 0);
    }

    private C3364a(byte b) {
        this.f8927c = 0;
        this.f8928d = new C3548k(2786);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        r8.mo19006a();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        if ((r4 - r3) < 8192) goto L_0x004d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19001a(com.fyber.inneractive.sdk.player.p059c.p063d.C3269g r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r7 = this;
            com.fyber.inneractive.sdk.player.c.k.k r0 = new com.fyber.inneractive.sdk.player.c.k.k
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f9625a
            r8.mo19014c(r4, r2, r1)
            r0.mo19386c(r2)
            int r4 = r0.mo19393g()
            int r5 = f8926b
            if (r4 != r5) goto L_0x0028
            r4 = 3
            r0.mo19388d(r4)
            int r4 = r0.mo19399m()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.mo19013c(r4)
            goto L_0x0009
        L_0x0028:
            r8.mo19006a()
            r8.mo19013c(r3)
            r4 = r3
        L_0x002f:
            r1 = 0
        L_0x0030:
            byte[] r5 = r0.f9625a
            r6 = 5
            r8.mo19014c(r5, r2, r6)
            r0.mo19386c(r2)
            int r5 = r0.mo19389e()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0051
            r8.mo19006a()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x004d
            return r2
        L_0x004d:
            r8.mo19013c(r4)
            goto L_0x002f
        L_0x0051:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x0057
            return r5
        L_0x0057:
            byte[] r5 = r0.f9625a
            int r5 = com.fyber.inneractive.sdk.player.p059c.p060a.C3189a.m7721a((byte[]) r5)
            r6 = -1
            if (r5 != r6) goto L_0x0061
            return r2
        L_0x0061:
            int r5 = r5 + -5
            r8.mo19013c(r5)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3364a.mo19001a(com.fyber.inneractive.sdk.player.c.d.g):boolean");
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        C3366b bVar = new C3366b();
        this.f8929e = bVar;
        bVar.mo19158a(hVar, new C3396v.C3400d(0, 1));
        hVar.mo19058b();
        hVar.mo19057a((C3276m) new C3276m.C3277a(-9223372036854775807L));
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        this.f8930f = false;
        this.f8929e.mo19156a();
    }

    /* renamed from: a */
    public final int mo18998a(C3269g gVar, C3275l lVar) throws IOException, InterruptedException {
        int a = gVar.mo19005a(this.f8928d.f9625a, 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f8928d.mo19386c(0);
        this.f8928d.mo19384b(a);
        if (!this.f8930f) {
            this.f8929e.f8931a = this.f8927c;
            this.f8930f = true;
        }
        this.f8929e.mo19159a(this.f8928d);
        return 0;
    }
}
