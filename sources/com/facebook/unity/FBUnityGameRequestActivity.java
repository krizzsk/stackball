package com.facebook.unity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.gamingservices.GameRequestDialog;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.model.GameRequestContent;
import java.util.Arrays;
import java.util.Locale;

public class FBUnityGameRequestActivity extends BaseActivity {
    public static final String GAME_REQUEST_PARAMS = "game_request_params";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            showDialog();
        }
    }

    private void showDialog() {
        Bundle bundleExtra = getIntent().getBundleExtra(GAME_REQUEST_PARAMS);
        final UnityMessage unityMessage = new UnityMessage("OnAppRequestsComplete");
        if (bundleExtra.containsKey(Constants.CALLBACK_ID_KEY)) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, bundleExtra.getString(Constants.CALLBACK_ID_KEY));
        }
        GameRequestContent.Builder builder = new GameRequestContent.Builder();
        if (bundleExtra.containsKey("message")) {
            builder.setMessage(bundleExtra.getString("message"));
        }
        if (bundleExtra.containsKey(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)) {
            String string = bundleExtra.getString(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE);
            try {
                builder.setActionType(GameRequestContent.ActionType.valueOf(string));
            } catch (IllegalArgumentException unused) {
                unityMessage.sendError("Unknown action type: " + string);
                finish();
                return;
            }
        }
        if (bundleExtra.containsKey("object_id")) {
            builder.setObjectId(bundleExtra.getString("object_id"));
        }
        if (bundleExtra.containsKey("to")) {
            builder.setRecipients(Arrays.asList(bundleExtra.getString("to").split(",")));
        }
        if (bundleExtra.containsKey("filters")) {
            String upperCase = bundleExtra.getString("filters").toUpperCase(Locale.ROOT);
            try {
                builder.setFilters(GameRequestContent.Filters.valueOf(upperCase));
            } catch (IllegalArgumentException unused2) {
                unityMessage.sendError("Unsupported filter type: " + upperCase);
                finish();
                return;
            }
        }
        if (bundleExtra.containsKey("data")) {
            builder.setData(bundleExtra.getString("data"));
        }
        if (bundleExtra.containsKey("title")) {
            builder.setTitle(bundleExtra.getString("title"));
        }
        GameRequestContent build = builder.build();
        GameRequestDialog gameRequestDialog = new GameRequestDialog((Activity) this);
        gameRequestDialog.registerCallback(this.mCallbackManager, new FacebookCallback<GameRequestDialog.Result>() {
            public void onSuccess(GameRequestDialog.Result result) {
                unityMessage.put(ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID, result.getRequestId());
                unityMessage.put("to", TextUtils.join(",", result.getRequestRecipients()));
                unityMessage.send();
                FBUnityGameRequestActivity.this.finish();
            }

            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
                FBUnityGameRequestActivity.this.finish();
            }

            public void onError(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getMessage());
                FBUnityGameRequestActivity.this.finish();
            }
        });
        try {
            gameRequestDialog.show(build);
        } catch (IllegalArgumentException e) {
            unityMessage.sendError("Unexpected exception encountered: " + e.toString());
            finish();
        }
    }
}
