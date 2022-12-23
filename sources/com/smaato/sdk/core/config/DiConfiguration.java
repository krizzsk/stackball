package com.smaato.sdk.core.config;

import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.p251fi.Function;
import java.util.HashMap;

public final class DiConfiguration {

    public interface Provider extends Function<Configuration, ConfigurationRepository> {
    }

    private DiConfiguration() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiConfiguration$3w9_n0wBCrMQwp3pt9ZpX204uKQ.INSTANCE);
    }

    static /* synthetic */ ConfigurationRepository lambda$null$0(Configuration configuration) {
        return new ConfigurationRepository(new HashMap(), configuration);
    }
}
