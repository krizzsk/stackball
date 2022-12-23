package com.yandex.mobile.ads.instream.player.p267ad;

import com.yandex.mobile.ads.instream.player.p267ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* renamed from: com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener */
public interface InstreamAdPlayerListener {
    void onAdBufferingFinished(VideoAd videoAd);

    void onAdBufferingStarted(VideoAd videoAd);

    void onAdCompleted(VideoAd videoAd);

    void onAdPaused(VideoAd videoAd);

    void onAdPrepared(VideoAd videoAd);

    void onAdResumed(VideoAd videoAd);

    void onAdSkipped(VideoAd videoAd);

    void onAdStarted(VideoAd videoAd);

    void onAdStopped(VideoAd videoAd);

    void onError(VideoAd videoAd, InstreamAdPlayerError instreamAdPlayerError);

    void onVolumeChanged(VideoAd videoAd, float f);
}
