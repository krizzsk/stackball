package com.iab.omid.library.inmobi.p104d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.d.b */
public class C4676b {

    /* renamed from: a */
    static float f10533a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f10534b;

    /* renamed from: c */
    private static String[] f10535c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.inmobi.d.b$a */
    static class C4677a {

        /* renamed from: a */
        final float f10536a;

        /* renamed from: b */
        final float f10537b;

        C4677a(float f, float f2) {
            this.f10536a = f;
            this.f10537b = f2;
        }
    }

    /* renamed from: a */
    static float m10032a(int i) {
        return ((float) i) / f10533a;
    }

    /* renamed from: a */
    public static JSONObject m10033a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m10032a(i));
            jSONObject.put("y", (double) m10032a(i2));
            jSONObject.put("width", (double) m10032a(i3));
            jSONObject.put("height", (double) m10032a(i4));
        } catch (JSONException e) {
            C4678c.m10049a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m10034a(Context context) {
        if (context != null) {
            f10533a = context.getResources().getDisplayMetrics().density;
            f10534b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m10035a(JSONObject jSONObject) {
        C4677a b = m10041b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f10536a);
            jSONObject.put("height", (double) b.f10537b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10036a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4678c.m10049a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m10037a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4678c.m10049a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m10038a(JSONObject jSONObject, List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
        } catch (JSONException e) {
            C4678c.m10049a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m10039a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m10040a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4677a m10041b(JSONObject jSONObject) {
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
                return new C4677a(f2, f);
            }
        } else if (f10534b != null) {
            Point point = new Point(0, 0);
            f10534b.getDefaultDisplay().getRealSize(point);
            f2 = m10032a(point.x);
            f = m10032a(point.y);
            return new C4677a(f2, f);
        }
        f = 0.0f;
        return new C4677a(f2, f);
    }

    /* renamed from: b */
    public static void m10042b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4678c.m10049a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m10043b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m10044c(jSONObject, jSONObject2) && m10045d(jSONObject, jSONObject2) && m10046e(jSONObject, jSONObject2) && m10047f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m10044c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10535c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m10045d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m10046e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10040a(optJSONArray, optJSONArray2)) {
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
    private static boolean m10047f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10040a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m10043b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
