package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;

final class GetTokenClient extends PlatformServiceClient {
    /* access modifiers changed from: protected */
    public void populateRequestBundle(Bundle bundle) {
    }

    GetTokenClient(Context context, LoginClient.Request request) {
        super(context, 65536, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY, NativeProtocol.PROTOCOL_VERSION_20121101, request.getApplicationId());
    }
}
