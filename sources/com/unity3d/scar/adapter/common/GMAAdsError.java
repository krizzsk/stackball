package com.unity3d.scar.adapter.common;

import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;

public class GMAAdsError extends WebViewAdsError {
    public static final String INTERNAL_LOAD_MESSAGE_MISSING_QUERYINFO = "Missing queryInfoMetadata for ad %s";
    public static final String INTERNAL_SHOW_MESSAGE_NOT_LOADED = "Cannot show ad that is not loaded for placement %s";

    public String getDomain() {
        return "GMA";
    }

    public GMAAdsError(GMAEvent gMAEvent, Object... objArr) {
        super(gMAEvent, (String) null, objArr);
    }

    public GMAAdsError(GMAEvent gMAEvent, String str, Object... objArr) {
        super(gMAEvent, str, objArr);
    }

    public static GMAAdsError NoAdsError(String str, String str2, String str3) {
        return new GMAAdsError(GMAEvent.NO_AD_ERROR, str3, str, str2, str3);
    }

    public static GMAAdsError InternalShowError(ScarAdMetadata scarAdMetadata) {
        return InternalShowError(scarAdMetadata, String.format(INTERNAL_SHOW_MESSAGE_NOT_LOADED, new Object[]{scarAdMetadata.getPlacementId()}));
    }

    public static GMAAdsError InternalShowError(ScarAdMetadata scarAdMetadata, String str) {
        return new GMAAdsError(GMAEvent.INTERNAL_SHOW_ERROR, str, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), str);
    }

    public static GMAAdsError InternalLoadError(ScarAdMetadata scarAdMetadata) {
        return InternalLoadError(scarAdMetadata, String.format(INTERNAL_LOAD_MESSAGE_MISSING_QUERYINFO, new Object[]{scarAdMetadata.getPlacementId()}));
    }

    public static GMAAdsError InternalLoadError(ScarAdMetadata scarAdMetadata, String str) {
        return new GMAAdsError(GMAEvent.INTERNAL_LOAD_ERROR, str, scarAdMetadata.getPlacementId(), scarAdMetadata.getQueryId(), str);
    }

    public static GMAAdsError InternalSignalsError(String str) {
        return new GMAAdsError(GMAEvent.INTERNAL_SIGNALS_ERROR, str, str);
    }
}
