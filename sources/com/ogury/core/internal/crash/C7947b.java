package com.ogury.core.internal.crash;

import com.google.common.net.HttpHeaders;
import com.ogury.core.internal.C7921ai;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.ogury.core.internal.crash.b */
/* compiled from: CrashApi.kt */
public final class C7947b {

    /* renamed from: a */
    public static final C7947b f20712a = new C7947b();

    private C7947b() {
    }

    /* renamed from: a */
    public static int m22171a(String str, String str2) {
        C7921ai.m22144b(str, "crashJson");
        C7921ai.m22144b(str2, "url");
        URLConnection openConnection = new URL(str2).openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, WebRequest.CONTENT_TYPE_JSON);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            httpURLConnection.connect();
            return httpURLConnection.getResponseCode();
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }
}
