package com.smaato.sdk.video.vast.build.compare;

import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.Comparator;

public class BitrateComparator implements Comparator<MediaFile> {
    private final int desiredBitrate;
    private final boolean isConnectionFast;

    public BitrateComparator(int i, boolean z) {
        this.desiredBitrate = i;
        this.isConnectionFast = z;
    }

    public int compare(MediaFile mediaFile, MediaFile mediaFile2) {
        if ((mediaFile == null) ^ (mediaFile2 == null)) {
            return mediaFile == null ? 1 : -1;
        }
        if (mediaFile == null) {
            return 0;
        }
        float f = 0.0f;
        float intValue = mediaFile.bitrate == null ? 0.0f : (float) mediaFile.bitrate.intValue();
        if (mediaFile2.bitrate != null) {
            f = (float) mediaFile2.bitrate.intValue();
        }
        if (this.isConnectionFast) {
            return Float.compare(Math.abs(((float) this.desiredBitrate) - intValue), Math.abs(((float) this.desiredBitrate) - f));
        }
        return Float.compare(intValue, f);
    }
}
