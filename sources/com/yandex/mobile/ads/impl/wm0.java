package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.impl.h41;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class wm0 {

    /* renamed from: a */
    private final C14645t1 f42056a;

    /* renamed from: b */
    private final C15232y3 f42057b = new C15232y3();

    /* renamed from: c */
    private final AdResponse f42058c;

    public wm0(C14645t1 t1Var, AdResponse adResponse) {
        this.f42056a = t1Var;
        this.f42058c = adResponse;
    }

    /* renamed from: a */
    public void mo70721a(Context context, hn0 hn0, Map<String, Object> map) {
        m43704a(context, h41.C13276b.ADAPTER_INVALID, hn0, map);
    }

    /* renamed from: b */
    public void mo70722b(Context context, hn0 hn0) {
        m43704a(context, h41.C13276b.ADAPTER_REQUEST, hn0, Collections.emptyMap());
    }

    /* renamed from: c */
    public void mo70724c(Context context, hn0 hn0, Map<String, Object> map) {
        m43704a(context, h41.C13276b.CLICK, hn0, map);
    }

    /* renamed from: d */
    public void mo70725d(Context context, hn0 hn0, Map<String, Object> map) {
        m43704a(context, h41.C13276b.IMPRESSION_TRACKING_START, hn0, map);
        m43704a(context, h41.C13276b.IMPRESSION_TRACKING_SUCCESS, hn0, map);
    }

    /* renamed from: e */
    public void mo70726e(Context context, hn0 hn0, Map<String, Object> map) {
        m43704a(context, h41.C13276b.ADAPTER_ACTION, hn0, map);
    }

    /* renamed from: f */
    public void mo70727f(Context context, hn0 hn0, Map<String, Object> map) {
        m43704a(context, h41.C13276b.ADAPTER_AUTO_REFRESH, hn0, map);
    }

    /* renamed from: g */
    public void mo70728g(Context context, hn0 hn0, Map<String, Object> map) {
        m43704a(context, h41.C13276b.ADAPTER_RESPONSE, hn0, map);
    }

    /* renamed from: h */
    public void mo70729h(Context context, hn0 hn0, Map<String, Object> map) {
        m43704a(context, h41.C13276b.ADAPTER_BIDDER_TOKEN_REQUEST, hn0, map);
    }

    /* renamed from: a */
    public void mo70720a(Context context, hn0 hn0, AdResponse adResponse) {
        RewardData A;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (!(adResponse == null || (A = adResponse.mo64410A()) == null)) {
            hashMap2.put("rewarding_side", A.mo64561e() ? "server_side" : "client_side");
        }
        hashMap.put("reward_info", hashMap2);
        m43704a(context, h41.C13276b.REWARD, hn0, hashMap);
    }

    /* renamed from: b */
    public void mo70723b(Context context, hn0 hn0, Map<String, Object> map) {
        m43704a(context, h41.C13276b.RENDERING_START, hn0, map);
    }

    /* renamed from: a */
    public void mo70719a(Context context, hn0 hn0) {
        m43704a(context, h41.C13276b.RENDERING_START, hn0, Collections.emptyMap());
    }

    /* renamed from: a */
    private void m43704a(Context context, h41.C13276b bVar, hn0 hn0, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_unit_id", this.f42056a.mo70096c());
        hashMap.put("block_id", this.f42056a.mo70096c());
        hashMap.put("ad_type", this.f42056a.mo70092b().mo64574a());
        hashMap.put("adapter", hn0.mo67571c());
        hashMap.put("adapter_parameters", hn0.mo67576g());
        hashMap.putAll(this.f42057b.mo70991a(this.f42056a.mo70080a()));
        i41 i41 = new i41(hashMap);
        AdResponse adResponse = this.f42058c;
        i41.mo67733b("ad_source", adResponse != null ? adResponse.mo64431k() : null);
        Map<String, Object> a = i41.mo67729a();
        a.putAll(map);
        sn0.m42091b(context).mo70035a(new h41(bVar, a));
    }
}
