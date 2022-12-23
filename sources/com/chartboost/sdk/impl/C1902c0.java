package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.c0 */
public class C1902c0 {

    /* renamed from: a */
    private String f4764a;

    /* renamed from: b */
    private String f4765b;

    /* renamed from: c */
    private Double f4766c;

    /* renamed from: d */
    private String f4767d;

    /* renamed from: e */
    private String f4768e;

    /* renamed from: f */
    private String f4769f;

    /* renamed from: g */
    private C1905d0 f4770g;

    public C1902c0() {
        this.f4764a = "";
        this.f4765b = "";
        this.f4766c = Double.valueOf(0.0d);
        this.f4767d = "";
        this.f4768e = "";
        this.f4769f = "";
        this.f4770g = new C1905d0();
    }

    /* renamed from: a */
    public String mo14567a() {
        return this.f4769f;
    }

    /* renamed from: b */
    public String mo14568b() {
        return this.f4768e;
    }

    /* renamed from: c */
    public C1905d0 mo14569c() {
        return this.f4770g;
    }

    public String toString() {
        return "id: " + this.f4764a + "\nimpid: " + this.f4765b + "\nprice: " + this.f4766c + "\nburl: " + this.f4767d + "\ncrid: " + this.f4768e + "\nadm: " + this.f4769f + "\next: " + this.f4770g.toString() + "\n";
    }

    public C1902c0(String str, String str2, Double d, String str3, String str4, String str5, C1905d0 d0Var) {
        this.f4764a = str;
        this.f4765b = str2;
        this.f4766c = d;
        this.f4767d = str3;
        this.f4768e = str4;
        this.f4769f = str5;
        this.f4770g = d0Var;
    }
}
