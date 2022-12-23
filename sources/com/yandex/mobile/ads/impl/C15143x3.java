package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.x3 */
public class C15143x3 {
    /* renamed from: a */
    public Map<String, String> mo70812a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb.append("&");
            sb.append(Uri.encode((String) next.getKey()));
            sb.append("=");
            sb.append(Uri.encode((String) next.getValue()));
            if (sb.length() > 61440) {
                c21.m34570c("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return hashMap;
            }
            hashMap.put((String) next.getKey(), (String) next.getValue());
        }
        return hashMap;
    }

    /* renamed from: a */
    public String mo70811a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            c21.m34570c("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", 1024, Integer.valueOf(length));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
