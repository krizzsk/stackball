package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.graphics.Rect;
import com.smaato.sdk.core.util.Objects;

public final class MraidExposureProperties {
    public final float exposedPercentage;
    public final Rect visibleRectangleInDp;

    private MraidExposureProperties() {
        this(-1.0f, new Rect());
    }

    private MraidExposureProperties(float f, Rect rect) {
        this.exposedPercentage = f;
        this.visibleRectangleInDp = rect;
    }

    public final boolean isEmpty() {
        return this.exposedPercentage < 0.0f || this.visibleRectangleInDp.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MraidExposureProperties mraidExposureProperties = (MraidExposureProperties) obj;
            return Float.compare(mraidExposureProperties.exposedPercentage, this.exposedPercentage) == 0 && Objects.equals(this.visibleRectangleInDp, mraidExposureProperties.visibleRectangleInDp);
        }
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.exposedPercentage), this.visibleRectangleInDp);
    }

    public static MraidExposureProperties valueOf(float f, Rect rect) {
        return new MraidExposureProperties(f, rect);
    }

    static MraidExposureProperties empty() {
        return new MraidExposureProperties();
    }
}
