package com.ogury.p245ed.internal;

import android.content.Context;
import com.smaato.sdk.video.vast.model.C8937Ad;
import p269io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.x */
public final class C8544x {

    /* renamed from: a */
    private final Context f21769a;

    public C8544x(Context context) {
        C8467mq.m23881b(context, "context");
        this.f21769a = context;
    }

    /* renamed from: a */
    public final C8408l mo54013a(AdConfig adConfig, C8193ej ejVar) {
        C8467mq.m23881b(adConfig, "adConfig");
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        return new C8408l(this.f21769a, adConfig, ejVar);
    }
}
