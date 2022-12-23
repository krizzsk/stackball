package com.chartboost.sdk.impl;

import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Libraries.C1828g;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1837b;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.Tracking.C1872c;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.impl.C1965p0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.o */
public class C1956o implements C1965p0.C1966a {

    /* renamed from: a */
    public C1952n f5019a;

    /* renamed from: b */
    private final C1828g f5020b;

    /* renamed from: c */
    private final C1855g f5021c;

    /* renamed from: d */
    private final C1842g f5022d;

    /* renamed from: e */
    private final AtomicReference<C1844h> f5023e;

    /* renamed from: f */
    private int f5024f = 1;

    /* renamed from: g */
    private int f5025g = 0;

    /* renamed from: h */
    private long f5026h = 0;

    /* renamed from: i */
    private C1965p0 f5027i = null;

    /* renamed from: j */
    private AtomicInteger f5028j = null;

    public C1956o(C1952n nVar, C1828g gVar, C1855g gVar2, C1842g gVar3, AtomicReference<C1844h> atomicReference) {
        this.f5019a = nVar;
        this.f5020b = gVar;
        this.f5021c = gVar2;
        this.f5022d = gVar3;
        this.f5023e = atomicReference;
    }

    /* renamed from: a */
    private void m4732a(C1844h hVar) {
        boolean z = hVar.f4536q;
        if ((this.f5025g == 1 && !(!z && hVar.f4524e)) || (this.f5025g == 2 && !z)) {
            CBLogging.m3991a("Prefetcher", "Change state to IDLE");
            this.f5024f = 1;
            this.f5025g = 0;
            this.f5026h = 0;
            this.f5027i = null;
            AtomicInteger atomicInteger = this.f5028j;
            this.f5028j = null;
            if (atomicInteger != null) {
                this.f5019a.mo14709a(atomicInteger);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo14719b() {
        try {
            CBLogging.m3995c("Chartboost SDK", "Sdk Version = 8.2.1, Commit: 47ae58346b771626762a300b4688c6bcdeb1fde2");
            C1844h hVar = this.f5023e.get();
            m4732a(hVar);
            if (!hVar.f4522c && !hVar.f4521b) {
                if (C2026k.f5259p) {
                    if (this.f5024f == 3) {
                        if (this.f5028j.get() <= 0) {
                            CBLogging.m3991a("Prefetcher", "Change state to COOLDOWN");
                            this.f5024f = 4;
                            this.f5028j = null;
                        } else {
                            return;
                        }
                    }
                    if (this.f5024f == 4) {
                        if (this.f5026h - System.nanoTime() > 0) {
                            CBLogging.m3991a("Prefetcher", "Prefetch session is still active. Won't be making any new prefetch until the prefetch session expires");
                            return;
                        }
                        CBLogging.m3991a("Prefetcher", "Change state to IDLE");
                        this.f5024f = 1;
                        this.f5025g = 0;
                        this.f5026h = 0;
                    }
                    if (this.f5024f == 1) {
                        if (hVar.f4536q) {
                            C1972q0 q0Var = new C1972q0(hVar.f4543x, this.f5022d, 2, this);
                            q0Var.mo14782a("cache_assets", this.f5020b.mo14241d(), 0);
                            q0Var.f5055m = true;
                            CBLogging.m3991a("Prefetcher", "Change state to AWAIT_PREFETCH_RESPONSE");
                            this.f5024f = 2;
                            this.f5025g = 2;
                            this.f5026h = System.nanoTime() + TimeUnit.MINUTES.toNanos((long) hVar.f4540u);
                            this.f5027i = q0Var;
                        } else if (hVar.f4524e) {
                            C1965p0 p0Var = new C1965p0("https://live.chartboost.com", "/api/video-prefetch", this.f5022d, 2, this);
                            p0Var.mo14750a("local-videos", (Object) this.f5020b.mo14239c());
                            p0Var.f5055m = true;
                            CBLogging.m3991a("Prefetcher", "Change state to AWAIT_PREFETCH_RESPONSE");
                            this.f5024f = 2;
                            this.f5025g = 1;
                            this.f5026h = System.nanoTime() + TimeUnit.MINUTES.toNanos((long) hVar.f4528i);
                            this.f5027i = p0Var;
                        } else {
                            CBLogging.m3993b("Prefetcher", "Did not prefetch because neither native nor webview are enabled.");
                            return;
                        }
                        this.f5021c.mo14335a(this.f5027i);
                    } else {
                        return;
                    }
                }
            }
            mo14718a();
        } catch (Exception e) {
            if (this.f5024f == 2) {
                CBLogging.m3991a("Prefetcher", "Change state to COOLDOWN");
                this.f5024f = 4;
                this.f5027i = null;
            }
            CBLogging.m3993b("Prefetcher", "prefetch: " + e.toString());
        }
    }

    /* renamed from: a */
    public synchronized void mo14718a() {
        int i = this.f5024f;
        if (i == 2) {
            CBLogging.m3991a("Prefetcher", "Change state to COOLDOWN");
            this.f5024f = 4;
            this.f5027i = null;
        } else if (i == 3) {
            CBLogging.m3991a("Prefetcher", "Change state to COOLDOWN");
            this.f5024f = 4;
            AtomicInteger atomicInteger = this.f5028j;
            this.f5028j = null;
            if (atomicInteger != null) {
                this.f5019a.mo14709a(atomicInteger);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo14615a(C1965p0 p0Var, JSONObject jSONObject) {
        try {
            if (this.f5024f == 2) {
                if (p0Var == this.f5027i) {
                    CBLogging.m3991a("Prefetcher", "Change state to DOWNLOAD_ASSETS");
                    this.f5024f = 3;
                    this.f5027i = null;
                    this.f5028j = new AtomicInteger();
                    if (jSONObject != null) {
                        CBLogging.m3991a("Prefetcher", "Got Asset list for Prefetch from server :)" + jSONObject);
                        if (this.f5025g == 1) {
                            this.f5019a.mo14707a(3, C1837b.m4070b(jSONObject), this.f5028j, (C1936j) null, "");
                        } else if (this.f5025g == 2) {
                            this.f5019a.mo14707a(3, C1837b.m4071b(jSONObject, this.f5023e.get().f4533n), this.f5028j, (C1936j) null, "");
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } catch (Exception e) {
            CBLogging.m3993b("Prefetcher", "prefetch onSuccess: " + e.toString());
        }
        return;
    }

    /* renamed from: a */
    public synchronized void mo14614a(C1965p0 p0Var, CBError cBError) {
        String str = "Prefetch failure";
        if (cBError != null) {
            str = cBError.getErrorDesc();
        }
        C1874e.m4311e(new C1872c("prefetch_request_error", str, "", ""));
        if (this.f5024f == 2) {
            if (p0Var == this.f5027i) {
                this.f5027i = null;
                CBLogging.m3991a("Prefetcher", "Change state to COOLDOWN");
                this.f5024f = 4;
            }
        }
    }
}
