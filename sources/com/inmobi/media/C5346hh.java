package com.inmobi.media;

import com.inmobi.media.C5239ey;
import com.inmobi.sdk.InMobiSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.hh */
/* compiled from: GDPRInfo */
public final class C5346hh {

    /* renamed from: a */
    private static final String f12243a = C5346hh.class.getSimpleName();

    /* renamed from: b */
    private static JSONObject f12244b;

    /* renamed from: c */
    private static JSONObject f12245c;

    /* renamed from: d */
    private static C5261fk f12246d;

    private C5346hh() {
    }

    /* renamed from: a */
    public static void m12342a() {
        f12246d = (C5261fk) C5238ex.m11980a("root", C5314go.m12211f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m12344b() {
        /*
            android.content.Context r0 = com.inmobi.media.C5314go.m12203c()
            if (r0 == 0) goto L_0x005e
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getPackageName()
            r2.append(r3)
            java.lang.String r3 = "_preferences"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            r2 = 0
            java.lang.String r3 = "IABTCF_TCString"
            java.lang.String r3 = r0.getString(r3, r2)     // Catch:{ Exception -> 0x004d }
            java.lang.String r4 = "IABTCF_gdprApplies"
            r5 = -1
            int r4 = r0.getInt(r4, r5)     // Catch:{ Exception -> 0x004a }
            if (r4 == r5) goto L_0x003a
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ Exception -> 0x004a }
            goto L_0x003b
        L_0x003a:
            r4 = r2
        L_0x003b:
            if (r3 != 0) goto L_0x004f
            java.lang.String r5 = "IABConsent_ConsentString"
            java.lang.String r3 = r0.getString(r5, r2)     // Catch:{ Exception -> 0x004b }
            java.lang.String r5 = "IABConsent_SubjectToGDPR"
            java.lang.String r4 = r0.getString(r5, r2)     // Catch:{ Exception -> 0x004b }
            goto L_0x004f
        L_0x004a:
            r4 = r2
        L_0x004b:
            r2 = r3
            goto L_0x004e
        L_0x004d:
            r4 = r2
        L_0x004e:
            r3 = r2
        L_0x004f:
            if (r3 == 0) goto L_0x005e
            java.lang.String r0 = "gdpr_consent"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x005e }
            if (r4 == 0) goto L_0x005d
            java.lang.String r0 = "gdpr"
            r1.put(r0, r4)     // Catch:{ JSONException -> 0x005e }
        L_0x005d:
            return r1
        L_0x005e:
            org.json.JSONObject r0 = f12244b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5346hh.m12344b():org.json.JSONObject");
    }

    /* renamed from: c */
    public static JSONObject m12346c() {
        return f12244b;
    }

    /* renamed from: a */
    public static void m12343a(JSONObject jSONObject) {
        f12244b = jSONObject;
    }

    /* renamed from: d */
    public static byte m12347d() {
        JSONObject b = m12344b();
        if (b == null) {
            return -1;
        }
        if (b.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            return 1;
        }
        if (!b.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
            return -1;
        }
        try {
            if (b.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
                return 1;
            }
            return 0;
        } catch (JSONException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static void m12345b(JSONObject jSONObject) {
        f12245c = jSONObject;
    }

    /* renamed from: e */
    public static JSONObject m12348e() {
        return f12245c;
    }

    /* renamed from: f */
    public static byte m12349f() {
        return m12341a(false);
    }

    /* renamed from: g */
    public static void m12350g() {
        f12246d = (C5261fk) C5239ey.m11987a("root", C5314go.m12211f(), (C5239ey.C5242c) null);
    }

    /* renamed from: a */
    public static byte m12341a(boolean z) {
        if (f12246d == null) {
            m12350g();
        }
        return (m12347d() == 1 || f12246d.mo40586j() == 1 || z) ? (byte) 1 : 0;
    }

    /* renamed from: h */
    public static boolean m12351h() {
        return m12349f() != 0;
    }
}
