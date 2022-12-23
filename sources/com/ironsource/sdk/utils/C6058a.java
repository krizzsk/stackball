package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.C5527g;

/* renamed from: com.ironsource.sdk.utils.a */
public final class C6058a {

    /* renamed from: g */
    private static C6058a f14844g;

    /* renamed from: a */
    public String f14845a = C5527g.m13151h();

    /* renamed from: b */
    public String f14846b = C5527g.m13150g();

    /* renamed from: c */
    public String f14847c = C5527g.m13153i();

    /* renamed from: d */
    public String f14848d = C5527g.m13146e();

    /* renamed from: e */
    public int f14849e = C5527g.m13147f();

    /* renamed from: f */
    public String f14850f;

    private C6058a(Context context) {
        this.f14850f = C5527g.m13155j(context);
    }

    /* renamed from: a */
    public static C6058a m14963a(Context context) {
        if (f14844g == null) {
            f14844g = new C6058a(context);
        }
        return f14844g;
    }

    /* renamed from: a */
    public static String m14964a() {
        return "5.105";
    }

    /* renamed from: b */
    public static float m14965b(Context context) {
        return C5527g.m13161m(context);
    }

    /* renamed from: b */
    public static void m14966b() {
        f14844g = null;
    }
}
