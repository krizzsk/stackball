package com.fyber.inneractive.sdk.p049h;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.p049h.C2988y;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.h.ab */
public abstract class C2937ab<T> implements C2988y<T> {

    /* renamed from: a */
    private Map<String, String> f7064a;

    /* renamed from: b */
    private C2958g f7065b;

    /* renamed from: c */
    public volatile boolean f7066c = false;

    /* renamed from: d */
    final C2977r<T> f7067d;

    /* renamed from: e */
    C2956e f7068e;

    /* renamed from: f */
    C2988y.C2989a f7069f;

    /* renamed from: g */
    private volatile int f7070g = C2946ai.f7090a;

    /* renamed from: a */
    public void mo18392a(C2986w<T> wVar, String str, String str2) {
    }

    /* renamed from: e */
    public byte[] mo18395e() {
        return null;
    }

    /* renamed from: f */
    public final String mo18396f() {
        return "application/json; charset=utf-8";
    }

    /* renamed from: i */
    public String mo18397i() {
        return null;
    }

    /* renamed from: j */
    public C2935a<T> mo18398j() {
        return null;
    }

    /* renamed from: o */
    public C2767s mo18401o() {
        return null;
    }

    public C2937ab(C2977r<T> rVar, C2956e eVar) {
        this.f7067d = rVar;
        this.f7068e = eVar;
    }

    /* renamed from: d */
    public Map<String, String> mo18394d() {
        return this.f7064a;
    }

    /* renamed from: l */
    public final boolean mo18399l() {
        return this.f7066c;
    }

    /* renamed from: a */
    public final C2958g mo18390a(String str) throws Exception {
        try {
            if (this.f7069f != null) {
                this.f7069f.mo18432a("sdkInitNetworkRequest");
            }
            this.f7065b = this.f7068e.mo18421a(this, mo18429a(), str);
            if (this.f7069f != null) {
                this.f7069f.mo18432a("sdkGotServerResponse");
            }
            return this.f7065b;
        } catch (C2951b e) {
            IAlog.m9032a("failed start network request", (Throwable) e, new Object[0]);
            throw e;
        } catch (C2949al e2) {
            IAlog.m9032a("failed read network response", (Throwable) e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.m9032a("failed start network request", (Throwable) e3, new Object[0]);
            throw e3;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000f */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18400n() {
        /*
            r2 = this;
            com.fyber.inneractive.sdk.h.g r0 = r2.f7065b     // Catch:{ Exception -> 0x0014 }
            if (r0 == 0) goto L_0x000f
            com.fyber.inneractive.sdk.h.g r0 = r2.f7065b     // Catch:{ Exception -> 0x0014 }
            java.io.InputStream r1 = r0.f7117b     // Catch:{ Exception -> 0x0014 }
            if (r1 == 0) goto L_0x000f
            java.io.InputStream r0 = r0.f7117b     // Catch:{ all -> 0x000f }
            r0.close()     // Catch:{ all -> 0x000f }
        L_0x000f:
            com.fyber.inneractive.sdk.h.e r0 = r2.f7068e     // Catch:{ Exception -> 0x0014 }
            r0.mo18422a()     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p049h.C2937ab.mo18400n():void");
    }

    /* renamed from: a */
    public final void mo18393a(final T t, final Exception exc, final boolean z) {
        C3662m.m9137a().post(new Runnable() {
            public final void run() {
                C2937ab.this.f7067d.mo17908a(t, exc, z);
            }
        });
    }

    /* renamed from: a */
    private static String mo18429a() {
        int i = 0;
        while (!IAConfigManager.m5923b().f9907c.compareAndSet(true, true) && i < 25) {
            IAlog.m9034b("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            }
            i++;
        }
        return IAConfigManager.m5923b().mo19554a();
    }

    /* renamed from: a */
    public final void mo18391a(int i) {
        this.f7070g = i;
    }

    /* renamed from: p */
    public final int mo18402p() {
        return this.f7070g;
    }

    /* renamed from: q */
    public C2948ak mo18403q() {
        return new C2948ak(IAConfigManager.m5929c().f6586a.mo18046a("connect_timeout", 5000, 1), IAConfigManager.m5929c().f6586a.mo18046a("read_timeout", 5000, 1));
    }
}
