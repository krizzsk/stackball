package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.config.a */
public final class C2739a {
    /* renamed from: a */
    public static String m5957a() {
        String a = C2788f.m6073a();
        if (!TextUtils.isEmpty(a)) {
            return m5958a(a, "Event");
        }
        return "https://" + IAConfigManager.f6419n.f6436h.f6613h;
    }

    /* renamed from: b */
    public static String m5960b() {
        String a = C2788f.m6073a();
        if (TextUtils.isEmpty(a)) {
            return "wv.inner-active.mobi/simpleM2M/";
        }
        return a + ".inner-active.mobi/simpleM2M/";
    }

    /* renamed from: c */
    public static int m5961c() {
        return IAConfigManager.f6419n.f6436h.f6609d;
    }

    /* renamed from: a */
    public static C2808t m5956a(String str) {
        if (IAConfigManager.f6419n.f6431c != null && IAConfigManager.f6419n.f6431c.containsKey(str)) {
            return IAConfigManager.f6419n.f6431c.get(str);
        }
        IAlog.m9035c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    /* renamed from: b */
    public static C2807s m5959b(String str) {
        if (IAConfigManager.f6419n.f6430b == null || !IAConfigManager.f6419n.f6430b.containsKey(str)) {
            return null;
        }
        return IAConfigManager.f6419n.f6430b.get(str);
    }

    /* renamed from: a */
    public static String m5958a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return "https://" + str + "/simpleM2M/" + str2;
        }
        return "https://" + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
