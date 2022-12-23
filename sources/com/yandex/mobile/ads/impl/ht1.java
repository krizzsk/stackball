package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.it1;
import java.util.HashSet;
import org.json.JSONObject;

public class ht1 implements it1.C13448b {

    /* renamed from: a */
    private JSONObject f34554a;

    /* renamed from: b */
    private final ot1 f34555b;

    public ht1(ot1 ot1) {
        this.f34555b = ot1;
    }

    /* renamed from: a */
    public void mo67627a() {
        this.f34555b.mo69268b(new st1(this));
    }

    /* renamed from: a */
    public void mo67628a(JSONObject jSONObject) {
        this.f34554a = jSONObject;
    }

    /* renamed from: a */
    public void mo67629a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f34555b.mo69268b(new au1(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public JSONObject mo67630b() {
        return this.f34554a;
    }

    /* renamed from: b */
    public void mo67631b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f34555b.mo69268b(new xt1(this, hashSet, jSONObject, j));
    }
}
