package com.mbridge.msdk.video.p214bt.p215a;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6097a;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6196f;
import com.mbridge.msdk.foundation.entity.C6202l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.p164db.C6157o;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.tools.C6337h;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6364t;
import com.mbridge.msdk.mbsignalcommon.windvane.C6557a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.p214bt.module.BTBaseView;
import com.mbridge.msdk.video.p214bt.module.MBTempContainer;
import com.mbridge.msdk.video.p214bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.p214bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.p214bt.module.MBridgeBTNativeEC;
import com.mbridge.msdk.video.p214bt.module.MBridgeBTVideoView;
import com.mbridge.msdk.video.p214bt.module.MBridgeBTWebView;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.videocommon.download.C7191g;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.a.c */
/* compiled from: OperateViews */
public final class C6877c {

    /* renamed from: a */
    private static ConcurrentHashMap<String, LinkedHashMap<String, View>> f16846a = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static LinkedHashMap<String, String> f16847b = new LinkedHashMap<>();

    /* renamed from: c */
    private static LinkedHashMap<String, CampaignEx> f16848c = new LinkedHashMap<>();

    /* renamed from: d */
    private static LinkedHashMap<String, C7179c> f16849d = new LinkedHashMap<>();

    /* renamed from: e */
    private static LinkedHashMap<String, String> f16850e = new LinkedHashMap<>();

    /* renamed from: f */
    private static LinkedHashMap<String, Integer> f16851f = new LinkedHashMap<>();

    /* renamed from: g */
    private static volatile int f16852g = 10000;

    /* renamed from: h */
    private static int f16853h = 0;

    /* renamed from: i */
    private static int f16854i = 1;

    /* renamed from: j */
    private static String f16855j = "";

    /* renamed from: k */
    private static int f16856k;

    /* renamed from: l */
    private static int f16857l;

    /* renamed from: m */
    private static int f16858m;

    /* renamed from: n */
    private static int f16859n;

    /* renamed from: o */
    private static int f16860o;

    /* renamed from: com.mbridge.msdk.video.bt.a.c$a */
    /* compiled from: OperateViews */
    private static class C6880a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C6877c f16872a = new C6877c();
    }

    private C6877c() {
    }

    /* renamed from: a */
    public static C6877c m17219a() {
        return C6880a.f16872a;
    }

    /* renamed from: b */
    public final String mo48200b() {
        f16852g++;
        return String.valueOf(f16852g);
    }

    /* renamed from: a */
    public final CampaignEx mo48191a(String str) {
        if (f16848c.containsKey(str)) {
            return f16848c.get(str);
        }
        return null;
    }

    /* renamed from: g */
    private String m17224g(String str) {
        return f16847b.containsKey(str) ? f16847b.get(str) : "";
    }

    /* renamed from: a */
    public final void mo48198a(String str, String str2) {
        f16847b.put(str, str2);
    }

    /* renamed from: b */
    public final C7179c mo48199b(String str) {
        if (f16849d.containsKey(str)) {
            return f16849d.get(str);
        }
        return null;
    }

    /* renamed from: c */
    public final String mo48204c(String str) {
        return f16850e.containsKey(str) ? f16850e.get(str) : "";
    }

    /* renamed from: a */
    public final void mo48197a(String str, int i) {
        f16851f.put(str, Integer.valueOf(i));
    }

    /* renamed from: d */
    public final int mo48206d(String str) {
        if (f16851f.containsKey(str)) {
            return f16851f.get(str).intValue();
        }
        return 2;
    }

    /* renamed from: e */
    public final void mo48209e(String str) {
        if (f16850e.containsKey(str)) {
            f16850e.remove(str);
        }
        if (f16849d.containsKey(str)) {
            f16849d.remove(str);
        }
        if (f16848c.containsKey(str)) {
            f16848c.remove(str);
        }
        if (f16847b.containsKey(str)) {
            f16847b.remove(str);
        }
    }

    /* renamed from: f */
    public final void mo48211f(String str) {
        if (f16851f.containsKey(str)) {
            f16851f.remove(str);
        }
    }

    /* renamed from: b */
    public final synchronized LinkedHashMap<String, View> mo48201b(String str, String str2) {
        ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap = f16846a;
        if (concurrentHashMap.containsKey(str + "_" + str2)) {
            ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap2 = f16846a;
            return concurrentHashMap2.get(str + "_" + str2);
        }
        LinkedHashMap<String, View> linkedHashMap = new LinkedHashMap<>();
        ConcurrentHashMap<String, LinkedHashMap<String, View>> concurrentHashMap3 = f16846a;
        concurrentHashMap3.put(str + "_" + str2, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: c */
    private void m17223c(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16854i);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C6361q.m16154a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo48193a(WebView webView, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16854i);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C6563g.m16891a().mo44523a(webView, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C6361q.m16154a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo48195a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16853h);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m17223c(obj, e.getMessage());
            C6361q.m16154a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: a */
    private void m17221a(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16853h);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            C6563g.m16891a().mo44524a(obj, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            m17223c(obj, e.getMessage());
            C6361q.m16154a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo48194a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16853h);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject.put("data", jSONObject2);
            C6563g.m16891a().mo44522a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            mo48193a(webView, e.getMessage());
            C6361q.m16154a("OperateViews", e.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo48196a(Object obj, JSONObject jSONObject) {
        final int i;
        final int i2;
        final Rect rect;
        try {
            final String optString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(optString)) {
                m17223c(obj, "unitId is empty");
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            int optInt = optJSONObject.optInt(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_DELAY, 0);
            final String optString2 = optJSONObject.optString("fileURL");
            final String optString3 = optJSONObject.optString("filePath");
            final String optString4 = optJSONObject.optString(TJAdUnitConstants.String.HTML);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            Rect rect2 = new Rect(-999, -999, -999, -999);
            if (optJSONObject2 != null) {
                Rect rect3 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt(TJAdUnitConstants.String.BOTTOM, -999));
                int optInt2 = optJSONObject2.optInt("width");
                i = optJSONObject2.optInt("height");
                rect = rect3;
                i2 = optInt2;
            } else {
                rect = rect2;
                i2 = 0;
                i = 0;
            }
            final Object obj2 = obj;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public final void run() {
                    String str;
                    WindVaneWebView windVaneWebView;
                    C6557a aVar = (C6557a) obj2;
                    if (aVar.f16345a != null) {
                        windVaneWebView = aVar.f16345a;
                        str = windVaneWebView.getRid();
                    } else {
                        str = "";
                        windVaneWebView = null;
                    }
                    LinkedHashMap<String, View> b = C6877c.this.mo48201b(optString, str);
                    String b2 = C6877c.this.mo48200b();
                    C6877c.f16847b.put(b2, str);
                    MBridgeBTWebView mBridgeBTWebView = new MBridgeBTWebView(C6122a.m15302b().mo42895d());
                    b.put(b2, mBridgeBTWebView);
                    mBridgeBTWebView.setInstanceId(b2);
                    mBridgeBTWebView.setUnitId(optString);
                    mBridgeBTWebView.setFileURL(optString2);
                    mBridgeBTWebView.setFilePath(optString3);
                    mBridgeBTWebView.setHtml(optString4);
                    mBridgeBTWebView.setRect(rect);
                    mBridgeBTWebView.setWebViewRid(str);
                    mBridgeBTWebView.setCreateWebView(windVaneWebView);
                    if (i2 > 0 || i > 0) {
                        mBridgeBTWebView.setLayout(i2, i);
                    }
                    mBridgeBTWebView.preload();
                    C6877c.this.mo48195a(obj2, b2);
                    C6361q.m16154a("OperateViews", "createWebview instanceId = " + b2);
                }
            }, (long) optInt);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "createWebview failed：" + th.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo48203b(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optString)) {
                    String str = "";
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                    if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                        str = parseCampaignWithBackData.getRequestId();
                    }
                    int optInt = optJSONObject.optInt("show_time", 0);
                    int optInt2 = optJSONObject.optInt("show_mute", 0);
                    int optInt3 = optJSONObject.optInt("show_close", 0);
                    int optInt4 = optJSONObject.optInt("orientation", 1);
                    MBridgeBTVideoView mBridgeBTVideoView = new MBridgeBTVideoView(C6122a.m15302b().mo42895d());
                    mBridgeBTVideoView.setCampaign(parseCampaignWithBackData);
                    mBridgeBTVideoView.setUnitId(optString);
                    mBridgeBTVideoView.setShowMute(optInt2);
                    mBridgeBTVideoView.setShowTime(optInt);
                    mBridgeBTVideoView.setShowClose(optInt3);
                    mBridgeBTVideoView.setOrientation(optInt4);
                    C6557a aVar = (C6557a) obj;
                    if (aVar.f16345a != null) {
                        WindVaneWebView windVaneWebView = aVar.f16345a;
                        str = windVaneWebView.getRid();
                        mBridgeBTVideoView.setCreateWebView(windVaneWebView);
                    }
                    LinkedHashMap<String, View> b = mo48201b(optString, str);
                    String b2 = mo48200b();
                    f16847b.put(b2, str);
                    mBridgeBTVideoView.setInstanceId(b2);
                    b.put(b2, mBridgeBTVideoView);
                    mBridgeBTVideoView.preLoadData();
                    if (parseCampaignWithBackData == null) {
                        m17223c(obj, "campaign is null");
                        C6361q.m16154a("OperateViews", "createPlayerView failed");
                    } else {
                        mo48195a(obj, b2);
                        C6361q.m16154a("OperateViews", "createPlayerView instanceId = " + b2);
                    }
                    C6872a.m17208a().mo48176a(b2, mBridgeBTVideoView);
                    return;
                }
            }
            m17223c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "createPlayerView failed：" + th.getMessage());
        }
    }

    /* renamed from: c */
    public final void mo48205c(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optString)) {
                    int optInt = optJSONObject.optInt("mute");
                    String str = "";
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                    if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                        str = parseCampaignWithBackData.getRequestId();
                    }
                    C7179c a = C7179c.m18150a(optJSONObject.optJSONObject("unitSetting"));
                    if (a != null) {
                        a.mo49120a(optString);
                    }
                    String optString2 = optJSONObject.optString(DataKeys.USER_ID);
                    if (TextUtils.isEmpty(str)) {
                        C6557a aVar = (C6557a) obj;
                        if (aVar.f16345a != null) {
                            str = aVar.f16345a.getRid();
                        }
                    }
                    LinkedHashMap<String, View> b = mo48201b(optString, str);
                    String b2 = mo48200b();
                    f16847b.put(b2, str);
                    MBTempContainer mBTempContainer = new MBTempContainer(C6122a.m15302b().mo42895d());
                    mBTempContainer.setInstanceId(b2);
                    mBTempContainer.setUnitId(optString);
                    mBTempContainer.setCampaign(parseCampaignWithBackData);
                    mBTempContainer.setRewardUnitSetting(a);
                    mBTempContainer.setBigOffer(true);
                    if (!TextUtils.isEmpty(optString2)) {
                        mBTempContainer.setUserId(optString2);
                    }
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
                    if (optJSONObject2 != null) {
                        String optString3 = optJSONObject2.optString("id");
                        C7170c cVar = new C7170c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                        if (!TextUtils.isEmpty(optString3)) {
                            mBTempContainer.setRewardId(optString3);
                        }
                        if (!TextUtils.isEmpty(cVar.mo49082a())) {
                            mBTempContainer.setReward(cVar);
                        }
                    }
                    String optString4 = optJSONObject.optString("extra");
                    if (!TextUtils.isEmpty(optString4)) {
                        mBTempContainer.setDeveloperExtraData(optString4);
                    }
                    mBTempContainer.setMute(optInt);
                    b.put(b2, mBTempContainer);
                    f16850e.put(b2, optString);
                    f16848c.put(b2, parseCampaignWithBackData);
                    f16849d.put(b2, a);
                    mo48195a(obj, b2);
                    C6361q.m16154a("OperateViews", "createSubPlayTemplateView instanceId = " + b2);
                    return;
                }
            }
            m17223c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "createSubPlayTemplateView failed：" + th.getMessage());
        }
    }

    /* renamed from: d */
    public final void mo48207d(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") != null) {
                if (!TextUtils.isEmpty(optString)) {
                    String g = m17224g(optString2);
                    if (TextUtils.isEmpty(g)) {
                        C6557a aVar = (C6557a) obj;
                        if (aVar.f16345a != null) {
                            g = aVar.f16345a.getRid();
                        }
                    }
                    LinkedHashMap<String, View> b = mo48201b(optString, g);
                    if (b == null || !b.containsKey(optString2)) {
                        m17223c(obj, "unitId or instanceId not exist");
                        C6361q.m16154a("OperateViews", "destroyComponent failed");
                        return;
                    }
                    View view = b.get(optString2);
                    b.remove(optString2);
                    if (!(view == null || view.getParent() == null)) {
                        ViewGroup viewGroup = (ViewGroup) view.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(view);
                        }
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) view;
                            if (viewGroup2.getChildCount() > 0) {
                                int childCount = viewGroup2.getChildCount();
                                for (int i = 0; i < childCount; i++) {
                                    View childAt = viewGroup2.getChildAt(i);
                                    if (childAt instanceof MBridgeBTWebView) {
                                        b.remove(((MBridgeBTWebView) childAt).getInstanceId());
                                        ((MBridgeBTWebView) childAt).onDestory();
                                    } else if (childAt instanceof MBridgeBTVideoView) {
                                        b.remove(((MBridgeBTVideoView) childAt).getInstanceId());
                                        ((MBridgeBTVideoView) childAt).onDestory();
                                    } else if (childAt instanceof MBTempContainer) {
                                        b.remove(((MBTempContainer) childAt).getInstanceId());
                                        ((MBTempContainer) childAt).onDestroy();
                                    }
                                }
                            }
                        }
                    }
                    if (view instanceof MBTempContainer) {
                        ((MBTempContainer) view).onDestroy();
                    }
                    if (view instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) view).onDestory();
                    }
                    if (view instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) view).onDestory();
                    }
                    mo48195a(obj, optString2);
                    m17221a(obj, "onComponentDestroy", optString2);
                    C6361q.m16154a("OperateViews", "destroyComponent instanceId = " + optString2);
                    return;
                }
            }
            m17223c(obj, "unidId or data is empty");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "destroyComponent failed");
        }
    }

    /* renamed from: e */
    public final void mo48208e(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            String optString = jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
            } else {
                mo48195a(obj, optString);
            }
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
        }
    }

    /* renamed from: f */
    public final void mo48210f(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m17223c(obj, "data is empty");
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
            if (optJSONObject2 == null) {
                m17223c(obj, "rect not exist");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            Rect rect = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt(TJAdUnitConstants.String.BOTTOM, -999));
            int optInt = optJSONObject2.optInt("width");
            int optInt2 = optJSONObject2.optInt("height");
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view != null) {
                    if (view.getParent() != null) {
                        view.setLayoutParams(m17218a(view.getLayoutParams(), rect, optInt, optInt2));
                        view.requestLayout();
                    } else {
                        if (view instanceof MBridgeBTWebView) {
                            ((MBridgeBTWebView) view).setRect(rect);
                            ((MBridgeBTWebView) view).setLayout(optInt, optInt2);
                        }
                        if (view instanceof MBridgeBTVideoView) {
                            ((MBridgeBTVideoView) view).setRect(rect);
                            ((MBridgeBTVideoView) view).setLayout(optInt, optInt2);
                        }
                    }
                    mo48195a(obj, optString2);
                    m17221a(obj, "onViewRectChanged", optString2);
                    C6361q.m16154a("OperateViews", "setViewRect instanceId = " + optString2);
                    return;
                }
                m17223c(obj, "view is null");
                C6361q.m16154a("OperateViews", "setViewRect failed: view is null");
                return;
            }
            m17223c(obj, "instanceId not exist");
            C6361q.m16154a("OperateViews", "setViewRect failed: instanceId not exist");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "setViewRect failed: " + th.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.widget.LinearLayout$LayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.widget.LinearLayout$LayoutParams} */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.ViewGroup.LayoutParams m17218a(android.view.ViewGroup.LayoutParams r5, android.graphics.Rect r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = -999(0xfffffffffffffc19, float:NaN)
            if (r6 != 0) goto L_0x0009
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r0, r0, r0, r0)
        L_0x0009:
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            android.content.Context r1 = r1.mo42895d()
            if (r1 != 0) goto L_0x0014
            return r5
        L_0x0014:
            boolean r2 = r5 instanceof android.widget.FrameLayout.LayoutParams
            r3 = -1
            if (r2 == 0) goto L_0x0065
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r3, r3)
            int r2 = r6.left
            if (r2 == r0) goto L_0x002b
            int r2 = r6.left
            float r2 = (float) r2
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)
            r5.leftMargin = r2
        L_0x002b:
            int r2 = r6.top
            if (r2 == r0) goto L_0x0038
            int r2 = r6.top
            float r2 = (float) r2
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)
            r5.topMargin = r2
        L_0x0038:
            int r2 = r6.right
            if (r2 == r0) goto L_0x0045
            int r2 = r6.right
            float r2 = (float) r2
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)
            r5.rightMargin = r2
        L_0x0045:
            int r2 = r6.bottom
            if (r2 == r0) goto L_0x0052
            int r6 = r6.bottom
            float r6 = (float) r6
            int r6 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r6)
            r5.bottomMargin = r6
        L_0x0052:
            if (r7 <= 0) goto L_0x005b
            float r6 = (float) r7
            int r6 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r6)
            r5.width = r6
        L_0x005b:
            if (r8 <= 0) goto L_0x0064
            float r6 = (float) r8
            int r6 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r6)
            r5.height = r6
        L_0x0064:
            return r5
        L_0x0065:
            boolean r2 = r5 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L_0x00b5
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r5.<init>(r3, r3)
            int r2 = r6.left
            if (r2 == r0) goto L_0x007b
            int r2 = r6.left
            float r2 = (float) r2
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)
            r5.leftMargin = r2
        L_0x007b:
            int r2 = r6.top
            if (r2 == r0) goto L_0x0088
            int r2 = r6.top
            float r2 = (float) r2
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)
            r5.topMargin = r2
        L_0x0088:
            int r2 = r6.right
            if (r2 == r0) goto L_0x0095
            int r2 = r6.right
            float r2 = (float) r2
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)
            r5.rightMargin = r2
        L_0x0095:
            int r2 = r6.bottom
            if (r2 == r0) goto L_0x00a2
            int r6 = r6.bottom
            float r6 = (float) r6
            int r6 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r6)
            r5.bottomMargin = r6
        L_0x00a2:
            if (r7 <= 0) goto L_0x00ab
            float r6 = (float) r7
            int r6 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r6)
            r5.width = r6
        L_0x00ab:
            if (r8 <= 0) goto L_0x00b4
            float r6 = (float) r8
            int r6 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r6)
            r5.height = r6
        L_0x00b4:
            return r5
        L_0x00b5:
            boolean r2 = r5 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L_0x0104
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r3, r3)
            int r2 = r6.left
            if (r2 == r0) goto L_0x00cb
            int r2 = r6.left
            float r2 = (float) r2
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)
            r5.leftMargin = r2
        L_0x00cb:
            int r2 = r6.top
            if (r2 == r0) goto L_0x00d8
            int r2 = r6.top
            float r2 = (float) r2
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)
            r5.topMargin = r2
        L_0x00d8:
            int r2 = r6.right
            if (r2 == r0) goto L_0x00e5
            int r2 = r6.right
            float r2 = (float) r2
            int r2 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r2)
            r5.rightMargin = r2
        L_0x00e5:
            int r2 = r6.bottom
            if (r2 == r0) goto L_0x00f2
            int r6 = r6.bottom
            float r6 = (float) r6
            int r6 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r6)
            r5.bottomMargin = r6
        L_0x00f2:
            if (r7 <= 0) goto L_0x00fb
            float r6 = (float) r7
            int r6 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r6)
            r5.width = r6
        L_0x00fb:
            if (r8 <= 0) goto L_0x0104
            float r6 = (float) r8
            int r6 = com.mbridge.msdk.foundation.tools.C6366u.m16203b((android.content.Context) r1, (float) r6)
            r5.height = r6
        L_0x0104:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.p215a.C6877c.m17218a(android.view.ViewGroup$LayoutParams, android.graphics.Rect, int, int):android.view.ViewGroup$LayoutParams");
    }

    /* renamed from: g */
    public final void mo48212g(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view == null || view.getParent() == null) {
                    m17223c(obj, "view is null");
                    C6361q.m16154a("OperateViews", "removeFromSuperView failed: view is null instanceId = " + optString2);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                    mo48195a(obj, optString2);
                    m17221a(obj, "onRemoveFromView", optString2);
                    C6361q.m16154a("OperateViews", "removeFromSuperView instanceId = " + optString2);
                    return;
                }
                m17223c(obj, "parent is null");
                C6361q.m16154a("OperateViews", "removeFromSuperView failed: parent is null instanceId = " + optString2);
                return;
            }
            m17223c(obj, "params not enough");
            C6361q.m16154a("OperateViews", "removeFromSuperView failed: params not enough instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "removeFromSuperView failed: " + th.getMessage());
        }
    }

    /* renamed from: h */
    public final void mo48213h(Object obj, JSONObject jSONObject) {
        int i;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m17223c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("id");
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (!b.containsKey(optString3) || !b.containsKey(optString2)) {
                m17223c(obj, "instanceId is not exist");
                C6361q.m16154a("OperateViews", "appendSubView failed: instanceId is not exist");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) b.get(optString2);
            View view = b.get(optString3);
            if (viewGroup != null) {
                if (view != null) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                    int i2 = 0;
                    if (view instanceof MBTempContainer) {
                        C6361q.m16158d("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", new Object[]{Integer.valueOf(f16856k), Integer.valueOf(f16857l), Integer.valueOf(f16858m), Integer.valueOf(f16859n), Integer.valueOf(f16860o)}));
                        ((MBTempContainer) view).setNotchPadding(f16856k, f16857l, f16858m, f16859n, f16860o);
                        Iterator<View> it = b.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            View next = it.next();
                            if (next instanceof MBridgeBTContainer) {
                                ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                break;
                            }
                        }
                    } else {
                        Rect rect = null;
                        if (optJSONObject2 != null) {
                            Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt(TJAdUnitConstants.String.BOTTOM, -999));
                            i2 = optJSONObject2.optInt("width");
                            i = optJSONObject2.optInt("height");
                            rect = rect2;
                        } else if (view instanceof BTBaseView) {
                            rect = ((BTBaseView) view).getRect();
                            i2 = ((BTBaseView) view).getViewWidth();
                            i = ((BTBaseView) view).getViewHeight();
                        } else {
                            i = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof RelativeLayout) {
                            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        } else if (viewGroup instanceof LinearLayout) {
                            layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        }
                        viewGroup.addView(view, m17218a(layoutParams, rect, i2, i));
                    }
                    mo48195a(obj, optString2);
                    m17221a(obj, "onAppendView", optString2);
                    C6361q.m16154a("OperateViews", "appendSubView parentId = " + optString2 + " childId = " + optString3);
                    return;
                }
            }
            m17223c(obj, "view is not exist");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "appendSubView failed: " + th.getMessage());
        }
    }

    /* renamed from: i */
    public final void mo48214i(Object obj, JSONObject jSONObject) {
        int i;
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optString)) {
                    String optString3 = optJSONObject.optString("id");
                    LinkedHashMap<String, View> b = mo48201b(optString, g);
                    if (!b.containsKey(optString2) || !b.containsKey(optString3)) {
                        m17223c(obj, "instanceId is not exist");
                        C6361q.m16154a("OperateViews", "appendViewTo failed: instanceId is not exist");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) b.get(optString3);
                    View view = b.get(optString2);
                    if (viewGroup != null) {
                        if (view != null) {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("rect");
                            if (view instanceof MBTempContainer) {
                                Iterator<View> it = b.values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    View next = it.next();
                                    if (next instanceof MBridgeBTContainer) {
                                        ((MBridgeBTContainer) next).appendSubView((MBridgeBTContainer) next, (MBTempContainer) view, optJSONObject2);
                                        break;
                                    }
                                }
                            } else {
                                Rect rect = null;
                                int i2 = 0;
                                if (optJSONObject2 != null) {
                                    Rect rect2 = new Rect(optJSONObject2.optInt("left", -999), optJSONObject2.optInt("top", -999), optJSONObject2.optInt("right", -999), optJSONObject2.optInt(TJAdUnitConstants.String.BOTTOM, -999));
                                    i2 = optJSONObject2.optInt("width");
                                    i = optJSONObject2.optInt("height");
                                    rect = rect2;
                                } else if (view instanceof BTBaseView) {
                                    rect = ((BTBaseView) view).getRect();
                                    i2 = ((BTBaseView) view).getViewWidth();
                                    i = ((BTBaseView) view).getViewHeight();
                                } else {
                                    i = 0;
                                }
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                                if (viewGroup instanceof FrameLayout) {
                                    layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                } else if (viewGroup instanceof RelativeLayout) {
                                    layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                                } else if (viewGroup instanceof LinearLayout) {
                                    layoutParams = new LinearLayout.LayoutParams(-1, -1);
                                }
                                viewGroup.addView(view, m17218a(layoutParams, rect, i2, i));
                            }
                            mo48195a(obj, optString2);
                            m17221a(obj, "onAppendViewTo", optString2);
                            C6361q.m16154a("OperateViews", "appendViewTo parentId = " + optString3 + " childId = " + optString2);
                            return;
                        }
                    }
                    m17223c(obj, "view is not exist");
                    return;
                }
            }
            m17223c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "appendViewTo failed: " + th.getMessage());
        }
    }

    /* renamed from: j */
    public final void mo48215j(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view == null || view.getParent() == null) {
                    m17223c(obj, "view is null");
                    C6361q.m16154a("OperateViews", "bringViewToFront failed: view is null");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.bringChildToFront(view);
                    mo48195a(obj, optString2);
                    m17221a(obj, "onBringViewToFront", optString2);
                    C6361q.m16154a("OperateViews", "bringViewToFront instanceId = " + optString2);
                    return;
                }
                m17223c(obj, "parent is null");
                C6361q.m16154a("OperateViews", "bringViewToFront failed: parent is null");
                return;
            }
            m17223c(obj, "instanceId is not exist");
            C6361q.m16154a("OperateViews", "bringViewToFront failed: instanceId is not exist");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "bringViewToFront failed: " + th.getMessage());
        }
    }

    /* renamed from: k */
    public final void mo48216k(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view != null) {
                    view.setVisibility(8);
                    mo48195a(obj, optString2);
                    m17221a(obj, "onHideView", optString2);
                    C6361q.m16154a("OperateViews", "hideView instanceId = " + optString2);
                    return;
                }
                m17223c(obj, "view not exist");
                C6361q.m16154a("OperateViews", "hideView failed: view not exist");
                return;
            }
            m17223c(obj, "instanceId not exist");
            C6361q.m16154a("OperateViews", "hideView failed: instanceId not exist");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "hideView failed: + " + th.getMessage());
        }
    }

    /* renamed from: l */
    public final void mo48217l(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view != null) {
                    view.setVisibility(0);
                    mo48195a(obj, optString2);
                    m17221a(obj, "onShowView", optString2);
                    C6361q.m16154a("OperateViews", "showView instanceId = " + optString2);
                    return;
                }
                m17223c(obj, "view not exist");
                C6361q.m16154a("OperateViews", "showView failed: view not exist instanceId = " + optString2);
                return;
            }
            m17223c(obj, "instanceId not exist");
            C6361q.m16154a("OperateViews", "showView failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "showView failed: " + th.getMessage());
        }
    }

    /* renamed from: m */
    public final void mo48218m(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m17223c(obj, "data is empty");
                return;
            }
            String optString3 = optJSONObject.optString("color");
            if (TextUtils.isEmpty(optString3)) {
                m17223c(obj, "color is not exist");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view != null) {
                    mo48195a(obj, optString2);
                    view.setBackgroundColor(Color.parseColor(optString3));
                    m17221a(obj, "onViewBgColorChanged", optString2);
                    C6361q.m16154a("OperateViews", "setViewBgColor instanceId = " + optString2);
                    return;
                }
                m17223c(obj, "view not exist");
                C6361q.m16154a("OperateViews", "setViewBgColor failed: view not exist instanceId = " + optString2);
                return;
            }
            m17223c(obj, "instanceId not exist");
            C6361q.m16154a("OperateViews", "setViewBgColor failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "setViewBgColor failed: " + th.getMessage());
        }
    }

    /* renamed from: n */
    public final void mo48219n(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m17223c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("alpha", 1.0d);
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view != null) {
                    view.setAlpha((float) optDouble);
                    mo48195a(obj, optString2);
                    m17221a(obj, "onViewAlphaChanged", optString2);
                    C6361q.m16154a("OperateViews", "setViewAlpha instanceId = " + optString2);
                    return;
                }
                m17223c(obj, "view not exist");
                C6361q.m16154a("OperateViews", "setViewAlpha failed: view not exist instanceId = " + optString2);
                return;
            }
            m17223c(obj, "instanceId not exist");
            C6361q.m16154a("OperateViews", "setViewAlpha failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "setViewAlpha failed: " + th.getMessage());
        }
    }

    /* renamed from: o */
    public final void mo48220o(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m17223c(obj, "data is empty");
                return;
            }
            double optDouble = optJSONObject.optDouble("vertical", 1.0d);
            double optDouble2 = optJSONObject.optDouble("horizon", 1.0d);
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view != null) {
                    view.setScaleX((float) optDouble2);
                    view.setScaleY((float) optDouble);
                    mo48195a(obj, optString2);
                    m17221a(obj, "onViewScaleChanged", optString2);
                    C6361q.m16154a("OperateViews", "setViewScale instanceId = " + optString2);
                    return;
                }
                m17223c(obj, "view not exist");
                C6361q.m16154a("OperateViews", "setViewScale failed: view not exist instanceId = " + optString2);
                return;
            }
            m17223c(obj, "instanceId not exist");
            C6361q.m16154a("OperateViews", "setViewScale failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "setViewScale failed: " + th.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7 A[Catch:{ all -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd A[Catch:{ all -> 0x0142 }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48221p(java.lang.Object r13, org.json.JSONObject r14) {
        /*
            r12 = this;
            java.lang.String r0 = "OperateViews"
            java.lang.String r1 = "unitId"
            java.lang.String r1 = r14.optString(r1)     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = "id"
            java.lang.String r2 = r14.optString(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r3 = r12.m17224g(r2)     // Catch:{ all -> 0x0142 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x0025
            r4 = r13
            com.mbridge.msdk.mbsignalcommon.windvane.a r4 = (com.mbridge.msdk.mbsignalcommon.windvane.C6557a) r4     // Catch:{ all -> 0x0142 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r5 = r4.f16345a     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x0025
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r3 = r4.f16345a     // Catch:{ all -> 0x0142 }
            java.lang.String r3 = r3.getRid()     // Catch:{ all -> 0x0142 }
        L_0x0025:
            java.lang.String r4 = "data"
            org.json.JSONObject r14 = r14.optJSONObject(r4)     // Catch:{ all -> 0x0142 }
            if (r14 != 0) goto L_0x0033
            java.lang.String r14 = "data is empty"
            r12.m17223c((java.lang.Object) r13, (java.lang.String) r14)     // Catch:{ all -> 0x0142 }
            return
        L_0x0033:
            java.lang.String r4 = "targetComponentId"
            java.lang.String r4 = r14.optString(r4)     // Catch:{ all -> 0x0142 }
            java.lang.String r5 = "rect"
            org.json.JSONObject r14 = r14.optJSONObject(r5)     // Catch:{ all -> 0x0142 }
            java.util.LinkedHashMap r1 = r12.mo48201b((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ all -> 0x0142 }
            boolean r3 = r1.containsKey(r2)     // Catch:{ all -> 0x0142 }
            if (r3 == 0) goto L_0x0128
            boolean r3 = r1.containsKey(r4)     // Catch:{ all -> 0x0142 }
            if (r3 == 0) goto L_0x0128
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x0142 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0142 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0142 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x010e
            android.view.ViewParent r5 = r1.getParent()     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x010e
            android.view.ViewParent r5 = r1.getParent()     // Catch:{ all -> 0x0142 }
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ all -> 0x0142 }
            int r1 = r5.indexOfChild(r1)     // Catch:{ all -> 0x0142 }
            r6 = 0
            r7 = 0
            if (r14 != 0) goto L_0x0090
            boolean r14 = r3 instanceof com.mbridge.msdk.video.p214bt.module.BTBaseView     // Catch:{ all -> 0x0142 }
            if (r14 == 0) goto L_0x008e
            r14 = r3
            com.mbridge.msdk.video.bt.module.BTBaseView r14 = (com.mbridge.msdk.video.p214bt.module.BTBaseView) r14     // Catch:{ all -> 0x0142 }
            android.graphics.Rect r6 = r14.getRect()     // Catch:{ all -> 0x0142 }
            r14 = r3
            com.mbridge.msdk.video.bt.module.BTBaseView r14 = (com.mbridge.msdk.video.p214bt.module.BTBaseView) r14     // Catch:{ all -> 0x0142 }
            int r7 = r14.getViewWidth()     // Catch:{ all -> 0x0142 }
            r14 = r3
            com.mbridge.msdk.video.bt.module.BTBaseView r14 = (com.mbridge.msdk.video.p214bt.module.BTBaseView) r14     // Catch:{ all -> 0x0142 }
            int r14 = r14.getViewHeight()     // Catch:{ all -> 0x0142 }
        L_0x008a:
            r11 = r7
            r7 = r14
            r14 = r11
            goto L_0x00bd
        L_0x008e:
            r14 = 0
            goto L_0x00bd
        L_0x0090:
            java.lang.String r6 = "left"
            r7 = -999(0xfffffffffffffc19, float:NaN)
            int r6 = r14.optInt(r6, r7)     // Catch:{ all -> 0x0142 }
            java.lang.String r8 = "top"
            int r8 = r14.optInt(r8, r7)     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = "right"
            int r9 = r14.optInt(r9, r7)     // Catch:{ all -> 0x0142 }
            java.lang.String r10 = "bottom"
            int r7 = r14.optInt(r10, r7)     // Catch:{ all -> 0x0142 }
            android.graphics.Rect r10 = new android.graphics.Rect     // Catch:{ all -> 0x0142 }
            r10.<init>(r6, r8, r9, r7)     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = "width"
            int r7 = r14.optInt(r6)     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = "height"
            int r14 = r14.optInt(r6)     // Catch:{ all -> 0x0142 }
            r6 = r10
            goto L_0x008a
        L_0x00bd:
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x0142 }
            r9 = -1
            r8.<init>(r9, r9)     // Catch:{ all -> 0x0142 }
            boolean r10 = r5 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x00cd
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0142 }
            r8.<init>(r9, r9)     // Catch:{ all -> 0x0142 }
            goto L_0x00e0
        L_0x00cd:
            boolean r10 = r5 instanceof android.widget.RelativeLayout     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x00d7
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0142 }
            r8.<init>(r9, r9)     // Catch:{ all -> 0x0142 }
            goto L_0x00e0
        L_0x00d7:
            boolean r10 = r5 instanceof android.widget.LinearLayout     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x00e0
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x0142 }
            r8.<init>(r9, r9)     // Catch:{ all -> 0x0142 }
        L_0x00e0:
            android.view.ViewGroup$LayoutParams r14 = r12.m17218a(r8, r6, r14, r7)     // Catch:{ all -> 0x0142 }
            int r1 = r1 + 1
            r5.addView(r3, r1, r14)     // Catch:{ all -> 0x0142 }
            r12.mo48195a((java.lang.Object) r13, (java.lang.String) r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r14 = "onInsertViewAbove"
            r12.m17221a((java.lang.Object) r13, (java.lang.String) r14, (java.lang.String) r2)     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r14.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = "insertViewAbove instanceId = "
            r14.append(r1)     // Catch:{ all -> 0x0142 }
            r14.append(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = " brotherId = "
            r14.append(r1)     // Catch:{ all -> 0x0142 }
            r14.append(r4)     // Catch:{ all -> 0x0142 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0142 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r14)     // Catch:{ all -> 0x0142 }
            goto L_0x0162
        L_0x010e:
            java.lang.String r14 = "view not exist"
            r12.m17223c((java.lang.Object) r13, (java.lang.String) r14)     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r14.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = "insertViewAbove failed: view not exist instanceId = "
            r14.append(r1)     // Catch:{ all -> 0x0142 }
            r14.append(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0142 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r14)     // Catch:{ all -> 0x0142 }
            goto L_0x0162
        L_0x0128:
            java.lang.String r14 = "instanceId not exist"
            r12.m17223c((java.lang.Object) r13, (java.lang.String) r14)     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r14.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = "insertViewAbove failed: instanceId not exist instanceId = "
            r14.append(r1)     // Catch:{ all -> 0x0142 }
            r14.append(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0142 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r14)     // Catch:{ all -> 0x0142 }
            goto L_0x0162
        L_0x0142:
            r14 = move-exception
            java.lang.String r1 = r14.getMessage()
            r12.m17223c((java.lang.Object) r13, (java.lang.String) r1)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "insertViewAbove failed: "
            r13.append(r1)
            java.lang.String r14 = r14.getMessage()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r13)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.p215a.C6877c.mo48221p(java.lang.Object, org.json.JSONObject):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c7 A[Catch:{ all -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd A[Catch:{ all -> 0x0138 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222q(java.lang.Object r12, org.json.JSONObject r13) {
        /*
            r11 = this;
            java.lang.String r0 = "OperateViews"
            java.lang.String r1 = "unitId"
            java.lang.String r1 = r13.optString(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "id"
            java.lang.String r2 = r13.optString(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = r11.m17224g(r2)     // Catch:{ all -> 0x0138 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0138 }
            if (r4 == 0) goto L_0x0025
            r4 = r12
            com.mbridge.msdk.mbsignalcommon.windvane.a r4 = (com.mbridge.msdk.mbsignalcommon.windvane.C6557a) r4     // Catch:{ all -> 0x0138 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r5 = r4.f16345a     // Catch:{ all -> 0x0138 }
            if (r5 == 0) goto L_0x0025
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r3 = r4.f16345a     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = r3.getRid()     // Catch:{ all -> 0x0138 }
        L_0x0025:
            java.lang.String r4 = "data"
            org.json.JSONObject r13 = r13.optJSONObject(r4)     // Catch:{ all -> 0x0138 }
            if (r13 != 0) goto L_0x0033
            java.lang.String r13 = "data is empty"
            r11.m17223c((java.lang.Object) r12, (java.lang.String) r13)     // Catch:{ all -> 0x0138 }
            return
        L_0x0033:
            java.lang.String r4 = "targetComponentId"
            java.lang.String r4 = r13.optString(r4)     // Catch:{ all -> 0x0138 }
            java.lang.String r5 = "rect"
            org.json.JSONObject r13 = r13.optJSONObject(r5)     // Catch:{ all -> 0x0138 }
            java.util.LinkedHashMap r1 = r11.mo48201b((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ all -> 0x0138 }
            boolean r3 = r1.containsKey(r2)     // Catch:{ all -> 0x0138 }
            if (r3 == 0) goto L_0x011e
            boolean r3 = r1.containsKey(r4)     // Catch:{ all -> 0x0138 }
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x0138 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ all -> 0x0138 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0138 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0138 }
            if (r1 == 0) goto L_0x0104
            android.view.ViewParent r4 = r1.getParent()     // Catch:{ all -> 0x0138 }
            if (r4 == 0) goto L_0x0104
            android.view.ViewParent r4 = r1.getParent()     // Catch:{ all -> 0x0138 }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x0138 }
            int r1 = r4.indexOfChild(r1)     // Catch:{ all -> 0x0138 }
            r5 = 0
            r6 = 0
            if (r13 != 0) goto L_0x0090
            boolean r13 = r3 instanceof com.mbridge.msdk.video.p214bt.module.BTBaseView     // Catch:{ all -> 0x0138 }
            if (r13 == 0) goto L_0x008e
            r13 = r3
            com.mbridge.msdk.video.bt.module.BTBaseView r13 = (com.mbridge.msdk.video.p214bt.module.BTBaseView) r13     // Catch:{ all -> 0x0138 }
            android.graphics.Rect r5 = r13.getRect()     // Catch:{ all -> 0x0138 }
            r13 = r3
            com.mbridge.msdk.video.bt.module.BTBaseView r13 = (com.mbridge.msdk.video.p214bt.module.BTBaseView) r13     // Catch:{ all -> 0x0138 }
            int r6 = r13.getViewWidth()     // Catch:{ all -> 0x0138 }
            r13 = r3
            com.mbridge.msdk.video.bt.module.BTBaseView r13 = (com.mbridge.msdk.video.p214bt.module.BTBaseView) r13     // Catch:{ all -> 0x0138 }
            int r13 = r13.getViewHeight()     // Catch:{ all -> 0x0138 }
        L_0x008a:
            r10 = r6
            r6 = r13
            r13 = r10
            goto L_0x00bd
        L_0x008e:
            r13 = 0
            goto L_0x00bd
        L_0x0090:
            java.lang.String r5 = "left"
            r6 = -999(0xfffffffffffffc19, float:NaN)
            int r5 = r13.optInt(r5, r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = "top"
            int r7 = r13.optInt(r7, r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = "right"
            int r8 = r13.optInt(r8, r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r9 = "bottom"
            int r6 = r13.optInt(r9, r6)     // Catch:{ all -> 0x0138 }
            android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ all -> 0x0138 }
            r9.<init>(r5, r7, r8, r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r5 = "width"
            int r6 = r13.optInt(r5)     // Catch:{ all -> 0x0138 }
            java.lang.String r5 = "height"
            int r13 = r13.optInt(r5)     // Catch:{ all -> 0x0138 }
            r5 = r9
            goto L_0x008a
        L_0x00bd:
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x0138 }
            r8 = -1
            r7.<init>(r8, r8)     // Catch:{ all -> 0x0138 }
            boolean r9 = r4 instanceof android.widget.FrameLayout     // Catch:{ all -> 0x0138 }
            if (r9 == 0) goto L_0x00cd
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x0138 }
            r7.<init>(r8, r8)     // Catch:{ all -> 0x0138 }
            goto L_0x00e0
        L_0x00cd:
            boolean r9 = r4 instanceof android.widget.RelativeLayout     // Catch:{ all -> 0x0138 }
            if (r9 == 0) goto L_0x00d7
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x0138 }
            r7.<init>(r8, r8)     // Catch:{ all -> 0x0138 }
            goto L_0x00e0
        L_0x00d7:
            boolean r9 = r4 instanceof android.widget.LinearLayout     // Catch:{ all -> 0x0138 }
            if (r9 == 0) goto L_0x00e0
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x0138 }
            r7.<init>(r8, r8)     // Catch:{ all -> 0x0138 }
        L_0x00e0:
            android.view.ViewGroup$LayoutParams r13 = r11.m17218a(r7, r5, r13, r6)     // Catch:{ all -> 0x0138 }
            r4.addView(r3, r1, r13)     // Catch:{ all -> 0x0138 }
            r11.mo48195a((java.lang.Object) r12, (java.lang.String) r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = "onInsertViewBelow"
            r11.m17221a((java.lang.Object) r12, (java.lang.String) r13, (java.lang.String) r2)     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r13.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "insertViewBelow instanceId = "
            r13.append(r1)     // Catch:{ all -> 0x0138 }
            r13.append(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0138 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r13)     // Catch:{ all -> 0x0138 }
            goto L_0x0158
        L_0x0104:
            java.lang.String r13 = "view not exist"
            r11.m17223c((java.lang.Object) r12, (java.lang.String) r13)     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r13.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "insertViewBelow failed: view not exist instanceId = "
            r13.append(r1)     // Catch:{ all -> 0x0138 }
            r13.append(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0138 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r13)     // Catch:{ all -> 0x0138 }
            goto L_0x0158
        L_0x011e:
            java.lang.String r13 = "instanceId not exist"
            r11.m17223c((java.lang.Object) r12, (java.lang.String) r13)     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r13.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "insertViewBelow failed: instanceId not exist instanceId = "
            r13.append(r1)     // Catch:{ all -> 0x0138 }
            r13.append(r2)     // Catch:{ all -> 0x0138 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0138 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r13)     // Catch:{ all -> 0x0138 }
            goto L_0x0158
        L_0x0138:
            r13 = move-exception
            java.lang.String r1 = r13.getMessage()
            r11.m17223c((java.lang.Object) r12, (java.lang.String) r1)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "insertViewBelow failed: "
            r12.append(r1)
            java.lang.String r13 = r13.getMessage()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r12)
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.p215a.C6877c.mo48222q(java.lang.Object, org.json.JSONObject):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48223r(java.lang.Object r19, org.json.JSONObject r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r20
            java.lang.String r3 = "unitId"
            java.lang.String r4 = "OperateViews"
            java.lang.String r5 = r0.optString(r3)     // Catch:{ all -> 0x0191 }
            java.lang.String r6 = "id"
            java.lang.String r6 = r0.optString(r6)     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r1.m17224g(r6)     // Catch:{ all -> 0x0191 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0191 }
            if (r8 == 0) goto L_0x002b
            r8 = r2
            com.mbridge.msdk.mbsignalcommon.windvane.a r8 = (com.mbridge.msdk.mbsignalcommon.windvane.C6557a) r8     // Catch:{ all -> 0x0191 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r9 = r8.f16345a     // Catch:{ all -> 0x0191 }
            if (r9 == 0) goto L_0x002b
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r7 = r8.f16345a     // Catch:{ all -> 0x0191 }
            java.lang.String r7 = r7.getRid()     // Catch:{ all -> 0x0191 }
        L_0x002b:
            java.lang.String r8 = "data"
            org.json.JSONObject r8 = r0.optJSONObject(r8)     // Catch:{ all -> 0x0191 }
            if (r8 != 0) goto L_0x0039
            java.lang.String r0 = "data is empty"
            r1.m17223c((java.lang.Object) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            return
        L_0x0039:
            java.lang.String r9 = "content"
            org.json.JSONObject r8 = r8.optJSONObject(r9)     // Catch:{ all -> 0x0191 }
            if (r8 != 0) goto L_0x0047
            java.lang.String r0 = "content is empty"
            r1.m17223c((java.lang.Object) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            return
        L_0x0047:
            java.lang.String r9 = "fileURL"
            java.lang.String r9 = r8.optString(r9)     // Catch:{ all -> 0x0191 }
            java.lang.String r10 = "filePath"
            java.lang.String r10 = r8.optString(r10)     // Catch:{ all -> 0x0191 }
            java.lang.String r11 = "html"
            java.lang.String r11 = r8.optString(r11)     // Catch:{ all -> 0x0191 }
            boolean r12 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0191 }
            if (r12 == 0) goto L_0x0071
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0191 }
            if (r12 == 0) goto L_0x0071
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0191 }
            if (r12 == 0) goto L_0x0071
            java.lang.String r0 = "url is empty"
            r1.m17223c((java.lang.Object) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            return
        L_0x0071:
            java.lang.String r12 = "campaigns"
            org.json.JSONArray r12 = r8.optJSONArray(r12)     // Catch:{ all -> 0x0191 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0191 }
            r13.<init>()     // Catch:{ all -> 0x0191 }
            if (r12 == 0) goto L_0x00a2
            int r15 = r12.length()     // Catch:{ all -> 0x0191 }
            if (r15 <= 0) goto L_0x00a2
            int r15 = r12.length()     // Catch:{ all -> 0x0191 }
            r14 = 0
        L_0x0089:
            if (r14 >= r15) goto L_0x00a2
            org.json.JSONObject r16 = r12.getJSONObject(r14)     // Catch:{ all -> 0x0191 }
            r17 = r12
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r16)     // Catch:{ all -> 0x0191 }
            if (r12 == 0) goto L_0x009d
            r12.setCampaignUnitId(r5)     // Catch:{ all -> 0x0191 }
            r13.add(r12)     // Catch:{ all -> 0x0191 }
        L_0x009d:
            int r14 = r14 + 1
            r12 = r17
            goto L_0x0089
        L_0x00a2:
            java.lang.String r3 = r8.optString(r3)     // Catch:{ all -> 0x0191 }
            java.lang.String r12 = "unitSetting"
            org.json.JSONObject r12 = r8.optJSONObject(r12)     // Catch:{ all -> 0x0191 }
            com.mbridge.msdk.videocommon.d.c r12 = com.mbridge.msdk.videocommon.p239d.C7179c.m18150a((org.json.JSONObject) r12)     // Catch:{ all -> 0x0191 }
            if (r12 == 0) goto L_0x00b5
            r12.mo49120a((java.lang.String) r3)     // Catch:{ all -> 0x0191 }
        L_0x00b5:
            java.lang.String r3 = "rect"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ all -> 0x0191 }
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ all -> 0x0191 }
            r14 = -999(0xfffffffffffffc19, float:NaN)
            r3.<init>(r14, r14, r14, r14)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x00f6
            java.lang.String r3 = "left"
            int r3 = r0.optInt(r3, r14)     // Catch:{ all -> 0x00f1 }
            java.lang.String r15 = "top"
            int r15 = r0.optInt(r15, r14)     // Catch:{ all -> 0x00f1 }
            r16 = r4
            java.lang.String r4 = "right"
            int r4 = r0.optInt(r4, r14)     // Catch:{ all -> 0x018b }
            java.lang.String r2 = "bottom"
            int r2 = r0.optInt(r2, r14)     // Catch:{ all -> 0x018b }
            android.graphics.Rect r14 = new android.graphics.Rect     // Catch:{ all -> 0x018b }
            r14.<init>(r3, r15, r4, r2)     // Catch:{ all -> 0x018b }
            java.lang.String r2 = "width"
            int r2 = r0.optInt(r2)     // Catch:{ all -> 0x018b }
            java.lang.String r3 = "height"
            int r0 = r0.optInt(r3)     // Catch:{ all -> 0x018b }
            r3 = r14
            goto L_0x00fa
        L_0x00f1:
            r0 = move-exception
            r2 = r19
            goto L_0x0192
        L_0x00f6:
            r16 = r4
            r0 = 0
            r2 = 0
        L_0x00fa:
            java.lang.String r4 = "refreshCache"
            r14 = 0
            int r4 = r8.optInt(r4, r14)     // Catch:{ all -> 0x018b }
            java.util.LinkedHashMap r5 = r1.mo48201b((java.lang.String) r5, (java.lang.String) r7)     // Catch:{ all -> 0x018b }
            boolean r7 = r5.containsKey(r6)     // Catch:{ all -> 0x018b }
            if (r7 == 0) goto L_0x016b
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x018b }
            android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x018b }
            boolean r7 = r5 instanceof com.mbridge.msdk.video.p214bt.module.MBridgeBTWebView     // Catch:{ all -> 0x018b }
            if (r7 == 0) goto L_0x014d
            com.mbridge.msdk.video.bt.module.MBridgeBTWebView r5 = (com.mbridge.msdk.video.p214bt.module.MBridgeBTWebView) r5     // Catch:{ all -> 0x018b }
            r5.setHtml(r11)     // Catch:{ all -> 0x018b }
            r5.setFilePath(r10)     // Catch:{ all -> 0x018b }
            r5.setFileURL(r9)     // Catch:{ all -> 0x018b }
            r5.setRect(r3)     // Catch:{ all -> 0x018b }
            r5.setLayout(r2, r0)     // Catch:{ all -> 0x018b }
            r5.setCampaigns(r13)     // Catch:{ all -> 0x018b }
            r5.setRewardUnitSetting(r12)     // Catch:{ all -> 0x018b }
            r5.webviewLoad(r4)     // Catch:{ all -> 0x018b }
            r2 = r19
            r1.mo48195a((java.lang.Object) r2, (java.lang.String) r6)     // Catch:{ all -> 0x014b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x014b }
            r0.<init>()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "webviewLoad instanceId = "
            r0.append(r3)     // Catch:{ all -> 0x014b }
            r0.append(r6)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x014b }
            r3 = r16
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r3, r0)     // Catch:{ all -> 0x0189 }
            goto L_0x01b2
        L_0x014b:
            r0 = move-exception
            goto L_0x018e
        L_0x014d:
            r2 = r19
            r3 = r16
            java.lang.String r0 = "view not exist"
            r1.m17223c((java.lang.Object) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r0.<init>()     // Catch:{ all -> 0x0189 }
            java.lang.String r4 = "webviewLoad failed: view not exist instanceId = "
            r0.append(r4)     // Catch:{ all -> 0x0189 }
            r0.append(r6)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0189 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r3, r0)     // Catch:{ all -> 0x0189 }
            goto L_0x01b2
        L_0x016b:
            r2 = r19
            r3 = r16
            java.lang.String r0 = "instanceId not exist"
            r1.m17223c((java.lang.Object) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r0.<init>()     // Catch:{ all -> 0x0189 }
            java.lang.String r4 = "webviewLoad failed: instanceId not exist instanceId = "
            r0.append(r4)     // Catch:{ all -> 0x0189 }
            r0.append(r6)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0189 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r3, r0)     // Catch:{ all -> 0x0189 }
            goto L_0x01b2
        L_0x0189:
            r0 = move-exception
            goto L_0x0193
        L_0x018b:
            r0 = move-exception
            r2 = r19
        L_0x018e:
            r3 = r16
            goto L_0x0193
        L_0x0191:
            r0 = move-exception
        L_0x0192:
            r3 = r4
        L_0x0193:
            java.lang.String r4 = r0.getMessage()
            r1.m17223c((java.lang.Object) r2, (java.lang.String) r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "webviewLoad failed: "
            r2.append(r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r3, r0)
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.p215a.C6877c.mo48223r(java.lang.Object, org.json.JSONObject):void");
    }

    /* renamed from: s */
    public final void mo48224s(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (!(view instanceof MBridgeBTWebView)) {
                    m17223c(obj, "view not exist");
                    C6361q.m16154a("OperateViews", "webviewReload failed view not exist instanceId = " + optString2);
                } else if (((MBridgeBTWebView) view).webviewReload()) {
                    mo48195a(obj, optString2);
                    C6361q.m16154a("OperateViews", "webviewReload instanceId = " + optString2);
                } else {
                    m17223c(obj, "reload failed");
                    C6361q.m16154a("OperateViews", "webviewReload failed reload failed instanceId = " + optString2);
                }
            } else {
                m17223c(obj, "instanceId not exist");
                C6361q.m16154a("OperateViews", "webviewReload failed instanceId not exist instanceId = " + optString2);
            }
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "webviewReload failed: " + th.getMessage());
        }
    }

    /* renamed from: t */
    public final void mo48225t(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (!(view instanceof MBridgeBTWebView)) {
                    m17223c(obj, "view not exist");
                    C6361q.m16154a("OperateViews", "webviewGoBack failed view not exist instanceId = " + optString2);
                } else if (((MBridgeBTWebView) view).webviewGoBack()) {
                    mo48195a(obj, optString2);
                    C6361q.m16154a("OperateViews", "webviewGoBack instanceId = " + optString2);
                } else {
                    m17223c(obj, "webviewGoBack failed");
                    C6361q.m16154a("OperateViews", "webviewGoBack failed instanceId = " + optString2);
                }
            } else {
                m17223c(obj, "instanceId not exist");
                C6361q.m16154a("OperateViews", "webviewGoBack failed instanceId not exist instanceId = " + optString2);
            }
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "webviewGoBack failed: " + th.getMessage());
        }
    }

    /* renamed from: u */
    public final void mo48226u(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (!(view instanceof MBridgeBTWebView)) {
                    m17223c(obj, "view not exist");
                    C6361q.m16154a("OperateViews", "webviewGoForward failed view not exist instanceId = " + optString2);
                } else if (((MBridgeBTWebView) view).webviewGoForward()) {
                    mo48195a(obj, optString2);
                    C6361q.m16154a("OperateViews", "webviewGoForward instanceId = " + optString2);
                } else {
                    m17223c(obj, "webviewGoForward failed");
                    C6361q.m16154a("OperateViews", "webviewGoForward failed instanceId = " + optString2);
                }
            } else {
                m17223c(obj, "instanceId not exist");
                C6361q.m16154a("OperateViews", "webviewGoForward failed instanceId not exist instanceId = " + optString2);
            }
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "webviewGoForward failed: " + th.getMessage());
        }
    }

    /* renamed from: v */
    public final void mo48227v(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).play();
                    mo48195a(obj, optString2);
                    C6361q.m16154a("OperateViews", "playerPlay success");
                    return;
                }
                m17223c(obj, "instanceId is not player");
                C6361q.m16154a("OperateViews", "playerPlay failed instanceId is not player instanceId = " + optString2);
                return;
            }
            m17223c(obj, "instanceId not exit");
            C6361q.m16154a("OperateViews", "playerPlay failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "playerPlay failed: " + th.getMessage());
        }
    }

    /* renamed from: w */
    public final void mo48228w(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).pause();
                    mo48195a(obj, optString2);
                    C6361q.m16154a("OperateViews", "playerPause success");
                    return;
                }
                m17223c(obj, "instanceId is not player");
                C6361q.m16154a("OperateViews", "playerPause failed instanceId is not player instanceId = " + optString2);
                return;
            }
            m17223c(obj, "instanceId not exit");
            C6361q.m16154a("OperateViews", "playerPause failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "playerPause failed: " + th.getMessage());
        }
    }

    /* renamed from: x */
    public final void mo48229x(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).resume();
                    mo48195a(obj, optString2);
                    C6361q.m16154a("OperateViews", "playerResume success");
                    return;
                }
                m17223c(obj, "instanceId is not player");
                C6361q.m16154a("OperateViews", "playerResume failed instanceId is not player instanceId = " + optString2);
                return;
            }
            m17223c(obj, "instanceId not exit");
            C6361q.m16154a("OperateViews", "playerResume failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "playerResume failed: " + th.getMessage());
        }
    }

    /* renamed from: y */
    public final void mo48230y(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    ((MBridgeBTVideoView) view).stop();
                    mo48195a(obj, optString2);
                    C6361q.m16154a("OperateViews", "playerStop success");
                    return;
                }
                m17223c(obj, "instanceId is not player");
                C6361q.m16154a("OperateViews", "playerStop failed instanceId is not player instanceId = " + optString2);
                return;
            }
            m17223c(obj, "instanceId not exit");
            C6361q.m16154a("OperateViews", "playerStop failed instanceId not exit instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "playerStop failed: " + th.getMessage());
        }
    }

    /* renamed from: z */
    public final void mo48231z(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
            }
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
        }
    }

    /* renamed from: A */
    public final void mo48178A(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (!(view instanceof MBridgeBTVideoView)) {
                    m17223c(obj, "instanceId is not player");
                    C6361q.m16154a("OperateViews", "playerMute failed: instanceId is not player");
                } else if (((MBridgeBTVideoView) view).playMute()) {
                    mo48195a(obj, optString2);
                    C6361q.m16154a("OperateViews", "playerMute success");
                } else {
                    m17223c(obj, "set mute failed");
                    C6361q.m16154a("OperateViews", "playerMute failed set mute failed");
                }
            } else {
                m17223c(obj, "instanceId not exist");
                C6361q.m16154a("OperateViews", "playerMute failed: instanceId is not exist");
            }
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "playerMute failed: " + th.getMessage());
        }
    }

    /* renamed from: B */
    public final void mo48179B(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (!(view instanceof MBridgeBTVideoView)) {
                    m17223c(obj, "instanceId is not player");
                    C6361q.m16154a("OperateViews", "playerUnmute failed: instanceId is not player");
                } else if (((MBridgeBTVideoView) view).playUnMute()) {
                    mo48195a(obj, optString2);
                    m17221a(obj, "onUnmute", optString2);
                    C6361q.m16154a("OperateViews", "playerUnmute successed");
                } else {
                    mo48195a(obj, "set unmute failed");
                    C6361q.m16154a("OperateViews", "playerUnmute failed: set unmute failed");
                }
            } else {
                m17223c(obj, "instanceId not exit");
                C6361q.m16154a("OperateViews", "playerUnmute failed: instanceId not exit");
            }
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "playerUnmute failed: " + th.getMessage());
        }
    }

    /* renamed from: C */
    public final void mo48180C(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view instanceof MBridgeBTVideoView) {
                    int mute = ((MBridgeBTVideoView) view).getMute();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", f16853h);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", optString2);
                    jSONObject3.put("mute", mute);
                    jSONObject2.put("data", jSONObject3);
                    C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    C6361q.m16154a("OperateViews", "playerGetMuteState successed mute = " + mute);
                    return;
                }
                m17223c(obj, "instanceId is not player");
                C6361q.m16154a("OperateViews", "playerGetMuteState failed instanceId is not player");
                return;
            }
            m17223c(obj, "instanceId not exist");
            C6361q.m16154a("OperateViews", "playerGetMuteState failed instanceId not exist");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "playerGetMuteState failed: " + th.getMessage());
        }
    }

    /* renamed from: D */
    public final void mo48181D(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
            }
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
        }
    }

    /* renamed from: E */
    public final void mo48182E(Object obj, JSONObject jSONObject) {
        try {
            jSONObject.optString("unitId");
            jSONObject.optString("id");
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
            } else {
                m17223c(obj, "android mediaPlayer not support setScaleType");
            }
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
        }
    }

    /* renamed from: F */
    public final void mo48183F(Object obj, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            String g = m17224g(optString2);
            if (TextUtils.isEmpty(g)) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a != null) {
                    g = aVar.f16345a.getRid();
                }
            }
            if (jSONObject.optJSONObject("data") == null) {
                m17223c(obj, "data is empty");
                return;
            }
            LinkedHashMap<String, View> b = mo48201b(optString, g);
            if (b.containsKey(optString2)) {
                View view = b.get(optString2);
                if (view instanceof MBTempContainer) {
                    ((MBTempContainer) view).preload();
                    mo48195a(obj, optString2);
                    return;
                }
                m17223c(obj, "view not exist");
                return;
            }
            m17223c(obj, "instanceId not exist");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "preloadSubPlayTemplateView failed: " + th.getMessage());
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48184G(java.lang.Object r10, org.json.JSONObject r11) {
        /*
            r9 = this;
            java.lang.String r0 = "OperateViews"
            java.lang.String r1 = "unitId"
            java.lang.String r1 = r11.optString(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "id"
            java.lang.String r2 = r11.optString(r2)     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = r9.m17224g(r2)     // Catch:{ all -> 0x00d5 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00d5 }
            if (r4 == 0) goto L_0x0025
            r4 = r10
            com.mbridge.msdk.mbsignalcommon.windvane.a r4 = (com.mbridge.msdk.mbsignalcommon.windvane.C6557a) r4     // Catch:{ all -> 0x00d5 }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r5 = r4.f16345a     // Catch:{ all -> 0x00d5 }
            if (r5 == 0) goto L_0x0025
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r3 = r4.f16345a     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = r3.getRid()     // Catch:{ all -> 0x00d5 }
        L_0x0025:
            java.lang.String r4 = "data"
            org.json.JSONObject r11 = r11.optJSONObject(r4)     // Catch:{ all -> 0x00d5 }
            if (r11 != 0) goto L_0x0033
            java.lang.String r11 = "data is empty"
            r9.m17223c((java.lang.Object) r10, (java.lang.String) r11)     // Catch:{ all -> 0x00d5 }
            return
        L_0x0033:
            java.util.LinkedHashMap r11 = r9.mo48201b((java.lang.String) r1, (java.lang.String) r3)     // Catch:{ all -> 0x00d5 }
            r4 = 0
            int r5 = r11.size()     // Catch:{ all -> 0x00d5 }
            if (r5 <= 0) goto L_0x00bb
            java.util.Collection r5 = r11.values()     // Catch:{ all -> 0x00d5 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x0046:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0086
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00d5 }
            android.view.View r6 = (android.view.View) r6     // Catch:{ all -> 0x00d5 }
            boolean r7 = r6 instanceof com.mbridge.msdk.video.p214bt.module.MBridgeBTContainer     // Catch:{ all -> 0x00d5 }
            if (r7 == 0) goto L_0x005a
            r4 = r6
            com.mbridge.msdk.video.bt.module.MBridgeBTContainer r4 = (com.mbridge.msdk.video.p214bt.module.MBridgeBTContainer) r4     // Catch:{ all -> 0x00d5 }
            goto L_0x0046
        L_0x005a:
            boolean r7 = r6 instanceof com.mbridge.msdk.video.p214bt.module.MBridgeBTWebView     // Catch:{ all -> 0x00d5 }
            if (r7 == 0) goto L_0x0064
            com.mbridge.msdk.video.bt.module.MBridgeBTWebView r6 = (com.mbridge.msdk.video.p214bt.module.MBridgeBTWebView) r6     // Catch:{ all -> 0x00d5 }
            r6.onDestory()     // Catch:{ all -> 0x00d5 }
            goto L_0x0046
        L_0x0064:
            boolean r7 = r6 instanceof com.mbridge.msdk.video.p214bt.module.MBridgeBTVideoView     // Catch:{ all -> 0x00d5 }
            if (r7 == 0) goto L_0x007c
            r7 = r6
            com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r7 = (com.mbridge.msdk.video.p214bt.module.MBridgeBTVideoView) r7     // Catch:{ all -> 0x00d5 }
            java.lang.String r7 = r7.getInstanceId()     // Catch:{ all -> 0x00d5 }
            com.mbridge.msdk.video.bt.a.a r8 = com.mbridge.msdk.video.p214bt.p215a.C6872a.m17208a()     // Catch:{ all -> 0x00d5 }
            r8.mo48175a(r7)     // Catch:{ all -> 0x00d5 }
            com.mbridge.msdk.video.bt.module.MBridgeBTVideoView r6 = (com.mbridge.msdk.video.p214bt.module.MBridgeBTVideoView) r6     // Catch:{ all -> 0x00d5 }
            r6.onDestory()     // Catch:{ all -> 0x00d5 }
            goto L_0x0046
        L_0x007c:
            boolean r7 = r6 instanceof com.mbridge.msdk.video.p214bt.module.MBTempContainer     // Catch:{ all -> 0x00d5 }
            if (r7 == 0) goto L_0x0046
            com.mbridge.msdk.video.bt.module.MBTempContainer r6 = (com.mbridge.msdk.video.p214bt.module.MBTempContainer) r6     // Catch:{ all -> 0x00d5 }
            r6.onDestroy()     // Catch:{ all -> 0x00d5 }
            goto L_0x0046
        L_0x0086:
            if (r4 == 0) goto L_0x00b0
            r4.onAdClose()     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, android.view.View>> r4 = f16846a     // Catch:{ all -> 0x00d5 }
            r4.remove(r11)     // Catch:{ all -> 0x00d5 }
            r11.clear()     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.LinkedHashMap<java.lang.String, android.view.View>> r11 = f16846a     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r4.<init>()     // Catch:{ all -> 0x00d5 }
            r4.append(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = "_"
            r4.append(r1)     // Catch:{ all -> 0x00d5 }
            r4.append(r3)     // Catch:{ all -> 0x00d5 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00d5 }
            r11.remove(r1)     // Catch:{ all -> 0x00d5 }
            r9.mo48195a((java.lang.Object) r10, (java.lang.String) r2)     // Catch:{ all -> 0x00d5 }
            return
        L_0x00b0:
            java.lang.String r11 = "not found MBridgeBTContainer"
            r9.m17223c((java.lang.Object) r10, (java.lang.String) r11)     // Catch:{ all -> 0x00d5 }
            java.lang.String r11 = "closeAd successed"
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r11)     // Catch:{ all -> 0x00d5 }
            goto L_0x00f5
        L_0x00bb:
            java.lang.String r11 = "unitId or instanceId not exist"
            r9.m17223c((java.lang.Object) r10, (java.lang.String) r11)     // Catch:{ all -> 0x00d5 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            r11.<init>()     // Catch:{ all -> 0x00d5 }
            java.lang.String r2 = "closeAd failed: unitId or instanceId not exist unitId = "
            r11.append(r2)     // Catch:{ all -> 0x00d5 }
            r11.append(r1)     // Catch:{ all -> 0x00d5 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00d5 }
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r11)     // Catch:{ all -> 0x00d5 }
            goto L_0x00f5
        L_0x00d5:
            r11 = move-exception
            java.lang.String r1 = r11.getMessage()
            r9.m17223c((java.lang.Object) r10, (java.lang.String) r1)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "closeAd failed: "
            r10.append(r1)
            java.lang.String r11 = r11.getMessage()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.mbridge.msdk.foundation.tools.C6361q.m16154a(r0, r10)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p214bt.p215a.C6877c.mo48184G(java.lang.Object, org.json.JSONObject):void");
    }

    /* renamed from: H */
    public final void mo48185H(Object obj, JSONObject jSONObject) {
        String str;
        try {
            C6557a aVar = (C6557a) obj;
            if (aVar.f16345a != null) {
                str = aVar.f16345a.getRid();
            } else {
                str = "";
            }
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            LinkedHashMap<String, View> b = mo48201b(optString, str);
            if (b == null || b.size() <= 0) {
                m17223c(obj, "unitId not exist");
                return;
            }
            for (View next : b.values()) {
                if (next instanceof MBridgeBTWebView) {
                    ((MBridgeBTWebView) next).broadcast(optString2, optJSONObject);
                }
                if (next instanceof MBridgeBTLayout) {
                    ((MBridgeBTLayout) next).broadcast(optString2, optJSONObject);
                }
            }
            mo48195a(obj, "");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "broadcast failed: " + th.getMessage());
        }
    }

    /* renamed from: I */
    public final void mo48186I(Object obj, JSONObject jSONObject) {
        try {
            C6557a aVar = (C6557a) obj;
            String str = "";
            String rid = aVar.f16345a != null ? aVar.f16345a.getRid() : str;
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString(DataKeys.USER_ID);
            boolean optBoolean = optJSONObject.optBoolean("expired");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("reward");
            String optString4 = optJSONObject.optString("extra");
            C7170c cVar = null;
            if (optJSONObject2 != null) {
                cVar = new C7170c(optJSONObject2.optString("name"), optJSONObject2.optInt("amount"));
                str = optJSONObject2.optString("id");
            }
            LinkedHashMap<String, View> b = mo48201b(optString, rid);
            if (b.size() <= 0 || !f16850e.containsKey(optString2)) {
                m17223c(obj, "unitId not exist");
                C6361q.m16154a("OperateViews", "setSubPlayTemplateInfo failed: unitId not exist instanceId = " + optString2);
                return;
            }
            View view = b.get(optString2);
            if (view instanceof MBTempContainer) {
                MBTempContainer mBTempContainer = (MBTempContainer) view;
                mBTempContainer.setReward(cVar);
                mBTempContainer.setUserId(optString3);
                mBTempContainer.setRewardId(str);
                mBTempContainer.setCampaignExpired(optBoolean);
                if (!TextUtils.isEmpty(optString4)) {
                    mBTempContainer.setDeveloperExtraData(optString4);
                }
                mo48195a(obj, optString2);
                C6361q.m16154a("OperateViews", "setSubPlayTemplateInfo success instanceId = " + optString2);
                return;
            }
            m17223c(obj, "instanceId not exist");
            C6361q.m16154a("OperateViews", "setSubPlayTemplateInfo failed: instanceId not exist instanceId = " + optString2);
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "setSubPlayTemplateInfo failed: " + th.getMessage());
        }
    }

    /* renamed from: J */
    public final void mo48187J(Object obj, JSONObject jSONObject) {
        try {
            C6557a aVar = (C6557a) obj;
            String str = "";
            if (aVar.f16345a != null) {
                str = aVar.f16345a.getRid();
            }
            String optString = jSONObject.optString("unitId");
            String optString2 = jSONObject.optString("id");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            String optString3 = optJSONObject.optString("eventName");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("eventData");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            LinkedHashMap<String, View> b = mo48201b(optString, str);
            if (b.size() > 0) {
                View view = b.get(optString2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof WindVaneWebView) {
                            C6563g.m16891a().mo44522a((WebView) (WindVaneWebView) childAt, optString3, Base64.encodeToString(optJSONObject2.toString().getBytes(), 2));
                            mo48195a(obj, optString2);
                            C6361q.m16154a("OperateViews", "webviewFireEvent instanceId = " + optString2);
                            return;
                        }
                    }
                }
                m17223c(obj, "instanceId not exist");
                C6361q.m16154a("OperateViews", "webviewFireEvent failed: instanceId not exist instanceId = " + optString2);
                return;
            }
            m17223c(obj, "unitId not exist");
            C6361q.m16154a("OperateViews", "webviewFireEvent failed: unitId not exist");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "webviewFireEvent failed: " + th.getMessage());
        }
    }

    /* renamed from: K */
    public final void mo48188K(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m17223c(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                m17223c(obj, "data camapign is empty");
                return;
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C6152j a = C6152j.m15441a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
                        if (a != null) {
                            if (!a.mo43013a(parseCampaignWithBackData.getId())) {
                                C6196f fVar = new C6196f();
                                fVar.mo43631a(parseCampaignWithBackData.getId());
                                fVar.mo43629a(parseCampaignWithBackData.getFca());
                                fVar.mo43633b(parseCampaignWithBackData.getFcb());
                                fVar.mo43637d(0);
                                fVar.mo43635c(1);
                                fVar.mo43630a(System.currentTimeMillis());
                                a.mo43012a(fVar);
                            } else {
                                a.mo43016b(parseCampaignWithBackData.getId());
                            }
                        }
                        C6877c.m17220a(C6877c.this, parseCampaignWithBackData.getCampaignUnitId(), parseCampaignWithBackData);
                    } catch (Throwable th) {
                        C6361q.m16155a("OperateViews", th.getMessage(), th);
                    }
                }
            }).start();
            mo48195a(obj, "");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
        }
    }

    /* renamed from: L */
    public final void mo48189L(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        Object obj2 = obj;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        String str8 = "message";
        String str9 = "code";
        int i2 = 1;
        if (jSONObject2 == null) {
            try {
                jSONObject3.put(str9, 1);
                jSONObject3.put(str8, "params is null");
                C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (JSONException e) {
                C6361q.m16154a("OperateViews", e.getMessage());
            }
        } else {
            try {
                jSONObject3.put(str9, 0);
                jSONObject3.put(str8, "");
                JSONArray jSONArray = jSONObject2.getJSONArray("resource");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    str3 = str8;
                    str2 = str9;
                    try {
                        jSONObject3.put(str2, 1);
                        str = str3;
                        try {
                            jSONObject3.put(str, "resource is null");
                            C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        str = str3;
                        try {
                            C6361q.m16154a("OperateViews", e.getMessage());
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = str3;
                        try {
                            jSONObject3.put(str2, 1);
                            jSONObject3.put(str, th.getLocalizedMessage());
                            C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                        } catch (JSONException e4) {
                            C6361q.m16154a("OperateViews", e4.getMessage());
                        }
                    }
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    int length = jSONArray.length();
                    int i3 = 0;
                    while (i3 < length) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                        String optString = jSONObject4.optString("ref", "");
                        int i4 = jSONObject4.getInt("type");
                        JSONObject jSONObject5 = new JSONObject();
                        JSONArray jSONArray3 = jSONArray;
                        if (i4 == i2) {
                            if (!TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                C6202l a = C6157o.m15466a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d())).mo43033a(optString);
                                if (a != null) {
                                    i = length;
                                    C6361q.m16154a("OperateViews", "VideoBean not null");
                                    jSONObject6.put("type", 1);
                                    str3 = str8;
                                    try {
                                        jSONObject6.put("videoDataLength", a.mo43714c());
                                        String e5 = a.mo43716e();
                                        str4 = str9;
                                        if (TextUtils.isEmpty(e5)) {
                                            C6361q.m16154a("OperateViews", "VideoPath null");
                                            jSONObject6.put("path", "");
                                            jSONObject6.put("path4Web", "");
                                        } else {
                                            C6361q.m16154a("OperateViews", "VideoPath not null");
                                            jSONObject6.put("path", e5);
                                            jSONObject6.put("path4Web", e5);
                                        }
                                        if (a.mo43715d() == 5) {
                                            jSONObject6.put("downloaded", 1);
                                        } else {
                                            jSONObject6.put("downloaded", 0);
                                        }
                                        jSONObject5.put(optString, jSONObject6);
                                        jSONArray2.put(jSONObject5);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str = str3;
                                        str2 = str4;
                                        jSONObject3.put(str2, 1);
                                        jSONObject3.put(str, th.getLocalizedMessage());
                                        C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                                    }
                                } else {
                                    str3 = str8;
                                    str4 = str9;
                                    i = length;
                                    C6361q.m16154a("OperateViews", "VideoBean null");
                                }
                                i3++;
                                jSONArray = jSONArray3;
                                length = i;
                                str8 = str3;
                                str9 = str4;
                                i2 = 1;
                            }
                        }
                        str3 = str8;
                        str4 = str9;
                        i = length;
                        if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 2);
                            if (C7191g.m18286a().mo49220b(optString) == null) {
                                str7 = "";
                            } else {
                                str7 = C7191g.m18286a().mo49220b(optString);
                            }
                            jSONObject7.put("path", str7);
                            jSONObject5.put(optString, jSONObject7);
                            jSONArray2.put(jSONObject5);
                            i3++;
                            jSONArray = jSONArray3;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        } else if (i4 != 3 || TextUtils.isEmpty(optString)) {
                            if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                if (C6364t.m16173a(optString) == null) {
                                    str5 = "";
                                } else {
                                    str5 = C6364t.m16173a(optString);
                                }
                                jSONObject8.put("path", str5);
                                jSONObject5.put(optString, jSONObject8);
                                jSONArray2.put(jSONObject5);
                            }
                            i3++;
                            jSONArray = jSONArray3;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        } else {
                            try {
                                File file = new File(optString);
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    C6361q.m16154a("OperateViews", "getFileInfo Mraid file " + optString);
                                    str6 = "file:////" + optString;
                                    JSONObject jSONObject9 = new JSONObject();
                                    jSONObject9.put("type", 3);
                                    jSONObject9.put("path", str6);
                                    jSONObject5.put(optString, jSONObject9);
                                    jSONArray2.put(jSONObject5);
                                    i3++;
                                    jSONArray = jSONArray3;
                                    length = i;
                                    str8 = str3;
                                    str9 = str4;
                                    i2 = 1;
                                }
                            } catch (Throwable th4) {
                                if (MBridgeConstans.DEBUG) {
                                    th4.printStackTrace();
                                }
                            }
                            str6 = "";
                            JSONObject jSONObject92 = new JSONObject();
                            jSONObject92.put("type", 3);
                            jSONObject92.put("path", str6);
                            jSONObject5.put(optString, jSONObject92);
                            jSONArray2.put(jSONObject5);
                            i3++;
                            jSONArray = jSONArray3;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        }
                    }
                    String str10 = str8;
                    String str11 = str9;
                    jSONObject3.put("resource", jSONArray2);
                    C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                }
            } catch (Throwable th5) {
                th = th5;
                str = str8;
                str2 = str9;
                jSONObject3.put(str2, 1);
                jSONObject3.put(str, th.getLocalizedMessage());
                C6563g.m16891a().mo44523a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            }
        }
    }

    /* renamed from: b */
    public final void mo48202b(Object obj, String str) {
        C6361q.m16154a("OperateViews", "reportUrls:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int optInt = jSONObject.optInt("type");
                    C6097a.m15185a(C6122a.m15302b().mo42895d(), (CampaignEx) null, "", jSONObject.optString("url"), false, optInt != 0);
                }
                mo48195a(obj, "");
            } catch (Throwable th) {
                C6361q.m16155a("OperateViews", "reportUrls", th);
            }
        }
    }

    /* renamed from: M */
    public final void mo48190M(Object obj, JSONObject jSONObject) {
        C6361q.m16154a("OperateViews", "createNativeEC:" + jSONObject);
        try {
            String optString = jSONObject.optString("unitId");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optString)) {
                    String str = "";
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                    if (parseCampaignWithBackData != null && !TextUtils.isEmpty(optString)) {
                        parseCampaignWithBackData.setCampaignUnitId(optString);
                        str = parseCampaignWithBackData.getRequestId();
                    }
                    C7179c a = C7179c.m18150a(optJSONObject.optJSONObject("unitSetting"));
                    if (a != null) {
                        a.mo49120a(optString);
                    }
                    MBridgeBTNativeEC mBridgeBTNativeEC = new MBridgeBTNativeEC(C6122a.m15302b().mo42895d());
                    mBridgeBTNativeEC.setCampaign(parseCampaignWithBackData);
                    C7062j jVar = new C7062j((Activity) null, parseCampaignWithBackData);
                    jVar.mo48806a(optString);
                    mBridgeBTNativeEC.setJSCommon(jVar);
                    mBridgeBTNativeEC.setUnitId(optString);
                    mBridgeBTNativeEC.setRewardUnitSetting(a);
                    C6557a aVar = (C6557a) obj;
                    if (aVar.f16345a != null) {
                        WindVaneWebView windVaneWebView = aVar.f16345a;
                        str = windVaneWebView.getRid();
                        mBridgeBTNativeEC.setCreateWebView(windVaneWebView);
                    }
                    LinkedHashMap<String, View> b = mo48201b(optString, str);
                    String b2 = mo48200b();
                    f16847b.put(b2, str);
                    mBridgeBTNativeEC.setInstanceId(b2);
                    b.put(b2, mBridgeBTNativeEC);
                    mBridgeBTNativeEC.preLoadData();
                    if (parseCampaignWithBackData == null) {
                        m17223c(obj, "campaign is null");
                        C6361q.m16154a("OperateViews", "createNativeEC failed");
                        return;
                    }
                    mo48195a(obj, b2);
                    C6361q.m16154a("OperateViews", "createNativeEC instanceId = " + b2);
                    return;
                }
            }
            m17223c(obj, "unitId or data is empty");
        } catch (Throwable th) {
            m17223c(obj, th.getMessage());
            C6361q.m16154a("OperateViews", "createNativeEC failed：" + th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo48192a(int i, int i2, int i3, int i4, int i5) {
        C6361q.m16154a("OperateViews", "OperateViews setNotchString = " + String.format("%1$s-%2$s-%3$s-%4$s-%5$s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}));
        f16855j = C6337h.m16062a(i, i2, i3, i4, i5);
        f16856k = i;
        f16857l = i2;
        f16858m = i3;
        f16859n = i4;
        f16860o = i5;
    }

    /* renamed from: a */
    static /* synthetic */ void m17220a(C6877c cVar, String str, CampaignEx campaignEx) {
        if (C6208d.f15421d != null && !TextUtils.isEmpty(campaignEx.getId())) {
            C6208d.m15706b(str, campaignEx, "reward");
        }
    }
}
