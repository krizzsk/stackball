package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5697h;
import com.ironsource.mediationsdk.C5710l;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C5724h;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.p141b.C5681b;
import com.ironsource.mediationsdk.p142c.C5688b;
import com.ironsource.mediationsdk.server.C5782b;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.C5796f;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p243my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.L */
public final class C5579L extends C5716m implements C5586M, C5681b.C5682a, C5694f {

    /* renamed from: a */
    C5688b f13016a;

    /* renamed from: b */
    C5681b f13017b;

    /* renamed from: c */
    IronSourceBannerLayout f13018c;

    /* renamed from: d */
    C5724h f13019d;

    /* renamed from: e */
    C5587N f13020e;

    /* renamed from: f */
    int f13021f;

    /* renamed from: g */
    final ConcurrentHashMap<String, C5587N> f13022g;

    /* renamed from: h */
    C5695g f13023h;

    /* renamed from: i */
    C5697h f13024i;

    /* renamed from: j */
    ConcurrentHashMap<String, C5697h.C5698a> f13025j;

    /* renamed from: k */
    long f13026k;

    /* renamed from: l */
    private C5585a f13027l = C5585a.NONE;

    /* renamed from: m */
    private int f13028m;

    /* renamed from: n */
    private CopyOnWriteArrayList<C5587N> f13029n;

    /* renamed from: o */
    private String f13030o;

    /* renamed from: p */
    private JSONObject f13031p;

    /* renamed from: q */
    private String f13032q = "";

    /* renamed from: r */
    private int f13033r;

    /* renamed from: s */
    private C5782b f13034s;

    /* renamed from: t */
    private ConcurrentHashMap<String, C5782b> f13035t;

    /* renamed from: u */
    private final Object f13036u = new Object();

    /* renamed from: v */
    private C5796f f13037v;

    /* renamed from: com.ironsource.mediationsdk.L$a */
    enum C5585a {
        NONE,
        READY_TO_LOAD,
        STARTED_LOADING,
        FIRST_AUCTION,
        AUCTION,
        LOADING,
        RELOADING,
        LOADED
    }

    public C5579L(List<NetworkSettings> list, C5688b bVar, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("isAuctionEnabled = " + bVar.mo41832c());
        this.f13016a = bVar;
        this.f13017b = new C5681b(bVar.mo41836g());
        this.f13022g = new ConcurrentHashMap<>();
        this.f13029n = new CopyOnWriteArrayList<>();
        this.f13035t = new ConcurrentHashMap<>();
        this.f13025j = new ConcurrentHashMap<>();
        this.f13021f = C5804m.m14360a().mo42136b(3);
        C5699i.m14030a().f13589a = this.f13016a.mo41834e();
        if (this.f13016a.mo41832c()) {
            this.f13023h = new C5695g(AdFormat.BANNER, this.f13016a.mo41837h(), this);
        }
        m13447a(list);
        m13450b(list);
        this.f13026k = new Date().getTime();
        mo41520a(C5585a.READY_TO_LOAD);
    }

    /* renamed from: a */
    static /* synthetic */ ISBannerSize m13442a(C5579L l) {
        IronSourceBannerLayout ironSourceBannerLayout = l.f13018c;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.getSize() == null) {
            return null;
        }
        return l.f13018c.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getCurrentActiveActivity()) ? ISBannerSize.f12971a : ISBannerSize.BANNER : l.f13018c.getSize();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13443a(int i, Object[][] objArr) {
        mo41518a(i, objArr, this.f13021f);
    }

    /* renamed from: a */
    private void m13446a(C5587N n, C5782b bVar) {
        C5695g.m14021a(bVar, n.mo41604i(), this.f13034s, mo41530e());
        mo41914a(this.f13035t.get(n.mo41606k()), mo41530e());
    }

    /* renamed from: a */
    private void m13447a(List<NetworkSettings> list) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings providerName : list) {
            arrayList.add(providerName.getProviderName());
        }
        this.f13024i = new C5697h(arrayList, this.f13016a.mo41837h().f13918f);
    }

    /* renamed from: a */
    private static void m13448a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c == 4) {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13449a(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("current state = " + this.f13027l);
        if (mo41524a(C5585a.STARTED_LOADING, this.f13016a.mo41832c() ? z ? C5585a.AUCTION : C5585a.FIRST_AUCTION : z ? C5585a.RELOADING : C5585a.LOADING)) {
            this.f13037v = new C5796f();
            this.f13030o = "";
            this.f13031p = null;
            this.f13028m = 0;
            this.f13021f = C5804m.m14360a().mo42136b(3);
            m13443a(z ? IronSourceConstants.BN_RELOAD : 3001, (Object[][]) null);
            if (this.f13016a.mo41832c()) {
                mo41528d();
                return;
            }
            m13455g();
            m13453f();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.error("wrong state - " + this.f13027l);
    }

    /* renamed from: b */
    private void m13450b(List<NetworkSettings> list) {
        for (int i = 0; i < list.size(); i++) {
            NetworkSettings networkSettings = list.get(i);
            AbstractAdapter a = C5685c.m13965a().mo41824a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a != null) {
                C5587N n = new C5587N(this.f13016a, this, networkSettings, a, this.f13021f, m13462n());
                this.f13022g.put(n.mo41606k(), n);
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(networkSettings.getProviderInstanceName() + " can't load adapter");
            }
        }
    }

    /* renamed from: b */
    private static boolean m13451b(int i) {
        return i == 3201 || i == 3110 || i == 3111 || i == 3116 || i == 3119 || i == 3112 || i == 3115 || i == 3501 || i == 3502;
    }

    /* renamed from: c */
    private String m13452c(List<C5782b> list) {
        int i;
        int i2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("waterfall.size() = " + list.size());
        this.f13029n.clear();
        this.f13035t.clear();
        this.f13025j.clear();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < list.size()) {
            C5782b bVar = list.get(i3);
            C5587N n = this.f13022g.get(bVar.mo42082a());
            if (n != null) {
                AbstractAdapter a = C5685c.m13965a().mo41823a(n.f13193d.f13706a);
                if (a != null) {
                    C5688b bVar2 = this.f13016a;
                    NetworkSettings networkSettings = n.f13193d.f13706a;
                    int i4 = this.f13021f;
                    String str = this.f13030o;
                    JSONObject jSONObject = this.f13031p;
                    int i5 = this.f13033r;
                    C5587N n2 = r0;
                    String str2 = this.f13032q;
                    i = i3;
                    i2 = 1;
                    C5587N n3 = new C5587N(bVar2, this, networkSettings, a, i4, str, jSONObject, i5, str2, m13462n());
                    n2.f13194e = true;
                    this.f13029n.add(n2);
                    this.f13035t.put(n2.mo41606k(), bVar);
                    this.f13025j.put(bVar.mo42082a(), C5697h.C5698a.ISAuctionPerformanceDidntAttemptToLoad);
                } else {
                    i = i3;
                    i2 = 1;
                }
            } else {
                i = i3;
                i2 = 1;
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("could not find matching smash for auction response item - item = " + bVar.mo42082a());
            }
            C5587N n4 = this.f13022g.get(bVar.mo42082a());
            String str3 = "1";
            if (n4 == null ? !TextUtils.isEmpty(bVar.mo42083b()) : n4.mo41603h()) {
                str3 = "2";
            }
            sb.append(str3 + bVar.mo42082a());
            int i6 = i;
            if (i6 != list.size() - i2) {
                sb.append(",");
            }
            i3 = i6 + 1;
        }
        IronLog.INTERNAL.verbose("updateWaterfall() - next waterfall is " + sb.toString());
        return sb.toString();
    }

    /* renamed from: f */
    private void m13453f() {
        int i = this.f13028m;
        while (true) {
            String str = null;
            if (i < this.f13029n.size()) {
                C5587N n = this.f13029n.get(i);
                if (n.f13194e) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("loading smash - " + n.mo41611p());
                    this.f13028m = i + 1;
                    if (n.mo41603h()) {
                        str = this.f13035t.get(n.mo41606k()).mo42083b();
                        n.mo41602b(str);
                    }
                    n.mo41538a(this.f13018c.mo41462a(), this.f13019d, str);
                    return;
                }
                i++;
            } else {
                String str2 = this.f13029n.isEmpty() ? "Empty waterfall" : "Mediation No fill";
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.verbose("errorReason = " + str2);
                m13454f((C5587N) null);
                if (mo41524a(C5585a.LOADING, C5585a.READY_TO_LOAD)) {
                    m13443a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13037v))}});
                    C5699i.m14030a().mo41856a(this.f13018c, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, str2));
                    return;
                } else if (mo41524a(C5585a.RELOADING, C5585a.LOADED)) {
                    m13443a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13037v))}});
                    this.f13017b.mo41819a(this);
                    return;
                } else {
                    mo41520a(C5585a.READY_TO_LOAD);
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("wrong state = " + this.f13027l);
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m13454f(C5587N n) {
        Iterator<C5587N> it = this.f13029n.iterator();
        while (it.hasNext()) {
            C5587N next = it.next();
            if (!next.equals(n)) {
                next.mo41541d();
            }
        }
    }

    /* renamed from: g */
    private void m13455g() {
        List<C5782b> h = m13456h();
        this.f13030o = m14099b();
        m13452c(h);
    }

    /* renamed from: h */
    private List<C5782b> m13456h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C5587N next : this.f13022g.values()) {
            if (!next.mo41603h() && !C5790c.m14291b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), mo41530e())) {
                copyOnWriteArrayList.add(new C5782b(next.mo41606k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: i */
    private boolean m13457i() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f13018c;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: j */
    private ISBannerSize m13458j() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f13018c;
        if (ironSourceBannerLayout != null) {
            return ironSourceBannerLayout.getSize();
        }
        return null;
    }

    /* renamed from: k */
    private boolean m13459k() {
        boolean z;
        synchronized (this.f13036u) {
            if (this.f13027l != C5585a.LOADING) {
                if (this.f13027l != C5585a.RELOADING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: l */
    private boolean m13460l() {
        boolean z;
        synchronized (this.f13036u) {
            if (this.f13027l != C5585a.FIRST_AUCTION) {
                if (this.f13027l != C5585a.AUCTION) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: m */
    private boolean m13461m() {
        boolean z;
        synchronized (this.f13036u) {
            z = this.f13027l == C5585a.LOADED;
        }
        return z;
    }

    /* renamed from: n */
    private boolean m13462n() {
        return this.f13027l == C5585a.RELOADING || this.f13027l == C5585a.AUCTION;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41517a(int i) {
        m13443a(i, (Object[][]) null);
    }

    /* renamed from: a */
    public final void mo41398a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        IronLog.INTERNAL.verbose(str3);
        IronSourceUtils.sendAutomationLog("BN: " + str3);
        if (m13460l()) {
            this.f13032q = str2;
            this.f13033r = i2;
            this.f13031p = null;
            m13455g();
            m13443a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}});
            mo41520a(this.f13027l == C5585a.FIRST_AUCTION ? C5585a.LOADING : C5585a.RELOADING);
            m13453f();
            return;
        }
        IronLog.INTERNAL.warning("wrong state - mCurrentState = " + this.f13027l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41518a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        try {
            ISBannerSize j = m13458j();
            if (j != null) {
                m13448a(mediationAdditionalData, j);
            }
            if (this.f13019d != null) {
                mediationAdditionalData.put("placement", mo41530e());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (!TextUtils.isEmpty(this.f13030o)) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13030o);
            }
            if (this.f13031p != null && this.f13031p.length() > 0) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13031p);
            }
            if (m13451b(i)) {
                mediationAdditionalData.put(IronSourceConstants.AUCTION_TRIALS, this.f13033r);
                if (!TextUtils.isEmpty(this.f13032q)) {
                    mediationAdditionalData.put(IronSourceConstants.AUCTION_FALLBACK, this.f13032q);
                }
            }
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
        C5642d.m13798e().mo41689b(new C5641c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    public final void mo41519a(final IronSourceBannerLayout ironSourceBannerLayout, final C5724h hVar) {
        IronLog.INTERNAL.verbose("");
        if (!mo41524a(C5585a.READY_TO_LOAD, C5585a.STARTED_LOADING)) {
            IronLog.API.error("can't load banner - loadBanner already called and still in progress");
        } else if (!C5699i.m14030a().mo41858b()) {
            C5710l.m14086a(ironSourceBannerLayout, hVar, (C5710l.C5712b) new C5710l.C5712b() {
                /* renamed from: a */
                public final void mo41532a() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("placement = " + hVar.getPlacementName());
                    C5579L.this.f13018c = ironSourceBannerLayout;
                    C5579L.this.f13019d = hVar;
                    if (C5790c.m14291b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), hVar.getPlacementName())) {
                        IronLog.INTERNAL.verbose("placement is capped");
                        C5699i a = C5699i.m14030a();
                        IronSourceBannerLayout ironSourceBannerLayout = ironSourceBannerLayout;
                        a.mo41856a(ironSourceBannerLayout, new IronSourceError(604, "placement " + hVar.getPlacementName() + " is capped"));
                        C5579L.this.m13443a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                        C5579L.this.mo41520a(C5585a.READY_TO_LOAD);
                        return;
                    }
                    C5579L.this.m13449a(false);
                }

                /* renamed from: a */
                public final void mo41533a(String str) {
                    IronLog ironLog = IronLog.API;
                    ironLog.error("can't load banner - errorMessage = " + str);
                }
            });
        } else {
            IronLog.INTERNAL.verbose("can't load banner - already has pending invocation");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41520a(C5585a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("from '" + this.f13027l + "' to '" + aVar + "'");
        synchronized (this.f13036u) {
            this.f13027l = aVar;
        }
    }

    /* renamed from: a */
    public final void mo41521a(C5587N n) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(n.mo41611p());
        if (m13457i()) {
            this.f13018c.mo41467c();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo41518a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, n.mo41608m());
    }

    /* renamed from: a */
    public final void mo41522a(C5587N n, View view, FrameLayout.LayoutParams layoutParams) {
        C5587N n2 = n;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + n.mo41611p());
        if (n2.f13056a != this.f13030o) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + n2.f13056a + " and the current id is " + this.f13030o);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            n2.mo41537a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction id " + n2.f13056a + " State - " + this.f13027l}, new Object[]{IronSourceConstants.EVENTS_EXT1, n.mo41606k()}});
        } else if (m13459k()) {
            C5587N n3 = this.f13020e;
            if (n3 != null) {
                n3.mo41541d();
            }
            m13454f(n);
            this.f13020e = n2;
            this.f13018c.mo41463a(view, layoutParams);
            this.f13025j.put(n.mo41606k(), C5697h.C5698a.ISAuctionPerformanceShowedSuccessfully);
            if (this.f13016a.mo41832c()) {
                C5782b bVar = this.f13035t.get(n.mo41606k());
                if (bVar != null) {
                    C5695g.m14020a(bVar, n.mo41604i(), this.f13034s);
                    this.f13023h.mo41851a((CopyOnWriteArrayList<C5606U>) this.f13029n, this.f13035t, n.mo41604i(), this.f13034s, bVar);
                    if (!this.f13016a.mo41837h().f13931s) {
                        m13446a(n2, bVar);
                    }
                } else {
                    String k = n.mo41606k();
                    IronLog ironLog3 = IronLog.INTERNAL;
                    ironLog3.error("onLoadSuccess winner instance " + k + " missing from waterfall. auctionId = " + this.f13030o);
                    m13443a((int) IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
            if (this.f13027l == C5585a.LOADING) {
                this.f13018c.mo41465a(n.mo41606k());
                m13443a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13037v))}});
            } else {
                IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
                m13443a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13037v))}});
            }
            String e = mo41530e();
            C5790c.m14297f(ContextProvider.getInstance().getCurrentActiveActivity(), e);
            if (C5790c.m14291b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), e)) {
                m13443a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            C5804m.m14360a().mo42134a(3);
            mo41520a(C5585a.LOADED);
            this.f13017b.mo41819a(this);
        } else {
            IronLog ironLog4 = IronLog.INTERNAL;
            ironLog4.warning("wrong state - mCurrentState = " + this.f13027l);
        }
    }

    /* renamed from: a */
    public final void mo41523a(IronSourceError ironSourceError, C5587N n) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError);
        if (n.f13056a != this.f13030o) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("invoked with auctionId: " + n.f13056a + " and the current id is " + this.f13030o);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 3};
            n.mo41537a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong auction " + n.f13056a + " State - " + this.f13027l}, new Object[]{IronSourceConstants.EVENTS_EXT1, n.mo41606k()}});
        } else if (m13459k()) {
            this.f13025j.put(n.mo41606k(), C5697h.C5698a.ISAuctionPerformanceFailedToLoad);
            m13453f();
        } else {
            IronLog ironLog3 = IronLog.INTERNAL;
            ironLog3.warning("wrong state - mCurrentState = " + this.f13027l);
        }
    }

    /* renamed from: a */
    public final void mo41406a(List<C5782b> list, String str, C5782b bVar, JSONObject jSONObject, int i, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("auctionId = " + str);
        if (m13460l()) {
            this.f13032q = "";
            this.f13030o = str;
            this.f13033r = i;
            this.f13034s = bVar;
            this.f13031p = jSONObject;
            m13443a((int) IronSourceConstants.BN_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            mo41520a(this.f13027l == C5585a.FIRST_AUCTION ? C5585a.LOADING : C5585a.RELOADING);
            m13443a((int) IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, m13452c(list)}});
            m13453f();
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mCurrentState = " + this.f13027l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo41524a(C5585a aVar, C5585a aVar2) {
        boolean z;
        synchronized (this.f13036u) {
            if (this.f13027l == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("set state from '" + this.f13027l + "' to '" + aVar2 + "'");
                z = true;
                this.f13027l = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final void mo41525b(C5587N n) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(n.mo41611p());
        if (m13457i()) {
            this.f13018c.mo41469e();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo41518a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, n.mo41608m());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41526c() {
        /*
            r6 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = "checking with IronsourceLifecycleManager if app in foreground"
            r0.verbose(r1)
            com.ironsource.lifecycle.c r0 = com.ironsource.lifecycle.C5537c.m13194a()
            boolean r0 = r0.mo41269b()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0088
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f13018c
            if (r0 != 0) goto L_0x0020
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner is null"
        L_0x001b:
            r0.verbose(r3)
            r0 = 0
            goto L_0x0056
        L_0x0020:
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L_0x002b
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner or one of its parents are INVISIBLE or GONE"
            goto L_0x001b
        L_0x002b:
            com.ironsource.mediationsdk.IronSourceBannerLayout r0 = r6.f13018c
            boolean r0 = r0.hasWindowFocus()
            if (r0 != 0) goto L_0x0038
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "banner has no window focus"
            goto L_0x001b
        L_0x0038:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r6.f13018c
            boolean r0 = r3.getGlobalVisibleRect(r0)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "visible = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.verbose(r4)
        L_0x0056:
            if (r0 == 0) goto L_0x0085
            com.ironsource.mediationsdk.L$a r0 = com.ironsource.mediationsdk.C5579L.C5585a.LOADED
            com.ironsource.mediationsdk.L$a r3 = com.ironsource.mediationsdk.C5579L.C5585a.STARTED_LOADING
            boolean r0 = r6.mo41524a((com.ironsource.mediationsdk.C5579L.C5585a) r0, (com.ironsource.mediationsdk.C5579L.C5585a) r3)
            if (r0 == 0) goto L_0x006d
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r3 = "start loading"
            r0.verbose(r3)
            r6.m13449a((boolean) r1)
            goto L_0x0082
        L_0x006d:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "wrong state = "
            r3.<init>(r4)
            com.ironsource.mediationsdk.L$a r4 = r6.f13027l
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.error(r3)
        L_0x0082:
            r0 = 0
            r3 = 0
            goto L_0x008b
        L_0x0085:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x008a
        L_0x0088:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x008a:
            r3 = 1
        L_0x008b:
            if (r3 == 0) goto L_0x00af
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r3.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r3 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r2] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r3[r2] = r4
            r6.m13443a((int) r0, (java.lang.Object[][]) r3)
            com.ironsource.mediationsdk.b.b r0 = r6.f13017b
            r0.mo41819a(r6)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5579L.mo41526c():void");
    }

    /* renamed from: c */
    public final void mo41527c(C5587N n) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(n.mo41611p());
        if (m13457i()) {
            this.f13018c.mo41468d();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo41518a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, n.mo41608m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41528d() {
        IronLog.INTERNAL.verbose("");
        AsyncTask.execute(new Runnable() {
            public final void run() {
                boolean z;
                C5579L l = C5579L.this;
                if (!l.f13025j.isEmpty()) {
                    l.f13024i.mo41855a(l.f13025j);
                    l.f13025j.clear();
                }
                C5579L l2 = C5579L.this;
                long d = l2.f13016a.mo41833d() - (new Date().getTime() - l2.f13026k);
                if (d > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("waiting before auction - timeToWaitBeforeAuction = " + d);
                    new Timer().schedule(new TimerTask() {
                        public final void run() {
                            C5579L.this.mo41528d();
                        }
                    }, d);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C5579L.this.mo41517a((int) IronSourceConstants.BN_AUCTION_REQUEST);
                    C5710l.m14088a(C5579L.this.mo41530e(), C5579L.this.f13022g, (C5710l.C5711a) new C5710l.C5711a() {
                        /* renamed from: a */
                        public final void mo41535a(Map<String, Object> map, List<String> list, StringBuilder sb) {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("auction waterfallString = " + sb);
                            if (map.size() == 0 && list.size() == 0) {
                                C5579L.this.m13443a((int) IronSourceConstants.BN_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}});
                                if (C5579L.this.mo41524a(C5585a.AUCTION, C5585a.LOADED)) {
                                    C5579L.this.f13017b.mo41819a(C5579L.this);
                                    return;
                                }
                                C5699i.m14030a().mo41856a(C5579L.this.f13018c, new IronSourceError(1005, "No candidates available for auctioning"));
                                C5579L.this.m13443a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}});
                                C5579L.this.mo41520a(C5585a.READY_TO_LOAD);
                                return;
                            }
                            C5579L.this.m13443a((int) IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
                            if (C5579L.this.f13023h != null) {
                                C5695g gVar = C5579L.this.f13023h;
                                Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                                C5697h hVar = C5579L.this.f13024i;
                                int i = C5579L.this.f13021f;
                                gVar.f13558a = C5579L.m13442a(C5579L.this);
                                gVar.mo41850a(applicationContext, map, list, hVar, i);
                                return;
                            }
                            IronLog.INTERNAL.error("mAuctionHandler is null");
                        }
                    });
                }
            }
        });
    }

    /* renamed from: d */
    public final void mo41529d(C5587N n) {
        Object[][] objArr;
        IronLog.INTERNAL.verbose(n.mo41611p());
        if (m13457i()) {
            this.f13018c.mo41470f();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        mo41518a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, n.mo41608m());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo41530e() {
        C5724h hVar = this.f13019d;
        return hVar != null ? hVar.getPlacementName() : "";
    }

    /* renamed from: e */
    public final void mo41531e(C5587N n) {
        C5782b bVar;
        IronLog.INTERNAL.verbose(n.mo41611p());
        if (m13461m()) {
            if (this.f13016a.mo41832c() && this.f13016a.mo41837h().f13931s && (bVar = this.f13035t.get(n.mo41606k())) != null) {
                m13446a(n, bVar);
            }
            m13443a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mCurrentState = " + this.f13027l);
        String k = n.mo41606k();
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        m13443a((int) IronSourceConstants.TROUBLESHOOTING_BN_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f13027l}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
    }
}
