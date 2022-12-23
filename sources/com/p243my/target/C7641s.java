package com.p243my.target;

import android.content.Context;
import com.p243my.target.C7317b;
import com.p243my.target.C7524l3;

/* renamed from: com.my.target.s */
public final class C7641s extends C7317b<C7699v2> {

    /* renamed from: f */
    public final C7699v2 f19311f;

    /* renamed from: g */
    public final String f19312g;

    /* renamed from: com.my.target.s$a */
    public static class C7642a implements C7317b.C7318a<C7699v2> {
        /* renamed from: a */
        public C7372e mo49693a() {
            return C7696v.m20626b();
        }

        /* renamed from: b */
        public boolean mo49694b() {
            return false;
        }

        /* renamed from: c */
        public C7355d<C7699v2> mo49695c() {
            return C7681u.m20505a();
        }

        /* renamed from: d */
        public C7337c<C7699v2> mo49696d() {
            return C7660t.m20383a();
        }
    }

    /* renamed from: com.my.target.s$b */
    public interface C7643b extends C7317b.C7319b<C7699v2> {
    }

    public C7641s(C7298a aVar, C7524l3.C7525a aVar2, C7699v2 v2Var, String str) {
        super(new C7642a(), aVar, aVar2);
        this.f19311f = v2Var;
        this.f19312g = str;
    }

    /* renamed from: a */
    public static C7317b<C7699v2> m20282a(C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7641s(aVar, aVar2, (C7699v2) null, (String) null);
    }

    /* renamed from: a */
    public static C7317b<C7699v2> m20283a(C7699v2 v2Var, C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7641s(aVar, aVar2, v2Var, (String) null);
    }

    /* renamed from: a */
    public static C7317b<C7699v2> m20284a(String str, C7298a aVar, C7524l3.C7525a aVar2) {
        return new C7641s(aVar, aVar2, (C7699v2) null, str);
    }

    /* renamed from: d */
    public C7699v2 mo49686a(C7524l3 l3Var, Context context) {
        C7618q2 a;
        if (this.f19312g != null) {
            a = mo49688a(this.f18342a.mo49696d().mo49776a(this.f19312g, C7617q1.m20130b(""), this.f19311f, this.f18343b, this.f18344c, l3Var, context), context);
        } else {
            C7699v2 v2Var = this.f19311f;
            a = v2Var != null ? mo49688a(v2Var, context) : super.mo49686a(l3Var, context);
        }
        return (C7699v2) a;
    }
}
