package com.smaato.sdk.net;

import android.net.Uri;
import com.smaato.sdk.net.AutoValue_Request;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

public abstract class Request {

    public interface Body {
        void writeTo(OutputStream outputStream) throws IOException;
    }

    public static abstract class Builder {
        public abstract Builder body(Body body);

        public abstract Request build();

        public abstract Builder followRedirects(boolean z);

        public abstract Builder headers(Headers headers);

        public abstract Builder method(String str);

        public abstract Builder uri(Uri uri);
    }

    public abstract Body body();

    /* access modifiers changed from: package-private */
    public abstract boolean followRedirects();

    public abstract Headers headers();

    public abstract String method();

    public abstract Uri uri();

    public static Request get(String str) {
        if (str != null) {
            return new AutoValue_Request.Builder().method("GET").uri(Uri.parse(str)).headers(Headers.empty()).followRedirects(true).build();
        }
        throw new NullPointerException("'url' specified as non-null is null");
    }

    public static Builder builder() {
        return new AutoValue_Request.Builder().headers(Headers.m24082of(Collections.emptyMap())).followRedirects(true);
    }

    public Builder buildUpon() {
        return new AutoValue_Request.Builder().uri(uri()).method(method()).headers(headers()).body(body()).followRedirects(followRedirects());
    }
}
