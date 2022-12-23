package com.ogury.p245ed.internal;

import com.ogury.p245ed.OguryBannerAdSize;

/* renamed from: com.ogury.ed.internal.a */
public final class C8005a {

    /* renamed from: a */
    public static final C8005a f20804a = new C8005a();

    /* renamed from: com.ogury.ed.internal.a$a */
    public /* synthetic */ class C8006a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20805a;

        static {
            int[] iArr = new int[OguryBannerAdSize.values().length];
            iArr[OguryBannerAdSize.MPU_300x250.ordinal()] = 1;
            iArr[OguryBannerAdSize.SMALL_BANNER_320x50.ordinal()] = 2;
            f20805a = iArr;
        }
    }

    private C8005a() {
    }

    /* renamed from: a */
    public static C8193ej m22255a(OguryBannerAdSize oguryBannerAdSize) {
        if (oguryBannerAdSize == null) {
            return null;
        }
        int i = C8006a.f20805a[oguryBannerAdSize.ordinal()];
        if (i == 1) {
            return C8193ej.MEDIUM_RECTANGLE;
        }
        if (i == 2) {
            return C8193ej.SMALL_BANNER;
        }
        throw new C8379jy();
    }

    /* renamed from: b */
    public static C8109cn m22256b(OguryBannerAdSize oguryBannerAdSize) {
        if (oguryBannerAdSize == null) {
            return new C8109cn(0, 0);
        }
        return new C8109cn(C8258gi.m23195b(oguryBannerAdSize.getWidth()), C8258gi.m23195b(oguryBannerAdSize.getHeight()));
    }
}
