package com.smaato.sdk.net;

import com.smaato.sdk.net.HttpBody;
import java.io.InputStream;

final class AutoValue_HttpBody extends HttpBody {
    private final long contentLength;
    private final InputStream source;

    /* synthetic */ AutoValue_HttpBody(InputStream inputStream, long j, byte b) {
        this(inputStream, j);
    }

    private AutoValue_HttpBody(InputStream inputStream, long j) {
        this.source = inputStream;
        this.contentLength = j;
    }

    public final InputStream source() {
        return this.source;
    }

    public final long contentLength() {
        return this.contentLength;
    }

    public final String toString() {
        return "HttpBody{source=" + this.source + ", contentLength=" + this.contentLength + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HttpBody) {
            HttpBody httpBody = (HttpBody) obj;
            return this.source.equals(httpBody.source()) && this.contentLength == httpBody.contentLength();
        }
    }

    public final int hashCode() {
        long j = this.contentLength;
        return ((this.source.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    static final class Builder extends HttpBody.Builder {
        private Long contentLength;
        private InputStream source;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public final HttpBody.Builder source(InputStream inputStream) {
            this.source = inputStream;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final HttpBody.Builder contentLength(long j) {
            this.contentLength = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final HttpBody build() {
            String str = "";
            if (this.source == null) {
                str = str + " source";
            }
            if (this.contentLength == null) {
                str = str + " contentLength";
            }
            if (str.isEmpty()) {
                return new AutoValue_HttpBody(this.source, this.contentLength.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
