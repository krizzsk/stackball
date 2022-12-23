package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* renamed from: com.yandex.mobile.ads.impl.k1 */
public class C13675k1 {

    /* renamed from: a */
    private final cm1 f35924a;

    /* renamed from: com.yandex.mobile.ads.impl.k1$a */
    static /* synthetic */ class C13676a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35925a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yandex.mobile.ads.instream.InstreamAdBreakPosition$Type[] r0 = com.yandex.mobile.ads.instream.InstreamAdBreakPosition.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35925a = r0
                com.yandex.mobile.ads.instream.InstreamAdBreakPosition$Type r1 = com.yandex.mobile.ads.instream.InstreamAdBreakPosition.Type.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35925a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yandex.mobile.ads.instream.InstreamAdBreakPosition$Type r1 = com.yandex.mobile.ads.instream.InstreamAdBreakPosition.Type.PERCENTS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35925a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yandex.mobile.ads.instream.InstreamAdBreakPosition$Type r1 = com.yandex.mobile.ads.instream.InstreamAdBreakPosition.Type.POSITION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13675k1.C13676a.<clinit>():void");
        }
    }

    public C13675k1(cm1 cm1) {
        this.f35924a = cm1;
    }

    /* renamed from: a */
    public long mo68114a(InstreamAdBreakPosition instreamAdBreakPosition) {
        long value = instreamAdBreakPosition.getValue();
        int i = C13676a.f35925a[instreamAdBreakPosition.getPositionType().ordinal()];
        if (i == 1) {
            return value;
        }
        if (i == 2) {
            if (value == 100) {
                return Long.MIN_VALUE;
            }
            if (value == 0) {
                return 0;
            }
            long a = this.f35924a.mo66332a();
            if (a != -9223372036854775807L) {
                return tk0.m42363a((float) value, a);
            }
        }
        return -1;
    }
}
