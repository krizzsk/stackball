package com.smaato.sdk.core.deeplink;

import android.content.pm.ResolveInfo;
import com.smaato.sdk.core.util.p251fi.NullableFunction;

/* renamed from: com.smaato.sdk.core.deeplink.-$$Lambda$LinkResolver$TLAKD2NXAIRqJZAZ4HAxbtpgjS0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LinkResolver$TLAKD2NXAIRqJZAZ4HAxbtpgjS0 implements NullableFunction {
    public static final /* synthetic */ $$Lambda$LinkResolver$TLAKD2NXAIRqJZAZ4HAxbtpgjS0 INSTANCE = new $$Lambda$LinkResolver$TLAKD2NXAIRqJZAZ4HAxbtpgjS0();

    private /* synthetic */ $$Lambda$LinkResolver$TLAKD2NXAIRqJZAZ4HAxbtpgjS0() {
    }

    public final Object apply(Object obj) {
        return ((ResolveInfo) obj).activityInfo.targetActivity;
    }
}
