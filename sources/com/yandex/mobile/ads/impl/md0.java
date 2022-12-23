package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class md0 {

    /* renamed from: a */
    private final jd0 f37313a = new jd0();

    /* renamed from: a */
    public final void mo68648a(vq0 vq0, Map<String, Bitmap> map) {
        List<hd0> a;
        Intrinsics.checkNotNullParameter(vq0, "nativeAdBlock");
        Intrinsics.checkNotNullParameter(map, "images");
        for (pq0 b : vq0.mo70515c().mo65856c()) {
            List<C13690k9> b2 = b.mo69407b();
            if (b2 != null && (!b2.isEmpty())) {
                for (C13690k9 next : b2) {
                    Object d = next.mo68169d();
                    String c = next.mo68168c();
                    Intrinsics.checkNotNullExpressionValue(c, "asset.type");
                    if (Intrinsics.areEqual((Object) c, (Object) "media") && (d instanceof dm0) && (a = ((dm0) d).mo66637a()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (T next2 : a) {
                            hd0 hd0 = (hd0) next2;
                            jd0 jd0 = this.f37313a;
                            Intrinsics.checkNotNullExpressionValue(hd0, "imageValue");
                            if (jd0.mo67975a(hd0, map)) {
                                arrayList.add(next2);
                            }
                        }
                        a.retainAll(arrayList);
                    }
                }
            }
        }
    }
}
