package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* renamed from: com.yandex.mobile.ads.impl.l8 */
public class C13837l8 {

    /* renamed from: a */
    private final NativeAdAssets f36556a;

    /* renamed from: b */
    private final yp1 f36557b = new yp1();

    /* renamed from: c */
    private final C13314he f36558c = new C13314he();

    /* renamed from: d */
    private final C14378qc f36559d = new C14378qc();

    /* renamed from: e */
    private final m21 f36560e = new m21();

    /* renamed from: f */
    private final ee1 f36561f = new ee1();

    /* renamed from: g */
    private final lc0 f36562g = new lc0();

    public C13837l8(NativeAdAssets nativeAdAssets) {
        this.f36556a = nativeAdAssets;
    }

    /* renamed from: a */
    public float mo68374a(Resources resources) {
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        float a = this.f36557b.mo71105a(resources, this.f36556a) + 0.0f + this.f36558c.mo67530a(resources, this.f36556a);
        C14378qc qcVar = this.f36559d;
        NativeAdAssets nativeAdAssets = this.f36556a;
        qcVar.getClass();
        if (nativeAdAssets.getBody() != null) {
            f = resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_body_height) + 0.0f + resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_body_margin_top);
        } else {
            f = 0.0f;
        }
        float f5 = a + f;
        m21 m21 = this.f36560e;
        NativeAdAssets nativeAdAssets2 = this.f36556a;
        m21.getClass();
        Float rating = nativeAdAssets2.getRating();
        String age = nativeAdAssets2.getAge();
        String domain = nativeAdAssets2.getDomain();
        if ((rating == null || rating.floatValue() == 0.0f) && age == null && domain == null) {
            f2 = 0.0f;
        } else {
            f2 = resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_rating_height) + 0.0f + resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_rating_margin_top);
        }
        float f6 = f5 + f2;
        ee1 ee1 = this.f36561f;
        NativeAdAssets nativeAdAssets3 = this.f36556a;
        ee1.getClass();
        if (nativeAdAssets3.getTitle() != null) {
            f3 = resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_title_height_base) + 0.0f + resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_title_margin_top);
        } else {
            f3 = 0.0f;
        }
        float f7 = f6 + f3;
        lc0 lc0 = this.f36562g;
        NativeAdAssets nativeAdAssets4 = this.f36556a;
        lc0.getClass();
        if (nativeAdAssets4.getIcon() != null) {
            f4 = 0.0f + resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_icon_size_base);
        }
        return f7 + f4;
    }

    /* renamed from: b */
    public float mo68375b(Resources resources) {
        float f;
        float f2 = 0.0f;
        float a = this.f36557b.mo71105a(resources, this.f36556a) + 0.0f + this.f36558c.mo67530a(resources, this.f36556a);
        C14378qc qcVar = this.f36559d;
        NativeAdAssets nativeAdAssets = this.f36556a;
        qcVar.getClass();
        if (nativeAdAssets.getBody() != null) {
            f = resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_body_height) + 0.0f + resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_body_margin_top);
        } else {
            f = 0.0f;
        }
        float f3 = a + f;
        lc0 lc0 = this.f36562g;
        NativeAdAssets nativeAdAssets2 = this.f36556a;
        lc0.getClass();
        if (nativeAdAssets2.getIcon() != null) {
            f2 = 0.0f + resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_icon_size_first_degradation);
        }
        return f3 + f2;
    }

    /* renamed from: c */
    public float mo68376c(Resources resources) {
        float f;
        float f2 = 0.0f;
        float a = this.f36557b.mo71105a(resources, this.f36556a) + 0.0f;
        C13314he heVar = this.f36558c;
        NativeAdAssets nativeAdAssets = this.f36556a;
        heVar.getClass();
        if (nativeAdAssets.getCallToAction() != null) {
            float dimension = resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_call_to_action_height);
            f = dimension + 0.0f + resources.getDimension(C12066R.dimen.f29011xf89b260d) + resources.getDimension(C12066R.dimen.f29014xfc0b9c3);
        } else {
            f = 0.0f;
        }
        float f3 = a + f;
        lc0 lc0 = this.f36562g;
        NativeAdAssets nativeAdAssets2 = this.f36556a;
        lc0.getClass();
        if (nativeAdAssets2.getIcon() != null) {
            f2 = 0.0f + resources.getDimension(C12066R.dimen.yandex_ads_internal_app_install_icon_size_first_degradation);
        }
        return f3 + f2;
    }
}
