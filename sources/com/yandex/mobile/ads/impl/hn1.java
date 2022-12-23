package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.video.C12339a;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.vc1;

final class hn1 extends vc1 {

    /* renamed from: b */
    private final fy0 f34487b = new fy0(nq0.f37879a);

    /* renamed from: c */
    private final fy0 f34488c = new fy0(4);

    /* renamed from: d */
    private int f34489d;

    /* renamed from: e */
    private boolean f34490e;

    /* renamed from: f */
    private boolean f34491f;

    /* renamed from: g */
    private int f34492g;

    public hn1(ke1 ke1) {
        super(ke1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo66011a(fy0 fy0) throws vc1.C14880a {
        int r = fy0.mo67126r();
        int i = (r >> 4) & 15;
        int i2 = r & 15;
        if (i2 == 7) {
            this.f34492g = i;
            return i != 5;
        }
        throw new vc1.C14880a("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo66012b(fy0 fy0, long j) throws jy0 {
        fy0 fy02 = fy0;
        int r = fy0.mo67126r();
        long g = j + (((long) fy0.mo67115g()) * 1000);
        if (r == 0 && !this.f34490e) {
            fy0 fy03 = new fy0(new byte[fy0.mo67098a()]);
            fy02.mo67104a(fy03.f33778a, 0, fy0.mo67098a());
            C12339a a = C12339a.m32497a(fy03);
            this.f34489d = a.f30326b;
            this.f41244a.mo65339a(Format.m31680a((String) null, "video/avc", (String) null, -1, -1, a.f30327c, a.f30328d, -1.0f, a.f30325a, -1, a.f30329e, (DrmInitData) null));
            this.f34490e = true;
            return false;
        } else if (r != 1 || !this.f34490e) {
            return false;
        } else {
            int i = this.f34492g == 1 ? 1 : 0;
            if (!this.f34491f && i == 0) {
                return false;
            }
            byte[] bArr = this.f34488c.f33778a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i2 = 4 - this.f34489d;
            int i3 = 0;
            while (fy0.mo67098a() > 0) {
                fy02.mo67104a(this.f34488c.f33778a, i2, this.f34489d);
                this.f34488c.mo67112e(0);
                int v = this.f34488c.mo67130v();
                this.f34487b.mo67112e(0);
                this.f41244a.mo65341a(this.f34487b, 4);
                this.f41244a.mo65341a(fy02, v);
                i3 = i3 + 4 + v;
            }
            this.f41244a.mo65337a(g, i, i3, 0, (ke1.C13702a) null);
            this.f34491f = true;
            return true;
        }
    }
}
