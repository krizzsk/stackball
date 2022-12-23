package com.yandex.mobile.ads.impl;

import com.google.common.base.Ascii;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.C12944e;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.tf1;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.d */
public final class C12844d implements a30 {

    /* renamed from: a */
    private final ey0 f32321a;

    /* renamed from: b */
    private final fy0 f32322b;

    /* renamed from: c */
    private final String f32323c;

    /* renamed from: d */
    private String f32324d;

    /* renamed from: e */
    private ke1 f32325e;

    /* renamed from: f */
    private int f32326f;

    /* renamed from: g */
    private int f32327g;

    /* renamed from: h */
    private boolean f32328h;

    /* renamed from: i */
    private long f32329i;

    /* renamed from: j */
    private Format f32330j;

    /* renamed from: k */
    private int f32331k;

    /* renamed from: l */
    private long f32332l;

    public C12844d() {
        this((String) null);
    }

    /* renamed from: a */
    public void mo65661a() {
        this.f32326f = 0;
        this.f32327g = 0;
        this.f32328h = false;
    }

    /* renamed from: b */
    public void mo65665b() {
    }

    public C12844d(String str) {
        ey0 ey0 = new ey0(new byte[128]);
        this.f32321a = ey0;
        this.f32322b = new fy0(ey0.f33187a);
        this.f32326f = 0;
        this.f32323c = str;
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        this.f32324d = dVar.mo70178b();
        this.f32325e = x50.mo65304a(dVar.mo70179c(), 1);
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        this.f32332l = j;
    }

    /* renamed from: a */
    public void mo65663a(fy0 fy0) {
        boolean z;
        fy0 fy02 = fy0;
        while (fy0.mo67098a() > 0) {
            int i = this.f32326f;
            boolean z2 = true;
            if (i == 0) {
                while (true) {
                    if (fy0.mo67098a() <= 0) {
                        z = false;
                        break;
                    } else if (!this.f32328h) {
                        this.f32328h = fy0.mo67126r() == 11;
                    } else {
                        int r = fy0.mo67126r();
                        if (r == 119) {
                            this.f32328h = false;
                            z = true;
                            break;
                        }
                        this.f32328h = r == 11;
                    }
                }
                if (z) {
                    this.f32326f = 1;
                    byte[] bArr = this.f32322b.f33778a;
                    bArr[0] = Ascii.f10113VT;
                    bArr[1] = 119;
                    this.f32327g = 2;
                }
            } else if (i == 1) {
                byte[] bArr2 = this.f32322b.f33778a;
                int min = Math.min(fy0.mo67098a(), 128 - this.f32327g);
                fy02.mo67104a(bArr2, this.f32327g, min);
                int i2 = this.f32327g + min;
                this.f32327g = i2;
                if (i2 != 128) {
                    z2 = false;
                }
                if (z2) {
                    this.f32321a.mo66895c(0);
                    C12944e.C12946b a = C12944e.m35519a(this.f32321a);
                    Format format = this.f32330j;
                    if (!(format != null && a.f32864c == format.f29543w && a.f32863b == format.f29544x && a.f32862a == format.f29530j)) {
                        Format a2 = Format.m31683a(this.f32324d, a.f32862a, (String) null, -1, -1, a.f32864c, a.f32863b, -1, (List<byte[]>) null, (DrmInitData) null, 0, this.f32323c);
                        this.f32330j = a2;
                        this.f32325e.mo65339a(a2);
                    }
                    this.f32331k = a.f32865d;
                    this.f32329i = (((long) a.f32866e) * 1000000) / ((long) this.f32330j.f29544x);
                    this.f32322b.mo67112e(0);
                    this.f32325e.mo65341a(this.f32322b, 128);
                    this.f32326f = 2;
                }
            } else if (i == 2) {
                int min2 = Math.min(fy0.mo67098a(), this.f32331k - this.f32327g);
                this.f32325e.mo65341a(fy02, min2);
                int i3 = this.f32327g + min2;
                this.f32327g = i3;
                int i4 = this.f32331k;
                if (i3 == i4) {
                    this.f32325e.mo65337a(this.f32332l, 1, i4, 0, (ke1.C13702a) null);
                    this.f32332l += this.f32329i;
                    this.f32326f = 0;
                }
            }
        }
    }
}
