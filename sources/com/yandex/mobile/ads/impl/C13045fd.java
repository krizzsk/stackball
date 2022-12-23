package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.fd */
public interface C13045fd {

    /* renamed from: com.yandex.mobile.ads.impl.fd$a */
    public static class C13046a {

        /* renamed from: a */
        public byte[] f33319a;

        /* renamed from: b */
        public String f33320b;

        /* renamed from: c */
        public long f33321c;

        /* renamed from: d */
        public long f33322d;

        /* renamed from: e */
        public long f33323e;

        /* renamed from: f */
        public long f33324f;

        /* renamed from: g */
        public Map<String, String> f33325g = Collections.emptyMap();

        /* renamed from: h */
        public List<n90> f33326h;

        /* renamed from: a */
        public boolean mo66993a() {
            return this.f33323e < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    C13046a mo66989a(String str);

    /* renamed from: a */
    void mo66990a();

    /* renamed from: a */
    void mo66991a(String str, C13046a aVar);

    /* renamed from: a */
    void mo66992a(String str, boolean z);
}
