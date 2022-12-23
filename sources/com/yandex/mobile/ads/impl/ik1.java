package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.C12115n;
import com.yandex.mobile.ads.core.initializer.C12158e;

public class ik1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f34901a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C15230y2 f34902b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C14645t1 f34903c = new C14645t1(C12115n.VASTVIDEO);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final gk1 f34904d;

    /* renamed from: e */
    private final ei1 f34905e;

    /* renamed from: f */
    private final C12158e f34906f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final xj1 f34907g;

    public ik1(Context context, C15230y2 y2Var) {
        this.f34901a = context.getApplicationContext();
        this.f34902b = y2Var;
        this.f34904d = gk1.m36632a(context);
        this.f34905e = new ei1(y2Var);
        this.f34907g = new xj1();
        this.f34906f = new C12158e(context, pj0.m40784a().mo69371b(), y2Var);
    }

    /* renamed from: a */
    public void mo67815a(jp1 jp1, Object obj, le0 le0, r41<ep1> r41) {
        this.f34906f.mo64752a(le0, (C12158e.C12160b) new C13417a(r41, jp1, obj));
    }

    /* renamed from: a */
    public void mo67816a(ki1 ki1, Object obj, r41<ci1> r41) {
        di1 a = this.f34905e.mo66832a(this.f34901a, ki1, r41);
        this.f34902b.mo70968a(C15139x2.VAST_LOADING, (Object) ki1);
        this.f34904d.mo67319a(this.f34901a, this.f34903c, ki1, obj, (r41<ci1>) a);
    }

    /* renamed from: com.yandex.mobile.ads.impl.ik1$a */
    class C13417a implements C12158e.C12160b {

        /* renamed from: a */
        final /* synthetic */ r41 f34908a;

        /* renamed from: b */
        final /* synthetic */ jp1 f34909b;

        /* renamed from: c */
        final /* synthetic */ Object f34910c;

        C13417a(r41 r41, jp1 jp1, Object obj) {
            this.f34908a = r41;
            this.f34909b = jp1;
            this.f34910c = obj;
        }

        /* renamed from: a */
        public void mo64612a(C14564s6 s6Var, l30 l30) {
            mp1 mp1 = new mp1(ik1.this.f34902b, this.f34908a);
            ik1.m37447a(ik1.this, s6Var, l30);
            ik1.this.f34902b.mo70970b(C15139x2.VMAP_LOADING);
            ik1.this.f34904d.mo67318a(ik1.this.f34901a, ik1.this.f34903c, this.f34909b, this.f34910c, (r41<ep1>) mp1);
        }

        /* renamed from: a */
        public void mo64611a(C12350a2 a2Var) {
            this.f34908a.mo66589a(ik1.this.f34907g.mo70908a(a2Var));
        }
    }

    /* renamed from: a */
    static void m37447a(ik1 ik1, C14564s6 s6Var, l30 l30) {
        ik1.f34903c.mo70087a(s6Var);
        ik1.f34903c.mo70086a(l30);
    }
}
