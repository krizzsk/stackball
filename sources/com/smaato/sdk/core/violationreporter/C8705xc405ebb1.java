package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.BuildConfig;
import com.smaato.sdk.core.p249di.ClassFactory;
import com.smaato.sdk.core.p249di.DiConstructor;

/* renamed from: com.smaato.sdk.core.violationreporter.-$$Lambda$DiAdQualityViolationReporterLayer$JVdQ28UM2HdbeUMXXOYH8bii-mY */
/* compiled from: lambda */
public final /* synthetic */ class C8705xc405ebb1 implements ClassFactory {
    public static final /* synthetic */ C8705xc405ebb1 INSTANCE = new C8705xc405ebb1();

    private /* synthetic */ C8705xc405ebb1() {
    }

    public final Object get(DiConstructor diConstructor) {
        return BuildConfig.SOMA_VIOLATIONS_AGGREGATOR_URL;
    }
}
