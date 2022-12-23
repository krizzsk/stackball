package com.ogury.p245ed.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fr */
public final class C8237fr {

    /* renamed from: a */
    private final String f21333a;

    /* renamed from: b */
    private final String f21334b;

    /* renamed from: c */
    private final String f21335c;

    /* renamed from: d */
    private final String f21336d;

    /* renamed from: e */
    private final String f21337e;

    /* renamed from: f */
    private final String f21338f;

    /* renamed from: g */
    private final Boolean f21339g;

    /* renamed from: h */
    private final Boolean f21340h;

    /* renamed from: i */
    private final String f21341i;

    /* renamed from: j */
    private final String f21342j;

    /* renamed from: k */
    private final String f21343k;

    /* renamed from: l */
    private final String f21344l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8237fr)) {
            return false;
        }
        C8237fr frVar = (C8237fr) obj;
        return C8467mq.m23880a((Object) this.f21333a, (Object) frVar.f21333a) && C8467mq.m23880a((Object) this.f21334b, (Object) frVar.f21334b) && C8467mq.m23880a((Object) this.f21335c, (Object) frVar.f21335c) && C8467mq.m23880a((Object) this.f21336d, (Object) frVar.f21336d) && C8467mq.m23880a((Object) this.f21337e, (Object) frVar.f21337e) && C8467mq.m23880a((Object) this.f21338f, (Object) frVar.f21338f) && C8467mq.m23880a((Object) this.f21339g, (Object) frVar.f21339g) && C8467mq.m23880a((Object) this.f21340h, (Object) frVar.f21340h) && C8467mq.m23880a((Object) this.f21341i, (Object) frVar.f21341i) && C8467mq.m23880a((Object) this.f21342j, (Object) frVar.f21342j) && C8467mq.m23880a((Object) this.f21343k, (Object) frVar.f21343k) && C8467mq.m23880a((Object) this.f21344l, (Object) frVar.f21344l);
    }

    public final int hashCode() {
        int hashCode = ((((((this.f21333a.hashCode() * 31) + this.f21334b.hashCode()) * 31) + this.f21335c.hashCode()) * 31) + this.f21336d.hashCode()) * 31;
        String str = this.f21337e;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f21338f.hashCode()) * 31;
        Boolean bool = this.f21339g;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f21340h;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f21341i;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f21342j.hashCode()) * 31;
        String str3 = this.f21343k;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21344l;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "Token(assetKey=" + this.f21333a + ", moduleVersion=" + this.f21334b + ", orientation=" + this.f21335c + ", timeZone=" + this.f21336d + ", deviceId=" + this.f21337e + ", consentToken=" + this.f21338f + ", isChildUnderCoppa=" + this.f21339g + ", isUnderAgeOfGdprConsent=" + this.f21340h + ", adContentThreshold=" + this.f21341i + ", instanceToken=" + this.f21342j + ", campaignId=" + this.f21343k + ", creativeId=" + this.f21344l + ')';
    }

    private C8237fr(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8) {
        C8467mq.m23881b(str, "assetKey");
        C8467mq.m23881b(str2, "moduleVersion");
        C8467mq.m23881b(str3, "orientation");
        C8467mq.m23881b(str4, "timeZone");
        C8467mq.m23881b(str6, "consentToken");
        C8467mq.m23881b(str8, "instanceToken");
        this.f21333a = str;
        this.f21334b = str2;
        this.f21335c = str3;
        this.f21336d = str4;
        this.f21337e = str5;
        this.f21338f = str6;
        this.f21339g = bool;
        this.f21340h = bool2;
        this.f21341i = str7;
        this.f21342j = str8;
        this.f21343k = null;
        this.f21344l = null;
    }

    public /* synthetic */ C8237fr(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, byte b) {
        this(str, str2, str3, str4, str5, str6, bool, bool2, str7, str8);
    }

    /* renamed from: b */
    private String m23127b() {
        return this.f21333a;
    }

    /* renamed from: c */
    private String m23128c() {
        return this.f21334b;
    }

    /* renamed from: d */
    private String m23129d() {
        return this.f21335c;
    }

    /* renamed from: e */
    private String m23130e() {
        return this.f21336d;
    }

    /* renamed from: f */
    private String m23131f() {
        return this.f21337e;
    }

    /* renamed from: g */
    private String m23132g() {
        return this.f21338f;
    }

    /* renamed from: h */
    private Boolean m23133h() {
        return this.f21339g;
    }

    /* renamed from: i */
    private Boolean m23134i() {
        return this.f21340h;
    }

    /* renamed from: j */
    private String m23135j() {
        return this.f21341i;
    }

    /* renamed from: k */
    private String m23136k() {
        return this.f21342j;
    }

    /* renamed from: l */
    private String m23137l() {
        return this.f21343k;
    }

    /* renamed from: m */
    private String m23138m() {
        return this.f21344l;
    }

    /* renamed from: a */
    public final JSONObject mo53561a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject n = m23139n();
        if (!C8254ge.m23188a(n)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, n);
        }
        JSONObject o = m23140o();
        if (!C8254ge.m23188a(o)) {
            jSONObject.put("ad", o);
        }
        JSONObject p = m23141p();
        if (!C8254ge.m23188a(p)) {
            jSONObject.put("sdk", p);
        }
        JSONObject q = m23142q();
        if (!C8254ge.m23188a(q)) {
            jSONObject.put("device", q);
        }
        JSONObject t = m23145t();
        if (!C8254ge.m23188a(t)) {
            jSONObject.put("privacy_compliancy", t);
        }
        JSONObject u = m23146u();
        if (!C8254ge.m23188a(u)) {
            jSONObject.put("targeting", u);
        }
        return jSONObject;
    }

    /* renamed from: n */
    private final JSONObject m23139n() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_key", m23127b());
        jSONObject.put("instance_token", m23136k());
        return jSONObject;
    }

    /* renamed from: o */
    private final JSONObject m23140o() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("campaign_id", m23137l());
        jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, m23138m());
        return jSONObject;
    }

    /* renamed from: p */
    private final JSONObject m23141p() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module_version", m23128c());
        return jSONObject;
    }

    /* renamed from: q */
    private final JSONObject m23142q() {
        JSONObject jSONObject = new JSONObject();
        JSONObject r = m23143r();
        if (!C8254ge.m23188a(r)) {
            jSONObject.put("screen", r);
        }
        JSONObject s = m23144s();
        if (!C8254ge.m23188a(s)) {
            jSONObject.put("settings", s);
        }
        return jSONObject;
    }

    /* renamed from: r */
    private final JSONObject m23143r() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orientation", m23129d());
        return jSONObject;
    }

    /* renamed from: s */
    private final JSONObject m23144s() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time_zone", m23130e());
        jSONObject.put("device_id", m23131f());
        return jSONObject;
    }

    /* renamed from: t */
    private final JSONObject m23145t() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("consent_token", m23132g());
        if (m23133h() != null) {
            jSONObject.put("is_child_under_coppa", m23133h().booleanValue());
        }
        if (m23134i() != null) {
            jSONObject.put("is_under_age_of_gdpr_consent", m23134i().booleanValue());
        }
        return jSONObject;
    }

    /* renamed from: u */
    private final JSONObject m23146u() {
        JSONObject jSONObject = new JSONObject();
        CharSequence j = m23135j();
        if (!(j == null || j.length() == 0)) {
            jSONObject.put("ad_content_threshold", m23135j());
        }
        return jSONObject;
    }
}
