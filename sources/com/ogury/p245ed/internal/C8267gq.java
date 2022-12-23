package com.ogury.p245ed.internal;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.share.internal.ShareConstants;

/* renamed from: com.ogury.ed.internal.gq */
public abstract class C8267gq extends WebViewClient {
    /* renamed from: a */
    public WebResourceResponse mo53613a(WebView webView, String str) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        return null;
    }

    /* renamed from: b */
    public boolean mo53615b(WebView webView, String str) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        return true;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        return mo53613a(webView, str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(webResourceRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        String uri = webResourceRequest.getUrl().toString();
        C8467mq.m23878a((Object) uri, "request.url.toString()");
        return mo53613a(webView, uri);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(webResourceRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        String uri = webResourceRequest.getUrl().toString();
        C8467mq.m23878a((Object) uri, "request.url.toString()");
        return mo53615b(webView, uri);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(str, "url");
        return mo53615b(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        mo53614a(i, str, str2);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C8467mq.m23881b(webView, "view");
        C8467mq.m23881b(webResourceRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        C8467mq.m23881b(webResourceError, "error");
        mo53614a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    /* renamed from: a */
    public void mo53614a(int i, String str, String str2) {
        String str3 = "onReceivedError: " + i + " description: " + str + " failingUrl: " + str2;
        C8250ga gaVar = C8250ga.f21371a;
        C8250ga.m23180a(str3);
    }
}
