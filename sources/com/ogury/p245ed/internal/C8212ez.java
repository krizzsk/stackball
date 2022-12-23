package com.ogury.p245ed.internal;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ogury.ed.internal.ez */
public final class C8212ez {

    /* renamed from: a */
    public static final C8213a f21259a = new C8213a((byte) 0);

    /* renamed from: b */
    private final Context f21260b;

    /* renamed from: c */
    private final TimeZone f21261c;

    /* renamed from: d */
    private final DisplayMetrics f21262d;

    /* renamed from: e */
    private final String f21263e;

    /* renamed from: f */
    private final String f21264f;

    private C8212ez(Context context, TimeZone timeZone, DisplayMetrics displayMetrics) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(timeZone, "utcTimezone");
        C8467mq.m23881b(displayMetrics, "displayMetrics");
        this.f21260b = context;
        this.f21261c = timeZone;
        this.f21262d = displayMetrics;
        String str = Build.MANUFACTURER;
        C8467mq.m23878a((Object) str, "MANUFACTURER");
        this.f21263e = str;
        this.f21264f = Build.MODEL;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ C8212ez(android.content.Context r3, java.util.TimeZone r4) {
        /*
            r2 = this;
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r1 = "getSystem().displayMetrics"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r0, (java.lang.String) r1)
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8212ez.<init>(android.content.Context, java.util.TimeZone):void");
    }

    /* renamed from: com.ogury.ed.internal.ez$a */
    public static final class C8213a {
        public /* synthetic */ C8213a(byte b) {
            this();
        }

        private C8213a() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8212ez(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            com.ogury.p245ed.internal.C8467mq.m23881b(r3, r0)
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.lang.String r1 = "getTimeZone(\"UTC\")"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r0, (java.lang.String) r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8212ez.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static String m22966a() {
        String str = Build.VERSION.RELEASE;
        C8467mq.m23878a((Object) str, "RELEASE");
        return str;
    }

    /* renamed from: b */
    public static int m22969b() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: c */
    public static String m22970c() {
        String property = System.getProperty("java.vm.version");
        return property == null ? "" : property;
    }

    /* renamed from: d */
    public static String m22971d() {
        String property = System.getProperty("java.vm.name");
        return property == null ? "" : property;
    }

    /* renamed from: e */
    public static String m22972e() {
        String property = System.getProperty("os.arch");
        return property == null ? "" : property;
    }

    /* renamed from: f */
    public static String m22973f() {
        try {
            String format = new SimpleDateFormat("Z", Locale.US).format(new Date());
            StringBuilder sb = new StringBuilder();
            C8467mq.m23878a((Object) format, "formattedTime");
            String substring = format.substring(0, 3);
            C8467mq.m23878a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(':');
            String substring2 = format.substring(3, format.length());
            C8467mq.m23878a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring2);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: g */
    public final String mo53454g() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(this.f21261c);
        String format = simpleDateFormat.format(date);
        C8467mq.m23878a((Object) format, "format.format(currentLocalDate)");
        return format;
    }

    /* renamed from: h */
    public final boolean mo53455h() {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                if (Build.VERSION.SDK_INT < 21) {
                    if (Build.VERSION.SDK_INT < 17 || Settings.Global.getInt(this.f21260b.getContentResolver(), "install_non_market_apps", 0) != 1) {
                        return false;
                    }
                    return true;
                }
            }
            if (Settings.Secure.getInt(this.f21260b.getContentResolver(), "install_non_market_apps", 0) != 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = m22968a(r3.f21263e, r0);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo53456i() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f21264f
            java.lang.String r1 = "Unknown"
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.String r2 = r3.f21263e
            java.lang.String r0 = m22968a(r2, r0)
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8212ez.mo53456i():java.lang.String");
    }

    /* renamed from: a */
    private static String m22968a(String str, String str2) {
        if (C8516oc.m23952b(str2, str)) {
            return str2;
        }
        return str + ' ' + str2;
    }

    /* renamed from: j */
    public final String mo53457j() {
        try {
            NetworkInfo a = C8243fw.m23156a(this.f21260b);
            return a != null ? m22967a(a) : "UNKNOWN";
        } catch (Exception unused) {
            return "NONE";
        }
    }

    /* renamed from: a */
    private static String m22967a(NetworkInfo networkInfo) {
        if (C8243fw.m23157a(networkInfo)) {
            String typeName = networkInfo.getTypeName();
            C8467mq.m23878a((Object) typeName, "{\n            info.typeName\n        }");
            return typeName;
        }
        return networkInfo.getTypeName() + " - " + networkInfo.getSubtypeName();
    }

    /* renamed from: k */
    public final int mo53458k() {
        return this.f21262d.widthPixels;
    }

    /* renamed from: l */
    public final int mo53459l() {
        return this.f21262d.heightPixels;
    }

    /* renamed from: a */
    public final Rect mo53453a(View view) {
        C8467mq.m23881b(view, "view");
        Rect rect = new Rect(0, 0, this.f21262d.widthPixels, this.f21262d.heightPixels);
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (Exception unused) {
        }
        return rect;
    }

    /* renamed from: m */
    public final int mo53460m() {
        Object systemService = this.f21260b.getSystemService("audio");
        if (systemService != null) {
            return ((AudioManager) systemService).getStreamVolume(3);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }

    /* renamed from: n */
    public final String mo53461n() {
        return this.f21260b.getResources().getConfiguration().orientation == 2 ? "landscape" : "portrait";
    }

    /* renamed from: o */
    public final float mo53462o() {
        return this.f21262d.density;
    }

    /* renamed from: p */
    public final boolean mo53463p() {
        return this.f21260b.getResources().getConfiguration().orientation == 1;
    }
}
