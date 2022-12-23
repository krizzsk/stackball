package com.flurry.sdk;

import com.p243my.target.ads.Reward;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.c */
public class C2473c {

    /* renamed from: b */
    private static final String f5775b = C2473c.class.getSimpleName();

    /* renamed from: c */
    private static String f5776c;

    /* renamed from: d */
    private static String f5777d;

    /* renamed from: a */
    C2474a f5778a;

    /* renamed from: e */
    private Object f5779e;

    /* renamed from: com.flurry.sdk.c$a */
    public enum C2474a {
        String("string"),
        Locale("localizedString"),
        Tombstone("tombstone");
        
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f5784d;

        private C2474a(String str) {
            this.f5784d = str;
        }

        public final String toString() {
            return this.f5784d;
        }
    }

    public C2473c(JSONObject jSONObject) {
        String optString = jSONObject.optString("type");
        if (C2474a.String.f5784d.equals(optString)) {
            this.f5778a = C2474a.String;
            this.f5779e = jSONObject.optString("value");
        } else if (C2474a.Locale.f5784d.equals(optString)) {
            this.f5778a = C2474a.Locale;
            this.f5779e = jSONObject.optJSONObject("value");
        } else if (C2474a.Tombstone.f5784d.equals(optString)) {
            this.f5778a = C2474a.Tombstone;
        } else {
            C2530db.m5482b(f5775b, "Unknown ConfigItem type: ".concat(String.valueOf(optString)));
        }
    }

    /* renamed from: a */
    public final String mo17664a() {
        if (this.f5779e == null) {
            return null;
        }
        if (this.f5778a != C2474a.Locale) {
            return (String) this.f5779e;
        }
        if (f5776c == null) {
            f5776c = Locale.getDefault().toString();
            f5777d = Locale.getDefault().getLanguage();
        }
        JSONObject jSONObject = (JSONObject) this.f5779e;
        String optString = jSONObject.optString(f5776c, (String) null);
        if (optString == null) {
            optString = jSONObject.optString(f5777d, (String) null);
        }
        return optString == null ? jSONObject.optString(Reward.DEFAULT) : optString;
    }

    /* renamed from: a */
    public final JSONObject mo17665a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("type", this.f5778a.toString());
            jSONObject.put("value", this.f5779e);
            return jSONObject;
        } catch (JSONException e) {
            C2530db.m5477a(f5775b, "Error to create JSON object.", (Throwable) e);
            return null;
        }
    }
}
