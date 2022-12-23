package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.inmobi.media.cl */
/* compiled from: PicassoWrapper */
public class C5075cl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f11616a = C5075cl.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile Picasso f11617b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f11618c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static List<WeakReference<Context>> f11619d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Application.ActivityLifecycleCallbacks f11620e = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public final void onActivityDestroyed(Activity activity) {
            synchronized (C5075cl.f11618c) {
                if (C5075cl.f11617b != null && C5075cl.m11521c(activity)) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(C5075cl.f11620e);
                    C5075cl.f11619d.remove(activity);
                    if (C5075cl.f11619d.isEmpty()) {
                        String unused = C5075cl.f11616a;
                        Picasso unused2 = C5075cl.f11617b;
                        C5075cl.f11617b.shutdown();
                        Picasso unused3 = C5075cl.f11617b = null;
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public static Picasso m11515a(Context context) {
        synchronized (f11618c) {
            if (!m11521c(context)) {
                f11619d.add(new WeakReference(context));
            }
            if (f11617b == null) {
                f11617b = new Picasso.Builder(context).build();
                C5314go.m12191a(context, f11620e);
            }
        }
        return f11617b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m11521c(Context context) {
        for (int i = 0; i < f11619d.size(); i++) {
            Context context2 = (Context) f11619d.get(i).get();
            if (context2 != null && context2.equals(context)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Object m11517a(InvocationHandler invocationHandler) {
        try {
            Class<?> cls = Class.forName("com.squareup.picasso.Callback");
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
