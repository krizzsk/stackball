package com.smaato.sdk.image.framework;

import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import java.util.concurrent.Executors;

/* renamed from: com.smaato.sdk.image.framework.-$$Lambda$ImageModuleInterface$HDU-r-xe7iV5pvPs3E1_ILOqPog  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ImageModuleInterface$HDUrxe7iV5pvPs3E1_ILOqPog implements ClassFactory {
    public static final /* synthetic */ $$Lambda$ImageModuleInterface$HDUrxe7iV5pvPs3E1_ILOqPog INSTANCE = new $$Lambda$ImageModuleInterface$HDUrxe7iV5pvPs3E1_ILOqPog();

    private /* synthetic */ $$Lambda$ImageModuleInterface$HDUrxe7iV5pvPs3E1_ILOqPog() {
    }

    public final Object get(DiConstructor diConstructor) {
        return Executors.newFixedThreadPool(2);
    }
}
