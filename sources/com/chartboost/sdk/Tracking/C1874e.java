package com.chartboost.sdk.Tracking;

import android.content.Context;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Model.C1847i;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.impl.C1985u0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.chartboost.sdk.Tracking.e */
public class C1874e {

    /* renamed from: a */
    private Context f4653a;

    /* renamed from: b */
    private C1873d f4654b;

    /* renamed from: c */
    private C1855g f4655c;

    /* renamed from: d */
    private C1842g f4656d;

    /* renamed from: e */
    private ScheduledExecutorService f4657e;

    /* renamed from: f */
    private HashMap<String, LinkedList<C1878i>> f4658f = new HashMap<>();

    /* renamed from: g */
    private HashMap<String, LinkedList<C1878i>> f4659g = new HashMap<>();

    /* renamed from: h */
    private HashMap<String, LinkedList<C1878i>> f4660h = new HashMap<>();

    /* renamed from: i */
    private HashMap<String, LinkedList<C1878i>> f4661i = new HashMap<>();

    /* renamed from: j */
    private HashMap<String, C1877h> f4662j = new HashMap<>();

    /* renamed from: k */
    private C1847i f4663k;

    public C1874e(Context context, C1873d dVar, C1855g gVar, C1842g gVar2, ScheduledExecutorService scheduledExecutorService, C1847i iVar) {
        this.f4653a = context;
        this.f4654b = dVar;
        this.f4655c = gVar;
        this.f4656d = gVar2;
        this.f4657e = scheduledExecutorService;
        this.f4663k = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m4307b(C1878i iVar) {
        if (!m4310d(iVar)) {
            HashMap<String, C1877h> hashMap = this.f4662j;
            C1877h hVar = hashMap.get(iVar.mo14467d() + iVar.mo14457a());
            if (hVar != null) {
                iVar.mo14459a(hVar);
            }
            iVar.mo14458a(m4299a(iVar));
            m4301a(this.f4663k, iVar);
            CBLogging.m3991a("EventTracker", "Event: " + iVar.toString());
        }
    }

    /* renamed from: d */
    private boolean m4310d(C1878i iVar) {
        if (!m4304a(iVar.mo14470f())) {
            return false;
        }
        String a = iVar.mo14457a();
        String d = iVar.mo14467d();
        LinkedList<C1878i> c = m4308c(a, d);
        if (c == null) {
            c = new LinkedList<>();
        }
        c.add(iVar);
        m4303a(a, d, c);
        return true;
    }

    /* renamed from: e */
    public static void m4311e(C1878i iVar) {
        C1874e b = m4305b();
        if (b != null) {
            b.mo14445f(iVar);
        }
    }

    /* renamed from: a */
    public void mo14442a(C1847i iVar) {
        this.f4663k = iVar;
    }

    /* renamed from: f */
    public C1878i mo14445f(C1878i iVar) {
        ScheduledExecutorService scheduledExecutorService;
        if (iVar == null) {
            return null;
        }
        if (!this.f4663k.mo14328d()) {
            return iVar;
        }
        CBLogging.m3991a("EventTracker", "Track: " + iVar.mo14470f());
        C1878i b = this.f4654b.mo14441b(iVar);
        if (!(this.f4653a == null || (scheduledExecutorService = this.f4657e) == null || b == null)) {
            scheduledExecutorService.schedule(new Runnable(b) {
                public final /* synthetic */ C1878i f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C1874e.this.m4307b(this.f$1);
                }
            }, 1, TimeUnit.MILLISECONDS);
        }
        return b;
    }

    /* renamed from: a */
    public void mo14443a(C1877h hVar) {
        HashMap<String, C1877h> hashMap = this.f4662j;
        hashMap.put(hVar.mo14455d() + hVar.mo14454c(), hVar);
    }

    /* renamed from: b */
    public void mo14444b(String str, String str2) {
        if (IronSourceConstants.INTERSTITIAL_AD_UNIT.equals(str)) {
            this.f4658f.remove(str2);
        } else if ("Rewarded".equals(str)) {
            this.f4659g.remove(str2);
        } else if (IronSourceConstants.BANNER_AD_UNIT.equals(str)) {
            this.f4660h.remove(str2);
        } else {
            this.f4661i.remove(str2);
        }
    }

    /* renamed from: a */
    private boolean m4304a(String str) {
        return "cache_start".equals(str) || "show_start".equals(str);
    }

    /* renamed from: a */
    private float m4299a(C1878i iVar) {
        if (!iVar.mo14464b()) {
            return 0.0f;
        }
        try {
            LinkedList<C1878i> c = m4308c(iVar.mo14457a(), iVar.mo14467d());
            C1878i iVar2 = null;
            if (c != null) {
                iVar2 = c.remove();
            }
            if (iVar2 != null) {
                return ((float) (iVar.mo14471g() - iVar2.mo14471g())) / 1000.0f;
            }
            return 0.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* renamed from: b */
    public static void m4306b(C1877h hVar) {
        C1874e b = m4305b();
        if (b != null) {
            b.mo14443a(hVar);
        }
    }

    /* renamed from: b */
    private static C1874e m4305b() {
        C2022j b = C2022j.m4955b();
        if (b != null) {
            return b.mo14900e();
        }
        return null;
    }

    /* renamed from: c */
    private LinkedList<C1878i> m4308c(String str, String str2) {
        if (IronSourceConstants.INTERSTITIAL_AD_UNIT.equals(str)) {
            return this.f4658f.get(str2);
        }
        if ("Rewarded".equals(str)) {
            return this.f4659g.get(str2);
        }
        if (IronSourceConstants.BANNER_AD_UNIT.equals(str)) {
            return this.f4660h.get(str2);
        }
        return this.f4661i.get(str2);
    }

    /* renamed from: a */
    private void m4303a(String str, String str2, LinkedList<C1878i> linkedList) {
        if (IronSourceConstants.INTERSTITIAL_AD_UNIT.equals(str)) {
            this.f4658f.put(str2, linkedList);
        } else if ("Rewarded".equals(str)) {
            this.f4659g.put(str2, linkedList);
        } else if (IronSourceConstants.BANNER_AD_UNIT.equals(str)) {
            this.f4660h.put(str2, linkedList);
        } else {
            this.f4661i.put(str2, linkedList);
        }
    }

    /* renamed from: a */
    private void m4301a(C1847i iVar, C1878i iVar2) {
        if (this.f4656d != null && this.f4653a != null) {
            C1985u0 u0Var = new C1985u0(iVar.mo14325a(), iVar2, m4300a());
            C1855g gVar = this.f4655c;
            if (gVar != null) {
                gVar.mo14335a(u0Var);
            }
        }
    }

    /* renamed from: a */
    private C1869b m4300a() {
        return C1869b.m4218a(this.f4653a, this.f4656d.mo14309e(), this.f4656d.mo14313i(), this.f4656d.mo14307c());
    }

    /* renamed from: a */
    public static void m4302a(String str, String str2) {
        C1874e b = m4305b();
        if (b != null) {
            b.mo14444b(str, str2);
        }
    }
}
