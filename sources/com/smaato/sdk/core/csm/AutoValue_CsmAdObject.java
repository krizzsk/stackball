package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.framework.SomaApiContext;

final class AutoValue_CsmAdObject extends CsmAdObject {
    private final Network network;
    private final String passback;
    private final String sessionId;
    private final SomaApiContext somaApiContext;

    /* synthetic */ AutoValue_CsmAdObject(SomaApiContext somaApiContext2, Network network2, String str, String str2, byte b) {
        this(somaApiContext2, network2, str, str2);
    }

    private AutoValue_CsmAdObject(SomaApiContext somaApiContext2, Network network2, String str, String str2) {
        this.somaApiContext = somaApiContext2;
        this.network = network2;
        this.sessionId = str;
        this.passback = str2;
    }

    public final SomaApiContext getSomaApiContext() {
        return this.somaApiContext;
    }

    public final Network getNetwork() {
        return this.network;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getPassback() {
        return this.passback;
    }

    public final String toString() {
        return "CsmAdObject{somaApiContext=" + this.somaApiContext + ", network=" + this.network + ", sessionId=" + this.sessionId + ", passback=" + this.passback + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CsmAdObject) {
            CsmAdObject csmAdObject = (CsmAdObject) obj;
            return this.somaApiContext.equals(csmAdObject.getSomaApiContext()) && this.network.equals(csmAdObject.getNetwork()) && this.sessionId.equals(csmAdObject.getSessionId()) && this.passback.equals(csmAdObject.getPassback());
        }
    }

    public final int hashCode() {
        return ((((((this.somaApiContext.hashCode() ^ 1000003) * 1000003) ^ this.network.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.passback.hashCode();
    }

    static final class Builder extends CsmAdObject.Builder {
        private Network network;
        private String passback;
        private String sessionId;
        private SomaApiContext somaApiContext;

        Builder() {
        }

        public final CsmAdObject.Builder setSomaApiContext(SomaApiContext somaApiContext2) {
            if (somaApiContext2 != null) {
                this.somaApiContext = somaApiContext2;
                return this;
            }
            throw new NullPointerException("Null somaApiContext");
        }

        public final CsmAdObject.Builder setNetwork(Network network2) {
            if (network2 != null) {
                this.network = network2;
                return this;
            }
            throw new NullPointerException("Null network");
        }

        public final CsmAdObject.Builder setSessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        public final CsmAdObject.Builder setPassback(String str) {
            if (str != null) {
                this.passback = str;
                return this;
            }
            throw new NullPointerException("Null passback");
        }

        public final CsmAdObject build() {
            String str = "";
            if (this.somaApiContext == null) {
                str = str + " somaApiContext";
            }
            if (this.network == null) {
                str = str + " network";
            }
            if (this.sessionId == null) {
                str = str + " sessionId";
            }
            if (this.passback == null) {
                str = str + " passback";
            }
            if (str.isEmpty()) {
                return new AutoValue_CsmAdObject(this.somaApiContext, this.network, this.sessionId, this.passback, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
