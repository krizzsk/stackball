package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

public class lp1 {

    /* renamed from: a */
    private final C15143x3 f36775a = new C15143x3();

    /* renamed from: b */
    private final np1 f36776b = new np1();

    /* renamed from: c */
    private final q41 f36777c;

    /* renamed from: d */
    private final C12732cg f36778d;

    /* renamed from: e */
    private final h30 f36779e;

    public lp1() {
        q41 q41 = new q41();
        this.f36777c = q41;
        this.f36778d = new C12732cg(q41);
        this.f36779e = new h30();
    }

    /* renamed from: a */
    public l41<ep1> mo68499a(Context context, C14645t1 t1Var, jp1 jp1, Object obj, r41<ep1> r41) {
        String a = jp1.mo68076a();
        String c = jp1.mo68078c();
        String b = jp1.mo68077b();
        Map<String, String> a2 = this.f36775a.mo70812a(jp1.mo68079d());
        l30 j = t1Var.mo70104j();
        String h = j.mo68326h();
        String e = j.mo68322e();
        String a3 = j.mo68311a();
        if (TextUtils.isEmpty(a3)) {
            a3 = "https://mobile.yandexadexchange.net";
        }
        Uri.Builder appendQueryParameter = Uri.parse(a3).buildUpon().appendPath(a).appendPath("vmap").appendPath(c).appendQueryParameter("video-category-id", b);
        this.f36777c.mo69487a(appendQueryParameter, "uuid", h);
        this.f36777c.mo69487a(appendQueryParameter, "mauid", e);
        this.f36778d.mo66282a(context, appendQueryParameter);
        if (a2 != null) {
            for (Map.Entry next : a2.entrySet()) {
                appendQueryParameter.appendQueryParameter((String) next.getKey(), (String) next.getValue());
            }
        }
        new m30(context, t1Var).mo68559a(context, appendQueryParameter);
        ip1 ip1 = new ip1(context, this.f36779e.mo67395a(context, appendQueryParameter.build().toString()), new rp1(r41), jp1, this.f36776b);
        ip1.mo68339b(obj);
        return ip1;
    }
}
