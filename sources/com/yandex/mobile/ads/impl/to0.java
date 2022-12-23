package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.tf1;
import java.util.List;

public final class to0 implements a30 {

    /* renamed from: a */
    private final fy0 f40393a;

    /* renamed from: b */
    private final so0 f40394b;

    /* renamed from: c */
    private final String f40395c;

    /* renamed from: d */
    private String f40396d;

    /* renamed from: e */
    private ke1 f40397e;

    /* renamed from: f */
    private int f40398f = 0;

    /* renamed from: g */
    private int f40399g;

    /* renamed from: h */
    private boolean f40400h;

    /* renamed from: i */
    private boolean f40401i;

    /* renamed from: j */
    private long f40402j;

    /* renamed from: k */
    private int f40403k;

    /* renamed from: l */
    private long f40404l;

    public to0(String str) {
        fy0 fy0 = new fy0(4);
        this.f40393a = fy0;
        fy0.f33778a[0] = -1;
        this.f40394b = new so0();
        this.f40395c = str;
    }

    /* renamed from: a */
    public void mo65661a() {
        this.f40398f = 0;
        this.f40399g = 0;
        this.f40401i = false;
    }

    /* renamed from: b */
    public void mo65665b() {
    }

    /* renamed from: a */
    public void mo65664a(x50 x50, tf1.C14678d dVar) {
        dVar.mo70177a();
        this.f40396d = dVar.mo70178b();
        this.f40397e = x50.mo65304a(dVar.mo70179c(), 1);
    }

    /* renamed from: a */
    public void mo65662a(long j, int i) {
        this.f40404l = j;
    }

    /* renamed from: a */
    public void mo65663a(fy0 fy0) {
        fy0 fy02 = fy0;
        while (fy0.mo67098a() > 0) {
            int i = this.f40398f;
            if (i == 0) {
                byte[] bArr = fy02.f33778a;
                int b = fy0.mo67105b();
                int c = fy0.mo67107c();
                while (true) {
                    if (b >= c) {
                        fy02.mo67112e(c);
                        break;
                    }
                    boolean z = (bArr[b] & 255) == 255;
                    boolean z2 = this.f40401i && (bArr[b] & 224) == 224;
                    this.f40401i = z;
                    if (z2) {
                        fy02.mo67112e(b + 1);
                        this.f40401i = false;
                        this.f40393a.f33778a[1] = bArr[b];
                        this.f40399g = 2;
                        this.f40398f = 1;
                        break;
                    }
                    b++;
                }
            } else if (i == 1) {
                int min = Math.min(fy0.mo67098a(), 4 - this.f40399g);
                fy02.mo67104a(this.f40393a.f33778a, this.f40399g, min);
                int i2 = this.f40399g + min;
                this.f40399g = i2;
                if (i2 >= 4) {
                    this.f40393a.mo67112e(0);
                    if (!so0.m42103a(this.f40393a.mo67113f(), this.f40394b)) {
                        this.f40399g = 0;
                        this.f40398f = 1;
                    } else {
                        so0 so0 = this.f40394b;
                        this.f40403k = so0.f40094c;
                        if (!this.f40400h) {
                            int i3 = so0.f40095d;
                            this.f40402j = (((long) so0.f40098g) * 1000000) / ((long) i3);
                            this.f40397e.mo65339a(Format.m31683a(this.f40396d, so0.f40093b, (String) null, -1, 4096, so0.f40096e, i3, -1, (List<byte[]>) null, (DrmInitData) null, 0, this.f40395c));
                            this.f40400h = true;
                        }
                        this.f40393a.mo67112e(0);
                        this.f40397e.mo65341a(this.f40393a, 4);
                        this.f40398f = 2;
                    }
                }
            } else if (i == 2) {
                int min2 = Math.min(fy0.mo67098a(), this.f40403k - this.f40399g);
                this.f40397e.mo65341a(fy02, min2);
                int i4 = this.f40399g + min2;
                this.f40399g = i4;
                int i5 = this.f40403k;
                if (i4 >= i5) {
                    this.f40397e.mo65337a(this.f40404l, 1, i5, 0, (ke1.C13702a) null);
                    this.f40404l += this.f40402j;
                    this.f40399g = 0;
                    this.f40398f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
