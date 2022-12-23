package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class bt1 extends C14560s4 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f31574f;

    /* renamed from: g */
    private Long f31575g = null;

    /* renamed from: h */
    private final Map<String, aj1> f31576h;

    /* renamed from: i */
    private final String f31577i;

    /* renamed from: com.yandex.mobile.ads.impl.bt1$a */
    class C12653a implements Runnable {

        /* renamed from: b */
        private final WebView f31578b;

        C12653a(bt1 bt1) {
            this.f31578b = bt1.f31574f;
        }

        public void run() {
            this.f31578b.destroy();
        }
    }

    public bt1(Map<String, aj1> map, String str) {
        this.f31576h = map;
        this.f31577i = str;
    }

    /* renamed from: a */
    public void mo66115a() {
        WebView webView = new WebView(qt1.m41436a().mo69650b());
        this.f31574f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo69857a(this.f31574f);
        vt1.m43343a().mo70587a(this.f31574f, this.f31577i);
        for (String next : this.f31576h.keySet()) {
            String externalForm = this.f31576h.get(next).mo65785a().toExternalForm();
            vt1 a = vt1.m43343a();
            WebView webView2 = this.f31574f;
            if (externalForm != null && !TextUtils.isEmpty(next)) {
                a.mo70587a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", next));
            }
        }
        this.f31575g = Long.valueOf(System.nanoTime());
    }

    /* renamed from: a */
    public void mo66116a(ts1 ts1, C14353q4 q4Var) {
        JSONObject jSONObject = new JSONObject();
        Map<String, aj1> d = q4Var.mo69480d();
        for (String next : d.keySet()) {
            ft1.m36312a(jSONObject, next, d.get(next));
        }
        mo69860a(ts1, q4Var, jSONObject);
    }

    /* renamed from: b */
    public void mo66117b() {
        long j;
        super.mo66117b();
        if (this.f31575g == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f31575g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new C12653a(this), Math.max(4000 - j, 2000));
        this.f31574f = null;
    }
}
