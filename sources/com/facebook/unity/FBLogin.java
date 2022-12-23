package com.facebook.unity;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.DeviceLoginManager;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class FBLogin {
    public static void loginWithReadPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, false, false);
    }

    public static void loginWithPublishPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, true, false);
    }

    public static void loginForTVWithReadPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, false, true);
    }

    public static void loginForTVWithPublishPermissions(String str, FBUnityLoginActivity fBUnityLoginActivity) {
        login(str, fBUnityLoginActivity, true, true);
    }

    public static void sendLoginSuccessMessage(AccessToken accessToken, String str) {
        UnityMessage unityMessage = new UnityMessage("OnLoginComplete");
        addLoginParametersToMessage(unityMessage, accessToken, str);
        unityMessage.send();
    }

    public static void addLoginParametersToMessage(UnityMessage unityMessage, AccessToken accessToken, String str) {
        unityMessage.put("key_hash", C2305FB.getKeyHash());
        unityMessage.put("opened", true);
        unityMessage.put("access_token", accessToken.getToken());
        unityMessage.put("expiration_timestamp", Long.valueOf(accessToken.getExpires().getTime() / 1000).toString());
        unityMessage.put("user_id", accessToken.getUserId());
        unityMessage.put("permissions", TextUtils.join(",", accessToken.getPermissions()));
        unityMessage.put("declined_permissions", TextUtils.join(",", accessToken.getDeclinedPermissions()));
        unityMessage.put("graph_domain", accessToken.getGraphDomain() != null ? accessToken.getGraphDomain() : AccessToken.DEFAULT_GRAPH_DOMAIN);
        if (accessToken.getLastRefresh() != null) {
            unityMessage.put("last_refresh", Long.valueOf(accessToken.getLastRefresh().getTime() / 1000).toString());
        }
        if (str != null && !str.isEmpty()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, str);
        }
    }

    private static void login(String str, FBUnityLoginActivity fBUnityLoginActivity, boolean z, boolean z2) {
        LoginManager loginManager;
        if (!FacebookSdk.isInitialized()) {
            Log.w(C2305FB.TAG, "Facebook SDK not initialized. Call init() before calling login()");
            return;
        }
        final UnityMessage unityMessage = new UnityMessage("OnLoginComplete");
        unityMessage.put("key_hash", C2305FB.getKeyHash());
        UnityParams parse = UnityParams.parse(str, "couldn't parse login params: " + str);
        final String str2 = null;
        ArrayList arrayList = parse.hasString("scope").booleanValue() ? new ArrayList(Arrays.asList(parse.getString("scope").split(","))) : null;
        if (parse.has(Constants.CALLBACK_ID_KEY)) {
            str2 = parse.getString(Constants.CALLBACK_ID_KEY);
            unityMessage.put(Constants.CALLBACK_ID_KEY, str2);
        }
        LoginManager.getInstance().registerCallback(fBUnityLoginActivity.getCallbackManager(), new FacebookCallback<LoginResult>() {
            public void onSuccess(LoginResult loginResult) {
                FBLogin.sendLoginSuccessMessage(loginResult.getAccessToken(), str2);
            }

            public void onCancel() {
                unityMessage.putCancelled();
                unityMessage.send();
            }

            public void onError(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getMessage());
            }
        });
        if (z2) {
            loginManager = DeviceLoginManager.getInstance();
        } else {
            loginManager = LoginManager.getInstance();
        }
        if (z) {
            loginManager.logInWithPublishPermissions((Activity) fBUnityLoginActivity, (Collection<String>) arrayList);
        } else {
            loginManager.logInWithReadPermissions((Activity) fBUnityLoginActivity, (Collection<String>) arrayList);
        }
    }
}
