package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.h0 */
public class C13269h0 implements C12468b0 {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0.longValue() == -1) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.C12348a0 mo64515a(android.content.Context r16, android.widget.RelativeLayout r17, android.os.ResultReceiver r18, com.yandex.mobile.ads.impl.C13371i0 r19, com.yandex.mobile.ads.impl.C12947e0 r20, android.content.Intent r21, android.view.Window r22) {
        /*
            r15 = this;
            r0 = r21
            java.lang.String r1 = "data_identifier"
            r2 = 0
            boolean r3 = r0.hasExtra(r1)     // Catch:{ Exception -> 0x0020 }
            if (r3 == 0) goto L_0x0020
            r3 = -1
            long r0 = r0.getLongExtra(r1, r3)     // Catch:{ Exception -> 0x0020 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0020 }
            long r5 = r0.longValue()     // Catch:{ Exception -> 0x001e }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0021
            goto L_0x0020
        L_0x001e:
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            if (r0 == 0) goto L_0x0030
            com.yandex.mobile.ads.impl.d0 r1 = com.yandex.mobile.ads.impl.C12845d0.m34958a()
            long r3 = r0.longValue()
            com.yandex.mobile.ads.impl.c0 r0 = r1.mo66380a(r3)
            goto L_0x0031
        L_0x0030:
            r0 = r2
        L_0x0031:
            if (r0 == 0) goto L_0x0082
            com.yandex.mobile.ads.base.AdResponse r8 = r0.mo66169a()
            com.yandex.mobile.ads.nativeads.NativeAd r1 = r0.mo66171c()
            com.yandex.mobile.ads.impl.z70 r3 = r0.mo66170b()
            java.lang.Object r4 = r8.mo64447z()
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L_0x0067
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0067
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0082
            com.yandex.mobile.ads.impl.g80 r14 = new com.yandex.mobile.ads.impl.g80
            r14.<init>(r8, r4, r3)
            com.yandex.mobile.ads.impl.g0 r2 = new com.yandex.mobile.ads.impl.g0
            r9 = r2
            r10 = r16
            r11 = r17
            r12 = r19
            r13 = r22
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x0082
        L_0x0067:
            boolean r3 = r1 instanceof com.yandex.mobile.ads.nativeads.C15526t
            if (r3 == 0) goto L_0x0082
            r7 = r1
            com.yandex.mobile.ads.nativeads.t r7 = (com.yandex.mobile.ads.nativeads.C15526t) r7
            int r11 = r0.mo66172d()
            com.yandex.mobile.ads.impl.j0 r2 = new com.yandex.mobile.ads.impl.j0
            r3 = r2
            r4 = r16
            r5 = r17
            r6 = r22
            r9 = r19
            r10 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C13269h0.mo64515a(android.content.Context, android.widget.RelativeLayout, android.os.ResultReceiver, com.yandex.mobile.ads.impl.i0, com.yandex.mobile.ads.impl.e0, android.content.Intent, android.view.Window):com.yandex.mobile.ads.impl.a0");
    }
}
