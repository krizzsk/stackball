package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.p008a.C1005b;
import com.applovin.impl.p008a.C1013i;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1375b;
import com.applovin.impl.sdk.p026c.C1382d;
import com.applovin.impl.sdk.utils.C1512a;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.applovin.impl.adview.d */
class C1079d extends WebViewClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1469j f1925a;

    /* renamed from: b */
    private final C1505q f1926b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AdViewControllerImpl f1927c;

    public C1079d(AdViewControllerImpl adViewControllerImpl, C1469j jVar) {
        this.f1925a = jVar;
        this.f1926b = jVar.mo13139v();
        this.f1927c = adViewControllerImpl;
    }

    /* renamed from: a */
    private void m1583a() {
        this.f1927c.mo11748a();
    }

    /* renamed from: a */
    private void m1584a(PointF pointF) {
        this.f1927c.expandAd(pointF);
    }

    /* renamed from: a */
    private void m1585a(Uri uri, C1072c cVar) {
        String str;
        C1505q qVar;
        final String queryParameter = uri.getQueryParameter("n");
        if (C1553o.m3554b(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                C1505q qVar2 = this.f1926b;
                qVar2.mo13277b("AdWebView", "Loading new page externally: " + queryParameter);
                C1557r.m3608a(cVar.getContext(), Uri.parse(queryParameter), this.f1925a);
                C1522j.m3518c(this.f1927c.getAdViewEventListener(), (AppLovinAd) this.f1927c.getCurrentAd(), this.f1927c.getParentView());
                return;
            } else if (TapjoyConstants.LOG_LEVEL_INTERNAL.equalsIgnoreCase(queryParameter2)) {
                C1505q qVar3 = this.f1926b;
                qVar3.mo13277b("AdWebView", "Loading new page in WebView: " + queryParameter);
                cVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (C1553o.m3554b(queryParameter3)) {
                    cVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
                C1505q qVar4 = this.f1926b;
                qVar4.mo13277b("AdWebView", "Loading new page in slide-up webview: " + queryParameter);
                this.f1925a.mo13086Z().mo12602a(new C1512a() {
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, (AppLovinWebViewActivity.EventListener) null);
                            C1522j.m3499a(C1079d.this.f1927c.getAdViewEventListener(), (AppLovinAd) C1079d.this.f1927c.getCurrentAd(), C1079d.this.f1927c.getParentView());
                        }
                    }

                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            C1522j.m3514b(C1079d.this.f1927c.getAdViewEventListener(), (AppLovinAd) C1079d.this.f1927c.getCurrentAd(), C1079d.this.f1927c.getParentView());
                            C1079d.this.f1925a.mo13086Z().mo12604b(this);
                        }
                    }
                });
                Intent intent = new Intent(this.f1925a.mo13065D(), AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1925a.mo13136t());
                intent.setFlags(268435456);
                this.f1925a.mo13065D().startActivity(intent);
                return;
            } else {
                qVar = this.f1926b;
                str = "Could not find load type in original uri";
            }
        } else {
            qVar = this.f1926b;
            str = "Could not find url to load from query in original uri";
        }
        qVar.mo13281e("AdWebView", str);
    }

    /* renamed from: a */
    private void m1586a(C1000a aVar, C1072c cVar) {
        C1005b m = aVar.mo11678m();
        if (m != null) {
            C1013i.m1372a(m.mo11696c(), this.f1927c.getSdk());
            m1587a(cVar, m.mo11694a());
        }
    }

    /* renamed from: a */
    private void m1587a(C1072c cVar, Uri uri) {
        C1355g currentAd = cVar.getCurrentAd();
        AppLovinAdView parentView = this.f1927c.getParentView();
        if (parentView == null || currentAd == null) {
            C1505q qVar = this.f1926b;
            qVar.mo13281e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
            return;
        }
        C1382d statsManagerHelper = cVar.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.mo12900b();
        }
        this.f1927c.mo11750a(currentAd, parentView, uri, cVar.getAndClearLastClickLocation());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0114, code lost:
        if (r6.mo11657aQ() != false) goto L_0x00a5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1588a(android.webkit.WebView r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            com.applovin.impl.sdk.q r0 = r8.f1926b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Processing click on ad URL \""
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "\""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "AdWebView"
            r0.mo13279c(r2, r1)
            r0 = 1
            if (r10 == 0) goto L_0x011d
            boolean r1 = r9 instanceof com.applovin.impl.adview.C1072c
            if (r1 == 0) goto L_0x011d
            android.net.Uri r1 = android.net.Uri.parse(r10)
            com.applovin.impl.adview.c r9 = (com.applovin.impl.adview.C1072c) r9
            java.lang.String r3 = r1.getScheme()
            java.lang.String r4 = r1.getHost()
            java.lang.String r5 = r1.getPath()
            com.applovin.impl.adview.AdViewControllerImpl r6 = r8.f1927c
            com.applovin.impl.sdk.ad.g r6 = r6.getCurrentAd()
            if (r6 != 0) goto L_0x0046
            com.applovin.impl.sdk.q r9 = r8.f1926b
            java.lang.String r10 = "Unable to process click, ad not found!"
            r9.mo13281e(r2, r10)
            return r0
        L_0x0046:
            java.lang.String r7 = "applovin"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x00df
            java.lang.String r7 = "com.applovin.sdk"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x00df
            java.lang.String r11 = "/adservice/close_ad"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0063
            r8.m1583a()
            goto L_0x011d
        L_0x0063:
            java.lang.String r11 = "/adservice/expand_ad"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0074
            android.graphics.PointF r9 = r9.getAndClearLastClickLocation()
            r8.m1584a((android.graphics.PointF) r9)
            goto L_0x011d
        L_0x0074:
            java.lang.String r11 = "/adservice/contract_ad"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0081
            r8.m1590b()
            goto L_0x011d
        L_0x0081:
            java.lang.String r11 = "/adservice/no_op"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x008a
            return r0
        L_0x008a:
            java.lang.String r11 = "/adservice/load_url"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0097
            r8.m1585a((android.net.Uri) r1, (com.applovin.impl.adview.C1072c) r9)
            goto L_0x011d
        L_0x0097:
            java.lang.String r11 = "/adservice/track_click_now"
            boolean r1 = r11.equals(r5)
            if (r1 == 0) goto L_0x00b2
            boolean r10 = r6 instanceof com.applovin.impl.p008a.C1000a
            if (r10 == 0) goto L_0x00aa
            com.applovin.impl.a.a r6 = (com.applovin.impl.p008a.C1000a) r6
        L_0x00a5:
            r8.m1586a((com.applovin.impl.p008a.C1000a) r6, (com.applovin.impl.adview.C1072c) r9)
            goto L_0x011d
        L_0x00aa:
            android.net.Uri r10 = android.net.Uri.parse(r11)
            r8.m1587a((com.applovin.impl.adview.C1072c) r9, (android.net.Uri) r10)
            goto L_0x011d
        L_0x00b2:
            com.applovin.impl.sdk.q r9 = r8.f1926b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Unknown URL: "
            r11.append(r1)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.mo13280d(r2, r10)
            com.applovin.impl.sdk.q r9 = r8.f1926b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Path: "
            r10.append(r11)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            r9.mo13280d(r2, r10)
            goto L_0x011d
        L_0x00df:
            if (r11 == 0) goto L_0x011b
            java.util.List r10 = r6.mo12777aG()
            java.util.List r11 = r6.mo12778aH()
            boolean r5 = r10.isEmpty()
            if (r5 != 0) goto L_0x00f5
            boolean r10 = r10.contains(r3)
            if (r10 == 0) goto L_0x0102
        L_0x00f5:
            boolean r10 = r11.isEmpty()
            if (r10 != 0) goto L_0x010a
            boolean r10 = r11.contains(r4)
            if (r10 == 0) goto L_0x0102
            goto L_0x010a
        L_0x0102:
            com.applovin.impl.sdk.q r9 = r8.f1926b
            java.lang.String r10 = "URL is not whitelisted - bypassing click"
            r9.mo13281e(r2, r10)
            goto L_0x011d
        L_0x010a:
            boolean r10 = r6 instanceof com.applovin.impl.p008a.C1000a
            if (r10 == 0) goto L_0x0117
            com.applovin.impl.a.a r6 = (com.applovin.impl.p008a.C1000a) r6
            boolean r10 = r6.mo11657aQ()
            if (r10 == 0) goto L_0x0117
            goto L_0x00a5
        L_0x0117:
            r8.m1587a((com.applovin.impl.adview.C1072c) r9, (android.net.Uri) r1)
            goto L_0x011d
        L_0x011b:
            r9 = 0
            return r9
        L_0x011d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C1079d.m1588a(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    /* renamed from: b */
    private void m1590b() {
        this.f1927c.contractAd();
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        C1505q qVar = this.f1926b;
        qVar.mo13279c("AdWebView", "Loaded resource: " + str);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f1927c.onAdHtmlLoaded(webView);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C1355g currentAd = this.f1927c.getCurrentAd();
        String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
        this.f1925a.mo13083W().mo12885a((AppLovinAdBase) currentAd).mo12895a(C1375b.f3212z, str3).mo12896a();
        this.f1926b.mo13281e("AdWebView", str3 + " for ad: " + currentAd);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1355g currentAd = this.f1927c.getCurrentAd();
        this.f1925a.mo13083W().mo12885a((AppLovinAdBase) currentAd).mo12893a(C1375b.f3182A).mo12896a();
        C1505q qVar = this.f1926b;
        qVar.mo13281e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + currentAd);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1355g currentAd = this.f1927c.getCurrentAd();
        String str = "Received SSL error: " + sslError;
        this.f1925a.mo13083W().mo12885a((AppLovinAdBase) currentAd).mo12895a(C1375b.f3184C, str).mo12896a();
        this.f1926b.mo13281e("AdWebView", str + " for ad: " + currentAd);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1505q.m3345i("AdWebView", "Render process gone for ad: " + this.f1927c.getCurrentAd() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        C1355g currentAd = this.f1927c.getCurrentAd();
        if (currentAd != null) {
            this.f1925a.mo13083W().mo12885a((AppLovinAdBase) currentAd).mo12893a(C1375b.f3183B).mo12896a();
        }
        if (!((Boolean) this.f1925a.mo13088a(C1369c.f3120fb)).booleanValue()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        if (webView == null || !webView.equals(this.f1927c.getAdWebView())) {
            return true;
        }
        this.f1927c.destroy();
        AppLovinAdSize size = this.f1927c.getSize();
        if (!C1557r.m3611a(size)) {
            return true;
        }
        this.f1927c.attachNewAdView(size);
        this.f1927c.resume();
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean hasGesture = ((Boolean) this.f1925a.mo13088a(C1369c.f2934bX)).booleanValue() ? webResourceRequest.hasGesture() : true;
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return m1588a(webView, url.toString(), hasGesture);
        }
        this.f1926b.mo13281e("AdWebView", "No url found for request");
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m1588a(webView, str, true);
    }
}
