package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

public class d60 {

    /* renamed from: a */
    private final u01 f32397a;

    /* renamed from: b */
    private final cm1 f32398b;

    public d60(u01 u01, cm1 cm1) {
        this.f32397a = u01;
        this.f32398b = cm1;
    }

    /* renamed from: a */
    public void mo66433a(AdPlaybackState adPlaybackState, int i) {
        long usToMs = C3716C.usToMs(adPlaybackState.adGroupTimesUs[i]);
        if (usToMs == Long.MIN_VALUE) {
            usToMs = this.f32398b.mo66332a();
        }
        this.f32397a.mo70262a(new e60(usToMs));
    }

    /* renamed from: a */
    public void mo66432a() {
        this.f32397a.mo70262a((e60) null);
    }
}
