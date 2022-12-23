package com.flurry.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.flurry.sdk.C2497cn;
import com.flurry.sdk.C2502cp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.flurry.sdk.co */
public final class C2499co {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5852a = C2499co.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List<String> f5853b = new ArrayList(Arrays.asList(new String[]{"FlurryFullscreenTakeoverActivity", "FlurryBrowserActivity"}));

    /* renamed from: c */
    private static C2499co f5854c;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f5855e;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static String f5856g;

    /* renamed from: d */
    private Application.ActivityLifecycleCallbacks f5857d;

    /* renamed from: f */
    private ComponentCallbacks2 f5858f;

    private C2499co() {
        Context context = C2494ck.m5371a().f5832a;
        if (this.f5857d == null) {
            C25001 r1 = new Application.ActivityLifecycleCallbacks() {
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    C2530db.m5474a(3, C2499co.f5852a, "onActivityCreated for activity:".concat(String.valueOf(activity)));
                    m5399a(activity, C2497cn.C2498a.f5844a);
                    synchronized (C2499co.this) {
                        if (C2499co.f5856g == null) {
                            String unused = C2499co.f5856g = activity.getClass().getName();
                        }
                    }
                }

                public final void onActivityStarted(Activity activity) {
                    C2530db.m5474a(3, C2499co.f5852a, "onActivityStarted for activity:".concat(String.valueOf(activity)));
                    if (m5400a(activity)) {
                        m5399a(activity, C2497cn.C2498a.f5848e);
                    }
                }

                public final void onActivityResumed(Activity activity) {
                    C2530db.m5474a(3, C2499co.f5852a, "onActivityResumed for activity:".concat(String.valueOf(activity)));
                    if (!C2499co.f5855e) {
                        C2499co.m5391a(true);
                    }
                    m5399a(activity, C2497cn.C2498a.f5847d);
                }

                public final void onActivityPaused(Activity activity) {
                    C2530db.m5474a(3, C2499co.f5852a, "onActivityPaused for activity:".concat(String.valueOf(activity)));
                    m5399a(activity, C2497cn.C2498a.f5846c);
                }

                public final void onActivityStopped(Activity activity) {
                    C2530db.m5474a(3, C2499co.f5852a, "onActivityStopped for activity:".concat(String.valueOf(activity)));
                    if (m5400a(activity)) {
                        m5399a(activity, C2497cn.C2498a.f5849f);
                    }
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    C2530db.m5474a(3, C2499co.f5852a, "onActivitySaveInstanceState for activity:".concat(String.valueOf(activity)));
                    m5399a(activity, C2497cn.C2498a.f5850g);
                }

                public final void onActivityDestroyed(Activity activity) {
                    C2530db.m5474a(3, C2499co.f5852a, "onActivityDestroyed for activity:".concat(String.valueOf(activity)));
                    m5399a(activity, C2497cn.C2498a.f5845b);
                }

                /* renamed from: a */
                private static void m5399a(Activity activity, int i) {
                    C2497cn cnVar = new C2497cn();
                    cnVar.f5842a = new WeakReference<>(activity);
                    cnVar.f5843b = i;
                    cnVar.mo17720b();
                }

                /* renamed from: a */
                private static boolean m5400a(Activity activity) {
                    return !C2499co.f5853b.contains(activity.getClass().getSimpleName());
                }
            };
            this.f5857d = r1;
            ((Application) context).registerActivityLifecycleCallbacks(r1);
        }
        if (this.f5858f == null) {
            C25012 r12 = new ComponentCallbacks2() {
                public final void onConfigurationChanged(Configuration configuration) {
                }

                public final void onLowMemory() {
                }

                public final void onTrimMemory(int i) {
                    if (i == 20) {
                        C2499co.m5391a(false);
                    }
                }
            };
            this.f5858f = r12;
            context.registerComponentCallbacks(r12);
        }
    }

    /* renamed from: a */
    public static synchronized C2499co m5389a() {
        C2499co coVar;
        synchronized (C2499co.class) {
            if (f5854c == null) {
                f5854c = new C2499co();
            }
            coVar = f5854c;
        }
        return coVar;
    }

    /* renamed from: b */
    public static synchronized void m5392b() {
        synchronized (C2499co.class) {
            if (f5854c != null) {
                C2499co coVar = f5854c;
                Context context = C2494ck.m5371a().f5832a;
                if (coVar.f5857d != null) {
                    ((Application) context).unregisterActivityLifecycleCallbacks(coVar.f5857d);
                    coVar.f5857d = null;
                }
                if (coVar.f5858f != null) {
                    context.unregisterComponentCallbacks(coVar.f5858f);
                    coVar.f5858f = null;
                }
            }
            f5854c = null;
        }
    }

    /* renamed from: c */
    public final boolean mo17689c() {
        return this.f5857d != null;
    }

    /* renamed from: d */
    public final synchronized String mo17690d() {
        return f5856g;
    }

    /* renamed from: a */
    static /* synthetic */ void m5391a(boolean z) {
        int i;
        f5855e = z;
        C2494ck.m5373a(z);
        if (f5855e) {
            i = C2502cp.C2503a.f5862a;
        } else {
            i = C2502cp.C2503a.f5863b;
        }
        C2511cw.m5419a().mo17721a((C2509cu) new C2502cp(i));
    }
}
