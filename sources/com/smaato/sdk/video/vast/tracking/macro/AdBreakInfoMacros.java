package com.smaato.sdk.video.vast.tracking.macro;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.video.utils.DateFormatUtils;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.Map;

final class AdBreakInfoMacros {
    private final DateFormatUtils dateFormatUtils;
    private final UniversalAdId universalAdId;
    private final VastScenario vastScenario;

    AdBreakInfoMacros(DateFormatUtils dateFormatUtils2, VastScenario vastScenario2, UniversalAdId universalAdId2) {
        this.dateFormatUtils = (DateFormatUtils) Objects.requireNonNull(dateFormatUtils2);
        this.vastScenario = vastScenario2;
        this.universalAdId = universalAdId2;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> toMap(PlayerState playerState) {
        String str;
        String str2;
        Long l = playerState.offsetMillis;
        String str3 = "-2";
        if (l == null) {
            str = str3;
        } else {
            str = this.dateFormatUtils.offsetFromTimeInterval(l.longValue());
        }
        Map.Entry[] entryArr = new Map.Entry[15];
        entryArr[0] = Maps.entryOf("[CONTENTPLAYHEAD]", str);
        entryArr[1] = Maps.entryOf("[MEDIAPLAYHEAD]", str);
        entryArr[2] = Maps.entryOf("[BREAKPOSITION]", "4");
        VastScenario vastScenario2 = this.vastScenario;
        if (vastScenario2 == null) {
            str2 = str3;
        } else {
            str2 = Joiner.join((CharSequence) ",", (Iterable) vastScenario2.blockedAdCategories);
        }
        entryArr[3] = Maps.entryOf("[BLOCKEDADCATEGORIES]", str2);
        entryArr[4] = Maps.entryOf("[ADCATEGORIES]", "-1");
        entryArr[5] = Maps.entryOf("[ADCOUNT]", "1");
        entryArr[6] = Maps.entryOf("[TRANSACTIONID]", "-1");
        entryArr[7] = Maps.entryOf("[PLACEMENTTYPE]", CampaignEx.CLICKMODE_ON);
        entryArr[8] = Maps.entryOf("[ADTYPE]", "video");
        if (this.universalAdId != null) {
            str3 = this.universalAdId.idRegistry + " " + this.universalAdId.idValue;
        }
        entryArr[9] = Maps.entryOf("[UNIVERSALADID]", str3);
        entryArr[10] = Maps.entryOf("[BREAKMAXDURATION]", "60");
        entryArr[11] = Maps.entryOf("[BREAKMINDURATION]", "1");
        entryArr[12] = Maps.entryOf("[BREAKMAXADS]", "1");
        entryArr[13] = Maps.entryOf("[BREAKMINADLENGTH]", "1");
        entryArr[14] = Maps.entryOf("[BREAKMAXADLENGTH]", "60");
        return Maps.mapOf(entryArr);
    }
}
