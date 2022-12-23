package com.iab.omid.library.smaato.p122d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.d.b */
public class C4825b {

    /* renamed from: a */
    static float f10869a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f10870b;

    /* renamed from: c */
    private static String[] f10871c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.smaato.d.b$a */
    static class C4826a {

        /* renamed from: a */
        final float f10872a;

        /* renamed from: b */
        final float f10873b;

        C4826a(float f, float f2) {
            this.f10872a = f;
            this.f10873b = f2;
        }
    }

    /* renamed from: a */
    static float m10691a(int i) {
        return ((float) i) / f10869a;
    }

    /* renamed from: a */
    public static JSONObject m10692a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m10691a(i));
            jSONObject.put("y", (double) m10691a(i2));
            jSONObject.put("width", (double) m10691a(i3));
            jSONObject.put("height", (double) m10691a(i4));
        } catch (JSONException e) {
            C4827c.m10707a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m10693a(Context context) {
        if (context != null) {
            f10869a = context.getResources().getDisplayMetrics().density;
            f10870b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m10694a(JSONObject jSONObject) {
        C4826a b = m10700b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f10872a);
            jSONObject.put("height", (double) b.f10873b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10695a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4827c.m10707a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m10696a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4827c.m10707a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m10697a(JSONObject jSONObject, List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
        } catch (JSONException e) {
            C4827c.m10707a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m10698a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m10699a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4826a m10700b(JSONObject jSONObject) {
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
                return new C4826a(f2, f);
            }
        } else if (f10870b != null) {
            Point point = new Point(0, 0);
            f10870b.getDefaultDisplay().getRealSize(point);
            f2 = m10691a(point.x);
            f = m10691a(point.y);
            return new C4826a(f2, f);
        }
        f = 0.0f;
        return new C4826a(f2, f);
    }

    /* renamed from: b */
    public static boolean m10701b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m10702c(jSONObject, jSONObject2) && m10703d(jSONObject, jSONObject2) && m10704e(jSONObject, jSONObject2) && m10705f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m10702c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10871c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m10703d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m10704e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10699a(optJSONArray, optJSONArray2)) {
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
    private static boolean m10705f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10699a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m10701b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
