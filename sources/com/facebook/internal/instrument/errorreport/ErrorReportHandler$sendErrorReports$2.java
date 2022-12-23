package com.facebook.internal.instrument.errorreport;

import com.appsflyer.internal.referrer.Payload;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: ErrorReportHandler.kt */
final class ErrorReportHandler$sendErrorReports$2 implements GraphRequest.Callback {
    final /* synthetic */ ArrayList $validReports;

    ErrorReportHandler$sendErrorReports$2(ArrayList arrayList) {
        this.$validReports = arrayList;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        JSONObject jsonObject;
        Intrinsics.checkNotNullParameter(graphResponse, Payload.RESPONSE);
        try {
            if (graphResponse.getError() == null && (jsonObject = graphResponse.getJsonObject()) != null && jsonObject.getBoolean("success")) {
                for (ErrorReportData clear : this.$validReports) {
                    clear.clear();
                }
            }
        } catch (JSONException unused) {
        }
    }
}
