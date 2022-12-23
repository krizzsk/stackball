package com.inmobi.media;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.gx */
/* compiled from: NetworkUtils */
public class C5328gx {

    /* renamed from: a */
    private static final String f12212a = C5328gx.class.getSimpleName();

    /* renamed from: a */
    public static boolean m12274a() {
        Context c = C5314go.m12203c();
        if (c == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) c.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || m12277b()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static boolean m12277b() {
        Context c = C5314go.m12203c();
        if (c == null) {
            return false;
        }
        try {
            PowerManager powerManager = (PowerManager) c.getSystemService("power");
            if (Build.VERSION.SDK_INT <= 22 || powerManager == null) {
                return false;
            }
            return powerManager.isDeviceIdleMode();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m12269a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(str);
                }
                sb.append(String.format(Locale.US, "%s=%s", new Object[]{m12267a((String) next.getKey()), m12267a((String) next.getValue())}));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m12267a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m12273a(Map<String, String> map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : map.entrySet()) {
                if (!(next.getValue() == null || ((String) next.getValue()).trim().length() == 0 || next.getKey() == null || ((String) next.getKey()).trim().length() == 0)) {
                    hashMap.put(((String) next.getKey()).trim(), ((String) next.getValue()).trim());
                }
            }
            map.clear();
            map.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public static HashMap<String, String> m12270a(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m12268a(String str, Map<String, String> map) {
        if (map != null && map.size() > 0) {
            for (Map.Entry next : map.entrySet()) {
                str = str.replace((CharSequence) next.getKey(), (CharSequence) next.getValue());
            }
        }
        return str;
    }

    /* renamed from: a */
    public static byte[] m12276a(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byte[] bArr2 = null;
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                bArr2 = m12275a((InputStream) gZIPInputStream);
            } catch (IOException e) {
                e = e;
                try {
                    C5327gw.m12264a((byte) 2, f12212a, "Failed to decompress response", e);
                    m12271a((Closeable) byteArrayInputStream);
                    m12271a((Closeable) gZIPInputStream);
                    return bArr2;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            gZIPInputStream = null;
            C5327gw.m12264a((byte) 2, f12212a, "Failed to decompress response", e);
            m12271a((Closeable) byteArrayInputStream);
            m12271a((Closeable) gZIPInputStream);
            return bArr2;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            gZIPInputStream = null;
            th = th3;
            m12271a((Closeable) byteArrayInputStream);
            m12271a((Closeable) gZIPInputStream);
            throw th;
        }
        m12271a((Closeable) byteArrayInputStream);
        m12271a((Closeable) gZIPInputStream);
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m12275a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                byteArrayOutputStream.close();
            }
        }
    }

    /* renamed from: a */
    public static void m12272a(HttpURLConnection httpURLConnection) {
        try {
            m12271a((Closeable) httpURLConnection.getInputStream());
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static void m12271a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
