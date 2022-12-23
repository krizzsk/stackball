package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.C10086i;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.xg */
public class C11949xg {
    /* renamed from: a */
    public C12043l mo64079a(C12043l lVar) {
        if (!C10796U2.m27891a((Object) lVar.maxReportsInDatabaseCount)) {
            return lVar;
        }
        C12043l.C12045b a = C12043l.m31129a((YandexMetricaConfig) lVar).mo64250a((List<String>) new ArrayList());
        if (C10796U2.m27891a((Object) lVar.f28945a)) {
            a.mo64256b(lVar.f28945a);
        }
        if (C10796U2.m27891a((Object) lVar.f28946b) && C10796U2.m27891a((Object) lVar.f28953i)) {
            a.mo64251a(lVar.f28946b, lVar.f28953i);
        }
        if (C10796U2.m27891a((Object) lVar.f28949e)) {
            a.mo64244a(lVar.f28949e.intValue());
        }
        if (C10796U2.m27891a((Object) lVar.f28950f)) {
            a.mo64255b(lVar.f28950f.intValue());
        }
        if (C10796U2.m27891a((Object) lVar.f28951g)) {
            a.mo64259c(lVar.f28951g.intValue());
        }
        if (C10796U2.m27891a((Object) lVar.f28947c)) {
            a.f28962f = lVar.f28947c;
        }
        if (C10796U2.m27891a((Object) lVar.f28952h)) {
            for (Map.Entry next : lVar.f28952h.entrySet()) {
                a.mo64249a((String) next.getKey(), (String) next.getValue());
            }
        }
        if (C10796U2.m27891a((Object) lVar.f28954j)) {
            a.mo64267g(lVar.f28954j.booleanValue());
        }
        if (C10796U2.m27891a((Object) lVar.f28948d)) {
            a.mo64250a(lVar.f28948d);
        }
        if (C10796U2.m27891a((Object) lVar.f28955k)) {
            a.mo64258b(lVar.f28955k.booleanValue());
        }
        return a.mo64262d(m30846a(lVar.maxReportsInDatabaseCount, lVar.apiKey)).mo64253a();
    }

    /* renamed from: a */
    public C10086i mo64078a(C10086i iVar) {
        return C10796U2.m27891a((Object) iVar.maxReportsInDatabaseCount) ? C10086i.m25950a(iVar).mo61030a(m30846a(iVar.maxReportsInDatabaseCount, iVar.apiKey)).mo61031a() : iVar;
    }

    /* renamed from: a */
    private int m30846a(Integer num, String str) {
        if (num.intValue() < 100) {
            C12038zm.m31087b(str).mo64226c("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to %d, but was: %d. Default value (%d) will be used", 100, num, 100);
            return 100;
        } else if (num.intValue() <= 10000) {
            return num.intValue();
        } else {
            C12038zm.m31087b(str).mo64226c("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to %d, but was: %d. Default value (%d) will be used", 10000, num, 10000);
            return 10000;
        }
    }
}
