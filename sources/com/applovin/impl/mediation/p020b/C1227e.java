package com.applovin.impl.mediation.p020b;

import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinPrivacySettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.e */
public class C1227e {

    /* renamed from: a */
    private final JSONObject f2362a;

    /* renamed from: b */
    protected final C1469j f2363b;

    /* renamed from: c */
    private final JSONObject f2364c;

    /* renamed from: d */
    private final Object f2365d = new Object();

    /* renamed from: e */
    private final Object f2366e = new Object();

    /* renamed from: f */
    private volatile String f2367f;

    public C1227e(JSONObject jSONObject, JSONObject jSONObject2, C1469j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        } else if (jSONObject != null) {
            this.f2363b = jVar;
            this.f2362a = jSONObject2;
            this.f2364c = jSONObject;
        } else {
            throw new IllegalArgumentException("No spec object specified");
        }
    }

    /* renamed from: a */
    private int mo12284a() {
        return mo12354b("mute_state", mo12346a("mute_state", ((Integer) this.f2363b.mo13088a(C1368b.f2820P)).intValue()));
    }

    /* renamed from: a */
    private List<String> mo12319a(String str) {
        try {
            return C1521i.m3488b(mo12350a(str, new JSONArray()));
        } catch (JSONException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* renamed from: a */
    private List<String> m2086a(List<String> list, Map<String, String> map) {
        Map<String, String> b = mo12285b();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (String next2 : b.keySet()) {
                next = next.replace(next2, m2089f(b.get(next2)));
            }
            for (String next3 : map.keySet()) {
                next = next.replace(next3, map.get(next3));
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* renamed from: b */
    private Map<String, String> mo12285b() {
        try {
            return C1521i.m3470a(new JSONObject((String) this.f2363b.mo13088a(C1368b.f2830i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    /* renamed from: e */
    private List<String> m2088e(String str) {
        try {
            return C1521i.m3488b(mo12357b(str, new JSONArray()));
        } catch (JSONException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* renamed from: f */
    private String m2089f(String str) {
        String b = mo12356b(str, "");
        return C1553o.m3554b(b) ? b : mo12348a(str, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public JSONObject mo12334F() {
        JSONObject jSONObject;
        synchronized (this.f2366e) {
            jSONObject = this.f2362a;
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public JSONObject mo12335G() {
        JSONObject jSONObject;
        synchronized (this.f2365d) {
            jSONObject = this.f2364c;
        }
        return jSONObject;
    }

    /* renamed from: H */
    public String mo12336H() {
        return mo12356b("class", (String) null);
    }

    /* renamed from: I */
    public String mo12337I() {
        return mo12356b("name", (String) null);
    }

    /* renamed from: J */
    public String mo12338J() {
        return mo12337I().split("_")[0];
    }

    /* renamed from: K */
    public boolean mo12339K() {
        return mo12360b("is_testing", (Boolean) false);
    }

    /* renamed from: L */
    public boolean mo12340L() {
        return mo12360b("run_on_ui_thread", (Boolean) true);
    }

    /* renamed from: M */
    public Bundle mo12341M() {
        Bundle c = mo12361c("server_parameters") instanceof JSONObject ? C1521i.m3494c(mo12351a("server_parameters", (JSONObject) null)) : new Bundle();
        int a = mo12284a();
        if (a != -1) {
            c.putBoolean("is_muted", a == 2 ? this.f2363b.mo13128l().isMuted() : a == 0);
        }
        return c;
    }

    /* renamed from: N */
    public long mo12342N() {
        return mo12355b("adapter_timeout_ms", ((Long) this.f2363b.mo13088a(C1368b.f2836o)).longValue());
    }

    /* renamed from: O */
    public long mo12343O() {
        return mo12355b("init_completion_delay_ms", -1);
    }

    /* renamed from: P */
    public String mo12344P() {
        return this.f2367f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo12345a(String str, float f) {
        float a;
        synchronized (this.f2365d) {
            a = C1521i.m3460a(this.f2364c, str, f, this.f2363b);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo12346a(String str, int i) {
        int b;
        synchronized (this.f2366e) {
            b = C1521i.m3485b(this.f2362a, str, i, this.f2363b);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo12347a(String str, long j) {
        long a;
        synchronized (this.f2366e) {
            a = C1521i.m3461a(this.f2362a, str, j, this.f2363b);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo12348a(String str, String str2) {
        String b;
        synchronized (this.f2366e) {
            b = C1521i.m3487b(this.f2362a, str, str2, this.f2363b);
        }
        return b;
    }

    /* renamed from: a */
    public List<String> mo12349a(String str, Map<String, String> map) {
        if (str != null) {
            List<String> a = mo12319a(str);
            List<String> e = m2088e(str);
            ArrayList arrayList = new ArrayList(a.size() + e.size());
            arrayList.addAll(a);
            arrayList.addAll(e);
            return m2086a((List<String>) arrayList, map);
        }
        throw new IllegalArgumentException("No key specified");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONArray mo12350a(String str, JSONArray jSONArray) {
        JSONArray b;
        synchronized (this.f2366e) {
            b = C1521i.m3491b(this.f2362a, str, jSONArray, this.f2363b);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject mo12351a(String str, JSONObject jSONObject) {
        JSONObject b;
        synchronized (this.f2365d) {
            b = C1521i.m3492b(this.f2364c, str, jSONObject, this.f2363b);
        }
        return b;
    }

    /* renamed from: a */
    public boolean mo12352a(Context context) {
        return mo12359b("huc") ? mo12360b("huc", (Boolean) false) : mo12353a("huc", Boolean.valueOf(AppLovinPrivacySettings.hasUserConsent(context)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo12353a(String str, Boolean bool) {
        boolean booleanValue;
        synchronized (this.f2366e) {
            booleanValue = C1521i.m3463a(this.f2362a, str, bool, this.f2363b).booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo12354b(String str, int i) {
        int b;
        synchronized (this.f2365d) {
            b = C1521i.m3485b(this.f2364c, str, i, this.f2363b);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo12355b(String str, long j) {
        long a;
        synchronized (this.f2365d) {
            a = C1521i.m3461a(this.f2364c, str, j, this.f2363b);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo12356b(String str, String str2) {
        String b;
        synchronized (this.f2365d) {
            b = C1521i.m3487b(this.f2364c, str, str2, this.f2363b);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONArray mo12357b(String str, JSONArray jSONArray) {
        JSONArray b;
        synchronized (this.f2365d) {
            b = C1521i.m3491b(this.f2364c, str, jSONArray, this.f2363b);
        }
        return b;
    }

    /* renamed from: b */
    public boolean mo12358b(Context context) {
        return mo12359b("aru") ? mo12360b("aru", (Boolean) false) : mo12353a("aru", Boolean.valueOf(AppLovinPrivacySettings.isAgeRestrictedUser(context)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo12359b(String str) {
        boolean has;
        synchronized (this.f2365d) {
            has = this.f2364c.has(str);
        }
        return has;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo12360b(String str, Boolean bool) {
        boolean booleanValue;
        synchronized (this.f2365d) {
            booleanValue = C1521i.m3463a(this.f2364c, str, bool, this.f2363b).booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo12361c(String str) {
        Object opt;
        synchronized (this.f2365d) {
            opt = this.f2364c.opt(str);
        }
        return opt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12362c(String str, long j) {
        synchronized (this.f2365d) {
            C1521i.m3493b(this.f2364c, str, j, this.f2363b);
        }
    }

    /* renamed from: c */
    public boolean mo12363c(Context context) {
        return mo12359b("dns") ? mo12360b("dns", (Boolean) false) : mo12353a("dns", Boolean.valueOf(AppLovinPrivacySettings.isDoNotSell(context)));
    }

    /* renamed from: d */
    public void mo12364d(String str) {
        this.f2367f = str;
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + mo12336H() + "', adapterName='" + mo12337I() + "', isTesting=" + mo12339K() + '}';
    }
}
