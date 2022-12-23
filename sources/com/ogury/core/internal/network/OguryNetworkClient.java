package com.ogury.core.internal.network;

import com.facebook.share.internal.ShareConstants;
import com.ogury.core.internal.C7921ai;

/* compiled from: OguryNetworkClient.kt */
public final class OguryNetworkClient {

    /* renamed from: a */
    private final int f20774a;

    /* renamed from: b */
    private final int f20775b;

    public OguryNetworkClient(int i, int i2) {
        this.f20774a = i;
        this.f20775b = i2;
    }

    public final Call newCall(NetworkRequest networkRequest) {
        C7921ai.m22144b(networkRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        return new C7989b(networkRequest, this.f20774a, this.f20775b);
    }

    public final OguryNetworkResponse post(String str, String str2, HeadersLoader headersLoader) {
        C7921ai.m22144b(str, "url");
        C7921ai.m22144b(str2, "body");
        C7921ai.m22144b(headersLoader, "headers");
        return newCall(new NetworkRequest(str, "POST", str2, headersLoader)).execute();
    }

    public final OguryNetworkResponse get(String str, HeadersLoader headersLoader) {
        C7921ai.m22144b(str, "url");
        C7921ai.m22144b(headersLoader, "headers");
        return newCall(new NetworkRequest(str, "GET", "", headersLoader)).execute();
    }

    public final OguryNetworkResponse put(String str, String str2, HeadersLoader headersLoader) {
        C7921ai.m22144b(str, "url");
        C7921ai.m22144b(str2, "body");
        C7921ai.m22144b(headersLoader, "headers");
        return newCall(new NetworkRequest(str, "PUT", str2, headersLoader)).execute();
    }
}
