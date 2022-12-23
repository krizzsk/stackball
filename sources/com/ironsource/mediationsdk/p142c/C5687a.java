package com.ironsource.mediationsdk.p142c;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, mo72093d2 = {"Lcom/ironsource/mediationsdk/utilities/IronSourcePreconditions;", "", "()V", "checkNotNull", "", "reference", "errorMessage", "", "shouldThrowException", "mediationsdk_release"}, mo72094k = 1, mo72095mv = {1, 4, 2})
/* renamed from: com.ironsource.mediationsdk.c.a */
public final class C5687a {
    static {
        new C5687a();
    }

    private C5687a() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m13981a(Object obj, String str) {
        Intrinsics.checkNotNullParameter(str, "errorMessage");
        if (obj != null) {
            return true;
        }
        IronLog.API.error(str);
        return false;
    }
}
