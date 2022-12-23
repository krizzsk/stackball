package com.ogury.p244cm.internal;

import android.content.Context;

/* renamed from: com.ogury.cm.internal.abcba */
public final class abcba {

    /* renamed from: a */
    private final abccb f20455a = new abccb();

    /* renamed from: a */
    private static acaba m21903a(acabc acabc, acabb acabb) {
        acaba a = new acaba().mo52735a("POST");
        acaca acaca = acaca.f20536a;
        return a.mo52740c(acaca.m21936a(acabc)).mo52734a(acabb);
    }

    /* renamed from: a */
    public static void m21904a(Context context, String str, acabc acabc, acabb acabb) {
        bbabc.m22051b(context, "context");
        bbabc.m22051b(str, "assetKey");
        bbabc.m22051b(acabc, "requestType");
        bbabc.m22051b(acabb, "requestCallback");
        acaba a = m21903a(acabc, acabb);
        new acaac();
        abccb.m21912a(a.mo52738b(acaac.m21921a(context, str)).mo52744f());
    }

    /* renamed from: a */
    public static void m21905a(String str, acabb acabb) {
        bbabc.m22051b(str, "errorMessage");
        bbabc.m22051b(acabb, "requestCallback");
        acaba a = m21903a(acabc.EVENT, acabb);
        new acaac();
        acaba b = a.mo52738b(acaac.m21922a(str));
        abbba abbba = abbba.f20411a;
        abccb.m21912a(b.mo52736a("X-CM-SECURE-TOKEN", abbba.m21842k()).mo52744f());
    }
}
