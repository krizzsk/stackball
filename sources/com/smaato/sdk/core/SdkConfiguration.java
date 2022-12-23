package com.smaato.sdk.core;

import com.smaato.sdk.core.p248ad.UserInfo;

public final class SdkConfiguration {
    public final boolean isGpsEnabled() {
        return SmaatoSdk.isGPSEnabled();
    }

    public final boolean isCompanionAdSkippable() {
        return SmaatoSdk.isCompanionAdSkippable();
    }

    public final boolean isWatermarkEnabled() {
        return SmaatoSdk.isWatermarkEnabled();
    }

    public final boolean isCoppaEnabled() {
        return SmaatoSdk.getCoppa();
    }

    public final String getPublisherId() {
        return SmaatoSdk.getPublisherId();
    }

    public final String getUsPrivacyString() {
        return SmaatoSdk.getUsPrivacyString();
    }

    public final String getVersion() {
        return SmaatoSdk.getVersion();
    }

    public final AdContentRating getAdContentRating() {
        return SmaatoSdk.getAdContentRating();
    }

    public final UserInfo getUserInfo() {
        return new UserInfo.Builder().setKeywords(SmaatoSdk.getKeywords()).setSearchQuery(SmaatoSdk.getSearchQuery()).setGender(SmaatoSdk.getGender()).setAge(SmaatoSdk.getAge()).setLatLng(SmaatoSdk.getLatLng()).setRegion(SmaatoSdk.getRegion()).setZip(SmaatoSdk.getZip()).setLanguage(SmaatoSdk.getLanguage()).setCoppa(SmaatoSdk.getCoppa()).build();
    }
}
