package com.yandex.mobile.ads.impl;

import java.util.Map;

public class g10 {

    /* renamed from: a */
    private final int f33829a;

    /* renamed from: b */
    private final Map<String, C13157a> f33830b;

    /* renamed from: com.yandex.mobile.ads.impl.g10$a */
    interface C13157a {
    }

    g10(int i, Map<String, C13157a> map) {
        this.f33829a = i;
        this.f33830b = map;
    }

    /* renamed from: a */
    public <T extends C13157a> T mo67144a(String str) {
        return (C13157a) this.f33830b.get(str);
    }

    /* renamed from: b */
    public int mo67147b() {
        return this.f33829a;
    }

    /* renamed from: a */
    public <T extends C13157a> void mo67146a(String str, T t) {
        this.f33830b.put(str, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, C13157a> mo67145a() {
        return this.f33830b;
    }
}
