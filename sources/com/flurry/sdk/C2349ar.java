package com.flurry.sdk;

import android.location.Location;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.flurry.sdk.ar */
public class C2349ar extends C2536dh {

    /* renamed from: a */
    private static final String f5395a = C2349ar.class.getSimpleName();

    /* renamed from: a */
    public final String mo17566a(String str, Map<String, String> map) {
        String a = mo17751a(str);
        while (a != null) {
            if (m5503a("timestamp_epoch_millis", a)) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                C2530db.m5474a(3, f5395a, "Replacing param timestamp_epoch_millis with: ".concat(String.valueOf(valueOf)));
                str = str.replace(a, C2619em.m5705c(valueOf));
            } else if (m5503a("session_duration_millis", a)) {
                C2449bq.m5261a();
                String l = Long.toString(C2449bq.m5268f());
                C2530db.m5474a(3, f5395a, "Replacing param session_duration_millis with: ".concat(String.valueOf(l)));
                str = str.replace(a, C2619em.m5705c(l));
            } else if (m5503a("fg_timespent_millis", a)) {
                C2449bq.m5261a();
                String l2 = Long.toString(C2449bq.m5268f());
                C2530db.m5474a(3, f5395a, "Replacing param fg_timespent_millis with: ".concat(String.valueOf(l2)));
                str = str.replace(a, C2619em.m5705c(l2));
            } else {
                String str2 = "";
                if (m5503a("install_referrer", a)) {
                    String b = new C2672y().mo17882b();
                    if (b != null) {
                        str2 = b;
                    }
                    C2530db.m5474a(3, f5395a, "Replacing param install_referrer with: ".concat(String.valueOf(str2)));
                    str = str.replace(a, C2619em.m5705c(str2));
                } else if (m5503a("geo_latitude", a)) {
                    Location g = C2464bw.m5304a().mo17656g();
                    if (g != null) {
                        int d = C2464bw.m5311d();
                        str2 = str2 + C2619em.m5693a(g.getLatitude(), d);
                    }
                    C2530db.m5474a(3, f5395a, "Replacing param geo_latitude with: ".concat(String.valueOf(str2)));
                    str = str.replace(a, C2619em.m5705c(str2));
                } else if (m5503a("geo_longitude", a)) {
                    Location g2 = C2464bw.m5304a().mo17656g();
                    if (g2 != null) {
                        int d2 = C2464bw.m5311d();
                        str2 = str2 + C2619em.m5693a(g2.getLongitude(), d2);
                    }
                    C2530db.m5474a(3, f5395a, "Replacing param geo_longitude with: ".concat(String.valueOf(str2)));
                    str = str.replace(a, C2619em.m5705c(str2));
                } else if (m5503a(TapjoyConstants.TJC_USER_ID, a)) {
                    String str3 = (String) C2611eg.m5674a().mo17819a("UserId");
                    C2530db.m5474a(3, f5395a, "Replacing param publisher_user_id with: ".concat(String.valueOf(str3)));
                    str = str.replace(a, C2619em.m5705c(str3));
                } else if (m5503a("event_name", a)) {
                    if (map.containsKey("event_name")) {
                        C2530db.m5474a(3, f5395a, "Replacing param event_name with: " + map.get("event_name"));
                        str = str.replace(a, C2619em.m5705c(map.get("event_name")));
                    } else {
                        C2530db.m5474a(3, f5395a, "Replacing param event_name with empty string");
                        str = str.replace(a, str2);
                    }
                } else if (!m5503a("event_time_millis", a)) {
                    C2530db.m5474a(3, f5395a, "Unknown param: ".concat(String.valueOf(a)));
                    str = str.replace(a, str2);
                } else if (map.containsKey("event_time_millis")) {
                    C2530db.m5474a(3, f5395a, "Replacing param event_time_millis with: " + map.get("event_time_millis"));
                    str = str.replace(a, C2619em.m5705c(map.get("event_time_millis")));
                } else {
                    C2530db.m5474a(3, f5395a, "Replacing param event_time_millis with empty string");
                    str = str.replace(a, str2);
                }
            }
            a = mo17751a(str);
        }
        return str;
    }
}
