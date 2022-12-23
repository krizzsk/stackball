package com.ogury.p245ed.internal;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cj */
public final class C8102cj implements C8086bw {

    /* renamed from: a */
    private final C8080bu f21024a;

    /* renamed from: b */
    private final C8101ci f21025b;

    /* renamed from: c */
    private final C8262gm f21026c;

    /* renamed from: d */
    private FragmentActivity f21027d;

    /* renamed from: e */
    private final Application f21028e;

    /* renamed from: f */
    private final C8103a f21029f;

    /* renamed from: g */
    private final FragmentManager.OnBackStackChangedListener f21030g;

    /* renamed from: h */
    private final C8104b f21031h;

    private C8102cj(Activity activity, C8080bu buVar, C8101ci ciVar, C8262gm gmVar) {
        C8467mq.m23881b(activity, "activity");
        C8467mq.m23881b(buVar, "adLayoutController");
        C8467mq.m23881b(ciVar, "overlayFragmentFilter");
        C8467mq.m23881b(gmVar, "topActivityMonitor");
        this.f21024a = buVar;
        this.f21025b = ciVar;
        this.f21026c = gmVar;
        this.f21027d = (FragmentActivity) activity;
        this.f21028e = activity.getApplication();
        this.f21029f = new C8103a(this);
        this.f21030g = new FragmentManager.OnBackStackChangedListener() {
            public final void onBackStackChanged() {
                C8102cj.m22584a(C8102cj.this);
            }
        };
        this.f21031h = new C8104b(this);
    }

    public /* synthetic */ C8102cj(Activity activity, C8080bu buVar, C8101ci ciVar) {
        this(activity, buVar, ciVar, C8262gm.f21374a);
    }

    /* renamed from: com.ogury.ed.internal.cj$a */
    public static final class C8103a extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ C8102cj f21032a;

        C8103a(C8102cj cjVar) {
            this.f21032a = cjVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m22584a(C8102cj cjVar) {
        C8467mq.m23881b(cjVar, "this$0");
        FragmentManager supportFragmentManager = cjVar.f21027d.getSupportFragmentManager();
        C8467mq.m23878a((Object) supportFragmentManager, "fragmentActivity.supportFragmentManager");
        cjVar.m22583a(supportFragmentManager);
    }

    /* renamed from: com.ogury.ed.internal.cj$b */
    public static final class C8104b extends C8124cx {

        /* renamed from: a */
        final /* synthetic */ C8102cj f21033a;

        C8104b(C8102cj cjVar) {
            this.f21033a = cjVar;
        }

        public final void onActivityResumed(Activity activity) {
            C8467mq.m23881b(activity, "activity");
            if (activity instanceof FragmentActivity) {
                this.f21033a.m22582a((FragmentActivity) activity);
            }
        }

        public final void onActivityPaused(Activity activity) {
            C8467mq.m23881b(activity, "activity");
            if (activity instanceof FragmentActivity) {
                this.f21033a.m22586b((FragmentActivity) activity);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22582a(FragmentActivity fragmentActivity) {
        this.f21027d = fragmentActivity;
        fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.f21029f, true);
        fragmentActivity.getSupportFragmentManager().addOnBackStackChangedListener(this.f21030g);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m22586b(FragmentActivity fragmentActivity) {
        fragmentActivity.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.f21029f);
        fragmentActivity.getSupportFragmentManager().removeOnBackStackChangedListener(this.f21030g);
        this.f21024a.mo53235a();
    }

    /* renamed from: a */
    private final void m22583a(FragmentManager fragmentManager) {
        if (this.f21025b.mo53270a((List<? extends Object>) C8100ch.m22577a(fragmentManager))) {
            this.f21024a.mo53236a(this.f21027d);
        } else {
            this.f21024a.mo53235a();
        }
    }

    /* renamed from: b */
    public final void mo53228b() {
        this.f21028e.registerActivityLifecycleCallbacks(this.f21031h);
    }

    /* renamed from: c */
    public final void mo53229c() {
        Activity a = C8262gm.m23203a();
        FragmentActivity fragmentActivity = a instanceof FragmentActivity ? (FragmentActivity) a : null;
        if (fragmentActivity == null) {
            fragmentActivity = this.f21027d;
        }
        m22582a(fragmentActivity);
        FragmentManager supportFragmentManager = this.f21027d.getSupportFragmentManager();
        C8467mq.m23878a((Object) supportFragmentManager, "fragmentActivity.supportFragmentManager");
        m22583a(supportFragmentManager);
    }

    /* renamed from: d */
    public final void mo53230d() {
        this.f21028e.unregisterActivityLifecycleCallbacks(this.f21031h);
        m22586b(this.f21027d);
    }
}
