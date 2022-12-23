package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;

/* renamed from: com.applovin.impl.adview.b */
class C1071b extends WebChromeClient {

    /* renamed from: a */
    private final C1505q f1908a;

    public C1071b(C1469j jVar) {
        this.f1908a = jVar.mo13139v();
    }

    public void onConsoleMessage(String str, int i, String str2) {
        C1505q qVar = this.f1908a;
        qVar.mo13280d("AdWebView", "console.log[" + i + "] :" + str);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        this.f1908a.mo13277b("AdWebView", consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message());
        return true;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        C1505q qVar = this.f1908a;
        qVar.mo13280d("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        C1505q qVar = this.f1908a;
        qVar.mo13280d("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        C1505q qVar = this.f1908a;
        qVar.mo13280d("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }
}
