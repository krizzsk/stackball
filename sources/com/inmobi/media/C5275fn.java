package com.inmobi.media;

import com.inmobi.media.C5239ey;
import com.p243my.target.ads.Reward;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fn */
/* compiled from: CrashComponent */
public class C5275fn implements C5239ey.C5242c, C5290fx {

    /* renamed from: a */
    public static AtomicBoolean f12047a = new AtomicBoolean(false);

    /* renamed from: e */
    private static final String f12048e = C5275fn.class.getSimpleName();

    /* renamed from: b */
    public C5256fg f12049b;

    /* renamed from: c */
    public C5278fo f12050c;

    /* renamed from: d */
    public String f12051d;

    /* renamed from: f */
    private C5284fu f12052f;

    /* renamed from: com.inmobi.media.fn$a */
    /* compiled from: CrashComponent */
    static class C5277a {

        /* renamed from: a */
        static final C5275fn f12055a = new C5275fn((byte) 0);
    }

    /* synthetic */ C5275fn(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5275fn m12068a() {
        return C5277a.f12055a;
    }

    private C5275fn() {
        Thread.setDefaultUncaughtExceptionHandler(new C5280fq(Thread.getDefaultUncaughtExceptionHandler()));
        this.f12050c = new C5278fo();
        this.f12049b = (C5256fg) C5238ex.m11980a("crashReporting", (String) null);
    }

    /* renamed from: a */
    public void mo40121a(C5238ex exVar) {
        C5256fg fgVar = (C5256fg) exVar;
        this.f12049b = fgVar;
        this.f12051d = fgVar.url;
    }

    /* renamed from: a */
    public final void mo40590a(final C5308gk gkVar) {
        if (this.f12049b.catchEnabled) {
            C5314go.m12195a((Runnable) new Runnable() {
                public final void run() {
                    C5275fn.this.mo40589a((C5279fp) gkVar);
                    C5275fn.this.mo40591b();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo40589a(C5279fp fpVar) {
        if (!(fpVar instanceof C5308gk)) {
            if (this.f12049b.crashEnabled) {
                C5309gl.m12169a().mo40652a("CrashEventOccurred", (Map<String, Object>) new HashMap());
            } else {
                return;
            }
        }
        this.f12050c.mo40598b(this.f12049b.eventTTL);
        if ((this.f12050c.mo40594a() + 1) - this.f12049b.maxEventsToPersist >= 0) {
            C5278fo.m12078b();
        }
        C5278fo.m12077a(fpVar);
    }

    /* renamed from: b */
    public final void mo40591b() {
        if (!f12047a.get()) {
            C5256fg fgVar = this.f12049b;
            int i = fgVar.maxRetryCount;
            long j = fgVar.eventTTL;
            long j2 = fgVar.processingInterval;
            long j3 = fgVar.txLatency;
            int i2 = fgVar.networkType.wifi.minBatchSize;
            int i3 = fgVar.networkType.wifi.maxBatchSize;
            int i4 = fgVar.networkType.others.minBatchSize;
            int i5 = fgVar.networkType.others.maxBatchSize;
            int i6 = i4;
            long j4 = fgVar.networkType.wifi.retryInterval;
            long j5 = fgVar.networkType.others.retryInterval;
            C5281fr frVar = r2;
            C5281fr frVar2 = new C5281fr(i, j, j2, j3, i2, i3, i6, i5, j4, j5);
            frVar.f12070e = this.f12051d;
            frVar.f12067b = Reward.DEFAULT;
            C5284fu fuVar = this.f12052f;
            if (fuVar == null) {
                this.f12052f = new C5284fu(this.f12050c, this, frVar);
            } else {
                fuVar.mo40604a(frVar);
            }
            this.f12052f.mo40607a(Reward.DEFAULT, false);
        }
    }

    /* renamed from: c */
    public final C5283ft mo40592c() {
        int i;
        if (C5342he.m12326a() != 1) {
            i = this.f12049b.networkType.others.maxBatchSize;
        } else {
            i = this.f12049b.networkType.wifi.maxBatchSize;
        }
        List<C5279fp> a = C5278fo.m12076a(i);
        if (!a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C5279fp fpVar : a) {
                arrayList.add(Integer.valueOf(fpVar.f12058a));
            }
            String a2 = m12069a(a);
            if (a2 != null) {
                return new C5283ft(arrayList, a2);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m12069a(List<C5279fp> list) {
        try {
            HashMap hashMap = new HashMap(C5342he.m12328a(false));
            hashMap.put("im-accid", C5314go.m12211f());
            hashMap.put("version", "2.0.0");
            hashMap.put("component", "crash");
            hashMap.put("mk-version", C5315gp.m12222a());
            hashMap.putAll(C5340hd.m12324a().f12231c);
            JSONObject jSONObject = new JSONObject(hashMap);
            JSONArray jSONArray = new JSONArray();
            for (C5279fp next : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", next.f12059b);
                jSONObject2.put("eventType", next.f12060c);
                if (!next.mo40601a().trim().isEmpty()) {
                    jSONObject2.put("crash_report", next.mo40601a());
                }
                jSONObject2.put("ts", next.f12062e);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("crash", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
