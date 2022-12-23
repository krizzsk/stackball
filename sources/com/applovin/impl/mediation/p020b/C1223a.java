package com.applovin.impl.mediation.p020b;

import android.os.SystemClock;
import com.applovin.impl.mediation.C1264i;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.a */
public abstract class C1223a extends C1227e implements MaxAd {

    /* renamed from: a */
    protected C1264i f2357a;

    /* renamed from: c */
    private final AtomicBoolean f2358c = new AtomicBoolean();

    protected C1223a(JSONObject jSONObject, JSONObject jSONObject2, C1264i iVar, C1469j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f2357a = iVar;
    }

    /* renamed from: l */
    private long mo12299l() {
        return mo12355b("load_started_time_ms", 0);
    }

    /* renamed from: a */
    public abstract C1223a mo12283a(C1264i iVar);

    /* renamed from: a */
    public boolean mo12284a() {
        C1264i iVar = this.f2357a;
        return iVar != null && iVar.mo12424c() && this.f2357a.mo12425d();
    }

    /* renamed from: b */
    public String mo12285b() {
        return mo12348a("event_id", "");
    }

    /* renamed from: c */
    public C1264i mo12286c() {
        return this.f2357a;
    }

    /* renamed from: d */
    public String mo12287d() {
        return mo12356b("bid_response", (String) null);
    }

    /* renamed from: e */
    public String mo12288e() {
        return mo12356b("third_party_ad_placement_id", (String) null);
    }

    /* renamed from: f */
    public long mo12289f() {
        if (mo12299l() > 0) {
            return mo12294h() - mo12299l();
        }
        return -1;
    }

    /* renamed from: g */
    public void mo12290g() {
        mo12362c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public String getAdUnitId() {
        return mo12348a("ad_unit_id", "");
    }

    public MaxAdFormat getFormat() {
        return C1557r.m3624c(mo12348a("ad_format", (String) null));
    }

    public String getNetworkName() {
        return mo12356b("network_name", "");
    }

    /* renamed from: h */
    public long mo12294h() {
        return mo12355b("load_completed_time_ms", 0);
    }

    /* renamed from: i */
    public void mo12295i() {
        mo12362c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    /* renamed from: j */
    public AtomicBoolean mo12296j() {
        return this.f2358c;
    }

    /* renamed from: k */
    public void mo12297k() {
        this.f2357a = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{thirdPartyAdPlacementId=" + mo12288e() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + '}';
    }
}
