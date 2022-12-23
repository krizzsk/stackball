package com.smaato.sdk.richmedia.mraid.dataprovider;

import com.smaato.sdk.core.util.Objects;
import java.util.Locale;

public final class MraidAudioVolumeLevel {
    private final String audioVolumeLevel;

    private MraidAudioVolumeLevel(String str) {
        this.audioVolumeLevel = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.audioVolumeLevel, ((MraidAudioVolumeLevel) obj).audioVolumeLevel);
    }

    public final int hashCode() {
        return Objects.hash(this.audioVolumeLevel);
    }

    public final String getAudioVolumeLevel() {
        return this.audioVolumeLevel;
    }

    public static MraidAudioVolumeLevel create(int i, int i2) {
        if (i2 == 0) {
            return new MraidAudioVolumeLevel((String) null);
        }
        return new MraidAudioVolumeLevel(String.format(Locale.US, "%.1f", new Object[]{Float.valueOf((((float) i) * 100.0f) / ((float) i2))}));
    }
}
