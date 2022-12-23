package com.smaato.sdk.openmeasurement;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.util.AssetUtils;

/* renamed from: com.smaato.sdk.openmeasurement.-$$Lambda$OMViewabilityPlugin$JGBp7UnNU9rZMBHz8lVpjlIrCnA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$OMViewabilityPlugin$JGBp7UnNU9rZMBHz8lVpjlIrCnA implements ClassFactory {
    public static final /* synthetic */ $$Lambda$OMViewabilityPlugin$JGBp7UnNU9rZMBHz8lVpjlIrCnA INSTANCE = new $$Lambda$OMViewabilityPlugin$JGBp7UnNU9rZMBHz8lVpjlIrCnA();

    private /* synthetic */ $$Lambda$OMViewabilityPlugin$JGBp7UnNU9rZMBHz8lVpjlIrCnA() {
    }

    public final Object get(DiConstructor diConstructor) {
        return AssetUtils.getFileFromAssets((Context) diConstructor.get(Application.class), DiLogLayer.getLoggerFrom(diConstructor), "omsdk-v1.js");
    }
}
