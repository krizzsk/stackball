package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.x9 */
class C15156x9 {

    /* renamed from: a */
    private final jd0 f42475a = new jd0();

    C15156x9() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70848a(vq0 vq0, Map<String, Bitmap> map) {
        for (pq0 next : vq0.mo70515c().mo65856c()) {
            List<C13690k9> b = next.mo69407b();
            if (b != null && !b.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C13690k9 next2 : b) {
                    Object d = next2.mo68169d();
                    String c = next2.mo68168c();
                    if (!"image".equals(c) || !(d instanceof hd0)) {
                        if ("media".equals(c) && (d instanceof dm0) && ((dm0) d).mo66637a() != null) {
                            dm0 dm0 = (dm0) d;
                            List<hd0> a = dm0.mo66637a();
                            hd0 hd0 = null;
                            if (a != null && !a.isEmpty()) {
                                hd0 = a.get(0);
                            }
                            kj1 c2 = dm0.mo66639c();
                            fl0 b2 = dm0.mo66638b();
                            if (!(c2 == null && b2 == null && (hd0 == null || !this.f42475a.mo67975a(hd0, map)))) {
                                arrayList.add(next2);
                            }
                        } else {
                            arrayList.add(next2);
                        }
                    } else {
                        if (this.f42475a.mo67975a((hd0) d, map)) {
                            arrayList.add(next2);
                        }
                    }
                }
                next.mo69412c((List<C13690k9>) arrayList);
            }
        }
    }
}
