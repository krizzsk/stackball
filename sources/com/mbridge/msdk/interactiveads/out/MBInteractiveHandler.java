package com.mbridge.msdk.interactiveads.out;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.interactiveads.p186c.C6408a;
import java.util.Map;

public class MBInteractiveHandler {
    private static final String TAG = "MBInteractiveHandler";
    private C6408a mController;

    public String getRequestId() {
        C6408a aVar = this.mController;
        return aVar != null ? aVar.mo44082d() : "";
    }

    public MBInteractiveHandler(Context context, Map<String, Object> map) {
        if (this.mController == null) {
            this.mController = new C6408a();
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
        this.mController.mo44076a(context, map);
        if (C6122a.m15302b().mo42895d() == null && context != null) {
            C6122a.m15302b().mo42886a(context);
        }
    }

    public MBInteractiveHandler(Context context, Map<String, Object> map, ViewGroup viewGroup, String str) {
        if (this.mController == null) {
            this.mController = new C6408a();
        }
        if (map != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str2 = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (!TextUtils.isEmpty(str2)) {
                String d = C6366u.m16217d(str2);
                if (!TextUtils.isEmpty(d)) {
                    C6366u.m16198a(str2, d);
                }
            }
        }
        this.mController.mo44077a(context, map, viewGroup, str);
        if (C6122a.m15302b().mo42895d() == null && context != null) {
            C6122a.m15302b().mo42886a(context);
        }
    }

    public void setEntranceView(ViewGroup viewGroup, String str) {
        C6408a aVar = this.mController;
        if (aVar != null && str != null) {
            aVar.mo44072a(viewGroup);
            this.mController.mo44079b(str);
            this.mController.mo44078b();
        }
    }

    public void load() {
        try {
            if (this.mController != null) {
                this.mController.mo44069a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show() {
        try {
            this.mController.mo44080c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int isReady() {
        C6408a aVar = this.mController;
        if (aVar == null) {
            return -1;
        }
        if ((aVar.f15954e == null || !aVar.f15954e.mo44006a()) && aVar.f15954e != null) {
            return aVar.f15953d;
        }
        return 0;
    }

    public void setInteractiveAdsListener(InteractiveAdsListener interactiveAdsListener) {
        try {
            if (this.mController != null && interactiveAdsListener != null) {
                this.mController.f15952b = interactiveAdsListener;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
