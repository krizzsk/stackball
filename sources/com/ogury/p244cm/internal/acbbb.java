package com.ogury.p244cm.internal;

import com.ogury.p244cm.internal.aacaa;
import com.ogury.p244cm.internal.accab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acbbb */
public final class acbbb {

    /* renamed from: a */
    public static final aaaaa f20544a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private acbbc[] f20545b;

    /* renamed from: com.ogury.cm.internal.acbbb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public acbbb() {
        this((accab) null, (accaa) null, 3, (bbabb) null);
    }

    private acbbb(accab accab, accaa accaa) {
        bbabc.m22051b(accab, "parserTcf");
        bbabc.m22051b(accaa, "parserCcpaf");
        this.f20545b = new acbbc[]{accab, accaa};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ acbbb(accab accab, accaa accaa, int i, bbabb bbabb) {
        this(abbba.m21818a() != 2 ? new accac() : new accac(), new accaa());
        accab.aaaaa aaaaa2 = accab.f20555a;
        abbba abbba = abbba.f20411a;
    }

    /* renamed from: a */
    public static void m21948a(JSONObject jSONObject) {
        bbabc.m22051b(jSONObject, "sdkJson");
        if (jSONObject.has("cacheFor")) {
            abbba abbba = abbba.f20411a;
            abbba.m21820a(new Date().getTime() + (jSONObject.optLong("cacheFor") * 1000));
        }
    }

    /* renamed from: b */
    public static void m21949b(JSONObject jSONObject) {
        bbabc.m22051b(jSONObject, "sdkJson");
        if (jSONObject.has("crashReportUrl")) {
            abbba abbba = abbba.f20411a;
            abbcc g = abbba.m21838g();
            String optString = jSONObject.optString("crashReportUrl");
            bbabc.m22048a((Object) optString, "sdkJson.optString(CRASH_REPORT_URL)");
            g.mo52683a(optString);
        }
    }

    /* renamed from: c */
    private static void m21950c(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("frameworks");
            bbabc.m22048a((Object) optString, "sdkJson.optString(FRAMEWORKS)");
            Object[] array = aacaa.aaaaa.m21769a(aacaa.aaaaa.m21772b(optString)).toArray(new String[0]);
            if (array != null) {
                abbba abbba = abbba.f20411a;
                Collection arrayList = new ArrayList();
                for (String str : (String[]) array) {
                    if (!bbcbc.m22087a(str)) {
                        arrayList.add(str);
                    }
                }
                Object[] array2 = ((List) arrayList).toArray(new String[0]);
                if (array2 != null) {
                    abbba.m21826a((String[]) array2);
                    return;
                }
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc A[Catch:{ OguryError -> 0x01e3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52747a(java.lang.String r17, boolean r18) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "showFormat"
            java.lang.String r2 = "fairChoice"
            java.lang.String r3 = "editAvailable"
            java.lang.String r4 = "consent="
            java.lang.String r5 = "error"
            java.lang.String r6 = "response"
            com.ogury.p244cm.internal.bbabc.m22051b(r0, r6)
            r6 = 0
            com.ogury.cm.internal.abbba r7 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.p244cm.internal.abbba.m21847p()     // Catch:{ OguryError -> 0x01e3 }
            org.json.JSONObject r7 = com.ogury.p244cm.internal.aacaa.aaaaa.m21770a((java.lang.String) r17)     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r8 = "sdk"
            r9 = 1
            r10 = 1004(0x3ec, float:1.407E-42)
            if (r7 == 0) goto L_0x0142
            boolean r11 = r7.has(r5)     // Catch:{ OguryError -> 0x01e3 }
            if (r11 == 0) goto L_0x0046
            com.ogury.cm.internal.abbba r11 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.acbcc r11 = new com.ogury.cm.internal.acbcc     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.core.OguryError r12 = new com.ogury.core.OguryError     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r5 = r7.getString(r5)     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r13 = "jsonObject.getString(ERROR)"
            com.ogury.p244cm.internal.bbabc.m22048a((java.lang.Object) r5, (java.lang.String) r13)     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r5 = com.ogury.p244cm.internal.aacaa.aaaaa.m21775e(r5)     // Catch:{ OguryError -> 0x01e3 }
            r12.<init>(r10, r5)     // Catch:{ OguryError -> 0x01e3 }
            r11.<init>(r6, r12)     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.p244cm.internal.abbba.m21823a((com.ogury.p244cm.internal.acbcc) r11)     // Catch:{ OguryError -> 0x01e3 }
            r5 = 1
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            if (r5 != 0) goto L_0x0156
            java.lang.String r5 = "secureToken"
            java.lang.String r11 = "config"
            java.lang.String r12 = "form"
            if (r18 == 0) goto L_0x00b9
            boolean r13 = r7.has(r11)     // Catch:{ OguryError -> 0x01e3 }
            if (r13 != 0) goto L_0x006a
            com.ogury.cm.internal.abbba r13 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.acbcc r13 = new com.ogury.cm.internal.acbcc     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.core.OguryError r14 = new com.ogury.core.OguryError     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r15 = "No config field"
            r14.<init>(r10, r15)     // Catch:{ OguryError -> 0x01e3 }
            r13.<init>(r6, r14)     // Catch:{ OguryError -> 0x01e3 }
        L_0x0065:
            com.ogury.p244cm.internal.abbba.m21823a((com.ogury.p244cm.internal.acbcc) r13)     // Catch:{ OguryError -> 0x01e3 }
            r13 = 0
            goto L_0x00ba
        L_0x006a:
            boolean r13 = r7.has(r12)     // Catch:{ OguryError -> 0x01e3 }
            if (r13 != 0) goto L_0x007f
            com.ogury.cm.internal.abbba r13 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.acbcc r13 = new com.ogury.cm.internal.acbcc     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.core.OguryError r14 = new com.ogury.core.OguryError     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r15 = "No form filed"
            r14.<init>(r10, r15)     // Catch:{ OguryError -> 0x01e3 }
            r13.<init>(r6, r14)     // Catch:{ OguryError -> 0x01e3 }
            goto L_0x0065
        L_0x007f:
            org.json.JSONObject r13 = r7.optJSONObject(r12)     // Catch:{ OguryError -> 0x01e3 }
            boolean r13 = r13.has(r5)     // Catch:{ OguryError -> 0x01e3 }
            if (r13 != 0) goto L_0x0098
            com.ogury.cm.internal.abbba r13 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.acbcc r13 = new com.ogury.cm.internal.acbcc     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.core.OguryError r14 = new com.ogury.core.OguryError     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r15 = "No secureToken filed"
            r14.<init>(r10, r15)     // Catch:{ OguryError -> 0x01e3 }
            r13.<init>(r6, r14)     // Catch:{ OguryError -> 0x01e3 }
            goto L_0x0065
        L_0x0098:
            boolean r13 = r7.has(r8)     // Catch:{ OguryError -> 0x01e3 }
            if (r13 == 0) goto L_0x00aa
            org.json.JSONObject r13 = r7.optJSONObject(r8)     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r14 = "frameworks"
            boolean r13 = r13.has(r14)     // Catch:{ OguryError -> 0x01e3 }
            if (r13 != 0) goto L_0x00b9
        L_0x00aa:
            com.ogury.cm.internal.abbba r13 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.acbcc r13 = new com.ogury.cm.internal.acbcc     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.core.OguryError r14 = new com.ogury.core.OguryError     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r15 = "No sdk part of Json or field frameworks inside sdk"
            r14.<init>(r10, r15)     // Catch:{ OguryError -> 0x01e3 }
            r13.<init>(r6, r14)     // Catch:{ OguryError -> 0x01e3 }
            goto L_0x0065
        L_0x00b9:
            r13 = 1
        L_0x00ba:
            if (r13 == 0) goto L_0x0156
            org.json.JSONObject r12 = r7.optJSONObject(r12)     // Catch:{ OguryError -> 0x01e3 }
            org.json.JSONObject r11 = r7.optJSONObject(r11)     // Catch:{ OguryError -> 0x01e3 }
            org.json.JSONObject r13 = r7.optJSONObject(r8)     // Catch:{ OguryError -> 0x01e3 }
            m21950c(r13)     // Catch:{ OguryError -> 0x01e3 }
            if (r11 == 0) goto L_0x0101
            boolean r13 = r11.has(r2)     // Catch:{ OguryError -> 0x01e3 }
            if (r13 == 0) goto L_0x0101
            org.json.JSONObject r2 = r11.optJSONObject(r2)     // Catch:{ OguryError -> 0x01e3 }
            if (r2 == 0) goto L_0x0101
            java.lang.String r11 = "activated"
            boolean r11 = r2.optBoolean(r11)     // Catch:{ OguryError -> 0x01e3 }
            if (r11 == 0) goto L_0x0101
            java.lang.String r11 = "productId"
            java.lang.String r11 = r2.optString(r11)     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r13 = "productType"
            java.lang.String r2 = r2.optString(r13)     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.baaba r13 = com.ogury.p244cm.internal.baaba.f20569a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.baacb r14 = new com.ogury.cm.internal.baacb     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r15 = "productID"
            com.ogury.p244cm.internal.bbabc.m22048a((java.lang.Object) r11, (java.lang.String) r15)     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r15 = "skuType"
            com.ogury.p244cm.internal.bbabc.m22048a((java.lang.Object) r2, (java.lang.String) r15)     // Catch:{ OguryError -> 0x01e3 }
            r14.<init>(r11, r2)     // Catch:{ OguryError -> 0x01e3 }
            r13.activateProduct(r14)     // Catch:{ OguryError -> 0x01e3 }
        L_0x0101:
            if (r12 == 0) goto L_0x0123
            boolean r2 = r12.has(r1)     // Catch:{ OguryError -> 0x01e3 }
            if (r2 == 0) goto L_0x0123
            java.lang.String r1 = r12.optString(r1)     // Catch:{ OguryError -> 0x01e3 }
            if (r1 == 0) goto L_0x011e
            java.lang.String r2 = "null"
            boolean r2 = com.ogury.p244cm.internal.bbabc.m22050a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ OguryError -> 0x01e3 }
            if (r2 == 0) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            com.ogury.cm.internal.abbba r2 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
        L_0x011a:
            com.ogury.p244cm.internal.abbba.m21831c(r1)     // Catch:{ OguryError -> 0x01e3 }
            goto L_0x0123
        L_0x011e:
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r1 = ""
            goto L_0x011a
        L_0x0123:
            if (r12 == 0) goto L_0x0133
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r1 = r12.optString(r5)     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r2 = "formJson.optString(SECURE_TOKEN)"
            com.ogury.p244cm.internal.bbabc.m22048a((java.lang.Object) r1, (java.lang.String) r2)     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.p244cm.internal.abbba.m21829b((java.lang.String) r1)     // Catch:{ OguryError -> 0x01e3 }
        L_0x0133:
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r1 = r7.toString()     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r2 = "jsonResponse.toString()"
            com.ogury.p244cm.internal.bbabc.m22048a((java.lang.Object) r1, (java.lang.String) r2)     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.p244cm.internal.abbba.m21824a((java.lang.String) r1)     // Catch:{ OguryError -> 0x01e3 }
            goto L_0x0156
        L_0x0142:
            if (r18 == 0) goto L_0x0156
            com.ogury.cm.internal.abbba r0 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.acbcc r0 = new com.ogury.cm.internal.acbcc     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.core.OguryError r1 = new com.ogury.core.OguryError     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r2 = "Json response is null"
            r1.<init>(r10, r2)     // Catch:{ OguryError -> 0x01e3 }
            r0.<init>(r6, r1)     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.p244cm.internal.abbba.m21823a((com.ogury.p244cm.internal.acbcc) r0)     // Catch:{ OguryError -> 0x01e3 }
            return
        L_0x0156:
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            boolean r1 = com.ogury.p244cm.internal.abbba.m21848q()     // Catch:{ OguryError -> 0x01e3 }
            if (r1 == 0) goto L_0x01e0
            r1 = 2
            r2 = 0
            boolean r5 = com.ogury.p244cm.internal.bbcbc.m22089a(r0, r4, r6, r1, r2)     // Catch:{ OguryError -> 0x01e3 }
            if (r5 == 0) goto L_0x0189
            java.lang.String r5 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r5)     // Catch:{ OguryError -> 0x01e3 }
            if (r0 != 0) goto L_0x0180
            com.ogury.cm.internal.abbba r0 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.acbcc r0 = new com.ogury.cm.internal.acbcc     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.core.OguryError r1 = new com.ogury.core.OguryError     // Catch:{ OguryError -> 0x01e3 }
            java.lang.String r4 = "Decoded Json is null"
            r1.<init>(r10, r4)     // Catch:{ OguryError -> 0x01e3 }
            r0.<init>(r6, r1)     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.p244cm.internal.abbba.m21823a((com.ogury.p244cm.internal.acbcc) r0)     // Catch:{ OguryError -> 0x01e3 }
            goto L_0x018d
        L_0x0180:
            java.lang.String r0 = com.ogury.p244cm.internal.bbcbc.m22095a((java.lang.String) r0, (java.lang.String) r4, (java.lang.String) r2, (int) r1, (java.lang.Object) r2)     // Catch:{ OguryError -> 0x01e3 }
            org.json.JSONObject r2 = com.ogury.p244cm.internal.aacaa.aaaaa.m21770a((java.lang.String) r0)     // Catch:{ OguryError -> 0x01e3 }
            goto L_0x018d
        L_0x0189:
            org.json.JSONObject r2 = com.ogury.p244cm.internal.aacaa.aaaaa.m21770a((java.lang.String) r17)     // Catch:{ OguryError -> 0x01e3 }
        L_0x018d:
            if (r2 == 0) goto L_0x01e0
            if (r2 == 0) goto L_0x01ce
            org.json.JSONObject r0 = r2.optJSONObject(r8)     // Catch:{ OguryError -> 0x01e3 }
            if (r0 == 0) goto L_0x01ce
            m21948a(r0)     // Catch:{ OguryError -> 0x01e3 }
            m21949b(r0)     // Catch:{ OguryError -> 0x01e3 }
            boolean r1 = r0.has(r3)     // Catch:{ OguryError -> 0x01e3 }
            if (r1 == 0) goto L_0x01b0
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.abbcc r1 = com.ogury.p244cm.internal.abbba.m21838g()     // Catch:{ OguryError -> 0x01e3 }
            boolean r3 = r0.optBoolean(r3)     // Catch:{ OguryError -> 0x01e3 }
            r1.mo52684a((boolean) r3)     // Catch:{ OguryError -> 0x01e3 }
        L_0x01b0:
            java.lang.String r1 = "formPath"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ OguryError -> 0x01e3 }
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ OguryError -> 0x01e3 }
            if (r1 == 0) goto L_0x01c3
            int r1 = r1.length()     // Catch:{ OguryError -> 0x01e3 }
            if (r1 != 0) goto L_0x01c2
            goto L_0x01c3
        L_0x01c2:
            r9 = 0
        L_0x01c3:
            if (r9 != 0) goto L_0x01ce
            com.ogury.cm.internal.abbba r1 = com.ogury.p244cm.internal.abbba.f20411a     // Catch:{ OguryError -> 0x01e3 }
            com.ogury.cm.internal.abbcc r1 = com.ogury.p244cm.internal.abbba.m21838g()     // Catch:{ OguryError -> 0x01e3 }
            r1.mo52685b(r0)     // Catch:{ OguryError -> 0x01e3 }
        L_0x01ce:
            r1 = r16
            com.ogury.cm.internal.acbbc[] r0 = r1.f20545b     // Catch:{ OguryError -> 0x01de }
            int r3 = r0.length     // Catch:{ OguryError -> 0x01de }
            r4 = 0
        L_0x01d4:
            if (r4 >= r3) goto L_0x01f9
            r5 = r0[r4]     // Catch:{ OguryError -> 0x01de }
            r5.mo52748a(r2)     // Catch:{ OguryError -> 0x01de }
            int r4 = r4 + 1
            goto L_0x01d4
        L_0x01de:
            r0 = move-exception
            goto L_0x01e6
        L_0x01e0:
            r1 = r16
            goto L_0x01f9
        L_0x01e3:
            r0 = move-exception
            r1 = r16
        L_0x01e6:
            com.ogury.cm.internal.abbba r2 = com.ogury.p244cm.internal.abbba.f20411a
            com.ogury.cm.internal.acbcc r2 = new com.ogury.cm.internal.acbcc
            r2.<init>(r6, r0)
            com.ogury.p244cm.internal.abbba.m21823a((com.ogury.p244cm.internal.acbcc) r2)
            com.ogury.cm.internal.abbbc r2 = com.ogury.p244cm.internal.abbbc.f20427a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r2 = "Error while parsing json config: "
            com.ogury.p244cm.internal.abbbc.m21854a(r2, r0)
        L_0x01f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p244cm.internal.acbbb.mo52747a(java.lang.String, boolean):void");
    }
}
