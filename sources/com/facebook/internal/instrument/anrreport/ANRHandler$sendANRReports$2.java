package com.facebook.internal.instrument.anrreport;

import com.appsflyer.internal.referrer.Payload;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: ANRHandler.kt */
final class ANRHandler$sendANRReports$2 implements GraphRequest.Callback {
    final /* synthetic */ List $validReports;

    ANRHandler$sendANRReports$2(List list) {
        this.$validReports = list;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        JSONObject jsonObject;
        Intrinsics.checkNotNullParameter(graphResponse, Payload.RESPONSE);
        try {
            if (graphResponse.getError() == null && (jsonObject = graphResponse.getJsonObject()) != null && jsonObject.getBoolean("success")) {
                for (InstrumentData clear : this.$validReports) {
                    clear.clear();
                }
            }
        } catch (JSONException unused) {
        }
    }
}
