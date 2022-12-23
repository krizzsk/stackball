package com.ogury.core.internal;

import com.google.android.exoplayer2.C3716C;
import java.nio.charset.Charset;

/* renamed from: com.ogury.core.internal.au */
/* compiled from: Charsets.kt */
public final class C7935au {

    /* renamed from: a */
    public static final Charset f20699a;

    static {
        new C7935au();
        Charset forName = Charset.forName("UTF-8");
        C7921ai.m22142a((Object) forName, "Charset.forName(\"UTF-8\")");
        f20699a = forName;
        C7921ai.m22142a((Object) Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        C7921ai.m22142a((Object) Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        C7921ai.m22142a((Object) Charset.forName(C3716C.UTF16LE_NAME), "Charset.forName(\"UTF-16LE\")");
        C7921ai.m22142a((Object) Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        C7921ai.m22142a((Object) Charset.forName(C3716C.ISO88591_NAME), "Charset.forName(\"ISO-8859-1\")");
    }

    private C7935au() {
    }
}
