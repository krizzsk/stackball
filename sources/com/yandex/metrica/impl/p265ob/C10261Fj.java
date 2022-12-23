package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Fj */
public class C10261Fj {

    /* renamed from: b */
    private static volatile C10261Fj f24702b;

    /* renamed from: a */
    private final C11054an f24703a;

    C10261Fj(C11054an anVar) {
        this.f24703a = anVar;
    }

    /* renamed from: a */
    public static C10261Fj m26320a(Context context) {
        if (f24702b == null) {
            synchronized (C10261Fj.class) {
                if (f24702b == null) {
                    f24702b = new C10261Fj(new C11054an(context, "uuid.dat"));
                }
            }
        }
        return f24702b;
    }

    /* renamed from: b */
    public C10227Ej mo61333b(Context context, C10168Cj cj) {
        return new C10227Ej(cj, new C10142Bj(), this.f24703a, new C10317Gj(context, new C10442L0(), new C10732Rm()));
    }

    /* renamed from: a */
    public C10227Ej mo61332a(Context context, C10168Cj cj) {
        return new C10227Ej(cj, new C10343Hj(context, new C10442L0()), this.f24703a, new C10317Gj(context, new C10442L0(), new C10732Rm()));
    }
}
