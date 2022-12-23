package com.facebook.internal;

import com.appsflyer.internal.referrer.Payload;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: Utility.kt */
final class Utility$getGraphMeRequestWithCacheAsync$graphCallback$1 implements GraphRequest.Callback {
    final /* synthetic */ String $accessToken;
    final /* synthetic */ Utility.GraphMeRequestWithCacheCallback $callback;

    Utility$getGraphMeRequestWithCacheAsync$graphCallback$1(Utility.GraphMeRequestWithCacheCallback graphMeRequestWithCacheCallback, String str) {
        this.$callback = graphMeRequestWithCacheCallback;
        this.$accessToken = str;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        Intrinsics.checkNotNullParameter(graphResponse, Payload.RESPONSE);
        if (graphResponse.getError() != null) {
            this.$callback.onFailure(graphResponse.getError().getException());
            return;
        }
        String str = this.$accessToken;
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject != null) {
            ProfileInformationCache.putProfileInformation(str, jsonObject);
            this.$callback.onSuccess(graphResponse.getJsonObject());
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
