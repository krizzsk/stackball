package com.ogury.core.internal.network;

import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.ogury.core.internal.C7906a;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.C7935au;
import com.ogury.core.internal.network.OguryNetworkResponse;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.ogury.core.internal.network.b */
/* compiled from: NetworkCall.kt */
public final class C7989b implements Call {

    /* renamed from: a */
    private final NetworkRequest f20779a;

    /* renamed from: b */
    private final int f20780b;

    /* renamed from: c */
    private final int f20781c;

    public C7989b(NetworkRequest networkRequest, int i, int i2) {
        C7921ai.m22144b(networkRequest, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        this.f20779a = networkRequest;
        this.f20780b = i;
        this.f20781c = i2;
    }

    public final OguryNetworkResponse execute() {
        OguryNetworkResponse.Success success;
        byte[] bArr;
        try {
            URLConnection openConnection = new URL(this.f20779a.getUrl()).openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "close");
                httpURLConnection.setReadTimeout(this.f20780b);
                httpURLConnection.setConnectTimeout(this.f20781c);
                httpURLConnection.setRequestMethod(this.f20779a.getMethod());
                boolean z = true;
                httpURLConnection.setDoOutput(this.f20779a.getBody().length() > 0);
                m22241a(httpURLConnection);
                if (this.f20779a.getBody().length() > 0) {
                    if (C7987a.m22239a(this.f20779a.getHeaders())) {
                        bArr = C7906a.m22116a(this.f20779a.getBody());
                    } else {
                        String body = this.f20779a.getBody();
                        Charset charset = C7935au.f20699a;
                        if (body != null) {
                            bArr = body.getBytes(charset);
                            C7921ai.m22142a((Object) bArr, "(this as java.lang.String).getBytes(charset)");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length));
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArr);
                    if (outputStream != null) {
                        CloseableUtilKt.closeSafely(outputStream);
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    z = false;
                }
                if (!z) {
                    return new OguryNetworkResponse.Failure(new OguryNetworkException(responseCode));
                }
                if (httpURLConnection.getContentLength() == 0) {
                    success = new OguryNetworkResponse.Success("");
                } else {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    C7921ai.m22142a((Object) inputStream, "inputStream");
                    C7921ai.m22144b(inputStream, "$this$readBytes");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
                    C7906a.m22111a(inputStream, (OutputStream) byteArrayOutputStream, 0, 2);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C7921ai.m22142a((Object) byteArray, "buffer.toByteArray()");
                    inputStream.close();
                    if (C7987a.m22240a(httpURLConnection)) {
                        success = new OguryNetworkResponse.Success(C7906a.m22115a(byteArray));
                    } else {
                        success = new OguryNetworkResponse.Success(new String(byteArray, C7935au.f20699a));
                    }
                }
                return success;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Exception e) {
            return new OguryNetworkResponse.Failure(e);
        } catch (Throwable th) {
            if (0 != 0) {
                CloseableUtilKt.closeSafely((Closeable) null);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final void m22241a(HttpURLConnection httpURLConnection) {
        for (Map.Entry next : this.f20779a.getHeaders().loadHeaders().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }
}
