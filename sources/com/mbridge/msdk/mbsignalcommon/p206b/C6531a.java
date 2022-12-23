package com.mbridge.msdk.mbsignalcommon.p206b;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.windvane.C6558b;

/* renamed from: com.mbridge.msdk.mbsignalcommon.b.a */
/* compiled from: DefaultRVWebViewListener */
public class C6531a implements C6558b {
    /* renamed from: a */
    public void mo44406a(Object obj) {
        C6361q.m16154a("RVWindVaneWebView", "getEndScreenInfo");
    }

    /* renamed from: a */
    public void mo44405a(WebView webView, String str, String str2, int i, int i2) {
        C6361q.m16154a("RVWindVaneWebView", "loadAds");
    }

    /* renamed from: a */
    public void mo44407a(Object obj, String str) {
        C6361q.m16154a("RVWindVaneWebView", "operateComponent");
    }

    /* renamed from: a */
    public final void mo44060a(WebView webView, String str, Bitmap bitmap) {
        C6361q.m16154a("RVWindVaneWebView", "onPageStarted");
    }

    /* renamed from: b */
    public final boolean mo44062b(WebView webView, String str) {
        C6361q.m16154a("RVWindVaneWebView", "shouldOverrideUrlLoading");
        return true;
    }

    /* renamed from: a */
    public void mo44021a(WebView webView, int i, String str, String str2) {
        C6361q.m16154a("RVWindVaneWebView", "onReceivedError");
    }

    /* renamed from: a */
    public void mo44022a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C6361q.m16154a("RVWindVaneWebView", "onReceivedSslError");
    }

    /* renamed from: a */
    public void mo44023a(WebView webView, String str) {
        C6361q.m16154a("RVWindVaneWebView", "onPageFinished");
    }

    /* renamed from: b */
    public final void mo44061b(WebView webView, int i) {
        C6361q.m16154a("RVWindVaneWebView", "onProgressChanged");
    }

    /* renamed from: a */
    public void mo44020a(WebView webView, int i) {
        C6361q.m16154a("RVWindVaneWebView", "readyState");
    }

    /* renamed from: c */
    public final void mo44063c(WebView webView, int i) {
        C6361q.m16154a("RVWindVaneWebView", "loadingResourceStatus");
    }
}
