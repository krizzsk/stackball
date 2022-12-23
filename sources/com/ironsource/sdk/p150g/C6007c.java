package com.ironsource.sdk.p150g;

import com.ironsource.sdk.p153j.C6025a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.g.c */
public final class C6007c {

    /* renamed from: a */
    public String f14736a;

    /* renamed from: b */
    public String f14737b;

    /* renamed from: c */
    public int f14738c = -1;

    /* renamed from: d */
    public Map<String, String> f14739d;

    /* renamed from: e */
    public int f14740e;

    /* renamed from: f */
    public boolean f14741f;

    /* renamed from: g */
    public C6025a f14742g;

    public C6007c(String str, String str2, Map<String, String> map, C6025a aVar) {
        this.f14737b = str;
        this.f14736a = str2;
        this.f14739d = map;
        this.f14742g = aVar;
        this.f14740e = 0;
        this.f14741f = false;
    }

    /* renamed from: a */
    public final Map<String, String> mo42547a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f14737b);
        hashMap.put("demandSourceName", this.f14736a);
        Map<String, String> map = this.f14739d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final synchronized void mo42548a(int i) {
        this.f14740e = i;
    }
}
