package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10199E;
import com.yandex.metrica.impl.p265ob.C10474M;
import com.yandex.metrica.impl.p265ob.C10675Qi;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Yc */
public class C10956Yc implements C10474M.C10478c, C10199E.C10201b {

    /* renamed from: a */
    private List<C10883Wc> f26341a;

    /* renamed from: b */
    private final C10474M f26342b;

    /* renamed from: c */
    private final C11146dd f26343c;

    /* renamed from: d */
    private final C10199E f26344d;

    /* renamed from: e */
    private volatile C10807Uc f26345e;

    /* renamed from: f */
    private final Set<C10838Vc> f26346f;

    /* renamed from: g */
    private final Object f26347g;

    public C10956Yc(Context context) {
        this(C10619P0.m27164i().mo61877d(), C11146dd.m28727a(context), new C10675Qi.C10677b(context), C10619P0.m27164i().mo61876c());
    }

    /* renamed from: d */
    private void m28288d() {
        C10807Uc a = m28287a();
        if (!C10796U2.m27892a((Object) this.f26345e, (Object) a)) {
            this.f26343c.mo62752a(a);
            this.f26345e = a;
            C10807Uc uc = this.f26345e;
            for (C10838Vc a2 : this.f26346f) {
                a2.mo62378a(uc);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo62536a(C10838Vc vc) {
        this.f26346f.add(vc);
    }

    /* renamed from: b */
    public void mo62537b() {
        synchronized (this.f26347g) {
            this.f26342b.mo61751a((C10474M.C10478c) this);
            this.f26344d.mo61206a((C10199E.C10201b) this);
        }
    }

    /* renamed from: c */
    public synchronized void mo62538c() {
        m28288d();
    }

    /* renamed from: a */
    public synchronized void mo62535a(C10675Qi qi) {
        this.f26341a = qi.mo62033x();
        this.f26345e = m28287a();
        this.f26343c.mo62751a(qi, this.f26345e);
        C10807Uc uc = this.f26345e;
        for (C10838Vc a : this.f26346f) {
            a.mo62378a(uc);
        }
    }

    C10956Yc(C10474M m, C11146dd ddVar, C10675Qi.C10677b bVar, C10199E e) {
        this.f26346f = new HashSet();
        this.f26347g = new Object();
        this.f26342b = m;
        this.f26343c = ddVar;
        this.f26344d = e;
        this.f26341a = bVar.mo62085a().mo62033x();
    }

    /* renamed from: a */
    public synchronized void mo61213a(C10199E.C10200a aVar) {
        m28288d();
    }

    /* renamed from: a */
    public synchronized void mo61754a(C10474M.C10476b.C10477a aVar) {
        m28288d();
    }

    /* renamed from: a */
    private C10807Uc m28287a() {
        C10199E.C10200a c = this.f26344d.mo61211c();
        C10474M.C10476b.C10477a b = this.f26342b.mo61752b();
        for (C10883Wc next : this.f26341a) {
            if (next.f26155b.f27116a.contains(b) && next.f26155b.f27117b.contains(c)) {
                return next.f26154a;
            }
        }
        return null;
    }
}
