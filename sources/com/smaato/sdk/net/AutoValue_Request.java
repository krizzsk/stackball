package com.smaato.sdk.net;

import android.net.Uri;
import com.smaato.sdk.net.Request;

final class AutoValue_Request extends Request {
    private final Request.Body body;
    private final boolean followRedirects;
    private final Headers headers;
    private final String method;
    private final Uri uri;

    /* synthetic */ AutoValue_Request(Uri uri2, String str, Headers headers2, Request.Body body2, boolean z, byte b) {
        this(uri2, str, headers2, body2, z);
    }

    private AutoValue_Request(Uri uri2, String str, Headers headers2, Request.Body body2, boolean z) {
        this.uri = uri2;
        this.method = str;
        this.headers = headers2;
        this.body = body2;
        this.followRedirects = z;
    }

    public final Uri uri() {
        return this.uri;
    }

    public final String method() {
        return this.method;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final Request.Body body() {
        return this.body;
    }

    /* access modifiers changed from: package-private */
    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final String toString() {
        return "Request{uri=" + this.uri + ", method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", followRedirects=" + this.followRedirects + "}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r4.body;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.smaato.sdk.net.Request
            r2 = 0
            if (r1 == 0) goto L_0x004d
            com.smaato.sdk.net.Request r5 = (com.smaato.sdk.net.Request) r5
            android.net.Uri r1 = r4.uri
            android.net.Uri r3 = r5.uri()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = r4.method
            java.lang.String r3 = r5.method()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
            com.smaato.sdk.net.Headers r1 = r4.headers
            com.smaato.sdk.net.Headers r3 = r5.headers()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
            com.smaato.sdk.net.Request$Body r1 = r4.body
            if (r1 != 0) goto L_0x003a
            com.smaato.sdk.net.Request$Body r1 = r5.body()
            if (r1 != 0) goto L_0x004d
            goto L_0x0044
        L_0x003a:
            com.smaato.sdk.net.Request$Body r3 = r5.body()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
        L_0x0044:
            boolean r1 = r4.followRedirects
            boolean r5 = r5.followRedirects()
            if (r1 != r5) goto L_0x004d
            return r0
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.net.AutoValue_Request.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.method.hashCode()) * 1000003) ^ this.headers.hashCode()) * 1000003;
        Request.Body body2 = this.body;
        return ((hashCode ^ (body2 == null ? 0 : body2.hashCode())) * 1000003) ^ (this.followRedirects ? 1231 : 1237);
    }

    static final class Builder extends Request.Builder {
        private Request.Body body;
        private Boolean followRedirects;
        private Headers headers;
        private String method;
        private Uri uri;

        Builder() {
        }

        public final Request.Builder uri(Uri uri2) {
            if (uri2 != null) {
                this.uri = uri2;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final Request.Builder method(String str) {
            if (str != null) {
                this.method = str;
                return this;
            }
            throw new NullPointerException("Null method");
        }

        public final Request.Builder headers(Headers headers2) {
            if (headers2 != null) {
                this.headers = headers2;
                return this;
            }
            throw new NullPointerException("Null headers");
        }

        public final Request.Builder body(Request.Body body2) {
            this.body = body2;
            return this;
        }

        public final Request.Builder followRedirects(boolean z) {
            this.followRedirects = Boolean.valueOf(z);
            return this;
        }

        public final Request build() {
            String str = "";
            if (this.uri == null) {
                str = str + " uri";
            }
            if (this.method == null) {
                str = str + " method";
            }
            if (this.headers == null) {
                str = str + " headers";
            }
            if (this.followRedirects == null) {
                str = str + " followRedirects";
            }
            if (str.isEmpty()) {
                return new AutoValue_Request(this.uri, this.method, this.headers, this.body, this.followRedirects.booleanValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
