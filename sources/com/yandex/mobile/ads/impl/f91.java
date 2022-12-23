package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.offset.C15571a;
import com.yandex.mobile.ads.video.parser.offset.C15572b;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class f91 {

    /* renamed from: b */
    private static final Set<C15571a> f33285b = new HashSet(Arrays.asList(new C15571a[]{C15571a.PERCENTAGE, C15571a.TIME}));

    /* renamed from: a */
    private final C15572b f33286a = new C15572b(f33285b);

    /* renamed from: a */
    public SkipInfo mo66944a(C13413ii iiVar) {
        VastTimeOffset a;
        int d = iiVar.mo67786d();
        g91 g = iiVar.mo67790g();
        if (g == null || (a = this.f33286a.mo72005a(g.mo67210a())) == null) {
            return null;
        }
        float d2 = a.mo72000d();
        if (VastTimeOffset.C15570b.PERCENTS.equals(a.mo71999c())) {
            d2 = (float) tk0.m42363a(d2, (long) d);
        }
        return new ig0((long) d2);
    }
}
