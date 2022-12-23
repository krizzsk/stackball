package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.AdContentRating;
import com.smaato.sdk.core.LatLng;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.datacollector.LocationProvider;
import com.smaato.sdk.core.datacollector.SystemInfo;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p251fi.Predicate;
import java.util.List;
import java.util.Locale;

/* renamed from: com.smaato.sdk.core.ad.RequestInfoProvider */
public final class RequestInfoProvider {
    private final DataCollector dataCollector;
    private final SdkConfiguration sdkConfiguration;
    private final SomaGdprDataSource somaGdprDataSource;
    private final SystemInfo systemInfo;

    public RequestInfoProvider(DataCollector dataCollector2, SomaGdprDataSource somaGdprDataSource2, SdkConfiguration sdkConfiguration2, SystemInfo systemInfo2) {
        this.dataCollector = (DataCollector) Objects.requireNonNull(dataCollector2);
        this.somaGdprDataSource = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.systemInfo = (SystemInfo) Objects.requireNonNull(systemInfo2);
    }

    public final GeoInfo getGeoInfo(UserInfo userInfo) {
        if (this.somaGdprDataSource.getSomaGdprData().isUsageAllowedFor(PiiParam.GPS) && this.sdkConfiguration.isGpsEnabled() && !this.sdkConfiguration.isCoppaEnabled()) {
            LocationProvider.DetectedLocation locationData = this.dataCollector.getLocationData();
            if (locationData != null) {
                return new GeoInfo(new LatLng(locationData.getLatitude(), locationData.getLongitude(), locationData.getAccuracy(), locationData.getLastUpdatedMillis()), locationData.getType() == LocationProvider.DetectedLocation.TYPE.GPS ? GeoType.GPS : GeoType.IP_ADDRESS);
            }
            LatLng latLng = userInfo.getLatLng();
            if (latLng != null) {
                return new GeoInfo(latLng, GeoType.USER_PROVIDED);
            }
        }
        return null;
    }

    public final AdContentRating getAdContentRating() {
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        AdContentRating adContentRating = this.sdkConfiguration.getAdContentRating();
        if (adContentRating == null || !somaGdprData.isUsageAllowedFor(PiiParam.AGE)) {
            return AdContentRating.MAX_AD_CONTENT_RATING_UNDEFINED;
        }
        return adContentRating;
    }

    public final String getGoogleAdId() {
        if (this.somaGdprDataSource.getSomaGdprData().isUsageAllowedFor(PiiParam.GOOGLE_AD_ID) && !this.sdkConfiguration.isCoppaEnabled()) {
            return this.systemInfo.getGoogleAdvertisingId();
        }
        return null;
    }

    public final String getLanguage(UserInfo userInfo) {
        String language = userInfo.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return this.systemInfo.getLanguage();
        }
        List of = Lists.m24071of((T[]) Locale.getISOLanguages());
        language.getClass();
        if (Lists.any(of, new Predicate(language) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return this.f$0.equals((String) obj);
            }
        })) {
            return language;
        }
        return this.systemInfo.getLanguage();
    }
}
