package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.mbsignalcommon.windvane.C6564h;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

public class BannerSignalPlugin extends C6564h {

    /* renamed from: d */
    private final String f16315d = "BannerSignalPlugin";

    /* renamed from: e */
    private C6548c f16316e;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof C6548c) {
                this.f16316e = (C6548c) context;
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof C6548c)) {
                this.f16316e = (C6548c) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "initialize", th);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "onSignalCommunication");
            if (this.f16316e != null) {
                this.f16316e.mo44455f(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "onSignalCommunication", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "readyStatus");
            if (this.f16316e != null) {
                this.f16316e.mo44311c(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "readyStatus", th);
        }
    }

    public void init(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "init");
            if (this.f16316e != null) {
                this.f16316e.mo44308a(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "init", th);
        }
    }

    public void click(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "click");
            if (this.f16316e != null) {
                this.f16316e.mo44310b(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "click", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "toggleCloseBtn");
            if (this.f16316e != null) {
                this.f16316e.mo44312d(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "triggerCloseBtn");
            if (this.f16316e != null) {
                this.f16316e.mo44313e(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "triggerCloseBtn", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "sendImpressions");
            if (this.f16316e != null) {
                this.f16316e.mo44314i(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "sendImpressions", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "reportUrls");
            if (this.f16316e != null) {
                this.f16316e.mo44458k(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "reportUrls", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "increaseOfferFrequence");
            if (this.f16316e != null) {
                this.f16316e.mo44459l(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "increaseOfferFrequence", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "resetCountdown");
            if (this.f16316e != null) {
                this.f16316e.mo44457h(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "resetCountdown", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "handlerH5Exception");
            if (this.f16316e != null) {
                this.f16316e.mo44460m(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "handlerH5Exception", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "install");
            if (this.f16316e != null) {
                this.f16316e.mo44456g(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "install", th);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "getNetstat");
            if (this.f16316e != null) {
                this.f16316e.mo44462o(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "getNetstat", th);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "openURL");
            if (this.f16316e != null) {
                this.f16316e.mo44461n(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "openURL", th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            C6361q.m16158d("BannerSignalPlugin", "getFileInfo");
            if (this.f16316e != null) {
                this.f16316e.mo44315j(obj, str);
            }
        } catch (Throwable th) {
            C6361q.m16155a("BannerSignalPlugin", "getFileInfo", th);
        }
    }
}
