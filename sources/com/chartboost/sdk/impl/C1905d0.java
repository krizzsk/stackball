package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.chartboost.sdk.impl.d0 */
public class C1905d0 {

    /* renamed from: a */
    private String f4773a;

    /* renamed from: b */
    private String f4774b;

    /* renamed from: c */
    private String f4775c;

    /* renamed from: d */
    private String f4776d;

    /* renamed from: e */
    private List<String> f4777e;

    public C1905d0() {
        this.f4773a = "";
        this.f4774b = "";
        this.f4775c = "";
        this.f4776d = "";
        this.f4777e = new ArrayList();
    }

    /* renamed from: a */
    public String mo14572a() {
        return this.f4774b;
    }

    /* renamed from: b */
    public String mo14573b() {
        return this.f4775c;
    }

    /* renamed from: c */
    public String mo14574c() {
        return this.f4773a;
    }

    /* renamed from: d */
    public List<String> mo14575d() {
        return this.f4777e;
    }

    /* renamed from: e */
    public String mo14576e() {
        return this.f4776d;
    }

    public String toString() {
        return "crtype: " + this.f4773a + "\ncgn: " + this.f4775c + "\ntemplate: " + this.f4776d + "\nimptrackers: " + this.f4777e.size() + "\nadId: " + this.f4774b;
    }

    public C1905d0(String str, String str2, String str3, String str4, List<String> list) {
        this.f4773a = str;
        this.f4774b = str2;
        this.f4775c = str3;
        this.f4776d = str4;
        this.f4777e = list;
    }
}
