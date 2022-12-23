package com.iab.omid.library.corpmailru.p098d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.corpmailru.p096b.C4615c;
import com.iab.omid.library.corpmailru.walking.C4642a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.d.b */
public class C4627b {

    /* renamed from: a */
    public static float f10428a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f10429b;

    /* renamed from: c */
    private static String[] f10430c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.corpmailru.d.b$a */
    public static class C4628a {

        /* renamed from: a */
        public final float f10431a;

        /* renamed from: b */
        public final float f10432b;

        public C4628a(float f, float f2) {
            this.f10431a = f;
            this.f10432b = f2;
        }
    }

    /* renamed from: a */
    public static float m9815a(int i) {
        return ((float) i) / f10428a;
    }

    /* renamed from: a */
    public static JSONObject m9816a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m9815a(i));
            jSONObject.put("y", (double) m9815a(i2));
            jSONObject.put("width", (double) m9815a(i3));
            jSONObject.put("height", (double) m9815a(i4));
        } catch (JSONException e) {
            C4629c.m9832a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m9817a(Context context) {
        if (context != null) {
            f10428a = context.getResources().getDisplayMetrics().density;
            f10429b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m9818a(JSONObject jSONObject) {
        C4628a b = m9824b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f10431a);
            jSONObject.put("height", (double) b.f10432b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m9819a(JSONObject jSONObject, C4642a.C4643a aVar) {
        C4615c a = aVar.mo38862a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo38864b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo38783b());
            jSONObject.put("friendlyObstructionPurpose", a.mo38784c());
            jSONObject.put("friendlyObstructionReason", a.mo38785d());
        } catch (JSONException e) {
            C4629c.m9832a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m9820a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4629c.m9832a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m9821a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4629c.m9832a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m9822a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m9823a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4628a m9824b(JSONObject jSONObject) {
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
                return new C4628a(f2, f);
            }
        } else if (f10429b != null) {
            Point point = new Point(0, 0);
            f10429b.getDefaultDisplay().getRealSize(point);
            f2 = m9815a(point.x);
            f = m9815a(point.y);
            return new C4628a(f2, f);
        }
        f = 0.0f;
        return new C4628a(f2, f);
    }

    /* renamed from: b */
    public static void m9825b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4629c.m9832a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m9826b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m9827c(jSONObject, jSONObject2) && m9828d(jSONObject, jSONObject2) && m9829e(jSONObject, jSONObject2) && m9830f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m9827c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10430c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m9828d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m9829e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m9823a(optJSONArray, optJSONArray2)) {
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
    private static boolean m9830f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m9823a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m9826b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
