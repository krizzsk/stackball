package com.smaato.sdk.core.gdpr;

import com.facebook.appevents.AppEventsConstants;
import com.smaato.sdk.core.util.Objects;

public enum SubjectToGdpr {
    CMP_GDPR_ENABLED("1"),
    CMP_GDPR_DISABLED(AppEventsConstants.EVENT_PARAM_VALUE_NO),
    CMP_GDPR_UNKNOWN("-1");
    

    /* renamed from: id */
    public final String f21792id;

    private SubjectToGdpr(String str) {
        this.f21792id = (String) Objects.requireNonNull(str);
    }
}
