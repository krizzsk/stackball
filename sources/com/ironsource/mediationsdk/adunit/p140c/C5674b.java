package com.ironsource.mediationsdk.adunit.p140c;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5690e;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.adunit.p138a.C5655b;
import com.ironsource.mediationsdk.adunit.p138a.C5656c;
import com.ironsource.mediationsdk.adunit.p138a.C5657d;
import com.ironsource.mediationsdk.adunit.p138a.C5664i;
import com.ironsource.mediationsdk.adunit.p139b.C5667c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C5717a;
import com.ironsource.mediationsdk.p141b.C5683c;
import com.ironsource.mediationsdk.p142c.C5688b;
import com.ironsource.mediationsdk.utils.C5796f;
import com.ironsource.mediationsdk.utils.C5802l;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.c.b */
public abstract class C5674b implements C5656c, InterstitialAdListener, NetworkInitializationListener, C5683c.C5684a, C5802l.C5803a {

    /* renamed from: a */
    private C5673a f13470a;

    /* renamed from: b */
    private C5667c f13471b;

    /* renamed from: c */
    private BaseAdAdapter<?> f13472c;

    /* renamed from: d */
    private C5657d f13473d;

    /* renamed from: e */
    private C5675a f13474e;

    /* renamed from: f */
    private String f13475f;

    /* renamed from: g */
    private C5717a f13476g;

    /* renamed from: h */
    private JSONObject f13477h;

    /* renamed from: i */
    private String f13478i;

    /* renamed from: j */
    private C5796f f13479j;

    /* renamed from: k */
    private C5683c f13480k = new C5683c((long) (this.f13470a.f13464d * 1000));

    /* renamed from: l */
    private AdData f13481l;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b$a */
    public enum C5675a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        FAILED
    }

    public C5674b(C5673a aVar, BaseAdAdapter<?> baseAdAdapter, C5717a aVar2, C5667c cVar) {
        this.f13470a = aVar;
        this.f13471b = cVar;
        this.f13473d = new C5657d(aVar.f13461a, C5657d.C5659b.PROVIDER, this);
        this.f13476g = aVar2;
        this.f13477h = aVar2.f13707b;
        this.f13472c = baseAdAdapter;
        m13918a(C5675a.NONE);
    }

    /* renamed from: a */
    private void m13918a(C5675a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13919d("to " + aVar));
        this.f13474e = aVar;
    }

    /* renamed from: d */
    private String m13919d(String str) {
        String str2 = this.f13470a.f13461a.name() + " - " + mo41801h() + " - state = " + this.f13474e;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    /* renamed from: l */
    private boolean m13920l() {
        return this.f13474e == C5675a.INIT_IN_PROGRESS;
    }

    /* renamed from: a */
    public final Map<String, Object> mo41729a(C5655b bVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f13472c != null ? this.f13472c.getNetworkAdapter().getAdapterVersion() : str);
            if (this.f13472c != null) {
                str = this.f13472c.getNetworkAdapter().getNetworkSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
        } catch (Exception unused) {
            String str2 = "could not get adapter version for event data" + mo41801h();
            IronLog.INTERNAL.error(m13919d(str2));
            this.f13473d.f13408e.mo41745a(str2);
        }
        hashMap.put("spId", this.f13476g.f13706a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f13476g.f13706a.getAdSourceNameForEvents());
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_INSTANCE_TYPE, Integer.valueOf(mo41799f() ? 2 : 1));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f13478i)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f13478i);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f13470a.f13465e));
        if (this.f13470a.f13466f != null && this.f13470a.f13466f.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13470a.f13466f);
        }
        if (!TextUtils.isEmpty(this.f13470a.f13467g)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13470a.f13467g);
        }
        if (!(bVar == C5655b.LOAD_AD || bVar == C5655b.LOAD_AD_SUCCESS || bVar == C5655b.LOAD_AD_FAILED || bVar == C5655b.AD_OPENED || bVar == C5655b.AD_CLOSED || bVar == C5655b.SHOW_AD || bVar == C5655b.SHOW_AD_FAILED || bVar == C5655b.AD_CLICKED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f13470a.f13468h));
            if (!TextUtils.isEmpty(this.f13470a.f13469i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f13470a.f13469i);
            }
        }
        if (!TextUtils.isEmpty(this.f13470a.f13463c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f13470a.f13463c.getCustomNetwork());
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo41792a(String str) {
        IronLog.INTERNAL.verbose(m13919d(""));
        try {
            this.f13473d.f13405b.mo41740a();
            this.f13479j = new C5796f();
            HashMap hashMap = new HashMap();
            hashMap.put(DataKeys.USER_ID, this.f13470a.f13462b);
            hashMap.putAll(C5688b.m13984a(this.f13477h));
            this.f13481l = new AdData(str, hashMap);
            m13918a(C5675a.INIT_IN_PROGRESS);
            this.f13480k.mo41821a(this);
            AdapterBaseInterface networkAdapter = this.f13472c.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f13481l, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + mo41801h();
            IronLog.INTERNAL.error(m13919d(str2));
            this.f13473d.f13408e.mo41745a(str2);
            onInitFailed(IronSourceError.ERROR_CODE_GENERIC, str2);
        } catch (Throwable th) {
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m13919d(str3));
            this.f13473d.f13408e.mo41755k(str3);
            onInitFailed(IronSourceError.ERROR_CODE_GENERIC, str3);
        }
    }

    /* renamed from: a */
    public final boolean mo41793a() {
        AdData adData = this.f13481l;
        if (adData == null) {
            return false;
        }
        try {
            return this.f13472c.isAdAvailable(adData);
        } catch (Throwable th) {
            String str = "isReadyToShow - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m13919d(str));
            this.f13473d.f13408e.mo41755k(str);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo41539b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13919d("state = " + this.f13474e + ", isBidder = " + mo41799f()));
        m13918a(C5675a.FAILED);
        this.f13473d.f13405b.mo41743a(C5796f.m14320a(this.f13479j), IronSourceError.ERROR_CODE_GENERIC, "time out");
        C5667c cVar = this.f13471b;
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("timed out");
        C5796f.m14320a(this.f13479j);
        cVar.mo41778a(buildLoadFailedError, this);
    }

    /* renamed from: b */
    public final void mo41794b(String str) {
        try {
            this.f13475f = str;
            this.f13473d.f13407d.mo41722a(this.f13475f);
            this.f13472c.showAd(this.f13481l, this);
        } catch (Throwable th) {
            String str2 = "showAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m13919d(str2));
            this.f13473d.f13408e.mo41755k(str2);
            onAdShowFailed(IronSourceError.ERROR_IS_SHOW_EXCEPTION, str2);
        }
    }

    /* renamed from: c */
    public final void mo41795c(String str) {
        C5690e.m13999a();
        this.f13478i = C5690e.m14011d(str);
    }

    /* renamed from: c */
    public final boolean mo41796c() {
        return this.f13474e == C5675a.INIT_IN_PROGRESS || this.f13474e == C5675a.LOADING;
    }

    /* renamed from: d */
    public final boolean mo41797d() {
        return this.f13474e != C5675a.FAILED;
    }

    /* renamed from: e */
    public final void mo41798e() {
        IronLog.INTERNAL.verbose(m13919d(""));
        this.f13473d.f13407d.mo41721a();
    }

    /* renamed from: f */
    public final boolean mo41799f() {
        return this.f13476g.f13708c;
    }

    /* renamed from: g */
    public final int mo41800g() {
        return this.f13476g.f13709d;
    }

    /* renamed from: h */
    public final String mo41801h() {
        return String.format("%s %s", new Object[]{mo41606k(), Integer.valueOf(hashCode())});
    }

    /* renamed from: i */
    public final void mo41802i() {
        this.f13472c = null;
    }

    /* renamed from: j */
    public final int mo41605j() {
        return this.f13476g.f13710e;
    }

    /* renamed from: k */
    public final String mo41606k() {
        return this.f13476g.f13706a.getProviderName();
    }

    public void onAdClicked() {
        IronLog.INTERNAL.verbose(m13919d(""));
        this.f13473d.f13407d.mo41726d(this.f13475f);
        this.f13471b.mo41779b(this);
    }

    public void onAdClosed() {
        IronLog.INTERNAL.verbose(m13919d(""));
        this.f13473d.f13407d.mo41727e(this.f13475f);
        this.f13471b.mo41783e(this);
    }

    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13919d("error = " + i + ", " + str));
        this.f13480k.mo41822d();
        if (this.f13474e == C5675a.LOADING) {
            long a = C5796f.m14320a(this.f13479j);
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                this.f13473d.f13405b.mo41742a(a, i);
            } else {
                this.f13473d.f13405b.mo41743a(a, i, str);
            }
            m13918a(C5675a.FAILED);
            this.f13471b.mo41778a(new IronSourceError(i, str), this);
        } else if (this.f13474e != C5675a.FAILED) {
            C5664i iVar = this.f13473d.f13408e;
            iVar.mo41754j("unexpected load failed for " + mo41801h() + ", error - " + i + ", " + str);
        }
    }

    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(m13919d(""));
        this.f13480k.mo41822d();
        if (this.f13474e == C5675a.LOADING) {
            this.f13473d.f13405b.mo41741a(C5796f.m14320a(this.f13479j));
            m13918a(C5675a.LOADED);
            this.f13471b.mo41777a(this);
        } else if (this.f13474e != C5675a.FAILED) {
            C5664i iVar = this.f13473d.f13408e;
            iVar.mo41753i("unexpected load success for " + mo41801h());
        }
    }

    public void onAdOpened() {
        IronLog.INTERNAL.verbose(m13919d(""));
        this.f13473d.f13407d.mo41725c(this.f13475f);
        this.f13471b.mo41782d(this);
    }

    public void onAdShowFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13919d("error = " + i + ", " + str));
        this.f13473d.f13407d.mo41723a(this.f13475f, i, str);
        this.f13471b.mo41780b(new IronSourceError(i, str), this);
    }

    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(m13919d(""));
        this.f13473d.f13407d.mo41724b(this.f13475f);
        this.f13471b.mo41781c(this);
    }

    public void onInitFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13919d("error = " + i + ", " + str));
        if (m13920l()) {
            this.f13480k.mo41822d();
            m13918a(C5675a.FAILED);
            C5667c cVar = this.f13471b;
            IronSourceError ironSourceError = new IronSourceError(i, str);
            C5796f.m14320a(this.f13479j);
            cVar.mo41778a(ironSourceError, this);
        } else if (this.f13474e != C5675a.FAILED) {
            C5664i iVar = this.f13473d.f13408e;
            iVar.mo41750f("unexpected init failed for " + mo41801h() + ", error - " + i + ", " + str);
        }
    }

    public void onInitSuccess() {
        IronLog.INTERNAL.verbose(m13919d(""));
        if (m13920l()) {
            this.f13480k.mo41822d();
            m13918a(C5675a.READY_TO_LOAD);
            IronLog.INTERNAL.verbose(m13919d("serverData = " + this.f13481l.getServerData()));
            m13918a(C5675a.LOADING);
            this.f13480k.mo41821a(this);
            try {
                this.f13472c.loadAd(this.f13481l, ContextProvider.getInstance().getCurrentActiveActivity(), this);
            } catch (Throwable th) {
                String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(m13919d(str));
                this.f13473d.f13408e.mo41755k(str);
                onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, str);
            }
        } else if (this.f13474e != C5675a.FAILED) {
            this.f13473d.f13408e.mo41749e("unexpected init success for " + mo41801h());
        }
    }
}
