package com.ogury.p245ed.internal;

import android.app.Activity;

/* renamed from: com.ogury.ed.internal.ar */
public final class C8041ar implements C8036am {

    /* renamed from: a */
    private final C8018ai f20901a;

    /* renamed from: b */
    private final Activity f20902b;

    /* renamed from: c */
    private final C8036am f20903c;

    /* renamed from: d */
    private final boolean f20904d;

    /* renamed from: e */
    private final String f20905e;

    /* renamed from: f */
    private final C8071bp f20906f;

    private C8041ar(C8018ai aiVar, Activity activity, C8036am amVar, boolean z, String str, C8071bp bpVar) {
        C8467mq.m23881b(activity, "interstitialActivity");
        C8467mq.m23881b(amVar, "closeCommandInCollapsedMode");
        C8467mq.m23881b(str, "adUnitId");
        C8467mq.m23881b(bpVar, "lastPositionManager");
        this.f20901a = aiVar;
        this.f20902b = activity;
        this.f20903c = amVar;
        this.f20904d = z;
        this.f20905e = str;
        this.f20906f = bpVar;
    }

    public /* synthetic */ C8041ar(C8018ai aiVar, Activity activity, C8036am amVar, boolean z, String str) {
        this(aiVar, activity, amVar, z, str, C8071bp.f20954a);
    }

    /* renamed from: a */
    public final void mo53117a(C8248g gVar, C8020aj ajVar) {
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(ajVar, "adController");
        gVar.mo53571a(C8071bp.m22487a(this.f20905e, gVar));
        gVar.mo53570a();
        gVar.setupDrag(this.f20904d);
        C8018ai aiVar = this.f20901a;
        if (aiVar != null) {
            aiVar.mo53134a(gVar);
        }
        ajVar.mo53154g();
        this.f20902b.finish();
        ajVar.mo53146b(this.f20903c);
        ajVar.mo53139a((C8036am) new C8043at());
    }
}
