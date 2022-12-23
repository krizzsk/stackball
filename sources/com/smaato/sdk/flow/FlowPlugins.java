package com.smaato.sdk.flow;

public abstract class FlowPlugins {
    public static void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("'t' specified as non-null is null");
        }
    }

    private FlowPlugins() {
    }
}
