package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.nv0;
import com.yandex.mobile.ads.mediation.base.C15434a;
import com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoadListener;
import com.yandex.mobile.ads.mediation.base.MediatedBidderTokenLoader;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class kn0 {

    /* renamed from: a */
    private final um0<C15434a> f36213a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final jn0 f36214b = new jn0();

    /* renamed from: c */
    private final in0 f36215c;

    /* renamed from: com.yandex.mobile.ads.impl.kn0$a */
    class C13730a implements MediatedBidderTokenLoadListener {

        /* renamed from: a */
        final /* synthetic */ hn0 f36216a;

        /* renamed from: b */
        final /* synthetic */ Context f36217b;

        /* renamed from: c */
        final /* synthetic */ C15434a f36218c;

        /* renamed from: d */
        final /* synthetic */ C13731b f36219d;

        /* renamed from: e */
        final /* synthetic */ C12373ac f36220e;

        /* renamed from: f */
        final /* synthetic */ long f36221f;

        C13730a(hn0 hn0, Context context, C15434a aVar, C13731b bVar, C12373ac acVar, long j) {
            this.f36216a = hn0;
            this.f36217b = context;
            this.f36218c = aVar;
            this.f36219d = bVar;
            this.f36220e = acVar;
            this.f36221f = j;
        }

        public void onBidderTokenFailedToLoad(String str) {
            kn0.m38401a(kn0.this, this.f36217b, this.f36216a, this.f36218c, str, (Long) null, this.f36219d);
        }

        public void onBidderTokenLoaded(String str) {
            JSONObject jSONObject;
            if (TextUtils.isEmpty(str)) {
                kn0.m38401a(kn0.this, this.f36217b, this.f36216a, this.f36218c, this.f36216a.mo67571c() + " provided empty token", (Long) null, this.f36219d);
            } else if (this.f36220e.mo65719a()) {
                kn0.m38401a(kn0.this, this.f36217b, this.f36216a, this.f36218c, this.f36216a.mo67571c() + " didn't provide bidder token after timeout", Long.valueOf(SystemClock.elapsedRealtime() - this.f36221f), this.f36219d);
            } else {
                jn0 a = kn0.this.f36214b;
                hn0 hn0 = this.f36216a;
                a.getClass();
                String c = hn0.mo67571c();
                Map<String, String> d = hn0.mo67572d();
                Map<String, String> g = hn0.mo67576g();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adapter", c);
                    if (d != null) {
                        jSONObject2.put("bidding_info", new JSONObject(d));
                    }
                    jSONObject2.put("network_data", new JSONObject(g));
                    jSONObject2.put("bidder_token", str);
                    jSONObject = jSONObject2;
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    kn0.m38401a(kn0.this, this.f36217b, this.f36216a, this.f36218c, "Can't create bidding data json object for network.", (Long) null, this.f36219d);
                } else {
                    kn0.m38402a(kn0.this, this.f36217b, this.f36216a, this.f36218c, jSONObject, this.f36219d);
                }
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kn0$b */
    public interface C13731b {
    }

    kn0(wm0 wm0) {
        this.f36213a = new um0<>(wm0);
        this.f36215c = new in0(wm0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68254a(Context context, hn0 hn0, C12373ac acVar, C13731b bVar) {
        Context context2 = context;
        C15434a a = this.f36213a.mo70374a(context2, hn0, C15434a.class);
        if (a instanceof MediatedBidderTokenLoader) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Map<String, String> g = hn0.mo67576g();
                C13730a aVar = r1;
                C13730a aVar2 = new C13730a(hn0, context, a, bVar, acVar, elapsedRealtime);
                ((MediatedBidderTokenLoader) a).loadBidderToken(context2, g, aVar);
            } catch (Throwable th) {
                this.f36215c.mo67837a(context, hn0, a, th.toString(), (Long) null);
                ((nv0.C14136a) bVar).mo69082a((JSONObject) null);
            }
        } else {
            this.f36215c.mo67837a(context, hn0, a, "Can't create bidder token loader.", (Long) null);
            ((nv0.C14136a) bVar).mo69082a((JSONObject) null);
        }
    }

    /* renamed from: a */
    static void m38401a(kn0 kn0, Context context, hn0 hn0, C15434a aVar, String str, Long l, C13731b bVar) {
        kn0.f36215c.mo67837a(context, hn0, aVar, str, l);
        ((nv0.C14136a) bVar).mo69082a((JSONObject) null);
    }

    /* renamed from: a */
    static void m38402a(kn0 kn0, Context context, hn0 hn0, C15434a aVar, JSONObject jSONObject, C13731b bVar) {
        kn0.f36215c.mo67836a(context, hn0, aVar);
        ((nv0.C14136a) bVar).mo69082a(jSONObject);
    }
}
