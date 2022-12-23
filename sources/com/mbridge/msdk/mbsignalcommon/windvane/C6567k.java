package com.mbridge.msdk.mbsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.C6361q;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.k */
/* compiled from: WindVaneWebViewChromeClient */
public final class C6567k extends WebChromeClient {

    /* renamed from: a */
    WindVaneWebView f16384a;

    /* renamed from: b */
    private C6560d f16385b;

    public C6567k(WindVaneWebView windVaneWebView) {
        this.f16384a = windVaneWebView;
    }

    /* renamed from: a */
    public final void mo44528a(C6560d dVar) {
        this.f16385b = dVar;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C6361q.m16158d("H5_ENTRY", str2 + "");
        C6559c signalCommunication = this.f16384a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.mo44513a(str3)) {
            return false;
        }
        signalCommunication.mo44514b(str2);
        jsPromptResult.confirm("");
        return true;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C6560d dVar = this.f16385b;
        if (dVar != null) {
            dVar.mo44061b(webView, i);
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
            return super.onConsoleMessage(consoleMessage);
        }
        C6559c signalCommunication = this.f16384a.getSignalCommunication();
        if (!(signalCommunication == null || consoleMessage == null)) {
            String message = consoleMessage.message();
            if (TextUtils.isEmpty(message) || !message.startsWith("mv://")) {
                return false;
            }
            C6361q.m16154a("H5_ENTRY", "onConsoleMessage: message.length() = " + message.length() + " " + message);
            if (message.contains("wv_hybrid:") && signalCommunication.mo44513a("wv_hybrid:")) {
                String substring = message.substring(0, message.lastIndexOf(" ") + 1);
                C6361q.m16154a("H5_ENTRY", "message = " + substring);
                signalCommunication.mo44514b(substring);
                return true;
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
