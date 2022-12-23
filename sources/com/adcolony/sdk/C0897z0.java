package com.adcolony.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.z0 */
class C0897z0 {

    /* renamed from: a */
    private final JSONObject f1611a;

    C0897z0() {
        this(new JSONObject());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10060a(C0897z0 z0Var) {
        if (z0Var != null) {
            synchronized (this.f1611a) {
                synchronized (z0Var.f1611a) {
                    Iterator<String> b = z0Var.m1212b();
                    while (b.hasNext()) {
                        String next = b.next();
                        try {
                            this.f1611a.put(next, z0Var.f1611a.get(next));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10069b(String str) throws JSONException {
        boolean z;
        synchronized (this.f1611a) {
            z = this.f1611a.getBoolean(str);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo10071c(String str) throws JSONException {
        int i;
        synchronized (this.f1611a) {
            i = this.f1611a.getInt(str);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0895y0 mo10073d(String str) throws JSONException {
        C0895y0 y0Var;
        synchronized (this.f1611a) {
            y0Var = new C0895y0(this.f1611a.getJSONArray(str));
        }
        return y0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0897z0 mo10075e(String str) throws JSONException {
        C0897z0 z0Var;
        synchronized (this.f1611a) {
            z0Var = new C0897z0(this.f1611a.getJSONObject(str));
        }
        return z0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo10077f(String str) throws JSONException {
        long j;
        synchronized (this.f1611a) {
            j = this.f1611a.getLong(str);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo10078g(String str) throws JSONException {
        String string;
        synchronized (this.f1611a) {
            string = this.f1611a.getString(str);
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo10079h(String str) {
        boolean optBoolean;
        synchronized (this.f1611a) {
            optBoolean = this.f1611a.optBoolean(str);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Boolean mo10080i(String str) {
        Boolean valueOf;
        try {
            synchronized (this.f1611a) {
                valueOf = Boolean.valueOf(this.f1611a.getBoolean(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public double mo10081j(String str) {
        double optDouble;
        synchronized (this.f1611a) {
            optDouble = this.f1611a.optDouble(str);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Integer mo10082k(String str) {
        Integer valueOf;
        try {
            synchronized (this.f1611a) {
                valueOf = Integer.valueOf(this.f1611a.getInt(str));
            }
            return valueOf;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo10083l(String str) {
        int optInt;
        synchronized (this.f1611a) {
            optInt = this.f1611a.optInt(str);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0895y0 mo10084m(String str) {
        C0895y0 y0Var;
        synchronized (this.f1611a) {
            JSONArray optJSONArray = this.f1611a.optJSONArray(str);
            y0Var = optJSONArray != null ? new C0895y0(optJSONArray) : new C0895y0();
        }
        return y0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C0895y0 mo10085n(String str) {
        C0895y0 y0Var;
        synchronized (this.f1611a) {
            JSONArray optJSONArray = this.f1611a.optJSONArray(str);
            y0Var = optJSONArray != null ? new C0895y0(optJSONArray) : null;
        }
        return y0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C0897z0 mo10086o(String str) {
        C0897z0 z0Var;
        synchronized (this.f1611a) {
            JSONObject optJSONObject = this.f1611a.optJSONObject(str);
            z0Var = optJSONObject != null ? new C0897z0(optJSONObject) : new C0897z0();
        }
        return z0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0897z0 mo10087p(String str) {
        C0897z0 z0Var;
        synchronized (this.f1611a) {
            JSONObject optJSONObject = this.f1611a.optJSONObject(str);
            z0Var = optJSONObject != null ? new C0897z0(optJSONObject) : null;
        }
        return z0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public long mo10088q(String str) {
        long optLong;
        synchronized (this.f1611a) {
            optLong = this.f1611a.optLong(str);
        }
        return optLong;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Object mo10089r(String str) {
        Object opt;
        synchronized (this.f1611a) {
            opt = this.f1611a.isNull(str) ? null : this.f1611a.opt(str);
        }
        return opt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public String mo10090s(String str) {
        String optString;
        synchronized (this.f1611a) {
            optString = this.f1611a.optString(str);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        return null;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo10091t(java.lang.String r3) {
        /*
            r2 = this;
            org.json.JSONObject r0 = r2.f1611a
            monitor-enter(r0)
            org.json.JSONObject r1 = r2.f1611a     // Catch:{ all -> 0x0024 }
            boolean r1 = r1.isNull(r3)     // Catch:{ all -> 0x0024 }
            if (r1 != 0) goto L_0x0021
            org.json.JSONObject r1 = r2.f1611a     // Catch:{ all -> 0x0024 }
            java.lang.Object r3 = r1.opt(r3)     // Catch:{ all -> 0x0024 }
            boolean r1 = r3 instanceof java.lang.String     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0019
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0019:
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return r3
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            r3 = 0
            return r3
        L_0x0024:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0897z0.mo10091t(java.lang.String):java.lang.String");
    }

    public String toString() {
        String jSONObject;
        synchronized (this.f1611a) {
            jSONObject = this.f1611a.toString();
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo10093u(String str) {
        synchronized (this.f1611a) {
            this.f1611a.remove(str);
        }
    }

    C0897z0(String str) throws JSONException {
        this(new JSONObject(str));
    }

    C0897z0(Map<?, ?> map) {
        this(new JSONObject(map));
    }

    C0897z0(JSONObject jSONObject) throws NullPointerException {
        jSONObject.getClass();
        this.f1611a = jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0897z0 mo10068b(String str, boolean z) throws JSONException {
        synchronized (this.f1611a) {
            this.f1611a.put(str, z);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10072c(String str, int i) throws JSONException {
        synchronized (this.f1611a) {
            if (this.f1611a.has(str)) {
                return false;
            }
            this.f1611a.put(str, i);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10074d() {
        synchronized (this.f1611a) {
            Iterator<String> b = m1212b();
            while (b.hasNext()) {
                Object r = mo10089r(b.next());
                if (r == null || (((r instanceof JSONArray) && ((JSONArray) r).length() == 0) || (((r instanceof JSONObject) && ((JSONObject) r).length() == 0) || r.equals("")))) {
                    b.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> mo10076e() {
        HashMap hashMap = new HashMap();
        synchronized (this.f1611a) {
            Iterator<String> b = m1212b();
            while (b.hasNext()) {
                String next = b.next();
                hashMap.put(next, mo10090s(next));
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0897z0 mo10065b(String str, int i) throws JSONException {
        synchronized (this.f1611a) {
            this.f1611a.put(str, i);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0897z0 mo10066b(String str, long j) throws JSONException {
        synchronized (this.f1611a) {
            this.f1611a.put(str, j);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo10070c() {
        return this.f1611a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0897z0 mo10064b(String str, double d) throws JSONException {
        synchronized (this.f1611a) {
            this.f1611a.put(str, d);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10062a(String str) {
        boolean z;
        synchronized (this.f1611a) {
            Iterator<String> b = m1212b();
            while (true) {
                if (b.hasNext()) {
                    if (str.equals(b.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0897z0 mo10067b(String str, String str2) throws JSONException {
        synchronized (this.f1611a) {
            this.f1611a.put(str, str2);
        }
        return this;
    }

    /* renamed from: b */
    private Iterator<String> m1212b() {
        return this.f1611a.keys();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10063a(String str, boolean z) {
        boolean optBoolean;
        synchronized (this.f1611a) {
            optBoolean = this.f1611a.optBoolean(str, z);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10054a(String str, int i) {
        int optInt;
        synchronized (this.f1611a) {
            optInt = this.f1611a.optInt(str, i);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo10055a(String str, long j) {
        long optLong;
        synchronized (this.f1611a) {
            optLong = this.f1611a.optLong(str, j);
        }
        return optLong;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo10053a(String str, double d) {
        double optDouble;
        synchronized (this.f1611a) {
            optDouble = this.f1611a.optDouble(str, d);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10058a(String str, String str2) {
        String optString;
        synchronized (this.f1611a) {
            optString = this.f1611a.optString(str, str2);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0897z0 mo10057a(String str, C0897z0 z0Var) throws JSONException {
        synchronized (this.f1611a) {
            this.f1611a.put(str, z0Var.mo10059a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0897z0 mo10056a(String str, C0895y0 y0Var) throws JSONException {
        synchronized (this.f1611a) {
            this.f1611a.put(str, y0Var.mo10031b());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10061a(String[] strArr) {
        synchronized (this.f1611a) {
            for (String remove : strArr) {
                this.f1611a.remove(remove);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo10059a() {
        return this.f1611a;
    }
}
