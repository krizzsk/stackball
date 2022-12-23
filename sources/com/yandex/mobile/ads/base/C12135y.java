package com.yandex.mobile.ads.base;

import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.j41;

/* renamed from: com.yandex.mobile.ads.base.y */
public class C12135y {

    /* renamed from: a */
    private final C12136a f29399a;

    /* renamed from: b */
    private final j41 f29400b;

    /* renamed from: c */
    private String f29401c;

    /* renamed from: com.yandex.mobile.ads.base.y$a */
    public enum C12136a {
        SUCCESS("success"),
        AD_NOT_LOADED("ad_not_loaded"),
        APPLICATION_INACTIVE("application_inactive"),
        INCONSISTENT_ASSET_VALUE("inconsistent_asset_value"),
        NO_AD_VIEW("no_ad_view"),
        NO_VISIBLE_ADS("no_visible_ads"),
        NO_VISIBLE_REQUIRED_ASSETS("no_visible_required_assets"),
        NOT_ADDED_TO_HIERARCHY("not_added_to_hierarchy"),
        NOT_VISIBLE_FOR_PERCENT("not_visible_for_percent"),
        REQUIRED_ASSET_CAN_NOT_BE_VISIBLE("required_asset_can_not_be_visible"),
        REQUIRED_ASSET_IS_NOT_SUBVIEW("required_asset_is_not_subview"),
        SUPERVIEW_HIDDEN("superview_hidden"),
        TOO_SMALL("too_small"),
        VISIBLE_AREA_TOO_SMALL("visible_area_too_small");
        

        /* renamed from: b */
        private final String f29417b;

        private C12136a(String str) {
            this.f29417b = str;
        }

        /* renamed from: a */
        public String mo64681a() {
            return this.f29417b;
        }
    }

    public C12135y(C12136a aVar, j41 j41) {
        this.f29399a = aVar;
        this.f29400b = j41;
    }

    /* renamed from: a */
    public String mo64675a() {
        return this.f29401c;
    }

    /* renamed from: b */
    public h41.C13276b mo64677b() {
        return this.f29400b.mo67924a();
    }

    /* renamed from: c */
    public final h41.C13276b mo64678c() {
        return this.f29400b.mo67925a(this.f29399a);
    }

    /* renamed from: d */
    public final h41.C13276b mo64679d() {
        return this.f29400b.mo67926b();
    }

    /* renamed from: e */
    public C12136a mo64680e() {
        return this.f29399a;
    }

    /* renamed from: a */
    public void mo64676a(String str) {
        this.f29401c = str;
    }
}
