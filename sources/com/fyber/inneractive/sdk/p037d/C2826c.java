package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.p033c.C2727c;
import com.fyber.inneractive.sdk.p045e.C2897a;
import com.fyber.inneractive.sdk.p049h.C2951b;
import com.fyber.inneractive.sdk.p049h.C2962k;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3014a;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.fyber.inneractive.sdk.d.c */
public final class C2826c implements IAConfigManager.OnConfigurationReadyAndValidListener, C2897a.C2898a, C2962k.C2965a {

    /* renamed from: a */
    protected C2828a f6707a;

    /* renamed from: b */
    protected InneractiveAdRequest f6708b;

    /* renamed from: c */
    public C2962k f6709c;

    /* renamed from: d */
    C2897a f6710d;

    /* renamed from: e */
    public C2767s f6711e;

    /* renamed from: f */
    private final Runnable f6712f = new Runnable() {
        public final void run() {
            C2826c.m6185a(C2826c.this);
        }
    };

    /* renamed from: g */
    private long f6713g = 0;

    /* renamed from: com.fyber.inneractive.sdk.d.c$a */
    public interface C2828a {
        /* renamed from: a */
        void mo18116a(InneractiveAdRequest inneractiveAdRequest, C2836g gVar);

        /* renamed from: a */
        void mo18117a(InneractiveAdRequest inneractiveAdRequest, C3018e eVar, InneractiveInfrastructureError inneractiveInfrastructureError);
    }

    /* renamed from: a */
    public final void mo18109a(InneractiveAdRequest inneractiveAdRequest, C2828a aVar) {
        this.f6708b = inneractiveAdRequest;
        this.f6707a = aVar;
        if (IAConfigManager.m5939j()) {
            m6188c();
            return;
        }
        IAConfigManager.addListener(this);
        IAConfigManager.m5938i();
    }

    /* renamed from: b */
    private void m6187b(boolean z) {
        IAConfigManager.removeListener(this);
        C2962k kVar = this.f6709c;
        if (kVar != null) {
            kVar.f7159e = true;
            kVar.f7157c = null;
            kVar.f7160f.f7066c = true;
            this.f6709c = null;
        }
        C2897a aVar = this.f6710d;
        if (aVar != null && z) {
            aVar.mo18104e();
            this.f6710d = null;
        }
        this.f6708b = null;
    }

    /* renamed from: a */
    public final void mo18113a(boolean z) {
        m6187b(z);
        m6189d();
        this.f6707a = null;
    }

    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (z) {
            m6188c();
        } else {
            mo18111a(this.f6708b, mo18114b(), exc instanceof C2951b ? InneractiveErrorCode.CONNECTION_ERROR : InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR);
        }
    }

    /* renamed from: a */
    public final void mo18111a(InneractiveAdRequest inneractiveAdRequest, C3018e eVar, InneractiveErrorCode inneractiveErrorCode) {
        m6189d();
        if (IAlog.f9870a <= 3) {
            Thread.dumpStack();
        }
        IAlog.m9033a("%sgot onAdRequestFailed! with: %s", IAlog.m9029a((Object) this), inneractiveErrorCode);
        if (this.f6707a != null) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            if (!(eVar == null || eVar.f7409l == null)) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f7409l + ": " + eVar.f7410m));
            }
            this.f6707a.mo18117a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    /* renamed from: a */
    public final void mo18108a() {
        C2828a aVar;
        m6189d();
        IAlog.m9033a("%sgot onAdLoaded!", IAlog.m9029a((Object) this));
        C2897a aVar2 = this.f6710d;
        if (aVar2 != null && (aVar = this.f6707a) != null) {
            aVar.mo18116a(this.f6708b, aVar2.mo18105f());
        }
    }

    /* renamed from: a */
    public final void mo18112a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        m6189d();
        IAlog.m9033a("%sgot onFailedLoading! with: %s", IAlog.m9029a((Object) this), inneractiveInfrastructureError);
        C2828a aVar = this.f6707a;
        if (aVar != null) {
            aVar.mo18117a(this.f6708b, mo18114b(), inneractiveInfrastructureError);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6188c() {
        /*
            r13 = this;
            boolean r0 = com.fyber.inneractive.sdk.external.InneractiveAdManager.wasInitialized()
            if (r0 != 0) goto L_0x001a
            com.fyber.inneractive.sdk.d.c$a r0 = r13.f6707a
            if (r0 == 0) goto L_0x001a
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r13.f6708b
            com.fyber.inneractive.sdk.j.e r2 = r13.mo18114b()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED
            r3.<init>(r4)
            r0.mo18117a(r1, r2, r3)
        L_0x001a:
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r13.f6708b
            java.lang.String r0 = r0.getSpotId()
            com.fyber.inneractive.sdk.config.s r0 = com.fyber.inneractive.sdk.config.C2739a.m5959b(r0)
            com.fyber.inneractive.sdk.j.e r1 = r13.mo18114b()
            r2 = 0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.f6642c
            if (r3 != 0) goto L_0x0045
            r13.m6186a((boolean) r2, (com.fyber.inneractive.sdk.p051j.C3018e) r1)
            com.fyber.inneractive.sdk.d.c$a r0 = r13.f6707a
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r13.f6708b
            com.fyber.inneractive.sdk.j.e r2 = r13.mo18114b()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SPOT_DISABLED
            r3.<init>(r4)
            r0.mo18117a(r1, r2, r3)
            return
        L_0x0045:
            r3 = 2
            java.lang.String r4 = "************************************************************************************************************************"
            r5 = 1
            if (r0 == 0) goto L_0x01d8
            java.util.Iterator r6 = r0.iterator()
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L_0x01d8
            com.fyber.inneractive.sdk.config.t r0 = r0.mo18062a()
            com.fyber.inneractive.sdk.config.n r1 = r0.f6645c
            if (r1 == 0) goto L_0x005f
        L_0x005d:
            r0 = 1
            goto L_0x0071
        L_0x005f:
            com.fyber.inneractive.sdk.config.v r0 = r0.f6648f
            if (r0 == 0) goto L_0x0070
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r0.f6659j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r1 == r6) goto L_0x005d
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r0.f6659j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r1) goto L_0x0070
            goto L_0x005d
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 != 0) goto L_0x0086
            com.fyber.inneractive.sdk.d.c$a r0 = r13.f6707a
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r13.f6708b
            com.fyber.inneractive.sdk.j.e r2 = r13.mo18114b()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSUPPORTED_SPOT
            r3.<init>(r4)
            r0.mo18117a(r1, r2, r3)
            return
        L_0x0086:
            com.fyber.inneractive.sdk.config.a.s r0 = com.fyber.inneractive.sdk.config.p034a.C2767s.m6033a()
            r13.f6711e = r0
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r13.f6708b
            java.lang.String r1 = r1.getSpotId()
            r0.mo18012a((java.lang.String) r1)
            com.fyber.inneractive.sdk.h.k r0 = new com.fyber.inneractive.sdk.h.k
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r13.f6708b
            java.lang.String r6 = r1.f6804d
            com.fyber.inneractive.sdk.config.a.s r7 = r13.f6711e
            r0.<init>(r1, r6, r7, r13)
            r13.f6709c = r0
            r0.f7159e = r2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r6 = "IARemoteAdFetcher: requestAd called"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r6, r1)
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r0.f7155a
            java.lang.String r1 = r1.getSpotId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00c0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r6 = "appID is null or empty. Please provide a valid appID and re-try."
            com.fyber.inneractive.sdk.util.IAlog.m9037e(r6, r1)
        L_0x00be:
            r1 = 0
            goto L_0x00ef
        L_0x00c0:
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = com.fyber.inneractive.sdk.util.C3657l.m9123d(r1)
            if (r1 != 0) goto L_0x00d0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r6 = "INTERNET permission is missing. Please add it to the Manifest and re-try, otherwise ads will not be requested and displayed! "
            com.fyber.inneractive.sdk.util.IAlog.m9037e(r6, r1)
            goto L_0x00be
        L_0x00d0:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.C3657l.m9123d(r1)
            if (r1 != 0) goto L_0x00df
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r6 = "It is recommended to add ACCESS_NETWORK_STATE permission to the Manifest for better targetting"
            com.fyber.inneractive.sdk.util.IAlog.m9037e(r6, r1)
        L_0x00df:
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.C3657l.m9123d(r1)
            if (r1 != 0) goto L_0x00ee
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r6 = "It is recomended to add the READ_PHONE_STATE permission to the manifest for better targetting"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r6, r1)
        L_0x00ee:
            r1 = 1
        L_0x00ef:
            r6 = 0
            if (r1 != 0) goto L_0x00f9
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT
            r0.mo18431a(r1, r6)
            r0 = 0
            goto L_0x0118
        L_0x00f9:
            int r1 = com.fyber.inneractive.sdk.util.IAlog.f9871b
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = "AD_REQUEST"
            r7[r2] = r8
            com.fyber.inneractive.sdk.h.z r8 = r0.f7160f
            java.lang.String r8 = r8.mo18409k()
            r7[r5] = r8
            java.lang.String r8 = "%s %s"
            com.fyber.inneractive.sdk.util.IAlog.m9030a((int) r1, (java.lang.String) r8, (java.lang.Object[]) r7)
            com.fyber.inneractive.sdk.h.s r1 = com.fyber.inneractive.sdk.config.IAConfigManager.m5937h()
            com.fyber.inneractive.sdk.h.z r0 = r0.f7160f
            r1.mo18441a(r0)
            r0 = 1
        L_0x0118:
            if (r0 == 0) goto L_0x0214
            r13.m6189d()
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r13.f6708b
            boolean r1 = r0 instanceof com.fyber.inneractive.sdk.p037d.C2859s
            r7 = 0
            if (r1 == 0) goto L_0x0166
            long r9 = r0.f6805e
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0166
            com.fyber.inneractive.sdk.config.IAConfigManager.m5935f()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r9 = 3
            long r9 = r1.toMillis(r9)
            long r11 = r0.f6805e
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x013f
            long r9 = r0.f6805e
            goto L_0x0167
        L_0x013f:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r4, r1)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            long r11 = r0.f6805e
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r1[r2] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r1[r5] = r0
            java.lang.String r0 = "*** Requested timeout was set to: %d millis which is less than the minimum of %d millis"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "*** You need to set the timeout to be more than the minimum."
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r4, r0)
            goto L_0x0167
        L_0x0166:
            r9 = r7
        L_0x0167:
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x01bb
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r13.f6708b
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = r0.getSpotId()
            com.fyber.inneractive.sdk.config.s r0 = com.fyber.inneractive.sdk.config.C2739a.m5959b(r0)
            if (r0 == 0) goto L_0x0192
            java.util.Iterator r0 = r0.iterator()
        L_0x017d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0192
            java.lang.Object r1 = r0.next()
            com.fyber.inneractive.sdk.config.t r1 = (com.fyber.inneractive.sdk.config.C2808t) r1
            com.fyber.inneractive.sdk.config.n r3 = r1.f6645c
            if (r3 == 0) goto L_0x017d
            com.fyber.inneractive.sdk.config.n r1 = r1.f6645c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = r1.f6633b
            goto L_0x017d
        L_0x0192:
            com.fyber.inneractive.sdk.config.k r0 = com.fyber.inneractive.sdk.config.IAConfigManager.m5935f()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER
            r3 = 3
            if (r6 != r1) goto L_0x01a8
            com.fyber.inneractive.sdk.config.j r0 = r0.f6592a
            com.fyber.inneractive.sdk.config.i r0 = r0.f6586a
            r1 = 10
            java.lang.String r4 = "in_flight_banner_timeout_sec"
            int r0 = r0.mo18046a(r4, r1, r3)
            goto L_0x01b4
        L_0x01a8:
            com.fyber.inneractive.sdk.config.j r0 = r0.f6592a
            com.fyber.inneractive.sdk.config.i r0 = r0.f6586a
            r1 = 25
            java.lang.String r4 = "in_flight_interstitial_timeout_sec"
            int r0 = r0.mo18046a(r4, r1, r3)
        L_0x01b4:
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = r3.toMillis(r0)
        L_0x01bb:
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.C3662m.m9137a()
            java.lang.Runnable r1 = r13.f6712f
            r0.postDelayed(r1, r9)
            long r0 = java.lang.System.currentTimeMillis()
            r13.f6713g = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = com.fyber.inneractive.sdk.util.IAlog.m9029a((java.lang.Object) r13)
            r0[r2] = r1
            java.lang.String r1 = "%sstart in flight timeout"
            com.fyber.inneractive.sdk.util.IAlog.m9034b(r1, r0)
            return
        L_0x01d8:
            if (r0 != 0) goto L_0x01e0
            r13.m6186a((boolean) r5, (com.fyber.inneractive.sdk.p051j.C3018e) r1)
            com.fyber.inneractive.sdk.config.IAConfigManager.m5938i()
        L_0x01e0:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r3 = r13.f6708b
            java.lang.String r3 = r3.getSpotId()
            r0[r2] = r3
            com.fyber.inneractive.sdk.config.IAConfigManager r3 = com.fyber.inneractive.sdk.config.IAConfigManager.f6419n
            java.lang.String r3 = r3.f6432d
            r0[r5] = r3
            java.lang.String r3 = "*** Requested spot id '%s' doesn't exist within this application config - application Id: '%s'"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "*** Are you sure that you are using the correct application and spot ids, as defined for this application in the Inneractive console?"
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.util.IAlog.m9036d(r4, r0)
            com.fyber.inneractive.sdk.d.c$a r0 = r13.f6707a
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r2 = r13.f6708b
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT
            r3.<init>(r4)
            r0.mo18117a(r2, r1, r3)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p037d.C2826c.m6188c():void");
    }

    /* renamed from: b */
    public final C3018e mo18114b() {
        C2897a aVar = this.f6710d;
        if (aVar == null || aVar.mo18105f() == null) {
            return null;
        }
        return this.f6710d.mo18105f().mo18129f();
    }

    /* renamed from: d */
    private void m6189d() {
        if (this.f6713g > 0) {
            IAlog.m9034b("%scancel in flight timeout after %d millis", IAlog.m9029a((Object) this), Long.valueOf(System.currentTimeMillis() - this.f6713g));
            C3662m.m9137a().removeCallbacks(this.f6712f);
            this.f6713g = 0;
        }
    }

    /* renamed from: a */
    private void m6186a(boolean z, C3018e eVar) {
        String str;
        String spotId = this.f6708b.getSpotId();
        String a = IAConfigManager.m5943n().mo18084a("KEY_MISSMATCH_STATS_SPOTS", "");
        if (!a.contains(String.format("-%s-", new Object[]{spotId}))) {
            C2968n.C2969a aVar = new C2968n.C2969a(C2966l.MISSMATCH_SPOTID, this.f6708b, eVar);
            if (z) {
                str = String.format("There is no %s spot ID in current app config", new Object[]{spotId});
            } else {
                str = String.format("spot ID %s is not active in current app config", new Object[]{spotId});
            }
            aVar.mo18433a(new C2968n.C2971b().mo18438a(IronSourceConstants.EVENTS_ERROR_REASON, str));
            aVar.mo18436b((String) null);
            IAConfigManager.m5943n().mo18090b("KEY_MISSMATCH_STATS_SPOTS", String.format("%s -%s-", new Object[]{a, spotId}));
        }
    }

    /* renamed from: a */
    public final void mo18110a(InneractiveAdRequest inneractiveAdRequest, C3018e eVar) {
        IAlog.m9033a("%sonAdDataAvailable: got response data: %s", IAlog.m9029a((Object) this), eVar);
        C3014a a = C3014a.m7016a(eVar.f7406i);
        C2897a b = C2727c.C2728a.f6415a.mo17967b(a);
        this.f6710d = b;
        if (b == null) {
            IAlog.m9036d("%sonAdDataAvailable: Cannot find content handler for ad type: %s", IAlog.m9029a((Object) this), a);
            C2828a aVar = this.f6707a;
            if (aVar != null) {
                aVar.mo18117a(inneractiveAdRequest, eVar, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
                return;
            }
            return;
        }
        IAlog.m9033a("%sonAdDataAvailable: found response loader: %s", IAlog.m9029a((Object) this), this.f6710d);
        this.f6710d.mo18099a(this.f6708b, eVar, this.f6711e, (C2897a.C2898a) this);
    }

    /* renamed from: a */
    static /* synthetic */ void m6185a(C2826c cVar) {
        IAlog.m9034b("%sin flight timeout reached after %d millis", IAlog.m9029a((Object) cVar), Long.valueOf(System.currentTimeMillis() - cVar.f6713g));
        cVar.mo18111a(cVar.f6708b, cVar.mo18114b(), InneractiveErrorCode.IN_FLIGHT_TIMEOUT);
        cVar.m6187b(true);
    }
}
