package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10810Uf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Nd */
public class C10548Nd {

    /* renamed from: a */
    private final C10129B8 f25245a;

    /* renamed from: b */
    private final C10101A8 f25246b;

    /* renamed from: c */
    private final C10429Kd f25247c;

    /* renamed from: d */
    private final C10368Id f25248d;

    public C10548Nd(Context context) {
        this(C10663Qa.m27298a(context).mo61963f(), C10663Qa.m27298a(context).mo61962e(), new C10161Cc(context), new C10402Jd(), new C10337Hd());
    }

    /* renamed from: a */
    public C10520Md mo61816a(int i) {
        Map<Long, String> a = this.f25245a.mo63586a(i);
        Map<Long, String> a2 = this.f25246b.mo63586a(i);
        C10810Uf uf = new C10810Uf();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) a;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C10810Uf.C10812b a3 = this.f25247c.mo61663a(((Long) entry.getKey()).longValue(), (String) entry.getValue());
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        uf.f25927b = (C10810Uf.C10812b[]) arrayList.toArray(new C10810Uf.C10812b[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) a2;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C10810Uf.C10811a a4 = this.f25248d.mo61537a(((Long) entry2.getKey()).longValue(), (String) entry2.getValue());
            if (a4 != null) {
                arrayList2.add(a4);
            }
        }
        uf.f25928c = (C10810Uf.C10811a[]) arrayList2.toArray(new C10810Uf.C10811a[arrayList2.size()]);
        long j = -1;
        long longValue = a.isEmpty() ? -1 : ((Long) Collections.max(linkedHashMap.keySet())).longValue();
        if (!a2.isEmpty()) {
            j = ((Long) Collections.max(linkedHashMap2.keySet())).longValue();
        }
        return new C10520Md(longValue, j, uf);
    }

    C10548Nd(C10129B8 b8, C10101A8 a8, C10161Cc cc, C10402Jd jd, C10337Hd hd) {
        this(b8, a8, new C10429Kd(cc, jd), new C10368Id(cc, hd));
    }

    C10548Nd(C10129B8 b8, C10101A8 a8, C10429Kd kd, C10368Id id) {
        this.f25245a = b8;
        this.f25246b = a8;
        this.f25247c = kd;
        this.f25248d = id;
    }

    /* renamed from: a */
    public void mo61817a(C10520Md md) {
        long j = md.f25204a;
        if (j >= 0) {
            this.f25245a.mo63590c(j);
        }
        long j2 = md.f25205b;
        if (j2 >= 0) {
            this.f25246b.mo63590c(j2);
        }
    }
}
