package com.fyber.inneractive.sdk.p056m;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.m.f */
final class C3058f extends WebViewClient {

    /* renamed from: a */
    C3036b f7546a;

    /* renamed from: b */
    private final boolean f7547b;

    /* renamed from: c */
    private final int f7548c;

    /* renamed from: d */
    private final int f7549d;

    /* renamed from: e */
    private final int f7550e;

    C3058f(C3036b bVar, boolean z, int i, int i2, int i3) {
        this.f7546a = bVar;
        this.f7547b = z;
        this.f7548c = i;
        this.f7549d = i2;
        this.f7550e = i3;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        super.shouldOverrideUrlLoading(webView, str);
        C3036b bVar = this.f7546a;
        return bVar != null && bVar.mo18547a(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        IAlog.m9033a("onPageStarted - url: %s", str);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IAlog.m9033a("onPageFinished - url: %s", str);
    }

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        IAlog.m9033a("Resources to load: %s", str);
        IAlog.m9030a(IAlog.f9871b, "%s %s", "RESOURCES", str);
        C3036b bVar = this.f7546a;
        if (bVar != null) {
            bVar.mo18554c(str);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.f7547b && Build.VERSION.SDK_INT >= 21 && webResourceRequest != null) {
            IAlog.m9033a("shouldInterceptRequest, method = %s", webResourceRequest.getMethod());
            WebResourceResponse a = C3062i.m7244a().mo18648a(webResourceRequest, this.f7548c, this.f7549d, this.f7550e);
            if (a != null) {
                return a;
            }
            IAlog.m9033a("shouldInterceptRequest did not intercept %s", webResourceRequest.getUrl());
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        IAlog.m9034b("onWebViewRenderProcessGone called for web view! %s", webView);
        if (renderProcessGoneDetail != null) {
            renderProcessGoneDetail.didCrash();
        }
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(renderProcessGoneDetail != null && renderProcessGoneDetail.didCrash());
        IAlog.m9034b("onWebViewRenderProcessGone detail: did crash = %s", objArr);
        this.f7546a.mo18563l();
        return true;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.m9033a("%sError: code = %d text = %s WebView = %s", IAlog.m9029a((Object) this), Integer.valueOf(i), str, webView);
        super.onReceivedError(webView, i, str, str2);
    }
}
