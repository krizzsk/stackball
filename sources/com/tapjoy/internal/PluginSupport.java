package com.tapjoy.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class PluginSupport {
    private PluginSupport() {
    }

    public static void trackUsage(String str, String str2, String str3) {
        TreeMap treeMap;
        C9101bn b;
        C9101bn b2;
        try {
            HashMap hashMap = null;
            if (!C9067al.m24297a(str2)) {
                treeMap = new TreeMap();
                b2 = C9101bn.m24359b(str2);
                b2.mo57855a((Map) treeMap);
                b2.close();
            } else {
                treeMap = null;
            }
            if (!C9067al.m24297a(str3)) {
                hashMap = new HashMap();
                b = C9101bn.m24359b(str3);
                b.mo57868h();
                while (b.mo57870j()) {
                    hashMap.put(b.mo57872l(), Long.valueOf(b.mo57877q()));
                }
                b.mo57869i();
                b.close();
            }
            C9314gf.m24960a(str, treeMap, (Map) hashMap);
        } catch (Exception unused) {
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }
}
