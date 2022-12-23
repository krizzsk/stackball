package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ml1 {

    /* renamed from: a */
    private final Context f37432a;

    /* renamed from: b */
    private final l71 f37433b = l71.m38631c();

    public ml1(Context context) {
        this.f37432a = context.getApplicationContext();
    }

    /* renamed from: a */
    public Map<String, List<String>> mo68839a(Map<String, List<String>> map, ro1 ro1) {
        d71 a = this.f37433b.mo68362a(this.f37432a);
        if (a != null ? a.mo66476x() : false) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        List<String> a2 = ro1 != null ? ro1.mo69799a() : null;
        List list = (List) hashMap.get("impression");
        if (a2 != null) {
            hashMap.put("impression", a2);
        } else {
            hashMap.remove("impression");
        }
        if (list != null) {
            hashMap.put("render_impression", list);
        } else {
            hashMap.remove("render_impression");
        }
        return hashMap;
    }
}
