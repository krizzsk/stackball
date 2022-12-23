package com.ironsource.environment;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.ironsource.mediationsdk.C5649ab;
import com.ironsource.mediationsdk.logger.IronLog;
import com.tapjoy.TapjoyConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.a */
public final class C5505a extends Thread {

    /* renamed from: d */
    private static final C5511b f12695d = new C5511b() {
        /* renamed from: a */
        public static String m13068a(int i) {
            String str = "not defined message for " + i;
            if (i != 404) {
                switch (i) {
                    case 1004:
                        return "malformed url exception";
                    case 1005:
                        break;
                    case 1006:
                        return "http empty response";
                    default:
                        switch (i) {
                            case 1008:
                                return "socket timeout exception";
                            case 1009:
                                return "io exception";
                            case 1010:
                                return "uri syntax exception";
                            case 1011:
                                return "http error code";
                            default:
                                switch (i) {
                                    case 1018:
                                        return "file not found exception";
                                    case 1019:
                                        return "out of memory exception";
                                    case 1020:
                                        return "failed to create folder for file";
                                    default:
                                        return str;
                                }
                        }
                }
            }
            return "http not found";
        }

        /* renamed from: a */
        public static String m13069a(Context context) {
            ConnectivityManager connectivityManager;
            String str;
            StringBuilder sb = new StringBuilder();
            if (!(context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null)) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            str = "3g";
                        } else if (type == 1) {
                            str = TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                        } else {
                            sb.append(typeName);
                        }
                        sb.append(str);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public static String m13070a(String str) {
            try {
                return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
            } catch (UnsupportedEncodingException unused) {
                return "";
            }
        }

        /* renamed from: a */
        public static String m13071a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                return Base64.encodeToString(m13076a(str.getBytes("UTF-8"), (PublicKey) (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)))), 0).replaceAll(System.getProperty("line.separator"), "");
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on string encryption error: " + e.getMessage());
                e.printStackTrace();
                return "";
            }
        }

        /* renamed from: a */
        public static String m13072a(byte[] bArr) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        bufferedReader.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return sb.toString();
                    }
                }
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while decompressing " + e);
                return null;
            }
        }

        /* renamed from: a */
        public static Map<String, Object> m13073a(Object[][] objArr) {
            HashMap hashMap = new HashMap();
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception unused) {
            }
            return hashMap;
        }

        /* renamed from: a */
        public static void m13074a(Context context, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                }
                context.startActivity(intent);
                return;
            }
            throw new Exception("url is null");
        }

        /* renamed from: a */
        public static byte[] m13075a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        /* renamed from: a */
        private static byte[] m13076a(byte[] bArr, PublicKey publicKey) {
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, publicKey);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception on encryption error: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }

        /* renamed from: b */
        public static JSONObject m13077b(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errMsg", str);
                jSONObject.put("adViewId", str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: b */
        public static boolean m13078b(Context context) {
            ConnectivityManager connectivityManager;
            if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        public static byte[] m13079b(String str) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        }

        /* renamed from: c */
        public static int m13080c(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mcc;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: c */
        public static String m13081c() {
            try {
                new C5649ab();
                return ",kiag";
            } catch (Throwable unused) {
                return ",kiang";
            }
        }

        /* renamed from: c */
        public static String m13082c(String str) {
            return Base64.encodeToString(str.getBytes(), 10);
        }

        /* renamed from: d */
        public static int m13083d(Context context) {
            if (context == null) {
                return -1;
            }
            try {
                return context.getResources().getConfiguration().mnc;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }

        /* renamed from: d */
        public static boolean m13084d() {
            try {
                new C5649ab();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        /* renamed from: e */
        public static String m13085e(Context context) {
            if (context == null) {
                return "";
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                return telephonyManager != null ? telephonyManager.getSimOperator() : "";
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        /* renamed from: f */
        public static int m13086f(Context context) {
            if (context != null) {
                try {
                    return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return -1;
        }

        /* renamed from: a */
        public final void mo41232a() {
        }

        /* renamed from: b */
        public final void mo41233b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    };

    /* renamed from: e */
    private static final C5529h f12696e = new C5529h() {
        /* renamed from: a */
        public final void mo41234a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    };

    /* renamed from: a */
    C5511b f12697a = f12695d;

    /* renamed from: b */
    boolean f12698b = false;

    /* renamed from: c */
    boolean f12699c = false;

    /* renamed from: f */
    private C5529h f12700f = f12696e;

    /* renamed from: g */
    private final Handler f12701g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private final int f12702h;

    /* renamed from: i */
    private String f12703i = "";
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile int f12704j = 0;

    /* renamed from: k */
    private int f12705k = 1;

    /* renamed from: l */
    private int f12706l = 0;

    /* renamed from: m */
    private final Runnable f12707m = new Runnable() {
        public final void run() {
            C5505a aVar = C5505a.this;
            int unused = aVar.f12704j = (aVar.f12704j + 1) % Integer.MAX_VALUE;
        }
    };

    public C5505a(int i) {
        this.f12702h = i;
    }

    public final void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.f12706l < this.f12705k) {
            int i2 = this.f12704j;
            this.f12701g.post(this.f12707m);
            try {
                Thread.sleep((long) this.f12702h);
                if (this.f12704j != i2) {
                    this.f12706l = 0;
                } else if (this.f12699c || !Debug.isDebuggerConnected()) {
                    this.f12706l++;
                    this.f12697a.mo41232a();
                    if (C5521e.f12728c != null && !C5521e.f12728c.trim().isEmpty()) {
                        new C5517c(C5521e.f12728c, String.valueOf(System.currentTimeMillis()), "ANR").mo41243d();
                    }
                } else {
                    if (this.f12704j != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.f12704j;
                }
            } catch (InterruptedException e) {
                this.f12700f.mo41234a(e);
                return;
            }
        }
        if (this.f12706l >= this.f12705k) {
            this.f12697a.mo41233b();
        }
    }
}
