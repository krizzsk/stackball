package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.nativeads.C15511m0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pr1 {

    /* renamed from: a */
    private final C15232y3 f38810a = new C15232y3();

    /* renamed from: b */
    private C14645t1 f38811b;

    public pr1(C14645t1 t1Var) {
        this.f38811b = t1Var;
    }

    /* renamed from: a */
    public void mo69425a(Context context, AdResponse adResponse, h41.C13275a aVar) {
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            hashMap.putAll(aVar.mo66063a());
        }
        m40941a(context, adResponse, h41.C13276b.ADAPTER_REQUEST, hashMap);
    }

    /* renamed from: b */
    public void mo69426b(Context context, AdResponse adResponse, h41.C13275a aVar) {
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            hashMap.putAll(aVar.mo66063a());
        }
        hashMap.put("status", h41.C13277c.SUCCESS.mo67417a());
        m40941a(context, adResponse, h41.C13276b.ADAPTER_RESPONSE, hashMap);
    }

    /* renamed from: a */
    public void mo69424a(Context context, AdResponse adResponse) {
        RewardData A;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (!(adResponse == null || (A = adResponse.mo64410A()) == null)) {
            hashMap2.put("rewarding_side", A.mo64561e() ? "server_side" : "client_side");
        }
        hashMap.put("reward_info", hashMap2);
        m40941a(context, adResponse, h41.C13276b.REWARD, hashMap);
    }

    /* renamed from: a */
    private void m40941a(Context context, AdResponse adResponse, h41.C13276b bVar, Map<String, Object> map) {
        C15511m0 g;
        HashMap hashMap = new HashMap();
        hashMap.put("ad_unit_id", adResponse.mo64434n());
        hashMap.put("block_id", adResponse.mo64434n());
        hashMap.put("adapter", "Yandex");
        C12115n l = adResponse.mo64432l();
        hashMap.put("ad_type", l != null ? l.mo64574a() : null);
        hashMap.putAll(this.f38810a.mo70991a(this.f38811b.mo70080a()));
        if (adResponse.mo64447z() instanceof as0) {
            List<pq0> c = ((as0) adResponse.mo64447z()).mo65856c();
            hashMap.put("native_ad_type", (c == null || c.isEmpty() || (g = c.get(0).mo69419g()) == null) ? "" : g.mo71709a());
        }
        i41 i41 = new i41(hashMap);
        i41.mo67733b("ad_source", adResponse.mo64431k());
        Map<String, Object> a = i41.mo67729a();
        a.putAll(map);
        sn0.m42091b(context).mo70035a(new h41(bVar, a));
    }
}
