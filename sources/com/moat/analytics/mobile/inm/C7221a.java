package com.moat.analytics.mobile.inm;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.moat.analytics.mobile.inm.C7276w;
import java.lang.ref.WeakReference;

/* renamed from: com.moat.analytics.mobile.inm.a */
class C7221a {

    /* renamed from: a */
    static WeakReference<Activity> f18094a = null;

    /* renamed from: b */
    private static boolean f18095b = false;

    /* renamed from: c */
    private static Application f18096c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f18097d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static boolean f18098e = false;

    /* renamed from: com.moat.analytics.mobile.inm.a$a */
    static class C7222a implements Application.ActivityLifecycleCallbacks {
        C7222a() {
        }

        /* renamed from: a */
        private static void m18382a(boolean z) {
            if (z) {
                C7261p.m18544a(3, "ActivityState", (Object) null, "App became visible");
                if (C7276w.m18582a().f18242a == C7276w.C7284d.ON && !((C7250k) MoatAnalytics.getInstance()).f18189c) {
                    C7258o.m18520a().mo49413c();
                    return;
                }
                return;
            }
            C7261p.m18544a(3, "ActivityState", (Object) null, "App became invisible");
            if (C7276w.m18582a().f18242a == C7276w.C7284d.ON && !((C7250k) MoatAnalytics.getInstance()).f18189c) {
                C7258o.m18520a().mo49414d();
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            int unused = C7221a.f18097d = 1;
        }

        public void onActivityDestroyed(Activity activity) {
            try {
                if (!(C7221a.f18097d == 3 || C7221a.f18097d == 5)) {
                    if (C7221a.f18098e) {
                        m18382a(false);
                    }
                    boolean unused = C7221a.f18098e = false;
                }
                int unused2 = C7221a.f18097d = 6;
                C7261p.m18544a(3, "ActivityState", (Object) this, "Activity destroyed: " + activity.getClass() + "@" + activity.hashCode());
                if (C7221a.m18380b(activity)) {
                    C7221a.f18094a = new WeakReference<>((Object) null);
                }
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }

        public void onActivityPaused(Activity activity) {
            try {
                int unused = C7221a.f18097d = 4;
                if (C7221a.m18380b(activity)) {
                    C7221a.f18094a = new WeakReference<>((Object) null);
                }
                C7261p.m18544a(3, "ActivityState", (Object) this, "Activity paused: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }

        public void onActivityResumed(Activity activity) {
            try {
                C7221a.f18094a = new WeakReference<>(activity);
                int unused = C7221a.f18097d = 3;
                C7276w.m18582a().mo49427b();
                C7261p.m18544a(3, "ActivityState", (Object) this, "Activity resumed: " + activity.getClass() + "@" + activity.hashCode());
                if (((C7250k) MoatAnalytics.getInstance()).f18188b) {
                    C7232f.m18424a(activity);
                }
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            try {
                C7221a.f18094a = new WeakReference<>(activity);
                int unused = C7221a.f18097d = 2;
                if (!C7221a.f18098e) {
                    m18382a(true);
                }
                boolean unused2 = C7221a.f18098e = true;
                C7261p.m18544a(3, "ActivityState", (Object) this, "Activity started: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }

        public void onActivityStopped(Activity activity) {
            try {
                if (C7221a.f18097d != 3) {
                    boolean unused = C7221a.f18098e = false;
                    m18382a(false);
                }
                int unused2 = C7221a.f18097d = 5;
                if (C7221a.m18380b(activity)) {
                    C7221a.f18094a = new WeakReference<>((Object) null);
                }
                C7261p.m18544a(3, "ActivityState", (Object) this, "Activity stopped: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }
    }

    C7221a() {
    }

    /* renamed from: a */
    static Application m18375a() {
        return f18096c;
    }

    /* renamed from: a */
    static void m18376a(Application application) {
        f18096c = application;
        if (!f18095b) {
            f18095b = true;
            application.registerActivityLifecycleCallbacks(new C7222a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m18380b(Activity activity) {
        WeakReference<Activity> weakReference = f18094a;
        return weakReference != null && weakReference.get() == activity;
    }
}
