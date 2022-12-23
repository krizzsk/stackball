package com.applovin.impl.sdk;

import com.applovin.impl.mediation.p020b.C1223a;
import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.utils.C1557r;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.l */
public class C1480l {

    /* renamed from: a */
    private final Map<String, Thread> f3588a = new HashMap();

    /* renamed from: b */
    private final Object f3589b = new Object();

    /* renamed from: c */
    private final C1469j f3590c;

    public C1480l(C1469j jVar) {
        this.f3590c = jVar;
        if (((Boolean) jVar.mo13088a(C1369c.f3113eu)).booleanValue()) {
            m3163a("ltg-" + C1557r.m3588a(C1371e.f3156h, jVar)).start();
        }
    }

    /* renamed from: a */
    private static Thread m3163a(String str) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(System.currentTimeMillis());
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }, str);
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: c */
    private String m3164c(Object obj) {
        if (obj instanceof C1223a) {
            C1223a aVar = (C1223a) obj;
            return aVar.getFormat().getLabel() + '-' + aVar.mo12338J() + '-' + aVar.mo12285b();
        } else if (!(obj instanceof C1355g)) {
            return null;
        } else {
            C1355g gVar = (C1355g) obj;
            int identityHashCode = System.identityHashCode(gVar);
            String str = obj instanceof C1000a ? "-VAST" : "";
            return "AL-" + gVar.getAdZone().mo12714b().getLabel() + "-" + gVar.getAdIdNumber() + "-" + identityHashCode + str;
        }
    }

    /* renamed from: a */
    public void mo13156a(Object obj) {
        String c = m3164c(obj);
        if (((Boolean) this.f3590c.mo13088a(C1369c.f3113eu)).booleanValue() && c != null) {
            synchronized (this.f3589b) {
                if (!this.f3588a.containsKey(c)) {
                    C1505q v = this.f3590c.mo13139v();
                    v.mo13277b("AppLovinSdk", "Creating ad debug thread with name: " + c);
                    Thread a = m3163a(c);
                    a.start();
                    this.f3588a.put(c, a);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo13157b(Object obj) {
        String c = m3164c(obj);
        if (((Boolean) this.f3590c.mo13088a(C1369c.f3113eu)).booleanValue() && c != null) {
            synchronized (this.f3589b) {
                Thread thread = this.f3588a.get(c);
                if (thread != null) {
                    C1505q v = this.f3590c.mo13139v();
                    v.mo13277b("AppLovinSdk", "Destroying ad debug thread with name: " + c);
                    thread.interrupt();
                    this.f3588a.remove(c);
                }
            }
        }
    }
}
