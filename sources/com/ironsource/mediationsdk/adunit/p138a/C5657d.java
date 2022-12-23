package com.ironsource.mediationsdk.adunit.p138a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.p137a.C5634b;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.p137a.C5645g;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.a.d */
public final class C5657d {

    /* renamed from: a */
    public C5662g f13404a;

    /* renamed from: b */
    public C5663h f13405b;

    /* renamed from: c */
    public C5660e f13406c;

    /* renamed from: d */
    public C5654a f13407d;

    /* renamed from: e */
    public C5664i f13408e;

    /* renamed from: f */
    private final int f13409f = -1;

    /* renamed from: g */
    private IronSource.AD_UNIT f13410g;

    /* renamed from: h */
    private C5659b f13411h;

    /* renamed from: i */
    private C5656c f13412i;

    /* renamed from: j */
    private C5634b f13413j;

    /* renamed from: k */
    private Map<C5655b, C5658a> f13414k;

    /* renamed from: com.ironsource.mediationsdk.adunit.a.d$a */
    class C5658a {

        /* renamed from: a */
        int f13415a;

        /* renamed from: b */
        int f13416b;

        public C5658a(int i, int i2) {
            this.f13415a = i;
            this.f13416b = i2;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.adunit.a.d$b */
    public enum C5659b {
        MEDIATION,
        PROVIDER
    }

    public C5657d(IronSource.AD_UNIT ad_unit, C5659b bVar, C5656c cVar) {
        this.f13410g = ad_unit;
        this.f13411h = bVar;
        this.f13412i = cVar;
        this.f13413j = (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) || ad_unit.equals(IronSource.AD_UNIT.OFFERWALL)) ? C5645g.m13810e() : C5642d.m13798e();
        HashMap hashMap = new HashMap();
        this.f13414k = hashMap;
        hashMap.put(C5655b.INIT_STARTED, new C5658a(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        this.f13414k.put(C5655b.INIT_ENDED, new C5658a(IronSourceConstants.IS_MANAGER_INIT_ENDED, -1));
        this.f13414k.put(C5655b.SESSION_CAPPED, new C5658a(-1, IronSourceConstants.IS_CAP_SESSION));
        this.f13414k.put(C5655b.PLACEMENT_CAPPED, new C5658a(IronSourceConstants.IS_CAP_PLACEMENT, -1));
        this.f13414k.put(C5655b.AUCTION_REQUEST, new C5658a(2000, -1));
        this.f13414k.put(C5655b.AUCTION_SUCCESS, new C5658a(IronSourceConstants.IS_AUCTION_SUCCESS, -1));
        this.f13414k.put(C5655b.AUCTION_FAILED, new C5658a(IronSourceConstants.IS_AUCTION_FAILED, -1));
        this.f13414k.put(C5655b.AUCTION_REQUEST_WATERFALL, new C5658a(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1));
        this.f13414k.put(C5655b.AUCTION_RESULT_WATERFALL, new C5658a(IronSourceConstants.IS_RESULT_WATERFALL, -1));
        this.f13414k.put(C5655b.INIT_SUCCESS, new C5658a(-1, IronSourceConstants.IS_INSTANCE_INIT_SUCCESS));
        this.f13414k.put(C5655b.INIT_FAILED, new C5658a(-1, IronSourceConstants.IS_INSTANCE_INIT_FAILED));
        this.f13414k.put(C5655b.SHOW_AD_SUCCESS, new C5658a(-1, IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS));
        this.f13414k.put(C5655b.AD_OPENED, new C5658a(-1, 2005));
        this.f13414k.put(C5655b.AD_CLOSED, new C5658a(-1, IronSourceConstants.IS_INSTANCE_CLOSED));
        this.f13414k.put(C5655b.AD_CLICKED, new C5658a(-1, 2006));
        this.f13414k.put(C5655b.LOAD_AD, new C5658a(2001, 2002));
        this.f13414k.put(C5655b.LOAD_AD_SUCCESS, new C5658a(2004, 2003));
        this.f13414k.put(C5655b.LOAD_AD_FAILED, new C5658a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f13414k.put(C5655b.LOAD_AD_NO_FILL, new C5658a(-1, IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f13414k.put(C5655b.SHOW_AD, new C5658a(2100, IronSourceConstants.IS_INSTANCE_SHOW));
        this.f13414k.put(C5655b.SHOW_AD_FAILED, new C5658a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, IronSourceConstants.IS_INSTANCE_SHOW_FAILED));
        this.f13414k.put(C5655b.TROUBLESHOOT_NETWORK_ADAPTER_NOT_AVAILABLE, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_NETWORK_ADAPTER_NOT_AVAILABLE));
        this.f13414k.put(C5655b.TROUBLESHOOT_AD_ADAPTER_NOT_AVAILABLE, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE, IronSourceConstants.TROUBLESHOOTING_IS_AD_ADAPTER_NOT_AVAILABLE));
        this.f13414k.put(C5655b.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING));
        this.f13414k.put(C5655b.TROUBLESHOOT_BIDDING_DATA_MISSING, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING));
        this.f13414k.put(C5655b.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS));
        this.f13414k.put(C5655b.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED));
        this.f13414k.put(C5655b.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS));
        this.f13414k.put(C5655b.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED));
        this.f13414k.put(C5655b.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS));
        this.f13414k.put(C5655b.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED));
        this.f13414k.put(C5655b.TROUBLESHOOT_INTERNAL_ERROR, new C5658a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR));
        this.f13414k.put(C5655b.TROUBLESHOOT_ADAPTER_BRIDGE_INTERNAL_ERROR, new C5658a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_BRIDGE_INTERNAL_ERROR));
        this.f13414k.put(C5655b.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new C5658a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f13404a = new C5662g(this);
        this.f13405b = new C5663h(this);
        this.f13406c = new C5660e(this);
        this.f13407d = new C5654a(this);
        this.f13408e = new C5664i(this);
    }

    /* renamed from: a */
    private int m13842a(C5655b bVar) {
        try {
            if (!IronSource.AD_UNIT.INTERSTITIAL.equals(this.f13410g)) {
                return -1;
            }
            C5658a aVar = this.f13414k.get(bVar);
            return C5659b.MEDIATION.equals(this.f13411h) ? aVar.f13415a : aVar.f13416b;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41730a(C5655b bVar, Map<String, Object> map) {
        int a = m13842a(bVar);
        if (-1 != a) {
            if (map == null) {
                map = new HashMap<>();
            }
            C5656c cVar = this.f13412i;
            if (cVar != null) {
                map.putAll(cVar.mo41729a(bVar));
            }
            this.f13413j.mo41689b(new C5641c(a, new JSONObject(map)));
        }
    }
}
