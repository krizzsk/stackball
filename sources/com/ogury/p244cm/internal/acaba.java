package com.ogury.p244cm.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;

/* renamed from: com.ogury.cm.internal.acaba */
public final class acaba {

    /* renamed from: a */
    private String f20525a = "";

    /* renamed from: b */
    private String f20526b = "";

    /* renamed from: c */
    private String f20527c = "";

    /* renamed from: d */
    private acabb f20528d;

    /* renamed from: e */
    private ArrayList<babbc<String, String>> f20529e;

    /* renamed from: a */
    public final acaba mo52734a(acabb acabb) {
        this.f20528d = acabb;
        return this;
    }

    /* renamed from: a */
    public final acaba mo52735a(String str) {
        bbabc.m22051b(str, "requestMethod");
        this.f20525a = str;
        return this;
    }

    /* renamed from: a */
    public final acaba mo52736a(String str, String str2) {
        bbabc.m22051b(str, SDKConstants.PARAM_KEY);
        bbabc.m22051b(str2, "value");
        if (this.f20529e == null) {
            this.f20529e = new ArrayList<>();
        }
        babbc babbc = new babbc(str, str2);
        ArrayList<babbc<String, String>> arrayList = this.f20529e;
        if (arrayList != null) {
            arrayList.add(babbc);
        }
        return this;
    }

    /* renamed from: a */
    public final String mo52737a() {
        return this.f20525a;
    }

    /* renamed from: b */
    public final acaba mo52738b(String str) {
        bbabc.m22051b(str, "requestBody");
        this.f20526b = str;
        return this;
    }

    /* renamed from: b */
    public final String mo52739b() {
        return this.f20526b;
    }

    /* renamed from: c */
    public final acaba mo52740c(String str) {
        bbabc.m22051b(str, "url");
        this.f20527c = str;
        return this;
    }

    /* renamed from: c */
    public final String mo52741c() {
        return this.f20527c;
    }

    /* renamed from: d */
    public final acabb mo52742d() {
        return this.f20528d;
    }

    /* renamed from: e */
    public final ArrayList<babbc<String, String>> mo52743e() {
        return this.f20529e;
    }

    /* renamed from: f */
    public final abccc mo52744f() {
        return new abccc(this);
    }
}
