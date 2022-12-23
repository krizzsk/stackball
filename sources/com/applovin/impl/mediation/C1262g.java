package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.p020b.C1227e;
import com.applovin.impl.mediation.p021c.C1234a;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.g */
public class C1262g {

    /* renamed from: a */
    private final C1469j f2437a;

    /* renamed from: b */
    private final C1505q f2438b;

    /* renamed from: c */
    private final AtomicBoolean f2439c = new AtomicBoolean();

    /* renamed from: d */
    private final JSONArray f2440d = new JSONArray();

    /* renamed from: e */
    private final LinkedHashSet<String> f2441e = new LinkedHashSet<>();

    /* renamed from: f */
    private final Object f2442f = new Object();

    public C1262g(C1469j jVar) {
        this.f2437a = jVar;
        this.f2438b = jVar.mo13139v();
    }

    /* renamed from: a */
    public void mo12407a(Activity activity) {
        if (this.f2439c.compareAndSet(false, true)) {
            this.f2437a.mo13071K().mo13013a((C1392a) new C1234a(activity, this.f2437a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12408a(C1227e eVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean z;
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            synchronized (this.f2442f) {
                z = !mo12411a(eVar);
                if (z) {
                    this.f2441e.add(eVar.mo12336H());
                    JSONObject jSONObject = new JSONObject();
                    C1521i.m3477a(jSONObject, "class", eVar.mo12336H(), this.f2437a);
                    C1521i.m3477a(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()), this.f2437a);
                    C1521i.m3477a(jSONObject, "error_message", JSONObject.quote(str), this.f2437a);
                    this.f2440d.put(jSONObject);
                }
            }
            if (z) {
                this.f2437a.mo13094a(eVar);
                this.f2437a.mo13142y().maybeScheduleAdapterInitializationPostback(eVar, j, initializationStatus, str);
                this.f2437a.mo13105ab().mo13045a(initializationStatus, eVar.mo12336H());
            }
        }
    }

    /* renamed from: a */
    public void mo12409a(C1227e eVar, Activity activity) {
        C1264i a = this.f2437a.mo13140w().mo12414a(eVar);
        if (a != null) {
            C1505q qVar = this.f2438b;
            qVar.mo13279c("MediationAdapterInitializationManager", "Initializing adapter " + eVar);
            a.mo12419a((MaxAdapterInitializationParameters) MaxAdapterParametersImpl.m1826a(eVar, activity.getApplicationContext()), activity);
        }
    }

    /* renamed from: a */
    public boolean mo12410a() {
        return this.f2439c.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo12411a(C1227e eVar) {
        boolean contains;
        synchronized (this.f2442f) {
            contains = this.f2441e.contains(eVar.mo12336H());
        }
        return contains;
    }

    /* renamed from: b */
    public LinkedHashSet<String> mo12412b() {
        LinkedHashSet<String> linkedHashSet;
        synchronized (this.f2442f) {
            linkedHashSet = this.f2441e;
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public JSONArray mo12413c() {
        JSONArray jSONArray;
        synchronized (this.f2442f) {
            jSONArray = this.f2440d;
        }
        return jSONArray;
    }
}
