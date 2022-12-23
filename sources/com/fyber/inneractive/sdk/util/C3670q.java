package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.util.q */
public final class C3670q {
    /* renamed from: a */
    public static StringBuffer m9156a(InputStream inputStream) throws IOException {
        ByteBuffer b = C3645c.m9069a().mo19569b();
        StringBuffer stringBuffer = new StringBuffer();
        C3645c.m9069a();
        byte[] b2 = C3645c.m9070b(b);
        int i = 0;
        while (i != -1) {
            stringBuffer.append(new String(b2, 0, i));
            i = inputStream.read(b2);
        }
        C3645c.m9069a().mo19568a(b);
        return stringBuffer;
    }

    /* renamed from: a */
    public static boolean m9159a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[65536];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                i += read;
                outputStream.write(bArr, 0, read);
            }
            IAlog.m9034b("Copied stream content length = %d", Integer.valueOf(i));
            if (i > 0) {
                return true;
            }
            return false;
        }
        throw new IOException("Unable to copy from or to a null stream.");
    }

    /* renamed from: a */
    public static void m9158a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m9154a(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (Exception unused) {
            return "bad stackToString";
        }
    }

    /* renamed from: a */
    public static void m9157a(View view) {
        if (view != null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* renamed from: a */
    public static String m9153a() {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 7;
        while (i >= 0 && i < 13 && i < stackTrace.length) {
            sb.append(stackTrace[i].toString());
            sb.append(",");
            i++;
        }
        Log.d("stack trace:", sb.toString());
        return sb.toString();
    }

    /* renamed from: b */
    public static String m9160b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.getBuffer().toString();
    }

    /* renamed from: a */
    public static <T> T m9152a(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* renamed from: a */
    public static int m9151a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static float m9150a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Float.parseFloat(str);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0f;
    }

    /* renamed from: a */
    public static String m9155a(Map<String, String> map) {
        try {
            return new JSONObject(map).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static void m9161b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
