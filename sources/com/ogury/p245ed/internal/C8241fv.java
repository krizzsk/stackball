package com.ogury.p245ed.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.google.common.net.HttpHeaders;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.ogury.ed.internal.fv */
public final class C8241fv {

    /* renamed from: a */
    public static final C8242a f21350a = new C8242a((byte) 0);

    /* renamed from: com.ogury.ed.internal.fv$a */
    public static final class C8242a {
        public /* synthetic */ C8242a(byte b) {
            this();
        }

        private C8242a() {
        }
    }

    /* renamed from: a */
    public static Bitmap m23153a(String str) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream2;
        C8467mq.m23881b(str, "downloadUrl");
        Bitmap bitmap = null;
        try {
            httpURLConnection2 = m23155b(str);
            try {
                inputStream = httpURLConnection2.getInputStream();
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                    options.inSampleSize = m23152a(options, C8258gi.m23195b(48), C8258gi.m23195b(48));
                    options.inJustDecodeBounds = false;
                    httpURLConnection = m23155b(str);
                    try {
                        inputStream2 = httpURLConnection.getInputStream();
                        try {
                            bitmap = BitmapFactory.decodeStream(inputStream2, (Rect) null, options);
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        inputStream2 = null;
                    }
                } catch (Throwable unused3) {
                    httpURLConnection = null;
                    inputStream2 = null;
                }
            } catch (Throwable unused4) {
                httpURLConnection = null;
                inputStream = null;
                inputStream2 = inputStream;
                m23154a(httpURLConnection2, inputStream);
                m23154a(httpURLConnection, inputStream2);
                return bitmap;
            }
        } catch (Throwable unused5) {
            httpURLConnection = null;
            httpURLConnection2 = null;
            inputStream = null;
            inputStream2 = inputStream;
            m23154a(httpURLConnection2, inputStream);
            m23154a(httpURLConnection, inputStream2);
            return bitmap;
        }
        m23154a(httpURLConnection2, inputStream);
        m23154a(httpURLConnection, inputStream2);
        return bitmap;
    }

    /* renamed from: b */
    private static HttpURLConnection m23155b(String str) {
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "close");
            httpURLConnection.connect();
            return httpURLConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    /* renamed from: a */
    private static int m23152a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    private static void m23154a(HttpURLConnection httpURLConnection, InputStream inputStream) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
                return;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
