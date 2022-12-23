package com.ogury.p245ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;
import p269io.presage.interstitial.p270ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.gv */
public final class C8273gv {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final InterstitialActivity f21382a;

    /* renamed from: b */
    private final Intent f21383b;

    /* renamed from: c */
    private final C8185eb f21384c;

    /* renamed from: d */
    private final List<C8185eb> f21385d;

    /* renamed from: e */
    private final C8272gu f21386e;

    /* renamed from: f */
    private final C8046aw f21387f;

    /* renamed from: g */
    private C8248g f21388g;

    /* renamed from: h */
    private C8020aj f21389h;

    private C8273gv(InterstitialActivity interstitialActivity, Intent intent, C8185eb ebVar, List<C8185eb> list, C8272gu guVar, C8046aw awVar) {
        C8467mq.m23881b(interstitialActivity, "activity");
        C8467mq.m23881b(intent, SDKConstants.PARAM_INTENT);
        C8467mq.m23881b(ebVar, "ad");
        C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
        C8467mq.m23881b(guVar, "adControllerFactory");
        C8467mq.m23881b(awVar, "expandCacheStore");
        this.f21382a = interstitialActivity;
        this.f21383b = intent;
        this.f21384c = ebVar;
        this.f21385d = list;
        this.f21386e = guVar;
        this.f21387f = awVar;
        int intExtra = intent.getIntExtra("mode", 0);
        if (intExtra == 0) {
            m23234c();
        } else if (intExtra == 1) {
            m23235d();
        } else {
            throw new IllegalStateException(C8467mq.m23873a("Wrong mode ", (Object) Integer.valueOf(intExtra)));
        }
        m23236e();
        m23237f();
    }

    public /* synthetic */ C8273gv(InterstitialActivity interstitialActivity, Intent intent, C8185eb ebVar, List list) {
        this(interstitialActivity, intent, ebVar, list, C8272gu.f21381a, C8046aw.f20912a);
    }

    /* renamed from: a */
    public final C8248g mo53626a() {
        C8248g gVar = this.f21388g;
        if (gVar != null) {
            return gVar;
        }
        C8467mq.m23879a("adLayout");
        return null;
    }

    /* renamed from: b */
    public final C8020aj mo53627b() {
        C8020aj ajVar = this.f21389h;
        if (ajVar != null) {
            return ajVar;
        }
        C8467mq.m23879a("adController");
        return null;
    }

    /* renamed from: c */
    private final void m23234c() {
        Context applicationContext = this.f21382a.getApplicationContext();
        C8467mq.m23878a((Object) applicationContext, "activity.applicationContext");
        C8248g gVar = new C8248g(applicationContext);
        this.f21388g = gVar;
        InterstitialActivity interstitialActivity = this.f21382a;
        C8020aj ajVar = null;
        if (gVar == null) {
            C8467mq.m23879a("adLayout");
            gVar = null;
        }
        C8020aj a = C8272gu.m23232a(interstitialActivity, gVar, new C8038ao(this.f21384c.mo53380w(), InterstitialActivity.f44191a));
        this.f21389h = a;
        if (a == null) {
            C8467mq.m23879a("adController");
            a = null;
        }
        a.mo53140a((C8044au) new C8277gx());
        boolean a2 = this.f21384c.mo53363l().mo53434a();
        String a3 = this.f21384c.mo53365m().mo53408a();
        C8020aj ajVar2 = this.f21389h;
        if (ajVar2 == null) {
            C8467mq.m23879a("adController");
            ajVar2 = null;
        }
        Application application = this.f21382a.getApplication();
        C8467mq.m23878a((Object) application, "activity.application");
        ajVar2.mo53139a((C8036am) new C8041ar(new C8018ai(application), this.f21382a, new C8037an(), a2, a3));
        C8020aj ajVar3 = this.f21389h;
        if (ajVar3 == null) {
            C8467mq.m23879a("adController");
        } else {
            ajVar = ajVar3;
        }
        ajVar.mo53141a(this.f21384c, this.f21385d);
    }

    /* renamed from: d */
    private final void m23235d() {
        C8018ai aiVar;
        C8045av a = C8046aw.m22408a(this.f21383b.getStringExtra("expand_cache_item_id"));
        if (a != null) {
            this.f21388g = a.mo53200c();
            this.f21389h = a.mo53201d();
            C8248g gVar = null;
            if (C8196el.m22923a(this.f21384c)) {
                Application application = this.f21382a.getApplication();
                C8467mq.m23878a((Object) application, "activity.application");
                aiVar = new C8018ai(application);
            } else {
                aiVar = null;
            }
            if (a.mo53198a().mo53407e()) {
                C8020aj ajVar = this.f21389h;
                if (ajVar == null) {
                    C8467mq.m23879a("adController");
                    ajVar = null;
                }
                FrameLayout b = a.mo53199b();
                Activity activity = this.f21382a;
                C8020aj ajVar2 = this.f21389h;
                if (ajVar2 == null) {
                    C8467mq.m23879a("adController");
                    ajVar2 = null;
                }
                ajVar.mo53139a((C8036am) new C8040aq(b, activity, ajVar2.mo53145b()));
            } else {
                C8020aj ajVar3 = this.f21389h;
                if (ajVar3 == null) {
                    C8467mq.m23879a("adController");
                    ajVar3 = null;
                }
                Activity activity2 = this.f21382a;
                C8020aj ajVar4 = this.f21389h;
                if (ajVar4 == null) {
                    C8467mq.m23879a("adController");
                    ajVar4 = null;
                }
                ajVar3.mo53139a((C8036am) new C8041ar(aiVar, activity2, ajVar4.mo53145b(), this.f21384c.mo53363l().mo53434a(), this.f21384c.mo53365m().mo53408a()));
            }
            C8248g gVar2 = this.f21388g;
            if (gVar2 == null) {
                C8467mq.m23879a("adLayout");
            } else {
                gVar = gVar2;
            }
            gVar.mo53575d();
            return;
        }
        throw new IllegalStateException("Cache Item not found");
    }

    /* renamed from: com.ogury.ed.internal.gv$b */
    public static final class C8275b implements C8036am {

        /* renamed from: a */
        final /* synthetic */ C8273gv f21392a;

        C8275b(C8273gv gvVar) {
            this.f21392a = gvVar;
        }

        /* renamed from: a */
        public final void mo53117a(C8248g gVar, C8020aj ajVar) {
            C8467mq.m23881b(gVar, "adLayout");
            C8467mq.m23881b(ajVar, "adController");
            this.f21392a.f21382a.mo72052a(ajVar.mo53153f());
        }
    }

    /* renamed from: e */
    private final void m23236e() {
        C8020aj ajVar = this.f21389h;
        if (ajVar == null) {
            C8467mq.m23879a("adController");
            ajVar = null;
        }
        ajVar.mo53148c((C8036am) new C8275b(this));
    }

    /* renamed from: f */
    private final void m23237f() {
        C8036am amVar;
        C8020aj ajVar = null;
        if (!C8196el.m22923a(this.f21384c)) {
            C8020aj ajVar2 = this.f21389h;
            if (ajVar2 == null) {
                C8467mq.m23879a("adController");
                ajVar2 = null;
            }
            amVar = ajVar2.mo53145b();
        } else {
            amVar = null;
        }
        C8020aj ajVar3 = this.f21389h;
        if (ajVar3 == null) {
            C8467mq.m23879a("adController");
        } else {
            ajVar = ajVar3;
        }
        ajVar.mo53146b((C8036am) new C8274a(amVar, this));
    }

    /* renamed from: com.ogury.ed.internal.gv$a */
    public static final class C8274a implements C8036am {

        /* renamed from: a */
        final /* synthetic */ C8036am f21390a;

        /* renamed from: b */
        final /* synthetic */ C8273gv f21391b;

        C8274a(C8036am amVar, C8273gv gvVar) {
            this.f21390a = amVar;
            this.f21391b = gvVar;
        }

        /* renamed from: a */
        public final void mo53117a(C8248g gVar, C8020aj ajVar) {
            C8467mq.m23881b(gVar, "adLayout");
            C8467mq.m23881b(ajVar, "adController");
            C8036am amVar = this.f21390a;
            if (amVar != null) {
                amVar.mo53117a(gVar, ajVar);
            }
            this.f21391b.f21382a.finish();
        }
    }
}
