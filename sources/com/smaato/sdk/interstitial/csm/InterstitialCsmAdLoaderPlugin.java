package com.smaato.sdk.interstitial.csm;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p248ad.AdFormat;
import com.smaato.sdk.core.p248ad.AdLoaderPlugin;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterNameShaper;
import com.smaato.sdk.core.p248ad.ApiAdRequestExtras;
import com.smaato.sdk.core.util.p251fi.NullableFunction;

public final class InterstitialCsmAdLoaderPlugin implements AdLoaderPlugin {
    private final NullableFunction<String, AdPresenterBuilder> adPresenterBuilderResolvingFunction;
    private final AdPresenterNameShaper adPresenterNameShaper;

    public final AdFormat resolveAdFormatToServerAdFormat(AdFormat adFormat, Logger logger) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.smaato.sdk.core.util.fi.NullableFunction<java.lang.String, com.smaato.sdk.core.ad.AdPresenterBuilder>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    InterstitialCsmAdLoaderPlugin(com.smaato.sdk.core.p248ad.AdPresenterNameShaper r1, com.smaato.sdk.core.util.p251fi.NullableFunction<java.lang.String, com.smaato.sdk.core.p248ad.AdPresenterBuilder> r2) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            com.smaato.sdk.core.ad.AdPresenterNameShaper r1 = (com.smaato.sdk.core.p248ad.AdPresenterNameShaper) r1
            r0.adPresenterNameShaper = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.core.util.fi.NullableFunction r1 = (com.smaato.sdk.core.util.p251fi.NullableFunction) r1
            r0.adPresenterBuilderResolvingFunction = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.interstitial.csm.InterstitialCsmAdLoaderPlugin.<init>(com.smaato.sdk.core.ad.AdPresenterNameShaper, com.smaato.sdk.core.util.fi.NullableFunction):void");
    }

    public final AdPresenterBuilder getAdPresenterBuilder(AdFormat adFormat, Class<? extends AdPresenter> cls, Logger logger) {
        return this.adPresenterBuilderResolvingFunction.apply(this.adPresenterNameShaper.shapeName(adFormat, cls));
    }

    public final void addApiAdRequestExtras(ApiAdRequestExtras apiAdRequestExtras, Logger logger) {
        apiAdRequestExtras.addApiParamExtra("mediationversion", "2");
    }
}
