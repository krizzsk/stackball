package com.applovin.impl.mediation.p021c;

import android.app.Activity;
import com.applovin.impl.mediation.p020b.C1228f;
import com.applovin.impl.mediation.p020b.C1230g;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.mediation.MaxAdFormat;
import com.appsflyer.ServerParameters;
import com.tapjoy.TapjoyConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.b */
public class C1236b extends C1392a {

    /* renamed from: a */
    private static String f2382a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaxAdFormat f2383c;

    /* renamed from: d */
    private final boolean f2384d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Activity f2385e;

    /* renamed from: f */
    private final C1240a f2386f;

    /* renamed from: com.applovin.impl.mediation.c.b$a */
    public interface C1240a {
        /* renamed from: a */
        void mo12123a(JSONArray jSONArray);
    }

    static {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m2143a("APPLOVIN_NETWORK", "com.applovin.mediation.adapters.AppLovinMediationAdapter"));
            m2143a("FACEBOOK_NETWORK", "com.applovin.mediation.adapters.FacebookMediationAdapter").put("run_on_ui_thread", false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signal_providers", jSONArray);
            f2382a = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public C1236b(MaxAdFormat maxAdFormat, boolean z, Activity activity, C1469j jVar, C1240a aVar) {
        super("TaskCollectSignals", jVar);
        this.f2383c = maxAdFormat;
        this.f2384d = z;
        this.f2385e = activity;
        this.f2386f = aVar;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.applovin.impl.sdk.b.c, com.applovin.impl.sdk.b.c<java.lang.Integer>] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r4 = ((java.lang.Integer) r2.f3279b.mo13088a(r4)).intValue();
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m2142a(java.lang.String r3, com.applovin.impl.sdk.p025b.C1369c<java.lang.Integer> r4) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            com.applovin.impl.sdk.j r0 = r2.f3279b
            java.lang.Object r4 = r0.mo13088a(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0025
            r0 = 0
            int r1 = r3.length()
            int r4 = java.lang.Math.min(r1, r4)
            java.lang.String r3 = r3.substring(r0, r4)
            return r3
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.p021c.C1236b.m2142a(java.lang.String, com.applovin.impl.sdk.b.c):java.lang.String");
    }

    /* renamed from: a */
    private static JSONObject m2143a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("class", str2);
        jSONObject.put("adapter_timeout_ms", 30000);
        jSONObject.put("max_signal_length", 32768);
        jSONObject.put("scode", "");
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2144a(final C1230g gVar, final C1228f.C1229a aVar) {
        C12392 r0 = new Runnable() {
            public void run() {
                C1236b.this.f3279b.mo13142y().collectSignal(C1236b.this.f2383c, gVar, C1236b.this.f2385e, aVar);
            }
        };
        if (gVar.mo12340L()) {
            mo12944a("Running signal collection for " + gVar + " on the main thread");
            this.f2385e.runOnUiThread(r0);
            return;
        }
        mo12944a("Running signal collection for " + gVar + " on the background thread");
        r0.run();
    }

    /* renamed from: a */
    private void m2146a(Collection<C1228f> collection) {
        String str;
        String a;
        JSONArray jSONArray = new JSONArray();
        for (C1228f next : collection) {
            try {
                JSONObject jSONObject = new JSONObject();
                C1230g a2 = next.mo12365a();
                jSONObject.put("name", a2.mo12337I());
                jSONObject.put("class", a2.mo12336H());
                jSONObject.put(TapjoyConstants.TJC_ADAPTER_VERSION, m2142a(next.mo12367c(), C1368b.f2833l));
                jSONObject.put(ServerParameters.SDK_DATA_SDK_VERSION, m2142a(next.mo12366b(), C1368b.f2834m));
                JSONObject jSONObject2 = new JSONObject();
                if (C1553o.m3554b(next.mo12369e())) {
                    str = "error_message";
                    a = next.mo12369e();
                } else {
                    str = "signal";
                    a = m2142a(next.mo12368d(), C1368b.f2835n);
                }
                jSONObject2.put(str, a);
                jSONObject.put("data", jSONObject2);
                jSONArray.put(jSONObject);
                mo12944a("Collected signal from " + a2);
            } catch (JSONException e) {
                mo12945a("Failed to create signal data", e);
            }
        }
        m2147a(jSONArray);
    }

    /* renamed from: a */
    private void m2147a(JSONArray jSONArray) {
        C1240a aVar = this.f2386f;
        if (aVar != null) {
            aVar.mo12123a(jSONArray);
        }
    }

    /* renamed from: a */
    private void m2148a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        List a = C1517e.m3422a(jSONArray.length());
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        CountDownLatch countDownLatch = new CountDownLatch(jSONArray.length());
        ScheduledExecutorService b = this.f3279b.mo13071K().mo13018b();
        for (int i = 0; i < jSONArray.length(); i++) {
            final C1230g gVar = new C1230g(jSONArray.getJSONObject(i), jSONObject, this.f3279b);
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            final List list = a;
            final CountDownLatch countDownLatch2 = countDownLatch;
            b.execute(new Runnable() {
                public void run() {
                    C1236b.this.m2144a(gVar, (C1228f.C1229a) new C1228f.C1229a() {
                        /* renamed from: a */
                        public void mo12371a(C1228f fVar) {
                            if (atomicBoolean2.get() && fVar != null) {
                                list.add(fVar);
                            }
                            countDownLatch2.countDown();
                        }
                    });
                }
            });
        }
        countDownLatch.await(((Long) this.f3279b.mo13088a(C1368b.f2832k)).longValue(), TimeUnit.MILLISECONDS);
        atomicBoolean.set(false);
        m2146a((Collection<C1228f>) a);
    }

    /* renamed from: b */
    private void m2150b(String str, Throwable th) {
        mo12945a("No signals collected: " + str, th);
        m2147a(new JSONArray());
    }

    public void run() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject((String) this.f3279b.mo13112b(C1371e.f3172x, f2382a));
            JSONArray b = C1521i.m3491b(jSONObject, "signal_providers", (JSONArray) null, this.f3279b);
            if (this.f2384d) {
                List<String> b2 = this.f3279b.mo13114b((C1369c) C1368b.f2818N);
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < b.length(); i++) {
                    JSONObject a = C1521i.m3474a(b, i, (JSONObject) null, this.f3279b);
                    if (b2.contains(C1521i.m3487b(a, "class", (String) null, this.f3279b))) {
                        jSONArray.put(a);
                    }
                }
                b = jSONArray;
            }
            if (b.length() == 0) {
                m2150b("No signal providers found", (Throwable) null);
            } else {
                m2148a(b, jSONObject);
            }
        } catch (JSONException e) {
            th = e;
            str = "Failed to parse signals JSON";
            m2150b(str, th);
        } catch (InterruptedException e2) {
            th = e2;
            str = "Failed to wait for signals";
            m2150b(str, th);
        } catch (Throwable th) {
            th = th;
            str = "Failed to collect signals";
            m2150b(str, th);
        }
    }
}
