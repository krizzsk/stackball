package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.adview.u */
public class C1153u extends WebViewClient {

    /* renamed from: a */
    private final C1505q f2126a;

    /* renamed from: b */
    private WeakReference<C1154a> f2127b;

    /* renamed from: com.applovin.impl.adview.u$a */
    public interface C1154a {
        /* renamed from: a */
        void mo12005a(C1152t tVar);

        /* renamed from: b */
        void mo12006b(C1152t tVar);

        /* renamed from: c */
        void mo12007c(C1152t tVar);
    }

    public C1153u(C1469j jVar) {
        this.f2126a = jVar.mo13139v();
    }

    /* renamed from: a */
    private void m1794a(WebView webView, String str) {
        C1505q qVar = this.f2126a;
        qVar.mo13279c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        if (str != null && (webView instanceof C1152t)) {
            C1152t tVar = (C1152t) webView;
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            C1154a aVar = (C1154a) this.f2127b.get();
            if ("applovin".equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
                if ("/track_click".equals(path)) {
                    aVar.mo12005a(tVar);
                } else if ("/close_ad".equals(path)) {
                    aVar.mo12006b(tVar);
                } else if ("/skip_ad".equals(path)) {
                    aVar.mo12007c(tVar);
                } else {
                    C1505q qVar2 = this.f2126a;
                    qVar2.mo13280d("WebViewButtonClient", "Unknown URL: " + str);
                    C1505q qVar3 = this.f2126a;
                    qVar3.mo13280d("WebViewButtonClient", "Path: " + path);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12068a(WeakReference<C1154a> weakReference) {
        this.f2127b = weakReference;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m1794a(webView, str);
        return true;
    }
}
