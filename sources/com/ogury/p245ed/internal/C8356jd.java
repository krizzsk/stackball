package com.ogury.p245ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.jd */
public final class C8356jd {

    /* renamed from: a */
    public static final C8357a f21588a = new C8357a((byte) 0);

    /* renamed from: b */
    private final C8358je f21589b;

    /* renamed from: c */
    private final C8358je f21590c;

    /* renamed from: d */
    private final C8358je f21591d;

    /* renamed from: e */
    private final C8358je f21592e;

    public /* synthetic */ C8356jd(C8358je jeVar, C8358je jeVar2, C8358je jeVar3, C8358je jeVar4, byte b) {
        this(jeVar, jeVar2, jeVar3, jeVar4);
    }

    private C8356jd(C8358je jeVar, C8358je jeVar2, C8358je jeVar3, C8358je jeVar4) {
        this.f21589b = jeVar;
        this.f21590c = jeVar2;
        this.f21591d = jeVar3;
        this.f21592e = jeVar4;
    }

    /* renamed from: com.ogury.ed.internal.jd$a */
    public static final class C8357a {
        public /* synthetic */ C8357a(byte b) {
            this();
        }

        private C8357a() {
        }

        /* renamed from: a */
        public static C8356jd m23676a(Context context, C8185eb ebVar) {
            C8467mq.m23881b(context, "context");
            C8467mq.m23881b(ebVar, "ad");
            C8212ez ezVar = new C8212ez(context);
            C8360jg jgVar = new C8360jg(ezVar);
            C8358je jfVar = new C8359jf(ezVar, C8187ed.m22860a(ebVar));
            return new C8356jd(jgVar, new C8355jc(ezVar, jfVar, ebVar), new C8354jb(), jfVar, (byte) 0);
        }
    }

    /* renamed from: a */
    public final void mo53798a(C8362jh jhVar) {
        C8467mq.m23881b(jhVar, "webView");
        this.f21589b.mo53797a(jhVar.getMraidCommandExecutor());
    }

    /* renamed from: b */
    public final void mo53799b(C8362jh jhVar) {
        C8467mq.m23881b(jhVar, "webView");
        this.f21590c.mo53797a(jhVar.getMraidCommandExecutor());
    }

    /* renamed from: c */
    public final void mo53800c(C8362jh jhVar) {
        C8467mq.m23881b(jhVar, "webView");
        this.f21591d.mo53797a(jhVar.getMraidCommandExecutor());
    }

    /* renamed from: d */
    public final void mo53801d(C8362jh jhVar) {
        C8467mq.m23881b(jhVar, "webView");
        this.f21592e.mo53797a(jhVar.getMraidCommandExecutor());
    }
}
