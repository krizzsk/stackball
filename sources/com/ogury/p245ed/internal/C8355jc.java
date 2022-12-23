package com.ogury.p245ed.internal;

import com.p243my.target.ads.Reward;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.ogury.ed.internal.jc */
public final class C8355jc implements C8358je {

    /* renamed from: a */
    private final C8212ez f21585a;

    /* renamed from: b */
    private final C8358je f21586b;

    /* renamed from: c */
    private final C8185eb f21587c;

    public C8355jc(C8212ez ezVar, C8358je jeVar, C8185eb ebVar) {
        C8467mq.m23881b(ezVar, "androidDevice");
        C8467mq.m23881b(jeVar, "orientationChangedCommand");
        C8467mq.m23881b(ebVar, "ad");
        this.f21585a = ezVar;
        this.f21586b = jeVar;
        this.f21587c = ebVar;
    }

    /* renamed from: a */
    public final void mo53797a(C8282hb hbVar) {
        C8467mq.m23881b(hbVar, "mraidCommandExecutor");
        C8362jh a = hbVar.mo53634a();
        int a2 = C8258gi.m23194a(a.getWidth());
        int a3 = C8258gi.m23194a(a.getHeight());
        int a4 = C8258gi.m23193a(a.getX());
        int a5 = C8258gi.m23193a(a.getY());
        this.f21586b.mo53797a(hbVar);
        hbVar.mo53639a(C8196el.m22923a(this.f21587c) ? "interstitial" : TJAdUnitConstants.String.INLINE);
        hbVar.mo53642a(false);
        hbVar.mo53635a(this.f21585a.mo53460m());
        hbVar.mo53644b();
        hbVar.mo53637a(a2, a3, a4, a5);
        hbVar.mo53646b(a2, a3, a4, a5);
        hbVar.mo53651c(a2, a3, a4, a5);
        hbVar.mo53650c(a2, a3);
        hbVar.mo53647b(Reward.DEFAULT);
    }
}
