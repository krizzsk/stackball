package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.util.Set;

public final class m60 {

    /* renamed from: a */
    private final Set<String> f37202a;

    public m60(NativeAdAssets nativeAdAssets) {
        this.f37202a = new C15038wa().mo70667a(nativeAdAssets);
    }

    /* renamed from: a */
    public boolean mo68580a() {
        boolean z = this.f37202a.contains("feedback") && this.f37202a.contains("media");
        if (this.f37202a.size() != 2 || !z) {
            return false;
        }
        return true;
    }
}
