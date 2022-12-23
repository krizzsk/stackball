package com.yandex.mobile.ads.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.mobile.ads.impl.C13378i5;
import com.yandex.mobile.ads.impl.yg1;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.base.f */
class C12096f extends C12123r {

    /* renamed from: com.yandex.mobile.ads.base.f$a */
    final class C12097a extends WebChromeClient {

        /* renamed from: a */
        private final WeakReference<Context> f29159a;

        C12097a(Context context) {
            this.f29159a = new WeakReference<>(context);
        }

        public void onProgressChanged(WebView webView, int i) {
            C12099c a = C12096f.this.mo64518a(this.f29159a);
            if (a != null) {
                a.mo64506a(webView, i);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.base.f$b */
    final class C12098b extends WebViewClient {

        /* renamed from: a */
        private final WeakReference<Context> f29161a;

        C12098b(Context context) {
            this.f29161a = new WeakReference<>(context);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C12099c a = C12096f.this.mo64518a(this.f29161a);
            if (a != null) {
                a.mo64509b(webView, str);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C12099c a = C12096f.this.mo64518a(this.f29161a);
            if (a != null) {
                a.mo64507a(webView, str);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (TextUtils.isEmpty(str) || (!yg1.m44322b(str) && URLUtil.isNetworkUrl(str))) {
                return false;
            }
            return yg1.m44320a(webView.getContext(), str, false);
        }
    }

    /* renamed from: com.yandex.mobile.ads.base.f$c */
    interface C12099c {
        /* renamed from: a */
        void mo64506a(WebView webView, int i);

        /* renamed from: a */
        void mo64507a(WebView webView, String str);

        /* renamed from: b */
        void mo64509b(WebView webView, String str);
    }

    public C12096f(Context context) {
        super(context);
        mo64519a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64519a(Context context) {
        setBackgroundColor(-1);
        setInitialScale(1);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setAppCacheEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        if (C13378i5.m37280a(11)) {
            getSettings().setDisplayZoomControls(false);
        }
        setScrollbarFadingEnabled(true);
        setDrawingCacheEnabled(true);
        setWebChromeClient(new C12097a(context));
        setWebViewClient(new C12098b(context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12099c mo64518a(WeakReference<Context> weakReference) {
        if (weakReference.get() instanceof C12099c) {
            return (C12099c) weakReference.get();
        }
        return null;
    }
}
