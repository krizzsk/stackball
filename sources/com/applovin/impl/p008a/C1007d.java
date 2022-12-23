package com.applovin.impl.p008a;

import com.smaato.sdk.video.vast.model.ErrorCode;

/* renamed from: com.applovin.impl.a.d */
public enum C1007d {
    UNSPECIFIED(-1),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(ErrorCode.GENERAL_WRAPPER_ERROR),
    TIMED_OUT(ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR),
    WRAPPER_LIMIT_REACHED(302),
    NO_WRAPPER_RESPONSE(ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR),
    GENERAL_LINEAR_ERROR(ErrorCode.GENERAL_LINEAR_ERROR),
    NO_MEDIA_FILE_PROVIDED(ErrorCode.COULD_NOT_FIND_LINEAR_OR_MEDIAFILE_ERROR),
    MEDIA_FILE_TIMEOUT(ErrorCode.MEDIAFILE_REQUEST_TIMEOUT_ERROR),
    MEDIA_FILE_ERROR(ErrorCode.COULD_NOT_DISPLAY_MEDIA_FILE_ERROR),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(603),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(604);
    

    /* renamed from: n */
    private final int f1690n;

    private C1007d(int i) {
        this.f1690n = i;
    }

    /* renamed from: a */
    public int mo11710a() {
        return this.f1690n;
    }
}
