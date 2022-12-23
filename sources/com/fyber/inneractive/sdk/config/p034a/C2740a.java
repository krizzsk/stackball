package com.fyber.inneractive.sdk.config.p034a;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2744d;
import com.fyber.inneractive.sdk.config.p034a.p035a.C2746f;
import com.fyber.inneractive.sdk.p055l.C3024a;
import com.fyber.inneractive.sdk.util.C3671r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: com.fyber.inneractive.sdk.config.a.a */
public class C2740a {

    /* renamed from: c */
    private static final String f6465c = C2740a.class.getSimpleName();

    /* renamed from: a */
    C2766r f6466a;

    /* renamed from: b */
    public C2760l f6467b;

    /* renamed from: d */
    private C2767s f6468d;

    public C2740a(C2766r rVar) {
        this.f6466a = rVar;
    }

    /* renamed from: a */
    public final void mo17978a(C2767s sVar) {
        C2759k kVar;
        this.f6468d = sVar;
        for (C2744d next : sVar.f6511b.values()) {
            C2760l lVar = this.f6467b;
            if (!(next == null || lVar == null)) {
                C2765q qVar = lVar.f6504a.get(next.f6469a);
                if (qVar != null) {
                    next.mo18006a(qVar.mo18007b());
                    IAlog.m9034b("%s: Feature before variant merge: %s", f6465c, next);
                    Map<String, C2750b> map = qVar.f6508b;
                    for (String str : map.keySet()) {
                        C2750b bVar = map.get(str);
                        if (!(next == null || bVar == null || m5963a(next, bVar))) {
                            if (bVar != null) {
                                List<C2759k> list = bVar.f6486c;
                                int a = m5962a();
                                IAlog.m9034b("%s: selectVariant for experiment '%s' generated random number: %d", f6465c, bVar.f6484a, Integer.valueOf(a));
                                Iterator<C2759k> it = list.iterator();
                                int i = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    kVar = it.next();
                                    i += kVar.f6503b;
                                    IAlog.m9034b("%s: selectVariant variant found: %s", f6465c, kVar);
                                    if (i >= a) {
                                        break;
                                    }
                                    IAlog.m9034b("%s: selectVariant variant '%s' percentage outside selected range", f6465c, kVar.f6502a);
                                }
                            }
                            kVar = null;
                            if (kVar != null) {
                                IAlog.m9034b("%s: experiment '%s' variant selected! %s", f6465c, bVar.f6484a, kVar);
                            } else {
                                IAlog.m9034b("%s: experiment '%s' no variant was selected! using control group", f6465c, bVar.f6484a);
                            }
                            next.f6470b.add(bVar);
                            if (kVar != null) {
                                next.f6471d.put(bVar.f6484a, kVar);
                            }
                        }
                    }
                }
                IAlog.m9034b("%s: Feature after variant merge: %s", f6465c, next);
            }
        }
    }

    /* renamed from: a */
    private boolean m5963a(C2744d dVar, C2750b bVar) {
        int a = m5962a();
        if (bVar.f6485b < a) {
            IAlog.m9034b("%s: Experiment '%s' filtered! rand: %d, with perc: %d", f6465c, bVar.f6484a, Integer.valueOf(a), Integer.valueOf(bVar.f6485b));
            return true;
        }
        List<C2752d> list = bVar.f6487d;
        if (list != null) {
            for (C2752d next : list) {
                try {
                    Long valueOf = Long.valueOf(IAConfigManager.m5940k());
                    C2753e eVar = new C2753e();
                    eVar.f6491b = valueOf;
                    eVar.f6492c = C3024a.m7047a(this.f6468d.f6510a);
                    if (next.mo17992a(eVar)) {
                        IAlog.m9034b("%s: Experiment '%s' filtered! with %s", f6465c, bVar.f6484a, next);
                        return true;
                    }
                } catch (NumberFormatException unused) {
                    IAlog.m9034b("%s: invalid publisherId", f6465c);
                }
            }
        }
        if (dVar instanceof C2746f) {
            for (C2759k a2 : bVar.f6486c) {
                if (a2.mo17999a("use_fmp_cache_mechanism") && !IAConfigManager.m5921a(C3671r.C3674b.Video, "vid_cache")) {
                    return true;
                }
            }
        }
        IAlog.m9034b("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", f6465c, bVar.f6484a, Integer.valueOf(a), Integer.valueOf(bVar.f6485b));
        return false;
    }

    /* renamed from: a */
    private static int m5962a() {
        return new Random().nextInt(100) + 1;
    }
}
