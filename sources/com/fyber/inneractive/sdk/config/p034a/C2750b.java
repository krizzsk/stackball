package com.fyber.inneractive.sdk.config.p034a;

import com.facebook.internal.NativeProtocol;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a.b */
public class C2750b {

    /* renamed from: e */
    private static final String f6483e = C2750b.class.getSimpleName();

    /* renamed from: a */
    public String f6484a;

    /* renamed from: b */
    int f6485b;

    /* renamed from: c */
    final List<C2759k> f6486c = new ArrayList();

    /* renamed from: d */
    List<C2752d> f6487d = new ArrayList();

    private C2750b() {
    }

    /* renamed from: a */
    public static C2750b m5981a(JSONObject jSONObject) throws Exception {
        C2750b bVar = new C2750b();
        bVar.f6484a = jSONObject.getString("id");
        bVar.f6485b = jSONObject.optInt("perc", 10);
        JSONArray jSONArray = jSONObject.getJSONArray("variants");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C2759k kVar = new C2759k();
            kVar.f6502a = jSONObject2.getString("id");
            kVar.f6503b = jSONObject2.getInt("perc");
            JSONObject optJSONObject = jSONObject2.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
            if (optJSONObject != null) {
                kVar.mo17998a(optJSONObject);
            }
            bVar.f6486c.add(kVar);
        }
        m5982a(bVar, jSONObject.optJSONObject("include"), true);
        m5982a(bVar, jSONObject.optJSONObject("exclude"), false);
        return bVar;
    }

    /* renamed from: a */
    private static void m5982a(C2750b bVar, JSONObject jSONObject, boolean z) throws Exception {
        Object obj;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1335432629:
                        if (next.equals("demand")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -977436259:
                        if (next.equals("pub_id")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -212583340:
                        if (next.equals("placement_type")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3556:
                        if (next.equals("os")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 113722:
                        if (next.equals("sdk")) {
                            c = 0;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    obj = new C2758j(jSONObject.getString(next), z);
                } else if (c == 1) {
                    obj = new C2751c(jSONObject.getJSONArray(next), z);
                } else if (c == 2) {
                    obj = new C2754f(jSONObject.getString(next), z);
                } else if (c == 3) {
                    obj = new C2757i(jSONObject.getJSONArray(next), z);
                } else if (c != 4) {
                    obj = null;
                } else {
                    obj = new C2756h(jSONObject.getJSONArray(next), z);
                }
                if (obj != null) {
                    bVar.f6487d.add(obj);
                } else {
                    IAlog.m9034b(String.format("%s: Unsupported filter type: %s", new Object[]{f6483e, next}), new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public final C2752d mo17990a(Class cls) {
        for (C2752d next : this.f6487d) {
            if (cls.equals(next.getClass())) {
                return next;
            }
        }
        return null;
    }

    public String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", new Object[]{this.f6484a, this.f6486c, this.f6487d});
    }
}
