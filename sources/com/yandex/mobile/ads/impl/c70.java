package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;

class c70 implements C15050wh {

    /* renamed from: a */
    private final C14381qf f31831a;

    c70(C14381qf qfVar) {
        this.f31831a = qfVar;
    }

    /* renamed from: a */
    public void mo66216a(RelativeLayout relativeLayout) {
        relativeLayout.setBackground(C12697c4.f31805a);
    }

    /* renamed from: b */
    public void mo66218b() {
        this.f31831a.mo66085b();
    }

    /* renamed from: c */
    public void mo66219c() {
        this.f31831a.invalidate();
    }

    /* renamed from: d */
    public void mo66220d() {
        this.f31831a.mo66086d();
    }

    /* renamed from: a */
    public View mo66214a(View view, AdResponse adResponse) {
        Context context = view.getContext();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams a = C12850d4.m34986a(context, adResponse);
        int i = lo1.f36769b;
        int round = Math.round(TypedValue.applyDimension(1, 64.0f, context.getResources().getDisplayMetrics()));
        a.width = Math.min(a.width + round, context.getResources().getDisplayMetrics().widthPixels);
        a.height = Math.min(a.height + round, context.getResources().getDisplayMetrics().heightPixels);
        relativeLayout.setLayoutParams(a);
        relativeLayout.addView(view, C12850d4.m34986a(context, adResponse));
        relativeLayout.addView(this.f31831a.mo66087e(), C12850d4.m34985a(context, view));
        return relativeLayout;
    }

    /* renamed from: a */
    public void mo66217a(boolean z) {
        this.f31831a.mo66084a(z);
    }

    /* renamed from: a */
    public void mo66215a() {
        this.f31831a.mo66083a();
    }
}
