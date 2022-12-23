package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.C12135y;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.Map;

public class wd0 {

    /* renamed from: a */
    private final sn0 f41958a;

    /* renamed from: b */
    private final C14645t1 f41959b;

    /* renamed from: c */
    private final C15232y3 f41960c = new C15232y3();

    /* renamed from: d */
    private AdResponse f41961d;

    /* renamed from: e */
    private h41.C13275a f41962e;

    public wd0(Context context, C14645t1 t1Var) {
        this.f41959b = t1Var;
        this.f41958a = sn0.m42091b(context);
    }

    /* renamed from: a */
    public void mo70677a(h41.C13276b bVar) {
        m43586a(bVar, m43584a());
    }

    /* renamed from: b */
    public void mo70679b(h41.C13276b bVar, Map<String, Object> map) {
        Map<String, Object> a = m43584a();
        a.putAll(map);
        m43586a(bVar, a);
    }

    /* renamed from: c */
    public void mo70680c(C12135y yVar) {
        m43586a(yVar.mo64678c(), m43585a(yVar));
    }

    /* renamed from: a */
    private void m43586a(h41.C13276b bVar, Map<String, Object> map) {
        this.f41958a.mo70035a(new h41(bVar, map));
    }

    /* renamed from: a */
    private Map<String, Object> m43585a(C12135y yVar) {
        Map<String, Object> a = m43584a();
        a.put(IronSourceConstants.EVENTS_ERROR_REASON, yVar.mo64680e().mo64681a());
        String a2 = yVar.mo64675a();
        if (!TextUtils.isEmpty(a2)) {
            a.put("asset_name", a2);
        }
        return a;
    }

    /* renamed from: b */
    public void mo70678b(C12135y yVar) {
        m43586a(yVar.mo64677b(), m43585a(yVar));
    }

    /* renamed from: a */
    private Map<String, Object> m43584a() {
        i41 i41 = new i41(new HashMap());
        i41.mo67733b("adapter", "Yandex");
        AdResponse adResponse = this.f41961d;
        if (adResponse != null) {
            i41.mo67733b("block_id", adResponse.mo64434n());
            i41.mo67733b("ad_unit_id", this.f41961d.mo64434n());
            i41.mo67733b("ad_type_format", this.f41961d.mo64433m());
            i41.mo67733b("product_type", this.f41961d.mo64446y());
            i41.mo67733b("ad_source", this.f41961d.mo64431k());
            C12115n l = this.f41961d.mo64432l();
            if (l != null) {
                i41.mo67733b("ad_type", l.mo64574a());
            } else {
                i41.mo67730a("ad_type");
            }
        } else {
            i41.mo67730a("block_id");
            i41.mo67730a("ad_unit_id");
            i41.mo67730a("ad_type_format");
            i41.mo67730a("product_type");
            i41.mo67730a("ad_source");
        }
        i41.mo67732a(this.f41960c.mo70991a(this.f41959b.mo70080a()));
        h41.C13275a aVar = this.f41962e;
        if (aVar != null) {
            i41.mo67732a(aVar.mo66063a());
        }
        return i41.mo67729a();
    }

    /* renamed from: a */
    public void mo70675a(AdResponse adResponse) {
        this.f41961d = adResponse;
    }

    /* renamed from: a */
    public void mo70676a(h41.C13275a aVar) {
        this.f41962e = aVar;
    }
}
