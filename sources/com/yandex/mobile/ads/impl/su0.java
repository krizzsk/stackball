package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.TextureView;

public class su0 {

    /* renamed from: a */
    private final C14156o f40130a = new C14156o();

    /* renamed from: b */
    private final nm1 f40131b = new nm1();

    /* renamed from: a */
    public pu0 mo70056a(Context context, jm1 jm1, int i) {
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        qt0 a = this.f40130a.mo69091a(context, jm1, i);
        a.setVisibility(8);
        mm1 a2 = this.f40131b.mo69065a(context);
        a2.setVisibility(8);
        pu0 pu0 = new pu0(context, a2, textureView, a);
        pu0.addView(a2);
        pu0.addView(textureView);
        pu0.addView(a);
        return pu0;
    }
}
