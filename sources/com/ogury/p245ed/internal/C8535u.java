package com.ogury.p245ed.internal;

import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.u */
public final class C8535u {

    /* renamed from: a */
    public static final C8536a f21746a = new C8536a((byte) 0);

    /* renamed from: b */
    private final Application f21747b;

    /* renamed from: c */
    private final C8039ap f21748c;

    /* renamed from: d */
    private C8248g f21749d;

    /* renamed from: e */
    private final C8546z f21750e;

    /* renamed from: f */
    private final C8008ab f21751f;

    /* renamed from: g */
    private C8020aj f21752g;

    /* renamed from: h */
    private boolean f21753h;

    /* renamed from: i */
    private FrameLayout f21754i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C8535u(android.app.Application r8, com.ogury.p245ed.internal.C8039ap r9) {
        /*
            r7 = this;
            r0 = r8
            android.content.Context r0 = (android.content.Context) r0
            com.ogury.ed.internal.g r4 = com.ogury.p245ed.internal.C8535u.C8536a.m24000a(r0)
            com.ogury.ed.internal.z r5 = new com.ogury.ed.internal.z
            r5.<init>(r9)
            com.ogury.ed.internal.ab r6 = new com.ogury.ed.internal.ab
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r1 = "<init>"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r0, (java.lang.String) r1)
            r6.<init>(r4, r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8535u.<init>(android.app.Application, com.ogury.ed.internal.ap):void");
    }

    private C8535u(Application application, C8039ap apVar, C8248g gVar, C8546z zVar, C8008ab abVar) {
        C8467mq.m23881b(application, "application");
        C8467mq.m23881b(apVar, "interstitialShowCommand");
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(zVar, "adControllerFactory");
        C8467mq.m23881b(abVar, "sizeCalculator");
        this.f21747b = application;
        this.f21748c = apVar;
        this.f21749d = gVar;
        this.f21750e = zVar;
        this.f21751f = abVar;
        this.f21752g = m23994c();
    }

    /* renamed from: com.ogury.ed.internal.u$a */
    public static final class C8536a {
        public /* synthetic */ C8536a(byte b) {
            this();
        }

        private C8536a() {
        }

        /* renamed from: a */
        public static C8248g m24000a(Context context) {
            C8467mq.m23881b(context, "context");
            C8248g gVar = new C8248g(context);
            gVar.setupDrag(false);
            return gVar;
        }
    }

    /* renamed from: com.ogury.ed.internal.u$b */
    public static final class C8537b implements C8036am {

        /* renamed from: a */
        final /* synthetic */ C8535u f21755a;

        C8537b(C8535u uVar) {
            this.f21755a = uVar;
        }

        /* renamed from: a */
        public final void mo53117a(C8248g gVar, C8020aj ajVar) {
            C8467mq.m23881b(gVar, "adLayout");
            C8467mq.m23881b(ajVar, "adController");
            this.f21755a.m23995d();
        }
    }

    /* renamed from: c */
    private final C8020aj m23994c() {
        C8020aj a = this.f21750e.mo54016a(this.f21747b, this.f21749d);
        a.mo53146b((C8036am) new C8537b(this));
        a.mo53140a((C8044au) new C8010ad(new C8538c(this)));
        a.mo53139a((C8036am) new C8007aa());
        return a;
    }

    /* renamed from: com.ogury.ed.internal.u$c */
    /* synthetic */ class C8538c extends C8466mp implements C8443lv<C8185eb, List<C8185eb>, C8386ke> {
        C8538c(Object obj) {
            super(2, obj, C8535u.class, "showNextAd", "showNextAd(Lio/presage/common/network/models/Ad;Ljava/util/List;)V");
        }

        /* renamed from: a */
        private void m24002a(C8185eb ebVar, List<C8185eb> list) {
            C8467mq.m23881b(ebVar, "p0");
            C8467mq.m23881b(list, "p1");
            ((C8535u) this.f21679a).m23991a(ebVar, list);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53233a(Object obj, Object obj2) {
            m24002a((C8185eb) obj, (List<C8185eb>) (List) obj2);
            return C8386ke.f21633a;
        }
    }

    /* renamed from: a */
    public final void mo54002a(FrameLayout frameLayout, List<C8185eb> list) {
        C8467mq.m23881b(frameLayout, "bannerView");
        C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
        this.f21754i = frameLayout;
        try {
            C8185eb remove = list.remove(0);
            C8107cm.m22599a(list);
            if (remove.mo53378u()) {
                this.f21748c.mo53196a(this.f21747b, remove, new ArrayList());
                if (!list.isEmpty()) {
                    m23990a(list.remove(0), frameLayout, list, true);
                    return;
                }
                return;
            }
            m23990a(remove, frameLayout, list, false);
        } catch (Throwable unused) {
            mo54005b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23991a(C8185eb ebVar, List<C8185eb> list) {
        C8248g a = C8536a.m24000a(this.f21747b);
        this.f21749d = a;
        this.f21751f.mo53119a(a);
        this.f21752g = m23994c();
        m23990a(ebVar, this.f21754i, list, false);
    }

    /* renamed from: a */
    private final void m23990a(C8185eb ebVar, FrameLayout frameLayout, List<C8185eb> list, boolean z) {
        if (frameLayout != null) {
            C8020aj ajVar = this.f21752g;
            if (ajVar != null) {
                ajVar.mo53141a(ebVar, list);
            }
            this.f21753h = ebVar.mo53381x().mo53420a();
            frameLayout.addView(this.f21749d);
            OguryIntegrationLogger.m22104d("[Ads][" + ebVar.mo53380w().mo53404b() + "][show][" + ebVar.mo53365m().mo53408a() + "] Ad succefully attached to the banner view");
            OguryIntegrationLogger.m22104d("[Ads][" + ebVar.mo53380w().mo53404b() + "][show][" + ebVar.mo53365m().mo53408a() + "] Waiting for adding banner view in a layout...");
            m23989a(frameLayout, z);
        }
    }

    /* renamed from: a */
    private final void m23989a(FrameLayout frameLayout, boolean z) {
        C8020aj ajVar;
        if ((!frameLayout.hasWindowFocus() || z) && (ajVar = this.f21752g) != null) {
            ajVar.mo53162o();
        }
    }

    /* renamed from: a */
    public final void mo54003a(C8109cn cnVar) {
        C8467mq.m23881b(cnVar, "adSize");
        C8020aj ajVar = this.f21752g;
        this.f21751f.mo53118a(cnVar, this.f21753h, ajVar == null ? false : ajVar.mo53157j());
    }

    /* renamed from: a */
    public final boolean mo54004a() {
        C8020aj ajVar = this.f21752g;
        if (ajVar == null) {
            return false;
        }
        return ajVar.mo53171x();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m23995d() {
        this.f21749d.mo53570a();
        C8020aj ajVar = this.f21752g;
        if (ajVar != null) {
            ajVar.mo53158k();
        }
        this.f21752g = null;
    }

    /* renamed from: b */
    public final void mo54005b() {
        C8020aj ajVar = this.f21752g;
        if (ajVar != null) {
            if (ajVar.mo53171x()) {
                ajVar.mo53172y();
                ajVar.mo53151d();
            } else {
                ajVar.mo53170w();
            }
            ajVar.mo53159l();
        }
    }
}
