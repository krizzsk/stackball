package com.iab.omid.library.ironsrc.p110d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.ironsrc.p108b.C4713c;
import com.iab.omid.library.ironsrc.walking.C4740a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.d.b */
public class C4725b {

    /* renamed from: a */
    static float f10644a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f10645b;

    /* renamed from: c */
    private static String[] f10646c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.ironsrc.d.b$a */
    static class C4726a {

        /* renamed from: a */
        final float f10647a;

        /* renamed from: b */
        final float f10648b;

        C4726a(float f, float f2) {
            this.f10647a = f;
            this.f10648b = f2;
        }
    }

    /* renamed from: a */
    static float m10246a(int i) {
        return ((float) i) / f10644a;
    }

    /* renamed from: a */
    public static JSONObject m10247a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m10246a(i));
            jSONObject.put("y", (double) m10246a(i2));
            jSONObject.put("width", (double) m10246a(i3));
            jSONObject.put("height", (double) m10246a(i4));
        } catch (JSONException e) {
            C4727c.m10263a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m10248a(Context context) {
        if (context != null) {
            f10644a = context.getResources().getDisplayMetrics().density;
            f10645b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m10249a(JSONObject jSONObject) {
        C4726a b = m10255b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f10647a);
            jSONObject.put("height", (double) b.f10648b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10250a(JSONObject jSONObject, C4740a.C4741a aVar) {
        C4713c a = aVar.mo39214a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo39216b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo39135b());
            jSONObject.put("friendlyObstructionPurpose", a.mo39136c());
            jSONObject.put("friendlyObstructionReason", a.mo39137d());
        } catch (JSONException e) {
            C4727c.m10263a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m10251a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4727c.m10263a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m10252a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4727c.m10263a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m10253a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m10254a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4726a m10255b(JSONObject jSONObject) {
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
                return new C4726a(f2, f);
            }
        } else if (f10645b != null) {
            Point point = new Point(0, 0);
            f10645b.getDefaultDisplay().getRealSize(point);
            f2 = m10246a(point.x);
            f = m10246a(point.y);
            return new C4726a(f2, f);
        }
        f = 0.0f;
        return new C4726a(f2, f);
    }

    /* renamed from: b */
    public static void m10256b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4727c.m10263a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m10257b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m10258c(jSONObject, jSONObject2) && m10259d(jSONObject, jSONObject2) && m10260e(jSONObject, jSONObject2) && m10261f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m10258c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10646c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m10259d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m10260e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10254a(optJSONArray, optJSONArray2)) {
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
    private static boolean m10261f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10254a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m10257b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
