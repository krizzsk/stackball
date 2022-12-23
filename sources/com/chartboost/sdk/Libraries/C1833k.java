package com.chartboost.sdk.Libraries;

import android.app.Activity;
import com.chartboost.sdk.impl.C1925h1;
import java.lang.ref.WeakReference;

/* renamed from: com.chartboost.sdk.Libraries.k */
public final class C1833k extends WeakReference<Activity> {

    /* renamed from: a */
    public final int f4407a;

    public C1833k(Activity activity) {
        super(activity);
        C1925h1.m4594a("WeakActivity.WeakActivity", (Object) activity);
        this.f4407a = activity.hashCode();
    }

    /* renamed from: a */
    public boolean mo14256a(Activity activity) {
        return activity != null && activity.hashCode() == this.f4407a;
    }

    public int hashCode() {
        return this.f4407a;
    }
}
