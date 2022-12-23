package com.smaato.sdk.flow;

public interface Subscription {
    void cancel();

    void request(long j);
}
