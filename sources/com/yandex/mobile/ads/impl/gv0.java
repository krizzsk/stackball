package com.yandex.mobile.ads.impl;

import org.json.JSONException;

public class gv0 {

    /* renamed from: a */
    private final s21 f34159a = new s21();

    /* renamed from: b */
    private final u21 f34160b = u21.m42589a();

    /* renamed from: a */
    public fv0 mo67354a(l41<?> l41) {
        String a = this.f34160b.mo70279a(l41);
        if (a != null) {
            try {
                r21 a2 = this.f34159a.mo69852a(a);
                return new fv0(200, a2.mo69682a().getBytes(), a2.mo69683b(), false, 0);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
