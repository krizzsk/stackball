package com.fyber.inneractive.sdk.config.p034a.p035a;

/* renamed from: com.fyber.inneractive.sdk.config.a.a.f */
public class C2746f extends C2744d {

    /* renamed from: e */
    public static final C2748a f6472e = C2748a.NONE;

    public C2746f() {
        super("video_player");
    }

    /* renamed from: com.fyber.inneractive.sdk.config.a.a.f$1 */
    static /* synthetic */ class C27471 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6473a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6473a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6473a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.p034a.p035a.C2746f.C27471.<clinit>():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.a.a.f$a */
    public enum C2748a {
        NONE("none"),
        OPEN("open");
        

        /* renamed from: c */
        public String f6477c;

        private C2748a(String str) {
            this.f6477c = str;
        }

        /* renamed from: a */
        public static C2748a m5980a(String str) {
            for (C2748a aVar : values()) {
                if (str.equalsIgnoreCase(aVar.f6477c)) {
                    return aVar;
                }
            }
            return NONE;
        }
    }

    /* renamed from: c */
    public final C2744d mo17979c() {
        C2746f fVar = new C2746f();
        mo17983a(fVar);
        return fVar;
    }

    /* renamed from: com.fyber.inneractive.sdk.config.a.a.f$b */
    public enum C2749b {
        LEGACY("legacy"),
        EXTRACTOR("extractor"),
        NONE("none");
        

        /* renamed from: d */
        public String f6482d;

        private C2749b(String str) {
            this.f6482d = str;
        }
    }
}
