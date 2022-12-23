package com.smaato.sdk.core;

import com.smaato.sdk.core.lifecycle.ActivityProvider;
import com.smaato.sdk.inject.Provider;

/* renamed from: com.smaato.sdk.core.-$$Lambda$SmaatoBridgeImpl$Sbvc7p-qaDD8XDu1OjpL3cBYOLM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$SmaatoBridgeImpl$Sbvc7pqaDD8XDu1OjpL3cBYOLM implements Provider {
    public static final /* synthetic */ $$Lambda$SmaatoBridgeImpl$Sbvc7pqaDD8XDu1OjpL3cBYOLM INSTANCE = new $$Lambda$SmaatoBridgeImpl$Sbvc7pqaDD8XDu1OjpL3cBYOLM();

    private /* synthetic */ $$Lambda$SmaatoBridgeImpl$Sbvc7pqaDD8XDu1OjpL3cBYOLM() {
    }

    public final Object get() {
        return ActivityProvider.get().getCurrentActivity();
    }
}
