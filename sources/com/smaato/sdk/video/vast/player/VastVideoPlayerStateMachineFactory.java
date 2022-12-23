package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.Arrays;

public class VastVideoPlayerStateMachineFactory {
    private final VastPlayerState initialState;

    VastVideoPlayerStateMachineFactory(VastPlayerState vastPlayerState) {
        this.initialState = (VastPlayerState) Objects.requireNonNull(vastPlayerState);
    }

    public StateMachine<VastPlayerEvent, VastPlayerState> create(VastScenario vastScenario) {
        VastCompanionScenario vastCompanionScenario = vastScenario.vastCompanionScenario;
        StateMachine.Builder builder = new StateMachine.Builder();
        VastPlayerState vastPlayerState = (vastCompanionScenario == null || SmaatoSdk.isCompanionAdSkippable()) ? VastPlayerState.CLOSE_PLAYER : VastPlayerState.SHOW_COMPANION;
        builder.setInitialState(this.initialState).addTransition(VastPlayerEvent.ERROR, Arrays.asList(new VastPlayerState[]{VastPlayerState.SHOW_VIDEO, VastPlayerState.CLOSE_PLAYER})).addTransition(VastPlayerEvent.ERROR, Arrays.asList(new VastPlayerState[]{VastPlayerState.SHOW_COMPANION, VastPlayerState.CLOSE_PLAYER})).addTransition(VastPlayerEvent.CLICKED, Arrays.asList(new VastPlayerState[]{VastPlayerState.SHOW_VIDEO, VastPlayerState.CLOSE_PLAYER})).addTransition(VastPlayerEvent.CLICKED, Arrays.asList(new VastPlayerState[]{VastPlayerState.SHOW_COMPANION, VastPlayerState.CLOSE_PLAYER})).addTransition(VastPlayerEvent.VIDEO_COMPLETED, Arrays.asList(new VastPlayerState[]{VastPlayerState.SHOW_VIDEO, vastPlayerState})).addTransition(VastPlayerEvent.VIDEO_SKIPPED, Arrays.asList(new VastPlayerState[]{VastPlayerState.SHOW_VIDEO, vastPlayerState})).addTransition(VastPlayerEvent.CLOSE_BUTTON_CLICKED, Arrays.asList(new VastPlayerState[]{VastPlayerState.SHOW_VIDEO, VastPlayerState.CLOSE_PLAYER})).addTransition(VastPlayerEvent.CLOSE_BUTTON_CLICKED, Arrays.asList(new VastPlayerState[]{VastPlayerState.SHOW_COMPANION, VastPlayerState.CLOSE_PLAYER}));
        return builder.build();
    }
}
