package com.inmobi.media;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fd */
/* compiled from: ConfigNetworkRequest */
public final class C5252fd extends C5299gc {

    /* renamed from: d */
    private static final String f12025d = C5252fd.class.getSimpleName();

    /* renamed from: e */
    private static String f12026e = "https://config.inmobi.com/config-server/v1/config/secure.cfg";

    /* renamed from: f */
    private static Map<String, String> f12027f;

    /* renamed from: a */
    int f12028a;

    /* renamed from: b */
    int f12029b;

    /* renamed from: c */
    Map<String, C5238ex> f12030c;

    C5252fd(Map<String, C5238ex> map, C5361hu huVar, String str, int i, int i2, byte b, String str2) {
        this(map, huVar, str, i, i2, false, b, str2);
    }

    /* renamed from: a */
    public final void mo40207a() {
        super.mo40207a();
        this.f12130i.put("p", m12022i());
        this.f12130i.put("im-accid", this.f12141t);
        Map<String, String> map = f12027f;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (!this.f12128g.containsKey(next.getKey())) {
                    this.f12128g.put(next.getKey(), next.getValue());
                }
            }
        }
    }

    /* renamed from: i */
    private String m12022i() {
        long j;
        new C5243ez();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : this.f12030c.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("n", next.getKey());
                if (((C5238ex) next.getValue()).mo40564g() == null) {
                    j = 0;
                } else {
                    j = C5243ez.m12008c((String) next.getKey(), ((C5238ex) next.getValue()).mo40564g());
                }
                jSONObject.put("t", j);
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public final String mo40575b() {
        return this.f12141t;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C5252fd(java.util.Map<java.lang.String, com.inmobi.media.C5238ex> r2, com.inmobi.media.C5361hu r3, java.lang.String r4, int r5, int r6, boolean r7, byte r8, java.lang.String r9) {
        /*
            r1 = this;
            if (r7 == 0) goto L_0x0005
            java.lang.String r7 = "https://config.inmobi.com/config-server/v1/config/secure.cfg"
            goto L_0x0007
        L_0x0005:
            java.lang.String r7 = f12026e
        L_0x0007:
            java.lang.String r0 = "root"
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0020
            if (r4 == 0) goto L_0x0020
            java.lang.String r0 = r4.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r4 = r7
        L_0x0021:
            java.lang.String r7 = "POST"
            r1.<init>(r7, r4, r3, r8)
            r1.f12030c = r2
            r1.f12028a = r5
            r1.f12029b = r6
            r1.f12141t = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5252fd.<init>(java.util.Map, com.inmobi.media.hu, java.lang.String, int, int, boolean, byte, java.lang.String):void");
    }
}
