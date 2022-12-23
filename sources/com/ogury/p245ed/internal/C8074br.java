package com.ogury.p245ed.internal;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.ogury.ed.internal.br */
public final class C8074br implements C8086bw {

    /* renamed from: a */
    private final Activity f20963a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8080bu f20964b;

    /* renamed from: c */
    private final C8073bq f20965c;

    /* renamed from: d */
    private final C8262gm f20966d;

    /* renamed from: e */
    private final Application f20967e;

    /* renamed from: f */
    private Application.ActivityLifecycleCallbacks f20968f;

    private C8074br(Activity activity, C8080bu buVar, C8073bq bqVar, C8262gm gmVar) {
        C8467mq.m23881b(activity, "activity");
        C8467mq.m23881b(buVar, "adLayoutController");
        C8467mq.m23881b(bqVar, "overlayActivityFilter");
        C8467mq.m23881b(gmVar, "topActivityMonitor");
        this.f20963a = activity;
        this.f20964b = buVar;
        this.f20965c = bqVar;
        this.f20966d = gmVar;
        this.f20967e = activity.getApplication();
    }

    /* renamed from: a */
    public final C8073bq mo53227a() {
        return this.f20965c;
    }

    public /* synthetic */ C8074br(Activity activity, C8080bu buVar, C8073bq bqVar) {
        this(activity, buVar, bqVar, C8262gm.f21374a);
    }

    /* renamed from: com.ogury.ed.internal.br$a */
    public static final class C8075a extends C8124cx {

        /* renamed from: a */
        final /* synthetic */ C8074br f20969a;

        C8075a(C8074br brVar) {
            this.f20969a = brVar;
        }

        public final void onActivityPaused(Activity activity) {
            C8467mq.m23881b(activity, "activity");
            if (!(activity instanceof C8133dd)) {
                this.f20969a.f20964b.mo53235a();
            }
        }

        public final void onActivityResumed(Activity activity) {
            C8467mq.m23881b(activity, "activity");
            if (!(activity instanceof C8133dd)) {
                this.f20969a.m22502a(activity);
            }
        }
    }

    /* renamed from: b */
    public final void mo53228b() {
        Application.ActivityLifecycleCallbacks aVar = new C8075a(this);
        this.f20968f = aVar;
        this.f20967e.registerActivityLifecycleCallbacks(aVar);
    }

    /* renamed from: c */
    public final void mo53229c() {
        Activity a = C8262gm.m23203a();
        if (a == null) {
            a = this.f20963a;
        }
        m22502a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22502a(Activity activity) {
        if (this.f20965c.mo53226b(activity)) {
            this.f20964b.mo53236a(activity);
        }
    }

    /* renamed from: d */
    public final void mo53230d() {
        this.f20967e.unregisterActivityLifecycleCallbacks(this.f20968f);
    }
}
