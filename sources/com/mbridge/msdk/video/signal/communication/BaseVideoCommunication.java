package com.mbridge.msdk.video.signal.communication;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AppsFlyerProperties;
import com.inmobi.unification.sdk.InitializationStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.communication.C6546b;
import com.mbridge.msdk.mbsignalcommon.p206b.C6531a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6557a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.C6564h;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.video.p214bt.p215a.C6874b;
import com.mbridge.msdk.video.p214bt.p215a.C6877c;
import com.mbridge.msdk.video.signal.C7068c;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.p235a.C7062j;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseVideoCommunication extends C6564h implements IVideoCommunication {

    /* renamed from: d */
    protected IJSFactory f17581d;

    /* renamed from: a */
    private String m17948a(int i) {
        switch (i) {
            case 1:
                return "sdk_info";
            case 2:
                return MBridgeConstans.PROPERTIES_UNIT_ID;
            case 3:
                return "appSetting";
            case 4:
                return "unitSetting";
            case 5:
                return "device";
            case 6:
                return "sdkSetting";
            default:
                return "";
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        super.initialize(obj, windVaneWebView);
        if (obj instanceof IJSFactory) {
            this.f17581d = (IJSFactory) obj;
        }
    }

    public void init(Object obj, String str) {
        C6361q.m16156b("JS-Video-Brigde", "init");
        try {
            boolean z = false;
            int i = 1;
            if (this.f17581d != null) {
                String c = this.f17581d.getJSCommon().mo48812c();
                if (!TextUtils.isEmpty(c)) {
                    c = Base64.encodeToString(c.getBytes(), 2);
                }
                C6563g.m16891a().mo44523a(obj, c);
                this.f17581d.getJSCommon().mo48810b(true);
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("showTransparent");
                    int optInt2 = jSONObject.optInt("mute");
                    int optInt3 = jSONObject.optInt("closeType");
                    int optInt4 = jSONObject.optInt("orientationType");
                    int optInt5 = jSONObject.optInt("webfront");
                    int optInt6 = jSONObject.optInt("showAlertRole");
                    C7068c jSCommon = this.f17581d.getJSCommon();
                    if (optInt == 1) {
                        z = true;
                    }
                    jSCommon.mo48807a(z);
                    this.f17581d.getJSCommon().mo48808b(optInt2);
                    this.f17581d.getJSCommon().mo48813c(optInt3);
                    this.f17581d.getJSCommon().mo48815d(optInt4);
                    this.f17581d.getJSCommon().mo48817e(optInt5);
                    C7068c jSCommon2 = this.f17581d.getJSCommon();
                    if (optInt6 != 0) {
                        i = optInt6;
                    }
                    jSCommon2.mo48823h(i);
                }
            } else if (obj != null) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a.getObject() instanceof C7062j) {
                    C7062j jVar = (C7062j) aVar.f16345a.getObject();
                    String c2 = jVar.mo48812c();
                    if (!TextUtils.isEmpty(str)) {
                        JSONObject jSONObject2 = new JSONObject(str);
                        int optInt7 = jSONObject2.optInt("showTransparent");
                        int optInt8 = jSONObject2.optInt("mute");
                        int optInt9 = jSONObject2.optInt("closeType");
                        int optInt10 = jSONObject2.optInt("orientationType");
                        int optInt11 = jSONObject2.optInt("webfront");
                        int optInt12 = jSONObject2.optInt("showAlertRole");
                        if (optInt7 == 1) {
                            z = true;
                        }
                        jVar.mo48807a(z);
                        jVar.mo48808b(optInt8);
                        jVar.mo48813c(optInt9);
                        jVar.mo48815d(optInt10);
                        jVar.mo48817e(optInt11);
                        if (optInt12 != 0) {
                            i = optInt12;
                        }
                        jVar.mo48823h(i);
                        C6361q.m16156b("JS-Video-Brigde", "init jsCommon.setIsShowingTransparent = " + optInt7);
                    }
                    C6563g.m16891a().mo44523a(obj, Base64.encodeToString(c2.getBytes(), 2));
                }
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "init error", th);
        }
    }

    public void click(Object obj, String str) {
        int i;
        String str2;
        C7062j jVar;
        C6361q.m16156b("JS-Video-Brigde", "click");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                i = jSONObject.optInt("type");
                str2 = jSONObject.optString("pt");
                if (this.f17581d != null) {
                    this.f17581d.getJSCommon().click(i, str2);
                } else if (obj != null) {
                    C6557a aVar = (C6557a) obj;
                    if ((aVar.f16345a.getObject() instanceof C7062j) && (jVar = (C7062j) aVar.f16345a.getObject()) != null) {
                        jVar.click(i, str2);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            str2 = "";
            i = 1;
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "click error", th);
        }
    }

    public void statistics(Object obj, String str) {
        C6361q.m16156b("JS-Video-Brigde", "statistics,params:" + str);
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                this.f17581d.getJSCommon().mo48802a(jSONObject.optInt("type"), jSONObject.optString("data"));
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "statistics error", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        C6361q.m16156b("JS-Video-Brigde", "triggerCloseBtn");
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str) && new JSONObject(str).optString("state").equals("click")) {
                this.f17581d.getJSVideoModule().closeVideoOperate(1, -1);
                C6563g.m16891a().mo44523a(obj, m17950b(0));
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "triggerCloseBtn error", th);
        }
    }

    public void showVideoLocation(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("margin_top", 0);
                int optInt2 = jSONObject.optInt("margin_left", 0);
                int optInt3 = jSONObject.optInt("view_width", 0);
                int optInt4 = jSONObject.optInt("view_height", 0);
                int optInt5 = jSONObject.optInt("radius", 0);
                int optInt6 = jSONObject.optInt("border_top", 0);
                int optInt7 = jSONObject.optInt("border_left", 0);
                int optInt8 = jSONObject.optInt("border_width", 0);
                int optInt9 = jSONObject.optInt("border_height", 0);
                C6361q.m16156b("JS-Video-Brigde", "showVideoLocation,margin_top:" + optInt + ",marginLeft:" + optInt2 + ",viewWidth:" + optInt3 + ",viewHeight:" + optInt4 + ",radius:" + optInt5 + ",borderTop: " + optInt6 + ",borderLeft: " + optInt7 + ",borderWidth: " + optInt8 + ",borderHeight: " + optInt9);
                this.f17581d.getJSVideoModule().showVideoLocation(optInt, optInt2, optInt3, optInt4, optInt5, optInt6, optInt7, optInt8, optInt9);
                this.f17581d.getJSCommon().mo48818f();
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "showVideoLocation error", th);
        }
    }

    public void soundOperate(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("mute");
                int optInt2 = jSONObject.optInt("view_visible");
                String optString = jSONObject.optString("pt", "");
                C6361q.m16156b("JS-Video-Brigde", "soundOperate,mute:" + optInt + ",viewVisible:" + optInt2 + ",pt:" + optString);
                if (TextUtils.isEmpty(optString)) {
                    this.f17581d.getJSVideoModule().soundOperate(optInt, optInt2);
                } else {
                    this.f17581d.getJSVideoModule().soundOperate(optInt, optInt2, optString);
                }
                C6563g.m16891a().mo44523a(obj, m17950b(0));
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "soundOperate error", th);
        }
    }

    public void videoOperate(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("pause_or_resume");
                C6361q.m16156b("JS-Video-Brigde", "videoOperate,pauseOrResume:" + optInt);
                this.f17581d.getJSVideoModule().videoOperate(optInt);
                C6563g.m16891a().mo44523a(obj, m17950b(0));
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "videoOperate error", th);
        }
    }

    public void closeVideoOperte(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("close");
                int optInt2 = jSONObject.optInt("view_visible");
                C6361q.m16156b("JS-Video-Brigde", "closeVideoOperte,close:" + optInt + ",viewVisible:" + optInt2);
                this.f17581d.getJSVideoModule().closeVideoOperate(optInt, optInt2);
                C6563g.m16891a().mo44523a(obj, m17950b(0));
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "closeOperte error", th);
        }
    }

    public void progressOperate(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt(NotificationCompat.CATEGORY_PROGRESS);
                int optInt2 = jSONObject.optInt("view_visible");
                C6361q.m16156b("JS-Video-Brigde", "progressOperate,progress:" + optInt + ",viewVisible:" + optInt2);
                this.f17581d.getJSVideoModule().progressOperate(optInt, optInt2);
                C6563g.m16891a().mo44523a(obj, m17950b(0));
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "progressOperate error", th);
        }
    }

    public void getCurrentProgress(Object obj, String str) {
        try {
            if (this.f17581d != null) {
                String currentProgress = this.f17581d.getJSVideoModule().getCurrentProgress();
                C6361q.m16156b("JS-Video-Brigde", "getCurrentProgress:" + currentProgress);
                if (!TextUtils.isEmpty(currentProgress)) {
                    currentProgress = Base64.encodeToString(currentProgress.getBytes(), 2);
                }
                C6563g.m16891a().mo44523a(obj, currentProgress);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "getCurrentProgress error", th);
        }
    }

    public void showVideoClickView(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("type");
                C6361q.m16156b("JS-Video-Brigde", "showVideoClickView,type:" + optInt);
                this.f17581d.getJSContainerModule().showVideoClickView(optInt);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    public void setScaleFitXY(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("fitxy");
                C6361q.m16156b("JS-Video-Brigde", "setScaleFitXY,type:" + optInt);
                this.f17581d.getJSVideoModule().setScaleFitXY(optInt);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "showVideoClickView error", th);
        }
    }

    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C6361q.m16156b("JS-Video-Brigde", "notifyCloseBtn,result:" + optInt);
                this.f17581d.getJSVideoModule().notifyCloseBtn(optInt);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "notifyCloseBtn", th);
        }
    }

    public void openURL(Object obj, String str) {
        C6361q.m16158d("JS-Video-Brigde", "openURL:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    C6103b.m15226a(this.f16369a, optString);
                } else if (optInt == 2) {
                    C6103b.m15227b(this.f16369a, optString);
                }
            } catch (JSONException e) {
                C6361q.m16158d("JS-Video-Brigde", e.getMessage());
            } catch (Throwable th) {
                C6361q.m16158d("JS-Video-Brigde", th.getMessage());
            }
        }
    }

    public void showAlertView(Object obj, String str) {
        C6361q.m16156b("JS-Video-Brigde", "showAlertView");
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                this.f17581d.getJSVideoModule().showIVRewardAlertView(str);
                C6563g.m16891a().mo44524a(obj, "showAlertView", "");
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "showAlertView", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C6361q.m16156b("JS-Video-Brigde", "toggleCloseBtn,result:" + optInt);
                int i = 2;
                if (optInt != 1) {
                    i = optInt == 2 ? 1 : 0;
                }
                this.f17581d.getJSVideoModule().closeVideoOperate(0, i);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "toggleCloseBtn", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            if (this.f17581d != null && !TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                C6361q.m16156b("JS-Video-Brigde", "handlerH5Exception,params:" + str);
                this.f17581d.getJSCommon().handlerH5Exception(jSONObject.optInt("code", -999), jSONObject.optString("message", "h5 error"));
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "handlerH5Exception", th);
        }
    }

    public void isSystemResume(Object obj, String str) {
        try {
            if (this.f17581d != null) {
                C6361q.m16156b("JS-Video-Brigde", "isSystemResume,params:" + str);
                C6563g.m16891a().mo44523a(obj, m17950b(this.f17581d.getActivityProxy().mo48799h()));
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "isSystemResume", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                C6557a aVar = (C6557a) obj;
                int optInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.f16345a.getObject() instanceof C7062j) {
                    ((C7062j) aVar.f16345a.getObject()).mo48844i(optInt);
                }
                if (aVar.f16345a != null) {
                    WindVaneWebView windVaneWebView = aVar.f16345a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        windVaneWebView.getWebViewListener().mo44020a((WebView) windVaneWebView, optInt);
                    }
                }
            } catch (Throwable th) {
                C6361q.m16155a("JS-Video-Brigde", "readyStatus", th);
            }
        }
    }

    public void playVideoFinishOperate(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str) && this.f17581d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("type");
                C6361q.m16156b("JS-Video-Brigde", "playVideoFinishOperate,type: " + optInt);
                this.f17581d.getJSCommon().mo48819f(optInt);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "playVideoFinishOperate error", th);
        }
    }

    /* renamed from: b */
    private String m17950b(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C6361q.m16158d("JS-Video-Brigde", "code to string is error");
            return "";
        }
    }

    public void reactDeveloper(Object obj, String str) {
        C6361q.m16154a("JS-Video-Brigde", "reactDeveloper");
        try {
            if (this.f17581d == null || TextUtils.isEmpty(str)) {
                C6563g.m16891a().mo44525b(obj, m17950b(1));
            } else {
                this.f17581d.getJSBTModule().reactDeveloper(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "reactDeveloper error " + th);
        }
    }

    public void reportUrls(Object obj, String str) {
        C6361q.m16154a("JS-Video-Brigde", "reportUrls");
        try {
            if (!TextUtils.isEmpty(str)) {
                C6877c.m17219a().mo48202b(obj, str);
            } else {
                C6563g.m16891a().mo44525b(obj, m17950b(1));
            }
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "reportUrls error " + th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48189L(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "getFileInfo error", th);
        }
    }

    public void getSDKInfo(Object obj, String str) {
        C6361q.m16156b("JS-Video-Brigde", "getSDKInfo");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("type");
                JSONObject jSONObject = new JSONObject();
                int i = 0;
                if (this.f17581d != null) {
                    while (i < jSONArray.length()) {
                        int i2 = jSONArray.getInt(i);
                        jSONObject.put(m17948a(i2), this.f17581d.getJSCommon().mo48821g(i2));
                        i++;
                    }
                } else if (obj != null) {
                    while (i < jSONArray.length()) {
                        int i3 = jSONArray.getInt(i);
                        C6557a aVar = (C6557a) obj;
                        if (aVar.f16345a.getObject() instanceof C7062j) {
                            jSONObject.put(m17948a(i3), ((C7062j) aVar.f16345a.getObject()).mo48821g(i3));
                        }
                        i++;
                    }
                }
                C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                return;
            }
            C6563g.m16891a().mo44525b(obj, "params is null");
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "getSDKInfo error", th);
            C6563g.m16891a().mo44525b(obj, "exception");
        }
    }

    public void loadads(Object obj, String str) {
        int i;
        int i2;
        String str2;
        String str3;
        C6361q.m16156b("JS-Video-Brigde", "loadads");
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString(MBridgeConstans.PLACEMENT_ID);
                String optString2 = jSONObject.optString("unitId");
                int optInt = jSONObject.optInt("type", 1);
                if (optInt > 2) {
                    optInt = 1;
                }
                str2 = optString2;
                i = jSONObject.optInt("adtype", 1);
                i2 = optInt;
                str3 = optString;
            } else {
                str3 = "";
                str2 = str3;
                i2 = 1;
                i = 1;
            }
            if (TextUtils.isEmpty(str2)) {
                C6563g.m16891a().mo44523a(obj, m17950b(1));
                return;
            }
            if (obj != null) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a instanceof WindVaneWebView) {
                    WindVaneWebView windVaneWebView = aVar.f16345a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((C6531a) windVaneWebView.getWebViewListener()).mo44405a(windVaneWebView, str3, str2, i2, i);
                    }
                }
            }
            C6563g.m16891a().mo44523a(obj, m17950b(0));
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "loadads error", th);
            C6563g.m16891a().mo44523a(obj, m17950b(1));
        }
    }

    /* renamed from: a */
    private void m17949a(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "params is null");
                C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Exception e) {
            C6361q.m16154a("JS-Video-Brigde", e.getMessage());
        }
    }

    public void createWebview(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48196a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "createWebview error " + th);
        }
    }

    public void createPlayerView(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48203b(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "createPlayerView error " + th);
        }
    }

    public void createSubPlayTemplateView(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48205c(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "createSubPlayTemplateView error " + th);
        }
    }

    public void destroyComponent(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48207d(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "destroyComponent error " + th);
        }
    }

    public void getComponentOptions(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48208e(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "getComponentOptions error " + th);
        }
    }

    public void setViewRect(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48210f(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "setViewRect error " + th);
        }
    }

    public void removeFromSuperView(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48212g(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "removeFromSuperView error " + th);
        }
    }

    public void appendSubView(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48213h(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "appendSubView error " + th);
        }
    }

    public void appendViewTo(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48214i(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "appendViewTo error " + th);
        }
    }

    public void bringViewToFront(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48215j(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "bringViewToFront error " + th);
        }
    }

    public void hideView(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48216k(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "hideView error " + th);
        }
    }

    public void showView(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48217l(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "showView error " + th);
        }
    }

    public void setViewBgColor(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48218m(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "setViewBgColor error " + th);
        }
    }

    public void setViewAlpha(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48219n(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "setViewAlpha error " + th);
        }
    }

    public void setViewScale(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48220o(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "setViewScale error " + th);
        }
    }

    public void insertViewAbove(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48221p(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "insertViewAbove error " + th);
        }
    }

    public void insertViewBelow(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48222q(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "insertViewBelow error " + th);
        }
    }

    public void webviewLoad(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48223r(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "webviewLoad error " + th);
        }
    }

    public void webviewReload(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48224s(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "webviewReload error " + th);
        }
    }

    public void webviewGoBack(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48225t(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "webviewGoBack error " + th);
        }
    }

    public void webviewGoForward(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48226u(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "webviewGoForward error " + th);
        }
    }

    public void playerPlay(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48227v(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerPlay error " + th);
        }
    }

    public void playerPause(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48228w(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerPause error " + th);
        }
    }

    public void playerResume(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48229x(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerResume error " + th);
        }
    }

    public void playerStop(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48230y(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerStop error " + th);
        }
    }

    public void playerUpdateFrame(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48231z(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerUpdateFrame error " + th);
        }
    }

    public void playerMute(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48178A(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerMute error " + th);
        }
    }

    public void playerUnmute(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48179B(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerUnmute error " + th);
        }
    }

    public void playerGetMuteState(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48180C(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerGetMuteState error " + th);
        }
    }

    public void playerSetSource(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48181D(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerSetSource error " + th);
        }
    }

    public void playerSetRenderType(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48182E(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "playerSetRenderType error " + th);
        }
    }

    public void preloadSubPlayTemplateView(Object obj, String str) {
        m17949a(obj, str);
        try {
            if (this.f17581d != null) {
                C6877c.m17219a().mo48183F(obj, new JSONObject(str));
                return;
            }
            C6557a aVar = (C6557a) obj;
            if (aVar.f16345a instanceof WindVaneWebView) {
                WindVaneWebView windVaneWebView = aVar.f16345a;
                if (windVaneWebView.getWebViewListener() != null) {
                    ((C6531a) windVaneWebView.getWebViewListener()).mo44407a(obj, str);
                    C6361q.m16154a("JS-Video-Brigde", "preloadSubPlayTemplateView: RVWebViewListener");
                    return;
                }
                C6361q.m16154a("JS-Video-Brigde", "preloadSubPlayTemplateView: failed");
            }
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "preloadSubPlayTemplateView error " + th);
        }
    }

    public void closeAd(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48184G(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "closeAd error " + th);
        }
    }

    public void broadcast(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48185H(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "broadcast error " + th);
        }
    }

    public void closeWeb(Object obj, String str) {
        C6361q.m16158d("JS-Video-Brigde", "type" + str);
        try {
            if (!TextUtils.isEmpty(str) && this.f17581d != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("status");
                this.f17581d.getJSContainerModule().hideAlertWebview();
                this.f17581d.getJSVideoModule().hideAlertView(optInt);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "closeWeb", th);
        }
    }

    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        C6361q.m16158d("JS-Video-Brigde", "ivRewardAdsWithoutVideo ： params" + str);
        try {
            if (!TextUtils.isEmpty(str) && this.f17581d != null && !TextUtils.isEmpty(str)) {
                this.f17581d.getJSContainerModule().ivRewardAdsWithoutVideo(str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Video-Brigde", "ivRewardAdsWithoutVideo", th);
        }
    }

    public void setSubPlayTemplateInfo(Object obj, String str) {
        C6361q.m16158d("JS-Video-Brigde", "setSubPlayTemplateInfo : " + str);
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48186I(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "setSubPlayTemplateInfo error " + th);
        }
    }

    public void webviewFireEvent(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48187J(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "setSubPlayTemplateInfo error " + th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48188K(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "increaseOfferFrequence error " + th);
        }
    }

    public void handleNativeObject(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6874b.m17214a().mo48177a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "handleNativeObject error " + th);
        }
    }

    public void loadingResourceStatus(Object obj, String str) {
        m17949a(obj, str);
        if (obj != null) {
            try {
                C6557a aVar = (C6557a) obj;
                int optInt = new JSONObject(str).optInt("isReady", 1);
                if (aVar.f16345a != null) {
                    WindVaneWebView windVaneWebView = aVar.f16345a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        windVaneWebView.getWebViewListener().mo44063c(windVaneWebView, optInt);
                    }
                }
            } catch (Throwable th) {
                C6361q.m16158d("JS-Video-Brigde", "loadingResourceStatus error " + th);
            }
        }
    }

    public void createNativeEC(Object obj, String str) {
        m17949a(obj, str);
        try {
            C6877c.m17219a().mo48190M(obj, new JSONObject(str));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "createNativeEC error " + th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b A[Catch:{ all -> 0x00b1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCacheItem(java.lang.Object r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "setCacheItem error "
            java.lang.String r1 = "JS-Video-Brigde"
            r2 = 1
            r3 = 0
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x0049 }
            android.content.Context r4 = r4.mo42895d()     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "MBridgeH5CacheSP"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r3)     // Catch:{ all -> 0x0049 }
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0049 }
            if (r5 != 0) goto L_0x0046
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0049 }
            r5.<init>(r9)     // Catch:{ all -> 0x0049 }
            java.lang.String r9 = "key"
            java.lang.String r9 = r5.getString(r9)     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "value"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ all -> 0x0049 }
            boolean r6 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0049 }
            if (r6 != 0) goto L_0x0042
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0049 }
            if (r6 != 0) goto L_0x0042
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences$Editor r9 = r4.putString(r9, r5)     // Catch:{ all -> 0x0049 }
            r9.apply()     // Catch:{ all -> 0x0049 }
        L_0x0042:
            java.lang.String r9 = "Save Success"
            r4 = 1
            goto L_0x0072
        L_0x0046:
            java.lang.String r9 = ""
            goto L_0x0071
        L_0x0049:
            r9 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Save Error, reason is : "
            r4.append(r5)
            java.lang.String r9 = r9.getMessage()
            r4.append(r9)
            java.lang.String r9 = r4.toString()
        L_0x0071:
            r4 = 0
        L_0x0072:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00b1 }
            r5.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = "code"
            if (r4 == 0) goto L_0x007c
            r2 = 0
        L_0x007c:
            r5.put(r6, r2)     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = "message"
            r5.put(r2, r9)     // Catch:{ all -> 0x00b1 }
            r9 = 2
            if (r8 == 0) goto L_0x009d
            if (r4 == 0) goto L_0x009d
            com.mbridge.msdk.mbsignalcommon.windvane.g r2 = com.mbridge.msdk.mbsignalcommon.windvane.C6563g.m16891a()     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b1 }
            byte[] r3 = r3.getBytes()     // Catch:{ all -> 0x00b1 }
            java.lang.String r9 = android.util.Base64.encodeToString(r3, r9)     // Catch:{ all -> 0x00b1 }
            r2.mo44523a(r8, r9)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b4
        L_0x009d:
            com.mbridge.msdk.mbsignalcommon.windvane.g r2 = com.mbridge.msdk.mbsignalcommon.windvane.C6563g.m16891a()     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b1 }
            byte[] r3 = r3.getBytes()     // Catch:{ all -> 0x00b1 }
            java.lang.String r9 = android.util.Base64.encodeToString(r3, r9)     // Catch:{ all -> 0x00b1 }
            r2.mo44525b(r8, r9)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b4
        L_0x00b1:
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r0)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.setCacheItem(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f A[Catch:{ all -> 0x00a5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeCacheItem(java.lang.Object r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "removeCacheItem error "
            java.lang.String r1 = "JS-Video-Brigde"
            r2 = 1
            r3 = 0
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x003d }
            android.content.Context r4 = r4.mo42895d()     // Catch:{ all -> 0x003d }
            java.lang.String r5 = "MBridgeH5CacheSP"
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r5, r3)     // Catch:{ all -> 0x003d }
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x003d }
            if (r5 != 0) goto L_0x003a
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x003d }
            r5.<init>(r9)     // Catch:{ all -> 0x003d }
            java.lang.String r9 = "key"
            java.lang.String r9 = r5.getString(r9)     // Catch:{ all -> 0x003d }
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x003d }
            if (r5 != 0) goto L_0x0036
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x003d }
            android.content.SharedPreferences$Editor r9 = r4.remove(r9)     // Catch:{ all -> 0x003d }
            r9.apply()     // Catch:{ all -> 0x003d }
        L_0x0036:
            java.lang.String r9 = "Delete Success"
            r4 = 1
            goto L_0x0066
        L_0x003a:
            java.lang.String r9 = ""
            goto L_0x0065
        L_0x003d:
            r9 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Delete Error, reason is : "
            r4.append(r5)
            java.lang.String r9 = r9.getMessage()
            r4.append(r9)
            java.lang.String r9 = r4.toString()
        L_0x0065:
            r4 = 0
        L_0x0066:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00a5 }
            r5.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.String r6 = "code"
            if (r4 == 0) goto L_0x0070
            r2 = 0
        L_0x0070:
            r5.put(r6, r2)     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "message"
            r5.put(r2, r9)     // Catch:{ all -> 0x00a5 }
            r9 = 2
            if (r8 == 0) goto L_0x0091
            if (r4 == 0) goto L_0x0091
            com.mbridge.msdk.mbsignalcommon.windvane.g r2 = com.mbridge.msdk.mbsignalcommon.windvane.C6563g.m16891a()     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00a5 }
            byte[] r3 = r3.getBytes()     // Catch:{ all -> 0x00a5 }
            java.lang.String r9 = android.util.Base64.encodeToString(r3, r9)     // Catch:{ all -> 0x00a5 }
            r2.mo44523a(r8, r9)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a8
        L_0x0091:
            com.mbridge.msdk.mbsignalcommon.windvane.g r2 = com.mbridge.msdk.mbsignalcommon.windvane.C6563g.m16891a()     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00a5 }
            byte[] r3 = r3.getBytes()     // Catch:{ all -> 0x00a5 }
            java.lang.String r9 = android.util.Base64.encodeToString(r3, r9)     // Catch:{ all -> 0x00a5 }
            r2.mo44525b(r8, r9)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a8
        L_0x00a5:
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r1, r0)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.removeCacheItem(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0081 A[SYNTHETIC, Splitter:B:17:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085 A[Catch:{ all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c A[Catch:{ all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getAllCache(java.lang.Object r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r8 = "getAllCache error "
            java.lang.String r0 = "JS-Video-Brigde"
            r1 = 0
            r2 = 0
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ all -> 0x0044 }
            android.content.Context r3 = r3.mo42895d()     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "MBridgeH5CacheSP"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r1)     // Catch:{ all -> 0x0044 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0044 }
            r4.<init>()     // Catch:{ all -> 0x0044 }
            java.util.Map r2 = r3.getAll()     // Catch:{ all -> 0x0042 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0042 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0042 }
        L_0x0025:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0042 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0042 }
            java.lang.Object r5 = r3.getKey()     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0042 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0042 }
            r4.put(r5, r3)     // Catch:{ all -> 0x0042 }
            goto L_0x0025
        L_0x003f:
            java.lang.String r2 = "getAllCache Success"
            goto L_0x006e
        L_0x0042:
            r2 = move-exception
            goto L_0x0047
        L_0x0044:
            r3 = move-exception
            r4 = r2
            r2 = r3
        L_0x0047:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getAllCache Error, reason is : "
            r3.append(r5)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x006e:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x00a1 }
            r3.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = "code"
            r3.put(r5, r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "message"
            r3.put(r1, r2)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = "data"
            if (r4 == 0) goto L_0x0085
            r3.put(r1, r4)     // Catch:{ all -> 0x00a1 }
            goto L_0x008a
        L_0x0085:
            java.lang.String r2 = "{}"
            r3.put(r1, r2)     // Catch:{ all -> 0x00a1 }
        L_0x008a:
            if (r7 == 0) goto L_0x00b4
            com.mbridge.msdk.mbsignalcommon.windvane.g r1 = com.mbridge.msdk.mbsignalcommon.windvane.C6563g.m16891a()     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00a1 }
            byte[] r2 = r2.getBytes()     // Catch:{ all -> 0x00a1 }
            r3 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)     // Catch:{ all -> 0x00a1 }
            r1.mo44523a(r7, r2)     // Catch:{ all -> 0x00a1 }
            goto L_0x00b4
        L_0x00a1:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.mbridge.msdk.foundation.tools.C6361q.m16158d(r0, r7)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.communication.BaseVideoCommunication.getAllCache(java.lang.Object, java.lang.String):void");
    }

    public void clearAllCache(Object obj, String str) {
        try {
            C6122a.m15302b().mo42895d().getSharedPreferences("MBridgeH5CacheSP", 0).edit().clear().apply();
            if (obj != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put("message", InitializationStatus.SUCCESS);
                C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "getAllCache error " + th);
        }
    }

    public void getCutout(Object obj, String str) {
        try {
            String i = this.f17581d.getJSCommon().mo48824i();
            C6361q.m16158d("JS-Video-Brigde", i);
            if (obj == null || TextUtils.isEmpty(i)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("message", "No notch data, plz try again later.");
                C6563g.m16891a().mo44525b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                return;
            }
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(i.getBytes(), 2));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "getCutout error : " + th.getMessage());
        }
    }

    public void cai(Object obj, String str) {
        C6361q.m16154a("JS-Video-Brigde", "cai:" + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                String optString = new JSONObject(str).optString("packageName");
                if (TextUtils.isEmpty(optString)) {
                    C6546b.m16830a(obj, "packageName is empty");
                }
                int i = C6366u.m16214c(C6122a.m15302b().mo42895d(), optString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", C6546b.f16319b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(IronSourceConstants.EVENTS_RESULT, i);
                    jSONObject.put("data", jSONObject2);
                    C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C6546b.m16830a(obj, e.getMessage());
                    C6361q.m16154a("JS-Video-Brigde", e.getMessage());
                }
            } catch (JSONException e2) {
                C6546b.m16830a(obj, "exception: " + e2.getLocalizedMessage());
                C6361q.m16155a("JS-Video-Brigde", "cai", e2);
            } catch (Throwable th) {
                C6546b.m16830a(obj, "exception: " + th.getLocalizedMessage());
                C6361q.m16155a("JS-Video-Brigde", "cai", th);
            }
        }
    }

    public void getAppSetting(Object obj, String str) {
        JSONObject jSONObject;
        try {
            String optString = new JSONObject(str).optString(AppsFlyerProperties.APP_ID, "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString)) {
                String c = C6076b.m15089a().mo42752c(optString);
                if (TextUtils.isEmpty(c)) {
                    jSONObject = new JSONObject(C6076b.m15089a().mo42748b().mo42689ac());
                } else {
                    jSONObject = new JSONObject(c);
                    jSONObject.put("isDefault", 0);
                }
                if (obj != null) {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("message", InitializationStatus.SUCCESS);
                    jSONObject2.put("data", jSONObject);
                } else {
                    jSONObject2.put("code", 1);
                    jSONObject2.put("message", "Get App Setting error, plz try again later.");
                }
            } else {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "Get App Setting error, because must give a appId.");
            }
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "getAppSetting error : " + th.getMessage());
        }
    }

    public void getRewardSetting(Object obj, String str) {
        try {
            JSONObject j = C7177b.m18135a().mo49112b().mo49106j();
            JSONObject jSONObject = new JSONObject();
            if (obj == null || j == null) {
                jSONObject.put("code", 1);
                jSONObject.put("message", "Get Reward Setting error, plz try again later.");
            } else {
                jSONObject.put("code", 0);
                jSONObject.put("message", InitializationStatus.SUCCESS);
                jSONObject.put("data", j);
            }
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "getRewardSetting error : " + th.getMessage());
        }
    }

    public void getRewardUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(AppsFlyerProperties.APP_ID, "");
            String optString2 = jSONObject.optString("unitid", "");
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(optString)) {
                if (!TextUtils.isEmpty(optString2)) {
                    JSONObject C = C7177b.m18135a().mo49107a(optString, optString2).mo49116C();
                    if (obj == null || C == null) {
                        jSONObject2.put("code", 1);
                        jSONObject2.put("message", "Get Reward Unit Setting error, plz try again later.");
                    } else {
                        jSONObject2.put("code", 0);
                        jSONObject2.put("message", InitializationStatus.SUCCESS);
                        jSONObject2.put("data", C);
                    }
                    C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                }
            }
            jSONObject2.put("code", 1);
            jSONObject2.put("message", "Get reward unit Setting error, because must give appId and unitId.");
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "getRewardUnitSetting error : " + th.getMessage());
        }
    }

    public void getUnitSetting(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("message", "Get Unit Setting error, RV/IV can not support this method.");
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C6361q.m16158d("JS-Video-Brigde", "getUnitSetting error : " + th.getMessage());
        }
    }
}
