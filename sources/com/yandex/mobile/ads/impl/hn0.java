package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.List;
import java.util.Map;

public final class hn0 {

    /* renamed from: a */
    private final String f34473a;

    /* renamed from: b */
    private final Map<String, String> f34474b;

    /* renamed from: c */
    private final List<String> f34475c;

    /* renamed from: d */
    private final List<String> f34476d;

    /* renamed from: e */
    private final List<String> f34477e;

    /* renamed from: f */
    private final AdImpressionData f34478f;

    /* renamed from: g */
    private final Map<String, String> f34479g;

    /* renamed from: com.yandex.mobile.ads.impl.hn0$b */
    public static class C13336b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f34480a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Map<String, String> f34481b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public List<String> f34482c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public List<String> f34483d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public List<String> f34484e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public AdImpressionData f34485f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Map<String, String> f34486g;

        public C13336b(String str, Map<String, String> map) {
            this.f34480a = str;
            this.f34481b = map;
        }

        /* renamed from: a */
        public hn0 mo67581a() {
            return new hn0(this);
        }

        /* renamed from: b */
        public C13336b mo67582b(List<String> list) {
            this.f34483d = list;
            return this;
        }

        /* renamed from: c */
        public C13336b mo67583c(List<String> list) {
            this.f34482c = list;
            return this;
        }

        /* renamed from: a */
        public C13336b mo67579a(List<String> list) {
            this.f34484e = list;
            return this;
        }

        /* renamed from: a */
        public C13336b mo67578a(AdImpressionData adImpressionData) {
            this.f34485f = adImpressionData;
            return this;
        }

        /* renamed from: a */
        public C13336b mo67580a(Map<String, String> map) {
            this.f34486g = map;
            return this;
        }
    }

    /* renamed from: a */
    public AdImpressionData mo67569a() {
        return this.f34478f;
    }

    /* renamed from: b */
    public List<String> mo67570b() {
        return this.f34477e;
    }

    /* renamed from: c */
    public String mo67571c() {
        return this.f34473a;
    }

    /* renamed from: d */
    public Map<String, String> mo67572d() {
        return this.f34479g;
    }

    /* renamed from: e */
    public List<String> mo67573e() {
        return this.f34476d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hn0.class != obj.getClass()) {
            return false;
        }
        hn0 hn0 = (hn0) obj;
        if (!this.f34473a.equals(hn0.f34473a) || !this.f34474b.equals(hn0.f34474b)) {
            return false;
        }
        List<String> list = this.f34475c;
        if (list == null ? hn0.f34475c != null : !list.equals(hn0.f34475c)) {
            return false;
        }
        List<String> list2 = this.f34476d;
        if (list2 == null ? hn0.f34476d != null : !list2.equals(hn0.f34476d)) {
            return false;
        }
        AdImpressionData adImpressionData = this.f34478f;
        if (adImpressionData == null ? hn0.f34478f != null : !adImpressionData.equals(hn0.f34478f)) {
            return false;
        }
        Map<String, String> map = this.f34479g;
        if (map == null ? hn0.f34479g != null : !map.equals(hn0.f34479g)) {
            return false;
        }
        List<String> list3 = this.f34477e;
        if (list3 != null) {
            return list3.equals(hn0.f34477e);
        }
        if (hn0.f34477e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<String> mo67575f() {
        return this.f34475c;
    }

    /* renamed from: g */
    public Map<String, String> mo67576g() {
        return this.f34474b;
    }

    public int hashCode() {
        int hashCode = ((this.f34473a.hashCode() * 31) + this.f34474b.hashCode()) * 31;
        List<String> list = this.f34475c;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f34476d;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f34477e;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        AdImpressionData adImpressionData = this.f34478f;
        int hashCode5 = (hashCode4 + (adImpressionData != null ? adImpressionData.hashCode() : 0)) * 31;
        Map<String, String> map = this.f34479g;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode5 + i;
    }

    private hn0(C13336b bVar) {
        this.f34473a = bVar.f34480a;
        this.f34474b = bVar.f34481b;
        this.f34475c = bVar.f34482c;
        this.f34476d = bVar.f34483d;
        this.f34477e = bVar.f34484e;
        this.f34478f = bVar.f34485f;
        this.f34479g = bVar.f34486g;
    }
}
