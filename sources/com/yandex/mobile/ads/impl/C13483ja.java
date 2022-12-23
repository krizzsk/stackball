package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.vc1;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ja */
final class C13483ja extends vc1 {

    /* renamed from: e */
    private static final int[] f35203e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f35204b;

    /* renamed from: c */
    private boolean f35205c;

    /* renamed from: d */
    private int f35206d;

    public C13483ja(ke1 ke1) {
        super(ke1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo66011a(fy0 fy0) throws vc1.C14880a {
        if (!this.f35204b) {
            int r = fy0.mo67126r();
            int i = (r >> 4) & 15;
            this.f35206d = i;
            if (i == 2) {
                this.f41244a.mo65339a(Format.m31683a((String) null, "audio/mpeg", (String) null, -1, -1, 1, f35203e[(r >> 2) & 3], -1, (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.f35205c = true;
            } else if (i == 7 || i == 8) {
                this.f41244a.mo65339a(Format.m31683a((String) null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, -1, (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.f35205c = true;
            } else if (i != 10) {
                throw new vc1.C14880a("Audio format not supported: " + this.f35206d);
            }
            this.f35204b = true;
        } else {
            fy0.mo67114f(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo66012b(fy0 fy0, long j) throws jy0 {
        fy0 fy02 = fy0;
        if (this.f35206d == 2) {
            int a = fy0.mo67098a();
            this.f41244a.mo65341a(fy02, a);
            this.f41244a.mo65337a(j, 1, a, 0, (ke1.C13702a) null);
            return true;
        }
        int r = fy0.mo67126r();
        if (r == 0 && !this.f35205c) {
            int a2 = fy0.mo67098a();
            byte[] bArr = new byte[a2];
            fy02.mo67104a(bArr, 0, a2);
            Pair<Integer, Integer> a3 = C12972eg.m35651a(new ey0(bArr, a2), false);
            this.f41244a.mo65339a(Format.m31683a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), -1, (List<byte[]>) Collections.singletonList(bArr), (DrmInitData) null, 0, (String) null));
            this.f35205c = true;
            return false;
        } else if (this.f35206d == 10 && r != 1) {
            return false;
        } else {
            int a4 = fy0.mo67098a();
            this.f41244a.mo65341a(fy02, a4);
            this.f41244a.mo65337a(j, 1, a4, 0, (ke1.C13702a) null);
            return true;
        }
    }
}
