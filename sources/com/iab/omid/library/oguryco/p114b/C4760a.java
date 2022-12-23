package com.iab.omid.library.oguryco.p114b;

import com.iab.omid.library.oguryco.adsession.C4758a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.oguryco.b.a */
public class C4760a {

    /* renamed from: a */
    private static C4760a f10728a = new C4760a();

    /* renamed from: b */
    private final ArrayList<C4758a> f10729b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4758a> f10730c = new ArrayList<>();

    private C4760a() {
    }

    /* renamed from: a */
    public static C4760a m10402a() {
        return f10728a;
    }

    /* renamed from: a */
    public void mo39335a(C4758a aVar) {
        this.f10729b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4758a> mo39336b() {
        return Collections.unmodifiableCollection(this.f10729b);
    }

    /* renamed from: b */
    public void mo39337b(C4758a aVar) {
        boolean d = mo39340d();
        this.f10730c.add(aVar);
        if (!d) {
            C4768f.m10445a().mo39372b();
        }
    }

    /* renamed from: c */
    public Collection<C4758a> mo39338c() {
        return Collections.unmodifiableCollection(this.f10730c);
    }

    /* renamed from: c */
    public void mo39339c(C4758a aVar) {
        boolean d = mo39340d();
        this.f10729b.remove(aVar);
        this.f10730c.remove(aVar);
        if (d && !mo39340d()) {
            C4768f.m10445a().mo39373c();
        }
    }

    /* renamed from: d */
    public boolean mo39340d() {
        return this.f10730c.size() > 0;
    }
}
