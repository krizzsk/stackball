package com.mbridge.msdk.interstitialvideo.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.tools.C6355o;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.interstitialvideo.p194a.C6457a;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.reward.p209a.C6738a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

public class MBInterstitialVideoHandler {

    /* renamed from: a */
    private C6738a f16078a;

    public MBInterstitialVideoHandler(Context context, String str, String str2) {
        if (C6122a.m15302b().mo42895d() == null && context != null) {
            C6122a.m15302b().mo42886a(context);
        }
        String d = C6366u.m16217d(str2);
        if (!TextUtils.isEmpty(d)) {
            C6366u.m16198a(str2, d);
        }
        m16526a(str, str2);
    }

    public MBInterstitialVideoHandler(String str, String str2) {
        m16526a(str, str2);
    }

    /* renamed from: a */
    private void m16526a(String str, String str2) {
        try {
            if (this.f16078a == null) {
                C6738a aVar = new C6738a();
                this.f16078a = aVar;
                aVar.mo46979a(true);
            }
            this.f16078a.mo46983b(str, str2);
            C6076b.m15089a().mo42756e(str2);
        } catch (Throwable th) {
            C6361q.m16155a("MBRewardVideoHandler", th.getMessage(), th);
        }
    }

    public String getRequestId() {
        C6738a aVar = this.f16078a;
        return aVar != null ? aVar.mo46973a() : "";
    }

    public void load() {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            aVar.mo46986d(true);
        }
    }

    public void loadFormSelfFilling() {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            aVar.mo46986d(false);
        }
    }

    public boolean isReady() {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            return aVar.mo46987e(true);
        }
        return false;
    }

    public void show() {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            aVar.mo46977a((String) null, (String) null, (String) null);
        }
    }

    public void setRewardVideoListener(InterstitialVideoListener interstitialVideoListener) {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            aVar.mo46976a((InterVideoOutListener) new C6457a(interstitialVideoListener));
        }
    }

    public void setInterstitialVideoListener(InterstitialVideoListener interstitialVideoListener) {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            aVar.mo46976a((InterVideoOutListener) new C6457a(interstitialVideoListener));
        }
    }

    public void clearVideoCache() {
        try {
            if (this.f16078a != null) {
                C6355o.m16139a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playVideoMute(int i) {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            aVar.mo46974a(i);
        }
    }

    public void setIVRewardEnable(int i, int i2) {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            aVar.mo46975a(i, C6204a.f15406p, i2);
        }
    }

    public void setIVRewardEnable(int i, double d) {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            aVar.mo46975a(i, C6204a.f15405o, (int) (d * 100.0d));
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        C6738a aVar = this.f16078a;
        if (aVar != null) {
            aVar.mo46978a(str, str2, str3, str4);
        }
    }
}
