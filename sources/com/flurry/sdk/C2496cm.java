package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.cm */
public class C2496cm {

    /* renamed from: a */
    private static final String f5839a = C2496cm.class.getSimpleName();

    /* renamed from: b */
    private static final HashMap<String, Map<String, String>> f5840b = new HashMap<>();

    /* renamed from: c */
    private static C2496cm f5841c;

    /* renamed from: a */
    public static synchronized C2496cm m5384a() {
        C2496cm cmVar;
        synchronized (C2496cm.class) {
            if (f5841c == null) {
                f5841c = new C2496cm();
            }
            cmVar = f5841c;
        }
        return cmVar;
    }

    /* renamed from: b */
    public static synchronized void m5385b() {
        synchronized (C2496cm.class) {
            f5841c = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo17687a(String str, String str2, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (map.size() >= 10) {
            String str3 = f5839a;
            C2530db.m5490e(str3, "MaxOriginParams exceeded: " + map.size());
            return;
        }
        map.put("flurryOriginVersion", str2);
        synchronized (f5840b) {
            if (f5840b.size() < 10 || f5840b.containsKey(str)) {
                f5840b.put(str, map);
                return;
            }
            String str4 = f5839a;
            C2530db.m5490e(str4, "MaxOrigins exceeded: " + f5840b.size());
        }
    }

    /* renamed from: c */
    public final synchronized HashMap<String, Map<String, String>> mo17688c() {
        HashMap<String, Map<String, String>> hashMap;
        synchronized (f5840b) {
            hashMap = new HashMap<>(f5840b);
        }
        return hashMap;
    }
}
