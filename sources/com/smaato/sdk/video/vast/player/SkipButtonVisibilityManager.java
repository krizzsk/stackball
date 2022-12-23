package com.smaato.sdk.video.vast.player;

public abstract class SkipButtonVisibilityManager {
    /* access modifiers changed from: package-private */
    public abstract void onProgressChange(long j, VideoPlayerView videoPlayerView);

    public static SkipButtonVisibilityManager create(VideoTimings videoTimings) {
        if (videoTimings == null) {
            return new NoOpSkipButtonVisibilityManager((byte) 0);
        }
        return videoTimings.isVideoSkippable ? new SkipButtonVisibilityManagerImpl(videoTimings.skipOffsetMillis, videoTimings.videoDurationMillis) : new NoOpSkipButtonVisibilityManager((byte) 0);
    }

    static class NoOpSkipButtonVisibilityManager extends SkipButtonVisibilityManager {
        public final void onProgressChange(long j, VideoPlayerView videoPlayerView) {
        }

        private NoOpSkipButtonVisibilityManager() {
        }

        /* synthetic */ NoOpSkipButtonVisibilityManager(byte b) {
            this();
        }
    }
}
