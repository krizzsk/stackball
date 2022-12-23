package com.smaato.sdk.core.network.execution;

import android.security.NetworkSecurityPolicy;
import com.smaato.sdk.core.util.p251fi.Predicate;

/* renamed from: com.smaato.sdk.core.network.execution.-$$Lambda$HttpsOnlyPolicy$2W8avqAbm1W8cU-BqW36yHub58g  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$HttpsOnlyPolicy$2W8avqAbm1W8cUBqW36yHub58g implements Predicate {
    public static final /* synthetic */ $$Lambda$HttpsOnlyPolicy$2W8avqAbm1W8cUBqW36yHub58g INSTANCE = new $$Lambda$HttpsOnlyPolicy$2W8avqAbm1W8cUBqW36yHub58g();

    private /* synthetic */ $$Lambda$HttpsOnlyPolicy$2W8avqAbm1W8cUBqW36yHub58g() {
    }

    public final boolean test(Object obj) {
        return HttpsOnlyPolicy.lambda$validateUrl$0((NetworkSecurityPolicy) obj);
    }
}
