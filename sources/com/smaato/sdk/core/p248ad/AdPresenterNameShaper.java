package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.util.Joiner;
import java.util.Arrays;

/* renamed from: com.smaato.sdk.core.ad.AdPresenterNameShaper */
public class AdPresenterNameShaper {
    public String shapeName(AdFormat adFormat, Class<? extends AdPresenter> cls) {
        return Joiner.join((CharSequence) "_", (Iterable) Arrays.asList(new String[]{adFormat.toString(), cls.getSimpleName()}));
    }
}
