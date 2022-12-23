package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.video.vast.model.C8937Ad;
import com.smaato.sdk.video.vast.model.Wrapper;
import java.util.List;

public class WrapperAdContainerPicker {
    static AdContainer<Wrapper> pickWrapperContainer(List<C8937Ad> list) {
        if (list.size() == 1) {
            C8937Ad ad = list.get(0);
            if (ad.wrapper != null) {
                return new AdContainer<>(ad, ad.wrapper);
            }
            return null;
        }
        for (C8937Ad next : list) {
            if (next.wrapper != null && next.sequence == null) {
                return new AdContainer<>(next, next.wrapper);
            }
        }
        return null;
    }
}
