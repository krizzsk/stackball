package com.ogury.p245ed.internal;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ogury.p245ed.internal.C8229fk;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.MissingResourceException;

/* renamed from: com.ogury.ed.internal.fa */
public final class C8216fa {

    /* renamed from: a */
    public static final C8217a f21267a = new C8217a((byte) 0);

    /* renamed from: b */
    private final Context f21268b;

    /* renamed from: c */
    private final C8229fk f21269c;

    private C8216fa(Context context, C8229fk fkVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(fkVar, "profigDao");
        this.f21268b = context;
        this.f21269c = fkVar;
    }

    /* renamed from: a */
    public final Context mo53471a() {
        return this.f21268b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8216fa(Context context) {
        this(context, C8229fk.C8230a.m23074a(context));
        C8229fk.C8230a aVar = C8229fk.f21305a;
    }

    /* renamed from: com.ogury.ed.internal.fa$a */
    public static final class C8217a {
        public /* synthetic */ C8217a(byte b) {
            this();
        }

        private C8217a() {
        }
    }

    /* renamed from: a */
    public final boolean mo53472a(String str) {
        C8467mq.m23881b(str, "permission");
        return C8257gh.m23192a(this.f21268b, str);
    }

    /* renamed from: b */
    public final String mo53473b() {
        return this.f21269c.mo53521i();
    }

    /* renamed from: c */
    public final String mo53474c() {
        if (Build.VERSION.SDK_INT >= 24) {
            String language = this.f21268b.getResources().getConfiguration().getLocales().get(0).getLanguage();
            C8467mq.m23878a((Object) language, "{\n            context.re…les[0].language\n        }");
            return language;
        }
        String language2 = this.f21268b.getResources().getConfiguration().locale.getLanguage();
        C8467mq.m23878a((Object) language2, "{\n            context.re…locale.language\n        }");
        return language2;
    }

    /* renamed from: d */
    public final String mo53475d() {
        String j = m22995j();
        if (j == null || j.length() != 3) {
            return m22996k();
        }
        return j;
    }

    /* renamed from: j */
    private final String m22995j() {
        try {
            Object systemService = this.f21268b.getSystemService("phone");
            if (systemService != null) {
                return new Locale("", ((TelephonyManager) systemService).getNetworkCountryIso()).getISO3Country();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: k */
    private final String m22996k() {
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                str = this.f21268b.getResources().getConfiguration().getLocales().get(0).getISO3Country();
            } else {
                str = this.f21268b.getResources().getConfiguration().locale.getISO3Country();
            }
            C8467mq.m23878a((Object) str, "{\n            if (Build.…y\n            }\n        }");
            return str;
        } catch (MissingResourceException unused) {
            return "ZZZ";
        }
    }

    /* renamed from: e */
    public final String mo53476e() {
        return "4.2.0/" + mo53473b() + '/' + Build.VERSION.RELEASE;
    }

    /* renamed from: f */
    public final String mo53477f() {
        String packageName = this.f21268b.getPackageName();
        C8467mq.m23878a((Object) packageName, "context.packageName");
        return packageName;
    }

    /* renamed from: g */
    public final String mo53478g() {
        String str;
        Constructor<WebSettings> declaredConstructor;
        if (Build.VERSION.SDK_INT >= 17) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f21268b);
            C8467mq.m23878a((Object) defaultUserAgent, "{\n            WebSetting…rAgent(context)\n        }");
            return defaultUserAgent;
        }
        try {
            declaredConstructor = WebSettings.class.getDeclaredConstructor(new Class[]{Context.class, WebView.class});
            C8467mq.m23878a((Object) declaredConstructor, "WebSettings::class.java.…ava, WebView::class.java)");
            declaredConstructor.setAccessible(true);
            WebSettings newInstance = declaredConstructor.newInstance(new Object[]{this.f21268b, null});
            C8467mq.m23878a((Object) newInstance, "constructor.newInstance(context, null)");
            str = newInstance.getUserAgentString();
            declaredConstructor.setAccessible(false);
        } catch (Exception unused) {
            str = new WebView(this.f21268b).getSettings().getUserAgentString();
        } catch (Throwable th) {
            declaredConstructor.setAccessible(false);
            throw th;
        }
        C8467mq.m23878a((Object) str, "try {\n            val co…userAgentString\n        }");
        return str;
    }

    /* renamed from: h */
    public final int mo53479h() {
        try {
            return this.f21268b.getPackageManager().getApplicationInfo(this.f21268b.getPackageName(), 128).targetSdkVersion;
        } catch (Exception unused) {
            return 14;
        }
    }

    /* renamed from: i */
    public final String mo53480i() {
        return m22994a(this.f21268b);
    }

    /* renamed from: a */
    private static String m22994a(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            C8467mq.m23878a((Object) str, "{\n            val packag…nfo.versionName\n        }");
            return str;
        } catch (Exception unused) {
            return "";
        }
    }
}
