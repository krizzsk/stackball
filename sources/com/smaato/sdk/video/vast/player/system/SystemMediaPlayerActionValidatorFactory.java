package com.smaato.sdk.video.vast.player.system;

import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.player.MediaPlayerAction;
import com.smaato.sdk.video.vast.player.MediaPlayerState;
import java.util.Arrays;

public class SystemMediaPlayerActionValidatorFactory implements ClassFactory<EventValidator> {
    public EventValidator<MediaPlayerAction, MediaPlayerState> get(DiConstructor diConstructor) {
        EventValidator.Builder builder = new EventValidator.Builder();
        builder.setValidStatesForEvent(MediaPlayerAction.SET_SURFACE, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED})).setValidStatesForEvent(MediaPlayerAction.GET_CURRENT_POSITION, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.IDLE, MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED})).setValidStatesForEvent(MediaPlayerAction.GET_DURATION, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED})).setValidStatesForEvent(MediaPlayerAction.IS_PLAYING, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.IDLE, MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED})).setValidStatesForEvent(MediaPlayerAction.SEEK_TO, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.PLAYBACK_COMPLETED})).setValidStatesForEvent(MediaPlayerAction.SET_VOLUME, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.IDLE, MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED}));
        return builder.build();
    }
}
