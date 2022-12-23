package com.mbridge.msdk.video.signal.p235a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6331b;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6368w;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import com.mbridge.msdk.videocommon.p239d.C7179c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.m */
/* compiled from: JSRewardVideoV1 */
public final class C7065m extends C7058f {

    /* renamed from: a */
    private Activity f17576a;

    /* renamed from: b */
    private MBridgeContainerView f17577b;

    public C7065m(Activity activity, MBridgeContainerView mBridgeContainerView) {
        this.f17576a = activity;
        this.f17577b = mBridgeContainerView;
    }

    /* renamed from: a */
    public final String mo48834a() {
        C7179c cVar;
        if (this.f17577b == null) {
            super.mo48834a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f17577b.getCampaign());
                String unitID = this.f17577b.getUnitID();
                if (C7177b.m18135a() == null) {
                    cVar = null;
                } else {
                    cVar = C7177b.m18135a().mo49107a(C6122a.m15302b().mo42896e(), unitID);
                }
                JSONObject jSONObject = new JSONObject();
                if (cVar != null) {
                    jSONObject = cVar.mo49116C();
                }
                C6361q.m16154a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.f17577b.getCampaign());
                return m17912a(arrayList, unitID, "MAL_15.7.21,3.0.1", jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.mo48834a();
    }

    public final void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.f17577b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.toggleCloseBtn(i);
        }
    }

    /* renamed from: a */
    public final void mo48835a(String str) {
        super.mo48835a(str);
        try {
            if (this.f17576a != null && !TextUtils.isEmpty(str) && str.equals("click") && this.f17577b != null) {
                this.f17577b.triggerCloseBtn(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void notifyCloseBtn(int i) {
        super.notifyCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.f17577b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.notifyCloseBtn(i);
        }
    }

    /* renamed from: c */
    public final void mo48837c(String str) {
        super.mo48837c(str);
        try {
            if (this.f17576a != null && !TextUtils.isEmpty(str) && this.f17577b != null) {
                this.f17577b.handlerPlayableException(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo48836b(String str) {
        super.mo48836b(str);
        try {
            if (this.f17576a != null && !TextUtils.isEmpty(str)) {
                if (str.equals("landscape")) {
                    this.f17576a.setRequestedOrientation(0);
                } else if (str.equals("portrait")) {
                    this.f17576a.setRequestedOrientation(1);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m17912a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            C6331b bVar = new C6331b(C6122a.m15302b().mo42895d());
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", parseCamplistToJson);
            jSONObject2.put("device", bVar.mo43936a());
            jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject2.put("sdk_info", str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (C6076b.m15089a() != null) {
                String c = C6076b.m15089a().mo42752c(C6122a.m15302b().mo42896e());
                if (!TextUtils.isEmpty(c)) {
                    JSONObject jSONObject3 = new JSONObject(c);
                    try {
                        Context d = C6122a.m15302b().mo42895d();
                        String obj = C6368w.m16234b(d, "MBridge_ConfirmTitle" + str, "").toString();
                        String obj2 = C6368w.m16234b(d, "MBridge_ConfirmContent" + str, "").toString();
                        String obj3 = C6368w.m16234b(d, "MBridge_CancelText" + str, "").toString();
                        String obj4 = C6368w.m16234b(d, "MBridge_ConfirmText" + str, "").toString();
                        if (!TextUtils.isEmpty(obj)) {
                            jSONObject3.put("confirm_title", obj);
                        }
                        if (!TextUtils.isEmpty(obj2)) {
                            jSONObject3.put("confirm_description", obj2);
                        }
                        if (!TextUtils.isEmpty(obj3)) {
                            jSONObject3.put("confirm_t", obj3);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put("confirm_c_play", obj4);
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            jSONObject3.put("confirm_c_rv", obj4);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String d2 = C6076b.m15089a().mo42754d(str);
                    if (!TextUtils.isEmpty(d2)) {
                        jSONObject3.put("ivreward", new JSONObject(d2));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
