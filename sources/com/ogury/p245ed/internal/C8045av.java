package com.ogury.p245ed.internal;

import android.widget.FrameLayout;
import com.smaato.sdk.video.vast.model.C8937Ad;

/* renamed from: com.ogury.ed.internal.av */
public final class C8045av {

    /* renamed from: a */
    private final C8193ej f20908a;

    /* renamed from: b */
    private final FrameLayout f20909b;

    /* renamed from: c */
    private final C8248g f20910c;

    /* renamed from: d */
    private final C8020aj f20911d;

    public C8045av(C8193ej ejVar, FrameLayout frameLayout, C8248g gVar, C8020aj ajVar) {
        C8467mq.m23881b(ejVar, C8937Ad.AD_TYPE);
        C8467mq.m23881b(frameLayout, "parent");
        C8467mq.m23881b(gVar, "adLayout");
        C8467mq.m23881b(ajVar, "adController");
        this.f20908a = ejVar;
        this.f20909b = frameLayout;
        this.f20910c = gVar;
        this.f20911d = ajVar;
    }

    /* renamed from: a */
    public final C8193ej mo53198a() {
        return this.f20908a;
    }

    /* renamed from: b */
    public final FrameLayout mo53199b() {
        return this.f20909b;
    }

    /* renamed from: c */
    public final C8248g mo53200c() {
        return this.f20910c;
    }

    /* renamed from: d */
    public final C8020aj mo53201d() {
        return this.f20911d;
    }
}
