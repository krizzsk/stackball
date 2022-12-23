package com.ironsource.sdk.service;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.ironsource.environment.C5527g;
import com.ironsource.sdk.p143a.C5821a;
import com.ironsource.sdk.p143a.C5825d;
import com.ironsource.sdk.p143a.C5827f;
import com.ironsource.sdk.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.d */
public class C6052d {

    /* renamed from: a */
    private static final String f14824a = C6052d.class.getSimpleName();

    /* renamed from: b */
    private static final ArrayList<String> f14825b = new ArrayList<String>() {
        {
            add("com.google.market");
            add("com.android.vending");
        }
    };

    /* renamed from: a */
    private static JSONObject m14931a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> b = m14933b(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                final boolean contains = b.contains(next.trim().toLowerCase());
                jSONObject.put(next, new JSONObject() {
                    {
                        put("isInstalled", contains);
                    }
                });
            }
        } catch (Exception e) {
            C5825d.m14394a(C5827f.f14172m, (Map<String, Object>) new C5821a().mo42154a("callfailreason", e.getMessage()).mo42154a("generalmessage", arrayList.toString()).f14151a);
            Logger.m14953d(f14824a, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m14932a(Context context) {
        JSONObject a = m14931a(context, f14825b);
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static ArrayList<String> m14933b(Context context) {
        List<ApplicationInfo> q = C5527g.m13169q(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo next : q) {
            if (next != null) {
                arrayList.add(next.packageName.toLowerCase());
            }
        }
        return arrayList;
    }
}
