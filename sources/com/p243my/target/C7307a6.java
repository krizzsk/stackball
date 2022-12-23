package com.p243my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

/* renamed from: com.my.target.a6 */
public class C7307a6 extends FrameLayout {

    /* renamed from: a */
    public WebView f18315a;

    public C7307a6(Context context) {
        super(context);
        try {
            WebView webView = new WebView(m18704a(context));
            this.f18315a = webView;
            webView.clearCache(true);
            addView(this.f18315a);
        } catch (Throwable th) {
            C7374e0.m18990b("Webview cannot be initialized, Ad will not work properly " + th.getMessage());
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Context m18704a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return (i < 21 || i >= 23) ? context : context.createConfigurationContext(new Configuration());
    }

    /* renamed from: a */
    public static void m18705a(Throwable th) {
        C7374e0.m18990b("WebView fail: " + th.getMessage());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m18706c() {
        WebView webView = this.f18315a;
        if (webView != null) {
            try {
                webView.destroy();
            } catch (Throwable th) {
                m18705a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo49584a(int i) {
        WebView webView = this.f18315a;
        if (webView != null) {
            if (i <= 0) {
                try {
                    webView.destroy();
                } catch (Throwable th) {
                    m18705a(th);
                }
            } else {
                C7395f0.m19087a(new Runnable() {
                    public final void run() {
                        C7307a6.this.m18706c();
                    }
                }, i);
            }
        }
    }

    /* renamed from: a */
    public void mo49585a(String str) {
        WebView webView = this.f18315a;
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th) {
                m18705a(th);
            }
        }
    }

    /* renamed from: a */
    public void mo49586a(String str, String str2, String str3, String str4, String str5) {
        WebView webView = this.f18315a;
        if (webView != null) {
            try {
                webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
            } catch (Throwable th) {
                m18705a(th);
            }
        }
    }

    /* renamed from: a */
    public boolean mo49587a() {
        try {
            WebView webView = this.f18315a;
            return webView != null && webView.canGoBack();
        } catch (Throwable th) {
            m18705a(th);
            return false;
        }
    }

    /* renamed from: b */
    public void mo49588b() {
        WebView webView = this.f18315a;
        if (webView != null) {
            try {
                webView.goBack();
            } catch (Throwable th) {
                m18705a(th);
            }
        }
    }

    /* renamed from: d */
    public void mo49589d() {
        WebView webView = this.f18315a;
        if (webView != null) {
            try {
                webView.onPause();
            } catch (Throwable th) {
                m18705a(th);
            }
        }
    }

    /* renamed from: e */
    public void mo49590e() {
        WebView webView = this.f18315a;
        if (webView != null) {
            try {
                webView.onResume();
            } catch (Throwable th) {
                m18705a(th);
            }
        }
    }

    /* renamed from: f */
    public void mo49591f() {
        WebView webView = this.f18315a;
        if (webView != null) {
            try {
                webView.stopLoading();
            } catch (Throwable th) {
                m18705a(th);
            }
        }
    }

    public WebSettings getSettings() {
        try {
            WebView webView = this.f18315a;
            if (webView == null) {
                return null;
            }
            return webView.getSettings();
        } catch (Throwable th) {
            m18705a(th);
            return null;
        }
    }

    public String getUrl() {
        try {
            WebView webView = this.f18315a;
            if (webView == null) {
                return null;
            }
            return webView.getUrl();
        } catch (Throwable th) {
            m18705a(th);
            return null;
        }
    }

    public WebView getWebView() {
        return this.f18315a;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WebView webView = this.f18315a;
        if (webView != null) {
            webView.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        WebView webView = this.f18315a;
        if (webView != null) {
            webView.measure(i, i2);
            setMeasuredDimension(this.f18315a.getMeasuredWidth(), this.f18315a.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public void setHorizontalScrollBarEnabled(boolean z) {
        WebView webView = this.f18315a;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(z);
        }
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        WebView webView = this.f18315a;
        if (webView != null) {
            webView.setOnTouchListener(onTouchListener);
        }
    }

    public void setScrollContainer(boolean z) {
        WebView webView = this.f18315a;
        if (webView != null) {
            webView.setScrollContainer(z);
        }
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        WebView webView = this.f18315a;
        if (webView != null) {
            webView.setVerticalScrollBarEnabled(z);
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        WebView webView = this.f18315a;
        if (webView != null) {
            try {
                webView.setWebChromeClient(webChromeClient);
            } catch (Throwable th) {
                m18705a(th);
            }
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        WebView webView = this.f18315a;
        if (webView != null) {
            try {
                webView.setWebViewClient(webViewClient);
            } catch (Throwable th) {
                m18705a(th);
            }
        }
    }
}
