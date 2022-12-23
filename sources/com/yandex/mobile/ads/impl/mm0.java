package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.MediaView;

public class mm0 {

    /* renamed from: a */
    private final AdResponse<?> f37434a;

    /* renamed from: b */
    private final cu0 f37435b = new cu0();

    /* renamed from: c */
    private final su0 f37436c = new su0();

    /* renamed from: d */
    private final gn1 f37437d = new gn1();

    /* renamed from: e */
    private final C12590bj f37438e = new C12590bj();

    /* renamed from: f */
    private final nu0 f37439f = new nu0();

    public mm0(AdResponse<?> adResponse) {
        this.f37434a = adResponse;
    }

    /* renamed from: a */
    public gm0 mo68840a(MediaView mediaView, C14645t1 t1Var, sd0 sd0, eu0 eu0) {
        Context context = mediaView.getContext();
        jm1 a = this.f37435b.mo66355a(this.f37439f.mo69079a(mediaView));
        pu0 a2 = this.f37436c.mo70056a(context, a, this.f37438e.mo66076a(mediaView));
        this.f37437d.getClass();
        mediaView.removeAllViews();
        mediaView.addView(a2, new FrameLayout.LayoutParams(-1, -1));
        return new ds1(mediaView, new qn1(a2, a, t1Var, this.f37434a, sd0, eu0));
    }
}
