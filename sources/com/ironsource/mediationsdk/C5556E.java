package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.appsflyer.internal.referrer.Payload;
import com.ironsource.environment.C5527g;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5568I;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.p139b.C5672e;
import com.ironsource.mediationsdk.impressionData.C5701a;
import com.ironsource.mediationsdk.logger.C5714b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.model.C5723g;
import com.ironsource.mediationsdk.model.C5724h;
import com.ironsource.mediationsdk.model.C5725i;
import com.ironsource.mediationsdk.model.C5726j;
import com.ironsource.mediationsdk.model.C5728l;
import com.ironsource.mediationsdk.model.C5734q;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.p137a.C5645g;
import com.ironsource.mediationsdk.p142c.C5688b;
import com.ironsource.mediationsdk.sdk.C5750f;
import com.ironsource.mediationsdk.sdk.C5754j;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.C5797g;
import com.ironsource.mediationsdk.utils.C5799i;
import com.ironsource.mediationsdk.utils.C5800j;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p133c.C5499a;
import com.ironsource.p133c.C5500b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.E */
public final class C5556E implements C5799i {

    /* renamed from: aj */
    private static boolean f12809aj = false;

    /* renamed from: A */
    C5579L f12810A;

    /* renamed from: B */
    C5672e f12811B;

    /* renamed from: C */
    boolean f12812C;

    /* renamed from: D */
    boolean f12813D;

    /* renamed from: E */
    boolean f12814E;

    /* renamed from: F */
    boolean f12815F;

    /* renamed from: G */
    boolean f12816G;

    /* renamed from: H */
    int f12817H;

    /* renamed from: I */
    C5741q f12818I;

    /* renamed from: J */
    C5738o f12819J;

    /* renamed from: K */
    C5701a f12820K;

    /* renamed from: L */
    private final String f12821L;

    /* renamed from: M */
    private final String f12822M;

    /* renamed from: N */
    private AbstractAdapter f12823N;

    /* renamed from: O */
    private AtomicBoolean f12824O;

    /* renamed from: P */
    private final Object f12825P;

    /* renamed from: Q */
    private AtomicBoolean f12826Q;

    /* renamed from: R */
    private boolean f12827R;

    /* renamed from: S */
    private List<IronSource.AD_UNIT> f12828S;

    /* renamed from: T */
    private Set<IronSource.AD_UNIT> f12829T;

    /* renamed from: U */
    private Set<IronSource.AD_UNIT> f12830U;

    /* renamed from: V */
    private boolean f12831V;

    /* renamed from: W */
    private final String f12832W;

    /* renamed from: X */
    private boolean f12833X;

    /* renamed from: Y */
    private boolean f12834Y;

    /* renamed from: Z */
    private boolean f12835Z;

    /* renamed from: a */
    final String f12836a;

    /* renamed from: aa */
    private Boolean f12837aa;

    /* renamed from: ab */
    private IronSourceBannerLayout f12838ab;

    /* renamed from: ac */
    private String f12839ac;

    /* renamed from: ad */
    private C5750f f12840ad;

    /* renamed from: ae */
    private CopyOnWriteArraySet<String> f12841ae;

    /* renamed from: af */
    private CopyOnWriteArraySet<String> f12842af;

    /* renamed from: ag */
    private CopyOnWriteArraySet<String> f12843ag;

    /* renamed from: ah */
    private C5744s f12844ah;

    /* renamed from: ai */
    private C5500b f12845ai;

    /* renamed from: b */
    C5624X f12846b;

    /* renamed from: c */
    C5551B f12847c;

    /* renamed from: d */
    C5578K f12848d;

    /* renamed from: e */
    C5704j f12849e;

    /* renamed from: f */
    IronSourceLoggerManager f12850f;

    /* renamed from: g */
    C5754j f12851g;

    /* renamed from: h */
    C5714b f12852h;

    /* renamed from: i */
    C5800j f12853i;

    /* renamed from: j */
    public String f12854j;

    /* renamed from: k */
    public String f12855k;

    /* renamed from: l */
    String f12856l;

    /* renamed from: m */
    String f12857m;

    /* renamed from: n */
    Map<String, String> f12858n;

    /* renamed from: o */
    public String f12859o;

    /* renamed from: p */
    public String f12860p;

    /* renamed from: q */
    Context f12861q;

    /* renamed from: r */
    Boolean f12862r;

    /* renamed from: s */
    IronSourceSegment f12863s;

    /* renamed from: t */
    int f12864t;

    /* renamed from: u */
    boolean f12865u;

    /* renamed from: v */
    boolean f12866v;

    /* renamed from: w */
    boolean f12867w;

    /* renamed from: x */
    Boolean f12868x;

    /* renamed from: y */
    C5811x f12869y;

    /* renamed from: z */
    C5589O f12870z;

    /* renamed from: com.ironsource.mediationsdk.E$1 */
    static /* synthetic */ class C55571 {

        /* renamed from: a */
        static final /* synthetic */ int[] f12871a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12872b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0049 */
        static {
            /*
                int[] r0 = com.ironsource.mediationsdk.utils.C5790c.C5792a.m14304a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12872b = r0
                r1 = 1
                int r2 = com.ironsource.mediationsdk.utils.C5790c.C5792a.f13936a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f12872b     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.mediationsdk.utils.C5790c.C5792a.f13937b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                r2 = 3
                int[] r3 = f12872b     // Catch:{ NoSuchFieldError -> 0x001d }
                int r4 = com.ironsource.mediationsdk.utils.C5790c.C5792a.f13938c     // Catch:{ NoSuchFieldError -> 0x001d }
                r3[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r3 = 4
                int[] r4 = f12872b     // Catch:{ NoSuchFieldError -> 0x0024 }
                int r5 = com.ironsource.mediationsdk.utils.C5790c.C5792a.f13939d     // Catch:{ NoSuchFieldError -> 0x0024 }
                r4[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f12871a = r4
                com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = f12871a     // Catch:{ NoSuchFieldError -> 0x003f }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x003f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r0 = f12871a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f12871a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.C55571.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.E$a */
    public interface C5558a {
        /* renamed from: a */
        void mo41396a(String str);
    }

    /* renamed from: com.ironsource.mediationsdk.E$b */
    static class C5559b {

        /* renamed from: a */
        static volatile C5556E f12873a = new C5556E((byte) 0);
    }

    private C5556E() {
        this.f12836a = getClass().getName();
        this.f12821L = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:​7.1.10.1";
        this.f12822M = "Activity=";
        this.f12825P = new Object();
        this.f12853i = null;
        this.f12854j = null;
        this.f12855k = null;
        this.f12856l = null;
        this.f12857m = null;
        this.f12858n = null;
        this.f12859o = null;
        this.f12827R = false;
        this.f12860p = null;
        this.f12862r = null;
        this.f12831V = true;
        this.f12832W = IronSourceConstants.KEY_SESSION_DEPTH;
        this.f12868x = null;
        this.f12850f = IronSourceLoggerManager.getLogger(0);
        C5714b bVar = new C5714b((LogListener) null, 1);
        this.f12852h = bVar;
        this.f12850f.addLogger(bVar);
        this.f12851g = new C5754j();
        C5624X x = new C5624X();
        this.f12846b = x;
        x.f13231m = this.f12851g;
        C5551B b = new C5551B();
        this.f12847c = b;
        C5754j jVar = this.f12851g;
        b.f12789m = jVar;
        b.f12790n.f13806a = jVar;
        C5578K k = new C5578K();
        this.f12848d = k;
        k.f13008b = this.f12851g;
        this.f12824O = new AtomicBoolean();
        this.f12829T = new HashSet();
        this.f12830U = new HashSet();
        this.f12866v = false;
        this.f12865u = false;
        this.f12833X = false;
        this.f12826Q = new AtomicBoolean(true);
        this.f12864t = 0;
        this.f12834Y = false;
        this.f12867w = false;
        this.f12835Z = false;
        this.f12860p = UUID.randomUUID().toString();
        this.f12837aa = Boolean.FALSE;
        this.f12815F = false;
        this.f12839ac = null;
        this.f12869y = null;
        this.f12870z = null;
        this.f12840ad = null;
        this.f12810A = null;
        this.f12812C = false;
        this.f12813D = false;
        this.f12816G = false;
        this.f12841ae = new CopyOnWriteArraySet<>();
        this.f12842af = new CopyOnWriteArraySet<>();
        this.f12843ag = new CopyOnWriteArraySet<>();
        this.f12818I = null;
        this.f12844ah = null;
        this.f12819J = null;
        this.f12849e = null;
        this.f12817H = 1;
        this.f12820K = new C5701a();
        this.f12845ai = new C5500b();
    }

    /* synthetic */ C5556E(byte b) {
        this();
    }

    /* renamed from: A */
    private static boolean m13256A() {
        return ContextProvider.getInstance().getCurrentActiveActivity() != null;
    }

    /* renamed from: a */
    public static C5556E m13257a() {
        return C5559b.f12873a;
    }

    /* renamed from: a */
    public static String m13258a(Context context) {
        try {
            String[] a = C5527g.m13136a(context);
            if (a[0] != null) {
                return a[0];
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* renamed from: a */
    private static String m13259a(String str, int i) {
        if (i == 0) {
            return null;
        }
        int i2 = C55571.f12872b[i - 1];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return null;
        }
        return "placement " + str + " is capped";
    }

    /* renamed from: a */
    static void m13260a(int i, JSONObject jSONObject) {
        C5645g.m13810e().mo41689b(new C5641c(i, jSONObject));
    }

    /* renamed from: a */
    private void m13261a(IronSource.AD_UNIT ad_unit) {
        String str = ad_unit + " ad unit has already been initialized";
        this.f12850f.log(IronSourceLogger.IronSourceTag.API, str, 3);
        IronSourceUtils.sendAutomationLog(str);
    }

    /* renamed from: a */
    private void m13262a(IronSource.AD_UNIT ad_unit, boolean z) {
        int i = C55571.f12871a[ad_unit.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        synchronized (this.f12837aa) {
                            if (this.f12837aa.booleanValue()) {
                                this.f12837aa = Boolean.FALSE;
                                C5699i.m14030a().mo41856a(this.f12838ab, new IronSourceError(602, "Init had failed"));
                                this.f12838ab = null;
                                this.f12839ac = null;
                            }
                        }
                    }
                } else if (z || mo41384i() || this.f12830U.contains(ad_unit)) {
                    this.f12851g.onOfferwallAvailable(false);
                }
            } else if (this.f12866v) {
                Iterator<String> it = this.f12841ae.iterator();
                while (it.hasNext()) {
                    C5813z.m14382a().mo42145a(it.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                }
                this.f12841ae.clear();
            } else if (this.f12815F) {
                this.f12815F = false;
                C5736n.m14120a().mo41990a(ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } else if (this.f12865u) {
            Iterator<String> it2 = this.f12842af.iterator();
            while (it2.hasNext()) {
                C5607V.m13667a().mo41612a(it2.next(), ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f12842af.clear();
        } else if (z || mo41376d() || this.f12830U.contains(ad_unit)) {
            this.f12851g.onRewardedVideoAvailabilityChanged(false);
        }
    }

    /* renamed from: a */
    public static void m13263a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C5813z.m14382a().f14130a = iSDemandOnlyInterstitialListener;
    }

    /* renamed from: a */
    static void m13264a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C5607V.m13667a().f13200a = iSDemandOnlyRewardedVideoListener;
    }

    /* renamed from: a */
    static void m13265a(String str, C5499a aVar) {
        if (str != null) {
            try {
                if (str.length() > 64) {
                    aVar.mo41202a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
                }
            } catch (Exception unused) {
                aVar.mo41202a(ErrorBuilder.buildInvalidKeyValueError("segment", IronSourceConstants.SUPERSONIC_CONFIG_NAME, "segment value should not exceed 64 characters."));
            }
        }
    }

    /* renamed from: a */
    private void m13266a(ArrayList<NetworkSettings> arrayList) {
        this.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in programmatic mode", 0);
        this.f12810A = new C5579L(arrayList, new C5688b(this.f12854j, IronSourceUtils.getUserIdForNetworks(), this.f12853i.f14083c.f13747d), C5790c.m14278a().mo42112b());
        m13295y();
    }

    /* renamed from: a */
    static void m13267a(JSONObject jSONObject, Object[][] objArr) {
        int i = 0;
        while (i <= 0) {
            try {
                Object[] objArr2 = objArr[0];
                jSONObject.put(objArr2[0].toString(), objArr2[1]);
                i++;
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "IronSourceObject addToDictionary: " + Log.getStackTraceString(e), 3);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m13268a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setAdaptersDebug : " + z, 1);
        C5685c.m13965a().mo41829b(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0115, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m13269a(boolean r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r1 = 0
            r2 = 0
        L_0x0004:
            r3 = 1
            if (r2 >= r0) goto L_0x002c
            r4 = r11[r2]     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x01da }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x0014
            r9.f12867w = r3     // Catch:{ all -> 0x01da }
            goto L_0x0029
        L_0x0014:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x01da }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x001f
            r9.f12835Z = r3     // Catch:{ all -> 0x01da }
            goto L_0x0029
        L_0x001f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r5 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x01da }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x01da }
            if (r4 == 0) goto L_0x0029
            r9.f12834Y = r3     // Catch:{ all -> 0x01da }
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x002c:
            com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.I$a r0 = r0.mo41447b()     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.I$a r2 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_FAILED     // Catch:{ all -> 0x01da }
            if (r0 != r2) goto L_0x0057
            com.ironsource.mediationsdk.sdk.j r10 = r9.f12851g     // Catch:{ Exception -> 0x0051 }
            if (r10 == 0) goto L_0x004f
            int r10 = r11.length     // Catch:{ Exception -> 0x0051 }
        L_0x003d:
            if (r1 >= r10) goto L_0x004f
            r0 = r11[r1]     // Catch:{ Exception -> 0x0051 }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r2 = r9.f12829T     // Catch:{ Exception -> 0x0051 }
            boolean r2 = r2.contains(r0)     // Catch:{ Exception -> 0x0051 }
            if (r2 != 0) goto L_0x004c
            r9.m13262a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)     // Catch:{ Exception -> 0x0051 }
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x003d
        L_0x004f:
            monitor-exit(r9)
            return
        L_0x0051:
            r10 = move-exception
            r10.printStackTrace()     // Catch:{ all -> 0x01da }
            monitor-exit(r9)
            return
        L_0x0057:
            boolean r0 = r9.f12827R     // Catch:{ all -> 0x01da }
            r2 = 14
            if (r0 != 0) goto L_0x0116
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01da }
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r4 = 0
        L_0x0063:
            if (r1 >= r0) goto L_0x00a3
            r5 = r11[r1]     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r6 = r9.f12829T     // Catch:{ all -> 0x01da }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x01da }
            if (r6 != 0) goto L_0x0087
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f12829T     // Catch:{ all -> 0x01da }
            r4.add(r5)     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r9.f12830U     // Catch:{ all -> 0x01da }
            r4.add(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0081 }
            r10.put(r4, r3)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x0085:
            r4 = 1
            goto L_0x00a0
        L_0x0087:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r9.f12850f     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x01da }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01da }
            r8.<init>()     // Catch:{ all -> 0x01da }
            r8.append(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = " ad unit has started initializing."
            r8.append(r5)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x01da }
            r8 = 3
            r6.log(r7, r5, r8)     // Catch:{ all -> 0x01da }
        L_0x00a0:
            int r1 = r1 + 1
            goto L_0x0063
        L_0x00a3:
            if (r4 == 0) goto L_0x0114
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            r11.<init>()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x0104 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x0104 }
            r0.append(r1)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0104 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x0104 }
            boolean r4 = m13256A()     // Catch:{ Exception -> 0x0104 }
            r1.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0104 }
            boolean r4 = com.ironsource.environment.C5505a.C55061.m13084d()     // Catch:{ Exception -> 0x0104 }
            if (r4 == 0) goto L_0x00e1
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r4 = com.ironsource.environment.C5505a.C55061.m13081c()     // Catch:{ Exception -> 0x0104 }
        L_0x00dd:
            r11.append(r4)     // Catch:{ Exception -> 0x0104 }
            goto L_0x00e4
        L_0x00e1:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x00dd
        L_0x00e4:
            r11.append(r0)     // Catch:{ Exception -> 0x0104 }
            boolean r0 = r9.mo41392m()     // Catch:{ Exception -> 0x0104 }
            if (r0 == 0) goto L_0x00f0
            r11.append(r1)     // Catch:{ Exception -> 0x0104 }
        L_0x00f0:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0104 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x0104 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f12864t     // Catch:{ Exception -> 0x0104 }
            int r0 = r0 + r3
            r9.f12864t = r0     // Catch:{ Exception -> 0x0104 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x0108:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01da }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.a.g r10 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x01da }
            r10.mo41689b((com.ironsource.mediationsdk.p137a.C5641c) r11)     // Catch:{ all -> 0x01da }
        L_0x0114:
            monitor-exit(r9)
            return
        L_0x0116:
            com.ironsource.mediationsdk.I r0 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x01da }
            r0.mo41448b(r10)     // Catch:{ all -> 0x01da }
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r0 = r9.f12828S     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x0123
            monitor-exit(r9)
            return
        L_0x0123:
            org.json.JSONObject r10 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r10)     // Catch:{ all -> 0x01da }
            int r0 = r11.length     // Catch:{ all -> 0x01da }
            r4 = 0
            r5 = 0
        L_0x012a:
            if (r4 >= r0) goto L_0x0167
            r6 = r11[r4]     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r7 = r9.f12829T     // Catch:{ all -> 0x01da }
            boolean r7 = r7.contains(r6)     // Catch:{ all -> 0x01da }
            if (r7 != 0) goto L_0x0161
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f12829T     // Catch:{ all -> 0x01da }
            r5.add(r6)     // Catch:{ all -> 0x01da }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f12830U     // Catch:{ all -> 0x01da }
            r5.add(r6)     // Catch:{ all -> 0x01da }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0148 }
            r10.put(r5, r3)     // Catch:{ Exception -> 0x0148 }
            goto L_0x014c
        L_0x0148:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x014c:
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f12828S     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x015c
            java.util.List<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r9.f12828S     // Catch:{ all -> 0x01da }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01da }
            if (r5 == 0) goto L_0x015c
            r9.m13274b((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01da }
            goto L_0x015f
        L_0x015c:
            r9.m13262a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6, (boolean) r1)     // Catch:{ all -> 0x01da }
        L_0x015f:
            r5 = 1
            goto L_0x0164
        L_0x0161:
            r9.m13261a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r6)     // Catch:{ all -> 0x01da }
        L_0x0164:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x0167:
            if (r5 == 0) goto L_0x01d8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            r11.<init>()     // Catch:{ Exception -> 0x01c8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r1 = ",androidx="
            r0.<init>(r1)     // Catch:{ Exception -> 0x01c8 }
            boolean r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x01c8 }
            r0.append(r1)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01c8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r4 = ",Activity="
            r1.<init>(r4)     // Catch:{ Exception -> 0x01c8 }
            boolean r4 = m13256A()     // Catch:{ Exception -> 0x01c8 }
            r1.append(r4)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01c8 }
            boolean r4 = com.ironsource.environment.C5505a.C55061.m13084d()     // Catch:{ Exception -> 0x01c8 }
            if (r4 == 0) goto L_0x01a5
            java.lang.String r4 = "appLanguage=Kotlin"
            r11.append(r4)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r4 = com.ironsource.environment.C5505a.C55061.m13081c()     // Catch:{ Exception -> 0x01c8 }
        L_0x01a1:
            r11.append(r4)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01a8
        L_0x01a5:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x01a1
        L_0x01a8:
            r11.append(r0)     // Catch:{ Exception -> 0x01c8 }
            boolean r0 = r9.mo41392m()     // Catch:{ Exception -> 0x01c8 }
            if (r0 == 0) goto L_0x01b4
            r11.append(r1)     // Catch:{ Exception -> 0x01c8 }
        L_0x01b4:
            java.lang.String r0 = "ext1"
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x01c8 }
            r10.put(r0, r11)     // Catch:{ Exception -> 0x01c8 }
            java.lang.String r11 = "sessionDepth"
            int r0 = r9.f12864t     // Catch:{ Exception -> 0x01c8 }
            int r0 = r0 + r3
            r9.f12864t = r0     // Catch:{ Exception -> 0x01c8 }
            r10.put(r11, r0)     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01cc
        L_0x01c8:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x01da }
        L_0x01cc:
            com.ironsource.mediationsdk.a.c r11 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x01da }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x01da }
            com.ironsource.mediationsdk.a.g r10 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x01da }
            r10.mo41689b((com.ironsource.mediationsdk.p137a.C5641c) r11)     // Catch:{ all -> 0x01da }
        L_0x01d8:
            monitor-exit(r9)
            return
        L_0x01da:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.m13269a(boolean, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* renamed from: a */
    private static boolean m13270a(C5677b bVar) {
        return bVar.f13499k > 0 && bVar.f13500l > 0;
    }

    /* renamed from: a */
    private static boolean m13271a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    /* renamed from: b */
    private C5800j m13272b(Context context, String str, C5558a aVar) {
        Vector vector;
        C5800j jVar = null;
        if (!IronSourceUtils.isNetworkConnected(context)) {
            return null;
        }
        try {
            String a = m13258a(context);
            if (TextUtils.isEmpty(a)) {
                a = C5527g.m13180y(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str2 = a;
            if (this.f12863s != null) {
                IronSourceSegment ironSourceSegment = this.f12863s;
                Vector vector2 = new Vector();
                if (ironSourceSegment.f12990b != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ironSourceSegment.f12990b);
                    vector2.add(new Pair("age", sb.toString()));
                }
                if (!TextUtils.isEmpty(ironSourceSegment.f12991c)) {
                    vector2.add(new Pair(IronSourceSegment.GENDER, ironSourceSegment.f12991c));
                }
                if (ironSourceSegment.f12992d != -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ironSourceSegment.f12992d);
                    vector2.add(new Pair(IronSourceSegment.LEVEL, sb2.toString()));
                }
                if (ironSourceSegment.f12993e != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(ironSourceSegment.f12993e);
                    vector2.add(new Pair(IronSourceSegment.PAYING, sb3.toString()));
                }
                if (ironSourceSegment.f12994f != -1.0d) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(ironSourceSegment.f12994f);
                    vector2.add(new Pair(IronSourceSegment.IAPT, sb4.toString()));
                }
                if (ironSourceSegment.f12995g != 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(ironSourceSegment.f12995g);
                    vector2.add(new Pair(IronSourceSegment.USER_CREATION_DATE, sb5.toString()));
                }
                if (!TextUtils.isEmpty(ironSourceSegment.f12989a)) {
                    vector2.add(new Pair("segName", ironSourceSegment.f12989a));
                }
                vector2.addAll(ironSourceSegment.f12996h);
                vector = vector2;
            } else {
                vector = null;
            }
            String stringFromURL = HttpFunctions.getStringFromURL(ServerURL.getCPVProvidersURL(context, this.f12854j, str, str2, this.f12859o, vector), aVar);
            if (stringFromURL == null) {
                IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (IronSourceUtils.getSerr() == 1) {
                IronLog.INTERNAL.verbose("encrypt");
                String optString = new JSONObject(stringFromURL).optString(Payload.RESPONSE, (String) null);
                if (TextUtils.isEmpty(optString)) {
                    IronLog.INTERNAL.warning("encryptedResponse is empty - return null");
                    return null;
                }
                stringFromURL = IronSourceAES.decode(C5797g.m14321a().mo42123b(), optString);
                if (TextUtils.isEmpty(stringFromURL)) {
                    IronLog.INTERNAL.warning("encoded response invalid - return null");
                    if (!f12809aj) {
                        f12809aj = true;
                        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                        try {
                            mediationAdditionalData.put("status", "false");
                            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, 1);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C5645g.m13810e().mo41689b(new C5641c(114, mediationAdditionalData));
                    }
                    return null;
                }
            }
            C5800j jVar2 = new C5800j(context, this.f12854j, str, stringFromURL);
            try {
                if (jVar2.mo42127a()) {
                    return jVar2;
                }
                IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (Exception e2) {
                e = e2;
                jVar = jVar2;
                IronLog.INTERNAL.warning("exception = " + e);
                e.printStackTrace();
                return jVar;
            }
        } catch (Exception e3) {
            e = e3;
            IronLog.INTERNAL.warning("exception = " + e);
            e.printStackTrace();
            return jVar;
        }
    }

    /* renamed from: b */
    private static void m13273b(int i, JSONObject jSONObject) {
        C5642d.m13798e().mo41689b(new C5641c(i, jSONObject));
    }

    /* renamed from: b */
    private void m13274b(IronSource.AD_UNIT ad_unit) {
        int i = C55571.f12871a[ad_unit.ordinal()];
        if (i == 1) {
            m13278p();
        } else if (i == 2) {
            m13289v();
        } else if (i == 3) {
            this.f12848d.mo41508a(this.f12854j, this.f12855k);
        } else if (i == 4) {
            m13292w();
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [com.ironsource.mediationsdk.x] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.ironsource.mediationsdk.R] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.ironsource.mediationsdk.F] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13275n() {
        /*
            r10 = this;
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r10.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r2 = "Rewarded Video started in programmatic mode"
            r3 = 0
            r0.log(r1, r2, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
        L_0x0010:
            com.ironsource.mediationsdk.utils.j r1 = r10.f12853i
            com.ironsource.mediationsdk.model.o r1 = r1.f14011a
            java.util.ArrayList<java.lang.String> r1 = r1.f13782a
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x003c
            com.ironsource.mediationsdk.utils.j r1 = r10.f12853i
            com.ironsource.mediationsdk.model.o r1 = r1.f14011a
            java.util.ArrayList<java.lang.String> r1 = r1.f13782a
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0039
            com.ironsource.mediationsdk.utils.j r2 = r10.f12853i
            com.ironsource.mediationsdk.model.p r2 = r2.f14064b
            com.ironsource.mediationsdk.model.NetworkSettings r1 = r2.mo41985a((java.lang.String) r1)
            r5.add(r1)
        L_0x0039:
            int r0 = r0 + 1
            goto L_0x0010
        L_0x003c:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x00a4
            com.ironsource.mediationsdk.utils.j r0 = r10.f12853i
            com.ironsource.mediationsdk.model.i r0 = r0.f14083c
            com.ironsource.mediationsdk.model.q r0 = r0.f13744a
            com.ironsource.mediationsdk.utils.b r0 = r0.f13801k
            boolean r0 = r0.f13926n
            if (r0 == 0) goto L_0x0069
            com.ironsource.mediationsdk.F r0 = new com.ironsource.mediationsdk.F
            com.ironsource.mediationsdk.utils.j r1 = r10.f12853i
            com.ironsource.mediationsdk.model.i r1 = r1.f14083c
            com.ironsource.mediationsdk.model.q r6 = r1.f13744a
            java.lang.String r7 = r10.f12854j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.mediationsdk.utils.c r1 = com.ironsource.mediationsdk.utils.C5790c.m14278a()
            java.util.HashSet r9 = r1.mo42112b()
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0083
        L_0x0069:
            com.ironsource.mediationsdk.R r0 = new com.ironsource.mediationsdk.R
            com.ironsource.mediationsdk.utils.j r1 = r10.f12853i
            com.ironsource.mediationsdk.model.i r1 = r1.f14083c
            com.ironsource.mediationsdk.model.q r6 = r1.f13744a
            java.lang.String r7 = r10.f12854j
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()
            com.ironsource.mediationsdk.utils.c r1 = com.ironsource.mediationsdk.utils.C5790c.m14278a()
            java.util.HashSet r9 = r1.mo42112b()
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0083:
            r10.f12869y = r0
            java.lang.Boolean r0 = r10.f12862r
            if (r0 == 0) goto L_0x00cc
            com.ironsource.mediationsdk.x r1 = r10.f12869y
            android.content.Context r2 = r10.f12861q
            boolean r0 = r0.booleanValue()
            r1.mo41400a(r2, r0)
            java.lang.Boolean r0 = r10.f12862r
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00cc
            com.ironsource.mediationsdk.X r0 = r10.f12846b
            android.content.Context r1 = r10.f12861q
            r0.mo41319a((android.content.Context) r1, (boolean) r3)
            return
        L_0x00a4:
            int r0 = r10.f12817H
            r1 = 1
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r0)
            java.lang.Object[][] r2 = new java.lang.Object[r1][]
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "errorCode"
            r4[r3] = r5
            r5 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            r2[r3] = r4
            m13267a((org.json.JSONObject) r0, (java.lang.Object[][]) r2)
            r1 = 81314(0x13da2, float:1.13945E-40)
            m13260a((int) r1, (org.json.JSONObject) r0)
            com.ironsource.mediationsdk.IronSource$AD_UNIT r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            r10.m13262a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r0, (boolean) r3)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.m13275n():void");
    }

    /* renamed from: o */
    private void m13276o() {
        this.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f12853i.f14011a.f13782a.size(); i++) {
            String str = this.f12853i.f14011a.f13782a.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f12853i.f14064b.mo41985a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f12842af) {
                this.f12844ah = new C5744s(arrayList, this.f12853i.f14083c.f13744a, this.f12854j, this.f12855k);
            }
            if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
                m13262a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
                return;
            }
            Iterator<String> it = this.f12842af.iterator();
            while (it.hasNext()) {
                this.f12844ah.mo42025a(it.next(), (String) null, false);
            }
            this.f12842af.clear();
            return;
        }
        m13262a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: p */
    private Placement m13277p(String str) {
        C5734q qVar = this.f12853i.f14083c.f13744a;
        if (qVar != null) {
            Iterator<Placement> it = qVar.f13791a.iterator();
            while (it.hasNext()) {
                Placement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: p */
    private void m13278p() {
        NetworkSettings a;
        NetworkSettings a2;
        NetworkSettings a3;
        if (this.f12865u) {
            m13276o();
            return;
        }
        this.f12812C = this.f12853i.f14083c.f13744a.f13801k.f13913a;
        int i = this.f12853i.f14083c.f13744a.f13801k.f13926n ? 2 : 1;
        this.f12817H = i;
        m13260a((int) IronSourceConstants.TROUBLESHOOTING_RV_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f12812C, i));
        if (this.f12812C) {
            m13275n();
            return;
        }
        int i2 = this.f12853i.f14083c.f13744a.f13795e;
        for (int i3 = 0; i3 < this.f12853i.f14011a.f13782a.size(); i3++) {
            String str = this.f12853i.f14011a.f13782a.get(i3);
            if (!TextUtils.isEmpty(str) && (a3 = this.f12853i.f14064b.mo41985a(str)) != null) {
                C5626Y y = new C5626Y(a3, i2);
                if (m13270a((C5677b) y)) {
                    y.f13245s = this.f12846b;
                    y.f13502n = i3 + 1;
                    this.f12846b.mo41666a(y);
                }
            }
        }
        if (this.f12846b.f13261c.size() > 0) {
            this.f12846b.f13232n = this.f12853i.f14083c.f13744a.f13792b.f13720a;
            this.f12846b.f13260b = this.f12853i.f14083c.f13744a.f13793c;
            this.f12846b.f13233o = this.f12853i.f14083c.f13744a.f13798h;
            String b = this.f12853i.mo42128b();
            if (!TextUtils.isEmpty(b) && (a2 = this.f12853i.f14064b.mo41985a(b)) != null) {
                C5626Y y2 = new C5626Y(a2, i2);
                if (m13270a((C5677b) y2)) {
                    y2.f13245s = this.f12846b;
                    this.f12846b.mo41668b(y2);
                }
            }
            String c = this.f12853i.mo42129c();
            if (!TextUtils.isEmpty(c) && (a = this.f12853i.f14064b.mo41985a(c)) != null) {
                C5626Y y3 = new C5626Y(a, i2);
                if (m13270a((C5677b) y3)) {
                    y3.f13245s = this.f12846b;
                    this.f12846b.mo41669c(y3);
                }
            }
            this.f12846b.mo41638a(this.f12853i.f14083c.f13744a.f13799i);
            this.f12846b.mo41643a(this.f12854j, IronSourceUtils.getUserIdForNetworks());
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, this.f12817H);
        m13267a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m13260a((int) IronSourceConstants.TROUBLESHOOTING_RV_INIT_FAILED, mediationAdditionalData);
        m13262a(IronSource.AD_UNIT.REWARDED_VIDEO, false);
    }

    /* renamed from: q */
    private List<NetworkSettings> m13279q() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f12853i.f14011a.f13785d.size(); i++) {
            String str = this.f12853i.f14011a.f13785d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f12853i.f14064b.mo41985a(str));
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private void m13280q(String str) {
        Placement p = m13277p(str);
        if (p == null) {
            p = mo41368b();
        }
        if (p == null) {
            this.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showProgrammaticRewardedVideo error: empty default placement in response", 3);
            this.f12851g.onRewardedVideoAdShowFailed(new IronSourceError(1021, "showProgrammaticRewardedVideo error: empty default placement in response"));
            return;
        }
        this.f12869y.mo41405a(p);
    }

    /* renamed from: r */
    private Placement m13281r(String str) {
        Placement p = m13277p(str);
        if (p == null) {
            this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            p = mo41368b();
            if (p == null) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a = m13259a(p.getPlacementName(), C5790c.m14288b(ContextProvider.getInstance().getApplicationContext(), p));
        if (TextUtils.isEmpty(a)) {
            return p;
        }
        this.f12850f.log(IronSourceLogger.IronSourceTag.API, a, 1);
        this.f12851g.onRewardedVideoAdShowFailed(ErrorBuilder.buildCappedPerPlacementError(a));
        return null;
    }

    /* renamed from: r */
    private void m13282r() {
        this.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - object per waterfall", 0);
        List<NetworkSettings> q = m13279q();
        if (q.size() > 0) {
            C5672e eVar = new C5672e(q, this.f12853i.f14083c.f13745b, IronSourceUtils.getUserIdForNetworks(), this.f12853i.f14083c.f13745b.f13754f, C5790c.m14278a().mo42112b());
            this.f12811B = eVar;
            Boolean bool = this.f12862r;
            if (bool != null) {
                eVar.mo41787a(bool.booleanValue());
            }
            if (this.f12815F) {
                this.f12815F = false;
                this.f12811B.mo41785a();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m13267a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m13273b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m13262a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: s */
    private InterstitialPlacement m13283s(String str) {
        C5726j jVar = this.f12853i.f14083c.f13745b;
        if (jVar != null) {
            Iterator<InterstitialPlacement> it = jVar.f13749a.iterator();
            while (it.hasNext()) {
                InterstitialPlacement next = it.next();
                if (next.getPlacementName().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    private void m13284s() {
        this.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Adunit: Interstitial is now initiated - programmatic mode", 0);
        List<NetworkSettings> q = m13279q();
        if (q.size() > 0) {
            C5589O o = new C5589O(q, this.f12853i.f14083c.f13745b, this.f12854j, IronSourceUtils.getUserIdForNetworks(), this.f12853i.f14083c.f13745b.f13754f, C5790c.m14278a().mo42112b());
            this.f12870z = o;
            Boolean bool = this.f12862r;
            if (bool != null) {
                o.mo41557a(bool.booleanValue());
                if (this.f12862r.booleanValue()) {
                    this.f12847c.mo41319a(this.f12861q, false);
                }
            }
            if (this.f12815F) {
                this.f12815F = false;
                this.f12870z.mo41562d();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, true, 1);
        m13267a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m13273b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m13262a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: t */
    private void m13285t() {
        NetworkSettings a;
        C5726j jVar = this.f12853i.f14083c.f13745b;
        int i = jVar.f13753e;
        this.f12847c.f12790n.f13807b = jVar.f13754f;
        for (int i2 = 0; i2 < this.f12853i.f14011a.f13785d.size(); i2++) {
            String str = this.f12853i.f14011a.f13785d.get(i2);
            if (!TextUtils.isEmpty(str) && (a = this.f12853i.f14064b.mo41985a(str)) != null) {
                C5552C c = new C5552C(a, i);
                if (m13270a((C5677b) c)) {
                    c.f12802s = this.f12847c;
                    c.f13502n = i2 + 1;
                    this.f12847c.mo41666a(c);
                }
            }
        }
        if (this.f12847c.f13261c.size() > 0) {
            this.f12847c.f13260b = jVar.f13751c;
            this.f12847c.mo41326a(this.f12854j, IronSourceUtils.getUserIdForNetworks());
            if (this.f12815F) {
                this.f12815F = false;
                this.f12847c.mo41330c();
                return;
            }
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m13267a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m13273b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m13262a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: t */
    private void m13286t(String str) {
        String str2 = null;
        try {
            InterstitialPlacement s = m13283s(str);
            if (s == null) {
                s = mo41377e();
            }
            if (s != null) {
                str2 = s.getPlacementName();
            }
        } catch (Exception e) {
            this.f12850f.logException(IronSourceLogger.IronSourceTag.API, "showProgrammaticInterstitial()", e);
        }
        if (this.f12814E) {
            this.f12811B.mo41786a(str2);
        } else {
            this.f12870z.mo41556a(str2);
        }
    }

    /* renamed from: u */
    private InterstitialPlacement m13287u(String str) {
        InterstitialPlacement s = m13283s(str);
        if (s == null) {
            this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
            s = mo41377e();
            if (s == null) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                return null;
            }
        }
        String a = m13259a(s.getPlacementName(), m13291w(s.getPlacementName()));
        if (TextUtils.isEmpty(a)) {
            return s;
        }
        this.f12850f.log(IronSourceLogger.IronSourceTag.API, a, 1);
        this.f12851g.f13837e = s;
        this.f12851g.onInterstitialAdShowFailed(ErrorBuilder.buildCappedPerPlacementError(a));
        return null;
    }

    /* renamed from: u */
    private void m13288u() {
        this.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f12853i.f14011a.f13785d.size(); i++) {
            String str = this.f12853i.f14011a.f13785d.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f12853i.f14064b.mo41985a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f12841ae) {
                this.f12818I = new C5741q(arrayList, this.f12853i.f14083c.f13745b, this.f12854j, this.f12855k);
            }
            Iterator<String> it = this.f12841ae.iterator();
            while (it.hasNext()) {
                this.f12818I.mo42012a(it.next(), (String) null, false);
            }
            this.f12841ae.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m13267a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m13273b(IronSourceConstants.TROUBLESHOOTING_IS_INIT_FAILED, mediationAdditionalData);
        m13262a(IronSource.AD_UNIT.INTERSTITIAL, false);
    }

    /* renamed from: v */
    private void m13289v() {
        if (this.f12866v) {
            m13288u();
            return;
        }
        C5726j jVar = this.f12853i.f14083c.f13745b;
        this.f12813D = jVar.f13757i.f13913a;
        this.f12814E = jVar.f13757i.f13914b;
        m13273b(IronSourceConstants.TROUBLESHOOTING_IS_FORK, IronSourceUtils.getMediationAdditionalData(false, this.f12813D, 1));
        if (!this.f12813D) {
            m13285t();
        } else if (this.f12814E) {
            m13282r();
        } else {
            m13284s();
        }
    }

    /* renamed from: v */
    private static boolean m13290v(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    /* renamed from: w */
    private int m13291w(String str) {
        C5800j jVar = this.f12853i;
        if (jVar == null || jVar.f14083c == null || this.f12853i.f14083c.f13745b == null) {
            return C5790c.C5792a.f13939d;
        }
        InterstitialPlacement interstitialPlacement = null;
        try {
            interstitialPlacement = m13283s(str);
            if (interstitialPlacement == null && (interstitialPlacement = mo41377e()) == null) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return interstitialPlacement == null ? C5790c.C5792a.f13939d : C5790c.m14287b(ContextProvider.getInstance().getApplicationContext(), interstitialPlacement);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e4, code lost:
        return;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13292w() {
        /*
            r13 = this;
            boolean r0 = r13.f12833X
            if (r0 == 0) goto L_0x0008
            r13.m13294x()
            return
        L_0x0008:
            java.lang.Boolean r0 = r13.f12837aa
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.j r1 = r13.f12853i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.i r1 = r1.f14083c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f13747d     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.b r1 = r1.f13742g     // Catch:{ all -> 0x00e5 }
            boolean r1 = r1.f13913a     // Catch:{ all -> 0x00e5 }
            r13.f12816G = r1     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnProgrammatic = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            boolean r3 = r13.f12816G     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.logger.IronLog r1 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            java.lang.String r3 = "mIsBnLoadBeforeInitCompleted = "
            r2.<init>(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Boolean r3 = r13.f12837aa     // Catch:{ all -> 0x00e5 }
            r2.append(r3)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r1.verbose(r2)     // Catch:{ all -> 0x00e5 }
            r1 = 83000(0x14438, float:1.16308E-40)
            boolean r2 = r13.f12816G     // Catch:{ all -> 0x00e5 }
            r3 = 1
            r4 = 0
            org.json.JSONObject r2 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r2, r3)     // Catch:{ all -> 0x00e5 }
            m13273b(r1, r2)     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00e5 }
            r6.<init>()     // Catch:{ all -> 0x00e5 }
            r1 = 0
        L_0x0055:
            com.ironsource.mediationsdk.utils.j r2 = r13.f12853i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.o r2 = r2.f14011a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.f13786e     // Catch:{ all -> 0x00e5 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e5 }
            if (r1 >= r2) goto L_0x0083
            com.ironsource.mediationsdk.utils.j r2 = r13.f12853i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.o r2 = r2.f14011a     // Catch:{ all -> 0x00e5 }
            java.util.ArrayList<java.lang.String> r2 = r2.f13786e     // Catch:{ all -> 0x00e5 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00e5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00e5 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00e5 }
            if (r5 != 0) goto L_0x0080
            com.ironsource.mediationsdk.utils.j r5 = r13.f12853i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.p r5 = r5.f14064b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r5.mo41985a((java.lang.String) r2)     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x0080
            r6.add(r2)     // Catch:{ all -> 0x00e5 }
        L_0x0080:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0083:
            int r1 = r6.size()     // Catch:{ all -> 0x00e5 }
            if (r1 <= 0) goto L_0x00bc
            boolean r1 = r13.f12816G     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x0092
            r13.m13266a((java.util.ArrayList<com.ironsource.mediationsdk.model.NetworkSettings>) r6)     // Catch:{ all -> 0x00e5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x0092:
            com.ironsource.mediationsdk.utils.j r1 = r13.f12853i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.i r1 = r1.f14083c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f13747d     // Catch:{ all -> 0x00e5 }
            long r9 = r1.f13737b     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.j r1 = r13.f12853i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.i r1 = r1.f14083c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f13747d     // Catch:{ all -> 0x00e5 }
            int r11 = r1.f13740e     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.utils.j r1 = r13.f12853i     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.i r1 = r1.f14083c     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.model.g r1 = r1.f13747d     // Catch:{ all -> 0x00e5 }
            int r12 = r1.f13741f     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.j r1 = new com.ironsource.mediationsdk.j     // Catch:{ all -> 0x00e5 }
            java.lang.String r7 = r13.f12854j     // Catch:{ all -> 0x00e5 }
            java.lang.String r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getUserIdForNetworks()     // Catch:{ all -> 0x00e5 }
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x00e5 }
            r13.f12849e = r1     // Catch:{ all -> 0x00e5 }
            r13.m13295y()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e3
        L_0x00bc:
            boolean r1 = r13.f12816G     // Catch:{ all -> 0x00e5 }
            org.json.JSONObject r1 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r4, r1, r3)     // Catch:{ all -> 0x00e5 }
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x00e5 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00e5 }
            java.lang.String r6 = "errorCode"
            r5[r4] = r6     // Catch:{ all -> 0x00e5 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e5 }
            r5[r3] = r6     // Catch:{ all -> 0x00e5 }
            r2[r4] = r5     // Catch:{ all -> 0x00e5 }
            m13267a((org.json.JSONObject) r1, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x00e5 }
            r2 = 83314(0x14572, float:1.16748E-40)
            m13273b(r2, r1)     // Catch:{ all -> 0x00e5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00e5 }
            r13.m13262a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r1, (boolean) r4)     // Catch:{ all -> 0x00e5 }
        L_0x00e3:
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            return
        L_0x00e5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e5 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.m13292w():void");
    }

    /* renamed from: x */
    private C5724h m13293x(String str) {
        C5723g gVar = this.f12853i.f14083c.f13747d;
        if (gVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return gVar.mo41973a();
        }
        C5724h a = gVar.mo41974a(str);
        return a != null ? a : gVar.mo41973a();
    }

    /* renamed from: x */
    private void m13294x() {
        this.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f12853i.f14011a.f13786e.size(); i++) {
            String str = this.f12853i.f14011a.f13786e.get(i);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(this.f12853i.f14064b.mo41985a(str));
            }
        }
        if (arrayList.size() > 0) {
            synchronized (this.f12843ag) {
                this.f12819J = new C5738o(arrayList, this.f12853i.f14083c.f13747d, this.f12854j, this.f12855k);
            }
            this.f12843ag.clear();
            return;
        }
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false, false, 1);
        m13267a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}});
        m13273b(IronSourceConstants.TROUBLESHOOTING_BN_INIT_FAILED, mediationAdditionalData);
        m13262a(IronSource.AD_UNIT.BANNER, false);
    }

    /* renamed from: y */
    private void m13295y() {
        if (this.f12837aa.booleanValue()) {
            this.f12837aa = Boolean.FALSE;
            mo41364a(this.f12838ab, this.f12839ac);
            this.f12838ab = null;
            this.f12839ac = null;
        }
    }

    /* renamed from: z */
    private boolean m13296z() {
        C5800j jVar = this.f12853i;
        return (jVar == null || jVar.f14083c == null || this.f12853i.f14083c.f13747d == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02e4, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0262  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ironsource.mediationsdk.utils.C5800j mo41358a(android.content.Context r9, java.lang.String r10, com.ironsource.mediationsdk.C5556E.C5558a r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f12825P
            monitor-enter(r0)
            com.ironsource.mediationsdk.utils.j r1 = r8.f12853i     // Catch:{ all -> 0x02e5 }
            if (r1 == 0) goto L_0x0010
            com.ironsource.mediationsdk.utils.j r9 = new com.ironsource.mediationsdk.utils.j     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.utils.j r10 = r8.f12853i     // Catch:{ all -> 0x02e5 }
            r9.<init>(r10)     // Catch:{ all -> 0x02e5 }
            monitor-exit(r0)     // Catch:{ all -> 0x02e5 }
            return r9
        L_0x0010:
            com.ironsource.mediationsdk.utils.j r11 = r8.m13272b((android.content.Context) r9, (java.lang.String) r10, (com.ironsource.mediationsdk.C5556E.C5558a) r11)     // Catch:{ all -> 0x02e5 }
            r1 = 1
            r2 = 0
            if (r11 == 0) goto L_0x001e
            boolean r3 = r11.mo42127a()     // Catch:{ all -> 0x02e5 }
            if (r3 != 0) goto L_0x009e
        L_0x001e:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x02e5 }
            java.lang.String r4 = "Null or invalid response. Trying to get cached response"
            r11.log(r3, r4, r2)     // Catch:{ all -> 0x02e5 }
            r11 = 0
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isInitResponseCached(r9)     // Catch:{ all -> 0x02e5 }
            if (r3 == 0) goto L_0x009e
            java.lang.String r3 = "appKey"
            java.lang.String r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(r9, r3)     // Catch:{ all -> 0x02e5 }
            java.lang.String r4 = "userId"
            java.lang.String r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(r9, r4)     // Catch:{ all -> 0x02e5 }
            java.lang.String r5 = "response"
            java.lang.String r5 = com.ironsource.mediationsdk.utils.IronSourceUtils.getCachedValueByKeyOfCachedInitResponse(r9, r5)     // Catch:{ all -> 0x02e5 }
            java.lang.String r6 = r8.f12854j     // Catch:{ all -> 0x02e5 }
            if (r6 == 0) goto L_0x009e
            java.lang.String r6 = r8.f12854j     // Catch:{ all -> 0x02e5 }
            boolean r6 = r3.equals(r6)     // Catch:{ all -> 0x02e5 }
            if (r6 == 0) goto L_0x009e
            boolean r10 = r4.equals(r10)     // Catch:{ all -> 0x02e5 }
            if (r10 == 0) goto L_0x009e
            com.ironsource.mediationsdk.utils.j r10 = new com.ironsource.mediationsdk.utils.j     // Catch:{ all -> 0x02e5 }
            r10.<init>(r9, r3, r4, r5)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(r3, r4)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r8.f12850f     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x02e5 }
            java.lang.String r5 = r11.toString()     // Catch:{ all -> 0x02e5 }
            r3.log(r4, r5, r1)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r8.f12850f     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x02e5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e5 }
            r5.<init>()     // Catch:{ all -> 0x02e5 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x02e5 }
            r5.append(r11)     // Catch:{ all -> 0x02e5 }
            java.lang.String r11 = ": "
            r5.append(r11)     // Catch:{ all -> 0x02e5 }
            java.lang.String r11 = r10.toString()     // Catch:{ all -> 0x02e5 }
            r5.append(r11)     // Catch:{ all -> 0x02e5 }
            java.lang.String r11 = r5.toString()     // Catch:{ all -> 0x02e5 }
            r3.log(r4, r11, r1)     // Catch:{ all -> 0x02e5 }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.c r3 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x02e5 }
            r4 = 140(0x8c, float:1.96E-43)
            r3.<init>(r4, r11)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            r11.mo41689b((com.ironsource.mediationsdk.p137a.C5641c) r3)     // Catch:{ all -> 0x02e5 }
            r11 = r10
        L_0x009e:
            if (r11 == 0) goto L_0x02e3
            r8.f12853i = r11     // Catch:{ all -> 0x02e5 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveLastResponse(r9, r10)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.utils.j r10 = r8.f12853i     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.logger.b r3 = r8.f12852h     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.i r4 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.sdk.g.d r4 = r4.f13748e     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.f r4 = r4.mo42549a()     // Catch:{ all -> 0x02e5 }
            int r4 = r4.f13733a     // Catch:{ all -> 0x02e5 }
            r3.setDebugLevel(r4)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r8.f12850f     // Catch:{ all -> 0x02e5 }
            java.lang.String r4 = "console"
            com.ironsource.mediationsdk.model.i r5 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.sdk.g.d r5 = r5.f13748e     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.f r5 = r5.mo42549a()     // Catch:{ all -> 0x02e5 }
            int r5 = r5.f13734b     // Catch:{ all -> 0x02e5 }
            r3.setLoggerDebugLevel(r4, r5)     // Catch:{ all -> 0x02e5 }
            boolean r3 = r8.mo41376d()     // Catch:{ all -> 0x02e5 }
            if (r3 == 0) goto L_0x00da
            com.ironsource.mediationsdk.model.i r3 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.q r3 = r3.f13744a     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.d r3 = r3.f13792b     // Catch:{ all -> 0x02e5 }
            boolean r3 = r3.f13721b     // Catch:{ all -> 0x02e5 }
            goto L_0x00db
        L_0x00da:
            r3 = 0
        L_0x00db:
            boolean r4 = r8.mo41383h()     // Catch:{ all -> 0x02e5 }
            if (r4 == 0) goto L_0x00ea
            com.ironsource.mediationsdk.model.i r4 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.j r4 = r4.f13745b     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.d r4 = r4.f13750b     // Catch:{ all -> 0x02e5 }
            boolean r4 = r4.f13721b     // Catch:{ all -> 0x02e5 }
            goto L_0x00eb
        L_0x00ea:
            r4 = 0
        L_0x00eb:
            boolean r5 = r8.m13296z()     // Catch:{ all -> 0x02e5 }
            if (r5 == 0) goto L_0x00fa
            com.ironsource.mediationsdk.model.i r5 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.g r5 = r5.f13747d     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.d r5 = r5.f13736a     // Catch:{ all -> 0x02e5 }
            boolean r5 = r5.f13721b     // Catch:{ all -> 0x02e5 }
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            boolean r6 = r8.mo41384i()     // Catch:{ all -> 0x02e5 }
            if (r6 == 0) goto L_0x010a
            com.ironsource.mediationsdk.model.i r6 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.k r6 = r6.f13746c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.d r6 = r6.f13761c     // Catch:{ all -> 0x02e5 }
            boolean r6 = r6.f13721b     // Catch:{ all -> 0x02e5 }
            goto L_0x010b
        L_0x010a:
            r6 = 0
        L_0x010b:
            if (r3 == 0) goto L_0x017c
            com.ironsource.mediationsdk.model.i r3 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.q r3 = r3.f13744a     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.d r3 = r3.f13792b     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            java.lang.String r7 = r3.f13724e     // Catch:{ all -> 0x02e5 }
            r6.mo41690b((java.lang.String) r7, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            java.lang.String r7 = r3.f13723d     // Catch:{ all -> 0x02e5 }
            r6.mo41681a((java.lang.String) r7, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int r7 = r3.f13726g     // Catch:{ all -> 0x02e5 }
            r6.mo41688b((int) r7)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int r7 = r3.f13727h     // Catch:{ all -> 0x02e5 }
            r6.mo41694c((int) r7)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int r7 = r3.f13725f     // Catch:{ all -> 0x02e5 }
            r6.mo41678a((int) r7)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int[] r7 = r3.f13728i     // Catch:{ all -> 0x02e5 }
            r6.mo41684a((int[]) r7, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int[] r7 = r3.f13729j     // Catch:{ all -> 0x02e5 }
            r6.mo41692b((int[]) r7, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int[] r7 = r3.f13730k     // Catch:{ all -> 0x02e5 }
            r6.mo41695c(r7, r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int[] r7 = r3.f13731l     // Catch:{ all -> 0x02e5 }
            r6.mo41699d(r7, r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.i r7 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.sdk.g.d r7 = r7.f13748e     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.r r7 = r7.mo42550b()     // Catch:{ all -> 0x02e5 }
            r6.mo41680a((com.ironsource.mediationsdk.model.C5735r) r7)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            boolean r3 = r3.f13722c     // Catch:{ all -> 0x02e5 }
        L_0x0179:
            r6.f13300c = r3     // Catch:{ all -> 0x02e5 }
            goto L_0x01f1
        L_0x017c:
            if (r6 == 0) goto L_0x01eb
            com.ironsource.mediationsdk.model.i r3 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.k r3 = r3.f13746c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.d r3 = r3.f13761c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            java.lang.String r7 = r3.f13724e     // Catch:{ all -> 0x02e5 }
            r6.mo41690b((java.lang.String) r7, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            java.lang.String r7 = r3.f13723d     // Catch:{ all -> 0x02e5 }
            r6.mo41681a((java.lang.String) r7, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int r7 = r3.f13726g     // Catch:{ all -> 0x02e5 }
            r6.mo41688b((int) r7)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int r7 = r3.f13727h     // Catch:{ all -> 0x02e5 }
            r6.mo41694c((int) r7)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int r7 = r3.f13725f     // Catch:{ all -> 0x02e5 }
            r6.mo41678a((int) r7)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int[] r7 = r3.f13728i     // Catch:{ all -> 0x02e5 }
            r6.mo41684a((int[]) r7, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int[] r7 = r3.f13729j     // Catch:{ all -> 0x02e5 }
            r6.mo41692b((int[]) r7, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int[] r7 = r3.f13730k     // Catch:{ all -> 0x02e5 }
            r6.mo41695c(r7, r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            int[] r7 = r3.f13731l     // Catch:{ all -> 0x02e5 }
            r6.mo41699d(r7, r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.i r7 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.sdk.g.d r7 = r7.f13748e     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.r r7 = r7.mo42550b()     // Catch:{ all -> 0x02e5 }
            r6.mo41680a((com.ironsource.mediationsdk.model.C5735r) r7)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r6 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            boolean r3 = r3.f13722c     // Catch:{ all -> 0x02e5 }
            goto L_0x0179
        L_0x01eb:
            com.ironsource.mediationsdk.a.g r3 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            r3.f13303f = r2     // Catch:{ all -> 0x02e5 }
        L_0x01f1:
            if (r4 == 0) goto L_0x0262
            com.ironsource.mediationsdk.model.i r2 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.j r2 = r2.f13745b     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.d r2 = r2.f13750b     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            java.lang.String r4 = r2.f13724e     // Catch:{ all -> 0x02e5 }
            r3.mo41690b((java.lang.String) r4, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            java.lang.String r4 = r2.f13723d     // Catch:{ all -> 0x02e5 }
            r3.mo41681a((java.lang.String) r4, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int r4 = r2.f13726g     // Catch:{ all -> 0x02e5 }
            r3.mo41688b((int) r4)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int r4 = r2.f13727h     // Catch:{ all -> 0x02e5 }
            r3.mo41694c((int) r4)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int r4 = r2.f13725f     // Catch:{ all -> 0x02e5 }
            r3.mo41678a((int) r4)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int[] r4 = r2.f13728i     // Catch:{ all -> 0x02e5 }
            r3.mo41684a((int[]) r4, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int[] r4 = r2.f13729j     // Catch:{ all -> 0x02e5 }
            r3.mo41692b((int[]) r4, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int[] r4 = r2.f13730k     // Catch:{ all -> 0x02e5 }
            r3.mo41695c(r4, r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int[] r4 = r2.f13731l     // Catch:{ all -> 0x02e5 }
            r3.mo41699d(r4, r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r9 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.i r10 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.sdk.g.d r10 = r10.f13748e     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.r r10 = r10.mo42550b()     // Catch:{ all -> 0x02e5 }
            r9.mo41680a((com.ironsource.mediationsdk.model.C5735r) r10)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r9 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            boolean r10 = r2.f13722c     // Catch:{ all -> 0x02e5 }
        L_0x025f:
            r9.f13300c = r10     // Catch:{ all -> 0x02e5 }
            goto L_0x02d7
        L_0x0262:
            if (r5 == 0) goto L_0x02d1
            com.ironsource.mediationsdk.model.i r2 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.g r2 = r2.f13747d     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.d r2 = r2.f13736a     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            java.lang.String r4 = r2.f13724e     // Catch:{ all -> 0x02e5 }
            r3.mo41690b((java.lang.String) r4, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            java.lang.String r4 = r2.f13723d     // Catch:{ all -> 0x02e5 }
            r3.mo41681a((java.lang.String) r4, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int r4 = r2.f13726g     // Catch:{ all -> 0x02e5 }
            r3.mo41688b((int) r4)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int r4 = r2.f13727h     // Catch:{ all -> 0x02e5 }
            r3.mo41694c((int) r4)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int r4 = r2.f13725f     // Catch:{ all -> 0x02e5 }
            r3.mo41678a((int) r4)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int[] r4 = r2.f13728i     // Catch:{ all -> 0x02e5 }
            r3.mo41684a((int[]) r4, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int[] r4 = r2.f13729j     // Catch:{ all -> 0x02e5 }
            r3.mo41692b((int[]) r4, (android.content.Context) r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int[] r4 = r2.f13730k     // Catch:{ all -> 0x02e5 }
            r3.mo41695c(r4, r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            int[] r4 = r2.f13731l     // Catch:{ all -> 0x02e5 }
            r3.mo41699d(r4, r9)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r9 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.i r10 = r10.f14083c     // Catch:{ all -> 0x02e5 }
            com.ironsource.sdk.g.d r10 = r10.f13748e     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.model.r r10 = r10.mo42550b()     // Catch:{ all -> 0x02e5 }
            r9.mo41680a((com.ironsource.mediationsdk.model.C5735r) r10)     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.d r9 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            boolean r10 = r2.f13722c     // Catch:{ all -> 0x02e5 }
            goto L_0x025f
        L_0x02d1:
            com.ironsource.mediationsdk.a.d r9 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            r9.f13303f = r2     // Catch:{ all -> 0x02e5 }
        L_0x02d7:
            com.ironsource.mediationsdk.a.d r9 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x02e5 }
            r9.f13298a = r1     // Catch:{ all -> 0x02e5 }
            com.ironsource.mediationsdk.a.g r9 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x02e5 }
            r9.f13298a = r1     // Catch:{ all -> 0x02e5 }
        L_0x02e3:
            monitor-exit(r0)     // Catch:{ all -> 0x02e5 }
            return r11
        L_0x02e5:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02e5 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41358a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.E$a):com.ironsource.mediationsdk.utils.j");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized void mo41359a(android.app.Activity r9, com.ironsource.mediationsdk.IronSourceBannerLayout r10, java.lang.String r11, java.lang.String r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 3
            if (r12 != 0) goto L_0x0012
            java.lang.String r9 = "adm cannot be null"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r10 = r8.f12850f     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x000f }
            r10.log(r11, r9, r0)     // Catch:{ all -> 0x000f }
            monitor-exit(r8)
            return
        L_0x000f:
            r9 = move-exception
            goto L_0x0258
        L_0x0012:
            r1 = 510(0x1fe, float:7.15E-43)
            boolean r2 = r8.f12835Z     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x002b
            java.lang.String r9 = "initISDemandOnly() must be called before loadISDemandOnlyBannerWithAdm()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f12850f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0240 }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x0240 }
            r10.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x002b:
            boolean r2 = r8.f12833X     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x0042
            java.lang.String r9 = "Banner was initialized in mediation mode. Use loadBanner instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f12850f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0240 }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x0240 }
            r10.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x0042:
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L_0x004e
            com.ironsource.environment.ContextProvider r4 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0240 }
            r4.updateActivity(r9)     // Catch:{ all -> 0x0240 }
            goto L_0x007b
        L_0x004e:
            com.ironsource.environment.ContextProvider r9 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0240 }
            android.app.Activity r9 = r9.getCurrentActiveActivity()     // Catch:{ all -> 0x0240 }
            if (r9 != 0) goto L_0x007b
            if (r12 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r2 = 1
        L_0x005c:
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r2, r3)     // Catch:{ all -> 0x0240 }
            r11 = 83321(0x14579, float:1.16758E-40)
            m13273b(r11, r9)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "Banner was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f12850f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            r11.log(r12, r9, r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0240 }
            r12 = 1062(0x426, float:1.488E-42)
            r11.<init>(r12, r9)     // Catch:{ all -> 0x0240 }
            r10.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x007b:
            com.ironsource.mediationsdk.I r9 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.I$a r9 = r9.mo41447b()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.I$a r4 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_FAILED     // Catch:{ all -> 0x0240 }
            if (r9 != r4) goto L_0x009d
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f12850f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "init() had failed"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x009d:
            com.ironsource.mediationsdk.I$a r4 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0240 }
            r5 = 83004(0x1443c, float:1.16313E-40)
            if (r9 != r4) goto L_0x00db
            com.ironsource.mediationsdk.I r9 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x0240 }
            boolean r9 = r9.mo41449c()     // Catch:{ all -> 0x0240 }
            if (r9 == 0) goto L_0x00c4
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f12850f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "init() had failed"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "init() had failed"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x00c4:
            java.lang.Boolean r9 = r8.f12837aa     // Catch:{ all -> 0x0240 }
            monitor-enter(r9)     // Catch:{ all -> 0x0240 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r8.f12843ag     // Catch:{ all -> 0x00d8 }
            r0.add(r11)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d8 }
            if (r12 == 0) goto L_0x00d6
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x0240 }
            m13273b(r5, r9)     // Catch:{ all -> 0x0240 }
        L_0x00d6:
            monitor-exit(r8)
            return
        L_0x00d8:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d8 }
            throw r11     // Catch:{ all -> 0x0240 }
        L_0x00db:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r9 = r8.f12843ag     // Catch:{ all -> 0x0240 }
            monitor-enter(r9)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.o r4 = r8.f12819J     // Catch:{ all -> 0x023d }
            if (r4 != 0) goto L_0x00f3
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r8.f12843ag     // Catch:{ all -> 0x023d }
            r0.add(r11)     // Catch:{ all -> 0x023d }
            if (r12 == 0) goto L_0x00f0
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x023d }
            m13273b(r5, r11)     // Catch:{ all -> 0x023d }
        L_0x00f0:
            monitor-exit(r9)     // Catch:{ all -> 0x023d }
            monitor-exit(r8)
            return
        L_0x00f3:
            monitor-exit(r9)     // Catch:{ all -> 0x023d }
            boolean r9 = r8.m13296z()     // Catch:{ all -> 0x0240 }
            if (r9 != 0) goto L_0x0110
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f12850f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "No Banner configurations found"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "the server response does not contain Banner data"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
            monitor-exit(r8)
            return
        L_0x0110:
            if (r12 == 0) goto L_0x0227
            com.ironsource.mediationsdk.o r9 = r8.f12819J     // Catch:{ all -> 0x0240 }
            r9.f13814b = r10     // Catch:{ all -> 0x0240 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.p> r0 = r9.f13815c     // Catch:{ all -> 0x0240 }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x0134
            r12 = 3503(0xdaf, float:4.909E-42)
            com.ironsource.mediationsdk.C5738o.m14128a((int) r12, (java.lang.String) r11)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f13814b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f13814b     // Catch:{ all -> 0x0240 }
        L_0x012f:
            r9.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            goto L_0x023b
        L_0x0134:
            r0 = 3504(0xdb0, float:4.91E-42)
            if (r10 != 0) goto L_0x013c
        L_0x0138:
            com.ironsource.mediationsdk.C5738o.m14128a((int) r0, (java.lang.String) r11)     // Catch:{ all -> 0x0240 }
            goto L_0x0144
        L_0x013c:
            boolean r4 = r10.isDestroyed()     // Catch:{ all -> 0x0240 }
            if (r4 == 0) goto L_0x0143
            goto L_0x0138
        L_0x0143:
            r2 = 1
        L_0x0144:
            if (r2 != 0) goto L_0x0153
            java.lang.String r11 = "validateBannerLayout fail"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildGenericError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f13814b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f13814b     // Catch:{ all -> 0x0240 }
            goto L_0x012f
        L_0x0153:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.p> r0 = r9.f13815c     // Catch:{ all -> 0x0240 }
            java.lang.Object r11 = r0.get(r11)     // Catch:{ all -> 0x0240 }
            r2 = r11
            com.ironsource.mediationsdk.p r2 = (com.ironsource.mediationsdk.C5739p) r2     // Catch:{ all -> 0x0240 }
            r9.f13813a = r2     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x0176
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm smash is no exist"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r12.error(r0)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f13814b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f13814b     // Catch:{ all -> 0x0240 }
            goto L_0x012f
        L_0x0176:
            boolean r11 = r2.mo42106i()     // Catch:{ all -> 0x0240 }
            r0 = 3300(0xce4, float:4.624E-42)
            if (r11 != 0) goto L_0x0198
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm in IAB flow must be called by bidder instances"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r3 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r12.error(r3)     // Catch:{ all -> 0x0240 }
            r12 = 0
            com.ironsource.mediationsdk.C5738o.m14127a((int) r0, (com.ironsource.mediationsdk.C5739p) r2, (java.lang.Object[][]) r12)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f13814b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x023b
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f13814b     // Catch:{ all -> 0x0240 }
            goto L_0x012f
        L_0x0198:
            com.ironsource.mediationsdk.C5690e.m13999a()     // Catch:{ all -> 0x0240 }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.C5690e.m14002a((java.lang.String) r12)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.e$a r12 = new com.ironsource.mediationsdk.e$a     // Catch:{ all -> 0x0240 }
            r12.<init>()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.C5690e.m13999a()     // Catch:{ Exception -> 0x01ac }
            com.ironsource.mediationsdk.e$a r12 = com.ironsource.mediationsdk.C5690e.m13998a((org.json.JSONObject) r11)     // Catch:{ Exception -> 0x01ac }
            goto L_0x01d5
        L_0x01ac:
            r11 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = "loadISDemandOnlyBannerWithAdm: unable to get auction data from response. Exception="
            r3.<init>(r4)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch:{ all -> 0x0240 }
            r3.append(r11)     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r3.error(r4)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r9.f13814b     // Catch:{ all -> 0x0240 }
            if (r3 == 0) goto L_0x01d5
            com.ironsource.mediationsdk.IronSourceBannerLayout r3 = r9.f13814b     // Catch:{ all -> 0x0240 }
            r3.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
        L_0x01d5:
            com.ironsource.mediationsdk.C5690e.m13999a()     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = r2.mo42101d()     // Catch:{ all -> 0x0240 }
            java.util.List<com.ironsource.mediationsdk.server.b> r3 = r12.f13547b     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.server.b r11 = com.ironsource.mediationsdk.C5690e.m14000a((java.lang.String) r11, (java.util.List<com.ironsource.mediationsdk.server.C5782b>) r3)     // Catch:{ all -> 0x0240 }
            if (r11 == 0) goto L_0x020b
            java.lang.String r0 = r11.mo42083b()     // Catch:{ all -> 0x0240 }
            r2.mo42096a((java.lang.String) r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r0 = r12.f13546a     // Catch:{ all -> 0x0240 }
            r2.mo42100b(r0)     // Catch:{ all -> 0x0240 }
            org.json.JSONObject r0 = r12.f13549d     // Catch:{ all -> 0x0240 }
            r2.mo42098a((org.json.JSONObject) r0)     // Catch:{ all -> 0x0240 }
            r0 = 3002(0xbba, float:4.207E-42)
            r9.mo41993a((int) r0, (com.ironsource.mediationsdk.C5739p) r2)     // Catch:{ all -> 0x0240 }
            java.lang.String r4 = r11.mo42083b()     // Catch:{ all -> 0x0240 }
            java.lang.String r5 = r12.f13546a     // Catch:{ all -> 0x0240 }
            org.json.JSONObject r6 = r12.f13549d     // Catch:{ all -> 0x0240 }
            java.util.List r7 = r11.mo42085d()     // Catch:{ all -> 0x0240 }
            r3 = r10
            r2.mo42003a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0240 }
            goto L_0x023b
        L_0x020b:
            java.lang.String r11 = "loadISDemandOnlyBannerWithAdm invalid enriched adm"
            com.ironsource.mediationsdk.logger.IronSourceError r11 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r11)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronLog r12 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0240 }
            java.lang.String r3 = r11.getErrorMessage()     // Catch:{ all -> 0x0240 }
            r12.error(r3)     // Catch:{ all -> 0x0240 }
            r9.mo41993a((int) r0, (com.ironsource.mediationsdk.C5739p) r2)     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.IronSourceBannerLayout r12 = r9.f13814b     // Catch:{ all -> 0x0240 }
            if (r12 == 0) goto L_0x0256
            com.ironsource.mediationsdk.IronSourceBannerLayout r9 = r9.f13814b     // Catch:{ all -> 0x0240 }
            r9.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x0240 }
            goto L_0x0256
        L_0x0227:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f12850f     // Catch:{ all -> 0x0240 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r11 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0240 }
            java.lang.String r12 = "Banner support bidding mode only"
            r9.log(r11, r12, r0)     // Catch:{ all -> 0x0240 }
            java.lang.String r9 = "Banner support bidding mode only"
            java.lang.String r11 = "Banner"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r11)     // Catch:{ all -> 0x0240 }
            r10.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x0240 }
        L_0x023b:
            monitor-exit(r8)
            return
        L_0x023d:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x023d }
            throw r11     // Catch:{ all -> 0x0240 }
        L_0x0240:
            r9 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r11 = r8.f12850f     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r12 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x000f }
            java.lang.String r0 = "loadDemandOnlyBanner"
            r11.logException(r12, r0, r9)     // Catch:{ all -> 0x000f }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x000f }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x000f }
            r11.<init>(r1, r9)     // Catch:{ all -> 0x000f }
            r10.mo41464a((com.ironsource.mediationsdk.logger.IronSourceError) r11)     // Catch:{ all -> 0x000f }
        L_0x0256:
            monitor-exit(r8)
            return
        L_0x0258:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41359a(android.app.Activity, com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo41360a(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f12850f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C5607V.m13667a().mo41612a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
            return;
        }
        mo41369b(activity, str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41361a(android.content.Context r8, java.lang.String r9, com.ironsource.mediationsdk.sdk.C5750f r10, com.ironsource.mediationsdk.IronSource.AD_UNIT... r11) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00f5 }
            r10.<init>()     // Catch:{ all -> 0x00f5 }
            r0 = 1
            if (r11 == 0) goto L_0x008a
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x000e
            goto L_0x008a
        L_0x000e:
            int r1 = r11.length     // Catch:{ all -> 0x00f5 }
            r2 = 0
        L_0x0010:
            if (r2 >= r1) goto L_0x00bd
            r3 = r11[r2]     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0036
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r7.f12850f     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r6.<init>()     // Catch:{ all -> 0x00f5 }
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = " ad unit cannot be initialized in demand only mode"
            r6.append(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x00f5 }
            r6 = 3
            r4.log(r5, r3, r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x0036:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0051
            boolean r4 = r7.f12867w     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0046
            r7.m13261a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0051
        L_0x0046:
            r7.f12866v = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0051
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0051:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x006c
            boolean r4 = r7.f12834Y     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0061
            r7.m13261a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x006c
        L_0x0061:
            r7.f12865u = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x006c
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x006c:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x0087
            boolean r4 = r7.f12835Z     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x007c
            r7.m13261a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x0087
        L_0x007c:
            r7.f12833X = r0     // Catch:{ all -> 0x00f5 }
            boolean r4 = r10.contains(r3)     // Catch:{ all -> 0x00f5 }
            if (r4 != 0) goto L_0x0087
            r10.add(r3)     // Catch:{ all -> 0x00f5 }
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x008a:
            boolean r11 = r7.f12834Y     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x0094
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r7.m13261a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x009b
        L_0x0094:
            r7.f12865u = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x009b:
            boolean r11 = r7.f12867w     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00a5
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r7.m13261a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ac
        L_0x00a5:
            r7.f12866v = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00ac:
            boolean r11 = r7.f12835Z     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00b6
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r7.m13261a((com.ironsource.mediationsdk.IronSource.AD_UNIT) r11)     // Catch:{ all -> 0x00f5 }
            goto L_0x00bd
        L_0x00b6:
            r7.f12833X = r0     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r11 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x00f5 }
            r10.add(r11)     // Catch:{ all -> 0x00f5 }
        L_0x00bd:
            if (r8 == 0) goto L_0x00d8
            boolean r11 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x00f5 }
            if (r11 == 0) goto L_0x00cd
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            r0 = r8
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x00f5 }
            r11.updateActivity(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00cd:
            com.ironsource.environment.ContextProvider r11 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x00f5 }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ all -> 0x00f5 }
            r11.updateAppContext(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00d8:
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            if (r11 <= 0) goto L_0x00f3
            int r11 = r10.size()     // Catch:{ all -> 0x00f5 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r11 = new com.ironsource.mediationsdk.IronSource.AD_UNIT[r11]     // Catch:{ all -> 0x00f5 }
            java.lang.Object[] r10 = r10.toArray(r11)     // Catch:{ all -> 0x00f5 }
            r5 = r10
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r5 = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r5     // Catch:{ all -> 0x00f5 }
            r3 = 1
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.mo41362a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r7)
            return
        L_0x00f5:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41361a(android.content.Context, java.lang.String, com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085 A[Catch:{ Exception -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad A[Catch:{ Exception -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1 A[Catch:{ Exception -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1 A[Catch:{ Exception -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0143 A[Catch:{ Exception -> 0x021a }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0181 A[SYNTHETIC, Splitter:B:64:0x0181] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41362a(android.content.Context r9, java.lang.String r10, boolean r11, com.ironsource.mediationsdk.sdk.C5750f r12, com.ironsource.mediationsdk.IronSource.AD_UNIT... r13) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x026f }
            java.lang.String r1 = ""
            r0.verbose(r1)     // Catch:{ all -> 0x026f }
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f12826Q     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x025c
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f12826Q     // Catch:{ all -> 0x026f }
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r2, r1)     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x025c
            r8.f12840ad = r12     // Catch:{ all -> 0x026f }
            if (r13 == 0) goto L_0x004f
            int r12 = r13.length     // Catch:{ all -> 0x026f }
            if (r12 != 0) goto L_0x001e
            goto L_0x004f
        L_0x001e:
            int r12 = r13.length     // Catch:{ all -> 0x026f }
            r0 = 0
        L_0x0020:
            if (r0 >= r12) goto L_0x0067
            r3 = r13[r0]     // Catch:{ all -> 0x026f }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.f12829T     // Catch:{ all -> 0x026f }
            r4.add(r3)     // Catch:{ all -> 0x026f }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r4 = r8.f12830U     // Catch:{ all -> 0x026f }
            r4.add(r3)     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x026f }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x026f }
            if (r4 == 0) goto L_0x0038
            r8.f12867w = r2     // Catch:{ all -> 0x026f }
        L_0x0038:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ all -> 0x026f }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x026f }
            if (r4 == 0) goto L_0x0042
            r8.f12835Z = r2     // Catch:{ all -> 0x026f }
        L_0x0042:
            com.ironsource.mediationsdk.IronSource$AD_UNIT r4 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x026f }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x026f }
            if (r3 == 0) goto L_0x004c
            r8.f12834Y = r2     // Catch:{ all -> 0x026f }
        L_0x004c:
            int r0 = r0 + 1
            goto L_0x0020
        L_0x004f:
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()     // Catch:{ all -> 0x026f }
            int r0 = r12.length     // Catch:{ all -> 0x026f }
            r3 = 0
        L_0x0055:
            if (r3 >= r0) goto L_0x0061
            r4 = r12[r3]     // Catch:{ all -> 0x026f }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r5 = r8.f12829T     // Catch:{ all -> 0x026f }
            r5.add(r4)     // Catch:{ all -> 0x026f }
            int r3 = r3 + 1
            goto L_0x0055
        L_0x0061:
            r8.f12834Y = r2     // Catch:{ all -> 0x026f }
            r8.f12867w = r2     // Catch:{ all -> 0x026f }
            r8.f12835Z = r2     // Catch:{ all -> 0x026f }
        L_0x0067:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r12 = r8.f12850f     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x026f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            java.lang.String r4 = "init(appKey:"
            r3.<init>(r4)     // Catch:{ all -> 0x026f }
            r3.append(r10)     // Catch:{ all -> 0x026f }
            java.lang.String r4 = ")"
            r3.append(r4)     // Catch:{ all -> 0x026f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x026f }
            r12.log(r0, r3, r2)     // Catch:{ all -> 0x026f }
            boolean r12 = r9 instanceof android.app.Activity     // Catch:{ all -> 0x026f }
            if (r12 == 0) goto L_0x008f
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x026f }
            r0 = r9
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x026f }
            r12.updateActivity(r0)     // Catch:{ all -> 0x026f }
        L_0x008f:
            com.ironsource.environment.ContextProvider r12 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x026f }
            android.content.Context r0 = r9.getApplicationContext()     // Catch:{ all -> 0x026f }
            r12.updateAppContext(r0)     // Catch:{ all -> 0x026f }
            com.ironsource.environment.C5527g.m13170q()     // Catch:{ all -> 0x026f }
            com.ironsource.c.b r12 = r8.f12845ai     // Catch:{ all -> 0x026f }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getSDKVersion()     // Catch:{ all -> 0x026f }
            r12.mo41210b(r0)     // Catch:{ all -> 0x026f }
            com.ironsource.c.a r12 = new com.ironsource.c.a     // Catch:{ all -> 0x026f }
            r12.<init>()     // Catch:{ all -> 0x026f }
            if (r10 == 0) goto L_0x00d1
            r0 = 5
            r3 = 10
            boolean r0 = m13271a((java.lang.String) r10, (int) r0, (int) r3)     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x00c8
            boolean r0 = m13290v(r10)     // Catch:{ all -> 0x026f }
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "appKey"
            java.lang.String r3 = "should contain only english characters and numbers"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r0, r10, r3)     // Catch:{ all -> 0x026f }
        L_0x00c4:
            r12.mo41202a((com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x026f }
            goto L_0x00db
        L_0x00c8:
            java.lang.String r0 = "appKey"
            java.lang.String r3 = "length should be between 5-10 characters"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError(r0, r10, r3)     // Catch:{ all -> 0x026f }
            goto L_0x00c4
        L_0x00d1:
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x026f }
            r3 = 506(0x1fa, float:7.09E-43)
            java.lang.String r4 = "Init Fail - appKey is missing"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x026f }
            goto L_0x00c4
        L_0x00db:
            boolean r0 = r12.mo41203a()     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x00e3
            r8.f12854j = r10     // Catch:{ all -> 0x026f }
        L_0x00e3:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x026f }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x026f }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isInitResponseCached(r0)     // Catch:{ all -> 0x026f }
            long r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getFirstSessionTimestamp(r0)     // Catch:{ all -> 0x026f }
            if (r3 != 0) goto L_0x0115
            r6 = -1
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0115
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.logger.IronLog r5 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x026f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            java.lang.String r7 = "get first session timestamp = "
            r6.<init>(r7)     // Catch:{ all -> 0x026f }
            r6.append(r3)     // Catch:{ all -> 0x026f }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x026f }
            r5.verbose(r6)     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.utils.IronSourceUtils.saveFirstSessionTimestamp(r0, r3)     // Catch:{ all -> 0x026f }
        L_0x0115:
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f12824O     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x013f
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f12824O     // Catch:{ all -> 0x026f }
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch:{ all -> 0x026f }
            if (r0 == 0) goto L_0x013f
            com.ironsource.mediationsdk.a.h r0 = com.ironsource.mediationsdk.p137a.C5646h.m13816a()     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.utils.h r3 = new com.ironsource.mediationsdk.utils.h     // Catch:{ all -> 0x026f }
            r3.<init>(r9)     // Catch:{ all -> 0x026f }
            r0.mo41712a(r3)     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.a.d r0 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f12863s     // Catch:{ all -> 0x026f }
            r0.mo41679a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.a.g r0 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.IronSourceSegment r3 = r8.f12863s     // Catch:{ all -> 0x026f }
            r0.mo41679a((android.content.Context) r9, (com.ironsource.mediationsdk.IronSourceSegment) r3)     // Catch:{ all -> 0x026f }
        L_0x013f:
            java.lang.String r0 = r8.f12854j     // Catch:{ all -> 0x026f }
            if (r0 != 0) goto L_0x0181
            com.ironsource.mediationsdk.I r9 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.I$a r10 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_FAILED     // Catch:{ all -> 0x026f }
            r9.mo41445a((com.ironsource.mediationsdk.C5568I.C5572a) r10)     // Catch:{ all -> 0x026f }
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.f12829T     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x026f }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x026f }
            if (r9 == 0) goto L_0x015b
            com.ironsource.mediationsdk.sdk.j r9 = r8.f12851g     // Catch:{ all -> 0x026f }
            r9.onRewardedVideoAvailabilityChanged(r1)     // Catch:{ all -> 0x026f }
        L_0x015b:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r9 = r8.f12829T     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r10 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ all -> 0x026f }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x026f }
            if (r9 == 0) goto L_0x016e
            com.ironsource.mediationsdk.sdk.j r9 = r8.f12851g     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = r12.mo41204b()     // Catch:{ all -> 0x026f }
            r9.mo41509a((boolean) r1, (com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x026f }
        L_0x016e:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.logger.IronSourceError r11 = r12.mo41204b()     // Catch:{ all -> 0x026f }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x026f }
            r9.log(r10, r11, r2)     // Catch:{ all -> 0x026f }
            monitor-exit(r8)
            return
        L_0x0181:
            com.ironsource.c.b r12 = r8.f12845ai     // Catch:{ all -> 0x026f }
            r12.mo41206a((android.content.Context) r9)     // Catch:{ all -> 0x026f }
            com.ironsource.c.b r12 = r8.f12845ai     // Catch:{ all -> 0x026f }
            java.lang.String r0 = r8.f12854j     // Catch:{ all -> 0x026f }
            r12.mo41207a((java.lang.String) r0)     // Catch:{ all -> 0x026f }
            com.ironsource.c.b r12 = r8.f12845ai     // Catch:{ all -> 0x026f }
            java.lang.String r0 = r8.f12860p     // Catch:{ all -> 0x026f }
            r12.mo41211c(r0)     // Catch:{ all -> 0x026f }
            com.ironsource.c.b r12 = r8.f12845ai     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.config.ConfigFile r0 = com.ironsource.mediationsdk.config.ConfigFile.getConfigFile()     // Catch:{ all -> 0x026f }
            java.lang.String r0 = r0.getPluginType()     // Catch:{ all -> 0x026f }
            r12.mo41212d(r0)     // Catch:{ all -> 0x026f }
            boolean r12 = r8.f12831V     // Catch:{ all -> 0x026f }
            if (r12 == 0) goto L_0x022e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r12.<init>()     // Catch:{ all -> 0x026f }
            org.json.JSONObject r11 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r11)     // Catch:{ all -> 0x026f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x021a }
            java.lang.String r3 = ",androidx="
            r0.<init>(r3)     // Catch:{ Exception -> 0x021a }
            boolean r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.isAndroidXAvailable()     // Catch:{ Exception -> 0x021a }
            r0.append(r3)     // Catch:{ Exception -> 0x021a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x021a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x021a }
            java.lang.String r4 = ",Activity="
            r3.<init>(r4)     // Catch:{ Exception -> 0x021a }
            boolean r4 = m13256A()     // Catch:{ Exception -> 0x021a }
            r3.append(r4)     // Catch:{ Exception -> 0x021a }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x021a }
            boolean r4 = com.ironsource.environment.C5505a.C55061.m13084d()     // Catch:{ Exception -> 0x021a }
            if (r4 == 0) goto L_0x01e5
            java.lang.String r4 = "appLanguage=Kotlin"
            r12.append(r4)     // Catch:{ Exception -> 0x021a }
            java.lang.String r4 = com.ironsource.environment.C5505a.C55061.m13081c()     // Catch:{ Exception -> 0x021a }
        L_0x01e1:
            r12.append(r4)     // Catch:{ Exception -> 0x021a }
            goto L_0x01e8
        L_0x01e5:
            java.lang.String r4 = "appLanguage=Java"
            goto L_0x01e1
        L_0x01e8:
            r12.append(r0)     // Catch:{ Exception -> 0x021a }
            boolean r0 = r8.mo41392m()     // Catch:{ Exception -> 0x021a }
            if (r0 == 0) goto L_0x01f4
            r12.append(r3)     // Catch:{ Exception -> 0x021a }
        L_0x01f4:
            java.lang.String r0 = "ext1"
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x021a }
            r11.put(r0, r12)     // Catch:{ Exception -> 0x021a }
            if (r13 == 0) goto L_0x020f
            int r12 = r13.length     // Catch:{ Exception -> 0x021a }
            r0 = 0
        L_0x0201:
            if (r0 >= r12) goto L_0x020f
            r3 = r13[r0]     // Catch:{ Exception -> 0x021a }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x021a }
            r11.put(r3, r2)     // Catch:{ Exception -> 0x021a }
            int r0 = r0 + 1
            goto L_0x0201
        L_0x020f:
            java.lang.String r12 = "sessionDepth"
            int r13 = r8.f12864t     // Catch:{ Exception -> 0x021a }
            int r13 = r13 + r2
            r8.f12864t = r13     // Catch:{ Exception -> 0x021a }
            r11.put(r12, r13)     // Catch:{ Exception -> 0x021a }
            goto L_0x021e
        L_0x021a:
            r12 = move-exception
            r12.printStackTrace()     // Catch:{ all -> 0x026f }
        L_0x021e:
            com.ironsource.mediationsdk.a.c r12 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x026f }
            r13 = 14
            r12.<init>(r13, r11)     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.a.g r11 = com.ironsource.mediationsdk.p137a.C5645g.m13810e()     // Catch:{ all -> 0x026f }
            r11.mo41689b((com.ironsource.mediationsdk.p137a.C5641c) r12)     // Catch:{ all -> 0x026f }
            r8.f12831V = r1     // Catch:{ all -> 0x026f }
        L_0x022e:
            java.util.Set<com.ironsource.mediationsdk.IronSource$AD_UNIT> r11 = r8.f12829T     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r12 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ all -> 0x026f }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x026f }
            if (r11 == 0) goto L_0x0241
            com.ironsource.mediationsdk.I r11 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.B r12 = r8.f12847c     // Catch:{ all -> 0x026f }
            r11.mo41446a((com.ironsource.mediationsdk.utils.C5799i) r12)     // Catch:{ all -> 0x026f }
        L_0x0241:
            com.ironsource.mediationsdk.I r11 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x026f }
            r11.mo41446a((com.ironsource.mediationsdk.utils.C5799i) r8)     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.I r11 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.impressionData.a r12 = r8.f12820K     // Catch:{ all -> 0x026f }
            r11.mo41446a((com.ironsource.mediationsdk.utils.C5799i) r12)     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.I r11 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x026f }
            java.lang.String r12 = r8.f12855k     // Catch:{ all -> 0x026f }
            r11.mo41444a(r9, r10, r12)     // Catch:{ all -> 0x026f }
            monitor-exit(r8)
            return
        L_0x025c:
            if (r13 == 0) goto L_0x0263
            r8.m13269a((boolean) r11, (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r13)     // Catch:{ all -> 0x026f }
            monitor-exit(r8)
            return
        L_0x0263:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r8.f12850f     // Catch:{ all -> 0x026f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r10 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x026f }
            java.lang.String r11 = "Multiple calls to init without ad units are not allowed"
            r12 = 3
            r9.log(r10, r11, r12)     // Catch:{ all -> 0x026f }
            monitor-exit(r8)
            return
        L_0x026f:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41362a(android.content.Context, java.lang.String, boolean, com.ironsource.mediationsdk.sdk.f, com.ironsource.mediationsdk.IronSource$AD_UNIT[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo41363a(AbstractAdapter abstractAdapter) {
        this.f12823N = abstractAdapter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
        r1 = r3.f12853i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e1, code lost:
        if (r1 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e5, code lost:
        if (r1.f14083c == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ed, code lost:
        if (r3.f12853i.f14083c.f13747d != null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f2, code lost:
        if (r3.f12816G != false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f4, code lost:
        r3.f12849e.mo41881a(r4, m13293x(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fe, code lost:
        r3.f12810A.mo41519a(r4, m13293x(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0108, code lost:
        r3.f12850f.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
        com.ironsource.mediationsdk.C5699i.m14030a().mo41856a(r4, new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, "No banner configurations found"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0121, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41364a(com.ironsource.mediationsdk.IronSourceBannerLayout r4, java.lang.String r5) {
        /*
            r3 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "placementName = "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            r0 = 3
            if (r4 == 0) goto L_0x0125
            boolean r1 = r4.isDestroyed()
            if (r1 == 0) goto L_0x001e
            goto L_0x0125
        L_0x001e:
            boolean r1 = r3.f12835Z
            if (r1 != 0) goto L_0x0037
            java.lang.String r5 = "init() must be called before loadBanner()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r3.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r1.log(r2, r5, r0)
            com.ironsource.mediationsdk.i r0 = com.ironsource.mediationsdk.C5699i.m14030a()
            com.ironsource.mediationsdk.logger.IronSourceError r5 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r5)
            r0.mo41856a(r4, r5)
            return
        L_0x0037:
            com.ironsource.mediationsdk.ISBannerSize r1 = r4.getSize()
            java.lang.String r1 = r1.getDescription()
            java.lang.String r2 = "CUSTOM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0072
            com.ironsource.mediationsdk.ISBannerSize r1 = r4.getSize()
            int r1 = r1.getWidth()
            if (r1 <= 0) goto L_0x005b
            com.ironsource.mediationsdk.ISBannerSize r1 = r4.getSize()
            int r1 = r1.getHeight()
            if (r1 > 0) goto L_0x0072
        L_0x005b:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "loadBanner: Unsupported banner size. Height and width must be bigger than 0"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.i r5 = com.ironsource.mediationsdk.C5699i.m14030a()
            java.lang.String r0 = ""
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.unsupportedBannerSize(r0)
            r5.mo41856a(r4, r0)
            return
        L_0x0072:
            com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.m13411a()
            com.ironsource.mediationsdk.I$a r1 = r1.mo41447b()
            com.ironsource.mediationsdk.I$a r2 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_FAILED
            if (r1 != r2) goto L_0x0098
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "init() had failed"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.i r5 = com.ironsource.mediationsdk.C5699i.m14030a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 600(0x258, float:8.41E-43)
            java.lang.String r2 = "Init() had failed"
            r0.<init>(r1, r2)
            r5.mo41856a(r4, r0)
            return
        L_0x0098:
            com.ironsource.mediationsdk.I$a r2 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_IN_PROGRESS
            if (r1 != r2) goto L_0x00c9
            com.ironsource.mediationsdk.I r1 = com.ironsource.mediationsdk.C5568I.m13411a()
            boolean r1 = r1.mo41449c()
            if (r1 == 0) goto L_0x00c0
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "init() had failed"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.i r5 = com.ironsource.mediationsdk.C5699i.m14030a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 601(0x259, float:8.42E-43)
            java.lang.String r2 = "Init had failed"
            r0.<init>(r1, r2)
            r5.mo41856a(r4, r0)
            return
        L_0x00c0:
            r3.f12838ab = r4
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.f12837aa = r4
            r3.f12839ac = r5
            return
        L_0x00c9:
            java.lang.Boolean r1 = r3.f12837aa
            monitor-enter(r1)
            com.ironsource.mediationsdk.j r2 = r3.f12849e     // Catch:{ all -> 0x0122 }
            if (r2 != 0) goto L_0x00de
            com.ironsource.mediationsdk.L r2 = r3.f12810A     // Catch:{ all -> 0x0122 }
            if (r2 != 0) goto L_0x00de
            r3.f12838ab = r4     // Catch:{ all -> 0x0122 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0122 }
            r3.f12837aa = r4     // Catch:{ all -> 0x0122 }
            r3.f12839ac = r5     // Catch:{ all -> 0x0122 }
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            return
        L_0x00de:
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            com.ironsource.mediationsdk.utils.j r1 = r3.f12853i
            if (r1 == 0) goto L_0x0108
            com.ironsource.mediationsdk.model.i r1 = r1.f14083c
            if (r1 == 0) goto L_0x0108
            com.ironsource.mediationsdk.utils.j r1 = r3.f12853i
            com.ironsource.mediationsdk.model.i r1 = r1.f14083c
            com.ironsource.mediationsdk.model.g r1 = r1.f13747d
            if (r1 != 0) goto L_0x00f0
            goto L_0x0108
        L_0x00f0:
            boolean r0 = r3.f12816G
            if (r0 != 0) goto L_0x00fe
            com.ironsource.mediationsdk.j r0 = r3.f12849e
            com.ironsource.mediationsdk.model.h r5 = r3.m13293x(r5)
            r0.mo41881a((com.ironsource.mediationsdk.IronSourceBannerLayout) r4, (com.ironsource.mediationsdk.model.C5724h) r5)
            return
        L_0x00fe:
            com.ironsource.mediationsdk.L r0 = r3.f12810A
            com.ironsource.mediationsdk.model.h r5 = r3.m13293x(r5)
            r0.mo41519a((com.ironsource.mediationsdk.IronSourceBannerLayout) r4, (com.ironsource.mediationsdk.model.C5724h) r5)
            return
        L_0x0108:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r3.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r2 = "No banner configurations found"
            r5.log(r1, r2, r0)
            com.ironsource.mediationsdk.i r5 = com.ironsource.mediationsdk.C5699i.m14030a()
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError
            r1 = 615(0x267, float:8.62E-43)
            java.lang.String r2 = "No banner configurations found"
            r0.<init>(r1, r2)
            r5.mo41856a(r4, r0)
            return
        L_0x0122:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0122 }
            throw r4
        L_0x0125:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "loadBanner can't be called - "
            r5.<init>(r1)
            if (r4 != 0) goto L_0x0131
            java.lang.String r1 = "banner layout is null "
            goto L_0x0133
        L_0x0131:
            java.lang.String r1 = "banner layout is destroyed"
        L_0x0133:
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r3.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r1.log(r2, r5, r0)
            com.ironsource.mediationsdk.i r0 = com.ironsource.mediationsdk.C5699i.m14030a()
            com.ironsource.mediationsdk.logger.IronSourceError r5 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError(r5)
            r0.mo41856a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41364a(com.ironsource.mediationsdk.IronSourceBannerLayout, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo41325a(String str) {
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f12850f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "onInitFailed(reason:" + str + ")", 1);
            IronSourceUtils.sendAutomationLog("Mediation init failed");
            if (this.f12851g != null) {
                for (IronSource.AD_UNIT a : this.f12829T) {
                    m13262a(a, true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo41365a(String str, List<String> list) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("key = " + str + ", values = " + list.toString());
        String checkMetaDataKeyValidity = MetaDataUtils.checkMetaDataKeyValidity(str);
        String checkMetaDataValueValidity = MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataKeyValidity);
        } else if (checkMetaDataValueValidity.length() > 0) {
            IronLog.API.verbose(checkMetaDataValueValidity);
        } else {
            MetaData formatMetaData = MetaDataUtils.formatMetaData(str, list);
            String metaDataKey = formatMetaData.getMetaDataKey();
            List<String> metaDataValue = formatMetaData.getMetaDataValue();
            if (MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
                C5790c.m14278a().mo42111a(metaDataKey, metaDataValue);
            } else {
                C5685c.m13965a().mo41826a(metaDataKey, metaDataValue);
            }
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C5685c.m13965a().f13532c;
                concurrentHashMap.putAll(C5790c.m14278a().mo42115d());
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
                this.f12845ai.mo41208a(jSONObject);
            } catch (JSONException e) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
            C5645g.m13810e().mo41689b(new C5641c(C5568I.m13411a().mo41447b() == C5568I.C5572a.INITIATED ? 51 : 50, IronSourceUtils.getJsonForMetaData(str, list, metaDataValue)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41366a(String str, boolean z) {
        IronLog ironLog = IronLog.API;
        ironLog.verbose("userId = " + str + ", isFromPublisher = " + z);
        this.f12855k = str;
        if (z) {
            C5645g.m13810e().mo41689b(new C5641c(52, IronSourceUtils.getJsonForUserId(false)));
        }
    }

    /* renamed from: a */
    public final void mo41327a(List<IronSource.AD_UNIT> list, boolean z, C5725i iVar) {
        IronLog.INTERNAL.verbose("");
        try {
            this.f12828S = list;
            this.f12827R = true;
            this.f12850f.log(IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            IronSourceUtils.sendAutomationLog("init success");
            if (z) {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                try {
                    mediationAdditionalData.put("revived", true);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C5645g.m13810e().mo41689b(new C5641c(114, mediationAdditionalData));
            }
            C5642d.m13798e().mo41698d();
            C5645g.m13810e().mo41698d();
            C5685c a = C5685c.m13965a();
            String str = this.f12854j;
            String str2 = this.f12855k;
            a.f13530a = str;
            a.f13531b = str2;
            for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
                if (this.f12829T.contains(ad_unit)) {
                    if (list.contains(ad_unit)) {
                        m13274b(ad_unit);
                    } else {
                        m13262a(ad_unit, false);
                    }
                }
            }
            if (this.f12840ad != null) {
                IronLog.CALLBACK.verbose("onInitializationCompleted");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized AbstractAdapter mo41367b(String str) {
        try {
            if (this.f12823N != null && this.f12823N.getProviderName().equals(str)) {
                return this.f12823N;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f12850f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "getOfferwallAdapter exception: " + e, 1);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Placement mo41368b() {
        C5734q qVar = this.f12853i.f14083c.f13744a;
        if (qVar != null) {
            return qVar.mo41989a();
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final synchronized void mo41369b(android.app.Activity r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f12850f     // Catch:{ all -> 0x016f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x016f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x016f }
            java.lang.String r3 = "loadISDemandOnlyRewardedVideo() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x016f }
            r2.append(r7)     // Catch:{ all -> 0x016f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x016f }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x016f }
            boolean r0 = r5.f12834Y     // Catch:{ all -> 0x0151 }
            r1 = 508(0x1fc, float:7.12E-43)
            r2 = 3
            if (r0 != 0) goto L_0x0035
            java.lang.String r6 = "initISDemandOnly() must be called before loadISDemandOnlyRewardedVideo()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f12850f     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0151 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.V r8 = com.ironsource.mediationsdk.C5607V.m13667a()     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0151 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0151 }
            r8.mo41612a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0151 }
            monitor-exit(r5)
            return
        L_0x0035:
            boolean r0 = r5.f12865u     // Catch:{ all -> 0x0151 }
            if (r0 != 0) goto L_0x0050
            java.lang.String r6 = "Rewarded video was initialized in mediation mode"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f12850f     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0151 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.V r8 = com.ironsource.mediationsdk.C5607V.m13667a()     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0151 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0151 }
            r8.mo41612a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0151 }
            monitor-exit(r5)
            return
        L_0x0050:
            r0 = 0
            if (r6 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r1 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0151 }
            r1.updateActivity(r6)     // Catch:{ all -> 0x0151 }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r6 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0151 }
            android.app.Activity r6 = r6.getCurrentActiveActivity()     // Catch:{ all -> 0x0151 }
            if (r6 != 0) goto L_0x008c
            if (r8 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r0 = 1
        L_0x0069:
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r0, r3)     // Catch:{ all -> 0x0151 }
            r8 = 81321(0x13da9, float:1.13955E-40)
            m13260a((int) r8, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0151 }
            java.lang.String r6 = "Rewarded video was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f12850f     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0151 }
            r8.log(r0, r6, r2)     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.V r8 = com.ironsource.mediationsdk.C5607V.m13667a()     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0151 }
            r1 = 1060(0x424, float:1.485E-42)
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0151 }
            r8.mo41612a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x0151 }
            monitor-exit(r5)
            return
        L_0x008c:
            com.ironsource.mediationsdk.I r6 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.I$a r6 = r6.mo41447b()     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.I$a r1 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_FAILED     // Catch:{ all -> 0x0151 }
            if (r6 != r1) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f12850f     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.V r6 = com.ironsource.mediationsdk.C5607V.m13667a()     // Catch:{ all -> 0x0151 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0151 }
            r6.mo41612a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0151 }
            monitor-exit(r5)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.I$a r1 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0151 }
            r4 = 83002(0x1443a, float:1.1631E-40)
            if (r6 != r1) goto L_0x00f6
            com.ironsource.mediationsdk.I r6 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x0151 }
            boolean r6 = r6.mo41449c()     // Catch:{ all -> 0x0151 }
            if (r6 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f12850f     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = "init() had failed"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.V r6 = com.ironsource.mediationsdk.C5607V.m13667a()     // Catch:{ all -> 0x0151 }
            java.lang.String r8 = "init() had failed"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0151 }
            r6.mo41612a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0151 }
            monitor-exit(r5)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.f12842af     // Catch:{ all -> 0x0151 }
            monitor-enter(r6)     // Catch:{ all -> 0x0151 }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.f12842af     // Catch:{ all -> 0x00f3 }
            r0.add(r7)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            if (r8 == 0) goto L_0x00f1
            int r6 = r5.f12817H     // Catch:{ all -> 0x0151 }
            org.json.JSONObject r6 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r6)     // Catch:{ all -> 0x0151 }
            m13260a((int) r4, (org.json.JSONObject) r6)     // Catch:{ all -> 0x0151 }
        L_0x00f1:
            monitor-exit(r5)
            return
        L_0x00f3:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f3 }
            throw r8     // Catch:{ all -> 0x0151 }
        L_0x00f6:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r6 = r5.f12842af     // Catch:{ all -> 0x0151 }
            monitor-enter(r6)     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.s r1 = r5.f12844ah     // Catch:{ all -> 0x014e }
            if (r1 != 0) goto L_0x0110
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r0 = r5.f12842af     // Catch:{ all -> 0x014e }
            r0.add(r7)     // Catch:{ all -> 0x014e }
            if (r8 == 0) goto L_0x010d
            int r8 = r5.f12817H     // Catch:{ all -> 0x014e }
            org.json.JSONObject r8 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r8)     // Catch:{ all -> 0x014e }
            m13260a((int) r4, (org.json.JSONObject) r8)     // Catch:{ all -> 0x014e }
        L_0x010d:
            monitor-exit(r6)     // Catch:{ all -> 0x014e }
            monitor-exit(r5)
            return
        L_0x0110:
            monitor-exit(r6)     // Catch:{ all -> 0x014e }
            com.ironsource.mediationsdk.utils.j r6 = r5.f12853i     // Catch:{ all -> 0x0151 }
            if (r6 == 0) goto L_0x0134
            com.ironsource.mediationsdk.utils.j r6 = r5.f12853i     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.model.i r6 = r6.f14083c     // Catch:{ all -> 0x0151 }
            if (r6 == 0) goto L_0x0134
            com.ironsource.mediationsdk.utils.j r6 = r5.f12853i     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.model.i r6 = r6.f14083c     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.model.q r6 = r6.f13744a     // Catch:{ all -> 0x0151 }
            if (r6 != 0) goto L_0x0124
            goto L_0x0134
        L_0x0124:
            if (r8 != 0) goto L_0x012d
            com.ironsource.mediationsdk.s r6 = r5.f12844ah     // Catch:{ all -> 0x0151 }
            r8 = 0
            r6.mo42025a((java.lang.String) r7, (java.lang.String) r8, (boolean) r0)     // Catch:{ all -> 0x0151 }
            goto L_0x016d
        L_0x012d:
            com.ironsource.mediationsdk.s r6 = r5.f12844ah     // Catch:{ all -> 0x0151 }
            r6.mo42025a((java.lang.String) r7, (java.lang.String) r8, (boolean) r3)     // Catch:{ all -> 0x0151 }
            monitor-exit(r5)
            return
        L_0x0134:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = r5.f12850f     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r8 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = "No rewarded video configurations found"
            r6.log(r8, r0, r2)     // Catch:{ all -> 0x0151 }
            com.ironsource.mediationsdk.V r6 = com.ironsource.mediationsdk.C5607V.m13667a()     // Catch:{ all -> 0x0151 }
            java.lang.String r8 = "the server response does not contain rewarded video data"
            java.lang.String r0 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r8 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r8, r0)     // Catch:{ all -> 0x0151 }
            r6.mo41612a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r8)     // Catch:{ all -> 0x0151 }
            monitor-exit(r5)
            return
        L_0x014e:
            r8 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x014e }
            throw r8     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r6 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r8 = r5.f12850f     // Catch:{ all -> 0x016f }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r0 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x016f }
            java.lang.String r1 = "loadISDemandOnlyRewardedVideo"
            r8.logException(r0, r1, r6)     // Catch:{ all -> 0x016f }
            com.ironsource.mediationsdk.V r8 = com.ironsource.mediationsdk.C5607V.m13667a()     // Catch:{ all -> 0x016f }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x016f }
            r1 = 510(0x1fe, float:7.15E-43)
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x016f }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x016f }
            r8.mo41612a((java.lang.String) r7, (com.ironsource.mediationsdk.logger.IronSourceError) r0)     // Catch:{ all -> 0x016f }
        L_0x016d:
            monitor-exit(r5)
            return
        L_0x016f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41369b(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo41370b(boolean z) {
        this.f12868x = Boolean.valueOf(z);
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        logger.log(ironSourceTag, "setConsent : " + z, 1);
        C5685c.m13965a().mo41827a(z);
        if (this.f12823N != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f12850f;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag2, "Offerwall | setConsent(consent:" + z + ")", 1);
            this.f12823N.setConsent(z);
        }
        int i = 40;
        if (!z) {
            i = 41;
        }
        this.f12845ai.mo41209a(z);
        C5645g.m13810e().mo41689b(new C5641c(i, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* renamed from: c */
    public final synchronized void mo41371c(Activity activity, String str, String str2) {
        if (str2 == null) {
            this.f12850f.log(IronSourceLogger.IronSourceTag.API, "adm cannot be null", 3);
            C5813z.m14382a().mo42145a(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "adm cannot be null"));
            return;
        }
        mo41374d(activity, str, str2);
    }

    /* renamed from: c */
    public final boolean mo41372c() {
        boolean z;
        try {
            if (this.f12865u) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use isISDemandOnlyRewardedVideoAvailable instead", 3);
                return false;
            }
            boolean c = this.f12812C ? this.f12869y != null && this.f12869y.mo41407a_() : this.f12846b.mo41648c();
            try {
                JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
                if (this.f12812C) {
                    m13267a(mediationAdditionalData, new Object[][]{new Object[]{IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f12817H)}});
                }
                C5645g.m13810e().mo41689b(new C5641c(c ? IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE : IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE, mediationAdditionalData));
                IronSourceLoggerManager ironSourceLoggerManager = this.f12850f;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.log(ironSourceTag, "isRewardedVideoAvailable():" + c, 1);
                return c;
            } catch (Throwable th) {
                Throwable th2 = th;
                z = c;
                th = th2;
                IronSourceLoggerManager ironSourceLoggerManager2 = this.f12850f;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager2.log(ironSourceTag2, "isRewardedVideoAvailable():" + z, 1);
                this.f12850f.logException(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable()", th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
            IronSourceLoggerManager ironSourceLoggerManager22 = this.f12850f;
            IronSourceLogger.IronSourceTag ironSourceTag22 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager22.log(ironSourceTag22, "isRewardedVideoAvailable():" + z, 1);
            this.f12850f.logException(IronSourceLogger.IronSourceTag.API, "isRewardedVideoAvailable()", th);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo41373c(String str) {
        try {
            this.f12850f.log(IronSourceLogger.IronSourceTag.API, this.f12836a + ":setDynamicUserId(dynamicUserId:" + str + ")", 1);
            C5499a aVar = new C5499a();
            if (!m13271a(str, 1, 128)) {
                aVar.mo41202a(ErrorBuilder.buildInvalidKeyValueError(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, IronSourceConstants.SUPERSONIC_CONFIG_NAME, "dynamicUserId is invalid, should be between 1-128 chars in length."));
            }
            if (aVar.mo41203a()) {
                this.f12857m = str;
                C5645g.m13810e().mo41689b(new C5641c(52, IronSourceUtils.getJsonForUserId(true)));
                return true;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, aVar.mo41204b().toString(), 2);
            return false;
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f12850f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.f12836a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final synchronized void mo41374d(android.app.Activity r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r6.f12850f     // Catch:{ all -> 0x0169 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0169 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = "loadISDemandOnlyInterstitial() instanceId="
            r2.<init>(r3)     // Catch:{ all -> 0x0169 }
            r2.append(r8)     // Catch:{ all -> 0x0169 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0169 }
            r3 = 1
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0169 }
            r0 = 510(0x1fe, float:7.15E-43)
            boolean r1 = r6.f12867w     // Catch:{ all -> 0x014d }
            r2 = 3
            if (r1 != 0) goto L_0x0035
            java.lang.String r7 = "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f12850f     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x014d }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.z r9 = com.ironsource.mediationsdk.C5813z.m14382a()     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x014d }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x014d }
            r9.mo42145a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x014d }
            monitor-exit(r6)
            return
        L_0x0035:
            boolean r1 = r6.f12866v     // Catch:{ all -> 0x014d }
            if (r1 != 0) goto L_0x0050
            java.lang.String r7 = "Interstitial was initialized in mediation mode. Use loadInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f12850f     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x014d }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.z r9 = com.ironsource.mediationsdk.C5813z.m14382a()     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x014d }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x014d }
            r9.mo42145a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x014d }
            monitor-exit(r6)
            return
        L_0x0050:
            r1 = 0
            if (r7 == 0) goto L_0x005b
            com.ironsource.environment.ContextProvider r4 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x014d }
            r4.updateActivity(r7)     // Catch:{ all -> 0x014d }
            goto L_0x008c
        L_0x005b:
            com.ironsource.environment.ContextProvider r7 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x014d }
            android.app.Activity r7 = r7.getCurrentActiveActivity()     // Catch:{ all -> 0x014d }
            if (r7 != 0) goto L_0x008c
            if (r9 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r1 = 1
        L_0x0069:
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r1, r3)     // Catch:{ all -> 0x014d }
            r9 = 82321(0x14191, float:1.15356E-40)
            m13273b(r9, r7)     // Catch:{ all -> 0x014d }
            java.lang.String r7 = "Interstitial was initialized and loaded without Activity"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f12850f     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x014d }
            r9.log(r1, r7, r2)     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.z r9 = com.ironsource.mediationsdk.C5813z.m14382a()     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x014d }
            r2 = 1061(0x425, float:1.487E-42)
            r1.<init>(r2, r7)     // Catch:{ all -> 0x014d }
            r9.mo42145a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x014d }
            monitor-exit(r6)
            return
        L_0x008c:
            com.ironsource.mediationsdk.I r7 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.I$a r7 = r7.mo41447b()     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.I$a r4 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_FAILED     // Catch:{ all -> 0x014d }
            if (r7 != r4) goto L_0x00b2
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f12850f     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x014d }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.z r7 = com.ironsource.mediationsdk.C5813z.m14382a()     // Catch:{ all -> 0x014d }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x014d }
            r7.mo42145a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x014d }
            monitor-exit(r6)
            return
        L_0x00b2:
            com.ironsource.mediationsdk.I$a r4 = com.ironsource.mediationsdk.C5568I.C5572a.INIT_IN_PROGRESS     // Catch:{ all -> 0x014d }
            r5 = 83003(0x1443b, float:1.16312E-40)
            if (r7 != r4) goto L_0x00f4
            com.ironsource.mediationsdk.I r7 = com.ironsource.mediationsdk.C5568I.m13411a()     // Catch:{ all -> 0x014d }
            boolean r7 = r7.mo41449c()     // Catch:{ all -> 0x014d }
            if (r7 == 0) goto L_0x00dd
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f12850f     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x014d }
            java.lang.String r1 = "init() had failed"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.z r7 = com.ironsource.mediationsdk.C5813z.m14382a()     // Catch:{ all -> 0x014d }
            java.lang.String r9 = "init() had failed"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x014d }
            r7.mo42145a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x014d }
            monitor-exit(r6)
            return
        L_0x00dd:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f12841ae     // Catch:{ all -> 0x014d }
            monitor-enter(r7)     // Catch:{ all -> 0x014d }
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.f12841ae     // Catch:{ all -> 0x00f1 }
            r1.add(r8)     // Catch:{ all -> 0x00f1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            if (r9 == 0) goto L_0x00ef
            org.json.JSONObject r7 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x014d }
            m13273b(r5, r7)     // Catch:{ all -> 0x014d }
        L_0x00ef:
            monitor-exit(r6)
            return
        L_0x00f1:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f1 }
            throw r9     // Catch:{ all -> 0x014d }
        L_0x00f4:
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r7 = r6.f12841ae     // Catch:{ all -> 0x014d }
            monitor-enter(r7)     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.q r4 = r6.f12818I     // Catch:{ all -> 0x014a }
            if (r4 != 0) goto L_0x010c
            java.util.concurrent.CopyOnWriteArraySet<java.lang.String> r1 = r6.f12841ae     // Catch:{ all -> 0x014a }
            r1.add(r8)     // Catch:{ all -> 0x014a }
            if (r9 == 0) goto L_0x0109
            org.json.JSONObject r9 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3, r3, r3)     // Catch:{ all -> 0x014a }
            m13273b(r5, r9)     // Catch:{ all -> 0x014a }
        L_0x0109:
            monitor-exit(r7)     // Catch:{ all -> 0x014a }
            monitor-exit(r6)
            return
        L_0x010c:
            monitor-exit(r7)     // Catch:{ all -> 0x014a }
            com.ironsource.mediationsdk.utils.j r7 = r6.f12853i     // Catch:{ all -> 0x014d }
            if (r7 == 0) goto L_0x0130
            com.ironsource.mediationsdk.utils.j r7 = r6.f12853i     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.model.i r7 = r7.f14083c     // Catch:{ all -> 0x014d }
            if (r7 == 0) goto L_0x0130
            com.ironsource.mediationsdk.utils.j r7 = r6.f12853i     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.model.i r7 = r7.f14083c     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.model.j r7 = r7.f13745b     // Catch:{ all -> 0x014d }
            if (r7 != 0) goto L_0x0120
            goto L_0x0130
        L_0x0120:
            if (r9 != 0) goto L_0x0129
            com.ironsource.mediationsdk.q r7 = r6.f12818I     // Catch:{ all -> 0x014d }
            r9 = 0
            r7.mo42012a((java.lang.String) r8, (java.lang.String) r9, (boolean) r1)     // Catch:{ all -> 0x014d }
            goto L_0x0167
        L_0x0129:
            com.ironsource.mediationsdk.q r7 = r6.f12818I     // Catch:{ all -> 0x014d }
            r7.mo42012a((java.lang.String) r8, (java.lang.String) r9, (boolean) r3)     // Catch:{ all -> 0x014d }
            monitor-exit(r6)
            return
        L_0x0130:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r7 = r6.f12850f     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r9 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x014d }
            java.lang.String r1 = "No interstitial configurations found"
            r7.log(r9, r1, r2)     // Catch:{ all -> 0x014d }
            com.ironsource.mediationsdk.z r7 = com.ironsource.mediationsdk.C5813z.m14382a()     // Catch:{ all -> 0x014d }
            java.lang.String r9 = "the server response does not contain interstitial data"
            java.lang.String r1 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r9 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r9, r1)     // Catch:{ all -> 0x014d }
            r7.mo42145a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r9)     // Catch:{ all -> 0x014d }
            monitor-exit(r6)
            return
        L_0x014a:
            r9 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x014a }
            throw r9     // Catch:{ all -> 0x014d }
        L_0x014d:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r9 = r6.f12850f     // Catch:{ all -> 0x0169 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0169 }
            java.lang.String r2 = "loadDemandOnlyInterstitial"
            r9.logException(r1, r2, r7)     // Catch:{ all -> 0x0169 }
            com.ironsource.mediationsdk.z r9 = com.ironsource.mediationsdk.C5813z.m14382a()     // Catch:{ all -> 0x0169 }
            com.ironsource.mediationsdk.logger.IronSourceError r1 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0169 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0169 }
            r1.<init>(r0, r7)     // Catch:{ all -> 0x0169 }
            r9.mo42145a((java.lang.String) r8, (com.ironsource.mediationsdk.logger.IronSourceError) r1)     // Catch:{ all -> 0x0169 }
        L_0x0167:
            monitor-exit(r6)
            return
        L_0x0169:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41374d(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo41375d(String str) {
        try {
            this.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, this.f12836a + ":setMediationType(mediationType:" + str + ")", 1);
            if (!m13271a(str, 1, 64) || !m13290v(str)) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.INTERNAL, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            } else {
                this.f12859o = str;
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f12850f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, this.f12836a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo41376d() {
        C5800j jVar = this.f12853i;
        return (jVar == null || jVar.f14083c == null || this.f12853i.f14083c.f13744a == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public InterstitialPlacement mo41377e() {
        C5726j jVar = this.f12853i.f14083c.f13745b;
        if (jVar != null) {
            return jVar.mo41976a();
        }
        return null;
    }

    /* renamed from: e */
    public final void mo41378e(String str) {
        String str2 = "showRewardedVideo(" + str + ")";
        this.f12850f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (this.f12865u) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", 3);
                this.f12851g.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use showISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!mo41376d()) {
                this.f12851g.onRewardedVideoAdShowFailed(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!this.f12812C || this.f12869y == null) {
                Placement r = m13281r(str);
                if (r != null) {
                    this.f12846b.mo41641a(r);
                    this.f12846b.mo41642a(r.getPlacementName());
                }
            } else {
                m13280q(str);
            }
        } catch (Exception e) {
            this.f12850f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.f12851g.onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()));
        }
    }

    /* renamed from: f */
    public final void mo41336f() {
        synchronized (this.f12837aa) {
            if (this.f12837aa.booleanValue()) {
                this.f12837aa = Boolean.FALSE;
                C5699i.m14030a().mo41856a(this.f12838ab, new IronSourceError(603, "init had failed"));
                this.f12838ab = null;
                this.f12839ac = null;
            }
        }
        if (this.f12815F) {
            this.f12815F = false;
            C5736n.m14120a().mo41990a(ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
        synchronized (this.f12841ae) {
            Iterator<String> it = this.f12841ae.iterator();
            while (it.hasNext()) {
                C5813z.m14382a().mo42145a(it.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
            this.f12841ae.clear();
        }
        synchronized (this.f12842af) {
            Iterator<String> it2 = this.f12842af.iterator();
            while (it2.hasNext()) {
                C5607V.m13667a().mo41612a(it2.next(), ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.f12842af.clear();
        }
    }

    /* renamed from: f */
    public final synchronized void mo41379f(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f12850f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyRewardedVideo() instanceId=" + str, 1);
        try {
            if (!this.f12865u) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead", 3);
                C5607V.m13667a().mo41613b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
                return;
            } else if (this.f12844ah == null) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Rewarded video was not initiated", 3);
                C5607V.m13667a().mo41613b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
                return;
            } else {
                C5744s sVar = this.f12844ah;
                if (!sVar.f13828a.containsKey(str)) {
                    C5744s.m14166a(1500, str);
                    C5607V.m13667a().mo41613b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    C5784t tVar = sVar.f13828a.get(str);
                    sVar.mo42020a((int) IronSourceConstants.RV_INSTANCE_SHOW, tVar);
                    tVar.mo42090a();
                    return;
                }
            }
        } catch (Exception e) {
            this.f12850f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyRewardedVideo", e);
            C5607V.m13667a().mo41613b(str, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()));
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r9.f12811B.mo41789b() != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r9.f12847c.mo41335e() != false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0052 A[Catch:{ all -> 0x0073 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41380g() {
        /*
            r9 = this;
            java.lang.String r0 = "isInterstitialReady():"
            r1 = 1
            r2 = 0
            boolean r3 = r9.f12866v     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0013
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r3 = r9.f12850f     // Catch:{ all -> 0x0078 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r4 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Interstitial was initialized in demand only mode. Use isISDemandOnlyInterstitialReady instead"
            r6 = 3
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x0078 }
            return r2
        L_0x0013:
            boolean r3 = r9.f12813D     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0038
            boolean r3 = r9.f12814E     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x002b
            com.ironsource.mediationsdk.adunit.b.e r3 = r9.f12811B     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.adunit.b.e r3 = r9.f12811B     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo41789b()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x0045
        L_0x0029:
            r3 = 0
            goto L_0x0045
        L_0x002b:
            com.ironsource.mediationsdk.O r3 = r9.f12870z     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.O r3 = r9.f12870z     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo41565e()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            goto L_0x0027
        L_0x0038:
            com.ironsource.mediationsdk.B r3 = r9.f12847c     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            com.ironsource.mediationsdk.B r3 = r9.f12847c     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.mo41335e()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0029
            goto L_0x0027
        L_0x0045:
            boolean r4 = r9.f12813D     // Catch:{ all -> 0x0073 }
            org.json.JSONObject r4 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r2, r4, r1)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.a.c r5 = new com.ironsource.mediationsdk.a.c     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x0052
            r6 = 2101(0x835, float:2.944E-42)
            goto L_0x0054
        L_0x0052:
            r6 = 2102(0x836, float:2.946E-42)
        L_0x0054:
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.a.d r4 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ all -> 0x0073 }
            r4.mo41689b((com.ironsource.mediationsdk.p137a.C5641c) r5)     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r4 = r9.f12850f     // Catch:{ all -> 0x0073 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r5 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r6.<init>(r0)     // Catch:{ all -> 0x0073 }
            r6.append(r3)     // Catch:{ all -> 0x0073 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0073 }
            r4.log(r5, r6, r1)     // Catch:{ all -> 0x0073 }
            r2 = r3
            goto L_0x0096
        L_0x0073:
            r4 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x007a
        L_0x0078:
            r3 = move-exception
            r4 = 0
        L_0x007a:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r5 = r9.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r6 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r5.log(r6, r0, r1)
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r9.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            java.lang.String r4 = "isInterstitialReady()"
            r0.logException(r1, r4, r3)
        L_0x0096:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41380g():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[DONT_GENERATE] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo41381g(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.s r0 = r4.f12844ah     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.s r0 = r4.f12844ah     // Catch:{ all -> 0x003a }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.t> r2 = r0.f13828a     // Catch:{ all -> 0x003a }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x003a }
            r3 = 1
            if (r2 != 0) goto L_0x0018
            r0 = 1500(0x5dc, float:2.102E-42)
            com.ironsource.mediationsdk.C5744s.m14166a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x003a }
        L_0x0016:
            r5 = 0
            goto L_0x0034
        L_0x0018:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.t> r0 = r0.f13828a     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x003a }
            com.ironsource.mediationsdk.t r5 = (com.ironsource.mediationsdk.C5784t) r5     // Catch:{ all -> 0x003a }
            boolean r0 = r5.mo42092b()     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r0 = 1210(0x4ba, float:1.696E-42)
            com.ironsource.mediationsdk.C5744s.m14165a((int) r0, (com.ironsource.mediationsdk.C5784t) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            r5 = 1
            goto L_0x0034
        L_0x002e:
            r0 = 1211(0x4bb, float:1.697E-42)
            com.ironsource.mediationsdk.C5744s.m14165a((int) r0, (com.ironsource.mediationsdk.C5784t) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            goto L_0x0016
        L_0x0034:
            if (r5 == 0) goto L_0x0038
            monitor-exit(r4)
            return r3
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41381g(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x0063;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41382h(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showInterstitial("
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r1 = r6.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r2 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r3 = 1
            r1.log(r2, r0, r3)
            r1 = 510(0x1fe, float:7.15E-43)
            boolean r2 = r6.f12866v     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x0036
            java.lang.String r7 = "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f12850f     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ Exception -> 0x0090 }
            r4 = 3
            r2.log(r3, r7, r4)     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.sdk.j r2 = r6.f12851g     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.logger.IronSourceError r3 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ Exception -> 0x0090 }
            r3.<init>(r1, r7)     // Catch:{ Exception -> 0x0090 }
            r2.onInterstitialAdShowFailed(r3)     // Catch:{ Exception -> 0x0090 }
            return
        L_0x0036:
            boolean r2 = r6.mo41383h()     // Catch:{ Exception -> 0x0090 }
            if (r2 != 0) goto L_0x004a
            com.ironsource.mediationsdk.sdk.j r7 = r6.f12851g     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = "showInterstitial can't be called before the Interstitial ad unit initialization completed successfully"
            java.lang.String r3 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r2 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError(r2, r3)     // Catch:{ Exception -> 0x0090 }
            r7.onInterstitialAdShowFailed(r2)     // Catch:{ Exception -> 0x0090 }
            return
        L_0x004a:
            boolean r2 = r6.f12813D     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x0052
            r6.m13286t(r7)     // Catch:{ Exception -> 0x0090 }
            return
        L_0x0052:
            com.ironsource.mediationsdk.model.InterstitialPlacement r2 = r6.m13287u(r7)     // Catch:{ Exception -> 0x0090 }
            r3 = 0
            org.json.JSONObject r3 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r3)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r4 = "placement"
            if (r2 == 0) goto L_0x0067
            java.lang.String r7 = r2.getPlacementName()     // Catch:{ JSONException -> 0x006e }
        L_0x0063:
            r3.put(r4, r7)     // Catch:{ JSONException -> 0x006e }
            goto L_0x0072
        L_0x0067:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x006e }
            if (r5 != 0) goto L_0x0072
            goto L_0x0063
        L_0x006e:
            r7 = move-exception
            r7.printStackTrace()     // Catch:{ Exception -> 0x0090 }
        L_0x0072:
            com.ironsource.mediationsdk.a.c r7 = new com.ironsource.mediationsdk.a.c     // Catch:{ Exception -> 0x0090 }
            r4 = 2100(0x834, float:2.943E-42)
            r7.<init>(r4, r3)     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.a.d r3 = com.ironsource.mediationsdk.p137a.C5642d.m13798e()     // Catch:{ Exception -> 0x0090 }
            r3.mo41689b((com.ironsource.mediationsdk.p137a.C5641c) r7)     // Catch:{ Exception -> 0x0090 }
            if (r2 == 0) goto L_0x008f
            com.ironsource.mediationsdk.B r7 = r6.f12847c     // Catch:{ Exception -> 0x0090 }
            r7.mo41324a((com.ironsource.mediationsdk.model.InterstitialPlacement) r2)     // Catch:{ Exception -> 0x0090 }
            com.ironsource.mediationsdk.B r7 = r6.f12847c     // Catch:{ Exception -> 0x0090 }
            r2.getPlacementName()     // Catch:{ Exception -> 0x0090 }
            r7.mo41332d()     // Catch:{ Exception -> 0x0090 }
        L_0x008f:
            return
        L_0x0090:
            r7 = move-exception
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r2 = r6.f12850f
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r3 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API
            r2.logException(r3, r0, r7)
            com.ironsource.mediationsdk.sdk.j r0 = r6.f12851g
            com.ironsource.mediationsdk.logger.IronSourceError r2 = new com.ironsource.mediationsdk.logger.IronSourceError
            java.lang.String r7 = r7.getMessage()
            r2.<init>(r1, r7)
            r0.onInterstitialAdShowFailed(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41382h(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo41383h() {
        C5800j jVar = this.f12853i;
        return (jVar == null || jVar.f14083c == null || this.f12853i.f14083c.f13745b == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo41384i() {
        C5800j jVar = this.f12853i;
        return (jVar == null || jVar.f14083c == null || this.f12853i.f14083c.f13746c == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[DONT_GENERATE] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo41385i(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.q r0 = r4.f12818I     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            com.ironsource.mediationsdk.q r0 = r4.f12818I     // Catch:{ all -> 0x003a }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.r> r2 = r0.f13823a     // Catch:{ all -> 0x003a }
            boolean r2 = r2.containsKey(r5)     // Catch:{ all -> 0x003a }
            r3 = 1
            if (r2 != 0) goto L_0x0018
            r0 = 2500(0x9c4, float:3.503E-42)
            com.ironsource.mediationsdk.C5741q.m14145a((int) r0, (java.lang.String) r5)     // Catch:{ all -> 0x003a }
        L_0x0016:
            r5 = 0
            goto L_0x0034
        L_0x0018:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.r> r0 = r0.f13823a     // Catch:{ all -> 0x003a }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x003a }
            com.ironsource.mediationsdk.r r5 = (com.ironsource.mediationsdk.C5742r) r5     // Catch:{ all -> 0x003a }
            boolean r0 = r5.mo42018b()     // Catch:{ all -> 0x003a }
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r0 = 2211(0x8a3, float:3.098E-42)
            com.ironsource.mediationsdk.C5741q.m14144a((int) r0, (com.ironsource.mediationsdk.C5742r) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            r5 = 1
            goto L_0x0034
        L_0x002e:
            r0 = 2212(0x8a4, float:3.1E-42)
            com.ironsource.mediationsdk.C5741q.m14144a((int) r0, (com.ironsource.mediationsdk.C5742r) r5, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x003a }
            goto L_0x0016
        L_0x0034:
            if (r5 == 0) goto L_0x0038
            monitor-exit(r4)
            return r3
        L_0x0038:
            monitor-exit(r4)
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41385i(java.lang.String):boolean");
    }

    /* renamed from: j */
    public final void mo41386j(String str) {
        String str2 = "showOfferwall(" + str + ")";
        this.f12850f.log(IronSourceLogger.IronSourceTag.API, str2, 1);
        try {
            if (!mo41384i()) {
                this.f12851g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C5728l a = this.f12853i.f14083c.f13746c.mo41978a(str);
            if (a == null) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.f12853i.f14083c.f13746c.mo41977a();
                if (a == null) {
                    this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f12848d.mo41507a(a.f13764b);
        } catch (Exception e) {
            this.f12850f.logException(IronSourceLogger.IronSourceTag.API, str2, e);
            this.f12851g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    /* renamed from: j */
    public final boolean mo41387j() {
        try {
            if (this.f12848d != null) {
                return this.f12848d.mo41510a();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final InterstitialPlacement mo41388k(String str) {
        try {
            InterstitialPlacement s = m13283s(str);
            if (s == null) {
                try {
                    this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    s = mo41377e();
                } catch (Exception unused) {
                    return s;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f12850f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + s, 1);
            return s;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: k */
    public final String mo41389k() {
        return this.f12854j;
    }

    /* renamed from: l */
    public final Placement mo41390l(String str) {
        try {
            Placement p = m13277p(str);
            if (p == null) {
                try {
                    this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 2);
                    p = mo41368b();
                } catch (Exception unused) {
                    return p;
                }
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f12850f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, "getPlacementInfo(placement: " + str + "):" + p, 1);
            return p;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e9  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo41391l() {
        /*
            r8 = this;
            r0 = 83005(0x1443d, float:1.16315E-40)
            r1 = 0
            m13260a((int) r0, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.API
            java.lang.String r2 = ""
            r0.info(r2)
            com.ironsource.mediationsdk.utils.j r0 = r8.f12853i
            if (r0 != 0) goto L_0x001b
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API
            java.lang.String r2 = "bidding data cannot be retrieved, SDK not initialized"
            r0.error(r2)
            goto L_0x00e6
        L_0x001b:
            com.ironsource.mediationsdk.model.p r0 = r0.f14064b
            java.lang.String r2 = "IronSource"
            com.ironsource.mediationsdk.model.NetworkSettings r0 = r0.mo41985a((java.lang.String) r2)
            if (r0 == 0) goto L_0x00e6
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.ironsource.mediationsdk.c r3 = com.ironsource.mediationsdk.C5685c.m13965a()
            org.json.JSONObject r4 = r0.getApplicationSettings()
            r5 = 1
            r6 = 0
            com.ironsource.mediationsdk.AbstractAdapter r0 = r3.mo41824a(r0, r4, r5, r6)
            if (r0 == 0) goto L_0x003e
            org.json.JSONObject r2 = r0.getPlayerBiddingData()     // Catch:{ Exception -> 0x00c5 }
        L_0x003e:
            com.ironsource.mediationsdk.utils.j r0 = r8.f12853i     // Catch:{ Exception -> 0x00c5 }
            com.ironsource.mediationsdk.model.i r0 = r0.f14083c     // Catch:{ Exception -> 0x00c5 }
            com.ironsource.sdk.g.d r0 = r0.f13748e     // Catch:{ Exception -> 0x00c5 }
            com.ironsource.mediationsdk.utils.n r0 = r0.mo42551c()     // Catch:{ Exception -> 0x00c5 }
            boolean r3 = r0.f14120c     // Catch:{ Exception -> 0x00c5 }
            if (r3 == 0) goto L_0x0056
            com.ironsource.environment.c.b r2 = new com.ironsource.environment.c.b     // Catch:{ Exception -> 0x00c5 }
            r2.<init>()     // Catch:{ Exception -> 0x00c5 }
            org.json.JSONObject r2 = r2.mo41244a()     // Catch:{ Exception -> 0x00c5 }
            goto L_0x0062
        L_0x0056:
            com.ironsource.mediationsdk.e r3 = com.ironsource.mediationsdk.C5690e.m13999a()     // Catch:{ Exception -> 0x00c5 }
            org.json.JSONObject r4 = r0.f14119b     // Catch:{ Exception -> 0x00c5 }
            java.util.ArrayList<java.lang.String> r5 = r0.f14118a     // Catch:{ Exception -> 0x00c5 }
            org.json.JSONObject r2 = r3.mo41847a((org.json.JSONObject) r2, (org.json.JSONObject) r4, (java.util.List<java.lang.String>) r5)     // Catch:{ Exception -> 0x00c5 }
        L_0x0062:
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00c5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r5 = "bidding data: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00c5 }
            r4.append(r2)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c5 }
            r3.info(r4)     // Catch:{ Exception -> 0x00c5 }
            if (r2 == 0) goto L_0x00e6
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00c5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r5 = "raw biddingData length: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r5 = r2.toString()     // Catch:{ Exception -> 0x00c5 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00c5 }
            r4.append(r5)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c5 }
            r3.info(r4)     // Catch:{ Exception -> 0x00c5 }
            boolean r0 = r0.f14121d     // Catch:{ Exception -> 0x00c5 }
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = com.ironsource.mediationsdk.utils.IronSourceAES.compressAndEncrypt(r0)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00a6
        L_0x009f:
            com.ironsource.mediationsdk.C5690e.m13999a()     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r0 = com.ironsource.mediationsdk.C5690e.m14007b((org.json.JSONObject) r2)     // Catch:{ Exception -> 0x00c5 }
        L_0x00a6:
            if (r0 == 0) goto L_0x00e7
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ Exception -> 0x00c0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r4 = "biddingData length: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x00c0 }
            int r4 = r0.length()     // Catch:{ Exception -> 0x00c0 }
            r3.append(r4)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00c0 }
            r2.info(r3)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00e7
        L_0x00c0:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x00c7
        L_0x00c5:
            r0 = move-exception
            r2 = r1
        L_0x00c7:
            r3 = 83007(0x1443f, float:1.16318E-40)
            m13260a((int) r3, (org.json.JSONObject) r1)
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.ADAPTER_API
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "got error during creating the token: "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.error(r0)
            r0 = r2
            goto L_0x00e7
        L_0x00e6:
            r0 = r1
        L_0x00e7:
            if (r0 != 0) goto L_0x00ef
            r2 = 83006(0x1443e, float:1.16316E-40)
            m13260a((int) r2, (org.json.JSONObject) r1)
        L_0x00ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5556E.mo41391l():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo41392m() {
        return this.f12865u || this.f12866v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo41393m(String str) {
        boolean z = false;
        if (this.f12866v) {
            return false;
        }
        if (m13291w(str) != C5790c.C5792a.f13939d) {
            z = true;
        }
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(this.f12866v, this.f12813D, 1);
            try {
                mediationAdditionalData.put("placement", str);
                if (this.f12813D) {
                    mediationAdditionalData.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                }
            } catch (Exception unused) {
            }
            C5642d.m13798e().mo41689b(new C5641c(IronSourceConstants.IS_CHECK_CAPPED_TRUE, mediationAdditionalData));
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo41394n(String str) {
        if (!m13296z()) {
            return false;
        }
        C5724h hVar = null;
        try {
            hVar = this.f12853i.f14083c.f13747d.mo41974a(str);
            if (hVar == null && (hVar = this.f12853i.f14083c.f13747d.mo41973a()) == null) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Banner default placement was not found", 3);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (hVar == null) {
            return false;
        }
        return C5790c.m14291b(ContextProvider.getInstance().getApplicationContext(), hVar.getPlacementName());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo41395o(String str) {
        C5800j jVar = this.f12853i;
        if (jVar == null || jVar.f14083c == null || this.f12853i.f14083c.f13744a == null) {
            return C5790c.C5792a.f13939d;
        }
        Placement placement = null;
        try {
            placement = m13277p(str);
            if (placement == null && (placement = mo41368b()) == null) {
                this.f12850f.log(IronSourceLogger.IronSourceTag.API, "Default placement was not found", 3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return placement == null ? C5790c.C5792a.f13939d : C5790c.m14288b(ContextProvider.getInstance().getApplicationContext(), placement);
    }
}
