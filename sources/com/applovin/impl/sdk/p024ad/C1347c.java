package com.applovin.impl.sdk.p024ad;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1553o;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.c */
public class C1347c {

    /* renamed from: a */
    private final C1469j f2716a;

    /* renamed from: b */
    private final String f2717b;

    /* renamed from: com.applovin.impl.sdk.ad.c$a */
    public enum C1348a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: d */
        private final String f2722d;

        private C1348a(String str) {
            this.f2722d = str;
        }

        public String toString() {
            return this.f2722d;
        }
    }

    public C1347c(String str, C1469j jVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        } else if (jVar != null) {
            this.f2717b = str;
            this.f2716a = jVar;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    private String m2447a(C1369c<String> cVar) {
        for (String next : this.f2716a.mo13114b((C1369c) cVar)) {
            if (this.f2717b.startsWith(next)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo12704a() {
        return this.f2717b;
    }

    /* renamed from: b */
    public C1348a mo12705b() {
        return m2447a(C1369c.f2876aS) != null ? C1348a.REGULAR : m2447a(C1369c.f2877aT) != null ? C1348a.AD_RESPONSE_JSON : C1348a.UNSPECIFIED;
    }

    /* renamed from: c */
    public String mo12706c() {
        String a = m2447a(C1369c.f2876aS);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String a2 = m2447a(C1369c.f2877aT);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return null;
    }

    /* renamed from: d */
    public JSONObject mo12707d() {
        if (mo12705b() != C1348a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f2717b.substring(mo12706c().length()), 0), "UTF-8"));
                C1505q v = this.f2716a.mo13139v();
                v.mo13277b("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e) {
                C1505q v2 = this.f2716a.mo13139v();
                v2.mo13278b("AdToken", "Unable to decode token '" + this.f2717b + "' into JSON", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            C1505q v3 = this.f2716a.mo13139v();
            v3.mo13278b("AdToken", "Unable to process ad response from token '" + this.f2717b + "'", e2);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1347c)) {
            return false;
        }
        String str = this.f2717b;
        String str2 = ((C1347c) obj).f2717b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f2717b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String a = C1553o.m3546a(32, this.f2717b);
        return "AdToken{id=" + a + ", type=" + mo12705b() + '}';
    }
}
