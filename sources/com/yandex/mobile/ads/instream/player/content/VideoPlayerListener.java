package com.yandex.mobile.ads.instream.player.content;

public interface VideoPlayerListener {
    void onVideoCompleted();

    void onVideoError();

    void onVideoPaused();

    void onVideoPrepared();

    void onVideoResumed();
}
