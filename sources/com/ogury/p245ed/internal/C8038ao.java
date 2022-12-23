package com.ogury.p245ed.internal;

import android.view.ViewParent;
import android.widget.FrameLayout;
import com.smaato.sdk.video.vast.model.C8937Ad;

/* renamed from: com.ogury.ed.internal.ao */
public final class C8038ao implements C8036am {

    /* renamed from: a */
    private final C8193ej f20895a;

    /* renamed from: b */
    private final C8039ap f20896b;

    /* renamed from: c */
    private final C8046aw f20897c;

    private C8038ao(C8193ej ejVar, C8039ap apVar, C8046aw awVar) {
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        C8467mq.m23881b(apVar, "interstitialShowCommand");
        C8467mq.m23881b(awVar, "expandCacheStore");
        this.f20895a = ejVar;
        this.f20896b = apVar;
        this.f20897c = awVar;
    }

    public /* synthetic */ C8038ao(C8193ej ejVar, C8039ap apVar) {
        this(ejVar, apVar, C8046aw.f20912a);
    }

    /* renamed from: a */
    public final void mo53117a(C8248g gVar, C8020aj ajVar) {
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(ajVar, "adController");
        ViewParent parent = gVar.getParent();
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout != null) {
            gVar.mo53570a();
            ajVar.mo53155h();
            ajVar.mo53162o();
            gVar.setupDrag(false);
            if (this.f20895a.mo53407e()) {
                gVar.setLeft(0);
                gVar.setTop(0);
            }
            String a = C8046aw.m22409a(new C8045av(this.f20895a, frameLayout, gVar, ajVar));
            C8185eb f = ajVar.mo53153f();
            if (f != null) {
                this.f20896b.mo53197a(ajVar.mo53137a(), a, f, ajVar.mo53152e());
            }
        }
    }
}
