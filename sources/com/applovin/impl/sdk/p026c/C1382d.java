package com.applovin.impl.sdk.p026c;

import android.app.Activity;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p026c.C1376c;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1520h;

/* renamed from: com.applovin.impl.sdk.c.d */
public class C1382d {

    /* renamed from: a */
    private final C1469j f3227a;

    /* renamed from: b */
    private final C1388h f3228b;

    /* renamed from: c */
    private final C1376c.C1380b f3229c;

    /* renamed from: d */
    private final Object f3230d = new Object();

    /* renamed from: e */
    private final long f3231e;

    /* renamed from: f */
    private long f3232f;

    /* renamed from: g */
    private long f3233g;

    /* renamed from: h */
    private long f3234h;

    public C1382d(AppLovinAdBase appLovinAdBase, C1469j jVar) {
        if (appLovinAdBase == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (jVar != null) {
            this.f3227a = jVar;
            this.f3228b = jVar.mo13072L();
            C1376c.C1380b a = jVar.mo13083W().mo12885a(appLovinAdBase);
            this.f3229c = a;
            a.mo12894a(C1375b.f3187a, (long) appLovinAdBase.getSource().ordinal()).mo12896a();
            this.f3231e = appLovinAdBase.getCreatedAtMillis();
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    public static void m2720a(long j, AppLovinAdBase appLovinAdBase, C1469j jVar) {
        if (appLovinAdBase != null && jVar != null) {
            jVar.mo13083W().mo12885a(appLovinAdBase).mo12894a(C1375b.f3188b, j).mo12896a();
        }
    }

    /* renamed from: a */
    public static void m2721a(AppLovinAdBase appLovinAdBase, C1469j jVar) {
        if (appLovinAdBase != null && jVar != null) {
            jVar.mo13083W().mo12885a(appLovinAdBase).mo12894a(C1375b.f3189c, appLovinAdBase.getFetchLatencyMillis()).mo12894a(C1375b.f3190d, appLovinAdBase.getFetchResponseSize()).mo12896a();
        }
    }

    /* renamed from: a */
    private void m2722a(C1375b bVar) {
        synchronized (this.f3230d) {
            if (this.f3232f > 0) {
                this.f3229c.mo12894a(bVar, System.currentTimeMillis() - this.f3232f).mo12896a();
            }
        }
    }

    /* renamed from: a */
    public static void m2723a(C1383e eVar, AppLovinAdBase appLovinAdBase, C1469j jVar) {
        if (appLovinAdBase != null && jVar != null && eVar != null) {
            jVar.mo13083W().mo12885a(appLovinAdBase).mo12894a(C1375b.f3191e, eVar.mo12913c()).mo12894a(C1375b.f3192f, eVar.mo12914d()).mo12894a(C1375b.f3207u, eVar.mo12917g()).mo12894a(C1375b.f3208v, eVar.mo12918h()).mo12894a(C1375b.f3209w, eVar.mo12912b() ? 1 : 0).mo12896a();
        }
    }

    /* renamed from: a */
    public void mo12898a() {
        this.f3229c.mo12894a(C1375b.f3196j, this.f3228b.mo12926a(C1387g.f3249b)).mo12894a(C1375b.f3195i, this.f3228b.mo12926a(C1387g.f3251d));
        synchronized (this.f3230d) {
            long j = 0;
            if (this.f3231e > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f3232f = currentTimeMillis;
                long G = currentTimeMillis - this.f3227a.mo13067G();
                long j2 = this.f3232f - this.f3231e;
                long j3 = C1520h.m3445a(this.f3227a.mo13065D()) ? 1 : 0;
                Activity a = this.f3227a.mo13086Z().mo12601a();
                if (C1519g.m3435f() && a != null && a.isInMultiWindowMode()) {
                    j = 1;
                }
                this.f3229c.mo12894a(C1375b.f3194h, G).mo12894a(C1375b.f3193g, j2).mo12894a(C1375b.f3202p, j3).mo12894a(C1375b.f3210x, j);
            }
        }
        this.f3229c.mo12896a();
    }

    /* renamed from: a */
    public void mo12899a(long j) {
        this.f3229c.mo12894a(C1375b.f3204r, j).mo12896a();
    }

    /* renamed from: b */
    public void mo12900b() {
        synchronized (this.f3230d) {
            if (this.f3233g < 1) {
                long currentTimeMillis = System.currentTimeMillis();
                this.f3233g = currentTimeMillis;
                if (this.f3232f > 0) {
                    this.f3229c.mo12894a(C1375b.f3199m, currentTimeMillis - this.f3232f).mo12896a();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo12901b(long j) {
        this.f3229c.mo12894a(C1375b.f3203q, j).mo12896a();
    }

    /* renamed from: c */
    public void mo12902c() {
        m2722a(C1375b.f3197k);
    }

    /* renamed from: c */
    public void mo12903c(long j) {
        this.f3229c.mo12894a(C1375b.f3205s, j).mo12896a();
    }

    /* renamed from: d */
    public void mo12904d() {
        m2722a(C1375b.f3200n);
    }

    /* renamed from: d */
    public void mo12905d(long j) {
        synchronized (this.f3230d) {
            if (this.f3234h < 1) {
                this.f3234h = j;
                this.f3229c.mo12894a(C1375b.f3206t, j).mo12896a();
            }
        }
    }

    /* renamed from: e */
    public void mo12906e() {
        m2722a(C1375b.f3201o);
    }

    /* renamed from: f */
    public void mo12907f() {
        m2722a(C1375b.f3198l);
    }

    /* renamed from: g */
    public void mo12908g() {
        this.f3229c.mo12893a(C1375b.f3211y).mo12896a();
    }
}
