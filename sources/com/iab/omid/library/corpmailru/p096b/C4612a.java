package com.iab.omid.library.corpmailru.p096b;

import com.iab.omid.library.corpmailru.adsession.C4610a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.corpmailru.b.a */
public class C4612a {

    /* renamed from: a */
    private static C4612a f10394a = new C4612a();

    /* renamed from: b */
    private final ArrayList<C4610a> f10395b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4610a> f10396c = new ArrayList<>();

    private C4612a() {
    }

    /* renamed from: a */
    public static C4612a m9745a() {
        return f10394a;
    }

    /* renamed from: a */
    public void mo38763a(C4610a aVar) {
        this.f10395b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4610a> mo38764b() {
        return Collections.unmodifiableCollection(this.f10395b);
    }

    /* renamed from: b */
    public void mo38765b(C4610a aVar) {
        boolean d = mo38768d();
        this.f10396c.add(aVar);
        if (!d) {
            C4619f.m9785a().mo38806b();
        }
    }

    /* renamed from: c */
    public Collection<C4610a> mo38766c() {
        return Collections.unmodifiableCollection(this.f10396c);
    }

    /* renamed from: c */
    public void mo38767c(C4610a aVar) {
        boolean d = mo38768d();
        this.f10395b.remove(aVar);
        this.f10396c.remove(aVar);
        if (d && !mo38768d()) {
            C4619f.m9785a().mo38807c();
        }
    }

    /* renamed from: d */
    public boolean mo38768d() {
        return this.f10396c.size() > 0;
    }
}
