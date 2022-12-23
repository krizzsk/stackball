package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.FrameLayout;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.yl */
public class C15257yl {

    /* renamed from: a */
    private final a10 f42886a;

    /* renamed from: b */
    private final C14773uo f42887b;

    @Inject
    public C15257yl(a10 a10, C14773uo uoVar) {
        Intrinsics.checkNotNullParameter(a10, "viewCreator");
        Intrinsics.checkNotNullParameter(uoVar, "viewBinder");
        this.f42886a = a10;
        this.f42887b = uoVar;
    }

    /* renamed from: a */
    public View mo71098a(C15177xl xlVar, C13513jm jmVar, C14729ty tyVar) {
        Intrinsics.checkNotNullParameter(xlVar, "data");
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(tyVar, "path");
        View b = this.f42886a.mo65649b(xlVar, jmVar.mo66388b());
        b.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        try {
            this.f42887b.mo70383a(b, xlVar, jmVar, tyVar);
        } catch (oy0 e) {
            if (!g50.m36483a(e)) {
                throw e;
            }
        }
        return b;
    }
}
