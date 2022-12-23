package com.ironsource.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.sdk.p150g.C6015f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.utils.b */
public class C6059b {

    /* renamed from: b */
    private static C6059b f14851b;

    /* renamed from: a */
    public SharedPreferences f14852a;

    static {
        C6059b.class.getSimpleName();
    }

    private C6059b(Context context) {
        this.f14852a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    /* renamed from: a */
    public static synchronized C6059b m14967a() {
        C6059b bVar;
        synchronized (C6059b.class) {
            bVar = f14851b;
        }
        return bVar;
    }

    /* renamed from: a */
    public static synchronized C6059b m14968a(Context context) {
        C6059b bVar;
        synchronized (C6059b.class) {
            if (f14851b == null) {
                f14851b = new C6059b(context);
            }
            bVar = f14851b;
        }
        return bVar;
    }

    /* renamed from: b */
    public static boolean m14969b(String str) {
        return str.matches("^\\d+_\\d+$");
    }

    /* renamed from: c */
    private String m14970c() {
        return this.f14852a.getString("version", "-1");
    }

    /* renamed from: a */
    public final void mo42612a(String str) {
        if (!m14970c().equalsIgnoreCase(str)) {
            SharedPreferences.Editor edit = this.f14852a.edit();
            edit.putString("version", str);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final boolean mo42613a(String str, String str2, String str3) {
        String string = this.f14852a.getString("ssaUserData", (String) null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.f14852a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            return edit.commit();
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public final List<String> mo42614b() {
        String string = this.f14852a.getString("search_keys", (String) null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            C6015f fVar = new C6015f(string);
            if (fVar.mo42561a("searchKeys")) {
                try {
                    arrayList.addAll(fVar.mo42558a((JSONArray) fVar.mo42563c("searchKeys")));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
