package com.chartboost.sdk.Model;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.chartboost.sdk.C1880a;
import com.chartboost.sdk.C1883d;
import com.chartboost.sdk.C1885e;
import com.chartboost.sdk.C1887f;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Events.ChartboostError;
import com.chartboost.sdk.Libraries.C1828g;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1855g;
import com.chartboost.sdk.Networking.C1857i;
import com.chartboost.sdk.Networking.C1860j;
import com.chartboost.sdk.Tracking.C1868a;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.impl.C1894a;
import com.chartboost.sdk.impl.C1921h0;
import com.chartboost.sdk.impl.C1927i0;
import com.chartboost.sdk.impl.C1965p0;
import com.chartboost.sdk.impl.C1979s1;
import com.chartboost.sdk.impl.C1989v1;
import com.chartboost.sdk.impl.C2014x;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Model.c */
public class C1838c {

    /* renamed from: A */
    public boolean f4444A = false;

    /* renamed from: B */
    public boolean f4445B;

    /* renamed from: C */
    public boolean f4446C = false;

    /* renamed from: D */
    public boolean f4447D = false;

    /* renamed from: a */
    public int f4448a;

    /* renamed from: b */
    public int f4449b;

    /* renamed from: c */
    public final C1894a f4450c;

    /* renamed from: d */
    public final C1828g f4451d;

    /* renamed from: e */
    public final C1855g f4452e;

    /* renamed from: f */
    public final C1842g f4453f;

    /* renamed from: g */
    public final Handler f4454g;

    /* renamed from: h */
    public final C1883d f4455h;

    /* renamed from: i */
    public final C1857i f4456i;

    /* renamed from: j */
    public final C1885e f4457j;

    /* renamed from: k */
    public final C1860j f4458k;

    /* renamed from: l */
    public final C1839d f4459l;

    /* renamed from: m */
    public final String f4460m;

    /* renamed from: n */
    private boolean f4461n;

    /* renamed from: o */
    private Boolean f4462o = null;

    /* renamed from: p */
    public final String f4463p;

    /* renamed from: q */
    public final C1836a f4464q;

    /* renamed from: r */
    public final SharedPreferences f4465r;

    /* renamed from: s */
    private Runnable f4466s;

    /* renamed from: t */
    private C1887f f4467t;

    /* renamed from: u */
    private final WeakReference<RelativeLayout> f4468u;

    /* renamed from: v */
    private final Boolean f4469v;

    /* renamed from: w */
    private final Context f4470w;

    /* renamed from: x */
    public C1965p0 f4471x;

    /* renamed from: y */
    public C1979s1 f4472y;

    /* renamed from: z */
    public boolean f4473z;

    public C1838c(Context context, C1836a aVar, C1839d dVar, C1828g gVar, C1855g gVar2, C1842g gVar3, SharedPreferences sharedPreferences, Handler handler, C1883d dVar2, C1857i iVar, C1885e eVar, C1860j jVar, C1894a aVar2, String str, String str2, RelativeLayout relativeLayout) {
        this.f4470w = context;
        this.f4464q = aVar;
        this.f4450c = aVar2;
        this.f4451d = gVar;
        this.f4452e = gVar2;
        this.f4453f = gVar3;
        this.f4454g = handler;
        this.f4455h = dVar2;
        this.f4456i = iVar;
        this.f4457j = eVar;
        this.f4458k = jVar;
        this.f4459l = dVar;
        this.f4468u = new WeakReference<>(relativeLayout);
        this.f4469v = Boolean.valueOf(this.f4450c.f4748a == 3);
        this.f4449b = 0;
        this.f4473z = false;
        this.f4445B = false;
        this.f4447D = true;
        this.f4448a = 4;
        this.f4460m = str;
        this.f4463p = str2;
        this.f4461n = true;
        this.f4465r = sharedPreferences;
    }

    /* renamed from: A */
    private void m4073A() {
        int i = this.f4450c.f4748a;
        if (i == 0) {
            m4074B();
        } else if (i == 1) {
            m4075C();
        } else if (i == 3) {
            this.f4448a = 3;
        }
    }

    /* renamed from: B */
    private void m4074B() {
        if (this.f4464q.f4437q.equals("video")) {
            this.f4448a = 1;
            this.f4461n = false;
            return;
        }
        this.f4448a = 0;
    }

    /* renamed from: C */
    private void m4075C() {
        this.f4448a = 2;
        this.f4461n = false;
        if (m4083l()) {
            this.f4467t = new C1927i0(this.f4470w, this, this.f4451d, this.f4454g, this.f4455h);
        }
    }

    /* renamed from: D */
    private void m4076D() {
        if (m4083l()) {
            int i = this.f4450c.f4748a;
            if (i == 0) {
                if (this.f4464q.f4437q.equals("video")) {
                    this.f4467t = new C1927i0(this.f4470w, this, this.f4451d, this.f4454g, this.f4455h);
                    return;
                }
                this.f4467t = new C1921h0(this.f4470w, this, this.f4454g, this.f4455h);
            } else if (i == 1) {
                this.f4467t = new C1927i0(this.f4470w, this, this.f4451d, this.f4454g, this.f4455h);
            }
        } else {
            this.f4467t = new C1989v1(this.f4470w, this, this.f4451d, this.f4452e, this.f4465r, this.f4454g, this.f4455h, this.f4457j);
        }
    }

    /* renamed from: c */
    private void m4081c() {
        C1885e d;
        if (this.f4449b == 2 && (d = this.f4455h.mo14492d()) != null) {
            d.mo14507a(this);
        }
    }

    /* renamed from: h */
    private boolean m4082h() {
        return this.f4462o.booleanValue();
    }

    /* renamed from: l */
    private boolean m4083l() {
        return this.f4464q.f4422b == 0;
    }

    /* renamed from: m */
    private boolean m4084m() {
        return this.f4462o != null;
    }

    /* renamed from: E */
    public boolean mo14266E() {
        C1887f fVar = this.f4467t;
        if (fVar != null) {
            fVar.mo14536m();
            if (this.f4467t.mo14532i() != null) {
                return true;
            }
        } else {
            CBLogging.m3993b("CBImpression", "reinitializing -- no view protocol exists!!");
        }
        CBLogging.m3995c("CBImpression", "reinitializing -- view not yet created");
        return false;
    }

    /* renamed from: F */
    public void mo14267F() {
        C1965p0 p0Var = new C1965p0("https://live.chartboost.com", "/api/video-complete", this.f4453f, 2, (C1965p0.C1966a) null);
        p0Var.mo14750a(FirebaseAnalytics.Param.LOCATION, (Object) this.f4460m);
        p0Var.mo14750a("reward", (Object) Integer.valueOf(this.f4464q.f4432l));
        p0Var.mo14750a("currency-name", (Object) this.f4464q.f4433m);
        p0Var.mo14750a("ad_id", (Object) mo14279d());
        p0Var.mo14750a("force_close", (Object) Boolean.FALSE);
        if (!this.f4464q.f4427g.isEmpty()) {
            p0Var.mo14750a("cgn", (Object) this.f4464q.f4427g);
        }
        C1887f k = mo14284j() != null ? mo14285k() : null;
        if (k != null) {
            float h = k.mo14531h();
            float g = k.mo14530g();
            CBLogging.m3991a(C1838c.class.getSimpleName(), String.format(Locale.US, "TotalDuration: %f PlaybackTime: %f", new Object[]{Float.valueOf(g), Float.valueOf(h)}));
            float f = g / 1000.0f;
            p0Var.mo14750a("total_time", (Object) Float.valueOf(f));
            if (h <= 0.0f) {
                p0Var.mo14750a("playback_time", (Object) Float.valueOf(f));
            } else {
                p0Var.mo14750a("playback_time", (Object) Float.valueOf(h / 1000.0f));
            }
        }
        this.f4452e.mo14335a(p0Var);
    }

    /* renamed from: G */
    public boolean mo14268G() {
        return this.f4461n;
    }

    /* renamed from: H */
    public void mo14269H() {
        this.f4459l.mo14302c(this);
    }

    /* renamed from: I */
    public boolean mo14270I() {
        return this.f4447D;
    }

    /* renamed from: a */
    public void mo14273a(CBError.CBImpressionError cBImpressionError) {
        this.f4459l.mo14300a(this, cBImpressionError);
    }

    /* renamed from: b */
    public void mo14277b(String str, JSONObject jSONObject) {
        mo14275a(str, jSONObject);
        if (this.f4450c.f4748a == 3) {
            m4080b(this.f4464q.f4429i);
        }
    }

    /* renamed from: d */
    public String mo14279d() {
        return this.f4464q.f4426f;
    }

    /* renamed from: e */
    public C1894a mo14280e() {
        return this.f4450c;
    }

    /* renamed from: f */
    public RelativeLayout mo14281f() {
        return (RelativeLayout) this.f4468u.get();
    }

    /* renamed from: g */
    public String mo14282g() {
        return this.f4460m;
    }

    /* renamed from: i */
    public Boolean mo14283i() {
        return this.f4469v;
    }

    /* renamed from: j */
    public C1887f.C1889b mo14284j() {
        C1887f fVar = this.f4467t;
        if (fVar != null) {
            return fVar.mo14532i();
        }
        return null;
    }

    /* renamed from: k */
    public C1887f mo14285k() {
        return this.f4467t;
    }

    /* renamed from: n */
    public void mo14286n() {
        C1894a aVar;
        C1880a aVar2 = C2026k.f5247d;
        if (aVar2 != null && (aVar = this.f4450c) != null) {
            int i = aVar.f4748a;
            if (i == 0) {
                aVar2.didCompleteInterstitial(this.f4460m);
            } else if (i == 1) {
                aVar2.didCompleteRewardedVideo(this.f4460m, this.f4464q.f4432l);
            }
        }
    }

    /* renamed from: o */
    public void mo14287o() {
        this.f4444A = true;
    }

    /* renamed from: p */
    public void mo14288p() {
        Runnable runnable = this.f4466s;
        if (runnable != null) {
            runnable.run();
            this.f4466s = null;
        }
        this.f4444A = false;
    }

    /* renamed from: q */
    public boolean mo14289q() {
        C1887f fVar = this.f4467t;
        if (fVar != null) {
            return fVar.mo14533j();
        }
        return false;
    }

    /* renamed from: r */
    public void mo14290r() {
        this.f4447D = true;
        this.f4455h.mo14486a(this);
        this.f4459l.mo14299a(this);
    }

    /* renamed from: s */
    public void mo14291s() {
        C1839d dVar = this.f4459l;
        if (dVar != null) {
            dVar.mo14301b(this);
        } else {
            C1874e.m4311e(new C1868a("show_null_callback_mgr_error", "", this.f4450c.f4749b, this.f4460m));
        }
    }

    /* renamed from: t */
    public void mo14292t() {
        C1887f fVar = this.f4467t;
        if (fVar != null && fVar.mo14532i() != null) {
            this.f4467t.mo14532i().setVisibility(8);
        }
    }

    /* renamed from: u */
    public void mo14293u() {
        C1887f fVar = this.f4467t;
        if (fVar != null && !this.f4446C) {
            this.f4446C = true;
            fVar.mo14534k();
        }
    }

    /* renamed from: v */
    public void mo14294v() {
        this.f4461n = true;
    }

    /* renamed from: w */
    public void mo14295w() {
    }

    /* renamed from: x */
    public void mo14296x() {
        this.f4445B = false;
        C1887f fVar = this.f4467t;
        if (fVar != null && this.f4446C) {
            this.f4446C = false;
            fVar.mo14535l();
        }
    }

    /* renamed from: y */
    public void mo14297y() {
        this.f4445B = false;
    }

    /* renamed from: z */
    public boolean mo14298z() {
        this.f4449b = 0;
        m4073A();
        m4076D();
        return this.f4467t.mo14525b(this.f4464q.f4421a);
    }

    /* renamed from: a */
    public void mo14272a() {
        C1979s1 s1Var = this.f4472y;
        if (s1Var != null) {
            s1Var.mo14789a();
            try {
                if (!(this.f4467t == null || this.f4467t.mo14532i() == null || this.f4467t.mo14532i().getParent() == null)) {
                    this.f4472y.removeView(this.f4467t.mo14532i());
                }
            } catch (Exception e) {
                CBLogging.m3992a("CBImpression", "Exception raised while cleaning up views", e);
            }
            this.f4472y = null;
        }
        C1887f fVar = this.f4467t;
        if (!(fVar == null || this.f4448a == 3)) {
            fVar.mo14524b();
        }
        CBLogging.m3995c("CBImpression", "Destroying the view");
    }

    /* renamed from: b */
    private void m4080b(String str) {
        C2022j b = C2022j.m4955b();
        if (b != null) {
            b.f5222l.mo14480b(this.f4450c.f4749b, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14278b(org.json.JSONObject r7) {
        /*
            r6 = this;
            int r0 = r6.f4449b
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L_0x0049
            boolean r0 = r6.f4444A
            if (r0 == 0) goto L_0x000b
            goto L_0x0049
        L_0x000b:
            com.chartboost.sdk.Model.a r0 = r6.f4464q
            java.lang.String r2 = r0.f4431k
            java.lang.String r0 = r0.f4430j
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x003b
            com.chartboost.sdk.Networking.i r3 = r6.f4456i     // Catch:{ Exception -> 0x002d }
            android.content.Context r4 = r6.f4470w     // Catch:{ Exception -> 0x002d }
            boolean r3 = r3.mo14343a((android.content.Context) r4, (java.lang.String) r0)     // Catch:{ Exception -> 0x002d }
            if (r3 == 0) goto L_0x0028
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0026 }
            r6.f4462o = r2     // Catch:{ Exception -> 0x0026 }
            goto L_0x003a
        L_0x0026:
            r2 = move-exception
            goto L_0x0031
        L_0x0028:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x002d }
            r6.f4462o = r0     // Catch:{ Exception -> 0x002d }
            goto L_0x003b
        L_0x002d:
            r0 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
        L_0x0031:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "CBImpression onClick"
            com.chartboost.sdk.Libraries.CBLogging.m3993b(r3, r2)
        L_0x003a:
            r2 = r0
        L_0x003b:
            boolean r0 = r6.f4445B
            if (r0 == 0) goto L_0x0040
            return r1
        L_0x0040:
            r0 = 1
            r6.f4445B = r0
            r6.f4447D = r1
            r6.mo14275a((java.lang.String) r2, (org.json.JSONObject) r7)
            return r0
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.Model.C1838c.mo14278b(org.json.JSONObject):boolean");
    }

    /* renamed from: a */
    public CBError.CBImpressionError mo14271a(RelativeLayout relativeLayout) {
        try {
            if (this.f4467t != null) {
                if (mo14283i().booleanValue()) {
                    return this.f4467t.mo14515a(relativeLayout);
                }
                return this.f4467t.mo14537n();
            }
        } catch (Exception e) {
            CBLogging.m3993b("CBImpression", "tryCreatingView: " + e.toString());
        }
        return CBError.CBImpressionError.ERROR_CREATING_VIEW;
    }

    /* renamed from: a */
    public void mo14274a(Runnable runnable) {
        this.f4466s = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14275a(String str, JSONObject jSONObject) {
        Handler handler = this.f4454g;
        C1894a aVar = this.f4450c;
        aVar.getClass();
        handler.post(new C1894a.C1895a(1, this.f4460m, (CBError.CBImpressionError) null, (ChartboostError) null, true, this.f4464q.f4429i));
        if (mo14268G()) {
            m4081c();
        }
        if (m4079a(str)) {
            this.f4471x = m4078a(jSONObject);
            this.f4456i.mo14341a(this.f4470w, this, str, (C1965p0) null);
            return;
        }
        C1874e.m4311e(new C1868a("click_invalid_url_error", str, this.f4450c.f4749b, this.f4460m));
        this.f4456i.mo14342a(this, false, str, CBError.CBClickError.URI_INVALID, (C1965p0) null);
    }

    /* renamed from: b */
    public void mo14276b() {
        mo14272a();
        if (this.f4473z) {
            this.f4467t = null;
            CBLogging.m3995c("CBImpression", "Destroying the view and view data");
        }
    }

    /* renamed from: a */
    private boolean m4079a(String str) {
        return !C2014x.m4911b().mo14884a((CharSequence) str);
    }

    /* renamed from: a */
    private C1965p0 m4078a(JSONObject jSONObject) {
        return m4077a(new C1965p0("https://live.chartboost.com", "/api/click", this.f4453f, 2, (C1965p0.C1966a) null), jSONObject);
    }

    /* renamed from: a */
    private C1965p0 m4077a(C1965p0 p0Var, JSONObject jSONObject) {
        if (!this.f4464q.f4426f.isEmpty()) {
            p0Var.mo14750a("ad_id", (Object) this.f4464q.f4426f);
        }
        if (!this.f4464q.f4434n.isEmpty()) {
            p0Var.mo14750a("to", (Object) this.f4464q.f4434n);
        }
        if (!this.f4464q.f4427g.isEmpty()) {
            p0Var.mo14750a("cgn", (Object) this.f4464q.f4427g);
        }
        if (!this.f4464q.f4428h.isEmpty()) {
            p0Var.mo14750a(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE, (Object) this.f4464q.f4428h);
        }
        int i = this.f4448a;
        if (i == 1 || i == 2) {
            C1887f fVar = null;
            if (this.f4464q.f4422b == 0 && mo14284j() != null) {
                fVar = mo14285k();
            } else if (this.f4464q.f4422b == 1 && mo14284j() != null) {
                fVar = mo14285k();
            }
            if (fVar != null) {
                float h = fVar.mo14531h();
                float g = fVar.mo14530g();
                CBLogging.m3991a(C1838c.class.getSimpleName(), String.format(Locale.US, "TotalDuration: %f PlaybackTime: %f", new Object[]{Float.valueOf(g), Float.valueOf(h)}));
                float f = g / 1000.0f;
                p0Var.mo14750a("total_time", (Object) Float.valueOf(f));
                if (h <= 0.0f) {
                    p0Var.mo14750a("playback_time", (Object) Float.valueOf(f));
                } else {
                    p0Var.mo14750a("playback_time", (Object) Float.valueOf(h / 1000.0f));
                }
            }
        } else if (i == 3) {
            p0Var.mo14750a(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE, (Object) "");
        }
        if (jSONObject != null) {
            p0Var.mo14750a("click_coordinates", (Object) jSONObject);
        }
        p0Var.mo14750a(FirebaseAnalytics.Param.LOCATION, (Object) this.f4460m);
        if (m4084m()) {
            p0Var.mo14750a("retarget_reinstall", (Object) Boolean.valueOf(m4082h()));
        }
        return p0Var;
    }
}
