package com.smaato.sdk.video.vast.player.system;

import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.player.MediaPlayerState;
import com.smaato.sdk.video.vast.player.MediaPlayerTransition;
import java.util.Arrays;
import java.util.Collections;

public class SystemMediaPlayerTransitionValidatorFactory implements ClassFactory<EventValidator> {
    public EventValidator<MediaPlayerTransition, MediaPlayerState> get(DiConstructor diConstructor) {
        EventValidator.Builder builder = new EventValidator.Builder();
        builder.setValidStatesForEvent(MediaPlayerTransition.SET_DATA_SOURCE, Collections.singletonList(MediaPlayerState.IDLE)).setValidStatesForEvent(MediaPlayerTransition.PREPARE_ASYNC, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.INITIALIZED, MediaPlayerState.STOPPED})).setValidStatesForEvent(MediaPlayerTransition.ON_PREPARED, Collections.singletonList(MediaPlayerState.PREPARING)).setValidStatesForEvent(MediaPlayerTransition.PAUSE, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.STARTED, MediaPlayerState.RESUMED})).setValidStatesForEvent(MediaPlayerTransition.START, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARED, MediaPlayerState.PAUSED})).setValidStatesForEvent(MediaPlayerTransition.STOP, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.PLAYBACK_COMPLETED})).setValidStatesForEvent(MediaPlayerTransition.ON_COMPLETE, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.STARTED, MediaPlayerState.RESUMED}));
        builder.setValidStatesForEvent(MediaPlayerTransition.RELEASE, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.IDLE, MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARING, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED, MediaPlayerState.ERROR}));
        builder.setValidStatesForEvent(MediaPlayerTransition.RESET, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARING, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED, MediaPlayerState.ERROR}));
        return builder.build();
    }
}
