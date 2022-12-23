package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

public class xz0 implements t01 {

    /* renamed from: a */
    private final Player f42717a;

    /* renamed from: b */
    private final a01 f42718b;

    public xz0(Player player, a01 a01) {
        this.f42717a = player;
        this.f42718b = a01;
    }

    /* renamed from: a */
    public long mo70951a() {
        long j;
        Timeline b = this.f42718b.mo65633b();
        Timeline.Period a = this.f42718b.mo65630a();
        long contentPosition = this.f42717a.getContentPosition();
        if (b.isEmpty()) {
            j = 0;
        } else {
            j = b.getPeriod(0, a).getPositionInWindowMs();
        }
        return contentPosition - j;
    }
}
