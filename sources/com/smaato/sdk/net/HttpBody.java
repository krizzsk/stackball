package com.smaato.sdk.net;

import com.smaato.sdk.net.AutoValue_HttpBody;
import com.smaato.sdk.net.Response;
import java.io.InputStream;

abstract class HttpBody implements Response.Body {
    HttpBody() {
    }

    static Builder builder() {
        return new AutoValue_HttpBody.Builder();
    }

    static abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract HttpBody build();

        /* access modifiers changed from: package-private */
        public abstract Builder contentLength(long j);

        /* access modifiers changed from: package-private */
        public abstract Builder source(InputStream inputStream);

        Builder() {
        }
    }
}
