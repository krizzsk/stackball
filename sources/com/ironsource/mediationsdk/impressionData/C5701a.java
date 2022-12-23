package com.ironsource.mediationsdk.impressionData;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5555D;
import com.ironsource.mediationsdk.C5556E;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C5725i;
import com.ironsource.mediationsdk.server.C5781a;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.C5799i;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.p150g.C6008d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J*\u0010\f\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo72093d2 = {"Lcom/ironsource/mediationsdk/impressionData/ExternalImpressionDataHandler;", "Lcom/ironsource/mediationsdk/utils/OnMediationInitializationListener;", "()V", "externalArmEventsUrl", "", "isExternalArmEventsEnabled", "", "buildClientParamsForRequest", "Lorg/json/JSONObject;", "onInitFailed", "", "reason", "onInitSuccess", "adUnits", "", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "revived", "configurations", "Lcom/ironsource/mediationsdk/model/Configurations;", "onStillInProgressAfter15Secs", "setAdRevenueData", "dataSource", "impressionData", "mediationsdk_release"}, mo72094k = 1, mo72095mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.impressionData.a */
public final class C5701a implements C5799i {

    /* renamed from: a */
    private boolean f13623a = true;

    /* renamed from: b */
    private String f13624b = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData";

    @Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo72093d2 = {"com/ironsource/mediationsdk/impressionData/ExternalImpressionDataHandler$setAdRevenueData$1", "Lcom/ironsource/mediationsdk/server/HttpFunctionsListener;", "onResponse", "", "requestSucceeded", "", "mediationsdk_release"}, mo72094k = 1, mo72095mv = {1, 4, 2})
    /* renamed from: com.ironsource.mediationsdk.impressionData.a$a */
    public static final class C5702a implements C5781a {
        C5702a() {
        }

        /* renamed from: a */
        public final void mo41878a(boolean z) {
            if (!z) {
                IronLog.API.error("failed to send impression data");
            }
        }
    }

    /* renamed from: a */
    private static JSONObject m14034a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceOS", "android");
        ContextProvider instance = ContextProvider.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "ContextProvider.getInstance()");
        Context applicationContext = instance.getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            C5555D ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.f12807a);
                jSONObject.put("advIdType", ironSourceAdvId.f12808b);
            }
        }
        C5556E a = C5556E.m13257a();
        Intrinsics.checkNotNullExpressionValue(a, "IronSourceObject.getInstance()");
        String k = a.mo41389k();
        if (k != null) {
            jSONObject.put("applicationKey", k);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo41325a(String str) {
    }

    /* renamed from: a */
    public final void mo41877a(String str, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "dataSource");
        Intrinsics.checkNotNullParameter(jSONObject, "impressionData");
        if (!this.f13623a) {
            IronLog.INTERNAL.info("disabled from server");
            return;
        }
        try {
            JSONObject a = m14034a();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("externalMediationSource", str);
            jSONObject2.putOpt("externalMediationData", jSONObject);
            jSONObject2.putOpt("clientParams", a);
            IronLog ironLog = IronLog.API;
            ironLog.info("impressionData: " + jSONObject2);
            HttpFunctions.sendPostRequest(this.f13624b, jSONObject2.toString(), new C5702a());
        } catch (Exception e) {
            IronLog ironLog2 = IronLog.API;
            ironLog2.error("exception " + e.getMessage() + " sending impression data");
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo41327a(List<IronSource.AD_UNIT> list, boolean z, C5725i iVar) {
        if (iVar != null) {
            C6008d a = iVar.mo41975a();
            Intrinsics.checkNotNullExpressionValue(a, "applicationConfigurations");
            this.f13623a = a.mo42554f().f13911a;
            C6008d a2 = iVar.mo41975a();
            Intrinsics.checkNotNullExpressionValue(a2, "applicationConfigurations");
            this.f13624b = a2.mo42554f().f13912b;
        }
    }

    /* renamed from: f */
    public final void mo41336f() {
    }
}
