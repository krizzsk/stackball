package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastRawMediaFileScenario;
import java.util.List;

public class VastMediaFileScenarioMerger {
    private VideoClicksMerger videoClicksMerger;

    public VastMediaFileScenarioMerger(VideoClicksMerger videoClicksMerger2) {
        this.videoClicksMerger = (VideoClicksMerger) Objects.requireNonNull(videoClicksMerger2, "Parameter videoClicksMerger should not be null for VastMediaFileScenarioMerger::new");
    }

    public VastMediaFileScenario merge(VastMediaFileScenario vastMediaFileScenario, List<VastRawMediaFileScenario> list) {
        Objects.requireNonNull(vastMediaFileScenario, "Parameter mediaFileScenario should not be null for VastMediaFileScenarioMerger::merge");
        Objects.requireNonNull(list, "Parameter wrapperMediaFileScenarios should not be null for VastMediaFileScenarioMerger::merge");
        VastMediaFileScenario vastMediaFileScenario2 = vastMediaFileScenario;
        for (VastRawMediaFileScenario next : list) {
            UniversalAdId universalAdId = vastMediaFileScenario.vastScenarioCreativeData.universalAdId;
            UniversalAdId universalAdId2 = next.vastScenarioCreativeData.universalAdId;
            if (universalAdId.equals(universalAdId2) || universalAdId2.equals(UniversalAdId.DEFAULT)) {
                vastMediaFileScenario2 = vastMediaFileScenario2.newBuilder().setVideoClicks(this.videoClicksMerger.merge(vastMediaFileScenario2.videoClicks, next.videoClicks)).setTrackingEvents(VastScenarioMergeUtils.merge(vastMediaFileScenario2.trackingEvents, next.trackingEvents)).setVastIconScenario(vastMediaFileScenario2.vastIconScenario == null ? next.vastIconScenario : vastMediaFileScenario2.vastIconScenario).build();
            }
        }
        return vastMediaFileScenario2;
    }
}
