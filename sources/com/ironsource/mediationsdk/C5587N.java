package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C5717a;
import com.ironsource.mediationsdk.model.C5724h;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.p141b.C5683c;
import com.ironsource.mediationsdk.p142c.C5688b;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.C5796f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.N */
public final class C5587N extends C5606U implements C5683c.C5684a, BannerSmashListener {

    /* renamed from: a */
    String f13056a;

    /* renamed from: b */
    private C5688b f13057b;

    /* renamed from: j */
    private C5683c f13058j;

    /* renamed from: k */
    private C5588a f13059k;

    /* renamed from: l */
    private C5586M f13060l;

    /* renamed from: m */
    private IronSourceBannerLayout f13061m;

    /* renamed from: n */
    private JSONObject f13062n;

    /* renamed from: o */
    private int f13063o;

    /* renamed from: p */
    private String f13064p;

    /* renamed from: q */
    private C5724h f13065q;

    /* renamed from: r */
    private final Object f13066r;

    /* renamed from: s */
    private C5796f f13067s;

    /* renamed from: t */
    private boolean f13068t;

    /* renamed from: com.ironsource.mediationsdk.N$a */
    public enum C5588a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    C5587N(C5688b bVar, C5586M m, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new C5717a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f13066r = new Object();
        this.f13059k = C5588a.NONE;
        this.f13057b = bVar;
        this.f13058j = new C5683c(bVar.mo41835f());
        this.f13060l = m;
        this.f13197h = i;
        this.f13056a = str;
        this.f13063o = i2;
        this.f13064p = str2;
        this.f13062n = jSONObject;
        this.f13068t = z;
        this.f13192c.addBannerListener(this);
        if (mo41603h()) {
            m13498f();
        }
    }

    C5587N(C5688b bVar, C5586M m, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(bVar, m, networkSettings, abstractAdapter, i, "", (JSONObject) null, 0, "", z);
    }

    /* renamed from: a */
    private void m13492a(C5588a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13501r() + "state = " + aVar.name());
        synchronized (this.f13066r) {
            this.f13059k = aVar;
        }
    }

    /* renamed from: a */
    private void m13493a(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            mo41537a(this.f13068t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13067s))}});
        } else {
            mo41537a(this.f13068t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13067s))}});
        }
        C5586M m = this.f13060l;
        if (m != null) {
            m.mo41523a(ironSourceError, this);
        }
    }

    /* renamed from: a */
    private void m13494a(String str) {
        IronLog.INTERNAL.verbose(mo41611p());
        if (m13497a(C5588a.READY_TO_LOAD, C5588a.LOADING)) {
            this.f13067s = new C5796f();
            mo41537a(this.f13068t ? IronSourceConstants.BN_INSTANCE_RELOAD : IronSourceConstants.BN_INSTANCE_LOAD, (Object[][]) null);
            if (this.f13192c != null) {
                try {
                    if (mo41603h()) {
                        this.f13192c.loadBannerForBidding(this.f13061m, this.f13195f, this, str);
                    } else {
                        this.f13192c.loadBanner(this.f13061m, this.f13195f, this);
                    }
                } catch (Exception e) {
                    IronLog.INTERNAL.error(e.getMessage());
                    e.printStackTrace();
                }
            }
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("wrong state - state = " + this.f13059k);
        }
    }

    /* renamed from: a */
    private static void m13495a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        int i;
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
                i = 1;
            } else if (c == 1) {
                i = 2;
            } else if (c == 2) {
                i = 3;
            } else if (c == 3) {
                i = 5;
            } else if (c == 4) {
                map.put("bannerAdSize", 6);
                map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                return;
            } else {
                return;
            }
            map.put("bannerAdSize", i);
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    /* renamed from: a */
    private static boolean m13496a(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    /* renamed from: a */
    private boolean m13497a(C5588a aVar, C5588a aVar2) {
        boolean z;
        synchronized (this.f13066r) {
            if (this.f13059k == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(m13501r() + "set state from '" + this.f13059k + "' to '" + aVar2 + "'");
                z = true;
                this.f13059k = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: f */
    private void m13498f() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13501r() + "isBidder = " + mo41603h());
        m13492a(C5588a.INIT_IN_PROGRESS);
        m13499g();
        try {
            if (this.f13192c == null) {
                return;
            }
            if (mo41603h()) {
                this.f13192c.initBannerForBidding(this.f13057b.mo41830a(), this.f13057b.mo41831b(), this.f13195f, this);
            } else {
                this.f13192c.initBanners(this.f13057b.mo41830a(), this.f13057b.mo41831b(), this.f13195f, this);
            }
        } catch (Throwable th) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("exception = " + th.getLocalizedMessage());
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, th.getLocalizedMessage()));
        }
    }

    /* renamed from: g */
    private void m13499g() {
        if (this.f13192c != null) {
            try {
                String str = C5556E.m13257a().f12856l;
                if (!TextUtils.isEmpty(str)) {
                    this.f13192c.setMediationSegment(str);
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    this.f13192c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
                }
            } catch (Exception e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("exception - " + e.toString());
            }
        }
    }

    /* renamed from: q */
    private boolean m13500q() {
        boolean z;
        synchronized (this.f13066r) {
            z = this.f13059k == C5588a.LOADED;
        }
        return z;
    }

    /* renamed from: r */
    private String m13501r() {
        return String.format("%s - ", new Object[]{mo41611p()});
    }

    /* renamed from: s */
    private boolean m13502s() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f13061m;
        return ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: a */
    public final void mo41420a() {
        IronLog.INTERNAL.verbose(mo41611p());
        m13492a(C5588a.DESTROYED);
        if (this.f13192c == null) {
            IronLog.INTERNAL.warning("mAdapter == null");
            return;
        }
        try {
            this.f13192c.destroyBanner(this.f13193d.f13706a.getBannerSettings());
        } catch (Exception e) {
            e.printStackTrace();
            IronLog.INTERNAL.error(e.getMessage());
        }
        mo41537a((int) IronSourceConstants.BN_INSTANCE_DESTROY, (Object[][]) null);
    }

    /* renamed from: a */
    public final void mo41537a(int i, Object[][] objArr) {
        Map<String, Object> n = mo41609n();
        if (m13502s()) {
            n.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
        } else {
            m13495a(n, this.f13061m.getSize());
        }
        if (!TextUtils.isEmpty(this.f13056a)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13056a);
        }
        JSONObject jSONObject = this.f13062n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13062n);
        }
        C5724h hVar = this.f13065q;
        if (hVar != null) {
            n.put("placement", hVar.getPlacementName());
        }
        if (m13496a(i)) {
            C5642d.m13798e();
            C5642d.m13758a(n, this.f13063o, this.f13064p);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f13197h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(mo41606k() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        C5642d.m13798e().mo41689b(new C5641c(i, new JSONObject(n)));
    }

    /* renamed from: a */
    public final void mo41538a(IronSourceBannerLayout ironSourceBannerLayout, C5724h hVar, String str) {
        C5586M m;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(mo41611p());
        this.f13065q = hVar;
        if (!C5710l.m14091a(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            IronLog.INTERNAL.verbose(str2);
            m = this.f13060l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, str2);
        } else if (this.f13192c == null) {
            IronLog.INTERNAL.verbose("mAdapter is null");
            m = this.f13060l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        } else {
            this.f13061m = ironSourceBannerLayout;
            this.f13058j.mo41821a(this);
            try {
                if (mo41603h()) {
                    m13494a(str);
                    return;
                } else {
                    m13498f();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                return;
            }
        }
        m.mo41523a(ironSourceError, this);
    }

    /* renamed from: b */
    public final void mo41539b() {
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(mo41611p());
        if (m13497a(C5588a.INIT_IN_PROGRESS, C5588a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else if (m13497a(C5588a.LOADING, C5588a.LOAD_FAILED)) {
            IronLog.INTERNAL.verbose("load timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("unexpected state - " + this.f13059k);
            return;
        }
        m13493a(ironSourceError);
    }

    /* renamed from: c */
    public final Map<String, Object> mo41540c() {
        try {
            if (!mo41603h() || this.f13192c == null) {
                return null;
            }
            return this.f13192c.getBannerBiddingData(this.f13195f);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public final void mo41541d() {
        this.f13058j.mo41817c();
        super.mo41541d();
    }

    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(mo41611p());
        mo41537a((int) IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        C5586M m = this.f13060l;
        if (m != null) {
            m.mo41521a(this);
        }
    }

    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(mo41611p());
        mo41537a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        C5586M m = this.f13060l;
        if (m != null) {
            m.mo41529d(this);
        }
    }

    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13501r() + "error = " + ironSourceError);
        this.f13058j.mo41822d();
        if (m13497a(C5588a.LOADING, C5588a.LOAD_FAILED)) {
            m13493a(ironSourceError);
        }
    }

    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(mo41611p());
        this.f13058j.mo41822d();
        if (m13497a(C5588a.LOADING, C5588a.LOADED)) {
            mo41537a(this.f13068t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13067s))}});
            C5586M m = this.f13060l;
            if (m != null) {
                m.mo41522a(this, view, layoutParams);
                return;
            }
            return;
        }
        mo41537a(this.f13068t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, (Object[][]) null);
    }

    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(mo41611p());
        mo41537a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, (Object[][]) null);
        C5586M m = this.f13060l;
        if (m != null) {
            m.mo41525b(this);
        }
    }

    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(mo41611p());
        mo41537a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, (Object[][]) null);
        C5586M m = this.f13060l;
        if (m != null) {
            m.mo41527c(this);
        }
    }

    public final void onBannerAdShown() {
        IronLog.INTERNAL.verbose(mo41611p());
        if (m13500q()) {
            mo41537a((int) IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            C5586M m = this.f13060l;
            if (m != null) {
                m.mo41531e(this);
                return;
            }
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("wrong state - mState = " + this.f13059k);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        mo41537a((int) IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f13059k}, new Object[]{IronSourceConstants.EVENTS_EXT1, mo41606k()}});
    }

    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13501r() + "error = " + ironSourceError);
        this.f13058j.mo41822d();
        if (m13497a(C5588a.INIT_IN_PROGRESS, C5588a.NONE)) {
            C5586M m = this.f13060l;
            if (m != null) {
                m.mo41523a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this);
                return;
            }
            return;
        }
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.warning("wrong state - mState = " + this.f13059k);
    }

    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(mo41611p());
        if (m13497a(C5588a.INIT_IN_PROGRESS, C5588a.READY_TO_LOAD) && !mo41603h()) {
            if (!C5710l.m14091a(this.f13061m)) {
                this.f13060l.mo41523a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f13061m == null ? "banner is null" : "banner is destroyed"), this);
            } else {
                m13494a((String) null);
            }
        }
    }
}
