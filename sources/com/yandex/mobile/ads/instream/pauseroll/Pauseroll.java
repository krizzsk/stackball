package com.yandex.mobile.ads.instream.pauseroll;

import com.yandex.mobile.ads.impl.qk1;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p267ad.InstreamAdView;

public interface Pauseroll {
    InstreamAdBreak getInstreamAdBreak();

    void invalidate();

    void pause();

    void play(InstreamAdView instreamAdView);

    void prepare(InstreamAdPlayer instreamAdPlayer);

    void resume();

    void setListener(InstreamAdBreakEventListener instreamAdBreakEventListener);

    void setVideoAdPlaybackListener(qk1 qk1);
}
