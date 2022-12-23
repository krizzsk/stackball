package com.adcolony.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adcolony.sdk.C0580a0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.security.CertificateUtil;
import com.iab.omid.library.adcolony.ScriptInjector;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.tapjoy.TJAdUnitConstants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;

/* renamed from: com.adcolony.sdk.w0 */
class C0872w0 extends WebView implements C0687g0 {

    /* renamed from: Q */
    static boolean f1538Q = false;

    /* renamed from: A */
    private boolean f1539A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f1540B;

    /* renamed from: C */
    private boolean f1541C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f1542D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f1543E;

    /* renamed from: F */
    private boolean f1544F;

    /* renamed from: G */
    private boolean f1545G;

    /* renamed from: H */
    private boolean f1546H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C0895y0 f1547I = C0894y.m1134a();
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C0897z0 f1548J = C0894y.m1151b();

    /* renamed from: K */
    private C0897z0 f1549K = C0894y.m1151b();
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C0589c f1550L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C0645d0 f1551M;

    /* renamed from: N */
    private ImageView f1552N;

    /* renamed from: O */
    private C0891o f1553O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final Object f1554P = new Object();

    /* renamed from: a */
    private String f1555a;

    /* renamed from: b */
    private String f1556b;

    /* renamed from: c */
    private String f1557c = "";

    /* renamed from: d */
    private String f1558d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f1559e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1560f = "";

    /* renamed from: g */
    private String f1561g = "";

    /* renamed from: h */
    private String f1562h = "";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f1563i = "";

    /* renamed from: j */
    private String f1564j = "";
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f1565k = "";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1566l;

    /* renamed from: m */
    private int f1567m;

    /* renamed from: n */
    private int f1568n;

    /* renamed from: o */
    private int f1569o;

    /* renamed from: p */
    private int f1570p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f1571q;

    /* renamed from: r */
    private int f1572r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f1573s;

    /* renamed from: t */
    private int f1574t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f1575u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f1576v;

    /* renamed from: w */
    private int f1577w;

    /* renamed from: x */
    private int f1578x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f1579y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f1580z;

    /* renamed from: com.adcolony.sdk.w0$a */
    class C0873a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f1581a;

        C0873a(String str) {
            this.f1581a = str;
        }

        public void run() {
            if (C0872w0.this.f1579y) {
                C0872w0 w0Var = C0872w0.this;
                w0Var.mo9959c("NativeLayer.dispatch_messages(ADC3_update(" + this.f1581a + "), '" + C0872w0.this.f1565k + "');");
            }
        }
    }

    /* renamed from: com.adcolony.sdk.w0$b */
    class C0874b extends C0890n {
        C0874b() {
            super(C0872w0.this, (C0874b) null);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C0872w0.this.m1066e(str);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C0872w0.this.m1044a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(C0872w0.this.f1560f.getBytes("UTF-8")));
                } catch (UnsupportedEncodingException unused) {
                    new C0580a0.C0581a().mo9419a("UTF-8 not supported.").mo9421a(C0580a0.f192j);
                }
            }
            return null;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri uri;
            if (!C0872w0.this.f1540B || webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return false;
            }
            String m = C0872w0.this.mo9967m();
            if (m == null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = Uri.parse(m);
            }
            if (uri != null) {
                C0849u0.m912a(new Intent("android.intent.action.VIEW", uri));
                C0897z0 b = C0894y.m1151b();
                C0894y.m1148a(b, "url", uri.toString());
                C0894y.m1148a(b, "ad_session_id", C0872w0.this.f1559e);
                new C0645d0("WebView.redirect_detected", C0872w0.this.f1550L.mo9469k(), b).mo9536d();
                C0800s0 D = C0578a.m143c().mo9572D();
                D.mo9865a(C0872w0.this.f1559e);
                D.mo9867c(C0872w0.this.f1559e);
                return true;
            }
            C0580a0.C0581a aVar = new C0580a0.C0581a();
            aVar.mo9419a("shouldOverrideUrlLoading called with null request url, with ad id: " + C0872w0.this.mo9966k()).mo9421a(C0580a0.f192j);
            return true;
        }
    }

    /* renamed from: com.adcolony.sdk.w0$c */
    class C0875c extends C0890n {
        C0875c() {
            super(C0872w0.this, (C0874b) null);
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.getUrl().toString().endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(C0872w0.this.f1560f.getBytes("UTF-8")));
                } catch (UnsupportedEncodingException unused) {
                    new C0580a0.C0581a().mo9419a("UTF-8 not supported.").mo9421a(C0580a0.f192j);
                }
            }
            return null;
        }
    }

    /* renamed from: com.adcolony.sdk.w0$d */
    class C0876d extends WebMessagePort.WebMessageCallback {
        C0876d() {
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            String data = webMessage.getData();
            if (data != null) {
                String[] split = data.split(CertificateUtil.DELIMITER, 2);
                if (split.length == 2 && split[0].equals(C0872w0.this.f1565k)) {
                    C0872w0.this.m1049a(split[1]);
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.w0$e */
    class C0877e implements C0685f0 {

        /* renamed from: com.adcolony.sdk.w0$e$a */
        class C0878a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1587a;

            C0878a(C0645d0 d0Var) {
                this.f1587a = d0Var;
            }

            public void run() {
                C0872w0.this.mo9958b(this.f1587a);
            }
        }

        C0877e() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0872w0.this.mo9960c(d0Var)) {
                C0849u0.m931b((Runnable) new C0878a(d0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.w0$f */
    class C0879f implements C0685f0 {

        /* renamed from: com.adcolony.sdk.w0$f$a */
        class C0880a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1590a;

            C0880a(C0645d0 d0Var) {
                this.f1590a = d0Var;
            }

            public void run() {
                C0872w0.this.mo9953a(this.f1590a);
            }
        }

        C0879f() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0872w0.this.mo9960c(d0Var)) {
                C0849u0.m931b((Runnable) new C0880a(d0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.w0$g */
    class C0881g implements C0685f0 {

        /* renamed from: com.adcolony.sdk.w0$g$a */
        class C0882a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1593a;

            C0882a(C0645d0 d0Var) {
                this.f1593a = d0Var;
            }

            public void run() {
                C0872w0.this.mo9959c(C0894y.m1169h(this.f1593a.mo9532b(), "custom_js"));
            }
        }

        C0881g() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0872w0.this.mo9960c(d0Var)) {
                C0849u0.m931b((Runnable) new C0882a(d0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.w0$h */
    class C0883h implements C0685f0 {

        /* renamed from: com.adcolony.sdk.w0$h$a */
        class C0884a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1596a;

            C0884a(C0645d0 d0Var) {
                this.f1596a = d0Var;
            }

            public void run() {
                C0872w0.this.m1056b(C0894y.m1155b(this.f1596a.mo9532b(), TJAdUnitConstants.String.TRANSPARENT));
            }
        }

        C0883h() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            if (C0872w0.this.mo9960c(d0Var)) {
                C0849u0.m931b((Runnable) new C0884a(d0Var));
            }
        }
    }

    /* renamed from: com.adcolony.sdk.w0$i */
    class C0885i implements View.OnClickListener {
        C0885i() {
        }

        public void onClick(View view) {
            C0849u0.m912a(new Intent("android.intent.action.VIEW", Uri.parse(C0872w0.this.f1563i)));
            C0578a.m143c().mo9572D().mo9867c(C0872w0.this.f1559e);
        }
    }

    /* renamed from: com.adcolony.sdk.w0$j */
    class C0886j implements Runnable {
        C0886j() {
        }

        public void run() {
            C0872w0.this.clearCache(true);
            C0872w0.this.mo9956a(true);
            C0872w0.this.destroy();
        }
    }

    /* renamed from: com.adcolony.sdk.w0$k */
    private class C0887k {
        private C0887k() {
        }

        @JavascriptInterface
        public void dispatch_messages(String str, String str2) {
            if (str2.equals(C0872w0.this.f1565k)) {
                C0872w0.this.m1055b(str);
            }
        }

        @JavascriptInterface
        public void enable_reverse_messaging(String str) {
            if (str.equals(C0872w0.this.f1565k)) {
                boolean unused = C0872w0.this.f1542D = true;
            }
        }

        @JavascriptInterface
        public String pull_messages(String str) {
            if (!str.equals(C0872w0.this.f1565k)) {
                return "[]";
            }
            String str2 = "[]";
            synchronized (C0872w0.this.f1554P) {
                if (C0872w0.this.f1547I.mo10032c() > 0) {
                    if (C0872w0.this.f1579y) {
                        str2 = C0872w0.this.f1547I.toString();
                    }
                    C0895y0 unused = C0872w0.this.f1547I = C0894y.m1134a();
                }
            }
            return str2;
        }

        @JavascriptInterface
        public void push_messages(String str, String str2) {
            if (str2.equals(C0872w0.this.f1565k)) {
                C0872w0.this.m1055b(str);
            }
        }

        /* synthetic */ C0887k(C0872w0 w0Var, C0874b bVar) {
            this();
        }
    }

    /* renamed from: com.adcolony.sdk.w0$l */
    private class C0888l extends C0887k {
        private C0888l() {
            super(C0872w0.this, (C0874b) null);
        }

        @JavascriptInterface
        public void enable_event_messaging(String str) {
            if (str.equals(C0872w0.this.f1565k)) {
                boolean unused = C0872w0.this.f1543E = true;
            }
        }

        /* synthetic */ C0888l(C0872w0 w0Var, C0874b bVar) {
            this();
        }
    }

    /* renamed from: com.adcolony.sdk.w0$m */
    private class C0889m extends WebChromeClient {
        private C0889m() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C0580a0 a0Var;
            ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
            String message = consoleMessage.message();
            boolean z = false;
            boolean z2 = message.contains("Viewport target-densitydpi is not supported.") || message.contains("Viewport argument key \"shrink-to-fit\" not recognized and ignored");
            boolean z3 = messageLevel == ConsoleMessage.MessageLevel.ERROR;
            if (messageLevel == ConsoleMessage.MessageLevel.WARNING) {
                z = true;
            }
            if (message.contains("ADC3_update is not defined") || message.contains("NativeLayer.dispatch_messages is not a function")) {
                C0872w0 w0Var = C0872w0.this;
                w0Var.m1048a(w0Var.f1551M.mo9532b(), "Unable to communicate with AdColony. Please ensure that you have added an exception for our Javascript interface in your ProGuard configuration and that you do not have a faulty proxy enabled on your device.");
            }
            if (!z2 && (z || z3)) {
                C0580a0.C0581a aVar = new C0580a0.C0581a();
                C0580a0.C0581a a = aVar.mo9419a("onConsoleMessage: " + message + " with ad id: " + C0872w0.this.mo9966k());
                if (z3) {
                    a0Var = C0580a0.f192j;
                } else {
                    a0Var = C0580a0.f190h;
                }
                a.mo9421a(a0Var);
            }
            return true;
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.confirm();
            return true;
        }

        /* synthetic */ C0889m(C0872w0 w0Var, C0874b bVar) {
            this();
        }
    }

    /* renamed from: com.adcolony.sdk.w0$n */
    private class C0890n extends WebViewClient {
        private C0890n() {
        }

        public void onPageFinished(WebView webView, String str) {
            int i;
            C0897z0 b = C0894y.m1151b();
            C0894y.m1156b(b, "id", C0872w0.this.f1566l);
            C0894y.m1148a(b, "url", str);
            if (C0872w0.this.f1550L == null) {
                new C0645d0("WebView.on_load", C0872w0.this.f1575u, b).mo9536d();
            } else {
                C0894y.m1148a(b, "ad_session_id", C0872w0.this.f1559e);
                C0894y.m1156b(b, "container_id", C0872w0.this.f1550L.mo9450c());
                new C0645d0("WebView.on_load", C0872w0.this.f1550L.mo9469k(), b).mo9536d();
            }
            if ((C0872w0.this.f1579y || C0872w0.this.f1580z) && !C0872w0.this.f1540B) {
                if (C0872w0.this.f1576v > 0) {
                    i = C0872w0.this.f1576v;
                } else {
                    i = C0872w0.this.f1575u;
                }
                if (C0872w0.this.f1576v > 0) {
                    float o = C0578a.m143c().mo9611o().mo9750o();
                    C0894y.m1156b(C0872w0.this.f1548J, "app_orientation", C0849u0.m938d(C0849u0.m945f()));
                    C0894y.m1156b(C0872w0.this.f1548J, "x", C0849u0.m902a((View) C0872w0.this));
                    C0894y.m1156b(C0872w0.this.f1548J, "y", C0849u0.m922b((View) C0872w0.this));
                    C0894y.m1156b(C0872w0.this.f1548J, "width", (int) (((float) C0872w0.this.f1571q) / o));
                    C0894y.m1156b(C0872w0.this.f1548J, "height", (int) (((float) C0872w0.this.f1573s) / o));
                    C0894y.m1148a(C0872w0.this.f1548J, "ad_session_id", C0872w0.this.f1559e);
                }
                if (C0872w0.this.f1575u == 1) {
                    C0612d d = C0578a.m143c().mo9597d();
                    C0895y0 y0Var = new C0895y0();
                    for (AdColonyInterstitial next : d.mo9510g()) {
                        C0897z0 z0Var = new C0897z0();
                        C0894y.m1148a(z0Var, "ad_session_id", next.mo9324b());
                        C0894y.m1148a(z0Var, "ad_id", next.mo9315a());
                        C0894y.m1148a(z0Var, "zone_id", next.getZoneID());
                        C0894y.m1148a(z0Var, "ad_request_id", next.mo9339h());
                        y0Var.mo10017a(z0Var);
                    }
                    C0894y.m1146a(C0872w0.this.f1548J, "ads_to_restore", y0Var);
                }
                String unused = C0872w0.this.f1565k = C0849u0.m907a();
                C0897z0 a = C0894y.m1141a(C0894y.m1151b(), C0872w0.this.f1548J);
                C0894y.m1148a(a, "message_key", C0872w0.this.f1565k);
                C0872w0 w0Var = C0872w0.this;
                w0Var.mo9959c("ADC3_init(" + i + "," + a.toString() + ");");
                boolean unused2 = C0872w0.this.f1540B = true;
            }
            if (!C0872w0.this.f1580z) {
                return;
            }
            if (C0872w0.this.f1575u != 1 || C0872w0.this.f1576v > 0) {
                C0897z0 b2 = C0894y.m1151b();
                C0894y.m1158b(b2, "success", true);
                C0894y.m1156b(b2, "id", C0872w0.this.f1575u);
                C0872w0.this.f1551M.mo9530a(b2).mo9536d();
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            boolean unused = C0872w0.this.f1540B = false;
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (Build.VERSION.SDK_INT < 23) {
                C0872w0.this.m1044a(i, str, str2);
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (!renderProcessGoneDetail.didCrash()) {
                return true;
            }
            C0872w0.this.m1048a(C0894y.m1151b(), "An error occurred while rendering the ad. Ad closing.");
            return true;
        }

        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (Build.VERSION.SDK_INT < 21 && str.endsWith("mraid.js")) {
                try {
                    return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(C0872w0.this.f1560f.getBytes("UTF-8")));
                } catch (UnsupportedEncodingException unused) {
                    new C0580a0.C0581a().mo9419a("UTF-8 not supported.").mo9421a(C0580a0.f192j);
                }
            }
            return null;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!C0872w0.this.f1540B) {
                return false;
            }
            String m = C0872w0.this.mo9967m();
            if (m != null) {
                str = m;
            }
            if (str != null) {
                C0849u0.m912a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                C0800s0 D = C0578a.m143c().mo9572D();
                D.mo9865a(C0872w0.this.f1559e);
                D.mo9867c(C0872w0.this.f1559e);
                C0897z0 b = C0894y.m1151b();
                C0894y.m1148a(b, "url", str);
                C0894y.m1148a(b, "ad_session_id", C0872w0.this.f1559e);
                new C0645d0("WebView.redirect_detected", C0872w0.this.f1550L.mo9469k(), b).mo9536d();
                return true;
            }
            C0580a0.C0581a aVar = new C0580a0.C0581a();
            aVar.mo9419a("shouldOverrideUrlLoading called with null url, with ad id: " + C0872w0.this.mo9966k()).mo9421a(C0580a0.f192j);
            return true;
        }

        /* synthetic */ C0890n(C0872w0 w0Var, C0874b bVar) {
            this();
        }
    }

    /* renamed from: com.adcolony.sdk.w0$o */
    private static class C0891o {

        /* renamed from: a */
        Object[] f1604a;

        C0891o(WebMessagePort[] webMessagePortArr) {
            this.f1604a = webMessagePortArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public WebMessagePort mo10005a() {
            return (WebMessagePort) this.f1604a[1];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public WebMessagePort mo10006b() {
            return (WebMessagePort) this.f1604a[0];
        }
    }

    private C0872w0(Context context) {
        super(context);
    }

    /* renamed from: C */
    private boolean m1039C() {
        return m1081v() != null;
    }

    /* renamed from: v */
    private AdColonyInterstitial m1081v() {
        if (this.f1559e == null) {
            return null;
        }
        return C0578a.m143c().mo9597d().mo9509f().get(this.f1559e);
    }

    /* renamed from: y */
    private boolean m1082y() {
        return m1074l() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo9948A() {
        return this.f1539A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo9949B() {
        return this.f1544F;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo9950D() {
        String str;
        String str2;
        FileInputStream fileInputStream;
        if (this.f1539A) {
            try {
                if (this.f1564j.equals("")) {
                    fileInputStream = new FileInputStream(this.f1556b);
                    StringBuilder sb = new StringBuilder(fileInputStream.available());
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read));
                    }
                    if (this.f1556b.contains(".html")) {
                        str = sb.toString();
                    } else {
                        str = "<html><script>" + sb.toString() + "</script></html>";
                    }
                    fileInputStream.close();
                } else {
                    str = this.f1564j.replaceFirst("script\\s*src\\s*=\\s*\"mraid.js\"", "script src=\"file://" + this.f1561g + "\"");
                }
                String h = C0894y.m1169h(C0894y.m1167f(this.f1551M.mo9532b(), TJAdUnitConstants.String.VIDEO_INFO), "metadata");
                String replaceFirst = m1043a(str, C0894y.m1169h(C0894y.m1153b(h), "iab_filepath")).replaceFirst("var\\s*ADC_DEVICE_INFO\\s*=\\s*null\\s*;", Matcher.quoteReplacement("var ADC_DEVICE_INFO = " + h + ";"));
                if (this.f1555a.equals("")) {
                    str2 = this.f1558d;
                } else {
                    str2 = this.f1555a;
                }
                loadDataWithBaseURL(str2, replaceFirst, WebRequest.CONTENT_TYPE_HTML, (String) null, (String) null);
                return;
            } catch (IOException e) {
                m1050a((Exception) e);
                return;
            } catch (IllegalArgumentException e2) {
                m1050a((Exception) e2);
                return;
            } catch (IndexOutOfBoundsException e3) {
                m1050a((Exception) e3);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else if (!this.f1555a.startsWith("http") && !this.f1555a.startsWith("file")) {
            loadDataWithBaseURL(this.f1558d, this.f1555a, WebRequest.CONTENT_TYPE_HTML, (String) null, (String) null);
            return;
        } else if (this.f1555a.contains(".html") || !this.f1555a.startsWith("file")) {
            loadUrl(this.f1555a);
            return;
        } else {
            loadDataWithBaseURL(this.f1555a, "<html><script src=\"" + this.f1555a + "\"></script></html>", WebRequest.CONTENT_TYPE_HTML, (String) null, (String) null);
            return;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo9951E() {
        int i;
        int i2;
        if (this.f1552N != null) {
            Rect s = C0578a.m143c().mo9611o().mo9754s();
            if (this.f1546H) {
                i = this.f1567m + this.f1571q;
            } else {
                i = s.width();
            }
            if (this.f1546H) {
                i2 = this.f1569o + this.f1573s;
            } else {
                i2 = s.height();
            }
            float o = C0578a.m143c().mo9611o().mo9750o();
            int i3 = (int) (((float) this.f1577w) * o);
            int i4 = (int) (((float) this.f1578x) * o);
            this.f1552N.setLayoutParams(new AbsoluteLayout.LayoutParams(i3, i4, i - i3, i2 - i4));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            AdColonyAdView l = m1074l();
            if (l != null && !l.mo9221c()) {
                C0897z0 b = C0894y.m1151b();
                C0894y.m1148a(b, "ad_session_id", this.f1559e);
                new C0645d0("WebView.on_first_click", 1, b).mo9536d();
                l.setUserInteraction(true);
            }
            AdColonyInterstitial v = m1081v();
            if (v != null) {
                v.mo9326b(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo9973r() {
        return this.f1574t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo9974s() {
        return this.f1572r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo9975t() {
        return this.f1568n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public int mo9976u() {
        return this.f1570p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo9977w() {
        mo9957a(false, (C0645d0) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo9978x() {
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f1571q, this.f1573s);
        layoutParams.setMargins(this.f1567m, this.f1569o, 0, 0);
        layoutParams.gravity = 0;
        this.f1550L.addView(this, layoutParams);
        if (!this.f1562h.equals("") && !this.f1563i.equals("")) {
            m1070h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo9979z() {
        return this.f1541C;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m1066e(String str) {
        if (this.f1553O == null) {
            C0891o oVar = new C0891o(createWebMessageChannel());
            this.f1553O = oVar;
            oVar.mo10006b().setWebMessageCallback(new C0876d());
            postWebMessage(new WebMessage("", new WebMessagePort[]{this.f1553O.mo10005a()}), Uri.parse(str));
        }
    }

    /* renamed from: h */
    private void m1070h() {
        Context b = C0578a.m141b();
        if (b != null && this.f1550L != null && !this.f1545G) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            ImageView imageView = new ImageView(b);
            this.f1552N = imageView;
            imageView.setImageURI(Uri.fromFile(new File(this.f1562h)));
            this.f1552N.setBackground(gradientDrawable);
            this.f1552N.setOnClickListener(new C0885i());
            mo9951E();
            addView(this.f1552N);
        }
    }

    /* renamed from: l */
    private AdColonyAdView m1074l() {
        if (this.f1559e == null) {
            return null;
        }
        return C0578a.m143c().mo9597d().mo9506d().get(this.f1559e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo9952F() {
        String str = "";
        synchronized (this.f1554P) {
            if (this.f1547I.mo10032c() > 0) {
                if (this.f1579y) {
                    str = this.f1547I.toString();
                }
                this.f1547I = C0894y.m1134a();
            }
        }
        C0849u0.m931b((Runnable) new C0873a(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9962f() {
        ImageView imageView = this.f1552N;
        if (imageView != null) {
            this.f1550L.mo9444a((View) imageView, FriendlyObstructionPurpose.OTHER);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9963g() {
        this.f1550L.mo9465i().add(C0578a.m135a("WebView.set_visible", (C0685f0) new C0877e(), true));
        this.f1550L.mo9465i().add(C0578a.m135a("WebView.set_bounds", (C0685f0) new C0879f(), true));
        this.f1550L.mo9465i().add(C0578a.m135a("WebView.execute_js", (C0685f0) new C0881g(), true));
        this.f1550L.mo9465i().add(C0578a.m135a("WebView.set_transparent", (C0685f0) new C0883h(), true));
        this.f1550L.mo9467j().add("WebView.set_visible");
        this.f1550L.mo9467j().add("WebView.set_bounds");
        this.f1550L.mo9467j().add("WebView.execute_js");
        this.f1550L.mo9467j().add("WebView.set_transparent");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9964i() {
        C0578a.m143c().mo9597d().mo9497a(this, this.f1559e, this.f1550L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C0890n mo9965j() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return new C0874b();
        }
        return i >= 21 ? new C0875c() : new C0890n(this, (C0874b) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo9966k() {
        AdColonyInterstitial adColonyInterstitial;
        C0612d d = C0578a.m143c().mo9597d();
        if (this.f1559e == null) {
            adColonyInterstitial = null;
        } else {
            adColonyInterstitial = d.mo9509f().get(this.f1559e);
        }
        if (adColonyInterstitial == null) {
            return "unknown";
        }
        return adColonyInterstitial.mo9315a() + " : " + adColonyInterstitial.getZoneID();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo9967m() {
        return mo9961d((String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo9968n() {
        return this.f1573s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo9969o() {
        return this.f1571q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo9971p() {
        return this.f1567m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo9972q() {
        return this.f1569o;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1055b(String str) {
        C0895y0 a = C0894y.m1137a(str);
        for (int i = 0; i < a.mo10032c(); i++) {
            m1053b(C0894y.m1152b(a, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9959c(String str) {
        if (this.f1541C) {
            new C0580a0.C0581a().mo9419a("Ignoring call to execute_js as WebView has been destroyed.").mo9421a(C0580a0.f186d);
        } else if (Build.VERSION.SDK_INT >= 19) {
            try {
                evaluateJavascript(str, (ValueCallback) null);
            } catch (IllegalStateException unused) {
                new C0580a0.C0581a().mo9419a("Device reporting incorrect OS version, evaluateJavascript ").mo9419a("is not available. Disabling AdColony.").mo9421a(C0580a0.f191i);
                AdColony.disable();
            }
        } else {
            loadUrl("javascript:" + str);
        }
    }

    /* renamed from: d */
    public int mo9561d() {
        return this.f1576v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9961d(String str) {
        String c = (!m1039C() || m1081v() == null) ? str : m1081v().mo9327c();
        return ((c == null || c.equals(str)) && m1082y() && m1074l() != null) ? m1074l().getClickOverride() : c;
    }

    /* renamed from: b */
    private void m1053b(C0897z0 z0Var) {
        C0578a.m143c().mo9617u().mo9546c(z0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9957a(boolean z, C0645d0 d0Var) {
        String str;
        this.f1580z = z;
        C0645d0 d0Var2 = this.f1551M;
        if (d0Var2 != null) {
            d0Var = d0Var2;
        }
        this.f1551M = d0Var;
        C0897z0 b = d0Var.mo9532b();
        this.f1539A = C0894y.m1155b(b, "is_display_module");
        setFocusable(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        if (z) {
            this.f1579y = true;
            String h = C0894y.m1169h(b, "filepath");
            this.f1564j = C0894y.m1169h(b, "interstitial_html");
            this.f1561g = C0894y.m1169h(b, "mraid_filepath");
            this.f1558d = C0894y.m1169h(b, "base_url");
            this.f1549K = C0894y.m1167f(b, "iab");
            this.f1548J = C0894y.m1167f(b, TJAdUnitConstants.String.VIDEO_INFO);
            this.f1559e = C0894y.m1169h(b, "ad_session_id");
            this.f1556b = h;
            if (f1538Q && this.f1575u == 1) {
                this.f1556b = "android_asset/ADCController.js";
            }
            if (this.f1564j.equals("")) {
                str = "file:///" + this.f1556b;
            } else {
                str = "";
            }
            this.f1555a = str;
        }
        setWebChromeClient(new C0889m(this, (C0874b) null));
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setGeolocationEnabled(true);
        settings.setUseWideViewPort(true);
        if (i >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            settings.setAllowFileAccess(true);
        }
        if (i >= 23) {
            addJavascriptInterface(new C0888l(this, (C0874b) null), "NativeLayer");
        } else {
            addJavascriptInterface(new C0887k(this, (C0874b) null), "NativeLayer");
        }
        setWebViewClient(mo9965j());
        mo9950D();
        if (!z) {
            mo9963g();
            mo9978x();
        }
        if (z || this.f1579y) {
            C0578a.m143c().mo9617u().mo9541a((C0687g0) this);
        }
        if (!this.f1557c.equals("")) {
            mo9959c(this.f1557c);
        }
    }

    /* renamed from: b */
    private void m1054b(Exception exc) {
        new C0580a0.C0581a().mo9419a(exc.getClass().toString()).mo9419a(" during metadata injection w/ metadata = ").mo9419a(C0894y.m1169h(this.f1548J, "metadata")).mo9421a(C0580a0.f192j);
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "id", this.f1559e);
        new C0645d0("AdSession.on_error", this.f1550L.mo9469k(), b).mo9536d();
    }

    /* renamed from: b */
    public void mo9559b() {
        if (C0578a.m144d() && this.f1540B && !this.f1542D && !this.f1543E) {
            mo9952F();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1056b(boolean z) {
        setBackgroundColor(z ? 0 : -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9958b(C0645d0 d0Var) {
        if (C0894y.m1155b(d0Var.mo9532b(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
        if (this.f1580z) {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1158b(b, "success", true);
            C0894y.m1156b(b, "id", this.f1575u);
            d0Var.mo9530a(b).mo9536d();
        }
    }

    /* renamed from: e */
    public int mo9562e() {
        return this.f1575u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9960c(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        return C0894y.m1163d(b, "id") == this.f1566l && C0894y.m1163d(b, "container_id") == this.f1550L.mo9450c() && C0894y.m1169h(b, "ad_session_id").equals(this.f1550L.mo9441a());
    }

    /* renamed from: c */
    private void m1059c(C0897z0 z0Var) {
        if (!this.f1579y) {
            return;
        }
        if (this.f1553O != null) {
            C0895y0 a = C0894y.m1134a();
            a.mo10017a(z0Var);
            this.f1553O.mo10006b().postMessage(new WebMessage(a.toString()));
            return;
        }
        new C0580a0.C0581a().mo9419a("Sending message before event messaging is initialized").mo9421a(C0580a0.f190h);
    }

    /* renamed from: c */
    public void mo9560c() {
        if (!this.f1539A) {
            C0849u0.m931b((Runnable) new C0886j());
        }
    }

    C0872w0(Context context, C0645d0 d0Var, int i, int i2, C0589c cVar) {
        super(context);
        this.f1551M = d0Var;
        mo9954a(d0Var, i, i2, cVar);
        mo9977w();
    }

    /* renamed from: a */
    private String m1043a(String str, String str2) {
        C0742k0 k0Var;
        C0612d d = C0578a.m143c().mo9597d();
        AdColonyInterstitial v = m1081v();
        AdColonyAdViewListener adColonyAdViewListener = d.mo9507e().get(this.f1559e);
        if (v != null && this.f1549K.mo10070c() > 0 && !C0894y.m1169h(this.f1549K, "ad_type").equals("video")) {
            v.mo9320a(this.f1549K);
        } else if (adColonyAdViewListener != null && this.f1549K.mo10070c() > 0) {
            adColonyAdViewListener.mo9258a(new C0742k0(this.f1549K, this.f1559e));
        }
        if (v == null) {
            k0Var = null;
        } else {
            k0Var = v.mo9334f();
        }
        if (k0Var == null && adColonyAdViewListener != null) {
            k0Var = adColonyAdViewListener.mo9260b();
        }
        if (k0Var != null && k0Var.mo9695d() == 2) {
            this.f1544F = true;
            if (!str2.equals("")) {
                try {
                    return ScriptInjector.injectScriptContentIntoHtml(C0578a.m143c().mo9614r().mo9895a(str2, false).toString(), str);
                } catch (IOException e) {
                    m1050a((Exception) e);
                }
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1049a(String str) {
        m1053b(C0894y.m1153b(str));
    }

    /* renamed from: a */
    private boolean m1050a(Exception exc) {
        new C0580a0.C0581a().mo9419a(exc.getClass().toString()).mo9419a(" during metadata injection w/ metadata = ").mo9419a(C0894y.m1169h(this.f1548J, "metadata")).mo9421a(C0580a0.f192j);
        AdColonyInterstitial remove = C0578a.m143c().mo9597d().mo9509f().remove(C0894y.m1169h(this.f1548J, "ad_session_id"));
        if (remove == null) {
            return false;
        }
        return remove.mo9349r();
    }

    C0872w0(Context context, int i, boolean z) {
        super(context);
        this.f1575u = i;
        this.f1539A = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9955a(C0645d0 d0Var, int i, C0589c cVar) {
        mo9954a(d0Var, i, -1, cVar);
        mo9978x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9954a(C0645d0 d0Var, int i, int i2, C0589c cVar) {
        int i3;
        C0897z0 b = d0Var.mo9532b();
        String h = C0894y.m1169h(b, "url");
        this.f1555a = h;
        if (h.equals("")) {
            this.f1555a = C0894y.m1169h(b, "data");
        }
        this.f1558d = C0894y.m1169h(b, "base_url");
        this.f1557c = C0894y.m1169h(b, "custom_js");
        this.f1559e = C0894y.m1169h(b, "ad_session_id");
        this.f1548J = C0894y.m1167f(b, TJAdUnitConstants.String.VIDEO_INFO);
        this.f1561g = C0894y.m1169h(b, "mraid_filepath");
        if (C0894y.m1155b(b, "use_mraid_module")) {
            i3 = C0578a.m143c().mo9617u().mo9548e();
        } else {
            i3 = this.f1576v;
        }
        this.f1576v = i3;
        this.f1562h = C0894y.m1169h(b, "ad_choices_filepath");
        this.f1563i = C0894y.m1169h(b, "ad_choices_url");
        this.f1545G = C0894y.m1155b(b, "disable_ad_choices");
        this.f1546H = C0894y.m1155b(b, "ad_choices_snap_to_webview");
        this.f1577w = C0894y.m1163d(b, "ad_choices_width");
        this.f1578x = C0894y.m1163d(b, "ad_choices_height");
        if (this.f1549K.mo10070c() == 0) {
            this.f1549K = C0894y.m1167f(b, "iab");
        }
        boolean z = false;
        if (!this.f1539A && !this.f1561g.equals("")) {
            if (this.f1576v > 0) {
                this.f1555a = m1043a(this.f1555a.replaceFirst("script\\s*src\\s*=\\s*\"mraid.js\"", "script src=\"file://" + this.f1561g + "\""), C0894y.m1169h(C0894y.m1167f(this.f1548J, DeviceRequestsHelper.DEVICE_INFO_PARAM), "iab_filepath"));
            } else {
                try {
                    this.f1560f = C0578a.m143c().mo9614r().mo9895a(this.f1561g, false).toString();
                    this.f1560f = this.f1560f.replaceFirst("bridge.os_name\\s*=\\s*\"\"\\s*;", "bridge.os_name = \"\";\nvar ADC_DEVICE_INFO = " + this.f1548J.toString() + ";\n");
                } catch (IOException e) {
                    m1054b((Exception) e);
                } catch (IllegalArgumentException e2) {
                    m1054b((Exception) e2);
                } catch (IndexOutOfBoundsException e3) {
                    m1054b((Exception) e3);
                }
            }
        }
        this.f1566l = i;
        this.f1550L = cVar;
        if (i2 >= 0) {
            this.f1575u = i2;
        } else {
            mo9963g();
        }
        this.f1571q = C0894y.m1163d(b, "width");
        this.f1573s = C0894y.m1163d(b, "height");
        this.f1567m = C0894y.m1163d(b, "x");
        int d = C0894y.m1163d(b, "y");
        this.f1569o = d;
        this.f1572r = this.f1571q;
        this.f1574t = this.f1573s;
        this.f1570p = d;
        this.f1568n = this.f1567m;
        if (C0894y.m1155b(b, "enable_messages") || this.f1580z) {
            z = true;
        }
        this.f1579y = z;
        mo9964i();
    }

    /* renamed from: a */
    public void mo9557a(C0897z0 z0Var) {
        synchronized (this.f1554P) {
            if (this.f1543E) {
                m1059c(z0Var);
            } else {
                this.f1547I.mo10017a(z0Var);
            }
        }
    }

    /* renamed from: a */
    public boolean mo9558a() {
        return !this.f1542D && !this.f1543E;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1048a(C0897z0 z0Var, String str) {
        Context b = C0578a.m141b();
        if (b != null && (b instanceof C0585b)) {
            C0578a.m143c().mo9597d().mo9495a(b, z0Var, str);
        } else if (this.f1575u == 1) {
            new C0580a0.C0581a().mo9419a("Unable to communicate with controller, disabling AdColony.").mo9421a(C0580a0.f191i);
            AdColony.disable();
        } else if (this.f1576v > 0) {
            this.f1579y = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1044a(int i, String str, String str2) {
        if (this.f1550L != null) {
            C0897z0 b = C0894y.m1151b();
            C0894y.m1156b(b, "id", this.f1566l);
            C0894y.m1148a(b, "ad_session_id", this.f1559e);
            C0894y.m1156b(b, "container_id", this.f1550L.mo9450c());
            C0894y.m1156b(b, "code", i);
            C0894y.m1148a(b, "error", str);
            C0894y.m1148a(b, "url", str2);
            new C0645d0("WebView.on_error", this.f1550L.mo9469k(), b).mo9536d();
        }
        new C0580a0.C0581a().mo9419a("onReceivedError: ").mo9419a(str).mo9421a(C0580a0.f192j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9953a(C0645d0 d0Var) {
        C0897z0 b = d0Var.mo9532b();
        this.f1567m = C0894y.m1163d(b, "x");
        this.f1569o = C0894y.m1163d(b, "y");
        this.f1571q = C0894y.m1163d(b, "width");
        this.f1573s = C0894y.m1163d(b, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f1567m, this.f1569o, 0, 0);
        layoutParams.width = this.f1571q;
        layoutParams.height = this.f1573s;
        setLayoutParams(layoutParams);
        if (this.f1580z) {
            C0897z0 b2 = C0894y.m1151b();
            C0894y.m1158b(b2, "success", true);
            C0894y.m1156b(b2, "id", this.f1575u);
            d0Var.mo9530a(b2).mo9536d();
        }
        mo9951E();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9956a(boolean z) {
        this.f1541C = z;
    }
}
