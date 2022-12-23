package com.ogury.p245ed.internal;

import com.google.android.exoplayer2.C3716C;
import java.nio.charset.Charset;

/* renamed from: com.ogury.ed.internal.nz */
public final class C8506nz {

    /* renamed from: a */
    public static final Charset f21713a;

    /* renamed from: b */
    public static final Charset f21714b;

    /* renamed from: c */
    public static final Charset f21715c;

    /* renamed from: d */
    public static final Charset f21716d;

    /* renamed from: e */
    public static final Charset f21717e;

    /* renamed from: f */
    public static final Charset f21718f;

    /* renamed from: g */
    public static final C8506nz f21719g = new C8506nz();

    static {
        Charset forName = Charset.forName("UTF-8");
        C8467mq.m23878a((Object) forName, "Charset.forName(\"UTF-8\")");
        f21713a = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C8467mq.m23878a((Object) forName2, "Charset.forName(\"UTF-16\")");
        f21714b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C8467mq.m23878a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        f21715c = forName3;
        Charset forName4 = Charset.forName(C3716C.UTF16LE_NAME);
        C8467mq.m23878a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        f21716d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C8467mq.m23878a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        f21717e = forName5;
        Charset forName6 = Charset.forName(C3716C.ISO88591_NAME);
        C8467mq.m23878a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f21718f = forName6;
    }

    private C8506nz() {
    }
}
