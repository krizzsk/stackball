package com.applovin.impl.mediation.p020b;

import android.os.SystemClock;
import com.applovin.impl.mediation.C1264i;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p023a.C1342c;
import com.applovin.impl.sdk.p025b.C1368b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.c */
public class C1225c extends C1223a {

    /* renamed from: c */
    private String f2359c;

    /* renamed from: d */
    private final AtomicReference<C1342c> f2360d;

    /* renamed from: e */
    private final AtomicBoolean f2361e;

    private C1225c(C1225c cVar, C1264i iVar) {
        super(cVar.mo12335G(), cVar.mo12334F(), iVar, cVar.f2363b);
        this.f2360d = cVar.f2360d;
        this.f2361e = cVar.f2361e;
    }

    public C1225c(JSONObject jSONObject, JSONObject jSONObject2, C1469j jVar) {
        super(jSONObject, jSONObject2, (C1264i) null, jVar);
        this.f2360d = new AtomicReference<>();
        this.f2361e = new AtomicBoolean();
    }

    /* renamed from: A */
    public C1342c mo12313A() {
        return this.f2360d.getAndSet((Object) null);
    }

    /* renamed from: B */
    public boolean mo12314B() {
        return mo12360b("show_nia", Boolean.valueOf(mo12353a("show_nia", (Boolean) false)));
    }

    /* renamed from: C */
    public String mo12315C() {
        return mo12356b("nia_title", mo12348a("nia_title", ""));
    }

    /* renamed from: D */
    public String mo12316D() {
        return mo12356b("nia_message", mo12348a("nia_message", ""));
    }

    /* renamed from: E */
    public String mo12317E() {
        return mo12356b("nia_button_title", mo12348a("nia_button_title", ""));
    }

    /* renamed from: a */
    public C1223a mo12283a(C1264i iVar) {
        return new C1225c(this, iVar);
    }

    /* renamed from: a */
    public void mo12318a(C1342c cVar) {
        this.f2360d.set(cVar);
    }

    /* renamed from: a */
    public void mo12319a(String str) {
        this.f2359c = str;
    }

    /* renamed from: l */
    public boolean mo12299l() {
        return mo12360b("fa", (Boolean) false);
    }

    /* renamed from: m */
    public long mo12320m() {
        return mo12355b("ifacd_ms", -1);
    }

    /* renamed from: n */
    public long mo12321n() {
        return mo12355b("fard_ms", TimeUnit.HOURS.toMillis(1));
    }

    /* renamed from: o */
    public String mo12322o() {
        return this.f2359c;
    }

    /* renamed from: p */
    public long mo12323p() {
        long b = mo12355b("ad_expiration_ms", -1);
        return b >= 0 ? b : mo12347a("ad_expiration_ms", ((Long) this.f2363b.mo13088a(C1368b.f2810F)).longValue());
    }

    /* renamed from: q */
    public long mo12324q() {
        long b = mo12355b("ad_hidden_timeout_ms", -1);
        return b >= 0 ? b : mo12347a("ad_hidden_timeout_ms", ((Long) this.f2363b.mo13088a(C1368b.f2812H)).longValue());
    }

    /* renamed from: r */
    public boolean mo12325r() {
        if (mo12360b("schedule_ad_hidden_on_ad_dismiss", (Boolean) false)) {
            return true;
        }
        return mo12353a("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.f2363b.mo13088a(C1368b.f2813I));
    }

    /* renamed from: s */
    public long mo12326s() {
        long b = mo12355b("ad_hidden_on_ad_dismiss_callback_delay_ms", -1);
        return b >= 0 ? b : mo12347a("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.f2363b.mo13088a(C1368b.f2814J)).longValue());
    }

    /* renamed from: t */
    public long mo12327t() {
        if (mo12294h() > 0) {
            return SystemClock.elapsedRealtime() - mo12294h();
        }
        return -1;
    }

    /* renamed from: u */
    public long mo12328u() {
        long b = mo12355b("fullscreen_display_delay_ms", -1);
        return b >= 0 ? b : ((Long) this.f2363b.mo13088a(C1368b.f2846y)).longValue();
    }

    /* renamed from: v */
    public long mo12329v() {
        return mo12355b("ahdm", ((Long) this.f2363b.mo13088a(C1368b.f2847z)).longValue());
    }

    /* renamed from: w */
    public String mo12330w() {
        return mo12356b("bcode", "");
    }

    /* renamed from: x */
    public String mo12331x() {
        return mo12348a("mcode", "");
    }

    /* renamed from: y */
    public boolean mo12332y() {
        return this.f2361e.get();
    }

    /* renamed from: z */
    public void mo12333z() {
        this.f2361e.set(true);
    }
}
