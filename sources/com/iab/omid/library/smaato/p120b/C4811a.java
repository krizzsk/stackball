package com.iab.omid.library.smaato.p120b;

import com.iab.omid.library.smaato.adsession.C4809a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.smaato.b.a */
public class C4811a {

    /* renamed from: a */
    private static C4811a f10844a = new C4811a();

    /* renamed from: b */
    private final ArrayList<C4809a> f10845b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4809a> f10846c = new ArrayList<>();

    private C4811a() {
    }

    /* renamed from: a */
    public static C4811a m10631a() {
        return f10844a;
    }

    /* renamed from: a */
    public void mo39513a(C4809a aVar) {
        this.f10845b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4809a> mo39514b() {
        return Collections.unmodifiableCollection(this.f10845b);
    }

    /* renamed from: b */
    public void mo39515b(C4809a aVar) {
        boolean d = mo39518d();
        this.f10846c.add(aVar);
        if (!d) {
            C4818e.m10668a().mo39544b();
        }
    }

    /* renamed from: c */
    public Collection<C4809a> mo39516c() {
        return Collections.unmodifiableCollection(this.f10846c);
    }

    /* renamed from: c */
    public void mo39517c(C4809a aVar) {
        boolean d = mo39518d();
        this.f10845b.remove(aVar);
        this.f10846c.remove(aVar);
        if (d && !mo39518d()) {
            C4818e.m10668a().mo39545c();
        }
    }

    /* renamed from: d */
    public boolean mo39518d() {
        return this.f10846c.size() > 0;
    }
}
