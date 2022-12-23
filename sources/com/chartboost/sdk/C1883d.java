package com.chartboost.sdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.C1833k;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1856h;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.impl.C1925h1;
import com.chartboost.sdk.impl.C1979s1;

/* renamed from: com.chartboost.sdk.d */
public class C1883d {

    /* renamed from: a */
    private final C2022j f4690a;

    /* renamed from: b */
    private final Handler f4691b;

    /* renamed from: c */
    public final C1885e f4692c;

    /* renamed from: d */
    CBImpressionActivity f4693d = null;

    /* renamed from: e */
    C1838c f4694e = null;

    /* renamed from: f */
    private boolean f4695f = false;

    /* renamed from: g */
    private C1833k f4696g;

    /* renamed from: h */
    private Context f4697h;

    /* renamed from: com.chartboost.sdk.d$a */
    public class C1884a implements Runnable {

        /* renamed from: a */
        public final int f4698a;

        /* renamed from: b */
        Activity f4699b = null;

        /* renamed from: c */
        public C1838c f4700c = null;

        public C1884a(int i) {
            this.f4698a = i;
        }

        public void run() {
            try {
                switch (this.f4698a) {
                    case 7:
                        C1883d.this.mo14491c();
                        return;
                    case 9:
                        C1883d.this.mo14496e(this.f4700c);
                        return;
                    case 10:
                        if (this.f4700c.mo14298z()) {
                            this.f4700c.mo14285k().mo14536m();
                            return;
                        }
                        return;
                    case 11:
                        C1885e d = C1883d.this.mo14492d();
                        if (this.f4700c.f4449b == 2 && d != null) {
                            d.mo14507a(this.f4700c);
                            return;
                        }
                        return;
                    case 12:
                        this.f4700c.mo14288p();
                        return;
                    case 13:
                        C1883d.this.f4692c.mo14508a(this.f4700c, this.f4699b);
                        return;
                    case 14:
                        C1883d.this.f4692c.mo14512e(this.f4700c);
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
                CBLogging.m3993b("CBUIManager", "run (" + this.f4698a + "): " + e.toString());
            }
        }
    }

    public C1883d(Context context, C1856h hVar, C2022j jVar, Handler handler, C1885e eVar) {
        this.f4697h = context;
        this.f4690a = jVar;
        this.f4691b = handler;
        this.f4692c = eVar;
    }

    /* renamed from: c */
    private void m4367c(C1838c cVar) {
        this.f4692c.mo14511d(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14485a(CBImpressionActivity cBImpressionActivity) {
        C1925h1.m4594a("CBUIManager.setImpressionActivity", (Object) cBImpressionActivity);
        if (this.f4693d == null) {
            this.f4693d = cBImpressionActivity;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1833k mo14488b(Activity activity) {
        C1833k kVar = this.f4696g;
        if (kVar == null || kVar.f4407a != activity.hashCode()) {
            this.f4696g = new C1833k(activity);
        }
        return this.f4696g;
    }

    /* renamed from: d */
    public C1885e mo14492d() {
        if (mo14494e() == null) {
            return null;
        }
        return this.f4692c;
    }

    /* renamed from: e */
    public Activity mo14494e() {
        return this.f4693d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C1838c mo14497f() {
        C1979s1 s1Var;
        C1885e d = mo14492d();
        if (d == null) {
            s1Var = null;
        } else {
            s1Var = d.mo14506a();
        }
        if (s1Var == null || !s1Var.mo14793e()) {
            return null;
        }
        return s1Var.mo14792d();
    }

    /* renamed from: g */
    public boolean mo14498g() {
        return mo14497f() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo14499h() {
        C1925h1.m4593a("CBUIManager.onBackPressedCallback");
        if (!C1882c.m4358a() || !this.f4695f) {
            return false;
        }
        this.f4695f = false;
        mo14500i();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo14500i() {
        C1925h1.m4593a("CBUIManager.onBackPressedImpl");
        return m4366b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo14501j() {
        C1925h1.m4593a("CBUIManager.onCreateImpl");
        mo14504m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo14502k() {
        C1925h1.m4595a("CBUIManager.onPauseImpl", (String) null);
        C1838c f = mo14497f();
        if (f != null) {
            f.mo14293u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo14503l() {
        C1925h1.m4595a("CBUIManager.onResumeImpl", (String) null);
        C1838c f = mo14497f();
        if (f != null) {
            f.mo14296x();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo14504m() {
        C1925h1.m4593a("CBUIManager.onStop");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14490c(Activity activity) {
        C1838c cVar;
        C1925h1.m4594a("CBUIManager.onDestroyImpl", (Object) activity);
        C1838c f = mo14497f();
        if (f == null && activity == this.f4693d && (cVar = this.f4694e) != null) {
            f = cVar;
        }
        C1885e d = mo14492d();
        if (!(d == null || f == null)) {
            d.mo14512e(f);
        }
        this.f4694e = null;
    }

    /* renamed from: e */
    public void mo14496e(C1838c cVar) {
        Intent intent = new Intent(this.f4697h, CBImpressionActivity.class);
        intent.putExtra("isChartboost", true);
        intent.addFlags(268435456);
        try {
            this.f4697h.startActivity(intent);
            this.f4695f = true;
        } catch (ActivityNotFoundException unused) {
            CBLogging.m3993b("CBUIManager", "Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions.");
            this.f4694e = null;
            cVar.mo14273a(CBError.CBImpressionError.ACTIVITY_MISSING_IN_MANIFEST);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14484a() {
        C1925h1.m4593a("CBUIManager.clearImpressionActivity");
        this.f4693d = null;
    }

    /* renamed from: b */
    public void mo14489b(C1838c cVar) {
        C1925h1.m4594a("CBUIManager.queueDisplayView", (Object) cVar);
        if (cVar.mo14283i().booleanValue()) {
            m4367c(cVar);
        } else {
            m4368d(cVar);
        }
    }

    /* renamed from: a */
    private boolean m4364a(Activity activity) {
        return this.f4693d == activity;
    }

    /* renamed from: d */
    private void m4368d(C1838c cVar) {
        if (mo14498g()) {
            cVar.mo14273a(CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE);
        } else if (this.f4693d != null) {
            this.f4692c.mo14510b(cVar);
        } else {
            C1838c cVar2 = this.f4694e;
            if (cVar2 == null || cVar2 == cVar) {
                this.f4694e = cVar;
                C1880a aVar = C2026k.f5247d;
                if (aVar != null) {
                    int i = cVar.f4448a;
                    if (i == 1 || i == 2) {
                        C2026k.f5247d.willDisplayVideo(cVar.f4460m);
                    } else if (i == 0) {
                        aVar.willDisplayInterstitial(cVar.f4460m);
                    }
                }
                if (C2026k.f5248e != null) {
                    C1884a aVar2 = new C1884a(9);
                    aVar2.f4700c = cVar;
                    this.f4691b.postDelayed(aVar2, (long) 1);
                    return;
                }
                mo14496e(cVar);
                return;
            }
            cVar.mo14273a(CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE);
        }
    }

    /* renamed from: a */
    private boolean m4365a(C1833k kVar) {
        if (kVar == null) {
            return this.f4693d == null;
        }
        return kVar.mo14256a(this.f4693d);
    }

    /* renamed from: b */
    private boolean m4366b() {
        C1925h1.m4593a("CBUIManager.closeImpressionImpl");
        C1838c f = mo14497f();
        if (f == null || f.f4449b != 2) {
            return false;
        }
        if (f.mo14289q()) {
            return true;
        }
        C2022j.m4961e(new C1884a(7));
        return true;
    }

    /* renamed from: a */
    public void mo14486a(C1838c cVar) {
        int i = cVar.f4449b;
        if (i == 2) {
            C1885e d = mo14492d();
            if (d != null) {
                d.mo14507a(cVar);
            }
        } else if (cVar.f4464q.f4422b == 1 && i == 1) {
            C1885e d2 = mo14492d();
            if (d2 != null) {
                d2.mo14512e(cVar);
            }
            C1874e.m4311e(new C1868a("show_close_before_template_show_error", "", cVar.f4450c.f4749b, cVar.f4460m));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo14495e(Activity activity) {
        C1833k b = mo14488b(activity);
        C1925h1.m4594a("CBUIManager.onStopImpl", (Object) b);
        C1838c f = mo14497f();
        if (f != null && f.f4464q.f4422b == 0) {
            C1885e d = mo14492d();
            if (m4365a(b) && d != null) {
                d.mo14513f(f);
                this.f4694e = f;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo14491c() {
        C1838c f = mo14497f();
        if (f == null) {
            return false;
        }
        f.f4447D = true;
        mo14486a(f);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        if (r1 != 3) goto L_0x0049;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14487a(android.app.Activity r4, com.chartboost.sdk.Model.C1838c r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 == 0) goto L_0x0049
            int r1 = r5.f4449b
            if (r1 == r0) goto L_0x0046
            r2 = 2
            if (r1 == r2) goto L_0x000e
            r4 = 3
            if (r1 == r4) goto L_0x0046
            goto L_0x0049
        L_0x000e:
            boolean r1 = r5.mo14266E()
            if (r1 != 0) goto L_0x0049
            com.chartboost.sdk.Chartboost$CBFramework r1 = com.chartboost.sdk.C2026k.f5248e
            if (r1 == 0) goto L_0x0024
            boolean r1 = r1.doesWrapperUseCustomBackgroundingBehavior()
            if (r1 == 0) goto L_0x0024
            boolean r4 = r4 instanceof com.chartboost.sdk.CBImpressionActivity
            if (r4 != 0) goto L_0x0024
            r4 = 0
            return r4
        L_0x0024:
            com.chartboost.sdk.e r4 = r3.mo14492d()
            if (r4 == 0) goto L_0x0049
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error onActivityStart "
            r1.append(r2)
            int r2 = r5.f4449b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "CBUIManager"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r2, r1)
            r4.mo14512e(r5)
            goto L_0x0049
        L_0x0046:
            r3.mo14489b((com.chartboost.sdk.Model.C1838c) r5)
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.C1883d.mo14487a(android.app.Activity, com.chartboost.sdk.Model.c):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo14493d(Activity activity) {
        C1925h1.m4594a("CBUIManager.onStartImpl", (Object) activity);
        boolean z = activity instanceof CBImpressionActivity;
        if (z) {
            mo14485a((CBImpressionActivity) activity);
        }
        Chartboost.CBFramework cBFramework = C2026k.f5248e;
        boolean z2 = cBFramework != null && cBFramework.doesWrapperUseCustomBackgroundingBehavior();
        if (activity == null) {
            return;
        }
        if (z2 || m4364a(activity)) {
            if (z) {
                this.f4695f = false;
            }
            if (mo14487a(activity, this.f4694e)) {
                this.f4694e = null;
            }
            this.f4690a.mo14895a(activity);
            C1838c f = mo14497f();
            if (f != null) {
                f.mo14297y();
            }
        }
    }
}
