package com.smaato.sdk.richmedia.mraid.dataprovider;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import java.util.Arrays;

public final class MraidStateMachineFactory {
    private final State initialState;

    public enum Event {
        LOAD_COMPLETE,
        CLOSE,
        RESIZE,
        EXPAND,
        ERROR,
        RESIZING_FINISHED,
        EXPANDING_FINISHED,
        CLOSE_FINISHED,
        VISIBILITY_PARAMS_CHECK
    }

    public enum State {
        HIDDEN,
        LOADING,
        DEFAULT,
        RESIZED,
        EXPANDED,
        RESIZE_IN_PROGRESS,
        EXPAND_IN_PROGRESS,
        COLLAPSE_IN_PROGRESS
    }

    public MraidStateMachineFactory(State state) {
        this.initialState = (State) Objects.requireNonNull(state);
    }

    public final StateMachine<Event, State> newInstanceForBanner() {
        return new StateMachine.Builder().setInitialState(this.initialState).addTransition(Event.LOAD_COMPLETE, Arrays.asList(new State[]{State.LOADING, State.DEFAULT})).addTransition(Event.RESIZE, Arrays.asList(new State[]{State.DEFAULT, State.RESIZE_IN_PROGRESS})).addTransition(Event.RESIZE, Arrays.asList(new State[]{State.RESIZED, State.RESIZE_IN_PROGRESS})).addLoopTransition(Event.RESIZE, State.RESIZE_IN_PROGRESS).addTransition(Event.RESIZING_FINISHED, Arrays.asList(new State[]{State.RESIZE_IN_PROGRESS, State.RESIZED})).addTransition(Event.EXPAND, Arrays.asList(new State[]{State.DEFAULT, State.EXPAND_IN_PROGRESS})).addTransition(Event.EXPAND, Arrays.asList(new State[]{State.RESIZED, State.EXPAND_IN_PROGRESS})).addTransition(Event.EXPAND, Arrays.asList(new State[]{State.RESIZE_IN_PROGRESS, State.EXPAND_IN_PROGRESS})).addTransition(Event.EXPANDING_FINISHED, Arrays.asList(new State[]{State.EXPAND_IN_PROGRESS, State.EXPANDED})).addTransition(Event.CLOSE, Arrays.asList(new State[]{State.RESIZED, State.COLLAPSE_IN_PROGRESS})).addTransition(Event.CLOSE, Arrays.asList(new State[]{State.EXPANDED, State.COLLAPSE_IN_PROGRESS})).addTransition(Event.ERROR, Arrays.asList(new State[]{State.RESIZE_IN_PROGRESS, State.DEFAULT})).addTransition(Event.ERROR, Arrays.asList(new State[]{State.EXPAND_IN_PROGRESS, State.DEFAULT})).addTransition(Event.CLOSE_FINISHED, Arrays.asList(new State[]{State.COLLAPSE_IN_PROGRESS, State.DEFAULT})).addLoopTransition(Event.VISIBILITY_PARAMS_CHECK, State.DEFAULT).addLoopTransition(Event.VISIBILITY_PARAMS_CHECK, State.RESIZED).addLoopTransition(Event.VISIBILITY_PARAMS_CHECK, State.EXPANDED).build();
    }

    public final StateMachine<Event, State> newInstanceForInterstitial() {
        return new StateMachine.Builder().setInitialState(this.initialState).addTransition(Event.LOAD_COMPLETE, Arrays.asList(new State[]{State.LOADING, State.DEFAULT})).addTransition(Event.CLOSE, Arrays.asList(new State[]{State.DEFAULT, State.HIDDEN})).addLoopTransition(Event.VISIBILITY_PARAMS_CHECK, State.DEFAULT).build();
    }
}
