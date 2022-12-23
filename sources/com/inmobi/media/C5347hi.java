package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.hi */
/* compiled from: IdentityInfo */
public class C5347hi {

    /* renamed from: a */
    private static final String f12247a = C5347hi.class.getSimpleName();

    /* renamed from: a */
    public static Map<String, String> m12352a() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mk-version", C5315gp.m12222a());
            Boolean f = C5359ht.m12386a().mo40721f();
            if (f != null) {
                hashMap.put("u-id-adt", String.valueOf(f.booleanValue() ? 1 : 0));
            }
            hashMap.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar instance = Calendar.getInstance();
            hashMap.put("tz", String.valueOf(instance.get(15) + instance.get(16)));
            C5349hk a = C5349hk.m12370a();
            HashMap hashMap2 = new HashMap();
            if (a.f12265d && a.f12262a != null) {
                hashMap2.put("u-s-id", a.f12262a);
            }
            hashMap.putAll(hashMap2);
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
