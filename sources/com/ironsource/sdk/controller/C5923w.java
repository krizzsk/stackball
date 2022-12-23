package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.security.CertificateUtil;
import com.inmobi.media.C5073cj;
import com.ironsource.environment.C5505a;
import com.ironsource.environment.C5517c;
import com.ironsource.environment.C5527g;
import com.ironsource.mediationsdk.C5710l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.p133c.C5499a;
import com.ironsource.sdk.controller.C5863f;
import com.ironsource.sdk.controller.C5894k;
import com.ironsource.sdk.controller.C5896l;
import com.ironsource.sdk.controller.C5914q;
import com.ironsource.sdk.controller.C5916r;
import com.ironsource.sdk.controller.C5920u;
import com.ironsource.sdk.p143a.C5821a;
import com.ironsource.sdk.p143a.C5822b;
import com.ironsource.sdk.p143a.C5825d;
import com.ironsource.sdk.p143a.C5827f;
import com.ironsource.sdk.p145c.C5837a;
import com.ironsource.sdk.p145c.C5844d;
import com.ironsource.sdk.p145c.C5846e;
import com.ironsource.sdk.p147e.p148a.C5998a;
import com.ironsource.sdk.p149f.C6001a;
import com.ironsource.sdk.p150g.C6004a;
import com.ironsource.sdk.p150g.C6005b;
import com.ironsource.sdk.p150g.C6007c;
import com.ironsource.sdk.p150g.C6008d;
import com.ironsource.sdk.p150g.C6014e;
import com.ironsource.sdk.p150g.C6015f;
import com.ironsource.sdk.p151h.C6016a;
import com.ironsource.sdk.p151h.C6017b;
import com.ironsource.sdk.p151h.C6020c;
import com.ironsource.sdk.p153j.C6033e;
import com.ironsource.sdk.p153j.C6035g;
import com.ironsource.sdk.p153j.p154a.C6026a;
import com.ironsource.sdk.p153j.p154a.C6027b;
import com.ironsource.sdk.p153j.p154a.C6028c;
import com.ironsource.sdk.p153j.p154a.C6029d;
import com.ironsource.sdk.p155k.C6037b;
import com.ironsource.sdk.p155k.C6041c;
import com.ironsource.sdk.service.C6049a;
import com.ironsource.sdk.service.C6051c;
import com.ironsource.sdk.service.C6052d;
import com.ironsource.sdk.service.Connectivity.C6044b;
import com.ironsource.sdk.utils.C6058a;
import com.ironsource.sdk.utils.C6059b;
import com.ironsource.sdk.utils.C6062d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.ReportDBAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.w */
public class C5923w extends WebView implements DownloadListener, C5898m, C6041c {
    /* access modifiers changed from: private */

    /* renamed from: ab */
    public static String f14474ab = "success";
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public static String f14475ac = "fail";

    /* renamed from: b */
    public static String f14476b = "is_store";

    /* renamed from: c */
    public static String f14477c = "external_url";

    /* renamed from: d */
    public static String f14478d = "secondary_web_view";

    /* renamed from: z */
    private static int f14479z;

    /* renamed from: A */
    private final String f14480A = "We're sorry, some error occurred. we will investigate it";
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f14481B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public String f14482C;

    /* renamed from: D */
    private Map<String, String> f14483D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C6037b f14484E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f14485F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f14486G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public CountDownTimer f14487H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f14488I = 50;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f14489J = 50;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public String f14490K = C5073cj.DEFAULT_POSITION;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public FrameLayout f14491L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public WebChromeClient.CustomViewCallback f14492M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C6029d f14493N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C6028c f14494O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C6033e f14495P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C6027b f14496Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public Boolean f14497R = null;

    /* renamed from: S */
    private Object f14498S = new Object();

    /* renamed from: T */
    private Handler f14499T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public boolean f14500U = false;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C5893j f14501V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public C5862e f14502W;
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public String f14503a = C5923w.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public C6044b f14504aa;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public C5940b f14505e;

    /* renamed from: f */
    public CountDownTimer f14506f;

    /* renamed from: g */
    C5939a f14507g;
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public View f14508h;
    /* access modifiers changed from: package-private */

    /* renamed from: i */
    public FrameLayout f14509i;
    /* access modifiers changed from: package-private */

    /* renamed from: j */
    public C5973g f14510j;

    /* renamed from: k */
    String f14511k;
    /* access modifiers changed from: package-private */

    /* renamed from: l */
    public String f14512l;
    /* access modifiers changed from: package-private */

    /* renamed from: m */
    public C5863f f14513m;
    /* access modifiers changed from: package-private */

    /* renamed from: n */
    public C5922v f14514n;
    /* access modifiers changed from: package-private */

    /* renamed from: o */
    public C6005b f14515o;
    /* access modifiers changed from: package-private */

    /* renamed from: p */
    public C5914q f14516p;
    /* access modifiers changed from: package-private */

    /* renamed from: q */
    public C5916r f14517q;
    /* access modifiers changed from: package-private */

    /* renamed from: r */
    public C5920u f14518r;
    /* access modifiers changed from: package-private */

    /* renamed from: s */
    public C5894k f14519s;
    /* access modifiers changed from: package-private */

    /* renamed from: t */
    public C5856a f14520t;
    /* access modifiers changed from: package-private */

    /* renamed from: u */
    public C5896l f14521u;

    /* renamed from: v */
    C5977x f14522v;

    /* renamed from: w */
    C5860c f14523w;
    /* access modifiers changed from: package-private */

    /* renamed from: x */
    public C6035g f14524x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f14525y = IronSourceConstants.IRONSOURCE_CONFIG_NAME;

    /* renamed from: com.ironsource.sdk.controller.w$a */
    class C5939a extends WebChromeClient {
        private C5939a() {
        }

        /* synthetic */ C5939a(C5923w wVar, byte b) {
            this();
        }

        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(C5923w.this.f14523w.mo42245a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.m14957i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new C5941c(C5923w.this, (byte) 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.m14957i("onCreateWindow", "onCreateWindow");
            return true;
        }

        public final void onHideCustomView() {
            Logger.m14957i("Test", "onHideCustomView");
            if (C5923w.this.f14508h != null) {
                C5923w.this.f14508h.setVisibility(8);
                C5923w.this.f14491L.removeView(C5923w.this.f14508h);
                View unused = C5923w.this.f14508h = null;
                C5923w.this.f14491L.setVisibility(8);
                C5923w.this.f14492M.onCustomViewHidden();
                C5923w.this.setVisibility(0);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.m14957i("Test", "onShowCustomView");
            C5923w.this.setVisibility(8);
            if (C5923w.this.f14508h != null) {
                Logger.m14957i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.m14957i("Test", "mCustomView == null");
            C5923w.this.f14491L.addView(view);
            View unused = C5923w.this.f14508h = view;
            WebChromeClient.CustomViewCallback unused2 = C5923w.this.f14492M = customViewCallback;
            C5923w.this.f14491L.setVisibility(0);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$b */
    static class C5940b {

        /* renamed from: a */
        C6008d.C6013e f14553a;

        /* renamed from: b */
        String f14554b;

        public C5940b(C6008d.C6013e eVar, String str) {
            this.f14553a = eVar;
            this.f14554b = str;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$c */
    class C5941c extends WebViewClient {
        private C5941c() {
        }

        /* synthetic */ C5941c(C5923w wVar, byte b) {
            this();
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b = C5923w.this.f14503a;
            Logger.m14955e(b, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a = C5923w.this.f14523w.mo42245a();
            Intent intent = new Intent(a, OpenUrlActivity.class);
            intent.putExtra(C5923w.f14477c, str);
            intent.putExtra(C5923w.f14478d, false);
            a.startActivity(intent);
            return true;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$d */
    public class C5942d {

        /* renamed from: com.ironsource.sdk.controller.w$d$a */
        public class C5970a {
            public C5970a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo42467a(boolean z, String str, C6015f fVar) {
                fVar.mo42559a(z ? C5923w.f14474ab : C5923w.f14475ac, str);
                C5923w.m14629a(C5923w.this, fVar.toString(), z, (String) null, (String) null);
            }

            /* renamed from: a */
            public final void mo42468a(boolean z, String str, JSONObject jSONObject) {
                String str2;
                if (z) {
                    try {
                        str2 = C5923w.f14474ab;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        e.getMessage();
                        return;
                    }
                } else {
                    str2 = C5923w.f14475ac;
                }
                jSONObject.put(str2, str);
                C5923w.m14629a(C5923w.this, jSONObject.toString(), z, (String) null, (String) null);
            }
        }

        public C5942d() {
        }

        /* renamed from: a */
        private void m14731a(String str, boolean z) {
            C6007c a = C5923w.this.f14501V.mo42310a(C6008d.C6013e.Interstitial, str);
            if (a != null) {
                a.f14741f = z;
            }
        }

        /* renamed from: a */
        private void m14732a(JSONObject jSONObject) {
            try {
                FeaturesManager instance = FeaturesManager.getInstance();
                if (!instance.mo42222a().isEmpty()) {
                    jSONObject.put("nativeFeatures", new JSONArray(instance.mo42222a()));
                }
            } catch (Exception e) {
                C5825d.m14394a(C5827f.f14173n, (Map<String, Object>) new C5821a().mo42154a("callfailreason", e.getMessage()).f14151a);
                Logger.m14953d(C5923w.this.f14503a, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        /* renamed from: a */
        private void m14733a(JSONObject jSONObject, String str) {
            if (m14734a(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.m14953d(C5923w.this.f14503a, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* renamed from: a */
        private static boolean m14734a(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return !jSONObject.getString("testerABGroup").isEmpty() && !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        private void m14735b(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", C5923w.this.f14513m.mo42258e());
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "adClicked(" + str + ")");
            C6015f fVar = new C6015f(str);
            String d = fVar.mo42564d("productType");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                final C6008d.C6013e e = C5923w.m14660h(d);
                final C6026a a = C5923w.this.m14636b(e);
                if (e != null && a != null) {
                    C5923w.this.mo42337a((Runnable) new Runnable() {
                        public final void run() {
                            a.mo42508b(e, fetchDemandSourceId);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adCredited(String str) {
            final String str2;
            final boolean z;
            final boolean z2;
            C6007c a;
            Log.d(C5923w.this.f14525y, "adCredited(" + str + ")");
            C6015f fVar = new C6015f(str);
            String d = fVar.mo42564d("credits");
            boolean z3 = false;
            final int parseInt = d != null ? Integer.parseInt(d) : 0;
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            final String d2 = fVar.mo42564d("productType");
            if (TextUtils.isEmpty(d2)) {
                Log.d(C5923w.this.f14525y, "adCredited | product type is missing");
            }
            if (!C6008d.C6013e.Interstitial.toString().equalsIgnoreCase(d2)) {
                String d3 = fVar.mo42564d("total");
                final int parseInt2 = d3 != null ? Integer.parseInt(d3) : 0;
                if (!C6008d.C6013e.OfferWall.toString().equalsIgnoreCase(d2)) {
                    str2 = null;
                    z2 = false;
                    z = false;
                } else if (fVar.mo42562b(InAppPurchaseMetaData.KEY_SIGNATURE) || fVar.mo42562b("timestamp") || fVar.mo42562b("totalCreditsFlag")) {
                    C5923w.m14629a(C5923w.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", (String) null);
                    return;
                } else {
                    if (fVar.mo42564d(InAppPurchaseMetaData.KEY_SIGNATURE).equalsIgnoreCase(SDKUtils.getMD5(d3 + C5923w.this.f14481B + C5923w.this.f14482C))) {
                        z3 = true;
                    } else {
                        C5923w.m14629a(C5923w.this, str, false, "Controller signature is not equal to SDK signature", (String) null);
                    }
                    boolean e = fVar.mo42565e("totalCreditsFlag");
                    str2 = fVar.mo42564d("timestamp");
                    z = e;
                    z2 = z3;
                }
                if (C5923w.this.mo42340a(d2)) {
                    final String str3 = str;
                    C5923w.this.mo42337a((Runnable) new Runnable() {
                        public final void run() {
                            if (d2.equalsIgnoreCase(C6008d.C6013e.RewardedVideo.toString())) {
                                C5923w.this.f14493N.mo42495a(fetchDemandSourceId, parseInt);
                            } else if (d2.equalsIgnoreCase(C6008d.C6013e.OfferWall.toString()) && z2 && C5923w.this.f14495P.onOWAdCredited(parseInt, parseInt2, z) && !TextUtils.isEmpty(str2)) {
                                if (C6059b.m14967a().mo42613a(str2, C5923w.this.f14481B, C5923w.this.f14482C)) {
                                    C5923w.m14629a(C5923w.this, str3, true, (String) null, (String) null);
                                } else {
                                    C5923w.m14629a(C5923w.this, str3, false, "Time Stamp could not be stored", (String) null);
                                }
                            }
                        }
                    });
                }
            } else if (C5923w.this.mo42340a(C6008d.C6013e.Interstitial.toString()) && (a = C5923w.this.f14501V.mo42310a(C6008d.C6013e.Interstitial, fetchDemandSourceId)) != null) {
                if (a.f14739d != null && a.f14739d.containsKey("rewarded")) {
                    z3 = Boolean.parseBoolean(a.f14739d.get("rewarded"));
                }
                if (z3) {
                    C5923w.this.mo42337a((Runnable) new Runnable() {
                        public final void run() {
                            C5923w.this.f14494O.mo42510b(fetchDemandSourceId, parseInt);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "adUnitsReady(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C6015f(str));
            final C6004a aVar = new C6004a(str);
            if (!aVar.f14717c) {
                C5923w.m14629a(C5923w.this, str, false, "Num Of Ad Units Do Not Exist", (String) null);
                return;
            }
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            String str2 = aVar.f14715a;
            if (C6008d.C6013e.RewardedVideo.toString().equalsIgnoreCase(str2) && C5923w.this.mo42340a(str2)) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        if (Integer.parseInt(aVar.f14716b) > 0) {
                            Log.d(C5923w.this.f14503a, "onRVInitSuccess()");
                            C5923w.this.f14493N.mo42491a(C6008d.C6013e.RewardedVideo, fetchDemandSourceId, aVar);
                            return;
                        }
                        C5923w.this.f14493N.mo42509b(fetchDemandSourceId);
                    }
                });
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String b = C5923w.this.f14503a;
                Logger.m14957i(b, "adViewAPI(" + str + ")");
                C5923w.this.f14520t.mo42241a(new C6015f(str).toString(), new C5970a());
            } catch (Exception e) {
                e.printStackTrace();
                String b2 = C5923w.this.f14503a;
                Logger.m14957i(b2, "adViewAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.m14955e(C5923w.this.f14503a, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                C6059b a = C6059b.m14967a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a.f14852a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a.f14852a.edit();
                for (String str2 : strArr) {
                    if (C6059b.m14969b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                C6015f fVar = new C6015f(str);
                if (!arrayList.isEmpty()) {
                    fVar.mo42559a("removedAdsLastUpdateTime", arrayList.toString());
                }
                C5923w.m14629a(C5923w.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                C5923w.m14629a(C5923w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String b = C5923w.this.f14503a;
                Logger.m14957i(b, "deleteFile(" + str + ")");
                C6015f fVar = new C6015f(str);
                String d = fVar.mo42564d("file");
                String d2 = fVar.mo42564d("path");
                if (d2 != null) {
                    if (!TextUtils.isEmpty(d)) {
                        C6020c cVar = new C6020c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C5923w.this.f14512l, d2), d);
                        if (!cVar.exists()) {
                            C5923w.m14629a(C5923w.this, str, false, "File not exist", "1");
                            return;
                        }
                        C5923w.m14629a(C5923w.this, str, IronSourceStorageUtils.deleteFile(cVar), (String) null, (String) null);
                        return;
                    }
                }
                C5923w.m14629a(C5923w.this, str, false, "Missing parameters for file", "1");
            } catch (Exception e) {
                C5923w.m14629a(C5923w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String b = C5923w.this.f14503a;
                Logger.m14957i(b, "deleteFolder(" + str + ")");
                String d = new C6015f(str).mo42564d("path");
                if (d == null) {
                    C5923w.m14629a(C5923w.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                C6020c cVar = new C6020c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C5923w.this.f14512l, d));
                if (!cVar.exists()) {
                    C5923w.m14629a(C5923w.this, str, false, "Folder not exist", "1");
                    return;
                }
                C5923w.m14629a(C5923w.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), (String) null, (String) null);
            } catch (Exception e) {
                C5923w.m14629a(C5923w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String b = C5923w.this.f14503a;
                Logger.m14957i(b, "deviceDataAPI(" + str + ")");
                C6015f fVar = new C6015f(str);
                C5894k J = C5923w.this.f14519s;
                String fVar2 = fVar.toString();
                C5970a aVar = new C5970a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C5894k.C5895a aVar2 = new C5894k.C5895a((byte) 0);
                aVar2.f14401a = jSONObject.optString("deviceDataFunction");
                aVar2.f14402b = jSONObject.optJSONObject("deviceDataParams");
                aVar2.f14403c = jSONObject.optString("success");
                aVar2.f14404d = jSONObject.optString("fail");
                if ("getDeviceData".equals(aVar2.f14401a)) {
                    String str2 = aVar2.f14403c;
                    C6015f fVar3 = new C6015f();
                    fVar3.mo42559a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(C5527g.m13143d())));
                    fVar3.mo42559a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(C5527g.m13145e(J.f14400a))));
                    fVar3.mo42559a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(C5527g.m13148f(J.f14400a))));
                    fVar3.mo42559a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(C5527g.m13149g(J.f14400a))));
                    fVar3.mo42559a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(C5527g.m13152h(J.f14400a))));
                    fVar3.mo42559a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(C5527g.m13154i(J.f14400a))));
                    aVar.mo42467a(true, str2, fVar3);
                    return;
                }
                String str3 = C5894k.f14399b;
                Logger.m14957i(str3, "unhandled API request " + fVar2);
            } catch (Exception e) {
                e.printStackTrace();
                String b2 = C5923w.this.f14503a;
                Logger.m14957i(b2, "deviceDataAPI failed with exception " + e.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            int i;
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "displayWebView(" + str + ")");
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C6015f fVar = new C6015f(str);
            boolean booleanValue = ((Boolean) fVar.mo42563c("display")).booleanValue();
            String d = fVar.mo42564d("productType");
            boolean e = fVar.mo42565e("standaloneView");
            String d2 = fVar.mo42564d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            boolean e2 = fVar.mo42565e("ctrWVPauseResume");
            if (booleanValue) {
                boolean unused = C5923w.this.f14500U = fVar.mo42565e("immersive");
                boolean e3 = fVar.mo42565e("activityThemeTranslucent");
                if (C5923w.this.f14510j != C5973g.Display) {
                    C5923w.this.f14510j = C5973g.Display;
                    String b2 = C5923w.this.f14503a;
                    Logger.m14957i(b2, "State: " + C5923w.this.f14510j);
                    Activity a = C5923w.this.f14523w.mo42245a();
                    String str2 = C5923w.this.f14511k;
                    int l = C5527g.m13160l(a);
                    if (e) {
                        C5890i iVar = new C5890i(a);
                        iVar.addView(C5923w.this.f14509i);
                        iVar.f14393b = C5923w.this;
                        iVar.f14393b.f14524x = iVar;
                        iVar.f14393b.requestFocus();
                        iVar.f14392a = iVar.f14393b.f14523w.mo42245a();
                        if (((((Activity) iVar.f14392a).getWindow().getAttributes().flags & 1024) != 0) || (i = iVar.mo42304a()) <= 0) {
                            i = 0;
                        }
                        int b3 = iVar.mo42305b();
                        try {
                            if (iVar.f14392a != null) {
                                int p = C5527g.m13167p(iVar.f14392a);
                                if (p == 1) {
                                    iVar.setPadding(0, i, 0, b3);
                                } else if (p == 2) {
                                    iVar.setPadding(0, i, b3, 0);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        ((Activity) iVar.f14392a).runOnUiThread(new Runnable() {
                            public final void run(
/*
Method generation error in method: com.ironsource.sdk.controller.i.1.run():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.i.1.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                        return;
                    }
                    Intent intent = e3 ? new Intent(a, InterstitialActivity.class) : new Intent(a, ControllerActivity.class);
                    if (C6008d.C6013e.RewardedVideo.toString().equalsIgnoreCase(d)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(C5527g.m13164n(a));
                        }
                        intent.putExtra("productType", C6008d.C6013e.RewardedVideo.toString());
                        C5923w.this.f14515o.f14725e = C6008d.C6013e.RewardedVideo.ordinal();
                        C5923w.this.f14515o.f14723c = fetchDemandSourceId;
                        if (C5923w.this.mo42340a(C6008d.C6013e.RewardedVideo.toString())) {
                            C5923w.this.f14493N.mo42514c(C6008d.C6013e.RewardedVideo, fetchDemandSourceId);
                        }
                    } else if (C6008d.C6013e.OfferWall.toString().equalsIgnoreCase(d)) {
                        intent.putExtra("productType", C6008d.C6013e.OfferWall.toString());
                        C5923w.this.f14515o.f14725e = C6008d.C6013e.OfferWall.ordinal();
                    } else if (C6008d.C6013e.Interstitial.toString().equalsIgnoreCase(d)) {
                        if ("application".equals(str2)) {
                            str2 = SDKUtils.translateRequestedOrientation(C5527g.m13164n(a));
                        }
                        intent.putExtra("productType", C6008d.C6013e.Interstitial.toString());
                    }
                    if (d2 != null) {
                        intent.putExtra("adViewId", d2);
                    }
                    intent.putExtra("ctrWVPauseResume", e2);
                    intent.setFlags(536870912);
                    intent.putExtra("immersive", C5923w.this.f14500U);
                    intent.putExtra("orientation_set_flag", str2);
                    intent.putExtra("rotation_set_flag", l);
                    C5923w wVar = C5923w.this;
                    C5940b unused3 = wVar.f14505e = new C5940b(C5923w.m14660h(d), fetchDemandSourceId);
                    a.startActivity(intent);
                    return;
                }
                String b4 = C5923w.this.f14503a;
                Logger.m14957i(b4, "State: " + C5923w.this.f14510j);
                return;
            }
            C5923w.this.f14510j = C5973g.Gone;
            C5923w.this.mo42346h();
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            JSONObject a;
            try {
                String b = C5923w.this.f14503a;
                Logger.m14957i(b, "fileSystemAPI(" + str + ")");
                C5896l r = C5923w.this.f14521u;
                JSONObject jSONObject = new JSONObject(str);
                C5970a aVar = new C5970a();
                C5899n nVar = new C5899n(jSONObject);
                C5900o oVar = new C5900o(aVar);
                try {
                    String str2 = nVar.f14410a;
                    JSONObject jSONObject2 = nVar.f14411b;
                    char c = 65535;
                    boolean z = false;
                    switch (str2.hashCode()) {
                        case -2073025383:
                            if (str2.equals("saveFile")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1137024519:
                            if (str2.equals("deleteFolder")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -318115535:
                            if (str2.equals("getTotalSizeOfFiles")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 537556755:
                            if (str2.equals("updateAttributesOfFile")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1764172231:
                            if (str2.equals("deleteFile")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1953259713:
                            if (str2.equals("getFiles")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            C6020c a2 = C5896l.m14543a(jSONObject2, r.f14405a);
                            C6017b bVar = r.f14406b;
                            if (a2.exists()) {
                                if (a2.delete()) {
                                    bVar.f14783d.mo42571a(a2.getName());
                                } else {
                                    throw new Exception("Failed to delete file");
                                }
                            }
                            a = C5896l.m14546a(nVar, a2.mo42568a());
                        } else if (c == 2) {
                            C6020c b2 = C5896l.m14547b(jSONObject2, r.f14405a);
                            C6017b bVar2 = r.f14406b;
                            if (b2.exists()) {
                                ArrayList<C6020c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(b2);
                                if (IronSourceStorageUtils.deleteFolderContentRecursive(b2) && b2.delete()) {
                                    z = true;
                                }
                                if (z) {
                                    bVar2.f14783d.mo42573a(filesInFolderRecursive);
                                } else {
                                    throw new Exception("Failed to delete folder");
                                }
                            }
                            a = C5896l.m14546a(nVar, b2.mo42568a());
                        } else if (c == 3) {
                            C6020c b3 = C5896l.m14547b(jSONObject2, r.f14405a);
                            C6017b bVar3 = r.f14406b;
                            if (b3.exists()) {
                                a = C5896l.m14546a(nVar, IronSourceStorageUtils.buildFilesMapOfDirectory(b3, bVar3.f14783d.mo42570a()));
                            } else {
                                throw new Exception("Folder does not exist");
                            }
                        } else if (c == 4) {
                            C6020c b4 = C5896l.m14547b(jSONObject2, r.f14405a);
                            if (b4.exists()) {
                                a = C5896l.m14544a(nVar, IronSourceStorageUtils.getTotalSizeOfDir(b4));
                            } else {
                                throw new Exception("Folder does not exist");
                            }
                        } else if (c == 5) {
                            C6020c a3 = C5896l.m14543a(jSONObject2, r.f14405a);
                            JSONObject optJSONObject = jSONObject2.optJSONObject("attributesToUpdate");
                            C6017b bVar4 = r.f14406b;
                            if (optJSONObject == null) {
                                throw new Exception("Missing attributes to update");
                            } else if (!a3.exists()) {
                                throw new Exception("File does not exist");
                            } else if (bVar4.f14783d.mo42574b(a3.getName(), optJSONObject)) {
                                oVar.mo42317a(nVar, C5896l.m14546a(nVar, a3.mo42568a()));
                                return;
                            } else {
                                throw new Exception("Failed to update attribute");
                            }
                        } else {
                            return;
                        }
                        oVar.mo42317a(nVar, a);
                        return;
                    }
                    C6020c a4 = C5896l.m14543a(jSONObject2, r.f14405a);
                    String optString = jSONObject2.optString("fileUrl");
                    C5896l.C58971 r4 = new C6041c(oVar, nVar) {

                        /* renamed from: a */
                        private /* synthetic */ C5900o f14407a;

                        /* renamed from: b */
                        private /* synthetic */ C5899n f14408b;

                        /* renamed from: a */
                        public final void mo42314a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/

                        /* renamed from: a */
                        public final void mo42315a(
/*
Method generation error in method: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.controller.l.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    };
                    C6017b bVar5 = r.f14406b;
                    if (TextUtils.isEmpty(optString)) {
                        throw new Exception("Missing params for file");
                    } else if (C5527g.m13133a(bVar5.f14781b.f14793b) <= 0) {
                        throw new Exception("no_disk_space");
                    } else if (!SDKUtils.isExternalStorageAvailable()) {
                        throw new Exception("sotrage_unavailable");
                    } else if (C5505a.C55061.m13078b(bVar5.f14780a)) {
                        C6016a aVar2 = bVar5.f14782c;
                        String path = a4.getPath();
                        C6017b.C60181 r7 = new C6041c(r4) {

                            /* renamed from: a */
                            private /* synthetic */ C6041c f14784a;

                            /* renamed from: a */
                            public final void mo42314a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/

                            /* renamed from: a */
                            public final void mo42315a(
/*
Method generation error in method: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.sdk.h.b.1.a(com.ironsource.sdk.h.c, com.ironsource.sdk.g.e):void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        };
                        if (path != null) {
                            aVar2.f14779a.put(path, r7);
                        }
                        if (a4.exists()) {
                            Message message = new Message();
                            message.obj = a4;
                            message.what = 1015;
                            bVar5.f14782c.handleMessage(message);
                            return;
                        }
                        bVar5.f14781b.mo42579a(a4, optString, bVar5.f14782c);
                    } else {
                        throw new Exception("no_network_connection");
                    }
                } catch (Exception e) {
                    oVar.mo42318b(nVar, C5896l.m14545a(nVar, e.getMessage()));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                String b5 = C5923w.this.f14503a;
                Logger.m14957i(b5, "fileSystemAPI failed with exception " + e2.getMessage());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x005d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r0 = r0.f14503a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getApplicationInfo("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m14957i(r0, r1)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r0 = new com.ironsource.sdk.p150g.C6015f(r5).mo42564d(com.ironsource.sdk.controller.C5923w.f14474ab)
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r1 = new com.ironsource.sdk.p150g.C6015f(r5).mo42564d(com.ironsource.sdk.controller.C5923w.f14475ac)
                com.ironsource.sdk.g.f r2 = new com.ironsource.sdk.g.f
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.mo42564d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p150g.C6015f) r2)
                com.ironsource.sdk.controller.w r3 = com.ironsource.sdk.controller.C5923w.this
                java.lang.Object[] r5 = r3.m14649c((java.lang.String) r5, (java.lang.String) r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L_0x0055
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L_0x005c
                r0 = r1
                goto L_0x005d
            L_0x0055:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x005c
                goto L_0x005d
            L_0x005c:
                r0 = 0
            L_0x005d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0072
                com.ironsource.sdk.controller.w r5 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C5923w.m14624a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C5923w.this
                r0.mo42342b((java.lang.String) r5)
            L_0x0072:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C5923w.C5942d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            C5923w wVar;
            String str2;
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "getCachedFilesMap(" + str + ")");
            String b2 = new C6015f(str).mo42564d(C5923w.f14474ab);
            if (!TextUtils.isEmpty(b2)) {
                C6015f fVar = new C6015f(str);
                if (!fVar.mo42561a("path")) {
                    wVar = C5923w.this;
                    str2 = "path key does not exist";
                } else {
                    String str3 = (String) fVar.mo42563c("path");
                    if (!IronSourceStorageUtils.isPathExist(C5923w.this.f14512l, str3)) {
                        wVar = C5923w.this;
                        str2 = "path file does not exist on disk";
                    } else {
                        C5923w.this.mo42342b(C5923w.m14624a(b2, IronSourceStorageUtils.getCachedFilesMap(C5923w.this.f14512l, str3), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                        return;
                    }
                }
                C5923w.m14629a(wVar, str, false, str2, (String) null);
            }
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String str2;
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "getConnectivityInfo(" + str + ")");
            C6015f fVar = new C6015f(str);
            String d = fVar.mo42564d(C5923w.f14474ab);
            String d2 = fVar.mo42564d(C5923w.f14475ac);
            JSONObject jSONObject = new JSONObject();
            if (C5923w.this.f14504aa != null) {
                C6044b m = C5923w.this.f14504aa;
                jSONObject = m.f14813a.mo42588c(C5923w.this.getContext());
            }
            if (jSONObject.length() > 0) {
                str2 = C5923w.m14639b(d, jSONObject.toString());
            } else {
                str2 = C5923w.m14639b(d2, C5923w.m14625a("errMsg", "failed to retrieve connection info", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
            }
            C5923w.this.mo42342b(str2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "getControllerConfig(" + str + ")");
            String d = new C6015f(str).mo42564d(C5923w.f14474ab);
            if (!TextUtils.isEmpty(d)) {
                JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
                m14732a(controllerConfigAsJSONObject);
                m14733a(controllerConfigAsJSONObject, SDKUtils.getTesterParameters());
                m14735b(controllerConfigAsJSONObject);
                C5923w.this.mo42342b(C5923w.m14639b(d, controllerConfigAsJSONObject.toString()));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0080 A[Catch:{ Exception -> 0x008c }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDemandSourceState(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r0 = r0.f14503a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getMediationState("
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m14957i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r9)
                java.lang.String r1 = "demandSourceName"
                java.lang.String r2 = r0.mo42564d(r1)
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId((com.ironsource.sdk.p150g.C6015f) r0)
                java.lang.String r4 = "productType"
                java.lang.String r0 = r0.mo42564d(r4)
                if (r0 == 0) goto L_0x009a
                if (r2 == 0) goto L_0x009a
                r5 = 0
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.utils.SDKUtils.getProductType(r0)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x009a
                com.ironsource.sdk.controller.w r7 = com.ironsource.sdk.controller.C5923w.this     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.j r7 = r7.f14501V     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.g.c r6 = r7.mo42310a(r6, r3)     // Catch:{ Exception -> 0x008c }
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x008c }
                r7.<init>()     // Catch:{ Exception -> 0x008c }
                r7.put(r4, r0)     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = "demandSourceId"
                r7.put(r0, r3)     // Catch:{ Exception -> 0x008c }
                if (r6 == 0) goto L_0x0070
                int r0 = r6.f14738c     // Catch:{ Exception -> 0x008c }
                r1 = -1
                if (r0 != r1) goto L_0x005f
                r0 = 1
                goto L_0x0060
            L_0x005f:
                r0 = 0
            L_0x0060:
                if (r0 != 0) goto L_0x0070
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C5923w.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p150g.C6015f(r9).mo42564d(com.ironsource.sdk.controller.C5923w.f14474ab)     // Catch:{ Exception -> 0x008c }
                java.lang.String r1 = "state"
                int r2 = r6.f14738c     // Catch:{ Exception -> 0x008c }
                r7.put(r1, r2)     // Catch:{ Exception -> 0x008c }
                goto L_0x0076
            L_0x0070:
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C5923w.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = new com.ironsource.sdk.p150g.C6015f(r9).mo42564d(com.ironsource.sdk.controller.C5923w.f14475ac)     // Catch:{ Exception -> 0x008c }
            L_0x0076:
                java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x008c }
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x008c }
                if (r2 != 0) goto L_0x009a
                com.ironsource.sdk.controller.w r2 = com.ironsource.sdk.controller.C5923w.this     // Catch:{ Exception -> 0x008c }
                java.lang.String r0 = com.ironsource.sdk.controller.C5923w.m14639b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x008c }
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C5923w.this     // Catch:{ Exception -> 0x008c }
                r1.mo42342b((java.lang.String) r0)     // Catch:{ Exception -> 0x008c }
                goto L_0x009a
            L_0x008c:
                r0 = move-exception
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.C5923w.m14629a((com.ironsource.sdk.controller.C5923w) r1, (java.lang.String) r9, (boolean) r5, (java.lang.String) r2, (java.lang.String) r3)
                r0.printStackTrace()
            L_0x009a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C5923w.C5942d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0052;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r0 = r0.f14503a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getDeviceStatus("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.m14957i(r0, r1)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r0 = new com.ironsource.sdk.p150g.C6015f(r5).mo42564d(com.ironsource.sdk.controller.C5923w.f14474ab)
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r5 = new com.ironsource.sdk.p150g.C6015f(r5).mo42564d(com.ironsource.sdk.controller.C5923w.f14475ac)
                com.ironsource.sdk.controller.w r1 = com.ironsource.sdk.controller.C5923w.this
                android.content.Context r2 = r1.getContext()
                java.lang.Object[] r1 = r1.m14648c((android.content.Context) r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x004a
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L_0x0051
                r0 = r5
                goto L_0x0052
            L_0x004a:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r0 = 0
            L_0x0052:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L_0x0067
                com.ironsource.sdk.controller.w r5 = com.ironsource.sdk.controller.C5923w.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.C5923w.m14624a((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (java.lang.String) r3)
                com.ironsource.sdk.controller.w r0 = com.ironsource.sdk.controller.C5923w.this
                r0.mo42342b((java.lang.String) r5)
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C5923w.C5942d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "getDeviceVolume(" + str + ")");
            try {
                C6058a.m14963a(C5923w.this.f14523w.mo42245a());
                float b2 = C6058a.m14965b(C5923w.this.f14523w.mo42245a());
                C6015f fVar = new C6015f(str);
                fVar.mo42559a("deviceVolume", String.valueOf(b2));
                C5923w.m14629a(C5923w.this, fVar.toString(), true, (String) null, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            Activity a = C5923w.this.f14523w.mo42245a();
            if (a != null) {
                String b = new C6015f(str).mo42564d(C5923w.f14474ab);
                String jSONObject = SDKUtils.getOrientation(a).toString();
                if (!TextUtils.isEmpty(b)) {
                    C5923w.this.mo42342b(C5923w.m14624a(b, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
                }
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = str;
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "getUserData(" + str2 + ")");
            C6015f fVar = new C6015f(str2);
            if (!fVar.mo42561a(SDKConstants.PARAM_KEY)) {
                C5923w.m14629a(C5923w.this, str2, false, "key does not exist", (String) null);
                return;
            }
            String b2 = new C6015f(str2).mo42564d(C5923w.f14474ab);
            String d = fVar.mo42564d(SDKConstants.PARAM_KEY);
            String string = C6059b.m14967a().f14852a.getString(d, (String) null);
            if (string == null) {
                string = "{}";
            }
            C5923w.this.mo42342b(C5923w.m14639b(b2, C5923w.m14625a(d, string, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String b = C5923w.this.f14503a;
                Logger.m14957i(b, "iabTokenAPI(" + str + ")");
                C6015f fVar = new C6015f(str);
                C5920u q = C5923w.this.f14518r;
                String fVar2 = fVar.toString();
                C5970a aVar = new C5970a();
                JSONObject jSONObject = new JSONObject(fVar2);
                C5920u.C5921a aVar2 = new C5920u.C5921a((byte) 0);
                aVar2.f14470a = jSONObject.optString("functionName");
                aVar2.f14471b = jSONObject.optJSONObject("functionParams");
                aVar2.f14472c = jSONObject.optString("success");
                aVar2.f14473d = jSONObject.optString("fail");
                if ("updateToken".equals(aVar2.f14470a)) {
                    JSONObject jSONObject2 = aVar2.f14471b;
                    C6015f fVar3 = new C6015f();
                    try {
                        C6051c cVar = q.f14466c;
                        C5710l.m14089a("ctgp", jSONObject2);
                        q.f14465b.mo42604a(jSONObject2);
                        aVar.mo42467a(true, aVar2.f14472c, fVar3);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str2 = C5920u.f14464a;
                        Logger.m14957i(str2, "updateToken exception " + e.getMessage());
                        aVar.mo42467a(false, aVar2.f14473d, fVar3);
                    }
                } else if ("getToken".equals(aVar2.f14470a)) {
                    try {
                        aVar.mo42468a(true, aVar2.f14472c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? q.mo42333a() : q.f14465b.mo42605b(q.f14467d));
                    } catch (Exception e2) {
                        String str3 = aVar2.f14473d;
                        String message = e2.getMessage();
                        C6015f fVar4 = new C6015f();
                        fVar4.mo42559a(C5923w.f14475ac, str3);
                        fVar4.mo42559a("data", message);
                        C5923w.m14629a(C5923w.this, fVar4.toString(), false, (String) null, (String) null);
                    }
                } else {
                    String str4 = C5920u.f14464a;
                    Logger.m14957i(str4, "unhandled API request " + fVar2);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String b2 = C5923w.this.f14503a;
                Logger.m14957i(b2, "iabTokenAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void initController(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "initController(" + str + ")");
            C6015f fVar = new C6015f(str);
            if (C5923w.this.f14506f != null) {
                C5923w.this.f14506f.cancel();
                C5923w.this.f14506f = null;
            }
            if (fVar.mo42561a("stage")) {
                String d = fVar.mo42564d("stage");
                if ("ready".equalsIgnoreCase(d)) {
                    boolean unused = C5923w.this.f14485F = true;
                    C5923w.this.f14502W.mo42251b();
                } else if ("loaded".equalsIgnoreCase(d)) {
                    C5923w.this.f14502W.mo42249a();
                } else if ("failed".equalsIgnoreCase(d)) {
                    String d2 = fVar.mo42564d("errMsg");
                    C5862e h = C5923w.this.f14502W;
                    h.mo42250a("controller js failed to initialize : " + d2);
                } else {
                    Logger.m14957i(C5923w.this.f14503a, "No STAGE mentioned! should not get here!");
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(final String str) {
            C5923w.this.mo42337a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        String b = C5923w.this.f14503a;
                        Logger.m14957i(b, "omidAPI(" + str + ")");
                        C6015f fVar = new C6015f(str);
                        C5914q H = C5923w.this.f14516p;
                        String fVar2 = fVar.toString();
                        C5970a aVar = new C5970a();
                        WebView G = C5923w.m14606G(C5923w.this);
                        JSONObject jSONObject = new JSONObject(fVar2);
                        C5914q.C5915a aVar2 = new C5914q.C5915a((byte) 0);
                        aVar2.f14451a = jSONObject.optString("omidFunction");
                        aVar2.f14452b = jSONObject.optJSONObject("omidParams");
                        aVar2.f14453c = jSONObject.optString("success");
                        aVar2.f14454d = jSONObject.optString("fail");
                        C6015f fVar3 = new C6015f();
                        try {
                            String str = aVar2.f14451a;
                            char c = 65535;
                            switch (str.hashCode()) {
                                case -1655974669:
                                    if (str.equals("activate")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case -984459207:
                                    if (str.equals("getOmidData")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 70701699:
                                    if (str.equals("finishSession")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case 1208109646:
                                    if (str.equals("impressionOccurred")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case 1850541012:
                                    if (str.equals("startSession")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                            }
                            if (c != 0) {
                                if (c == 1) {
                                    C5998a.m14810a(aVar2.f14452b, G);
                                } else if (c == 2) {
                                    C5998a.m14811b();
                                } else if (c == 3) {
                                    C5998a.m14809a(aVar2.f14452b);
                                } else if (c != 4) {
                                    throw new IllegalArgumentException(String.format("%s | unsupported OMID API", new Object[]{aVar2.f14451a}));
                                }
                                aVar.mo42467a(true, aVar2.f14453c, fVar3);
                            }
                            C5998a.m14808a(H.f14450b);
                            fVar3 = C5998a.m14807a();
                            aVar.mo42467a(true, aVar2.f14453c, fVar3);
                        } catch (Exception e) {
                            fVar3.mo42559a("errMsg", e.getMessage());
                            String str2 = C5914q.f14449a;
                            Logger.m14957i(str2, "OMIDJSAdapter " + aVar2.f14451a + " Exception: " + e.getMessage());
                            aVar.mo42467a(false, aVar2.f14454d, fVar3);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        String b2 = C5923w.this.f14503a;
                        Logger.m14957i(b2, "omidAPI failed with exception " + e2.getMessage());
                    }
                }
            });
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onAdWindowsClosed(" + str + ")");
            C5923w.this.f14515o.f14725e = -1;
            C5923w.this.f14515o.f14723c = null;
            C5940b unused = C5923w.this.f14505e = null;
            C6015f fVar = new C6015f(str);
            String d = fVar.mo42564d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C6008d.C6013e e = C5923w.m14660h(d);
            String z = C5923w.this.f14525y;
            Log.d(z, "onAdClosed() with type " + e);
            if (C5923w.this.mo42340a(d)) {
                C5923w.this.mo42336a(e, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onGetApplicationInfoFail(" + str + ")");
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onGetApplicationInfoSuccess(" + str + ")");
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onGetCachedFilesMapFail(" + str + ")");
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onGetCachedFilesMapSuccess(" + str + ")");
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onGetDeviceStatusFail(" + str + ")");
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onGetDeviceStatusSuccess(" + str + ")");
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onGetUserCreditsFail(" + str + ")");
            final String d = new C6015f(str).mo42564d("errMsg");
            if (C5923w.this.mo42340a(C6008d.C6013e.OfferWall.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C5923w.this.f14495P.onGetOWCreditsFailed(str);
                    }
                });
            }
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onInitBannerFail(" + str + ")");
            C6015f fVar = new C6015f(str);
            final String d = fVar.mo42564d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14957i(C5923w.this.f14503a, "onInitBannerFail failed with no demand source");
                return;
            }
            C6007c a = C5923w.this.f14501V.mo42310a(C6008d.C6013e.Banner, fetchDemandSourceId);
            if (a != null) {
                a.mo42548a(3);
            }
            if (C5923w.this.mo42340a(C6008d.C6013e.Banner.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C5923w.this.f14503a;
                        Log.d(b, "onBannerInitFail(message:" + str + ")");
                        C5923w.this.f14496Q.mo42492a(C6008d.C6013e.Banner, fetchDemandSourceId, str);
                    }
                });
            }
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.m14957i(C5923w.this.f14503a, "onInitBannerSuccess()");
            C5923w.m14646c(C5923w.this, "onInitBannerSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C6015f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14957i(C5923w.this.f14503a, "onInitBannerSuccess failed with no demand source");
            } else if (C5923w.this.mo42340a(C6008d.C6013e.Banner.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C5923w.this.f14503a, "onBannerInitSuccess()");
                        C5923w.this.f14496Q.mo42491a(C6008d.C6013e.Banner, fetchDemandSourceId, (C6004a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onInitInterstitialFail(" + str + ")");
            C6015f fVar = new C6015f(str);
            final String d = fVar.mo42564d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14957i(C5923w.this.f14503a, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            C6007c a = C5923w.this.f14501V.mo42310a(C6008d.C6013e.Interstitial, fetchDemandSourceId);
            if (a != null) {
                a.mo42548a(3);
            }
            if (C5923w.this.mo42340a(C6008d.C6013e.Interstitial.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C5923w.this.f14503a;
                        Log.d(b, "onInterstitialInitFail(message:" + str + ")");
                        C5923w.this.f14494O.mo42492a(C6008d.C6013e.Interstitial, fetchDemandSourceId, str);
                    }
                });
            }
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.m14957i(C5923w.this.f14503a, "onInitInterstitialSuccess()");
            C5923w.m14646c(C5923w.this, "onInitInterstitialSuccess", "true");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C6015f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14957i(C5923w.this.f14503a, "onInitInterstitialSuccess failed with no demand source");
            } else if (C5923w.this.mo42340a(C6008d.C6013e.Interstitial.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C5923w.this.f14503a, "onInterstitialInitSuccess()");
                        C5923w.this.f14494O.mo42491a(C6008d.C6013e.Interstitial, fetchDemandSourceId, (C6004a) null);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onInitOfferWallFail(" + str + ")");
            C5923w.this.f14515o.f14729i = false;
            final String d = new C6015f(str).mo42564d("errMsg");
            if (C5923w.this.f14515o.f14728h) {
                C5923w.this.f14515o.f14728h = false;
                if (C5923w.this.mo42340a(C6008d.C6013e.OfferWall.toString())) {
                    C5923w.this.mo42337a((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            String b = C5923w.this.f14503a;
                            Log.d(b, "onOfferWallInitFail(message:" + str + ")");
                            C5923w.this.f14495P.onOfferwallInitFail(str);
                        }
                    });
                }
            }
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            C5923w.m14646c(C5923w.this, "onInitOfferWallSuccess", "true");
            C5923w.this.f14515o.f14729i = true;
            if (C5923w.this.f14515o.f14728h) {
                C5923w.this.f14515o.f14728h = false;
                if (C5923w.this.mo42340a(C6008d.C6013e.OfferWall.toString())) {
                    C5923w.this.mo42337a((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(C5923w.this.f14503a, "onOfferWallInitSuccess()");
                            C5923w.this.f14495P.onOfferwallInitSuccess();
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onInitRewardedVideoFail(" + str + ")");
            C6015f fVar = new C6015f(str);
            final String d = fVar.mo42564d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C6007c a = C5923w.this.f14501V.mo42310a(C6008d.C6013e.RewardedVideo, fetchDemandSourceId);
            if (a != null) {
                a.mo42548a(3);
            }
            if (C5923w.this.mo42340a(C6008d.C6013e.RewardedVideo.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C5923w.this.f14503a;
                        Log.d(b, "onRVInitFail(message:" + str + ")");
                        C5923w.this.f14493N.mo42492a(C6008d.C6013e.RewardedVideo, fetchDemandSourceId, str);
                    }
                });
            }
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.m14957i(C5923w.this.f14503a, "onLoadBannerFail()");
            C6015f fVar = new C6015f(str);
            final String d = fVar.mo42564d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && C5923w.this.mo42340a(C6008d.C6013e.Banner.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        Log.d(C5923w.this.f14503a, "onLoadBannerFail()");
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C5923w.this.f14496Q.mo42520d(fetchDemandSourceId, str);
                    }
                });
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.m14957i(C5923w.this.f14503a, "onLoadBannerSuccess()");
            C6015f fVar = new C6015f(str);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d = fVar.mo42564d("adViewId");
            C5846e eVar = null;
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5844d a = C5844d.m14444a();
            if (!d.isEmpty() && a.f14239b.containsKey(d)) {
                eVar = a.f14239b.get(d);
            }
            if (eVar == null) {
                C6027b E = C5923w.this.f14496Q;
                E.mo42520d(fetchDemandSourceId, "not found view for the current adViewId= " + d);
            } else if (eVar instanceof C5837a) {
                final C5837a aVar = (C5837a) eVar;
                if (C5923w.this.mo42340a(C6008d.C6013e.Banner.toString())) {
                    C5923w.this.mo42337a((Runnable) new Runnable() {
                        public final void run() {
                            Log.d(C5923w.this.f14503a, "onBannerLoadSuccess()");
                            C5923w.this.f14496Q.mo42496a(fetchDemandSourceId, aVar);
                        }
                    });
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onLoadInterstitialFail(" + str + ")");
            C6015f fVar = new C6015f(str);
            final String d = fVar.mo42564d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m14731a(fetchDemandSourceId, false);
                if (C5923w.this.mo42340a(C6008d.C6013e.Interstitial.toString())) {
                    C5923w.this.mo42337a((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            C5923w.this.f14494O.mo42511b(fetchDemandSourceId, str);
                        }
                    });
                }
                C5923w.m14646c(C5923w.this, "onLoadInterstitialFail", "true");
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onLoadInterstitialSuccess(" + str + ")");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C6015f(str));
            m14731a(fetchDemandSourceId, true);
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            if (C5923w.this.mo42340a(C6008d.C6013e.Interstitial.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        C5923w.this.f14494O.mo42515c(fetchDemandSourceId);
                    }
                });
            }
            C5923w.m14646c(C5923w.this, "onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onShowInterstitialFail(" + str + ")");
            C6015f fVar = new C6015f(str);
            final String d = fVar.mo42564d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                m14731a(fetchDemandSourceId, false);
                if (C5923w.this.mo42340a(C6008d.C6013e.Interstitial.toString())) {
                    C5923w.this.mo42337a((Runnable) new Runnable() {
                        public final void run() {
                            String str = d;
                            if (str == null) {
                                str = "We're sorry, some error occurred. we will investigate it";
                            }
                            C5923w.this.f14494O.mo42516c(fetchDemandSourceId, str);
                        }
                    });
                }
                C5923w.m14646c(C5923w.this, "onShowInterstitialFail", str);
            }
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onShowInterstitialSuccess(" + str + ")");
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new C6015f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.m14957i(C5923w.this.f14503a, "onShowInterstitialSuccess called with no demand");
                return;
            }
            C5923w.this.f14515o.f14725e = C6008d.C6013e.Interstitial.ordinal();
            C5923w.this.f14515o.f14723c = fetchDemandSourceId;
            if (C5923w.this.mo42340a(C6008d.C6013e.Interstitial.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        C5923w.this.f14494O.mo42514c(C6008d.C6013e.Interstitial, fetchDemandSourceId);
                        C5923w.this.f14494O.mo42519d(fetchDemandSourceId);
                    }
                });
                C5923w.m14646c(C5923w.this, "onShowInterstitialSuccess", str);
            }
            m14731a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onShowOfferWallFail(" + str + ")");
            final String d = new C6015f(str).mo42564d("errMsg");
            if (C5923w.this.mo42340a(C6008d.C6013e.OfferWall.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        C5923w.this.f14495P.onOWShowFail(str);
                    }
                });
            }
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onShowOfferWallSuccess(" + str + ")");
            C5923w.this.f14515o.f14725e = C6008d.C6013e.OfferWall.ordinal();
            final String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID);
            if (C5923w.this.mo42340a(C6008d.C6013e.OfferWall.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        C5923w.this.f14495P.onOWShowSuccess(valueFromJsonObject);
                    }
                });
            }
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onShowRewardedVideoFail(" + str + ")");
            C6015f fVar = new C6015f(str);
            final String d = fVar.mo42564d("errMsg");
            final String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (C5923w.this.mo42340a(C6008d.C6013e.RewardedVideo.toString())) {
                C5923w.this.mo42337a((Runnable) new Runnable() {
                    public final void run() {
                        String str = d;
                        if (str == null) {
                            str = "We're sorry, some error occurred. we will investigate it";
                        }
                        String b = C5923w.this.f14503a;
                        Log.d(b, "onRVShowFail(message:" + d + ")");
                        C5923w.this.f14493N.mo42497a(fetchDemandSourceId, str);
                    }
                });
            }
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onShowRewardedVideoSuccess(" + str + ")");
            C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
            C5923w.m14646c(C5923w.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String b = C5923w.this.f14503a;
            Log.d(b, "onVideoStatusChanged(" + str + ")");
            C6015f fVar = new C6015f(str);
            String d = fVar.mo42564d("productType");
            if (C5923w.this.f14514n != null && !TextUtils.isEmpty(d)) {
                String d2 = fVar.mo42564d("status");
                if ("started".equalsIgnoreCase(d2)) {
                    C5923w.this.f14514n.onVideoStarted();
                } else if (TJAdUnitConstants.String.VIDEO_PAUSED.equalsIgnoreCase(d2)) {
                    C5923w.this.f14514n.onVideoPaused();
                } else if (TJAdUnitConstants.String.VIDEO_PLAYING.equalsIgnoreCase(d2)) {
                    C5923w.this.f14514n.onVideoResumed();
                } else if ("ended".equalsIgnoreCase(d2)) {
                    C5923w.this.f14514n.onVideoEnded();
                } else if (TJAdUnitConstants.String.VIDEO_STOPPED.equalsIgnoreCase(d2)) {
                    C5923w.this.f14514n.onVideoStopped();
                } else {
                    String b2 = C5923w.this.f14503a;
                    Logger.m14957i(b2, "onVideoStatusChanged: unknown status: " + d2);
                }
            }
        }

        @JavascriptInterface
        public void openUrl(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "openUrl(" + str + ")");
            C6015f fVar = new C6015f(str);
            String d = fVar.mo42564d("url");
            String d2 = fVar.mo42564d("method");
            String d3 = fVar.mo42564d(CampaignEx.JSON_KEY_PACKAGE_NAME);
            Activity a = C5923w.this.f14523w.mo42245a();
            try {
                String lowerCase = d2.toLowerCase();
                char c = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -1455867212) {
                    if (hashCode != 109770977) {
                        if (hashCode == 1224424441) {
                            if (lowerCase.equals("webview")) {
                                c = 1;
                            }
                        }
                    } else if (lowerCase.equals("store")) {
                        c = 2;
                    }
                } else if (lowerCase.equals("external_browser")) {
                    c = 0;
                }
                if (c == 0) {
                    C5505a.C55061.m13074a(a, d, d3);
                } else if (c == 1) {
                    Intent intent = new Intent(a, OpenUrlActivity.class);
                    intent.putExtra(C5923w.f14477c, d);
                    intent.putExtra(C5923w.f14478d, true);
                    intent.putExtra("immersive", C5923w.this.f14500U);
                    a.startActivity(intent);
                } else if (c == 2) {
                    Intent intent2 = new Intent(a, OpenUrlActivity.class);
                    intent2.putExtra(C5923w.f14477c, d);
                    intent2.putExtra(C5923w.f14476b, true);
                    intent2.putExtra(C5923w.f14478d, true);
                    a.startActivity(intent2);
                }
            } catch (Exception e) {
                C5923w.m14629a(C5923w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            C5923w.this.mo42337a((Runnable) new Runnable() {
                public final void run() {
                    C5923w.this.mo42347i();
                }
            });
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            C6015f fVar;
            String str2;
            try {
                String b = C5923w.this.f14503a;
                Logger.m14957i(b, "permissionsAPI(" + str + ")");
                C6015f fVar2 = new C6015f(str);
                C5916r I = C5923w.this.f14517q;
                String fVar3 = fVar2.toString();
                C5970a aVar = new C5970a();
                JSONObject jSONObject = new JSONObject(fVar3);
                C5916r.C5917a aVar2 = new C5916r.C5917a((byte) 0);
                aVar2.f14457a = jSONObject.optString("functionName");
                aVar2.f14458b = jSONObject.optJSONObject("functionParams");
                aVar2.f14459c = jSONObject.optString("success");
                aVar2.f14460d = jSONObject.optString("fail");
                if ("getPermissions".equals(aVar2.f14457a)) {
                    JSONObject jSONObject2 = aVar2.f14458b;
                    fVar = new C6015f();
                    try {
                        fVar.mo42560a("permissions", C5517c.m13101a(I.f14456a, jSONObject2.getJSONArray("permissions")));
                        aVar.mo42467a(true, aVar2.f14459c, fVar);
                    } catch (Exception e) {
                        e.printStackTrace();
                        String str3 = C5916r.f14455b;
                        Logger.m14957i(str3, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
                        fVar.mo42559a("errMsg", e.getMessage());
                        str2 = aVar2.f14460d;
                        aVar.mo42467a(false, str2, fVar);
                    }
                } else if ("isPermissionGranted".equals(aVar2.f14457a)) {
                    JSONObject jSONObject3 = aVar2.f14458b;
                    fVar = new C6015f();
                    try {
                        String string = jSONObject3.getString("permission");
                        fVar.mo42559a("permission", string);
                        if (C5517c.m13102a(I.f14456a, string)) {
                            fVar.mo42559a("status", String.valueOf(C5517c.m13104b(I.f14456a, string)));
                            aVar.mo42467a(true, aVar2.f14459c, fVar);
                            return;
                        }
                        fVar.mo42559a("status", "unhandledPermission");
                        aVar.mo42467a(false, aVar2.f14460d, fVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        fVar.mo42559a("errMsg", e2.getMessage());
                        str2 = aVar2.f14460d;
                        aVar.mo42467a(false, str2, fVar);
                    }
                } else {
                    String str4 = C5916r.f14455b;
                    Logger.m14957i(str4, "PermissionsJSAdapter unhandled API request " + fVar3);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                String b2 = C5923w.this.f14503a;
                Logger.m14957i(b2, "permissionsAPI failed with exception " + e3.getMessage());
            }
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2 = str;
            try {
                String b = C5923w.this.f14503a;
                Logger.m14957i(b, "postAdEventNotification(" + str2 + ")");
                C6015f fVar = new C6015f(str2);
                final String d = fVar.mo42564d("eventName");
                if (TextUtils.isEmpty(d)) {
                    C5923w.m14629a(C5923w.this, str2, false, "eventName does not exist", (String) null);
                    return;
                }
                String d2 = fVar.mo42564d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d2;
                JSONObject jSONObject = (JSONObject) fVar.mo42563c("extData");
                String d3 = fVar.mo42564d("productType");
                C6008d.C6013e e = C5923w.m14660h(d3);
                if (C5923w.this.mo42340a(d3)) {
                    String b2 = new C6015f(str2).mo42564d(C5923w.f14474ab);
                    if (!TextUtils.isEmpty(b2)) {
                        C5923w.this.mo42342b(C5923w.m14624a(b2, C5923w.m14625a("productType", d3, "eventName", d, "demandSourceName", d2, "demandSourceId", str3, (String) null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                    }
                    final C6008d.C6013e eVar = e;
                    final String str4 = str3;
                    final JSONObject jSONObject2 = jSONObject;
                    C5923w.this.mo42337a((Runnable) new Runnable() {
                        public final void run() {
                            if (eVar == C6008d.C6013e.Interstitial || eVar == C6008d.C6013e.RewardedVideo || eVar == C6008d.C6013e.Banner) {
                                C6026a a = C5923w.this.m14636b(eVar);
                                if (a != null) {
                                    a.mo42493a(eVar, str4, d, jSONObject2);
                                }
                            } else if (eVar == C6008d.C6013e.OfferWall) {
                                C5923w.this.f14495P.onOfferwallEventNotificationReceived(d, jSONObject2);
                            }
                        }
                    });
                    return;
                }
                C5923w.m14629a(C5923w.this, str2, false, "productType does not exist", (String) null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "removeCloseEventHandler(" + str + ")");
            if (C5923w.this.f14487H != null) {
                C5923w.this.f14487H.cancel();
            }
            boolean unused = C5923w.this.f14486G = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            C5923w.this.mo42337a((Runnable) new Runnable() {
                public final void run() {
                    C5923w.this.removeJavascriptInterface("GenerateTokenForMessaging");
                }
            });
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            C5923w.this.mo42337a((Runnable) new Runnable() {
                public final void run() {
                    C5923w.this.mo42348j();
                }
            });
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String b = C5923w.this.f14503a;
                Logger.m14957i(b, "saveFile(" + str + ")");
                C6015f fVar = new C6015f(str);
                String d = fVar.mo42564d("path");
                String d2 = fVar.mo42564d("file");
                if (TextUtils.isEmpty(d2)) {
                    C5923w.m14629a(C5923w.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                C6020c cVar = new C6020c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(C5923w.this.f14512l, d), SDKUtils.getFileName(d2));
                if (C5527g.m13133a(C5923w.this.f14512l) <= 0) {
                    C5923w.m14629a(C5923w.this, str, false, "no_disk_space", (String) null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    C5923w.m14629a(C5923w.this, str, false, "sotrage_unavailable", (String) null);
                } else if (cVar.exists()) {
                    C5923w.m14629a(C5923w.this, str, false, "file_already_exist", (String) null);
                } else if (!C5505a.C55061.m13078b(C5923w.this.getContext())) {
                    C5923w.m14629a(C5923w.this, str, false, "no_network_connection", (String) null);
                } else {
                    C5923w.m14629a(C5923w.this, str, true, (String) null, (String) null);
                    C6037b o = C5923w.this.f14484E;
                    o.mo42579a(cVar, d2, o.f14792a);
                }
            } catch (Exception e) {
                C5923w.m14629a(C5923w.this, str, false, e.getMessage(), (String) null);
                e.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "setBackButtonState(" + str + ")");
            String d = new C6015f(str).mo42564d("state");
            SharedPreferences.Editor edit = C6059b.m14967a().f14852a.edit();
            edit.putString("back_button_state", d);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "setForceClose(" + str + ")");
            C6015f fVar = new C6015f(str);
            String d = fVar.mo42564d("width");
            String d2 = fVar.mo42564d("height");
            int unused = C5923w.this.f14488I = Integer.parseInt(d);
            int unused2 = C5923w.this.f14489J = Integer.parseInt(d2);
            String unused3 = C5923w.this.f14490K = fVar.mo42564d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "setMixedContentAlwaysAllow(" + str + ")");
            C5923w.this.mo42337a((Runnable) new Runnable() {
                public final void run() {
                    if (Build.VERSION.SDK_INT >= 21) {
                        C5923w.this.getSettings().setMixedContentMode(0);
                    }
                }
            });
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "setOrientation(" + str + ")");
            String d = new C6015f(str).mo42564d("orientation");
            C5923w.this.f14511k = d;
            if (C5923w.this.f14524x != null) {
                C5923w.this.f14524x.onOrientationChanged(d, C5527g.m13160l(C5923w.this.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = C6059b.m14967a().f14852a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = str;
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "setUserData(" + str2 + ")");
            C6015f fVar = new C6015f(str2);
            if (!fVar.mo42561a(SDKConstants.PARAM_KEY)) {
                C5923w.m14629a(C5923w.this, str2, false, "key does not exist", (String) null);
            } else if (!fVar.mo42561a("value")) {
                C5923w.m14629a(C5923w.this, str2, false, "value does not exist", (String) null);
            } else {
                String d = fVar.mo42564d(SDKConstants.PARAM_KEY);
                String d2 = fVar.mo42564d("value");
                SharedPreferences.Editor edit = C6059b.m14967a().f14852a.edit();
                edit.putString(d, d2);
                if (edit.commit()) {
                    C5923w.this.mo42342b(C5923w.m14639b(new C6015f(str2).mo42564d(C5923w.f14474ab), C5923w.m14625a(d, d2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                    return;
                }
                C5923w.m14629a(C5923w.this, str2, false, "SetUserData failed writing to shared preferences", (String) null);
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            String b = C5923w.this.f14503a;
            Logger.m14957i(b, "setWebviewBackgroundColor(" + str + ")");
            C5923w.m14657g(C5923w.this, str);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$e */
    interface C5971e {
        /* renamed from: a */
        void mo42355a(String str, C6008d.C6013e eVar, C6007c cVar);
    }

    /* renamed from: com.ironsource.sdk.controller.w$f */
    static class C5972f {

        /* renamed from: a */
        String f14629a;

        /* renamed from: b */
        String f14630b;

        C5972f() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$g */
    public enum C5973g {
        Display,
        Gone
    }

    /* renamed from: com.ironsource.sdk.controller.w$h */
    class C5974h implements View.OnTouchListener {
        private C5974h() {
        }

        /* synthetic */ C5974h(C5923w wVar, byte b) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                String b = C5923w.this.f14503a;
                StringBuilder sb = new StringBuilder("X:");
                int i = (int) x;
                sb.append(i);
                sb.append(" Y:");
                int i2 = (int) y;
                sb.append(i2);
                Logger.m14957i(b, sb.toString());
                int m = C5527g.m13162m();
                int n = C5527g.m13163n();
                String b2 = C5923w.this.f14503a;
                Logger.m14957i(b2, "Width:" + m + " Height:" + n);
                int dpToPx = SDKUtils.dpToPx((long) C5923w.this.f14488I);
                int dpToPx2 = SDKUtils.dpToPx((long) C5923w.this.f14489J);
                if (C5073cj.DEFAULT_POSITION.equalsIgnoreCase(C5923w.this.f14490K)) {
                    i = m - i;
                } else if (!"top-left".equalsIgnoreCase(C5923w.this.f14490K)) {
                    if ("bottom-right".equalsIgnoreCase(C5923w.this.f14490K)) {
                        i = m - i;
                    } else if (!"bottom-left".equalsIgnoreCase(C5923w.this.f14490K)) {
                        i = 0;
                        i2 = 0;
                    }
                    i2 = n - i2;
                }
                if (i <= dpToPx && i2 <= dpToPx2) {
                    boolean unused = C5923w.this.f14486G = false;
                    if (C5923w.this.f14487H != null) {
                        C5923w.this.f14487H.cancel();
                    }
                    CountDownTimer unused2 = C5923w.this.f14487H = new CountDownTimer(2000, 500) {
                        public final void onFinish() {
                            Logger.m14957i(C5923w.this.f14503a, "Close Event Timer Finish");
                            if (C5923w.this.f14486G) {
                                boolean unused = C5923w.this.f14486G = false;
                            } else {
                                C5923w.this.mo42344e(TJAdUnitConstants.String.FORCE_CLOSE);
                            }
                        }

                        public final void onTick(long j) {
                            String b = C5923w.this.f14503a;
                            Logger.m14957i(b, "Close Event Timer Tick " + j);
                        }
                    }.start();
                }
            }
            return false;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.w$i */
    class C5976i extends WebViewClient {
        private C5976i() {
        }

        /* synthetic */ C5976i(C5923w wVar, byte b) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            Logger.m14957i("onPageFinished", str);
            if (str.contains(IronSourceConstants.EVENTS_AD_UNIT) || str.contains("index.html")) {
                C5923w.this.mo42342b(C5923w.m14656g("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.m14957i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.m14957i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && C5923w.this.f14502W != null) {
                C5862e h = C5923w.this.f14502W;
                h.mo42250a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String b = C5923w.this.f14503a;
            Log.e(b, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (C5923w.this.f14502W != null) {
                C5923w.this.f14502W.mo42252b(str);
            }
            C5923w wVar = C5923w.this;
            if (wVar.f14505e == null) {
                return true;
            }
            wVar.mo42346h();
            C6008d.C6013e eVar = wVar.f14505e.f14553a;
            String str2 = wVar.f14505e.f14554b;
            if (!wVar.mo42340a(eVar.toString())) {
                return true;
            }
            wVar.mo42336a(eVar, str2);
            return true;
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            Logger.m14957i("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z = false;
            }
            if (z) {
                String str2 = Advertisement.FILE_SCHEME + C5923w.this.f14512l + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.m14957i("shouldOverrideUrlLoading", str);
            try {
                if (C5923w.this.mo42345f(str)) {
                    C5923w.this.mo42341b();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public C5923w(Context context, C5893j jVar, C5860c cVar, C5862e eVar) {
        super(context);
        Logger.m14957i(this.f14503a, "C'tor");
        this.f14523w = cVar;
        this.f14502W = eVar;
        this.f14512l = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.f14501V = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f14509i = new FrameLayout(context);
        this.f14491L = new FrameLayout(context);
        this.f14491L.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f14491L.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.f14509i.addView(this.f14491L, layoutParams);
        this.f14509i.addView(frameLayout);
        this.f14515o = new C6005b();
        C6037b a = C6037b.m14886a(this.f14512l);
        this.f14484E = a;
        a.f14792a.f14790a = this;
        this.f14513m = new C5863f(SDKUtils.getNetworkConfiguration(), this.f14512l, SDKUtils.getControllerUrl(), this.f14484E);
        this.f14507g = new C5939a(this, (byte) 0);
        setWebViewClient(new C5976i(this, (byte) 0));
        setWebChromeClient(this.f14507g);
        C6062d.m14985a(this);
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath("/data/data/org.itri.html5webview/databases/");
        settings.setDomStorageEnabled(true);
        try {
            if (Build.VERSION.SDK_INT > 11) {
                settings.setDisplayZoomControls(false);
            }
            if (Build.VERSION.SDK_INT >= 17) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        } catch (Throwable th) {
            String str = this.f14503a;
            Logger.m14955e(str, "setWebSettings - " + th.toString());
        }
        C5919t tVar = new C5919t(UUID.randomUUID().toString());
        addJavascriptInterface(new C5889h(new C5861d(new C5942d()), tVar), "Android");
        addJavascriptInterface(new C5918s(tVar), "GenerateTokenForMessaging");
        setDownloadListener(this);
        setOnTouchListener(new C5974h(this, (byte) 0));
        this.f14499T = new Handler(Looper.getMainLooper());
        this.f14504aa = new C6044b(SDKUtils.getControllerConfigAsJSONObject(), context) {
            /* renamed from: a */
            public final void mo42352a() {
                if (C5923w.this.f14485F) {
                    C5923w.this.mo42343d("none");
                }
            }

            /* renamed from: a */
            public final void mo42353a(String str) {
                if (C5923w.this.f14485F) {
                    C5923w.this.mo42343d(str);
                }
            }

            /* renamed from: a */
            public final void mo42354a(String str, JSONObject jSONObject) {
                if (jSONObject != null && C5923w.this.f14485F) {
                    try {
                        jSONObject.put("connectionType", str);
                        C5923w wVar = C5923w.this;
                        String str2 = wVar.f14503a;
                        Logger.m14957i(str2, "device connection info changed: " + jSONObject.toString());
                        wVar.mo42342b(C5923w.m14639b("connectionInfoChanged", C5923w.m14625a("connectionInfo", jSONObject.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        mo42259a(context);
        f14479z = FeaturesManager.getInstance().getDebugMode();
    }

    /* renamed from: G */
    static /* synthetic */ WebView m14606G(C5923w wVar) {
        return wVar;
    }

    /* renamed from: a */
    public static int m14612a() {
        return f14479z;
    }

    /* renamed from: a */
    private String m14623a(C6008d.C6013e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        C6007c a = this.f14501V.mo42310a(eVar, fetchDemandSourceId);
        if (a != null) {
            if (a.f14739d != null) {
                hashMap.putAll(a.f14739d);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> a2 = m14626a(eVar);
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        C6001a.C6002a a3 = C6001a.C6002a.m14833a(eVar);
        return m14624a(a3.f14705a, flatMapToJsonAsString, a3.f14706b, a3.f14707c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m14624a(String str, String str2, String str3, String str4) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "','" + str3 + "','" + str4 + "');";
    }

    /* renamed from: a */
    public static String m14625a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    private Map<String, String> m14626a(C6008d.C6013e eVar) {
        if (eVar == C6008d.C6013e.OfferWall) {
            return this.f14483D;
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ void m14628a(C5923w wVar, final String str, final C6008d.C6013e eVar, final C6007c cVar) {
        if (wVar.mo42340a(eVar.toString())) {
            wVar.mo42337a((Runnable) new Runnable() {
                public final void run() {
                    if (C6008d.C6013e.RewardedVideo == eVar || C6008d.C6013e.Interstitial == eVar || C6008d.C6013e.Banner == eVar) {
                        C6007c cVar = cVar;
                        if (cVar != null && !TextUtils.isEmpty(cVar.f14737b)) {
                            C6026a a = C5923w.this.m14636b(eVar);
                            String b = C5923w.this.f14503a;
                            Log.d(b, "onAdProductInitFailed (message:" + str + ")(" + eVar + ")");
                            if (a != null) {
                                a.mo42492a(eVar, cVar.f14737b, str);
                            }
                        }
                    } else if (C6008d.C6013e.OfferWall == eVar) {
                        C5923w.this.f14495P.onOfferwallInitFail(str);
                    } else if (C6008d.C6013e.OfferWallCredits == eVar) {
                        C5923w.this.f14495P.onGetOWCreditsFailed(str);
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m14629a(com.ironsource.sdk.controller.C5923w r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = f14474ab
            java.lang.String r1 = r0.mo42564d(r1)
            java.lang.String r2 = f14475ac
            java.lang.String r0 = r0.mo42564d(r2)
            if (r5 == 0) goto L_0x001a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0022
            goto L_0x0023
        L_0x001a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0022
            r1 = r0
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x005c
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x0040
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003f }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x003f }
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0055
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0055 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0055 }
        L_0x0055:
            java.lang.String r4 = m14639b((java.lang.String) r1, (java.lang.String) r4)
            r3.mo42342b((java.lang.String) r4)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C5923w.m14629a(com.ironsource.sdk.controller.w, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    private void m14630a(String str, String str2, C6008d.C6013e eVar, C6007c cVar, C5971e eVar2) {
        String str3;
        String str4;
        String str5;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            eVar2.mo42355a("User id or Application key are missing", eVar, cVar);
            return;
        }
        C5972f fVar = new C5972f();
        if (eVar == C6008d.C6013e.RewardedVideo || eVar == C6008d.C6013e.Interstitial || eVar == C6008d.C6013e.OfferWall || eVar == C6008d.C6013e.Banner) {
            HashMap hashMap = new HashMap();
            hashMap.put("applicationKey", this.f14481B);
            hashMap.put("applicationUserId", this.f14482C);
            if (cVar != null) {
                if (cVar.f14739d != null) {
                    hashMap.putAll(cVar.f14739d);
                    C6049a aVar = C6049a.f14820a;
                    hashMap.put("loadStartTime", String.valueOf(C6049a.m14918a(cVar.f14737b)));
                }
                hashMap.put("demandSourceName", cVar.f14736a);
                hashMap.put("demandSourceId", cVar.f14737b);
            }
            Map<String, String> a = m14626a(eVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
            C6001a.C6002a aVar2 = new C6001a.C6002a();
            if (eVar == C6008d.C6013e.RewardedVideo) {
                aVar2.f14705a = "initRewardedVideo";
                aVar2.f14706b = "onInitRewardedVideoSuccess";
                str5 = "onInitRewardedVideoFail";
            } else if (eVar == C6008d.C6013e.Interstitial) {
                aVar2.f14705a = "initInterstitial";
                aVar2.f14706b = "onInitInterstitialSuccess";
                str5 = "onInitInterstitialFail";
            } else if (eVar == C6008d.C6013e.OfferWall) {
                aVar2.f14705a = "initOfferWall";
                aVar2.f14706b = "onInitOfferWallSuccess";
                str5 = "onInitOfferWallFail";
            } else {
                if (eVar == C6008d.C6013e.Banner) {
                    aVar2.f14705a = "initBanner";
                    aVar2.f14706b = "onInitBannerSuccess";
                    str5 = "onInitBannerFail";
                }
                str4 = m14624a(aVar2.f14705a, flatMapToJsonAsString, aVar2.f14706b, aVar2.f14707c);
                str3 = aVar2.f14705a;
            }
            aVar2.f14707c = str5;
            str4 = m14624a(aVar2.f14705a, flatMapToJsonAsString, aVar2.f14706b, aVar2.f14707c);
            str3 = aVar2.f14705a;
        } else {
            if (eVar == C6008d.C6013e.OfferWallCredits) {
                str3 = "getUserCredits";
                str4 = m14624a(str3, m14625a("productType", "OfferWall", "applicationKey", this.f14481B, "applicationUserId", this.f14482C, (String) null, (String) null, (String) null, false), "null", "onGetUserCreditsFail");
            }
            mo42342b(fVar.f14630b);
        }
        fVar.f14629a = str3;
        fVar.f14630b = str4;
        mo42342b(fVar.f14630b);
    }

    /* renamed from: a */
    private void m14631a(String str, String str2, String str3) {
        try {
            mo42342b(m14639b("assetCachedFailed", m14625a("file", str, "path", m14663i(str2), "errMsg", str3, (String) null, (String) null, (String) null, false)));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C6026a m14636b(C6008d.C6013e eVar) {
        if (eVar == C6008d.C6013e.Interstitial) {
            return this.f14494O;
        }
        if (eVar == C6008d.C6013e.RewardedVideo) {
            return this.f14493N;
        }
        if (eVar == C6008d.C6013e.Banner) {
            return this.f14496Q;
        }
        return null;
    }

    /* renamed from: b */
    public static String m14639b(String str, String str2) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "');";
    }

    /* renamed from: b */
    private void m14640b(JSONObject jSONObject) {
        if (jSONObject.optBoolean("inspectWebview")) {
            m14670m();
        }
    }

    /* renamed from: c */
    private String m14645c(JSONObject jSONObject) {
        C6058a a = C6058a.m14963a(getContext());
        StringBuilder sb = new StringBuilder();
        String a2 = C6058a.m14964a();
        if (!TextUtils.isEmpty(a2)) {
            sb.append("SDKVersion=");
            sb.append(a2);
            sb.append("&");
        }
        String str = a.f14847c;
        if (!TextUtils.isEmpty(str)) {
            sb.append("deviceOs=");
            sb.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + CertificateUtil.DELIMITER;
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + CertificateUtil.DELIMITER + port;
            }
            sb.append("&protocol");
            sb.append("=");
            sb.append(str2);
            sb.append("&domain");
            sb.append("=");
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&controllerConfig");
                        sb.append("=");
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            sb.append("&debug");
            sb.append("=");
            sb.append(f14479z);
        }
        return sb.toString();
    }

    /* renamed from: c */
    static /* synthetic */ void m14646c(C5923w wVar, final String str, String str2) {
        final String d = new C6015f(str2).mo42564d("errMsg");
        if (!TextUtils.isEmpty(d)) {
            wVar.mo42337a((Runnable) new Runnable() {
                public final void run() {
                    if (C5923w.m14612a() == C6008d.C6012d.MODE_3.f14768d) {
                        Activity a = C5923w.this.f14523w.mo42245a();
                        Toast.makeText(a, str + " : " + d, 1).show();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Object[] m14648c(Context context) {
        boolean z;
        C6058a a = C6058a.m14963a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", "none");
            jSONObject.put("deviceOrientation", SDKUtils.translateDeviceOrientation(C5527g.m13167p(context)));
            String str = a.f14845a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a.f14846b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
                z = false;
            } else {
                z = true;
            }
            try {
                SDKUtils.loadGoogleAdvertiserInfo(context);
                String advertiserId = SDKUtils.getAdvertiserId();
                Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
                if (!TextUtils.isEmpty(advertiserId)) {
                    Logger.m14957i(this.f14503a, "add AID and LAT");
                    jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                    jSONObject.put("deviceIds" + "[AID" + "]", SDKUtils.encodeString(advertiserId));
                }
                String str3 = a.f14847c;
                if (str3 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
                } else {
                    z = true;
                }
                String str4 = a.f14848d;
                if (str4 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                String str5 = a.f14848d;
                if (str5 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
                }
                String valueOf2 = String.valueOf(a.f14849e);
                if (valueOf2 != null) {
                    jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), valueOf2);
                } else {
                    z = true;
                }
                jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(C6058a.m14964a()));
                if (a.f14850f != null && a.f14850f.length() > 0) {
                    jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a.f14850f));
                }
                String a2 = C5499a.m13042a(context);
                if (!a2.equals("none")) {
                    jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a2));
                } else {
                    z = true;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject.put(SDKUtils.encodeString("hasVPN"), C5499a.m13047c(context));
                }
                String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
                }
                if (SDKUtils.isExternalStorageAvailable()) {
                    jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(C5527g.m13133a(this.f14512l))));
                } else {
                    z = true;
                }
                String valueOf3 = String.valueOf(C5527g.m13162m());
                if (!TextUtils.isEmpty(valueOf3)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("width") + "]", SDKUtils.encodeString(valueOf3));
                } else {
                    z = true;
                }
                String valueOf4 = String.valueOf(C5527g.m13163n());
                jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("height") + "]", SDKUtils.encodeString(valueOf4));
                String packageName = getContext().getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
                }
                String valueOf5 = String.valueOf(C5527g.m13165o());
                if (!TextUtils.isEmpty(valueOf5)) {
                    jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf5));
                }
                String valueOf6 = String.valueOf(C5527g.m13156j());
                if (!TextUtils.isEmpty(valueOf6)) {
                    jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf6));
                }
                C6058a.m14963a(context);
                jSONObject.put(SDKUtils.encodeString("deviceVolume"), (double) C6058a.m14965b(context));
                jSONObject.put(SDKUtils.encodeString(ServerParameters.DEVICE_CURRENT_BATTERY_LEVEL), C5527g.m13178w(context));
                jSONObject.put(SDKUtils.encodeString("mcc"), C5505a.C55061.m13080c(context));
                jSONObject.put(SDKUtils.encodeString("mnc"), C5505a.C55061.m13083d(context));
                jSONObject.put(SDKUtils.encodeString("phoneType"), C5505a.C55061.m13086f(context));
                jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(C5505a.C55061.m13085e(context)));
                jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), C5517c.m13103b(context));
                jSONObject.put(SDKUtils.encodeString("firstInstallTime"), C5517c.m13100a(context));
                jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C5517c.m13105c(context)));
                String d = C5517c.m13107d(context);
                if (!TextUtils.isEmpty(d)) {
                    jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d));
                }
                jSONObject.put(SDKUtils.encodeString("gpi"), C6052d.m14932a(getContext()));
                jSONObject.put(SDKUtils.encodeString("screenBrightness"), C5527g.m13129A(context));
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
                return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
            }
        } catch (JSONException e2) {
            e = e2;
            z = false;
            e.printStackTrace();
            return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Object[] m14649c(String str, String str2) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (!TextUtils.isEmpty(str)) {
            C6008d.C6013e h = m14660h(str);
            if (h == C6008d.C6013e.OfferWall) {
                map = this.f14483D;
            } else {
                C6007c a = this.f14501V.mo42310a(h, str2);
                if (a != null) {
                    Map<String, String> map2 = a.f14739d;
                    map2.put("demandSourceName", a.f14736a);
                    map2.put("demandSourceId", a.f14737b);
                    map = map2;
                }
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f14482C)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.f14482C));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(this.f14481B)) {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.f14481B));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        } else {
            z = true;
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).equalsIgnoreCase("sdkWebViewCache")) {
                    if (((String) next.getValue()).equalsIgnoreCase(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                        getSettings().setCacheMode(2);
                    } else {
                        getSettings().setCacheMode(-1);
                    }
                }
                try {
                    jSONObject.put(SDKUtils.encodeString((String) next.getKey()), SDKUtils.encodeString((String) next.getValue()));
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z)};
    }

    /* renamed from: g */
    static String m14656g(String str) {
        return "SSA_CORE.SDKController.runFunction('" + str + "');";
    }

    /* renamed from: g */
    static /* synthetic */ void m14657g(C5923w wVar, String str) {
        C6015f fVar = new C6015f(str);
        String d = fVar.mo42564d("color");
        String d2 = fVar.mo42564d("adViewId");
        int parseColor = !TJAdUnitConstants.String.TRANSPARENT.equalsIgnoreCase(d) ? Color.parseColor(d) : 0;
        if (d2 != null) {
            WebView a = C5844d.m14444a().mo42194a(d2);
            if (a != null) {
                a.setBackgroundColor(parseColor);
                return;
            }
            return;
        }
        wVar.setBackgroundColor(parseColor);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static C6008d.C6013e m14660h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(C6008d.C6013e.Interstitial.toString())) {
            return C6008d.C6013e.Interstitial;
        }
        if (str.equalsIgnoreCase(C6008d.C6013e.RewardedVideo.toString())) {
            return C6008d.C6013e.RewardedVideo;
        }
        if (str.equalsIgnoreCase(C6008d.C6013e.OfferWall.toString())) {
            return C6008d.C6013e.OfferWall;
        }
        if (str.equalsIgnoreCase(C6008d.C6013e.Banner.toString())) {
            return C6008d.C6013e.Banner;
        }
        return null;
    }

    /* renamed from: i */
    private String m14663i(String str) {
        String str2 = this.f14512l + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    /* renamed from: m */
    private static void m14670m() {
        if (Build.VERSION.SDK_INT >= 19) {
            setWebContentsDebuggingEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo42334a(int i) {
        String str;
        String str2;
        try {
            loadUrl("about:blank");
        } catch (Throwable th) {
            Logger.m14955e(this.f14503a, "WebViewController:: load: " + th.toString());
        }
        String str3 = Advertisement.FILE_SCHEME + this.f14512l + File.separator + "mobileController.html";
        if (new File(this.f14512l + File.separator + "mobileController.html").exists()) {
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            m14640b(controllerConfigAsJSONObject);
            String c = m14645c(controllerConfigAsJSONObject);
            Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
            if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
                c = String.format("%s&sessionid=%s", new Object[]{c, initSDKParams.get("sessionid")});
            }
            String str4 = str3 + "?" + c;
            this.f14506f = new CountDownTimer(50000, 1000, i) {

                /* renamed from: a */
                private /* synthetic */ int f14550a;

                {
                    this.f14550a = r6;
                }

                public final void onFinish() {
                    Logger.m14957i(C5923w.this.f14503a, "Loading Controller Timer Finish");
                    int i = this.f14550a;
                    if (i == 3) {
                        C5923w.this.f14502W.mo42250a("controller html - failed to load into web-view");
                    } else {
                        C5923w.this.mo42334a(i + 1);
                    }
                }

                public final void onTick(long j) {
                    String b = C5923w.this.f14503a;
                    Logger.m14957i(b, "Loading Controller Timer Tick " + j);
                }
            }.start();
            try {
                loadUrl(str4);
            } catch (Throwable th2) {
                Logger.m14955e(this.f14503a, "WebViewController:: load: " + th2.toString());
            }
            str = this.f14503a;
            str2 = "load(): " + str4;
        } else {
            str = this.f14503a;
            str2 = "load(): Mobile Controller HTML Does not exist";
        }
        Logger.m14957i(str, str2);
    }

    /* renamed from: a */
    public final void mo42259a(Context context) {
        C6044b bVar = this.f14504aa;
        if (bVar != null) {
            bVar.mo42589a(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0047;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42335a(com.ironsource.sdk.p150g.C6005b r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f14498S
            monitor-enter(r0)
            boolean r1 = r11.f14724d     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            boolean r1 = r10.f14485F     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0140
            java.lang.String r1 = r10.f14503a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "restoreState(state:"
            r2.<init>(r3)     // Catch:{ all -> 0x0144 }
            r2.append(r11)     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
            int r1 = r11.f14725e     // Catch:{ all -> 0x0144 }
            r2 = -1
            if (r1 == r2) goto L_0x0089
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p150g.C6008d.C6013e.RewardedVideo     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x004b
            java.lang.String r1 = r10.f14503a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onRVAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.p150g.C6008d.C6013e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f14723c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.m14636b((com.ironsource.sdk.p150g.C6008d.C6013e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
        L_0x0047:
            r4.mo42490a(r1, r3)     // Catch:{ all -> 0x0144 }
            goto L_0x0083
        L_0x004b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p150g.C6008d.C6013e.Interstitial     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x006b
            java.lang.String r1 = r10.f14503a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onInterstitialAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r1 = com.ironsource.sdk.p150g.C6008d.C6013e.Interstitial     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r11.f14723c     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.a r4 = r10.m14636b((com.ironsource.sdk.p150g.C6008d.C6013e) r1)     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x0083
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0083
            goto L_0x0047
        L_0x006b:
            com.ironsource.sdk.g.d$e r3 = com.ironsource.sdk.p150g.C6008d.C6013e.OfferWall     // Catch:{ all -> 0x0144 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0144 }
            if (r1 != r3) goto L_0x0083
            java.lang.String r1 = r10.f14503a     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = "onOWAdClosed()"
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.e r1 = r10.f14495P     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0083
            com.ironsource.sdk.j.e r1 = r10.f14495P     // Catch:{ all -> 0x0144 }
            r1.onOWAdClosed()     // Catch:{ all -> 0x0144 }
        L_0x0083:
            r11.f14725e = r2     // Catch:{ all -> 0x0144 }
            r1 = 0
            r11.f14723c = r1     // Catch:{ all -> 0x0144 }
            goto L_0x0090
        L_0x0089:
            java.lang.String r1 = r10.f14503a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = "No ad was opened"
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0144 }
        L_0x0090:
            java.lang.String r1 = r11.f14726f     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f14727g     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.f14501V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p150g.C6008d.C6013e.Interstitial     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.mo42312a(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00a0:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            r5 = 2
            if (r4 == 0) goto L_0x00e1
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p150g.C6007c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f14740e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00a0
            java.lang.String r5 = r10.f14503a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = "initInterstitial(appKey:"
            r6.<init>(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", userId:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            r6.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ", demandSource:"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r4.f14736a     // Catch:{ all -> 0x0144 }
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.c r5 = r10.f14494O     // Catch:{ all -> 0x0144 }
            r10.mo42265a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p150g.C6007c) r4, (com.ironsource.sdk.p153j.p154a.C6028c) r5)     // Catch:{ all -> 0x0144 }
            goto L_0x00a0
        L_0x00e1:
            java.lang.String r1 = r11.f14721a     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r11.f14722b     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.controller.j r3 = r10.f14501V     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.d$e r4 = com.ironsource.sdk.p150g.C6008d.C6013e.RewardedVideo     // Catch:{ all -> 0x0144 }
            java.util.Collection r3 = r3.mo42312a(r4)     // Catch:{ all -> 0x0144 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0144 }
        L_0x00f1:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x013d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.g.c r4 = (com.ironsource.sdk.p150g.C6007c) r4     // Catch:{ all -> 0x0144 }
            int r6 = r4.f14740e     // Catch:{ all -> 0x0144 }
            if (r6 != r5) goto L_0x00f1
            java.lang.String r6 = r4.f14736a     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f14503a     // Catch:{ all -> 0x0144 }
            java.lang.String r8 = "onRVNoMoreOffers()"
            android.util.Log.d(r7, r8)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r7 = r10.f14493N     // Catch:{ all -> 0x0144 }
            r7.mo42509b(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r7 = r10.f14503a     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = "initRewardedVideo(appKey:"
            r8.<init>(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", userId:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r2)     // Catch:{ all -> 0x0144 }
            java.lang.String r9 = ", demandSource:"
            r8.append(r9)     // Catch:{ all -> 0x0144 }
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = ")"
            r8.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0144 }
            android.util.Log.d(r7, r6)     // Catch:{ all -> 0x0144 }
            com.ironsource.sdk.j.a.d r6 = r10.f14493N     // Catch:{ all -> 0x0144 }
            r10.mo42266a((java.lang.String) r1, (java.lang.String) r2, (com.ironsource.sdk.p150g.C6007c) r4, (com.ironsource.sdk.p153j.p154a.C6029d) r6)     // Catch:{ all -> 0x0144 }
            goto L_0x00f1
        L_0x013d:
            r1 = 0
            r11.f14724d = r1     // Catch:{ all -> 0x0144 }
        L_0x0140:
            r10.f14515o = r11     // Catch:{ all -> 0x0144 }
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            return
        L_0x0144:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0144 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C5923w.mo42335a(com.ironsource.sdk.g.b):void");
    }

    /* renamed from: a */
    public final void mo42260a(C6007c cVar, Map<String, String> map, C6027b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo42547a()});
        if (map != null) {
            mo42342b(m14624a("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    /* renamed from: a */
    public final void mo42261a(C6007c cVar, Map<String, String> map, C6028c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo42547a()});
        this.f14515o.mo42541a(cVar.f14737b, true);
        mo42342b(m14624a("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42336a(final C6008d.C6013e eVar, final String str) {
        mo42337a((Runnable) new Runnable() {
            public final void run() {
                if (eVar == C6008d.C6013e.RewardedVideo || eVar == C6008d.C6013e.Interstitial) {
                    C6026a a = C5923w.this.m14636b(eVar);
                    if (a != null) {
                        a.mo42490a(eVar, str);
                    }
                } else if (eVar == C6008d.C6013e.OfferWall) {
                    C5923w.this.f14495P.onOWAdClosed();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo42314a(C6020c cVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C5863f fVar = this.f14513m;
            C59323 r0 = new Runnable() {
                public final void run() {
                    C5923w.this.mo42334a(1);
                }
            };
            if (!fVar.mo42254a()) {
                if (fVar.f14300c == C5863f.C5866a.f14308b) {
                    fVar.mo42256c();
                }
                fVar.f14301d = C5863f.C5867b.CONTROLLER_FROM_SERVER;
                fVar.mo42253a(fVar.f14301d);
                r0.run();
                return;
            }
            return;
        }
        String name = cVar.getName();
        String parent = cVar.getParent();
        try {
            mo42342b(m14639b("assetCached", m14625a("file", name, "path", m14663i(parent), (String) null, (String) null, (String) null, (String) null, (String) null, false)));
        } catch (Exception e) {
            m14631a(name, parent, e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo42315a(C6020c cVar, final C6014e eVar) {
        if (cVar.getName().contains("mobileController.html")) {
            C5863f fVar = this.f14513m;
            C59334 r0 = new Runnable() {
                public final void run() {
                    C5923w.this.mo42334a(1);
                }
            };
            C59345 r1 = new Runnable() {
                public final void run() {
                    C5862e h = C5923w.this.f14502W;
                    h.mo42250a("controller html - failed to download - " + eVar.f14776a);
                }
            };
            if (fVar.mo42254a()) {
                return;
            }
            if (fVar.f14300c != C5863f.C5866a.f14308b || !fVar.mo42257d()) {
                C5821a a = new C5821a().mo42154a("generalmessage", Integer.valueOf(fVar.f14299b));
                if (fVar.f14298a > 0) {
                    a.mo42154a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.f14298a));
                }
                C5825d.m14394a(C5827f.f14180u, (Map<String, Object>) a.f14151a);
                r1.run();
                return;
            }
            fVar.f14301d = C5863f.C5867b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.mo42253a(fVar.f14301d);
            r0.run();
            return;
        }
        m14631a(cVar.getName(), cVar.getParent(), eVar.f14776a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42337a(Runnable runnable) {
        Handler handler = this.f14499T;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo42263a(String str, C6028c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.f14515o.mo42541a(str, true);
        mo42342b(m14624a("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    /* renamed from: a */
    public final void mo42338a(String str, String str2) {
        mo42342b(m14639b("onNativeLifeCycleEvent", m14625a("lifeCycleEvent", str2, "productType", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: a */
    public final void mo42264a(String str, String str2, C6007c cVar, C6027b bVar) {
        this.f14481B = str;
        this.f14482C = str2;
        this.f14496Q = bVar;
        m14630a(str, str2, C6008d.C6013e.Banner, cVar, (C5971e) new C5971e() {
            /* renamed from: a */
            public final void mo42355a(String str, C6008d.C6013e eVar, C6007c cVar) {
                C5923w.m14628a(C5923w.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42265a(String str, String str2, C6007c cVar, C6028c cVar2) {
        this.f14481B = str;
        this.f14482C = str2;
        this.f14494O = cVar2;
        this.f14515o.f14726f = str;
        this.f14515o.f14727g = this.f14482C;
        m14630a(this.f14481B, this.f14482C, C6008d.C6013e.Interstitial, cVar, (C5971e) new C5971e() {
            /* renamed from: a */
            public final void mo42355a(String str, C6008d.C6013e eVar, C6007c cVar) {
                C5923w.m14628a(C5923w.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42266a(String str, String str2, C6007c cVar, C6029d dVar) {
        this.f14481B = str;
        this.f14482C = str2;
        this.f14493N = dVar;
        this.f14515o.f14721a = str;
        this.f14515o.f14722b = str2;
        m14630a(str, str2, C6008d.C6013e.RewardedVideo, cVar, (C5971e) new C5971e() {
            /* renamed from: a */
            public final void mo42355a(String str, C6008d.C6013e eVar, C6007c cVar) {
                C5923w.m14628a(C5923w.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42267a(String str, String str2, C6033e eVar) {
        this.f14481B = str;
        this.f14482C = str2;
        this.f14495P = eVar;
        m14630a(str, str2, C6008d.C6013e.OfferWallCredits, (C6007c) null, (C5971e) new C5971e() {
            /* renamed from: a */
            public final void mo42355a(String str, C6008d.C6013e eVar, C6007c cVar) {
                C5923w.m14628a(C5923w.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42268a(String str, String str2, Map<String, String> map, C6033e eVar) {
        this.f14481B = str;
        this.f14482C = str2;
        this.f14483D = map;
        this.f14495P = eVar;
        this.f14515o.f14730j = map;
        this.f14515o.f14728h = true;
        m14630a(this.f14481B, this.f14482C, C6008d.C6013e.OfferWall, (C6007c) null, (C5971e) new C5971e() {
            /* renamed from: a */
            public final void mo42355a(String str, C6008d.C6013e eVar, C6007c cVar) {
                C5923w.m14628a(C5923w.this, str, eVar, cVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo42269a(Map<String, String> map, C6033e eVar) {
        this.f14483D = map;
        mo42342b("SSA_CORE.SDKController.runFunction('" + "showOfferWall" + "','" + "onShowOfferWallSuccess" + "','" + "onShowOfferWallFail" + "');");
    }

    /* renamed from: a */
    public final void mo42270a(JSONObject jSONObject) {
        mo42342b(m14639b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    /* renamed from: a */
    public final void mo42271a(JSONObject jSONObject, C6028c cVar) {
        mo42342b(m14623a(C6008d.C6013e.Interstitial, jSONObject));
    }

    /* renamed from: a */
    public final void mo42272a(JSONObject jSONObject, C6029d dVar) {
        mo42342b(m14623a(C6008d.C6013e.RewardedVideo, jSONObject));
    }

    /* renamed from: a */
    public final void mo42339a(boolean z, String str) {
        mo42342b(m14639b("viewableChange", m14625a("webview", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "isViewable", z)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo42340a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            Logger.m14953d(this.f14503a, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(C6008d.C6013e.Interstitial.toString()) ? !str.equalsIgnoreCase(C6008d.C6013e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(C6008d.C6013e.Banner.toString()) ? (str.equalsIgnoreCase(C6008d.C6013e.OfferWall.toString()) || str.equalsIgnoreCase(C6008d.C6013e.OfferWallCredits.toString())) && this.f14495P != null : this.f14496Q != null : this.f14493N != null : this.f14494O != null) {
            z = true;
        }
        if (!z) {
            String str2 = this.f14503a;
            Logger.m14953d(str2, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    /* renamed from: b */
    public final void mo42341b() {
        mo42342b(m14656g("interceptedUrlToStore"));
    }

    /* renamed from: b */
    public final void mo42273b(Context context) {
        C6044b bVar = this.f14504aa;
        if (bVar != null) {
            bVar.mo42590b(context);
        }
    }

    /* renamed from: b */
    public final void mo42274b(C6007c cVar, Map<String, String> map, C6028c cVar2) {
        mo42342b(m14623a(C6008d.C6013e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.mo42547a()}))));
    }

    /* renamed from: b */
    public void mo42342b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
            if (f14479z != C6008d.C6012d.MODE_0.f14768d && (f14479z < C6008d.C6012d.MODE_1.f14768d || f14479z > C6008d.C6012d.MODE_3.f14768d)) {
                str2 = "empty";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("try{");
            sb.append(str);
            sb.append("}catch(e){");
            sb.append(str2);
            sb.append("}");
            final String str3 = "javascript:" + sb.toString();
            mo42337a((Runnable) new Runnable() {
                public final void run() {
                    C5923w wVar;
                    Boolean bool;
                    Logger.m14957i(C5923w.this.f14503a, str3);
                    try {
                        if (C5923w.this.f14497R != null) {
                            if (C5923w.this.f14497R.booleanValue()) {
                                C5923w.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                                return;
                            } else {
                                C5923w.this.loadUrl(str3);
                                return;
                            }
                        } else if (Build.VERSION.SDK_INT >= 19) {
                            C5923w.this.evaluateJavascript(sb.toString(), (ValueCallback) null);
                            Boolean unused = C5923w.this.f14497R = Boolean.TRUE;
                            return;
                        } else {
                            C5923w.this.loadUrl(str3);
                            Boolean unused2 = C5923w.this.f14497R = Boolean.FALSE;
                            return;
                        }
                    } catch (NoSuchMethodError e) {
                        String b = C5923w.this.f14503a;
                        Logger.m14955e(b, "evaluateJavascrip NoSuchMethodError: SDK version=" + Build.VERSION.SDK_INT + " " + e);
                        C5923w.this.loadUrl(str3);
                        wVar = C5923w.this;
                        bool = Boolean.FALSE;
                    } catch (Throwable th) {
                        String b2 = C5923w.this.f14503a;
                        Logger.m14955e(b2, "injectJavascript: " + th.toString());
                        return;
                    }
                    Boolean unused3 = wVar.f14497R = bool;
                }
            });
        }
    }

    /* renamed from: c */
    public final C6008d.C6011c mo42275c() {
        return C6008d.C6011c.Web;
    }

    /* renamed from: c */
    public final boolean mo42276c(String str) {
        C6007c a = this.f14501V.mo42310a(C6008d.C6013e.Interstitial, str);
        return a != null && a.f14741f;
    }

    /* renamed from: d */
    public final void mo42277d() {
        mo42342b(m14624a("destroyBanner", "", "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    /* renamed from: d */
    public final void mo42343d(String str) {
        String str2 = this.f14503a;
        Logger.m14957i(str2, "device status changed, connection type " + str);
        C5822b.m14388a(str);
        mo42342b(m14639b("deviceStatusChanged", m14625a("connectionType", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    public void destroy() {
        super.destroy();
        C6037b bVar = this.f14484E;
        if (bVar != null) {
            bVar.mo42577a();
        }
        C6044b bVar2 = this.f14504aa;
        if (bVar2 != null) {
            bVar2.f14813a.mo42585a();
        }
        CountDownTimer countDownTimer = this.f14506f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f14499T = null;
    }

    /* renamed from: e */
    public final void mo42279e() {
        mo42342b(m14656g("enterForeground"));
    }

    /* renamed from: e */
    public final void mo42344e(String str) {
        if (str.equals(TJAdUnitConstants.String.FORCE_CLOSE)) {
            mo42346h();
        }
        mo42342b(m14639b("engageEnd", m14625a("action", str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
    }

    /* renamed from: f */
    public final void mo42280f() {
        mo42342b(m14656g("enterBackground"));
    }

    /* renamed from: f */
    public final boolean mo42345f(String str) {
        List<String> b = C6059b.m14967a().mo42614b();
        try {
            if (b.isEmpty()) {
                return false;
            }
            for (String contains : b) {
                if (str.contains(contains)) {
                    C5505a.C55061.m13074a(this.f14523w.mo42245a(), str, (String) null);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public final void mo42281g() {
        mo42335a(this.f14515o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo42346h() {
        C6035g gVar = this.f14524x;
        if (gVar != null) {
            gVar.onCloseRequested();
        }
    }

    /* renamed from: i */
    public final void mo42347i() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.f14503a;
            Logger.m14957i(str, "WebViewController: onPause() - " + th);
        }
    }

    /* renamed from: j */
    public final void mo42348j() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.f14503a;
            Logger.m14957i(str, "WebViewController: onResume() - " + th);
        }
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        String str5 = this.f14503a;
        Logger.m14957i(str5, str + " " + str4);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C6035g gVar;
        if (i != 4 || (gVar = this.f14524x) == null || !gVar.onBackButtonPressed()) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }
}
