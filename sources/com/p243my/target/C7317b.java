package com.p243my.target;

import android.content.Context;
import android.os.Looper;
import com.p243my.target.C7524l3;
import com.p243my.target.C7618q2;
import java.util.List;

/* renamed from: com.my.target.b */
public abstract class C7317b<T extends C7618q2> {

    /* renamed from: a */
    public final C7318a<T> f18342a;

    /* renamed from: b */
    public final C7298a f18343b;

    /* renamed from: c */
    public final C7524l3.C7525a f18344c;

    /* renamed from: d */
    public String f18345d;

    /* renamed from: e */
    public C7319b<T> f18346e;

    /* renamed from: com.my.target.b$a */
    public interface C7318a<T extends C7618q2> {
        /* renamed from: a */
        C7372e mo49693a();

        /* renamed from: b */
        boolean mo49694b();

        /* renamed from: c */
        C7355d<T> mo49695c();

        /* renamed from: d */
        C7337c<T> mo49696d();
    }

    /* renamed from: com.my.target.b$b */
    public interface C7319b<T extends C7618q2> {
        /* renamed from: a */
        void mo49446a(T t, String str);
    }

    public C7317b(C7318a<T> aVar, C7298a aVar2, C7524l3.C7525a aVar3) {
        this.f18342a = aVar;
        this.f18343b = aVar2;
        this.f18344c = aVar3;
    }

    /* renamed from: a */
    public static void m18735a(C7524l3 l3Var, int i, long j) {
        l3Var.mo50798a(i, System.currentTimeMillis() - j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18736a(C7618q2 q2Var, String str) {
        C7319b<T> bVar = this.f18346e;
        if (bVar != null) {
            bVar.mo49446a(q2Var, str);
            this.f18346e = null;
        }
    }

    /* renamed from: b */
    public static long m18737b(C7524l3 l3Var, int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        l3Var.mo50801b(i, currentTimeMillis - j);
        return currentTimeMillis;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m18738c(C7524l3 l3Var, Context context) {
        mo49691a(mo49686a(l3Var, context), this.f18345d, l3Var, context);
    }

    /* renamed from: a */
    public final C7317b<T> mo49685a(C7319b<T> bVar) {
        this.f18346e = bVar;
        return this;
    }

    /* renamed from: a */
    public T mo49686a(C7524l3 l3Var, Context context) {
        C7524l3 l3Var2;
        Context context2;
        C7524l3 l3Var3 = l3Var;
        Context context3 = context;
        C7553m8.m19858a(context);
        C7372e a = this.f18342a.mo49693a();
        C7456i5.m19373c().mo50397a(l3Var3);
        C7617q1 a2 = a.mo50041a(this.f18343b, context3);
        C7378e3 d = C7378e3.m19007d();
        l3Var.mo50800b();
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = mo49690a(a2, d, context3);
        long b = m18737b(l3Var3, 1, currentTimeMillis);
        if (a3 == null) {
            return null;
        }
        C7337c<T> d2 = this.f18342a.mo49696d();
        T a4 = d2.mo49776a(a3, a2, null, this.f18343b, this.f18344c, l3Var, context);
        m18737b(l3Var3, 2, b);
        if (this.f18342a.mo49694b()) {
            context2 = context3;
            l3Var2 = l3Var3;
            a4 = mo49689a((List<C7617q1>) a2.mo51412w(), a4, d2, d, l3Var, context);
        } else {
            context2 = context3;
            l3Var2 = l3Var3;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        T a5 = mo49688a(a4, context2);
        m18737b(l3Var2, 3, currentTimeMillis2);
        return a5;
    }

    /* renamed from: a */
    public T mo49687a(C7617q1 q1Var, T t, C7337c<T> cVar, C7378e3 e3Var, C7524l3 l3Var, Context context) {
        C7617q1 q1Var2;
        Context context2;
        int i;
        T t2;
        C7617q1 q1Var3 = q1Var;
        C7524l3 l3Var2 = l3Var;
        Context context3 = context;
        long currentTimeMillis = System.currentTimeMillis();
        e3Var.mo50288b(q1Var3.f19227b, (String) null, context3);
        m18735a(l3Var2, 1, currentTimeMillis);
        if (!e3Var.mo50289c()) {
            return t;
        }
        C7741x8.m20827c((List<C7328b3>) q1Var3.mo51363a("serviceRequested"), context3);
        int a = t != null ? t.mo51416a() : 0;
        String str = (String) e3Var.mo50287b();
        if (str != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            T a2 = cVar.mo49776a(str, q1Var, t, this.f18343b, this.f18344c, l3Var, context);
            m18735a(l3Var2, 2, currentTimeMillis2);
            i = a;
            context2 = context3;
            q1Var2 = q1Var3;
            t2 = mo49689a((List<C7617q1>) q1Var.mo51412w(), a2, cVar, e3Var, l3Var, context);
        } else {
            i = a;
            context2 = context3;
            q1Var2 = q1Var3;
            t2 = t;
        }
        if (i != (t2 != null ? t2.mo51416a() : 0)) {
            return t2;
        }
        C7741x8.m20827c((List<C7328b3>) q1Var2.mo51363a("serviceAnswerEmpty"), context2);
        C7617q1 q = q1Var.mo51406q();
        return q != null ? mo49687a(q, t2, cVar, e3Var, l3Var, context) : t2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r2.f18342a.mo49695c();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo49688a(T r3, android.content.Context r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0010
            com.my.target.b$a<T> r0 = r2.f18342a
            com.my.target.d r0 = r0.mo49695c()
            if (r0 == 0) goto L_0x0010
            com.my.target.a r1 = r2.f18343b
            com.my.target.q2 r3 = r0.mo49976a(r3, r1, r4)
        L_0x0010:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7317b.mo49688a(com.my.target.q2, android.content.Context):com.my.target.q2");
    }

    /* renamed from: a */
    public T mo49689a(List<C7617q1> list, T t, C7337c<T> cVar, C7378e3 e3Var, C7524l3 l3Var, Context context) {
        if (list.size() <= 0) {
            return t;
        }
        T t2 = t;
        for (C7617q1 a : list) {
            t2 = mo49687a(a, t2, cVar, e3Var, l3Var, context);
        }
        return t2;
    }

    /* renamed from: a */
    public String mo49690a(C7617q1 q1Var, C7378e3 e3Var, Context context) {
        e3Var.mo50288b(q1Var.f19227b, q1Var.f19226a, context);
        if (e3Var.mo50289c()) {
            return (String) e3Var.mo50287b();
        }
        this.f18345d = e3Var.mo50286a();
        return null;
    }

    /* renamed from: a */
    public void mo49691a(T t, String str, C7524l3 l3Var, Context context) {
        l3Var.mo50802b(context);
        if (this.f18346e != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f18346e.mo49446a(t, str);
                this.f18346e = null;
                return;
            }
            C7395f0.m19090c(new Runnable(t, str) {
                public final /* synthetic */ C7618q2 f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C7317b.this.m18736a(this.f$1, this.f$2);
                }
            });
        }
    }

    /* renamed from: b */
    public C7317b<T> mo49692b(C7524l3 l3Var, Context context) {
        C7395f0.m19086a(new Runnable(l3Var, context.getApplicationContext()) {
            public final /* synthetic */ C7524l3 f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7317b.this.m18738c(this.f$1, this.f$2);
            }
        });
        return this;
    }
}
