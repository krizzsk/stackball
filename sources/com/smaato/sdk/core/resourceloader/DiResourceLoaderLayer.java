package com.smaato.sdk.core.resourceloader;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import java.nio.charset.Charset;

public final class DiResourceLoaderLayer {
    private DiResourceLoaderLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiResourceLoaderLayer$n4h__KcKthAW7s2G4gR6r2hRJ74.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerFactory(Md5Digester.class, $$Lambda$DiResourceLoaderLayer$6r2I30j8a4orI4WbL_ethtUrB98.INSTANCE);
        diRegistry.registerFactory("resource_loader_di_layer", Charset.class, $$Lambda$DiResourceLoaderLayer$JaRB1YhJaO_T2XBKgzstbuXknc8.INSTANCE);
        diRegistry.registerFactory(HexEncoder.class, $$Lambda$DiResourceLoaderLayer$bLPKi0NWCL7SclpSWSAQXmXZHWM.INSTANCE);
        diRegistry.registerFactory(BaseStoragePersistingStrategyFileUtils.class, $$Lambda$DiResourceLoaderLayer$n4MaYAMzmHEvEistqaIRgqt7ZcA.INSTANCE);
    }

    static /* synthetic */ Md5Digester lambda$null$0(DiConstructor diConstructor) {
        return new Md5Digester(Charset.forName("UTF-8"), (HexEncoder) diConstructor.get(HexEncoder.class));
    }

    static /* synthetic */ HexEncoder lambda$null$2(DiConstructor diConstructor) {
        return new HexEncoder();
    }

    static /* synthetic */ BaseStoragePersistingStrategyFileUtils lambda$null$3(DiConstructor diConstructor) {
        return new BaseStoragePersistingStrategyFileUtils(DiLogLayer.getLoggerFrom(diConstructor), (Context) diConstructor.get(Application.class));
    }

    public static BaseStoragePersistingStrategyFileUtils getBaseStoragePersistingStrategyFileUtils(DiConstructor diConstructor) {
        return (BaseStoragePersistingStrategyFileUtils) diConstructor.get(BaseStoragePersistingStrategyFileUtils.class);
    }

    public static Md5Digester getMd5Digester(DiConstructor diConstructor) {
        Objects.requireNonNull(diConstructor);
        return (Md5Digester) diConstructor.get(Md5Digester.class);
    }
}
