package com.smaato.sdk.video.vast.build.compare;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.build.VastConfigurationSettings;

public class AverageBitratePicker {
    private final VastConfigurationSettings configurationSettings;

    public AverageBitratePicker(VastConfigurationSettings vastConfigurationSettings) {
        this.configurationSettings = (VastConfigurationSettings) Objects.requireNonNull(vastConfigurationSettings, "configurationSettings can not be null in AverageBitratePicker");
    }

    public int getAverageBitrate() {
        int max = Math.max(this.configurationSettings.displayHeight, this.configurationSettings.displayWidth);
        if (max <= VideoQuality.LOW.maxWidth) {
            return VideoQuality.LOW.averageBitrate;
        }
        if (max <= VideoQuality.MEDIUM.maxWidth) {
            return VideoQuality.MEDIUM.averageBitrate;
        }
        return max <= VideoQuality.HIGH.maxWidth ? VideoQuality.HIGH.averageBitrate : PathInterpolatorCompat.MAX_NUM_POINTS;
    }
}
