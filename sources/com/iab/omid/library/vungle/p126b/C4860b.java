package com.iab.omid.library.vungle.p126b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.vungle.adsession.C4857a;

/* renamed from: com.iab.omid.library.vungle.b.b */
public class C4860b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C4860b f10946a = new C4860b();

    /* renamed from: b */
    private boolean f10947b;

    /* renamed from: c */
    private boolean f10948c;

    /* renamed from: d */
    private C4861a f10949d;

    /* renamed from: com.iab.omid.library.vungle.b.b$a */
    public interface C4861a {
        /* renamed from: a */
        void mo39703a(boolean z);
    }

    private C4860b() {
    }

    /* renamed from: a */
    public static C4860b m10840a() {
        return f10946a;
    }

    /* renamed from: a */
    private void m10841a(boolean z) {
        if (this.f10948c != z) {
            this.f10948c = z;
            if (this.f10947b) {
                m10842e();
                C4861a aVar = this.f10949d;
                if (aVar != null) {
                    aVar.mo39703a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m10842e() {
        boolean z = !this.f10948c;
        for (C4857a adSessionStatePublisher : C4859a.m10833a().mo39686b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo39750a(z);
        }
    }

    /* renamed from: a */
    public void mo39691a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo39692a(C4861a aVar) {
        this.f10949d = aVar;
    }

    /* renamed from: b */
    public void mo39693b() {
        this.f10947b = true;
        this.f10948c = false;
        m10842e();
    }

    /* renamed from: c */
    public void mo39694c() {
        this.f10947b = false;
        this.f10948c = false;
        this.f10949d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo39695d() {
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
        m10841a(false);
    }

    public void onActivityStopped(Activity activity) {
        View d;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo39695d().importance != 100;
            boolean z3 = true;
            for (C4857a next : C4859a.m10833a().mo39688c()) {
                if (next.mo39655e() && (d = next.mo39654d()) != null && d.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m10841a(z);
        }
    }
}
