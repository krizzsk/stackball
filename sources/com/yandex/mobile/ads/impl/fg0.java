package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;

public class fg0 implements Pauseroll {

    /* renamed from: a */
    private final hk0 f33358a;

    public fg0(hk0 hk0) {
        this.f33358a = hk0;
    }

    public InstreamAdBreak getInstreamAdBreak() {
        return this.f33358a.getInstreamAdBreak();
    }

    public void invalidate() {
        this.f33358a.invalidate();
    }

    public void pause() {
        this.f33358a.pause();
    }

    public void play(InstreamAdView instreamAdView) {
        this.f33358a.play(instreamAdView);
    }

    public void prepare(InstreamAdPlayer instreamAdPlayer) {
        this.f33358a.prepare(instreamAdPlayer);
    }

    public void resume() {
        this.f33358a.resume();
    }

    public void setListener(InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f33358a.setListener(instreamAdBreakEventListener);
    }

    public void setVideoAdPlaybackListener(qk1 qk1) {
        this.f33358a.setVideoAdPlaybackListener(qk1);
    }
}
