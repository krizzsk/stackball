package com.ogury.p244cm.internal;

import com.google.android.exoplayer2.C3716C;
import java.nio.charset.Charset;

/* renamed from: com.ogury.cm.internal.bbbcb */
public final class bbbcb {

    /* renamed from: a */
    public static final Charset f20637a;

    /* renamed from: b */
    public static final Charset f20638b;

    /* renamed from: c */
    public static final Charset f20639c;

    /* renamed from: d */
    public static final Charset f20640d;

    /* renamed from: e */
    public static final Charset f20641e;

    /* renamed from: f */
    public static final Charset f20642f;

    /* renamed from: g */
    public static final bbbcb f20643g = new bbbcb();

    static {
        Charset forName = Charset.forName("UTF-8");
        bbabc.m22048a((Object) forName, "Charset.forName(\"UTF-8\")");
        f20637a = forName;
        Charset forName2 = Charset.forName("UTF-16");
        bbabc.m22048a((Object) forName2, "Charset.forName(\"UTF-16\")");
        f20638b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        bbabc.m22048a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        f20639c = forName3;
        Charset forName4 = Charset.forName(C3716C.UTF16LE_NAME);
        bbabc.m22048a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        f20640d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        bbabc.m22048a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        f20641e = forName5;
        Charset forName6 = Charset.forName(C3716C.ISO88591_NAME);
        bbabc.m22048a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f20642f = forName6;
    }

    private bbbcb() {
    }
}
