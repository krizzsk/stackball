package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.mraid.C6549a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6557a;
import com.mbridge.msdk.mbsignalcommon.windvane.C6564h;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import org.json.JSONObject;

public class MraidSignalCommunication extends C6564h {

    /* renamed from: d */
    private C6551b f16322d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof C6551b) {
                this.f16322d = (C6551b) context;
                return;
            }
            if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof C6551b)) {
                this.f16322d = (C6551b) windVaneWebView.getObject();
            }
            if (windVaneWebView.getMraidObject() != null && (windVaneWebView.getMraidObject() instanceof C6551b)) {
                this.f16322d = (C6551b) windVaneWebView.getMraidObject();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void open(Object obj, String str) {
        if (obj instanceof C6557a) {
            C6549a.C6550a.f16323a.mo44474a((WebView) ((C6557a) obj).f16345a, "open");
        }
        try {
            String optString = new JSONObject(str).optString("url");
            C6361q.m16158d("MraidSignalCommunication", "MRAID Open " + optString);
            if (this.f16322d != null && !TextUtils.isEmpty(optString)) {
                this.f16322d.open(optString);
            }
        } catch (Throwable th) {
            C6361q.m16155a("MraidSignalCommunication", "MRAID Open", th);
        }
    }

    public void close(Object obj, String str) {
        if (obj instanceof C6557a) {
            C6549a.C6550a.f16323a.mo44474a((WebView) ((C6557a) obj).f16345a, "close");
        }
        try {
            C6361q.m16158d("MraidSignalCommunication", "MRAID close");
            if (this.f16322d != null) {
                this.f16322d.close();
            }
        } catch (Throwable th) {
            C6361q.m16155a("MraidSignalCommunication", "MRAID close", th);
        }
    }

    public void unload(Object obj, String str) {
        if (obj instanceof C6557a) {
            C6549a.C6550a.f16323a.mo44474a((WebView) ((C6557a) obj).f16345a, MraidJsMethods.UNLOAD);
        }
        try {
            C6361q.m16158d("MraidSignalCommunication", "MRAID unload");
            if (this.f16322d != null) {
                this.f16322d.unload();
            }
        } catch (Throwable th) {
            C6361q.m16155a("MraidSignalCommunication", "MRAID unload", th);
        }
    }

    public void useCustomClose(Object obj, String str) {
        if (obj instanceof C6557a) {
            C6549a.C6550a.f16323a.mo44474a((WebView) ((C6557a) obj).f16345a, "useCustomClose");
        }
        try {
            String optString = new JSONObject(str).optString("shouldUseCustomClose");
            C6361q.m16158d("MraidSignalCommunication", "MRAID useCustomClose " + optString);
            if (!TextUtils.isEmpty(optString) && this.f16322d != null) {
                this.f16322d.useCustomClose(optString.toLowerCase().equals("true"));
            }
        } catch (Throwable th) {
            C6361q.m16155a("MraidSignalCommunication", "MRAID useCustomClose", th);
        }
    }

    public void expand(Object obj, String str) {
        if (obj instanceof C6557a) {
            C6549a.C6550a.f16323a.mo44474a((WebView) ((C6557a) obj).f16345a, MraidJsMethods.EXPAND);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("shouldUseCustomClose");
            C6361q.m16158d("MraidSignalCommunication", "MRAID expand " + optString + " " + optString2);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f16322d != null) {
                this.f16322d.expand(optString, optString2.toLowerCase().equals("true"));
            }
        } catch (Throwable th) {
            C6361q.m16155a("MraidSignalCommunication", "MRAID expand", th);
        }
    }

    public void setOrientationProperties(Object obj, String str) {
        String str2;
        if (obj instanceof C6557a) {
            C6549a.C6550a.f16323a.mo44474a((WebView) ((C6557a) obj).f16345a, "setOrientationProperties");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("allowOrientationChange");
            String optString2 = jSONObject.optString("forceOrientation");
            C6361q.m16158d("MraidSignalCommunication", "MRAID setOrientationProperties");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f16322d != null) {
                optString.toLowerCase().equals("true");
                String lowerCase = optString2.toLowerCase();
                int hashCode = lowerCase.hashCode();
                if (hashCode == 729267099) {
                    str2 = "portrait";
                } else if (hashCode == 1430647483) {
                    str2 = "landscape";
                } else {
                    return;
                }
                boolean equals = lowerCase.equals(str2);
            }
        } catch (Throwable th) {
            C6361q.m16155a("MraidSignalCommunication", "MRAID setOrientationProperties", th);
        }
    }
}
