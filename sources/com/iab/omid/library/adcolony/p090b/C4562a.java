package com.iab.omid.library.adcolony.p090b;

import com.iab.omid.library.adcolony.adsession.C4560a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.adcolony.b.a */
public class C4562a {

    /* renamed from: c */
    private static C4562a f10280c = new C4562a();

    /* renamed from: a */
    private final ArrayList<C4560a> f10281a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C4560a> f10282b = new ArrayList<>();

    private C4562a() {
    }

    /* renamed from: a */
    public static C4562a m9524a() {
        return f10280c;
    }

    /* renamed from: a */
    public void mo38577a(C4560a aVar) {
        this.f10281a.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4560a> mo38578b() {
        return Collections.unmodifiableCollection(this.f10281a);
    }

    /* renamed from: b */
    public void mo38579b(C4560a aVar) {
        boolean d = mo38582d();
        this.f10282b.add(aVar);
        if (!d) {
            C4569f.m9562a().mo38612b();
        }
    }

    /* renamed from: c */
    public Collection<C4560a> mo38580c() {
        return Collections.unmodifiableCollection(this.f10282b);
    }

    /* renamed from: c */
    public void mo38581c(C4560a aVar) {
        boolean d = mo38582d();
        this.f10281a.remove(aVar);
        this.f10282b.remove(aVar);
        if (d && !mo38582d()) {
            C4569f.m9562a().mo38613c();
        }
    }

    /* renamed from: d */
    public boolean mo38582d() {
        return this.f10282b.size() > 0;
    }
}
