package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p243my.target.common.models.ImageData;
import org.json.JSONObject;

/* renamed from: com.my.target.b4 */
public class C7329b4 {

    /* renamed from: a */
    public final C7718w2 f18360a;

    /* renamed from: b */
    public final C7648s3 f18361b;

    public C7329b4(C7718w2 w2Var, C7617q1 q1Var, C7298a aVar, Context context) {
        this.f18360a = w2Var;
        this.f18361b = C7648s3.m20309a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C7329b4 m18780a(C7718w2 w2Var, C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7329b4(w2Var, q1Var, aVar, context);
    }

    /* renamed from: a */
    public void mo49731a(JSONObject jSONObject, C7497k2 k2Var) {
        this.f18361b.mo51485a(jSONObject, (C7768z1) k2Var);
        k2Var.setHasNotification(jSONObject.optBoolean("hasNotification", k2Var.isHasNotification()));
        k2Var.setBanner(jSONObject.optBoolean(IronSourceConstants.BANNER_AD_UNIT, k2Var.isBanner()));
        k2Var.setRequireCategoryHighlight(jSONObject.optBoolean("RequireCategoryHighlight", k2Var.isRequireCategoryHighlight()));
        k2Var.setItemHighlight(jSONObject.optBoolean("ItemHighlight", k2Var.isItemHighlight()));
        k2Var.setMain(jSONObject.optBoolean("Main", k2Var.isMain()));
        k2Var.setRequireWifi(jSONObject.optBoolean("RequireWifi", k2Var.isRequireWifi()));
        k2Var.setSubItem(jSONObject.optBoolean("subitem", k2Var.isSubItem()));
        k2Var.setBubbleId(jSONObject.optString("bubble_id", k2Var.getBubbleId()));
        k2Var.setLabelType(jSONObject.optString("labelType", k2Var.getLabelType()));
        k2Var.setStatus(jSONObject.optString("status", k2Var.getStatus()));
        k2Var.setMrgsId(jSONObject.optInt("mrgs_id"));
        k2Var.setCoins(jSONObject.optInt("coins"));
        k2Var.setCoinsIconBgColor(C7748y3.m20871a(jSONObject, "coins_icon_bgcolor", k2Var.getCoinsIconBgColor()));
        k2Var.setCoinsIconTextColor(C7748y3.m20871a(jSONObject, "coins_icon_textcolor", k2Var.getCoinsIconTextColor()));
        String optString = jSONObject.optString("icon_hd");
        if (!TextUtils.isEmpty(optString)) {
            k2Var.setIcon(ImageData.newImageData(optString));
        }
        String optString2 = jSONObject.optString("coins_icon_hd");
        if (!TextUtils.isEmpty(optString2)) {
            k2Var.setCoinsIcon(ImageData.newImageData(optString2));
        }
        String optString3 = jSONObject.optString("cross_notif_icon_hd");
        if (!TextUtils.isEmpty(optString3)) {
            k2Var.setCrossNotifIcon(ImageData.newImageData(optString3));
        }
        String d = this.f18360a.mo51776d();
        if (!TextUtils.isEmpty(d)) {
            k2Var.setBubbleIcon(ImageData.newImageData(d));
        }
        String e = this.f18360a.mo51778e();
        if (!TextUtils.isEmpty(e)) {
            k2Var.setGotoAppIcon(ImageData.newImageData(e));
        }
        String h = this.f18360a.mo51784h();
        if (!TextUtils.isEmpty(h)) {
            k2Var.setLabelIcon(ImageData.newImageData(h));
        }
        String status = k2Var.getStatus();
        if (status != null) {
            String a = this.f18360a.mo51770a(status);
            if (!TextUtils.isEmpty(a)) {
                k2Var.setStatusIcon(ImageData.newImageData(a));
            }
        }
        String g = this.f18360a.mo51782g();
        if (k2Var.isItemHighlight() && !TextUtils.isEmpty(g)) {
            k2Var.setItemHighlightIcon(ImageData.newImageData(g));
        }
    }
}
