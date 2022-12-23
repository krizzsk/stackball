package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import com.inmobi.media.C5244f;

/* renamed from: com.inmobi.media.bz */
/* compiled from: ChromeTabManager */
public final class C5039bz implements Application.ActivityLifecycleCallbacks, C5244f.C5247a {

    /* renamed from: a */
    private final C5244f f11502a;

    /* renamed from: b */
    private String f11503b;

    /* renamed from: c */
    private Context f11504c;

    /* renamed from: d */
    private C5331h f11505d;

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

    public C5039bz(String str, Context context, C5331h hVar) {
        this.f11503b = str;
        C5244f fVar = new C5244f();
        this.f11502a = fVar;
        fVar.f12014c = this;
        this.f11504c = context.getApplicationContext();
        this.f11505d = hVar;
        C5314go.m12191a(context, (Application.ActivityLifecycleCallbacks) this);
    }

    /* renamed from: b */
    public final void mo40210b() {
        this.f11502a.mo40571a(this.f11504c);
    }

    /* renamed from: a */
    public final void mo40208a() {
        Uri parse = Uri.parse(this.f11503b);
        C5244f fVar = this.f11502a;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(fVar.f12012a == null ? null : fVar.f12012a.newSession(new CustomTabsCallback() {
            public final void onNavigationEvent(int i, Bundle bundle) {
                super.onNavigationEvent(i, bundle);
                String unused = C5244f.f12011d;
                if (C5244f.this.f12014c != null) {
                    C5244f.this.f12014c.mo40209a(i);
                }
            }
        }));
        builder.enableUrlBarHiding();
        C5244f.m12013a(this.f11504c, builder.build(), parse, this.f11505d);
    }

    /* renamed from: a */
    public final void mo40209a(int i) {
        if (i == 5) {
            this.f11505d.mo40690e();
        } else if (i == 6) {
            this.f11505d.mo40691f();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        C5244f fVar = this.f11502a;
        Context context = this.f11504c;
        if (fVar.f12013b != null) {
            context.unbindService(fVar.f12013b);
            fVar.f12012a = null;
            fVar.f12013b = null;
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}
