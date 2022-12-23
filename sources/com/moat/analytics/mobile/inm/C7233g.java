package com.moat.analytics.mobile.inm;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moat.analytics.mobile.inm.C7245j;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.moat.analytics.mobile.inm.g */
class C7233g {

    /* renamed from: a */
    WebView f18127a;

    /* renamed from: b */
    C7245j f18128b;

    /* renamed from: c */
    final String f18129c = String.format(Locale.ROOT, "_moatTracker%d", new Object[]{Integer.valueOf((int) (Math.random() * 1.0E8d))});

    /* renamed from: d */
    private final C7238a f18130d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f18131e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f18132f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Runnable f18133g;

    /* renamed from: com.moat.analytics.mobile.inm.g$a */
    enum C7238a {
        DISPLAY,
        f18139b
    }

    C7233g(Context context, C7238a aVar) {
        this.f18130d = aVar;
        WebView webView = new WebView(context);
        this.f18127a = webView;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSaveFormData(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(1);
        }
        try {
            this.f18128b = new C7245j(this.f18127a, aVar == C7238a.f18139b ? C7245j.C7249a.NATIVE_VIDEO : C7245j.C7249a.NATIVE_DISPLAY);
        } catch (C7252m e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: a */
    private static String m18427a(String str, String str2, Integer num, Integer num2, JSONObject jSONObject, Integer num3) {
        return String.format(Locale.ROOT, "<html><head></head><body><div id=\"%s\" style=\"width: %dpx; height: %dpx;\"></div><script>(function initMoatTracking(apiname, pcode, ids, duration) {var events = [];window[pcode + '_moatElToTrack'] = document.getElementById('%s');var moatapi = {'dropTime':%d,'adData': {'ids': ids, 'duration': duration, 'url': 'n/a'},'dispatchEvent': function(ev) {if (this.sendEvent) {if (events) { events.push(ev); ev = events; events = false; }this.sendEvent(ev);} else {events.push(ev);}},'dispatchMany': function(evs){for (var i=0, l=evs.length; i<l; i++) {this.dispatchEvent(evs[i]);}}};Object.defineProperty(window, apiname, {'value': moatapi});var s = document.createElement('script');s.src = 'https://z.moatads.com/' + pcode + '/moatvideo.js?' + apiname + '#' + apiname;document.body.appendChild(s);})('%s', '%s', %s, %s);</script></body></html>", new Object[]{"mianahwvc", num, num2, "mianahwvc", Long.valueOf(System.currentTimeMillis()), str, str2, jSONObject.toString(), num3});
    }

    /* renamed from: b */
    private static String m18431b(String str) {
        return "<!DOCTYPE html>\n<html>\n<head lang=\"en\">\n   <meta charset=\"UTF-8\">\n   <title></title>\n</head>\n<body style=\"margin:0;padding:0;\">\n    <script src=\"https://z.moatads.com/" + str + "/moatad.js\" type=\"text/javascript\"></script>\n</body>\n</html>";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49368a() {
        C7261p.m18544a(3, "GlobalWebView", (Object) this, "Cleaning up");
        this.f18128b.mo49393b();
        this.f18128b = null;
        this.f18127a.destroy();
        this.f18127a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49369a(String str) {
        if (this.f18130d == C7238a.DISPLAY) {
            this.f18127a.setWebViewClient(new WebViewClient() {
                public void onPageFinished(WebView webView, String str) {
                    if (!C7233g.this.f18131e) {
                        try {
                            boolean unused = C7233g.this.f18131e = true;
                            C7233g.this.f18128b.mo49389a();
                        } catch (Exception e) {
                            C7252m.m18508a(e);
                        }
                    }
                }
            });
            this.f18127a.loadData(m18431b(str), WebRequest.CONTENT_TYPE_HTML, "utf-8");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49370a(String str, Map<String, String> map, Integer num, Integer num2, Integer num3) {
        if (this.f18130d == C7238a.f18139b) {
            if (Build.VERSION.SDK_INT >= 19) {
                C7261p.m18544a(3, "GlobalWebView", (Object) this, "Starting off polling interval to check for Video API instance presence");
                this.f18132f = new Handler();
                C72352 r0 = new Runnable() {
                    public void run() {
                        try {
                            if (C7233g.this.f18127a != null && Build.VERSION.SDK_INT >= 19) {
                                WebView webView = C7233g.this.f18127a;
                                webView.evaluateJavascript("typeof " + C7233g.this.f18129c + " !== 'undefined'", new ValueCallback<String>() {
                                    /* renamed from: a */
                                    public void onReceiveValue(String str) {
                                        if ("true".equals(str)) {
                                            C7261p.m18544a(3, "GlobalWebView", (Object) this, String.format("Video API instance %s detected. Flushing event queue", new Object[]{C7233g.this.f18129c}));
                                            try {
                                                boolean unused = C7233g.this.f18131e = true;
                                                C7233g.this.f18128b.mo49389a();
                                                C7233g.this.f18128b.mo49397c(C7233g.this.f18129c);
                                            } catch (Exception e) {
                                                C7252m.m18508a(e);
                                            }
                                        } else {
                                            C7233g.this.f18132f.postDelayed(C7233g.this.f18133g, 200);
                                        }
                                    }
                                });
                            }
                        } catch (Exception e) {
                            C7252m.m18508a(e);
                        }
                    }
                };
                this.f18133g = r0;
                this.f18132f.post(r0);
            } else {
                C7261p.m18544a(3, "GlobalWebView", (Object) this, "Android API version is less than KitKat: " + Build.VERSION.SDK_INT);
                this.f18127a.setWebViewClient(new WebViewClient() {
                    public void onPageFinished(WebView webView, String str) {
                        if (!C7233g.this.f18131e) {
                            C7261p.m18544a(3, "GlobalWebView", (Object) this, "onPageFinished is called for the first time. Flushing event queue");
                            try {
                                boolean unused = C7233g.this.f18131e = true;
                                C7233g.this.f18128b.mo49389a();
                                C7233g.this.f18128b.mo49397c(C7233g.this.f18129c);
                            } catch (Exception e) {
                                C7252m.m18508a(e);
                            }
                        }
                    }
                });
            }
            this.f18127a.loadData(m18427a(this.f18129c, str, num, num2, new JSONObject(map), num3), WebRequest.CONTENT_TYPE_HTML, (String) null);
        }
    }
}
