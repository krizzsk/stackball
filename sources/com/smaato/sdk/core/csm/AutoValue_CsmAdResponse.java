package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.csm.CsmAdResponse;
import java.util.List;

final class AutoValue_CsmAdResponse extends CsmAdResponse {
    private final List<Network> networks;
    private final String passback;
    private final String sessionId;

    /* synthetic */ AutoValue_CsmAdResponse(List list, String str, String str2, byte b) {
        this(list, str, str2);
    }

    private AutoValue_CsmAdResponse(List<Network> list, String str, String str2) {
        this.networks = list;
        this.sessionId = str;
        this.passback = str2;
    }

    public final List<Network> getNetworks() {
        return this.networks;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getPassback() {
        return this.passback;
    }

    public final String toString() {
        return "CsmAdResponse{networks=" + this.networks + ", sessionId=" + this.sessionId + ", passback=" + this.passback + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CsmAdResponse) {
            CsmAdResponse csmAdResponse = (CsmAdResponse) obj;
            return this.networks.equals(csmAdResponse.getNetworks()) && this.sessionId.equals(csmAdResponse.getSessionId()) && this.passback.equals(csmAdResponse.getPassback());
        }
    }

    public final int hashCode() {
        return ((((this.networks.hashCode() ^ 1000003) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.passback.hashCode();
    }

    static final class Builder extends CsmAdResponse.Builder {
        private List<Network> networks;
        private String passback;
        private String sessionId;

        Builder() {
        }

        public final CsmAdResponse.Builder setNetworks(List<Network> list) {
            if (list != null) {
                this.networks = list;
                return this;
            }
            throw new NullPointerException("Null networks");
        }

        public final CsmAdResponse.Builder setSessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final CsmAdResponse.Builder setPassback(String str) {
            if (str != null) {
                this.passback = str;
                return this;
            }
            throw new NullPointerException("Null passback");
        }

        public final CsmAdResponse build() {
            String str = "";
            if (this.networks == null) {
                str = str + " networks";
            }
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (this.passback == null) {
                str = str + " passback";
            }
            if (str.isEmpty()) {
                return new AutoValue_CsmAdResponse(this.networks, this.sessionId, this.passback, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
