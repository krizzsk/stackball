package com.adcolony.sdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.y0 */
class C0895y0 {

    /* renamed from: a */
    private final JSONArray f1609a;

    C0895y0() {
        this(new JSONArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo10020a(int i) throws JSONException {
        return this.f1609a.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10024b(int i) throws JSONException {
        return this.f1609a.getInt(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0897z0 mo10033c(int i) throws JSONException {
        return new C0897z0(this.f1609a.getJSONObject(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo10034d(int i) throws JSONException {
        return this.f1609a.getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo10036e(int i) {
        boolean optBoolean;
        synchronized (this.f1609a) {
            optBoolean = this.f1609a.optBoolean(i);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Boolean mo10038f(int i) {
        try {
            return Boolean.valueOf(this.f1609a.getBoolean(i));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public double mo10039g(int i) {
        double optDouble;
        synchronized (this.f1609a) {
            optDouble = this.f1609a.optDouble(i);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo10040h(int i) {
        int optInt;
        synchronized (this.f1609a) {
            optInt = this.f1609a.optInt(i);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0897z0 mo10041i(int i) {
        C0897z0 z0Var;
        synchronized (this.f1609a) {
            JSONObject optJSONObject = this.f1609a.optJSONObject(i);
            z0Var = optJSONObject != null ? new C0897z0(optJSONObject) : new C0897z0();
        }
        return z0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0897z0 mo10042j(int i) {
        C0897z0 z0Var;
        synchronized (this.f1609a) {
            JSONObject optJSONObject = this.f1609a.optJSONObject(i);
            z0Var = optJSONObject != null ? new C0897z0(optJSONObject) : null;
        }
        return z0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0895y0 mo10043k(int i) {
        C0895y0 y0Var;
        synchronized (this.f1609a) {
            JSONArray optJSONArray = this.f1609a.optJSONArray(i);
            y0Var = optJSONArray != null ? new C0895y0(optJSONArray) : new C0895y0();
        }
        return y0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0895y0 mo10044l(int i) {
        C0895y0 y0Var;
        synchronized (this.f1609a) {
            JSONArray optJSONArray = this.f1609a.optJSONArray(i);
            y0Var = optJSONArray != null ? new C0895y0(optJSONArray) : null;
        }
        return y0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public long mo10045m(int i) {
        long optLong;
        synchronized (this.f1609a) {
            optLong = this.f1609a.optLong(i);
        }
        return optLong;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Object mo10046n(int i) {
        Object opt;
        synchronized (this.f1609a) {
            opt = this.f1609a.isNull(i) ? null : this.f1609a.opt(i);
        }
        return opt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo10047o(int i) {
        String optString;
        synchronized (this.f1609a) {
            optString = this.f1609a.optString(i);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo10048p(int i) {
        synchronized (this.f1609a) {
            if (!this.f1609a.isNull(i)) {
                Object opt = this.f1609a.opt(i);
                if (opt instanceof String) {
                    String str = (String) opt;
                    return str;
                } else if (opt != null) {
                    String valueOf = String.valueOf(opt);
                    return valueOf;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C0895y0 mo10049q(int i) {
        synchronized (this.f1609a) {
            this.f1609a.put(i);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10050r(int i) {
        synchronized (this.f1609a) {
            this.f1609a.remove(i);
        }
    }

    public String toString() {
        String jSONArray;
        synchronized (this.f1609a) {
            jSONArray = this.f1609a.toString();
        }
        return jSONArray;
    }

    C0895y0(String str) throws JSONException {
        this(new JSONArray(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10022a(int i, boolean z) {
        boolean optBoolean;
        synchronized (this.f1609a) {
            optBoolean = this.f1609a.optBoolean(i, z);
        }
        return optBoolean;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0895y0 mo10030b(String str) {
        synchronized (this.f1609a) {
            this.f1609a.put(str);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0897z0[] mo10035d() {
        C0897z0[] z0VarArr;
        synchronized (this.f1609a) {
            z0VarArr = new C0897z0[this.f1609a.length()];
            for (int i = 0; i < this.f1609a.length(); i++) {
                z0VarArr[i] = mo10041i(i);
            }
        }
        return z0VarArr;
    }

    C0895y0(JSONArray jSONArray) throws NullPointerException {
        jSONArray.getClass();
        this.f1609a = jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo10032c() {
        return this.f1609a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String[] mo10037e() {
        String[] strArr;
        synchronized (this.f1609a) {
            strArr = new String[this.f1609a.length()];
            for (int i = 0; i < this.f1609a.length(); i++) {
                strArr[i] = mo10047o(i);
            }
        }
        return strArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10012a(int i, int i2) {
        int optInt;
        synchronized (this.f1609a) {
            optInt = this.f1609a.optInt(i, i2);
        }
        return optInt;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0895y0 mo10029b(int i, boolean z) throws JSONException {
        synchronized (this.f1609a) {
            this.f1609a.put(i, z);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo10013a(int i, long j) {
        long optLong;
        synchronized (this.f1609a) {
            optLong = this.f1609a.optLong(i, j);
        }
        return optLong;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0895y0 mo10025b(int i, double d) throws JSONException {
        synchronized (this.f1609a) {
            this.f1609a.put(i, d);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo10011a(int i, double d) {
        double optDouble;
        synchronized (this.f1609a) {
            optDouble = this.f1609a.optDouble(i, d);
        }
        return optDouble;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0895y0 mo10026b(int i, int i2) throws JSONException {
        synchronized (this.f1609a) {
            this.f1609a.put(i, i2);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10021a(int i, String str) {
        String optString;
        synchronized (this.f1609a) {
            optString = this.f1609a.optString(i, str);
        }
        return optString;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0895y0 mo10027b(int i, long j) throws JSONException {
        synchronized (this.f1609a) {
            this.f1609a.put(i, j);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0895y0 mo10019a(boolean z) {
        synchronized (this.f1609a) {
            this.f1609a.put(z);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0895y0 mo10028b(int i, String str) throws JSONException {
        synchronized (this.f1609a) {
            this.f1609a.put(i, str);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0895y0 mo10016a(long j) {
        synchronized (this.f1609a) {
            this.f1609a.put(j);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public JSONArray mo10031b() {
        return this.f1609a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0895y0 mo10015a(double d) throws JSONException {
        synchronized (this.f1609a) {
            this.f1609a.put(d);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0895y0 mo10018a(JSONObject jSONObject) {
        synchronized (this.f1609a) {
            this.f1609a.put(jSONObject);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0895y0 mo10017a(C0897z0 z0Var) {
        synchronized (this.f1609a) {
            this.f1609a.put(z0Var.mo10059a());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0895y0 mo10014a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f1609a) {
            for (int i = 0; i < this.f1609a.length(); i++) {
                try {
                    jSONArray.put(this.f1609a.get(i));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return new C0895y0(jSONArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10023a(String str) {
        boolean z;
        synchronized (this.f1609a) {
            z = false;
            int i = 0;
            while (true) {
                if (i >= this.f1609a.length()) {
                    break;
                } else if (mo10047o(i).equals(str)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        return z;
    }
}
