package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.nativeads.MediaView;

public class km0 {

    /* renamed from: a */
    private final bm0 f36168a = new bm0();

    /* renamed from: a */
    public gm0 mo68252a(MediaView mediaView, sd0 sd0, yu0 yu0) {
        lp0 lp0 = new lp0(mediaView.getContext(), sd0, yu0);
        this.f36168a.getClass();
        mediaView.removeAllViews();
        mediaView.addView(lp0, new FrameLayout.LayoutParams(-1, -1));
        return new bs1(mediaView, new np0(lp0));
    }
}
