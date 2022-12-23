package com.yandex.metrica.impl.p265ob;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.B2 */
public class C10122B2 {

    /* renamed from: a */
    private static final Pattern f24386a = Pattern.compile(".*at com\\.yandex\\.metrica\\.push\\.*");

    /* renamed from: b */
    private static final Pattern f24387b = Pattern.compile(".*at com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: com.yandex.metrica.impl.ob.B2$a */
    static class C10123a {

        /* renamed from: a */
        static final String f24388a;

        static {
            String str;
            if (C10122B2.m26036a("com.unity3d.player.UnityPlayer")) {
                str = "unity";
            } else if (C10122B2.m26036a("mono.MonoPackageManager")) {
                str = PluginErrorDetails.Platform.XAMARIN;
            } else if (C10122B2.m26036a("org.apache.cordova.CordovaPlugin")) {
                str = PluginErrorDetails.Platform.CORDOVA;
            } else if (C10122B2.m26036a("com.facebook.react.ReactRootView")) {
                str = "react";
            } else {
                str = C10122B2.m26036a("io.flutter.embedding.engine.FlutterEngine") ? PluginErrorDetails.Platform.FLUTTER : "native";
            }
            f24388a = str;
        }
    }

    /* renamed from: a */
    public static void m26034a(String str, Object... objArr) {
        Log.i("AppMetrica-Attribution", String.format(str, objArr));
    }

    /* renamed from: b */
    static void m26039b() {
        Log.i("AppMetrica", "Initializing of Metrica, " + C10585O2.m27102a("release") + " type, Version " + "5.0.0" + ", API Level " + YandexMetrica.getLibraryApiLevel() + ", Dated " + "18.05.2022" + ".");
    }

    /* renamed from: c */
    public static String m26042c(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append("5.0.0");
        sb.append(".");
        sb.append("45001354");
        sb.append(" (");
        String str3 = Build.MODEL;
        String str4 = Build.MANUFACTURER;
        if (str3.startsWith(str4)) {
            str2 = C10585O2.m27102a(str3);
        } else {
            str2 = C10585O2.m27102a(str4) + " " + str3;
        }
        sb.append(str2);
        sb.append("; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m26035a(Throwable th, String str, Object... objArr) {
        Log.e("AppMetrica-Attribution", String.format(str, objArr), th);
    }

    /* renamed from: a */
    public static String m26033a() {
        return C10123a.f24388a;
    }

    /* renamed from: a */
    static boolean m26037a(Throwable th) {
        String str;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            printWriter.close();
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) && f24387b.matcher(str).find();
    }

    /* renamed from: b */
    public static void m26040b(String str, Object... objArr) {
        Log.w("AppMetrica-Attribution", String.format(str, objArr));
    }

    /* renamed from: b */
    static boolean m26041b(Throwable th) {
        String str;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            str = stringWriter.toString();
            printWriter.close();
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str) && f24386a.matcher(str).find();
    }

    /* renamed from: a */
    public static boolean m26036a(String str) {
        return m26038b(str) != null;
    }

    /* renamed from: b */
    public static Class m26038b(String str) {
        try {
            return Class.forName(str, false, C10122B2.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }
}
