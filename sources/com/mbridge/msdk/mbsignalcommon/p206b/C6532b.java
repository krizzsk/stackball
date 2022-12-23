package com.mbridge.msdk.mbsignalcommon.p206b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.windvane.C6560d;

/* renamed from: com.mbridge.msdk.mbsignalcommon.b.b */
/* compiled from: DefaultWebViewListener */
public class C6532b implements C6560d {
    /* renamed from: a */
    public final void mo44060a(WebView webView, String str, Bitmap bitmap) {
        C6361q.m16154a("WindVaneWebView", "onPageStarted");
    }

    /* renamed from: b */
    public final boolean mo44062b(WebView webView, String str) {
        C6361q.m16154a("WindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    /* renamed from: a */
    public void mo44021a(WebView webView, int i, String str, String str2) {
        C6361q.m16154a("WindVaneWebView", "onReceivedError");
    }

    /* renamed from: a */
    public void mo44022a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C6361q.m16154a("WindVaneWebView", "onReceivedSslError");
    }

    /* renamed from: a */
    public void mo44023a(WebView webView, String str) {
        C6361q.m16154a("WindVaneWebView", "onPageFinished");
    }

    /* renamed from: b */
    public final void mo44061b(WebView webView, int i) {
        C6361q.m16154a("WindVaneWebView", "onProgressChanged");
    }

    /* renamed from: a */
    public void mo44020a(WebView webView, int i) {
        C6361q.m16154a("WindVaneWebView", "readyState");
    }

    /* renamed from: c */
    public void mo44063c(WebView webView, int i) {
        C6361q.m16154a("WindVaneWebView", "loadingResourceStatus");
    }
}
