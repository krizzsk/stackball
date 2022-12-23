package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

public class nj0 {

    /* renamed from: a */
    private final u01 f37817a;

    /* renamed from: b */
    private final cm1 f37818b;

    public nj0(u01 u01, cm1 cm1) {
        this.f37817a = u01;
        this.f37818b = cm1;
    }

    /* renamed from: a */
    public int mo69034a(AdPlaybackState adPlaybackState) {
        t01 b = this.f37817a.mo70264b();
        if (b == null) {
            return -1;
        }
        long msToUs = C3716C.msToUs(this.f37818b.mo66332a());
        long msToUs2 = C3716C.msToUs(((xz0) b).mo70951a());
        int adGroupIndexForPositionUs = adPlaybackState.getAdGroupIndexForPositionUs(msToUs2, msToUs);
        return adGroupIndexForPositionUs == -1 ? adPlaybackState.getAdGroupIndexAfterPositionUs(msToUs2, msToUs) : adGroupIndexForPositionUs;
    }
}
