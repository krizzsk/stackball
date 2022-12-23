package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.ug1;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.jb */
public abstract class C13484jb<T> implements w41<C14645t1, AdResponse<T>> {

    /* renamed from: a */
    private final C15232y3 f35209a = new C15232y3();

    /* renamed from: b */
    private final C13170g4 f35210b = new C13170g4();

    /* renamed from: a */
    public h41 mo66663a(Object obj) {
        return new h41(h41.C13276b.REQUEST, mo67959a((C14645t1) obj));
    }

    /* renamed from: a */
    public h41 mo66662a(c51 c51, int i, Object obj) {
        return new h41(h41.C13276b.RESPONSE, mo67960a((C14645t1) obj, c51, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, Object> mo67959a(C14645t1 t1Var) {
        HashMap hashMap = new HashMap();
        AdRequest a = t1Var.mo70080a();
        if (a != null) {
            hashMap.putAll(this.f35209a.mo70991a(a));
        }
        hashMap.put("block_id", t1Var.mo70096c());
        hashMap.put("ad_unit_id", t1Var.mo70096c());
        hashMap.put("ad_type", t1Var.mo70092b().mo64574a());
        hashMap.put("is_passback", Boolean.valueOf(t1Var.mo70110p() == ug1.C14757a.PASSBACK));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.Object> mo67960a(com.yandex.mobile.ads.impl.C14645t1 r5, com.yandex.mobile.ads.impl.c51<com.yandex.mobile.ads.base.AdResponse<T>> r6, int r7) {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.yandex.mobile.ads.impl.g4 r1 = r4.f35210b
            r1.getClass()
            com.yandex.mobile.ads.impl.i41 r1 = new com.yandex.mobile.ads.impl.i41
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.<init>(r2)
            java.lang.String r2 = r5.mo70096c()
            java.lang.String r3 = "block_id"
            r1.mo67733b(r3, r2)
            java.lang.String r2 = r5.mo70096c()
            java.lang.String r3 = "ad_unit_id"
            r1.mo67733b(r3, r2)
            com.yandex.mobile.ads.base.n r2 = r5.mo70092b()
            java.lang.String r2 = r2.mo64574a()
            java.lang.String r3 = "ad_type"
            r1.mo67733b(r3, r2)
            if (r6 == 0) goto L_0x005b
            T r2 = r6.f31810a
            if (r2 == 0) goto L_0x005b
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            com.yandex.mobile.ads.base.model.MediationData r2 = r2.mo64445x()
            if (r2 != 0) goto L_0x005b
            T r2 = r6.f31810a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.lang.String r2 = r2.mo64433m()
            java.lang.String r3 = "ad_type_format"
            r1.mo67733b(r3, r2)
            T r2 = r6.f31810a
            com.yandex.mobile.ads.base.AdResponse r2 = (com.yandex.mobile.ads.base.AdResponse) r2
            java.lang.String r2 = r2.mo64446y()
            java.lang.String r3 = "product_type"
            r1.mo67733b(r3, r2)
        L_0x005b:
            r2 = -1
            if (r7 != r2) goto L_0x0061
            java.lang.String r2 = "error_code"
            goto L_0x0063
        L_0x0061:
            java.lang.String r2 = "code"
        L_0x0063:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r1.mo67733b(r2, r7)
            if (r6 == 0) goto L_0x0088
            T r7 = r6.f31810a
            if (r7 == 0) goto L_0x0088
            com.yandex.mobile.ads.base.AdResponse r7 = (com.yandex.mobile.ads.base.AdResponse) r7
            com.yandex.mobile.ads.base.model.MediationData r7 = r7.mo64445x()
            if (r7 == 0) goto L_0x007b
            java.lang.String r6 = "mediation"
            goto L_0x008a
        L_0x007b:
            T r6 = r6.f31810a
            com.yandex.mobile.ads.base.AdResponse r6 = (com.yandex.mobile.ads.base.AdResponse) r6
            java.lang.Object r6 = r6.mo64447z()
            if (r6 == 0) goto L_0x0088
            java.lang.String r6 = "ad"
            goto L_0x008a
        L_0x0088:
            java.lang.String r6 = "empty"
        L_0x008a:
            java.lang.String r7 = "response_type"
            r1.mo67733b(r7, r6)
            java.util.Map r6 = r1.mo67729a()
            r0.putAll(r6)
            com.yandex.mobile.ads.common.AdRequest r5 = r5.mo70080a()
            if (r5 == 0) goto L_0x00a5
            com.yandex.mobile.ads.impl.y3 r6 = r4.f35209a
            java.util.Map r5 = r6.mo70991a(r5)
            r0.putAll(r5)
        L_0x00a5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13484jb.mo67960a(com.yandex.mobile.ads.impl.t1, com.yandex.mobile.ads.impl.c51, int):java.util.Map");
    }
}
