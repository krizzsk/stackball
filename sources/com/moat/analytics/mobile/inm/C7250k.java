package com.moat.analytics.mobile.inm;

import android.app.Application;
import android.content.Context;
import com.moat.analytics.mobile.inm.C7233g;
import com.moat.analytics.mobile.inm.C7276w;
import java.lang.ref.WeakReference;

/* renamed from: com.moat.analytics.mobile.inm.k */
class C7250k extends MoatAnalytics implements C7276w.C7282b {

    /* renamed from: a */
    boolean f18187a = false;

    /* renamed from: b */
    boolean f18188b = false;

    /* renamed from: c */
    boolean f18189c = false;

    /* renamed from: d */
    C7233g f18190d;

    /* renamed from: e */
    WeakReference<Context> f18191e;

    /* renamed from: f */
    private boolean f18192f = false;

    /* renamed from: g */
    private String f18193g;

    /* renamed from: h */
    private MoatOptions f18194h;

    C7250k() {
    }

    /* renamed from: a */
    private void m18491a(MoatOptions moatOptions, Application application) {
        if (this.f18192f) {
            C7261p.m18544a(3, "Analytics", (Object) this, "Moat SDK has already been started.");
            return;
        }
        this.f18194h = moatOptions;
        C7276w.m18582a().mo49427b();
        this.f18189c = moatOptions.disableLocationServices;
        if (application != null) {
            if (moatOptions.loggingEnabled && C7264s.m18556b(application.getApplicationContext())) {
                this.f18187a = true;
            }
            this.f18191e = new WeakReference<>(application.getApplicationContext());
            this.f18192f = true;
            this.f18188b = moatOptions.autoTrackGMAInterstitials;
            C7221a.m18376a(application);
            C7276w.m18582a().mo49426a((C7276w.C7282b) this);
            if (!moatOptions.disableAdIdCollection) {
                C7264s.m18554a((Context) application);
            }
            C7261p.m18547a("[SUCCESS] ", "Moat Analytics SDK Version 2.5.0 started");
            return;
        }
        throw new C7252m("Moat Analytics SDK didn't start, application was null");
    }

    /* renamed from: e */
    private void m18492e() {
        if (this.f18190d == null) {
            C7233g gVar = new C7233g(C7221a.m18375a(), C7233g.C7238a.DISPLAY);
            this.f18190d = gVar;
            gVar.mo49369a(this.f18193g);
            C7261p.m18544a(3, "Analytics", (Object) this, "Preparing native display tracking with partner code " + this.f18193g);
            C7261p.m18547a("[SUCCESS] ", "Prepared for native display tracking with partner code " + this.f18193g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo49403a() {
        return this.f18192f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo49404b() {
        MoatOptions moatOptions = this.f18194h;
        return moatOptions != null && moatOptions.disableLocationServices;
    }

    /* renamed from: c */
    public void mo49405c() {
        C7252m.m18507a();
        C7258o.m18520a();
        if (this.f18193g != null) {
            try {
                m18492e();
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }
    }

    /* renamed from: d */
    public void mo49406d() {
    }

    public void prepareNativeDisplayTracking(String str) {
        this.f18193g = str;
        if (C7276w.m18582a().f18242a != C7276w.C7284d.OFF) {
            try {
                m18492e();
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }
    }

    public void start(Application application) {
        start(new MoatOptions(), application);
    }

    public void start(MoatOptions moatOptions, Application application) {
        try {
            m18491a(moatOptions, application);
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }
}
