package com.yandex.mobile.ads.impl;

import com.facebook.appevents.AppEventsConstants;
import com.google.android.exoplayer2.C3716C;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.C13045fd;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class xb0 {
    /* renamed from: a */
    public static C13045fd.C13046a m43996a(fv0 fv0) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        fv0 fv02 = fv0;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = fv02.f33757c;
        if (map == null) {
            return null;
        }
        String str = map.get(HttpHeaders.DATE);
        long a = str != null ? m43995a(str) : 0;
        String str2 = map.get(HttpHeaders.CACHE_CONTROL);
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get(HttpHeaders.EXPIRES);
        long a2 = str3 != null ? m43995a(str3) : 0;
        String str4 = map.get(HttpHeaders.LAST_MODIFIED);
        long a3 = str4 != null ? m43995a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                Long.signum(j);
                j3 = j4;
                j4 += j * 1000;
                C13045fd.C13046a aVar = new C13045fd.C13046a();
                aVar.f33319a = fv02.f33756b;
                aVar.f33320b = str5;
                aVar.f33324f = j3;
                aVar.f33323e = j4;
                aVar.f33321c = a;
                aVar.f33322d = a3;
                aVar.f33325g = map;
                aVar.f33326h = fv02.f33758d;
                return aVar;
            }
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
                C13045fd.C13046a aVar2 = new C13045fd.C13046a();
                aVar2.f33319a = fv02.f33756b;
                aVar2.f33320b = str5;
                aVar2.f33324f = j3;
                aVar2.f33323e = j4;
                aVar2.f33321c = a;
                aVar2.f33322d = a3;
                aVar2.f33325g = map;
                aVar2.f33326h = fv02.f33758d;
                return aVar2;
            }
            j4 = currentTimeMillis + (a2 - a);
        }
        j3 = j4;
        C13045fd.C13046a aVar22 = new C13045fd.C13046a();
        aVar22.f33319a = fv02.f33756b;
        aVar22.f33320b = str5;
        aVar22.f33324f = j3;
        aVar22.f33323e = j4;
        aVar22.f33321c = a;
        aVar22.f33322d = a3;
        aVar22.f33325g = map;
        aVar22.f33326h = fv02.f33758d;
        return aVar22;
    }

    /* renamed from: a */
    public static long m43995a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str) || "-1".equals(str)) {
                pp1.m40901d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            pp1.m40898a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    public static String m43997a(Map<String, String> map) {
        String str;
        if (!(map == null || (str = map.get("Content-Type")) == null)) {
            String[] split = str.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return C3716C.ISO88591_NAME;
    }

    /* renamed from: a */
    static Map<String, String> m43998a(C13045fd.C13046a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = aVar.f33320b;
        if (str != null) {
            hashMap.put(HttpHeaders.IF_NONE_MATCH, str);
        }
        long j = aVar.f33322d;
        if (j > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            hashMap.put(HttpHeaders.IF_MODIFIED_SINCE, simpleDateFormat.format(new Date(j)));
        }
        return hashMap;
    }
}
