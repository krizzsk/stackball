package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import java.util.Random;

public class li1 {

    /* renamed from: a */
    private final i21 f36675a = new i21();

    /* renamed from: b */
    private final q41 f36676b;

    /* renamed from: c */
    private final C12732cg f36677c;

    public li1() {
        q41 q41 = new q41();
        this.f36676b = q41;
        this.f36677c = new C12732cg(q41);
    }

    /* renamed from: a */
    public l41<ci1> mo68437a(Context context, C14645t1 t1Var, ki1 ki1, Object obj, r41<ci1> r41) {
        C15028w3 w3Var = new C15028w3(ki1.mo68237a());
        oi1 oi1 = new oi1(w3Var);
        Uri.Builder appendQueryParameter = Uri.parse(w3Var.mo70627a().mo70994a()).buildUpon().appendQueryParameter("charset", "UTF-8");
        this.f36675a.getClass();
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("rnd", Integer.toString(new Random().nextInt(89999999) + 10000000));
        l30 j = t1Var.mo70104j();
        this.f36676b.getClass();
        this.f36676b.mo69487a(appendQueryParameter2, "video-session-id", w3Var.mo70631e());
        this.f36676b.mo69487a(appendQueryParameter2, "uuid", j.mo68326h());
        this.f36676b.mo69487a(appendQueryParameter2, "mauid", j.mo68322e());
        this.f36677c.mo66282a(context, appendQueryParameter2);
        new m30(context, t1Var).mo68559a(context, appendQueryParameter2);
        zh1 zh1 = new zh1(context, appendQueryParameter2.build().toString(), new rp1(r41), ki1, oi1);
        zh1.mo68339b(obj);
        return zh1;
    }
}
