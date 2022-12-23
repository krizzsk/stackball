package com.yandex.mobile.ads.impl;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

public class em0 implements C14570s9<dm0> {

    /* renamed from: a */
    private final zl0 f33007a = new zl0();

    /* renamed from: b */
    private final km1 f33008b;

    /* renamed from: c */
    private final dd0 f33009c = new dd0(new vg1());

    /* renamed from: d */
    private final nd0 f33010d = new nd0();

    public em0(Context context) {
        this.f33008b = new km1(context);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo66845a(org.json.JSONObject r7) throws org.json.JSONException, com.yandex.mobile.ads.impl.xr0 {
        /*
            r6 = this;
            java.lang.String r0 = "value"
            boolean r1 = r7.has(r0)
            r2 = 1
            if (r1 == 0) goto L_0x0011
            boolean r1 = r7.isNull(r0)
            if (r1 != 0) goto L_0x0011
            r1 = 1
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            java.lang.String r3 = "Native Ad json has not required attributes"
            if (r1 == 0) goto L_0x0073
            org.json.JSONObject r7 = r7.getJSONObject(r0)
            com.yandex.mobile.ads.impl.zl0 r0 = r6.f33007a
            java.lang.String r1 = "media"
            java.lang.Object r0 = r6.m35688a(r7, r1, r0)
            com.yandex.mobile.ads.impl.fl0 r0 = (com.yandex.mobile.ads.impl.fl0) r0
            java.lang.String r1 = "images"
            org.json.JSONArray r1 = r7.optJSONArray(r1)
            if (r1 == 0) goto L_0x0033
            com.yandex.mobile.ads.impl.nd0 r4 = r6.f33010d
            java.util.List r1 = r4.mo69024a(r1)
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            com.yandex.mobile.ads.impl.dd0 r4 = r6.f33009c
            java.lang.String r5 = "image"
            java.lang.Object r4 = r6.m35688a(r7, r5, r4)
            com.yandex.mobile.ads.impl.hd0 r4 = (com.yandex.mobile.ads.impl.hd0) r4
            if (r1 == 0) goto L_0x0046
            boolean r5 = r1.isEmpty()
            if (r5 != r2) goto L_0x0050
        L_0x0046:
            if (r4 == 0) goto L_0x0050
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r4)
        L_0x0050:
            com.yandex.mobile.ads.impl.km1 r2 = r6.f33008b
            java.lang.String r4 = "video"
            java.lang.Object r7 = r6.m35688a(r7, r4, r2)
            com.yandex.mobile.ads.impl.kj1 r7 = (com.yandex.mobile.ads.impl.kj1) r7
            if (r0 != 0) goto L_0x006d
            if (r1 == 0) goto L_0x0064
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x006d
        L_0x0064:
            if (r7 == 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            com.yandex.mobile.ads.impl.xr0 r7 = new com.yandex.mobile.ads.impl.xr0
            r7.<init>(r3)
            throw r7
        L_0x006d:
            com.yandex.mobile.ads.impl.dm0 r2 = new com.yandex.mobile.ads.impl.dm0
            r2.<init>(r0, r7, r1)
            return r2
        L_0x0073:
            com.yandex.mobile.ads.impl.xr0 r7 = new com.yandex.mobile.ads.impl.xr0
            r7.<init>(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.em0.mo66845a(org.json.JSONObject):java.lang.Object");
    }

    /* renamed from: a */
    private <T> T m35688a(JSONObject jSONObject, String str, C12714ca<T> caVar) throws JSONException, xr0 {
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            return caVar.mo65715a(jSONObject.getJSONObject(str));
        }
        return null;
    }
}
