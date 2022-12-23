package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.util.Objects;

public class AdEvent {
    private final Object content;
    private final Type type;

    public enum Type {
        LOADED,
        OPEN,
        IMPRESS,
        CLICK,
        CLOSE,
        ERROR,
        TTL_EXPIRED
    }

    AdEvent(Type type2, Object obj) {
        this.type = (Type) Objects.requireNonNull(type2);
        this.content = Objects.requireNonNull(obj);
    }

    public Type getType() {
        return this.type;
    }

    public Object getContent() {
        return this.content;
    }
}
