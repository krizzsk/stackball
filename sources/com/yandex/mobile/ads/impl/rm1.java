package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

public class rm1 implements VideoPlayerListener {

    /* renamed from: a */
    private VideoPlayerListener f39509a;

    /* renamed from: a */
    public void mo69786a(VideoPlayerListener videoPlayerListener) {
        this.f39509a = videoPlayerListener;
    }

    public void onVideoCompleted() {
        VideoPlayerListener videoPlayerListener = this.f39509a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoCompleted();
        }
    }

    public void onVideoError() {
        VideoPlayerListener videoPlayerListener = this.f39509a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoError();
        }
    }

    public void onVideoPaused() {
        VideoPlayerListener videoPlayerListener = this.f39509a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoPaused();
        }
    }

    public void onVideoPrepared() {
        VideoPlayerListener videoPlayerListener = this.f39509a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoPrepared();
        }
    }

    public void onVideoResumed() {
        VideoPlayerListener videoPlayerListener = this.f39509a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoResumed();
        }
    }
}
