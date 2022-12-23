package com.mbridge.msdk.mbsignalcommon.base;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.lang.reflect.Method;

public class BaseWebView extends WebView {

    /* renamed from: a */
    protected Context f16295a;
    public C6535b mWebViewClient;

    public BaseWebView(Context context) {
        super(context);
        this.f16295a = context;
        mo44420a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16295a = context;
        mo44420a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16295a = context;
        mo44420a();
    }

    public void setFilter(C6534a aVar) {
        C6535b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.mo44426a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44420a() {
        if (this.mWebViewClient == null) {
            C6535b bVar = new C6535b();
            this.mWebViewClient = bVar;
            setWebViewClient(bVar);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(CacheDataSink.DEFAULT_FRAGMENT_SIZE);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(false);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            settings.setAllowUniversalAccessFromFileURLs(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                settings.setMixedContentMode(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 5) {
            settings.setDatabaseEnabled(true);
            String path = this.f16295a.getDir("database", 0).getPath();
            settings.setDatabasePath(path);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(path);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            Class<WebSettings> cls = WebSettings.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setDisplayZoomControls", new Class[]{Boolean.TYPE});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(settings, new Object[]{false});
            } catch (Exception unused) {
            }
        }
    }

    public void setTransparent() {
        setLayerType(1, (Paint) null);
        setBackgroundColor(0);
    }

    public void reload() {
        super.reload();
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C6535b) {
            this.mWebViewClient = (C6535b) webViewClient;
        }
    }
}
