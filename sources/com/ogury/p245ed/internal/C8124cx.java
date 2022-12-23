package com.ogury.p245ed.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.ogury.ed.internal.cx */
public abstract class C8124cx implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C8467mq.m23881b(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        C8467mq.m23881b(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C8467mq.m23881b(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        C8467mq.m23881b(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C8467mq.m23881b(activity, "activity");
        C8467mq.m23881b(bundle, "p1");
    }

    public void onActivityStarted(Activity activity) {
        C8467mq.m23881b(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        C8467mq.m23881b(activity, "activity");
    }
}
