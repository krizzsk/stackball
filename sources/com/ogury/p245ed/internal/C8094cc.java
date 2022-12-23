package com.ogury.p245ed.internal;

import android.app.Activity;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cc */
public final class C8094cc {
    /* renamed from: a */
    public static final String m22563a(Activity activity) {
        C8467mq.m23881b(activity, "<this>");
        String a = m22564a((Object) activity);
        List b = C8516oc.m23968b((CharSequence) a, new char[]{'.'});
        if (b.size() <= 2) {
            return a;
        }
        return ((String) b.get(0)) + '.' + ((String) b.get(1)) + '.';
    }

    /* renamed from: a */
    public static final String m22564a(Object obj) {
        C8467mq.m23881b(obj, "<this>");
        String canonicalName = obj.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        String name = obj.getClass().getName();
        C8467mq.m23878a((Object) name, "this.javaClass.name");
        return name;
    }
}
