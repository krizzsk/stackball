package com.yandex.mobile.ads.video.playback.model;

public interface VideoAd {
    AdPodInfo getAdPodInfo();

    String getInfo();

    MediaFile getMediaFile();

    SkipInfo getSkipInfo();
}
