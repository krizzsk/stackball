package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.dm0;
import com.yandex.mobile.ads.impl.fl0;
import com.yandex.mobile.ads.impl.hd0;
import com.yandex.mobile.ads.impl.kj1;
import com.yandex.mobile.ads.impl.tl1;
import com.yandex.mobile.ads.impl.zp0;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.r */
class C15522r {

    /* renamed from: a */
    private final tl1 f43941a = new tl1();

    /* renamed from: b */
    private final zp0 f43942b = new zp0();

    C15522r() {
    }

    /* renamed from: a */
    public NativeAdMedia mo71740a(dm0 dm0) {
        if (dm0 == null) {
            return null;
        }
        kj1 c = dm0.mo66639c();
        fl0 b = dm0.mo66638b();
        List<hd0> a = dm0.mo66637a();
        if (c != null) {
            return new NativeAdMedia(this.f43941a.mo70204a(c.mo68242a()));
        }
        if (a != null && a.size() > 1) {
            return new NativeAdMedia((float) this.f43942b.mo71270a(a));
        }
        if (b != null) {
            return new NativeAdMedia(b.mo67027a());
        }
        return null;
    }
}
