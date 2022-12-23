package com.ironsource.mediationsdk.p137a;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.a */
abstract class C5633a {

    /* renamed from: a */
    JSONObject f13277a;

    /* renamed from: b */
    int f13278b;

    /* renamed from: c */
    String f13279c;

    /* renamed from: d */
    private final String f13280d = "eventId";

    /* renamed from: e */
    private final String f13281e = "timestamp";

    /* renamed from: f */
    private final String f13282f = "InterstitialEvents";

    /* renamed from: g */
    private final String f13283g = "events";

    /* renamed from: h */
    private final String f13284h = "events";

    C5633a() {
    }

    /* renamed from: a */
    static JSONObject m13748a(C5641c cVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(cVar.mo41710c()) ? new JSONObject(cVar.mo41710c()) : new JSONObject();
            jSONObject.put("eventId", cVar.mo41706a());
            jSONObject.put("timestamp", cVar.mo41709b());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo41671a() {
        return TextUtils.isEmpty(this.f13279c) ? mo41674b() : this.f13279c;
    }

    /* renamed from: a */
    public abstract String mo41672a(ArrayList<C5641c> arrayList, JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo41673a(JSONArray jSONArray) {
        try {
            if (this.f13277a == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(this.f13277a.toString());
            jSONObject.put("timestamp", IronSourceUtils.getTimeStamp());
            String str = "events";
            if (this.f13278b == 2) {
                str = "InterstitialEvents";
            }
            jSONObject.put(str, jSONArray);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo41674b();

    /* renamed from: c */
    public abstract String mo41675c();
}
