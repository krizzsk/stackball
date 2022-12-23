package com.smaato.sdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.appsflyer.ServerParameters;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.facebook.appevents.AppEventsConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.sdk.InMobiSdk;
import com.smaato.sdk.SmaatoBridge;
import com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.datacollector.SystemInfo;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.hooks.Hook1061;
import com.smaato.sdk.core.network.NetworkConnectionType;
import com.smaato.sdk.core.p248ad.GeoInfo;
import com.smaato.sdk.core.p248ad.RequestInfoProvider;
import com.smaato.sdk.core.p248ad.UserInfo;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.inject.Providers;
import com.smaato.sdk.log.Logger;
import com.smaato.sdk.net.Headers;
import com.smaato.sdk.net.Interceptor;
import com.smaato.sdk.net.Request;
import com.smaato.sdk.net.Response;
import com.smaato.sdk.p246ad.SomaException;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.Cookie;
import java.io.IOException;

class SmaatoBridgeImpl implements SmaatoBridge {
    private final Config config;
    private final Provider<SdkConfiguration> configuration;
    private final Provider<DataCollector> dataCollector;
    private final Provider<RequestInfoProvider> requestInfoProvider;
    private final Provider<SomaGdprData> somaGdprData;

    SmaatoBridgeImpl(Provider<DiConstructor> provider, Config config2) {
        this.config = config2;
        this.somaGdprData = Providers.nullSafe(new Provider() {
            public final Object get() {
                return ((SomaGdprDataSource) ((DiConstructor) Provider.this.get()).get(SomaGdprDataSource.class)).getSomaGdprData();
            }
        });
        this.configuration = Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoBridgeImpl.lambda$new$1(Provider.this);
            }
        });
        this.requestInfoProvider = Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoBridgeImpl.lambda$new$2(Provider.this);
            }
        });
        this.dataCollector = Providers.nullSafe(new Provider() {
            public final Object get() {
                return SmaatoBridgeImpl.lambda$new$3(Provider.this);
            }
        });
    }

    static /* synthetic */ SdkConfiguration lambda$new$1(Provider provider) {
        return (SdkConfiguration) ((DiConstructor) provider.get()).get(SdkConfiguration.class);
    }

    static /* synthetic */ RequestInfoProvider lambda$new$2(Provider provider) {
        return (RequestInfoProvider) ((DiConstructor) provider.get()).get(RequestInfoProvider.class);
    }

    static /* synthetic */ DataCollector lambda$new$3(Provider provider) {
        return (DataCollector) ((DiConstructor) provider.get()).get(DataCollector.class);
    }

    public String publisherId() {
        return SmaatoSdk.getPublisherId();
    }

    public Interceptor apiCallInterceptor() {
        return new Interceptor() {
            public final Response intercept(Interceptor.Chain chain) {
                return SmaatoBridgeImpl.this.lambda$apiCallInterceptor$4$SmaatoBridgeImpl(chain);
            }
        };
    }

    public /* synthetic */ Response lambda$apiCallInterceptor$4$SmaatoBridgeImpl(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Uri.Builder buildUpon = request.uri().buildUpon();
        Headers.Builder buildUpon2 = request.headers().buildUpon();
        try {
            Uri uri = request.uri();
            String publisherId = SmaatoSdk.getPublisherId();
            String queryParameter = uri.getQueryParameter("adspace");
            if (publisherId == null || queryParameter == null) {
                buildUpon.appendQueryParameter("pub", publisherId);
            } else {
                buildUpon.appendQueryParameter("pub", Hook1061.onGetPublisherId(publisherId, queryParameter));
            }
            boolean isHttpsOnly = this.config.isHttpsOnly();
            if (!isHttpsOnly && Build.VERSION.SDK_INT >= 23) {
                isHttpsOnly = !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                Logger.m24081w("\"`httpsOnly` value overridden to TRUE, due to Network Security Configuration settings.\"", new Object[0]);
            }
            String str = "1";
            buildUpon.appendQueryParameter("secure", isHttpsOnly ? str : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            SomaGdprData somaGdprData2 = this.somaGdprData.get();
            if (somaGdprData2.isUsageAllowedFor(PiiParam.LOAD_ADS)) {
                Boolean isGdprEnabled = somaGdprData2.isGdprEnabled();
                if (isGdprEnabled != null) {
                    buildUpon.appendQueryParameter("gdpr", isGdprEnabled.booleanValue() ? str : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                if (!somaGdprData2.getConsentString().isEmpty()) {
                    buildUpon.appendQueryParameter(InMobiSdk.IM_GDPR_CONSENT_IAB, somaGdprData2.getConsentString());
                }
                SdkConfiguration sdkConfiguration = this.configuration.get();
                if (!sdkConfiguration.getUsPrivacyString().isEmpty()) {
                    buildUpon.appendQueryParameter(CCPA.CCPA_STANDARD, sdkConfiguration.getUsPrivacyString());
                }
                UserInfo userInfo = this.configuration.get().getUserInfo();
                if (!userInfo.getCoppa()) {
                    str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                buildUpon.appendQueryParameter(Cookie.COPPA_KEY, str);
                if (userInfo.getKeywords() != null) {
                    buildUpon.appendQueryParameter("kws", userInfo.getKeywords());
                }
                if (userInfo.getSearchQuery() != null) {
                    buildUpon.appendQueryParameter("qs", userInfo.getSearchQuery());
                }
                SomaGdprData somaGdprData3 = this.somaGdprData.get();
                if (somaGdprData3.isUsageAllowedFor(PiiParam.GENDER) && userInfo.getGender() != null) {
                    buildUpon.appendQueryParameter(InneractiveMediationDefs.KEY_GENDER, userInfo.getGender().toString());
                }
                if (somaGdprData3.isUsageAllowedFor(PiiParam.AGE) && userInfo.getAge() != null) {
                    buildUpon.appendQueryParameter("age", userInfo.getAge().toString());
                }
                if (userInfo.getRegion() != null) {
                    buildUpon.appendQueryParameter("region", userInfo.getRegion());
                }
                if (somaGdprData3.isUsageAllowedFor(PiiParam.ZIP) && userInfo.getZip() != null) {
                    buildUpon.appendQueryParameter("zip", userInfo.getZip());
                }
                RequestInfoProvider requestInfoProvider2 = this.requestInfoProvider.get();
                buildUpon.appendQueryParameter(ServerParameters.LANG, requestInfoProvider2.getLanguage(userInfo));
                GeoInfo geoInfo = requestInfoProvider2.getGeoInfo(userInfo);
                if (geoInfo != null) {
                    buildUpon.appendQueryParameter("gps", geoInfo.getFormattedLatitude() + "," + geoInfo.getFormattedLongitude());
                    buildUpon.appendQueryParameter("geotype", geoInfo.getGeoType().toString());
                }
                AdContentRating adContentRating = requestInfoProvider2.getAdContentRating();
                if (AdContentRating.MAX_AD_CONTENT_RATING_UNDEFINED != adContentRating) {
                    buildUpon.appendQueryParameter("madcr", adContentRating.toString());
                }
                SystemInfo systemInfo = this.dataCollector.get().getSystemInfo();
                if (systemInfo.getCarrierName() != null) {
                    buildUpon.appendQueryParameter(ServerParameters.CARRIER, systemInfo.getCarrierName());
                }
                if (systemInfo.getCarrierCode() != null) {
                    buildUpon.appendQueryParameter("carriercode", systemInfo.getCarrierCode());
                }
                Boolean isGoogleLimitAdTrackingEnabled = systemInfo.isGoogleLimitAdTrackingEnabled();
                if (isGoogleLimitAdTrackingEnabled != null) {
                    buildUpon.appendQueryParameter("googlednt", isGoogleLimitAdTrackingEnabled.toString());
                }
                NetworkConnectionType networkConnectionType = systemInfo.getNetworkConnectionType();
                if (networkConnectionType != null) {
                    buildUpon.appendQueryParameter("connection", networkConnectionType.toString());
                }
                buildUpon.appendQueryParameter(TJAdUnitConstants.String.BUNDLE, systemInfo.getPackageName());
                buildUpon.appendQueryParameter("client", "sdkandroid_" + SmaatoSdk.getVersion());
                buildUpon2.put("X-SMT-Client", "sdk/android/" + SmaatoSdk.getVersion());
                SomaGdprData somaGdprData4 = this.somaGdprData.get();
                if (somaGdprData4.isUsageAllowedFor(PiiParam.DEVICE_MODEL) && systemInfo.getDeviceModelName() != null) {
                    buildUpon.appendQueryParameter("devicemodel", systemInfo.getDeviceModelName());
                }
                if (somaGdprData4.isUsageAllowedFor(PiiParam.GOOGLE_AD_ID) && systemInfo.getGoogleAdvertisingId() != null) {
                    buildUpon.appendQueryParameter("googleadid", systemInfo.getGoogleAdvertisingId());
                }
                return chain.proceed(request.buildUpon().uri(buildUpon.build()).headers(buildUpon2.build()).build());
            }
            throw new SomaException(SomaException.Type.NO_CONTENT, "GDPR permissions do not allow ad loading!");
        } catch (Exception e) {
            Logger.m24076e(e.getMessage(), e, new Object[0]);
        }
    }

    public Intent createBrowserIntent(Context context, String str) {
        return SmaatoSdkBrowserActivity.createIntent(context, str);
    }

    public Provider<Activity> activityProvider() {
        return $$Lambda$SmaatoBridgeImpl$Sbvc7pqaDD8XDu1OjpL3cBYOLM.INSTANCE;
    }
}
