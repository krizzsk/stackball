package com.ogury.p245ed.internal;

import android.content.Context;
import com.ogury.p245ed.internal.C8229fk;

/* renamed from: com.ogury.ed.internal.fn */
public final class C8233fn {

    /* renamed from: a */
    public static final C8233fn f21330a = new C8233fn();

    /* renamed from: b */
    private static C8232fm f21331b;

    private C8233fn() {
    }

    /* renamed from: a */
    public static C8232fm m23112a() {
        return f21331b;
    }

    /* renamed from: a */
    public static void m23114a(C8232fm fmVar) {
        C8467mq.m23881b(fmVar, "newProfig");
        f21331b = fmVar;
    }

    /* renamed from: a */
    public static C8232fm m23113a(Context context) {
        C8467mq.m23881b(context, "context");
        if (f21331b == null) {
            C8229fk.C8230a aVar = C8229fk.f21305a;
            String d = C8229fk.C8230a.m23074a(context).mo53514d();
            C8234fo foVar = C8234fo.f21332a;
            f21331b = C8234fo.m23116a(d);
        }
        return f21331b;
    }

    /* renamed from: b */
    public static void m23115b(Context context) throws C8201eq {
        C8467mq.m23881b(context, "context");
        C8219fc.f21271a.mo53483a(context).mo53482b();
    }
}
