package com.flurry.sdk;

import android.content.Context;
import com.flurry.android.FlurryAgent;
import com.flurry.sdk.C2451bs;
import com.flurry.sdk.C2649g;
import com.flurry.sdk.C2654k;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.flurry.sdk.b */
public class C2389b {

    /* renamed from: a */
    private static final String f5516a = C2389b.class.getSimpleName();

    /* renamed from: b */
    private static boolean f5517b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2649g f5518c;

    /* renamed from: d */
    private C2662r f5519d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2393a f5520e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2593e f5521f;

    /* renamed from: g */
    private C2657m f5522g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f5523h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2654k f5524i;

    /* renamed from: com.flurry.sdk.b$a */
    public interface C2393a {
        /* renamed from: a */
        void mo17610a(C2649g gVar, boolean z);
    }

    public C2389b(C2662r rVar, C2393a aVar, C2593e eVar, C2657m mVar) {
        this.f5519d = rVar;
        this.f5520e = aVar;
        this.f5521f = eVar;
        this.f5522g = mVar;
    }

    /* renamed from: a */
    public final synchronized void mo17606a() {
        C2530db.m5476a(f5516a, "Starting Config fetch.");
        C2662r.m5794a((Runnable) new Runnable() {
            public final void run() {
                C2649g unused = C2389b.this.f5518c = C2649g.f6212b;
                long unused2 = C2389b.this.f5523h = System.currentTimeMillis();
                C2654k unused3 = C2389b.this.f5524i = null;
                C2389b.this.f5521f.mo17795b();
                if (!C2389b.m5147c(C2389b.this)) {
                    C2389b.this.f5520e.mo17610a(C2389b.this.f5518c, false);
                } else {
                    C2389b.this.m5145b();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m5145b() {
        if (C2451bs.m5276a().mo17649c()) {
            m5146c();
            return;
        }
        C2530db.m5476a(f5516a, "Waiting for ID provider.");
        C2451bs.m5276a().mo17648a((C2451bs.C2460b) new C2451bs.C2460b() {
            /* renamed from: a */
            public final void mo17608a() {
                C2389b.this.m5146c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m5146c() {
        JSONObject a;
        C2530db.m5476a(f5516a, "Fetching Config data.");
        this.f5519d.run();
        C2649g h = this.f5519d.mo17871h();
        this.f5518c = h;
        if (h == C2649g.f6211a) {
            C2530db.m5476a(f5516a, "Processing Config fetched data.");
            try {
                String str = this.f5519d.f6269h;
                C2530db.m5476a(f5516a, "JSON body: ".concat(String.valueOf(str)));
                JSONObject jSONObject = new JSONObject(str);
                String d = this.f5519d.mo17867d();
                String str2 = C2494ck.m5371a().f5833b;
                String optString = jSONObject.optString("requestGuid");
                String optString2 = jSONObject.optString("apiKey");
                if (d.equals(optString)) {
                    if (str2.equals(optString2)) {
                        List<C2656l> a2 = C2638f.m5739a(jSONObject);
                        long optLong = jSONObject.optLong("refreshInSeconds");
                        this.f5522g.f6249d = optLong;
                        if (!C2665t.m5809a(this.f5521f.mo17797d()) || !this.f5519d.mo17866c() || this.f5522g.mo17859b(a2)) {
                            this.f5522g.mo17857a(a2, this.f5519d.mo17866c());
                            this.f5518c = C2649g.f6211a;
                            C2657m mVar = this.f5522g;
                            Context context = C2494ck.m5371a().f5832a;
                            if (!this.f5519d.mo17866c()) {
                                str = null;
                            }
                            if (str == null && (a = mVar.mo17853a(mVar.f6247b, mVar.f6248c, false)) != null) {
                                str = a.toString();
                            }
                            if (str != null) {
                                C2665t.m5805a(context, str);
                            }
                            C2593e eVar = this.f5521f;
                            String g = this.f5519d.mo17870g();
                            if (eVar.f6067b != null) {
                                eVar.f6067b.edit().putString("lastETag", g).apply();
                            }
                            C2593e eVar2 = this.f5521f;
                            String e = this.f5519d.mo17868e();
                            if (eVar2.f6067b != null) {
                                eVar2.f6067b.edit().putString("lastKeyId", e).apply();
                            }
                            C2593e eVar3 = this.f5521f;
                            String f = this.f5519d.mo17869f();
                            if (eVar3.f6067b != null) {
                                eVar3.f6067b.edit().putString("lastRSA", f).apply();
                            }
                        } else {
                            this.f5518c = C2649g.f6212b;
                        }
                        f5517b = true;
                        C2593e eVar4 = this.f5521f;
                        String c = this.f5522g.mo17860c();
                        if (eVar4.f6067b != null) {
                            C2530db.m5476a(C2593e.f6066a, "Save serized variant IDs: ".concat(String.valueOf(c)));
                            eVar4.f6067b.edit().putString("com.flurry.sdk.variant_ids", c).apply();
                        }
                        C2593e eVar5 = this.f5521f;
                        if (eVar5.f6067b != null) {
                            eVar5.f6067b.edit().putInt("appVersion", eVar5.f6068c).apply();
                        }
                        this.f5521f.mo17793a(System.currentTimeMillis());
                        C2593e eVar6 = this.f5521f;
                        long j = optLong * 1000;
                        if (j == 0) {
                            eVar6.f6069d = 0;
                        } else if (j > 604800000) {
                            eVar6.f6069d = 604800000;
                        } else if (j < 60000) {
                            eVar6.f6069d = 60000;
                        } else {
                            eVar6.f6069d = j;
                        }
                        if (eVar6.f6067b != null) {
                            eVar6.f6067b.edit().putLong("refreshFetch", eVar6.f6069d).apply();
                        }
                        if (C2522d.m5448b() != null) {
                            C2522d.m5448b();
                            C2658n.m5785a(this.f5522g);
                        }
                        this.f5521f.mo17795b();
                        if (C2522d.m5448b() != null) {
                            C2522d.m5448b();
                            C2658n.m5784a(this.f5518c.f6214d.f6223h, System.currentTimeMillis() - this.f5523h, this.f5518c.toString());
                        }
                        this.f5520e.mo17610a(this.f5518c, false);
                        return;
                    }
                }
                C2649g.C2650a aVar = C2649g.C2650a.AUTHENTICATE;
                this.f5518c = new C2649g(aVar, "Guid: " + d + ", payload: " + optString + " APIKey: " + str2 + ", payload: " + optString2);
                String str3 = f5516a;
                StringBuilder sb = new StringBuilder("Authentication error: ");
                sb.append(this.f5518c);
                C2530db.m5482b(str3, sb.toString());
                m5149d();
            } catch (JSONException e2) {
                C2530db.m5477a(f5516a, "Json parse error", (Throwable) e2);
                this.f5518c = new C2649g(C2649g.C2650a.NOT_VALID_JSON, e2.toString());
            } catch (Exception e3) {
                C2530db.m5477a(f5516a, "Fetch result error", (Throwable) e3);
                this.f5518c = new C2649g(C2649g.C2650a.OTHER, e3.toString());
            }
        } else if (this.f5518c == C2649g.f6212b) {
            this.f5521f.mo17793a(System.currentTimeMillis());
            this.f5521f.mo17795b();
            this.f5520e.mo17610a(this.f5518c, false);
        } else {
            String str4 = f5516a;
            C2530db.m5490e(str4, "fetch error:" + this.f5518c.toString());
            if (this.f5524i == null && this.f5518c.f6214d == C2649g.C2650a.UNKNOWN_CERTIFICATE) {
                FlurryAgent.onError("FlurryUnknownCertificate", this.f5518c.f6213c, f5516a);
            }
            if (C2522d.m5448b() != null) {
                C2522d.m5448b();
                C2658n.m5784a(this.f5518c.f6214d.f6223h, System.currentTimeMillis() - this.f5523h, this.f5518c.toString());
            }
            m5149d();
        }
    }

    /* renamed from: d */
    private void m5149d() {
        C2530db.m5476a(f5516a, "Retry fetching Config data.");
        C2654k kVar = this.f5524i;
        if (kVar == null) {
            this.f5524i = new C2654k(C2654k.C2655a.values()[0]);
        } else {
            this.f5524i = new C2654k(kVar.f6233a.mo17844a());
        }
        if (this.f5524i.f6233a == C2654k.C2655a.ABANDON) {
            this.f5520e.mo17610a(this.f5518c, false);
            return;
        }
        this.f5520e.mo17610a(this.f5518c, true);
        this.f5521f.mo17794a(new TimerTask() {
            public final void run() {
                C2389b.this.m5146c();
            }
        }, ((long) this.f5524i.mo17843a()) * 1000);
    }

    /* renamed from: c */
    static /* synthetic */ boolean m5147c(C2389b bVar) {
        if (!C2665t.m5808a(C2494ck.m5371a().f5832a)) {
            return true;
        }
        String str = f5516a;
        C2530db.m5476a(str, "Compare version: current=" + bVar.f5521f.f6068c + ", recorded=" + bVar.f5521f.mo17792a());
        if (bVar.f5521f.mo17792a() < bVar.f5521f.f6068c) {
            return true;
        }
        long j = bVar.f5521f.f6069d;
        long j2 = 0;
        if (j != 0) {
            C2593e eVar = bVar.f5521f;
            if (eVar.f6067b != null) {
                j2 = eVar.f6067b.getLong("lastFetch", 0);
            }
            if (System.currentTimeMillis() - j2 > j) {
                return true;
            }
        } else if (!f5517b) {
            return true;
        }
        C2530db.m5476a(f5516a, "It does not meet any criterias for data fetch.");
        return false;
    }
}
