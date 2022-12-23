package com.yandex.metrica.impl.p265ob;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.c0 */
public class C11096c0 {

    /* renamed from: f */
    private static final Object f26636f = new Object();

    /* renamed from: g */
    private static volatile C11096c0 f26637g;

    /* renamed from: a */
    public final String f26638a = Build.MANUFACTURER;

    /* renamed from: b */
    public final String f26639b = Build.MODEL;

    /* renamed from: c */
    public final String f26640c = Build.VERSION.RELEASE;

    /* renamed from: d */
    public final int f26641d = Build.VERSION.SDK_INT;

    /* renamed from: e */
    public final String f26642e = String.valueOf(C11701r2.m30142a());

    /* renamed from: com.yandex.metrica.impl.ob.c0$a */
    class C11097a extends ArrayList<String> {
        C11097a(C11096c0 c0Var) {
            if (C11701r2.m30143b()) {
                add("Superuser.apk");
            }
            if (C11701r2.m30144c()) {
                add("su.so");
            }
        }
    }

    public C11096c0() {
        Collections.unmodifiableList(new C11097a(this));
    }

    /* renamed from: a */
    public static C11096c0 m28615a() {
        if (f26637g == null) {
            synchronized (f26636f) {
                if (f26637g == null) {
                    f26637g = new C11096c0();
                }
            }
        }
        return f26637g;
    }
}
