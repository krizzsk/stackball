package com.applovin.impl.mediation.p012a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.applovin.impl.mediation.p012a.p013a.C1176d;
import com.applovin.impl.mediation.p012a.p014b.C1181a;
import com.applovin.impl.mediation.p012a.p015c.p016a.C1189b;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.network.C1484a;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1512a;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.mediation.MaxDebuggerActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.a */
public class C1170a implements C1484a.C1487c<JSONObject> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static WeakReference<MaxDebuggerActivity> f2188a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicBoolean f2189b = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1469j f2190c;

    /* renamed from: d */
    private final C1505q f2191d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1189b f2192e;

    /* renamed from: f */
    private final AtomicBoolean f2193f = new AtomicBoolean();

    /* renamed from: g */
    private boolean f2194g;

    public C1170a(C1469j jVar) {
        this.f2190c = jVar;
        this.f2191d = jVar.mo13139v();
        this.f2192e = new C1189b(jVar.mo13065D());
    }

    /* renamed from: a */
    private List<C1176d> m1853a(JSONObject jSONObject, C1469j jVar) {
        JSONArray b = C1521i.m3491b(jSONObject, "networks", new JSONArray(), jVar);
        ArrayList arrayList = new ArrayList(b.length());
        for (int i = 0; i < b.length(); i++) {
            JSONObject a = C1521i.m3474a(b, i, (JSONObject) null, jVar);
            if (a != null) {
                arrayList.add(new C1176d(a, jVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: e */
    private void m1859e() {
        if (this.f2193f.compareAndSet(false, true)) {
            this.f2190c.mo13071K().mo13014a((C1392a) new C1181a(this, this.f2190c), C1435s.C1437a.MEDIATION_MAIN);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public boolean m1860f() {
        WeakReference<MaxDebuggerActivity> weakReference = f2188a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: a */
    public void mo12144a(int i) {
        C1505q qVar = this.f2191d;
        qVar.mo13281e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        C1505q.m3345i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f2192e.mo12215a((List<C1176d>) null, this.f2190c);
        this.f2193f.set(false);
    }

    /* renamed from: a */
    public void mo12145a(JSONObject jSONObject, int i) {
        List<C1176d> a = m1853a(jSONObject, this.f2190c);
        this.f2192e.mo12215a(a, this.f2190c);
        StringBuilder sb = new StringBuilder(" ");
        for (C1176d n : a) {
            String sb2 = sb.toString();
            String n2 = n.mo12183n();
            if (sb2.length() + n2.length() >= ((Integer) this.f2190c.mo13088a(C1369c.f2892ai)).intValue()) {
                C1505q.m3342f("MediationDebuggerService", sb2);
                sb.setLength(1);
            }
            sb.append(n2);
        }
        sb.append("\n------------------ END ------------------");
        C1505q.m3342f("MediationDebuggerService", sb.toString());
    }

    /* renamed from: a */
    public void mo12147a(boolean z) {
        this.f2194g = z;
    }

    /* renamed from: a */
    public boolean mo12148a() {
        return this.f2194g;
    }

    /* renamed from: b */
    public void mo12149b() {
        m1859e();
        if (m1860f() || !f2189b.compareAndSet(false, true)) {
            C1505q.m3345i("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        this.f2190c.mo13086Z().mo12602a(new C1512a() {
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    C1505q.m3342f("AppLovinSdk", "Mediation debugger destroyed");
                    C1170a.this.f2190c.mo13086Z().mo12604b(this);
                    WeakReference unused = C1170a.f2188a = null;
                }
            }

            public void onActivityStarted(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    C1505q.m3342f("AppLovinSdk", "Started mediation debugger");
                    if (!C1170a.this.m1860f() || C1170a.f2188a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = C1170a.f2188a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(C1170a.this.f2192e, C1170a.this.f2190c.mo13086Z());
                    }
                    C1170a.f2189b.set(false);
                }
            }
        });
        Context D = this.f2190c.mo13065D();
        Intent intent = new Intent(D, MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        C1505q.m3342f("AppLovinSdk", "Starting mediation debugger...");
        D.startActivity(intent);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f2192e + "}";
    }
}
