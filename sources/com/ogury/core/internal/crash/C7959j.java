package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.crash.C7948c;

/* renamed from: com.ogury.core.internal.crash.j */
/* compiled from: CrashSerializerFactory.kt */
public final class C7959j {

    /* renamed from: a */
    private final Context f20739a;

    /* renamed from: b */
    private final C7952e f20740b;

    /* renamed from: c */
    private final C7966m f20741c;

    public C7959j(Context context, C7952e eVar, C7966m mVar) {
        C7921ai.m22144b(context, "context");
        C7921ai.m22144b(eVar, "crashFormatter");
        C7921ai.m22144b(mVar, "fileStore");
        this.f20739a = context;
        this.f20740b = eVar;
        this.f20741c = mVar;
    }

    /* renamed from: a */
    public final C7948c mo52947a(Throwable th) {
        C7921ai.m22144b(th, "throwable");
        return new C7948c(new C7948c.C7949a(this.f20739a, this.f20740b, this.f20741c, th), (byte) 0);
    }
}
