package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* renamed from: com.yandex.mobile.ads.impl.g7 */
public class C13178g7<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final NativeAdAssets f33895a;

    /* renamed from: b */
    private final kr0 f33896b = new kr0();

    public C13178g7(NativeAdAssets nativeAdAssets) {
        this.f33895a = nativeAdAssets;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        this.f33896b.getClass();
        View findViewById = v.findViewById(C12066R.C12068id.age_divider);
        if (findViewById != null && this.f33895a.getAge() == null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: c */
    public void mo65685c() {
    }
}
