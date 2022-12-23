package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import kotlin.jvm.internal.Intrinsics;

public final class df0 implements of0 {

    /* renamed from: a */
    private final ef0 f32556a;

    /* renamed from: b */
    private final C15230y2 f32557b;

    /* renamed from: c */
    private final pf0 f32558c;

    /* renamed from: d */
    private final hk1 f32559d;

    /* renamed from: e */
    private final nf0 f32560e;

    /* renamed from: f */
    private final kp1 f32561f = new kp1();

    public df0(Context context, ef0 ef0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ef0, "itemFinishedListener");
        this.f32556a = ef0;
        C15230y2 y2Var = new C15230y2();
        this.f32557b = y2Var;
        pf0 pf0 = new pf0(context, y2Var, this);
        this.f32558c = pf0;
        hk1 hk1 = new hk1(context, y2Var);
        this.f32559d = hk1;
        this.f32560e = new nf0(context, hk1, pf0);
    }

    /* renamed from: a */
    public final void mo66572a(InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        Intrinsics.checkNotNullParameter(instreamAdRequestConfiguration, "configuration");
        jp1 a = this.f32561f.mo68258a(instreamAdRequestConfiguration.getCategoryId(), instreamAdRequestConfiguration.getPageId(), instreamAdRequestConfiguration.getParameters());
        Intrinsics.checkNotNullExpressionValue(a, "vmapRequestConfigCreator.createInstreamAdRequestConfig(\n            configuration.categoryId, configuration.pageId, configuration.parameters\n        )");
        this.f32558c.mo69365a(a);
        this.f32557b.mo70970b(C15139x2.AD_LOADING);
        this.f32559d.mo67563a(a, (r41<ep1>) this.f32560e);
    }

    /* renamed from: a */
    public final void mo66571a(InstreamAdLoadListener instreamAdLoadListener) {
        this.f32558c.mo69366a(instreamAdLoadListener);
    }

    /* renamed from: a */
    public void mo66570a() {
        this.f32556a.mo66279a(this);
    }
}
