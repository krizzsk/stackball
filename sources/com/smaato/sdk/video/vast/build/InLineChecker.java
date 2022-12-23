package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.model.C8937Ad;
import java.util.List;

public class InLineChecker {
    static boolean hasInLine(List<C8937Ad> list) {
        if (list.size() == 1) {
            return list.get(0).inLine != null;
        }
        for (C8937Ad next : list) {
            if (next.inLine != null && next.sequence == null) {
                return true;
            }
        }
        return false;
    }
}
