package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.click.C6103b;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.communication.C6546b;
import com.mbridge.msdk.mbsignalcommon.windvane.C6557a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseRewardSignalH5 implements IRewardCommunication {

    /* renamed from: a */
    protected IJSFactory f17580a;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        if (context instanceof IJSFactory) {
            this.f17580a = (IJSFactory) context;
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        if (obj instanceof IJSFactory) {
            this.f17580a = (IJSFactory) obj;
        }
    }

    public void getEndScreenInfo(Object obj, String str) {
        String str2;
        try {
            if (this.f17580a != null) {
                String a = this.f17580a.getIJSRewardVideoV1().mo48834a();
                if (!TextUtils.isEmpty(a)) {
                    str2 = Base64.encodeToString(a.getBytes(), 2);
                    C6361q.m16154a("JS-Reward-Communication", "getEndScreenInfo success");
                } else {
                    str2 = "";
                    C6361q.m16154a("JS-Reward-Communication", "getEndScreenInfo failed");
                }
                C6563g.m16891a().mo44523a(obj, str2);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Communication", "getEndScreenInfo", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            if (this.f17580a != null) {
                C6361q.m16154a("JS-Reward-Communication", "install:" + str);
                if (this.f17580a.getJSContainerModule().endCardShowing()) {
                    this.f17580a.getJSCommon().click(3, str);
                } else {
                    this.f17580a.getJSCommon().click(1, str);
                }
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Communication", "install", th);
        }
    }

    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        C6361q.m16158d("JS-Reward-Communication", "openURL:" + str);
        Context d = C6122a.m15302b().mo42895d();
        if (!TextUtils.isEmpty(str)) {
            if (d == null) {
                try {
                    if ((obj instanceof C6557a) && (windVaneWebView = ((C6557a) obj).f16345a) != null) {
                        d = windVaneWebView.getContext();
                    }
                } catch (Exception e) {
                    C6361q.m16158d("JS-Reward-Communication", e.getMessage());
                }
            }
            if (d != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("url");
                    int optInt = jSONObject.optInt("type");
                    if (optInt == 1) {
                        C6103b.m15226a(d, optString);
                    } else if (optInt == 2) {
                        C6103b.m15227b(d, optString);
                    }
                } catch (JSONException e2) {
                    C6361q.m16158d("JS-Reward-Communication", e2.getMessage());
                } catch (Throwable th) {
                    C6361q.m16158d("JS-Reward-Communication", th.getMessage());
                }
            }
        }
    }

    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f17580a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C6361q.m16154a("JS-Reward-Communication", "notifyCloseBtn,state:" + str);
                this.f17580a.getIJSRewardVideoV1().notifyCloseBtn(optInt);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Communication", "notifyCloseBtn", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f17580a != null && !TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                C6361q.m16154a("JS-Reward-Communication", "toggleCloseBtn,state:" + str);
                this.f17580a.getIJSRewardVideoV1().toggleCloseBtn(optInt);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Communication", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f17580a != null && !TextUtils.isEmpty(str)) {
                C6563g.m16891a().mo44523a(obj, m17947a(0));
                this.f17580a.getIJSRewardVideoV1().mo48835a(new JSONObject(str).optString("state"));
                C6361q.m16154a("JS-Reward-Communication", "triggerCloseBtn,state:" + str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Communication", "triggerCloseBtn", th);
            C6563g.m16891a().mo44523a(obj, m17947a(-1));
        }
    }

    public void setOrientation(Object obj, String str) {
        try {
            if (this.f17580a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                C6361q.m16154a("JS-Reward-Communication", "setOrientation,state:" + str);
                this.f17580a.getIJSRewardVideoV1().mo48836b(optString);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Communication", "setOrientation", th);
        }
    }

    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f17580a != null && !TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(NotificationCompat.CATEGORY_MESSAGE);
                C6361q.m16154a("JS-Reward-Communication", "handlerPlayableException,msg:" + str);
                this.f17580a.getIJSRewardVideoV1().mo48837c(optString);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Communication", "setOrientation", th);
        }
    }

    /* renamed from: a */
    private String m17947a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C6361q.m16158d("JS-Reward-Communication", "code to string is error");
            return "";
        }
    }

    public void cai(Object obj, String str) {
        C6361q.m16154a("JS-Reward-Communication", "cai:" + str);
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
                    C6361q.m16154a("JS-Reward-Communication", e.getMessage());
                }
            } catch (JSONException e2) {
                C6546b.m16830a(obj, "exception: " + e2.getLocalizedMessage());
                C6361q.m16155a("JS-Reward-Communication", "cai", e2);
            } catch (Throwable th) {
                C6546b.m16830a(obj, "exception: " + th.getLocalizedMessage());
                C6361q.m16155a("JS-Reward-Communication", "cai", th);
            }
        }
    }
}
