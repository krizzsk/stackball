package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;

public class ContextProvider {

    /* renamed from: e */
    private static volatile ContextProvider f12677e;

    /* renamed from: a */
    private Activity f12678a;

    /* renamed from: b */
    private Context f12679b;

    /* renamed from: c */
    private ConcurrentHashMap<String, C5504a> f12680c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Handler f12681d = new Handler(Looper.getMainLooper());

    /* renamed from: com.ironsource.environment.ContextProvider$a */
    public interface C5504a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f12677e == null) {
            synchronized (ContextProvider.class) {
                if (f12677e == null) {
                    f12677e = new ContextProvider();
                }
            }
        }
        return f12677e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f12678a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context getApplicationContext() {
        /*
            r1 = this;
            android.content.Context r0 = r1.f12679b
            if (r0 != 0) goto L_0x000d
            android.app.Activity r0 = r1.f12678a
            if (r0 == 0) goto L_0x000d
            android.content.Context r0 = r0.getApplicationContext()
            return r0
        L_0x000d:
            android.content.Context r0 = r1.f12679b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.ContextProvider.getApplicationContext():android.content.Context");
    }

    public Activity getCurrentActiveActivity() {
        return this.f12678a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (C5504a onPause : this.f12680c.values()) {
                onPause.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f12678a = activity;
            for (C5504a onResume : this.f12680c.values()) {
                onResume.onResume(this.f12678a);
            }
        }
    }

    public void postOnUIThread(Runnable runnable) {
        Handler handler = this.f12681d;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void registerLifeCycleListener(C5504a aVar) {
        this.f12680c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void runOnUIThread(Runnable runnable) {
        Activity activity = this.f12678a;
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f12678a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f12679b = context;
        }
    }
}
