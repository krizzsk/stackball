package com.fyber.inneractive.sdk.p056m;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.fyber.inneractive.sdk.util.C3645c;
import com.fyber.inneractive.sdk.util.C3670q;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.m.i */
public final class C3062i {

    /* renamed from: a */
    private static final byte[] f7555a = new byte[0];

    /* renamed from: b */
    private static final C3062i f7556b = new C3062i();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3061h<C3065k> f7557c = new C3061h<>();

    /* renamed from: b */
    public static void m7248b() {
    }

    /* renamed from: a */
    public static C3062i m7244a() {
        return f7556b;
    }

    /* renamed from: a */
    public final WebResourceResponse mo18648a(WebResourceRequest webResourceRequest, int i, int i2, int i3) {
        URL url;
        HttpURLConnection httpURLConnection;
        if (webResourceRequest.getUrl() != null && webResourceRequest.getUrl().getScheme() != null && webResourceRequest.getUrl().getScheme().startsWith("http") && TextUtils.equals(webResourceRequest.getMethod(), "GET")) {
            C3064j jVar = (C3064j) this.f7557c.get(new C3065k(webResourceRequest));
            if (jVar != null) {
                return jVar.mo18651b();
            }
            try {
                url = new URL(webResourceRequest.getUrl().toString());
            } catch (MalformedURLException unused) {
                url = null;
            }
            if (url != null) {
                ByteBuffer b = C3645c.m9069a().mo19569b();
                try {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                        httpURLConnection.setInstanceFollowRedirects(false);
                        m7247a(webResourceRequest, httpURLConnection);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    httpURLConnection = null;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i2);
                    C3064j jVar2 = null;
                    while (i3 > 0) {
                        try {
                            jVar2 = m7245a(httpURLConnection, b);
                        } catch (SocketTimeoutException | UnknownHostException unused4) {
                        } catch (Throwable unused5) {
                            i3 = 0;
                        }
                        if (jVar2 != null) {
                            break;
                        }
                        i3--;
                    }
                    if (jVar2 != null) {
                        try {
                            if (jVar2.mo18650a()) {
                                this.f7557c.put(new C3065k(webResourceRequest), jVar2);
                            }
                            WebResourceResponse b2 = jVar2.mo18651b();
                            httpURLConnection.disconnect();
                            C3645c.m9069a().mo19568a(b);
                            return b2;
                        } catch (Throwable unused6) {
                        }
                    }
                    httpURLConnection.disconnect();
                    C3645c.m9069a().mo19568a(b);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C3064j m7245a(HttpURLConnection httpURLConnection, ByteBuffer byteBuffer) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        String str;
        String str2;
        String str3;
        httpURLConnection.connect();
        for (int i = 0; i < 20; i++) {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 300 || responseCode >= 400) {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] array = byteBuffer.array();
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int read = inputStream.read(array);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(array, 0, read);
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable unused3) {
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
                C3670q.m9158a((Closeable) inputStream);
                httpURLConnection.disconnect();
                String contentType = httpURLConnection.getContentType();
                if (!TextUtils.isEmpty(contentType)) {
                    String[] split = contentType.split(";");
                    if (split.length > 0) {
                        str3 = split[0].trim();
                    } else {
                        str3 = "";
                    }
                    if (split.length > 1) {
                        str = split[1].trim();
                        str2 = str3;
                    } else {
                        str2 = str3;
                        str = "";
                    }
                } else {
                    str2 = "";
                    str = str2;
                }
                HashMap<String, String> a = m7246a(httpURLConnection);
                String responseMessage = httpURLConnection.getResponseMessage();
                if (TextUtils.isEmpty(responseMessage)) {
                    return null;
                }
                return new C3064j(byteArrayOutputStream == null ? f7555a : byteArrayOutputStream.toByteArray(), a, str2, str, responseCode, responseMessage);
            }
            String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                return null;
            }
            httpURLConnection.disconnect();
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            httpURLConnection.connect();
        }
        return null;
    }

    /* renamed from: a */
    private static HashMap<String, String> m7246a(HttpURLConnection httpURLConnection) {
        HashMap<String, String> hashMap = new HashMap<>();
        Map headerFields = httpURLConnection.getHeaderFields();
        if (headerFields != null) {
            for (String str : headerFields.keySet()) {
                List list = (List) headerFields.get(str);
                if (list != null && list.size() > 0) {
                    hashMap.put(str, list.get(0));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m7247a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() != null && webResourceRequest.getRequestHeaders().size() > 0) {
            for (String next : webResourceRequest.getRequestHeaders().keySet()) {
                if (!(next == null || webResourceRequest.getRequestHeaders().get(next) == null)) {
                    httpURLConnection.setRequestProperty(next, webResourceRequest.getRequestHeaders().get(next));
                }
            }
        }
    }
}
