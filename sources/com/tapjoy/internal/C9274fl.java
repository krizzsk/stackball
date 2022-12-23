package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyUtil;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tapjoy.internal.fl */
public final class C9274fl {

    /* renamed from: a */
    private static final C9274fl f22933a = new C9274fl();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Application f22934b;

    /* renamed from: c */
    private Application.ActivityLifecycleCallbacks f22935c;

    /* renamed from: d */
    private final HashSet f22936d = new HashSet();

    /* renamed from: a */
    public static void m24881a(Context context) {
        if (Build.VERSION.SDK_INT >= 14 && context != null) {
            C9274fl flVar = f22933a;
            Context applicationContext = context.getApplicationContext();
            if (flVar.f22934b == null) {
                try {
                    if (applicationContext instanceof Application) {
                        flVar.f22934b = (Application) applicationContext;
                    } else {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        TapjoyUtil.runOnMainThread(new Runnable() {
                            public final void run() {
                                try {
                                    Application unused = C9274fl.this.f22934b = C9274fl.m24882b();
                                } catch (Exception e) {
                                    TapjoyLog.m24278w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
                                } catch (Throwable th) {
                                    countDownLatch.countDown();
                                    throw th;
                                }
                                countDownLatch.countDown();
                            }
                        });
                        countDownLatch.await();
                    }
                } catch (Exception e) {
                    TapjoyLog.m24278w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
                }
                if (flVar.f22934b == null) {
                    return;
                }
            }
            synchronized (flVar) {
                if (flVar.f22935c == null) {
                    Activity c = C9084b.m24328c();
                    if (c != null) {
                        flVar.f22936d.add(m24883b(c));
                    }
                    final HashSet hashSet = flVar.f22936d;
                    C92762 r1 = new Application.ActivityLifecycleCallbacks() {
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityDestroyed(Activity activity) {
                        }

                        public final void onActivityPaused(Activity activity) {
                        }

                        public final void onActivityResumed(Activity activity) {
                        }

                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityStarted(Activity activity) {
                            hashSet.add(C9274fl.m24883b(activity));
                            if (hashSet.size() == 1) {
                                C9326gn.m25003a();
                            }
                            C9084b.m24324a(activity);
                        }

                        public final void onActivityStopped(Activity activity) {
                            hashSet.remove(C9274fl.m24883b(activity));
                            if (hashSet.size() <= 0) {
                                C9326gn.m25008b();
                            }
                        }
                    };
                    flVar.f22935c = r1;
                    flVar.f22934b.registerActivityLifecycleCallbacks(r1);
                    C9326gn.m25003a();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m24880a() {
        if (Build.VERSION.SDK_INT >= 14) {
            C9274fl flVar = f22933a;
            if (flVar.f22934b != null) {
                synchronized (flVar) {
                    if (flVar.f22935c != null) {
                        flVar.f22934b.unregisterActivityLifecycleCallbacks(flVar.f22935c);
                        flVar.f22935c = null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m24883b(Activity activity) {
        return activity.getClass().getName() + "@" + System.identityHashCode(activity);
    }

    /* renamed from: b */
    static /* synthetic */ Application m24882b() {
        return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke((Object) null, (Object[]) null);
    }
}
