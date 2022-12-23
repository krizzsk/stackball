package com.moat.analytics.mobile.inm;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.moat.analytics.mobile.inm.C7270v;
import com.moat.analytics.mobile.inm.C7286x;
import com.moat.analytics.mobile.inm.p240a.p242b.C7224a;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.moat.analytics.mobile.inm.n */
class C7253n extends MoatFactory {
    C7253n() {
        if (!m18515a()) {
            C7261p.m18545a("[ERROR] ", 3, "Factory", this, "Failed to initialize MoatFactory" + ", SDK was not started");
            throw new C7252m("Failed to initialize MoatFactory");
        }
    }

    /* renamed from: a */
    private NativeDisplayTracker m18510a(View view, final Map<String, String> map) {
        final WeakReference weakReference = new WeakReference(view);
        return (NativeDisplayTracker) C7286x.m18603a(new C7286x.C7288a<NativeDisplayTracker>() {
            /* renamed from: a */
            public C7224a<NativeDisplayTracker> mo49314a() {
                View view = (View) weakReference.get();
                C7261p.m18545a("[INFO] ", 3, "Factory", this, "Attempting to create NativeDisplayTracker for " + C7261p.m18542a(view));
                return C7224a.m18385a(new C7268t(view, map));
            }
        }, NativeDisplayTracker.class);
    }

    /* renamed from: a */
    private NativeVideoTracker m18511a(final String str) {
        return (NativeVideoTracker) C7286x.m18603a(new C7286x.C7288a<NativeVideoTracker>() {
            /* renamed from: a */
            public C7224a<NativeVideoTracker> mo49314a() {
                C7261p.m18545a("[INFO] ", 3, "Factory", this, "Attempting to create NativeVideoTracker");
                return C7224a.m18385a(new C7269u(str));
            }
        }, NativeVideoTracker.class);
    }

    /* renamed from: a */
    private WebAdTracker m18512a(ViewGroup viewGroup) {
        final WeakReference weakReference = new WeakReference(viewGroup);
        return (WebAdTracker) C7286x.m18603a(new C7286x.C7288a<WebAdTracker>() {
            /* renamed from: a */
            public C7224a<WebAdTracker> mo49314a() {
                ViewGroup viewGroup = (ViewGroup) weakReference.get();
                C7261p.m18545a("[INFO] ", 3, "Factory", this, "Attempting to create WebAdTracker for adContainer " + C7261p.m18542a((View) viewGroup));
                return C7224a.m18385a(new C7225aa(viewGroup));
            }
        }, WebAdTracker.class);
    }

    /* renamed from: a */
    private WebAdTracker m18513a(WebView webView) {
        final WeakReference weakReference = new WeakReference(webView);
        return (WebAdTracker) C7286x.m18603a(new C7286x.C7288a<WebAdTracker>() {
            /* renamed from: a */
            public C7224a<WebAdTracker> mo49314a() {
                WebView webView = (WebView) weakReference.get();
                C7261p.m18545a("[INFO] ", 3, "Factory", this, "Attempting to create WebAdTracker for " + C7261p.m18542a((View) webView));
                return C7224a.m18385a(new C7225aa(webView));
            }
        }, WebAdTracker.class);
    }

    /* renamed from: a */
    private <T> T m18514a(MoatPlugin<T> moatPlugin) {
        return moatPlugin.mo49284a();
    }

    /* renamed from: a */
    private boolean m18515a() {
        return ((C7250k) C7250k.getInstance()).mo49403a();
    }

    public <T> T createCustomTracker(MoatPlugin<T> moatPlugin) {
        try {
            return m18514a(moatPlugin);
        } catch (Exception e) {
            C7252m.m18508a(e);
            return moatPlugin.mo49285b();
        }
    }

    public NativeDisplayTracker createNativeDisplayTracker(View view, Map<String, String> map) {
        try {
            return m18510a(view, map);
        } catch (Exception e) {
            C7252m.m18508a(e);
            return new C7270v.C7273c();
        }
    }

    public NativeVideoTracker createNativeVideoTracker(String str) {
        try {
            return m18511a(str);
        } catch (Exception e) {
            C7252m.m18508a(e);
            return new C7270v.C7274d();
        }
    }

    public WebAdTracker createWebAdTracker(ViewGroup viewGroup) {
        try {
            return m18512a(viewGroup);
        } catch (Exception e) {
            C7252m.m18508a(e);
            return new C7270v.C7275e();
        }
    }

    public WebAdTracker createWebAdTracker(WebView webView) {
        try {
            return m18513a(webView);
        } catch (Exception e) {
            C7252m.m18508a(e);
            return new C7270v.C7275e();
        }
    }
}
