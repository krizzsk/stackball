package com.facebook.unity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.gamingservices.FriendFinderDialog;

public class FBUnityGamingServicesFriendFinderActivity extends BaseActivity {
    public static final String DIALOG_PARAMS = "dialog_params";
    private static String TAG = FBUnityGamingServicesFriendFinderActivity.class.getName();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra(DIALOG_PARAMS);
        final UnityMessage unityMessage = new UnityMessage("OnFriendFinderComplete");
        String string = bundleExtra.getString(Constants.CALLBACK_ID_KEY);
        String str = TAG;
        Log.e(str, "callbackID: " + string);
        if (string != null) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, string);
        }
        FriendFinderDialog friendFinderDialog = new FriendFinderDialog((Activity) this);
        friendFinderDialog.registerCallback(this.mCallbackManager, new FacebookCallback<FriendFinderDialog.Result>() {
            public void onSuccess(FriendFinderDialog.Result result) {
                unityMessage.put("success", true);
                unityMessage.send();
                FBUnityGamingServicesFriendFinderActivity.this.finish();
            }

            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
                FBUnityGamingServicesFriendFinderActivity.this.finish();
            }

            public void onError(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getMessage());
                FBUnityGamingServicesFriendFinderActivity.this.finish();
            }
        });
        friendFinderDialog.show();
    }
}
