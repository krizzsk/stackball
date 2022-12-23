package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.content.Context;
import android.webkit.WebView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.util.DeviceUtils;
import java.util.ArrayList;
import java.util.List;

public final class MraidSupportsProperties {
    private final AppMetaData appMetaData;
    private final SdkConfiguration sdkConfiguration;
    private final SomaGdprDataSource somaGdprDataSource;

    public MraidSupportsProperties(AppMetaData appMetaData2, SdkConfiguration sdkConfiguration2, SomaGdprDataSource somaGdprDataSource2) {
        this.appMetaData = (AppMetaData) Objects.requireNonNull(appMetaData2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.somaGdprDataSource = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource2);
    }

    public final List<String> getSupportedFeatures(Context context, WebView webView) {
        ArrayList arrayList = new ArrayList();
        if (DeviceUtils.isSmsAvailable(context)) {
            arrayList.add(AdWebViewClient.SMS);
        }
        if (DeviceUtils.isTelAvailable(context)) {
            arrayList.add(AdWebViewClient.TELEPHONE);
        }
        if (DeviceUtils.isInlineVideoSupported(context, webView)) {
            arrayList.add("inlineVideo");
        }
        if (DeviceUtils.isLocationAvailable(this.appMetaData) && this.sdkConfiguration.isGpsEnabled() && !this.sdkConfiguration.isCoppaEnabled() && this.somaGdprDataSource.getSomaGdprData().isUsageAllowedFor(PiiParam.GPS)) {
            arrayList.add(FirebaseAnalytics.Param.LOCATION);
        }
        return arrayList;
    }

    public final String[] getAllMraidFeatures() {
        return new String[]{AdWebViewClient.SMS, AdWebViewClient.TELEPHONE, "calendar", "storePicture", "inlineVideo", FirebaseAnalytics.Param.LOCATION, "vpaid"};
    }
}
