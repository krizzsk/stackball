package com.smaato.sdk.net;

import com.smaato.sdk.net.Response;
import java.net.HttpURLConnection;

final class AutoValue_Response extends Response {
    private final Response.Body body;
    private final HttpURLConnection connection;
    private final Headers headers;
    private final MimeType mimeType;
    private final Request request;
    private final int responseCode;

    /* synthetic */ AutoValue_Response(Request request2, int i, Headers headers2, MimeType mimeType2, Response.Body body2, HttpURLConnection httpURLConnection, byte b) {
        this(request2, i, headers2, mimeType2, body2, httpURLConnection);
    }

    private AutoValue_Response(Request request2, int i, Headers headers2, MimeType mimeType2, Response.Body body2, HttpURLConnection httpURLConnection) {
        this.request = request2;
        this.responseCode = i;
        this.headers = headers2;
        this.mimeType = mimeType2;
        this.body = body2;
        this.connection = httpURLConnection;
    }

    public final Request request() {
        return this.request;
    }

    public final int responseCode() {
        return this.responseCode;
    }

    public final Headers headers() {
        return this.headers;
    }

    public final MimeType mimeType() {
        return this.mimeType;
    }

    public final Response.Body body() {
        return this.body;
    }

    /* access modifiers changed from: package-private */
    public final HttpURLConnection connection() {
        return this.connection;
    }

    public final String toString() {
        return "Response{request=" + this.request + ", responseCode=" + this.responseCode + ", headers=" + this.headers + ", mimeType=" + this.mimeType + ", body=" + this.body + ", connection=" + this.connection + "}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r1 = r4.mimeType;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.smaato.sdk.net.Response
            r2 = 0
            if (r1 == 0) goto L_0x0059
            com.smaato.sdk.net.Response r5 = (com.smaato.sdk.net.Response) r5
            com.smaato.sdk.net.Request r1 = r4.request
            com.smaato.sdk.net.Request r3 = r5.request()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            int r1 = r4.responseCode
            int r3 = r5.responseCode()
            if (r1 != r3) goto L_0x0059
            com.smaato.sdk.net.Headers r1 = r4.headers
            com.smaato.sdk.net.Headers r3 = r5.headers()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            com.smaato.sdk.net.MimeType r1 = r4.mimeType
            if (r1 != 0) goto L_0x0036
            com.smaato.sdk.net.MimeType r1 = r5.mimeType()
            if (r1 != 0) goto L_0x0059
            goto L_0x0040
        L_0x0036:
            com.smaato.sdk.net.MimeType r3 = r5.mimeType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x0040:
            com.smaato.sdk.net.Response$Body r1 = r4.body
            com.smaato.sdk.net.Response$Body r3 = r5.body()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.net.HttpURLConnection r1 = r4.connection
            java.net.HttpURLConnection r5 = r5.connection()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0059
            return r0
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.net.AutoValue_Response.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (((((this.request.hashCode() ^ 1000003) * 1000003) ^ this.responseCode) * 1000003) ^ this.headers.hashCode()) * 1000003;
        MimeType mimeType2 = this.mimeType;
        return ((((hashCode ^ (mimeType2 == null ? 0 : mimeType2.hashCode())) * 1000003) ^ this.body.hashCode()) * 1000003) ^ this.connection.hashCode();
    }

    static final class Builder extends Response.Builder {
        private Response.Body body;
        private HttpURLConnection connection;
        private Headers headers;
        private MimeType mimeType;
        private Request request;
        private Integer responseCode;

        Builder() {
        }

        public final Response.Builder request(Request request2) {
            if (request2 != null) {
                this.request = request2;
                return this;
            }
            throw new NullPointerException("Null request");
        }

        public final Response.Builder responseCode(int i) {
            this.responseCode = Integer.valueOf(i);
            return this;
        }

        public final Response.Builder headers(Headers headers2) {
            if (headers2 != null) {
                this.headers = headers2;
                return this;
            }
            throw new NullPointerException("Null headers");
        }

        public final Response.Builder mimeType(MimeType mimeType2) {
            this.mimeType = mimeType2;
            return this;
        }

        public final Response.Builder body(Response.Body body2) {
            if (body2 != null) {
                this.body = body2;
                return this;
            }
            throw new NullPointerException("Null body");
        }

        /* access modifiers changed from: package-private */
        public final Response.Builder connection(HttpURLConnection httpURLConnection) {
            if (httpURLConnection != null) {
                this.connection = httpURLConnection;
                return this;
            }
            throw new NullPointerException("Null connection");
        }

        public final Response build() {
            String str = "";
            if (this.request == null) {
                str = str + " request";
            }
            if (this.responseCode == null) {
                str = str + " responseCode";
            }
            if (this.headers == null) {
                str = str + " headers";
            }
            if (this.body == null) {
                str = str + " body";
            }
            if (this.connection == null) {
                str = str + " connection";
            }
            if (str.isEmpty()) {
                return new AutoValue_Response(this.request, this.responseCode.intValue(), this.headers, this.mimeType, this.body, this.connection, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }
}
