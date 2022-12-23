package com.ironsource.mediationsdk.adunit.p139b;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5543A;
import com.ironsource.mediationsdk.C5685c;
import com.ironsource.mediationsdk.C5694f;
import com.ironsource.mediationsdk.C5695g;
import com.ironsource.mediationsdk.C5697h;
import com.ironsource.mediationsdk.C5736n;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p138a.C5655b;
import com.ironsource.mediationsdk.adunit.p138a.C5656c;
import com.ironsource.mediationsdk.adunit.p138a.C5657d;
import com.ironsource.mediationsdk.adunit.p138a.C5664i;
import com.ironsource.mediationsdk.adunit.p140c.C5674b;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p142c.C5688b;
import com.ironsource.mediationsdk.server.C5782b;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.C5796f;
import com.ironsource.mediationsdk.utils.C5801k;
import com.ironsource.mediationsdk.utils.C5802l;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.b.d */
public abstract class C5668d<Smash extends C5674b> implements C5656c, C5667c, C5694f {

    /* renamed from: a */
    protected C5695g f13431a;

    /* renamed from: b */
    protected C5697h f13432b;

    /* renamed from: c */
    protected String f13433c;

    /* renamed from: d */
    protected int f13434d;

    /* renamed from: e */
    protected String f13435e = "";

    /* renamed from: f */
    protected JSONObject f13436f;

    /* renamed from: g */
    protected C5802l f13437g;

    /* renamed from: h */
    protected C5665a f13438h;

    /* renamed from: i */
    protected C5657d f13439i;

    /* renamed from: j */
    public Set<ImpressionDataListener> f13440j = new HashSet();

    /* renamed from: k */
    private CopyOnWriteArrayList<Smash> f13441k;

    /* renamed from: l */
    private ConcurrentHashMap<String, C5782b> f13442l;

    /* renamed from: m */
    private ConcurrentHashMap<String, C5697h.C5698a> f13443m;

    /* renamed from: n */
    private C5782b f13444n;

    /* renamed from: o */
    private String f13445o;

    /* renamed from: p */
    private boolean f13446p = false;

    /* renamed from: q */
    private C5796f f13447q;

    /* renamed from: r */
    private C5796f f13448r;

    /* renamed from: s */
    private C5671a f13449s;

    /* renamed from: t */
    private C5666b f13450t;

    /* renamed from: u */
    private final Object f13451u = new Object();

    /* renamed from: com.ironsource.mediationsdk.adunit.b.d$a */
    public enum C5671a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public C5668d(C5665a aVar, Set<ImpressionDataListener> set) {
        C5796f fVar = new C5796f();
        this.f13438h = aVar;
        this.f13439i = new C5657d(aVar.f13422a, C5657d.C5659b.MEDIATION, this);
        this.f13450t = new C5666b(this.f13438h.f13422a);
        m13881a(C5671a.NONE);
        this.f13440j = set;
        this.f13439i.f13404a.mo41738a();
        this.f13441k = new CopyOnWriteArrayList<>();
        this.f13442l = new ConcurrentHashMap<>();
        this.f13443m = new ConcurrentHashMap<>();
        this.f13445o = "";
        C5736n.m14120a().f13807b = this.f13438h.f13428g;
        this.f13433c = "";
        this.f13436f = new JSONObject();
        if (this.f13438h.mo41775a()) {
            this.f13431a = new C5695g(this.f13438h.f13422a.toString(), this.f13438h.f13425d, this);
        }
        m13887a(this.f13438h.f13424c, this.f13438h.f13425d.f13918f);
        m13892e();
        m13893f();
        this.f13447q = new C5796f();
        m13881a(C5671a.READY_TO_LOAD);
        this.f13439i.f13404a.mo41739a(C5796f.m14320a(fVar));
    }

    /* renamed from: a */
    private String m13880a(List<C5782b> list) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo41788b("waterfall.size() = " + list.size()));
        m13897i();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            C5782b bVar = list.get(i);
            m13885a(bVar);
            sb.append(m13889b(bVar));
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        IronLog.INTERNAL.verbose(mo41788b("updateWaterfall() - next waterfall is " + sb.toString()));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13881a(C5671a aVar) {
        synchronized (this.f13451u) {
            this.f13449s = aVar;
        }
    }

    /* renamed from: a */
    private void m13884a(IronSourceError ironSourceError) {
        this.f13439i.f13407d.mo41723a(this.f13445o, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        this.f13450t.mo41776a(ironSourceError);
    }

    /* renamed from: a */
    private void m13885a(C5782b bVar) {
        IronLog.INTERNAL.verbose(mo41788b("item = " + bVar.mo42082a()));
        NetworkSettings a = this.f13438h.mo41774a(bVar.mo42082a());
        if (a != null) {
            BaseAdAdapter<?> b = C5685c.m13965a().mo41828b(a, this.f13438h.f13422a);
            if (b != null) {
                C5674b a2 = mo41784a(a, b, C5804m.m14360a().mo42137b(this.f13438h.f13422a));
                this.f13441k.add(a2);
                this.f13442l.put(a2.mo41606k(), bVar);
                this.f13443m.put(bVar.mo42082a(), C5697h.C5698a.ISAuctionPerformanceDidntAttemptToLoad);
                return;
            }
            String str = "addSmashToWaterfall - could not load ad adapter for " + a.getProviderInstanceName();
            IronLog.INTERNAL.error(mo41788b(str));
            this.f13439i.f13408e.mo41746b(str);
            return;
        }
        String str2 = "could not find matching provider settings for auction response item - item = " + bVar.mo42082a();
        IronLog.INTERNAL.error(mo41788b(str2));
        this.f13439i.f13408e.mo41747c(str2);
    }

    /* renamed from: a */
    private void m13886a(C5782b bVar, String str) {
        if (bVar != null) {
            ImpressionData a = bVar.mo42081a(str);
            if (a != null) {
                for (ImpressionDataListener next : this.f13440j) {
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info(mo41788b("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a));
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(mo41788b("no auctionResponseItem or listener"));
    }

    /* renamed from: a */
    private void m13887a(List<NetworkSettings> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f13432b = new C5697h(arrayList, i);
    }

    /* renamed from: a */
    private boolean m13888a(C5671a aVar, C5671a aVar2) {
        boolean z;
        synchronized (this.f13451u) {
            if (this.f13449s == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(mo41788b("set state from '" + this.f13449s + "' to '" + aVar2 + "'"));
                z = true;
                this.f13449s = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private static String m13889b(C5782b bVar) {
        Object[] objArr = new Object[2];
        objArr[0] = TextUtils.isEmpty(bVar.mo42083b()) ? "1" : "2";
        objArr[1] = bVar.mo42082a();
        return String.format("%s%s", objArr);
    }

    /* renamed from: c */
    private boolean m13890c() {
        boolean z;
        synchronized (this.f13451u) {
            z = this.f13449s == C5671a.LOADING;
        }
        return z;
    }

    /* renamed from: d */
    private boolean m13891d() {
        boolean z;
        synchronized (this.f13451u) {
            z = this.f13449s == C5671a.AUCTION;
        }
        return z;
    }

    /* renamed from: e */
    private void m13892e() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : this.f13438h.f13424c) {
            arrayList.add(new C5801k(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f13438h.f13422a)));
        }
        this.f13437g = new C5802l(arrayList);
    }

    /* renamed from: f */
    private void m13893f() {
        for (NetworkSettings next : this.f13438h.f13424c) {
            if (next.isIronSource() || next.isBidder(this.f13438h.f13422a)) {
                HashMap hashMap = new HashMap();
                hashMap.put(DataKeys.USER_ID, this.f13438h.f13423b);
                hashMap.putAll(C5688b.m13984a(next.getInterstitialSettings()));
                AdData adData = new AdData((String) null, hashMap);
                AdapterBaseInterface a = C5685c.m13965a().mo41825a(next, this.f13438h.f13422a);
                if (a != null) {
                    try {
                        a.init(adData, ContextProvider.getInstance().getApplicationContext(), (NetworkInitializationListener) null);
                    } catch (Exception e) {
                        C5664i iVar = this.f13439i.f13408e;
                        iVar.mo41745a("initNetworks - exception while calling networkAdapter.init - " + e);
                    }
                } else {
                    this.f13439i.f13408e.mo41745a("initNetworks - could not load network adapter");
                }
            }
        }
    }

    /* renamed from: f */
    private void m13894f(Smash smash) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo41788b("smash = " + smash.mo41801h()));
        String b = this.f13442l.get(smash.mo41606k()).mo42083b();
        smash.mo41795c(b);
        smash.mo41792a(b);
    }

    /* renamed from: g */
    private void m13895g() {
        IronLog.INTERNAL.verbose(mo41788b(""));
        List<C5782b> h = m13896h();
        this.f13433c = m13900l();
        m13880a(h);
    }

    /* renamed from: h */
    private List<C5782b> m13896h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings next : this.f13438h.f13424c) {
            C5801k kVar = new C5801k(next.getProviderInstanceName(), next.getMaxAdsPerSession(this.f13438h.f13422a));
            if (!next.isBidder(this.f13438h.f13422a) && !this.f13437g.mo42133b(kVar)) {
                copyOnWriteArrayList.add(new C5782b(kVar.mo41606k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: i */
    private void m13897i() {
        Iterator<Smash> it = this.f13441k.iterator();
        while (it.hasNext()) {
            ((C5674b) it.next()).mo41802i();
        }
        this.f13441k.clear();
    }

    /* renamed from: j */
    private void m13898j() {
        String str;
        StringBuilder sb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo41788b("mWaterfall.size() = " + this.f13441k.size()));
        m13881a(C5671a.LOADING);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.f13441k.size() || i2 >= this.f13438h.f13426e) {
                break;
            }
            C5674b bVar = (C5674b) this.f13441k.get(i);
            if (bVar.mo41797d()) {
                if (bVar.mo41796c() || bVar.mo41793a()) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("smash = " + bVar.mo41801h());
                } else if (!this.f13438h.f13427f || !bVar.mo41799f()) {
                    m13894f(bVar);
                } else if (i2 == 0) {
                    sb.append(bVar.mo41606k());
                    sb.append(". No other instances will be loaded at the same time.");
                    String sb2 = sb.toString();
                    IronLog.INTERNAL.verbose(mo41788b(sb2));
                    IronSourceUtils.sendAutomationLog(sb2);
                    m13894f(bVar);
                    i2++;
                } else {
                    sb = new StringBuilder("Advanced Loading: Won't start loading bidder ");
                    sb.append(bVar.mo41606k());
                    sb.append(" as a non bidder is being loaded");
                    String sb3 = sb.toString();
                    IronLog.INTERNAL.verbose(mo41788b(sb3));
                    IronSourceUtils.sendAutomationLog(sb3);
                }
                i2++;
            }
            i++;
        }
        if (i2 == 0) {
            m13881a(C5671a.READY_TO_LOAD);
            int i3 = IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW;
            if (this.f13441k.isEmpty()) {
                i3 = 1035;
                str = "Empty waterfall";
            } else {
                str = "Mediation No fill";
            }
            this.f13439i.f13405b.mo41743a(0, i3, str);
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.verbose(mo41788b("errorCode = " + i3 + ", errorReason = " + str));
            C5736n.m14120a().mo41990a(new IronSourceError(i3, str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m13899k() {
        IronLog.INTERNAL.verbose(mo41788b(""));
        AsyncTask.execute(new Runnable() {
            public final void run() {
                C5664i iVar;
                String str;
                C5668d.this.f13433c = "";
                C5668d.this.f13436f = new JSONObject();
                C5668d.this.f13439i.f13406c.mo41731a();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                for (NetworkSettings next : C5668d.this.f13438h.f13424c) {
                    if (!C5668d.this.f13437g.mo42133b(new C5801k(next.getProviderInstanceName(), next.getMaxAdsPerSession(C5668d.this.f13438h.f13422a)))) {
                        if (next.isBidder(C5668d.this.f13438h.f13422a)) {
                            AdapterBaseInterface a = C5685c.m13965a().mo41825a(next, C5668d.this.f13438h.f13422a);
                            if (a instanceof AdapterBidderInterface) {
                                try {
                                    Map<String, Object> biddingData = ((AdapterBidderInterface) a).getBiddingData(ContextProvider.getInstance().getApplicationContext());
                                    if (biddingData != null) {
                                        hashMap.put(next.getProviderInstanceName(), biddingData);
                                        sb.append(next.getInstanceType(C5668d.this.f13438h.f13422a) + next.getProviderInstanceName() + ",");
                                    } else {
                                        C5668d.this.f13439i.f13408e.mo41748d("missing bidding data for " + next.getProviderInstanceName());
                                    }
                                } catch (Exception e) {
                                    iVar = C5668d.this.f13439i.f13408e;
                                    str = "exception while calling networkAdapter.getBiddingData - " + e;
                                }
                            } else {
                                str = a == null ? "could not load network adapter" : "network adapter does not implementing AdapterBidderInterface";
                                iVar = C5668d.this.f13439i.f13408e;
                                iVar.mo41745a(str);
                            }
                        } else {
                            arrayList.add(next.getProviderInstanceName());
                            sb.append(next.getInstanceType(C5668d.this.f13438h.f13422a) + next.getProviderInstanceName() + ",");
                        }
                    }
                }
                IronLog.INTERNAL.verbose(C5668d.this.mo41788b("auction waterfallString = " + sb));
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    IronLog.INTERNAL.verbose(C5668d.this.mo41788b("auction failed - no candidates"));
                    C5668d.this.f13439i.f13406c.mo41733a(0, 1005, "No candidates available for auctioning");
                    C5736n.m14120a().mo41990a(new IronSourceError(1005, "No candidates available for auctioning"));
                    C5668d.this.f13439i.f13405b.mo41743a(0, 1005, "No candidates available for auctioning");
                    C5668d.this.m13881a(C5671a.READY_TO_LOAD);
                    return;
                }
                C5668d.this.f13439i.f13406c.mo41734a(sb.toString());
                if (C5668d.this.f13431a != null) {
                    C5668d.this.f13431a.mo41850a(ContextProvider.getInstance().getApplicationContext(), (Map<String, Object>) hashMap, (List<String>) arrayList, C5668d.this.f13432b, C5804m.m14360a().mo42137b(C5668d.this.f13438h.f13422a));
                } else {
                    IronLog.INTERNAL.error(C5668d.this.mo41788b("mAuctionHandler is null"));
                }
            }
        });
    }

    /* renamed from: l */
    private static String m13900l() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Smash mo41784a(NetworkSettings networkSettings, BaseAdAdapter<?> baseAdAdapter, int i);

    /* renamed from: a */
    public final Map<String, Object> mo41729a(C5655b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f13433c)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13433c);
        }
        JSONObject jSONObject = this.f13436f;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13436f);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C5804m.m14360a().mo42137b(this.f13438h.f13422a)));
        if (!(bVar == C5655b.LOAD_AD_SUCCESS || bVar == C5655b.LOAD_AD_FAILED || bVar == C5655b.AUCTION_SUCCESS || bVar == C5655b.AUCTION_FAILED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f13434d));
            if (!TextUtils.isEmpty(this.f13435e)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f13435e);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo41785a() {
        IronLog.INTERNAL.verbose(mo41788b(""));
        if (this.f13449s == C5671a.SHOWING) {
            IronLog.API.error(mo41788b("load cannot be invoked while showing an ad"));
            IronSourceError ironSourceError = new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "load cannot be invoked while showing an ad");
            C5666b bVar = this.f13450t;
            if (bVar.f13430a == IronSource.AD_UNIT.INTERSTITIAL) {
                C5543A.m13206a().mo41280a(ironSourceError);
                return;
            }
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + bVar.f13430a);
        } else if ((this.f13449s == C5671a.READY_TO_LOAD || this.f13449s == C5671a.READY_TO_SHOW) && !C5736n.m14120a().mo41991b()) {
            this.f13433c = "";
            this.f13445o = "";
            this.f13436f = new JSONObject();
            this.f13439i.f13405b.mo41740a();
            this.f13448r = new C5796f();
            if (this.f13438h.mo41775a()) {
                if (!this.f13443m.isEmpty()) {
                    this.f13432b.mo41855a(this.f13443m);
                    this.f13443m.clear();
                }
                IronLog.INTERNAL.verbose(mo41788b(""));
                m13881a(C5671a.AUCTION);
                long a = this.f13438h.f13425d.f13921i - C5796f.m14320a(this.f13447q);
                if (a > 0) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose(mo41788b("waiting before auction - timeToWaitBeforeAuction = " + a));
                    new Timer().schedule(new TimerTask() {
                        public final void run() {
                            C5668d.this.m13899k();
                        }
                    }, a);
                    return;
                }
                m13899k();
                return;
            }
            m13895g();
            m13898j();
        } else {
            IronLog.API.error(mo41788b("load is already in progress"));
        }
    }

    /* renamed from: a */
    public final void mo41398a(int i, String str, int i2, String str2, long j) {
        String str3 = "";
        IronLog.INTERNAL.verbose(mo41788b(str3));
        if (m13891d()) {
            String str4 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
            IronLog.INTERNAL.verbose(mo41788b(str4));
            StringBuilder sb = new StringBuilder();
            IronSource.AD_UNIT ad_unit = this.f13438h.f13422a;
            if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
                str3 = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
                str3 = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
            } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
                str3 = "BN";
            }
            sb.append(str3);
            sb.append(": ");
            sb.append(str4);
            IronSourceUtils.sendAutomationLog(sb.toString());
            this.f13434d = i2;
            this.f13435e = str2;
            this.f13436f = new JSONObject();
            m13895g();
            this.f13439i.f13406c.mo41733a(j, i, str);
            m13898j();
            return;
        }
        this.f13439i.f13408e.mo41752h("unexpected auction fail - error = " + i + ", " + str);
    }

    /* renamed from: a */
    public final void mo41777a(C5674b bVar) {
        IronLog.INTERNAL.verbose(mo41788b(bVar.mo41801h()));
        this.f13443m.put(bVar.mo41606k(), C5697h.C5698a.ISAuctionPerformanceLoadedSuccessfully);
        if (m13888a(C5671a.LOADING, C5671a.READY_TO_SHOW)) {
            C5666b bVar2 = this.f13450t;
            if (bVar2.f13430a == IronSource.AD_UNIT.INTERSTITIAL) {
                C5543A.m13206a().mo41282b();
            } else {
                IronLog.INTERNAL.warning("ad unit not supported - " + bVar2.f13430a);
            }
            this.f13439i.f13405b.mo41741a(C5796f.m14320a(this.f13448r));
            if (this.f13438h.mo41775a()) {
                C5782b bVar3 = this.f13442l.get(bVar.mo41606k());
                if (bVar3 != null) {
                    C5695g.m14020a(bVar3, bVar.mo41800g(), this.f13444n);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Smash> it = this.f13441k.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C5674b) it.next()).mo41606k());
                    }
                    C5695g.m14022a((ArrayList<String>) arrayList, this.f13442l, bVar.mo41800g(), this.f13444n, bVar3);
                    return;
                }
                String str = "winner instance missing from waterfall - " + bVar.mo41606k();
                IronLog.INTERNAL.verbose(mo41788b(str));
                this.f13439i.f13408e.mo41744a(1010, str);
                return;
            }
            return;
        }
        this.f13439i.f13408e.mo41753i("unexpected load success for smash - " + bVar.mo41801h());
    }

    /* renamed from: a */
    public final void mo41778a(IronSourceError ironSourceError, C5674b bVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo41788b(bVar.mo41801h() + " - error = " + ironSourceError));
        this.f13443m.put(bVar.mo41606k(), C5697h.C5698a.ISAuctionPerformanceFailedToLoad);
        if (m13890c()) {
            m13898j();
            return;
        }
        C5664i iVar = this.f13439i.f13408e;
        iVar.mo41754j("unexpected load failed for smash - " + bVar.mo41801h() + ", error - " + ironSourceError);
    }

    /* renamed from: a */
    public final void mo41786a(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo41788b("state = " + this.f13449s));
        this.f13445o = str;
        this.f13439i.f13407d.mo41722a(this.f13445o);
        IronSourceError ironSourceError = this.f13449s == C5671a.SHOWING ? new IronSourceError(1036, "can't show ad while an ad is already showing") : null;
        if (this.f13449s != C5671a.READY_TO_SHOW) {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while no ads are available");
        }
        if (str == null) {
            ironSourceError = new IronSourceError(1020, "empty default placement");
        }
        if (C5790c.m14286a(ContextProvider.getInstance().getApplicationContext(), str, this.f13438h.f13422a)) {
            ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + str + " is capped");
        }
        if (ironSourceError != null) {
            IronLog.API.error(mo41788b(ironSourceError.getErrorMessage()));
            m13884a(ironSourceError);
            return;
        }
        Iterator<Smash> it = this.f13441k.iterator();
        while (it.hasNext()) {
            C5674b bVar = (C5674b) it.next();
            if (bVar.mo41793a()) {
                String str2 = this.f13445o;
                m13881a(C5671a.SHOWING);
                bVar.mo41794b(str2);
                return;
            }
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose(mo41788b(bVar.mo41801h() + " - not ready to show"));
        }
        m13884a(ErrorBuilder.buildNoAdsToShowError(this.f13438h.f13422a.toString()));
    }

    /* renamed from: a */
    public final void mo41406a(List<C5782b> list, String str, C5782b bVar, JSONObject jSONObject, int i, long j) {
        IronLog.INTERNAL.verbose(mo41788b(""));
        if (m13891d()) {
            this.f13435e = "";
            this.f13433c = str;
            this.f13434d = i;
            this.f13444n = bVar;
            this.f13436f = jSONObject;
            this.f13439i.f13406c.mo41732a(j);
            this.f13439i.f13406c.mo41735b(m13880a(list));
            m13898j();
            return;
        }
        C5664i iVar = this.f13439i.f13408e;
        iVar.mo41751g("unexpected auction success for auctionId - " + str);
    }

    /* renamed from: a */
    public final void mo41787a(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo41788b("track = " + z));
        this.f13446p = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo41788b(String str) {
        String name = this.f13438h.f13422a.name();
        if (TextUtils.isEmpty(str)) {
            return name;
        }
        return name + " - " + str;
    }

    /* renamed from: b */
    public final void mo41779b(C5674b bVar) {
        IronLog.INTERNAL.verbose(mo41788b(bVar.mo41801h()));
        C5666b bVar2 = this.f13450t;
        if (bVar2.f13430a == IronSource.AD_UNIT.INTERSTITIAL) {
            C5543A.m13206a().mo41287f();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar2.f13430a);
    }

    /* renamed from: b */
    public final void mo41780b(IronSourceError ironSourceError, C5674b bVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo41788b(bVar.mo41801h() + " - error = " + ironSourceError));
        this.f13443m.put(bVar.mo41606k(), C5697h.C5698a.ISAuctionPerformanceFailedToShow);
        m13881a(C5671a.READY_TO_LOAD);
        m13884a(ironSourceError);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext()) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r0 = r4.f13441k.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (((com.ironsource.mediationsdk.adunit.p140c.C5674b) r0.next()).mo41793a() == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (r4.f13446p == false) goto L_0x0020;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41789b() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f13451u
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.b.d$a r1 = r4.f13449s     // Catch:{ all -> 0x003b }
            com.ironsource.mediationsdk.adunit.b.d$a r2 = com.ironsource.mediationsdk.adunit.p139b.C5668d.C5671a.READY_TO_SHOW     // Catch:{ all -> 0x003b }
            r3 = 0
            if (r1 == r2) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return r3
        L_0x000c:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            boolean r0 = r4.f13446p
            if (r0 == 0) goto L_0x0020
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)
            if (r0 != 0) goto L_0x0020
            return r3
        L_0x0020:
            java.util.concurrent.CopyOnWriteArrayList<Smash> r0 = r4.f13441k
            java.util.Iterator r0 = r0.iterator()
        L_0x0026:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.adunit.c.b r1 = (com.ironsource.mediationsdk.adunit.p140c.C5674b) r1
            boolean r1 = r1.mo41793a()
            if (r1 == 0) goto L_0x0026
            r0 = 1
            return r0
        L_0x003a:
            return r3
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p139b.C5668d.mo41789b():boolean");
    }

    /* renamed from: c */
    public final void mo41781c(C5674b bVar) {
        IronLog.INTERNAL.verbose(mo41788b(bVar.mo41801h()));
        C5666b bVar2 = this.f13450t;
        if (bVar2.f13430a == IronSource.AD_UNIT.INTERSTITIAL) {
            C5543A.m13206a().mo41286e();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar2.f13430a);
    }

    /* renamed from: d */
    public final void mo41782d(C5674b bVar) {
        IronLog.INTERNAL.verbose(mo41788b(bVar.mo41801h()));
        this.f13437g.mo42131a(bVar);
        if (this.f13437g.mo42133b(bVar)) {
            IronLog.INTERNAL.verbose(mo41788b(bVar.mo41606k() + " was session capped"));
            bVar.mo41798e();
            IronSourceUtils.sendAutomationLog(bVar.mo41606k() + " was session capped");
        }
        C5790c.m14289b(ContextProvider.getInstance().getApplicationContext(), this.f13445o, this.f13438h.f13422a);
        if (C5790c.m14286a(ContextProvider.getInstance().getApplicationContext(), this.f13445o, this.f13438h.f13422a)) {
            IronLog.INTERNAL.verbose(mo41788b("placement " + this.f13445o + " is capped"));
            this.f13439i.f13407d.mo41728f(this.f13445o);
        }
        C5666b bVar2 = this.f13450t;
        if (bVar2.f13430a == IronSource.AD_UNIT.INTERSTITIAL) {
            C5543A.m13206a().mo41284c();
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + bVar2.f13430a);
        }
        C5804m.m14360a().mo42135a(this.f13438h.f13422a);
        if (this.f13438h.mo41775a()) {
            C5782b bVar3 = this.f13442l.get(bVar.mo41606k());
            if (bVar3 != null) {
                C5695g.m14021a(bVar3, bVar.mo41800g(), this.f13444n, this.f13445o);
                this.f13443m.put(bVar.mo41606k(), C5697h.C5698a.ISAuctionPerformanceShowedSuccessfully);
                m13886a(bVar3, this.f13445o);
                return;
            }
            String str = "showing instance missing from waterfall - " + bVar.mo41606k();
            IronLog.INTERNAL.verbose(mo41788b(str));
            this.f13439i.f13408e.mo41744a(1011, str);
        }
    }

    /* renamed from: e */
    public final void mo41783e(C5674b bVar) {
        IronLog.INTERNAL.verbose(mo41788b(bVar.mo41801h()));
        m13881a(C5671a.READY_TO_LOAD);
        C5666b bVar2 = this.f13450t;
        if (bVar2.f13430a == IronSource.AD_UNIT.INTERSTITIAL) {
            C5543A.m13206a().mo41285d();
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar2.f13430a);
    }
}
