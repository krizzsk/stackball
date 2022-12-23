package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.p008a.C1005b;
import com.applovin.impl.p008a.C1008e;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1345a;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1382d;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.adview.c */
public class C1072c extends C1085g {

    /* renamed from: c */
    private static C1072c f1909c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static WebView f1910d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile String f1911e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile Map<String, String> f1912f;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1505q f1913a;

    /* renamed from: b */
    private final C1469j f1914b;

    /* renamed from: g */
    private C1382d f1915g;

    /* renamed from: h */
    private C1355g f1916h;

    /* renamed from: i */
    private boolean f1917i;

    /* renamed from: j */
    private boolean f1918j;

    /* renamed from: k */
    private final boolean f1919k;

    static {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                WebView unused = C1072c.f1910d = new WebView(C1469j.m3042E());
            }
        });
    }

    C1072c(C1079d dVar, C1469j jVar, Context context) {
        this(dVar, jVar, context, false);
    }

    C1072c(C1079d dVar, C1469j jVar, Context context, boolean z) {
        super(context);
        if (jVar != null) {
            this.f1914b = jVar;
            this.f1913a = jVar.mo13139v();
            this.f1919k = z;
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            setWebViewClient(dVar);
            setWebChromeClient(new C1071b(jVar));
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (C1519g.m3436g()) {
                setWebViewRenderProcessClient(new C1081e(jVar).mo11916a());
            }
            setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (view.hasFocus()) {
                        return false;
                    }
                    view.requestFocus();
                    return false;
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    C1072c.this.f1913a.mo13277b("AdWebView", "Received a LongClick event.");
                    return true;
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* renamed from: a */
    public static C1072c m1568a(AppLovinAdSize appLovinAdSize, C1079d dVar, C1469j jVar, Context context) {
        if (!((Boolean) jVar.mo13088a(C1369c.f3121fc)).booleanValue() || appLovinAdSize != AppLovinAdSize.INTERSTITIAL) {
            return new C1072c(dVar, jVar, context);
        }
        C1072c cVar = f1909c;
        if (cVar == null) {
            f1909c = new C1072c(dVar, jVar, context.getApplicationContext(), true);
        } else {
            cVar.setWebViewClient(dVar);
        }
        return f1909c;
    }

    /* renamed from: a */
    public static String m1570a(long j) {
        if (f1911e != null || j <= 0) {
            return f1911e;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    String unused = C1072c.f1911e = C1072c.f1910d.getSettings().getUserAgentString();
                } catch (Throwable unused2) {
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
        }
        return f1911e;
    }

    /* renamed from: a */
    private String m1571a(String str, String str2) {
        if (C1553o.m3554b(str)) {
            return C1557r.m3591a(this.f1918j, str).replace("{SOURCE}", str2);
        }
        return null;
    }

    /* renamed from: a */
    private void m1573a(String str, String str2, String str3, C1469j jVar) {
        String a = m1571a(str3, str);
        if (C1553o.m3554b(a)) {
            C1505q qVar = this.f1913a;
            qVar.mo13277b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a);
            loadDataWithBaseURL(str2, a, WebRequest.CONTENT_TYPE_HTML, (String) null, "");
            return;
        }
        String a2 = m1571a((String) jVar.mo13088a(C1369c.f3071eE), str);
        if (C1553o.m3554b(a2)) {
            C1505q qVar2 = this.f1913a;
            qVar2.mo13277b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a2);
            loadDataWithBaseURL(str2, a2, WebRequest.CONTENT_TYPE_HTML, (String) null, "");
            return;
        }
        C1505q qVar3 = this.f1913a;
        qVar3.mo13277b("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        loadUrl(str);
    }

    /* renamed from: b */
    public static Map<String, String> m1576b(long j) {
        if (f1912f != null || j <= 0) {
            return f1912f;
        }
        if (C1519g.m3433d()) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    C1072c.f1910d.setWebViewClient(new WebViewClient() {
                        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                            HashMap hashMap = new HashMap();
                            for (Map.Entry next : webResourceRequest.getRequestHeaders().entrySet()) {
                                hashMap.put("AppLovin-WebView-" + ((String) next.getKey()), next.getValue());
                            }
                            Map unused = C1072c.f1912f = hashMap;
                            countDownLatch.countDown();
                            return super.shouldInterceptRequest(webView, webResourceRequest);
                        }
                    });
                    C1072c.f1910d.loadUrl("https://blank");
                }
            });
            try {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        return f1912f;
    }

    /* renamed from: b */
    private void m1577b(C1355g gVar) {
        Boolean n;
        Integer a;
        if (((Boolean) this.f1914b.mo13088a(C1369c.f3086eT)).booleanValue() || gVar.mo12773aC()) {
            loadUrl("about:blank");
        }
        if (C1519g.m3431b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(gVar.mo12772aB());
        }
        if (C1519g.m3432c() && gVar.mo12775aE()) {
            setWebContentsDebuggingEnabled(true);
        }
        C1155v aF = gVar.mo12776aF();
        if (aF != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b = aF.mo12071b();
            if (b != null) {
                settings.setPluginState(b);
            }
            Boolean c = aF.mo12072c();
            if (c != null) {
                settings.setAllowFileAccess(c.booleanValue());
            }
            Boolean d = aF.mo12073d();
            if (d != null) {
                settings.setLoadWithOverviewMode(d.booleanValue());
            }
            Boolean e = aF.mo12074e();
            if (e != null) {
                settings.setUseWideViewPort(e.booleanValue());
            }
            Boolean f = aF.mo12075f();
            if (f != null) {
                settings.setAllowContentAccess(f.booleanValue());
            }
            Boolean g = aF.mo12076g();
            if (g != null) {
                settings.setBuiltInZoomControls(g.booleanValue());
            }
            Boolean h = aF.mo12077h();
            if (h != null) {
                settings.setDisplayZoomControls(h.booleanValue());
            }
            Boolean i = aF.mo12078i();
            if (i != null) {
                settings.setSaveFormData(i.booleanValue());
            }
            Boolean j = aF.mo12079j();
            if (j != null) {
                settings.setGeolocationEnabled(j.booleanValue());
            }
            Boolean k = aF.mo12080k();
            if (k != null) {
                settings.setNeedInitialFocus(k.booleanValue());
            }
            Boolean l = aF.mo12081l();
            if (l != null) {
                settings.setAllowFileAccessFromFileURLs(l.booleanValue());
            }
            Boolean m = aF.mo12082m();
            if (m != null) {
                settings.setAllowUniversalAccessFromFileURLs(m.booleanValue());
            }
            if (C1519g.m3433d() && (a = aF.mo12070a()) != null) {
                settings.setMixedContentMode(a.intValue());
            }
            if (C1519g.m3434e() && (n = aF.mo12083n()) != null) {
                settings.setOffscreenPreRaster(n.booleanValue());
            }
        }
    }

    public static Map<String, String> getHttpHeaders() {
        return f1912f;
    }

    /* renamed from: a */
    public void mo11888a(C1355g gVar) {
        C1505q qVar;
        String str;
        C1505q qVar2;
        String str2;
        String str3;
        String aD;
        String str4;
        String str5;
        String str6;
        String aD2;
        C1469j jVar;
        if (!this.f1917i) {
            this.f1916h = gVar;
            try {
                m1577b(gVar);
                if (gVar.mo12798al()) {
                    setVisibility(0);
                }
                if (gVar instanceof C1345a) {
                    loadDataWithBaseURL(gVar.mo12774aD(), C1557r.m3591a(this.f1918j, ((C1345a) gVar).mo11663b()), WebRequest.CONTENT_TYPE_HTML, (String) null, "");
                    qVar = this.f1913a;
                    str = "AppLovinAd rendered";
                } else if (gVar instanceof C1000a) {
                    C1000a aVar = (C1000a) gVar;
                    C1005b m = aVar.mo11678m();
                    if (m != null) {
                        C1008e b = m.mo11695b();
                        Uri b2 = b.mo11714b();
                        String uri = b2 != null ? b2.toString() : "";
                        String c = b.mo11715c();
                        String aR = aVar.mo11658aR();
                        if (!C1553o.m3554b(uri)) {
                            if (!C1553o.m3554b(c)) {
                                qVar2 = this.f1913a;
                                str2 = "Unable to load companion ad. No resources provided.";
                                qVar2.mo13281e("AdWebView", str2);
                                return;
                            }
                        }
                        if (b.mo11711a() == C1008e.C1009a.STATIC) {
                            this.f1913a.mo13277b("AdWebView", "Rendering WebView for static VAST ad");
                            loadDataWithBaseURL(gVar.mo12774aD(), m1571a((String) this.f1914b.mo13088a(C1369c.f3070eD), uri), WebRequest.CONTENT_TYPE_HTML, (String) null, "");
                            return;
                        }
                        if (b.mo11711a() == C1008e.C1009a.HTML) {
                            if (C1553o.m3554b(c)) {
                                String a = m1571a(aR, c);
                                str3 = C1553o.m3554b(a) ? a : c;
                                C1505q qVar3 = this.f1913a;
                                qVar3.mo13277b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                                aD = gVar.mo12774aD();
                                str4 = WebRequest.CONTENT_TYPE_HTML;
                                str5 = null;
                                str6 = "";
                            } else if (C1553o.m3554b(uri)) {
                                this.f1913a.mo13277b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                aD2 = gVar.mo12774aD();
                                jVar = this.f1914b;
                                m1573a(uri, aD2, aR, jVar);
                                return;
                            } else {
                                return;
                            }
                        } else if (b.mo11711a() != C1008e.C1009a.IFRAME) {
                            qVar2 = this.f1913a;
                            str2 = "Failed to render VAST companion ad of invalid type";
                            qVar2.mo13281e("AdWebView", str2);
                            return;
                        } else if (C1553o.m3554b(uri)) {
                            this.f1913a.mo13277b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                            aD2 = gVar.mo12774aD();
                            jVar = this.f1914b;
                            m1573a(uri, aD2, aR, jVar);
                            return;
                        } else if (C1553o.m3554b(c)) {
                            String a2 = m1571a(aR, c);
                            str3 = C1553o.m3554b(a2) ? a2 : c;
                            C1505q qVar4 = this.f1913a;
                            qVar4.mo13277b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                            aD = gVar.mo12774aD();
                            str4 = WebRequest.CONTENT_TYPE_HTML;
                            str5 = null;
                            str6 = "";
                        } else {
                            return;
                        }
                        loadDataWithBaseURL(aD, str3, str4, str5, str6);
                        return;
                    }
                    qVar = this.f1913a;
                    str = "No companion ad provided.";
                } else {
                    return;
                }
                qVar.mo13277b("AdWebView", str);
            } catch (Throwable th) {
                String valueOf = gVar != null ? String.valueOf(gVar.getAdIdNumber()) : "null";
                throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
            }
        } else {
            C1505q.m3345i("AdWebView", "Ad can not be loaded in a destroyed webview");
        }
    }

    /* renamed from: a */
    public void mo11889a(String str) {
        mo11890a(str, (Runnable) null);
    }

    /* renamed from: a */
    public void mo11890a(String str, Runnable runnable) {
        try {
            C1505q qVar = this.f1913a;
            qVar.mo13277b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            loadUrl(str);
        } catch (Throwable th) {
            this.f1913a.mo13278b("AdWebView", "Unable to forward to template", th);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public boolean mo11891a() {
        return this.f1919k;
    }

    public void computeScroll() {
    }

    public void destroy() {
        this.f1917i = true;
        super.destroy();
    }

    /* access modifiers changed from: package-private */
    public C1355g getCurrentAd() {
        return this.f1916h;
    }

    public C1382d getStatsManagerHelper() {
        return this.f1915g;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    public void scrollTo(int i, int i2) {
    }

    public void setIsShownOutOfContext(boolean z) {
        this.f1918j = z;
    }

    public void setStatsManagerHelper(C1382d dVar) {
        this.f1915g = dVar;
    }
}
