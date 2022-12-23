package com.fyber.inneractive.sdk.p039dv.p042c;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p039dv.C2896g;
import com.fyber.inneractive.sdk.p039dv.p041b.C2869a;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3662m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.dv.c.b */
public final class C2872b extends C2871a<QueryInfo> {

    /* renamed from: a */
    final HashMap<AdFormat, QueryInfo> f6823a = new HashMap<>();

    /* renamed from: b */
    boolean f6824b = false;

    /* renamed from: c */
    final Object f6825c = new Object();

    /* renamed from: d */
    int f6826d = 0;

    /* renamed from: a */
    private void m6350a(final AdFormat adFormat) {
        C3662m.m9138a(new Runnable() {
            public final void run() {
                try {
                    QueryInfo.generate(C3657l.m9125p(), adFormat, new AdRequest.Builder().build(), new QueryInfoGenerationCallback() {
                        public final void onSuccess(QueryInfo queryInfo) {
                            IAlog.m9034b("DVHanlder - %s - put query: %s", adFormat.toString(), queryInfo.getQuery());
                            synchronized (C2872b.this.f6825c) {
                                C2872b.this.f6826d++;
                                C2872b.this.f6823a.put(adFormat, queryInfo);
                            }
                        }

                        public final void onFailure(String str) {
                            if (!C2872b.this.f6824b) {
                                C2872b bVar = C2872b.this;
                                AdFormat adFormat = adFormat;
                                IAlog.m9034b(String.format("Firing Event 1000 - Fetch error DV - msg  %s", new Object[]{str}), new Object[0]);
                                new C2968n.C2969a(C2966l.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (C3018e) null).mo18433a(new C2968n.C2971b().mo18438a("message", str).mo18438a("version", C2872b.m6352b()).mo18438a("adFormat", adFormat.name()).mo18438a("success_count", Integer.valueOf(bVar.f6826d))).mo18436b((String) null);
                                C2872b.this.f6824b = true;
                            }
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.c.b$2 */
    static /* synthetic */ class C28752 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6830a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6830a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6830a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6830a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p039dv.p042c.C2872b.C28752.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static String m6352b() {
        try {
            return MobileAds.getVersionString();
        } catch (Exception unused) {
            return "na";
        }
    }

    /* renamed from: a */
    public static void m6351a(String str, C2869a aVar, InneractiveAdRequest inneractiveAdRequest, C3018e eVar, String str2) {
        IAlog.m9034b(String.format("Firing Event 1001 -Phase - %s  Fetch error DV - msg  %s", new Object[]{aVar.name(), str2}), new Object[0]);
        new C2968n.C2969a(C2966l.DV_ERROR_PHASE, inneractiveAdRequest, eVar).mo18433a(new C2968n.C2971b().mo18438a("spot_id", str).mo18438a("phase", aVar.name().toLowerCase()).mo18438a("version", m6352b()).mo18438a("message", str2)).mo18436b((String) null);
    }

    /* renamed from: a */
    public final void mo18245a() {
        for (AdFormat adFormat : AdFormat.values()) {
            if (adFormat != AdFormat.NATIVE) {
                m6350a(adFormat);
            }
        }
    }

    /* renamed from: a */
    public final C2896g mo18244a(UnitDisplayType unitDisplayType) {
        AdFormat adFormat;
        C2896g gVar;
        int i = C28752.f6830a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            adFormat = AdFormat.BANNER;
        } else if (i != 3) {
            adFormat = AdFormat.INTERSTITIAL;
        } else {
            adFormat = AdFormat.REWARDED;
        }
        QueryInfo queryInfo = this.f6823a.get(adFormat);
        if (queryInfo != null) {
            synchronized (this.f6825c) {
                this.f6823a.remove(adFormat);
            }
            gVar = new C2896g(queryInfo);
        } else {
            gVar = null;
        }
        IAlog.m9034b("DVHanlder - get query: %s", gVar);
        m6350a(adFormat);
        return gVar;
    }
}
