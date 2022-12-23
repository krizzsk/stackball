package com.yandex.metrica.impl.p265ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.bb */
public class C11077bb {

    /* renamed from: a */
    private final Context f26594a;

    /* renamed from: b */
    private final String f26595b;

    /* renamed from: c */
    private final C11108cb f26596c;

    /* renamed from: d */
    private final C11011a1 f26597d;

    /* renamed from: e */
    private final C10616Om f26598e;

    /* renamed from: f */
    private final C10691R2 f26599f;

    public C11077bb(Context context, String str, C11108cb cbVar, C11011a1 a1Var) {
        this(context, str, cbVar, a1Var, new C10580Nm(), new C10691R2());
    }

    /* renamed from: a */
    public boolean mo62690a(C10880Wa wa) {
        long b = this.f26598e.mo61841b();
        if (wa == null) {
            return false;
        }
        boolean z = true;
        boolean z2 = b <= wa.f26152a;
        if (!z2) {
            z = z2;
        } else if (b + this.f26597d.mo61544a() > wa.f26152a) {
            z = false;
        }
        if (!z) {
            return false;
        }
        C10184D9 d9 = new C10184D9(C10663Qa.m27298a(this.f26594a).mo61964g());
        C10691R2 r2 = this.f26599f;
        long a = this.f26596c.mo62351a(d9);
        long j = (long) wa.f26153b;
        return r2.mo62107b(a, j, this.f26595b + " diagnostics event");
    }

    C11077bb(Context context, String str, C11108cb cbVar, C11011a1 a1Var, C10616Om om, C10691R2 r2) {
        this.f26594a = context;
        this.f26595b = str;
        this.f26596c = cbVar;
        this.f26597d = a1Var;
        this.f26598e = om;
        this.f26599f = r2;
    }
}
