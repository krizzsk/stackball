package com.mbridge.msdk.video.signal.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
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
import com.mbridge.msdk.video.signal.p235a.C7062j;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseRewardSignal extends C6564h implements IRewardCommunication {

    /* renamed from: d */
    protected IRewardCommunication f17579d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        boolean z;
        super.initialize(context, windVaneWebView);
        try {
            z = Class.forName("com.mbridge.msdk.video.signal.factory.IJSFactory").isInstance(context);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        if (z) {
            try {
                Class<?> cls = Class.forName("com.mbridge.msdk.video.signal.communication.BaseRewardSignalH5");
                this.f17579d = (IRewardCommunication) cls.newInstance();
                cls.getMethod("initialize", new Class[]{Context.class, WindVaneWebView.class}).invoke(this.f17579d, new Object[]{context, windVaneWebView});
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IRewardCommunication)) {
            this.f17579d = (IRewardCommunication) windVaneWebView.getObject();
        }
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        boolean z;
        super.initialize(obj, windVaneWebView);
        try {
            z = Class.forName("com.mbridge.msdk.video.signal.factory.IJSFactory").isInstance(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            z = false;
        }
        if (z) {
            try {
                Class<?> cls = Class.forName("com.mbridge.msdk.video.signal.communication.BaseRewardSignalH5");
                this.f17579d = (IRewardCommunication) cls.newInstance();
                cls.getMethod("initialize", new Class[]{Object.class, WindVaneWebView.class}).invoke(this.f17579d, new Object[]{obj, windVaneWebView});
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof IRewardCommunication)) {
            this.f17579d = (IRewardCommunication) windVaneWebView.getObject();
        }
    }

    public void getEndScreenInfo(Object obj, String str) {
        try {
            if (this.f17579d != null) {
                this.f17579d.getEndScreenInfo(obj, str);
                C6361q.m16158d("JS-Reward-Brigde", "getEndScreenInfo factory is true");
                return;
            }
            C6361q.m16158d("JS-Reward-Brigde", "getEndScreenInfo factory is null");
            if (obj != null) {
                C6557a aVar = (C6557a) obj;
                if (aVar.f16345a instanceof WindVaneWebView) {
                    WindVaneWebView windVaneWebView = aVar.f16345a;
                    if (windVaneWebView.getWebViewListener() != null) {
                        ((C6531a) windVaneWebView.getWebViewListener()).mo44406a(obj);
                    }
                }
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Brigde", "getEndScreenInfo", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            if (this.f17579d != null) {
                this.f17579d.install(obj, str);
            } else if (!TextUtils.isEmpty(str)) {
                if (obj != null) {
                    C6557a aVar = (C6557a) obj;
                    if (aVar.f16345a.getObject() instanceof C7062j) {
                        ((C7062j) aVar.f16345a.getObject()).click(1, str);
                        C6361q.m16158d("JS-Reward-Brigde", "JSCommon install jump success");
                    }
                }
                C6361q.m16158d("JS-Reward-Brigde", "JSCommon install failed");
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Brigde", "install", th);
        }
    }

    public void notifyCloseBtn(Object obj, String str) {
        try {
            if (this.f17579d != null && !TextUtils.isEmpty(str)) {
                this.f17579d.notifyCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Brigde", "notifyCloseBtn", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (this.f17579d != null && !TextUtils.isEmpty(str)) {
                this.f17579d.toggleCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Brigde", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            if (this.f17579d != null && !TextUtils.isEmpty(str)) {
                this.f17579d.triggerCloseBtn(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Brigde", "triggerCloseBtn", th);
            C6563g.m16891a().mo44523a(obj, m17946a(-1));
        }
    }

    public void setOrientation(Object obj, String str) {
        try {
            if (this.f17579d != null && !TextUtils.isEmpty(str)) {
                this.f17579d.setOrientation(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Brigde", "setOrientation", th);
        }
    }

    public void handlerPlayableException(Object obj, String str) {
        try {
            if (this.f17579d != null && !TextUtils.isEmpty(str)) {
                this.f17579d.handlerPlayableException(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("JS-Reward-Brigde", "handlerPlayableException", th);
        }
    }

    /* renamed from: a */
    private String m17946a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C6361q.m16158d("JS-Reward-Brigde", "code to string is error");
            return "";
        }
    }

    public void openURL(Object obj, String str) {
        C6361q.m16158d("JS-Reward-Brigde", "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            C6546b.m16830a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
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
                C6361q.m16158d("JS-Reward-Brigde", e.getMessage());
            } catch (Throwable th) {
                C6361q.m16158d("JS-Reward-Brigde", th.getMessage());
            }
        }
    }

    public void cai(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C6546b.m16830a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
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
                    C6361q.m16154a("JS-Reward-Brigde", e.getMessage());
                }
            } catch (JSONException e2) {
                C6546b.m16830a(obj, "exception: " + e2.getLocalizedMessage());
                C6361q.m16155a("JS-Reward-Brigde", "cai", e2);
            } catch (Throwable th) {
                C6546b.m16830a(obj, "exception: " + th.getLocalizedMessage());
                C6361q.m16155a("JS-Reward-Brigde", "cai", th);
            }
        }
    }
}
