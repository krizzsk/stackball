package com.ogury.p245ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.iv */
public final class C8345iv {

    /* renamed from: a */
    private final Context f21553a;

    /* renamed from: b */
    private final C8349iy f21554b;

    /* renamed from: c */
    private final C8431lj<C8386ke> f21555c;

    public C8345iv(Context context, C8349iy iyVar, C8431lj<C8386ke> ljVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(iyVar, "mraidViewCommands");
        this.f21553a = context;
        this.f21554b = iyVar;
        this.f21555c = ljVar;
    }

    /* renamed from: a */
    public final C8346iw mo53772a(C8362jh jhVar) {
        C8467mq.m23881b(jhVar, "mraidWebView");
        C8346iw iwVar = new C8346iw(this.f21553a, jhVar.getMraidCommandExecutor(), this.f21554b, C8279gz.f21399a, C8288hg.f21407a, new C8216fa(this.f21553a), new C8212ez(this.f21553a));
        iwVar.mo53773a(this.f21555c);
        return iwVar;
    }
}
