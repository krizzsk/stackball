package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6355o;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.reward.p209a.C6738a;
import com.mbridge.msdk.video.p214bt.module.p217b.C6914a;
import com.mbridge.msdk.video.p214bt.module.p217b.C6921g;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;

public class MBBidRewardVideoHandler {
    private static final String TAG = "MBBidRewardVideoHandler";
    private C6738a controller;

    public MBBidRewardVideoHandler(Context context, String str, String str2) {
        if (C6122a.m15302b().mo42895d() == null && context != null) {
            C6122a.m15302b().mo42886a(context);
        }
        String d = C6366u.m16217d(str2);
        if (!TextUtils.isEmpty(d)) {
            C6366u.m16198a(str2, d);
        }
        initMBBidRewardVideoHandler(str, str2);
    }

    public MBBidRewardVideoHandler(String str, String str2) {
        String d = C6366u.m16217d(str2);
        if (!TextUtils.isEmpty(d)) {
            C6366u.m16198a(str2, d);
        }
        initMBBidRewardVideoHandler(str, str2);
    }

    private void initMBBidRewardVideoHandler(String str, String str2) {
        try {
            if (this.controller == null) {
                C6738a aVar = new C6738a();
                this.controller = aVar;
                aVar.mo46979a(false);
                this.controller.mo46984b(true);
            }
            this.controller.mo46983b(str, str2);
        } catch (Throwable th) {
            C6361q.m16155a(TAG, th.getMessage(), th);
        }
    }

    public void loadFromBid(String str) {
        C6738a aVar = this.controller;
        if (aVar != null) {
            aVar.mo46980a(true, str);
        }
    }

    public boolean isBidReady() {
        C6738a aVar = this.controller;
        if (aVar != null) {
            return aVar.mo46987e(false);
        }
        return false;
    }

    public String getRequestId() {
        C6738a aVar = this.controller;
        return aVar != null ? aVar.mo46973a() : "";
    }

    public void showFromBid() {
        C6738a aVar = this.controller;
        if (aVar != null) {
            aVar.mo46977a((String) null, (String) null, (String) null);
        }
    }

    public void showFromBid(String str) {
        C6738a aVar = this.controller;
        if (aVar != null) {
            aVar.mo46977a((String) null, str, (String) null);
        }
    }

    public void showFromBid(String str, String str2) {
        C6738a aVar = this.controller;
        if (aVar != null) {
            aVar.mo46977a((String) null, str, str2);
        }
    }

    public void setRewardVideoListener(C6921g gVar) {
        C6738a aVar = this.controller;
        if (aVar != null) {
            aVar.mo46976a((InterVideoOutListener) new C6914a(gVar));
        }
    }

    public void clearVideoCache() {
        try {
            if (this.controller != null) {
                C6355o.m16139a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playVideoMute(int i) {
        C6738a aVar = this.controller;
        if (aVar != null) {
            aVar.mo46974a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        C6738a aVar = this.controller;
        if (aVar != null) {
            aVar.mo46978a(str, str2, str3, str4);
        }
    }

    public void setRewardPlus(boolean z) {
        C6738a aVar = this.controller;
        if (aVar != null) {
            aVar.mo46985c(z);
        }
    }
}
