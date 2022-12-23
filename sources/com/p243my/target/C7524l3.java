package com.p243my.target;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.ServerParameters;
import com.p243my.target.C7402f5;
import com.tapjoy.TapjoyConstants;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.l3 */
public final class C7524l3 {

    /* renamed from: a */
    public final Map<String, Object> f18935a;

    /* renamed from: b */
    public final Map<Integer, Long> f18936b = new HashMap();

    /* renamed from: c */
    public final long f18937c;

    /* renamed from: d */
    public final int f18938d;

    /* renamed from: e */
    public boolean f18939e;

    /* renamed from: com.my.target.l3$a */
    public static final class C7525a {

        /* renamed from: a */
        public final int f18940a;

        /* renamed from: b */
        public boolean f18941b = false;

        public C7525a(int i) {
            this.f18940a = i;
        }

        /* renamed from: a */
        public C7524l3 mo50803a() {
            C7524l3 l3Var = new C7524l3(this.f18940a, "myTarget", 0);
            l3Var.mo50799a(this.f18941b);
            return l3Var;
        }

        /* renamed from: a */
        public C7524l3 mo50804a(String str, float f) {
            C7524l3 l3Var = new C7524l3(this.f18940a, str, 5);
            l3Var.mo50799a(this.f18941b);
            l3Var.f18935a.put("priority", Float.valueOf(f));
            return l3Var;
        }

        /* renamed from: a */
        public void mo50805a(boolean z) {
            this.f18941b = z;
        }

        /* renamed from: b */
        public C7524l3 mo50806b() {
            C7524l3 l3Var = new C7524l3(this.f18940a, "myTarget", 4);
            l3Var.mo50799a(this.f18941b);
            return l3Var;
        }
    }

    public C7524l3(int i, String str, int i2) {
        HashMap hashMap = new HashMap();
        this.f18935a = hashMap;
        this.f18938d = i2;
        this.f18937c = System.currentTimeMillis();
        hashMap.put("slot", Integer.valueOf(i));
        hashMap.put(ServerParameters.NETWORK, str);
    }

    /* renamed from: a */
    public static C7525a m19687a(int i) {
        return new C7525a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19688a(Context context) {
        String a = mo50797a();
        C7374e0.m18989a("send metrics message:\n " + a);
        C7414g3.m19172d().mo50288b("https://ad.mail.ru/sdk/ms/", Base64.encodeToString(a.getBytes(Charset.forName("UTF-8")), 0), context);
    }

    /* renamed from: a */
    public String mo50797a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : this.f18935a.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("events", jSONArray);
            for (Map.Entry next2 : this.f18936b.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", next2.getKey());
                jSONObject2.put("value", next2.getValue());
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public void mo50798a(int i, long j) {
        Long l = this.f18936b.get(Integer.valueOf(i));
        if (l != null) {
            j += l.longValue();
        }
        mo50801b(i, j);
    }

    /* renamed from: a */
    public void mo50799a(boolean z) {
        this.f18939e = z;
    }

    /* renamed from: b */
    public void mo50800b() {
        mo50801b(this.f18938d, System.currentTimeMillis() - this.f18937c);
    }

    /* renamed from: b */
    public void mo50801b(int i, long j) {
        this.f18936b.put(Integer.valueOf(i), Long.valueOf(j));
    }

    /* renamed from: b */
    public void mo50802b(Context context) {
        if (!this.f18939e) {
            C7374e0.m18989a("metrics sending disabled");
        } else if (this.f18936b.isEmpty()) {
            C7374e0.m18989a("metrics not send: empty");
        } else {
            C7402f5.C7403a a = C7456i5.m19373c().mo50395a();
            if (a == null) {
                C7374e0.m18989a("metrics not send: basic info not collected");
                return;
            }
            this.f18935a.put("instanceId", a.f18580a);
            this.f18935a.put("os", a.f18581b);
            this.f18935a.put("osver", a.f18582c);
            this.f18935a.put(TapjoyConstants.TJC_APP_PLACEMENT, a.f18583d);
            this.f18935a.put("appver", a.f18584e);
            this.f18935a.put("sdkver", a.f18585f);
            C7395f0.m19088b(new Runnable(context) {
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C7524l3.this.m19688a(this.f$1);
                }
            });
        }
    }
}
