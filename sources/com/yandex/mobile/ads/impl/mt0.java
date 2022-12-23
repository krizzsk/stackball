package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C15511m0;
import com.yandex.mobile.ads.nativeads.NativeAdType;

public class mt0 {

    /* renamed from: com.yandex.mobile.ads.impl.mt0$a */
    static /* synthetic */ class C14016a {

        /* renamed from: a */
        static final /* synthetic */ int[] f37518a;

        /* renamed from: b */
        static final /* synthetic */ int[] f37519b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0038 */
        static {
            /*
                com.yandex.mobile.ads.nativeads.NativeAdType[] r0 = com.yandex.mobile.ads.nativeads.NativeAdType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37519b = r0
                r1 = 1
                com.yandex.mobile.ads.nativeads.NativeAdType r2 = com.yandex.mobile.ads.nativeads.NativeAdType.APP_INSTALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f37519b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yandex.mobile.ads.nativeads.NativeAdType r3 = com.yandex.mobile.ads.nativeads.NativeAdType.CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f37519b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yandex.mobile.ads.nativeads.NativeAdType r4 = com.yandex.mobile.ads.nativeads.NativeAdType.MEDIA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.yandex.mobile.ads.nativeads.m0[] r3 = com.yandex.mobile.ads.nativeads.C15511m0.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f37518a = r3
                r3[r1] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r1 = f37518a     // Catch:{ NoSuchFieldError -> 0x0038 }
                r3 = 0
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r1 = f37518a     // Catch:{ NoSuchFieldError -> 0x003c }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mt0.C14016a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C15511m0 mo68857a(NativeAdType nativeAdType) {
        C15511m0 m0Var = C15511m0.CONTENT;
        int i = C14016a.f37519b[nativeAdType.ordinal()];
        if (i == 1) {
            return C15511m0.APP_INSTALL;
        }
        if (i == 2 || i != 3) {
            return m0Var;
        }
        return C15511m0.f43908e;
    }
}
