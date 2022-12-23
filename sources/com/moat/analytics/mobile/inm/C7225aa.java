package com.moat.analytics.mobile.inm;

import android.view.ViewGroup;
import android.webkit.WebView;

/* renamed from: com.moat.analytics.mobile.inm.aa */
class C7225aa extends C7227b implements WebAdTracker {
    C7225aa(ViewGroup viewGroup) {
        this(C7226ab.m18391a(viewGroup, false).mo49332c(null));
        if (viewGroup == null) {
            C7261p.m18545a("[ERROR] ", 3, "WebAdTracker", this, "WebAdTracker initialization not successful, ".concat("Target ViewGroup is null"));
            this.f18102a = new C7252m("Target ViewGroup is null");
        }
        if (this.f18103b == null) {
            C7261p.m18545a("[ERROR] ", 3, "WebAdTracker", this, "WebAdTracker initialization not successful, ".concat("No WebView to track inside of ad container"));
            this.f18102a = new C7252m("No WebView to track inside of ad container");
        }
    }

    C7225aa(WebView webView) {
        super(webView, false, false);
        C7261p.m18544a(3, "WebAdTracker", (Object) this, "Initializing.");
        if (webView == null) {
            C7261p.m18545a("[ERROR] ", 3, "WebAdTracker", this, "WebAdTracker initialization not successful, ".concat("WebView is null"));
            this.f18102a = new C7252m("WebView is null");
            return;
        }
        try {
            super.mo49338a(webView);
            C7261p.m18547a("[SUCCESS] ", mo49337a() + " created for " + mo49348g());
        } catch (C7252m e) {
            this.f18102a = e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo49337a() {
        return "WebAdTracker";
    }
}
