package com.smaato.sdk.core.framework;

import com.smaato.sdk.core.p249di.DiRegistry;

public interface BaseModuleInterface {
    String moduleDiName();

    DiRegistry moduleDiRegistry();

    String version();
}
