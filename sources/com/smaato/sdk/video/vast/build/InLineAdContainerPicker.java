package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.model.C8937Ad;
import com.smaato.sdk.video.vast.model.InLine;
import java.util.List;

public class InLineAdContainerPicker {
    static AdContainer<InLine> pickInLineContainer(List<C8937Ad> list) {
        if (list.size() == 1) {
            C8937Ad ad = list.get(0);
            if (ad.inLine != null) {
                return new AdContainer<>(ad, ad.inLine);
            }
            return null;
        }
        for (C8937Ad next : list) {
            if (next.inLine != null && next.sequence == null) {
                return new AdContainer<>(next, next.inLine);
            }
        }
        return null;
    }
}
