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
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.gamingservices.model.ContextChooseContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ContextChooseDialog extends FacebookDialogBase<ContextChooseContent, Result> {
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
    /* access modifiers changed from: private */
    public FacebookCallback mCallback;

    public boolean canShow(ContextChooseContent contextChooseContent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public AppCall createBaseAppCall() {
        return null;
    }

    /* access modifiers changed from: protected */
    public List<FacebookDialogBase<ContextChooseContent, Result>.ModeHandler> getOrderedModeHandlers() {
        return null;
    }

    public ContextChooseDialog(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public ContextChooseDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    public ContextChooseDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    private ContextChooseDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }

    /* access modifiers changed from: protected */
    public void showImpl(ContextChooseContent contextChooseContent, Object obj) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            showForCloud(contextChooseContent, obj);
        }
    }

    private void showForCloud(ContextChooseContent contextChooseContent, Object obj) {
        Activity activityContext = getActivityContext();
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open ContextChooseContent with an invalid access token");
        }
        C21081 r1 = new DaemonRequest.Callback() {
            public void onCompleted(GraphResponse graphResponse) {
                if (ContextChooseDialog.this.mCallback == null) {
                    return;
                }
                if (graphResponse.getError() != null) {
                    ContextChooseDialog.this.mCallback.onError(new FacebookException(graphResponse.getError().getErrorMessage()));
                } else {
                    ContextChooseDialog.this.mCallback.onSuccess(new Result(graphResponse));
                }
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filters", contextChooseContent.getFilters());
            jSONObject.put(SDKConstants.PARAM_CONTEXT_MIN_SIZE, contextChooseContent.getMinSize());
            List<String> filters = contextChooseContent.getFilters();
            if (filters != null && !filters.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < filters.size(); i++) {
                    jSONArray.put(filters.get(i));
                }
                jSONObject.put("filters", jSONArray);
            }
            DaemonRequest.executeAsync((Context) activityContext, jSONObject, (DaemonRequest.Callback) r1, SDKMessageEnum.CONTEXT_CHOOSE);
        } catch (JSONException unused) {
            FacebookCallback facebookCallback = this.mCallback;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Couldn't prepare Context Choose Dialog"));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback facebookCallback) {
        final C21092 r4;
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
                return ShareInternalUtility.handleActivityResult(ContextChooseDialog.this.getRequestCode(), i, intent, r4);
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
