package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.yandex.metrica.impl.p265ob.C10344Hk;
import com.yandex.metrica.impl.p265ob.C10862Vl;
import java.util.Collections;

/* renamed from: com.yandex.metrica.impl.ob.ul */
class C11826ul {

    /* renamed from: a */
    private final C10862Vl.C10863a f28432a;

    /* renamed from: b */
    private final C10468Lk f28433b;

    /* renamed from: c */
    private final C10248F9 f28434c;

    /* renamed from: d */
    private volatile C10378Il f28435d;

    /* renamed from: e */
    private final C11292gm f28436e;

    /* renamed from: f */
    private final C10344Hk.C10346b f28437f;

    /* renamed from: g */
    private final C10377Ik f28438g;

    C11826ul(C10378Il il, C10468Lk lk, C10248F9 f9, C11292gm gmVar, C10377Ik ik) {
        this(il, lk, f9, new C10862Vl.C10863a(), gmVar, ik, new C10344Hk.C10346b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63813a(C10378Il il) {
        this.f28435d = il;
    }

    C11826ul(C10378Il il, C10468Lk lk, C10248F9 f9, C10862Vl.C10863a aVar, C11292gm gmVar, C10377Ik ik, C10344Hk.C10346b bVar) {
        this.f28435d = il;
        this.f28433b = lk;
        this.f28434c = f9;
        this.f28432a = aVar;
        this.f28436e = gmVar;
        this.f28438g = ik;
        this.f28437f = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo63812a(Activity activity, C10615Ol ol, boolean z) {
        String str;
        this.f28432a.getClass();
        C10862Vl vl = new C10862Vl(ol, new C10819Ul(z));
        C10378Il il = this.f28435d;
        if ((z || this.f28433b.mo61741b().isEmpty()) && activity != null) {
            vl.mo62432a(true);
            C11992yl a = this.f28438g.mo61559a(activity, il);
            if (a != C11992yl.f28811a) {
                int ordinal = a.ordinal();
                if (ordinal == 1) {
                    str = String.format("no %s_config", new Object[]{"ui_access"});
                } else if (ordinal == 2) {
                    str = String.format("no %s_config", new Object[]{"ui_parsing"});
                } else if (ordinal != 3) {
                    str = ordinal != 4 ? ordinal != 5 ? "parsing ui context is forbidden for some reason" : "parsing ui context is forbidden by app for activity" : "parsing ui context is forbidden by app for application";
                } else {
                    str = String.format("feature %s disabled", new Object[]{"ui_parsing"});
                }
                ol.onError(str);
            } else if (!il.f24921c) {
                ol.onError(String.format("feature %s disabled", new Object[]{"ui_collecting_for_bridge"}));
            } else if (il.f24925g == null) {
                ol.onError(String.format("no %s_config", new Object[]{"ui_collecting_for_bridge"}));
            } else {
                C11292gm gmVar = this.f28436e;
                C11091bm bmVar = il.f24923e;
                C10344Hk.C10346b bVar = this.f28437f;
                C10468Lk lk = this.f28433b;
                C10248F9 f9 = this.f28434c;
                bVar.getClass();
                gmVar.mo62975a(activity, 0, il, bmVar, Collections.singletonList(new C10344Hk(lk, f9, z, vl, new C10344Hk.C10345a())));
            }
        } else {
            vl.onResult(this.f28433b.mo61739a());
        }
    }
}
