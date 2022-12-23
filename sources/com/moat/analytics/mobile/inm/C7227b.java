package com.moat.analytics.mobile.inm;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.facebook.internal.AnalyticsEvents;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.moat.analytics.mobile.inm.C7245j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.moat.analytics.mobile.inm.b */
abstract class C7227b {

    /* renamed from: a */
    C7252m f18102a = null;

    /* renamed from: b */
    WeakReference<WebView> f18103b;

    /* renamed from: c */
    C7245j f18104c;

    /* renamed from: d */
    TrackerListener f18105d;

    /* renamed from: e */
    final String f18106e;

    /* renamed from: f */
    final boolean f18107f;

    /* renamed from: g */
    private WeakReference<View> f18108g;

    /* renamed from: h */
    private final C7291z f18109h;

    /* renamed from: i */
    private final boolean f18110i;

    /* renamed from: j */
    private boolean f18111j;

    /* renamed from: k */
    private boolean f18112k;

    C7227b(View view, boolean z, boolean z2) {
        String str;
        C7261p.m18544a(3, "BaseTracker", (Object) this, "Initializing.");
        if (z) {
            str = InneractiveMediationDefs.GENDER_MALE + hashCode();
        } else {
            str = "";
        }
        this.f18106e = str;
        this.f18108g = new WeakReference<>(view);
        this.f18110i = z;
        this.f18107f = z2;
        this.f18111j = false;
        this.f18112k = false;
        this.f18109h = new C7291z();
    }

    /* renamed from: i */
    private void mo49359i() {
        String str;
        C7261p.m18544a(3, "BaseTracker", (Object) this, "Attempting bridge installation.");
        if (this.f18103b.get() != null) {
            this.f18104c = new C7245j((WebView) this.f18103b.get(), C7245j.C7249a.WEBVIEW);
            str = "Bridge installed.";
        } else {
            this.f18104c = null;
            str = "Bridge not installed, WebView is null.";
        }
        C7261p.m18544a(3, "BaseTracker", (Object) this, str);
    }

    /* renamed from: j */
    private void mo49360j() {
        if (this.f18111j) {
            throw new C7252m("Tracker already started");
        }
    }

    /* renamed from: k */
    private void mo49361k() {
        if (this.f18112k) {
            throw new C7252m("Tracker already stopped");
        }
    }

    /* renamed from: l */
    private boolean mo49362l() {
        return this.f18110i || this.f18107f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract String mo49337a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49338a(WebView webView) {
        if (webView != null) {
            this.f18103b = new WeakReference<>(webView);
            if (this.f18104c == null && !mo49362l()) {
                mo49359i();
            }
            C7245j jVar = this.f18104c;
            if (jVar != null) {
                jVar.mo49390a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49339a(C7245j jVar) {
        this.f18104c = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49340a(String str, Exception exc) {
        try {
            C7252m.m18508a(exc);
            String a = C7252m.m18506a(str, exc);
            if (this.f18105d != null) {
                this.f18105d.onTrackingFailedToStart(a);
            }
            C7261p.m18544a(3, "BaseTracker", (Object) this, a);
            C7261p.m18547a("[ERROR] ", mo49337a() + " " + a);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49341a(List<String> list) {
        if (mo49347f() == null && !this.f18107f) {
            list.add("Tracker's target view is null");
        }
        if (!list.isEmpty()) {
            throw new C7252m(TextUtils.join(" and ", list));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo49342b() {
        C7261p.m18544a(3, "BaseTracker", (Object) this, "Attempting to start impression.");
        mo49343c();
        mo49345d();
        mo49341a((List<String>) new ArrayList());
        C7245j jVar = this.f18104c;
        if (jVar != null) {
            jVar.mo49394b(this);
            this.f18111j = true;
            C7261p.m18544a(3, "BaseTracker", (Object) this, "Impression started.");
            return;
        }
        C7261p.m18544a(3, "BaseTracker", (Object) this, "Bridge is null, won't start tracking");
        throw new C7252m("Bridge is null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo49343c() {
        if (this.f18102a != null) {
            throw new C7252m("Tracker initialization failed: " + this.f18102a.getMessage());
        }
    }

    public void changeTargetView(View view) {
        C7261p.m18544a(3, "BaseTracker", (Object) this, "changing view to " + C7261p.m18542a(view));
        this.f18108g = new WeakReference<>(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo49345d() {
        mo49360j();
        mo49361k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo49346e() {
        return this.f18111j && !this.f18112k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo49347f() {
        return (View) this.f18108g.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo49348g() {
        return C7261p.m18542a(mo49347f());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo49349h() {
        this.f18109h.mo49434a(this.f18106e, mo49347f());
        return this.f18109h.f18282a;
    }

    public void removeListener() {
        this.f18105d = null;
    }

    @Deprecated
    public void setActivity(Activity activity) {
    }

    public void setListener(TrackerListener trackerListener) {
        this.f18105d = trackerListener;
    }

    public void startTracking() {
        try {
            C7261p.m18544a(3, "BaseTracker", (Object) this, "In startTracking method.");
            mo49342b();
            if (this.f18105d != null) {
                this.f18105d.onTrackingStarted("Tracking started on " + mo49348g());
            }
            String str = "startTracking succeeded for " + mo49348g();
            C7261p.m18544a(3, "BaseTracker", (Object) this, str);
            C7261p.m18547a("[SUCCESS] ", mo49337a() + " " + str);
        } catch (Exception e) {
            mo49340a("startTracking", e);
        }
    }

    public void stopTracking() {
        boolean z = false;
        try {
            C7261p.m18544a(3, "BaseTracker", (Object) this, "In stopTracking method.");
            this.f18112k = true;
            if (this.f18104c != null) {
                this.f18104c.mo49396c(this);
                z = true;
            }
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
        StringBuilder sb = new StringBuilder("Attempt to stop tracking ad impression was ");
        sb.append(z ? "" : "un");
        sb.append("successful.");
        C7261p.m18544a(3, "BaseTracker", (Object) this, sb.toString());
        String str = z ? "[SUCCESS] " : "[ERROR] ";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo49337a());
        sb2.append(" stopTracking ");
        sb2.append(z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
        sb2.append(" for ");
        sb2.append(mo49348g());
        C7261p.m18547a(str, sb2.toString());
        TrackerListener trackerListener = this.f18105d;
        if (trackerListener != null) {
            trackerListener.onTrackingStopped("");
            this.f18105d = null;
        }
    }
}
