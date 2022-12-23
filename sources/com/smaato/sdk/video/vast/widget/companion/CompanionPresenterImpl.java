package com.smaato.sdk.video.vast.widget.companion;

import com.smaato.sdk.core.framework.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.video.vast.browser.VastWebComponentSecurityPolicy;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.widget.element.VastElementErrorCodeStrategy;
import com.smaato.sdk.video.vast.widget.element.VastElementPresentationManager;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenterImpl;

public class CompanionPresenterImpl extends VastElementPresenterImpl {
    private final VastCompanionScenario companionScenario;

    CompanionPresenterImpl(Logger logger, VastElementPresentationManager vastElementPresentationManager, VastWebComponentSecurityPolicy vastWebComponentSecurityPolicy, SomaApiContext somaApiContext, VisibilityTrackerCreator visibilityTrackerCreator, VastElementErrorCodeStrategy vastElementErrorCodeStrategy, VastCompanionScenario vastCompanionScenario) {
        super(logger, vastElementPresentationManager, vastWebComponentSecurityPolicy, somaApiContext, visibilityTrackerCreator, vastElementErrorCodeStrategy);
        this.companionScenario = (VastCompanionScenario) Objects.requireNonNull(vastCompanionScenario);
    }

    public void onClicked(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.companionScenario.companionClickThrough;
        }
        super.onClicked(str);
    }
}
