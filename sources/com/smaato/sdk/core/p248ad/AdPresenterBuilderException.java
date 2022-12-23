package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;

/* renamed from: com.smaato.sdk.core.ad.AdPresenterBuilderException */
public final class AdPresenterBuilderException extends Exception implements SdkComponentException<AdPresenterBuilder.Error> {
    private final AdPresenterBuilder.Error errorType;
    private final Exception reason;

    public AdPresenterBuilderException(AdPresenterBuilder.Error error, Exception exc) {
        super(exc);
        this.errorType = (AdPresenterBuilder.Error) Objects.requireNonNull(error);
        this.reason = (Exception) Objects.requireNonNull(exc);
    }

    public final String toString() {
        return "AdPresenterBuilderException { errorType = " + this.errorType + ", reason = " + this.reason + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdPresenterBuilderException adPresenterBuilderException = (AdPresenterBuilderException) obj;
            return this.errorType == adPresenterBuilderException.errorType && Objects.equals(this.reason, adPresenterBuilderException.reason);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.errorType, this.reason);
    }

    public final AdPresenterBuilder.Error getErrorType() {
        return this.errorType;
    }

    public final Exception getReason() {
        return this.reason;
    }
}
