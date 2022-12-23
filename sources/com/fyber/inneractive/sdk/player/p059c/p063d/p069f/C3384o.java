package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3547j;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3558r;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.o */
public final class C3384o implements C3396v {

    /* renamed from: a */
    private final C3373h f9102a;

    /* renamed from: b */
    private final C3547j f9103b = new C3547j(new byte[10]);

    /* renamed from: c */
    private int f9104c = 0;

    /* renamed from: d */
    private int f9105d;

    /* renamed from: e */
    private C3558r f9106e;

    /* renamed from: f */
    private boolean f9107f;

    /* renamed from: g */
    private boolean f9108g;

    /* renamed from: h */
    private boolean f9109h;

    /* renamed from: i */
    private int f9110i;

    /* renamed from: j */
    private int f9111j;

    /* renamed from: k */
    private boolean f9112k;

    /* renamed from: l */
    private long f9113l;

    public C3384o(C3373h hVar) {
        this.f9102a = hVar;
    }

    /* renamed from: a */
    public final void mo19176a(C3558r rVar, C3270h hVar, C3396v.C3400d dVar) {
        this.f9106e = rVar;
        this.f9102a.mo19158a(hVar, dVar);
    }

    /* renamed from: a */
    public final void mo19174a() {
        this.f9104c = 0;
        this.f9105d = 0;
        this.f9109h = false;
        this.f9102a.mo19156a();
    }

    /* renamed from: a */
    public final void mo19175a(C3548k kVar, boolean z) {
        boolean z2;
        C3548k kVar2 = kVar;
        if (z) {
            int i = this.f9104c;
            if (i == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i == 3) {
                if (this.f9111j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f9111j + " more bytes");
                }
                this.f9102a.mo19160b();
            }
            m8410a(1);
        }
        while (kVar.mo19383b() > 0) {
            int i2 = this.f9104c;
            if (i2 != 0) {
                int i3 = 0;
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (m8411a(kVar2, this.f9103b.f9621a, Math.min(10, this.f9110i)) && m8411a(kVar2, (byte[]) null, this.f9110i)) {
                            this.f9103b.mo19374a(0);
                            this.f9113l = -9223372036854775807L;
                            if (this.f9107f) {
                                this.f9103b.mo19376b(4);
                                this.f9103b.mo19376b(1);
                                this.f9103b.mo19376b(1);
                                long c = (((long) this.f9103b.mo19377c(3)) << 30) | ((long) (this.f9103b.mo19377c(15) << 15)) | ((long) this.f9103b.mo19377c(15));
                                this.f9103b.mo19376b(1);
                                if (!this.f9109h && this.f9108g) {
                                    this.f9103b.mo19376b(4);
                                    this.f9103b.mo19376b(1);
                                    this.f9103b.mo19376b(1);
                                    long c2 = (((long) this.f9103b.mo19377c(3)) << 30) | ((long) (this.f9103b.mo19377c(15) << 15)) | ((long) this.f9103b.mo19377c(15));
                                    this.f9103b.mo19376b(1);
                                    this.f9106e.mo19422a(c2);
                                    this.f9109h = true;
                                }
                                this.f9113l = this.f9106e.mo19422a(c);
                            }
                            this.f9102a.mo19157a(this.f9113l, this.f9112k);
                            m8410a(3);
                        }
                    } else if (i2 == 3) {
                        int b = kVar.mo19383b();
                        int i4 = this.f9111j;
                        if (i4 != -1) {
                            i3 = b - i4;
                        }
                        if (i3 > 0) {
                            b -= i3;
                            kVar2.mo19384b(kVar2.f9626b + b);
                        }
                        this.f9102a.mo19159a(kVar2);
                        int i5 = this.f9111j;
                        if (i5 != -1) {
                            int i6 = i5 - b;
                            this.f9111j = i6;
                            if (i6 == 0) {
                                this.f9102a.mo19160b();
                                m8410a(1);
                            }
                        }
                    }
                } else if (m8411a(kVar2, this.f9103b.f9621a, 9)) {
                    this.f9103b.mo19374a(0);
                    int c3 = this.f9103b.mo19377c(24);
                    if (c3 != 1) {
                        Log.w("PesReader", "Unexpected start code prefix: " + c3);
                        this.f9111j = -1;
                        z2 = false;
                    } else {
                        this.f9103b.mo19376b(8);
                        int c4 = this.f9103b.mo19377c(16);
                        this.f9103b.mo19376b(5);
                        this.f9112k = this.f9103b.mo19375a();
                        this.f9103b.mo19376b(2);
                        this.f9107f = this.f9103b.mo19375a();
                        this.f9108g = this.f9103b.mo19375a();
                        this.f9103b.mo19376b(6);
                        int c5 = this.f9103b.mo19377c(8);
                        this.f9110i = c5;
                        if (c4 == 0) {
                            this.f9111j = -1;
                        } else {
                            this.f9111j = ((c4 + 6) - 9) - c5;
                        }
                        z2 = true;
                    }
                    if (z2) {
                        i3 = 2;
                    }
                    m8410a(i3);
                }
            } else {
                kVar2.mo19388d(kVar.mo19383b());
            }
        }
    }

    /* renamed from: a */
    private void m8410a(int i) {
        this.f9104c = i;
        this.f9105d = 0;
    }

    /* renamed from: a */
    private boolean m8411a(C3548k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo19383b(), i - this.f9105d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kVar.mo19388d(min);
        } else {
            kVar.mo19382a(bArr, this.f9105d, min);
        }
        int i2 = this.f9105d + min;
        this.f9105d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
