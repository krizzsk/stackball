package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.chartboost.sdk.C1883d;
import com.chartboost.sdk.C1885e;
import com.chartboost.sdk.C1887f;
import com.chartboost.sdk.C1892h;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Libraries.C1828g;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.C1836a;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1851c;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.impl.C1989v1;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.v1 */
public class C1989v1 extends C1887f {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f5104A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f5105B = false;

    /* renamed from: C */
    int f5106C = 0;

    /* renamed from: D */
    int f5107D = 0;

    /* renamed from: E */
    private int f5108E = 0;

    /* renamed from: F */
    private int f5109F = 0;

    /* renamed from: G */
    private int f5110G = 0;

    /* renamed from: H */
    int f5111H = 0;

    /* renamed from: I */
    int f5112I = 0;

    /* renamed from: J */
    int f5113J = 0;

    /* renamed from: K */
    int f5114K = 0;

    /* renamed from: L */
    int f5115L = 0;

    /* renamed from: M */
    int f5116M = 0;

    /* renamed from: N */
    int f5117N = 0;

    /* renamed from: O */
    int f5118O = 0;

    /* renamed from: P */
    int f5119P = -1;

    /* renamed from: Q */
    private boolean f5120Q = true;

    /* renamed from: R */
    private int f5121R = -1;

    /* renamed from: S */
    private int f5122S = 0;

    /* renamed from: m */
    private final C1828g f5123m;

    /* renamed from: n */
    private final C1855g f5124n;

    /* renamed from: o */
    final C1885e f5125o;

    /* renamed from: p */
    String f5126p;

    /* renamed from: q */
    private String f5127q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f5128r = null;

    /* renamed from: s */
    private int f5129s = 1;

    /* renamed from: t */
    private int f5130t = 1;

    /* renamed from: u */
    private int f5131u = 1;

    /* renamed from: v */
    private int f5132v = 1;

    /* renamed from: w */
    private float f5133w = 0.0f;

    /* renamed from: x */
    private float f5134x = 0.0f;

    /* renamed from: y */
    private boolean f5135y = false;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public long f5136z = 0;

    /* renamed from: com.chartboost.sdk.impl.v1$a */
    class C1990a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1993d f5137a;

        C1990a(C1993d dVar) {
            this.f5137a = dVar;
        }

        public void run() {
            if (this.f5137a.f5143i != null) {
                C1989v1.this.mo14822b("onForeground");
                this.f5137a.f5143i.onResume();
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.v1$b */
    class C1991b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1993d f5139a;

        C1991b(C1993d dVar) {
            this.f5139a = dVar;
        }

        public void run() {
            if (this.f5139a.f5143i != null) {
                C1989v1.this.mo14822b("onBackground");
                this.f5139a.f5143i.onPause();
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.v1$c */
    private class C1992c extends WebViewClient {

        /* renamed from: a */
        private Context f5141a;

        public C1992c(Context context) {
            this.f5141a = context;
        }

        /* renamed from: a */
        private void m4884a(String str) {
            C1874e.m4311e(new C1868a("show_webview_error", str, C1989v1.this.m4842q(), C1989v1.this.m4845v()));
            CBLogging.m3993b("CBWebViewProtocol", str);
            C1989v1.this.mo14519a(CBError.CBImpressionError.WEB_VIEW_CLIENT_RECEIVED_ERROR);
            boolean unused = C1989v1.this.f5105B = true;
            C1989v1 v1Var = C1989v1.this;
            v1Var.f5125o.mo14512e(v1Var.f4717g);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            boolean unused = C1989v1.this.f5105B = true;
            long unused2 = C1989v1.this.f5104A = System.currentTimeMillis();
            CBLogging.m3991a("CBWebViewProtocol", "Total web view load response time " + ((C1989v1.this.f5104A - C1989v1.this.f5136z) / 1000));
            Context context = webView.getContext();
            if (context != null) {
                C1989v1.this.mo14827d(context);
                C1989v1.this.mo14823c(context);
                C1989v1.this.mo14832p();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (Build.VERSION.SDK_INT >= 26) {
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage != null) {
                    CBLogging.m3991a("CBWebViewProtocol", "WebView version: " + currentWebViewPackage.versionName);
                    return;
                }
                m4884a(C1935i1.m4638d(this.f5141a).equalsIgnoreCase("watch") ? "No webview support." : "Device was not set up correctly.");
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            m4884a("Error loading " + str2 + ": " + str);
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading ");
            sb.append(webResourceRequest.getUrl().toString());
            sb.append(": ");
            sb.append(webResourceResponse == null ? "unknown error" : webResourceResponse.getReasonPhrase());
            CBLogging.m3991a("CBWebViewProtocol", sb.toString());
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            if (renderProcessGoneDetail.didCrash()) {
                str = "Webview crashed: " + renderProcessGoneDetail.toString();
            } else {
                str = "Webview killed, likely due to low memory";
            }
            m4884a(str);
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return false;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceRequest.isForMainFrame()) {
                m4884a("Error loading " + webResourceRequest.getUrl().toString() + ": " + webResourceError.getDescription());
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.v1$d */
    public class C1993d extends C1887f.C1889b {

        /* renamed from: i */
        public C1986u1 f5143i;

        /* renamed from: j */
        public C1982t1 f5144j;

        /* renamed from: k */
        public RelativeLayout f5145k;

        /* renamed from: l */
        public RelativeLayout f5146l;

        public C1993d(Context context, String str) {
            super(context);
            setFocusable(false);
            C1892h a = C1892h.m4431a();
            this.f5145k = (RelativeLayout) a.mo14549a(new RelativeLayout(context));
            this.f5146l = (RelativeLayout) a.mo14549a(new RelativeLayout(context));
            this.f5143i = (C1986u1) a.mo14549a(new C1986u1(context));
            C2022j.m4958c(context);
            this.f5143i.setWebViewClient((WebViewClient) a.mo14549a(new C1992c(context)));
            C1982t1 t1Var = (C1982t1) a.mo14549a(new C1982t1(this.f5145k, this.f5146l, C1989v1.this, C1989v1.this.f4711a));
            this.f5144j = t1Var;
            this.f5143i.setWebChromeClient(t1Var);
            if (C2014x.m4911b().mo14883a(19)) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            this.f5143i.loadDataWithBaseURL(C1989v1.this.f5128r, str, WebRequest.CONTENT_TYPE_HTML, "utf-8", (String) null);
            this.f5145k.addView(this.f5143i);
            this.f5143i.getSettings().setSupportZoom(false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.f5145k.setLayoutParams(layoutParams);
            this.f5143i.setLayoutParams(layoutParams);
            this.f5143i.setBackgroundColor(0);
            this.f5146l.setVisibility(8);
            this.f5146l.setLayoutParams(layoutParams);
            addView(this.f5145k);
            addView(this.f5146l);
            long unused = C1989v1.this.f5136z = System.currentTimeMillis();
            if (context instanceof Activity) {
                C1989v1.this.f5119P = ((Activity) context).getRequestedOrientation();
            } else {
                C1989v1.this.f5119P = -1;
            }
            C1989v1.this.f4711a.postDelayed(new Runnable() {
                public final void run() {
                    C1989v1.C1993d.this.m4885c();
                }
            }, MBInterstitialActivity.WEB_LOAD_TIME);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m4885c() {
            if (!C1989v1.this.f5105B) {
                CBLogging.m3991a("CBWebViewProtocol", "Webview seems to be taking more time loading the html content, so closing the view.");
                C1874e.m4311e(new C1868a("show_timeout_error", "", C1989v1.this.m4842q(), C1989v1.this.m4845v()));
                C1989v1.this.mo14519a(CBError.CBImpressionError.WEB_VIEW_PAGE_LOAD_TIMEOUT);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo14540a(int i, int i2) {
        }
    }

    public C1989v1(Context context, C1838c cVar, C1828g gVar, C1855g gVar2, SharedPreferences sharedPreferences, Handler handler, C1883d dVar, C1885e eVar) {
        super(context, cVar, handler, dVar);
        this.f5123m = gVar;
        this.f5124n = gVar2;
        this.f5125o = eVar;
    }

    /* renamed from: C */
    private void m4830C() {
        if (this.f5132v <= 1) {
            this.f4717g.mo14267F();
            this.f5132v++;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f4450c;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m4842q() {
        /*
            r1 = this;
            com.chartboost.sdk.Model.c r0 = r1.m4844u()
            if (r0 == 0) goto L_0x000d
            com.chartboost.sdk.impl.a r0 = r0.f4450c
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.f4749b
            return r0
        L_0x000d:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1989v1.m4842q():java.lang.String");
    }

    /* renamed from: t */
    private Map<String, List<String>> m4843t() {
        C1836a aVar;
        C1838c cVar = this.f4717g;
        if (cVar == null || (aVar = cVar.f4464q) == null) {
            return null;
        }
        return aVar.f4435o;
    }

    /* renamed from: u */
    private C1838c m4844u() {
        C1979s1 a;
        C1885e eVar = this.f5125o;
        if (eVar == null || (a = eVar.mo14506a()) == null) {
            return null;
        }
        return a.mo14792d();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public String m4845v() {
        C1838c u = m4844u();
        return u != null ? u.f4460m : "";
    }

    /* renamed from: A */
    public void mo14811A() {
        if (this.f5131u <= 1) {
            this.f4717g.mo14286n();
            this.f5131u++;
        }
    }

    /* renamed from: B */
    public void mo14812B() {
        C1838c cVar;
        C1894a aVar;
        if (this.f5135y && (cVar = this.f4717g) != null && (aVar = cVar.f4450c) != null && aVar.f4748a == 1) {
            mo14811A();
        }
    }

    /* renamed from: D */
    public void mo14813D() {
        if (this.f5130t <= 1) {
            m4830C();
            this.f5130t++;
        }
    }

    /* renamed from: E */
    public void mo14814E() {
        C1838c cVar = this.f4717g;
        if (cVar.f4449b == 2 && !this.f5135y) {
            cVar.mo14269H();
            this.f5135y = true;
        }
        m4833a(this.f4717g);
    }

    /* renamed from: F */
    public void mo14815F() {
        if (this.f5129s <= 1) {
            this.f4717g.mo14294v();
            mo14811A();
            m4830C();
            this.f5129s++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo14816G() {
        Activity e = this.f4712b.mo14494e();
        if (e != null && !CBUtility.m4005a(e)) {
            int requestedOrientation = e.getRequestedOrientation();
            int i = this.f5119P;
            if (requestedOrientation != i) {
                e.setRequestedOrientation(i);
            }
            this.f5120Q = true;
            this.f5121R = -1;
        }
    }

    /* renamed from: a */
    public String mo14818a(int i) {
        return i != -1 ? i != 0 ? i != 1 ? "error" : "portrait" : "landscape" : "none";
    }

    /* renamed from: g */
    public void mo14829g(String str) {
        List<String> list;
        Map<String, List<String>> t = m4843t();
        if (t != null && !TextUtils.isEmpty(str) && (list = t.get(str)) != null) {
            for (String e : list) {
                m4840e(e);
            }
        }
    }

    /* renamed from: h */
    public void mo14830h(String str) {
        if (C2014x.m4911b().mo14884a((CharSequence) str)) {
            str = "Unknown Webview warning message";
        }
        CBLogging.m3997e("CBWebViewProtocol", "Webview warning occurred closing the webview" + str);
    }

    /* renamed from: j */
    public boolean mo14533j() {
        if (this.f5122S == 2 && this.f4717g.f4450c.f4748a == 1) {
            return true;
        }
        mo14524b();
        mo14517a();
        return true;
    }

    /* renamed from: k */
    public void mo14534k() {
        super.mo14534k();
        C1993d z = mo14532i();
        if (z != null && z.f5143i != null) {
            this.f4711a.post(new C1991b(z));
        }
    }

    /* renamed from: l */
    public void mo14535l() {
        super.mo14535l();
        C1993d z = mo14532i();
        if (z != null && z.f5143i != null) {
            this.f4711a.post(new C1990a(z));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r0.getResources().getConfiguration().orientation == 1) goto L_0x002c;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14831o() {
        /*
            r3 = this;
            com.chartboost.sdk.d r0 = r3.f4712b
            android.app.Activity r0 = r0.mo14494e()
            if (r0 == 0) goto L_0x002f
            boolean r1 = com.chartboost.sdk.Libraries.CBUtility.m4005a((android.app.Activity) r0)
            if (r1 == 0) goto L_0x000f
            goto L_0x002f
        L_0x000f:
            int r1 = r3.f5121R
            r2 = 1
            if (r1 != r2) goto L_0x0015
            goto L_0x002c
        L_0x0015:
            if (r1 != 0) goto L_0x0018
            goto L_0x002b
        L_0x0018:
            boolean r1 = r3.f5120Q
            if (r1 == 0) goto L_0x001e
            r2 = -1
            goto L_0x002c
        L_0x001e:
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 != r2) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r0.setRequestedOrientation(r2)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1989v1.mo14831o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo14832p() {
        C1993d z = mo14532i();
        if (z == null || !this.f5105B) {
            this.f5115L = this.f5111H;
            this.f5116M = this.f5112I;
            this.f5117N = this.f5113J;
            this.f5118O = this.f5114K;
            return;
        }
        int[] iArr = new int[2];
        z.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1] - this.f5110G;
        int width = z.getWidth();
        int height = z.getHeight();
        this.f5111H = i;
        this.f5112I = i2;
        int i3 = width + i;
        this.f5113J = i3;
        int i4 = height + i2;
        this.f5114K = i4;
        this.f5115L = i;
        this.f5116M = i2;
        this.f5117N = i3;
        this.f5118O = i4;
    }

    /* renamed from: r */
    public String mo14833r() {
        mo14832p();
        return C1825e.m4025a(C1825e.m4023a("x", (Object) Integer.valueOf(this.f5115L)), C1825e.m4023a("y", (Object) Integer.valueOf(this.f5116M)), C1825e.m4023a("width", (Object) Integer.valueOf(this.f5117N)), C1825e.m4023a("height", (Object) Integer.valueOf(this.f5118O))).toString();
    }

    /* renamed from: s */
    public String mo14834s() {
        mo14832p();
        return C1825e.m4025a(C1825e.m4023a("x", (Object) Integer.valueOf(this.f5111H)), C1825e.m4023a("y", (Object) Integer.valueOf(this.f5112I)), C1825e.m4023a("width", (Object) Integer.valueOf(this.f5113J)), C1825e.m4023a("height", (Object) Integer.valueOf(this.f5114K))).toString();
    }

    /* renamed from: w */
    public String mo14835w() {
        return C1825e.m4025a(C1825e.m4023a("width", (Object) Integer.valueOf(this.f5108E)), C1825e.m4023a("height", (Object) Integer.valueOf(this.f5109F))).toString();
    }

    /* renamed from: x */
    public String mo14836x() {
        return C1825e.m4025a(C1825e.m4023a("allowOrientationChange", (Object) Boolean.valueOf(this.f5120Q)), C1825e.m4023a("forceOrientation", (Object) mo14818a(this.f5121R))).toString();
    }

    /* renamed from: y */
    public String mo14837y() {
        return C1825e.m4025a(C1825e.m4023a("width", (Object) Integer.valueOf(this.f5106C)), C1825e.m4023a("height", (Object) Integer.valueOf(this.f5107D))).toString();
    }

    /* renamed from: z */
    public C1993d mo14532i() {
        return (C1993d) super.mo14532i();
    }

    /* renamed from: e */
    private void m4840e(String str) {
        if (str == null || str.isEmpty() || this.f5124n == null) {
            CBLogging.m3991a("CBWebViewProtocol", "###### Sending VAST Tracking Event Failed: " + str);
            return;
        }
        this.f5124n.mo14335a(new C1851c("GET", str, 2, (File) null));
        CBLogging.m3991a("CBWebViewProtocol", "###### Sending VAST Tracking Event: " + str);
    }

    /* renamed from: c */
    public void mo14824c(String str) {
        if (C2014x.m4911b().mo14884a((CharSequence) str)) {
            str = "Unknown Webview error";
        }
        CBLogging.m3993b("CBWebViewProtocol", "Webview error occurred closing the webview" + str);
        mo14519a(CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW);
        mo14517a();
    }

    /* renamed from: d */
    public int mo14826d(String str) {
        if (str.equals("portrait")) {
            return 1;
        }
        return str.equals("landscape") ? 0 : -1;
    }

    /* renamed from: f */
    public void mo14828f(String str) {
        CBLogging.m3991a("CBWebViewProtocol sendWebViewEvents", this.f4717g.mo14279d() + " message: " + str);
    }

    /* renamed from: b */
    public boolean mo14525b(JSONObject jSONObject) {
        File file = this.f5123m.mo14234a().f4393a;
        if (file == null) {
            CBLogging.m3993b("CBWebViewProtocol", "External Storage path is unavailable or media not mounted");
            mo14519a(CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW);
            return false;
        }
        this.f5128r = Advertisement.FILE_SCHEME + file.getAbsolutePath() + "/";
        if (C2014x.m4911b().mo14884a((CharSequence) this.f4717g.f4464q.f4425e)) {
            CBLogging.m3993b("CBWebViewProtocol", "Invalid adId being passed in the response");
            mo14519a(CBError.CBImpressionError.ERROR_DISPLAYING_VIEW);
            return false;
        }
        String str = this.f4717g.f4463p;
        if (str == null) {
            CBLogging.m3993b("CBWebViewProtocol", "No html data found in memory");
            mo14519a(CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW);
            return false;
        }
        this.f5127q = str;
        return true;
    }

    /* renamed from: h */
    public float mo14531h() {
        return this.f5134x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1887f.C1889b mo14516a(Context context) {
        return new C1993d(context, this.f5127q);
    }

    /* renamed from: a */
    public void mo14517a() {
        super.mo14517a();
        mo14816G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo14827d(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f5106C = displayMetrics.widthPixels;
        this.f5107D = displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public void mo14825c(JSONObject jSONObject) {
        this.f5120Q = jSONObject.optBoolean("allowOrientationChange", this.f5120Q);
        this.f5121R = mo14826d(jSONObject.optString("forceOrientation", mo14818a(this.f5121R)));
        mo14831o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo14817a(Window window) {
        return window.findViewById(16908290).getTop();
    }

    /* renamed from: g */
    public float mo14530g() {
        return this.f5133w;
    }

    /* renamed from: a */
    public void mo14819a(float f) {
        this.f5134x = f;
    }

    /* renamed from: a */
    private void m4833a(C1838c cVar) {
        if (cVar != null && cVar.f4450c.f4748a == 3) {
            C1883d dVar = this.f4712b;
            dVar.getClass();
            C1883d.C1884a aVar = new C1883d.C1884a(14);
            aVar.f4700c = cVar;
            this.f4711a.post(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14823c(Context context) {
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            this.f5110G = mo14817a(window);
            if (this.f5106C == 0 || this.f5107D == 0) {
                mo14827d(context);
            }
            int width = rect.width();
            int i = this.f5107D - this.f5110G;
            if (width != this.f5108E || i != this.f5109F) {
                this.f5108E = width;
                this.f5109F = i;
            }
        }
    }

    /* renamed from: b */
    public void mo14524b() {
        C1993d z = mo14532i();
        if (z != null) {
            if (z.f5143i != null) {
                CBLogging.m3991a("CBWebViewProtocol", "Destroying the webview object and cleaning up the references");
                z.f5143i.destroy();
                z.f5143i = null;
            }
            if (z.f5144j != null) {
                z.f5144j = null;
            }
            if (z.f5145k != null) {
                z.f5145k = null;
            }
            if (z.f5146l != null) {
                z.f5146l = null;
            }
        }
        super.mo14524b();
    }

    /* renamed from: b */
    public void mo14821b(int i) {
        this.f5122S = i;
    }

    /* renamed from: b */
    public void mo14820b(float f) {
        this.f5133w = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14822b(String str) {
        try {
            C1993d z = mo14532i();
            if (z != null) {
                C1986u1 u1Var = z.f5143i;
                if (u1Var != null) {
                    String str2 = "javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\", \"\")";
                    CBLogging.m3991a("CBWebViewProtocol", "Calling native to javascript: " + str2);
                    u1Var.loadUrl(str2);
                    return;
                }
                C1874e.m4311e(new C1868a("show_webview_crash", "Webview is null", m4842q(), m4845v()));
                CBLogging.m3995c("CBWebViewProtocol", "Calling native to javascript webview is null");
            }
        } catch (Exception e) {
            C1874e.m4311e(new C1868a("show_webview_crash", "Cannot open url", m4842q(), m4845v()));
            CBLogging.m3995c("CBWebViewProtocol", "Calling native to javascript. Cannot open url: " + e.toString());
        }
    }
}
