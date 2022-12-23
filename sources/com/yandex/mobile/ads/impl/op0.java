package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.util.Locale;

class op0 extends gb0 {

    /* renamed from: b */
    private String f38295b;

    op0(hb0 hb0) {
        super(hb0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo69250a(String str) {
        this.f38295b = str;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (Build.VERSION.SDK_INT >= 21 || TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f38295b) || !"mraid.js".equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment())) {
            return super.shouldInterceptRequest(webView, str);
        }
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(this.f38295b.getBytes()));
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (TextUtils.isEmpty(this.f38295b) || (url = webResourceRequest.getUrl()) == null || !"mraid.js".equals(url.getLastPathSegment())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(this.f38295b.getBytes()));
    }
}
