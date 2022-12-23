package com.ironsource.sdk.p146d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.sdk.utils.SDKUtils;

/* renamed from: com.ironsource.sdk.d.a */
public final class C5979a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private C5996c f14638a;

    public C5979a(C5996c cVar) {
        this.f14638a = cVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (!SDKUtils.isIronSourceActivity(activity)) {
            this.f14638a.mo42518d(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (!SDKUtils.isIronSourceActivity(activity)) {
            this.f14638a.mo42522e(activity);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
