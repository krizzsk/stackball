package com.iab.omid.library.ironsrc.p108b;

import com.iab.omid.library.ironsrc.adsession.C4708a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.ironsrc.b.a */
public class C4710a {

    /* renamed from: a */
    private static C4710a f10609a = new C4710a();

    /* renamed from: b */
    private final ArrayList<C4708a> f10610b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4708a> f10611c = new ArrayList<>();

    private C4710a() {
    }

    /* renamed from: a */
    public static C4710a m10179a() {
        return f10609a;
    }

    /* renamed from: a */
    public void mo39123a(C4708a aVar) {
        this.f10610b.add(aVar);
    }

    /* renamed from: b */
    public Collection<C4708a> mo39124b() {
        return Collections.unmodifiableCollection(this.f10610b);
    }

    /* renamed from: b */
    public void mo39125b(C4708a aVar) {
        boolean d = mo39128d();
        this.f10611c.add(aVar);
        if (!d) {
            C4717f.m10217a().mo39158b();
        }
    }

    /* renamed from: c */
    public Collection<C4708a> mo39126c() {
        return Collections.unmodifiableCollection(this.f10611c);
    }

    /* renamed from: c */
    public void mo39127c(C4708a aVar) {
        boolean d = mo39128d();
        this.f10610b.remove(aVar);
        this.f10611c.remove(aVar);
        if (d && !mo39128d()) {
            C4717f.m10217a().mo39159c();
        }
    }

    /* renamed from: d */
    public boolean mo39128d() {
        return this.f10611c.size() > 0;
    }
}
