package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1369c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.b */
public class C1488b<T> {

    /* renamed from: a */
    private String f3605a;

    /* renamed from: b */
    private String f3606b;

    /* renamed from: c */
    private Map<String, String> f3607c;

    /* renamed from: d */
    private Map<String, String> f3608d;

    /* renamed from: e */
    private final JSONObject f3609e;

    /* renamed from: f */
    private String f3610f;

    /* renamed from: g */
    private final T f3611g;

    /* renamed from: h */
    private final boolean f3612h;

    /* renamed from: i */
    private final int f3613i;

    /* renamed from: j */
    private int f3614j;

    /* renamed from: k */
    private final int f3615k;

    /* renamed from: l */
    private final int f3616l;

    /* renamed from: m */
    private final boolean f3617m;

    /* renamed from: n */
    private final boolean f3618n;

    /* renamed from: com.applovin.impl.sdk.network.b$a */
    public static class C1489a<T> {

        /* renamed from: a */
        String f3619a;

        /* renamed from: b */
        String f3620b;

        /* renamed from: c */
        String f3621c;

        /* renamed from: d */
        Map<String, String> f3622d;

        /* renamed from: e */
        Map<String, String> f3623e;

        /* renamed from: f */
        JSONObject f3624f;

        /* renamed from: g */
        T f3625g;

        /* renamed from: h */
        boolean f3626h = true;

        /* renamed from: i */
        int f3627i = 1;

        /* renamed from: j */
        int f3628j;

        /* renamed from: k */
        int f3629k;

        /* renamed from: l */
        boolean f3630l;

        /* renamed from: m */
        boolean f3631m;

        public C1489a(C1469j jVar) {
            this.f3628j = ((Integer) jVar.mo13088a(C1369c.f3059ds)).intValue();
            this.f3629k = ((Integer) jVar.mo13088a(C1369c.f3058dr)).intValue();
            this.f3630l = ((Boolean) jVar.mo13088a(C1369c.f3081eO)).booleanValue();
            this.f3622d = new HashMap();
        }

        /* renamed from: a */
        public C1489a<T> mo13198a(int i) {
            this.f3627i = i;
            return this;
        }

        /* renamed from: a */
        public C1489a<T> mo13199a(T t) {
            this.f3625g = t;
            return this;
        }

        /* renamed from: a */
        public C1489a<T> mo13200a(String str) {
            this.f3620b = str;
            return this;
        }

        /* renamed from: a */
        public C1489a<T> mo13201a(Map<String, String> map) {
            this.f3622d = map;
            return this;
        }

        /* renamed from: a */
        public C1489a<T> mo13202a(JSONObject jSONObject) {
            this.f3624f = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C1489a<T> mo13203a(boolean z) {
            this.f3630l = z;
            return this;
        }

        /* renamed from: a */
        public C1488b<T> mo13204a() {
            return new C1488b<>(this);
        }

        /* renamed from: b */
        public C1489a<T> mo13205b(int i) {
            this.f3628j = i;
            return this;
        }

        /* renamed from: b */
        public C1489a<T> mo13206b(String str) {
            this.f3619a = str;
            return this;
        }

        /* renamed from: b */
        public C1489a<T> mo13207b(Map<String, String> map) {
            this.f3623e = map;
            return this;
        }

        /* renamed from: b */
        public C1489a<T> mo13208b(boolean z) {
            this.f3631m = z;
            return this;
        }

        /* renamed from: c */
        public C1489a<T> mo13209c(int i) {
            this.f3629k = i;
            return this;
        }

        /* renamed from: c */
        public C1489a<T> mo13210c(String str) {
            this.f3621c = str;
            return this;
        }
    }

    protected C1488b(C1489a<T> aVar) {
        this.f3605a = aVar.f3620b;
        this.f3606b = aVar.f3619a;
        this.f3607c = aVar.f3622d;
        this.f3608d = aVar.f3623e;
        this.f3609e = aVar.f3624f;
        this.f3610f = aVar.f3621c;
        this.f3611g = aVar.f3625g;
        this.f3612h = aVar.f3626h;
        this.f3613i = aVar.f3627i;
        this.f3614j = aVar.f3627i;
        this.f3615k = aVar.f3628j;
        this.f3616l = aVar.f3629k;
        this.f3617m = aVar.f3630l;
        this.f3618n = aVar.f3631m;
    }

    /* renamed from: a */
    public static <T> C1489a<T> m3193a(C1469j jVar) {
        return new C1489a<>(jVar);
    }

    /* renamed from: a */
    public String mo13178a() {
        return this.f3605a;
    }

    /* renamed from: a */
    public void mo13179a(int i) {
        this.f3614j = i;
    }

    /* renamed from: a */
    public void mo13180a(String str) {
        this.f3605a = str;
    }

    /* renamed from: b */
    public String mo13181b() {
        return this.f3606b;
    }

    /* renamed from: b */
    public void mo13182b(String str) {
        this.f3606b = str;
    }

    /* renamed from: c */
    public Map<String, String> mo13183c() {
        return this.f3607c;
    }

    /* renamed from: d */
    public Map<String, String> mo13184d() {
        return this.f3608d;
    }

    /* renamed from: e */
    public JSONObject mo13185e() {
        return this.f3609e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1488b)) {
            return false;
        }
        C1488b bVar = (C1488b) obj;
        String str = this.f3605a;
        if (str == null ? bVar.f3605a != null : !str.equals(bVar.f3605a)) {
            return false;
        }
        Map<String, String> map = this.f3607c;
        if (map == null ? bVar.f3607c != null : !map.equals(bVar.f3607c)) {
            return false;
        }
        Map<String, String> map2 = this.f3608d;
        if (map2 == null ? bVar.f3608d != null : !map2.equals(bVar.f3608d)) {
            return false;
        }
        String str2 = this.f3610f;
        if (str2 == null ? bVar.f3610f != null : !str2.equals(bVar.f3610f)) {
            return false;
        }
        String str3 = this.f3606b;
        if (str3 == null ? bVar.f3606b != null : !str3.equals(bVar.f3606b)) {
            return false;
        }
        JSONObject jSONObject = this.f3609e;
        if (jSONObject == null ? bVar.f3609e != null : !jSONObject.equals(bVar.f3609e)) {
            return false;
        }
        T t = this.f3611g;
        if (t == null ? bVar.f3611g == null : t.equals(bVar.f3611g)) {
            return this.f3612h == bVar.f3612h && this.f3613i == bVar.f3613i && this.f3614j == bVar.f3614j && this.f3615k == bVar.f3615k && this.f3616l == bVar.f3616l && this.f3617m == bVar.f3617m && this.f3618n == bVar.f3618n;
        }
        return false;
    }

    /* renamed from: f */
    public String mo13187f() {
        return this.f3610f;
    }

    /* renamed from: g */
    public T mo13188g() {
        return this.f3611g;
    }

    /* renamed from: h */
    public boolean mo13189h() {
        return this.f3612h;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f3605a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3610f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3606b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t = this.f3611g;
        if (t != null) {
            i = t.hashCode();
        }
        int i2 = ((((((((((((((hashCode4 + i) * 31) + (this.f3612h ? 1 : 0)) * 31) + this.f3613i) * 31) + this.f3614j) * 31) + this.f3615k) * 31) + this.f3616l) * 31) + (this.f3617m ? 1 : 0)) * 31) + (this.f3618n ? 1 : 0);
        Map<String, String> map = this.f3607c;
        if (map != null) {
            i2 = (i2 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f3608d;
        if (map2 != null) {
            i2 = (i2 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f3609e;
        if (jSONObject == null) {
            return i2;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return (i2 * 31) + new String(charArray).hashCode();
    }

    /* renamed from: i */
    public int mo13191i() {
        return this.f3613i - this.f3614j;
    }

    /* renamed from: j */
    public int mo13192j() {
        return this.f3614j;
    }

    /* renamed from: k */
    public int mo13193k() {
        return this.f3615k;
    }

    /* renamed from: l */
    public int mo13194l() {
        return this.f3616l;
    }

    /* renamed from: m */
    public boolean mo13195m() {
        return this.f3617m;
    }

    /* renamed from: n */
    public boolean mo13196n() {
        return this.f3618n;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f3605a + ", backupEndpoint=" + this.f3610f + ", httpMethod=" + this.f3606b + ", httpHeaders=" + this.f3608d + ", body=" + this.f3609e + ", emptyResponse=" + this.f3611g + ", requiresResponse=" + this.f3612h + ", initialRetryAttempts=" + this.f3613i + ", retryAttemptsLeft=" + this.f3614j + ", timeoutMillis=" + this.f3615k + ", retryDelayMillis=" + this.f3616l + ", encodingEnabled=" + this.f3617m + ", trackConnectionSpeed=" + this.f3618n + '}';
    }
}
