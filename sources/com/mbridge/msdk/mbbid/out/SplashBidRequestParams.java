package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6349m;

public class SplashBidRequestParams extends BannerBidRequestParams {

    /* renamed from: b */
    private static int f16284b = 1;

    /* renamed from: c */
    private static int f16285c;

    /* renamed from: d */
    private static int f16286d;

    /* renamed from: a */
    private boolean f16287a;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, f16284b, f16286d, f16285c);
    }

    public SplashBidRequestParams(String str, String str2, boolean z, int i, int i2, int i3) {
        this(str, str2, "", z, i, i3, i2);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        super(str, str2, str3, 0, 0);
        this.f16287a = false;
        f16284b = i;
        int h = C6349m.m16111h(C6122a.m15302b().mo42895d());
        int i4 = C6349m.m16112i(C6122a.m15302b().mo42895d());
        int i5 = f16284b;
        if (i5 == 1) {
            if (i4 > i3 * 4) {
                setHeight(i4 - i3);
                setWidth(h);
            } else {
                setHeight(0);
                setWidth(0);
            }
        } else if (i5 == 2) {
            if (h > i2 * 4) {
                setWidth(h - i2);
                setHeight(i4);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
        this.f16287a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo44402a() {
        return this.f16287a;
    }

    public int getOrientation() {
        return f16284b;
    }
}
