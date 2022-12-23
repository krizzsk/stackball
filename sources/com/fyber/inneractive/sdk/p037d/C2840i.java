package com.fyber.inneractive.sdk.p037d;

import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.p037d.C2826c;
import com.fyber.inneractive.sdk.p046f.C2910b;
import com.fyber.inneractive.sdk.p046f.C2912c;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.C3671r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.d.i */
public final class C2840i implements C2845j, C2854n {

    /* renamed from: a */
    InneractiveAdSpot.RequestListener f6762a;

    /* renamed from: b */
    InneractiveAdRequest f6763b;

    /* renamed from: c */
    C2826c.C2828a f6764c;

    /* renamed from: d */
    C2836g f6765d;

    /* renamed from: e */
    C2856p f6766e;

    /* renamed from: f */
    Set<C2856p> f6767f = new HashSet();

    /* renamed from: g */
    public C2826c f6768g;

    /* renamed from: h */
    InneractiveMediationName f6769h;

    /* renamed from: i */
    String f6770i;

    /* renamed from: j */
    String f6771j;

    /* renamed from: k */
    C2844a f6772k;

    /* renamed from: l */
    private final String f6773l = UUID.randomUUID().toString();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6774m = true;

    /* renamed from: n */
    private boolean f6775n = false;

    /* renamed from: com.fyber.inneractive.sdk.d.i$a */
    public interface C2844a {
        void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot);
    }

    /* renamed from: a */
    public final void mo18155a(C2844a aVar) {
        this.f6772k = aVar;
        requestAd((InneractiveAdRequest) null);
    }

    public final InneractiveMediationName getMediationName() {
        return this.f6769h;
    }

    public final String getMediationVersion() {
        return this.f6771j;
    }

    public final String getMediationNameString() {
        return this.f6770i;
    }

    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            C2856p pVar = (C2856p) inneractiveUnitController;
            pVar.setAdSpot(this);
            if (this.f6767f.size() > 0) {
                for (InneractiveUnitController inneractiveUnitController2 : new HashSet(this.f6767f)) {
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.f6767f.add(pVar);
            if (getAdContent() != null) {
                m6256c();
            }
        }
    }

    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            C2856p pVar = this.f6766e;
            if (pVar != null && pVar.equals(inneractiveUnitController)) {
                this.f6766e.destroy();
                this.f6766e = null;
            }
            this.f6767f.remove(inneractiveUnitController);
        }
    }

    public final InneractiveUnitController getSelectedUnitController() {
        return this.f6766e;
    }

    public final String getLocalUniqueId() {
        return this.f6773l;
    }

    public final String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f6763b;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    public final boolean isReady() {
        C2836g gVar = this.f6765d;
        if (gVar == null) {
            return false;
        }
        boolean z = gVar.mo18129f() != null && this.f6765d.mo18129f().mo18500d();
        if (z && getAdContent() != null) {
            C2836g adContent = getAdContent();
            C3018e f = adContent.mo18129f();
            if (!this.f6775n && f != null) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(f.f7399b - System.currentTimeMillis());
                long j = f.f7400c;
                IAlog.m9034b(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", new Object[]{Long.valueOf(minutes), Long.valueOf(j)}), new Object[0]);
                C2968n.C2969a aVar = new C2968n.C2969a(C2966l.IA_AD_EXPIRED, adContent.mo18130g(), f, adContent.mo18132i().mo18013b());
                aVar.mo18433a(new C2968n.C2971b().mo18438a("time_passed", Long.valueOf(minutes)).mo18438a("timeout", Long.valueOf(j)));
                aVar.mo18436b((String) null);
                this.f6775n = true;
            }
        }
        if (z || !this.f6765d.mo18128d()) {
            return false;
        }
        return true;
    }

    public final C2836g getAdContent() {
        return this.f6765d;
    }

    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            this.f6769h = inneractiveMediationName;
            setMediationName(inneractiveMediationName.getKey());
        }
    }

    public final void setMediationName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f6770i = str;
        }
    }

    public final void setMediationVersion(String str) {
        if (str != null) {
            this.f6771j = str;
        }
    }

    /* renamed from: a */
    public final void mo18154a() {
        C2836g gVar;
        C2836g gVar2 = this.f6765d;
        if (gVar2 != null) {
            if (gVar2.mo18126a_() && (gVar = this.f6765d) != null && !gVar.f6746j) {
                final C3018e f = this.f6765d.mo18129f();
                final InneractiveAdRequest g = this.f6765d.mo18130g();
                final String arrays = Arrays.toString(Thread.currentThread().getStackTrace());
                C3662m.m9137a().post(new Runnable() {
                    public final void run() {
                        IAlog.m9034b("Firing Event 803 - Stack trace - %s", arrays);
                        C2968n.C2969a aVar = new C2968n.C2969a(C2966l.IA_AD_DESTROYED_WITHOUT_SHOW, g, f, C2767s.m6034a(C2840i.this.f6768g, C2840i.this.f6765d));
                        aVar.mo18433a(new C2968n.C2971b().mo18438a("stack_trace", arrays));
                        aVar.mo18436b((String) null);
                    }
                });
            }
            this.f6765d.mo18127b();
            this.f6765d = null;
        }
        this.f6766e = null;
    }

    public final void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            C3662m.m9137a().post(new Runnable() {
                public final void run() {
                    C2840i.this.m6253b();
                }
            });
        } else {
            m6253b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6253b() {
        for (C2856p destroy : this.f6767f) {
            destroy.destroy();
        }
        this.f6767f.clear();
        C2826c cVar = this.f6768g;
        if (cVar != null) {
            cVar.mo18113a(true);
            this.f6768g = null;
        }
        this.f6762a = null;
        this.f6769h = null;
        mo18154a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f6763b;
    }

    public C2840i() {
        IAlog.m9034b("%sInneractiveAdSpotImpl created with UID: %s", IAlog.m9029a((Object) this), this.f6773l);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6252a(InneractiveAdRequest inneractiveAdRequest) {
        UnitDisplayType unitDisplayType;
        UnitDisplayType h;
        JSONArray jSONArray = null;
        if (!(inneractiveAdRequest == null || inneractiveAdRequest.getSelectedUnitConfig() == null)) {
            if (inneractiveAdRequest.getSelectedUnitConfig().mo18071h() != null) {
                h = inneractiveAdRequest.getSelectedUnitConfig().mo18071h().mo18057a();
            } else if (inneractiveAdRequest.getSelectedUnitConfig().mo18070g() != null) {
                h = inneractiveAdRequest.getSelectedUnitConfig().mo18070g().mo18080h();
            }
            unitDisplayType = h;
            if (inneractiveAdRequest != null && unitDisplayType != null) {
                C2836g gVar = this.f6765d;
                T t = gVar != null ? gVar.f6743g : null;
                String str = inneractiveAdRequest.f6804d;
                C2836g gVar2 = this.f6765d;
                if (gVar2 != null) {
                    jSONArray = gVar2.mo18132i().mo18013b();
                }
                new C2910b(t, inneractiveAdRequest, str, unitDisplayType, jSONArray).mo18362b();
                return;
            }
        }
        unitDisplayType = null;
        if (inneractiveAdRequest != null) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m6256c() {
        for (C2856p next : this.f6767f) {
            if (next.supports(this)) {
                this.f6766e = next;
                return true;
            }
        }
        return false;
    }

    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.m9034b("%ssetRequestListener called with: %s", IAlog.m9029a((Object) this), requestListener);
        this.f6762a = requestListener;
    }

    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        InneractiveAdRequest inneractiveAdRequest2;
        boolean z;
        IAlog.m9034b("%srequestAd called with request: %s", IAlog.m9029a((Object) this), inneractiveAdRequest);
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener = this.f6762a;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else if (inneractiveAdRequest == null && this.f6763b == null) {
            IAlog.m9037e("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.m9029a((Object) this));
            InneractiveAdSpot.RequestListener requestListener2 = this.f6762a;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else {
            if (inneractiveAdRequest != null) {
                inneractiveAdRequest2 = inneractiveAdRequest;
            } else {
                inneractiveAdRequest2 = this.f6763b;
            }
            inneractiveAdRequest2.f6804d = getLocalUniqueId();
            C2912c.m6513a().mo18364a(getLocalUniqueId()).mo18365a();
            if (this.f6767f.isEmpty()) {
                IAlog.m9037e("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.m9029a((Object) this));
                if (this.f6762a != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.f6763b;
                    }
                    m6252a(inneractiveAdRequest);
                    this.f6762a.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                }
            } else if (C3671r.m9162a(C3671r.C3674b.Mraid) || C3671r.m9162a(C3671r.C3674b.Video)) {
                C2826c cVar = this.f6768g;
                if (cVar != null) {
                    cVar.mo18113a(inneractiveAdRequest != null || this.f6763b == null);
                }
                if (inneractiveAdRequest != null) {
                    InneractiveAdRequest inneractiveAdRequest3 = this.f6763b;
                    if (inneractiveAdRequest3 != null) {
                        inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
                    }
                    this.f6763b = inneractiveAdRequest;
                    C2836g gVar = this.f6765d;
                    if (gVar != null) {
                        gVar.mo18127b();
                        this.f6774m = true;
                    }
                    Iterator<C2856p> it = this.f6767f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next() instanceof InneractiveFullscreenUnitController) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (!z) {
                        this.f6763b.f6803c = false;
                    }
                }
                this.f6768g = new C2826c();
                if (!TextUtils.isEmpty(this.f6770i)) {
                    this.f6763b.f6801a = this.f6770i;
                }
                if (!TextUtils.isEmpty(this.f6771j)) {
                    this.f6763b.f6802b = this.f6771j;
                }
                if (this.f6764c == null) {
                    this.f6764c = new C2826c.C2828a() {
                        /* renamed from: a */
                        public final void mo18116a(InneractiveAdRequest inneractiveAdRequest, C2836g gVar) {
                            if (C2840i.this.f6774m || C2840i.this.f6766e == null || !C2840i.this.f6766e.supportsRefresh()) {
                                boolean unused = C2840i.this.f6774m = false;
                                C2840i.this.f6765d = gVar;
                                C2840i.this.f6765d.mo18124a(inneractiveAdRequest);
                                if (!C2840i.this.m6256c()) {
                                    IAlog.m9034b("%sCannot find appropriate unit controller for unit: %s", IAlog.m9029a((Object) C2840i.this), C2840i.this.f6765d.mo18131h());
                                    C3018e b = C2840i.this.f6768g != null ? C2840i.this.f6768g.mo18114b() : null;
                                    InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.INVALID_INPUT;
                                    mo18117a(inneractiveAdRequest, b, new InneractiveInfrastructureError(inneractiveErrorCode, new Exception("Cannot find appropriate unit controller for unit: " + C2840i.this.f6765d.mo18131h())));
                                    C2840i.this.f6765d = null;
                                    return;
                                } else if (C2840i.this.f6762a != null) {
                                    C2840i.this.f6762a.onInneractiveSuccessfulAdRequest(C2840i.this);
                                }
                            } else if (C2840i.this.f6766e.canRefreshAd()) {
                                C2840i.this.f6765d = gVar;
                                C2840i.this.f6765d.mo18124a(inneractiveAdRequest);
                                if (C2840i.this.f6772k != null) {
                                    C2840i.this.f6772k.onAdRefreshed(C2840i.this);
                                } else if (C2840i.this.f6766e instanceof InneractiveAdViewUnitController) {
                                    ((InneractiveAdViewUnitController) C2840i.this.f6766e).onAdRefreshed(C2840i.this);
                                }
                            } else {
                                IAlog.m9034b("%sad loaded successfully, but the selected unit controller has rejected the refresh!", IAlog.m9029a((Object) C2840i.this));
                                C2840i.this.f6772k.onAdRefreshFailed(C2840i.this, InneractiveErrorCode.CANCELLED);
                            }
                            String str = inneractiveAdRequest.f6804d;
                            C2912c.m6513a().mo18364a(str).mo18370f();
                            C2912c.m6513a().mo18364a(str).mo18371g();
                            C2840i.m6259f(C2840i.this);
                        }

                        /* renamed from: a */
                        public final void mo18117a(InneractiveAdRequest inneractiveAdRequest, C3018e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
                            if (C2840i.this.f6762a != null) {
                                if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                                    C2840i.this.m6252a(inneractiveAdRequest);
                                }
                                if (C2840i.this.f6774m) {
                                    C2840i.m6251a(C2840i.this, inneractiveAdRequest, eVar, inneractiveInfrastructureError);
                                    C2840i.this.f6762a.onInneractiveFailedAdRequest(C2840i.this, inneractiveInfrastructureError.getErrorCode());
                                } else if (C2840i.this.f6772k != null) {
                                    C2840i.this.f6772k.onAdRefreshFailed(C2840i.this, inneractiveInfrastructureError.getErrorCode());
                                }
                            }
                        }
                    };
                }
                IAlog.m9034b("%sFound ad source for request! %s", IAlog.m9029a((Object) this), this.f6768g);
                this.f6768g.mo18109a(this.f6763b, this.f6764c);
            } else {
                IAlog.m9037e("%srequestAd called but mraid kit and the video kit doesn't exist! Cannot continue", IAlog.m9029a((Object) this));
                if (this.f6762a != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.f6763b;
                    }
                    m6252a(inneractiveAdRequest);
                    this.f6762a.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                }
            }
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m6259f(C2840i iVar) {
        C2836g gVar;
        JSONArray jSONArray;
        if (iVar.f6763b != null && (gVar = iVar.f6765d) != null && gVar.f6743g != null && iVar.f6765d.f6743g.f7415r != null) {
            T t = iVar.f6765d.f6743g;
            InneractiveAdRequest inneractiveAdRequest = iVar.f6763b;
            String str = inneractiveAdRequest.f6804d;
            UnitDisplayType unitDisplayType = iVar.f6765d.f6743g.f7415r;
            C2836g gVar2 = iVar.f6765d;
            if (gVar2 == null) {
                jSONArray = null;
            } else {
                jSONArray = gVar2.mo18132i().mo18013b();
            }
            new C2910b(t, inneractiveAdRequest, str, unitDisplayType, jSONArray).mo18362b();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6251a(C2840i iVar, InneractiveAdRequest inneractiveAdRequest, C3018e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS) {
            C2836g gVar = iVar.f6765d;
            if (gVar == null || gVar.mo18126a_() || iVar.f6765d.isVideoAd()) {
                IAlog.m9034b("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                String arrays = inneractiveInfrastructureError.getCause() != null ? Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace()) : C3670q.m9153a();
                C2968n.C2969a aVar = new C2968n.C2969a(C2966l.IA_AD_LOAD_FAILED, inneractiveAdRequest, eVar, C2767s.m6034a(iVar.f6768g, iVar.f6765d));
                aVar.mo18433a(new C2968n.C2971b().mo18438a("message", inneractiveInfrastructureError.getErrorCode().toString()).mo18438a("description", arrays).mo18438a("extra_description", inneractiveInfrastructureError.description()));
                aVar.mo18436b((String) null);
            }
        }
    }
}
