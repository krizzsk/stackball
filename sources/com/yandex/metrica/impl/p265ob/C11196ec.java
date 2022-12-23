package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.appsflyer.internal.referrer.Payload;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.ec */
public class C11196ec implements C11489lc {

    /* renamed from: a */
    private final Object f26810a;

    /* renamed from: b */
    private C10675Qi f26811b;

    /* renamed from: c */
    private volatile FutureTask<Void> f26812c;

    /* renamed from: d */
    private final C11203g f26813d;

    /* renamed from: e */
    private final C11203g f26814e;

    /* renamed from: f */
    private final C11203g f26815f;

    /* renamed from: g */
    private final C11109cc f26816g;

    /* renamed from: h */
    private final C11109cc f26817h;

    /* renamed from: i */
    private final C11109cc f26818i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Context f26819j;

    /* renamed from: k */
    private C11769sn f26820k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile C11279gc f26821l;

    /* renamed from: com.yandex.metrica.impl.ob.ec$a */
    class C11197a implements Callable<Void> {
        C11197a() {
        }

        public Object call() throws Exception {
            C11196ec ecVar = C11196ec.this;
            C11078bc a = C11196ec.m28849a(ecVar, ecVar.f26819j);
            C11196ec ecVar2 = C11196ec.this;
            C11078bc b = C11196ec.m28855b(ecVar2, ecVar2.f26819j);
            C11196ec ecVar3 = C11196ec.this;
            C11279gc unused = ecVar.f26821l = new C11279gc(a, b, C11196ec.m28850a(ecVar3, ecVar3.f26819j, (C11560nc) new C11525mc()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$b */
    class C11198b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Context f26823a;

        /* renamed from: b */
        final /* synthetic */ C11560nc f26824b;

        C11198b(Context context, C11560nc ncVar) {
            this.f26823a = context;
            this.f26824b = ncVar;
        }

        public Object call() throws Exception {
            C11279gc a = C11196ec.this.f26821l;
            C11196ec ecVar = C11196ec.this;
            C11078bc a2 = C11196ec.m28851a(ecVar, C11196ec.m28849a(ecVar, this.f26823a), a.mo62960a());
            C11196ec ecVar2 = C11196ec.this;
            C11078bc a3 = C11196ec.m28851a(ecVar2, C11196ec.m28855b(ecVar2, this.f26823a), a.mo62961b());
            C11196ec ecVar3 = C11196ec.this;
            C11279gc unused = ecVar.f26821l = new C11279gc(a2, a3, C11196ec.m28851a(ecVar3, C11196ec.m28850a(ecVar3, this.f26823a, this.f26824b), a.mo62962c()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$c */
    public static class C11199c implements C11203g {
        /* renamed from: a */
        public boolean mo62825a(C10675Qi qi) {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$d */
    public static class C11200d implements C11203g {
        /* renamed from: a */
        public boolean mo62825a(C10675Qi qi) {
            return qi != null && (qi.mo62014f().f28201w || !qi.mo62026r());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$e */
    public static class C11201e implements C11203g {
        /* renamed from: a */
        public boolean mo62825a(C10675Qi qi) {
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$f */
    public static class C11202f implements C11203g {
        /* renamed from: a */
        public boolean mo62825a(C10675Qi qi) {
            return qi != null && qi.mo62014f().f28201w;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$g */
    interface C11203g {
        /* renamed from: a */
        boolean mo62825a(C10675Qi qi);
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$h */
    public static class C11204h implements C11203g {
        /* renamed from: a */
        public boolean mo62825a(C10675Qi qi) {
            return qi != null && (qi.mo62014f().f28193o || !qi.mo62026r());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ec$i */
    public static class C11205i implements C11203g {
        /* renamed from: a */
        public boolean mo62825a(C10675Qi qi) {
            return qi != null && qi.mo62014f().f28193o;
        }
    }

    public C11196ec(C11203g gVar, C11203g gVar2, C11203g gVar3, C11769sn snVar, String str) {
        this(gVar, gVar2, gVar3, snVar, new C11143dc(new C11713rc(Payload.SOURCE_GOOGLE)), new C11143dc(new C11713rc(Payload.SOURCE_HUAWEI)), new C11143dc(new C11713rc("yandex")), str);
    }

    /* renamed from: a */
    static C11078bc m28851a(C11196ec ecVar, C11078bc bcVar, C11078bc bcVar2) {
        ecVar.getClass();
        C11171e1 e1Var = bcVar.f26601b;
        return e1Var != C11171e1.f26755b ? new C11078bc(bcVar2.f26600a, e1Var, bcVar.f26602c) : bcVar;
    }

    /* renamed from: c */
    public void mo62822c(Context context) {
        this.f26819j = context.getApplicationContext();
    }

    C11196ec(C11203g gVar, C11203g gVar2, C11203g gVar3, C11769sn snVar, C11109cc ccVar, C11109cc ccVar2, C11109cc ccVar3, String str) {
        this.f26810a = new Object();
        this.f26813d = gVar;
        this.f26814e = gVar2;
        this.f26815f = gVar3;
        this.f26816g = ccVar;
        this.f26817h = ccVar2;
        this.f26818i = ccVar3;
        this.f26820k = snVar;
        this.f26821l = new C11279gc();
    }

    /* renamed from: c */
    private void m28856c() {
        boolean z;
        if (this.f26819j != null) {
            synchronized (this) {
                C11171e1 e1Var = this.f26821l.mo62960a().f26601b;
                C11171e1 e1Var2 = C11171e1.UNKNOWN;
                z = (e1Var == e1Var2 || this.f26821l.mo62961b().f26601b == e1Var2) ? false : true;
            }
            if (!z) {
                mo62815a(this.f26819j);
            }
        }
    }

    /* renamed from: b */
    public void mo62821b(Context context) {
        this.f26819j = context.getApplicationContext();
        if (this.f26812c == null) {
            synchronized (this.f26810a) {
                if (this.f26812c == null) {
                    this.f26812c = new FutureTask<>(new C11197a());
                    ((C11725rn) this.f26820k).execute(this.f26812c);
                }
            }
        }
    }

    /* renamed from: b */
    static C11078bc m28855b(C11196ec ecVar, Context context) {
        if (ecVar.f26814e.mo62825a(ecVar.f26811b)) {
            return ecVar.f26817h.mo62727a(context);
        }
        C10675Qi qi = ecVar.f26811b;
        if (qi == null || !qi.mo62026r()) {
            return new C11078bc((C11037ac) null, C11171e1.NO_STARTUP, "startup has not been received yet");
        }
        if (!ecVar.f26811b.mo62014f().f28201w) {
            return new C11078bc((C11037ac) null, C11171e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
        }
        return new C11078bc((C11037ac) null, C11171e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Deprecated
    /* renamed from: b */
    public Boolean mo62820b() {
        m28856c();
        C11037ac acVar = this.f26821l.mo62960a().f26600a;
        if (acVar == null) {
            return null;
        }
        return acVar.f26513c;
    }

    /* renamed from: a */
    public void mo62818a(Context context, C10675Qi qi) {
        this.f26811b = qi;
        mo62821b(context);
    }

    /* renamed from: a */
    public void mo62819a(C10675Qi qi) {
        this.f26811b = qi;
    }

    /* renamed from: a */
    public C11279gc mo62815a(Context context) {
        mo62821b(context);
        try {
            this.f26812c.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f26821l;
    }

    /* renamed from: a */
    public C11279gc mo62816a(Context context, C11560nc ncVar) {
        FutureTask futureTask = new FutureTask(new C11198b(context.getApplicationContext(), ncVar));
        ((C11725rn) this.f26820k).execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f26821l;
    }

    /* renamed from: a */
    static C11078bc m28849a(C11196ec ecVar, Context context) {
        if (ecVar.f26813d.mo62825a(ecVar.f26811b)) {
            return ecVar.f26816g.mo62727a(context);
        }
        C10675Qi qi = ecVar.f26811b;
        if (qi == null || !qi.mo62026r()) {
            return new C11078bc((C11037ac) null, C11171e1.NO_STARTUP, "startup has not been received yet");
        }
        if (!ecVar.f26811b.mo62014f().f28193o) {
            return new C11078bc((C11037ac) null, C11171e1.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
        }
        return new C11078bc((C11037ac) null, C11171e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    /* renamed from: a */
    static C11078bc m28850a(C11196ec ecVar, Context context, C11560nc ncVar) {
        if (ecVar.f26815f.mo62825a(ecVar.f26811b)) {
            return ecVar.f26818i.mo62728a(context, ncVar);
        }
        return new C11078bc((C11037ac) null, C11171e1.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Deprecated
    /* renamed from: a */
    public String mo62817a() {
        m28856c();
        C11037ac acVar = this.f26821l.mo62960a().f26600a;
        if (acVar == null) {
            return null;
        }
        return acVar.f26512b;
    }
}
