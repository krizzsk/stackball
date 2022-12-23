package com.p243my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.q0 */
public final class C7866q0 {

    /* renamed from: a */
    private final JSONObject f20145a;

    /* renamed from: b */
    private final String f20146b;

    /* renamed from: c */
    private final String f20147c;

    /* renamed from: d */
    private final boolean f20148d;

    /* renamed from: e */
    private final long f20149e;

    /* renamed from: f */
    private JSONObject f20150f;

    /* renamed from: g */
    private Long f20151g;

    C7866q0(JSONObject jSONObject, String str, String str2, boolean z, long j) {
        this.f20146b = str;
        this.f20145a = jSONObject;
        this.f20147c = str2;
        this.f20148d = z;
        this.f20149e = j;
    }

    /* renamed from: a */
    public static C7866q0 m21507a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
                return m21508a(jSONObject, str2, j);
            }
            C7877u0.m21547a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th) {
            C7877u0.m21552b("RawPurchase error: creating object failed", th);
            return null;
        }
    }

    /* renamed from: a */
    public static C7866q0 m21508a(JSONObject jSONObject, String str, long j) {
        return new C7866q0(jSONObject, str, jSONObject.optString("productId"), jSONObject.has("autoRenewing"), j);
    }

    /* renamed from: a */
    public C7866q0 mo52489a(long j) {
        this.f20151g = Long.valueOf(j);
        return this;
    }

    /* renamed from: a */
    public C7866q0 mo52490a(JSONObject jSONObject) {
        this.f20150f = jSONObject;
        return this;
    }

    /* renamed from: a */
    public String mo52491a() {
        return this.f20146b;
    }

    /* renamed from: b */
    public Long mo52492b() {
        return this.f20151g;
    }

    /* renamed from: c */
    public String mo52493c() {
        return this.f20147c;
    }

    /* renamed from: d */
    public JSONObject mo52494d() {
        return this.f20145a;
    }

    /* renamed from: e */
    public JSONObject mo52495e() {
        return this.f20150f;
    }

    /* renamed from: f */
    public long mo52496f() {
        return this.f20149e;
    }

    /* renamed from: g */
    public boolean mo52497g() {
        return this.f20148d;
    }
}
