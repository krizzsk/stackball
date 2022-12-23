package com.mbridge.msdk.click;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.p158b.C6072a;
import com.mbridge.msdk.p158b.C6076b;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.click.f */
/* compiled from: WebViewSpider */
public class C6110f {

    /* renamed from: a */
    public static long f15077a = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15078d = C6110f.class.getSimpleName();

    /* renamed from: b */
    boolean f15079b;

    /* renamed from: c */
    boolean f15080c;

    /* renamed from: e */
    private int f15081e = 15000;

    /* renamed from: f */
    private int f15082f = PathInterpolatorCompat.MAX_NUM_POINTS;

    /* renamed from: g */
    private Handler f15083g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private C6072a f15084h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6116a f15085i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f15086j;

    /* renamed from: k */
    private String f15087k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public WebView f15088l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f15089m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f15090n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f15091o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f15092p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f15093q;

    /* renamed from: r */
    private final Runnable f15094r = new Runnable() {
        public final void run() {
            boolean unused = C6110f.this.f15092p = true;
            int unused2 = C6110f.this.f15091o = 1;
            C6110f.m15262m(C6110f.this);
        }
    };

    /* renamed from: s */
    private final Runnable f15095s = new Runnable() {
        public final void run() {
            boolean unused = C6110f.this.f15092p = true;
            int unused2 = C6110f.this.f15091o = 2;
            C6110f.m15262m(C6110f.this);
        }
    };

    /* renamed from: com.mbridge.msdk.click.f$a */
    /* compiled from: WebViewSpider */
    interface C6116a {
        /* renamed from: a */
        void mo42868a(int i, String str, String str2, String str3);

        /* renamed from: a */
        void mo42869a(String str, boolean z, String str2);

        /* renamed from: a */
        boolean mo42870a(String str);

        /* renamed from: b */
        boolean mo42871b(String str);

        /* renamed from: c */
        boolean mo42872c(String str);
    }

    public C6110f() {
        C6072a b = C6076b.m15089a().mo42749b(C6122a.m15302b().mo42896e());
        this.f15084h = b;
        if (b == null) {
            this.f15084h = C6076b.m15089a().mo42748b();
        }
        this.f15089m = this.f15084h.mo42732u();
        this.f15081e = (int) this.f15084h.mo42737z();
        this.f15082f = (int) this.f15084h.mo42737z();
    }

    /* renamed from: a */
    public final void mo42855a(String str, String str2, Context context, String str3, String str4, C6116a aVar) {
        if (aVar != null) {
            this.f15087k = str4;
            this.f15086j = str3;
            this.f15085i = aVar;
            m15244a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    /* renamed from: a */
    public final void mo42854a(String str, String str2, Context context, String str3, C6116a aVar) {
        if (aVar != null) {
            this.f15086j = str3;
            this.f15085i = aVar;
            m15244a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    /* renamed from: a */
    private void m15244a(final String str, final String str2, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            m15245a(str, str2, context, this.f15086j);
        } else {
            this.f15083g.post(new Runnable() {
                public final void run() {
                    C6110f fVar = C6110f.this;
                    fVar.m15245a(str, str2, context, fVar.f15086j);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15245a(String str, String str2, Context context, String str3) {
        try {
            m15242a(context, str, str2);
            if (!TextUtils.isEmpty(this.f15087k)) {
                this.f15088l.getSettings().setDefaultTextEncodingName("utf-8");
                this.f15082f = 2000;
                this.f15081e = 2000;
                C6361q.m16156b(f15078d, this.f15087k);
                this.f15088l.loadDataWithBaseURL(str3, this.f15087k, "*/*", "utf-8", str3);
            } else if (this.f15089m) {
                HashMap hashMap = new HashMap();
                if (this.f15088l.getUrl() != null) {
                    hashMap.put(HttpHeaders.REFERER, this.f15088l.getUrl());
                }
                this.f15088l.loadUrl(str3, hashMap);
            } else {
                this.f15088l.loadUrl(str3);
            }
        } catch (Throwable th) {
            try {
                if (this.f15085i != null) {
                    this.f15085i.mo42868a(0, this.f15086j, th.getMessage(), this.f15090n);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m15242a(final Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.f15088l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f15088l.getSettings().setCacheMode(2);
        this.f15088l.getSettings().setLoadsImagesAutomatically(false);
        this.f15088l.setWebViewClient(new WebViewClient() {
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (C6110f.this.f15093q) {
                        int unused = C6110f.this.f15091o = 0;
                        C6110f.m15251c(C6110f.this);
                        return;
                    }
                    C6110f.this.f15080c = false;
                    if (webView.getTag() == null) {
                        webView.setTag("has_first_started");
                    } else {
                        C6110f.this.f15079b = true;
                    }
                    synchronized (C6110f.f15078d) {
                        String unused2 = C6110f.this.f15086j = str;
                        if (C6110f.this.f15085i == null || !C6110f.this.f15085i.mo42870a(str)) {
                            C6110f.m15254e(C6110f.this);
                        } else {
                            boolean unused3 = C6110f.this.f15093q = true;
                            C6110f.m15251c(C6110f.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
                if (com.mbridge.msdk.click.C6110f.m15257h(r3.f15103d) == false) goto L_0x0080;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
                r4 = new java.util.HashMap();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
                if (com.mbridge.msdk.click.C6110f.m15258i(r3.f15103d).getUrl() == null) goto L_0x0076;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
                r4.put(com.google.common.net.HttpHeaders.REFERER, com.mbridge.msdk.click.C6110f.m15258i(r3.f15103d).getUrl());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
                com.mbridge.msdk.click.C6110f.m15258i(r3.f15103d).loadUrl(r5, r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
                com.mbridge.msdk.click.C6110f.m15258i(r3.f15103d).loadUrl(r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
                return true;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean shouldOverrideUrlLoading(android.webkit.WebView r4, java.lang.String r5) {
                /*
                    r3 = this;
                    java.lang.String r4 = com.mbridge.msdk.click.C6110f.f15078d
                    monitor-enter(r4)
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    r1 = 1
                    r0.f15080c = r1     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    r0.m15253d()     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    boolean r0 = r0.f15093q     // Catch:{ all -> 0x008a }
                    if (r0 == 0) goto L_0x0023
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    r5.m15250c()     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.C6110f.m15251c(r5)     // Catch:{ all -> 0x008a }
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    return r1
                L_0x0023:
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    java.lang.String unused = r0.f15086j = r5     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f$a r0 = r0.f15085i     // Catch:{ all -> 0x008a }
                    if (r0 == 0) goto L_0x004d
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f$a r0 = r0.f15085i     // Catch:{ all -> 0x008a }
                    boolean r0 = r0.mo42871b(r5)     // Catch:{ all -> 0x008a }
                    if (r0 == 0) goto L_0x004d
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    boolean unused = r5.f15093q = r1     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    r5.m15250c()     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r5 = com.mbridge.msdk.click.C6110f.this     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.C6110f.m15251c(r5)     // Catch:{ all -> 0x008a }
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    return r1
                L_0x004d:
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    com.mbridge.msdk.click.f r4 = com.mbridge.msdk.click.C6110f.this
                    boolean r4 = r4.f15089m
                    if (r4 == 0) goto L_0x0080
                    java.util.HashMap r4 = new java.util.HashMap
                    r4.<init>()
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6110f.this
                    android.webkit.WebView r0 = r0.f15088l
                    java.lang.String r0 = r0.getUrl()
                    if (r0 == 0) goto L_0x0076
                    java.lang.String r0 = "Referer"
                    com.mbridge.msdk.click.f r2 = com.mbridge.msdk.click.C6110f.this
                    android.webkit.WebView r2 = r2.f15088l
                    java.lang.String r2 = r2.getUrl()
                    r4.put(r0, r2)
                L_0x0076:
                    com.mbridge.msdk.click.f r0 = com.mbridge.msdk.click.C6110f.this
                    android.webkit.WebView r0 = r0.f15088l
                    r0.loadUrl(r5, r4)
                    goto L_0x0089
                L_0x0080:
                    com.mbridge.msdk.click.f r4 = com.mbridge.msdk.click.C6110f.this
                    android.webkit.WebView r4 = r4.f15088l
                    r4.loadUrl(r5)
                L_0x0089:
                    return r1
                L_0x008a:
                    r5 = move-exception
                    monitor-exit(r4)     // Catch:{ all -> 0x008a }
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6110f.C61122.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
            }

            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                synchronized (C6110f.f15078d) {
                    boolean unused = C6110f.this.f15093q = true;
                    C6110f.this.m15247b();
                    C6110f.m15251c(C6110f.this);
                }
                if (C6110f.this.f15085i != null) {
                    C6110f.this.f15085i.mo42868a(i, webView.getUrl(), str, C6110f.this.f15090n);
                }
            }

            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                        new C6308c(context).mo43931a(str, str2, webView.getUrl());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        this.f15088l.setWebChromeClient(new WebChromeClient() {
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
                    try {
                        webView.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!C6110f.this.f15093q && !C6110f.this.f15080c) {
                            C6110f.m15261l(C6110f.this);
                        }
                        if (C6110f.this.f15085i != null) {
                            C6110f.this.f15085i.mo42872c(webView.getUrl());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15247b() {
        m15253d();
        m15250c();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m15250c() {
        this.f15083g.removeCallbacks(this.f15095s);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m15253d() {
        this.f15083g.removeCallbacks(this.f15094r);
    }

    /* renamed from: c */
    static /* synthetic */ void m15251c(C6110f fVar) {
        synchronized (f15078d) {
            try {
                fVar.m15247b();
                if (fVar.f15085i != null) {
                    fVar.f15085i.mo42869a(fVar.f15086j, fVar.f15092p, fVar.f15090n);
                }
            } catch (Exception e) {
                C6361q.m16158d(f15078d, e.getMessage());
            } catch (Throwable th) {
                C6361q.m16158d(f15078d, th.getMessage());
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m15254e(C6110f fVar) {
        fVar.m15250c();
        fVar.f15083g.postDelayed(fVar.f15095s, (long) fVar.f15081e);
    }

    /* renamed from: l */
    static /* synthetic */ void m15261l(C6110f fVar) {
        fVar.m15253d();
        fVar.f15083g.postDelayed(fVar.f15094r, (long) fVar.f15082f);
    }

    /* renamed from: m */
    static /* synthetic */ void m15262m(C6110f fVar) {
        synchronized (f15078d) {
            try {
                fVar.m15247b();
                fVar.f15088l.destroy();
                if (fVar.f15085i != null) {
                    fVar.f15085i.mo42869a(fVar.f15086j, fVar.f15092p, fVar.f15090n);
                }
            } catch (Exception e) {
                C6361q.m16158d(f15078d, e.getMessage());
            } catch (Throwable th) {
                C6361q.m16158d(f15078d, th.getMessage());
            }
        }
    }
}
