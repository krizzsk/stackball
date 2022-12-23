package com.inmobi.media;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.chartboost.sdk.CBLocation;
import com.inmobi.media.C5294fz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.n */
/* compiled from: RenderViewClient */
final class C5433n extends WebViewClient {

    /* renamed from: b */
    private static final String f12503b = C5433n.class.getSimpleName();

    /* renamed from: a */
    short f12504a = -1;

    /* renamed from: c */
    private List<String> f12505c = new ArrayList();

    /* renamed from: d */
    private boolean f12506d = false;

    /* renamed from: e */
    private boolean f12507e;

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    C5433n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40939a() {
        this.f12505c.clear();
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!(webView instanceof C5415m) || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        C5415m mVar = (C5415m) webView;
        String uri = webResourceRequest.getUrl().toString();
        if (mVar.f12464i) {
            webView.loadUrl(uri);
            return true;
        } else if (mVar.mo40888j() || mVar.f12458c || "about:blank".equals(uri)) {
            mVar.getPlacementType();
            if (1 != mVar.getPlacementType()) {
                if (C5325gu.m12256a(mVar.getContainerContext(), uri, (String) null) != null) {
                    mVar.getListener().mo40818d();
                }
                return true;
            } else if (mVar.f12458c && C5325gu.m12259a(uri)) {
                return false;
            } else {
                if (C5325gu.m12256a(mVar.getContainerContext(), uri, (String) null) != null) {
                    mVar.getListener().mo40818d();
                }
                return true;
            }
        } else {
            mVar.mo40859d("redirect");
            return true;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!(webView instanceof C5415m)) {
            return false;
        }
        C5415m mVar = (C5415m) webView;
        if (mVar.f12464i) {
            webView.loadUrl(str);
            return true;
        } else if (mVar.mo40888j() || mVar.f12458c || "about:blank".equals(str)) {
            mVar.getPlacementType();
            if (1 != mVar.getPlacementType()) {
                if (C5325gu.m12256a(mVar.getContainerContext(), str, (String) null) != null) {
                    mVar.getListener().mo40818d();
                }
                return true;
            } else if (mVar.f12458c && C5325gu.m12259a(str)) {
                return false;
            } else {
                if (C5325gu.m12256a(mVar.getContainerContext(), str, (String) null) != null) {
                    mVar.getListener().mo40818d();
                }
                return true;
            }
        } else {
            mVar.mo40859d("redirect");
            return true;
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof C5415m) {
            this.f12506d = false;
            ((C5415m) webView).setAndUpdateViewState("Loading");
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (webView instanceof C5415m) {
            C5415m mVar = (C5415m) webView;
            if (this.f12505c.contains(str) && !this.f12506d) {
                this.f12506d = true;
                mVar.mo40860e(mVar.getMraidJsString());
            }
            if ("Loading".equals(mVar.getViewState())) {
                mVar.getListener().mo40810a(mVar);
                mVar.mo40860e("window.imaiview.broadcastEvent('ready');");
                mVar.mo40860e("window.mraidview.broadcastEvent('ready');");
                mVar.setAndUpdateViewState(mVar.getOriginalRenderView() == null ? CBLocation.LOCATION_DEFAULT : "Expanded");
            }
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str.matches("(.*)phpserver/db(.*)")) {
            Intent intent = new Intent(C5294fz.C5295a.NETWORK_REQUEST_RESPONSE.toString());
            intent.putExtra("url", str);
            C5294fz.m12116a(intent);
        }
        if (webView instanceof C5415m) {
            C5415m mVar = (C5415m) webView;
            String url = mVar.getUrl();
            if (str != null && url != null && str.contains("/mraid.js") && !"about:blank".equals(url) && !url.startsWith("file:")) {
                if (!this.f12505c.contains(url)) {
                    this.f12505c.add(url);
                }
                if (!this.f12506d) {
                    this.f12506d = true;
                    mVar.mo40860e(mVar.getMraidJsString());
                }
            }
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        StringBuilder sb = new StringBuilder("Loading error. Error code:");
        sb.append(webResourceError.getErrorCode());
        sb.append(" Error msg:");
        sb.append(webResourceError.getDescription());
        sb.append(" Failing url:");
        sb.append(webResourceRequest.getUrl());
    }

    /* renamed from: a */
    private void m12728a(WebView webView) {
        short s = this.f12504a;
        if (-1 == s) {
            return;
        }
        if (s > 0) {
            this.f12504a = (short) (s - 1);
        } else if (!this.f12507e) {
            new Handler(Looper.getMainLooper()).post(new C5414l(webView));
            this.f12507e = true;
            if (webView instanceof C5415m) {
                C5415m mVar = (C5415m) webView;
                HashMap hashMap = new HashMap();
                hashMap.put("creativeId", mVar.f12475t);
                hashMap.put("impressionId", mVar.getImpressionId());
                mVar.mo40852a("NetworkLoadLimitExceeded", (Map<String, Object>) hashMap);
            }
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (Build.VERSION.SDK_INT < 21) {
            m12728a(webView);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        m12728a(webView);
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (Build.VERSION.SDK_INT < 26 || !(webView instanceof C5415m)) {
            return false;
        }
        C5327gw.m12263a((byte) 1, f12503b, "WebView crash detected, destroying ad");
        webView.destroy();
        return true;
    }
}
