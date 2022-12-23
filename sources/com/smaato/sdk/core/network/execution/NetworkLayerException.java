package com.smaato.sdk.core.network.execution;

import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.SdkComponentException;

public final class NetworkLayerException extends Exception implements SdkComponentException<NetworkClient.Error> {
    private final NetworkClient.Error errorType;
    private final Exception reason;

    public NetworkLayerException(NetworkClient.Error error, Exception exc) {
        super(exc);
        this.errorType = (NetworkClient.Error) Objects.requireNonNull(error);
        this.reason = (Exception) Objects.requireNonNull(exc);
    }

    public final String toString() {
        return "NetworkLayerException { errorType = " + this.errorType + ", reason = " + this.reason + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            NetworkLayerException networkLayerException = (NetworkLayerException) obj;
            return this.errorType == networkLayerException.errorType && Objects.equals(this.reason, networkLayerException.reason);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.errorType, this.reason);
    }

    public final Exception getReason() {
        return this.reason;
    }

    public final NetworkClient.Error getErrorType() {
        return this.errorType;
    }
}
