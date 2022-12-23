package com.amazon.device.ads;

import com.amazon.device.ads.AAXParameter;
import com.amazon.device.ads.Configuration;

/* compiled from: AAXParameterGroupParameter */
class DirectedIdAAXParameter extends AAXParameterGroupParameter {
    private final Configuration configuration;
    private final DirectedIdRetriever directedIdRetriever;

    DirectedIdAAXParameter() {
        this(DebugProperties.getInstance(), new MobileAdsLoggerFactory(), Configuration.getInstance(), (DirectedIdRetriever) Settings.getInstance().getObject(DirectedIdRetriever.SETTINGS_KEY, null, DirectedIdRetriever.class));
    }

    DirectedIdAAXParameter(DebugProperties debugProperties, MobileAdsLoggerFactory mobileAdsLoggerFactory, Configuration configuration2, DirectedIdRetriever directedIdRetriever2) {
        super(debugProperties, "directedId", DebugProperties.DEBUG_DIRECTEDID, mobileAdsLoggerFactory);
        this.configuration = configuration2;
        this.directedIdRetriever = directedIdRetriever2;
    }

    /* access modifiers changed from: protected */
    public String getDerivedValue(AAXParameter.ParameterData parameterData) {
        DirectedIdRetriever directedIdRetriever2;
        if (!this.configuration.getBoolean(Configuration.ConfigOption.WHITELISTED_CUSTOMER) || (directedIdRetriever2 = this.directedIdRetriever) == null) {
            return null;
        }
        return directedIdRetriever2.getDirectedId();
    }
}
