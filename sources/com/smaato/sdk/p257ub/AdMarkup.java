package com.smaato.sdk.p257ub;

import com.smaato.sdk.p257ub.AutoValue_AdMarkup;

/* renamed from: com.smaato.sdk.ub.AdMarkup */
public abstract class AdMarkup {

    /* renamed from: com.smaato.sdk.ub.AdMarkup$Builder */
    public static abstract class Builder {
        public abstract Builder adFormat(String str);

        public abstract Builder adSpaceId(String str);

        public abstract AdMarkup build();

        public abstract Builder expiresAt(long j);

        public abstract Builder markup(String str);

        public abstract Builder sessionId(String str);
    }

    public abstract String adFormat();

    public abstract String adSpaceId();

    public abstract long expiresAt();

    public abstract String markup();

    public abstract String sessionId();

    AdMarkup() {
    }

    public static Builder builder() {
        return new AutoValue_AdMarkup.Builder();
    }
}
