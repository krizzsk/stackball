package com.facebook.unity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareContent;
import com.facebook.share.widget.ShareDialog;
import java.util.Locale;

public class FBUnityDialogsActivity extends BaseActivity {
    public static final String DIALOG_TYPE = "dialog_type";
    public static final String FEED_DIALOG_PARAMS = "feed_dialog_params";
    public static final String SHARE_DIALOG_PARAMS = "share_dialog_params";
    private static String TAG = FBUnityDialogsActivity.class.getName();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        ShareContent shareContent;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra(SHARE_DIALOG_PARAMS)) {
            bundle2 = intent.getBundleExtra(SHARE_DIALOG_PARAMS);
            shareContent = FBDialogUtils.createShareContentBuilder(bundle2).build();
        } else if (intent.hasExtra(FEED_DIALOG_PARAMS)) {
            bundle2 = intent.getBundleExtra(FEED_DIALOG_PARAMS);
            shareContent = FBDialogUtils.createFeedContentBuilder(bundle2).build();
        } else {
            Log.e(TAG, String.format(Locale.ROOT, "Failed to find extra %s or %s", new Object[]{SHARE_DIALOG_PARAMS, FEED_DIALOG_PARAMS}));
            finish();
            return;
        }
        ShareDialog shareDialog = new ShareDialog((Activity) this);
        final UnityMessage unityMessage = new UnityMessage("OnShareLinkComplete");
        String string = bundle2.getString(Constants.CALLBACK_ID_KEY);
        if (string != null) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, string);
        }
        shareDialog.registerCallback(this.mCallbackManager, new FacebookCallback<Sharer.Result>() {
            public void onSuccess(Sharer.Result result) {
                if (result.getPostId() != null) {
                    unityMessage.putID(result.getPostId());
                }
                unityMessage.put("posted", true);
                unityMessage.send();
            }

            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
            }

            public void onError(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getMessage());
            }
        });
        shareDialog.show(shareContent, (ShareDialog.Mode) getIntent().getSerializableExtra(DIALOG_TYPE));
    }
}
