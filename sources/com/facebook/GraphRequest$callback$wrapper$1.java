package com.facebook;

import com.appsflyer.internal.referrer.Payload;
import com.facebook.GraphRequest;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: GraphRequest.kt */
final class GraphRequest$callback$wrapper$1 implements GraphRequest.Callback {
    final /* synthetic */ GraphRequest.Callback $callback;

    GraphRequest$callback$wrapper$1(GraphRequest.Callback callback) {
        this.$callback = callback;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        Intrinsics.checkNotNullParameter(graphResponse, Payload.RESPONSE);
        JSONObject jSONObject = graphResponse.getJSONObject();
        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("__debug__") : null;
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                if (!(optString == null || optString2 == null)) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.areEqual((Object) optString2, (Object) "warning")) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!Utility.isNullOrEmpty(optString3)) {
                        optString = optString + " Link: " + optString3;
                    }
                    Logger.Companion.log(loggingBehavior, GraphRequest.TAG, optString);
                }
            }
        }
        GraphRequest.Callback callback = this.$callback;
        if (callback != null) {
            callback.onCompleted(graphResponse);
        }
    }
}
