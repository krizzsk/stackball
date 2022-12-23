package com.iab.omid.library.oguryco.p116d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.oguryco.p114b.C4764c;
import com.iab.omid.library.oguryco.walking.C4791a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.d.b */
public class C4776b {

    /* renamed from: a */
    static float f10765a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f10766b;

    /* renamed from: c */
    private static String[] f10767c = {"x", "y", "width", "height"};

    /* renamed from: com.iab.omid.library.oguryco.d.b$a */
    static class C4777a {

        /* renamed from: a */
        final float f10768a;

        /* renamed from: b */
        final float f10769b;

        C4777a(float f, float f2) {
            this.f10768a = f;
            this.f10769b = f2;
        }
    }

    /* renamed from: a */
    static float m10475a(int i) {
        return ((float) i) / f10765a;
    }

    /* renamed from: a */
    public static JSONObject m10476a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m10475a(i));
            jSONObject.put("y", (double) m10475a(i2));
            jSONObject.put("width", (double) m10475a(i3));
            jSONObject.put("height", (double) m10475a(i4));
        } catch (JSONException e) {
            C4778c.m10492a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m10477a(Context context) {
        if (context != null) {
            f10765a = context.getResources().getDisplayMetrics().density;
            f10766b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m10478a(JSONObject jSONObject) {
        C4777a b = m10484b(jSONObject);
        try {
            jSONObject.put("width", (double) b.f10768a);
            jSONObject.put("height", (double) b.f10769b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m10479a(JSONObject jSONObject, C4791a.C4792a aVar) {
        C4764c a = aVar.mo39428a();
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.mo39430b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo39349b());
            jSONObject.put("friendlyObstructionPurpose", a.mo39350c());
            jSONObject.put("friendlyObstructionReason", a.mo39351d());
        } catch (JSONException e) {
            C4778c.m10492a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m10480a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C4778c.m10492a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m10481a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C4778c.m10492a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m10482a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m10483a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C4777a m10484b(JSONObject jSONObject) {
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
                return new C4777a(f2, f);
            }
        } else if (f10766b != null) {
            Point point = new Point(0, 0);
            f10766b.getDefaultDisplay().getRealSize(point);
            f2 = m10475a(point.x);
            f = m10475a(point.y);
            return new C4777a(f2, f);
        }
        f = 0.0f;
        return new C4777a(f2, f);
    }

    /* renamed from: b */
    public static void m10485b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C4778c.m10492a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m10486b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m10487c(jSONObject, jSONObject2) && m10488d(jSONObject, jSONObject2) && m10489e(jSONObject, jSONObject2) && m10490f(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m10487c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f10767c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m10488d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: e */
    private static boolean m10489e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10483a(optJSONArray, optJSONArray2)) {
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
    private static boolean m10490f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m10483a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!m10486b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }
}
