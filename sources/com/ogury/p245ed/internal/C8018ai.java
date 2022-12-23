package com.ogury.p245ed.internal;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.ogury.ed.internal.ai */
public final class C8018ai {

    /* renamed from: a */
    private final Application f20832a;

    /* renamed from: b */
    private Application.ActivityLifecycleCallbacks f20833b;

    public C8018ai(Application application) {
        C8467mq.m23881b(application, "application");
        this.f20832a = application;
    }

    /* renamed from: com.ogury.ed.internal.ai$a */
    public static final class C8019a extends C8124cx {

        /* renamed from: a */
        final /* synthetic */ C8248g f20834a;

        /* renamed from: b */
        final /* synthetic */ C8018ai f20835b;

        C8019a(C8248g gVar, C8018ai aiVar) {
            this.f20834a = gVar;
            this.f20835b = aiVar;
        }

        public final void onActivityPaused(Activity activity) {
            C8467mq.m23881b(activity, "activity");
            this.f20834a.mo53570a();
        }

        public final void onActivityResumed(Activity activity) {
            C8467mq.m23881b(activity, "activity");
            this.f20835b.mo53133a();
            C8248g gVar = this.f20834a;
            activity.addContentView(gVar, gVar.getLayoutParams());
        }
    }

    /* renamed from: a */
    public final void mo53134a(C8248g gVar) {
        C8467mq.m23881b(gVar, "adLayout");
        Application.ActivityLifecycleCallbacks aVar = new C8019a(gVar, this);
        this.f20833b = aVar;
        this.f20832a.registerActivityLifecycleCallbacks(aVar);
    }

    /* renamed from: a */
    public final void mo53133a() {
        this.f20832a.unregisterActivityLifecycleCallbacks(this.f20833b);
    }
}
