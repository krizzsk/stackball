package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;

public class cg0 implements Inroll {

    /* renamed from: a */
    private final hk0 f31916a;

    public cg0(hk0 hk0) {
        this.f31916a = hk0;
    }

    public InstreamAdBreak getInstreamAdBreak() {
        return this.f31916a.getInstreamAdBreak();
    }

    public void invalidate() {
        this.f31916a.invalidate();
    }

    public void pause() {
        this.f31916a.pause();
    }

    public void play(InstreamAdView instreamAdView) {
        this.f31916a.play(instreamAdView);
    }

    public void prepare(InstreamAdPlayer instreamAdPlayer) {
        this.f31916a.prepare(instreamAdPlayer);
    }

    public void resume() {
        this.f31916a.resume();
    }

    public void setListener(InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f31916a.setListener(instreamAdBreakEventListener);
    }

    public void setVideoAdPlaybackListener(qk1 qk1) {
        this.f31916a.setVideoAdPlaybackListener(qk1);
    }
}
