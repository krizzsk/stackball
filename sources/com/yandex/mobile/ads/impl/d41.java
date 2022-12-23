package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.view.View;

public class d41 implements View.OnClickListener {

    /* renamed from: a */
    private final qn1 f32381a;

    /* renamed from: b */
    private final f41 f32382b;

    /* renamed from: c */
    private final b41 f32383c;

    public d41(qn1 qn1, f41 f41, b41 b41) {
        this.f32381a = qn1;
        this.f32382b = f41;
        this.f32383c = b41;
    }

    public void onClick(View view) {
        pu0 pu0 = (pu0) this.f32381a.mo70379b();
        if (pu0 != null) {
            a41 b = pu0.mo69436a().mo69648b();
            this.f32383c.getClass();
            b.setBackground((Drawable) null);
            b.setVisibility(8);
            b.mo65673a().setOnClickListener((View.OnClickListener) null);
            this.f32382b.mo66920a(pu0);
        }
    }
}
