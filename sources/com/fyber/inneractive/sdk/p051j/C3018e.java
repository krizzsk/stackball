package com.fyber.inneractive.sdk.p051j;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.p039dv.C2896g;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.j.e */
public abstract class C3018e {

    /* renamed from: A */
    public int f7395A = -1;

    /* renamed from: B */
    public Exception f7396B;

    /* renamed from: C */
    public String f7397C;

    /* renamed from: a */
    private final long f7398a = 20;

    /* renamed from: b */
    public long f7399b;

    /* renamed from: c */
    public long f7400c;

    /* renamed from: d */
    public long f7401d;

    /* renamed from: e */
    public String f7402e;

    /* renamed from: f */
    String f7403f;

    /* renamed from: g */
    public int f7404g;

    /* renamed from: h */
    public int f7405h;

    /* renamed from: i */
    public int f7406i;

    /* renamed from: j */
    public String f7407j;

    /* renamed from: k */
    String f7408k;

    /* renamed from: l */
    public String f7409l;

    /* renamed from: m */
    public String f7410m;

    /* renamed from: n */
    public String f7411n;

    /* renamed from: o */
    public String f7412o;

    /* renamed from: p */
    public String f7413p;

    /* renamed from: q */
    String f7414q;

    /* renamed from: r */
    public UnitDisplayType f7415r;

    /* renamed from: s */
    boolean f7416s = false;

    /* renamed from: t */
    public String f7417t;

    /* renamed from: u */
    public Map<String, String> f7418u;

    /* renamed from: v */
    public ImpressionData f7419v;

    /* renamed from: w */
    protected C2896g f7420w;

    /* renamed from: x */
    public int f7421x = 0;

    /* renamed from: y */
    public float f7422y = -1.0f;

    /* renamed from: z */
    public String f7423z;

    /* renamed from: a */
    public abstract InneractiveErrorCode mo18270a();

    /* renamed from: a */
    public abstract InneractiveErrorCode mo18271a(InneractiveAdRequest inneractiveAdRequest, C2767s sVar);

    /* renamed from: b */
    public final Long mo18498b() {
        ImpressionData impressionData = this.f7419v;
        if (impressionData != null) {
            return impressionData.getDemandId();
        }
        return null;
    }

    /* renamed from: c */
    public final String mo18499c() {
        ImpressionData impressionData = this.f7419v;
        if (impressionData != null) {
            return impressionData.getAdvertiserDomain();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo18497a(C2896g gVar) {
        this.f7420w = gVar;
    }

    /* renamed from: e */
    public final C2896g mo18501e() {
        return this.f7420w;
    }

    /* renamed from: d */
    public final boolean mo18500d() {
        return this.f7399b < System.currentTimeMillis();
    }
}
