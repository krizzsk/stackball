package com.applovin.impl.sdk.p026c;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.c.f */
public class C1384f {

    /* renamed from: a */
    private final List<C1386a> f3240a;

    /* renamed from: b */
    private final Object f3241b = new Object();

    /* renamed from: c */
    private final C1469j f3242c;

    /* renamed from: d */
    private final C1505q f3243d;

    /* renamed from: com.applovin.impl.sdk.c.f$a */
    private static class C1386a {

        /* renamed from: a */
        private final Long f3244a;

        /* renamed from: b */
        private final String f3245b;

        /* renamed from: c */
        private final String f3246c;

        /* renamed from: d */
        private final String f3247d;

        private C1386a(String str, Throwable th) {
            this.f3245b = str;
            this.f3244a = Long.valueOf(System.currentTimeMillis());
            String str2 = null;
            this.f3246c = th != null ? th.getClass().getName() : null;
            this.f3247d = th != null ? th.getMessage() : str2;
        }

        private C1386a(JSONObject jSONObject) throws JSONException {
            this.f3245b = jSONObject.getString("ms");
            this.f3244a = Long.valueOf(jSONObject.getLong("ts"));
            JSONObject optJSONObject = jSONObject.optJSONObject("ex");
            String str = null;
            this.f3246c = optJSONObject != null ? optJSONObject.getString("nm") : null;
            this.f3247d = optJSONObject != null ? optJSONObject.getString("rn") : str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject m2750a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", this.f3245b);
            jSONObject.put("ts", this.f3244a);
            if (!TextUtils.isEmpty(this.f3246c)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("nm", this.f3246c);
                if (!TextUtils.isEmpty(this.f3247d)) {
                    jSONObject2.put("rn", this.f3247d);
                }
                jSONObject.put("ex", jSONObject2);
            }
            return jSONObject;
        }

        public String toString() {
            return "ErrorLog{timestampMillis=" + this.f3244a + ",message='" + this.f3245b + '\'' + ",throwableName='" + this.f3246c + '\'' + ",throwableReason='" + this.f3247d + '\'' + '}';
        }
    }

    public C1384f(C1469j jVar) {
        this.f3242c = jVar;
        this.f3243d = jVar.mo13139v();
        this.f3240a = new ArrayList();
    }

    /* renamed from: d */
    private void m2745d() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f3241b) {
            for (C1386a next : this.f3240a) {
                try {
                    jSONArray.put(next.m2750a());
                } catch (JSONException e) {
                    this.f3243d.mo13274a("ErrorManager", false, "Failed to convert error log into json.", e);
                    this.f3240a.remove(next);
                }
            }
        }
        this.f3242c.mo13095a(C1371e.f3163o, jSONArray.toString());
    }

    /* renamed from: a */
    public JSONArray mo12920a() {
        JSONArray jSONArray;
        synchronized (this.f3241b) {
            jSONArray = new JSONArray();
            for (C1386a a : this.f3240a) {
                try {
                    jSONArray.put(a.m2750a());
                } catch (JSONException e) {
                    this.f3243d.mo13274a("ErrorManager", false, "Failed to convert error log into json.", e);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public void mo12921a(String str, Throwable th) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f3241b) {
                if (this.f3240a.size() < ((Integer) this.f3242c.mo13088a(C1369c.f3069eC)).intValue()) {
                    this.f3240a.add(new C1386a(str, th));
                    m2745d();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo12922b() {
        String str = (String) this.f3242c.mo13112b(C1371e.f3163o, null);
        if (str != null) {
            synchronized (this.f3241b) {
                try {
                    this.f3240a.clear();
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            this.f3240a.add(new C1386a(jSONArray.getJSONObject(i)));
                        } catch (JSONException e) {
                            this.f3243d.mo13274a("ErrorManager", false, "Failed to convert error json into a log.", e);
                        }
                    }
                } catch (JSONException e2) {
                    this.f3243d.mo13278b("ErrorManager", "Unable to convert String to json.", e2);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo12923c() {
        synchronized (this.f3241b) {
            this.f3240a.clear();
            this.f3242c.mo13116b(C1371e.f3163o);
        }
    }
}
