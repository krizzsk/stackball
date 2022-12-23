package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.d */
/* compiled from: IWebViewListener */
public interface C6560d {
    /* renamed from: a */
    void mo44020a(WebView webView, int i);

    /* renamed from: a */
    void mo44021a(WebView webView, int i, String str, String str2);

    /* renamed from: a */
    void mo44022a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo44023a(WebView webView, String str);

    /* renamed from: a */
    void mo44060a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: b */
    void mo44061b(WebView webView, int i);

    /* renamed from: b */
    boolean mo44062b(WebView webView, String str);

    /* renamed from: c */
    void mo44063c(WebView webView, int i);
}
