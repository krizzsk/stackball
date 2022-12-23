package com.p243my.target;

import android.view.View;
import com.p243my.target.nativeads.NativeBannerAd;
import com.p243my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.r0 */
public interface C7630r0 {
    /* renamed from: a */
    void mo49783a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener);

    /* renamed from: c */
    String mo50271c();

    /* renamed from: d */
    float mo50272d();

    /* renamed from: h */
    NativeBanner mo49786h();

    void registerView(View view, List<View> list, int i);

    void unregisterView();
}
