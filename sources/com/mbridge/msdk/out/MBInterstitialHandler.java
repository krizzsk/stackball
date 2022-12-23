package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.interstitial.p192c.C6434a;
import java.util.Map;

public class MBInterstitialHandler {
    private C6434a mController;

    public MBInterstitialHandler(Context context, Map<String, Object> map) {
        if (this.mController == null) {
            this.mController = new C6434a();
        }
        if (map != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (!TextUtils.isEmpty(str)) {
                String d = C6366u.m16217d(str);
                if (!TextUtils.isEmpty(d)) {
                    C6366u.m16198a(str, d);
                }
            }
        }
        this.mController.mo44156a(context, map);
        if (C6122a.m15302b().mo42895d() == null && context != null) {
            C6122a.m15302b().mo42886a(context);
        }
    }

    public void preload() {
        try {
            if (this.mController != null) {
                this.mController.mo44154a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getRequestId() {
        C6434a aVar = this.mController;
        return aVar != null ? aVar.mo44157b() : "";
    }

    public void show() {
        try {
            this.mController.mo44158c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setInterstitialListener(InterstitialListener interstitialListener) {
        try {
            if (this.mController != null) {
                this.mController.mo44155a(interstitialListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
