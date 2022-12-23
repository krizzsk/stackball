package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.c3 */
public class C12696c3 {

    /* renamed from: a */
    private final C15146x4 f31792a;

    /* renamed from: b */
    private final C12952e3 f31793b;

    /* renamed from: c */
    private final d60 f31794c;

    /* renamed from: d */
    private final bm1 f31795d;

    public C12696c3(C15029w4 w4Var, d60 d60, bm1 bm1) {
        this.f31794c = d60;
        this.f31795d = bm1;
        this.f31792a = w4Var.mo70633b();
        this.f31793b = w4Var.mo70634c();
    }

    /* renamed from: a */
    public void mo66190a(Player player, boolean z) {
        boolean b = this.f31795d.mo66098b();
        int currentAdGroupIndex = player.getCurrentAdGroupIndex();
        if (currentAdGroupIndex == -1) {
            AdPlaybackState a = this.f31793b.mo66746a();
            long contentPosition = player.getContentPosition();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(contentPosition);
            long contentDuration = player.getContentDuration();
            currentAdGroupIndex = contentDuration != -9223372036854775807L ? a.getAdGroupIndexForPositionUs(micros, timeUnit.toMicros(contentDuration)) : -1;
        }
        boolean c = this.f31792a.mo70827c();
        if (!b && !z && currentAdGroupIndex != -1 && !c) {
            AdPlaybackState a2 = this.f31793b.mo66746a();
            if (a2.adGroupTimesUs[currentAdGroupIndex] == Long.MIN_VALUE) {
                this.f31795d.mo66097a();
            } else {
                this.f31794c.mo66433a(a2, currentAdGroupIndex);
            }
        }
    }
}
