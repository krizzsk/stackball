package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.tapjoy.TJAdUnitConstants;
import com.yandex.metrica.impl.p265ob.C11428kg;
import com.yandex.metrica.impl.p265ob.C11606oi;
import com.yandex.metrica.impl.p265ob.C11885vj;
import com.yandex.metrica.impl.p265ob.C11993ym;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.uj */
public class C11824uj {

    /* renamed from: a */
    private final C11399jj f28405a;

    /* renamed from: b */
    private final C11354ij f28406b;

    /* renamed from: c */
    private final C11660pj f28407c;

    /* renamed from: d */
    private final C11764sj f28408d;

    /* renamed from: e */
    private final C11720rj f28409e;

    /* renamed from: f */
    private final C11608oj f28410f;

    /* renamed from: g */
    private final C11794tj f28411g;

    /* renamed from: h */
    private final C11469kj f28412h;

    /* renamed from: i */
    private final C11956xj f28413i;

    /* renamed from: j */
    private final C11533mj f28414j;

    /* renamed from: k */
    private final C11567nj f28415k;

    /* renamed from: l */
    private final C11690qj f28416l;

    /* renamed from: m */
    private final C10307Ga f28417m;

    /* renamed from: n */
    private final C12034zj f28418n;

    /* renamed from: o */
    private final C11990yj f28419o;

    /* renamed from: p */
    private final C11162dj f28420p;

    /* renamed from: q */
    private final C11212ej f28421q;

    /* renamed from: r */
    private final C11248fj f28422r;

    /* renamed from: s */
    private final C11117cj f28423s;

    /* renamed from: t */
    private final C11504lj f28424t;

    /* renamed from: u */
    private final C11289gj f28425u;

    /* renamed from: v */
    private final C11321hj f28426v;

    /* renamed from: w */
    private final C11917wj f28427w;

    public C11824uj() {
        this(new C11504lj());
    }

    /* renamed from: a */
    public C11885vj mo63807a(byte[] bArr) {
        String str;
        C11885vj vjVar = new C11885vj();
        try {
            this.f28424t.getClass();
            C11993ym.C11994a aVar = new C11993ym.C11994a(new String(bArr, "UTF-8"));
            JSONObject optJSONObject = aVar.optJSONObject("device_id");
            String str2 = "";
            if (optJSONObject != null) {
                str2 = optJSONObject.optString("hash");
                str = optJSONObject.optString("value");
            } else {
                str = str2;
            }
            vjVar.mo63960d(str);
            vjVar.mo63957c(str2);
            m30537a(vjVar, aVar);
            vjVar.mo63943a(C11885vj.C11886a.f28604b);
            return vjVar;
        } catch (Throwable unused) {
            C11885vj vjVar2 = new C11885vj();
            vjVar2.mo63943a(C11885vj.C11886a.BAD);
            return vjVar2;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11824uj(com.yandex.metrica.impl.p265ob.C11504lj r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            com.yandex.metrica.impl.ob.jj r3 = new com.yandex.metrica.impl.ob.jj
            r2 = r3
            r3.<init>()
            com.yandex.metrica.impl.ob.ij r4 = new com.yandex.metrica.impl.ob.ij
            r3 = r4
            r4.<init>()
            com.yandex.metrica.impl.ob.pj r5 = new com.yandex.metrica.impl.ob.pj
            r4 = r5
            r5.<init>()
            com.yandex.metrica.impl.ob.sj r6 = new com.yandex.metrica.impl.ob.sj
            r5 = r6
            r6.<init>()
            com.yandex.metrica.impl.ob.rj r7 = new com.yandex.metrica.impl.ob.rj
            r6 = r7
            r7.<init>()
            com.yandex.metrica.impl.ob.oj r8 = new com.yandex.metrica.impl.ob.oj
            r7 = r8
            r8.<init>()
            com.yandex.metrica.impl.ob.tj r9 = new com.yandex.metrica.impl.ob.tj
            r8 = r9
            r9.<init>()
            com.yandex.metrica.impl.ob.kj r10 = new com.yandex.metrica.impl.ob.kj
            r9 = r10
            r10.<init>()
            com.yandex.metrica.impl.ob.xj r11 = new com.yandex.metrica.impl.ob.xj
            r10 = r11
            r11.<init>()
            com.yandex.metrica.impl.ob.mj r12 = new com.yandex.metrica.impl.ob.mj
            r11 = r12
            r12.<init>()
            com.yandex.metrica.impl.ob.nj r13 = new com.yandex.metrica.impl.ob.nj
            r12 = r13
            r13.<init>()
            com.yandex.metrica.impl.ob.qj r14 = new com.yandex.metrica.impl.ob.qj
            r13 = r14
            r14.<init>()
            com.yandex.metrica.impl.ob.Ga r15 = new com.yandex.metrica.impl.ob.Ga
            r14 = r15
            r15.<init>()
            com.yandex.metrica.impl.ob.zj r16 = new com.yandex.metrica.impl.ob.zj
            r15 = r16
            r16.<init>()
            com.yandex.metrica.impl.ob.yj r17 = new com.yandex.metrica.impl.ob.yj
            r16 = r17
            r17.<init>()
            com.yandex.metrica.impl.ob.ej r18 = new com.yandex.metrica.impl.ob.ej
            r17 = r18
            r18.<init>()
            com.yandex.metrica.impl.ob.fj r19 = new com.yandex.metrica.impl.ob.fj
            r18 = r19
            r19.<init>()
            com.yandex.metrica.impl.ob.dj r20 = new com.yandex.metrica.impl.ob.dj
            r19 = r20
            r20.<init>()
            com.yandex.metrica.impl.ob.cj r21 = new com.yandex.metrica.impl.ob.cj
            r20 = r21
            r21.<init>()
            com.yandex.metrica.impl.ob.gj r22 = new com.yandex.metrica.impl.ob.gj
            r21 = r22
            r22.<init>()
            com.yandex.metrica.impl.ob.hj r23 = new com.yandex.metrica.impl.ob.hj
            r22 = r23
            r23.<init>()
            com.yandex.metrica.impl.ob.wj r24 = new com.yandex.metrica.impl.ob.wj
            r23 = r24
            r24.<init>()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11824uj.<init>(com.yandex.metrica.impl.ob.lj):void");
    }

    public C11824uj(C11504lj ljVar, C11399jj jjVar, C11354ij ijVar, C11660pj pjVar, C11764sj sjVar, C11720rj rjVar, C11608oj ojVar, C11794tj tjVar, C11469kj kjVar, C11956xj xjVar, C11533mj mjVar, C11567nj njVar, C11690qj qjVar, C10307Ga ga, C12034zj zjVar, C11990yj yjVar, C11212ej ejVar, C11248fj fjVar, C11162dj djVar, C11117cj cjVar, C11289gj gjVar, C11321hj hjVar, C11917wj wjVar) {
        this.f28405a = jjVar;
        this.f28406b = ijVar;
        this.f28407c = pjVar;
        this.f28408d = sjVar;
        this.f28409e = rjVar;
        this.f28410f = ojVar;
        this.f28411g = tjVar;
        this.f28412h = kjVar;
        this.f28413i = xjVar;
        this.f28414j = mjVar;
        this.f28415k = njVar;
        this.f28416l = qjVar;
        this.f28417m = ga;
        this.f28418n = zjVar;
        this.f28419o = yjVar;
        this.f28421q = ejVar;
        this.f28422r = fjVar;
        this.f28420p = djVar;
        this.f28423s = cjVar;
        this.f28424t = ljVar;
        this.f28425u = gjVar;
        this.f28426v = hjVar;
        this.f28427w = wjVar;
    }

    /* renamed from: a */
    private void m30537a(C11885vj vjVar, C11993ym.C11994a aVar) throws JSONException {
        String str;
        C11606oi.C11607a aVar2;
        long j;
        long j2;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3 = aVar.optJSONObject("queries");
        if (!(optJSONObject3 == null || (optJSONObject2 = optJSONObject3.optJSONObject("list")) == null)) {
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("sdk_list");
            if (optJSONObject4 != null) {
                vjVar.mo63972h(optJSONObject4.optString("url", (String) null));
            }
            JSONObject optJSONObject5 = optJSONObject2.optJSONObject("host");
            if (optJSONObject5 != null) {
                vjVar.mo63946a(optJSONObject5.optString("url", (String) null));
            }
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = aVar.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject6 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject6 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject6.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject7 = optJSONObject6.optJSONObject(next);
                if (optJSONObject7 != null && optJSONObject7.has("value")) {
                    hashMap.put(next, optJSONObject7.getString("value"));
                }
            }
            vjVar.mo63963e(C11993ym.m30987c((Map<String, String>) hashMap));
        }
        JSONObject optJSONObject8 = aVar.optJSONObject("locale");
        if (optJSONObject8 == null || (optJSONObject = optJSONObject8.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) {
            str = "";
        } else {
            str = optJSONObject.optString("value", "");
        }
        vjVar.mo63953b(str);
        JSONObject optJSONObject9 = aVar.optJSONObject("time");
        if (optJSONObject9 != null) {
            try {
                vjVar.mo63945a(Long.valueOf(optJSONObject9.getLong("max_valid_difference_seconds")));
            } catch (Throwable unused2) {
            }
        }
        C11428kg.C11455r rVar = new C11428kg.C11455r();
        JSONObject optJSONObject10 = aVar.optJSONObject("stat_sending");
        if (optJSONObject10 != null) {
            rVar.f27558b = C11993ym.m30956a(C11993ym.m30989d(optJSONObject10, "disabled_reporting_interval_seconds"), TimeUnit.SECONDS, rVar.f27558b);
        }
        vjVar.mo63934a(this.f28417m.mo61049a(rVar));
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject11 = aVar.optJSONObject("mediascope_api_keys");
        if (!(optJSONObject11 == null || (optJSONArray2 = optJSONObject11.optJSONArray("list")) == null)) {
            for (int i = 0; i < optJSONArray2.length(); i++) {
                try {
                    arrayList.add(optJSONArray2.getString(i));
                } catch (Throwable unused3) {
                }
            }
        }
        vjVar.mo63961d((List<String>) arrayList);
        this.f28406b.mo63051a(vjVar, aVar);
        this.f28405a.mo63126a(vjVar, aVar);
        this.f28407c.getClass();
        JSONObject optJSONObject12 = aVar.optJSONObject("permissions");
        if (!(optJSONObject12 == null || (optJSONArray = optJSONObject12.optJSONArray("list")) == null)) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject13 = optJSONArray.optJSONObject(i2);
                if (optJSONObject13 != null) {
                    String optString = optJSONObject13.optString("name");
                    boolean optBoolean = optJSONObject13.optBoolean(TJAdUnitConstants.String.ENABLED);
                    if (TextUtils.isEmpty(optString)) {
                        vjVar.mo63947a("", false);
                    } else {
                        vjVar.mo63947a(optString, optBoolean);
                    }
                }
            }
        }
        this.f28408d.mo63686a(vjVar, aVar);
        this.f28409e.getClass();
        C11428kg kgVar = new C11428kg();
        JSONObject optJSONObject14 = aVar.optJSONObject("retry_policy");
        int i3 = kgVar.f27404K;
        int i4 = kgVar.f27405L;
        if (optJSONObject14 != null) {
            i3 = optJSONObject14.optInt("max_interval_seconds", i3);
            i4 = optJSONObject14.optInt("exponential_multiplier", kgVar.f27405L);
        }
        vjVar.mo63927a(new C10167Ci(i3, i4));
        this.f28410f.getClass();
        if (vjVar.mo63962e().f28181c) {
            JSONObject optJSONObject15 = aVar.optJSONObject("permissions_collecting");
            C11428kg.C11449m mVar = new C11428kg.C11449m();
            if (optJSONObject15 != null) {
                j = optJSONObject15.optLong("check_interval_seconds", mVar.f27531b);
                j2 = optJSONObject15.optLong("force_send_interval_seconds", mVar.f27532c);
            } else {
                j = mVar.f27531b;
                j2 = mVar.f27532c;
            }
            vjVar.mo63926a(new C10112Ai(j, j2));
        }
        this.f28411g.mo63747a(vjVar, aVar);
        this.f28412h.mo63246a(vjVar, aVar);
        this.f28414j.mo63327a(vjVar, (JSONObject) aVar);
        this.f28415k.getClass();
        if (vjVar.mo63962e().f28187i) {
            C11812ua uaVar = new C11812ua();
            C11428kg.C11462y yVar = new C11428kg.C11462y();
            JSONObject optJSONObject16 = aVar.optJSONObject("wakeup");
            if (optJSONObject16 != null) {
                yVar.f27592b = C11993ym.m30956a(C11993ym.m30989d(optJSONObject16, "collection_duration_seconds"), TimeUnit.SECONDS, yVar.f27592b);
                yVar.f27593c = C11993ym.m30974a(optJSONObject16, "aggressive_relaunch", yVar.f27593c);
                JSONArray optJSONArray3 = optJSONObject16.optJSONArray("collection_interval_ranges_seconds");
                C11428kg.C11462y.C11463a[] aVarArr = yVar.f27594d;
                if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                    try {
                        aVarArr = new C11428kg.C11462y.C11463a[optJSONArray3.length()];
                        for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                            aVarArr[i5] = new C11428kg.C11462y.C11463a();
                            JSONObject jSONObject2 = optJSONArray3.getJSONObject(i5);
                            C11428kg.C11462y.C11463a aVar3 = aVarArr[i5];
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            aVar3.f27596b = timeUnit.toMillis(jSONObject2.getLong("min"));
                            aVarArr[i5].f27597c = timeUnit.toMillis(jSONObject2.getLong("max"));
                        }
                    } catch (Throwable unused4) {
                    }
                }
                yVar.f27594d = aVarArr;
            }
            vjVar.mo63929a(uaVar.mo63779a(yVar));
        }
        this.f28416l.mo63554a(vjVar, aVar);
        this.f28418n.mo64201a(vjVar, aVar);
        vjVar.mo63952b(this.f28419o.mo64174a(aVar, "ui_event_sending", C11898w0.m30737b()));
        vjVar.mo63956c(this.f28419o.mo64174a(aVar, "ui_raw_event_sending", C11898w0.m30737b()));
        vjVar.mo63932a(this.f28419o.mo64174a(aVar, "ui_collecting_for_bridge", C11898w0.m30736a()));
        this.f28420p.mo62797a(vjVar, aVar);
        vjVar.mo63935a(this.f28413i.mo64099a(aVar, "throttling"));
        vjVar.mo63940a(this.f28421q.mo62838a(aVar));
        this.f28422r.mo62911a(vjVar, aVar);
        this.f28423s.getClass();
        JSONObject optJSONObject17 = aVar.optJSONObject("attribution");
        if (optJSONObject17 != null) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray4 = optJSONObject17.optJSONArray("deeplink_conditions");
            if (optJSONArray4 != null) {
                for (int i6 = 0; i6 < optJSONArray4.length(); i6++) {
                    JSONObject optJSONObject18 = optJSONArray4.optJSONObject(i6);
                    String optString2 = optJSONObject18.optString(SDKConstants.PARAM_KEY, (String) null);
                    if (!TextUtils.isEmpty(optString2)) {
                        String optString3 = optJSONObject18.optString("value", (String) null);
                        if (optString3 == null) {
                            aVar2 = null;
                        } else {
                            aVar2 = new C11606oi.C11607a(optString3);
                        }
                        arrayList2.add(new Pair(optString2, aVar2));
                    }
                }
            }
            vjVar.mo63938a(new C11606oi(arrayList2));
        }
        this.f28425u.mo62974a(vjVar, aVar);
        if (vjVar.mo63962e().f28202x) {
            this.f28426v.mo63022a(vjVar, aVar);
        }
        this.f28427w.mo64046a(vjVar, aVar);
    }
}
