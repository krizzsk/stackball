package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.chartboost.sdk.C1883d;
import com.chartboost.sdk.C1885e;
import com.chartboost.sdk.C1892h;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.ChartboostBanner;
import com.chartboost.sdk.Events.BannerErrorMap;
import com.chartboost.sdk.Events.ChartboostError;
import com.chartboost.sdk.Libraries.C1828g;
import com.chartboost.sdk.Libraries.C1832j;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.C1836a;
import com.chartboost.sdk.Model.C1837b;
import com.chartboost.sdk.Model.C1838c;
import com.chartboost.sdk.Model.C1840e;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1848a;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.Networking.C1856h;
import com.chartboost.sdk.Networking.C1857i;
import com.chartboost.sdk.Networking.C1860j;
import com.chartboost.sdk.Networking.requests.models.ShowParamsModel;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1872c;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.Tracking.C1875f;
import com.chartboost.sdk.Tracking.C1876g;
import com.chartboost.sdk.Tracking.C1877h;
import com.chartboost.sdk.impl.C1894a;
import com.chartboost.sdk.impl.C1965p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.g */
public class C1913g {

    /* renamed from: A */
    ScheduledFuture<?> f4801A;

    /* renamed from: B */
    private final long f4802B = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: C */
    private final long f4803C = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: D */
    private final String[] f4804D = {"ASKED_TO_CACHE", "ASKED_TO_SHOW", "REQUESTING_TO_CACHE", "REQUESTING_TO_SHOW", "DOWNLOADING_TO_CACHE", "DOWNLOADING_TO_SHOW", "READY", "ASKING_UI_TO_SHOW_AD", "DONE"};

    /* renamed from: a */
    public final ScheduledExecutorService f4805a;

    /* renamed from: b */
    private final C1952n f4806b;

    /* renamed from: c */
    public final C1828g f4807c;

    /* renamed from: d */
    private final C1855g f4808d;

    /* renamed from: e */
    private final C1856h f4809e;

    /* renamed from: f */
    private final C1842g f4810f;

    /* renamed from: g */
    private final AtomicReference<C1844h> f4811g;

    /* renamed from: h */
    private final SharedPreferences f4812h;

    /* renamed from: i */
    final C1832j f4813i;

    /* renamed from: j */
    final Handler f4814j;

    /* renamed from: k */
    final C1883d f4815k;

    /* renamed from: l */
    private final C1857i f4816l;

    /* renamed from: m */
    private final C1885e f4817m;

    /* renamed from: n */
    private final C1860j f4818n;

    /* renamed from: o */
    final C1894a f4819o;

    /* renamed from: p */
    protected ChartboostBanner f4820p;

    /* renamed from: q */
    private C1876g f4821q;

    /* renamed from: r */
    private Context f4822r;

    /* renamed from: s */
    int f4823s = 0;

    /* renamed from: t */
    private int f4824t;

    /* renamed from: u */
    private boolean f4825u;

    /* renamed from: v */
    final Map<String, C1920h> f4826v;

    /* renamed from: w */
    final SortedSet<C1920h> f4827w;

    /* renamed from: x */
    final SortedSet<C1920h> f4828x;

    /* renamed from: y */
    private final Map<String, Long> f4829y;

    /* renamed from: z */
    private final Map<String, Integer> f4830z;

    /* renamed from: com.chartboost.sdk.impl.g$b */
    public class C1915b implements Runnable {

        /* renamed from: a */
        public final int f4837a;

        /* renamed from: b */
        final String f4838b;

        /* renamed from: c */
        final C1920h f4839c;

        /* renamed from: d */
        final CBError.CBImpressionError f4840d;

        public C1915b(int i, String str, C1920h hVar, CBError.CBImpressionError cBImpressionError) {
            this.f4837a = i;
            this.f4838b = str;
            this.f4839c = hVar;
            this.f4840d = cBImpressionError;
        }

        public void run() {
            try {
                synchronized (C1913g.this) {
                    int i = this.f4837a;
                    if (i != 0) {
                        switch (i) {
                            case 2:
                                C1913g.this.f4801A = null;
                                C1913g.this.mo14611f();
                                break;
                            case 3:
                                C1913g.this.mo14607d(this.f4838b);
                                break;
                            case 4:
                                C1913g.this.mo14612h(this.f4838b);
                                break;
                            case 5:
                                C1913g.this.mo14608e(this.f4839c);
                                break;
                            case 6:
                                C1913g.this.mo14601a(this.f4839c, this.f4840d);
                                break;
                            case 7:
                                C1913g.this.mo14613i(this.f4839c);
                                break;
                            case 8:
                                C1913g.this.mo14609e(this.f4838b);
                                break;
                        }
                    } else {
                        C1913g.this.mo14605b();
                    }
                }
            } catch (Exception e) {
                CBLogging.m3993b("AdUnitManager", e.toString());
            }
        }
    }

    /* renamed from: com.chartboost.sdk.impl.g$c */
    private static class C1916c {

        /* renamed from: a */
        protected C1838c f4842a;

        /* renamed from: b */
        protected CBError.CBImpressionError f4843b;

        public C1916c(C1838c cVar, CBError.CBImpressionError cBImpressionError) {
            this.f4842a = cVar;
            this.f4843b = cBImpressionError;
        }
    }

    public C1913g(Context context, C1894a aVar, ScheduledExecutorService scheduledExecutorService, C1952n nVar, C1828g gVar, C1855g gVar2, C1856h hVar, C1842g gVar3, AtomicReference<C1844h> atomicReference, SharedPreferences sharedPreferences, C1832j jVar, Handler handler, C1883d dVar, C1857i iVar, C1885e eVar, C1860j jVar2, C1876g gVar4) {
        this.f4822r = context;
        this.f4805a = scheduledExecutorService;
        this.f4806b = nVar;
        this.f4807c = gVar;
        this.f4808d = gVar2;
        this.f4809e = hVar;
        this.f4810f = gVar3;
        this.f4811g = atomicReference;
        this.f4812h = sharedPreferences;
        this.f4813i = jVar;
        this.f4814j = handler;
        this.f4815k = dVar;
        this.f4816l = iVar;
        this.f4817m = eVar;
        this.f4818n = jVar2;
        this.f4819o = aVar;
        this.f4821q = gVar4;
        this.f4824t = 1;
        this.f4826v = new HashMap();
        this.f4828x = new TreeSet();
        this.f4827w = new TreeSet();
        this.f4829y = new HashMap();
        this.f4830z = new HashMap();
        this.f4825u = false;
    }

    /* renamed from: c */
    private void m4547c() {
        long b = this.f4813i.mo14255b();
        Iterator<Long> it = this.f4829y.values().iterator();
        while (it.hasNext()) {
            if (b - it.next().longValue() >= 0) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    private void m4550d() {
        Long l;
        boolean z = true;
        if (this.f4823s == 1) {
            long b = this.f4813i.mo14255b();
            l = null;
            for (Map.Entry next : this.f4829y.entrySet()) {
                if (this.f4826v.get((String) next.getKey()) != null) {
                    long max = Math.max(this.f4802B, ((Long) next.getValue()).longValue() - b);
                    if (l == null || max < l.longValue()) {
                        l = Long.valueOf(max);
                    }
                }
            }
        } else {
            l = null;
        }
        if (!(l == null || this.f4801A == null)) {
            if (Math.abs(l.longValue() - this.f4801A.getDelay(TimeUnit.NANOSECONDS)) > this.f4802B) {
                z = false;
            }
            if (z) {
                return;
            }
        }
        ScheduledFuture<?> scheduledFuture = this.f4801A;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f4801A = null;
        }
        if (l != null) {
            this.f4801A = this.f4805a.schedule(new C1915b(2, (String) null, (C1920h) null, (CBError.CBImpressionError) null), l.longValue(), TimeUnit.NANOSECONDS);
        }
    }

    /* renamed from: g */
    private boolean m4555g(String str) {
        return this.f4829y.containsKey(str);
    }

    /* renamed from: h */
    private void m4556h(C1920h hVar) {
        int i = hVar.f4853c;
        long b = this.f4813i.mo14255b();
        Long l = hVar.f4858h;
        if (l != null) {
            hVar.f4861k = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(b - l.longValue()));
        }
        Long l2 = hVar.f4859i;
        if (l2 != null) {
            hVar.f4862l = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(b - l2.longValue()));
        }
        hVar.f4853c = 6;
        String str = "";
        if (hVar.f4856f) {
            C1836a aVar = hVar.f4854d;
            if (aVar != null) {
                str = aVar.f4429i;
            }
            Handler handler = this.f4814j;
            C1894a aVar2 = this.f4819o;
            aVar2.getClass();
            handler.post(new C1894a.C1895a(0, hVar.f4852b, (CBError.CBImpressionError) null, (ChartboostError) null, false, str));
        } else {
            C1874e.m4311e(new C1875f("cache_on_show_finish_success", str, this.f4819o.f4749b, hVar.f4852b));
        }
        if (i == 5) {
            m4558k(hVar);
        }
    }

    /* renamed from: j */
    private void m4557j(C1920h hVar) {
        this.f4826v.remove(hVar.f4852b);
        m4536a(hVar);
        hVar.f4853c = 8;
        hVar.f4854d = null;
    }

    /* renamed from: k */
    private void m4558k(C1920h hVar) {
        if (!this.f4809e.mo14340d()) {
            m4543b(hVar, CBError.CBImpressionError.INTERNET_UNAVAILABLE_AT_SHOW);
            return;
        }
        C1916c b = m4541b(hVar);
        m4538a(hVar, b.f4842a, b.f4843b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14605b() {
        if (this.f4823s == 0) {
            this.f4823s = 1;
            mo14611f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo14608e(C1920h hVar) {
        if (hVar.f4853c == 7) {
            if (hVar.f4859i != null && hVar.f4863m == null) {
                hVar.f4863m = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(this.f4813i.mo14255b() - hVar.f4859i.longValue()));
            }
            this.f4830z.remove(hVar.f4852b);
            Handler handler = this.f4814j;
            C1894a aVar = this.f4819o;
            aVar.getClass();
            handler.post(new C1894a.C1895a(5, hVar.f4852b, (CBError.CBImpressionError) null, (ChartboostError) null, true, hVar.f4854d.f4429i));
            m4553f(hVar);
            m4557j(hVar);
            mo14611f();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo14611f() {
        if (!this.f4825u) {
            try {
                this.f4825u = true;
                m4547c();
                if (this.f4823s == 1 && !m4540a(this.f4828x, 1, 3, 1)) {
                    m4540a(this.f4827w, 0, 2, 2);
                }
                m4550d();
                this.f4825u = false;
            } catch (Throwable th) {
                this.f4825u = false;
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo14613i(C1920h hVar) {
        if (hVar.f4853c == 7) {
            hVar.f4853c = 6;
            hVar.f4860j = null;
            hVar.f4859i = null;
            hVar.f4863m = null;
            C1874e.m4311e(new C1875f("show_finish_failure", CBError.CBImpressionError.USER_CANCELLATION.name(), hVar.f4854d.f4438r, hVar.f4852b));
        }
    }

    /* renamed from: a */
    private boolean m4540a(SortedSet<C1920h> sortedSet, int i, int i2, int i3) {
        Iterator it = sortedSet.iterator();
        while (it.hasNext()) {
            C1920h hVar = (C1920h) it.next();
            if (hVar.f4853c != i || hVar.f4854d != null) {
                it.remove();
            } else if (m4555g(hVar.f4852b)) {
                continue;
            } else if (!this.f4819o.mo14560b(hVar.f4852b)) {
                hVar.f4853c = 8;
                m4536a(hVar);
                this.f4826v.remove(hVar.f4852b);
                it.remove();
            } else {
                hVar.f4853c = i2;
                it.remove();
                m4537a(hVar, i3);
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m4554g(C1920h hVar) {
        m4549c(hVar, CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE);
        m4557j(hVar);
        m4548c(hVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m4545b(com.chartboost.sdk.Model.C1836a r5) {
        /*
            r4 = this;
            com.chartboost.sdk.Libraries.g r0 = r4.f4807c
            r1 = 0
            if (r0 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x0008
            goto L_0x0052
        L_0x0008:
            java.util.Map<java.lang.String, com.chartboost.sdk.Model.b> r5 = r5.f4423c
            com.chartboost.sdk.Libraries.h r0 = r0.mo14234a()
            if (r0 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x0013
            goto L_0x0052
        L_0x0013:
            java.io.File r0 = r0.f4393a
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x001d:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r5.next()
            com.chartboost.sdk.Model.b r2 = (com.chartboost.sdk.Model.C1837b) r2
            if (r2 == 0) goto L_0x004f
            java.io.File r3 = r2.mo14265a((java.io.File) r0)
            if (r3 == 0) goto L_0x0037
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x001d
        L_0x0037:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Asset does not exist: "
            r5.append(r0)
            java.lang.String r0 = r2.f4442b
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "AdUnitManager"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r0, r5)
        L_0x004f:
            return r1
        L_0x0050:
            r5 = 1
            return r5
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1913g.m4545b(com.chartboost.sdk.Model.a):boolean");
    }

    /* renamed from: c */
    private void m4548c(C1920h hVar) {
        C1844h hVar2 = this.f4811g.get();
        long j = hVar2.f4530k;
        int i = hVar2.f4531l;
        Integer num = this.f4830z.get(hVar.f4852b);
        if (num == null) {
            num = 0;
        }
        Integer valueOf = Integer.valueOf(Math.min(num.intValue(), i));
        this.f4830z.put(hVar.f4852b, Integer.valueOf(valueOf.intValue() + 1));
        this.f4829y.put(hVar.f4852b, Long.valueOf(this.f4813i.mo14255b() + TimeUnit.MILLISECONDS.toNanos(j << valueOf.intValue())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo14609e(String str) {
        C1920h hVar = this.f4826v.get(str);
        if (hVar != null && hVar.f4853c == 6) {
            m4557j(hVar);
            mo14611f();
        }
    }

    /* renamed from: f */
    public synchronized C1836a mo14610f(String str) {
        int i;
        C1920h hVar = this.f4826v.get(str);
        if (hVar == null || ((i = hVar.f4853c) != 6 && i != 7)) {
            return null;
        }
        return hVar.f4854d;
    }

    /* renamed from: e */
    private boolean m4552e() {
        C1876g gVar;
        if (this.f4819o.f4748a == 0 && !C2026k.f5258o && (gVar = this.f4821q) != null && gVar.mo14449c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private String m4546c(C1836a aVar, File file, String str) {
        C1837b bVar = aVar.f4439s;
        if (bVar == null) {
            CBLogging.m3993b("AdUnitManager", "AdUnit does not have a template body");
            return null;
        }
        File a = bVar.mo14265a(file);
        HashMap hashMap = new HashMap(aVar.f4424d);
        for (Map.Entry next : aVar.f4423c.entrySet()) {
            hashMap.put(next.getKey(), ((C1837b) next.getValue()).f4442b);
        }
        try {
            return C1964p.m4755a(a, hashMap, this.f4819o.f4749b, str);
        } catch (Exception e) {
            CBLogging.m3993b("AdUnitManager", "loadTemplateHtml: " + e.toString());
            return null;
        }
    }

    /* renamed from: f */
    private void m4553f(C1920h hVar) {
        String str = hVar.f4854d.f4426f;
        String str2 = hVar.f4852b;
        this.f4808d.mo14335a(new C1978s0(this.f4819o.f4752e, this.f4810f, new ShowParamsModel(str, str2), new C1926i(this, str2)));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4544b(String str, C1836a aVar) {
        String str2;
        String str3;
        String str4;
        if (aVar != null) {
            String str5 = aVar.f4429i;
            String str6 = aVar.f4428h;
            str2 = aVar.f4437q;
            str4 = str5;
            str3 = str6;
        } else {
            str4 = "";
            str3 = str4;
            str2 = str3;
        }
        C1874e.m4306b(new C1877h(str, this.f4819o.f4749b, str4, str3, str2));
    }

    /* renamed from: com.chartboost.sdk.impl.g$a */
    class C1914a implements C1965p0.C1966a {

        /* renamed from: a */
        final /* synthetic */ C1920h f4831a;

        /* renamed from: b */
        final /* synthetic */ long f4832b;

        /* renamed from: c */
        final /* synthetic */ boolean f4833c;

        /* renamed from: d */
        final /* synthetic */ boolean f4834d;

        /* renamed from: e */
        final /* synthetic */ boolean f4835e;

        C1914a(C1920h hVar, long j, boolean z, boolean z2, boolean z3) {
            this.f4831a = hVar;
            this.f4832b = j;
            this.f4833c = z;
            this.f4834d = z2;
            this.f4835e = z3;
        }

        /* renamed from: a */
        public void mo14615a(C1965p0 p0Var, JSONObject jSONObject) {
            C1836a aVar;
            try {
                this.f4831a.f4866p = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(C1913g.this.f4813i.mo14255b() - this.f4832b));
                this.f4831a.f4867q = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(p0Var.f4566g));
                this.f4831a.f4868r = Integer.valueOf((int) TimeUnit.NANOSECONDS.toMillis(p0Var.f4567h));
                if (this.f4833c) {
                    aVar = new C1836a(0, jSONObject, true);
                } else if (this.f4834d) {
                    aVar = new C2018y(C1913g.this.f4819o.f4748a, jSONObject);
                } else if (this.f4835e) {
                    aVar = new C1836a(1, jSONObject, false);
                } else {
                    aVar = new C1836a(0, jSONObject, false);
                }
                C1913g.this.mo14603a(this.f4831a, aVar);
            } catch (JSONException e) {
                String str = this.f4831a.f4852b;
                C1913g.this.m4544b(str, (C1836a) null);
                if (this.f4834d) {
                    C1874e.m4311e(new C1868a("cache_bid_response_parsing_error", e.toString(), C1913g.this.f4819o.f4749b, str));
                } else {
                    C1874e.m4311e(new C1868a("cache_get_response_parsing_error", e.toString(), C1913g.this.f4819o.f4749b, str));
                }
                CBLogging.m3993b("AdUnitManager", "sendAdGetRequest.onSuccess: " + e.toString());
                C1913g.this.mo14602a(this.f4831a, new CBError(CBError.C1835b.UNEXPECTED_RESPONSE, "Response conversion failure"));
            }
        }

        /* renamed from: a */
        public void mo14614a(C1965p0 p0Var, CBError cBError) {
            C1913g.this.m4544b(this.f4831a.f4852b, (C1836a) null);
            C1874e.m4311e(new C1872c("cache_request_error", cBError.getErrorDesc(), C1913g.this.f4819o.f4749b, this.f4831a.f4852b));
            C1913g.this.mo14602a(this.f4831a, cBError);
        }
    }

    /* renamed from: a */
    public synchronized boolean mo14604a(String str, C2018y yVar) {
        int i = this.f4824t;
        this.f4824t = i + 1;
        C1920h hVar = new C1920h(i, str, 6);
        hVar.f4855e = 1;
        hVar.f4854d = yVar;
        this.f4826v.put(str, hVar);
        this.f4827w.add(hVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo14612h(String str) {
        if (m4552e()) {
            C1894a aVar = this.f4819o;
            aVar.getClass();
            this.f4814j.postDelayed(new C1894a.C1895a(4, str, CBError.CBImpressionError.FIRST_SESSION_INTERSTITIALS_DISABLED, (ChartboostError) null, true, ""), this.f4803C);
            return;
        }
        C1920h hVar = this.f4826v.get(str);
        if (hVar == null) {
            C1874e.m4311e(new C1875f("cache_start", "", this.f4819o.f4749b, str));
            int i = this.f4824t;
            this.f4824t = i + 1;
            hVar = new C1920h(i, str, 1);
            this.f4826v.put(str, hVar);
            this.f4828x.add(hVar);
        }
        if (!hVar.f4870t) {
            hVar.f4870t = true;
            C1874e.m4311e(new C1875f("show_start", "", this.f4819o.f4749b, str));
        }
        if (hVar.f4859i == null) {
            hVar.f4859i = Long.valueOf(this.f4813i.mo14255b());
        }
        int i2 = hVar.f4853c;
        if (i2 == 0) {
            this.f4827w.remove(hVar);
            this.f4828x.add(hVar);
            hVar.f4853c = 1;
        } else if (i2 == 2) {
            hVar.f4853c = 3;
        } else if (i2 == 4) {
            hVar.f4853c = 5;
            m4551d(hVar);
        } else if (i2 == 6) {
            m4558k(hVar);
        }
        mo14611f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m4539a(C1920h hVar, boolean z, int i, int i2) {
        int i3 = hVar.f4853c;
        if (i3 == 4 || i3 == 5) {
            hVar.f4864n = Integer.valueOf(i);
            hVar.f4865o = Integer.valueOf(i2);
            if (z) {
                m4556h(hVar);
            } else {
                m4554g(hVar);
            }
        }
        mo14611f();
    }

    /* renamed from: a */
    private void m4537a(C1920h hVar, int i) {
        C1965p0 p0Var;
        C1920h hVar2 = hVar;
        try {
            C1844h hVar3 = this.f4811g.get();
            boolean z = this.f4819o.f4748a == 2;
            boolean z2 = this.f4819o.f4748a == 3;
            boolean z3 = hVar3.f4536q && !z;
            C1914a aVar = r1;
            C1914a aVar2 = new C1914a(hVar, this.f4813i.mo14255b(), z, z2, z3);
            boolean z4 = hVar2.f4853c == 2;
            int b = this.f4821q.mo14448b(this.f4819o.f4748a);
            if (z) {
                p0Var = new C1965p0("https://live.chartboost.com", this.f4819o.f4750c, this.f4810f, i, aVar);
                p0Var.f5055m = true;
                p0Var.mo14750a(FirebaseAnalytics.Param.LOCATION, (Object) hVar2.f4852b);
                p0Var.mo14750a("cache", (Object) Boolean.valueOf(z4));
                p0Var.mo14750a("raw", (Object) Boolean.TRUE);
                hVar2.f4855e = 0;
            } else if (z2) {
                C1975r0 r0Var = new C1975r0(this.f4822r, new C1840e("https://da.chartboost.com", this.f4819o.f4751d, this.f4810f, i, aVar), new C1848a(this.f4819o.f4748a, Integer.valueOf(this.f4820p.getBannerHeight()), Integer.valueOf(this.f4820p.getBannerWidth()), hVar2.f4852b, b));
                hVar2.f4855e = 1;
                p0Var = r0Var;
            } else if (z3) {
                C1972q0 q0Var = new C1972q0(String.format(this.f4819o.f4751d, new Object[]{hVar3.f4542w}), this.f4810f, i, aVar);
                q0Var.mo14782a("cache_assets", this.f4807c.mo14241d(), 0);
                q0Var.mo14782a(FirebaseAnalytics.Param.LOCATION, hVar2.f4852b, 0);
                q0Var.mo14782a("imp_depth", Integer.valueOf(b), 0);
                q0Var.mo14782a("cache", Boolean.valueOf(z4), 0);
                q0Var.f5055m = true;
                hVar2.f4855e = 1;
                p0Var = q0Var;
            } else {
                int i2 = i;
                p0Var = new C1965p0("https://live.chartboost.com", this.f4819o.f4750c, this.f4810f, i, aVar);
                p0Var.mo14750a("local-videos", (Object) this.f4807c.mo14239c());
                p0Var.f5055m = true;
                p0Var.mo14750a(FirebaseAnalytics.Param.LOCATION, (Object) hVar2.f4852b);
                p0Var.mo14750a("cache", (Object) Boolean.valueOf(z4));
                hVar2.f4855e = 0;
            }
            p0Var.f4568i = 1;
            this.f4823s = 2;
            this.f4808d.mo14335a(p0Var);
        } catch (Exception e) {
            CBLogging.m3993b("AdUnitManager", "sendAdGetRequest: " + e.toString());
            mo14602a(hVar2, new CBError(CBError.C1835b.MISCELLANEOUS, "error sending ad-get request"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo14607d(String str) {
        if (m4552e()) {
            C1894a aVar = this.f4819o;
            aVar.getClass();
            this.f4814j.postDelayed(new C1894a.C1895a(4, str, CBError.CBImpressionError.FIRST_SESSION_INTERSTITIALS_DISABLED, (ChartboostError) null, false, ""), this.f4803C);
            return;
        }
        C1920h hVar = this.f4826v.get(str);
        if (hVar != null && hVar.f4853c == 6 && !m4545b(hVar.f4854d)) {
            this.f4826v.remove(str);
            m4536a(hVar);
            hVar = null;
        }
        if (hVar == null) {
            int i = this.f4824t;
            this.f4824t = i + 1;
            hVar = new C1920h(i, str, 0);
            this.f4826v.put(str, hVar);
            this.f4827w.add(hVar);
        }
        String str2 = "";
        if (!hVar.f4869s) {
            hVar.f4869s = true;
            C1874e.m4311e(new C1875f("cache_start", str2, this.f4819o.f4749b, str));
        }
        hVar.f4856f = true;
        if (hVar.f4858h == null) {
            hVar.f4858h = Long.valueOf(this.f4813i.mo14255b());
        }
        int i2 = hVar.f4853c;
        if (i2 == 6 || i2 == 7) {
            C1836a aVar2 = hVar.f4854d;
            if (aVar2 != null) {
                str2 = aVar2.f4429i;
            }
            Handler handler = this.f4814j;
            C1894a aVar3 = this.f4819o;
            aVar3.getClass();
            handler.post(new C1894a.C1895a(0, str, (CBError.CBImpressionError) null, (ChartboostError) null, true, str2));
        }
        mo14611f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4549c(com.chartboost.sdk.impl.C1920h r7, com.chartboost.sdk.Model.CBError.CBImpressionError r8) {
        /*
            r6 = this;
            r6.m4543b((com.chartboost.sdk.impl.C1920h) r7, (com.chartboost.sdk.Model.CBError.CBImpressionError) r8)
            com.chartboost.sdk.Model.CBError$CBImpressionError r0 = com.chartboost.sdk.Model.CBError.CBImpressionError.NO_AD_FOUND
            if (r8 != r0) goto L_0x0008
            return
        L_0x0008:
            com.chartboost.sdk.Model.a r0 = r7.f4854d
            r1 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.f4426f
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            int r2 = r7.f4853c
            if (r2 == 0) goto L_0x001f
            r3 = 2
            if (r2 == r3) goto L_0x001f
            r3 = 4
            if (r2 != r3) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            java.lang.String r2 = "show"
            goto L_0x0021
        L_0x001f:
            java.lang.String r2 = "cache"
        L_0x0021:
            com.chartboost.sdk.Model.a r3 = r7.f4854d
            if (r3 == 0) goto L_0x0028
            int r3 = r3.f4422b
            goto L_0x002e
        L_0x0028:
            java.lang.Integer r3 = r7.f4855e
            int r3 = r3.intValue()
        L_0x002e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            if (r3 == 0) goto L_0x003f
            int r1 = r3.intValue()
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "native"
            goto L_0x003f
        L_0x003d:
            java.lang.String r1 = "web"
        L_0x003f:
            int r3 = r7.f4853c
            if (r3 < 0) goto L_0x004b
            java.lang.String[] r4 = r6.f4804D
            int r5 = r4.length
            if (r3 >= r5) goto L_0x004b
            r3 = r4[r3]
            goto L_0x005e
        L_0x004b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown state: "
            r3.append(r4)
            int r4 = r7.f4853c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x005e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "reportError: adTypeTraits.name: "
            r4.append(r5)
            com.chartboost.sdk.impl.a r5 = r6.f4819o
            java.lang.String r5 = r5.f4749b
            r4.append(r5)
            java.lang.String r5 = " reason: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " format: "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = " error: "
            r4.append(r1)
            java.lang.String r1 = r8.toString()
            r4.append(r1)
            java.lang.String r1 = " adId: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = " appRequest.location: "
            r4.append(r0)
            java.lang.String r0 = r7.f4852b
            r4.append(r0)
            java.lang.String r0 = " stateName: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = "AdUnitManager"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r1, r0)
            boolean r0 = r7.f4856f
            if (r0 != 0) goto L_0x00c6
            com.chartboost.sdk.Tracking.f r0 = new com.chartboost.sdk.Tracking.f
            java.lang.String r8 = r8.name()
            com.chartboost.sdk.impl.a r1 = r6.f4819o
            java.lang.String r1 = r1.f4749b
            java.lang.String r7 = r7.f4852b
            java.lang.String r2 = "cache_on_show_finish_failure"
            r0.<init>(r2, r8, r1, r7)
            com.chartboost.sdk.Tracking.C1874e.m4311e(r0)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C1913g.m4549c(com.chartboost.sdk.impl.h, com.chartboost.sdk.Model.CBError$CBImpressionError):void");
    }

    /* renamed from: b */
    private C1916c m4541b(C1920h hVar) {
        CBError.CBImpressionError cBImpressionError;
        String str;
        C1838c cVar = null;
        try {
            C1836a aVar = hVar.f4854d;
            File file = this.f4807c.mo14234a().f4393a;
            cBImpressionError = m4531a(aVar);
            if (cBImpressionError == null) {
                cBImpressionError = m4532a(aVar, file, hVar.f4852b);
            }
            if (cBImpressionError == null) {
                str = m4542b(aVar, file, hVar.f4852b);
                cBImpressionError = m4533a(str, aVar);
            } else {
                str = null;
            }
            if (cBImpressionError == null) {
                cVar = m4534a(hVar, str);
            }
        } catch (Exception e) {
            CBLogging.m3993b("AdUnitManager", "showReady: " + e.toString());
            cBImpressionError = CBError.CBImpressionError.INTERNAL;
        }
        return new C1916c(cVar, cBImpressionError);
    }

    /* renamed from: b */
    private String m4542b(C1836a aVar, File file, String str) {
        if (aVar.f4422b == 1) {
            return m4546c(aVar, file, str);
        }
        return null;
    }

    /* renamed from: b */
    private void m4543b(C1920h hVar, CBError.CBImpressionError cBImpressionError) {
        String str;
        ChartboostError chartboostError;
        String str2 = "cache";
        String str3 = "";
        if (hVar != null) {
            String str4 = hVar.f4852b;
            int i = hVar.f4853c;
            if (!(i == 0 || i == 2 || i == 4)) {
                str2 = "show";
            }
            str = str4;
        } else {
            str = str3;
        }
        boolean equals = "show".equals(str2);
        C1836a aVar = hVar.f4854d;
        if (aVar != null) {
            str3 = aVar.f4429i;
        }
        String str5 = str3;
        C1894a aVar2 = this.f4819o;
        if (aVar2.f4748a == 3) {
            if (equals) {
                chartboostError = BannerErrorMap.mapImpressionErrorToBannerShowError(cBImpressionError);
            } else {
                chartboostError = BannerErrorMap.mapImpressionErrorToBannerCacheError(cBImpressionError);
            }
            ChartboostError chartboostError2 = chartboostError;
            int a = m4530a(chartboostError2);
            Handler handler = this.f4814j;
            C1894a aVar3 = this.f4819o;
            aVar3.getClass();
            handler.post(new C1894a.C1895a(a, str, (CBError.CBImpressionError) null, chartboostError2, equals, str5));
            return;
        }
        Handler handler2 = this.f4814j;
        aVar2.getClass();
        handler2.post(new C1894a.C1895a(4, str, cBImpressionError, (ChartboostError) null, equals, str5));
    }

    /* renamed from: d */
    private void m4551d(C1920h hVar) {
        if (hVar.f4854d != null) {
            int i = hVar.f4853c;
            if (i == 5 || i == 4) {
                int i2 = hVar.f4853c == 5 ? 1 : 2;
                if (hVar.f4857g > i2) {
                    $$Lambda$g$LqoS7VXG50Y8qla1uq98f7m6HXY r0 = new C1936j(hVar) {
                        public final /* synthetic */ C1920h f$1;

                        {
                            this.f$1 = r2;
                        }

                        /* renamed from: a */
                        public final void mo14551a(boolean z, int i, int i2) {
                            C1913g.this.m4539a(this.f$1, z, i, i2);
                        }
                    };
                    hVar.f4857g = i2;
                    this.f4806b.mo14707a(i2, hVar.f4854d.f4423c, new AtomicInteger(), (C1936j) C1892h.m4431a().mo14549a(r0), this.f4819o.f4749b);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo14603a(C1920h hVar, C1836a aVar) {
        m4544b(hVar.f4852b, aVar);
        this.f4823s = 1;
        hVar.f4853c = hVar.f4853c == 2 ? 4 : 5;
        hVar.f4854d = aVar;
        m4551d(hVar);
        mo14611f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo14602a(C1920h hVar, CBError cBError) {
        if (this.f4823s != 0) {
            this.f4823s = 1;
            m4549c(hVar, cBError.getImpressionError());
            m4557j(hVar);
            m4548c(hVar);
            mo14611f();
        }
    }

    /* renamed from: a */
    private void m4538a(C1920h hVar, C1838c cVar, CBError.CBImpressionError cBImpressionError) {
        if (cBImpressionError == null) {
            hVar.f4853c = 7;
            C1883d dVar = this.f4815k;
            dVar.getClass();
            C1883d.C1884a aVar = new C1883d.C1884a(10);
            aVar.f4700c = cVar;
            hVar.f4860j = Long.valueOf(this.f4813i.mo14255b());
            this.f4814j.post(aVar);
            return;
        }
        m4549c(hVar, cBImpressionError);
        m4557j(hVar);
    }

    /* renamed from: a */
    private CBError.CBImpressionError m4531a(C1836a aVar) {
        if (aVar.f4422b != 0 || (!this.f4819o.f4753f && !aVar.f4437q.equals("video"))) {
            return null;
        }
        CBError.CBImpressionError a = mo14600a(aVar.f4421a);
        if (a == null) {
            return a;
        }
        CBLogging.m3993b("AdUnitManager", "Video media unavailable for the impression");
        return a;
    }

    /* renamed from: a */
    private CBError.CBImpressionError m4532a(C1836a aVar, File file, String str) {
        CBError.CBImpressionError cBImpressionError = null;
        for (C1837b next : aVar.f4423c.values()) {
            File a = next.mo14265a(file);
            if (a == null || !a.exists()) {
                CBLogging.m3993b("AdUnitManager", "Asset does not exist: " + next.f4442b);
                cBImpressionError = CBError.CBImpressionError.ASSET_MISSING;
                C1874e.m4311e(new C1868a("show_unavailable_asset_error", next.f4442b, this.f4819o.f4749b, str));
            }
        }
        return cBImpressionError;
    }

    /* renamed from: a */
    private CBError.CBImpressionError m4533a(String str, C1836a aVar) {
        if (str == null && aVar.f4422b == 1) {
            return CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW;
        }
        return null;
    }

    /* renamed from: a */
    private C1838c m4534a(C1920h hVar, String str) {
        C1920h hVar2 = hVar;
        Context context = this.f4822r;
        C1836a aVar = hVar2.f4854d;
        C1910f fVar = r6;
        C1910f fVar2 = new C1910f(this, hVar2);
        return new C1838c(context, aVar, fVar, this.f4807c, this.f4808d, this.f4810f, this.f4812h, this.f4814j, this.f4815k, this.f4816l, this.f4817m, this.f4818n, this.f4819o, hVar2.f4852b, str, this.f4820p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14601a(C1920h hVar, CBError.CBImpressionError cBImpressionError) {
        m4549c(hVar, cBImpressionError);
        if (hVar.f4853c != 7) {
            return;
        }
        if (cBImpressionError == CBError.CBImpressionError.IMPRESSION_ALREADY_VISIBLE) {
            hVar.f4853c = 6;
            hVar.f4860j = null;
            hVar.f4859i = null;
            hVar.f4863m = null;
            return;
        }
        m4548c(hVar);
        m4557j(hVar);
        mo14611f();
    }

    /* renamed from: a */
    private int m4530a(ChartboostError chartboostError) {
        if (chartboostError != null) {
            return chartboostError.actionType == 1 ? 6 : 7;
        }
        return 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CBError.CBImpressionError mo14600a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return CBError.CBImpressionError.INVALID_RESPONSE;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("assets");
        if (optJSONObject == null) {
            return CBError.CBImpressionError.INVALID_RESPONSE;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(CBUtility.m4009b(CBUtility.m4006b(this.f4822r)) ? "video-portrait" : "video-landscape");
        if (optJSONObject2 == null) {
            return CBError.CBImpressionError.VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION;
        }
        String optString = optJSONObject2.optString("id");
        if (optString.isEmpty()) {
            return CBError.CBImpressionError.VIDEO_ID_MISSING;
        }
        if (new File(this.f4807c.mo14234a().f4396d, optString).exists()) {
            return null;
        }
        return CBError.CBImpressionError.VIDEO_UNAVAILABLE;
    }

    /* renamed from: a */
    private void m4536a(C1920h hVar) {
        String str;
        String str2 = "";
        if (hVar != null) {
            str = hVar.f4852b;
            C1836a aVar = hVar.f4854d;
            if (aVar != null) {
                str2 = aVar.f4438r;
            }
        } else {
            str = str2;
        }
        C1874e.m4302a(str2, str);
    }
}
