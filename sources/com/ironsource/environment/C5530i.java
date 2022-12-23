package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.environment.p135b.C5512a;
import com.ironsource.environment.p135b.C5516b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.i */
public class C5530i {
    /* renamed from: a */
    public static JSONObject m13183a(ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C5512a aVar = C5512a.C5515a.f12719a;
        aVar.mo41236a(applicationContext);
        JSONObject jSONObject2 = new JSONObject(C5516b.m13095a(aVar.f12712a));
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (jSONObject2.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m13184a(Context context, String str, String str2, String str3) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putString(str2, str3);
            edit.apply();
        }
    }

    /* renamed from: b */
    public static String m13185b(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }
}
