package com.smaato.sdk.video.vast.player;

public class SkipButtonVisibilityManagerImpl extends SkipButtonVisibilityManager {
    private final long durationMillis;
    private final long skipOffsetMillis;

    SkipButtonVisibilityManagerImpl(long j, long j2) {
        this.skipOffsetMillis = j;
        this.durationMillis = j2;
    }

    /* access modifiers changed from: package-private */
    public final void onProgressChange(long j, VideoPlayerView videoPlayerView) {
        if (j >= this.skipOffsetMillis && j < this.durationMillis) {
            videoPlayerView.showSkipButton();
        }
    }
}
