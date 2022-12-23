package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.f3 */
public class C13025f3 {

    /* renamed from: a */
    private final C13675k1 f33214a;

    public C13025f3(cm1 cm1) {
        this.f33214a = new C13675k1(cm1);
    }

    /* renamed from: a */
    public AdPlaybackState mo66912a(InstreamAd instreamAd, Object obj) {
        List<? extends InstreamAdBreak> adBreaks = instreamAd.getAdBreaks();
        if (adBreaks.isEmpty()) {
            return AdPlaybackState.NONE;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (InstreamAdBreak adBreakPosition : adBreaks) {
            long a = this.f33214a.mo68114a(adBreakPosition.getAdBreakPosition());
            if (a == Long.MIN_VALUE) {
                i = 1;
            } else if (a != -1) {
                arrayList.add(Long.valueOf(C3716C.msToUs(a)));
            }
        }
        int size = arrayList.size() + i;
        long[] jArr = new long[size];
        if (i != 0) {
            jArr[size - 1] = Long.MIN_VALUE;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jArr[i2] = ((Long) arrayList.get(i2)).longValue();
        }
        Arrays.sort(jArr, 0, arrayList.size());
        return new AdPlaybackState(obj, jArr);
    }
}
