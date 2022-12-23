package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;

public class BrowserView extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f15811a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ProgressBar f15812b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WebView f15813c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ToolBar f15814d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6378a f15815e;

    /* renamed from: f */
    private CampaignEx f15816f;

    /* renamed from: com.mbridge.msdk.foundation.webview.BrowserView$a */
    public interface C6378a {
        /* renamed from: a */
        void mo42645a();

        /* renamed from: a */
        void mo42646a(WebView webView, String str, Bitmap bitmap);

        /* renamed from: a */
        boolean mo42647a(WebView webView, String str);
    }

    public BrowserView(Context context, CampaignEx campaignEx) {
        super(context);
        this.f15816f = campaignEx;
        init();
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void setListener(C6378a aVar) {
        this.f15815e = aVar;
    }

    public void loadUrl(String str) {
        WebView webView = this.f15813c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setWebView(WebView webView) {
        this.f15813c = webView;
    }

    public void init() {
        WebChromeClient webChromeClient;
        setOrientation(1);
        setGravity(17);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f15812b = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.f15813c == null) {
                WebView webView = new WebView(getContext());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setCacheMode(-1);
                webView.setDownloadListener(new MBDownloadListener(this.f15816f));
                webView.setWebViewClient(new WebViewClient() {
                    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        C6361q.m16156b("BrowserView", "开始! = " + str);
                        String unused = BrowserView.this.f15811a = str;
                        if (BrowserView.this.f15815e != null) {
                            BrowserView.this.f15815e.mo42646a(webView, str, bitmap);
                        }
                        BrowserView.this.f15812b.setVisible(true);
                        BrowserView.this.f15812b.setProgressState(5);
                    }

                    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        C6361q.m16156b("BrowserView", "js大跳! = " + str);
                        BrowserView.this.f15814d.getItem("backward").setEnabled(true);
                        BrowserView.this.f15814d.getItem("forward").setEnabled(false);
                        if (BrowserView.this.f15815e != null) {
                            BrowserView.this.f15815e.mo42647a(webView, str);
                        }
                        return false;
                    }
                });
                if (C6349m.m16108g() <= 10) {
                    webChromeClient = new WebChromeClient() {
                        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                            return true;
                        }

                        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                            return true;
                        }

                        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                            return true;
                        }

                        public final void onProgressChanged(WebView webView, int i) {
                            if (i == 100) {
                                BrowserView.this.f15812b.setProgressState(7);
                                new Handler().postDelayed(new Runnable() {
                                    public final void run() {
                                        BrowserView.this.f15812b.setVisible(false);
                                    }
                                }, 200);
                            }
                        }
                    };
                } else {
                    webChromeClient = new WebChromeClient() {
                        public final void onProgressChanged(WebView webView, int i) {
                            if (i == 100) {
                                BrowserView.this.f15812b.setProgressState(7);
                                new Handler().postDelayed(new Runnable() {
                                    public final void run() {
                                        BrowserView.this.f15812b.setVisible(false);
                                    }
                                }, 200);
                            }
                        }
                    };
                }
                webView.setWebChromeClient(webChromeClient);
                this.f15813c = webView;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.f15813c.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            C6361q.m16155a("BrowserView", "webview is error", th);
        }
        this.f15814d = new ToolBar(getContext());
        this.f15814d.setLayoutParams(new LinearLayout.LayoutParams(-1, C6366u.m16203b(getContext(), 40.0f)));
        this.f15814d.setBackgroundColor(-1);
        addView(this.f15812b);
        WebView webView2 = this.f15813c;
        if (webView2 != null) {
            addView(webView2);
        }
        addView(this.f15814d);
        this.f15812b.initResource(true);
        this.f15814d.getItem("backward").setEnabled(false);
        this.f15814d.getItem("forward").setEnabled(false);
        this.f15814d.setOnItemClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (BrowserView.this.f15813c != null) {
                    BrowserView.this.f15813c.stopLoading();
                }
                String str = (String) view.getTag();
                boolean z = false;
                if (TextUtils.equals(str, "backward")) {
                    BrowserView.this.f15814d.getItem("forward").setEnabled(true);
                    if (BrowserView.this.f15813c != null && BrowserView.this.f15813c.canGoBack()) {
                        BrowserView.this.f15813c.goBack();
                    }
                    View item = BrowserView.this.f15814d.getItem("backward");
                    if (BrowserView.this.f15813c != null && BrowserView.this.f15813c.canGoBack()) {
                        z = true;
                    }
                    item.setEnabled(z);
                } else if (TextUtils.equals(str, "forward")) {
                    BrowserView.this.f15814d.getItem("backward").setEnabled(true);
                    if (BrowserView.this.f15813c != null && BrowserView.this.f15813c.canGoForward()) {
                        BrowserView.this.f15813c.goForward();
                    }
                    View item2 = BrowserView.this.f15814d.getItem("forward");
                    if (BrowserView.this.f15813c != null && BrowserView.this.f15813c.canGoForward()) {
                        z = true;
                    }
                    item2.setEnabled(z);
                } else if (TextUtils.equals(str, "refresh")) {
                    BrowserView.this.f15814d.getItem("backward").setEnabled(BrowserView.this.f15813c != null && BrowserView.this.f15813c.canGoBack());
                    View item3 = BrowserView.this.f15814d.getItem("forward");
                    if (BrowserView.this.f15813c != null && BrowserView.this.f15813c.canGoForward()) {
                        z = true;
                    }
                    item3.setEnabled(z);
                    if (BrowserView.this.f15813c != null) {
                        BrowserView.this.f15813c.loadUrl(BrowserView.this.f15811a);
                    }
                } else if (TextUtils.equals(str, "exits") && BrowserView.this.f15815e != null) {
                    BrowserView.this.f15815e.mo42645a();
                }
            }
        });
    }

    public static final class MBDownloadListener implements DownloadListener {
        private CampaignEx campaignEx;
        private String title;

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }

        public MBDownloadListener(CampaignEx campaignEx2) {
            this.campaignEx = campaignEx2;
        }

        public MBDownloadListener() {
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    public void destroy() {
        WebView webView = this.f15813c;
        if (webView != null) {
            webView.stopLoading();
            this.f15813c.setWebViewClient((WebViewClient) null);
            this.f15813c.destroy();
            removeAllViews();
        }
    }
}
