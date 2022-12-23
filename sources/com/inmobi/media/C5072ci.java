package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ci */
/* compiled from: OrientationProperties */
public class C5072ci {

    /* renamed from: e */
    private static String f11607e = C5072ci.class.getSimpleName();

    /* renamed from: a */
    public boolean f11608a = true;

    /* renamed from: b */
    public String f11609b = "none";

    /* renamed from: c */
    public String f11610c = "right";

    /* renamed from: d */
    public String f11611d = null;

    /* renamed from: a */
    public static C5072ci m11512a(String str, C5072ci ciVar) {
        C5072ci ciVar2 = new C5072ci();
        ciVar2.f11611d = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            ciVar2.f11609b = jSONObject.optString("forceOrientation", ciVar.f11609b);
            ciVar2.f11608a = jSONObject.optBoolean("allowOrientationChange", ciVar.f11608a);
            ciVar2.f11610c = jSONObject.optString("direction", ciVar.f11610c);
            if (!ciVar2.f11609b.equals("portrait") && !ciVar2.f11609b.equals("landscape")) {
                ciVar2.f11609b = "none";
            }
            if (ciVar2.f11610c.equals("left") || ciVar2.f11610c.equals("right")) {
                return ciVar2;
            }
            ciVar2.f11610c = "right";
            return ciVar2;
        } catch (JSONException unused) {
            return null;
        }
    }
}
