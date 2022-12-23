package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7317b;
import com.p243my.target.C7524l3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.f */
public final class C7391f extends C7317b<C7632r2> {

    /* renamed from: f */
    public final List<C7617q1> f18552f;

    /* renamed from: g */
    public final C7710v8 f18553g;

    /* renamed from: h */
    public Runnable f18554h;

    /* renamed from: com.my.target.f$b */
    public static class C7393b implements C7317b.C7318a<C7632r2> {
        public C7393b() {
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
        public C7355d<C7632r2> mo49695c() {
            return C7431h.m19219a();
        }

        /* renamed from: d */
        public C7337c<C7632r2> mo49696d() {
            return C7408g.m19150a();
        }
    }

    /* renamed from: com.my.target.f$c */
    public interface C7394c extends C7317b.C7319b<C7632r2> {
    }

    public C7391f(C7298a aVar, C7524l3.C7525a aVar2, int i) {
        this((List<C7617q1>) null, aVar, aVar2, i);
    }

    public C7391f(List<C7617q1> list, C7298a aVar, C7524l3.C7525a aVar2, int i) {
        super(new C7393b(), aVar, aVar2);
        this.f18552f = list;
        this.f18553g = C7710v8.m20686a(i * 1000);
    }

    /* renamed from: a */
    public static C7317b<C7632r2> m19074a(C7298a aVar, C7524l3.C7525a aVar2, int i) {
        return new C7391f(aVar, aVar2, i);
    }

    /* renamed from: a */
    public static C7317b<C7632r2> m19075a(C7617q1 q1Var, C7298a aVar, C7524l3.C7525a aVar2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(q1Var);
        return new C7391f(arrayList, aVar, aVar2, i);
    }

    /* renamed from: a */
    public static C7317b<C7632r2> m19076a(List<C7617q1> list, C7298a aVar, C7524l3.C7525a aVar2, int i) {
        return new C7391f(list, aVar, aVar2, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m19077c(C7524l3 l3Var, Context context) {
        this.f18553g.mo51750b(this.f18554h);
        mo49691a(null, "ad loading timeout", l3Var, context);
    }

    /* renamed from: b */
    public C7317b<C7632r2> mo49692b(C7524l3 l3Var, Context context) {
        if (this.f18554h == null) {
            this.f18554h = new Runnable(l3Var, context) {
                public final /* synthetic */ C7524l3 f$1;
                public final /* synthetic */ Context f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C7391f.this.m19077c(this.f$1, this.f$2);
                }
            };
        }
        this.f18553g.mo51748a(this.f18554h);
        return super.mo49692b(l3Var, context);
    }

    /* renamed from: d */
    public C7632r2 mo49686a(C7524l3 l3Var, Context context) {
        C7618q2 a;
        if (this.f18552f != null) {
            a = mo49688a((C7632r2) mo49689a(this.f18552f, null, this.f18342a.mo49696d(), C7378e3.m19007d(), l3Var, context), context);
        } else {
            a = super.mo49686a(l3Var, context);
        }
        return (C7632r2) a;
    }
}
