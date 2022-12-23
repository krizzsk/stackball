package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.C12135y;
import java.util.HashMap;
import java.util.Map;

public class zo1 {

    /* renamed from: a */
    private final Map<C12135y.C12136a, String> f43249a = new C15335a(this);

    /* renamed from: com.yandex.mobile.ads.impl.zo1$a */
    class C15335a extends HashMap<C12135y.C12136a, String> {
        C15335a(zo1 zo1) {
            put(C12135y.C12136a.AD_NOT_LOADED, "Ad is not loaded");
            put(C12135y.C12136a.APPLICATION_INACTIVE, "Screen is locked");
            put(C12135y.C12136a.INCONSISTENT_ASSET_VALUE, "Asset value %s doesn't match view value");
            put(C12135y.C12136a.NO_AD_VIEW, "No ad view");
            put(C12135y.C12136a.NO_VISIBLE_ADS, "No valid ads in ad unit");
            put(C12135y.C12136a.NO_VISIBLE_REQUIRED_ASSETS, "No visible required assets");
            put(C12135y.C12136a.NOT_ADDED_TO_HIERARCHY, "Ad view is not added to hierarchy");
            put(C12135y.C12136a.NOT_VISIBLE_FOR_PERCENT, "Ad is not visible for percent");
            put(C12135y.C12136a.REQUIRED_ASSET_CAN_NOT_BE_VISIBLE, "Required asset %s is not visible in ad view");
            put(C12135y.C12136a.REQUIRED_ASSET_IS_NOT_SUBVIEW, "Required asset %s is not subview of ad view");
            put(C12135y.C12136a.SUCCESS, "Unknown error, that shouldn't happen");
            put(C12135y.C12136a.SUPERVIEW_HIDDEN, "Ad view is hidden");
            put(C12135y.C12136a.TOO_SMALL, "View is too small");
            put(C12135y.C12136a.VISIBLE_AREA_TOO_SMALL, "Visible area of an ad view is too small");
        }
    }

    /* renamed from: a */
    public String mo71269a(C12135y yVar) {
        String a = yVar.mo64675a();
        String str = this.f43249a.get(yVar.mo64680e());
        if (str == null) {
            return "Visibility error";
        }
        return String.format(str, new Object[]{a});
    }
}
