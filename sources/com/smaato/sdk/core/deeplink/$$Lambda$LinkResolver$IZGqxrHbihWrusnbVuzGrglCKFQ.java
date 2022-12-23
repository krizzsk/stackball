package com.smaato.sdk.core.deeplink;

import android.content.pm.ResolveInfo;
import com.smaato.sdk.core.util.p251fi.NullableFunction;

/* renamed from: com.smaato.sdk.core.deeplink.-$$Lambda$LinkResolver$IZGqxrHbihWrusnbVuzGrglCKFQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LinkResolver$IZGqxrHbihWrusnbVuzGrglCKFQ implements NullableFunction {
    public static final /* synthetic */ $$Lambda$LinkResolver$IZGqxrHbihWrusnbVuzGrglCKFQ INSTANCE = new $$Lambda$LinkResolver$IZGqxrHbihWrusnbVuzGrglCKFQ();

    private /* synthetic */ $$Lambda$LinkResolver$IZGqxrHbihWrusnbVuzGrglCKFQ() {
    }

    public final Object apply(Object obj) {
        return ((ResolveInfo) obj).activityInfo.targetActivity;
    }
}
