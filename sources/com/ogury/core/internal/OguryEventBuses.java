package com.ogury.core.internal;

/* compiled from: OguryEventBuses.kt */
public final class OguryEventBuses {
    private final OguryEventBus broadcast;
    private final OguryEventBus persistentMessage;

    public OguryEventBuses(OguryEventBus oguryEventBus, OguryEventBus oguryEventBus2) {
        C7921ai.m22144b(oguryEventBus, "persistentMessage");
        C7921ai.m22144b(oguryEventBus2, "broadcast");
        this.persistentMessage = oguryEventBus;
        this.broadcast = oguryEventBus2;
    }

    public final OguryEventBus getBroadcast() {
        return this.broadcast;
    }

    public final OguryEventBus getPersistentMessage() {
        return this.persistentMessage;
    }
}
