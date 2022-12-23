package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.target.common.models.ImageData;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.x3 */
public class C7732x3 {

    /* renamed from: a */
    public final C7617q1 f19584a;

    /* renamed from: b */
    public final C7298a f19585b;

    /* renamed from: c */
    public final Context f19586c;

    /* renamed from: d */
    public boolean f19587d = true;

    public C7732x3(C7617q1 q1Var, C7298a aVar, Context context) {
        this.f19584a = q1Var;
        this.f19585b = aVar;
        this.f19586c = context;
    }

    /* renamed from: a */
    public static C7732x3 m20802a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7732x3(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final ImageData mo51825a(JSONObject jSONObject, String str) {
        String str2;
        String optString = jSONObject.optString("imageLink");
        if (TextUtils.isEmpty(optString)) {
            str2 = "InterstitialAdImageBanner no imageLink for image";
        } else {
            int optInt = jSONObject.optInt("width");
            int optInt2 = jSONObject.optInt("height");
            if (optInt > 0 && optInt2 > 0) {
                return ImageData.newImageData(optString, optInt, optInt2);
            }
            str2 = "InterstitialAdImageBanner  image has wrong dimensions, w = " + optInt + ", h = " + optInt2;
        }
        mo51826a(str2, "Required field", str);
        return null;
    }

    /* renamed from: a */
    public final void mo51826a(String str, String str2, String str3) {
        if (this.f19587d) {
            String str4 = this.f19584a.f19226a;
            C7498k3 c = C7498k3.m19572a(str2).mo50704d(str).mo50699a(this.f19585b.getSlotId()).mo50703c(str3);
            if (str4 == null) {
                str4 = this.f19584a.f19227b;
            }
            c.mo50701b(str4).mo50702b(this.f19586c);
        }
    }

    /* renamed from: a */
    public boolean mo51827a(JSONObject jSONObject, C7377e2 e2Var) {
        ImageData a;
        ImageData a2;
        this.f19587d = e2Var.isLogErrors();
        JSONArray optJSONArray = jSONObject.optJSONArray("portrait");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("landscape");
        if ((optJSONArray == null || optJSONArray.length() <= 0) && (optJSONArray2 == null || optJSONArray2.length() <= 0)) {
            mo51826a("No images in InterstitialAdImageBanner", "Required field", e2Var.getId());
            return false;
        }
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (a2 = mo51825a(optJSONObject, e2Var.getId())) == null)) {
                    e2Var.addPortraitImage(a2);
                }
            }
        }
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (!(optJSONObject2 == null || (a = mo51825a(optJSONObject2, e2Var.getId())) == null)) {
                    e2Var.addLandscapeImage(a);
                }
            }
        }
        return !e2Var.getLandscapeImages().isEmpty() || !e2Var.getPortraitImages().isEmpty();
    }
}
