package com.applovin.impl.sdk.utils;

/* renamed from: com.applovin.impl.sdk.utils.k */
public class C1549k {

    /* renamed from: a */
    private final StringBuilder f3775a = new StringBuilder();

    /* renamed from: a */
    public C1549k mo13334a() {
        this.f3775a.append("\n========================================");
        return this;
    }

    /* renamed from: a */
    public C1549k mo13335a(String str) {
        StringBuilder sb = this.f3775a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    /* renamed from: a */
    public C1549k mo13336a(String str, Object obj) {
        return mo13337a(str, obj, "");
    }

    /* renamed from: a */
    public C1549k mo13337a(String str, Object obj, String str2) {
        StringBuilder sb = this.f3775a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    public String toString() {
        return this.f3775a.toString();
    }
}
