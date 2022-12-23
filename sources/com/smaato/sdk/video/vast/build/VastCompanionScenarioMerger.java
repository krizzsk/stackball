package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import java.util.List;

public class VastCompanionScenarioMerger {
    public VastCompanionScenario merge(VastCompanionScenario vastCompanionScenario, List<VastCompanionScenario> list) {
        Objects.requireNonNull(vastCompanionScenario, "Parameter companionScenario should not be null for VastCompanionScenarioMerger::merge");
        Objects.requireNonNull(list, "Parameter wrapperCompanionScenarios should not be null for VastCompanionScenarioMerger::merge");
        VastCompanionScenario vastCompanionScenario2 = vastCompanionScenario;
        for (VastCompanionScenario next : list) {
            UniversalAdId universalAdId = vastCompanionScenario.vastScenarioCreativeData.universalAdId;
            UniversalAdId universalAdId2 = next.vastScenarioCreativeData.universalAdId;
            if (universalAdId.equals(universalAdId2) || universalAdId2.equals(UniversalAdId.DEFAULT)) {
                vastCompanionScenario2 = vastCompanionScenario2.newBuilder().setTrackingEvents(VastScenarioMergeUtils.merge(vastCompanionScenario2.trackingEvents, next.trackingEvents)).setCompanionClickTrackings(VastScenarioMergeUtils.merge(vastCompanionScenario2.companionClickTrackings, next.companionClickTrackings)).build();
            }
        }
        return vastCompanionScenario2;
    }
}
