package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;

/* renamed from: com.yandex.mobile.ads.impl.b6 */
public class C12572b6 {

    /* renamed from: a */
    private final C13476j6 f31254a;

    /* renamed from: b */
    private final Context f31255b;

    /* renamed from: c */
    private final C13381i6 f31256c = new C13381i6();

    /* renamed from: d */
    private final C13033f6 f31257d;

    C12572b6(Context context, C13476j6 j6Var) {
        this.f31255b = context;
        this.f31254a = j6Var;
        this.f31257d = new C13033f6(context);
    }

    /* renamed from: a */
    public View mo66008a() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f31255b).inflate(C12066R.layout.yandex_ads_internal_adtune_container, (ViewGroup) null);
        this.f31256c.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(C12066R.C12068id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f31257d);
        }
        this.f31256c.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C12066R.C12068id.adtune_webview_container);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f31254a);
        }
        return viewGroup;
    }
}
