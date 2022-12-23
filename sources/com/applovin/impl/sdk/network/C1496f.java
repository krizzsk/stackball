package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1521i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.f */
public class C1496f {

    /* renamed from: a */
    private String f3647a;

    /* renamed from: b */
    private String f3648b;

    /* renamed from: c */
    private String f3649c;

    /* renamed from: d */
    private Map<String, String> f3650d;

    /* renamed from: e */
    private Map<String, String> f3651e;

    /* renamed from: f */
    private Map<String, Object> f3652f;

    /* renamed from: g */
    private boolean f3653g;

    /* renamed from: h */
    private String f3654h;

    /* renamed from: i */
    private int f3655i;

    /* renamed from: com.applovin.impl.sdk.network.f$a */
    public static class C1498a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f3656a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f3657b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Map<String, String> f3658c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Map<String, String> f3659d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Map<String, Object> f3660e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f3661f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f3662g;

        /* renamed from: a */
        public C1498a mo13233a(String str) {
            this.f3656a = str;
            return this;
        }

        /* renamed from: a */
        public C1498a mo13234a(Map<String, String> map) {
            this.f3658c = map;
            return this;
        }

        /* renamed from: a */
        public C1498a mo13235a(boolean z) {
            this.f3661f = z;
            return this;
        }

        /* renamed from: a */
        public C1496f mo13236a() {
            return new C1496f(this);
        }

        /* renamed from: b */
        public C1498a mo13237b(String str) {
            this.f3657b = str;
            return this;
        }

        /* renamed from: b */
        public C1498a mo13238b(Map<String, String> map) {
            this.f3659d = map;
            return this;
        }

        /* renamed from: c */
        public C1498a mo13239c(String str) {
            this.f3662g = str;
            return this;
        }

        /* renamed from: c */
        public C1498a mo13240c(Map<String, Object> map) {
            this.f3660e = map;
            return this;
        }
    }

    private C1496f(C1498a aVar) {
        this.f3647a = UUID.randomUUID().toString();
        this.f3648b = aVar.f3656a;
        this.f3649c = aVar.f3657b;
        this.f3650d = aVar.f3658c;
        this.f3651e = aVar.f3659d;
        this.f3652f = aVar.f3660e;
        this.f3653g = aVar.f3661f;
        this.f3654h = aVar.f3662g;
        this.f3655i = 0;
    }

    C1496f(JSONObject jSONObject, C1469j jVar) throws Exception {
        String b = C1521i.m3487b(jSONObject, "uniqueId", UUID.randomUUID().toString(), jVar);
        String string = jSONObject.getString("targetUrl");
        String b2 = C1521i.m3487b(jSONObject, "backupUrl", "", jVar);
        int i = jSONObject.getInt("attemptNumber");
        Map<String, String> synchronizedMap = C1521i.m3484a(jSONObject, "parameters") ? Collections.synchronizedMap(C1521i.m3470a(jSONObject.getJSONObject("parameters"))) : Collections.emptyMap();
        Map<String, String> synchronizedMap2 = C1521i.m3484a(jSONObject, "httpHeaders") ? Collections.synchronizedMap(C1521i.m3470a(jSONObject.getJSONObject("httpHeaders"))) : Collections.emptyMap();
        Map<String, Object> synchronizedMap3 = C1521i.m3484a(jSONObject, "requestBody") ? Collections.synchronizedMap(C1521i.m3489b(jSONObject.getJSONObject("requestBody"))) : Collections.emptyMap();
        this.f3647a = b;
        this.f3648b = string;
        this.f3649c = b2;
        this.f3650d = synchronizedMap;
        this.f3651e = synchronizedMap2;
        this.f3652f = synchronizedMap3;
        this.f3653g = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f3655i = i;
    }

    /* renamed from: l */
    public static C1498a m3253l() {
        return new C1498a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo13219a() {
        return this.f3648b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo13220b() {
        return this.f3649c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Map<String, String> mo13221c() {
        return this.f3650d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, String> mo13222d() {
        return this.f3651e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, Object> mo13223e() {
        return this.f3652f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3647a.equals(((C1496f) obj).f3647a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo13225f() {
        return this.f3653g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo13226g() {
        return this.f3654h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo13227h() {
        return this.f3655i;
    }

    public int hashCode() {
        return this.f3647a.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo13229i() {
        this.f3655i++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo13230j() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.f3650d;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f3650d = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public JSONObject mo13231k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f3647a);
        jSONObject.put("targetUrl", this.f3648b);
        jSONObject.put("backupUrl", this.f3649c);
        jSONObject.put("isEncodingEnabled", this.f3653g);
        jSONObject.put("attemptNumber", this.f3655i);
        if (this.f3650d != null) {
            jSONObject.put("parameters", new JSONObject(this.f3650d));
        }
        if (this.f3651e != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f3651e));
        }
        if (this.f3652f != null) {
            jSONObject.put("requestBody", new JSONObject(this.f3652f));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f3647a + '\'' + ", communicatorRequestId='" + this.f3654h + '\'' + ", targetUrl='" + this.f3648b + '\'' + ", backupUrl='" + this.f3649c + '\'' + ", attemptNumber=" + this.f3655i + ", isEncodingEnabled=" + this.f3653g + '}';
    }
}
