package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.crash.C7964l;

/* renamed from: com.ogury.core.internal.crash.h */
/* compiled from: CrashReportFacadeFactory.kt */
public final class C7957h {
    /* renamed from: a */
    public static C7956g m22205a(Context context, SdkInfo sdkInfo) {
        C7921ai.m22144b(context, "context");
        C7921ai.m22144b(sdkInfo, "sdkInfo");
        C7954f fVar = new C7954f(context);
        C7952e eVar = new C7952e(sdkInfo);
        C7966m mVar = new C7966m(context);
        return new C7956g(fVar, mVar, new C7959j(context, eVar, mVar), (C7960k) null, (C7964l.C7965a) null, 24);
    }
}
