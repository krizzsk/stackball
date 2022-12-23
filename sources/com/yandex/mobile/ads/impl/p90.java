package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class p90 {
    /* renamed from: a */
    public static boolean m40709a(Map<String, String> map, wb0 wb0, boolean z) {
        String str = map.get(wb0.mo70671a());
        return str == null ? z : Boolean.parseBoolean(str);
    }

    /* renamed from: b */
    public static List<String> m40710b(Map<String, String> map, wb0 wb0) {
        ArrayList arrayList = new ArrayList();
        String str = map.get(wb0.mo70671a());
        if (!TextUtils.isEmpty(str)) {
            for (String trim : (String[]) C13378i5.m37282a((T[]) str.split(","))) {
                try {
                    String decode = URLDecoder.decode(trim.trim(), "UTF-8");
                    if (decode != null) {
                        arrayList.add(decode);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m40708a(Map<String, String> map, wb0 wb0) {
        String str = map.get(wb0.mo70671a());
        int i = C13278h5.f34274b;
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
