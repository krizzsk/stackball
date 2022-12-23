package com.smaato.sdk.video.vast.tracking.macro;

import com.smaato.sdk.core.util.collections.Maps;
import java.util.Map;

final class VerificationInfoMacros {
    VerificationInfoMacros() {
    }

    static Map<String, String> toMap() {
        return Maps.mapOf(Maps.entryOf("[REASON]", "-1"));
    }
}
