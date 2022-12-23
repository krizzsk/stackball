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
import com.facebook.gamingservices.model.ContextSwitchContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ContextSwitchDialog extends FacebookDialogBase<ContextSwitchContent, Result> {
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
    /* access modifiers changed from: private */
    public FacebookCallback mCallback;

    public boolean canShow(ContextSwitchContent contextSwitchContent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public AppCall createBaseAppCall() {
        return null;
    }

    /* access modifiers changed from: protected */
    public List<FacebookDialogBase<ContextSwitchContent, Result>.ModeHandler> getOrderedModeHandlers() {
        return null;
    }

    public ContextSwitchDialog(Activity activity) {
        super(activity, DEFAULT_REQUEST_CODE);
    }

    public ContextSwitchDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    public ContextSwitchDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    private ContextSwitchDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, DEFAULT_REQUEST_CODE);
    }

    /* access modifiers changed from: protected */
    public void showImpl(ContextSwitchContent contextSwitchContent, Object obj) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            showForCloud(contextSwitchContent, obj);
        }
    }

    private void showForCloud(ContextSwitchContent contextSwitchContent, Object obj) {
        Activity activityContext = getActivityContext();
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open ContextSwitchContent with an invalid access token");
        }
        C21141 r0 = new DaemonRequest.Callback() {
            public void onCompleted(GraphResponse graphResponse) {
                if (ContextSwitchDialog.this.mCallback == null) {
                    return;
                }
                if (graphResponse.getError() != null) {
                    ContextSwitchDialog.this.mCallback.onError(new FacebookException(graphResponse.getError().getErrorMessage()));
                } else {
                    ContextSwitchDialog.this.mCallback.onSuccess(new Result(graphResponse));
                }
            }
        };
        String contextID = contextSwitchContent.getContextID();
        if (contextID == null) {
            FacebookCallback facebookCallback = this.mCallback;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Required string contextID not provided."));
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", contextID);
            DaemonRequest.executeAsync((Context) activityContext, jSONObject, (DaemonRequest.Callback) r0, SDKMessageEnum.CONTEXT_SWITCH);
        } catch (JSONException unused) {
            FacebookCallback facebookCallback2 = this.mCallback;
            if (facebookCallback2 != null) {
                facebookCallback2.onError(new FacebookException("Couldn't prepare Context Switch Dialog"));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback facebookCallback) {
        final C21152 r4;
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
                return ShareInternalUtility.handleActivityResult(ContextSwitchDialog.this.getRequestCode(), i, intent, r4);
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
