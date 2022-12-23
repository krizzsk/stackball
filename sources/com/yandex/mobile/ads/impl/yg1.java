package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URI;
import java.util.regex.Pattern;

public final class yg1 {

    /* renamed from: a */
    private static final Pattern f42850a = Pattern.compile("maps.yandex");

    /* renamed from: com.yandex.mobile.ads.impl.yg1$a */
    public enum C15250a {
        GOOGLE_MARKET_SCHEME("market:"),
        GOOGLE_PLAY_SCHEME("play:"),
        GOOGLE_MARKET_HTTPS("https://market.android"),
        GOOGLE_MARKET_HTTP("http://market.android"),
        GOOGLE_PLAY_HTTPS("https://play.google"),
        GOOGLE_PLAY_HTTP("http://play.google");
        

        /* renamed from: b */
        final String f42858b;

        private C15250a(String str) {
            this.f42858b = str;
        }
    }

    /* renamed from: a */
    public static boolean m44320a(Context context, String str, boolean z) {
        if (context == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (z && m44323d(str)) {
                intent.setPackage("ru.yandex.yandexmaps");
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m44322b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C15250a[] aVarArr = {C15250a.GOOGLE_MARKET_SCHEME, C15250a.GOOGLE_PLAY_SCHEME, C15250a.GOOGLE_MARKET_HTTPS, C15250a.GOOGLE_MARKET_HTTP, C15250a.GOOGLE_PLAY_HTTPS, C15250a.GOOGLE_PLAY_HTTP};
            for (int i = 0; i < 6; i++) {
                if (str.startsWith(aVarArr[i].f42858b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m44323d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (!parse.isHierarchical()) {
                return false;
            }
            String host = parse.getHost();
            if (TextUtils.isEmpty(parse.getQueryParameter("oid")) || !f42850a.matcher(host).find()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo71077c(String str) {
        try {
            new URI(str);
            return !TextUtils.isEmpty(str);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m44321a(String str) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            C15250a[] values = C15250a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (str.startsWith(values[i].f42858b)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        if (z || !URLUtil.isNetworkUrl(str)) {
            return false;
        }
        return true;
    }
}
