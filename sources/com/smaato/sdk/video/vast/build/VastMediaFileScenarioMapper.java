package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;

public class VastMediaFileScenarioMapper {
    final VastIconScenarioPicker vastIconScenarioPicker;

    public VastMediaFileScenarioMapper(VastIconScenarioPicker vastIconScenarioPicker2) {
        this.vastIconScenarioPicker = (VastIconScenarioPicker) Objects.requireNonNull(vastIconScenarioPicker2, "Parameter vastIconScenarioPicker should not be null for VastMediaFileScenarioMapper::new");
    }
}
