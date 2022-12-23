package com.ogury.p245ed.internal;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bs */
public final class C8076bs {

    /* renamed from: a */
    private final Application f20970a;

    /* renamed from: b */
    private final C8087bx f20971b;

    /* renamed from: c */
    private final C8039ap f20972c;

    /* renamed from: d */
    private C8086bw f20973d;

    /* renamed from: e */
    private C8248g f20974e;

    /* renamed from: f */
    private final C8088by f20975f;

    /* renamed from: g */
    private final C8071bp f20976g;

    /* renamed from: h */
    private C8020aj f20977h;

    /* renamed from: i */
    private C8350iz f20978i;

    /* renamed from: j */
    private Activity f20979j;

    private C8076bs(Application application, C8087bx bxVar, C8039ap apVar, C8248g gVar, C8088by byVar, C8071bp bpVar) {
        C8467mq.m23881b(application, "application");
        C8467mq.m23881b(bxVar, "overlayInjectorFactory");
        C8467mq.m23881b(apVar, "interstitialShowCommand");
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(byVar, "mraidAdControllerFactory");
        C8467mq.m23881b(bpVar, "positionManager");
        this.f20970a = application;
        this.f20971b = bxVar;
        this.f20972c = apVar;
        this.f20973d = null;
        this.f20974e = gVar;
        this.f20975f = byVar;
        this.f20976g = bpVar;
        this.f20978i = new C8350iz();
        this.f20974e.setContainsOverlayAd(true);
        this.f20977h = m22512b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C8076bs(android.app.Application r8, com.ogury.p245ed.internal.C8087bx r9, com.ogury.p245ed.internal.C8039ap r10) {
        /*
            r7 = this;
            com.ogury.ed.internal.g r4 = new com.ogury.ed.internal.g
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r1 = "constructor(\n    private…Controller = null\n    }\n}"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r0, (java.lang.String) r1)
            r4.<init>(r0)
            com.ogury.ed.internal.by r5 = new com.ogury.ed.internal.by
            r5.<init>(r10)
            com.ogury.ed.internal.bp r6 = com.ogury.p245ed.internal.C8071bp.f20954a
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8076bs.<init>(android.app.Application, com.ogury.ed.internal.bx, com.ogury.ed.internal.ap):void");
    }

    /* renamed from: b */
    private final C8020aj m22512b() {
        C8020aj a = this.f20975f.mo53253a(this.f20970a, this.f20974e);
        a.mo53139a((C8036am) new C8043at());
        a.mo53146b((C8036am) new C8077a(this));
        a.mo53140a((C8044au) new C8096ce(new C8078b(this)));
        return a;
    }

    /* renamed from: com.ogury.ed.internal.bs$a */
    public static final class C8077a implements C8036am {

        /* renamed from: a */
        final /* synthetic */ C8076bs f20980a;

        C8077a(C8076bs bsVar) {
            this.f20980a = bsVar;
        }

        /* renamed from: a */
        public final void mo53117a(C8248g gVar, C8020aj ajVar) {
            C8467mq.m23881b(gVar, "adLayout");
            C8467mq.m23881b(ajVar, "adController");
            this.f20980a.mo53231a();
        }
    }

    /* renamed from: com.ogury.ed.internal.bs$b */
    /* synthetic */ class C8078b extends C8466mp implements C8443lv<C8185eb, List<C8185eb>, C8386ke> {
        C8078b(Object obj) {
            super(2, obj, C8076bs.class, "showNextAd", "showNextAd(Lio/presage/common/network/models/Ad;Ljava/util/List;)V");
        }

        /* renamed from: a */
        private void m22516a(C8185eb ebVar, List<C8185eb> list) {
            C8467mq.m23881b(ebVar, "p0");
            C8467mq.m23881b(list, "p1");
            ((C8076bs) this.f21679a).m22509a(ebVar, list);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53233a(Object obj, Object obj2) {
            m22516a((C8185eb) obj, (List<C8185eb>) (List) obj2);
            return C8386ke.f21633a;
        }
    }

    /* renamed from: a */
    public final void mo53232a(Activity activity, int i, int i2, List<C8185eb> list) {
        C8467mq.m23881b(activity, "activity");
        C8467mq.m23881b(list, CampaignUnit.JSON_KEY_ADS);
        this.f20979j = activity;
        try {
            C8185eb remove = list.remove(0);
            C8107cm.m22599a(list);
            this.f20978i.mo53785c(C8258gi.m23195b(i));
            this.f20978i.mo53787d(C8258gi.m23195b(i2));
            if (remove.mo53378u()) {
                this.f20972c.mo53196a(this.f20970a, remove, new ArrayList());
                if (!list.isEmpty()) {
                    m22510a(list.remove(0), list, activity, false);
                    return;
                }
                return;
            }
            m22510a(remove, list, activity, true);
        } catch (Throwable unused) {
            mo53231a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22509a(C8185eb ebVar, List<C8185eb> list) {
        Activity activity = this.f20979j;
        if (activity != null) {
            C8248g gVar = new C8248g(this.f20970a);
            this.f20974e = gVar;
            gVar.setContainsOverlayAd(true);
            this.f20977h = m22512b();
            m22510a(ebVar, list, activity, true);
        }
    }

    /* renamed from: a */
    private final void m22510a(C8185eb ebVar, List<C8185eb> list, Activity activity, boolean z) {
        C8086bw bwVar;
        C8086bw bwVar2 = this.f20973d;
        if (bwVar2 != null) {
            bwVar2.mo53230d();
        }
        C8020aj ajVar = this.f20977h;
        if (ajVar != null) {
            this.f20973d = this.f20971b.mo53252a(activity, this.f20974e, ajVar);
            String a = ebVar.mo53365m().mo53408a();
            C8071bp.m22489a(this.f20974e, a);
            m22511a(a);
            ajVar.mo53141a(ebVar, list);
            if (z && (bwVar = this.f20973d) != null) {
                bwVar.mo53229c();
            }
            C8086bw bwVar3 = this.f20973d;
            if (bwVar3 != null) {
                bwVar3.mo53228b();
            }
        }
    }

    /* renamed from: a */
    private final void m22511a(String str) {
        Rect a = C8071bp.m22486a(str);
        if (a != null) {
            this.f20978i.mo53785c(a.left);
            this.f20978i.mo53787d(a.top);
        }
        C8020aj ajVar = this.f20977h;
        if (ajVar != null) {
            ajVar.mo53138a(this.f20978i.mo53786d(), this.f20978i.mo53788e());
        }
    }

    /* renamed from: a */
    public final void mo53231a() {
        C8086bw bwVar = this.f20973d;
        if (bwVar != null) {
            bwVar.mo53230d();
        }
        this.f20973d = null;
        this.f20974e.mo53570a();
        C8020aj ajVar = this.f20977h;
        if (ajVar != null) {
            ajVar.mo53158k();
        }
        this.f20977h = null;
    }
}
