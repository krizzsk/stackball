package com.smaato.sdk.richmedia.mraid.bridge;

import android.graphics.Rect;
import com.p243my.target.ads.Reward;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.mraid.MraidUtils;
import com.smaato.sdk.richmedia.mraid.bridge.PropertiesUtils;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidAudioVolumeLevel;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidExposureProperties;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import com.smaato.sdk.richmedia.util.RectUtils;

public final class MraidJsEvents {
    public static final String AUDIO_VOLUME_CHANGE = "audioVolumeChange";
    public static final String EXPOSURE_CHANGE = "exposureChange";
    private final MraidJsBridge jsBridge;
    private final Logger logger;

    public MraidJsEvents(Logger logger2, MraidJsBridge mraidJsBridge) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.jsBridge = (MraidJsBridge) Objects.requireNonNull(mraidJsBridge);
    }

    public final void fireExposureChangeEvent(MraidExposureProperties mraidExposureProperties) {
        if (!mraidExposureProperties.isEmpty()) {
            this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireExposureChangeEvent(%.2f, %s, %s);", Float.valueOf(mraidExposureProperties.exposedPercentage), RectUtils.rectToString(mraidExposureProperties.visibleRectangleInDp), "null"));
        }
    }

    public final void fireAudioVolumeChangeEvent(MraidAudioVolumeLevel mraidAudioVolumeLevel) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireAudioVolumeChangeEvent(%s);", mraidAudioVolumeLevel.getAudioVolumeLevel()));
    }

    public final void fireErrorEvent(String str, String str2) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireErrorEvent('%s', '%s');", str2, str));
    }

    public final void fireSizeChangeEvent(Rect rect) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireSizeChangeEvent(%d, %d);", Integer.valueOf(rect.width()), Integer.valueOf(rect.height())));
    }

    public final void fireViewableChangeEvent(boolean z) {
        this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireViewableChangeEvent(%b);", Boolean.valueOf(z)));
    }

    public final void fireStateChangeEvent(MraidStateMachineFactory.State state) {
        String str;
        try {
            Object[] objArr = new Object[1];
            int i = PropertiesUtils.C89071.f21800x94e48a94[state.ordinal()];
            if (i == 1) {
                str = "hidden";
            } else if (i == 2) {
                str = "expanded";
            } else if (i == 3) {
                str = "resized";
            } else if (i == 4) {
                str = Reward.DEFAULT;
            } else if (i == 5) {
                str = "loading";
            } else {
                throw new IllegalArgumentException("Unknown state: ".concat(String.valueOf(state)));
            }
            objArr[0] = str;
            this.jsBridge.runScript(MraidUtils.format("window.mraidbridge.fireStateChangeEvent('%s');", objArr));
        } catch (IllegalArgumentException e) {
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.MRAID;
            logger2.error(logDomain, "Failed to call MRAID's fireStateChangeEvent method, reason: " + e.getMessage(), new Object[0]);
        }
    }
}
