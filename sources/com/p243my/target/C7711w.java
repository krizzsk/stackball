package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7317b;
import com.p243my.target.C7524l3;

/* renamed from: com.my.target.w */
public final class C7711w extends C7317b<C7718w2> {

    /* renamed from: com.my.target.w$b */
    public static class C7713b implements C7317b.C7318a<C7718w2> {
        public C7713b() {
        }

        /* renamed from: a */
        public C7372e mo49693a() {
            return C7372e.m18984a();
        }

        /* renamed from: b */
        public boolean mo49694b() {
            return false;
        }

        /* renamed from: c */
        public C7355d<C7718w2> mo49695c() {
            return C7742y.m20834a();
        }

        /* renamed from: d */
        public C7337c<C7718w2> mo49696d() {
            return C7726x.m20773a();
        }
    }

    /* renamed from: com.my.target.w$c */
    public interface C7714c extends C7317b.C7319b<C7718w2> {
    }

    public C7711w(C7298a aVar, C7524l3.C7525a aVar2) {
        super(new C7713b(), aVar, aVar2);
    }

    /* renamed from: a */
    public static C7317b<C7718w2> m20691a(C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7711w(aVar, aVar2);
    }

    /* renamed from: a */
    public String mo49690a(C7617q1 q1Var, C7378e3 e3Var, Context context) {
        if (this.f18343b.getCachePeriod() > 0) {
            C7374e0.m18989a("NativeAppwallAdFactory: check cached data");
            String str = null;
            C7442h8 a = C7442h8.m19263a(context);
            if (a != null) {
                str = a.mo50318a(this.f18343b.getSlotId(), this.f18343b.getCachePeriod());
            }
            if (str != null) {
                C7374e0.m18989a("NativeAppwallAdFactory: cached data loaded successfully");
                q1Var.mo51371a(true);
                return str;
            }
            C7374e0.m18989a("NativeAppwallAdFactory: no cached data");
        }
        return super.mo49690a(q1Var, e3Var, context);
    }
}
