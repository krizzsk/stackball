package com.p243my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.p243my.target.C7593p0;
import com.p243my.target.common.MyTargetActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.v0 */
public abstract class C7697v0 implements C7593p0, MyTargetActivity.ActivityEngine {

    /* renamed from: a */
    public final C7593p0.C7594a f19493a;

    /* renamed from: b */
    public boolean f19494b;

    /* renamed from: c */
    public boolean f19495c;

    /* renamed from: d */
    public WeakReference<MyTargetActivity> f19496d;

    /* renamed from: e */
    public boolean f19497e;

    /* renamed from: f */
    public C7593p0.C7595b f19498f;

    public C7697v0(C7593p0.C7594a aVar) {
        this.f19493a = aVar;
    }

    /* renamed from: a */
    public static C7697v0 m20629a(C7327b2 b2Var, C7665t2 t2Var, boolean z, C7593p0.C7594a aVar) {
        if (b2Var instanceof C7399f2) {
            return C7743y0.m20837a((C7399f2) b2Var, t2Var, z, aVar);
        }
        if (b2Var instanceof C7359d2) {
            return C7715w0.m20697a((C7359d2) b2Var, t2Var, aVar);
        }
        if (b2Var instanceof C7377e2) {
            return C7727x0.m20779a((C7377e2) b2Var, aVar);
        }
        return null;
    }

    /* renamed from: a */
    public C7593p0.C7595b mo51701a() {
        return this.f19498f;
    }

    /* renamed from: a */
    public void mo49535a(Context context) {
        if (this.f19497e) {
            C7374e0.m18989a("Unable to open Interstitial Ad twice, please dismiss currently showing ad first");
            return;
        }
        this.f19493a.onStartDisplaying();
        this.f19497e = true;
        MyTargetActivity.activityEngine = this;
        Intent intent = new Intent(context, MyTargetActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo49538a(C7593p0.C7595b bVar) {
        this.f19498f = bVar;
    }

    /* renamed from: a */
    public void mo51702a(C7768z1 z1Var, Context context) {
        C7741x8.m20827c((List<C7328b3>) z1Var.getStatHolder().mo49800a("closedByUser"), context);
        dismiss();
    }

    /* renamed from: b */
    public abstract boolean mo51703b();

    /* renamed from: c */
    public String mo51313c() {
        return "myTarget";
    }

    /* renamed from: d */
    public float mo51314d() {
        return 0.0f;
    }

    public void destroy() {
        dismiss();
    }

    public void dismiss() {
        this.f19497e = false;
        WeakReference<MyTargetActivity> weakReference = this.f19496d;
        MyTargetActivity myTargetActivity = weakReference == null ? null : (MyTargetActivity) weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    public final boolean onActivityBackPressed() {
        return mo51703b();
    }

    public void onActivityCreate(MyTargetActivity myTargetActivity, Intent intent, FrameLayout frameLayout) {
        this.f19496d = new WeakReference<>(myTargetActivity);
        myTargetActivity.setTheme(16973830);
        myTargetActivity.getWindow().setFlags(1024, 1024);
        this.f19493a.onDisplay();
    }

    public void onActivityDestroy() {
        this.f19497e = false;
        this.f19496d = null;
        this.f19493a.onDismiss();
    }

    public boolean onActivityOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onActivityPause() {
        this.f19494b = false;
    }

    public void onActivityResume() {
        this.f19494b = true;
    }

    public void onActivityStart() {
    }

    public void onActivityStop() {
    }
}
