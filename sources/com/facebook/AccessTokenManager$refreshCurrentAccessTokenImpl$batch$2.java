package com.facebook;

import com.appsflyer.internal.referrer.Payload;
import com.facebook.AccessTokenManager;
import com.facebook.GraphRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: AccessTokenManager.kt */
final class AccessTokenManager$refreshCurrentAccessTokenImpl$batch$2 implements GraphRequest.Callback {
    final /* synthetic */ AccessTokenManager.RefreshResult $refreshResult;

    AccessTokenManager$refreshCurrentAccessTokenImpl$batch$2(AccessTokenManager.RefreshResult refreshResult) {
        this.$refreshResult = refreshResult;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        Intrinsics.checkNotNullParameter(graphResponse, Payload.RESPONSE);
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject != null) {
            this.$refreshResult.setAccessToken(jsonObject.optString("access_token"));
            this.$refreshResult.setExpiresAt(jsonObject.optInt("expires_at"));
            this.$refreshResult.setExpiresIn(jsonObject.optInt(AccessToken.EXPIRES_IN_KEY));
            this.$refreshResult.setDataAccessExpirationTime(Long.valueOf(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
            this.$refreshResult.setGraphDomain(jsonObject.optString("graph_domain", (String) null));
        }
    }
}
