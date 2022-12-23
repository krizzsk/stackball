package com.yandex.metrica;

import android.app.Application;
import android.content.Context;
import android.webkit.WebView;
import com.yandex.metrica.impl.p265ob.C10353I2;
import com.yandex.metrica.impl.p265ob.C10908X2;
import com.yandex.metrica.impl.p265ob.C10941Y;
import com.yandex.metrica.impl.p265ob.C11328i0;
import com.yandex.metrica.impl.p265ob.C11479l3;
import com.yandex.metrica.impl.p265ob.C11791tg;
import com.yandex.metrica.impl.p265ob.C11851vg;
import com.yandex.metrica.impl.p265ob.C11962y;

/* renamed from: com.yandex.metrica.j */
public class C12041j {

    /* renamed from: a */
    private final C11791tg f28937a;

    /* renamed from: b */
    private final C10908X2 f28938b;

    /* renamed from: c */
    private final C11962y f28939c;

    /* renamed from: d */
    private final C10353I2 f28940d;

    /* renamed from: e */
    private final C11328i0 f28941e;

    public C12041j(C11791tg tgVar, C10908X2 x2) {
        this(tgVar, x2, C10941Y.m28234g().mo62498b(), C10941Y.m28234g().mo62506k(), C10941Y.m28234g().mo62501e());
    }

    /* renamed from: a */
    public void mo64232a(Context context, YandexMetricaConfig yandexMetricaConfig) {
        C12043l lVar = (C12043l) yandexMetricaConfig;
        this.f28941e.mo63025a(context);
        Boolean bool = lVar.sessionsAutoTrackingEnabled;
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        if (bool.booleanValue()) {
            this.f28940d.mo61474a(true);
        }
        this.f28937a.getClass();
        C11479l3.m29684a(context).mo63263b(lVar);
    }

    /* renamed from: b */
    public void mo64234b(Context context) {
        this.f28941e.mo63025a(context);
    }

    /* renamed from: c */
    public void mo64235c(Context context) {
        this.f28941e.mo63025a(context);
    }

    public C12041j(C11791tg tgVar, C10908X2 x2, C11962y yVar, C10353I2 i2, C11328i0 i0Var) {
        this.f28937a = tgVar;
        this.f28938b = x2;
        this.f28939c = yVar;
        this.f28940d = i2;
        this.f28941e = i0Var;
    }

    /* renamed from: a */
    public C11962y.C11965c mo64230a(Application application) {
        this.f28939c.mo64105a(application);
        return this.f28940d.mo61474a(false);
    }

    /* renamed from: a */
    public void mo64231a(Context context) {
        this.f28941e.mo63025a(context);
    }

    /* renamed from: a */
    public void mo64233a(WebView webView, C11851vg vgVar) {
        this.f28938b.mo62464a(webView, vgVar);
    }
}
