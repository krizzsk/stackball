package com.tapjoy.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.List;

/* renamed from: com.tapjoy.internal.du */
public final class C9173du extends C9170ds {

    /* renamed from: f */
    WebView f22538f;

    /* renamed from: g */
    private List f22539g;

    /* renamed from: h */
    private final String f22540h;

    public C9173du(List list, String str) {
        this.f22539g = list;
        this.f22540h = str;
    }

    /* renamed from: b */
    public final void mo57965b() {
        super.mo57965b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b */
            private WebView f22542b = C9173du.this.f22538f;

            public final void run() {
                this.f22542b.destroy();
            }
        }, 2000);
        this.f22538f = null;
    }

    /* renamed from: a */
    public final void mo57959a() {
        super.mo57959a();
        WebView webView = new WebView(C9154df.m24514a().f22509a);
        this.f22538f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo57961a(this.f22538f);
        C9155dg.m24515a();
        C9155dg.m24517a(this.f22538f, this.f22540h);
        for (C9144cy cyVar : this.f22539g) {
            String externalForm = cyVar.f22476b.toExternalForm();
            C9155dg.m24515a();
            WebView webView2 = this.f22538f;
            if (externalForm != null) {
                C9155dg.m24517a(webView2, "var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);".replace("%SCRIPT_SRC%", externalForm));
            }
        }
    }
}
