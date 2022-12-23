package com.amazon.device.ads;

import com.inmobi.media.C5073cj;
import java.util.HashMap;

enum RelativePosition {
    TOP_LEFT,
    TOP_RIGHT,
    CENTER,
    BOTTOM_LEFT,
    BOTTOM_RIGHT,
    TOP_CENTER,
    BOTTOM_CENTER;
    
    private static final HashMap<String, RelativePosition> POSITIONS = null;

    static {
        HashMap<String, RelativePosition> hashMap = new HashMap<>();
        POSITIONS = hashMap;
        hashMap.put("top-left", TOP_LEFT);
        POSITIONS.put(C5073cj.DEFAULT_POSITION, TOP_RIGHT);
        POSITIONS.put("top-center", TOP_CENTER);
        POSITIONS.put("bottom-left", BOTTOM_LEFT);
        POSITIONS.put("bottom-right", BOTTOM_RIGHT);
        POSITIONS.put("bottom-center", BOTTOM_CENTER);
        POSITIONS.put("center", CENTER);
    }

    public static RelativePosition fromString(String str) {
        return POSITIONS.get(str);
    }
}
