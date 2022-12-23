package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.ApiAdRequest;
import java.util.Map;
import java.util.Set;

final class AutoValue_ApiAdRequest extends ApiAdRequest {
    private final String adContentRating;
    private final String adDimension;
    private final String adFormat;
    private final String adSpaceId;
    private final Integer age;
    private final String bundle;
    private final String carrierCode;
    private final String carrierName;
    private final String client;
    private final String connection;
    private final Integer coppa;
    private final String deviceModel;
    private final String extensions;
    private final Map<String, Object> extraParameters;
    private final Integer gdpr;
    private final String gdprConsent;
    private final String gender;
    private final Integer geoType;
    private final String googleAdId;
    private final Boolean googleDnt;
    private final String gps;
    private final String headerClient;
    private final Integer height;
    private final Integer httpsOnly;
    private final boolean isSplash;
    private final Map<String, Set<String>> keyValuePairs;
    private final String keywords;
    private final String language;
    private final String mediationAdapterVersion;
    private final String mediationNetworkName;
    private final String mediationNetworkSDKVersion;
    private final String publisherId;
    private final String region;
    private final String searchQuery;
    private final String usPrivacyString;
    private final Integer width;
    private final String zip;

    /* synthetic */ AutoValue_ApiAdRequest(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, Integer num4, String str5, String str6, String str7, Integer num5, String str8, String str9, String str10, String str11, String str12, Integer num6, String str13, String str14, String str15, String str16, Integer num7, String str17, String str18, String str19, Boolean bool, String str20, String str21, String str22, String str23, Map map, Map map2, String str24, String str25, String str26, boolean z, byte b) {
        this(str, str2, str3, num, num2, str4, num3, num4, str5, str6, str7, num5, str8, str9, str10, str11, str12, num6, str13, str14, str15, str16, num7, str17, str18, str19, bool, str20, str21, str22, str23, map, map2, str24, str25, str26, z);
    }

    private AutoValue_ApiAdRequest(String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, Integer num4, String str5, String str6, String str7, Integer num5, String str8, String str9, String str10, String str11, String str12, Integer num6, String str13, String str14, String str15, String str16, Integer num7, String str17, String str18, String str19, Boolean bool, String str20, String str21, String str22, String str23, Map<String, Object> map, Map<String, Set<String>> map2, String str24, String str25, String str26, boolean z) {
        this.publisherId = str;
        this.adSpaceId = str2;
        this.adFormat = str3;
        this.coppa = num;
        this.httpsOnly = num2;
        this.adDimension = str4;
        this.width = num3;
        this.height = num4;
        this.mediationNetworkName = str5;
        this.mediationNetworkSDKVersion = str6;
        this.mediationAdapterVersion = str7;
        this.gdpr = num5;
        this.gdprConsent = str8;
        this.usPrivacyString = str9;
        this.keywords = str10;
        this.searchQuery = str11;
        this.gender = str12;
        this.age = num6;
        this.gps = str13;
        this.region = str14;
        this.zip = str15;
        this.language = str16;
        this.geoType = num7;
        this.carrierName = str17;
        this.carrierCode = str18;
        this.googleAdId = str19;
        this.googleDnt = bool;
        this.client = str20;
        this.connection = str21;
        this.deviceModel = str22;
        this.bundle = str23;
        this.extraParameters = map;
        this.keyValuePairs = map2;
        this.headerClient = str24;
        this.extensions = str25;
        this.adContentRating = str26;
        this.isSplash = z;
    }

    public final String getPublisherId() {
        return this.publisherId;
    }

    public final String getAdSpaceId() {
        return this.adSpaceId;
    }

    public final String getAdFormat() {
        return this.adFormat;
    }

    public final Integer getCoppa() {
        return this.coppa;
    }

    public final Integer getHttpsOnly() {
        return this.httpsOnly;
    }

    public final String getAdDimension() {
        return this.adDimension;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getMediationNetworkName() {
        return this.mediationNetworkName;
    }

    public final String getMediationNetworkSDKVersion() {
        return this.mediationNetworkSDKVersion;
    }

    public final String getMediationAdapterVersion() {
        return this.mediationAdapterVersion;
    }

    public final Integer getGdpr() {
        return this.gdpr;
    }

    public final String getGdprConsent() {
        return this.gdprConsent;
    }

    public final String getUsPrivacyString() {
        return this.usPrivacyString;
    }

    public final String getKeywords() {
        return this.keywords;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final String getGender() {
        return this.gender;
    }

    public final Integer getAge() {
        return this.age;
    }

    public final String getGps() {
        return this.gps;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getZip() {
        return this.zip;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getGeoType() {
        return this.geoType;
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final String getCarrierCode() {
        return this.carrierCode;
    }

    public final String getGoogleAdId() {
        return this.googleAdId;
    }

    public final Boolean getGoogleDnt() {
        return this.googleDnt;
    }

    public final String getClient() {
        return this.client;
    }

    public final String getConnection() {
        return this.connection;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final Map<String, Object> getExtraParameters() {
        return this.extraParameters;
    }

    public final Map<String, Set<String>> getKeyValuePairs() {
        return this.keyValuePairs;
    }

    public final String getHeaderClient() {
        return this.headerClient;
    }

    public final String getExtensions() {
        return this.extensions;
    }

    public final String getAdContentRating() {
        return this.adContentRating;
    }

    public final boolean getIsSplash() {
        return this.isSplash;
    }

    public final String toString() {
        return "ApiAdRequest{publisherId=" + this.publisherId + ", adSpaceId=" + this.adSpaceId + ", adFormat=" + this.adFormat + ", coppa=" + this.coppa + ", httpsOnly=" + this.httpsOnly + ", adDimension=" + this.adDimension + ", width=" + this.width + ", height=" + this.height + ", mediationNetworkName=" + this.mediationNetworkName + ", mediationNetworkSDKVersion=" + this.mediationNetworkSDKVersion + ", mediationAdapterVersion=" + this.mediationAdapterVersion + ", gdpr=" + this.gdpr + ", gdprConsent=" + this.gdprConsent + ", usPrivacyString=" + this.usPrivacyString + ", keywords=" + this.keywords + ", searchQuery=" + this.searchQuery + ", gender=" + this.gender + ", age=" + this.age + ", gps=" + this.gps + ", region=" + this.region + ", zip=" + this.zip + ", language=" + this.language + ", geoType=" + this.geoType + ", carrierName=" + this.carrierName + ", carrierCode=" + this.carrierCode + ", googleAdId=" + this.googleAdId + ", googleDnt=" + this.googleDnt + ", client=" + this.client + ", connection=" + this.connection + ", deviceModel=" + this.deviceModel + ", bundle=" + this.bundle + ", extraParameters=" + this.extraParameters + ", keyValuePairs=" + this.keyValuePairs + ", headerClient=" + this.headerClient + ", extensions=" + this.extensions + ", adContentRating=" + this.adContentRating + ", isSplash=" + this.isSplash + "}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0182, code lost:
        r1 = r4.zip;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0197, code lost:
        r1 = r4.language;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ac, code lost:
        r1 = r4.geoType;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01c1, code lost:
        r1 = r4.carrierName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01d6, code lost:
        r1 = r4.carrierCode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01eb, code lost:
        r1 = r4.googleAdId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0200, code lost:
        r1 = r4.googleDnt;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0215, code lost:
        r1 = r4.client;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x022a, code lost:
        r1 = r4.connection;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x023f, code lost:
        r1 = r4.deviceModel;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r1 = r4.adDimension;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0254, code lost:
        r1 = r4.bundle;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0269, code lost:
        r1 = r4.extraParameters;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x027e, code lost:
        r1 = r4.keyValuePairs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0293, code lost:
        r1 = r4.headerClient;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02a8, code lost:
        r1 = r4.extensions;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02bd, code lost:
        r1 = r4.adContentRating;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r1 = r4.width;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1 = r4.height;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        r1 = r4.mediationNetworkName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r1 = r4.mediationNetworkSDKVersion;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        r1 = r4.mediationAdapterVersion;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c5, code lost:
        r1 = r4.gdpr;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00da, code lost:
        r1 = r4.gdprConsent;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ef, code lost:
        r1 = r4.usPrivacyString;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0104, code lost:
        r1 = r4.keywords;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0119, code lost:
        r1 = r4.searchQuery;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x012e, code lost:
        r1 = r4.gender;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0143, code lost:
        r1 = r4.age;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0158, code lost:
        r1 = r4.gps;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016d, code lost:
        r1 = r4.region;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.smaato.sdk.core.api.ApiAdRequest
            r2 = 0
            if (r1 == 0) goto L_0x02db
            com.smaato.sdk.core.api.ApiAdRequest r5 = (com.smaato.sdk.core.api.ApiAdRequest) r5
            java.lang.String r1 = r4.publisherId
            java.lang.String r3 = r5.getPublisherId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
            java.lang.String r1 = r4.adSpaceId
            java.lang.String r3 = r5.getAdSpaceId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
            java.lang.String r1 = r4.adFormat
            java.lang.String r3 = r5.getAdFormat()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
            java.lang.Integer r1 = r4.coppa
            java.lang.Integer r3 = r5.getCoppa()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
            java.lang.Integer r1 = r4.httpsOnly
            java.lang.Integer r3 = r5.getHttpsOnly()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
            java.lang.String r1 = r4.adDimension
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = r5.getAdDimension()
            if (r1 != 0) goto L_0x02db
            goto L_0x005c
        L_0x0052:
            java.lang.String r3 = r5.getAdDimension()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x005c:
            java.lang.Integer r1 = r4.width
            if (r1 != 0) goto L_0x0067
            java.lang.Integer r1 = r5.getWidth()
            if (r1 != 0) goto L_0x02db
            goto L_0x0071
        L_0x0067:
            java.lang.Integer r3 = r5.getWidth()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0071:
            java.lang.Integer r1 = r4.height
            if (r1 != 0) goto L_0x007c
            java.lang.Integer r1 = r5.getHeight()
            if (r1 != 0) goto L_0x02db
            goto L_0x0086
        L_0x007c:
            java.lang.Integer r3 = r5.getHeight()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0086:
            java.lang.String r1 = r4.mediationNetworkName
            if (r1 != 0) goto L_0x0091
            java.lang.String r1 = r5.getMediationNetworkName()
            if (r1 != 0) goto L_0x02db
            goto L_0x009b
        L_0x0091:
            java.lang.String r3 = r5.getMediationNetworkName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x009b:
            java.lang.String r1 = r4.mediationNetworkSDKVersion
            if (r1 != 0) goto L_0x00a6
            java.lang.String r1 = r5.getMediationNetworkSDKVersion()
            if (r1 != 0) goto L_0x02db
            goto L_0x00b0
        L_0x00a6:
            java.lang.String r3 = r5.getMediationNetworkSDKVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x00b0:
            java.lang.String r1 = r4.mediationAdapterVersion
            if (r1 != 0) goto L_0x00bb
            java.lang.String r1 = r5.getMediationAdapterVersion()
            if (r1 != 0) goto L_0x02db
            goto L_0x00c5
        L_0x00bb:
            java.lang.String r3 = r5.getMediationAdapterVersion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x00c5:
            java.lang.Integer r1 = r4.gdpr
            if (r1 != 0) goto L_0x00d0
            java.lang.Integer r1 = r5.getGdpr()
            if (r1 != 0) goto L_0x02db
            goto L_0x00da
        L_0x00d0:
            java.lang.Integer r3 = r5.getGdpr()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x00da:
            java.lang.String r1 = r4.gdprConsent
            if (r1 != 0) goto L_0x00e5
            java.lang.String r1 = r5.getGdprConsent()
            if (r1 != 0) goto L_0x02db
            goto L_0x00ef
        L_0x00e5:
            java.lang.String r3 = r5.getGdprConsent()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x00ef:
            java.lang.String r1 = r4.usPrivacyString
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = r5.getUsPrivacyString()
            if (r1 != 0) goto L_0x02db
            goto L_0x0104
        L_0x00fa:
            java.lang.String r3 = r5.getUsPrivacyString()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0104:
            java.lang.String r1 = r4.keywords
            if (r1 != 0) goto L_0x010f
            java.lang.String r1 = r5.getKeywords()
            if (r1 != 0) goto L_0x02db
            goto L_0x0119
        L_0x010f:
            java.lang.String r3 = r5.getKeywords()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0119:
            java.lang.String r1 = r4.searchQuery
            if (r1 != 0) goto L_0x0124
            java.lang.String r1 = r5.getSearchQuery()
            if (r1 != 0) goto L_0x02db
            goto L_0x012e
        L_0x0124:
            java.lang.String r3 = r5.getSearchQuery()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x012e:
            java.lang.String r1 = r4.gender
            if (r1 != 0) goto L_0x0139
            java.lang.String r1 = r5.getGender()
            if (r1 != 0) goto L_0x02db
            goto L_0x0143
        L_0x0139:
            java.lang.String r3 = r5.getGender()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0143:
            java.lang.Integer r1 = r4.age
            if (r1 != 0) goto L_0x014e
            java.lang.Integer r1 = r5.getAge()
            if (r1 != 0) goto L_0x02db
            goto L_0x0158
        L_0x014e:
            java.lang.Integer r3 = r5.getAge()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0158:
            java.lang.String r1 = r4.gps
            if (r1 != 0) goto L_0x0163
            java.lang.String r1 = r5.getGps()
            if (r1 != 0) goto L_0x02db
            goto L_0x016d
        L_0x0163:
            java.lang.String r3 = r5.getGps()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x016d:
            java.lang.String r1 = r4.region
            if (r1 != 0) goto L_0x0178
            java.lang.String r1 = r5.getRegion()
            if (r1 != 0) goto L_0x02db
            goto L_0x0182
        L_0x0178:
            java.lang.String r3 = r5.getRegion()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0182:
            java.lang.String r1 = r4.zip
            if (r1 != 0) goto L_0x018d
            java.lang.String r1 = r5.getZip()
            if (r1 != 0) goto L_0x02db
            goto L_0x0197
        L_0x018d:
            java.lang.String r3 = r5.getZip()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0197:
            java.lang.String r1 = r4.language
            if (r1 != 0) goto L_0x01a2
            java.lang.String r1 = r5.getLanguage()
            if (r1 != 0) goto L_0x02db
            goto L_0x01ac
        L_0x01a2:
            java.lang.String r3 = r5.getLanguage()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x01ac:
            java.lang.Integer r1 = r4.geoType
            if (r1 != 0) goto L_0x01b7
            java.lang.Integer r1 = r5.getGeoType()
            if (r1 != 0) goto L_0x02db
            goto L_0x01c1
        L_0x01b7:
            java.lang.Integer r3 = r5.getGeoType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x01c1:
            java.lang.String r1 = r4.carrierName
            if (r1 != 0) goto L_0x01cc
            java.lang.String r1 = r5.getCarrierName()
            if (r1 != 0) goto L_0x02db
            goto L_0x01d6
        L_0x01cc:
            java.lang.String r3 = r5.getCarrierName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x01d6:
            java.lang.String r1 = r4.carrierCode
            if (r1 != 0) goto L_0x01e1
            java.lang.String r1 = r5.getCarrierCode()
            if (r1 != 0) goto L_0x02db
            goto L_0x01eb
        L_0x01e1:
            java.lang.String r3 = r5.getCarrierCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x01eb:
            java.lang.String r1 = r4.googleAdId
            if (r1 != 0) goto L_0x01f6
            java.lang.String r1 = r5.getGoogleAdId()
            if (r1 != 0) goto L_0x02db
            goto L_0x0200
        L_0x01f6:
            java.lang.String r3 = r5.getGoogleAdId()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0200:
            java.lang.Boolean r1 = r4.googleDnt
            if (r1 != 0) goto L_0x020b
            java.lang.Boolean r1 = r5.getGoogleDnt()
            if (r1 != 0) goto L_0x02db
            goto L_0x0215
        L_0x020b:
            java.lang.Boolean r3 = r5.getGoogleDnt()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0215:
            java.lang.String r1 = r4.client
            if (r1 != 0) goto L_0x0220
            java.lang.String r1 = r5.getClient()
            if (r1 != 0) goto L_0x02db
            goto L_0x022a
        L_0x0220:
            java.lang.String r3 = r5.getClient()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x022a:
            java.lang.String r1 = r4.connection
            if (r1 != 0) goto L_0x0235
            java.lang.String r1 = r5.getConnection()
            if (r1 != 0) goto L_0x02db
            goto L_0x023f
        L_0x0235:
            java.lang.String r3 = r5.getConnection()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x023f:
            java.lang.String r1 = r4.deviceModel
            if (r1 != 0) goto L_0x024a
            java.lang.String r1 = r5.getDeviceModel()
            if (r1 != 0) goto L_0x02db
            goto L_0x0254
        L_0x024a:
            java.lang.String r3 = r5.getDeviceModel()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0254:
            java.lang.String r1 = r4.bundle
            if (r1 != 0) goto L_0x025f
            java.lang.String r1 = r5.getBundle()
            if (r1 != 0) goto L_0x02db
            goto L_0x0269
        L_0x025f:
            java.lang.String r3 = r5.getBundle()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0269:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.extraParameters
            if (r1 != 0) goto L_0x0274
            java.util.Map r1 = r5.getExtraParameters()
            if (r1 != 0) goto L_0x02db
            goto L_0x027e
        L_0x0274:
            java.util.Map r3 = r5.getExtraParameters()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x027e:
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r1 = r4.keyValuePairs
            if (r1 != 0) goto L_0x0289
            java.util.Map r1 = r5.getKeyValuePairs()
            if (r1 != 0) goto L_0x02db
            goto L_0x0293
        L_0x0289:
            java.util.Map r3 = r5.getKeyValuePairs()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x0293:
            java.lang.String r1 = r4.headerClient
            if (r1 != 0) goto L_0x029e
            java.lang.String r1 = r5.getHeaderClient()
            if (r1 != 0) goto L_0x02db
            goto L_0x02a8
        L_0x029e:
            java.lang.String r3 = r5.getHeaderClient()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x02a8:
            java.lang.String r1 = r4.extensions
            if (r1 != 0) goto L_0x02b3
            java.lang.String r1 = r5.getExtensions()
            if (r1 != 0) goto L_0x02db
            goto L_0x02bd
        L_0x02b3:
            java.lang.String r3 = r5.getExtensions()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x02bd:
            java.lang.String r1 = r4.adContentRating
            if (r1 != 0) goto L_0x02c8
            java.lang.String r1 = r5.getAdContentRating()
            if (r1 != 0) goto L_0x02db
            goto L_0x02d2
        L_0x02c8:
            java.lang.String r3 = r5.getAdContentRating()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x02db
        L_0x02d2:
            boolean r1 = r4.isSplash
            boolean r5 = r5.getIsSplash()
            if (r1 != r5) goto L_0x02db
            return r0
        L_0x02db:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.api.AutoValue_ApiAdRequest.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((((((this.publisherId.hashCode() ^ 1000003) * 1000003) ^ this.adSpaceId.hashCode()) * 1000003) ^ this.adFormat.hashCode()) * 1000003) ^ this.coppa.hashCode()) * 1000003) ^ this.httpsOnly.hashCode()) * 1000003;
        String str = this.adDimension;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.width;
        int hashCode3 = (hashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.height;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str2 = this.mediationNetworkName;
        int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mediationNetworkSDKVersion;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mediationAdapterVersion;
        int hashCode7 = (hashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Integer num3 = this.gdpr;
        int hashCode8 = (hashCode7 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        String str5 = this.gdprConsent;
        int hashCode9 = (hashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.usPrivacyString;
        int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.keywords;
        int hashCode11 = (hashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.searchQuery;
        int hashCode12 = (hashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.gender;
        int hashCode13 = (hashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        Integer num4 = this.age;
        int hashCode14 = (hashCode13 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        String str10 = this.gps;
        int hashCode15 = (hashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.region;
        int hashCode16 = (hashCode15 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.zip;
        int hashCode17 = (hashCode16 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        String str13 = this.language;
        int hashCode18 = (hashCode17 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        Integer num5 = this.geoType;
        int hashCode19 = (hashCode18 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
        String str14 = this.carrierName;
        int hashCode20 = (hashCode19 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        String str15 = this.carrierCode;
        int hashCode21 = (hashCode20 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        String str16 = this.googleAdId;
        int hashCode22 = (hashCode21 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        Boolean bool = this.googleDnt;
        int hashCode23 = (hashCode22 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str17 = this.client;
        int hashCode24 = (hashCode23 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        String str18 = this.connection;
        int hashCode25 = (hashCode24 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        String str19 = this.deviceModel;
        int hashCode26 = (hashCode25 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        String str20 = this.bundle;
        int hashCode27 = (hashCode26 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        Map<String, Object> map = this.extraParameters;
        int hashCode28 = (hashCode27 ^ (map == null ? 0 : map.hashCode())) * 1000003;
        Map<String, Set<String>> map2 = this.keyValuePairs;
        int hashCode29 = (hashCode28 ^ (map2 == null ? 0 : map2.hashCode())) * 1000003;
        String str21 = this.headerClient;
        int hashCode30 = (hashCode29 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
        String str22 = this.extensions;
        int hashCode31 = (hashCode30 ^ (str22 == null ? 0 : str22.hashCode())) * 1000003;
        String str23 = this.adContentRating;
        if (str23 != null) {
            i = str23.hashCode();
        }
        return ((hashCode31 ^ i) * 1000003) ^ (this.isSplash ? 1231 : 1237);
    }

    static final class Builder extends ApiAdRequest.Builder {
        private String adContentRating;
        private String adDimension;
        private String adFormat;
        private String adSpaceId;
        private Integer age;
        private String bundle;
        private String carrierCode;
        private String carrierName;
        private String client;
        private String connection;
        private Integer coppa;
        private String deviceModel;
        private String extensions;
        private Map<String, Object> extraParameters;
        private Integer gdpr;
        private String gdprConsent;
        private String gender;
        private Integer geoType;
        private String googleAdId;
        private Boolean googleDnt;
        private String gps;
        private String headerClient;
        private Integer height;
        private Integer httpsOnly;
        private Boolean isSplash;
        private Map<String, Set<String>> keyValuePairs;
        private String keywords;
        private String language;
        private String mediationAdapterVersion;
        private String mediationNetworkName;
        private String mediationNetworkSDKVersion;
        private String publisherId;
        private String region;
        private String searchQuery;
        private String usPrivacyString;
        private Integer width;
        private String zip;

        Builder() {
        }

        public final ApiAdRequest.Builder setPublisherId(String str) {
            if (str != null) {
                this.publisherId = str;
                return this;
            }
            throw new NullPointerException("Null publisherId");
        }

        public final ApiAdRequest.Builder setAdSpaceId(String str) {
            if (str != null) {
                this.adSpaceId = str;
                return this;
            }
            throw new NullPointerException("Null adSpaceId");
        }

        public final ApiAdRequest.Builder setAdFormat(String str) {
            if (str != null) {
                this.adFormat = str;
                return this;
            }
            throw new NullPointerException("Null adFormat");
        }

        public final ApiAdRequest.Builder setCoppa(Integer num) {
            if (num != null) {
                this.coppa = num;
                return this;
            }
            throw new NullPointerException("Null coppa");
        }

        public final ApiAdRequest.Builder setHttpsOnly(Integer num) {
            if (num != null) {
                this.httpsOnly = num;
                return this;
            }
            throw new NullPointerException("Null httpsOnly");
        }

        public final ApiAdRequest.Builder setAdDimension(String str) {
            this.adDimension = str;
            return this;
        }

        public final ApiAdRequest.Builder setWidth(Integer num) {
            this.width = num;
            return this;
        }

        public final ApiAdRequest.Builder setHeight(Integer num) {
            this.height = num;
            return this;
        }

        public final ApiAdRequest.Builder setMediationNetworkName(String str) {
            this.mediationNetworkName = str;
            return this;
        }

        public final ApiAdRequest.Builder setMediationNetworkSDKVersion(String str) {
            this.mediationNetworkSDKVersion = str;
            return this;
        }

        public final ApiAdRequest.Builder setMediationAdapterVersion(String str) {
            this.mediationAdapterVersion = str;
            return this;
        }

        public final ApiAdRequest.Builder setGdpr(Integer num) {
            this.gdpr = num;
            return this;
        }

        public final ApiAdRequest.Builder setGdprConsent(String str) {
            this.gdprConsent = str;
            return this;
        }

        public final ApiAdRequest.Builder setUsPrivacyString(String str) {
            this.usPrivacyString = str;
            return this;
        }

        public final ApiAdRequest.Builder setKeywords(String str) {
            this.keywords = str;
            return this;
        }

        public final ApiAdRequest.Builder setSearchQuery(String str) {
            this.searchQuery = str;
            return this;
        }

        public final ApiAdRequest.Builder setGender(String str) {
            this.gender = str;
            return this;
        }

        public final ApiAdRequest.Builder setAge(Integer num) {
            this.age = num;
            return this;
        }

        public final ApiAdRequest.Builder setGps(String str) {
            this.gps = str;
            return this;
        }

        public final ApiAdRequest.Builder setRegion(String str) {
            this.region = str;
            return this;
        }

        public final ApiAdRequest.Builder setZip(String str) {
            this.zip = str;
            return this;
        }

        public final ApiAdRequest.Builder setLanguage(String str) {
            this.language = str;
            return this;
        }

        public final ApiAdRequest.Builder setGeoType(Integer num) {
            this.geoType = num;
            return this;
        }

        public final ApiAdRequest.Builder setCarrierName(String str) {
            this.carrierName = str;
            return this;
        }

        public final ApiAdRequest.Builder setCarrierCode(String str) {
            this.carrierCode = str;
            return this;
        }

        public final ApiAdRequest.Builder setGoogleAdId(String str) {
            this.googleAdId = str;
            return this;
        }

        public final ApiAdRequest.Builder setGoogleDnt(Boolean bool) {
            this.googleDnt = bool;
            return this;
        }

        public final ApiAdRequest.Builder setClient(String str) {
            this.client = str;
            return this;
        }

        public final ApiAdRequest.Builder setConnection(String str) {
            this.connection = str;
            return this;
        }

        public final ApiAdRequest.Builder setDeviceModel(String str) {
            this.deviceModel = str;
            return this;
        }

        public final ApiAdRequest.Builder setBundle(String str) {
            this.bundle = str;
            return this;
        }

        public final ApiAdRequest.Builder setExtraParameters(Map<String, Object> map) {
            this.extraParameters = map;
            return this;
        }

        public final ApiAdRequest.Builder setKeyValuePairs(Map<String, Set<String>> map) {
            this.keyValuePairs = map;
            return this;
        }

        public final ApiAdRequest.Builder setHeaderClient(String str) {
            this.headerClient = str;
            return this;
        }

        public final ApiAdRequest.Builder setExtensions(String str) {
            this.extensions = str;
            return this;
        }

        public final ApiAdRequest.Builder setAdContentRating(String str) {
            this.adContentRating = str;
            return this;
        }

        public final ApiAdRequest.Builder setIsSplash(boolean z) {
            this.isSplash = Boolean.valueOf(z);
            return this;
        }

        public final ApiAdRequest build() {
            String str = "";
            if (this.publisherId == null) {
                str = str + " publisherId";
            }
            if (this.adSpaceId == null) {
                str = str + " adSpaceId";
            }
            if (this.adFormat == null) {
                str = str + " adFormat";
            }
            if (this.coppa == null) {
                str = str + " coppa";
            }
            if (this.httpsOnly == null) {
                str = str + " httpsOnly";
            }
            if (this.isSplash == null) {
                str = str + " isSplash";
            }
            if (str.isEmpty()) {
                return new AutoValue_ApiAdRequest(this.publisherId, this.adSpaceId, this.adFormat, this.coppa, this.httpsOnly, this.adDimension, this.width, this.height, this.mediationNetworkName, this.mediationNetworkSDKVersion, this.mediationAdapterVersion, this.gdpr, this.gdprConsent, this.usPrivacyString, this.keywords, this.searchQuery, this.gender, this.age, this.gps, this.region, this.zip, this.language, this.geoType, this.carrierName, this.carrierCode, this.googleAdId, this.googleDnt, this.client, this.connection, this.deviceModel, this.bundle, this.extraParameters, this.keyValuePairs, this.headerClient, this.extensions, this.adContentRating, this.isSplash.booleanValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
