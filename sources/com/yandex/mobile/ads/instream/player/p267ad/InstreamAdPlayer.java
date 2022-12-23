package com.yandex.mobile.ads.instream.player.p267ad;

import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer */
public interface InstreamAdPlayer {
    long getAdDuration(VideoAd videoAd);

    long getAdPosition(VideoAd videoAd);

    float getVolume(VideoAd videoAd);

    boolean isPlayingAd(VideoAd videoAd);

    void pauseAd(VideoAd videoAd);

    void playAd(VideoAd videoAd);

    void prepareAd(VideoAd videoAd);

    void releaseAd(VideoAd videoAd);

    void resumeAd(VideoAd videoAd);

    void setInstreamAdPlayerListener(InstreamAdPlayerListener instreamAdPlayerListener);

    void setVolume(VideoAd videoAd, float f);

    void skipAd(VideoAd videoAd);

    void stopAd(VideoAd videoAd);
}
