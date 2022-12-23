package com.flurry.sdk;

import com.facebook.internal.AnalyticsEvents;
import com.flurry.sdk.C2368av;
import com.flurry.sdk.C2537di;
import com.flurry.sdk.C2542dk;
import com.google.common.net.HttpHeaders;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.au */
public class C2364au extends C2549dn<C2368av> {

    /* renamed from: a */
    public static long f5440a;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f5441g = C2364au.class.getSimpleName();

    /* renamed from: a */
    public final /* synthetic */ void mo17577a(C2548dm dmVar) {
        final C2368av avVar = (C2368av) dmVar;
        String str = f5441g;
        C2530db.m5474a(3, str, "Sending next pulse report to " + avVar.f5459l + " at: " + avVar.f6001r);
        C2449bq.m5261a();
        long d = C2449bq.m5266d();
        if (d == 0) {
            d = f5440a;
        }
        long j = d;
        C2449bq.m5261a();
        long g = C2449bq.m5269g();
        if (g == 0) {
            g = System.currentTimeMillis() - j;
        }
        final C2372aw awVar = new C2372aw(avVar, j, g, avVar.f5999p);
        C2537di diVar = new C2537di();
        diVar.f5970g = avVar.f6001r;
        diVar.f6169u = 100000;
        if (avVar.f5451d.equals(C2401bc.POST)) {
            diVar.f5955c = new C2581ds();
            if (avVar.f5458k != null) {
                diVar.f5954b = avVar.f5458k.getBytes();
            }
            diVar.f5971h = C2542dk.C2545a.kPost;
        } else {
            diVar.f5971h = C2542dk.C2545a.kGet;
        }
        diVar.f5972i = avVar.f5456i * 1000;
        diVar.f5973j = avVar.f5457j * 1000;
        diVar.f5976m = true;
        diVar.f5981r = true;
        diVar.f5982s = (avVar.f5456i + avVar.f5457j) * 1000;
        Map<String, String> map = avVar.f5452e;
        if (map != null) {
            for (String next : avVar.f5452e.keySet()) {
                diVar.mo17759a(next, map.get(next));
            }
        }
        diVar.f5974k = false;
        diVar.f5953a = new C2537di.C2539a<byte[], String>() {
            /* renamed from: a */
            public final /* synthetic */ void mo17574a(C2537di diVar, Object obj) {
                String str = (String) obj;
                String str2 = avVar.f5459l;
                String str3 = avVar.f5454g.f5506d;
                C2402bd bdVar = avVar.f5454g.f5504b;
                C2530db.m5474a(3, C2364au.f5441g, "Pulse report to " + str2 + " for " + str3 + ", HTTP status code is: " + diVar.f5980q);
                int i = diVar.f5980q;
                C2372aw awVar = awVar;
                int i2 = (int) diVar.f5978o;
                if (i2 >= 0) {
                    awVar.f5475k += (long) i2;
                } else if (awVar.f5475k <= 0) {
                    awVar.f5475k = 0;
                }
                awVar.f5469e = i;
                if (!diVar.mo17760b()) {
                    Exception exc = diVar.f5979p;
                    boolean z = true;
                    boolean z2 = diVar.f5979p != null && (diVar.f5979p instanceof SocketTimeoutException);
                    if (!diVar.f5983t && !z2) {
                        z = false;
                    }
                    if (z) {
                        if (diVar.mo17761c()) {
                            C2530db.m5474a(3, C2364au.f5441g, "Timeout occurred when trying to connect to: " + str2 + ". Exception: " + diVar.f5979p.getMessage());
                        } else {
                            C2530db.m5474a(3, C2364au.f5441g, "Manually managed http request timeout occurred for: ".concat(String.valueOf(str2)));
                        }
                        C2364au.m5057a(C2364au.this, awVar, avVar);
                    } else {
                        C2530db.m5474a(3, C2364au.f5441g, "Error occurred when trying to connect to: " + str2 + ". Exception: " + exc.getMessage());
                        C2364au.m5059a(C2364au.this, awVar, avVar, str);
                    }
                    C2367a.m5070b(str2, str3, bdVar);
                } else if (i >= 200 && i < 300) {
                    C2364au.m5061b(C2364au.this, awVar, avVar);
                    C2367a.m5069a(str2, str3, bdVar);
                } else if (i < 300 || i >= 400) {
                    C2530db.m5474a(3, C2364au.f5441g, str3 + " report failed sending to : " + str2);
                    C2364au.m5059a(C2364au.this, awVar, avVar, str);
                    C2367a.m5070b(str2, str3, bdVar);
                } else {
                    C2364au.m5058a(C2364au.this, awVar, avVar, diVar);
                }
            }
        };
        C2485cg.m5355a().mo17728a((Object) this, diVar);
    }

    public C2364au() {
        C2549dn.f6004b = 30000;
        this.f6006d = C2549dn.f6004b;
    }

    /* renamed from: a */
    public final C2508ct<List<C2368av>> mo17576a() {
        return new C2508ct<>(C2494ck.m5371a().f5832a.getFileStreamPath(".yflurryanpulsecallbackreporter"), ".yflurryanpulsecallbackreporter", 2, new C2592dz<List<C2368av>>() {
            /* renamed from: a */
            public final C2587dw<List<C2368av>> mo17575a(int i) {
                return new C2584dv(new C2368av.C2369a());
            }
        });
    }

    /* renamed from: a */
    public final synchronized void mo17578a(List<C2368av> list) {
        C2377ay.m5100d();
        List<C2385az> e = C2377ay.m5101e();
        if (e != null) {
            if (e.size() != 0) {
                String str = f5441g;
                C2530db.m5474a(3, str, "Restoring " + e.size() + " from report queue.");
                for (C2385az b : e) {
                    C2377ay.m5100d().mo17593b(b);
                }
                C2377ay.m5100d();
                for (C2385az a : C2377ay.m5097c()) {
                    for (C2368av next : a.mo17600a()) {
                        if (!next.f5460m) {
                            String str2 = f5441g;
                            C2530db.m5474a(3, str2, "Callback for " + next.f5454g.f5506d + " to " + next.f5459l + " not completed.  Adding to reporter queue.");
                            list.add(next);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo17579b(List<C2368av> list) {
        C2377ay.m5100d().mo17591b();
    }

    /* renamed from: com.flurry.sdk.au$a */
    static class C2367a {

        /* renamed from: a */
        private static HashMap<C2402bd, String> f5446a;

        static {
            HashMap<C2402bd, String> hashMap = new HashMap<>();
            f5446a = hashMap;
            hashMap.put(C2402bd.INSTALL, "Install");
            f5446a.put(C2402bd.SESSION_START, "Session Start");
            f5446a.put(C2402bd.SESSION_END, "Session End");
            f5446a.put(C2402bd.APPLICATION_EVENT, "App Event");
        }

        /* renamed from: a */
        static void m5069a(String str, String str2, C2402bd bdVar) {
            if (!C2669x.m5819a().f6292e) {
                C2530db.m5474a(4, C2364au.f5441g, "Not yahoo app. Don't log event Flurry.PulseSuccess");
                return;
            }
            HashMap hashMap = new HashMap(3);
            hashMap.put("fl.Partner", str);
            hashMap.put("fl.Event", str2);
            hashMap.put("fl.Trigger", m5068a(bdVar));
            try {
                C2669x.m5819a().mo17875a("Flurry.PulseSuccess", (Map<String, String>) hashMap, false);
            } catch (Throwable th) {
                C2530db.m5477a(C2364au.f5441g, "Failed to log event: Flurry.PulseSuccess", th);
            }
        }

        /* renamed from: b */
        static void m5070b(String str, String str2, C2402bd bdVar) {
            if (!C2669x.m5819a().f6292e) {
                C2530db.m5474a(4, C2364au.f5441g, "Not yahoo app. Don't log event Flurry.PulseFail");
                return;
            }
            HashMap hashMap = new HashMap(3);
            hashMap.put("fl.Partner", str);
            hashMap.put("fl.Event", str2);
            hashMap.put("fl.Trigger", m5068a(bdVar));
            try {
                C2669x.m5819a().mo17875a("Flurry.PulseFail", (Map<String, String>) hashMap, false);
            } catch (Throwable th) {
                C2530db.m5477a(C2364au.f5441g, "Failed to log event: Flurry.PulseFail", th);
            }
        }

        /* renamed from: a */
        private static String m5068a(C2402bd bdVar) {
            String str = f5446a.get(bdVar);
            return str == null ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : str;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5057a(C2364au auVar, C2372aw awVar, C2368av avVar) {
        C2377ay.m5100d().mo17592b(awVar);
        auVar.mo17772c(avVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m5059a(C2364au auVar, C2372aw awVar, C2368av avVar, String str) {
        boolean b = C2377ay.m5100d().mo17594b(awVar, str);
        C2530db.m5474a(3, f5441g, "Failed report retrying: ".concat(String.valueOf(b)));
        if (b) {
            auVar.mo17773d(avVar);
        } else {
            auVar.mo17772c(avVar);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m5061b(C2364au auVar, C2372aw awVar, C2368av avVar) {
        String str = f5441g;
        C2530db.m5474a(3, str, avVar.f5454g.f5506d + " report sent successfully to : " + avVar.f5459l);
        C2377ay.m5100d().mo17588a(awVar);
        auVar.mo17772c(avVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m5058a(C2364au auVar, C2372aw awVar, C2368av avVar, C2537di diVar) {
        List<String> a = diVar.mo17758a(HttpHeaders.LOCATION);
        String a2 = (a == null || a.size() <= 0) ? null : C2626er.m5717a(a.get(0), avVar.f6000q);
        boolean a3 = C2377ay.m5100d().mo17590a(awVar, a2);
        if (a3) {
            C2530db.m5474a(3, f5441g, "Received redirect url. Retrying: ".concat(String.valueOf(a2)));
        } else {
            C2530db.m5474a(3, f5441g, "Received redirect url. Retrying: false");
        }
        if (a3) {
            avVar.f6001r = a2;
            diVar.f5970g = a2;
            if (diVar.f5969f != null && diVar.f5969f.f5865a.containsKey(HttpHeaders.LOCATION)) {
                diVar.f5969f.mo17706b(HttpHeaders.LOCATION);
            }
            C2485cg.m5355a().mo17728a((Object) auVar, diVar);
            return;
        }
        auVar.mo17772c(avVar);
    }
}
