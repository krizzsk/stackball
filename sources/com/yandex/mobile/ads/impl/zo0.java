package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

public class zo0 {

    /* renamed from: a */
    private static final Pattern f43248a = Pattern.compile("(<script)(.*)(src=\"mraid\\.js\")(.*)(<\\/script>)");

    /* renamed from: a */
    public boolean mo71268a(String str) {
        return f43248a.matcher(str).find();
    }
}
