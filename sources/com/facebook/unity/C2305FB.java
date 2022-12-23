package com.facebook.unity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoginStatusCallback;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.applinks.AppLinkData;
import com.facebook.gamingservices.GamingImageUploader;
import com.facebook.gamingservices.GamingVideoUploader;
import com.facebook.gamingservices.cloudgaming.AppToUserNotificationSender;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.GameFeaturesLibrary;
import com.facebook.gamingservices.cloudgaming.InAppAdLibrary;
import com.facebook.gamingservices.cloudgaming.InAppPurchaseLibrary;
import com.facebook.gamingservices.cloudgaming.PlayableAdsLibrary;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Utility;
import com.facebook.login.LoginManager;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.widget.ShareDialog;
import com.facebook.unity.FBUnityLoginActivity;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tapjoy.TapjoyConstants;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Currency;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.unity.FB */
public class C2305FB {
    static final String FB_UNITY_OBJECT = "UnityFacebookSDKPlugin";
    static ShareDialog.Mode ShareDialogMode = ShareDialog.Mode.AUTOMATIC;
    static final String TAG = C2305FB.class.getName();
    private static AtomicBoolean activateAppCalled = new AtomicBoolean();
    private static AppEventsLogger appEventsLogger;
    private static Intent clearedIntent;
    private static Intent intent;

    private static AppEventsLogger getAppEventsLogger() {
        if (appEventsLogger == null) {
            appEventsLogger = AppEventsLogger.newLogger(getUnityActivity().getApplicationContext());
        }
        return appEventsLogger;
    }

    public static Activity getUnityActivity() {
        return UnityReflection.GetUnityActivity();
    }

    public static void Init(String str) {
        final String str2;
        String str3 = TAG;
        Log.v(str3, "Init(" + str + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("couldn't parse init params: ");
        sb.append(str);
        UnityParams parse = UnityParams.parse(str, sb.toString());
        if (parse.hasString("appId").booleanValue()) {
            str2 = parse.getString("appId");
        } else {
            str2 = Utility.getMetadataApplicationId(getUnityActivity());
        }
        FacebookSdk.setApplicationId(str2);
        FacebookSdk.sdkInitialize((Context) getUnityActivity(), (FacebookSdk.InitializeCallback) new FacebookSdk.InitializeCallback() {
            public void onInitialized() {
                UnityMessage unityMessage = new UnityMessage("OnInitComplete");
                AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
                if (currentAccessToken != null) {
                    FBLogin.addLoginParametersToMessage(unityMessage, currentAccessToken, (String) null);
                } else {
                    unityMessage.put("key_hash", C2305FB.getKeyHash());
                }
                if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                    C2305FB.ActivateApp(str2);
                }
                unityMessage.send();
            }
        });
    }

    public static void LoginWithReadPermissions(String str) {
        String str2 = TAG;
        Log.v(str2, "LoginWithReadPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.READ);
        getUnityActivity().startActivity(intent2);
    }

    public static void LoginWithPublishPermissions(String str) {
        String str2 = TAG;
        Log.v(str2, "LoginWithPublishPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.PUBLISH);
        getUnityActivity().startActivity(intent2);
    }

    public static void Logout(String str) {
        String str2 = TAG;
        Log.v(str2, "Logout(" + str + ")");
        LoginManager.getInstance().logOut();
        UnityMessage unityMessage = new UnityMessage("OnLogoutComplete");
        unityMessage.put("did_complete", true);
        unityMessage.send();
    }

    public static void RetrieveLoginStatus(String str) {
        String str2 = TAG;
        Log.v(str2, "RetrieveLoginStatus(" + str + ")");
        if (!FacebookSdk.isInitialized()) {
            Log.w(TAG, "Facebook SDK not initialized. Call init() before calling login()");
            return;
        }
        final UnityMessage unityMessage = new UnityMessage("OnLoginStatusRetrieved");
        unityMessage.put("key_hash", getKeyHash());
        UnityParams parse = UnityParams.parse(str, "couldn't parse login params: " + str);
        final String str3 = null;
        if (parse.has(Constants.CALLBACK_ID_KEY)) {
            str3 = parse.getString(Constants.CALLBACK_ID_KEY);
            unityMessage.put(Constants.CALLBACK_ID_KEY, str3);
        }
        LoginManager.getInstance().retrieveLoginStatus(getUnityActivity(), new LoginStatusCallback() {
            public void onCompleted(AccessToken accessToken) {
                FBLogin.addLoginParametersToMessage(unityMessage, accessToken, str3);
                unityMessage.send();
            }

            public void onFailure() {
                unityMessage.put("failed", true);
                unityMessage.send();
            }

            public void onError(Exception exc) {
                unityMessage.sendError(exc.getMessage());
            }
        });
    }

    public static void loginForTVWithReadPermissions(String str) {
        String str2 = TAG;
        Log.v(str2, "loginForTVWithReadPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.TV_READ);
        getUnityActivity().startActivity(intent2);
    }

    public static void LoginForTVWithPublishPermissions(String str) {
        String str2 = TAG;
        Log.v(str2, "LoginForTVWithPublishPermissions(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), FBUnityLoginActivity.class);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_PARAMS, str);
        intent2.putExtra(FBUnityLoginActivity.LOGIN_TYPE, FBUnityLoginActivity.LoginType.TV_PUBLISH);
        getUnityActivity().startActivity(intent2);
    }

    public static void AppRequest(String str) {
        String str2 = TAG;
        Log.v(str2, "AppRequest(" + str + ")");
        Intent intent2 = new Intent(getUnityActivity(), FBUnityGameRequestActivity.class);
        intent2.putExtra(FBUnityGameRequestActivity.GAME_REQUEST_PARAMS, UnityParams.parse(str).getStringParams());
        getUnityActivity().startActivity(intent2);
    }

    public static void GameGroupCreate(String str) {
        String str2 = TAG;
        Log.v(str2, "GameGroupCreate(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), FBUnityCreateGameGroupActivity.class);
        intent2.putExtra(FBUnityCreateGameGroupActivity.CREATE_GAME_GROUP_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void GameGroupJoin(String str) {
        String str2 = TAG;
        Log.v(str2, "GameGroupJoin(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), FBUnityJoinGameGroupActivity.class);
        intent2.putExtra(FBUnityJoinGameGroupActivity.JOIN_GAME_GROUP_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void ShareLink(String str) {
        String str2 = TAG;
        Log.v(str2, "ShareLink(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), FBUnityDialogsActivity.class);
        intent2.putExtra(FBUnityDialogsActivity.DIALOG_TYPE, ShareDialogMode);
        intent2.putExtra(FBUnityDialogsActivity.SHARE_DIALOG_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void FeedShare(String str) {
        String str2 = TAG;
        Log.v(str2, "FeedShare(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), FBUnityDialogsActivity.class);
        intent2.putExtra(FBUnityDialogsActivity.DIALOG_TYPE, ShareDialog.Mode.FEED);
        intent2.putExtra(FBUnityDialogsActivity.FEED_DIALOG_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void SetUserID(String str) {
        String str2 = TAG;
        Log.v(str2, "SetUserID(" + str + ")");
        AppEventsLogger.setUserID(str);
    }

    public static String GetUserID() {
        if (!FacebookSdk.isInitialized()) {
            return null;
        }
        return AppEventsLogger.getUserID();
    }

    public static String GetCurrentProfile() {
        if (!FacebookSdk.isInitialized()) {
            return null;
        }
        Profile currentProfile = Profile.getCurrentProfile();
        try {
            JSONObject jSONObject = new JSONObject();
            if (currentProfile != null) {
                String id = currentProfile.getId();
                String firstName = currentProfile.getFirstName();
                String middleName = currentProfile.getMiddleName();
                String lastName = currentProfile.getLastName();
                String name = currentProfile.getName();
                Uri linkUri = currentProfile.getLinkUri();
                if (id != null) {
                    jSONObject.put(SDKConstants.PARAM_USER_ID, id);
                }
                if (firstName != null) {
                    jSONObject.put("firstName", firstName);
                }
                if (middleName != null) {
                    jSONObject.put("middleName", middleName);
                }
                if (lastName != null) {
                    jSONObject.put("lastName", lastName);
                }
                if (name != null) {
                    jSONObject.put("name", name);
                }
                if (linkUri != null) {
                    jSONObject.put("linkURL", linkUri.toString());
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void UpdateUserProperties(String str) {
        String str2 = TAG;
        Log.v(str2, "UpdateUserProperties(" + str + ")");
        AppEventsLogger.updateUserProperties(UnityParams.parse(str).getStringParams(), (GraphRequest.Callback) null);
    }

    public static void SetDataProcessingOptions(String str) {
        String str2 = TAG;
        Log.v(str2, "SetDataProcessingOptions(" + str + ")");
        try {
            JSONObject jSONObject = UnityParams.parse(str).json;
            JSONArray jSONArray = jSONObject.getJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            int optInt = jSONObject.optInt("country", 0);
            int optInt2 = jSONObject.optInt("state", 0);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.getString(i);
            }
            FacebookSdk.setDataProcessingOptions(strArr, optInt, optInt2);
        } catch (Exception unused) {
        }
    }

    public static void SetIntent(Intent intent2) {
        intent = intent2;
    }

    public static void SetLimitEventUsage(String str) {
        String str2 = TAG;
        Log.v(str2, "SetLimitEventUsage(" + str + ")");
        FacebookSdk.setLimitEventAndDataUsage(getUnityActivity().getApplicationContext(), Boolean.valueOf(str).booleanValue());
    }

    public static void LogAppEvent(String str) {
        String str2 = TAG;
        Log.v(str2, "LogAppEvent(" + str + ")");
        UnityParams parse = UnityParams.parse(str);
        Bundle bundle = new Bundle();
        if (parse.has("parameters")) {
            bundle = parse.getParamsObject("parameters").getStringParams();
        }
        if (parse.has("logPurchase")) {
            getAppEventsLogger().logPurchase(new BigDecimal(parse.getDouble("logPurchase")), Currency.getInstance(parse.getString("currency")), bundle);
        } else if (!parse.hasString("logEvent").booleanValue()) {
            String str3 = TAG;
            Log.e(str3, "couldn't logPurchase or logEvent params: " + str);
        } else if (parse.has("valueToSum")) {
            getAppEventsLogger().logEvent(parse.getString("logEvent"), parse.getDouble("valueToSum"), bundle);
        } else {
            getAppEventsLogger().logEvent(parse.getString("logEvent"), bundle);
        }
    }

    public static boolean IsImplicitPurchaseLoggingEnabled() {
        return AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled();
    }

    public static void SetShareDialogMode(String str) {
        String str2 = TAG;
        Log.v(str2, "SetShareDialogMode(" + str + ")");
        if (str.equalsIgnoreCase("NATIVE")) {
            ShareDialogMode = ShareDialog.Mode.NATIVE;
        } else if (str.equalsIgnoreCase("WEB")) {
            ShareDialogMode = ShareDialog.Mode.WEB;
        } else if (str.equalsIgnoreCase("FEED")) {
            ShareDialogMode = ShareDialog.Mode.FEED;
        } else {
            ShareDialogMode = ShareDialog.Mode.AUTOMATIC;
        }
    }

    public static void SetAutoLogAppEventsEnabled(String str) {
        String str2 = TAG;
        Log.v(str2, "SetAutoLogAppEventsEnabled(" + str + ")");
        FacebookSdk.setAutoLogAppEventsEnabled(Boolean.valueOf(str).booleanValue());
    }

    public static void SetAdvertiserIDCollectionEnabled(String str) {
        String str2 = TAG;
        Log.v(str2, "SetAdvertiserIDCollectionEnabled(" + str + ")");
        FacebookSdk.setAdvertiserIDCollectionEnabled(Boolean.valueOf(str).booleanValue());
    }

    public static String GetSdkVersion() {
        return FacebookSdk.getSdkVersion();
    }

    public static void SetUserAgentSuffix(String str) {
        String str2 = TAG;
        Log.v(str2, "SetUserAgentSuffix(" + str + ")");
        InternalSettings.setCustomUserAgent(str);
    }

    public static void FetchDeferredAppLinkData(String str) {
        LogMethodCall("FetchDeferredAppLinkData", str);
        UnityParams parse = UnityParams.parse(str);
        final UnityMessage unityMessage = new UnityMessage("OnFetchDeferredAppLinkComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        AppLinkData.fetchDeferredAppLinkData(getUnityActivity(), new AppLinkData.CompletionHandler() {
            public void onDeferredAppLinkDataFetched(AppLinkData appLinkData) {
                C2305FB.addAppLinkToMessage(unityMessage, appLinkData);
                unityMessage.send();
            }
        });
    }

    public static void GetAppLink(String str) {
        String str2 = TAG;
        Log.v(str2, "GetAppLink(" + str + ")");
        UnityMessage createWithCallbackFromParams = UnityMessage.createWithCallbackFromParams("OnGetAppLinkComplete", UnityParams.parse(str));
        Intent intent2 = intent;
        if (intent2 == null) {
            createWithCallbackFromParams.put("did_complete", true);
            createWithCallbackFromParams.send();
        } else if (intent2 == clearedIntent) {
            createWithCallbackFromParams.put("did_complete", true);
            createWithCallbackFromParams.send();
        } else {
            AppLinkData createFromAlApplinkData = AppLinkData.createFromAlApplinkData(intent2);
            if (createFromAlApplinkData != null) {
                addAppLinkToMessage(createWithCallbackFromParams, createFromAlApplinkData);
                createWithCallbackFromParams.put("url", intent.getDataString());
            } else if (intent.getData() != null) {
                createWithCallbackFromParams.put("url", intent.getDataString());
            } else {
                createWithCallbackFromParams.put("did_complete", true);
            }
            createWithCallbackFromParams.send();
        }
    }

    public static void ClearAppLink() {
        Log.v(TAG, "ClearAppLink");
        clearedIntent = intent;
    }

    public static void RefreshCurrentAccessToken(String str) {
        LogMethodCall("RefreshCurrentAccessToken", str);
        UnityParams parse = UnityParams.parse(str);
        final UnityMessage unityMessage = new UnityMessage("OnRefreshCurrentAccessTokenComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        AccessToken.refreshCurrentAccessTokenAsync(new AccessToken.AccessTokenRefreshCallback() {
            public void OnTokenRefreshed(AccessToken accessToken) {
                FBLogin.addLoginParametersToMessage(unityMessage, accessToken, (String) null);
                unityMessage.send();
            }

            public void OnTokenRefreshFailed(FacebookException facebookException) {
                unityMessage.sendError(facebookException.getMessage());
            }
        });
    }

    public static String getKeyHash() {
        try {
            Activity unityActivity = getUnityActivity();
            if (unityActivity == null) {
                return "";
            }
            Signature[] signatureArr = unityActivity.getPackageManager().getPackageInfo(unityActivity.getPackageName(), 64).signatures;
            if (signatureArr.length > 0) {
                Signature signature = signatureArr[0];
                MessageDigest instance = MessageDigest.getInstance("SHA");
                instance.update(signature.toByteArray());
                String encodeToString = Base64.encodeToString(instance.digest(), 0);
                String str = TAG;
                Log.d(str, "KeyHash: " + encodeToString);
                return encodeToString;
            }
            return "";
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
    }

    public static void ActivateApp() {
        AppEventsLogger.activateApp((Context) getUnityActivity());
    }

    public static void OpenFriendFinderDialog(String str) {
        String str2 = TAG;
        Log.v(str2, "OpenFriendFinderDialog(" + str + ")");
        Bundle stringParams = UnityParams.parse(str).getStringParams();
        Intent intent2 = new Intent(getUnityActivity(), FBUnityGamingServicesFriendFinderActivity.class);
        intent2.putExtra(FBUnityGamingServicesFriendFinderActivity.DIALOG_PARAMS, stringParams);
        getUnityActivity().startActivity(intent2);
    }

    public static void UploadImageToMediaLibrary(String str) {
        String str2 = TAG;
        Log.v(str2, "UploadImageToMediaLibrary(" + str + ")");
        UnityParams parse = UnityParams.parse(str);
        String string = parse.getString(ShareConstants.FEED_CAPTION_PARAM);
        Uri parse2 = Uri.parse(parse.getString("imageUri"));
        if (parse2.getScheme() == null) {
            parse2 = parse2.buildUpon().scheme("file").build();
        }
        boolean parseBoolean = Boolean.parseBoolean(parse.getString("shouldLaunchMediaDialog"));
        final UnityMessage unityMessage = new UnityMessage("OnUploadImageToMediaLibraryComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            new GamingImageUploader(getUnityActivity()).uploadToMediaLibrary(string, parse2, parseBoolean, (GraphRequest.Callback) new GraphRequest.Callback() {
                public void onCompleted(GraphResponse graphResponse) {
                    if (graphResponse.getError() != null) {
                        unityMessage.sendError(graphResponse.getError().toString());
                        return;
                    }
                    String optString = graphResponse.getJSONObject().optString("id", (String) null);
                    if (optString == null) {
                        unityMessage.sendError("Response did not contain ImageID");
                        return;
                    }
                    unityMessage.put("id", optString);
                    unityMessage.send();
                }
            });
        } catch (FileNotFoundException e) {
            unityMessage.sendError(e.toString());
        }
    }

    public static void UploadVideoToMediaLibrary(String str) {
        String str2 = TAG;
        Log.v(str2, "UploadVideoToMediaLibrary(" + str + ")");
        UnityParams parse = UnityParams.parse(str);
        String string = parse.getString(ShareConstants.FEED_CAPTION_PARAM);
        Uri parse2 = Uri.parse(parse.getString("videoUri"));
        if (parse2.getScheme() == null) {
            parse2 = parse2.buildUpon().scheme("file").build();
        }
        final UnityMessage unityMessage = new UnityMessage("OnUploadVideoToMediaLibraryComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            new GamingVideoUploader(getUnityActivity()).uploadToMediaLibrary(string, parse2, new GraphRequest.OnProgressCallback() {
                public void onProgress(long j, long j2) {
                }

                public void onCompleted(GraphResponse graphResponse) {
                    if (graphResponse.getError() != null) {
                        unityMessage.sendError(graphResponse.getError().toString());
                        return;
                    }
                    String optString = graphResponse.getJSONObject().optString(TapjoyConstants.TJC_VIDEO_ID, (String) null);
                    if (optString == null) {
                        unityMessage.sendError("Response did not contain ImageID");
                        return;
                    }
                    unityMessage.put(TapjoyConstants.TJC_VIDEO_ID, optString);
                    unityMessage.send();
                }
            });
        } catch (FileNotFoundException e) {
            unityMessage.sendError(e.toString());
        }
    }

    public static void OnIAPReady(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnOnIAPReadyComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.onReady(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    public static void GetCatalog(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetCatalogComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.getCatalog(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    public static void GetPurchases(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetPurchasesComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        InAppPurchaseLibrary.getPurchases(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    public static void Purchase(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPurchaseComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        String string = parse.getString("productID");
        String string2 = parse.getString("developerPayload");
        try {
            JSONObject put = new JSONObject().put("productID", string);
            if (!string2.isEmpty()) {
                put.put("developerPayload", string2);
            }
            InAppPurchaseLibrary.purchase(getUnityActivity().getApplicationContext(), put, createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void ConsumePurchase(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnConsumePurchaseComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppPurchaseLibrary.consumePurchase(getUnityActivity().getApplicationContext(), new JSONObject().put("purchaseToken", parse.getString("purchaseToken")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void InitCloudGame(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnInitCloudGameComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            AccessToken init = CloudGameLoginHandler.init(getUnityActivity().getApplicationContext(), 25);
            UnityMessage unityMessage2 = new UnityMessage("OnLoginComplete");
            if (init == null) {
                unityMessage.sendError("Failed to receive access token.");
                return;
            }
            FBLogin.addLoginParametersToMessage(unityMessage2, init, (String) null);
            unityMessage2.send();
            unityMessage.put("success", "");
            unityMessage.send();
        } catch (FacebookException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void ScheduleAppToUserNotification(String str) {
        UnityParams parse = UnityParams.parse(str);
        final UnityMessage unityMessage = new UnityMessage("OnScheduleAppToUserNotificationComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        String string = parse.getString("title");
        String string2 = parse.getString("body");
        Uri parse2 = Uri.parse(parse.getString("media"));
        if (parse2.getScheme() == null) {
            parse2 = parse2.buildUpon().scheme("file").build();
        }
        Uri uri = parse2;
        try {
            int parseInt = Integer.parseInt(parse.getString("timeInterval"));
            String string3 = parse.getString("payload");
            if (string3.equals("null")) {
                string3 = null;
            }
            try {
                AppToUserNotificationSender.scheduleAppToUserNotification(string, string2, uri, parseInt, string3, (GraphRequest.Callback) new GraphRequest.Callback() {
                    public void onCompleted(GraphResponse graphResponse) {
                        if (graphResponse.getError() != null) {
                            unityMessage.sendError(graphResponse.getError().toString());
                            return;
                        }
                        unityMessage.put("success", "");
                        unityMessage.send();
                    }
                });
            } catch (FileNotFoundException e) {
                unityMessage.sendError(String.format(e.getMessage(), new Object[0]));
            }
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid timeInterval: %s", new Object[]{e2.getMessage()}));
        }
    }

    public static void LoadInterstitialAd(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnLoadInterstitialAdComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppAdLibrary.loadInterstitialAd(getUnityActivity().getApplicationContext(), new JSONObject().put("placementID", parse.getString("placementID")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void ShowInterstitialAd(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnShowInterstitialAdComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppAdLibrary.showInterstitialAd(getUnityActivity().getApplicationContext(), new JSONObject().put("placementID", parse.getString("placementID")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void LoadRewardedVideo(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnLoadRewardedVideoComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppAdLibrary.loadRewardedVideo(getUnityActivity().getApplicationContext(), new JSONObject().put("placementID", parse.getString("placementID")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void ShowRewardedVideo(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnShowRewardedVideoComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            InAppAdLibrary.showRewardedVideo(getUnityActivity().getApplicationContext(), new JSONObject().put("placementID", parse.getString("placementID")), createDaemonCallback(unityMessage));
        } catch (JSONException e) {
            unityMessage.sendError(e.getMessage());
        }
    }

    public static void GetPayload(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetPayloadComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        GameFeaturesLibrary.getPayload(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    public static void PostSessionScore(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPostSessionScoreComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            try {
                GameFeaturesLibrary.postSessionScoreAsync(getUnityActivity().getApplicationContext(), Integer.parseInt(parse.getString("score")), createDaemonCallback(unityMessage));
            } catch (JSONException e) {
                unityMessage.sendError(e.getMessage());
            }
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid score: %s", new Object[]{e2.getMessage()}));
        }
    }

    public static void PostTournamentScore(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnPostTournamentScoreComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            try {
                GameFeaturesLibrary.postTournamentScoreAsync(getUnityActivity().getApplicationContext(), Integer.parseInt(parse.getString("score")), createDaemonCallback(unityMessage));
            } catch (JSONException e) {
                unityMessage.sendError(e.getMessage());
            }
        } catch (NumberFormatException e2) {
            unityMessage.sendError(String.format("Invalid score: %s", new Object[]{e2.getMessage()}));
        }
    }

    public static void GetTournament(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnGetTournamentComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        GameFeaturesLibrary.getTournamentAsync(getUnityActivity().getApplicationContext(), createDaemonCallback(unityMessage));
    }

    public static void ShareTournament(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnShareTournamentComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            int parseInt = Integer.parseInt(parse.getString("score"));
            JSONObject jSONObject = new JSONObject();
            Bundle stringParams = parse.getParamsObject("data").getStringParams();
            for (String str2 : stringParams.keySet()) {
                try {
                    jSONObject.put(str2, stringParams.get(str2));
                } catch (JSONException e) {
                    unityMessage.sendError(String.format("Invalid data payload: %s", new Object[]{e.getMessage()}));
                }
            }
            try {
                GameFeaturesLibrary.shareTournamentAsync(getUnityActivity().getApplicationContext(), Integer.valueOf(parseInt), jSONObject, createDaemonCallback(unityMessage));
            } catch (JSONException e2) {
                unityMessage.sendError(e2.getMessage());
            }
        } catch (NumberFormatException e3) {
            unityMessage.sendError(String.format("Invalid score: %s", new Object[]{e3.getMessage()}));
        }
    }

    public static void CreateTournament(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnCreateTournamentComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        try {
            int parseInt = Integer.parseInt(parse.getString(SDKConstants.PARAM_INITIAL_SCORE));
            String string = parse.getString("title");
            String string2 = parse.getString("imageBase64DataUrl");
            String string3 = parse.getString(SDKConstants.PARAM_SORT_ORDER);
            String string4 = parse.getString(SDKConstants.PARAM_SCORE_FORMAT);
            Bundle stringParams = parse.getParamsObject("data").getStringParams();
            JSONObject jSONObject = new JSONObject();
            for (String str2 : stringParams.keySet()) {
                try {
                    jSONObject.put(str2, stringParams.get(str2));
                } catch (JSONException e) {
                    unityMessage.sendError(String.format("Invalid data payload: %s", new Object[]{e.getMessage()}));
                }
            }
            try {
                GameFeaturesLibrary.createTournamentAsync(getUnityActivity().getApplicationContext(), parseInt, string, string2, string3, string4, (Integer) null, jSONObject, createDaemonCallback(unityMessage));
            } catch (JSONException e2) {
                unityMessage.sendError(e2.getMessage());
            }
        } catch (NumberFormatException e3) {
            unityMessage.sendError(String.format("Invalid initialScore: %s", new Object[]{e3.getMessage()}));
        }
    }

    public static void OpenAppStore(String str) {
        UnityParams parse = UnityParams.parse(str);
        UnityMessage unityMessage = new UnityMessage("OnOpenAppStoreComplete");
        if (parse.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, parse.getString(Constants.CALLBACK_ID_KEY));
        }
        PlayableAdsLibrary.openAppStore(getUnityActivity().getApplicationContext(), new JSONObject(), createDaemonCallback(unityMessage));
    }

    private static DaemonRequest.Callback createDaemonCallback(final UnityMessage unityMessage) {
        return new DaemonRequest.Callback() {
            public void onCompleted(GraphResponse graphResponse) {
                FacebookRequestError error = graphResponse.getError();
                if (error != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, error.getErrorCode());
                        jSONObject.put("subErrorCode", error.getSubErrorCode());
                        jSONObject.put("errorType", error.getErrorType());
                        jSONObject.put("errorMessage", error.getErrorMessage());
                        unityMessage.sendError(jSONObject.toString());
                    } catch (JSONException unused) {
                        unityMessage.sendError(error.toString());
                    }
                } else if (graphResponse.getJSONObject() != null) {
                    unityMessage.put("success", graphResponse.getJSONObject().toString());
                    unityMessage.send();
                } else if (graphResponse.getJSONArray() != null) {
                    unityMessage.put("success", graphResponse.getJSONArray().toString());
                    unityMessage.send();
                } else {
                    unityMessage.sendError("invalid response");
                }
            }
        };
    }

    /* access modifiers changed from: private */
    public static void ActivateApp(String str) {
        if (!activateAppCalled.compareAndSet(false, true)) {
            Log.w(TAG, "Activite app only needs to be called once");
            return;
        }
        final Activity unityActivity = getUnityActivity();
        if (str != null) {
            AppEventsLogger.activateApp(unityActivity.getApplication(), str);
        } else {
            AppEventsLogger.activateApp(unityActivity.getApplication());
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                ActivityLifecycleTracker.onActivityCreated(unityActivity);
                ActivityLifecycleTracker.onActivityResumed(unityActivity);
            }
        });
    }

    private static void startActivity(Class<?> cls, String str) {
        Intent intent2 = new Intent(getUnityActivity(), cls);
        intent2.putExtra(BaseActivity.ACTIVITY_PARAMS, UnityParams.parse(str).getStringParams());
        getUnityActivity().startActivity(intent2);
    }

    private static void LogMethodCall(String str, String str2) {
        Log.v(TAG, String.format(Locale.ROOT, "%s(%s)", new Object[]{str, str2}));
    }

    /* access modifiers changed from: private */
    public static void addAppLinkToMessage(UnityMessage unityMessage, AppLinkData appLinkData) {
        if (appLinkData == null) {
            unityMessage.put("did_complete", true);
            return;
        }
        unityMessage.put("ref", appLinkData.getRef());
        unityMessage.put("target_url", appLinkData.getTargetUri().toString());
        try {
            if (appLinkData.getArgumentBundle() != null) {
                unityMessage.put("extras", BundleJSONConverter.convertToJSON(appLinkData.getArgumentBundle()).toString());
            }
        } catch (JSONException e) {
            Log.e(TAG, e.getLocalizedMessage());
        }
    }
}
