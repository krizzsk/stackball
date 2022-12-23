package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Map;

/* renamed from: com.chartboost.sdk.impl.u1 */
public class C1986u1 extends WebView {

    /* renamed from: a */
    private boolean f5102a = false;

    public C1986u1(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m4823a() {
        if (!this.f5102a) {
            this.f5102a = true;
        }
    }

    public void loadData(String str, String str2, String str3) {
        m4823a();
        super.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        m4823a();
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(String str) {
        m4823a();
        super.loadUrl(str);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        if (webChromeClient instanceof C1982t1) {
            C1982t1 t1Var = (C1982t1) webChromeClient;
        }
        super.setWebChromeClient(webChromeClient);
    }

    public void loadUrl(String str, Map<String, String> map) {
        m4823a();
        super.loadUrl(str, map);
    }
}
