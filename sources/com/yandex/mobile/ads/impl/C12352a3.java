package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.a3 */
public class C12352a3 {

    /* renamed from: a */
    private final sn0 f30431a;

    /* renamed from: b */
    private final C15290z2 f30432b;

    /* renamed from: c */
    private h41.C13275a f30433c;

    /* renamed from: d */
    private h41.C13275a f30434d;

    public C12352a3(Context context, C15230y2 y2Var) {
        this.f30431a = sn0.m42091b(context);
        this.f30432b = new C15290z2(y2Var);
    }

    /* renamed from: a */
    public void mo65658a(h41.C13275a aVar) {
        this.f30434d = aVar;
    }

    /* renamed from: b */
    public void mo65660b(h41.C13275a aVar) {
        this.f30433c = aVar;
    }

    /* renamed from: a */
    public void mo65657a() {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "success");
        hashMap.putAll(this.f30432b.mo71149a());
        m33592a((Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public void mo65659a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "error");
        hashMap.put("failure_reason", str);
        hashMap.putAll(this.f30432b.mo71149a());
        m33592a((Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    private void m33592a(Map<String, Object> map) {
        h41.C13275a aVar = this.f30433c;
        if (aVar != null) {
            map.putAll(aVar.mo66063a());
        }
        h41.C13275a aVar2 = this.f30434d;
        if (aVar2 != null) {
            map.putAll(aVar2.mo66063a());
        }
        this.f30431a.mo70035a(new h41(h41.C13276b.AD_LOADING_RESULT, map));
    }
}
