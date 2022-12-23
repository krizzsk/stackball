package com.flurry.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.exoplayer2.C3716C;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: com.flurry.sdk.em */
public final class C2619em {

    /* renamed from: a */
    private static final String f6148a = C2619em.class.getSimpleName();

    /* renamed from: a */
    public static void m5697a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Must be called from a background thread!");
        }
    }

    /* renamed from: a */
    public static String m5695a(String str) {
        return (!TextUtils.isEmpty(str) && Uri.parse(str).getScheme() == null) ? "http://".concat(String.valueOf(str)) : str;
    }

    /* renamed from: c */
    public static String m5705c(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            String str2 = f6148a;
            C2530db.m5474a(5, str2, "Cannot encode '" + str + "'");
            return "";
        }
    }

    /* renamed from: a */
    public static void m5698a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static byte[] m5706d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            String str2 = f6148a;
            C2530db.m5474a(5, str2, "Unsupported UTF-8: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static String m5696a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for (byte b : bArr) {
            sb.append(cArr[(byte) ((b & 240) >> 4)]);
            sb.append(cArr[(byte) (b & Ascii.f10109SI)]);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static byte[] m5707e(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i += 2) {
            StringBuilder sb = new StringBuilder(2);
            sb.append(charArray[i]);
            sb.append(charArray[i + 1]);
            bArr[i / 2] = (byte) Integer.parseInt(sb.toString(), 16);
        }
        return bArr;
    }

    /* renamed from: a */
    public static boolean m5699a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: b */
    public static String m5704b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, C3716C.ISO88591_NAME);
        } catch (UnsupportedEncodingException e) {
            String str = f6148a;
            C2530db.m5474a(5, str, "Unsupported ISO-8859-1:" + e.getMessage());
            return null;
        }
    }

    /* renamed from: f */
    public static String m5708f(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            String str2 = f6148a;
            C2530db.m5474a(5, str2, "Cannot decode '" + str + "'");
            return "";
        }
    }

    /* renamed from: g */
    public static long m5709g(String str) {
        if (str == null) {
            return 0;
        }
        long j = 1125899906842597L;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + ((long) str.charAt(i));
        }
        return j;
    }

    /* renamed from: a */
    public static byte[] m5702a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m5694a(inputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static long m5694a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static double m5693a(double d, int i) {
        if (i == -1) {
            return d;
        }
        double d2 = (double) i;
        return ((double) Math.round(d * Math.pow(10.0d, d2))) / Math.pow(10.0d, d2);
    }

    /* renamed from: a */
    public static boolean m5700a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                String str2 = f6148a;
                C2530db.m5474a(6, str2, "Error occured when checking if app has permission.  Error: " + e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m5701a(String str, String str2) {
        if (str2.equals("11.5.0")) {
            return true;
        }
        String str3 = f6148a;
        C2530db.m5490e(str3, "Flurry version mismatch detected: " + str + ": " + str2 + ", flurryAnalytics: " + "11.5.0");
        C2530db.m5490e(f6148a, "Please use same version name for all flurry modules");
        return false;
    }

    /* renamed from: b */
    public static String m5703b(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 255) {
            return str;
        }
        return str.substring(0, 255);
    }
}
