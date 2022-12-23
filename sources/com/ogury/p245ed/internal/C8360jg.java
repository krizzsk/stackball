package com.ogury.p245ed.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ogury.ed.internal.jg */
public final class C8360jg implements C8358je {

    /* renamed from: a */
    private final C8212ez f21595a;

    public C8360jg(C8212ez ezVar) {
        C8467mq.m23881b(ezVar, "androidDevice");
        this.f21595a = ezVar;
    }

    /* renamed from: com.ogury.ed.internal.jg$a */
    static final class C8361a extends C8468mr implements C8431lj<C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8360jg f21596a;

        /* renamed from: b */
        final /* synthetic */ C8282hb f21597b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8361a(C8360jg jgVar, C8282hb hbVar) {
            super(0);
            this.f21596a = jgVar;
            this.f21597b = hbVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m23683b();
            return C8386ke.f21633a;
        }

        /* renamed from: b */
        private void m23683b() {
            this.f21596a.m23681b(this.f21597b);
        }
    }

    /* renamed from: a */
    public final void mo53797a(C8282hb hbVar) {
        C8467mq.m23881b(hbVar, "mraidCommandExecutor");
        C8268gr.m23214a(hbVar.mo53634a(), new C8361a(this, hbVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m23681b(C8282hb hbVar) {
        C8362jh a = hbVar.mo53634a();
        int a2 = C8258gi.m23194a(a.getWidth());
        int a3 = C8258gi.m23194a(a.getHeight());
        ViewParent parent = a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = a;
        }
        int a4 = C8258gi.m23193a(viewGroup.getX());
        int a5 = C8258gi.m23193a(viewGroup.getY());
        Rect a6 = this.f21595a.mo53453a((View) hbVar.mo53634a());
        hbVar.mo53645b(C8258gi.m23194a(a6.width()), C8258gi.m23194a(a6.height()));
        hbVar.mo53637a(a2, a3, a4, a5);
    }
}
