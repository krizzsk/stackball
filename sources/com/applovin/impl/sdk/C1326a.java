package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.C1512a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a */
public class C1326a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final List<C1512a> f2623a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private WeakReference<Activity> f2624b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private WeakReference<Activity> f2625c = new WeakReference<>((Object) null);

    public C1326a(Context context) {
        if (context instanceof Activity) {
            this.f2624b = new WeakReference<>((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public Activity mo12601a() {
        return (Activity) this.f2624b.get();
    }

    /* renamed from: a */
    public void mo12602a(C1512a aVar) {
        this.f2623a.add(aVar);
    }

    /* renamed from: b */
    public Activity mo12603b() {
        return (Activity) this.f2625c.get();
    }

    /* renamed from: b */
    public void mo12604b(C1512a aVar) {
        this.f2623a.remove(aVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (C1512a onActivityCreated : new ArrayList(this.f2623a)) {
            onActivityCreated.onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        for (C1512a onActivityDestroyed : new ArrayList(this.f2623a)) {
            onActivityDestroyed.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        this.f2625c = new WeakReference<>((Object) null);
        for (C1512a onActivityPaused : new ArrayList(this.f2623a)) {
            onActivityPaused.onActivityPaused(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f2624b = weakReference;
        this.f2625c = weakReference;
        for (C1512a onActivityResumed : new ArrayList(this.f2623a)) {
            onActivityResumed.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (C1512a onActivitySaveInstanceState : new ArrayList(this.f2623a)) {
            onActivitySaveInstanceState.onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
        for (C1512a onActivityStarted : new ArrayList(this.f2623a)) {
            onActivityStarted.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        for (C1512a onActivityStopped : new ArrayList(this.f2623a)) {
            onActivityStopped.onActivityStopped(activity);
        }
    }
}
