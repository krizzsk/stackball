package com.applovin.impl.mediation.p012a.p015c.p016a;

import android.content.Context;
import com.applovin.impl.mediation.p012a.p013a.C1174c;
import com.applovin.impl.mediation.p012a.p013a.C1176d;
import com.applovin.impl.mediation.p012a.p013a.C1180g;
import com.applovin.impl.mediation.p012a.p015c.C1183a;
import com.applovin.impl.mediation.p012a.p015c.p016a.p017a.C1188a;
import com.applovin.impl.sdk.C1469j;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.a.c.a.b */
public class C1189b extends C1183a {

    /* renamed from: c */
    private final AtomicBoolean f2261c = new AtomicBoolean();

    /* renamed from: d */
    private final C1174c f2262d = new C1180g("INCOMPLETE INTEGRATIONS");

    /* renamed from: e */
    private final C1174c f2263e = new C1180g("COMPLETED INTEGRATIONS");

    /* renamed from: f */
    private final C1174c f2264f = new C1180g("MISSING INTEGRATIONS");

    /* renamed from: g */
    private final C1174c f2265g = new C1180g("");

    /* renamed from: h */
    private C1191a f2266h;

    /* renamed from: com.applovin.impl.mediation.a.c.a.b$a */
    public interface C1191a {
        /* renamed from: a */
        void mo12211a(C1176d dVar);
    }

    public C1189b(Context context) {
        super(context);
    }

    /* renamed from: b */
    private List<C1174c> m1937b(List<C1176d> list, C1469j jVar) {
        jVar.mo13139v().mo13277b("MediationDebuggerListAdapter", "Updating networks...");
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C1176d next : list) {
            C1188a aVar = new C1188a(next, this.f2246a);
            if (next.mo12169a() == C1176d.C1177a.INCOMPLETE_INTEGRATION || next.mo12169a() == C1176d.C1177a.INVALID_INTEGRATION) {
                arrayList2.add(aVar);
            } else if (next.mo12169a() == C1176d.C1177a.COMPLETE) {
                arrayList3.add(aVar);
            } else if (next.mo12169a() == C1176d.C1177a.MISSING) {
                arrayList4.add(aVar);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(this.f2262d);
            arrayList.addAll(arrayList2);
        }
        if (arrayList3.size() > 0) {
            arrayList.add(this.f2263e);
            arrayList.addAll(arrayList3);
        }
        if (arrayList4.size() > 0) {
            arrayList.add(this.f2264f);
            arrayList.addAll(arrayList4);
        }
        arrayList.add(this.f2265g);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12196a(C1174c cVar) {
        if (this.f2266h != null && (cVar instanceof C1188a)) {
            this.f2266h.mo12211a(((C1188a) cVar).mo12212k());
        }
    }

    /* renamed from: a */
    public void mo12214a(C1191a aVar) {
        this.f2266h = aVar;
    }

    /* renamed from: a */
    public void mo12215a(List<C1176d> list, C1469j jVar) {
        if (list != null && this.f2261c.compareAndSet(false, true)) {
            this.f2247b.addAll(m1937b(list, jVar));
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                C1189b.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: a */
    public boolean mo12216a() {
        return this.f2261c.get();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f2261c.get() + ", listItems=" + this.f2247b + "}";
    }
}
