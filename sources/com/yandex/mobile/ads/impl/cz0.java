package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.tf1;

public final class cz0 implements tf1 {

    /* renamed from: a */
    private final a30 f32309a;

    /* renamed from: b */
    private final ey0 f32310b = new ey0(new byte[10]);

    /* renamed from: c */
    private int f32311c = 0;

    /* renamed from: d */
    private int f32312d;

    /* renamed from: e */
    private de1 f32313e;

    /* renamed from: f */
    private boolean f32314f;

    /* renamed from: g */
    private boolean f32315g;

    /* renamed from: h */
    private boolean f32316h;

    /* renamed from: i */
    private int f32317i;

    /* renamed from: j */
    private int f32318j;

    /* renamed from: k */
    private boolean f32319k;

    /* renamed from: l */
    private long f32320l;

    public cz0(a30 a30) {
        this.f32309a = a30;
    }

    /* renamed from: a */
    public void mo66378a(de1 de1, x50 x50, tf1.C14678d dVar) {
        this.f32313e = de1;
        this.f32309a.mo65664a(x50, dVar);
    }

    /* renamed from: a */
    public final void mo66377a() {
        this.f32311c = 0;
        this.f32312d = 0;
        this.f32316h = false;
        this.f32309a.mo65661a();
    }

    /* renamed from: a */
    public final void mo66379a(fy0 fy0, int i) throws jy0 {
        boolean z;
        fy0 fy02 = fy0;
        int i2 = 2;
        int i3 = -1;
        if ((i & 1) != 0) {
            int i4 = this.f32311c;
            if (!(i4 == 0 || i4 == 1)) {
                if (i4 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else if (i4 == 3) {
                    if (this.f32318j != -1) {
                        Log.w("PesReader", "Unexpected start indicator: expected " + this.f32318j + " more bytes");
                    }
                    this.f32309a.mo65665b();
                } else {
                    throw new IllegalStateException();
                }
            }
            m34948a(1);
        }
        int i5 = i;
        while (fy0.mo67098a() > 0) {
            int i6 = this.f32311c;
            if (i6 != 0) {
                int i7 = 0;
                if (i6 != 1) {
                    if (i6 == i2) {
                        if (m34949a(fy02, this.f32310b.f33187a, Math.min(10, this.f32317i)) && m34949a(fy02, (byte[]) null, this.f32317i)) {
                            this.f32310b.mo66895c(0);
                            this.f32320l = -9223372036854775807L;
                            if (this.f32314f) {
                                this.f32310b.mo66897d(4);
                                this.f32310b.mo66897d(1);
                                long a = ((long) (this.f32310b.mo66886a(15) << 15)) | (((long) this.f32310b.mo66886a(3)) << 30);
                                this.f32310b.mo66897d(1);
                                long a2 = a | ((long) this.f32310b.mo66886a(15));
                                this.f32310b.mo66897d(1);
                                if (!this.f32316h && this.f32315g) {
                                    this.f32310b.mo66897d(4);
                                    this.f32310b.mo66897d(1);
                                    this.f32310b.mo66897d(1);
                                    long a3 = (((long) this.f32310b.mo66886a(3)) << 30) | ((long) (this.f32310b.mo66886a(15) << 15)) | ((long) this.f32310b.mo66886a(15));
                                    this.f32310b.mo66897d(1);
                                    this.f32313e.mo66566b(a3);
                                    this.f32316h = true;
                                }
                                this.f32320l = this.f32313e.mo66566b(a2);
                            }
                            i5 |= this.f32319k ? 4 : 0;
                            this.f32309a.mo65662a(this.f32320l, i5);
                            m34948a(3);
                        }
                    } else if (i6 == 3) {
                        int a4 = fy0.mo67098a();
                        int i8 = this.f32318j;
                        if (i8 != i3) {
                            i7 = a4 - i8;
                        }
                        if (i7 > 0) {
                            a4 -= i7;
                            fy02.mo67110d(fy0.mo67105b() + a4);
                        }
                        this.f32309a.mo65663a(fy02);
                        int i9 = this.f32318j;
                        if (i9 != i3) {
                            int i10 = i9 - a4;
                            this.f32318j = i10;
                            if (i10 == 0) {
                                this.f32309a.mo65665b();
                                m34948a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m34949a(fy02, this.f32310b.f33187a, 9)) {
                    this.f32310b.mo66895c(0);
                    int a5 = this.f32310b.mo66886a(24);
                    if (a5 != 1) {
                        Log.w("PesReader", "Unexpected start code prefix: " + a5);
                        this.f32318j = -1;
                        z = false;
                    } else {
                        this.f32310b.mo66897d(8);
                        int a6 = this.f32310b.mo66886a(16);
                        this.f32310b.mo66897d(5);
                        this.f32319k = this.f32310b.mo66900f();
                        this.f32310b.mo66897d(2);
                        this.f32314f = this.f32310b.mo66900f();
                        this.f32315g = this.f32310b.mo66900f();
                        this.f32310b.mo66897d(6);
                        int a7 = this.f32310b.mo66886a(8);
                        this.f32317i = a7;
                        if (a6 == 0) {
                            this.f32318j = -1;
                        } else {
                            this.f32318j = ((a6 + 6) - 9) - a7;
                        }
                        z = true;
                    }
                    m34948a(z ? 2 : 0);
                }
            } else {
                fy02.mo67114f(fy0.mo67098a());
            }
            i2 = 2;
            i3 = -1;
        }
    }

    /* renamed from: a */
    private void m34948a(int i) {
        this.f32311c = i;
        this.f32312d = 0;
    }

    /* renamed from: a */
    private boolean m34949a(fy0 fy0, byte[] bArr, int i) {
        int min = Math.min(fy0.mo67098a(), i - this.f32312d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            fy0.mo67114f(min);
        } else {
            fy0.mo67104a(bArr, this.f32312d, min);
        }
        int i2 = this.f32312d + min;
        this.f32312d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
