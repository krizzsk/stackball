package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.login.LoginClient;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    /* access modifiers changed from: package-private */
    public abstract int tryAuthorize(LoginClient.Request request);

    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public AccessTokenSource getTokenSource() {
        return AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    }

    /* access modifiers changed from: package-private */
    public boolean onActivityResult(int i, int i2, Intent intent) {
        LoginClient.Request pendingRequest = this.loginClient.getPendingRequest();
        if (intent == null) {
            completeLogin(LoginClient.Result.createCancelResult(pendingRequest, "Operation canceled"));
        } else if (i2 == 0) {
            handleResultCancel(pendingRequest, intent);
        } else {
            String str = null;
            if (i2 != -1) {
                completeLogin(LoginClient.Result.createErrorResult(pendingRequest, "Unexpected resultCode from authorization.", (String) null));
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    completeLogin(LoginClient.Result.createErrorResult(pendingRequest, "Unexpected null from returned authorization data.", (String) null));
                    return true;
                }
                String error = getError(extras);
                if (extras.get("error_code") != null) {
                    str = extras.get("error_code").toString();
                }
                String errorMessage = getErrorMessage(extras);
                String string = extras.getString("e2e");
                if (!Utility.isNullOrEmpty(string)) {
                    logWebLoginCompleted(string);
                }
                if (error == null && str == null && errorMessage == null) {
                    handleResultOk(pendingRequest, extras);
                } else {
                    handleResultError(pendingRequest, error, errorMessage, str);
                }
            }
        }
        return true;
    }

    private void completeLogin(LoginClient.Result result) {
        if (result != null) {
            this.loginClient.completeAndValidate(result);
        } else {
            this.loginClient.tryNextHandler();
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultError(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            completeLogin((LoginClient.Result) null);
        } else if (ServerProtocol.getErrorsProxyAuthDisabled().contains(str)) {
            completeLogin((LoginClient.Result) null);
        } else if (ServerProtocol.getErrorsUserCanceled().contains(str)) {
            completeLogin(LoginClient.Result.createCancelResult(request, (String) null));
        } else {
            completeLogin(LoginClient.Result.createErrorResult(request, str, str2, str3));
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultOk(LoginClient.Request request, Bundle bundle) {
        try {
            completeLogin(LoginClient.Result.createTokenResult(request, createAccessTokenFromWebBundle(request.getPermissions(), bundle, getTokenSource(), request.getApplicationId())));
        } catch (FacebookException e) {
            completeLogin(LoginClient.Result.createErrorResult(request, (String) null, e.getMessage()));
        }
    }

    /* access modifiers changed from: protected */
    public void handleResultCancel(LoginClient.Request request, Intent intent) {
        Bundle extras = intent.getExtras();
        String error = getError(extras);
        String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
        if (ServerProtocol.getErrorConnectionFailure().equals(obj)) {
            completeLogin(LoginClient.Result.createErrorResult(request, error, getErrorMessage(extras), obj));
        }
        completeLogin(LoginClient.Result.createCancelResult(request, error));
    }

    /* access modifiers changed from: protected */
    public String getError(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error");
        return string == null ? bundle.getString("error_type") : string;
    }

    /* access modifiers changed from: protected */
    public String getErrorMessage(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_message");
        return string == null ? bundle.getString(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION) : string;
    }

    /* access modifiers changed from: protected */
    public boolean tryIntent(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.loginClient.getFragment().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
