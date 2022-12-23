package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.mediation.p020b.C1227e;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.mediation.h */
public class C1263h {

    /* renamed from: a */
    private final C1469j f2443a;

    /* renamed from: b */
    private final C1505q f2444b;

    /* renamed from: c */
    private final Object f2445c = new Object();

    /* renamed from: d */
    private final Map<String, Class<? extends MaxAdapter>> f2446d = new HashMap();

    /* renamed from: e */
    private final Set<String> f2447e = new HashSet();

    public C1263h(C1469j jVar) {
        if (jVar != null) {
            this.f2443a = jVar;
            this.f2444b = jVar.mo13139v();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* renamed from: a */
    private C1264i m2239a(C1227e eVar, Class<? extends MaxAdapter> cls) {
        try {
            C1264i iVar = new C1264i(eVar, (MediationAdapterBase) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{this.f2443a.mo13078R()}), this.f2443a);
            if (iVar.mo12424c()) {
                return iVar;
            }
            C1505q.m3345i("MediationAdapterManager", "Adapter is disabled after initialization: " + eVar);
            return null;
        } catch (Throwable th) {
            C1505q.m3341c("MediationAdapterManager", "Failed to load adapter: " + eVar, th);
            return null;
        }
    }

    /* renamed from: a */
    private Class<? extends MaxAdapter> m2240a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            C1505q.m3345i("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable th) {
            C1505q.m3341c("MediationAdapterManager", "Failed to load: " + str, th);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1264i mo12414a(C1227e eVar) {
        Class<? extends MaxAdapter> cls;
        if (eVar != null) {
            String I = eVar.mo12337I();
            String H = eVar.mo12336H();
            if (TextUtils.isEmpty(I)) {
                C1505q qVar = this.f2444b;
                qVar.mo13281e("MediationAdapterManager", "No adapter name provided for " + H + ", not loading the adapter ");
                return null;
            } else if (TextUtils.isEmpty(H)) {
                C1505q qVar2 = this.f2444b;
                qVar2.mo13281e("MediationAdapterManager", "Unable to find default classname for '" + I + "'");
                return null;
            } else {
                synchronized (this.f2445c) {
                    if (!this.f2447e.contains(H)) {
                        if (this.f2446d.containsKey(H)) {
                            cls = this.f2446d.get(H);
                        } else {
                            cls = m2240a(H);
                            if (cls == null) {
                                this.f2447e.add(H);
                                return null;
                            }
                        }
                        C1264i a = m2239a(eVar, cls);
                        if (a != null) {
                            C1505q qVar3 = this.f2444b;
                            qVar3.mo13277b("MediationAdapterManager", "Loaded " + I);
                            this.f2446d.put(H, cls);
                            return a;
                        }
                        C1505q qVar4 = this.f2444b;
                        qVar4.mo13281e("MediationAdapterManager", "Failed to load " + I);
                        this.f2447e.add(H);
                        return null;
                    }
                    C1505q qVar5 = this.f2444b;
                    qVar5.mo13277b("MediationAdapterManager", "Not attempting to load " + I + " due to prior errors");
                    return null;
                }
            }
        } else {
            throw new IllegalArgumentException("No adapter spec specified");
        }
    }

    /* renamed from: a */
    public Collection<String> mo12415a() {
        Set unmodifiableSet;
        synchronized (this.f2445c) {
            HashSet hashSet = new HashSet(this.f2446d.size());
            for (Class<? extends MaxAdapter> name : this.f2446d.values()) {
                hashSet.add(name.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    /* renamed from: b */
    public Collection<String> mo12416b() {
        Set<T> unmodifiableSet;
        synchronized (this.f2445c) {
            unmodifiableSet = Collections.unmodifiableSet(this.f2447e);
        }
        return unmodifiableSet;
    }
}
