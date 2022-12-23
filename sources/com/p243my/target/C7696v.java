package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7372e;
import java.util.Map;

/* renamed from: com.my.target.v */
public class C7696v extends C7372e.C7373a {
    /* renamed from: b */
    public static C7696v m20626b() {
        return new C7696v();
    }

    /* renamed from: b */
    public int mo50042b(C7298a aVar, Context context) {
        return C7695u8.m20613a(context).mo51689a();
    }

    /* renamed from: c */
    public Map<String, String> mo50043c(C7298a aVar, Context context) {
        Map<String, String> c = super.mo50043c(aVar, context);
        Map<String, String> snapshot = C7699v2.m20660d().snapshot();
        if (snapshot != null && snapshot.size() > 0) {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (String next : snapshot.keySet()) {
                if (z) {
                    sb.append(",");
                } else {
                    z = true;
                }
                sb.append(next);
            }
            String sb2 = sb.toString();
            c.put("exb", sb2);
            C7374e0.m18989a("Exclude list: " + sb2);
        }
        return c;
    }
}
