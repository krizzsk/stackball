package com.p243my.target;

import android.view.View;
import com.p243my.target.nativeads.NativeAd;
import com.p243my.target.nativeads.banners.NativePromoBanner;
import com.p243my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.q0 */
public interface C7616q0 {
    /* renamed from: a */
    void mo49698a(View view, List<View> list, int i, MediaAdView mediaAdView);

    /* renamed from: a */
    void mo49701a(NativeAd.NativeAdMediaListener nativeAdMediaListener);

    /* renamed from: c */
    String mo50105c();

    /* renamed from: d */
    float mo50106d();

    /* renamed from: g */
    NativePromoBanner mo49704g();

    void unregisterView();
}
