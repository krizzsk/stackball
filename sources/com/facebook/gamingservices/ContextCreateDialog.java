package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.gamingservices.model.ContextCreateContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ContextCreateDialog extends FacebookDialogBase<ContextCreateContent, Result> {
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
    /* access modifiers changed from: private */
    public FacebookCallback mCallback;

    public boolean canShow(ContextCreateContent contextCreateContent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public AppCall createBaseAppCall() {
        return null;
    }

    /* access modifiers changed from: protected */
    public List<FacebookDialogBase<ContextCreateContent, Result>.ModeHandler> getOrderedModeHandlers() {
        return null;
    }

    public ContextCreateDialog(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public ContextCreateDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    public ContextCreateDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    private ContextCreateDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }

    /* access modifiers changed from: protected */
    public void showImpl(ContextCreateContent contextCreateContent, Object obj) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            showForCloud(contextCreateContent, obj);
        }
    }

    private void showForCloud(ContextCreateContent contextCreateContent, Object obj) {
        Activity activityContext = getActivityContext();
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open ContextCreateContent with an invalid access token");
        }
        C21111 r0 = new DaemonRequest.Callback() {
            public void onCompleted(GraphResponse graphResponse) {
                if (ContextCreateDialog.this.mCallback == null) {
                    return;
                }
                if (graphResponse.getError() != null) {
                    ContextCreateDialog.this.mCallback.onError(new FacebookException(graphResponse.getError().getErrorMessage()));
                } else {
                    ContextCreateDialog.this.mCallback.onSuccess(new Result(graphResponse));
                }
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            if (contextCreateContent.getSuggestedPlayerIDs() != null) {
                List asList = Arrays.asList(contextCreateContent.getSuggestedPlayerIDs().split("\\s*,\\s*"));
                if (!asList.isEmpty()) {
                    if (asList.size() == 1) {
                        jSONObject.put("id", asList.get(0));
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < asList.size(); i++) {
                            jSONArray.put(asList.get(i));
                        }
                        jSONObject.put("id", jSONArray);
                    }
                }
            }
            DaemonRequest.executeAsync((Context) activityContext, jSONObject, (DaemonRequest.Callback) r0, SDKMessageEnum.CONTEXT_CREATE);
        } catch (JSONException unused) {
            FacebookCallback facebookCallback = this.mCallback;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Couldn't prepare Context Create Dialog"));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback facebookCallback) {
        final C21122 r4;
        this.mCallback = facebookCallback;
        if (facebookCallback == null) {
            r4 = null;
        } else {
            r4 = new ResultProcessor(facebookCallback) {
                public void onSuccess(AppCall appCall, Bundle bundle) {
                    if (bundle != null) {
                        facebookCallback.onSuccess(new Result(bundle));
                    } else {
                        onCancel(appCall);
                    }
                }
            };
        }
        callbackManagerImpl.registerCallback(getRequestCode(), new CallbackManagerImpl.Callback() {
            public boolean onActivityResult(int i, Intent intent) {
                return ShareInternalUtility.handleActivityResult(ContextCreateDialog.this.getRequestCode(), i, intent, r4);
            }
        });
    }

    public static final class Result {
        String contextID;

        private Result(Bundle bundle) {
            this.contextID = bundle.getString("id");
        }

        private Result(GraphResponse graphResponse) {
            try {
                JSONObject jSONObject = graphResponse.getJSONObject();
                if (jSONObject == null) {
                    this.contextID = null;
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                this.contextID = optJSONObject != null ? optJSONObject.getString("id") : null;
            } catch (JSONException unused) {
                this.contextID = null;
            }
        }

        public String getContextID() {
            return this.contextID;
        }
    }
}
