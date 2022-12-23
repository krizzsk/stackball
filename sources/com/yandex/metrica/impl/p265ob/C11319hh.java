package com.yandex.metrica.impl.p265ob;

import com.appsflyer.ServerParameters;
import com.facebook.appevents.AppEventsConstants;
import com.yandex.metrica.impl.p265ob.C11993ym;

/* renamed from: com.yandex.metrica.impl.ob.hh */
public class C11319hh {

    /* renamed from: a */
    public final String f27059a;

    /* renamed from: b */
    public final String f27060b;
    @Deprecated

    /* renamed from: c */
    public final String f27061c;

    /* renamed from: d */
    public final String f27062d;

    /* renamed from: e */
    public final String f27063e;

    /* renamed from: f */
    public final String f27064f;

    /* renamed from: g */
    public final String f27065g;

    /* renamed from: h */
    public final String f27066h;

    /* renamed from: i */
    public final String f27067i;

    /* renamed from: j */
    public final String f27068j;

    /* renamed from: k */
    public final String f27069k;

    /* renamed from: l */
    public final String f27070l;

    /* renamed from: m */
    public final String f27071m;

    /* renamed from: n */
    public final String f27072n;

    /* renamed from: o */
    public final String f27073o;

    /* renamed from: p */
    public final String f27074p;

    public C11319hh(C11993ym.C11994a aVar) {
        String str;
        this.f27059a = aVar.mo64177c("dId");
        this.f27060b = aVar.mo64177c("uId");
        this.f27061c = aVar.mo64176b("kitVer");
        this.f27062d = aVar.mo64177c("analyticsSdkVersionName");
        this.f27063e = aVar.mo64177c("kitBuildNumber");
        this.f27064f = aVar.mo64177c("kitBuildType");
        this.f27065g = aVar.mo64177c("appVer");
        this.f27066h = aVar.optString("app_debuggable", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f27067i = aVar.mo64177c("appBuild");
        this.f27068j = aVar.mo64177c("osVer");
        this.f27070l = aVar.mo64177c(ServerParameters.LANG);
        this.f27071m = aVar.mo64177c("root");
        this.f27074p = aVar.mo64177c("commit_hash");
        this.f27072n = aVar.optString("app_framework", C10122B2.m26033a());
        int optInt = aVar.optInt("osApiLev", -1);
        String str2 = null;
        if (optInt == -1) {
            str = null;
        } else {
            str = String.valueOf(optInt);
        }
        this.f27069k = str;
        int optInt2 = aVar.optInt("attribution_id", 0);
        this.f27073o = optInt2 > 0 ? String.valueOf(optInt2) : str2;
    }

    public C11319hh() {
        this.f27059a = null;
        this.f27060b = null;
        this.f27061c = null;
        this.f27062d = null;
        this.f27063e = null;
        this.f27064f = null;
        this.f27065g = null;
        this.f27066h = null;
        this.f27067i = null;
        this.f27068j = null;
        this.f27069k = null;
        this.f27070l = null;
        this.f27071m = null;
        this.f27072n = null;
        this.f27073o = null;
        this.f27074p = null;
    }
}
