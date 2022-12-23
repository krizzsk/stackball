package com.ogury.p245ed.internal;

import android.content.Context;
import com.smaato.sdk.video.vast.model.C8937Ad;
import p269io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.internal.m */
public final class C8448m {

    /* renamed from: a */
    private final Context f21673a;

    /* renamed from: b */
    private final AdConfig f21674b;

    /* renamed from: c */
    private final C8193ej f21675c;

    public C8448m(Context context, AdConfig adConfig, C8193ej ejVar) {
        C8467mq.m23881b(context, "context");
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        this.f21673a = context;
        this.f21674b = adConfig;
        this.f21675c = ejVar;
    }

    /* renamed from: a */
    public final void mo53960a(String str) {
        C8467mq.m23881b(str, "campaignId");
        C8239ft.m23149a(this.f21674b, str);
    }

    /* renamed from: b */
    public final void mo53961b(String str) {
        C8467mq.m23881b(str, "creativeId");
        C8239ft.m23150b(this.f21674b, str);
    }

    /* renamed from: a */
    public final C8408l mo53959a() {
        return new C8408l(this.f21673a, this.f21674b, this.f21675c);
    }
}
