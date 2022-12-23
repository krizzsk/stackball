package com.p243my.target;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.p243my.target.C7524l3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.x */
public class C7726x extends C7337c<C7718w2> {
    /* renamed from: a */
    public static C7337c<C7718w2> m20773a() {
        return new C7726x();
    }

    /* renamed from: a */
    public C7718w2 mo49776a(String str, C7617q1 q1Var, C7718w2 w2Var, C7298a aVar, C7524l3.C7525a aVar2, C7524l3 l3Var, Context context) {
        JSONArray names;
        JSONObject a = C7337c.m18819a(str, aVar2, l3Var);
        if (a == null || (names = a.names()) == null) {
            return null;
        }
        C7344c4 a2 = C7344c4.m18857a(q1Var, aVar, context);
        boolean z = false;
        C7718w2 w2Var2 = w2Var;
        int i = 0;
        while (true) {
            if (i >= names.length()) {
                break;
            }
            String optString = names.optString(i);
            if (("appwall".equals(optString) || "showcaseApps".equals(optString) || "showcaseGames".equals(optString) || "showcase".equals(optString)) && (w2Var2 = mo51811a(optString, a, a2, q1Var, aVar, context)) != null && !w2Var2.mo51774c().isEmpty()) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return null;
        }
        w2Var2.mo51773a(q1Var.mo51413x());
        w2Var2.mo51772a(a);
        return w2Var2;
    }

    /* renamed from: a */
    public final C7718w2 mo51811a(String str, JSONObject jSONObject, C7344c4 c4Var, C7617q1 q1Var, C7298a aVar, Context context) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("banners")) == null || optJSONArray.length() <= 0) {
            return null;
        }
        C7718w2 b = C7718w2.m20721b(str);
        c4Var.mo49810a(optJSONObject, b);
        C7329b4 a = C7329b4.m18780a(b, q1Var, aVar, context);
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
            if (optJSONObject2 != null) {
                C7497k2 newBanner = C7497k2.newBanner();
                a.mo49731a(optJSONObject2, newBanner);
                String bundleId = newBanner.getBundleId();
                if (!TextUtils.isEmpty(bundleId)) {
                    newBanner.setAppInstalled(mo51812a(context, bundleId));
                }
                b.mo51771a(newBanner);
            }
        }
        return b;
    }

    /* renamed from: a */
    public final boolean mo51812a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return false;
        }
        List<ResolveInfo> list = null;
        try {
            list = packageManager.queryIntentActivities(launchIntentForPackage, 65536);
        } catch (Throwable unused) {
        }
        return list != null && !list.isEmpty();
    }
}
