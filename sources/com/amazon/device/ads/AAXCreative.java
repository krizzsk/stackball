package com.amazon.device.ads;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

enum AAXCreative {
    HTML(1007),
    MRAID1(1016),
    MRAID2(1017),
    INTERSTITIAL(1008),
    CAN_PLAY_AUDIO1(1001),
    CAN_PLAY_AUDIO2(1002),
    CAN_EXPAND1(1003),
    CAN_EXPAND2(1004),
    CAN_PLAY_VIDEO(1014),
    VIDEO_INTERSTITIAL(1030),
    REQUIRES_TRANSPARENCY(1031);
    
    private static final HashSet<AAXCreative> primaryCreativeTypes = null;

    /* renamed from: id */
    private final int f1612id;

    static {
        HashSet<AAXCreative> hashSet = new HashSet<>();
        primaryCreativeTypes = hashSet;
        hashSet.add(HTML);
        primaryCreativeTypes.add(MRAID1);
        primaryCreativeTypes.add(MRAID2);
        primaryCreativeTypes.add(INTERSTITIAL);
        primaryCreativeTypes.add(VIDEO_INTERSTITIAL);
    }

    private AAXCreative(int i) {
        this.f1612id = i;
    }

    public int getId() {
        return this.f1612id;
    }

    public static boolean containsPrimaryCreativeType(Set<AAXCreative> set) {
        Iterator<AAXCreative> it = primaryCreativeTypes.iterator();
        while (it.hasNext()) {
            if (set.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static AAXCreative getCreativeType(int i) {
        if (i == 1007) {
            return HTML;
        }
        if (i == 1008) {
            return INTERSTITIAL;
        }
        if (i == 1014) {
            return CAN_PLAY_VIDEO;
        }
        if (i == 1016) {
            return MRAID1;
        }
        if (i == 1017) {
            return MRAID2;
        }
        if (i == 1030) {
            return VIDEO_INTERSTITIAL;
        }
        if (i == 1031) {
            return REQUIRES_TRANSPARENCY;
        }
        switch (i) {
            case 1001:
                return CAN_PLAY_AUDIO1;
            case 1002:
                return CAN_PLAY_AUDIO2;
            case 1003:
                return CAN_EXPAND1;
            case 1004:
                return CAN_EXPAND2;
            default:
                return null;
        }
    }

    static AAXCreative getTopCreative(Set<AAXCreative> set) {
        if (set.contains(MRAID2)) {
            return MRAID2;
        }
        if (set.contains(MRAID1)) {
            return MRAID1;
        }
        if (set.contains(HTML)) {
            return HTML;
        }
        return null;
    }
}
