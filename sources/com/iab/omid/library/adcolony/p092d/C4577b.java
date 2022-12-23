package com.iab.omid.library.adcolony.p092d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.adcolony.p090b.C4565c;
import com.iab.omid.library.adcolony.walking.C4592a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.d.b */
public class C4577b {

    /* renamed from: a */
    private static WindowManager f10315a;

    /* renamed from: b */
    private static String[] f10316b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f10317c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: com.iab.omid.library.adcolony.d.b$a */
    private static class C4578a {

        /* renamed from: a */
        final float f10318a;

        /* renamed from: b */
        final float f10319b;

        C4578a(float f, float f2) {
            this.f10318a = f;
            this.f10319b = f2;
        }
    }

    /* renamed from: a */
    static float m9591a(int i) {
        return ((float) i) / f10317c;
    }

    /* renamed from: a */
    public static JSONObject m9592a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m9591a(i));
            jSONObject.put("y", (double) m9591a(i2));
            jSONObject.put("width", (double) m9591a(i3));
            jSONObject.put("height", (double) m9591a(i4));
        } catch (JSONException e) {
            C4579c.m9608a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m9593a(Context context) {
        if (context != null) {
            f10317c = context.getResources().getDisplayMetrics().density;
            f10315a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m9594a(JSONObject jSONObject) {
        C4578a b = m9600b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f10318a);
            jSONObject.put("height", (double) b.f10319b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m9595a(JSONObject jSONObject, C4592a.C4593a aVar) {
        C4565c a = aVar.mo38668a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo38670b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo38589b());
            jSONObject.put("friendlyObstructionPurpose", a.mo38590c());
            jSONObject.put("friendlyObstructionReason", a.mo38591d());
        } catch (JSONException e) {
            C4579c.m9608a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m9596a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4579c.m9608a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m9597a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4579c.m9608a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m9598a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m9599a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4578a m9600b(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
                return new C4578a(f2, f);
            }
        } else if (f10315a != null) {
            Point point = new Point(0, 0);
            f10315a.getDefaultDisplay().getRealSize(point);
            f2 = m9591a(point.x);
            f = m9591a(point.y);
            return new C4578a(f2, f);
        }
        f = 0.0f;
        return new C4578a(f2, f);
    }

    /* renamed from: b */
    public static void m9601b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4579c.m9608a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m9602b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m9603c(jSONObject, jSONObject2) && m9604d(jSONObject, jSONObject2) && m9605e(jSONObject, jSONObject2) && m9606f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m9603c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10316b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m9604d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m9605e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m9599a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private static boolean m9606f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m9599a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m9602b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
