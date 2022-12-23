package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.base.AdResponse;

class c80 implements C15050wh {

    /* renamed from: a */
    private final C14381qf f31854a;

    c80(C14381qf qfVar) {
        this.f31854a = qfVar;
    }

    /* renamed from: a */
    public void mo66216a(RelativeLayout relativeLayout) {
        relativeLayout.setBackground(C12697c4.f31806b);
    }

    /* renamed from: b */
    public void mo66218b() {
        this.f31854a.mo66085b();
    }

    /* renamed from: c */
    public void mo66219c() {
        this.f31854a.invalidate();
    }

    /* renamed from: d */
    public void mo66220d() {
        this.f31854a.mo66086d();
    }

    /* renamed from: a */
    public View mo66214a(View view, AdResponse<String> adResponse) {
        Context context = view.getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.addView(this.f31854a.mo66087e(), C12850d4.m34985a(context, view));
        return relativeLayout;
    }

    /* renamed from: a */
    public void mo66217a(boolean z) {
        this.f31854a.mo66084a(z);
    }

    /* renamed from: a */
    public void mo66215a() {
        this.f31854a.mo66083a();
    }
}
