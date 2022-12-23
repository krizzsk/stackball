package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.internal.NativeProtocol;
import com.facebook.login.LoginClient;

class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new Parcelable.Creator() {
        public InstagramAppLoginMethodHandler createFromParcel(Parcel parcel) {
            return new InstagramAppLoginMethodHandler(parcel);
        }

        public InstagramAppLoginMethodHandler[] newArray(int i) {
            return new InstagramAppLoginMethodHandler[i];
        }
    };

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public String getNameForLogging() {
        return "instagram_login";
    }

    InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public AccessTokenSource getTokenSource() {
        return AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    /* access modifiers changed from: package-private */
    public int tryAuthorize(LoginClient.Request request) {
        String e2e = LoginClient.getE2E();
        Intent createInstagramIntent = NativeProtocol.createInstagramIntent(this.loginClient.getActivity(), request.getApplicationId(), request.getPermissions(), e2e, request.isRerequest(), request.hasPublishPermission(), request.getDefaultAudience(), getClientState(request.getAuthId()), request.getAuthType(), request.isFamilyLogin(), request.shouldSkipAccountDeduplication());
        addLoggingExtra("e2e", e2e);
        return tryIntent(createInstagramIntent, LoginClient.getLoginRequestCode()) ? 1 : 0;
    }

    InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
