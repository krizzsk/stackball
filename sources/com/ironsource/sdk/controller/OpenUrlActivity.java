package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.sdk.p146d.C5980b;
import com.ironsource.sdk.utils.C6059b;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.List;

public class OpenUrlActivity extends Activity {

    /* renamed from: a */
    private static final int f14268a = SDKUtils.generateViewId();

    /* renamed from: b */
    private static final int f14269b = SDKUtils.generateViewId();

    /* renamed from: c */
    private WebView f14270c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5923w f14271d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ProgressBar f14272e;

    /* renamed from: f */
    private boolean f14273f;

    /* renamed from: g */
    private RelativeLayout f14274g;

    /* renamed from: h */
    private String f14275h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Handler f14276i = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f14277j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Runnable f14278k = new Runnable() {
        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.f14277j));
        }
    };

    /* renamed from: com.ironsource.sdk.controller.OpenUrlActivity$a */
    class C5855a extends WebViewClient {
        private C5855a() {
        }

        /* synthetic */ C5855a(OpenUrlActivity openUrlActivity, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f14272e.setVisibility(4);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f14272e.setVisibility(0);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.m14955e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> b = C6059b.m14967a().mo42614b();
            if (!b.isEmpty()) {
                for (String contains : b) {
                    if (str.contains(contains)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.f14271d.mo42341b();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            if (e instanceof ActivityNotFoundException) {
                                sb.append("no activity to handle url");
                            } else {
                                sb.append("activity failed to open with unspecified reason");
                            }
                            if (OpenUrlActivity.this.f14271d != null) {
                                C5923w d = OpenUrlActivity.this.f14271d;
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                d.mo42342b(C5923w.m14639b("failedToStartStoreActivity", C5923w.m14625a("errMsg", TextUtils.isEmpty(sb2) ? "activity failed to open with unspecified reason" : sb2, "url", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public void finish() {
        C5923w wVar;
        if (this.f14273f && (wVar = this.f14271d) != null) {
            wVar.mo42344e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f14270c.stopLoading();
        this.f14270c.clearHistory();
        try {
            this.f14270c.loadUrl(str);
        } catch (Throwable th) {
            Logger.m14955e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    public void onBackPressed() {
        if (this.f14270c.canGoBack()) {
            this.f14270c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m14957i("OpenUrlActivity", "onCreate()");
        try {
            this.f14271d = (C5923w) C5980b.m14743a((Context) this).f14640a.f14320a;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Bundle extras = getIntent().getExtras();
            this.f14275h = extras.getString(C5923w.f14477c);
            this.f14273f = extras.getBoolean(C5923w.f14478d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.f14277j = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                            OpenUrlActivity.this.f14276i.removeCallbacks(OpenUrlActivity.this.f14278k);
                            OpenUrlActivity.this.f14276i.postDelayed(OpenUrlActivity.this.f14278k, 500);
                        }
                    }
                });
                runOnUiThread(this.f14278k);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f14274g = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f14270c;
        if (webView != null) {
            webView.destroy();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f14277j && (i == 25 || i == 24)) {
            this.f14276i.postDelayed(this.f14278k, 500);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        C5923w wVar = this.f14271d;
        if (wVar != null) {
            wVar.mo42339a(false, "secondary");
            if (this.f14274g != null && (viewGroup = (ViewGroup) this.f14270c.getParent()) != null) {
                if (viewGroup.findViewById(f14268a) != null) {
                    viewGroup.removeView(this.f14270c);
                }
                if (viewGroup.findViewById(f14269b) != null) {
                    viewGroup.removeView(this.f14272e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f14270c == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f14270c = webView;
            webView.setId(f14268a);
            this.f14270c.getSettings().setJavaScriptEnabled(true);
            this.f14270c.setWebViewClient(new C5855a(this, (byte) 0));
            loadUrl(this.f14275h);
        }
        if (findViewById(f14268a) == null) {
            this.f14274g.addView(this.f14270c, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.f14272e == null) {
            this.f14272e = Build.VERSION.SDK_INT >= 11 ? new ProgressBar(new ContextThemeWrapper(this, 16973939)) : new ProgressBar(this);
            this.f14272e.setId(f14269b);
        }
        if (findViewById(f14269b) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f14272e.setLayoutParams(layoutParams);
            this.f14272e.setVisibility(4);
            this.f14274g.addView(this.f14272e);
        }
        C5923w wVar = this.f14271d;
        if (wVar != null) {
            wVar.mo42339a(true, "secondary");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f14277j && z) {
            runOnUiThread(this.f14278k);
        }
    }
}
