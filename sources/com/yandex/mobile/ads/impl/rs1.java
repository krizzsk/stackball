package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

public class rs1 implements VideoPlayer {

    /* renamed from: a */
    private final t11 f39711a;

    /* renamed from: b */
    private final c01 f39712b;

    /* renamed from: c */
    private final rm1 f39713c;

    public rs1(t11 t11, c01 c01, rm1 rm1) {
        this.f39711a = t11;
        this.f39712b = c01;
        this.f39713c = rm1;
    }

    public long getVideoDuration() {
        return this.f39711a.mo65690a().mo70257a();
    }

    public long getVideoPosition() {
        return this.f39711a.mo65690a().mo70258b();
    }

    public float getVolume() {
        Float a = this.f39712b.mo66177a();
        if (a != null) {
            return a.floatValue();
        }
        return 0.0f;
    }

    public void pauseVideo() {
        this.f39713c.onVideoPaused();
    }

    public void prepareVideo() {
        this.f39713c.onVideoPrepared();
    }

    public void resumeVideo() {
        this.f39713c.onVideoResumed();
    }

    public void setVideoPlayerListener(VideoPlayerListener videoPlayerListener) {
        this.f39713c.mo69786a(videoPlayerListener);
    }
}
