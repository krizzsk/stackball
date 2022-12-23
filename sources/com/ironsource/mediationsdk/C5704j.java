package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5707k;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5724h;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.sdk.C5745a;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.C5796f;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.j */
public final class C5704j implements C5745a {

    /* renamed from: a */
    private C5707k f13626a;

    /* renamed from: b */
    private IronSourceBannerLayout f13627b;

    /* renamed from: c */
    private C5724h f13628c;

    /* renamed from: d */
    private C5706a f13629d = C5706a.NOT_INITIATED;

    /* renamed from: e */
    private IronSourceLoggerManager f13630e = IronSourceLoggerManager.getLogger();

    /* renamed from: f */
    private String f13631f;

    /* renamed from: g */
    private String f13632g;

    /* renamed from: h */
    private final CopyOnWriteArrayList<C5707k> f13633h = new CopyOnWriteArrayList<>();

    /* renamed from: i */
    private long f13634i;

    /* renamed from: j */
    private Timer f13635j;

    /* renamed from: k */
    private AtomicBoolean f13636k = new AtomicBoolean();

    /* renamed from: l */
    private AtomicBoolean f13637l = new AtomicBoolean();

    /* renamed from: m */
    private C5796f f13638m;

    /* renamed from: n */
    private C5796f f13639n;

    /* renamed from: o */
    private int f13640o;

    /* renamed from: p */
    private int f13641p;

    /* renamed from: com.ironsource.mediationsdk.j$a */
    enum C5706a {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C5704j(List<NetworkSettings> list, String str, String str2, long j, int i, int i2) {
        this.f13631f = str;
        this.f13632g = str2;
        this.f13634i = (long) i;
        C5699i.m14030a().f13589a = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            NetworkSettings networkSettings = list.get(i3);
            AbstractAdapter a = C5685c.m13965a().mo41824a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a == null || !C5689d.m13994a().mo41842a(a)) {
                m14054a(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.f13633h.add(new C5707k(this, networkSettings, a, j, i3 + 1));
            }
        }
        this.f13628c = null;
        m14052a(C5706a.READY_TO_LOAD);
    }

    /* renamed from: a */
    private void m14046a(int i) {
        m14050a(i, (Object[][]) null);
    }

    /* renamed from: a */
    private void m14047a(int i, C5707k kVar) {
        m14048a(i, kVar, (Object[][]) null);
    }

    /* renamed from: a */
    private void m14048a(int i, C5707k kVar, Object[][] objArr) {
        m14049a(i, kVar, objArr, this.f13641p);
    }

    /* renamed from: a */
    private void m14049a(int i, C5707k kVar, Object[][] objArr, int i2) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(kVar);
        try {
            if (this.f13627b != null) {
                m14055a(providerAdditionalData, this.f13627b.getSize());
            }
            if (this.f13628c != null) {
                providerAdditionalData.put("placement", this.f13628c.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f13630e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
        C5642d.m13798e().mo41689b(new C5641c(i, providerAdditionalData));
    }

    /* renamed from: a */
    private void m14050a(int i, Object[][] objArr) {
        m14051a(i, objArr, this.f13641p);
    }

    /* renamed from: a */
    private void m14051a(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (this.f13627b != null) {
                m14055a(mediationAdditionalData, this.f13627b.getSize());
            }
            if (this.f13628c != null) {
                mediationAdditionalData.put("placement", this.f13628c.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.f13630e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e), 3);
        }
        C5642d.m13798e().mo41689b(new C5641c(i, mediationAdditionalData));
    }

    /* renamed from: a */
    private void m14052a(C5706a aVar) {
        this.f13629d = aVar;
        m14054a("state=" + aVar.name());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m14053a(com.ironsource.mediationsdk.C5704j r8) {
        /*
            com.ironsource.mediationsdk.j$a r0 = r8.f13629d
            com.ironsource.mediationsdk.j$a r1 = com.ironsource.mediationsdk.C5704j.C5706a.RELOAD_IN_PROGRESS
            if (r0 == r1) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onReloadTimer wrong state="
            r0.<init>(r1)
            com.ironsource.mediationsdk.j$a r1 = r8.f13629d
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.m14054a((java.lang.String) r0)
            return
        L_0x001e:
            r0 = 0
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r2 = "checking with IronsourceLifecycleManager if app in foreground"
            r1.verbose(r2)
            com.ironsource.lifecycle.c r1 = com.ironsource.lifecycle.C5537c.m13194a()
            boolean r1 = r1.mo41269b()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x00e1
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f13627b
            java.lang.String r4 = "banner is null"
            if (r1 != 0) goto L_0x003f
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r4)
        L_0x003d:
            r1 = 0
            goto L_0x0078
        L_0x003f:
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L_0x004d
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner or one of its parents are INVISIBLE or GONE"
        L_0x0049:
            r1.verbose(r5)
            goto L_0x003d
        L_0x004d:
            com.ironsource.mediationsdk.IronSourceBannerLayout r1 = r8.f13627b
            boolean r1 = r1.hasWindowFocus()
            if (r1 != 0) goto L_0x005a
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r5 = "banner has no window focus"
            goto L_0x0049
        L_0x005a:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r8.f13627b
            boolean r1 = r5.getGlobalVisibleRect(r1)
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "visible = "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.verbose(r6)
        L_0x0078:
            if (r1 == 0) goto L_0x00de
            com.ironsource.mediationsdk.utils.m r1 = com.ironsource.mediationsdk.utils.C5804m.m14360a()
            r5 = 3
            int r1 = r1.mo42136b((int) r5)
            r8.f13641p = r1
            r1 = 3011(0xbc3, float:4.22E-42)
            r8.m14046a((int) r1)
            r1 = 3012(0xbc4, float:4.221E-42)
            com.ironsource.mediationsdk.k r5 = r8.f13626a
            r8.m14047a((int) r1, (com.ironsource.mediationsdk.C5707k) r5)
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.f13638m = r1
            com.ironsource.mediationsdk.utils.f r1 = new com.ironsource.mediationsdk.utils.f
            r1.<init>()
            r8.f13639n = r1
            com.ironsource.mediationsdk.k r1 = r8.f13626a
            java.lang.String r5 = "reloadBanner()"
            r1.mo41895a((java.lang.String) r5)
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f13653e
            if (r5 == 0) goto L_0x00c9
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f13653e
            boolean r5 = r5.isDestroyed()
            if (r5 == 0) goto L_0x00b3
            goto L_0x00c9
        L_0x00b3:
            r1.mo41896b()
            com.ironsource.mediationsdk.k$a r4 = com.ironsource.mediationsdk.C5707k.C5709a.LOADED
            r1.mo41894a((com.ironsource.mediationsdk.C5707k.C5709a) r4)
            com.ironsource.mediationsdk.AbstractAdapter r4 = r1.f13649a
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f13653e
            com.ironsource.mediationsdk.model.NetworkSettings r6 = r1.f13650b
            org.json.JSONObject r6 = r6.getBannerSettings()
            r4.reloadBanner(r5, r6, r1)
            goto L_0x00dc
        L_0x00c9:
            com.ironsource.mediationsdk.IronSourceBannerLayout r5 = r1.f13653e
            if (r5 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r4 = "banner is destroyed"
        L_0x00d0:
            com.ironsource.mediationsdk.sdk.a r5 = r1.f13651c
            com.ironsource.mediationsdk.logger.IronSourceError r6 = new com.ironsource.mediationsdk.logger.IronSourceError
            r7 = 610(0x262, float:8.55E-43)
            r6.<init>(r7, r4)
            r5.mo41885a((com.ironsource.mediationsdk.logger.IronSourceError) r6, (com.ironsource.mediationsdk.C5707k) r1, (boolean) r3)
        L_0x00dc:
            r1 = 0
            goto L_0x00e4
        L_0x00de:
            java.lang.String r0 = "banner is not visible - start reload timer"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r0 = "app in background - start reload timer"
        L_0x00e3:
            r1 = 1
        L_0x00e4:
            if (r1 == 0) goto L_0x0106
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            r1.verbose(r0)
            r0 = 3200(0xc80, float:4.484E-42)
            java.lang.Object[][] r1 = new java.lang.Object[r2][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 614(0x266, float:8.6E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            r1[r3] = r4
            r8.m14050a((int) r0, (java.lang.Object[][]) r1)
            r8.m14061d()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5704j.m14053a(com.ironsource.mediationsdk.j):void");
    }

    /* renamed from: a */
    private void m14054a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f13630e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    /* renamed from: a */
    private void m14055a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
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
            IronSourceLoggerManager ironSourceLoggerManager = this.f13630e;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
    }

    /* renamed from: a */
    private boolean m14056a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f13627b;
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }

    /* renamed from: b */
    private void m14057b() {
        Iterator<C5707k> it = this.f13633h.iterator();
        while (it.hasNext()) {
            it.next().f13652d = true;
        }
    }

    /* renamed from: b */
    private void m14058b(C5707k kVar, View view, FrameLayout.LayoutParams layoutParams) {
        this.f13626a = kVar;
        this.f13627b.mo41463a(view, layoutParams);
    }

    /* renamed from: b */
    private void m14059b(C5707k kVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z + " smash - " + kVar.mo41892a());
        m14048a((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, kVar, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13639n))}});
        m14050a((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13638m))}});
        this.f13640o = C5804m.m14360a().mo42136b(3);
        C5804m.m14360a().mo42134a(3);
        if (z) {
            m14058b(kVar, view, layoutParams);
        }
        m14061d();
    }

    /* renamed from: c */
    private boolean m14060c() {
        Iterator<C5707k> it = this.f13633h.iterator();
        while (it.hasNext()) {
            C5707k next = it.next();
            if (next.f13652d && this.f13626a != next) {
                m14048a(this.f13629d == C5706a.FIRST_LOAD_IN_PROGRESS ? IronSourceConstants.BN_INSTANCE_LOAD : IronSourceConstants.BN_INSTANCE_RELOAD, next, (Object[][]) null);
                this.f13639n = new C5796f();
                next.mo41893a(this.f13627b.mo41462a(), this.f13631f, this.f13632g);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m14061d() {
        try {
            m14062e();
            if (this.f13634i > 0) {
                Timer timer = new Timer();
                this.f13635j = timer;
                timer.schedule(new TimerTask() {
                    public final void run() {
                        C5704j.m14053a(C5704j.this);
                    }
                }, this.f13634i * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    private void m14062e() {
        Timer timer = this.f13635j;
        if (timer != null) {
            timer.cancel();
            this.f13635j = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo41880a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.f13630e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.f13630e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            m14051a((int) IronSourceConstants.BN_DESTROY, (Object[][]) null, this.f13640o);
            m14062e();
            if (this.f13626a != null) {
                m14048a((int) IronSourceConstants.BN_INSTANCE_DESTROY, this.f13626a, (Object[][]) null);
                C5707k kVar = this.f13626a;
                kVar.mo41895a("destroyBanner()");
                if (kVar.f13649a == null) {
                    kVar.mo41895a("destroyBanner() mAdapter == null");
                } else {
                    kVar.f13649a.destroyBanner(kVar.f13650b.getBannerSettings());
                    kVar.mo41894a(C5707k.C5709a.DESTROYED);
                }
                this.f13626a = null;
            }
            ironSourceBannerLayout.mo41466b();
            this.f13627b = null;
            this.f13628c = null;
            m14052a(C5706a.READY_TO_LOAD);
        }
    }

    /* renamed from: a */
    public final synchronized void mo41881a(IronSourceBannerLayout ironSourceBannerLayout, C5724h hVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (hVar != null) {
                        if (!TextUtils.isEmpty(hVar.getPlacementName())) {
                            if (this.f13629d == C5706a.READY_TO_LOAD) {
                                if (!C5699i.m14030a().mo41858b()) {
                                    this.f13641p = C5804m.m14360a().mo42136b(3);
                                    m14052a(C5706a.FIRST_LOAD_IN_PROGRESS);
                                    this.f13627b = ironSourceBannerLayout;
                                    this.f13628c = hVar;
                                    m14050a(3001, (Object[][]) null);
                                    if (C5790c.m14291b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), hVar.getPlacementName())) {
                                        C5699i a = C5699i.m14030a();
                                        a.mo41856a(ironSourceBannerLayout, new IronSourceError(604, "placement " + hVar.getPlacementName() + " is capped"));
                                        m14050a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                                        m14052a(C5706a.READY_TO_LOAD);
                                        return;
                                    }
                                    this.f13638m = new C5796f();
                                    Iterator<C5707k> it = this.f13633h.iterator();
                                    while (it.hasNext()) {
                                        it.next().f13652d = true;
                                    }
                                    this.f13639n = new C5796f();
                                    C5707k kVar = this.f13633h.get(0);
                                    m14048a((int) IronSourceConstants.BN_INSTANCE_LOAD, kVar, (Object[][]) null);
                                    kVar.mo41893a(ironSourceBannerLayout.mo41462a(), this.f13631f, this.f13632g);
                                    return;
                                }
                            }
                            this.f13630e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                            return;
                        }
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = hVar == null ? "placement is null" : "placement name is empty";
                    this.f13630e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e) {
                C5699i a2 = C5699i.m14030a();
                a2.mo41856a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, "loadBanner() failed " + e.getMessage()));
                m14050a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_EXCEPTION)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e.getMessage()}});
                m14052a(C5706a.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.f13630e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    /* renamed from: a */
    public final void mo41882a(C5707k kVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + kVar.mo41892a());
        if (m14056a()) {
            this.f13627b.mo41467c();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m14051a((int) IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.f13640o);
        m14049a((int) IronSourceConstants.BN_INSTANCE_CLICK, kVar, objArr, this.f13640o);
    }

    /* renamed from: a */
    public final void mo41883a(C5707k kVar, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + kVar.mo41892a());
        if (this.f13629d == C5706a.FIRST_LOAD_IN_PROGRESS) {
            m14048a((int) IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, kVar, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13639n))}});
            m14058b(kVar, view, layoutParams);
            C5724h hVar = this.f13628c;
            String placementName = hVar != null ? hVar.getPlacementName() : "";
            C5790c.m14297f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
            if (C5790c.m14291b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
                m14050a((int) IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
            }
            m14050a((int) IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13638m))}});
            this.f13627b.mo41465a(kVar.mo41892a());
            this.f13640o = C5804m.m14360a().mo42136b(3);
            C5804m.m14360a().mo42134a(3);
            m14052a(C5706a.RELOAD_IN_PROGRESS);
            m14061d();
        } else if (this.f13629d == C5706a.LOAD_IN_PROGRESS) {
            m14052a(C5706a.RELOAD_IN_PROGRESS);
            m14059b(kVar, view, layoutParams, true);
        } else {
            m14048a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, kVar, (Object[][]) null);
        }
    }

    /* renamed from: a */
    public final void mo41884a(C5707k kVar, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + kVar.mo41892a());
        if (this.f13629d != C5706a.RELOAD_IN_PROGRESS) {
            m14054a("onBannerAdReloaded " + kVar.mo41892a() + " wrong state=" + this.f13629d.name());
            m14048a((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, kVar, (Object[][]) null);
            return;
        }
        IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
        m14059b(kVar, view, layoutParams, z);
    }

    /* renamed from: a */
    public final void mo41885a(IronSourceError ironSourceError, C5707k kVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + kVar.mo41892a());
        if (this.f13629d == C5706a.FIRST_LOAD_IN_PROGRESS || this.f13629d == C5706a.LOAD_IN_PROGRESS) {
            if (z) {
                m14048a((int) IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, kVar, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13639n))}});
            } else {
                m14048a((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR, kVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13639n))}});
            }
            if (!m14060c()) {
                if (this.f13629d == C5706a.FIRST_LOAD_IN_PROGRESS) {
                    C5699i.m14030a().mo41856a(this.f13627b, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, "No ads to show"));
                    m14050a((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13638m))}});
                    m14052a(C5706a.READY_TO_LOAD);
                    return;
                }
                m14050a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13638m))}});
                m14052a(C5706a.RELOAD_IN_PROGRESS);
                m14061d();
                return;
            }
            return;
        }
        m14054a("onBannerAdLoadFailed " + kVar.mo41892a() + " wrong state=" + this.f13629d.name());
    }

    /* renamed from: b */
    public final void mo41886b(C5707k kVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + kVar.mo41892a());
        if (m14056a()) {
            this.f13627b.mo41469e();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m14051a((int) IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.f13640o);
        m14049a((int) IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, kVar, objArr, this.f13640o);
    }

    /* renamed from: b */
    public final void mo41887b(IronSourceError ironSourceError, C5707k kVar, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + kVar.mo41892a());
        if (this.f13629d != C5706a.RELOAD_IN_PROGRESS) {
            m14054a("onBannerAdReloadFailed " + kVar.mo41892a() + " wrong state=" + this.f13629d.name());
            return;
        }
        if (z) {
            m14048a((int) IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, kVar, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13639n))}});
        } else {
            m14048a((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, kVar, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13639n))}});
        }
        if (this.f13633h.size() == 1) {
            m14050a((int) IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(C5796f.m14320a(this.f13638m))}});
            m14061d();
            return;
        }
        m14052a(C5706a.LOAD_IN_PROGRESS);
        m14057b();
        m14060c();
    }

    /* renamed from: c */
    public final void mo41888c(C5707k kVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + kVar.mo41892a());
        if (m14056a()) {
            this.f13627b.mo41468d();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m14051a((int) IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.f13640o);
        m14049a((int) IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, kVar, objArr, this.f13640o);
    }

    /* renamed from: d */
    public final void mo41889d(C5707k kVar) {
        Object[][] objArr;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + kVar.mo41892a());
        if (m14056a()) {
            this.f13627b.mo41470f();
            objArr = null;
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        m14051a((int) IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.f13640o);
        m14049a((int) IronSourceConstants.BN_INSTANCE_LEAVE_APP, kVar, objArr, this.f13640o);
    }

    /* renamed from: e */
    public final void mo41890e(C5707k kVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + kVar.mo41892a());
        m14050a((int) IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
        m14048a((int) IronSourceConstants.BN_INSTANCE_SHOW, kVar, (Object[][]) null);
    }
}
