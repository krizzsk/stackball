package com.fyber.inneractive.sdk.p056m;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.m.e */
final class C3057e extends WebChromeClient {
    C3057e() {
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IAlog.m9033a("%s onConsoleMessage: %s", "IAwebChromeClient", consoleMessage.message());
        if (IAlog.f9870a >= IAlog.f9871b) {
            IAlog.m9030a(IAlog.f9871b, consoleMessage.message().replaceAll("%", "%%"), "VPAID");
        }
        return true;
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m9033a("%sonJsAlert: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m9033a("%sonJsConfirm: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IAlog.m9033a("%sonJsPrompt: %s", "IAwebChromeClient", str2);
        jsPromptResult.cancel();
        return true;
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.m9033a("%sonJsBeforeUnload: %s", "IAwebChromeClient", str2);
        jsResult.confirm();
        return true;
    }
}
