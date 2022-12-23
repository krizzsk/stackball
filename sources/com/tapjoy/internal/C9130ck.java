package com.tapjoy.internal;

import android.content.Context;
import android.os.Handler;

/* renamed from: com.tapjoy.internal.ck */
public final class C9130ck {

    /* renamed from: a */
    private static C9131cl f22447a = new C9131cl();

    /* renamed from: a */
    public static String m24466a() {
        return "1.2.19-Tapjoy";
    }

    /* renamed from: b */
    public static boolean m24468b() {
        return f22447a.f22448a;
    }

    /* renamed from: a */
    public static boolean m24467a(Context context) {
        C9131cl clVar = f22447a;
        Context applicationContext = context.getApplicationContext();
        C9166do.m24543a((Object) applicationContext, "Application Context cannot be null");
        if (!clVar.f22448a) {
            clVar.f22448a = true;
            C9157dh a = C9157dh.m24521a();
            a.f22516b = new C9135cp(new Handler(), applicationContext, new C9132cm(), a);
            C9151de.m24509a().f22502a = applicationContext.getApplicationContext();
            C9163dm.m24532a(applicationContext);
            C9154df.m24514a().f22509a = applicationContext != null ? applicationContext.getApplicationContext() : null;
        }
        return true;
    }
}
