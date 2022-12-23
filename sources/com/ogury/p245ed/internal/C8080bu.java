package com.ogury.p245ed.internal;

import android.app.Activity;

/* renamed from: com.ogury.ed.internal.bu */
public final class C8080bu {

    /* renamed from: a */
    private final C8248g f20982a;

    /* renamed from: b */
    private final C8020aj f20983b;

    /* renamed from: c */
    private final C8533s f20984c;

    private C8080bu(C8248g gVar, C8020aj ajVar, C8533s sVar) {
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(ajVar, "adController");
        C8467mq.m23881b(sVar, "oguryAds");
        this.f20982a = gVar;
        this.f20983b = ajVar;
        this.f20984c = sVar;
    }

    public /* synthetic */ C8080bu(C8248g gVar, C8020aj ajVar) {
        this(gVar, ajVar, C8533s.f21743a);
    }

    /* renamed from: a */
    public final void mo53236a(Activity activity) {
        C8467mq.m23881b(activity, "activity");
        if (C8533s.m23987c() && this.f20982a.getParent() == null && this.f20983b.mo53156i()) {
            C8533s.m23983a(true);
            C8248g gVar = this.f20982a;
            activity.addContentView(gVar, gVar.getLayoutParams());
            m22519b(activity);
        }
    }

    /* renamed from: b */
    private final void m22519b(Activity activity) {
        if (activity.hasWindowFocus()) {
            this.f20983b.mo53163p();
        } else {
            this.f20983b.mo53162o();
        }
    }

    /* renamed from: a */
    public final void mo53235a() {
        if (this.f20982a.getParent() != null && !this.f20983b.mo53168u()) {
            this.f20983b.mo53162o();
            this.f20982a.mo53570a();
        }
    }
}
