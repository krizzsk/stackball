package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class Common {
    public static final Api<Api.ApiOptions.NoOptions> API;
    public static final Api.ClientKey<zah> CLIENT_KEY = new Api.ClientKey<>();
    public static final zae zaa = new zae();
    private static final Api.AbstractClientBuilder<zah, Api.ApiOptions.NoOptions> zab;

    static {
        zab zab2 = new zab();
        zab = zab2;
        API = new Api<>("Common.API", zab2, CLIENT_KEY);
    }
}
