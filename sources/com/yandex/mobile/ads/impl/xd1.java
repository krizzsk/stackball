package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.C3716C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

public class xd1 {

    /* renamed from: a */
    private final C12952e3 f42518a;

    /* renamed from: b */
    private final a01 f42519b;

    /* renamed from: c */
    private final C14865v5 f42520c;

    /* renamed from: d */
    private final cm1 f42521d;

    /* renamed from: e */
    private final mz0 f42522e;

    /* renamed from: f */
    private final sg1 f42523f = new sg1();

    public xd1(C12952e3 e3Var, zz0 zz0, C14865v5 v5Var, mz0 mz0) {
        this.f42518a = e3Var;
        this.f42520c = v5Var;
        this.f42519b = zz0.mo71287d();
        this.f42521d = zz0.mo71284a();
        this.f42522e = mz0;
    }

    /* renamed from: a */
    public void mo70889a(Timeline timeline) {
        if (!timeline.isEmpty()) {
            timeline.getPeriodCount();
            this.f42519b.mo65631a(timeline);
            long j = timeline.getPeriod(0, this.f42519b.mo65630a()).durationUs;
            this.f42521d.mo66333a(C3716C.usToMs(j));
            if (j != -9223372036854775807L) {
                AdPlaybackState a = this.f42518a.mo66746a();
                this.f42523f.getClass();
                AdPlaybackState withContentDurationUs = a.withContentDurationUs(j);
                for (int i = 0; i < withContentDurationUs.adGroupCount; i++) {
                    if (withContentDurationUs.adGroupTimesUs[i] > j) {
                        withContentDurationUs = withContentDurationUs.withSkippedAdGroup(i);
                    }
                }
                this.f42518a.mo66747a(withContentDurationUs);
            }
            if (!this.f42520c.mo70447b()) {
                this.f42520c.mo70446a();
            }
            this.f42522e.mo68873a();
        }
    }
}
