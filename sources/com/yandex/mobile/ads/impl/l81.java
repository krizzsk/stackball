package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.List;

public class l81 {

    /* renamed from: a */
    private final C15232y3 f36563a = new C15232y3();

    /* renamed from: b */
    private final sn0 f36564b;

    /* renamed from: c */
    private final AdResponse f36565c;

    /* renamed from: d */
    private final C14645t1 f36566d;

    /* renamed from: e */
    private final h41.C13275a f36567e;

    public l81(Context context, C14645t1 t1Var, AdResponse adResponse, h41.C13275a aVar) {
        this.f36566d = t1Var;
        this.f36565c = adResponse;
        this.f36567e = aVar;
        this.f36564b = sn0.m42091b(context);
    }

    /* renamed from: a */
    public void mo68377a(List<ha1> list) {
        i41 i41 = new i41(new HashMap());
        C12115n l = this.f36565c.mo64432l();
        if (l != null) {
            i41.mo67733b("ad_type", l.mo64574a());
        } else {
            i41.mo67730a("ad_type");
        }
        i41.mo67733b("block_id", this.f36565c.mo64434n());
        i41.mo67733b("ad_unit_id", this.f36565c.mo64434n());
        i41.mo67733b("adapter", "Yandex");
        i41.mo67733b("ad_type_format", this.f36565c.mo64433m());
        i41.mo67733b("product_type", this.f36565c.mo64446y());
        i41.mo67733b("ad_source", this.f36565c.mo64431k());
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i).mo67505b();
        }
        i41.mo67733b("social_actions", strArr);
        i41.mo67732a(this.f36563a.mo70991a(this.f36566d.mo70080a()));
        h41.C13275a aVar = this.f36567e;
        if (aVar != null) {
            i41.mo67732a(aVar.mo66063a());
        }
        this.f36564b.mo70035a(new h41(h41.C13276b.SHOW_SOCIAL_ACTIONS, i41.mo67729a()));
    }
}
