package com.ironsource.sdk.p145c;

import android.webkit.WebView;
import com.facebook.internal.NativeProtocol;
import com.ironsource.sdk.C5820a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c.d */
public class C5844d {

    /* renamed from: a */
    public static final String f14237a = C5844d.class.getSimpleName();

    /* renamed from: c */
    private static C5844d f14238c = null;

    /* renamed from: b */
    public Map<String, C5846e> f14239b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static synchronized C5844d m14444a() {
        C5844d dVar;
        synchronized (C5844d.class) {
            if (f14238c == null) {
                f14238c = new C5844d();
            }
            dVar = f14238c;
        }
        return dVar;
    }

    /* renamed from: a */
    public static String m14445a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has(NativeProtocol.WEB_DIALOG_PARAMS)) ? "" : new JSONObject(jSONObject.getString(NativeProtocol.WEB_DIALOG_PARAMS)).getString("adViewId") : jSONObject.getString("adViewId");
    }

    /* renamed from: b */
    public static boolean m14447b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    private static C5820a m14448d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new C5820a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get("label").toString());
        } catch (Exception unused) {
            return new C5820a();
        }
    }

    /* renamed from: a */
    public final WebView mo42194a(String str) {
        C5846e eVar;
        if (str.isEmpty() || !this.f14239b.containsKey(str) || (eVar = this.f14239b.get(str)) == null) {
            return null;
        }
        return eVar.mo42178a();
    }

    /* renamed from: c */
    public C5820a mo42195c(JSONObject jSONObject) {
        C5820a aVar = new C5820a();
        try {
            return m14448d(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return aVar;
        }
    }
}
