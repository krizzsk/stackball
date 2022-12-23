package com.iab.omid.library.inmobi.p102b;

import com.iab.omid.library.inmobi.adsession.C4660a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.inmobi.b.a */
public class C4662a {

    /* renamed from: a */
    private static C4662a f10507a = new C4662a();

    /* renamed from: b */
    private final ArrayList<C4660a> f10508b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4660a> f10509c = new ArrayList<>();

    private C4662a() {
    }

    /* renamed from: a */
    public static C4662a m9971a() {
        return f10507a;
    }

    /* renamed from: a */
    public void mo38947a(C4660a aVar) {
        this.f10508b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4660a> mo38948b() {
        return Collections.unmodifiableCollection(this.f10508b);
    }

    /* renamed from: b */
    public void mo38949b(C4660a aVar) {
        boolean d = mo38952d();
        this.f10509c.add(aVar);
        if (!d) {
            C4669e.m10008a().mo38978b();
        }
    }

    /* renamed from: c */
    public Collection<C4660a> mo38950c() {
        return Collections.unmodifiableCollection(this.f10509c);
    }

    /* renamed from: c */
    public void mo38951c(C4660a aVar) {
        boolean d = mo38952d();
        this.f10508b.remove(aVar);
        this.f10509c.remove(aVar);
        if (d && !mo38952d()) {
            C4669e.m10008a().mo38979c();
        }
    }

    /* renamed from: d */
    public boolean mo38952d() {
        return this.f10509c.size() > 0;
    }
}
