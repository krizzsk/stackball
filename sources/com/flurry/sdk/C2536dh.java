package com.flurry.sdk;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.dh */
public class C2536dh {

    /* renamed from: a */
    private final Pattern f5952a = Pattern.compile(".*?(%\\{\\w+\\}).*?");

    /* renamed from: a */
    public final String mo17751a(String str) {
        Matcher matcher = this.f5952a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    protected static boolean m5503a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals("%{" + str + "}");
    }
}
