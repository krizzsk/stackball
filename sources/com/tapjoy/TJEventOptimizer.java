package com.tapjoy;

import android.content.Context;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tapjoy.TapjoyErrorMessage;
import java.util.concurrent.CountDownLatch;

public class TJEventOptimizer extends WebView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f22050a = "TJEventOptimizer";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static TJEventOptimizer f22051b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static CountDownLatch f22052c;

    /* renamed from: d */
    private Context f22053d;

    /* renamed from: e */
    private TJAdUnitJSBridge f22054e;

    /* synthetic */ TJEventOptimizer(Context context, byte b) {
        this(context);
    }

    private TJEventOptimizer(Context context) {
        super(context);
        this.f22053d = context;
        this.f22054e = new TJAdUnitJSBridge(context, (WebView) this);
        getSettings().setJavaScriptEnabled(true);
        setWebViewClient(new C9029b(this, (byte) 0));
        setWebChromeClient(new C9028a(this, (byte) 0));
        loadUrl(TapjoyConnectCore.getHostURL() + TJAdUnitConstants.EVENTS_PROXY_PATH + TapjoyUtil.convertURLParams(TapjoyConnectCore.getGenericURLParams(), true));
    }

    public static void init(final Context context) {
        TapjoyLog.m24273d(f22050a, "Initializing event optimizer");
        f22052c = new CountDownLatch(1);
        TapjoyUtil.runOnMainThread(new Runnable() {
            public final void run() {
                try {
                    TJEventOptimizer unused = TJEventOptimizer.f22051b = new TJEventOptimizer(context, (byte) 0);
                } catch (Exception e) {
                    TapjoyLog.m24278w(TJEventOptimizer.f22050a, e.getMessage());
                }
                TJEventOptimizer.f22052c.countDown();
            }
        });
        f22052c.await();
        if (f22051b == null) {
            throw new RuntimeException("Failed to init TJEventOptimizer");
        }
    }

    public static TJEventOptimizer getInstance() {
        return f22051b;
    }

    /* renamed from: com.tapjoy.TJEventOptimizer$b */
    class C9029b extends WebViewClient {
        private C9029b() {
        }

        /* synthetic */ C9029b(TJEventOptimizer tJEventOptimizer, byte b) {
            this();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            TapjoyLog.m24274e(TJEventOptimizer.f22050a, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error encountered when instantiating a WebViewClient"));
        }

        public final void onPageFinished(WebView webView, String str) {
            TapjoyLog.m24273d(TJEventOptimizer.f22050a, "boostrap html loaded successfully");
        }
    }

    /* renamed from: com.tapjoy.TJEventOptimizer$a */
    class C9028a extends WebChromeClient {
        private C9028a() {
        }

        /* synthetic */ C9028a(TJEventOptimizer tJEventOptimizer, byte b) {
            this();
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String a = TJEventOptimizer.f22050a;
            TapjoyLog.m24273d(a, "JS CONSOLE: " + consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }
    }
}
