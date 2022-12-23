package com.fyber.inneractive.sdk.p029a.p030a.p031a;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.a.a.a.b */
public enum C2689b {
    REWARDED_VIDEO(UnitDisplayType.REWARDED, true),
    INTERSTITIAL_VIDEO(UnitDisplayType.INTERSTITIAL, true),
    RECTANGLE_DISPLAY(UnitDisplayType.MRECT, false),
    REWARDED_DISPLAY(UnitDisplayType.REWARDED, true),
    BANNER_DISPLAY(UnitDisplayType.BANNER, false),
    INTERSTITIAL_DISPLAY(UnitDisplayType.INTERSTITIAL, false),
    NONE(UnitDisplayType.DEFAULT, false);
    

    /* renamed from: h */
    public UnitDisplayType f6349h;

    /* renamed from: i */
    public boolean f6350i;

    private C2689b(UnitDisplayType unitDisplayType, boolean z) {
        this.f6349h = unitDisplayType;
        this.f6350i = z;
    }

    /* renamed from: com.fyber.inneractive.sdk.a.a.a.b$1 */
    static /* synthetic */ class C26901 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6351a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6351a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6351a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6351a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6351a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p029a.p030a.p031a.C2689b.C26901.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C2689b m5853a(String str, String str2) {
        int i = C26901.f6351a[UnitDisplayType.fromValue(str).ordinal()];
        if (i == 1) {
            return str2.contains("video") ? REWARDED_VIDEO : REWARDED_DISPLAY;
        }
        if (i == 2) {
            return RECTANGLE_DISPLAY;
        }
        if (i == 3) {
            return BANNER_DISPLAY;
        }
        if (i != 4) {
            return null;
        }
        return str2.contains("video") ? INTERSTITIAL_VIDEO : INTERSTITIAL_DISPLAY;
    }
}
