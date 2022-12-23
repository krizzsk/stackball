package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ft1 {

    /* renamed from: a */
    private static WindowManager f33739a;

    /* renamed from: b */
    private static String[] f33740b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f33741c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: d */
    public static final /* synthetic */ int f33742d = 0;

    /* renamed from: a */
    static float m36308a(int i) {
        return ((float) i) / f33741c;
    }

    /* renamed from: a */
    public static JSONObject m36309a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m36308a(i));
            jSONObject.put("y", (double) m36308a(i2));
            jSONObject.put("width", (double) m36308a(i3));
            jSONObject.put("height", (double) m36308a(i4));
        } catch (JSONException e) {
            mt1.m39732a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m36310a(Context context) {
        f33741c = context.getResources().getDisplayMetrics().density;
        f33739a = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: a */
    public static void m36311a(JSONObject jSONObject) {
        float f;
        JSONObject jSONObject2 = jSONObject;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject2.optJSONArray("childViews");
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
                f = f2;
                f2 = f3;
                jSONObject2.put("width", (double) f);
                jSONObject2.put("height", (double) f2);
            }
        } else if (f33739a != null) {
            Point point = new Point(0, 0);
            f33739a.getDefaultDisplay().getRealSize(point);
            float a = m36308a(point.x);
            f2 = m36308a(point.y);
            f = a;
            jSONObject2.put("width", (double) f);
            jSONObject2.put("height", (double) f2);
        }
        f = 0.0f;
        try {
            jSONObject2.put("width", (double) f);
            jSONObject2.put("height", (double) f2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m36312a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            mt1.m39732a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    private static boolean m36313a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m36314a(org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            r0 = 1
            if (r10 != 0) goto L_0x0006
            if (r11 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r10 == 0) goto L_0x00bd
            if (r11 != 0) goto L_0x000d
            goto L_0x00bd
        L_0x000d:
            java.lang.String[] r2 = f33740b
            int r3 = r2.length
            r4 = 0
        L_0x0011:
            if (r4 >= r3) goto L_0x0026
            r5 = r2[r4]
            double r6 = r10.optDouble(r5)
            double r8 = r11.optDouble(r5)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0023
            r2 = 0
            goto L_0x0027
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0026:
            r2 = 1
        L_0x0027:
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r10.optString(r2, r3)
            java.lang.String r2 = r11.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r10.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r11.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            if (r4 != r2) goto L_0x0051
            r2 = 1
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r10.optJSONArray(r2)
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r4 != 0) goto L_0x0063
            if (r2 != 0) goto L_0x0063
            goto L_0x0084
        L_0x0063:
            boolean r5 = m36313a((org.json.JSONArray) r4, (org.json.JSONArray) r2)
            if (r5 != 0) goto L_0x006a
            goto L_0x007f
        L_0x006a:
            r5 = 0
        L_0x006b:
            int r6 = r4.length()
            if (r5 >= r6) goto L_0x0084
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0081
        L_0x007f:
            r2 = 0
            goto L_0x0085
        L_0x0081:
            int r5 = r5 + 1
            goto L_0x006b
        L_0x0084:
            r2 = 1
        L_0x0085:
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = "childViews"
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            org.json.JSONArray r11 = r11.optJSONArray(r2)
            if (r10 != 0) goto L_0x0096
            if (r11 != 0) goto L_0x0096
            goto L_0x00b7
        L_0x0096:
            boolean r2 = m36313a((org.json.JSONArray) r10, (org.json.JSONArray) r11)
            if (r2 != 0) goto L_0x009d
            goto L_0x00b2
        L_0x009d:
            r2 = 0
        L_0x009e:
            int r3 = r10.length()
            if (r2 >= r3) goto L_0x00b7
            org.json.JSONObject r3 = r10.optJSONObject(r2)
            org.json.JSONObject r4 = r11.optJSONObject(r2)
            boolean r3 = m36314a((org.json.JSONObject) r3, (org.json.JSONObject) r4)
            if (r3 != 0) goto L_0x00b4
        L_0x00b2:
            r10 = 0
            goto L_0x00b8
        L_0x00b4:
            int r2 = r2 + 1
            goto L_0x009e
        L_0x00b7:
            r10 = 1
        L_0x00b8:
            if (r10 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            return r0
        L_0x00bd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ft1.m36314a(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
