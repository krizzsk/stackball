package com.yandex.mobile.ads.impl;

import java.util.Map;

public class i41 {

    /* renamed from: a */
    private final Map<String, Object> f34742a;

    public i41(Map<String, Object> map) {
        this.f34742a = map;
    }

    /* renamed from: a */
    public void mo67731a(String str, Object obj) {
        if (obj != null) {
            this.f34742a.put(str, obj);
        }
    }

    /* renamed from: b */
    public void mo67733b(String str, Object obj) {
        if (obj == null) {
            this.f34742a.put(str, "undefined");
        } else {
            this.f34742a.put(str, obj);
        }
    }

    /* renamed from: a */
    public void mo67730a(String str) {
        this.f34742a.put(str, "undefined");
    }

    /* renamed from: a */
    public void mo67732a(Map<String, Object> map) {
        this.f34742a.putAll(map);
    }

    /* renamed from: a */
    public Map<String, Object> mo67729a() {
        return this.f34742a;
    }
}
