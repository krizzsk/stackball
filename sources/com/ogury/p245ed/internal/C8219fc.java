package com.ogury.p245ed.internal;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.aaid.OguryAaid;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.ogury.p245ed.internal.C8229fk;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fc */
public final class C8219fc {

    /* renamed from: a */
    public static final C8220a f21271a = new C8220a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static C8219fc f21272k;

    /* renamed from: b */
    private final Context f21273b;

    /* renamed from: c */
    private final C8229fk f21274c;

    /* renamed from: d */
    private final C8221fd f21275d;

    /* renamed from: e */
    private final C8244fx f21276e;

    /* renamed from: f */
    private final C8171dv f21277f;

    /* renamed from: g */
    private final C8251gb f21278g;

    /* renamed from: h */
    private final C8163do f21279h;

    /* renamed from: i */
    private boolean f21280i;

    /* renamed from: j */
    private OguryAaid f21281j;

    public /* synthetic */ C8219fc(Context context, C8229fk fkVar, C8221fd fdVar, C8244fx fxVar, C8171dv dvVar, C8251gb gbVar, C8163do doVar, byte b) {
        this(context, fkVar, fdVar, fxVar, dvVar, gbVar, doVar);
    }

    private C8219fc(Context context, C8229fk fkVar, C8221fd fdVar, C8244fx fxVar, C8171dv dvVar, C8251gb gbVar, C8163do doVar) {
        this.f21273b = context;
        this.f21274c = fkVar;
        this.f21275d = fdVar;
        this.f21276e = fxVar;
        this.f21277f = dvVar;
        this.f21278g = gbVar;
        this.f21279h = doVar;
        this.f21281j = fxVar.mo53566a();
    }

    /* renamed from: com.ogury.ed.internal.fc$a */
    public static final class C8220a {
        public /* synthetic */ C8220a(byte b) {
            this();
        }

        private C8220a() {
        }

        /* renamed from: a */
        public final C8219fc mo53483a(Context context) {
            C8219fc c;
            C8467mq.m23881b(context, "context");
            C8261gl.m23200a("Profig.getInstance");
            synchronized (this) {
                if (C8219fc.f21272k == null) {
                    C8220a aVar = C8219fc.f21271a;
                    C8220a aVar2 = C8219fc.f21271a;
                    Context applicationContext = context.getApplicationContext();
                    C8467mq.m23878a((Object) applicationContext, "context.applicationContext");
                    C8219fc.f21272k = m23022b(applicationContext);
                }
                c = C8219fc.f21272k;
                C8467mq.m23877a((Object) c);
            }
            return c;
        }

        /* renamed from: b */
        private static C8219fc m23022b(Context context) {
            C8229fk.C8230a aVar = C8229fk.f21305a;
            C8229fk a = C8229fk.C8230a.m23074a(context);
            C8221fd fdVar = new C8221fd(new C8212ez(context), new C8216fa(context), new C8244fx(context));
            C8172dw dwVar = C8172dw.f21148a;
            return new C8219fc(context, a, fdVar, new C8244fx(context), C8172dw.m22770a(context), new C8252gc(), new C8163do(), (byte) 0);
        }
    }

    /* renamed from: d */
    private final void m23016d() {
        if (m23017e()) {
            this.f21274c.mo53507a(0);
            this.f21274c.mo53516e();
        }
    }

    /* renamed from: e */
    private final boolean m23017e() {
        return this.f21274c.mo53518f() != System.currentTimeMillis() / TimeUnit.DAYS.toMillis(1);
    }

    /* renamed from: f */
    private final void m23018f() {
        this.f21274c.mo53507a(this.f21274c.mo53506a() + 1);
    }

    /* renamed from: a */
    private final C8223ff m23008a(boolean z) {
        C8467mq.m23873a("Profig - force profig ", (Object) Boolean.valueOf(z));
        this.f21281j = this.f21276e.mo53566a();
        return new C8223ff(this.f21275d, this.f21274c, z);
    }

    /* renamed from: a */
    public final void mo53481a() {
        OguryIntegrationLogger.m22104d("[Ads][setup] Synchronisation of the configuration has just been required");
        this.f21274c.mo53522j();
        mo53482b();
    }

    /* renamed from: b */
    public final void mo53482b() throws C8201eq {
        OguryIntegrationLogger.m22104d("[Ads][setup] Synchronizing configuration...");
        boolean k = this.f21274c.mo53523k();
        if (!this.f21280i || k) {
            C8467mq.m23873a("Profig - syncProfigIfNecessary ", (Object) Boolean.valueOf(k));
            this.f21280i = true;
            m23016d();
            C8222fe a = m23008a(k).mo53491a();
            StringBuilder sb = new StringBuilder("Profig - profigRequest ");
            sb.append(k);
            sb.append(' ');
            sb.append(a);
            if (!this.f21278g.mo53611a(this.f21273b)) {
                OguryIntegrationLogger.m22104d("[Ads][setup] Impossible to join Ogury servers. No Internet connection");
                this.f21280i = false;
                return;
            }
            if (a.mo53485a()) {
                OguryIntegrationLogger.m22104d("[Ads][setup] Synchronizing configuration from servers...");
                m23010a(a);
            } else {
                OguryIntegrationLogger.m22104d("[Ads][setup] Configuration synchronized");
            }
            this.f21280i = false;
            return;
        }
        OguryIntegrationLogger.m22104d("[Ads][setup] Configuration is already synchronizing");
    }

    /* renamed from: a */
    private final void m23010a(C8222fe feVar) {
        C8467mq.m23873a("making profig api call ", (Object) feVar);
        try {
            OguryNetworkResponse a = this.f21277f.mo53321a(feVar.mo53486b());
            if (a instanceof OguryNetworkResponse.Success) {
                JSONObject jSONObject = new JSONObject(((OguryNetworkResponse.Success) a).getResponseBody());
                C8163do.m22748a(jSONObject);
                OguryIntegrationLogger.m22104d("[Ads][setup] Configuration synchronized");
                m23011a(feVar, jSONObject);
            } else if (a instanceof OguryNetworkResponse.Failure) {
                OguryIntegrationLogger.m22104d("[Ads][setup] Failed to synchronize configuration (" + ((OguryNetworkResponse.Failure) a).getException().getMessage() + ')');
                Throwable exception = ((OguryNetworkResponse.Failure) a).getException();
                C8467mq.m23878a((Object) exception, "response.exception");
                m23014a(exception);
            }
        } catch (Exception e) {
            OguryIntegrationLogger.m22104d("[Ads][setup] Failed to synchronize configuration (" + e.getMessage() + ')');
            m23014a((Throwable) e);
        }
    }

    /* renamed from: a */
    private final void m23014a(Throwable th) {
        if (C8261gl.m23202b(th)) {
            m23018f();
            m23019g();
        }
        if (th instanceof C8201eq) {
            throw th;
        }
    }

    /* renamed from: a */
    private final void m23011a(C8222fe feVar, JSONObject jSONObject) {
        m23018f();
        m23019g();
        m23013a(feVar.mo53487c());
        C8229fk fkVar = this.f21274c;
        String id = this.f21281j.getId();
        C8467mq.m23878a((Object) id, "aaid.id");
        fkVar.mo53511b(id);
        this.f21274c.mo53508a(System.currentTimeMillis());
        C8234fo foVar = C8234fo.f21332a;
        m23012a(C8234fo.m23117a(jSONObject), jSONObject);
    }

    /* renamed from: a */
    private final void m23013a(String str) {
        if (str != null) {
            this.f21274c.mo53509a(str);
        }
    }

    /* renamed from: g */
    private final void m23019g() {
        this.f21274c.mo53515d(C8265go.m23207a());
    }

    /* renamed from: a */
    private final void m23012a(C8236fq fqVar, JSONObject jSONObject) {
        if (fqVar instanceof C8232fm) {
            OguryIntegrationLogger.m22104d("[Ads][setup] Saving configuration...");
            C8233fn fnVar = C8233fn.f21330a;
            C8233fn.m23114a((C8232fm) fqVar);
            C8229fk fkVar = this.f21274c;
            String jSONObject2 = jSONObject.toString();
            C8467mq.m23878a((Object) jSONObject2, "profigJsonResponse.toString()");
            fkVar.mo53513c(jSONObject2);
            OguryIntegrationLogger.m22104d("[Ads][setup] Configuration saved");
        } else if (fqVar instanceof C8225fg) {
            OguryIntegrationLogger.m22104d("[Ads][setup] New configuration synchronization requested");
            mo53481a();
        } else if (fqVar instanceof C8231fl) {
            OguryIntegrationLogger.m22105e("[Ads][setup] Invalid configuration (empty)");
        }
    }
}
