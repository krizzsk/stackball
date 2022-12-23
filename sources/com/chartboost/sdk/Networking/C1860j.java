package com.chartboost.sdk.Networking;

import com.chartboost.sdk.Libraries.C1828g;
import com.chartboost.sdk.Libraries.C1830i;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.chartboost.sdk.Networking.j */
public class C1860j {

    /* renamed from: a */
    private final C1828g f4595a;

    /* renamed from: b */
    private final Map<String, C1830i.C1831a> f4596b = new HashMap();

    public C1860j(C1828g gVar) {
        this.f4595a = gVar;
    }

    /* renamed from: a */
    private boolean m4195a(String str) {
        return this.f4595a.mo14237b(String.format("%s%s", new Object[]{str, ".png"}));
    }

    /* renamed from: b */
    public C1830i.C1831a mo14348b(String str) {
        if (!m4195a(str)) {
            this.f4596b.remove(str);
            return null;
        } else if (this.f4596b.containsKey(str)) {
            return this.f4596b.get(str);
        } else {
            C1830i.C1831a aVar = new C1830i.C1831a(str, new File(this.f4595a.mo14234a().f4394b, String.format("%s%s", new Object[]{str, ".png"})), this.f4595a);
            this.f4596b.put(str, aVar);
            return aVar;
        }
    }
}
