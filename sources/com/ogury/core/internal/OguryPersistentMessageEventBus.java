package com.ogury.core.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: OguryPersistentMessageEventBus.kt */
public final class OguryPersistentMessageEventBus implements OguryEventBus {
    public static final C7904a Companion = new C7904a((byte) 0);
    private static final String UNKNOWN_MESSAGE = "UNKNOWN";
    private final OguryBroadcastEventBus broadcastEventBus;
    private final Map<String, C7907aa> lastEventsMap;

    public OguryPersistentMessageEventBus() {
        this((OguryBroadcastEventBus) null, 1, (C7920ah) null);
    }

    public OguryPersistentMessageEventBus(OguryBroadcastEventBus oguryBroadcastEventBus) {
        C7921ai.m22144b(oguryBroadcastEventBus, "broadcastEventBus");
        this.broadcastEventBus = oguryBroadcastEventBus;
        this.lastEventsMap = Collections.synchronizedMap(new LinkedHashMap());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OguryPersistentMessageEventBus(OguryBroadcastEventBus oguryBroadcastEventBus, int i, C7920ah ahVar) {
        this((i & 1) != 0 ? new OguryBroadcastEventBus() : oguryBroadcastEventBus);
    }

    /* renamed from: com.ogury.core.internal.OguryPersistentMessageEventBus$a */
    /* compiled from: OguryPersistentMessageEventBus.kt */
    public static final class C7904a {
        private C7904a() {
        }

        public /* synthetic */ C7904a(byte b) {
            this();
        }
    }

    public final void dispatch(String str, String str2) {
        C7921ai.m22144b(str, "event");
        C7921ai.m22144b(str2, "message");
        Map<String, C7907aa> map = this.lastEventsMap;
        C7921ai.m22142a((Object) map, "lastEventsMap");
        map.put(str, new C7907aa(str2, 0, 2));
        this.broadcastEventBus.dispatch(str, str2);
    }

    public final void register(String str, OguryEventCallback oguryEventCallback) {
        C7921ai.m22144b(str, "event");
        C7921ai.m22144b(oguryEventCallback, "callback");
        this.broadcastEventBus.register(str, oguryEventCallback);
        C7907aa aaVar = this.lastEventsMap.get(str);
        if (aaVar == null) {
            aaVar = new C7907aa(UNKNOWN_MESSAGE, 0, 2);
        }
        oguryEventCallback.onNewEvent(str, aaVar.mo52875a(), aaVar.mo52876b());
    }

    public final void unregister(String str, OguryEventCallback oguryEventCallback) {
        C7921ai.m22144b(str, "event");
        C7921ai.m22144b(oguryEventCallback, "callback");
        this.broadcastEventBus.unregister(str, oguryEventCallback);
    }
}
