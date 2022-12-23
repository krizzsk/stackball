package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C2677R;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p049h.C2972o;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3631al;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3685u;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.URL;
import java.net.URLDecoder;

public class InneractiveInternalBrowserActivity extends Activity {
    public static final String URL_EXTRA = "extra_url";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static InternalBrowserListener f6388a;

    /* renamed from: b */
    private LinearLayout f6389b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WebView f6390c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageButton f6391d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageButton f6392e;

    /* renamed from: f */
    private ImageButton f6393f;

    /* renamed from: g */
    private ImageButton f6394g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f6395h = false;

    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f6388a = internalBrowserListener;
    }

    public void onCreate(Bundle bundle) {
        InternalBrowserListener internalBrowserListener;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        super.onCreate(bundle);
        try {
            this.f6389b = new LinearLayout(this);
            this.f6389b.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.f6389b.setOrientation(1);
            this.f6389b.setContentDescription("IAInternalBrowserView");
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f6389b.addView(relativeLayout);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setId(1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C3657l.m9119b(getResources().getInteger(C2677R.integer.ia_ib_toolbar_height_dp)));
            layoutParams.addRule(12);
            linearLayout.setLayoutParams(layoutParams);
            C3657l.m9112a((View) linearLayout, C3657l.m9121c(C2677R.C2678drawable.ia_ib_background));
            relativeLayout.addView(linearLayout);
            this.f6391d = m5881a(C3657l.m9121c(C2677R.C2678drawable.ia_ib_left_arrow));
            this.f6392e = m5881a(C3657l.m9121c(C2677R.C2678drawable.ia_ib_right_arrow));
            this.f6393f = m5881a(C3657l.m9121c(C2677R.C2678drawable.ia_ib_refresh));
            this.f6394g = m5881a(C3657l.m9121c(C2677R.C2678drawable.ia_ib_close));
            linearLayout.addView(this.f6391d);
            linearLayout.addView(this.f6392e);
            linearLayout.addView(this.f6393f);
            linearLayout.addView(this.f6394g);
            WebView webView = new WebView(this);
            this.f6390c = webView;
            webView.setId(C2677R.C2679id.inneractive_webview_internal_browser);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(2, 1);
            this.f6390c.setLayoutParams(layoutParams2);
            relativeLayout.addView(this.f6390c);
            setContentView(this.f6389b);
            Intent intent = getIntent();
            WebSettings settings = this.f6390c.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.f6390c);
            this.f6390c.setWebViewClient(new WebViewClient() {
                public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    C2972o.m6654a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", (InneractiveAdRequest) null, (C3018e) null);
                    InneractiveInternalBrowserActivity.this.finish();
                    return true;
                }

                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    IAlog.m9036d("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i), str, str2);
                }

                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null) {
                        return false;
                    }
                    if (C3631al.m9052a(str)) {
                        InneractiveInternalBrowserActivity.this.f6390c.loadUrl("chrome://crash");
                        return true;
                    } else if (str == null) {
                        return false;
                    } else {
                        C3685u.C3686a a = C3685u.m9176a(InneractiveInternalBrowserActivity.this.getApplicationContext(), str, true, C3685u.C3689d.f9986a);
                        if (a.f9977a == C3685u.C3688c.FAILED) {
                            return !str.startsWith("http");
                        }
                        if (InneractiveInternalBrowserActivity.f6388a != null) {
                            InneractiveInternalBrowserActivity.f6388a.onApplicationInBackground();
                        }
                        if (!InneractiveInternalBrowserActivity.this.f6395h) {
                            boolean unused = InneractiveInternalBrowserActivity.this.f6395h = true;
                            C2968n.C2969a aVar = new C2968n.C2969a(C2967m.FYBER_SUCCESS_CLICK, (InneractiveAdRequest) null, (C3018e) null);
                            aVar.mo18433a(new C2968n.C2971b().mo18438a("url", str).mo18438a("opened_from", a.f9977a.toString()).mo18438a("opened_by", "internal_browser"));
                            aVar.mo18436b((String) null);
                        }
                        InneractiveInternalBrowserActivity.this.finish();
                        return true;
                    }
                }

                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    InneractiveInternalBrowserActivity.this.f6392e.setImageDrawable(C3657l.m9121c(C2677R.C2678drawable.ia_ib_unright_arrow));
                }

                public final void onPageFinished(WebView webView, String str) {
                    Drawable drawable;
                    Drawable drawable2;
                    super.onPageFinished(webView, str);
                    if (webView.canGoBack()) {
                        drawable = C3657l.m9121c(C2677R.C2678drawable.ia_ib_left_arrow);
                    } else {
                        drawable = C3657l.m9121c(C2677R.C2678drawable.ia_ib_unleft_arrow);
                    }
                    InneractiveInternalBrowserActivity.this.f6391d.setImageDrawable(drawable);
                    if (webView.canGoForward()) {
                        drawable2 = C3657l.m9121c(C2677R.C2678drawable.ia_ib_right_arrow);
                    } else {
                        drawable2 = C3657l.m9121c(C2677R.C2678drawable.ia_ib_unright_arrow);
                    }
                    InneractiveInternalBrowserActivity.this.f6392e.setImageDrawable(drawable2);
                }
            });
            this.f6390c.setWebChromeClient(new WebChromeClient() {
                public final void onProgressChanged(WebView webView, int i) {
                    Activity activity = (Activity) webView.getContext();
                    activity.setTitle("Page is Loading...");
                    activity.setProgress(i * 100);
                    if (i == 100) {
                        activity.setTitle(webView.getUrl());
                    }
                }
            });
            String stringExtra = intent.getStringExtra(URL_EXTRA);
            if (!C3685u.m9181a(stringExtra)) {
                this.f6390c.loadUrl(stringExtra);
            } else if (C3685u.m9184b(stringExtra)) {
                try {
                    String decode = URLDecoder.decode(stringExtra, "utf-8");
                    new URL(decode);
                    try {
                        this.f6390c.loadUrl(decode);
                    } catch (Exception unused) {
                        stringExtra = decode;
                    }
                } catch (Exception unused2) {
                    IAlog.m9036d("Failed to open Url: %s", stringExtra);
                    finish();
                    this.f6391d.setBackgroundColor(0);
                    this.f6391d.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            if (InneractiveInternalBrowserActivity.this.f6390c.canGoBack()) {
                                InneractiveInternalBrowserActivity.this.f6390c.goBack();
                            }
                        }
                    });
                    this.f6391d.setContentDescription("IABackButton");
                    this.f6392e.setBackgroundColor(0);
                    this.f6392e.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            if (InneractiveInternalBrowserActivity.this.f6390c.canGoForward()) {
                                InneractiveInternalBrowserActivity.this.f6390c.goForward();
                            }
                        }
                    });
                    this.f6392e.setContentDescription("IAForwardButton");
                    this.f6393f.setBackgroundColor(0);
                    this.f6393f.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            InneractiveInternalBrowserActivity.this.f6390c.reload();
                            IAlog.m9030a(IAlog.f9871b, "%s %s", "AD_INTERNAL_BROWSER_REFRESH", InneractiveInternalBrowserActivity.this.f6390c.getUrl());
                        }
                    });
                    this.f6393f.setContentDescription("IARefreshButton");
                    this.f6394g.setBackgroundColor(0);
                    this.f6394g.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            InneractiveInternalBrowserActivity.this.finish();
                        }
                    });
                    this.f6394g.setContentDescription("IACloseButton");
                    C3657l.m9129t();
                    C3657l.m9130u();
                }
            } else {
                if (m5883a(stringExtra) && (internalBrowserListener = f6388a) != null) {
                    internalBrowserListener.onApplicationInBackground();
                }
                finish();
            }
            this.f6391d.setBackgroundColor(0);
            this.f6391d.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (InneractiveInternalBrowserActivity.this.f6390c.canGoBack()) {
                        InneractiveInternalBrowserActivity.this.f6390c.goBack();
                    }
                }
            });
            this.f6391d.setContentDescription("IABackButton");
            this.f6392e.setBackgroundColor(0);
            this.f6392e.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (InneractiveInternalBrowserActivity.this.f6390c.canGoForward()) {
                        InneractiveInternalBrowserActivity.this.f6390c.goForward();
                    }
                }
            });
            this.f6392e.setContentDescription("IAForwardButton");
            this.f6393f.setBackgroundColor(0);
            this.f6393f.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    InneractiveInternalBrowserActivity.this.f6390c.reload();
                    IAlog.m9030a(IAlog.f9871b, "%s %s", "AD_INTERNAL_BROWSER_REFRESH", InneractiveInternalBrowserActivity.this.f6390c.getUrl());
                }
            });
            this.f6393f.setContentDescription("IARefreshButton");
            this.f6394g.setBackgroundColor(0);
            this.f6394g.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    InneractiveInternalBrowserActivity.this.finish();
                }
            });
            this.f6394g.setContentDescription("IACloseButton");
            C3657l.m9129t();
            C3657l.m9130u();
        } catch (Exception unused3) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C3657l.m9131v();
        this.f6395h = false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C3657l.m9130u();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        LinearLayout linearLayout = this.f6389b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f6390c;
        if (webView != null) {
            webView.destroy();
            this.f6390c = null;
        }
        super.onDestroy();
    }

    public void finish() {
        InternalBrowserListener internalBrowserListener = f6388a;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* renamed from: a */
    private boolean m5883a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        try {
            startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            IAlog.m9036d("Failed to start activity for %s. Please ensure that your phone can handle this intent.", str);
            return false;
        }
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        C3657l.m9113a(webView);
    }

    /* renamed from: a */
    private ImageButton m5881a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C3657l.m9119b(getResources().getInteger(C2677R.integer.ia_ib_button_size_dp)), C3657l.m9119b(getResources().getInteger(C2677R.integer.ia_ib_button_size_dp)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
