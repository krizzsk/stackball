package com.smaato.sdk.net;

import com.ironsource.mediationsdk.config.VersionInfo;
import com.smaato.sdk.net.AutoValue_Response;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Collections;

public abstract class Response implements Closeable {

    public interface Body {
        long contentLength();

        InputStream source();
    }

    public static abstract class Builder {
        public abstract Builder body(Body body);

        public abstract Response build();

        /* access modifiers changed from: package-private */
        public abstract Builder connection(HttpURLConnection httpURLConnection);

        public abstract Builder headers(Headers headers);

        public abstract Builder mimeType(MimeType mimeType);

        public abstract Builder request(Request request);

        public abstract Builder responseCode(int i);
    }

    public abstract Body body();

    /* access modifiers changed from: package-private */
    public abstract HttpURLConnection connection();

    public abstract Headers headers();

    public abstract MimeType mimeType();

    public abstract Request request();

    public abstract int responseCode();

    public static Builder builder() {
        return new AutoValue_Response.Builder().headers(Headers.m24082of(Collections.emptyMap()));
    }

    public void close() throws IOException {
        connection().disconnect();
    }

    public boolean isRedirect() {
        int responseCode = responseCode();
        if (responseCode == 307 || responseCode == 308) {
            String method = request().method();
            return "GET".equalsIgnoreCase(method) || VersionInfo.GIT_BRANCH.equalsIgnoreCase(method);
        }
        switch (responseCode) {
            case ErrorCode.GENERAL_WRAPPER_ERROR /*300*/:
            case ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR /*301*/:
            case 302:
            case ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR /*303*/:
                return true;
            default:
                return false;
        }
    }
}
