package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* renamed from: com.yandex.mobile.ads.impl.d2 */
public class C12847d2 {

    /* renamed from: a */
    private final C12952e3 f32345a;

    /* renamed from: b */
    private final C13675k1 f32346b;

    public C12847d2(cm1 cm1, C12952e3 e3Var) {
        this.f32345a = e3Var;
        this.f32346b = new C13675k1(cm1);
    }

    /* renamed from: a */
    public int mo66391a(InstreamAdBreakPosition instreamAdBreakPosition) {
        long a = this.f32346b.mo68114a(instreamAdBreakPosition);
        AdPlaybackState a2 = this.f32345a.mo66746a();
        if (a == Long.MIN_VALUE) {
            int i = a2.adGroupCount;
            if (i <= 0) {
                return -1;
            }
            int i2 = i - 1;
            if (a2.adGroupTimesUs[i2] == Long.MIN_VALUE) {
                return i2;
            }
            return -1;
        }
        long msToUs = C3716C.msToUs(a);
        for (int i3 = 0; i3 < a2.adGroupCount; i3++) {
            long j = a2.adGroupTimesUs[i3];
            if (j != Long.MIN_VALUE && Math.abs(j - msToUs) <= 1000) {
                return i3;
            }
        }
        return -1;
    }
}
