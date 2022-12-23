package com.tapjoy.internal;

import android.app.Activity;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.tapjoy.internal.gn */
public final class C9326gn {
    /* renamed from: a */
    public static void m25004a(Activity activity) {
        C9344gz a = C9344gz.m25060a();
        if (C9340gw.m25046a((Object) activity, "onActivityStart: The given activity was null")) {
            C9340gw.m25050c("onActivityStart");
            C9084b.m24325a(activity.getApplication());
            C9084b.m24326b(activity);
            if (a.mo58251c("onActivityStart") && a.mo58254e()) {
                C9334gt.m25029b(activity);
            }
        }
    }

    /* renamed from: b */
    public static void m25009b(Activity activity) {
        C9344gz a = C9344gz.m25060a();
        if (C9340gw.m25046a((Object) activity, "onActivityStop: The given activity was null")) {
            C9340gw.m25050c("onActivityStop");
            C9084b.m24329c(activity);
            if (a.mo58251c("onActivityStop") && !C9084b.m24327b()) {
                a.f23118h.mo58315a();
            }
        }
    }

    /* renamed from: a */
    public static void m25003a() {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58251c("startSession") && a.mo58254e()) {
            C9334gt.m25029b((Activity) null);
        }
    }

    /* renamed from: b */
    public static void m25008b() {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58251c("endSession")) {
            a.f23118h.mo58315a();
        }
    }

    /* renamed from: a */
    public static void m25006a(String str, String str2, String str3, String str4, long j) {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58253d("trackEvent") && C9340gw.m25046a((Object) str2, "trackEvent: name was null")) {
            LinkedHashMap linkedHashMap = null;
            if (j != 0) {
                linkedHashMap = C9471ju.m25455b();
                linkedHashMap.put("value", Long.valueOf(j));
            }
            a.f23117g.mo58238a(str, str2, str3, str4, linkedHashMap);
            C9340gw.m25045a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str2, str3, str4, linkedHashMap);
        }
    }

    /* renamed from: a */
    public static void m25007a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        String str8 = str2;
        String str9 = str5;
        String str10 = str6;
        String str11 = str7;
        C9344gz a = C9344gz.m25060a();
        if (a.mo58253d("trackEvent") && C9340gw.m25046a((Object) str2, "trackEvent: name was null")) {
            LinkedHashMap b = C9471ju.m25455b();
            if (!(str9 == null || j == 0)) {
                b.put(str5, Long.valueOf(j));
            }
            if (!(str10 == null || j2 == 0)) {
                b.put(str10, Long.valueOf(j2));
            }
            if (!(str11 == null || j3 == 0)) {
                b.put(str11, Long.valueOf(j3));
            }
            if (b.isEmpty()) {
                b = null;
            }
            a.f23117g.mo58238a(str, str2, str3, str4, b);
            C9340gw.m25045a("trackEvent category:{}, name:{}, p1:{}, p2:{}, values:{} called", str, str8, str3, str4, b);
        }
    }

    /* renamed from: a */
    public static void m25005a(String str, String str2, String str3, String str4) {
        C9344gz a = C9344gz.m25060a();
        if (a.mo58251c("trackPurchase")) {
            try {
                C9185e eVar = new C9185e(str);
                String b = C9335gu.m25033b(eVar.f22572a);
                String b2 = C9335gu.m25033b(eVar.f22577f);
                if (b == null || b2 == null) {
                    C9340gw.m25044a("trackPurchase", "skuDetails", "insufficient fields");
                } else if (b2.length() != 3) {
                    C9340gw.m25044a("trackPurchase", "skuDetails", "invalid currency code");
                } else {
                    String b3 = C9335gu.m25033b(str2);
                    String b4 = C9335gu.m25033b(str3);
                    if (b3 != null) {
                        if (b4 != null) {
                            try {
                                C9246f fVar = new C9246f(b3);
                                if (C9465jq.m25449c(fVar.f22752a) || C9465jq.m25449c(fVar.f22753b) || C9465jq.m25449c(fVar.f22754c) || fVar.f22755d == 0) {
                                    C9340gw.m25044a("trackPurchase", "purchaseData", "insufficient fields");
                                }
                            } catch (IOException unused) {
                                C9340gw.m25044a("trackPurchase", "purchaseData", "invalid PurchaseData JSON");
                            }
                        } else {
                            C9340gw.m25044a("trackPurchase", "dataSignature", "is null, skipping purchase validation");
                        }
                    } else if (b4 != null) {
                        C9340gw.m25044a("trackPurchase", "purchaseData", "is null. skipping purchase validation");
                    }
                    a.f23117g.mo58236a(b, b2.toUpperCase(Locale.US), ((double) eVar.f22578g) / 1000000.0d, b3, b4, C9335gu.m25033b(str4));
                    if (b3 == null || b4 == null) {
                        C9340gw.m25043a("trackPurchase without purchaseData called");
                    } else {
                        C9340gw.m25043a("trackPurchase with purchaseData called");
                    }
                }
            } catch (IOException unused2) {
                C9340gw.m25044a("trackPurchase", "skuDetails", "invalid SkuDetails JSON");
            }
        }
    }
}
