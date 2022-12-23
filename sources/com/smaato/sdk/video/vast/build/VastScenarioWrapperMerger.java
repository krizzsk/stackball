package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;

public class VastScenarioWrapperMerger {
    final VastCompanionScenarioMerger vastCompanionScenarioMerger;
    final VastMediaFileScenarioMerger vastMediaFileScenarioMerger;
    final ViewableImpressionMerger viewableImpressionMerger;
    final VastWrapperCompanionScenarioPicker wrapperCompanionScenarioPicker;

    public VastScenarioWrapperMerger(VastMediaFileScenarioMerger vastMediaFileScenarioMerger2, VastWrapperCompanionScenarioPicker vastWrapperCompanionScenarioPicker, VastCompanionScenarioMerger vastCompanionScenarioMerger2, ViewableImpressionMerger viewableImpressionMerger2) {
        this.vastMediaFileScenarioMerger = (VastMediaFileScenarioMerger) Objects.requireNonNull(vastMediaFileScenarioMerger2, "Parameter vastMediaFileScenarioMerger should be null for VastScenarioWrapperMerger::new");
        this.wrapperCompanionScenarioPicker = (VastWrapperCompanionScenarioPicker) Objects.requireNonNull(vastWrapperCompanionScenarioPicker, "Parameter wrapperCompanionScenarioPicker should be null for VastScenarioWrapperMerger::new");
        this.vastCompanionScenarioMerger = (VastCompanionScenarioMerger) Objects.requireNonNull(vastCompanionScenarioMerger2, "Parameter vastCompanionScenarioMerger should be null for VastScenarioWrapperMerger::new");
        this.viewableImpressionMerger = (ViewableImpressionMerger) Objects.requireNonNull(viewableImpressionMerger2, "Parameter viewableImpressionMerger should be null for VastScenarioWrapperMerger::new");
    }
}
