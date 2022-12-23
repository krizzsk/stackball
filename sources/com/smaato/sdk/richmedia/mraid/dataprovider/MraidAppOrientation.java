package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.content.Context;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.util.DeviceUtils;

public final class MraidAppOrientation {
    public final boolean isLocked;
    public final DeviceUtils.ScreenOrientation orientation;

    private MraidAppOrientation(boolean z, DeviceUtils.ScreenOrientation screenOrientation) {
        this.isLocked = z;
        this.orientation = screenOrientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MraidAppOrientation mraidAppOrientation = (MraidAppOrientation) obj;
            return this.isLocked == mraidAppOrientation.isLocked && this.orientation == mraidAppOrientation.orientation;
        }
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isLocked), this.orientation);
    }

    public static MraidAppOrientation from(Context context) {
        return new MraidAppOrientation(DeviceUtils.isOrientationLocked(context), DeviceUtils.getScreenOrientation(context));
    }
}
