package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p251fi.Function;
import java.util.Map;

final class ClickInfoMacros {
    private final PxToDpConverter converter;

    interface PxToDpConverter extends Function<Float, Integer> {
    }

    ClickInfoMacros(PxToDpConverter pxToDpConverter) {
        this.converter = (PxToDpConverter) Objects.requireNonNull(pxToDpConverter);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> toMap(Float f, Float f2) {
        Map.Entry[] entryArr = new Map.Entry[1];
        String str = "-2";
        if (f != null && f2 != null && f.floatValue() > 0.0f && f2.floatValue() > 0.0f) {
            str = this.converter.apply(f) + "," + this.converter.apply(f2);
        }
        entryArr[0] = Maps.entryOf("[CLICKPOS]", str);
        return Maps.mapOf(entryArr);
    }
}
