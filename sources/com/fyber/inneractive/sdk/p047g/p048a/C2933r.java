package com.fyber.inneractive.sdk.p047g.p048a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.g.a.r */
public enum C2933r {
    EVENT_FINAL_RETURN("finalReturn"),
    EVENT_IMPRESSION("impression"),
    EVENT_START("start"),
    EVENT_FIRSTQ(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE),
    EVENT_MID("midpoint"),
    EVENT_THIRDQ(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE),
    EVENT_COMPLETE("complete"),
    EVENT_MUTE("mute"),
    EVENT_UNMUTE("unmute"),
    EVENT_PAUSE(CampaignEx.JSON_NATIVE_VIDEO_PAUSE),
    EVENT_RESUME(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
    EVENT_FULLSCREEN("fullscreen"),
    EVENT_EXIT_FULLSCREEN("exitFullscreen"),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK("click"),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE("close"),
    EVENT_EXPAND(MraidJsMethods.EXPAND),
    EVENT_COLLAPSE("collapse"),
    EVENT_CLOSE_LINEAR("closeLinear"),
    UNKNOWN("UnkownEvent");
    

    /* renamed from: x */
    private static final Map<String, C2933r> f7054x = null;

    /* renamed from: w */
    public final String f7056w;

    static {
        int i;
        f7054x = new HashMap();
        for (C2933r rVar : values()) {
            f7054x.put(rVar.f7056w, rVar);
        }
    }

    private C2933r(String str) {
        this.f7056w = str;
    }

    /* renamed from: a */
    public static C2933r m6560a(String str) {
        return f7054x.containsKey(str) ? f7054x.get(str) : UNKNOWN;
    }
}
