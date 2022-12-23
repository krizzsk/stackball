package com.yandex.mobile.ads.nativeads.template;

import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.nativeads.C15511m0;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdType;

/* renamed from: com.yandex.mobile.ads.nativeads.template.e */
public class C15547e {

    /* renamed from: a */
    private final C15511m0 f44072a;

    /* renamed from: b */
    private final String f44073b;

    /* renamed from: c */
    private final NativeAdImage f44074c;

    /* renamed from: d */
    private final Float f44075d;

    /* renamed from: e */
    private final String f44076e;

    /* renamed from: f */
    private final String f44077f;

    public C15547e(NativeAdAssets nativeAdAssets, NativeAdType nativeAdType) {
        this.f44073b = nativeAdAssets.getCallToAction();
        this.f44074c = nativeAdAssets.getImage();
        this.f44075d = nativeAdAssets.getRating();
        this.f44076e = nativeAdAssets.getReviewCount();
        this.f44077f = nativeAdAssets.getWarning();
        this.f44072a = new mt0().mo68857a(nativeAdType);
    }

    /* renamed from: a */
    private boolean m45355a() {
        return this.f44073b != null;
    }

    /* renamed from: d */
    private boolean m45356d() {
        return !((this.f44075d == null && this.f44076e == null) ? false : true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo71909b() {
        return m45355a() && (C15511m0.CONTENT == this.f44072a || m45356d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo71910c() {
        NativeAdImage nativeAdImage = this.f44074c;
        return nativeAdImage != null && ("large".equals(nativeAdImage.mo71532a()) || "wide".equals(this.f44074c.mo71532a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo71911e() {
        if (!m45355a()) {
            if ((this.f44075d == null && this.f44076e == null) ? false : true) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo71912f() {
        return m45355a() && (mo71909b() || mo71910c());
    }

    /* renamed from: g */
    public boolean mo71913g() {
        return this.f44077f != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo71914h() {
        return mo71909b() || (mo71910c() && m45356d());
    }
}
