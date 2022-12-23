package com.mbridge.msdk.mbsignalcommon.base;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.mbsignalcommon.windvane.C6560d;

/* renamed from: com.mbridge.msdk.mbsignalcommon.base.b */
/* compiled from: BaseWebViewClient */
public class C6535b extends WebViewClient {

    /* renamed from: a */
    private C6534a f16296a;

    /* renamed from: b */
    private C6560d f16297b;

    /* renamed from: a */
    public final void mo44426a(C6534a aVar) {
        this.f16296a = aVar;
    }

    /* renamed from: b */
    public final C6534a mo44428b() {
        return this.f16296a;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C6534a aVar = this.f16296a;
        if (aVar != null && aVar.mo44425a(str)) {
            return true;
        }
        C6560d dVar = this.f16297b;
        if (dVar != null) {
            dVar.mo44062b(webView, str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C6560d dVar = this.f16297b;
        if (dVar != null) {
            dVar.mo44021a(webView, i, str, str2);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C6560d dVar = this.f16297b;
        if (dVar != null) {
            dVar.mo44022a(webView, sslErrorHandler, sslError);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C6560d dVar = this.f16297b;
        if (dVar != null) {
            dVar.mo44023a(webView, str);
        }
    }

    /* renamed from: a */
    public final void mo44427a(C6560d dVar) {
        this.f16297b = dVar;
    }
}
