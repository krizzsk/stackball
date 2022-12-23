package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.Location;
import com.yandex.metrica.impl.p265ob.C10675Qi;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.dd */
public class C11146dd {

    /* renamed from: n */
    private static volatile C11146dd f26699n;

    /* renamed from: o */
    public static final long f26700o = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: p */
    private static final Object f26701p = new Object();

    /* renamed from: q */
    public static final /* synthetic */ int f26702q = 0;

    /* renamed from: a */
    private final WeakHashMap<Object, Object> f26703a;

    /* renamed from: b */
    private boolean f26704b = false;

    /* renamed from: c */
    private C10807Uc f26705c;

    /* renamed from: d */
    private C10675Qi f26706d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11815ud f26707e;

    /* renamed from: f */
    private C11149c f26708f;

    /* renamed from: g */
    private Runnable f26709g;

    /* renamed from: h */
    private final C12025zc f26710h;

    /* renamed from: i */
    private final C10129B8 f26711i;

    /* renamed from: j */
    private final C10101A8 f26712j;

    /* renamed from: k */
    private final C11491le f26713k;

    /* renamed from: l */
    private boolean f26714l = false;

    /* renamed from: m */
    private final Object f26715m = new Object();

    /* renamed from: com.yandex.metrica.impl.ob.dd$a */
    class C11147a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10675Qi f26716a;

        C11147a(C10675Qi qi) {
            this.f26716a = qi;
        }

        public void run() {
            if (C11146dd.this.f26707e != null) {
                C11146dd.this.f26707e.mo63783a(this.f26716a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dd$b */
    class C11148b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10807Uc f26718a;

        C11148b(C10807Uc uc) {
            this.f26718a = uc;
        }

        public void run() {
            if (C11146dd.this.f26707e != null) {
                C11146dd.this.f26707e.mo63784a(this.f26718a);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dd$c */
    static class C11149c {
        C11149c() {
        }
    }

    C11146dd(Context context, C11206ed edVar, C11149c cVar, C10675Qi qi) {
        this.f26710h = new C12025zc(context, edVar.mo62826a(), edVar.mo62829d());
        this.f26711i = edVar.mo62828c();
        this.f26712j = edVar.mo62827b();
        this.f26713k = edVar.mo62830e();
        this.f26703a = new WeakHashMap<>();
        this.f26708f = cVar;
        this.f26706d = qi;
    }

    /* renamed from: b */
    public void mo62755b(Object obj) {
        synchronized (this.f26715m) {
            this.f26703a.remove(obj);
            m28729b();
        }
    }

    /* renamed from: a */
    public static C11146dd m28727a(Context context) {
        if (f26699n == null) {
            synchronized (f26701p) {
                if (f26699n == null) {
                    Context applicationContext = context.getApplicationContext();
                    f26699n = new C11146dd(applicationContext, new C11206ed(applicationContext), new C11149c(), new C10675Qi.C10677b(applicationContext).mo62085a());
                }
            }
        }
        return f26699n;
    }

    /* renamed from: b */
    private void m28729b() {
        if (this.f26714l) {
            if (!this.f26704b || this.f26703a.isEmpty()) {
                this.f26710h.f28887b.execute(new C11039ad(this));
                Runnable runnable = this.f26709g;
                if (runnable != null) {
                    this.f26710h.f28887b.mo63612a(runnable);
                }
                this.f26714l = false;
            }
        } else if (this.f26704b && !this.f26703a.isEmpty()) {
            if (this.f26707e == null) {
                C11149c cVar = this.f26708f;
                C11848vd vdVar = new C11848vd(this.f26710h, this.f26711i, this.f26712j, this.f26706d, this.f26705c);
                cVar.getClass();
                this.f26707e = new C11815ud(vdVar);
            }
            this.f26710h.f28887b.execute(new C11079bd(this));
            if (this.f26709g == null) {
                C11110cd cdVar = new C11110cd(this);
                this.f26709g = cdVar;
                this.f26710h.f28887b.mo63613a(cdVar, f26700o);
            }
            this.f26710h.f28887b.execute(new C10989Zc(this));
            this.f26714l = true;
        }
    }

    /* renamed from: a */
    public void mo62753a(Object obj) {
        synchronized (this.f26715m) {
            this.f26703a.put(obj, (Object) null);
            m28729b();
        }
    }

    /* renamed from: a */
    public Location mo62750a() {
        C11815ud udVar = this.f26707e;
        if (udVar == null) {
            return null;
        }
        return udVar.mo63785b();
    }

    /* renamed from: a */
    public void mo62754a(boolean z) {
        synchronized (this.f26715m) {
            if (this.f26704b != z) {
                this.f26704b = z;
                this.f26713k.mo63282a(z);
                this.f26710h.f28888c.mo62897a(this.f26713k.mo63280a());
                m28729b();
            }
        }
    }

    /* renamed from: a */
    public void mo62751a(C10675Qi qi, C10807Uc uc) {
        synchronized (this.f26715m) {
            this.f26706d = qi;
            this.f26713k.mo63281a(qi);
            this.f26710h.f28888c.mo62897a(this.f26713k.mo63280a());
            this.f26710h.f28887b.execute(new C11147a(qi));
            if (!C10796U2.m27892a((Object) this.f26705c, (Object) uc)) {
                mo62752a(uc);
            }
        }
    }

    /* renamed from: a */
    public void mo62752a(C10807Uc uc) {
        synchronized (this.f26715m) {
            this.f26705c = uc;
        }
        this.f26710h.f28887b.execute(new C11148b(uc));
    }

    /* renamed from: b */
    static void m28730b(C11146dd ddVar) {
        ddVar.f26710h.f28887b.mo63613a(ddVar.f26709g, f26700o);
    }
}
