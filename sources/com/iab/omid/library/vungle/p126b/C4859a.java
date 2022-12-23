package com.iab.omid.library.vungle.p126b;

import com.iab.omid.library.vungle.adsession.C4857a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.vungle.b.a */
public class C4859a {

    /* renamed from: a */
    private static C4859a f10943a = new C4859a();

    /* renamed from: b */
    private final ArrayList<C4857a> f10944b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4857a> f10945c = new ArrayList<>();

    private C4859a() {
    }

    /* renamed from: a */
    public static C4859a m10833a() {
        return f10943a;
    }

    /* renamed from: a */
    public void mo39685a(C4857a aVar) {
        this.f10944b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4857a> mo39686b() {
        return Collections.unmodifiableCollection(this.f10944b);
    }

    /* renamed from: b */
    public void mo39687b(C4857a aVar) {
        boolean d = mo39690d();
        this.f10945c.add(aVar);
        if (!d) {
            C4866f.m10873a().mo39728b();
        }
    }

    /* renamed from: c */
    public Collection<C4857a> mo39688c() {
        return Collections.unmodifiableCollection(this.f10945c);
    }

    /* renamed from: c */
    public void mo39689c(C4857a aVar) {
        boolean d = mo39690d();
        this.f10944b.remove(aVar);
        this.f10945c.remove(aVar);
        if (d && !mo39690d()) {
            C4866f.m10873a().mo39729c();
        }
    }

    /* renamed from: d */
    public boolean mo39690d() {
        return this.f10945c.size() > 0;
    }
}
