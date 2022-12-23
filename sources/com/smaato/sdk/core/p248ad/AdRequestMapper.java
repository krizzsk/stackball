package com.smaato.sdk.core.p248ad;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.core.AdContentRating;
import com.smaato.sdk.core.Gender;
import com.smaato.sdk.core.KeyValuePairs;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.analytics.Analytics;
import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.ccpa.CcpaDataStorage;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.datacollector.SystemInfo;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p251fi.Consumer;
import com.smaato.sdk.core.util.p251fi.Function;
import java.util.List;

/* renamed from: com.smaato.sdk.core.ad.AdRequestMapper */
public class AdRequestMapper {
    private static final CharSequence SEPARATOR = ",";
    private final AdLoaderPlugin adLoaderPlugin;
    private final Analytics analytics;
    private final CcpaDataStorage ccpaDataStorage;
    private final DataCollector dataCollector;
    private final boolean isHttpsOnly;
    private final Logger logger;
    private final RequestInfoMapper requestInfoMapper;
    private final RequestInfoProvider requestInfoProvider;
    private final SomaGdprDataSource somaGdprDataSource;

    public AdRequestMapper(Logger logger2, DataCollector dataCollector2, boolean z, AdLoaderPlugin adLoaderPlugin2, SomaGdprDataSource somaGdprDataSource2, RequestInfoMapper requestInfoMapper2, Analytics analytics2, CcpaDataStorage ccpaDataStorage2, RequestInfoProvider requestInfoProvider2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.dataCollector = (DataCollector) Objects.requireNonNull(dataCollector2);
        this.isHttpsOnly = z;
        this.adLoaderPlugin = (AdLoaderPlugin) Objects.requireNonNull(adLoaderPlugin2);
        this.somaGdprDataSource = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource2);
        this.requestInfoMapper = (RequestInfoMapper) Objects.requireNonNull(requestInfoMapper2);
        this.analytics = (Analytics) Objects.requireNonNull(analytics2);
        this.ccpaDataStorage = (CcpaDataStorage) Objects.requireNonNull(ccpaDataStorage2);
        this.requestInfoProvider = (RequestInfoProvider) Objects.requireNonNull(requestInfoProvider2);
    }

    public ApiAdRequest map(AdRequest adRequest) {
        Objects.requireNonNull(adRequest);
        AdSettings adSettings = adRequest.getAdSettings();
        AdFormat resolveAdFormatToServerAdFormat = this.adLoaderPlugin.resolveAdFormatToServerAdFormat(adSettings.getAdFormat(), this.logger);
        if (resolveAdFormatToServerAdFormat != null) {
            UserInfo userInfo = adRequest.getUserInfo();
            ApiAdRequest.Builder builder = ApiAdRequest.builder();
            SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
            this.logger.debug(LogDomain.AD, "map: somaGdprData = %s", somaGdprData);
            builder.setHttpsOnly(Integer.valueOf(this.isHttpsOnly ? 1 : 0));
            builder.setPublisherId(adSettings.getPublisherId()).setAdSpaceId(adSettings.getAdSpaceId()).setAdFormat(ApiUtils.adFormatToApiValue(resolveAdFormatToServerAdFormat)).setAdDimension((String) Objects.transformOrNull(adSettings.getAdDimension(), new Function() {
                public final Object apply(Object obj) {
                    return AdRequestMapper.this.mapToApiValue((AdDimension) obj);
                }
            })).setWidth(adSettings.getWidth()).setHeight(adSettings.getHeight()).setMediationNetworkName(adSettings.getMediationNetworkName()).setMediationNetworkSDKVersion(adSettings.getMediationNetworkSDKVersion()).setMediationAdapterVersion(adSettings.getMediationAdapterVersion());
            Boolean isGdprEnabled = somaGdprData.isGdprEnabled();
            if (isGdprEnabled != null) {
                builder.setGdpr(Integer.valueOf(isGdprEnabled.booleanValue() ? 1 : 0));
            }
            if (!somaGdprData.getConsentString().isEmpty()) {
                builder.setGdprConsent(somaGdprData.getConsentString());
            }
            if (!this.ccpaDataStorage.getUsPrivacyString().isEmpty()) {
                builder.setUsPrivacyString(this.ccpaDataStorage.getUsPrivacyString());
            }
            builder.setCoppa(Integer.valueOf(userInfo.getCoppa() ? 1 : 0));
            builder.setKeywords(userInfo.getKeywords()).setSearchQuery(userInfo.getSearchQuery()).setLanguage(this.requestInfoProvider.getLanguage(userInfo));
            if (somaGdprData.isUsageAllowedFor(PiiParam.GENDER)) {
                builder.setGender((String) Objects.transformOrNull(userInfo.getGender(), new Function() {
                    public final Object apply(Object obj) {
                        return AdRequestMapper.this.mapToApiValue((Gender) obj);
                    }
                }));
            }
            if (somaGdprData.isUsageAllowedFor(PiiParam.AGE)) {
                builder.setAge(userInfo.getAge());
            }
            builder.setRegion(userInfo.getRegion());
            if (somaGdprData.isUsageAllowedFor(PiiParam.ZIP)) {
                builder.setZip(userInfo.getZip());
            }
            GeoInfo geoInfo = this.requestInfoProvider.getGeoInfo(userInfo);
            if (geoInfo != null) {
                builder.setGps(Joiner.join((CharSequence) ",", geoInfo.getFormattedLatitude(), geoInfo.getFormattedLongitude()));
                builder.setGeoType(this.requestInfoMapper.mapToApiValue(geoInfo.getGeoType()));
            }
            AdContentRating adContentRating = this.requestInfoProvider.getAdContentRating();
            if (AdContentRating.MAX_AD_CONTENT_RATING_UNDEFINED != adContentRating) {
                builder.setAdContentRating(this.requestInfoMapper.mapToApiValue(adContentRating));
            }
            SystemInfo systemInfo = this.dataCollector.getSystemInfo();
            builder.setCarrierName(systemInfo.getCarrierName()).setCarrierCode(systemInfo.getCarrierCode()).setGoogleDnt(systemInfo.isGoogleLimitAdTrackingEnabled()).setClient(String.format("sdkandroid_%s", new Object[]{SmaatoSdk.getVersion()})).setConnection((String) Objects.transformOrNull(systemInfo.getNetworkConnectionType(), $$Lambda$mFDUD4wzFHv0wAVQXnUEzaDsQ.INSTANCE)).setBundle(systemInfo.getPackageName());
            if (somaGdprData.isUsageAllowedFor(PiiParam.DEVICE_MODEL)) {
                builder.setDeviceModel(systemInfo.getDeviceModelName());
            }
            String googleAdId = this.requestInfoProvider.getGoogleAdId();
            if (googleAdId != null) {
                builder.setGoogleAdId(googleAdId);
            }
            ApiAdRequestExtras apiAdRequestExtras = new ApiAdRequestExtras(resolveAdFormatToServerAdFormat);
            this.adLoaderPlugin.addApiAdRequestExtras(apiAdRequestExtras, this.logger);
            builder.setExtraParameters(apiAdRequestExtras.toMap());
            Objects.onNotNull(adRequest.getKeyValuePairs(), new Consumer() {
                public final void accept(Object obj) {
                    ApiAdRequest.Builder.this.setKeyValuePairs(((KeyValuePairs) obj).getAllKeyValuePairs());
                }
            });
            builder.setHeaderClient(String.format("sdk/android/%s", new Object[]{SmaatoSdk.getVersion()}));
            List<String> connectedPluginNames = this.analytics.getConnectedPluginNames();
            if (!connectedPluginNames.isEmpty()) {
                builder.setExtensions(Joiner.join(SEPARATOR, (Iterable) connectedPluginNames));
            }
            builder.setIsSplash(adRequest.getIsSplash());
            return builder.build();
        }
        throw new UnresolvedServerAdFormatException();
    }

    /* access modifiers changed from: private */
    public String mapToApiValue(AdDimension adDimension) {
        switch (C86001.$SwitchMap$com$smaato$sdk$core$ad$AdDimension[adDimension.ordinal()]) {
            case 1:
                return "xxlarge";
            case 2:
                return "xlarge";
            case 3:
                return "large";
            case 4:
                return FirebaseAnalytics.Param.MEDIUM;
            case 5:
                return "small";
            case 6:
                return "medrect";
            case 7:
                return "sky";
            case 8:
                return "leader";
            case 9:
                return "full_320x480";
            case 10:
                return "full_480x320";
            case 11:
                return "full_768x1024";
            case 12:
                return "full_1024x768";
            default:
                throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{AdDimension.class.getSimpleName(), adDimension}));
        }
    }

    /* renamed from: com.smaato.sdk.core.ad.AdRequestMapper$1 */
    static /* synthetic */ class C86001 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$Gender;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdDimension;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a9 */
        static {
            /*
                com.smaato.sdk.core.Gender[] r0 = com.smaato.sdk.core.Gender.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$Gender = r0
                r1 = 1
                com.smaato.sdk.core.Gender r2 = com.smaato.sdk.core.Gender.FEMALE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$smaato$sdk$core$Gender     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.Gender r3 = com.smaato.sdk.core.Gender.MALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$smaato$sdk$core$Gender     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.Gender r4 = com.smaato.sdk.core.Gender.OTHER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.smaato.sdk.core.ad.AdDimension[] r3 = com.smaato.sdk.core.p248ad.AdDimension.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$smaato$sdk$core$ad$AdDimension = r3
                com.smaato.sdk.core.ad.AdDimension r4 = com.smaato.sdk.core.p248ad.AdDimension.XX_LARGE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.smaato.sdk.core.ad.AdDimension r3 = com.smaato.sdk.core.p248ad.AdDimension.X_LARGE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x004d }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.LARGE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.MEDIUM     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.SMALL     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x006e }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.MEDIUM_RECTANGLE     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.SKYSCRAPER     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0085 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.LEADERBOARD     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.FULLSCREEN_PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x009d }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.FULLSCREEN_LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x00a9 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.FULLSCREEN_PORTRAIT_TABLET     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdDimension     // Catch:{ NoSuchFieldError -> 0x00b5 }
                com.smaato.sdk.core.ad.AdDimension r1 = com.smaato.sdk.core.p248ad.AdDimension.FULLSCREEN_LANDSCAPE_TABLET     // Catch:{ NoSuchFieldError -> 0x00b5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b5 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b5 }
            L_0x00b5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p248ad.AdRequestMapper.C86001.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public String mapToApiValue(Gender gender) {
        int i = C86001.$SwitchMap$com$smaato$sdk$core$Gender[gender.ordinal()];
        if (i == 1) {
            return InneractiveMediationDefs.GENDER_FEMALE;
        }
        if (i == 2) {
            return InneractiveMediationDefs.GENDER_MALE;
        }
        if (i == 3) {
            return "o";
        }
        throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{Gender.class.getSimpleName(), gender}));
    }

    /* renamed from: com.smaato.sdk.core.ad.AdRequestMapper$UnresolvedServerAdFormatException */
    static final class UnresolvedServerAdFormatException extends RuntimeException {
        UnresolvedServerAdFormatException() {
        }
    }
}
