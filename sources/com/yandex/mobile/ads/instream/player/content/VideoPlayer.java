package com.yandex.mobile.ads.instream.player.content;

public interface VideoPlayer {
    long getVideoDuration();

    long getVideoPosition();

    float getVolume();

    void pauseVideo();

    void prepareVideo();

    void resumeVideo();

    void setVideoPlayerListener(VideoPlayerListener videoPlayerListener);
}
