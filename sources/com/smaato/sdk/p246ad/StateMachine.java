package com.smaato.sdk.p246ad;

import com.smaato.sdk.flow.Action1;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Function1;
import com.smaato.sdk.flow.Subject;
import com.smaato.sdk.util.Optional;
import com.smaato.sdk.util.Pair;

/* renamed from: com.smaato.sdk.ad.StateMachine */
public abstract class StateMachine<E, S> {
    private volatile S currentState = initialState();
    private final Subject<E> events;

    /* access modifiers changed from: protected */
    public abstract E downEvent(E e, E e2);

    public abstract S initialState();

    /* access modifiers changed from: protected */
    public abstract Flow<S> mapEventToState(E e);

    protected StateMachine(int i) {
        this.events = Subject.replay(i);
    }

    public S currentState() {
        return this.currentState;
    }

    public Flow<Pair<S, S>> state() {
        return this.events.flatMap(new Function1() {
            public final Object apply(Object obj) {
                return StateMachine.this.mapEventToState(obj);
            }
        }).distinctUntilChanged().startWith(initialState()).map(new Function1() {
            public final Object apply(Object obj) {
                return StateMachine.this.lambda$state$0$StateMachine(obj);
            }
        }).doOnNext(new Action1() {
            public final void invoke(Object obj) {
                StateMachine.this.lambda$state$1$StateMachine((Pair) obj);
            }
        });
    }

    public /* synthetic */ Pair lambda$state$0$StateMachine(Object obj) throws Throwable {
        return Pair.m24105of(this.currentState, obj);
    }

    public /* synthetic */ void lambda$state$1$StateMachine(Pair pair) throws Throwable {
        this.currentState = pair.second();
    }

    public void dispatch(E e) {
        if (e != null) {
            Optional<E> lastValue = this.events.lastValue();
            if (lastValue.isPresent()) {
                if (!lastValue.get().equals(downEvent(lastValue.get(), e))) {
                    this.events.onNext(e);
                    return;
                }
                return;
            }
            this.events.onNext(e);
            return;
        }
        throw new NullPointerException("'event' specified as non-null is null");
    }
}
