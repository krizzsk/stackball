package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.p248ad.AdLoader;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;

/* renamed from: com.smaato.sdk.core.ad.AdLoaderException */
public final class AdLoaderException extends Exception implements SdkComponentException<AdLoader.Error> {
    private final AdLoader.Error errorType;
    private final Exception reason;

    public AdLoaderException(AdLoader.Error error, Exception exc) {
        super(exc);
        this.errorType = (AdLoader.Error) Objects.requireNonNull(error);
        this.reason = (Exception) Objects.requireNonNull(exc);
    }

    public final String toString() {
        return "AdLoaderException { errorType = " + this.errorType + ", reason = " + this.reason + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdLoaderException adLoaderException = (AdLoaderException) obj;
            return this.errorType == adLoaderException.errorType && Objects.equals(this.reason, adLoaderException.reason);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.errorType, this.reason);
    }

    public final AdLoader.Error getErrorType() {
        return this.errorType;
    }

    public final Exception getReason() {
        return this.reason;
    }
}
