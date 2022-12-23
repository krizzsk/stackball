package com.p243my.target;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

/* renamed from: com.my.target.g3 */
public class C7414g3 extends C7436h3<Void> {
    /* renamed from: d */
    public static C7414g3 m19172d() {
        return new C7414g3();
    }

    /* renamed from: c */
    public Void mo50067a(String str, String str2, Context context) {
        HttpURLConnection httpURLConnection;
        if (str2 == null) {
            C7374e0.m18989a("can't send log request: body is null");
            this.f18683a = false;
            return null;
        }
        C7374e0.m18989a("send log request");
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "text/html; charset=utf-8");
                httpURLConnection.setRequestProperty("connection", "close");
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName("UTF-8")));
                bufferedWriter.write(str2);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                httpURLConnection.getInputStream().close();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
            try {
                this.f18683a = false;
                this.f18687e = th.getMessage();
                C7374e0.m18989a("log request error: " + this.f18687e);
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
        return null;
    }
}
