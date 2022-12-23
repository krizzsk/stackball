package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.util.Size;
import com.smaato.sdk.video.vast.model.MediaFile;

public class VideoViewResizeManager {
    private final Size mediaFileSize;

    private VideoViewResizeManager(Size size) {
        this.mediaFileSize = size;
    }

    public static VideoViewResizeManager create(MediaFile mediaFile) {
        int i = 0;
        int round = mediaFile.width == null ? 0 : Math.round(mediaFile.width.floatValue());
        if (mediaFile.height != null) {
            i = Math.round(mediaFile.height.floatValue());
        }
        if (round == 0 || i == 0) {
            round = 16;
            i = 9;
        }
        return new VideoViewResizeManager(new Size(round, i));
    }

    public void resizeToContainerSizes(VideoPlayerView videoPlayerView, int i, int i2) {
        float f = (float) i;
        float f2 = (float) i2;
        if (f / f2 > ((float) this.mediaFileSize.width) / ((float) this.mediaFileSize.height)) {
            i = Math.round(((float) this.mediaFileSize.width) * (f2 / ((float) this.mediaFileSize.height)));
        } else {
            i2 = Math.round(((float) this.mediaFileSize.height) * (f / ((float) this.mediaFileSize.width)));
        }
        videoPlayerView.setVideoSize(i, i2);
    }
}
