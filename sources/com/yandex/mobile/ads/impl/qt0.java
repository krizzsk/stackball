package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

public class qt0 extends FrameLayout {

    /* renamed from: a */
    private final a41 f39294a;

    /* renamed from: b */
    private final PlaybackControlsContainer f39295b;

    qt0(Context context, a41 a41, PlaybackControlsContainer playbackControlsContainer) {
        super(context);
        this.f39294a = a41;
        this.f39295b = playbackControlsContainer;
    }

    /* renamed from: a */
    public PlaybackControlsContainer mo69647a() {
        return this.f39295b;
    }

    /* renamed from: b */
    public a41 mo69648b() {
        return this.f39294a;
    }
}
