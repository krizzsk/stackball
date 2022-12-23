package com.iab.omid.library.corpmailru.p096b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.corpmailru.adsession.C4610a;

/* renamed from: com.iab.omid.library.corpmailru.b.b */
public class C4613b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C4613b f10397a = new C4613b();

    /* renamed from: b */
    private boolean f10398b;

    /* renamed from: c */
    private boolean f10399c;

    /* renamed from: d */
    private C4614a f10400d;

    /* renamed from: com.iab.omid.library.corpmailru.b.b$a */
    public interface C4614a {
        /* renamed from: a */
        void mo38781a(boolean z);
    }

    private C4613b() {
    }

    /* renamed from: a */
    public static C4613b m9752a() {
        return f10397a;
    }

    /* renamed from: a */
    private void m9753a(boolean z) {
        if (this.f10399c != z) {
            this.f10399c = z;
            if (this.f10398b) {
                m9754e();
                C4614a aVar = this.f10400d;
                if (aVar != null) {
                    aVar.mo38781a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m9754e() {
        boolean z = !this.f10399c;
        for (C4610a adSessionStatePublisher : C4612a.m9745a().mo38764b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo38828a(z);
        }
    }

    /* renamed from: a */
    public void mo38769a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo38770a(C4614a aVar) {
        this.f10400d = aVar;
    }

    /* renamed from: b */
    public void mo38771b() {
        this.f10398b = true;
        this.f10399c = false;
        m9754e();
    }

    /* renamed from: c */
    public void mo38772c() {
        this.f10398b = false;
        this.f10399c = false;
        this.f10400d = null;
    }

    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo38773d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
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
        m9753a(false);
    }

    public void onActivityStopped(Activity activity) {
        View d;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo38773d().importance != 100;
            boolean z3 = true;
            for (C4610a next : C4612a.m9745a().mo38766c()) {
                if (next.mo38733e() && (d = next.mo38732d()) != null && d.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m9753a(z);
        }
    }
}
