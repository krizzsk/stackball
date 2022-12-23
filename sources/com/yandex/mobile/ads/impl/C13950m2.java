package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.m2 */
public class C13950m2 {

    /* renamed from: a */
    private final C14242p2 f37164a = C14242p2.m40636b();

    /* renamed from: b */
    private final C14051n2 f37165b = new C14051n2();

    /* renamed from: a */
    public String mo68552a(Context context) {
        return m39234a(context, this.f37164a.mo69296a());
    }

    /* renamed from: b */
    public String mo68553b(Context context) {
        return m39234a(context, this.f37164a.mo69299c());
    }

    /* renamed from: a */
    private String m39234a(Context context, List list) {
        this.f37165b.getClass();
        d71 a = l71.m38631c().mo68362a(context);
        return TextUtils.join(",", list.subList(list.size() - Math.min((a == null || a.mo66452b() == 0) ? 5 : a.mo66452b(), list.size()), list.size()));
    }
}
