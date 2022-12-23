package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;

public class oi1 implements w41<ki1, ci1> {

    /* renamed from: a */
    private final C15028w3 f38236a;

    public oi1(C15028w3 w3Var) {
        this.f38236a = w3Var;
    }

    /* renamed from: a */
    public h41 mo66663a(Object obj) {
        ki1 ki1 = (ki1) obj;
        HashMap hashMap = new HashMap();
        String c = this.f38236a.mo70629c();
        String d = this.f38236a.mo70630d();
        if (TextUtils.isEmpty(d)) {
            d = "null";
        }
        hashMap.put("page_id", d);
        if (TextUtils.isEmpty(c)) {
            c = "null";
        }
        hashMap.put("imp_id", c);
        return new h41(h41.C13276b.VAST_REQUEST, hashMap);
    }

    /* renamed from: a */
    public h41 mo66662a(c51 c51, int i, Object obj) {
        ki1 ki1 = (ki1) obj;
        HashMap hashMap = new HashMap();
        String c = this.f38236a.mo70629c();
        String d = this.f38236a.mo70630d();
        if (TextUtils.isEmpty(d)) {
            d = "null";
        }
        hashMap.put("page_id", d);
        if (TextUtils.isEmpty(c)) {
            c = "null";
        }
        hashMap.put("imp_id", c);
        if (i != -1) {
            hashMap.put("code", Integer.valueOf(i));
        }
        return new h41(h41.C13276b.VAST_RESPONSE, hashMap);
    }
}
