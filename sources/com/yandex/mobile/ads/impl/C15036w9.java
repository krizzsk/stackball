package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.w9 */
public class C15036w9 {

    /* renamed from: a */
    private final C14157o0 f41899a;

    /* renamed from: b */
    private final C12115n f41900b;

    /* renamed from: c */
    private final C13274h4 f41901c;

    /* renamed from: d */
    private h41.C13275a f41902d;

    /* renamed from: e */
    private final String f41903e;

    public C15036w9(C14646t2 t2Var, C12115n nVar, String str) {
        this.f41899a = t2Var.mo68852a();
        this.f41901c = t2Var.mo68853b();
        this.f41900b = nVar;
        this.f41903e = str;
    }

    /* renamed from: a */
    public void mo70665a(h41.C13275a aVar) {
        this.f41902d = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map<String, Object> mo70664a() {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("ad_type", this.f41900b.mo64574a());
        i41.mo67731a("ad_id", this.f41903e);
        i41.mo67732a(this.f41899a.mo69092a());
        i41.mo67732a(this.f41901c.mo67398a());
        h41.C13275a aVar = this.f41902d;
        if (aVar != null) {
            i41.mo67732a(aVar.mo66063a());
        }
        return i41.mo67729a();
    }
}
