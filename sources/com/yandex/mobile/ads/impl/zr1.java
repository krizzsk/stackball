package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

public class zr1 implements im0 {

    /* renamed from: a */
    private final mm0 f43320a;

    /* renamed from: b */
    private final jm0 f43321b = new jm0();

    /* renamed from: c */
    private final lm0 f43322c = new lm0();

    /* renamed from: d */
    private final km0 f43323d = new km0();

    public zr1(AdResponse<?> adResponse) {
        this.f43320a = new mm0(adResponse);
    }

    /* renamed from: a */
    public gm0 mo66100a(MediaView mediaView, C14645t1 t1Var, ed0 ed0, sd0 sd0, ht0 ht0, d81 d81, dm0 dm0) {
        au0 a = ht0.mo67625a();
        yu0 b = ht0.mo67626b();
        if (dm0 != null) {
            List<hd0> a2 = dm0.mo66637a();
            if (a != null) {
                return this.f43320a.mo68840a(mediaView, t1Var, sd0, a);
            }
            if (b != null) {
                return this.f43323d.mo68252a(mediaView, sd0, b);
            }
            if (a2 != null && !a2.isEmpty()) {
                if (a2.size() == 1) {
                    return this.f43321b.mo68063a(mediaView, ed0);
                }
                try {
                    return this.f43322c.mo68490a(mediaView, ed0, a2, d81);
                } catch (Throwable unused) {
                    return this.f43321b.mo68063a(mediaView, ed0);
                }
            }
        }
        return null;
    }
}
