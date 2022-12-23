package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.yandex.metrica.impl.ob.oh */
public class C11605oh extends C11658ph<C10636Pd> {

    /* renamed from: b */
    private final C11502lh f27862b;

    /* renamed from: c */
    private long f27863c;

    public C11605oh() {
        this(new C11502lh());
    }

    /* renamed from: a */
    public void mo63438a(Uri.Builder builder, C10636Pd pd) {
        mo63513a(builder);
        builder.appendPath(FirebaseAnalytics.Param.LOCATION);
        builder.appendQueryParameter("deviceid", pd.mo62778g());
        builder.appendQueryParameter(TapjoyConstants.TJC_DEVICE_TYPE_NAME, pd.mo62781j());
        builder.appendQueryParameter("uuid", pd.mo62795x());
        builder.appendQueryParameter("analytics_sdk_version_name", "5.0.0");
        builder.appendQueryParameter("analytics_sdk_build_number", "45001354");
        builder.appendQueryParameter("analytics_sdk_build_type", pd.mo62782k());
        String k = pd.mo62782k();
        if (k != null && k.contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter(ServerParameters.APP_VERSION_NAME, pd.mo62777f());
        builder.appendQueryParameter("app_build_number", pd.mo62769b());
        builder.appendQueryParameter(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, pd.mo62787p());
        builder.appendQueryParameter("os_api_level", String.valueOf(pd.mo62786o()));
        builder.appendQueryParameter("is_rooted", pd.mo62780i());
        builder.appendQueryParameter("app_framework", pd.mo62771c());
        builder.appendQueryParameter("app_id", pd.mo62788q());
        builder.appendQueryParameter("app_platform", "android");
        builder.appendQueryParameter(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, String.valueOf(this.f27863c));
        builder.appendQueryParameter("app_set_id", pd.mo62773d());
        builder.appendQueryParameter("app_set_id_scope", pd.mo62775e());
        this.f27862b.mo63307a(builder, pd.mo62762a());
    }

    C11605oh(C11502lh lhVar) {
        this.f27862b = lhVar;
    }

    /* renamed from: a */
    public void mo63437a(long j) {
        this.f27863c = j;
    }
}
