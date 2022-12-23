package com.ogury.p245ed.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.ff */
public final class C8223ff {

    /* renamed from: a */
    public static final C8224a f21290a = new C8224a((byte) 0);

    /* renamed from: b */
    private final C8229fk f21291b;

    /* renamed from: c */
    private final boolean f21292c;

    /* renamed from: d */
    private JSONObject f21293d;

    /* renamed from: e */
    private String f21294e;

    /* renamed from: f */
    private final String f21295f = this.f21291b.mo53514d();

    /* renamed from: g */
    private final C8232fm f21296g;

    public C8223ff(C8221fd fdVar, C8229fk fkVar, boolean z) {
        C8467mq.m23881b(fdVar, "profigGenerator");
        C8467mq.m23881b(fkVar, "profigDao");
        this.f21291b = fkVar;
        this.f21292c = z;
        this.f21293d = fdVar.mo53484a();
        C8218fb fbVar = C8218fb.f21270a;
        String jSONObject = this.f21293d.toString();
        C8467mq.m23878a((Object) jSONObject, "generatedProfig.toString()");
        this.f21294e = C8218fb.m23007a(jSONObject);
        C8234fo foVar = C8234fo.f21332a;
        this.f21296g = C8234fo.m23116a(this.f21295f);
    }

    /* renamed from: com.ogury.ed.internal.ff$a */
    public static final class C8224a {
        public /* synthetic */ C8224a(byte b) {
            this();
        }

        private C8224a() {
        }
    }

    /* renamed from: b */
    private final boolean m23032b() {
        return this.f21296g != null ? this.f21291b.mo53506a() >= this.f21296g.mo53537d() : this.f21291b.mo53506a() >= 10;
    }

    /* renamed from: c */
    private final boolean m23033c() {
        C8232fm fmVar = this.f21296g;
        if (fmVar == null) {
            return true;
        }
        return fmVar.mo53528a();
    }

    /* renamed from: d */
    private final boolean m23034d() {
        return C8467mq.m23880a((Object) this.f21291b.mo53519g(), (Object) C8265go.m23207a());
    }

    /* renamed from: e */
    private final boolean m23035e() {
        C8232fm fmVar = this.f21296g;
        return this.f21291b.mo53520h() + (fmVar == null ? 0 : fmVar.mo53541e()) > System.currentTimeMillis();
    }

    /* renamed from: a */
    public final C8222fe mo53491a() {
        C8232fm fmVar = this.f21296g;
        long e = fmVar == null ? 43200000 : fmVar.mo53541e();
        boolean c = m23033c();
        boolean z = !c;
        boolean b = m23032b();
        C8467mq.m23873a("api calls reached ", (Object) Boolean.valueOf(b));
        OguryIntegrationLogger.m22104d(C8467mq.m23873a("[Ads][setup] Synchronization is enabled: ", (Object) Boolean.valueOf(c)));
        if (b) {
            OguryIntegrationLogger.m22104d("[Ads][setup] Too many synchronization");
        }
        boolean z2 = true;
        boolean z3 = !m23035e();
        boolean z4 = !m23034d();
        boolean z5 = z && z4;
        if (!c || b || !z3 || (!this.f21292c && !m23036f() && !z4 && !z3)) {
            z2 = false;
        }
        if ((this.f21292c || m23038h()) && !b) {
            OguryIntegrationLogger.m22104d("[Ads][setup] Configuration needs to be synchronized with servers");
            return new C8222fe(true, e, this.f21293d, c, this.f21294e);
        } else if (z2 || z5) {
            OguryIntegrationLogger.m22104d("[Ads][setup] Configuration needs to be synchronized with servers");
            String str = null;
            if (m23036f()) {
                str = this.f21294e;
            }
            return new C8222fe(true, e, m23037g(), c, str);
        } else {
            OguryIntegrationLogger.m22104d("[Ads][setup] Local configuration is up to date");
            return new C8222fe(e, new JSONObject(), c);
        }
    }

    /* renamed from: f */
    private final boolean m23036f() {
        return !C8467mq.m23880a((Object) this.f21291b.mo53510b(), (Object) this.f21294e);
    }

    /* renamed from: g */
    private final JSONObject m23037g() {
        if (this.f21292c || m23036f()) {
            return this.f21293d;
        }
        return new JSONObject();
    }

    /* renamed from: h */
    private final boolean m23038h() {
        return (this.f21295f.length() == 0) || C8467mq.m23880a((Object) this.f21295f, (Object) "{}");
    }
}
