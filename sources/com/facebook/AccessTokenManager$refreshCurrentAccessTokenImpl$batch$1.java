package com.facebook;

import android.util.Log;
import com.appsflyer.internal.referrer.Payload;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(mo72092d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo72093d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "onCompleted"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: AccessTokenManager.kt */
final class AccessTokenManager$refreshCurrentAccessTokenImpl$batch$1 implements GraphRequest.Callback {
    final /* synthetic */ Set $declinedPermissions;
    final /* synthetic */ Set $expiredPermissions;
    final /* synthetic */ Set $permissions;
    final /* synthetic */ AtomicBoolean $permissionsCallSucceeded;

    AccessTokenManager$refreshCurrentAccessTokenImpl$batch$1(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
        this.$permissionsCallSucceeded = atomicBoolean;
        this.$permissions = set;
        this.$declinedPermissions = set2;
        this.$expiredPermissions = set3;
    }

    public final void onCompleted(GraphResponse graphResponse) {
        JSONArray optJSONArray;
        Intrinsics.checkNotNullParameter(graphResponse, Payload.RESPONSE);
        JSONObject jsonObject = graphResponse.getJsonObject();
        if (jsonObject != null && (optJSONArray = jsonObject.optJSONArray("data")) != null) {
            this.$permissionsCallSucceeded.set(true);
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("permission");
                    String optString2 = optJSONObject.optString("status");
                    if (!Utility.isNullOrEmpty(optString) && !Utility.isNullOrEmpty(optString2)) {
                        Intrinsics.checkNotNullExpressionValue(optString2, "status");
                        Locale locale = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                        if (optString2 != null) {
                            String lowerCase = optString2.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            if (lowerCase != null) {
                                int hashCode = lowerCase.hashCode();
                                if (hashCode != -1309235419) {
                                    if (hashCode != 280295099) {
                                        if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                            this.$declinedPermissions.add(optString);
                                        }
                                    } else if (lowerCase.equals("granted")) {
                                        this.$permissions.add(optString);
                                    }
                                } else if (lowerCase.equals("expired")) {
                                    this.$expiredPermissions.add(optString);
                                }
                            }
                            Log.w(AccessTokenManager.TAG, "Unexpected status: " + lowerCase);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
            }
        }
    }
}
