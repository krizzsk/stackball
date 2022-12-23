package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ogury.ed.internal.jf */
public final class C8359jf implements C8358je {

    /* renamed from: a */
    private final C8212ez f21593a;

    /* renamed from: b */
    private final boolean f21594b;

    public C8359jf(C8212ez ezVar, boolean z) {
        C8467mq.m23881b(ezVar, "androidDevice");
        this.f21593a = ezVar;
        this.f21594b = z;
    }

    /* renamed from: a */
    public final void mo53797a(C8282hb hbVar) {
        C8467mq.m23881b(hbVar, "mraidCommandExecutor");
        int a = C8258gi.m23194a(this.f21593a.mo53458k());
        int a2 = C8258gi.m23194a(this.f21593a.mo53459l());
        Rect a3 = this.f21593a.mo53453a((View) hbVar.mo53634a());
        hbVar.mo53636a(a, a2);
        hbVar.mo53645b(C8258gi.m23194a(a3.width()), C8258gi.m23194a(a3.height()));
        m23678b(hbVar);
    }

    /* renamed from: b */
    private final void m23678b(C8282hb hbVar) {
        String n = this.f21593a.mo53461n();
        hbVar.mo53641a(n, this.f21594b);
        if (!this.f21594b) {
            n = "none";
        }
        hbVar.mo53643a(!this.f21594b, n);
    }
}
