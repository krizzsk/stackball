package com.smaato.sdk.flow;

import com.smaato.sdk.util.Optional;

public abstract class Subject<T> extends Flow<T> implements Emitter<T> {
    public abstract Optional<T> lastValue();

    public static <T> Subject<T> publish() {
        return new PublishSubject();
    }

    public static <T> Subject<T> replay(int i) {
        return new ReplaySubject(i);
    }
}
