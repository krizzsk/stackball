package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7317b;
import com.p243my.target.C7524l3;

/* renamed from: com.my.target.o */
public final class C7572o extends C7317b<C7665t2> {

    /* renamed from: f */
    public final C7665t2 f19103f;

    /* renamed from: com.my.target.o$b */
    public static class C7574b implements C7317b.C7318a<C7665t2> {
        public C7574b() {
        }

        /* renamed from: a */
        public C7372e mo49693a() {
            return C7372e.m18984a();
        }

        /* renamed from: b */
        public boolean mo49694b() {
            return true;
        }

        /* renamed from: c */
        public C7355d<C7665t2> mo49695c() {
            return C7615q.m20116a();
        }

        /* renamed from: d */
        public C7337c<C7665t2> mo49696d() {
            return C7592p.m20043a();
        }
    }

    /* renamed from: com.my.target.o$c */
    public interface C7575c extends C7317b.C7319b<C7665t2> {
    }

    public C7572o(C7298a aVar, C7524l3.C7525a aVar2, C7665t2 t2Var) {
        super(new C7574b(), aVar, aVar2);
        this.f19103f = t2Var;
    }

    /* renamed from: a */
    public static C7317b<C7665t2> m19961a(C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7572o(aVar, aVar2, (C7665t2) null);
    }

    /* renamed from: a */
    public static C7317b<C7665t2> m19962a(C7665t2 t2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7572o(aVar, aVar2, t2Var);
    }

    /* renamed from: d */
    public C7665t2 mo49686a(C7524l3 l3Var, Context context) {
        C7665t2 t2Var = this.f19103f;
        return (C7665t2) (t2Var != null ? mo49688a(t2Var, context) : super.mo49686a(l3Var, context));
    }
}
