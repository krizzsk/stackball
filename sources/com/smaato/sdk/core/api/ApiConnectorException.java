package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;

public final class ApiConnectorException extends Exception implements SdkComponentException<ApiConnector.Error> {
    private final ApiConnector.Error errorType;
    private final Exception reason;

    public ApiConnectorException(ApiConnector.Error error, Exception exc) {
        super(exc);
        this.errorType = (ApiConnector.Error) Objects.requireNonNull(error);
        this.reason = (Exception) Objects.requireNonNull(exc);
    }

    public final String toString() {
        return "ApiConnectorException { errorType = " + this.errorType + ", reason = " + this.reason + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ApiConnectorException apiConnectorException = (ApiConnectorException) obj;
            return this.errorType == apiConnectorException.errorType && Objects.equals(this.reason, apiConnectorException.reason);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.errorType, this.reason);
    }

    public final ApiConnector.Error getErrorType() {
        return this.errorType;
    }

    public final Exception getReason() {
        return this.reason;
    }
}
