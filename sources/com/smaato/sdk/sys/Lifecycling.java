package com.smaato.sdk.sys;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.smaato.sdk.sys.Lifecycle;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class Lifecycling {
    /* access modifiers changed from: private */
    public static final Map<Activity, LifecycleRegistry> lifecycles = new WeakHashMap();

    private Lifecycling() {
    }

    /* renamed from: of */
    public static Lifecycle m24102of(Activity activity) {
        if (activity != null) {
            return getOrCreateLifecycle(activity);
        }
        throw new NullPointerException("'activity' specified as non-null is null");
    }

    /* renamed from: of */
    public static Lifecycle m24103of(View view) {
        return new ViewLifecycle(view);
    }

    public static Lifecycle wrap(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            return new AndroidXLifecycle(lifecycleOwner);
        }
        throw new NullPointerException("'owner' specified as non-null is null");
    }

    static void init(Application application) {
        application.registerActivityLifecycleCallbacks(new ActivityCallbacks((byte) 0));
    }

    /* access modifiers changed from: private */
    public static LifecycleRegistry getOrCreateLifecycle(Activity activity) {
        LifecycleRegistry lifecycleRegistry = lifecycles.get(activity);
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(activity);
        lifecycles.put(activity, lifecycleRegistry2);
        return lifecycleRegistry2;
    }

    static class ActivityCallbacks implements Application.ActivityLifecycleCallbacks {
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        private ActivityCallbacks() {
        }

        /* synthetic */ ActivityCallbacks(byte b) {
            this();
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Lifecycling.getOrCreateLifecycle(activity).dispatch(Lifecycle.Event.ON_CREATE);
        }

        public final void onActivityStarted(Activity activity) {
            Lifecycling.getOrCreateLifecycle(activity).dispatch(Lifecycle.Event.ON_START);
        }

        public final void onActivityResumed(Activity activity) {
            Lifecycling.getOrCreateLifecycle(activity).dispatch(Lifecycle.Event.ON_RESUME);
        }

        public final void onActivityPaused(Activity activity) {
            Lifecycling.getOrCreateLifecycle(activity).dispatch(Lifecycle.Event.ON_PAUSE);
        }

        public final void onActivityStopped(Activity activity) {
            Lifecycling.getOrCreateLifecycle(activity).dispatch(Lifecycle.Event.ON_STOP);
        }

        public final void onActivityDestroyed(Activity activity) {
            LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) Lifecycling.lifecycles.remove(activity);
            if (lifecycleRegistry != null) {
                lifecycleRegistry.dispatch(Lifecycle.Event.ON_DESTROY);
            }
        }
    }
}
