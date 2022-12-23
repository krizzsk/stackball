package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

public class o40 implements Player.Listener {

    /* renamed from: a */
    private final C13189gc f38081a;

    /* renamed from: b */
    private final r40 f38082b;

    /* renamed from: c */
    private final wz0 f38083c;

    /* renamed from: d */
    private final yz0 f38084d;

    /* renamed from: e */
    private final uz0 f38085e;

    /* renamed from: f */
    private final xd1 f38086f;

    /* renamed from: g */
    private final mz0 f38087g;

    public o40(C13189gc gcVar, r40 r40, uz0 uz0, yz0 yz0, wz0 wz0, xd1 xd1, mz0 mz0) {
        this.f38081a = gcVar;
        this.f38082b = r40;
        this.f38085e = uz0;
        this.f38083c = wz0;
        this.f38084d = yz0;
        this.f38086f = xd1;
        this.f38087g = mz0;
    }

    public void onPlayWhenReadyChanged(boolean z, int i) {
        Player a = this.f38082b.mo69687a();
        if (this.f38081a.mo67228b() && a != null) {
            this.f38084d.mo71137a(z, a.getPlaybackState());
        }
    }

    public void onPlaybackStateChanged(int i) {
        Player a = this.f38082b.mo69687a();
        if (this.f38081a.mo67228b() && a != null) {
            this.f38085e.mo70423b(a, i);
        }
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        this.f38083c.mo70776a(exoPlaybackException);
    }

    public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.f38087g.mo68873a();
    }

    public void onRenderedFirstFrame() {
        Player a = this.f38082b.mo69687a();
        if (a != null) {
            onPlaybackStateChanged(a.getPlaybackState());
        }
    }

    public void onTimelineChanged(Timeline timeline, int i) {
        this.f38086f.mo70889a(timeline);
    }
}
