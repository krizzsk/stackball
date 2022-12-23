package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.csm.AutoValue_CsmAdObject;
import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.p248ad.AdObject;

public abstract class CsmAdObject implements AdObject {

    public static abstract class Builder {
        public abstract CsmAdObject build();

        public abstract Builder setNetwork(Network network);

        public abstract Builder setPassback(String str);

        public abstract Builder setSessionId(String str);

        public abstract Builder setSomaApiContext(SomaApiContext somaApiContext);
    }

    public abstract Network getNetwork();

    public abstract String getPassback();

    public abstract String getSessionId();

    public abstract SomaApiContext getSomaApiContext();

    public static Builder builder() {
        return new AutoValue_CsmAdObject.Builder();
    }
}
