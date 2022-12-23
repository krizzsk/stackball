package com.applovin.impl.mediation.p020b;

import android.view.View;
import com.applovin.impl.mediation.C1264i;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.b.b */
public class C1224b extends C1223a {
    private C1224b(C1224b bVar, C1264i iVar) {
        super(bVar.mo12335G(), bVar.mo12334F(), iVar, bVar.f2363b);
    }

    public C1224b(JSONObject jSONObject, JSONObject jSONObject2, C1469j jVar) {
        super(jSONObject, jSONObject2, (C1264i) null, jVar);
    }

    /* renamed from: a */
    public C1223a mo12283a(C1264i iVar) {
        return new C1224b(this, iVar);
    }

    /* renamed from: l */
    public int mo12299l() {
        int b = mo12354b("ad_view_width", -2);
        if (b != -2) {
            return b;
        }
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            return 320;
        }
        if (format == MaxAdFormat.LEADER) {
            return 728;
        }
        if (format == MaxAdFormat.MREC) {
            return AppLovinAdSize.MREC.getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* renamed from: m */
    public int mo12300m() {
        AppLovinAdSize appLovinAdSize;
        int b = mo12354b("ad_view_height", -2);
        if (b != -2) {
            return b;
        }
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        } else if (format == MaxAdFormat.LEADER) {
            appLovinAdSize = AppLovinAdSize.LEADER;
        } else if (format == MaxAdFormat.MREC) {
            appLovinAdSize = AppLovinAdSize.MREC;
        } else {
            throw new IllegalStateException("Invalid ad format");
        }
        return appLovinAdSize.getHeight();
    }

    /* renamed from: n */
    public View mo12301n() {
        if (!mo12284a() || this.f2357a == null) {
            return null;
        }
        View a = this.f2357a.mo12417a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Ad-view based ad is missing an ad view");
    }

    /* renamed from: o */
    public long mo12302o() {
        return mo12355b("viewability_imp_delay_ms", ((Long) this.f2363b.mo13088a(C1369c.f2989ca)).longValue());
    }

    /* renamed from: p */
    public int mo12303p() {
        return mo12354b("viewability_min_width", ((Integer) this.f2363b.mo13088a(getFormat() == MaxAdFormat.BANNER ? C1369c.f2990cb : getFormat() == MaxAdFormat.MREC ? C1369c.f2992cd : C1369c.f2994cf)).intValue());
    }

    /* renamed from: q */
    public int mo12304q() {
        return mo12354b("viewability_min_height", ((Integer) this.f2363b.mo13088a(getFormat() == MaxAdFormat.BANNER ? C1369c.f2991cc : getFormat() == MaxAdFormat.MREC ? C1369c.f2993ce : C1369c.f2995cg)).intValue());
    }

    /* renamed from: r */
    public float mo12305r() {
        return mo12345a("viewability_min_alpha", ((Float) this.f2363b.mo13088a(C1368b.f2996ch)).floatValue() / 100.0f);
    }

    /* renamed from: s */
    public int mo12306s() {
        return mo12354b("viewability_min_pixels", -1);
    }

    /* renamed from: t */
    public boolean mo12307t() {
        return mo12306s() >= 0;
    }

    /* renamed from: u */
    public long mo12308u() {
        return mo12355b("viewability_timer_min_visible_ms", ((Long) this.f2363b.mo13088a(C1368b.f2997ci)).longValue());
    }

    /* renamed from: v */
    public boolean mo12309v() {
        return mo12310w() >= 0;
    }

    /* renamed from: w */
    public long mo12310w() {
        long b = mo12355b("ad_refresh_ms", -1);
        return b >= 0 ? b : mo12347a("ad_refresh_ms", ((Long) this.f2363b.mo13088a(C1368b.f2837p)).longValue());
    }

    /* renamed from: x */
    public boolean mo12311x() {
        return mo12360b("proe", (Boolean) this.f2363b.mo13088a(C1368b.f2815K));
    }

    /* renamed from: y */
    public long mo12312y() {
        return C1557r.m3632f(mo12356b("bg_color", (String) null));
    }
}
