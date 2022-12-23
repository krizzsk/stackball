package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.b */
public final class C9084b {

    /* renamed from: a */
    private static Application f22377a;

    /* renamed from: b */
    private static int f22378b;

    /* renamed from: c */
    private static final C9117by f22379c = new C9117by();

    /* renamed from: d */
    private static final Set f22380d = Collections.synchronizedSet(new C9082ay());

    /* renamed from: e */
    private static final C9117by f22381e = new C9117by();

    /* renamed from: b */
    public static boolean m24327b() {
        return f22378b > 0;
    }

    @Nullable
    /* renamed from: c */
    public static Activity m24328c() {
        Activity activity;
        Activity activity2 = (Activity) f22379c.mo57896a();
        if (activity2 != null) {
            return activity2;
        }
        synchronized (f22380d) {
            activity = (Activity) C9468jt.m25453a(f22380d.iterator());
        }
        return activity;
    }

    /* renamed from: a */
    public static void m24324a(Activity activity) {
        f22379c.mo57897a(activity);
    }

    /* renamed from: a */
    public static synchronized void m24325a(Application application) {
        synchronized (C9084b.class) {
            if (f22377a != application) {
                f22377a = application;
            }
        }
    }

    /* renamed from: b */
    public static void m24326b(Activity activity) {
        f22378b++;
        f22379c.mo57897a(activity);
        f22380d.add(activity);
    }

    /* renamed from: c */
    public static void m24329c(Activity activity) {
        f22378b--;
        f22379c.f22435a = null;
        f22380d.remove(activity);
        if (f22378b < 0) {
            f22378b = 0;
        }
    }

    @Nullable
    /* renamed from: a */
    public static Activity m24323a() {
        Activity activity = (Activity) f22381e.mo57896a();
        return activity == null ? m24328c() : activity;
    }
}
