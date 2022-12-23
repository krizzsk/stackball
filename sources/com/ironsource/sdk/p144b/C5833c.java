package com.ironsource.sdk.p144b;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.sdk.p145c.C5846e;
import com.ironsource.sdk.utils.Logger;

/* renamed from: com.ironsource.sdk.b.c */
public class C5833c extends WebViewClient {

    /* renamed from: b */
    private static final String f14202b = C5833c.class.getSimpleName();

    /* renamed from: a */
    private final C5846e.C5847a f14203a;

    public C5833c(C5846e.C5847a aVar) {
        this.f14203a = aVar;
    }

    /* renamed from: a */
    private static String m14417a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        try {
            this.f14203a.mo42192a(m14417a("onReceivedError", String.valueOf(i)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f14203a.mo42192a(m14417a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str = "";
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                str = String.valueOf(webResourceResponse.getStatusCode());
            }
            this.f14203a.mo42192a(m14417a("onReceivedHttpError", str));
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            String str = f14202b;
            Logger.m14955e(str, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f14203a.mo42193b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
