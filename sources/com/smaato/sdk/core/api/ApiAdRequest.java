package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.AutoValue_ApiAdRequest;
import java.util.Map;
import java.util.Set;

public abstract class ApiAdRequest {

    public static abstract class Builder {
        public abstract ApiAdRequest build();

        public abstract Builder setAdContentRating(String str);

        public abstract Builder setAdDimension(String str);

        public abstract Builder setAdFormat(String str);

        public abstract Builder setAdSpaceId(String str);

        public abstract Builder setAge(Integer num);

        public abstract Builder setBundle(String str);

        public abstract Builder setCarrierCode(String str);

        public abstract Builder setCarrierName(String str);

        public abstract Builder setClient(String str);

        public abstract Builder setConnection(String str);

        public abstract Builder setCoppa(Integer num);

        public abstract Builder setDeviceModel(String str);

        public abstract Builder setExtensions(String str);

        public abstract Builder setExtraParameters(Map<String, Object> map);

        public abstract Builder setGdpr(Integer num);

        public abstract Builder setGdprConsent(String str);

        public abstract Builder setGender(String str);

        public abstract Builder setGeoType(Integer num);

        public abstract Builder setGoogleAdId(String str);

        public abstract Builder setGoogleDnt(Boolean bool);

        public abstract Builder setGps(String str);

        public abstract Builder setHeaderClient(String str);

        public abstract Builder setHeight(Integer num);

        public abstract Builder setHttpsOnly(Integer num);

        public abstract Builder setIsSplash(boolean z);

        public abstract Builder setKeyValuePairs(Map<String, Set<String>> map);

        public abstract Builder setKeywords(String str);

        public abstract Builder setLanguage(String str);

        public abstract Builder setMediationAdapterVersion(String str);

        public abstract Builder setMediationNetworkName(String str);

        public abstract Builder setMediationNetworkSDKVersion(String str);

        public abstract Builder setPublisherId(String str);

        public abstract Builder setRegion(String str);

        public abstract Builder setSearchQuery(String str);

        public abstract Builder setUsPrivacyString(String str);

        public abstract Builder setWidth(Integer num);

        public abstract Builder setZip(String str);
    }

    public abstract String getAdContentRating();

    public abstract String getAdDimension();

    public abstract String getAdFormat();

    public abstract String getAdSpaceId();

    public abstract Integer getAge();

    public abstract String getBundle();

    public abstract String getCarrierCode();

    public abstract String getCarrierName();

    public abstract String getClient();

    public abstract String getConnection();

    public abstract Integer getCoppa();

    public abstract String getDeviceModel();

    public abstract String getExtensions();

    public abstract Map<String, Object> getExtraParameters();

    public abstract Integer getGdpr();

    public abstract String getGdprConsent();

    public abstract String getGender();

    public abstract Integer getGeoType();

    public abstract String getGoogleAdId();

    public abstract Boolean getGoogleDnt();

    public abstract String getGps();

    public abstract String getHeaderClient();

    public abstract Integer getHeight();

    public abstract Integer getHttpsOnly();

    public abstract boolean getIsSplash();

    public abstract Map<String, Set<String>> getKeyValuePairs();

    public abstract String getKeywords();

    public abstract String getLanguage();

    public abstract String getMediationAdapterVersion();

    public abstract String getMediationNetworkName();

    public abstract String getMediationNetworkSDKVersion();

    public abstract String getPublisherId();

    public abstract String getRegion();

    public abstract String getSearchQuery();

    public abstract String getUsPrivacyString();

    public abstract Integer getWidth();

    public abstract String getZip();

    public static Builder builder() {
        return new AutoValue_ApiAdRequest.Builder();
    }

    public Builder newBuilder() {
        return builder().setPublisherId(getPublisherId()).setAdSpaceId(getAdSpaceId()).setAdFormat(getAdFormat()).setCoppa(getCoppa()).setHttpsOnly(getHttpsOnly()).setAdDimension(getAdDimension()).setWidth(getWidth()).setHeight(getHeight()).setMediationNetworkName(getMediationNetworkName()).setMediationNetworkSDKVersion(getMediationNetworkSDKVersion()).setMediationAdapterVersion(getMediationAdapterVersion()).setGdpr(getGdpr()).setGdprConsent(getGdprConsent()).setUsPrivacyString(getUsPrivacyString()).setKeywords(getKeywords()).setSearchQuery(getSearchQuery()).setGender(getGender()).setAge(getAge()).setGps(getGps()).setRegion(getRegion()).setZip(getZip()).setLanguage(getLanguage()).setGeoType(getGeoType()).setCarrierName(getCarrierName()).setCarrierCode(getCarrierCode()).setGoogleAdId(getGoogleAdId()).setGoogleDnt(getGoogleDnt()).setClient(getClient()).setConnection(getConnection()).setDeviceModel(getDeviceModel()).setBundle(getBundle()).setExtraParameters(getExtraParameters()).setHeaderClient(getHeaderClient()).setExtensions(getExtensions()).setAdContentRating(getAdContentRating()).setIsSplash(getIsSplash());
    }
}
