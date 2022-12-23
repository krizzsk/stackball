package com.iab.omid.library.vungle.p128d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.vungle.p126b.C4862c;
import com.iab.omid.library.vungle.walking.C4889a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.d.b */
public class C4874b {

    /* renamed from: a */
    static float f10977a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f10978b;

    /* renamed from: c */
    private static String[] f10979c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.vungle.d.b$a */
    private static class C4875a {

        /* renamed from: a */
        final float f10980a;

        /* renamed from: b */
        final float f10981b;

        C4875a(float f, float f2) {
            this.f10980a = f;
            this.f10981b = f2;
        }
    }

    /* renamed from: a */
    static float m10903a(int i) {
        return ((float) i) / f10977a;
    }

    /* renamed from: a */
    public static JSONObject m10904a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m10903a(i));
            jSONObject.put("y", (double) m10903a(i2));
            jSONObject.put("width", (double) m10903a(i3));
            jSONObject.put("height", (double) m10903a(i4));
        } catch (JSONException e) {
            C4876c.m10920a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m10905a(Context context) {
        if (context != null) {
            f10977a = context.getResources().getDisplayMetrics().density;
            f10978b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m10906a(JSONObject jSONObject) {
        C4875a b = m10912b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f10980a);
            jSONObject.put("height", (double) b.f10981b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10907a(JSONObject jSONObject, C4889a.C4890a aVar) {
        C4862c a = aVar.mo39784a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo39786b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo39705b());
            jSONObject.put("friendlyObstructionPurpose", a.mo39706c());
            jSONObject.put("friendlyObstructionReason", a.mo39707d());
        } catch (JSONException e) {
            C4876c.m10920a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m10908a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4876c.m10920a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m10909a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4876c.m10920a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m10910a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m10911a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4875a m10912b(JSONObject jSONObject) {
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
                return new C4875a(f2, f);
            }
        } else if (f10978b != null) {
            Point point = new Point(0, 0);
            f10978b.getDefaultDisplay().getRealSize(point);
            f2 = m10903a(point.x);
            f = m10903a(point.y);
            return new C4875a(f2, f);
        }
        f = 0.0f;
        return new C4875a(f2, f);
    }

    /* renamed from: b */
    public static void m10913b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4876c.m10920a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m10914b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m10915c(jSONObject, jSONObject2) && m10916d(jSONObject, jSONObject2) && m10917e(jSONObject, jSONObject2) && m10918f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m10915c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10979c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m10916d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m10917e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10911a(optJSONArray, optJSONArray2)) {
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
    private static boolean m10918f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10911a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m10914b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
