package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.xd */
class C11943xd {

    /* renamed from: a */
    private C11946c f28708a;

    /* renamed from: b */
    private C11944a f28709b;

    /* renamed from: c */
    private C11945b f28710c;

    /* renamed from: d */
    private Context f28711d;

    /* renamed from: e */
    private C10807Uc f28712e;

    /* renamed from: f */
    private C12026zd f28713f;

    /* renamed from: g */
    private C10106Ad f28714g;

    /* renamed from: h */
    private C11982yc f28715h;

    /* renamed from: i */
    private final C11239fd f28716i;

    /* renamed from: j */
    private C10251Fc f28717j;

    /* renamed from: k */
    private Map<String, C11280gd> f28718k;

    /* renamed from: com.yandex.metrica.impl.ob.xd$a */
    public static class C11944a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.xd$b */
    public static class C11945b {
    }

    /* renamed from: com.yandex.metrica.impl.ob.xd$c */
    public static class C11946c {
    }

    public C11943xd(Context context, C10807Uc uc, C10106Ad ad, C11982yc ycVar, C11659pi piVar) {
        this(context, uc, new C11946c(), new C11239fd(piVar), new C11944a(), new C11945b(), ad, ycVar);
    }

    /* renamed from: a */
    public void mo64072a(Location location) {
        String provider = location.getProvider();
        C11280gd gdVar = this.f28718k.get(provider);
        if (gdVar == null) {
            if (this.f28713f == null) {
                C11946c cVar = this.f28708a;
                Context context = this.f28711d;
                cVar.getClass();
                this.f28713f = new C12026zd((C11125d0<Location>) null, C10663Qa.m27298a(context).mo61963f(), new C10161Cc(context), new C10580Nm(), C10619P0.m27164i().mo61877d(), C10619P0.m27164i().mo61876c());
            }
            if (this.f28717j == null) {
                C11944a aVar = this.f28709b;
                C12026zd zdVar = this.f28713f;
                C11239fd fdVar = this.f28716i;
                aVar.getClass();
                this.f28717j = new C10251Fc(zdVar, fdVar);
            }
            C11945b bVar = this.f28710c;
            C10807Uc uc = this.f28712e;
            C10251Fc fc = this.f28717j;
            C10106Ad ad = this.f28714g;
            C11982yc ycVar = this.f28715h;
            bVar.getClass();
            gdVar = new C11280gd(uc, fc, (Location) null, 0, new C10691R2(), ad, ycVar);
            this.f28718k.put(provider, gdVar);
        } else {
            gdVar.mo62965a(this.f28712e);
        }
        gdVar.mo62964a(location);
    }

    /* renamed from: b */
    public C11239fd mo64075b() {
        return this.f28716i;
    }

    C11943xd(Context context, C10807Uc uc, C11946c cVar, C11239fd fdVar, C11944a aVar, C11945b bVar, C10106Ad ad, C11982yc ycVar) {
        this.f28718k = new HashMap();
        this.f28711d = context;
        this.f28712e = uc;
        this.f28708a = cVar;
        this.f28716i = fdVar;
        this.f28709b = aVar;
        this.f28710c = bVar;
        this.f28714g = ad;
        this.f28715h = ycVar;
    }

    /* renamed from: a */
    public Location mo64071a() {
        return (Location) this.f28716i.mo61900a();
    }

    /* renamed from: a */
    public void mo64074a(C10807Uc uc) {
        this.f28712e = uc;
    }

    /* renamed from: a */
    public void mo64073a(C10675Qi qi) {
        if (qi.mo62012d() != null) {
            this.f28716i.mo61944c(qi.mo62012d());
        }
    }
}
