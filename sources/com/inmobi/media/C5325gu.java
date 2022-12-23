package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.net.URISyntaxException;
import java.net.URLDecoder;

/* renamed from: com.inmobi.media.gu */
/* compiled from: ClickUrlHandler */
public class C5325gu {

    /* renamed from: a */
    private static final String f12209a = C5325gu.class.getSimpleName();

    /* renamed from: a */
    public static boolean m12257a(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (context == null) {
            return m12258a(Uri.parse(str));
        }
        try {
            if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(context.getPackageManager()) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m12261b(Context context, String str) throws URISyntaxException, ActivityNotFoundException {
        while (context != null) {
            try {
                Intent parseUri = Intent.parseUri(str, 0);
                parseUri.setFlags(268435456);
                context.startActivity(parseUri);
                return;
            } catch (ActivityNotFoundException e) {
                if (SDKConstants.PARAM_INTENT.equals(Uri.parse(str).getScheme())) {
                    str = m12260b(str);
                    if (TextUtils.isEmpty(str)) {
                    }
                }
                throw e;
            }
        }
    }

    /* renamed from: a */
    public static String m12256a(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            if (parseUri.resolveActivity(context.getPackageManager()) != null) {
                parseUri.setFlags(268435456);
                context.startActivity(parseUri);
                return str;
            } else if (!TextUtils.isEmpty(str2)) {
                return m12256a(context, str2, (String) null);
            } else {
                if (SDKConstants.PARAM_INTENT.equals(Uri.parse(str).getScheme())) {
                    String b = m12260b(str);
                    if (!TextUtils.isEmpty(b)) {
                        return m12256a(context, URLDecoder.decode(b, "UTF-8"), (String) null);
                    }
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static String m12260b(String str) {
        try {
            return Intent.parseUri(str, 1).getStringExtra("browser_fallback_url");
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m12258a(Uri uri) {
        return "http".equals(uri.getScheme()) || "https".equals(uri.getScheme());
    }

    /* renamed from: a */
    public static boolean m12259a(String str) {
        Uri parse = Uri.parse(str);
        return m12258a(parse) && !"play.google.com".equals(parse.getHost()) && !"market.android.com".equals(parse.getHost()) && !"market".equals(parse.getScheme());
    }
}
