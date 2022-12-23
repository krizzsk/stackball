package com.fyber.inneractive.sdk.player.p059c.p063d.p065b;

import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import java.io.IOException;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.b.a */
final class C3246a implements C3248b {

    /* renamed from: a */
    private final byte[] f8191a = new byte[8];

    /* renamed from: b */
    private final Stack<C3247a> f8192b = new Stack<>();

    /* renamed from: c */
    private final C3255f f8193c = new C3255f();

    /* renamed from: d */
    private C3249c f8194d;

    /* renamed from: e */
    private int f8195e;

    /* renamed from: f */
    private int f8196f;

    /* renamed from: g */
    private long f8197g;

    C3246a() {
    }

    /* renamed from: a */
    public final void mo19017a(C3249c cVar) {
        this.f8194d = cVar;
    }

    /* renamed from: a */
    public final void mo19016a() {
        this.f8195e = 0;
        this.f8192b.clear();
        this.f8193c.mo19033a();
    }

    /* renamed from: a */
    public final boolean mo19018a(C3269g gVar) throws IOException, InterruptedException {
        String str;
        double d;
        int a;
        int a2;
        C3535a.m8784b(this.f8194d != null);
        while (true) {
            if (this.f8192b.isEmpty() || gVar.mo19012c() < this.f8192b.peek().f8199b) {
                if (this.f8195e == 0) {
                    long a3 = this.f8193c.mo19032a(gVar, true, false, 4);
                    if (a3 == -2) {
                        gVar.mo19006a();
                        while (true) {
                            gVar.mo19014c(this.f8191a, 0, 4);
                            a = C3255f.m7957a(this.f8191a[0]);
                            if (a != -1 && a <= 4) {
                                a2 = (int) C3255f.m7958a(this.f8191a, a, false);
                                if (this.f8194d.mo19025b(a2)) {
                                    break;
                                }
                            }
                            gVar.mo19009b(1);
                        }
                        gVar.mo19009b(a);
                        a3 = (long) a2;
                    }
                    if (a3 == -1) {
                        return false;
                    }
                    this.f8196f = (int) a3;
                    this.f8195e = 1;
                }
                if (this.f8195e == 1) {
                    this.f8197g = this.f8193c.mo19032a(gVar, false, true, 8);
                    this.f8195e = 2;
                }
                int a4 = this.f8194d.mo19019a(this.f8196f);
                if (a4 == 0) {
                    gVar.mo19009b((int) this.f8197g);
                    this.f8195e = 0;
                } else if (a4 == 1) {
                    long c = gVar.mo19012c();
                    this.f8192b.add(new C3247a(this.f8196f, this.f8197g + c, (byte) 0));
                    this.f8194d.mo19023a(this.f8196f, c, this.f8197g);
                    this.f8195e = 0;
                    return true;
                } else if (a4 == 2) {
                    long j = this.f8197g;
                    if (j <= 8) {
                        this.f8194d.mo19022a(this.f8196f, m7915a(gVar, (int) j));
                        this.f8195e = 0;
                        return true;
                    }
                    throw new C3295l("Invalid integer size: " + this.f8197g);
                } else if (a4 == 3) {
                    long j2 = this.f8197g;
                    if (j2 <= 2147483647L) {
                        C3249c cVar = this.f8194d;
                        int i = this.f8196f;
                        int i2 = (int) j2;
                        if (i2 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i2];
                            gVar.mo19010b(bArr, 0, i2);
                            str = new String(bArr);
                        }
                        cVar.mo19024a(i, str);
                        this.f8195e = 0;
                        return true;
                    }
                    throw new C3295l("String element size: " + this.f8197g);
                } else if (a4 == 4) {
                    this.f8194d.mo19021a(this.f8196f, (int) this.f8197g, gVar);
                    this.f8195e = 0;
                    return true;
                } else if (a4 == 5) {
                    long j3 = this.f8197g;
                    if (j3 == 4 || j3 == 8) {
                        C3249c cVar2 = this.f8194d;
                        int i3 = this.f8196f;
                        int i4 = (int) this.f8197g;
                        long a5 = m7915a(gVar, i4);
                        if (i4 == 4) {
                            d = (double) Float.intBitsToFloat((int) a5);
                        } else {
                            d = Double.longBitsToDouble(a5);
                        }
                        cVar2.mo19020a(i3, d);
                        this.f8195e = 0;
                        return true;
                    }
                    throw new C3295l("Invalid float size: " + this.f8197g);
                } else {
                    throw new C3295l("Invalid element type " + a4);
                }
            } else {
                this.f8194d.mo19026c(this.f8192b.pop().f8198a);
                return true;
            }
        }
    }

    /* renamed from: a */
    private long m7915a(C3269g gVar, int i) throws IOException, InterruptedException {
        gVar.mo19010b(this.f8191a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f8191a[i2] & 255));
        }
        return j;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.b.a$a */
    private static final class C3247a {

        /* renamed from: a */
        final int f8198a;

        /* renamed from: b */
        final long f8199b;

        /* synthetic */ C3247a(int i, long j, byte b) {
            this(i, j);
        }

        private C3247a(int i, long j) {
            this.f8198a = i;
            this.f8199b = j;
        }
    }
}
