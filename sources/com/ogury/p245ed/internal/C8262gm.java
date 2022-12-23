package com.ogury.p245ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.ogury.ed.internal.gm */
public final class C8262gm {

    /* renamed from: a */
    public static final C8262gm f21374a = new C8262gm();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static WeakReference<Activity> f21375b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private static boolean f21376c;

    private C8262gm() {
    }

    /* renamed from: a */
    public static Activity m23203a() {
        return (Activity) f21375b.get();
    }

    /* renamed from: a */
    public final synchronized void mo53612a(Context context) {
        C8467mq.m23881b(context, "context");
        if (!f21376c) {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                f21376c = true;
                application.registerActivityLifecycleCallbacks(new C8263a());
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.gm$a */
    public static final class C8263a extends C8124cx {
        C8263a() {
        }

        public final void onActivityResumed(Activity activity) {
            C8467mq.m23881b(activity, "activity");
            C8262gm gmVar = C8262gm.f21374a;
            C8262gm.f21375b = new WeakReference(activity);
        }
    }
}
