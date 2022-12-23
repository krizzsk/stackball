package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.yandex.mobile.ads.base.C12123r;
import com.yandex.mobile.ads.base.C12130v;
import com.yandex.mobile.ads.impl.qo1;

public abstract class cy0 extends C12123r implements hb0, C12130v.C12132b, qo1.C14402a {

    /* renamed from: j */
    private static boolean f32290j = false;

    /* renamed from: b */
    private final qo1 f32291b = new qo1();

    /* renamed from: c */
    private final x81 f32292c = new x81();

    /* renamed from: d */
    private final C12130v f32293d = C12130v.m31590a();

    /* renamed from: e */
    private final gh1 f32294e = new gh1();

    /* renamed from: f */
    protected jb0 f32295f;

    /* renamed from: g */
    protected ib0 f32296g;

    /* renamed from: h */
    private boolean f32297h;

    /* renamed from: i */
    private boolean f32298i;

    /* renamed from: com.yandex.mobile.ads.impl.cy0$a */
    class C12842a implements Runnable {
        C12842a() {
        }

        public void run() {
            cy0.this.mo64387h();
        }
    }

    public cy0(Context context) {
        super(context.getApplicationContext());
        mo66361b(context);
        if (!f32290j) {
            m34927a(getContext());
            f32290j = true;
        }
    }

    /* renamed from: a */
    public void mo65843a(int i) {
        ib0 ib0 = this.f32296g;
        if (ib0 != null) {
            ((C13683k6) ib0).mo68135a(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo66361b(Context context) {
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setMinimumFontSize(1);
        settings.setMinimumLogicalFontSize(1);
        if (C13378i5.m37280a(21)) {
            settings.setMixedContentMode(0);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        WebSettings settings2 = getSettings();
        d71 a = l71.m38631c().mo68362a(context);
        if (a != null && a.mo66468p()) {
            settings2.setUserAgentString(this.f32294e.mo67308a(context));
        }
        setWebViewClient(new gb0(this));
        setWebChromeClient(new bb0());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo64386c() {
        return "" + "<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n" + eq1.f33045b;
    }

    /* renamed from: d */
    public void mo64617d() {
        this.f32295f = null;
        super.mo64617d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo64387h();

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32298i = true;
        this.f32293d.mo64670a(this, getContext());
        m34928a(this.f32291b.mo69624a(this));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f32298i = false;
        m34928a(this.f32291b.mo69624a(this));
        this.f32293d.mo64671b(this, getContext());
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m34928a(this.f32291b.mo69624a(this));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m34928a(this.f32291b.mo69624a(this));
    }

    public void setHtmlWebViewErrorListener(ib0 ib0) {
        this.f32296g = ib0;
    }

    public void setHtmlWebViewListener(jb0 jb0) {
        this.f32295f = jb0;
    }

    /* renamed from: a */
    public void mo65844a(Context context, String str) {
        jb0 jb0 = this.f32295f;
        if (jb0 != null) {
            jb0.mo66857a(str);
        }
    }

    /* renamed from: a */
    private void m34927a(Context context) {
        if (Build.VERSION.SDK_INT == 19) {
            WebView webView = new WebView(context.getApplicationContext());
            webView.setBackgroundColor(0);
            webView.loadDataWithBaseURL((String) null, "", WebRequest.CONTENT_TYPE_HTML, "UTF-8", (String) null);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.width = 1;
            layoutParams.height = 1;
            layoutParams.type = 2005;
            layoutParams.flags = 16777240;
            layoutParams.format = -2;
            layoutParams.gravity = 8388659;
            try {
                ((WindowManager) context.getSystemService("window")).addView(webView, layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo65845b() {
        this.f32292c.mo70847a(new C12842a());
    }

    /* renamed from: a */
    public boolean mo66360a() {
        return this.f32298i;
    }

    /* renamed from: a */
    public void mo64403a(Intent intent) {
        m34928a(!"android.intent.action.SCREEN_OFF".equals(intent.getAction()) && this.f32291b.mo69624a(this) && this.f32293d.mo64672b(getContext()));
    }

    /* renamed from: a */
    private void m34928a(boolean z) {
        if (this.f32297h != z) {
            this.f32297h = z;
            jb0 jb0 = this.f32295f;
            if (jb0 != null) {
                jb0.mo66858a(z);
            }
        }
    }
}
