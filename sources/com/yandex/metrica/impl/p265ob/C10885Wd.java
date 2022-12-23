package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.Wd */
public class C10885Wd extends C10839Vd {
    public C10885Wd(String str) {
        super(m28135a(str));
    }

    /* renamed from: a */
    private static String m28135a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return "http".equals(parse.getScheme()) ? parse.buildUpon().scheme("https").build().toString() : str;
    }
}
