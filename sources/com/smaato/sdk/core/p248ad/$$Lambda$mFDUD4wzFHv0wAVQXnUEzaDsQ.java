package com.smaato.sdk.core.p248ad;

import com.smaato.sdk.core.network.NetworkConnectionType;
import com.smaato.sdk.core.util.p251fi.Function;

/* renamed from: com.smaato.sdk.core.ad.-$$Lambda$mFDUD4wzF-Hv0wAVQXnUEz-aDsQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mFDUD4wzFHv0wAVQXnUEzaDsQ implements Function {
    public static final /* synthetic */ $$Lambda$mFDUD4wzFHv0wAVQXnUEzaDsQ INSTANCE = new $$Lambda$mFDUD4wzFHv0wAVQXnUEzaDsQ();

    private /* synthetic */ $$Lambda$mFDUD4wzFHv0wAVQXnUEzaDsQ() {
    }

    public final Object apply(Object obj) {
        return ApiUtils.connectionTypeToApiValue((NetworkConnectionType) obj);
    }
}
