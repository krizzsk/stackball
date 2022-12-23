package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class dt1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    private static dt1 f32768d = new dt1();

    /* renamed from: a */
    private boolean f32769a;

    /* renamed from: b */
    private boolean f32770b;

    /* renamed from: c */
    private C12921a f32771c;

    /* renamed from: com.yandex.mobile.ads.impl.dt1$a */
    public interface C12921a {
    }

    private dt1() {
    }

    /* renamed from: a */
    public static dt1 m35446a() {
        return f32768d;
    }

    /* renamed from: a */
    private void m35447a(boolean z) {
        if (this.f32770b != z) {
            this.f32770b = z;
            if (this.f32769a) {
                m35448d();
                C12921a aVar = this.f32771c;
                if (aVar != null) {
                    boolean z2 = !z;
                    ((bu1) aVar).getClass();
                    if (z2) {
                        gf1.m36600g().mo67294a();
                    } else {
                        gf1.m36600g().mo67297c();
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m35448d() {
        boolean z = !this.f32770b;
        for (ts1 i : us1.m42837a().mo70400b()) {
            i.mo70228i().mo69863a(z);
        }
    }

    /* renamed from: a */
    public void mo66671a(C12921a aVar) {
        this.f32771c = aVar;
    }

    /* renamed from: b */
    public void mo66672b() {
        this.f32769a = true;
        this.f32770b = false;
        m35448d();
    }

    /* renamed from: c */
    public void mo66673c() {
        this.f32769a = false;
        this.f32770b = false;
        this.f32771c = null;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        m35447a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z = true;
            boolean z2 = runningAppProcessInfo.importance != 100;
            boolean z3 = true;
            for (ts1 next : us1.m42837a().mo70402c()) {
                if (next.mo70225f() && (e = next.mo70224e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m35447a(z);
        }
    }
}
